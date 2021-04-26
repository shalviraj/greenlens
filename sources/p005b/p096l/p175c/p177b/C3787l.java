package p005b.p096l.p175c.p177b;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p175c.p176a.C3757c;

/* renamed from: b.l.c.b.l */
public final class C3787l<T> implements Serializable {

    /* renamed from: g */
    public final Comparator<? super T> f6988g;

    /* renamed from: h */
    public final boolean f6989h;

    /* renamed from: i */
    public final T f6990i;

    /* renamed from: j */
    public final C3771f f6991j;

    /* renamed from: k */
    public final boolean f6992k;

    /* renamed from: l */
    public final T f6993l;

    /* renamed from: m */
    public final C3771f f6994m;

    public C3787l(Comparator<? super T> comparator, boolean z, T t, C3771f fVar, boolean z2, T t2, C3771f fVar2) {
        Objects.requireNonNull(comparator);
        this.f6988g = comparator;
        this.f6989h = z;
        this.f6992k = z2;
        this.f6990i = t;
        Objects.requireNonNull(fVar);
        this.f6991j = fVar;
        this.f6993l = t2;
        Objects.requireNonNull(fVar2);
        this.f6994m = fVar2;
        if (z) {
            comparator.compare(t, t);
        }
        if (z2) {
            comparator.compare(t2, t2);
        }
        if (z && z2) {
            int compare = comparator.compare(t, t2);
            boolean z3 = true;
            if (!(compare <= 0)) {
                throw new IllegalArgumentException(C3757c.m7060a("lowerEndpoint (%s) > upperEndpoint (%s)", t, t2));
            } else if (compare == 0) {
                C3771f fVar3 = C3771f.OPEN;
                C1960d.m2849t((fVar != fVar3) | (fVar2 == fVar3 ? false : z3));
            }
        }
    }

    /* renamed from: a */
    public boolean mo15262a(T t) {
        return !mo15265d(t) && !mo15264c(t);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r13.f6991j == r0) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r13.f6994m == r0) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a A[ADDED_TO_REGION] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p096l.p175c.p177b.C3787l<T> mo15263b(p005b.p096l.p175c.p177b.C3787l<T> r13) {
        /*
            r12 = this;
            b.l.c.b.f r0 = p005b.p096l.p175c.p177b.C3771f.OPEN
            java.util.Comparator<? super T> r1 = r12.f6988g
            java.util.Comparator<? super T> r2 = r13.f6988g
            boolean r1 = r1.equals(r2)
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2849t(r1)
            boolean r1 = r12.f6989h
            T r2 = r12.f6990i
            b.l.c.b.f r3 = r12.f6991j
            if (r1 != 0) goto L_0x001a
            boolean r1 = r13.f6989h
        L_0x0017:
            T r2 = r13.f6990i
            goto L_0x002f
        L_0x001a:
            boolean r4 = r13.f6989h
            if (r4 == 0) goto L_0x0031
            java.util.Comparator<? super T> r4 = r12.f6988g
            T r5 = r13.f6990i
            int r4 = r4.compare(r2, r5)
            if (r4 < 0) goto L_0x0017
            if (r4 != 0) goto L_0x0031
            b.l.c.b.f r4 = r13.f6991j
            if (r4 != r0) goto L_0x0031
            goto L_0x0017
        L_0x002f:
            b.l.c.b.f r3 = r13.f6991j
        L_0x0031:
            r6 = r1
            boolean r1 = r12.f6992k
            T r4 = r12.f6993l
            b.l.c.b.f r5 = r12.f6994m
            if (r1 != 0) goto L_0x003f
            boolean r1 = r13.f6992k
        L_0x003c:
            T r4 = r13.f6993l
            goto L_0x0054
        L_0x003f:
            boolean r7 = r13.f6992k
            if (r7 == 0) goto L_0x0056
            java.util.Comparator<? super T> r7 = r12.f6988g
            T r8 = r13.f6993l
            int r7 = r7.compare(r4, r8)
            if (r7 > 0) goto L_0x003c
            if (r7 != 0) goto L_0x0056
            b.l.c.b.f r7 = r13.f6994m
            if (r7 != r0) goto L_0x0056
            goto L_0x003c
        L_0x0054:
            b.l.c.b.f r5 = r13.f6994m
        L_0x0056:
            r9 = r1
            r10 = r4
            if (r6 == 0) goto L_0x0070
            if (r9 == 0) goto L_0x0070
            java.util.Comparator<? super T> r13 = r12.f6988g
            int r13 = r13.compare(r2, r10)
            if (r13 > 0) goto L_0x006a
            if (r13 != 0) goto L_0x0070
            if (r3 != r0) goto L_0x0070
            if (r5 != r0) goto L_0x0070
        L_0x006a:
            b.l.c.b.f r13 = p005b.p096l.p175c.p177b.C3771f.CLOSED
            r11 = r13
            r8 = r0
            r7 = r10
            goto L_0x0073
        L_0x0070:
            r7 = r2
            r8 = r3
            r11 = r5
        L_0x0073:
            b.l.c.b.l r13 = new b.l.c.b.l
            java.util.Comparator<? super T> r5 = r12.f6988g
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p175c.p177b.C3787l.mo15263b(b.l.c.b.l):b.l.c.b.l");
    }

    /* renamed from: c */
    public boolean mo15264c(T t) {
        boolean z = false;
        if (!this.f6992k) {
            return false;
        }
        int compare = this.f6988g.compare(t, this.f6993l);
        boolean z2 = compare > 0;
        boolean z3 = compare == 0;
        if (this.f6994m == C3771f.OPEN) {
            z = true;
        }
        return (z3 & z) | z2;
    }

    /* renamed from: d */
    public boolean mo15265d(T t) {
        boolean z = false;
        if (!this.f6989h) {
            return false;
        }
        int compare = this.f6988g.compare(t, this.f6990i);
        boolean z2 = compare < 0;
        boolean z3 = compare == 0;
        if (this.f6991j == C3771f.OPEN) {
            z = true;
        }
        return (z3 & z) | z2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3787l)) {
            return false;
        }
        C3787l lVar = (C3787l) obj;
        if (!this.f6988g.equals(lVar.f6988g) || this.f6989h != lVar.f6989h || this.f6992k != lVar.f6992k || !this.f6991j.equals(lVar.f6991j) || !this.f6994m.equals(lVar.f6994m) || !C1960d.m2725K(this.f6990i, lVar.f6990i) || !C1960d.m2725K(this.f6993l, lVar.f6993l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6988g, this.f6990i, this.f6991j, this.f6993l, this.f6994m});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6988g);
        sb.append(":");
        C3771f fVar = this.f6991j;
        C3771f fVar2 = C3771f.CLOSED;
        sb.append(fVar == fVar2 ? '[' : '(');
        sb.append(this.f6989h ? this.f6990i : "-∞");
        sb.append(',');
        sb.append(this.f6992k ? this.f6993l : "∞");
        sb.append(this.f6994m == fVar2 ? ']' : ')');
        return sb.toString();
    }
}
