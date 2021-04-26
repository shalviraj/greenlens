package p005b.p273o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.segment.analytics.AnalyticsContext;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: b.o.t0 */
public class C4979t0 {
    @NonNull

    /* renamed from: a */
    public String f9622a;
    @Nullable

    /* renamed from: b */
    public C4980a f9623b;
    @Nullable

    /* renamed from: c */
    public String f9624c;
    @NonNull

    /* renamed from: d */
    public List<C4811d1> f9625d = new ArrayList();
    @NonNull

    /* renamed from: e */
    public List<C4821e1> f9626e = new ArrayList();

    /* renamed from: f */
    public C4850h1 f9627f;

    /* renamed from: g */
    public boolean f9628g;

    /* renamed from: b.o.t0$a */
    public enum C4980a {
        IN_APP_WEBVIEW("webview"),
        BROWSER("browser"),
        REPLACE_CONTENT("replacement");
        

        /* renamed from: g */
        public String f9633g;

        /* access modifiers changed from: public */
        C4980a(String str) {
            this.f9633g = str;
        }

        public String toString() {
            return this.f9633g;
        }
    }

    public C4979t0(@NonNull JSONObject jSONObject) {
        C4980a aVar = null;
        this.f9622a = jSONObject.optString(AnalyticsContext.Device.DEVICE_ID_KEY, (String) null);
        jSONObject.optString("name", (String) null);
        this.f9624c = jSONObject.optString("url", (String) null);
        String optString = jSONObject.optString("url_target", (String) null);
        C4980a[] values = C4980a.values();
        int i = 0;
        while (true) {
            if (i >= 3) {
                break;
            }
            C4980a aVar2 = values[i];
            if (aVar2.f9633g.equalsIgnoreCase(optString)) {
                aVar = aVar2;
                break;
            }
            i++;
        }
        this.f9623b = aVar;
        if (aVar == null) {
            this.f9623b = C4980a.IN_APP_WEBVIEW;
        }
        jSONObject.optBoolean("close", true);
        if (jSONObject.has("outcomes")) {
            JSONArray jSONArray = jSONObject.getJSONArray("outcomes");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                this.f9625d.add(new C4811d1((JSONObject) jSONArray.get(i2)));
            }
        }
        if (jSONObject.has("tags")) {
            this.f9627f = new C4850h1(jSONObject.getJSONObject("tags"));
        }
        if (jSONObject.has("prompts")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("prompts");
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                if (jSONArray2.get(i3).equals("location")) {
                    this.f9626e.add(new C4801c1());
                }
            }
        }
    }
}
