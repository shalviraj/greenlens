package p005b.p273o;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.segment.analytics.internal.Utils;
import java.util.HashSet;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4857i2;
import p005b.p273o.p274w4.C5013c;
import p005b.p273o.p274w4.C5015e;

/* renamed from: b.o.e3 */
public class C4823e3 {

    /* renamed from: a */
    public static int f9250a;

    /* renamed from: b.o.e3$a */
    public static class C4824a extends C4920n3 {

        /* renamed from: a */
        public final /* synthetic */ C4826b f9251a;

        /* renamed from: b.o.e3$a$a */
        public class C4825a implements Runnable {
            public C4825a() {
            }

            public void run() {
                int i = (C4823e3.f9250a * 10000) + Utils.DEFAULT_FLUSH_INTERVAL;
                if (i > 90000) {
                    i = 90000;
                }
                C4857i2.C4868k kVar = C4857i2.C4868k.INFO;
                StringBuilder u = C0843a.m460u("Failed to get Android parameters, trying again in ");
                u.append(i / 1000);
                u.append(" seconds.");
                C4857i2.m8933a(kVar, u.toString(), (Throwable) null);
                C4835f2.m8872v(i);
                C4823e3.f9250a++;
                C4823e3.m8846a(C4824a.this.f9251a);
            }
        }

        public C4824a(C4826b bVar) {
            this.f9251a = bVar;
        }

        /* renamed from: a */
        public void mo16563a(int i, String str, Throwable th) {
            if (i == 403) {
                C4857i2.m8933a(C4857i2.C4868k.FATAL, "403 error getting OneSignal params, omitting further retries!", (Throwable) null);
            } else {
                new Thread(new C4825a(), "OS_PARAMS_REQUEST").start();
            }
        }

        /* renamed from: b */
        public void mo16564b(String str) {
            C4826b bVar = this.f9251a;
            try {
                C4837f3 f3Var = new C4837f3(new JSONObject(str));
                Objects.requireNonNull((C4938p2) bVar);
                C4857i2.f9346P = f3Var;
                String str2 = f3Var.f9264a;
                if (str2 != null) {
                    C4857i2.f9357b = str2;
                }
                String str3 = C4815d3.f9230a;
                C4815d3.m8834i(str3, "GT_FIREBASE_TRACKING_ENABLED", C4857i2.f9346P.f9267d);
                C4815d3.m8834i(str3, "OS_RESTORE_TTL_FILTER", C4857i2.f9346P.f9268e);
                C4815d3.m8834i(str3, "OS_CLEAR_GROUP_SUMMARY_CLICK", C4857i2.f9346P.f9269f);
                C4815d3.m8834i(str3, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", C4857i2.f9346P.f9270g);
                Objects.requireNonNull(C4857i2.f9375t);
                C4815d3.m8834i(str3, "PREFS_OS_OUTCOMES_V2", f3Var.f9271h.f9263h);
                C4882j1 j1Var = C4857i2.f9373r;
                StringBuilder u = C0843a.m460u("OneSignal saveInfluenceParams: ");
                u.append(f3Var.f9271h.toString());
                ((C4856i1) j1Var).mo16609a(u.toString());
                C5015e eVar = C4857i2.f9376u;
                C4828d dVar = f3Var.f9271h;
                C5013c cVar = eVar.f9691b;
                Objects.requireNonNull(cVar.f9688a);
                C4815d3.m8834i(str3, "PREFS_OS_DIRECT_ENABLED", dVar.f9260e);
                Objects.requireNonNull(cVar.f9688a);
                C4815d3.m8834i(str3, "PREFS_OS_INDIRECT_ENABLED", dVar.f9261f);
                Objects.requireNonNull(cVar.f9688a);
                C4815d3.m8834i(str3, "PREFS_OS_UNATTRIBUTED_ENABLED", dVar.f9262g);
                C5052z1 z1Var = cVar.f9688a;
                Objects.requireNonNull(z1Var);
                z1Var.mo16803a(str3, "PREFS_OS_NOTIFICATION_LIMIT", dVar.f9257b);
                C5052z1 z1Var2 = cVar.f9688a;
                Objects.requireNonNull(z1Var2);
                z1Var2.mo16803a(str3, "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", dVar.f9256a);
                C5052z1 z1Var3 = cVar.f9688a;
                Objects.requireNonNull(z1Var3);
                z1Var3.mo16803a(str3, "PREFS_OS_IAM_LIMIT", dVar.f9259d);
                C5052z1 z1Var4 = cVar.f9688a;
                Objects.requireNonNull(z1Var4);
                z1Var4.mo16803a(str3, "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", dVar.f9258c);
                Context context = C4857i2.f9358c;
                JSONArray jSONArray = f3Var.f9266c;
                Pattern pattern = C4833f0.f9284a;
                if (Build.VERSION.SDK_INT >= 26 && jSONArray != null) {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    HashSet hashSet = new HashSet();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        try {
                            hashSet.add(C4833f0.m8851a(context, notificationManager, jSONArray.getJSONObject(i)));
                        } catch (JSONException e) {
                            C4857i2.m8933a(C4857i2.C4868k.ERROR, "Could not create notification channel due to JSON payload error!", e);
                        }
                    }
                    for (NotificationChannel id : notificationManager.getNotificationChannels()) {
                        String id2 = id.getId();
                        if (id2.startsWith("OS_") && !hashSet.contains(id2)) {
                            notificationManager.deleteNotificationChannel(id2);
                        }
                    }
                }
                C4857i2.m8957y();
            } catch (NullPointerException | JSONException e2) {
                C4857i2.C4868k kVar = C4857i2.C4868k.FATAL;
                C4857i2.m8933a(kVar, "Error parsing android_params!: ", e2);
                C4857i2.m8933a(kVar, "Response that errored from android_params!: " + str, (Throwable) null);
            }
        }
    }

