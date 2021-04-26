package p005b.p096l.p097a.p113c.p131e.p140i;

import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.i.p4 */
public final class C2911p4 extends C2924q4 {

    /* renamed from: j */
    public final int f4937j;

    public C2911p4(byte[] bArr, int i) {
        super(bArr);
        C2937r4.m5129H(0, i, bArr.length);
        this.f4937j = i;
    }

    /* renamed from: I */
    public final int mo13564I() {
        return 0;
    }

    /* renamed from: d */
    public final byte mo13565d(int i) {
        int i2 = this.f4937j;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f4949i[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(C0843a.m438N(22, "Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(C0843a.m439O(40, "Index > length: ", i, ", ", i2));
    }

    /* renamed from: e */
    public final byte mo13566e(int i) {
        return this.f4949i[i];
    }

    /* renamed from: l */
    public final int mo13567l() {
        return this.f4937j;
    }
}
