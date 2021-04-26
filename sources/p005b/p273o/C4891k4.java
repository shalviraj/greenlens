package p005b.p273o;

import org.json.JSONException;

/* renamed from: b.o.k4 */
public class C4891k4 extends C4853h4 {
    public C4891k4(String str, boolean z) {
        super(str, z);
    }

    /* renamed from: a */
    public void mo16593a() {
        try {
            Integer valueOf = Integer.valueOf(mo16635q());
            synchronized (C4853h4.f9323d) {
                this.f9328c.put("notification_types", valueOf);
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: j */
    public C4853h4 mo16601j(String str) {
        return new C4891k4(str, false);
    }

    /* renamed from: q */
    public final int mo16635q() {
        int optInt = mo16596e().f9670a.optInt("subscribableStatus", 1);
        if (optInt < -2) {
            return optInt;
        }
        if (!mo16596e().f9670a.optBoolean("androidPermission", true)) {
            return 0;
        }
        return !mo16596e().f9670a.optBoolean("userSubscribePref", true) ? -2 : 1;
    }
}
