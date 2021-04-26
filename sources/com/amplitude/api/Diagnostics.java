package com.amplitude.api;

import android.util.Log;
import com.segment.analytics.integrations.BasePayload;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p421m.C7831c0;
import p421m.C7839e0;
import p421m.C8017v;
import p421m.p422m0.p426g.C7887e;

public class Diagnostics {
    public static final int DIAGNOSTIC_EVENT_API_VERSION = 1;
    public static final String DIAGNOSTIC_EVENT_ENDPOINT = "https://api.amplitude.com/diagnostic";
    public static final int DIAGNOSTIC_EVENT_MAX_COUNT = 50;
    public static final int DIAGNOSTIC_EVENT_MIN_COUNT = 5;
    public static Diagnostics instance;
    private volatile String apiKey;
    /* access modifiers changed from: private */
    public volatile String deviceId;
    public int diagnosticEventMaxCount = 50;
    public WorkerThread diagnosticThread = new WorkerThread("diagnosticThread");
    public volatile boolean enabled = false;
    private volatile C7831c0 httpClient;
    public List<String> unsentErrorStrings = new ArrayList(this.diagnosticEventMaxCount);
    public Map<String, JSONObject> unsentErrors = new HashMap(this.diagnosticEventMaxCount);
    public String url = DIAGNOSTIC_EVENT_ENDPOINT;

    private Diagnostics() {
        this.diagnosticThread.start();
    }

    public static synchronized Diagnostics getLogger() {
        Diagnostics diagnostics;
        synchronized (Diagnostics.class) {
            if (instance == null) {
                instance = new Diagnostics();
            }
            diagnostics = instance;
        }
        return diagnostics;
    }

    public Diagnostics disableLogging() {
        this.enabled = false;
        return this;
    }

    public Diagnostics enableLogging(C7831c0 c0Var, String str, String str2) {
        this.enabled = true;
        this.apiKey = str;
        this.httpClient = c0Var;
        this.deviceId = str2;
        return this;
    }

    public Diagnostics flushEvents() {
        if (this.enabled && !Utils.isEmptyString(this.apiKey) && this.httpClient != null && !Utils.isEmptyString(this.deviceId)) {
            runOnBgThread(new Runnable() {
                public void run() {
                    if (!Diagnostics.this.unsentErrorStrings.isEmpty()) {
                        ArrayList arrayList = new ArrayList(Diagnostics.this.unsentErrorStrings.size());
                        for (String str : Diagnostics.this.unsentErrorStrings) {
                            arrayList.add(Diagnostics.this.unsentErrors.get(str));
                        }
                        String jSONArray = new JSONArray(arrayList).toString();
                        if (!Utils.isEmptyString(jSONArray)) {
                            Diagnostics.this.makeEventUploadPostRequest(jSONArray);
                        }
                    }
                }
            });
        }
        return this;
    }

    public Diagnostics logError(String str) {
        return logError(str, (Throwable) null);
    }

    public Diagnostics logError(final String str, final Throwable th) {
        if (this.enabled && !Utils.isEmptyString(str) && !Utils.isEmptyString(this.deviceId)) {
            runOnBgThread(new Runnable() {
                public void run() {
                    JSONObject jSONObject = Diagnostics.this.unsentErrors.get(str);
                    if (jSONObject == null) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("error", AmplitudeClient.truncate(str));
                            jSONObject2.put(BasePayload.TIMESTAMP_KEY, System.currentTimeMillis());
                            jSONObject2.put(AmplitudeClient.DEVICE_ID_KEY, Diagnostics.this.deviceId);
                            jSONObject2.put("count", 1);
                            Throwable th = th;
                            if (th != null) {
                                String stackTraceString = Log.getStackTraceString(th);
                                if (!Utils.isEmptyString(stackTraceString)) {
                                    jSONObject2.put("stack_trace", AmplitudeClient.truncate(stackTraceString));
                                }
                            }
                            if (Diagnostics.this.unsentErrorStrings.size() >= Diagnostics.this.diagnosticEventMaxCount) {
                                for (int i = 0; i < 5; i++) {
                                    Diagnostics.this.unsentErrors.remove(Diagnostics.this.unsentErrorStrings.remove(0));
                                }
                            }
                            Diagnostics.this.unsentErrors.put(str, jSONObject2);
                            Diagnostics.this.unsentErrorStrings.add(str);
                        } catch (JSONException unused) {
                        }
                    } else {
                        jSONObject.put("count", jSONObject.optInt("count", 0) + 1);
                    }
                }
            });
        }
        return this;
    }

    public void makeEventUploadPostRequest(String str) {
        C8017v.C8018a aVar = new C8017v.C8018a();
        aVar.mo25830a("v", "1");
        aVar.mo25830a("client", this.apiKey);
        aVar.mo25830a("e", str);
        aVar.mo25830a("upload_time", "" + System.currentTimeMillis());
        C8017v vVar = new C8017v(aVar.f16088a, aVar.f16089b);
        C7839e0.C7840a aVar2 = new C7839e0.C7840a();
        aVar2.mo25540f(this.url);
        aVar2.mo25538d(vVar);
        try {
            if (((C7887e) this.httpClient.mo25525a(aVar2.mo25535a())).mo25623h().f15555m.mo25572z().equals("success")) {
                this.unsentErrors.clear();
                this.unsentErrorStrings.clear();
            }
        } catch (IOException | AssertionError | Exception unused) {
        }
    }

    public void runOnBgThread(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        WorkerThread workerThread = this.diagnosticThread;
        if (currentThread != workerThread) {
            workerThread.post(runnable);
        } else {
            runnable.run();
        }
    }

    public Diagnostics setDiagnosticEventMaxCount(final int i) {
        runOnBgThread(new Runnable() {
            public void run() {
                this.diagnosticEventMaxCount = Math.max(i, 5);
                Diagnostics diagnostics = this;
                diagnostics.diagnosticEventMaxCount = Math.min(diagnostics.diagnosticEventMaxCount, 50);
                Diagnostics diagnostics2 = this;
                if (diagnostics2.diagnosticEventMaxCount < diagnostics2.unsentErrorStrings.size()) {
                    for (int i = 0; i < Diagnostics.this.unsentErrorStrings.size() - this.diagnosticEventMaxCount; i++) {
                        Diagnostics.this.unsentErrors.remove(Diagnostics.this.unsentErrorStrings.remove(0));
                    }
                }
            }
        });
        return this;
    }
}
