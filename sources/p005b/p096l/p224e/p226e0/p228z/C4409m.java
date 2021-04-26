package p005b.p096l.p224e.p226e0.p228z;

import java.lang.reflect.Type;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p224e.C4332b0;
import p005b.p096l.p224e.C4334c0;
import p005b.p096l.p224e.C4465k;
import p005b.p096l.p224e.C4470o;
import p005b.p096l.p224e.C4471p;
import p005b.p096l.p224e.C4472q;
import p005b.p096l.p224e.C4478w;
import p005b.p096l.p224e.C4479x;
import p005b.p096l.p224e.p230f0.C4455a;
import p005b.p096l.p224e.p231g0.C4460c;

/* renamed from: b.l.e.e0.z.m */
public final class C4409m<T> extends C4332b0<T> {

    /* renamed from: a */
    public final C4479x<T> f8163a;

    /* renamed from: b */
    public final C4471p<T> f8164b;

    /* renamed from: c */
    public final C4465k f8165c;

    /* renamed from: d */
    public final C4455a<T> f8166d;

    /* renamed from: e */
    public final C4334c0 f8167e;

    /* renamed from: f */
    public final C4409m<T>.b f8168f = new C4411b((C4410a) null);

    /* renamed from: g */
    public C4332b0<T> f8169g;

    /* renamed from: b.l.e.e0.z.m$b */
    public final class C4411b implements C4478w, C4470o {
        public C4411b(C4410a aVar) {
        }

        /* renamed from: a */
        public <R> R mo16085a(C4472q qVar, Type type) {
            C4465k kVar = C4409m.this.f8165c;
            Objects.requireNonNull(kVar);
            if (qVar == null) {
                return null;
            }
            return kVar.mo16116b(new C4393e(qVar), type);
        }
    }

    /* renamed from: b.l.e.e0.z.m$c */
    public static final class C4412c implements C4334c0 {

        /* renamed from: g */
        public final C4455a<?> f8171g;

        /* renamed from: h */
        public final boolean f8172h;

        /* renamed from: i */
        public final Class<?> f8173i;

        /* renamed from: j */
        public final C4479x<?> f8174j;

        /* renamed from: k */
        public final C4471p<?> f8175k;

        public C4412c(Object obj, C4455a<?> aVar, boolean z, Class<?> cls) {
            C4479x<?> xVar = obj instanceof C4479x ? (C4479x) obj : null;
            this.f8174j = xVar;
            C4471p<?> pVar = obj instanceof C4471p ? (C4471p) obj : null;
            this.f8175k = pVar;
            C1960d.m2853u((xVar == null && pVar == null) ? false : true);
            this.f8171g = aVar;
            this.f8172h = z;
            this.f8173i = null;
        }

        /* renamed from: a */
        public <T> C4332b0<T> mo10754a(C4465k kVar, C4455a<T> aVar) {
            boolean z;
            C4455a<?> aVar2 = this.f8171g;
            if (aVar2 != null) {
                z = aVar2.equals(aVar) || (this.f8172h && this.f8171g.f8250b == aVar.f8249a);
            } else {
                z = this.f8173i.isAssignableFrom(aVar.f8249a);
            }
            if (z) {
                return new C4409m(this.f8174j, this.f8175k, kVar, aVar, this);
            }
            return null;
        }
    }

    public C4409m(C4479x<T> xVar, C4471p<T> pVar, C4465k kVar, C4455a<T> aVar, C4334c0 c0Var) {
        this.f8163a = xVar;
        this.f8164b = pVar;
        this.f8165c = kVar;
        this.f8166d = aVar;
        this.f8167e = c0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        throw new p005b.p096l.p224e.C4480y((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        throw new p005b.p096l.p224e.C4473r((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        throw new p005b.p096l.p224e.C4480y((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029 A[ExcHandler: NumberFormatException (r4v9 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030 A[ExcHandler: IOException (r4v8 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[ExcHandler: d (r4v7 'e' b.l.e.g0.d A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo10755a(p005b.p096l.p224e.p231g0.C4457a r4) {
        /*
            r3 = this;
            b.l.e.p<T> r0 = r3.f8164b
            if (r0 != 0) goto L_0x001a
            b.l.e.b0<T> r0 = r3.f8169g
            if (r0 == 0) goto L_0x0009
            goto L_0x0015
        L_0x0009:
            b.l.e.k r0 = r3.f8165c
            b.l.e.c0 r1 = r3.f8167e
            b.l.e.f0.a<T> r2 = r3.f8166d
            b.l.e.b0 r0 = r0.mo16121g(r1, r2)
            r3.f8169g = r0
        L_0x0015:
            java.lang.Object r4 = r0.mo10755a(r4)
            return r4
        L_0x001a:
            r4.mo16060w0()     // Catch:{ EOFException -> 0x003e, d -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            r0 = 0
            b.l.e.b0<b.l.e.q> r1 = p005b.p096l.p224e.p226e0.p228z.C4414o.f8202X     // Catch:{ EOFException -> 0x0027, d -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            java.lang.Object r4 = r1.mo10755a(r4)     // Catch:{ EOFException -> 0x0027, d -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            b.l.e.q r4 = (p005b.p096l.p224e.C4472q) r4     // Catch:{ EOFException -> 0x0027, d -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            goto L_0x0044
        L_0x0027:
            r4 = move-exception
            goto L_0x0040
        L_0x0029:
            r4 = move-exception
            b.l.e.y r0 = new b.l.e.y
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        L_0x0030:
            r4 = move-exception
            b.l.e.r r0 = new b.l.e.r
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        L_0x0037:
            r4 = move-exception
            b.l.e.y r0 = new b.l.e.y
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        L_0x003e:
            r4 = move-exception
            r0 = 1
        L_0x0040:
            if (r0 == 0) goto L_0x005a
            b.l.e.s r4 = p005b.p096l.p224e.C4474s.f8318a
        L_0x0044:
            java.util.Objects.requireNonNull(r4)
            boolean r0 = r4 instanceof p005b.p096l.p224e.C4474s
            if (r0 == 0) goto L_0x004d
            r4 = 0
            return r4
        L_0x004d:
            b.l.e.p<T> r0 = r3.f8164b
            b.l.e.f0.a<T> r1 = r3.f8166d
            java.lang.reflect.Type r1 = r1.f8250b
            b.l.e.e0.z.m<T>$b r2 = r3.f8168f
            java.lang.Object r4 = r0.mo10724a(r4, r1, r2)
            return r4
        L_0x005a:
            b.l.e.y r0 = new b.l.e.y
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p224e.p226e0.p228z.C4409m.mo10755a(b.l.e.g0.a):java.lang.Object");
    }

    /* renamed from: b */
    public void mo10756b(C4460c cVar, T t) {
        C4479x<T> xVar = this.f8163a;
        if (xVar == null) {
            C4332b0<T> b0Var = this.f8169g;
            if (b0Var == null) {
                b0Var = this.f8165c.mo16121g(this.f8167e, this.f8166d);
                this.f8169g = b0Var;
            }
            b0Var.mo10756b(cVar, t);
        } else if (t == null) {
            cVar.mo16066Z();
        } else {
            C4414o.f8202X.mo10756b(cVar, xVar.mo16150a(t, this.f8166d.f8250b, this.f8168f));
        }
    }
}
