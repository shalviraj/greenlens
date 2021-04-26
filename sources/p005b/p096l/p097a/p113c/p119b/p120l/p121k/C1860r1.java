package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import p005b.p096l.p097a.p113c.p119b.p120l.C1781b;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1817g;
import p005b.p096l.p097a.p113c.p150j.C3429i;

/* renamed from: b.l.a.c.b.l.k.r1 */
public abstract class C1860r1<T> extends C1840l0 {

    /* renamed from: a */
    public final C3429i<T> f3297a;

    public C1860r1(int i, C3429i<T> iVar) {
        super(i);
        this.f3297a = iVar;
    }

    /* renamed from: a */
    public void mo12124a(@NonNull Status status) {
        this.f3297a.mo14701a(new C1781b(status));
    }

    /* renamed from: c */
    public void mo12126c(@NonNull RuntimeException runtimeException) {
        this.f3297a.mo14701a(runtimeException);
    }

    /* renamed from: e */
    public final void mo12127e(C1817g.C1818a<?> aVar) {
        try {
            mo12161h(aVar);
        } catch (DeadObjectException e) {
            this.f3297a.mo14701a(new C1781b(C1822g1.m2447d(e)));
            throw e;
        } catch (RemoteException e2) {
            this.f3297a.mo14701a(new C1781b(C1822g1.m2447d(e2)));
        } catch (RuntimeException e3) {
            this.f3297a.mo14701a(e3);
        }
    }

    /* renamed from: h */
    public abstract void mo12161h(C1817g.C1818a<?> aVar);
}
