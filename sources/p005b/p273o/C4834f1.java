package p005b.p273o;

import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.o.f1 */
public class C4834f1 {

    /* renamed from: a */
    public long f9285a;

    /* renamed from: b */
    public int f9286b;

    /* renamed from: c */
    public int f9287c;

    /* renamed from: d */
    public long f9288d;

    /* renamed from: e */
    public boolean f9289e;

    public C4834f1() {
        this.f9285a = -1;
        this.f9286b = 0;
        this.f9287c = 1;
        this.f9288d = 0;
        this.f9289e = false;
    }

    public C4834f1(int i, long j) {
        this.f9285a = -1;
        this.f9286b = 0;
        this.f9287c = 1;
        this.f9288d = 0;
        this.f9289e = false;
        this.f9286b = i;
        this.f9285a = j;
    }

    public C4834f1(JSONObject jSONObject) {
        long intValue;
        this.f9285a = -1;
        this.f9286b = 0;
        this.f9287c = 1;
        this.f9288d = 0;
        this.f9289e = false;
        this.f9289e = true;
        Object obj = jSONObject.get("limit");
        Object obj2 = jSONObject.get("delay");
        if (obj instanceof Integer) {
            this.f9287c = ((Integer) obj).intValue();
        }
        if (obj2 instanceof Long) {
            intValue = ((Long) obj2).longValue();
        } else if (obj2 instanceof Integer) {
            intValue = (long) ((Integer) obj2).intValue();
        } else {
            return;
        }
        this.f9288d = intValue;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("OSInAppMessageDisplayStats{lastDisplayTime=");
        u.append(this.f9285a);
        u.append(", displayQuantity=");
        u.append(this.f9286b);
        u.append(", displayLimit=");
        u.append(this.f9287c);
        u.append(", displayDelay=");
        u.append(this.f9288d);
        u.append('}');
        return u.toString();
    }
}
