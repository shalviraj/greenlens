package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.f0 */
public final class C2147f0<T> implements C2319m0<T> {

    /* renamed from: a */
    public final C2072c0 f3844a;

    /* renamed from: b */
    public final C2023a1<?, ?> f3845b;

    /* renamed from: c */
    public final boolean f3846c;

    /* renamed from: d */
    public final C2629ym<?> f3847d;

    public C2147f0(C2023a1<?, ?> a1Var, C2629ym<?> ymVar, C2072c0 c0Var) {
        this.f3845b = a1Var;
        this.f3846c = ymVar.mo13121a(c0Var);
        this.f3847d = ymVar;
        this.f3844a = c0Var;
    }

    /* renamed from: a */
    public final T mo12554a() {
        return ((C2195gn) this.f3844a.mo12452p()).mo12690b();
    }

    /* renamed from: b */
    public final void mo12555b(T t) {
        this.f3845b.mo12357m(t);
        this.f3847d.mo13124d(t);
    }

    /* renamed from: c */
    public final int mo12556c(T t) {
        C2023a1<?, ?> a1Var = this.f3845b;
        int p = a1Var.mo12360p(a1Var.mo12354j(t));
        if (!this.f3846c) {
            return p;
        }
        this.f3847d.mo13122b(t);
        throw null;
    }

    /* renamed from: d */
    public final void mo12557d(T t, T t2) {
        C2023a1<?, ?> a1Var = this.f3845b;
        Class<?> cls = C2367o0.f4133a;
        a1Var.mo12353i(t, a1Var.mo12359o(a1Var.mo12354j(t), a1Var.mo12354j(t2)));
        if (this.f3846c) {
            this.f3847d.mo13122b(t2);
            throw null;
        }
    }

    /* renamed from: e */
    public final int mo12558e(T t) {
        int hashCode = this.f3845b.mo12354j(t).hashCode();
        if (!this.f3846c) {
            return hashCode;
        }
        this.f3847d.mo13122b(t);
        throw null;
    }

    /* renamed from: f */
    public final boolean mo12559f(T t, T t2) {
        if (!this.f3845b.mo12354j(t).equals(this.f3845b.mo12354j(t2))) {
            return false;
        }
        if (!this.f3846c) {
            return true;
        }
        this.f3847d.mo13122b(t);
        this.f3847d.mo13122b(t2);
        throw null;
    }

    /* renamed from: g */
    public final void mo12560g(T t, C2389om omVar, C2605xm xmVar) {
        boolean z;
        C2023a1<?, ?> a1Var = this.f3845b;
        C2629ym<?> ymVar = this.f3847d;
        Object k = a1Var.mo12355k(t);
        C2095cn<?> c = ymVar.mo13123c(t);
        while (omVar.mo12903v() != Integer.MAX_VALUE) {
            int i = omVar.f4177b;
            if (i != 11) {
                if ((i & 7) == 2) {
                    Object f = ymVar.mo13126f(xmVar, this.f3844a, i >>> 3);
                    if (f != null) {
                        ymVar.mo13127g(omVar, f, xmVar, c);
                    } else {
                        z = a1Var.mo12358n(k, omVar);
                    }
                } else {
                    z = omVar.mo12904w();
                }
                if (!z) {
                    a1Var.mo12356l(t, k);
                    return;
                }
            } else {
                int i2 = 0;
                Object obj = null;
                C2317lm lmVar = null;
                while (true) {
                    try {
                        if (omVar.mo12903v() == Integer.MAX_VALUE) {
                            break;
                        }
                        int i3 = omVar.f4177b;
                        if (i3 == 16) {
                            i2 = omVar.mo12880D();
                            obj = ymVar.mo13126f(xmVar, this.f3844a, i2);
                        } else if (i3 == 26) {
                            if (obj != null) {
                                ymVar.mo13127g(omVar, obj, xmVar, c);
                            } else {
                                lmVar = omVar.mo12879C();
                            }
                        } else if (!omVar.mo12904w()) {
                            break;
                        }
                    } catch (Throwable th) {
                        a1Var.mo12356l(t, k);
                        throw th;
                    }
                }
                if (omVar.f4177b != 12) {
                    throw C2246j.m3528e();
                } else if (lmVar != null) {
                    if (obj != null) {
                        ymVar.mo13128h(lmVar, obj, xmVar, c);
                    } else {
                        a1Var.mo12349e(k, i2, lmVar);
                    }
                }
            }
        }
        a1Var.mo12356l(t, k);
    }

    /* renamed from: h */
    public final void mo12561h(T t, C2533um umVar) {
        this.f3847d.mo13122b(t);
        throw null;
    }

    /* renamed from: i */
    public final boolean mo12562i(T t) {
        this.f3847d.mo13122b(t);
        throw null;
    }

    /* renamed from: j */
    public final void mo12563j(T t, byte[] bArr, int i, int i2, C2144em emVar) {
        C2071c cVar = (C2071c) t;
        if (cVar.zzc == C2048b1.f3616f) {
            cVar.zzc = C2048b1.m3040a();
        }
        C2220hn hnVar = (C2220hn) t;
        throw null;
    }
}
