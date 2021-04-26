package p005b.p096l.p232f.p246e0.p249e;

import java.lang.reflect.Array;

/* renamed from: b.l.f.e0.e.b */
public final class C4609b {

    /* renamed from: a */
    public final byte[][] f8657a;

    /* renamed from: b */
    public final int f8658b;

    /* renamed from: c */
    public final int f8659c;

    public C4609b(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        this.f8657a = (byte[][]) Array.newInstance(byte.class, iArr);
        this.f8658b = i;
        this.f8659c = i2;
    }

    /* renamed from: a */
    public byte mo16266a(int i, int i2) {
        return this.f8657a[i2][i];
    }

    /* renamed from: b */
    public void mo16267b(int i, int i2, int i3) {
        this.f8657a[i2][i] = (byte) i3;
    }

    /* renamed from: c */
    public void mo16268c(int i, int i2, boolean z) {
        this.f8657a[i2][i] = z ? (byte) 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f8658b * 2 * this.f8659c) + 2);
        for (int i = 0; i < this.f8659c; i++) {
            byte[] bArr = this.f8657a[i];
            for (int i2 = 0; i2 < this.f8658b; i2++) {
                byte b = bArr[i2];
                sb.append(b != 0 ? b != 1 ? "  " : " 1" : " 0");
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
