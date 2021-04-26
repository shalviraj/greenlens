package p298d.p299a.p300a.p301a.p413z0;

import java.io.Serializable;

/* renamed from: d.a.a.a.z0.e */
public final class C7656e<K, V> implements Serializable {

    /* renamed from: g */
    public final K f15166g;

    /* renamed from: h */
    public final V f15167h;

    public C7656e(K k, V v) {
        this.f15166g = k;
        this.f15167h = v;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof p298d.p299a.p300a.p301a.p413z0.C7656e
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            d.a.a.a.z0.e r4 = (p298d.p299a.p300a.p301a.p413z0.C7656e) r4
            K r0 = r3.f15166g
            if (r0 != 0) goto L_0x0011
            K r0 = r4.f15166g
            if (r0 != 0) goto L_0x0029
            goto L_0x0019
        L_0x0011:
            K r2 = r4.f15166g
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0029
        L_0x0019:
            V r0 = r3.f15167h
            V r4 = r4.f15167h
            if (r0 != 0) goto L_0x0022
            if (r4 != 0) goto L_0x0029
            goto L_0x0028
        L_0x0022:
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p413z0.C7656e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        K k = this.f15166g;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f15167h;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return this.f15166g + "=" + this.f15167h;
    }
}
