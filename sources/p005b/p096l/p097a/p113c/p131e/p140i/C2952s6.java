package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.s6 */
public final class C2952s6<T> implements C3043z6<T> {

    /* renamed from: a */
    public final C2913p6 f4999a;

    /* renamed from: b */
    public final C2875m7<?, ?> f5000b;

    /* renamed from: c */
    public final boolean f5001c;

    /* renamed from: d */
    public final C2740c5<?> f5002d;

    public C2952s6(C2875m7<?, ?> m7Var, C2740c5<?> c5Var, C2913p6 p6Var) {
        this.f5000b = m7Var;
        this.f5001c = c5Var.mo13263a(p6Var);
        this.f5002d = c5Var;
        this.f4999a = p6Var;
    }

    /* renamed from: a */
    public final T mo13627a() {
        return ((C2860l5) this.f4999a.mo13541c()).mo13489l();
    }

    /* renamed from: b */
    public final boolean mo13628b(T t) {
        this.f5002d.mo13264b(t);
        throw null;
    }

    /* renamed from: c */
    public final int mo13629c(T t) {
        C2875m7<?, ?> m7Var = this.f5000b;
        int g = m7Var.mo13497g(m7Var.mo13494d(t));
        if (!this.f5001c) {
            return g;
        }
        this.f5002d.mo13264b(t);
        throw null;
    }

    /* renamed from: d */
    public final void mo13630d(T t, T t2) {
        C2875m7<?, ?> m7Var = this.f5000b;
        Class<?> cls = C2728b7.f4645a;
        m7Var.mo13493c(t, m7Var.mo13496f(m7Var.mo13494d(t), m7Var.mo13494d(t2)));
        if (this.f5001c) {
            this.f5002d.mo13264b(t2);
            throw null;
        }
    }

    /* renamed from: e */
    public final int mo13631e(T t) {
        int hashCode = this.f5000b.mo13494d(t).hashCode();
        if (!this.f5001c) {
            return hashCode;
        }
        this.f5002d.mo13264b(t);
        throw null;
    }

    /* renamed from: f */
    public final boolean mo13632f(T t, T t2) {
        if (!this.f5000b.mo13494d(t).equals(this.f5000b.mo13494d(t2))) {
            return false;
        }
        if (!this.f5001c) {
            return true;
        }
        this.f5002d.mo13264b(t);
        this.f5002d.mo13264b(t2);
        throw null;
    }

    /* renamed from: g */
    public final void mo13633g(T t) {
        this.f5000b.mo13495e(t);
        this.f5002d.mo13265c(t);
    }

    /* renamed from: h */
    public final void mo13634h(T t, byte[] bArr, int i, int i2, C2846k4 k4Var) {
        C2899o5 o5Var = (C2899o5) t;
        if (o5Var.zzc == C2888n7.f4905f) {
            o5Var.zzc = C2888n7.m4996a();
        }
        C2873m5 m5Var = (C2873m5) t;
        throw null;
    }

    /* renamed from: i */
    public final void mo13635i(T t, C3015x4 x4Var) {
        this.f5002d.mo13264b(t);
        throw null;
    }
}
