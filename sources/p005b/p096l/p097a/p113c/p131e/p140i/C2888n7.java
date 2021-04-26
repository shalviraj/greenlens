package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.Arrays;

/* renamed from: b.l.a.c.e.i.n7 */
public final class C2888n7 {

    /* renamed from: f */
    public static final C2888n7 f4905f = new C2888n7(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f4906a;

    /* renamed from: b */
    public int[] f4907b;

    /* renamed from: c */
    public Object[] f4908c;

    /* renamed from: d */
    public int f4909d;

    /* renamed from: e */
    public boolean f4910e;

    public C2888n7() {
        this(0, new int[8], new Object[8], true);
    }

    public C2888n7(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f4909d = -1;
        this.f4906a = i;
        this.f4907b = iArr;
        this.f4908c = objArr;
        this.f4910e = z;
    }

    /* renamed from: a */
    public static C2888n7 m4996a() {
        return new C2888n7(0, new int[8], new Object[8], true);
    }

    /* renamed from: b */
    public final int mo13519b() {
        int i;
        int i2;
        int i3;
        int i4 = this.f4909d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f4906a; i6++) {
            int i7 = this.f4907b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f4908c[i6]).longValue();
                    i3 = C3002w4.m5506u(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int u = C3002w4.m5506u(i8 << 3);
                    int l = ((C2937r4) this.f4908c[i6]).mo13567l();
                    i5 = C3002w4.m5506u(l) + l + u + i5;
                } else if (i9 == 3) {
                    int s = C3002w4.m5504s(i8);
                    i2 = s + s;
                    i = ((C2888n7) this.f4908c[i6]).mo13519b();
                } else if (i9 == 5) {
                    ((Integer) this.f4908c[i6]).intValue();
                    i3 = C3002w4.m5506u(i8 << 3) + 4;
                } else {
                    int i10 = C3016x5.f5137g;
                    throw new IllegalStateException(new C3003w5());
                }
                i5 = i3 + i5;
            } else {
                long longValue = ((Long) this.f4908c[i6]).longValue();
                i2 = C3002w4.m5506u(i8 << 3);
                i = C3002w4.m5507v(longValue);
            }
            i5 = i + i2 + i5;
        }
        this.f4909d = i5;
        return i5;
    }

    /* renamed from: c */
    public final void mo13520c(int i, Object obj) {
        if (this.f4910e) {
            int i2 = this.f4906a;
            int[] iArr = this.f4907b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f4907b = Arrays.copyOf(iArr, i3);
                this.f4908c = Arrays.copyOf(this.f4908c, i3);
            }
            int[] iArr2 = this.f4907b;
            int i4 = this.f4906a;
            iArr2[i4] = i;
            this.f4908c[i4] = obj;
            this.f4906a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final void mo13521d(C3015x4 x4Var) {
        if (this.f4906a != 0) {
            for (int i = 0; i < this.f4906a; i++) {
                int i2 = this.f4907b[i];
                Object obj = this.f4908c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    x4Var.f5136a.mo13774h(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    x4Var.f5136a.mo13775i(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    x4Var.f5136a.mo13778l(i3, (C2937r4) obj);
                } else if (i4 == 3) {
                    x4Var.f5136a.mo13770d(i3, 3);
                    ((C2888n7) obj).mo13521d(x4Var);
                    x4Var.f5136a.mo13770d(i3, 4);
                } else if (i4 == 5) {
                    x4Var.f5136a.mo13773g(i3, ((Integer) obj).intValue());
                } else {
                    int i5 = C3016x5.f5137g;
                    throw new RuntimeException(new C3003w5());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2888n7)) {
            return false;
        }
        C2888n7 n7Var = (C2888n7) obj;
        int i = this.f4906a;
        if (i == n7Var.f4906a) {
            int[] iArr = this.f4907b;
            int[] iArr2 = n7Var.f4907b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f4908c;
                    Object[] objArr2 = n7Var.f4908c;
                    int i3 = this.f4906a;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f4906a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f4907b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f4908c;
        int i7 = this.f4906a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
