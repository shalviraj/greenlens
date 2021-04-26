package p005b.p096l.p097a.p113c.p131e.p136e;

import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.e.jm */
public final class C2269jm extends C2293km {

    /* renamed from: j */
    public final int f3974j;

    public C2269jm(byte[] bArr, int i) {
        super(bArr);
        C2317lm.m3707M(0, i, bArr.length);
        this.f3974j = i;
    }

    /* renamed from: R */
    public final int mo12752R() {
        return 0;
    }

    /* renamed from: d */
    public final byte mo12753d(int i) {
        int i2 = this.f3974j;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f4030i[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(C0843a.m438N(22, "Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(C0843a.m439O(40, "Index > length: ", i, ", ", i2));
    }

    /* renamed from: e */
    public final byte mo12754e(int i) {
        return this.f4030i[i];
    }

    /* renamed from: l */
    public final int mo12755l() {
        return this.f3974j;
    }

    /* renamed from: q */
    public final void mo12756q(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f4030i, 0, bArr, 0, i3);
    }
}
