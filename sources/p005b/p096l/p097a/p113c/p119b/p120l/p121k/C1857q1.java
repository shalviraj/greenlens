package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p120l.C1789h;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1805d;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1817g;

/* renamed from: b.l.a.c.b.l.k.q1 */
public final class C1857q1<A extends C1805d<? extends C1789h, C1770a.C1772b>> extends C1822g1 {

    /* renamed from: a */
    public final A f3293a;

    public C1857q1(int i, A a) {
        super(i);
        this.f3293a = a;
    }

    /* renamed from: a */
    public final void mo12124a(@NonNull Status status) {
        this.f3293a.mo12074l(status);
    }

    /* renamed from: b */
    public final void mo12125b(@NonNull C1804c2 c2Var, boolean z) {
        A a = this.f3293a;
        c2Var.f3156a.put(a, Boolean.valueOf(z));
        C1858r rVar = new C1858r(c2Var, a);
        Objects.requireNonNull(a);
        C0823f.m362c(true, "Callback cannot be null.");
        synchronized (a.f11287a) {
            if (a.mo18864d()) {
                rVar.mo12037a(a.f11295i);
            } else {
                a.f11291e.add(rVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo12126c(@NonNull RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(localizedMessage).length() + simpleName.length() + 2);
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f3293a.mo12074l(new Status(10, sb.toString()));
    }

    /* renamed from: e */
    public final void mo12127e(C1817g.C1818a<?> aVar) {
        try {
            this.f3293a.mo12073k(aVar.f3193b);
        } catch (RuntimeException e) {
            mo12126c(e);
        }
    }
}