    /* renamed from: b.o.e3$b */
    public interface C4826b {
    }

    /* renamed from: b.o.e3$c */
    public static class C4827c {
        @Nullable

        /* renamed from: a */
        public String f9253a;
        @Nullable

        /* renamed from: b */
        public String f9254b;
        @Nullable

        /* renamed from: c */
        public String f9255c;
    }

    /* renamed from: b.o.e3$d */
    public static class C4828d {

        /* renamed from: a */
        public int f9256a = 1440;

        /* renamed from: b */
        public int f9257b = 10;

        /* renamed from: c */
        public int f9258c = 1440;

        /* renamed from: d */
        public int f9259d = 10;

        /* renamed from: e */
        public boolean f9260e = false;

        /* renamed from: f */
        public boolean f9261f = false;

        /* renamed from: g */
        public boolean f9262g = false;

        /* renamed from: h */
        public boolean f9263h = false;

        public String toString() {
            StringBuilder u = C0843a.m460u("InfluenceParams{indirectNotificationAttributionWindow=");
            u.append(this.f9256a);
            u.append(", notificationLimit=");
            u.append(this.f9257b);
            u.append(", indirectIAMAttributionWindow=");
            u.append(this.f9258c);
            u.append(", iamLimit=");
            u.append(this.f9259d);
            u.append(", directEnabled=");
            u.append(this.f9260e);
            u.append(", indirectEnabled=");
            u.append(this.f9261f);
            u.append(", unattributedEnabled=");
            u.append(this.f9262g);
            u.append('}');
            return u.toString();
        }
    }

    /* renamed from: b.o.e3$e */
    public static class C4829e {

        /* renamed from: a */
        public String f9264a;

        /* renamed from: b */
        public boolean f9265b;

        /* renamed from: c */
        public JSONArray f9266c;

        /* renamed from: d */
        public boolean f9267d;

        /* renamed from: e */
        public boolean f9268e;

        /* renamed from: f */
        public boolean f9269f;

        /* renamed from: g */
        public boolean f9270g;

        /* renamed from: h */
        public C4828d f9271h;

        /* renamed from: i */
        public C4827c f9272i;
    }

    /* renamed from: a */
    public static void m8846a(@NonNull C4826b bVar) {
        C4824a aVar = new C4824a(bVar);
        String p = C0843a.m455p(C0843a.m460u("apps/"), C4857i2.f9356a, "/android_params.js");
        String r = C4857i2.m8950r();
        if (r != null) {
            p = C0843a.m452m(p, "?player_id=", r);
        }
        C4857i2.m8933a(C4857i2.C4868k.DEBUG, "Starting request to get Android parameters.", (Throwable) null);
        C4805c3.m8806e(p, aVar, "CACHE_KEY_REMOTE_PARAMS");
    }
}
