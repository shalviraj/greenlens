package p376j.p378b.p383c;

import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: j.b.c.t */
public final class C7048t implements Comparable<C7048t> {

    /* renamed from: i */
    public static final C7048t f14147i = new C7048t(0, 0);

    /* renamed from: g */
    public final long f14148g;

    /* renamed from: h */
    public final long f14149h;

    public C7048t(long j, long j2) {
        this.f14148g = j;
        this.f14149h = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r8 < 0) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r0 < 0) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(java.lang.Object r8) {
        /*
            r7 = this;
            j.b.c.t r8 = (p376j.p378b.p383c.C7048t) r8
            long r0 = r7.f14148g
            long r2 = r8.f14148g
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = -1
            r2 = 1
            if (r0 != 0) goto L_0x0019
            long r3 = r7.f14149h
            long r5 = r8.f14149h
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x0016
            r8 = 0
            goto L_0x001e
        L_0x0016:
            if (r8 >= 0) goto L_0x001c
            goto L_0x001d
        L_0x0019:
            if (r0 >= 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r1 = r2
        L_0x001d:
            r8 = r1
        L_0x001e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p376j.p378b.p383c.C7048t.compareTo(java.lang.Object):int");
    }

    /* renamed from: d */
    public String mo24452d() {
        char[] cArr = new char[32];
        C7029h.m12634b(this.f14148g, cArr, 0);
        C7029h.m12634b(this.f14149h, cArr, 16);
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7048t)) {
            return false;
        }
        C7048t tVar = (C7048t) obj;
        return this.f14148g == tVar.f14148g && this.f14149h == tVar.f14149h;
    }

    public int hashCode() {
        long j = this.f14148g;
        long j2 = this.f14149h;
        return ((((int) (j ^ (j >>> 32))) + 31) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("TraceId{traceId=");
        u.append(mo24452d());
        u.append("}");
        return u.toString();
    }
}
