package p005b.p096l.p097a.p113c.p150j;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;

/* renamed from: b.l.a.c.j.m */
public final class C3434m implements C3433l {

    /* renamed from: a */
    public final Object f6202a = new Object();

    /* renamed from: b */
    public final int f6203b;

    /* renamed from: c */
    public final C3423e0<Void> f6204c;

    /* renamed from: d */
    public int f6205d;

    /* renamed from: e */
    public int f6206e;

    /* renamed from: f */
    public int f6207f;

    /* renamed from: g */
    public Exception f6208g;

    /* renamed from: h */
    public boolean f6209h;

    public C3434m(int i, C3423e0<Void> e0Var) {
        this.f6203b = i;
        this.f6204c = e0Var;
    }

    /* renamed from: a */
    public final void mo14678a(Object obj) {
        synchronized (this.f6202a) {
            this.f6205d++;
            mo14704c();
        }
    }

    /* renamed from: b */
    public final void mo12749b(@NonNull Exception exc) {
        synchronized (this.f6202a) {
            this.f6206e++;
            this.f6208g = exc;
            mo14704c();
        }
    }

    /* renamed from: c */
    public final void mo14704c() {
        if (this.f6205d + this.f6206e + this.f6207f != this.f6203b) {
            return;
        }
        if (this.f6208g != null) {
            C3423e0<Void> e0Var = this.f6204c;
            int i = this.f6206e;
            int i2 = this.f6203b;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i);
            sb.append(" out of ");
            sb.append(i2);
            sb.append(" underlying tasks failed");
            e0Var.mo14694p(new ExecutionException(sb.toString(), this.f6208g));
        } else if (this.f6209h) {
            this.f6204c.mo14696r();
        } else {
            this.f6204c.mo14695q(null);
        }
    }

    /* renamed from: d */
    public final void mo14672d() {
        synchronized (this.f6202a) {
            this.f6207f++;
            this.f6209h = true;
            mo14704c();
        }
    }
}
