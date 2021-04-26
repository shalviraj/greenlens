package p005b.p096l.p097a.p113c.p150j;

import androidx.annotation.NonNull;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.j.i */
public class C3429i<TResult> {

    /* renamed from: a */
    public final C3423e0<TResult> f6197a = new C3423e0<>();

    /* renamed from: a */
    public boolean mo14701a(@NonNull Exception exc) {
        C3423e0<TResult> e0Var = this.f6197a;
        Objects.requireNonNull(e0Var);
        C0823f.m380l(exc, "Exception must not be null");
        synchronized (e0Var.f6188a) {
            if (e0Var.f6190c) {
                return false;
            }
            e0Var.f6190c = true;
            e0Var.f6193f = exc;
            e0Var.f6189b.mo14675a(e0Var);
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo14702b(TResult tresult) {
        C3423e0<TResult> e0Var = this.f6197a;
        synchronized (e0Var.f6188a) {
            if (e0Var.f6190c) {
                return false;
            }
            e0Var.f6190c = true;
            e0Var.f6192e = tresult;
            e0Var.f6189b.mo14675a(e0Var);
            return true;
        }
    }
}
