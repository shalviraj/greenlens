package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p096l.p097a.p113c.p119b.C1754b;

/* renamed from: b.l.a.c.b.l.k.z1 */
public final class C1884z1 implements C1807d1 {

    /* renamed from: a */
    public final /* synthetic */ C1878x1 f3363a;

    public C1884z1(C1878x1 x1Var, C1795a2 a2Var) {
        this.f3363a = x1Var;
    }

    /* renamed from: a */
    public final void mo12049a(@Nullable Bundle bundle) {
        this.f3363a.f3353l.lock();
        try {
            C1878x1 x1Var = this.f3363a;
            Bundle bundle2 = x1Var.f3349h;
            if (bundle2 == null) {
                x1Var.f3349h = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            C1878x1 x1Var2 = this.f3363a;
            x1Var2.f3350i = C1754b.f3093k;
            C1878x1.m2562g(x1Var2);
        } finally {
            this.f3363a.f3353l.unlock();
        }
    }

    /* renamed from: b */
    public final void mo12050b(@NonNull C1754b bVar) {
        this.f3363a.f3353l.lock();
        try {
            C1878x1 x1Var = this.f3363a;
            x1Var.f3350i = bVar;
            C1878x1.m2562g(x1Var);
        } finally {
            this.f3363a.f3353l.unlock();
        }
    }

    /* renamed from: c */
    public final void mo12051c(int i, boolean z) {
        C1754b bVar;
        this.f3363a.f3353l.lock();
        try {
            C1878x1 x1Var = this.f3363a;
            if (!x1Var.f3352k && (bVar = x1Var.f3351j) != null) {
                if (bVar.mo11986W()) {
                    C1878x1 x1Var2 = this.f3363a;
                    x1Var2.f3352k = true;
                    x1Var2.f3345d.mo12086g(i);
                }
            }
            C1878x1 x1Var3 = this.f3363a;
            x1Var3.f3352k = false;
            x1Var3.f3343b.mo12051c(i, z);
            x1Var3.f3351j = null;
            x1Var3.f3350i = null;
        } finally {
            this.f3363a.f3353l.unlock();
        }
    }
}
