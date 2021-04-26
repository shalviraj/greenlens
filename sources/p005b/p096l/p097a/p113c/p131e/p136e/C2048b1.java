package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.Arrays;

/* renamed from: b.l.a.c.e.e.b1 */
public final class C2048b1 {

    /* renamed from: f */
    public static final C2048b1 f3616f = new C2048b1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f3617a;

    /* renamed from: b */
    public int[] f3618b;

    /* renamed from: c */
    public Object[] f3619c;

    /* renamed from: d */
    public int f3620d;

    /* renamed from: e */
    public boolean f3621e;

    public C2048b1() {
        this(0, new int[8], new Object[8], true);
    }

    public C2048b1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f3620d = -1;
        this.f3617a = i;
        this.f3618b = iArr;
        this.f3619c = objArr;
        this.f3621e = z;
    }

    /* renamed from: a */
    public static C2048b1 m3040a() {
        return new C2048b1(0, new int[8], new Object[8], true);
    }

    /* renamed from: b */
    public final int mo12417b() {
        int i;
        int i2;
        int i3;
        int i4 = this.f3620d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f3617a; i6++) {
            int i7 = this.f3618b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f3619c[i6]).longValue();
                    i3 = C2509tm.m4203b(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int b = C2509tm.m4203b(i8 << 3);
                    int l = ((C2317lm) this.f3619c[i6]).mo12755l();
                    i5 = C2509tm.m4203b(l) + l + b + i5;
                } else if (i9 == 3) {
                    int y = C2509tm.m4209y(i8);
                    i2 = y + y;
                    i = ((C2048b1) this.f3619c[i6]).mo12417b();
                } else if (i9 == 5) {
                    ((Integer) this.f3619c[i6]).intValue();
                    i3 = C2509tm.m4203b(i8 << 3) + 4;
                } else {
                    int i10 = C2246j.f3950g;
                    throw new IllegalStateException(new C2221i());
                }
                i5 = i3 + i5;
            } else {
                long longValue = ((Long) this.f3619c[i6]).longValue();
                i2 = C2509tm.m4203b(i8 << 3);
                i = C2509tm.m4204c(longValue);
            }
            i5 = i + i2 + i5;
        }
        this.f3620d = i5;
        return i5;
    }

    /* renamed from: c */
    public final void mo12418c(int i, Object obj) {
        if (this.f3621e) {
            int i2 = this.f3617a;
            int[] iArr = this.f3618b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f3618b = Arrays.copyOf(iArr, i3);
                this.f3619c = Arrays.copyOf(this.f3619c, i3);
            }
            int[] iArr2 = this.f3618b;
            int i4 = this.f3617a;
            iArr2[i4] = i;
            this.f3619c[i4] = obj;
            this.f3617a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final void mo12419d(C2533um umVar) {
        if (this.f3617a != 0) {
            for (int i = 0; i < this.f3617a; i++) {
                int i2 = this.f3618b[i];
                Object obj = this.f3619c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    umVar.f4358a.mo12937m(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    umVar.f4358a.mo12938n(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    umVar.f4358a.mo12941q(i3, (C2317lm) obj);
                } else if (i4 == 3) {
                    umVar.f4358a.mo12933i(i3, 3);
                    ((C2048b1) obj).mo12419d(umVar);
                    umVar.f4358a.mo12933i(i3, 4);
                } else if (i4 == 5) {
                    umVar.f4358a.mo12936l(i3, ((Integer) obj).intValue());
                } else {
                    int i5 = C2246j.f3950g;
                    throw new RuntimeException(new C2221i());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2048b1)) {
            return false;
        }
        C2048b1 b1Var = (C2048b1) obj;
        int i = this.f3617a;
        if (i == b1Var.f3617a) {
            int[] iArr = this.f3618b;
            int[] iArr2 = b1Var.f3618b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f3619c;
                    Object[] objArr2 = b1Var.f3619c;
                    int i3 = this.f3617a;
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
        int i = this.f3617a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f3618b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f3619c;
        int i7 = this.f3617a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
