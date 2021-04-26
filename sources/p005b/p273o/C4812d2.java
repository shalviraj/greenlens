package p005b.p273o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.p003os.EnvironmentCompat;
import com.segment.analytics.AnalyticsContext;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.o.d2 */
public class C4812d2 {
    @NonNull

    /* renamed from: a */
    public String f9208a;
    @NonNull

    /* renamed from: b */
    public C4813a f9209b;
    @Nullable

    /* renamed from: c */
    public String f9210c;
    @NonNull

    /* renamed from: d */
    public C4814b f9211d;
    @Nullable

    /* renamed from: e */
    public Object f9212e;

    /* renamed from: b.o.d2$a */
    public enum C4813a {
        TIME_SINCE_LAST_IN_APP("min_time_since"),
        SESSION_TIME("session_time"),
        f9215j("custom"),
        UNKNOWN(EnvironmentCompat.MEDIA_UNKNOWN);
        

        /* renamed from: g */
        public String f9218g;

        /* access modifiers changed from: public */
        C4813a(String str) {
            this.f9218g = str;
        }

        public String toString() {
            return this.f9218g;
        }
    }

    /* renamed from: b.o.d2$b */
    public enum C4814b {
        GREATER_THAN("greater"),
        LESS_THAN("less"),
        EQUAL_TO("equal"),
        NOT_EQUAL_TO("not_equal"),
        LESS_THAN_OR_EQUAL_TO("less_or_equal"),
        GREATER_THAN_OR_EQUAL_TO("greater_or_equal"),
        EXISTS("exists"),
        NOT_EXISTS("not_exists"),
        CONTAINS("in");
        

        /* renamed from: g */
        public String f9229g;

        /* access modifiers changed from: public */
        C4814b(String str) {
            this.f9229g = str;
        }

        public String toString() {
            return this.f9229g;
        }
    }

    public C4812d2(JSONObject jSONObject) {
        C4813a aVar;
        C4814b bVar;
        this.f9208a = jSONObject.getString(AnalyticsContext.Device.DEVICE_ID_KEY);
        String string = jSONObject.getString("kind");
        C4813a[] values = C4813a.values();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                aVar = C4813a.UNKNOWN;
                break;
            }
            aVar = values[i2];
            if (aVar.f9218g.equalsIgnoreCase(string)) {
                break;
            }
            i2++;
        }
        this.f9209b = aVar;
        this.f9210c = jSONObject.optString("property", (String) null);
        String string2 = jSONObject.getString("operator");
        C4814b[] values2 = C4814b.values();
        while (true) {
            if (i >= 9) {
                bVar = C4814b.EQUAL_TO;
                break;
            }
            bVar = values2[i];
            if (bVar.f9229g.equalsIgnoreCase(string2)) {
                break;
            }
            i++;
        }
        this.f9211d = bVar;
        this.f9212e = jSONObject.opt("value");
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("OSTrigger{triggerId='");
        u.append(this.f9208a);
        u.append('\'');
        u.append(", kind=");
        u.append(this.f9209b);
        u.append(", property='");
        u.append(this.f9210c);
        u.append('\'');
        u.append(", operatorType=");
        u.append(this.f9211d);
        u.append(", value=");
        u.append(this.f9212e);
        u.append('}');
        return u.toString();
    }
}
