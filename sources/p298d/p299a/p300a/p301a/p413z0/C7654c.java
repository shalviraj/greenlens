package p298d.p299a.p300a.p301a.p413z0;

/* renamed from: d.a.a.a.z0.c */
public final class C7654c<V> {

    /* renamed from: f */
    public static final C7654c<Object> f15158f = new C7654c<>();

    /* renamed from: a */
    public final long f15159a;

    /* renamed from: b */
    public final V f15160b;

    /* renamed from: c */
    public final C7654c<V> f15161c;

    /* renamed from: d */
    public final C7654c<V> f15162d;

    /* renamed from: e */
    public final int f15163e;

    public C7654c() {
        this.f15163e = 0;
        this.f15159a = 0;
        this.f15160b = null;
        this.f15161c = null;
        this.f15162d = null;
    }

    public C7654c(long j, V v, C7654c<V> cVar, C7654c<V> cVar2) {
        this.f15159a = j;
        this.f15160b = v;
        this.f15161c = cVar;
        this.f15162d = cVar2;
        this.f15163e = cVar.f15163e + 1 + cVar2.f15163e;
    }

    /* renamed from: a */
    public V mo25241a(long j) {
        C7654c<V> cVar;
        if (this.f15163e == 0) {
            return null;
        }
        long j2 = this.f15159a;
        if (j < j2) {
            cVar = this.f15161c;
        } else if (j <= j2) {
            return this.f15160b;
        } else {
            cVar = this.f15162d;
        }
        return cVar.mo25241a(j - j2);
    }

    /* renamed from: b */
    public C7654c<V> mo25242b(long j, V v) {
        if (this.f15163e == 0) {
            return new C7654c(j, v, this, this);
        }
        long j2 = this.f15159a;
        if (j < j2) {
            return mo25243c(this.f15161c.mo25242b(j - j2, v), this.f15162d);
        }
        if (j > j2) {
            return mo25243c(this.f15161c, this.f15162d.mo25242b(j - j2, v));
        }
        if (v == this.f15160b) {
            return this;
        }
        return new C7654c(j, v, this.f15161c, this.f15162d);
    }

    /* renamed from: c */
    public final C7654c<V> mo25243c(C7654c<V> cVar, C7654c<V> cVar2) {
        C7654c<V> cVar3 = cVar;
        C7654c<V> cVar4 = cVar2;
        if (cVar3 == this.f15161c && cVar4 == this.f15162d) {
            return this;
        }
        long j = this.f15159a;
        V v = this.f15160b;
        int i = cVar3.f15163e;
        int i2 = cVar4.f15163e;
        if (i + i2 > 1) {
            if (i >= i2 * 5) {
                C7654c<V> cVar5 = cVar3.f15161c;
                C7654c<V> cVar6 = cVar3.f15162d;
                if (cVar6.f15163e < cVar5.f15163e * 2) {
                    long j2 = cVar3.f15159a;
                    return new C7654c(j2 + j, cVar3.f15160b, cVar5, new C7654c(-j2, v, cVar6.mo25244d(cVar6.f15159a + j2), cVar2));
                }
                C7654c<V> cVar7 = cVar6.f15161c;
                C7654c<V> cVar8 = cVar6.f15162d;
                long j3 = cVar6.f15159a;
                long j4 = cVar3.f15159a + j3 + j;
                V v2 = cVar6.f15160b;
                C7654c cVar9 = new C7654c(-j3, cVar3.f15160b, cVar5, cVar7.mo25244d(cVar7.f15159a + j3));
                long j5 = cVar3.f15159a;
                long j6 = cVar6.f15159a;
                return new C7654c<>(j4, v2, cVar9, new C7654c((-j5) - j6, v, cVar8.mo25244d(cVar8.f15159a + j6 + j5), cVar2));
            } else if (i2 >= i * 5) {
                C7654c<V> cVar10 = cVar4.f15161c;
                C7654c<V> cVar11 = cVar4.f15162d;
                if (cVar10.f15163e < cVar11.f15163e * 2) {
                    long j7 = cVar4.f15159a;
                    C7654c<V> cVar12 = cVar;
                    return new C7654c<>(j7 + j, cVar4.f15160b, new C7654c(-j7, v, cVar12, cVar10.mo25244d(cVar10.f15159a + j7)), cVar11);
                }
                C7654c<V> cVar13 = cVar10.f15161c;
                C7654c<V> cVar14 = cVar10.f15162d;
                long j8 = cVar10.f15159a;
                long j9 = cVar4.f15159a;
                long j10 = j8 + j9 + j;
                V v3 = cVar10.f15160b;
                C7654c cVar15 = new C7654c((-j9) - j8, v, cVar, cVar13.mo25244d(cVar13.f15159a + j8 + j9));
                long j11 = cVar10.f15159a;
                return new C7654c<>(j10, v3, cVar15, new C7654c(-j11, cVar4.f15160b, cVar14.mo25244d(cVar14.f15159a + j11), cVar11));
            }
        }
        return new C7654c(j, v, cVar, cVar2);
    }

    /* renamed from: d */
    public final C7654c<V> mo25244d(long j) {
        if (this.f15163e == 0 || j == this.f15159a) {
            return this;
        }
        return new C7654c(j, this.f15160b, this.f15161c, this.f15162d);
    }
}
