package p005b.p096l.p232f.p246e0.p247c;

import androidx.appcompat.widget.ActivityChooserView;

/* renamed from: b.l.f.e0.c.g */
public final class C4594g {

    /* renamed from: c */
    public static final int[][] f8605c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a */
    public final C4593f f8606a;

    /* renamed from: b */
    public final byte f8607b;

    public C4594g(int i) {
        int i2 = (i >> 3) & 3;
        if (i2 >= 0) {
            C4593f[] fVarArr = C4593f.f8602l;
            if (i2 < fVarArr.length) {
                this.f8606a = fVarArr[i2];
                this.f8607b = (byte) (i & 7);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static C4594g m8470a(int i, int i2) {
        int b;
        int i3 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i4 = 0;
        for (int[] iArr : f8605c) {
            int i5 = iArr[0];
            if (i5 == i || i5 == i2) {
                return new C4594g(iArr[1]);
            }
            int b2 = m8471b(i, i5);
            if (b2 < i3) {
                i4 = iArr[1];
                i3 = b2;
            }
            if (i != i2 && (b = m8471b(i2, i5)) < i3) {
                i4 = iArr[1];
                i3 = b;
            }
        }
        if (i3 <= 3) {
            return new C4594g(i4);
        }
        return null;
    }

    /* renamed from: b */
    public static int m8471b(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4594g)) {
            return false;
        }
        C4594g gVar = (C4594g) obj;
        return this.f8606a == gVar.f8606a && this.f8607b == gVar.f8607b;
    }

    public int hashCode() {
        return (this.f8606a.ordinal() << 3) | this.f8607b;
    }
}
