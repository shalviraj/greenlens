package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p120l.C1789h;
import p005b.p096l.p097a.p113c.p119b.p122m.C1947u;

/* renamed from: b.l.a.c.b.l.k.t */
public final class C1864t implements C1843m0 {

    /* renamed from: a */
    public final C1853p0 f3302a;

    public C1864t(C1853p0 p0Var) {
        this.f3302a = p0Var;
    }

    /* renamed from: a */
    public final void mo12117a() {
    }

    /* renamed from: b */
    public final boolean mo12118b() {
        C1834j0 j0Var = this.f3302a.f3288m;
        j0Var.f3236b.lock();
        j0Var.f3236b.unlock();
        this.f3302a.mo12159f((C1754b) null);
        return true;
    }

    /* renamed from: c */
    public final void mo12119c() {
    }

    /* renamed from: d */
    public final <A extends C1770a.C1772b, T extends C1805d<? extends C1789h, A>> T mo12120d(T t) {
        try {
            C1850o1 o1Var = this.f3302a.f3288m.f3257w;
            o1Var.f3269a.add(t);
            t.f11293g.set(o1Var.f3270b);
            C1834j0 j0Var = this.f3302a.f3288m;
            C1770a.C1779f fVar = j0Var.f3249o.get(t.f3158o);
            C0823f.m380l(fVar, "Appropriate Api was not requested.");
            if (fVar.mo12016a() || !this.f3302a.f3282g.containsKey(t.f3158o)) {
                if (fVar instanceof C1947u) {
                    C1947u uVar = (C1947u) fVar;
                    fVar = null;
                }
                t.mo12073k(fVar);
                return t;
            }
            t.mo12074l(new Status(17));
            return t;
        } catch (DeadObjectException unused) {
            C1853p0 p0Var = this.f3302a;
            p0Var.f3280e.sendMessage(p0Var.f3280e.obtainMessage(1, new C1870v(this, this)));
        }
    }

    /* renamed from: g */
    public final void mo12121g(int i) {
        this.f3302a.mo12159f((C1754b) null);
        this.f3302a.f3289n.mo12051c(i, false);
    }

    /* renamed from: k */
    public final void mo12122k(Bundle bundle) {
    }

    /* renamed from: o */
    public final void mo12123o(C1754b bVar, C1770a<?> aVar, boolean z) {
    }
}
