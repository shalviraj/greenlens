package p005b.p096l.p232f.p241d0.p245g;

import java.lang.reflect.Array;

/* renamed from: b.l.f.d0.g.a */
public final class C4570a {

    /* renamed from: a */
    public final C4571b[] f8548a;

    /* renamed from: b */
    public int f8549b;

    /* renamed from: c */
    public final int f8550c;

    /* renamed from: d */
    public final int f8551d;

    public C4570a(int i, int i2) {
        C4571b[] bVarArr = new C4571b[i];
        this.f8548a = bVarArr;
        int length = bVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f8548a[i3] = new C4571b(((i2 + 4) * 17) + 1);
        }
        this.f8551d = i2 * 17;
        this.f8550c = i;
        this.f8549b = -1;
    }

    /* renamed from: a */
    public C4571b mo16236a() {
        return this.f8548a[this.f8549b];
    }

    /* renamed from: b */
    public byte[][] mo16237b(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = this.f8551d * i;
        iArr[0] = this.f8550c * i2;
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, iArr);
        int i3 = this.f8550c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i3 - i4) - 1;
            C4571b bVar = this.f8548a[i4 / i2];
            int length = bVar.f8552a.length * i;
            byte[] bArr2 = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                bArr2[i6] = bVar.f8552a[i6 / i];
            }
            bArr[i5] = bArr2;
        }
        return bArr;
    }
}
