package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import p005b.p096l.p097a.p113c.p119b.C1758d;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1817g;
import p005b.p096l.p097a.p113c.p150j.C3429i;

/* renamed from: b.l.a.c.b.l.k.s1 */
public final class C1863s1<ResultT> extends C1840l0 {

    /* renamed from: a */
    public final C1851p<C1770a.C1772b, ResultT> f3299a;

    /* renamed from: b */
    public final C3429i<ResultT> f3300b;

    /* renamed from: c */
    public final C1848o f3301c;

    public C1863s1(int i, C1851p<C1770a.C1772b, ResultT> pVar, C3429i<ResultT> iVar, C1848o oVar) {
        super(i);
        this.f3300b = iVar;
        this.f3299a = pVar;
        this.f3301c = oVar;
    }

    /* renamed from: a */
    public final void mo12124a(@NonNull Status status) {
        this.f3300b.mo14701a(this.f3301c.mo12042a(status));
    }

    /* renamed from: b */
    public final void mo12125b(@NonNull C1804c2 c2Var, boolean z) {
        C3429i<ResultT> iVar = this.f3300b;
        c2Var.f3157b.put(iVar, Boolean.valueOf(z));
        iVar.f6197a.mo14681c(new C1855q(c2Var, iVar));
    }

    /* renamed from: c */
    public final void mo12126c(@NonNull RuntimeException runtimeException) {
        this.f3300b.mo14701a(runtimeException);
    }

    /* renamed from: e */
    public final void mo12127e(C1817g.C1818a<?> aVar) {
        try {
            C1851p<C1770a.C1772b, ResultT> pVar = this.f3299a;
            ((C1844m1) pVar).f3263c.f3274a.mo12153a(aVar.f3193b, this.f3300b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            this.f3300b.mo14701a(this.f3301c.mo12042a(C1822g1.m2447d(e2)));
        } catch (RuntimeException e3) {
            this.f3300b.mo14701a(e3);
        }
    }

    @Nullable
    /* renamed from: f */
    public final C1758d[] mo12151f(C1817g.C1818a<?> aVar) {
        return this.f3299a.f3272a;
    }

    /* renamed from: g */
    public final boolean mo12152g(C1817g.C1818a<?> aVar) {
        return this.f3299a.f3273b;
    }
}
