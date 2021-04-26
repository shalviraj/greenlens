package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Handler;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;
import p005b.p096l.p097a.p113c.p131e.p140i.C2916p9;

/* renamed from: b.l.a.c.h.b.l */
public abstract class C3232l {

    /* renamed from: d */
    public static volatile Handler f5690d;

    /* renamed from: a */
    public final C3238l5 f5691a;

    /* renamed from: b */
    public final Runnable f5692b;

    /* renamed from: c */
    public volatile long f5693c;

    public C3232l(C3238l5 l5Var) {
        Objects.requireNonNull(l5Var, "null reference");
        this.f5691a = l5Var;
        this.f5692b = new C3221k(this, l5Var);
    }

    /* renamed from: a */
    public abstract void mo14385a();

    /* renamed from: b */
    public final void mo14386b(long j) {
        mo14387c();
        if (j >= 0) {
            Objects.requireNonNull((C1959c) this.f5691a.mo14330e());
            this.f5693c = System.currentTimeMillis();
            if (!mo14388d().postDelayed(this.f5692b, j)) {
                this.f5691a.mo14329d().f5799f.mo14415b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: c */
    public final void mo14387c() {
        this.f5693c = 0;
        mo14388d().removeCallbacks(this.f5692b);
    }

    /* renamed from: d */
    public final Handler mo14388d() {
        Handler handler;
        if (f5690d != null) {
            return f5690d;
        }
        synchronized (C3232l.class) {
            if (f5690d == null) {
                f5690d = new C2916p9(this.f5691a.mo14328c().getMainLooper());
            }
            handler = f5690d;
        }
        return handler;
    }
}
