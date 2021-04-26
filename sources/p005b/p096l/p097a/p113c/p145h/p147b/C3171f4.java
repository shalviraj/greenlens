package p005b.p096l.p097a.p113c.p145h.p147b;

import p005b.p096l.p097a.p113c.p119b.p128q.C1967a;
import p005b.p096l.p097a.p113c.p119b.p128q.C1968b;

/* renamed from: b.l.a.c.h.b.f4 */
public final class C3171f4 {

    /* renamed from: a */
    public final C3281p4 f5505a;

    public C3171f4(C3281p4 p4Var) {
        this.f5505a = p4Var;
    }

    /* renamed from: a */
    public final boolean mo14206a() {
        try {
            C1967a a = C1968b.m2885a(this.f5505a.f5842a);
            if (a == null) {
                this.f5505a.mo14329d().f5807n.mo14414a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a.f3529a.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.f5505a.mo14329d().f5807n.mo14415b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
