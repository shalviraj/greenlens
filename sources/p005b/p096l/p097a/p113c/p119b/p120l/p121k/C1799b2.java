package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p096l.p097a.p113c.p119b.C1754b;

/* renamed from: b.l.a.c.b.l.k.b2 */
public final class C1799b2 implements C1807d1 {

    /* renamed from: a */
    public final /* synthetic */ C1878x1 f3149a;

    public C1799b2(C1878x1 x1Var, C1795a2 a2Var) {
        this.f3149a = x1Var;
    }

    /* renamed from: a */
    public final void mo12049a(@Nullable Bundle bundle) {
        this.f3149a.f3353l.lock();
        try {
            C1878x1 x1Var = this.f3149a;
            x1Var.f3351j = C1754b.f3093k;
            C1878x1.m2562g(x1Var);
        } finally {
            this.f3149a.f3353l.unlock();
        }
    }

    /* renamed from: b */
    public final void mo12050b(@NonNull C1754b bVar) {
        this.f3149a.f3353l.lock();
        try {
            C1878x1 x1Var = this.f3149a;
            x1Var.f3351j = bVar;
            C1878x1.m2562g(x1Var);
        } finally {
            this.f3149a.f3353l.unlock();
        }
    }

    /* renamed from: c */
    public final void mo12051c(int i, boolean z) {
        this.f3149a.f3353l.lock();
        try {
            C1878x1 x1Var = this.f3149a;
            if (x1Var.f3352k) {
                x1Var.f3352k = false;
                x1Var.f3343b.mo12051c(i, z);
                x1Var.f3351j = null;
                x1Var.f3350i = null;
            } else {
                x1Var.f3352k = true;
                x1Var.f3344c.mo12086g(i);
            }
        } finally {
            this.f3149a.f3353l.unlock();
        }
    }
}
