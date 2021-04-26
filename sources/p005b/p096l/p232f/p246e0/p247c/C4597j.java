package p005b.p096l.p232f.p246e0.p247c;

import androidx.renderscript.ScriptIntrinsicBLAS;

/* renamed from: b.l.f.e0.c.j */
public final class C4597j {

    /* renamed from: e */
    public static final int[] f8622e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f */
    public static final C4597j[] f8623f = m8473a();

    /* renamed from: a */
    public final int f8624a;

    /* renamed from: b */
    public final int[] f8625b;

    /* renamed from: c */
    public final C4599b[] f8626c;

    /* renamed from: d */
    public final int f8627d;

    /* renamed from: b.l.f.e0.c.j$a */
    public static final class C4598a {

        /* renamed from: a */
        public final int f8628a;

        /* renamed from: b */
        public final int f8629b;

        public C4598a(int i, int i2) {
            this.f8628a = i;
            this.f8629b = i2;
        }
    }

    /* renamed from: b.l.f.e0.c.j$b */
    public static final class C4599b {

        /* renamed from: a */
        public final int f8630a;

        /* renamed from: b */
        public final C4598a[] f8631b;

        public C4599b(int i, C4598a... aVarArr) {
            this.f8630a = i;
            this.f8631b = aVarArr;
        }

        /* renamed from: a */
        public int mo16253a() {
            int i = 0;
            for (C4598a aVar : this.f8631b) {
                i += aVar.f8628a;
            }
            return i;
        }
    }

    public C4597j(int i, int[] iArr, C4599b... bVarArr) {
        this.f8624a = i;
        this.f8625b = iArr;
        this.f8626c = bVarArr;
        int i2 = bVarArr[0].f8630a;
        int i3 = 0;
        for (C4598a aVar : bVarArr[0].f8631b) {
            i3 += (aVar.f8629b + i2) * aVar.f8628a;
        }
        this.f8627d = i3;
    }

    /* renamed from: a */
    public static C4597j[] m8473a() {
        return new C4597j[]{new C4597j(1, new int[0], new C4599b(7, new C4598a(1, 19)), new C4599b(10, new C4598a(1, 16)), new C4599b(13, new C4598a(1, 13)), new C4599b(17, new C4598a(1, 9))), new C4597j(2, new int[]{6, 18}, new C4599b(10, new C4598a(1, 34)), new C4599b(16, new C4598a(1, 28)), new C4599b(22, new C4598a(1, 22)), new C4599b(28, new C4598a(1, 16))), new C4597j(3, new int[]{6, 22}, new C4599b(15, new C4598a(1, 55)), new C4599b(26, new C4598a(1, 44)), new C4599b(18, new C4598a(2, 17)), new C4599b(22, new C4598a(2, 13))), new C4597j(4, new int[]{6, 26}, new C4599b(20, new C4598a(1, 80)), new C4599b(18, new C4598a(2, 32)), new C4599b(26, new C4598a(2, 24)), new C4599b(16, new C4598a(4, 9))), new C4597j(5, new int[]{6, 30}, new C4599b(26, new C4598a(1, 108)), new C4599b(24, new C4598a(2, 43)), new C4599b(18, new C4598a(2, 15), new C4598a(2, 16)), new C4599b(22, new C4598a(2, 11), new C4598a(2, 12))), new C4597j(6, new int[]{6, 34}, new C4599b(18, new C4598a(2, 68)), new C4599b(16, new C4598a(4, 27)), new C4599b(24, new C4598a(4, 19)), new C4599b(28, new C4598a(4, 15))), new C4597j(7, new int[]{6, 22, 38}, new C4599b(20, new C4598a(2, 78)), new C4599b(18, new C4598a(4, 31)), new C4599b(18, new C4598a(2, 14), new C4598a(4, 15)), new C4599b(26, new C4598a(4, 13), new C4598a(1, 14))), new C4597j(8, new int[]{6, 24, 42}, new C4599b(24, new C4598a(2, 97)), new C4599b(22, new C4598a(2, 38), new C4598a(2, 39)), new C4599b(22, new C4598a(4, 18), new C4598a(2, 19)), new C4599b(26, new C4598a(4, 14), new C4598a(2, 15))), new C4597j(9, new int[]{6, 26, 46}, new C4599b(30, new C4598a(2, 116)), new C4599b(22, new C4598a(3, 36), new C4598a(2, 37)), new C4599b(20, new C4598a(4, 16), new C4598a(4, 17)), new C4599b(24, new C4598a(4, 12), new C4598a(4, 13))), new C4597j(10, new int[]{6, 28, 50}, new C4599b(18, new C4598a(2, 68), new C4598a(2, 69)), new C4599b(26, new C4598a(4, 43), new C4598a(1, 44)), new C4599b(24, new C4598a(6, 19), new C4598a(2, 20)), new C4599b(28, new C4598a(6, 15), new C4598a(2, 16))), new C4597j(11, new int[]{6, 30, 54}, new C4599b(20, new C4598a(4, 81)), new C4599b(30, new C4598a(1, 50), new C4598a(4, 51)), new C4599b(28, new C4598a(4, 22), new C4598a(4, 23)), new C4599b(24, new C4598a(3, 12), new C4598a(8, 13))), new C4597j(12, new int[]{6, 32, 58}, new C4599b(24, new C4598a(2, 92), new C4598a(2, 93)), new C4599b(22, new C4598a(6, 36), new C4598a(2, 37)), new C4599b(26, new C4598a(4, 20), new C4598a(6, 21)), new C4599b(28, new C4598a(7, 14), new C4598a(4, 15))), new C4597j(13, new int[]{6, 34, 62}, new C4599b(26, new C4598a(4, 107)), new C4599b(22, new C4598a(8, 37), new C4598a(1, 38)), new C4599b(24, new C4598a(8, 20), new C4598a(4, 21)), new C4599b(22, new C4598a(12, 11), new C4598a(4, 12))), new C4597j(14, new int[]{6, 26, 46, 66}, new C4599b(30, new C4598a(3, 115), new C4598a(1, 116)), new C4599b(24, new C4598a(4, 40), new C4598a(5, 41)), new C4599b(20, new C4598a(11, 16), new C4598a(5, 17)), new C4599b(24, new C4598a(11, 12), new C4598a(5, 13))), new C4597j(15, new int[]{6, 26, 48, 70}, new C4599b(22, new C4598a(5, 87), new C4598a(1, 88)), new C4599b(24, new C4598a(5, 41), new C4598a(5, 42)), new C4599b(30, new C4598a(5, 24), new C4598a(7, 25)), new C4599b(24, new C4598a(11, 12), new C4598a(7, 13))), new C4597j(16, new int[]{6, 26, 50, 74}, new C4599b(24, new C4598a(5, 98), new C4598a(1, 99)), new C4599b(28, new C4598a(7, 45), new C4598a(3, 46)), new C4599b(24, new C4598a(15, 19), new C4598a(2, 20)), new C4599b(30, new C4598a(3, 15), new C4598a(13, 16))), new C4597j(17, new int[]{6, 30, 54, 78}, new C4599b(28, new C4598a(1, 107), new C4598a(5, 108)), new C4599b(28, new C4598a(10, 46), new C4598a(1, 47)), new C4599b(28, new C4598a(1, 22), new C4598a(15, 23)), new C4599b(28, new C4598a(2, 14), new C4598a(17, 15))), new C4597j(18, new int[]{6, 30, 56, 82}, new C4599b(30, new C4598a(5, 120), new C4598a(1, 121)), new C4599b(26, new C4598a(9, 43), new C4598a(4, 44)), new C4599b(28, new C4598a(17, 22), new C4598a(1, 23)), new C4599b(28, new C4598a(2, 14), new C4598a(19, 15))), new C4597j(19, new int[]{6, 30, 58, 86}, new C4599b(28, new C4598a(3, 113), new C4598a(4, 114)), new C4599b(26, new C4598a(3, 44), new C4598a(11, 45)), new C4599b(26, new C4598a(17, 21), new C4598a(4, 22)), new C4599b(26, new C4598a(9, 13), new C4598a(16, 14))), new C4597j(20, new int[]{6, 34, 62, 90}, new C4599b(28, new C4598a(3, 107), new C4598a(5, 108)), new C4599b(26, new C4598a(3, 41), new C4598a(13, 42)), new C4599b(30, new C4598a(15, 24), new C4598a(5, 25)), new C4599b(28, new C4598a(15, 15), new C4598a(10, 16))), new C4597j(21, new int[]{6, 28, 50, 72, 94}, new C4599b(28, new C4598a(4, 116), new C4598a(4, 117)), new C4599b(26, new C4598a(17, 42)), new C4599b(28, new C4598a(17, 22), new C4598a(6, 23)), new C4599b(30, new C4598a(19, 16), new C4598a(6, 17))), new C4597j(22, new int[]{6, 26, 50, 74, 98}, new C4599b(28, new C4598a(2, 111), new C4598a(7, 112)), new C4599b(28, new C4598a(17, 46)), new C4599b(30, new C4598a(7, 24), new C4598a(16, 25)), new C4599b(24, new C4598a(34, 13))), new C4597j(23, new int[]{6, 30, 54, 78, 102}, new C4599b(30, new C4598a(4, 121), new C4598a(5, 122)), new C4599b(28, new C4598a(4, 47), new C4598a(14, 48)), new C4599b(30, new C4598a(11, 24), new C4598a(14, 25)), new C4599b(30, new C4598a(16, 15), new C4598a(14, 16))), new C4597j(24, new int[]{6, 28, 54, 80, 106}, new C4599b(30, new C4598a(6, 117), new C4598a(4, 118)), new C4599b(28, new C4598a(6, 45), new C4598a(14, 46)), new C4599b(30, new C4598a(11, 24), new C4598a(16, 25)), new C4599b(30, new C4598a(30, 16), new C4598a(2, 17))), new C4597j(25, new int[]{6, 32, 58, 84, 110}, new C4599b(26, new C4598a(8, 106), new C4598a(4, 107)), new C4599b(28, new C4598a(8, 47), new C4598a(13, 48)), new C4599b(30, new C4598a(7, 24), new C4598a(22, 25)), new C4599b(30, new C4598a(22, 15), new C4598a(13, 16))), new C4597j(26, new int[]{6, 30, 58, 86, 114}, new C4599b(28, new C4598a(10, 114), new C4598a(2, 115)), new C4599b(28, new C4598a(19, 46), new C4598a(4, 47)), new C4599b(28, new C4598a(28, 22), new C4598a(6, 23)), new C4599b(30, new C4598a(33, 16), new C4598a(4, 17))), new C4597j(27, new int[]{6, 34, 62, 90, 118}, new C4599b(30, new C4598a(8, 122), new C4598a(4, 123)), new C4599b(28, new C4598a(22, 45), new C4598a(3, 46)), new C4599b(30, new C4598a(8, 23), new C4598a(26, 24)), new C4599b(30, new C4598a(12, 15), new C4598a(28, 16))), new C4597j(28, new int[]{6, 26, 50, 74, 98, 122}, new C4599b(30, new C4598a(3, 117), new C4598a(10, 118)), new C4599b(28, new C4598a(3, 45), new C4598a(23, 46)), new C4599b(30, new C4598a(4, 24), new C4598a(31, 25)), new C4599b(30, new C4598a(11, 15), new C4598a(31, 16))), new C4597j(29, new int[]{6, 30, 54, 78, 102, 126}, new C4599b(30, new C4598a(7, 116), new C4598a(7, 117)), new C4599b(28, new C4598a(21, 45), new C4598a(7, 46)), new C4599b(30, new C4598a(1, 23), new C4598a(37, 24)), new C4599b(30, new C4598a(19, 15), new C4598a(26, 16))), new C4597j(30, new int[]{6, 26, 52, 78, 104, 130}, new C4599b(30, new C4598a(5, 115), new C4598a(10, 116)), new C4599b(28, new C4598a(19, 47), new C4598a(10, 48)), new C4599b(30, new C4598a(15, 24), new C4598a(25, 25)), new C4599b(30, new C4598a(23, 15), new C4598a(25, 16))), new C4597j(31, new int[]{6, 30, 56, 82, 108, 134}, new C4599b(30, new C4598a(13, 115), new C4598a(3, 116)), new C4599b(28, new C4598a(2, 46), new C4598a(29, 47)), new C4599b(30, new C4598a(42, 24), new C4598a(1, 25)), new C4599b(30, new C4598a(23, 15), new C4598a(28, 16))), new C4597j(32, new int[]{6, 34, 60, 86, 112, 138}, new C4599b(30, new C4598a(17, 115)), new C4599b(28, new C4598a(10, 46), new C4598a(23, 47)), new C4599b(30, new C4598a(10, 24), new C4598a(35, 25)), new C4599b(30, new C4598a(19, 15), new C4598a(35, 16))), new C4597j(33, new int[]{6, 30, 58, 86, 114, ScriptIntrinsicBLAS.RIGHT}, new C4599b(30, new C4598a(17, 115), new C4598a(1, 116)), new C4599b(28, new C4598a(14, 46), new C4598a(21, 47)), new C4599b(30, new C4598a(29, 24), new C4598a(19, 25)), new C4599b(30, new C4598a(11, 15), new C4598a(46, 16))), new C4597j(34, new int[]{6, 34, 62, 90, 118, 146}, new C4599b(30, new C4598a(13, 115), new C4598a(6, 116)), new C4599b(28, new C4598a(14, 46), new C4598a(23, 47)), new C4599b(30, new C4598a(44, 24), new C4598a(7, 25)), new C4599b(30, new C4598a(59, 16), new C4598a(1, 17))), new C4597j(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new C4599b(30, new C4598a(12, 121), new C4598a(7, 122)), new C4599b(28, new C4598a(12, 47), new C4598a(26, 48)), new C4599b(30, new C4598a(39, 24), new C4598a(14, 25)), new C4599b(30, new C4598a(22, 15), new C4598a(41, 16))), new C4597j(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new C4599b(30, new C4598a(6, 121), new C4598a(14, 122)), new C4599b(28, new C4598a(6, 47), new C4598a(34, 48)), new C4599b(30, new C4598a(46, 24), new C4598a(10, 25)), new C4599b(30, new C4598a(2, 15), new C4598a(64, 16))), new C4597j(37, new int[]{6, 28, 54, 80, 106, ScriptIntrinsicBLAS.UNIT, 158}, new C4599b(30, new C4598a(17, 122), new C4598a(4, 123)), new C4599b(28, new C4598a(29, 46), new C4598a(14, 47)), new C4599b(30, new C4598a(49, 24), new C4598a(10, 25)), new C4599b(30, new C4598a(24, 15), new C4598a(46, 16))), new C4597j(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new C4599b(30, new C4598a(4, 122), new C4598a(18, 123)), new C4599b(28, new C4598a(13, 46), new C4598a(32, 47)), new C4599b(30, new C4598a(48, 24), new C4598a(14, 25)), new C4599b(30, new C4598a(42, 15), new C4598a(32, 16))), new C4597j(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C4599b(30, new C4598a(20, 117), new C4598a(4, 118)), new C4599b(28, new C4598a(40, 47), new C4598a(7, 48)), new C4599b(30, new C4598a(43, 24), new C4598a(22, 25)), new C4599b(30, new C4598a(10, 15), new C4598a(67, 16))), new C4597j(40, new int[]{6, 30, 58, 86, 114, ScriptIntrinsicBLAS.RIGHT, 170}, new C4599b(30, new C4598a(19, 118), new C4598a(6, 119)), new C4599b(28, new C4598a(18, 47), new C4598a(31, 48)), new C4599b(30, new C4598a(34, 24), new C4598a(34, 25)), new C4599b(30, new C4598a(20, 15), new C4598a(61, 16)))};
    }

    /* renamed from: b */
    public static C4597j m8474b(int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        while (true) {
            int[] iArr = f8622e;
            if (i2 < iArr.length) {
                int i5 = iArr[i2];
                if (i5 == i) {
                    return m8475d(i2 + 7);
                }
                int b = C4594g.m8471b(i, i5);
                if (b < i3) {
                    i4 = i2 + 7;
                    i3 = b;
                }
                i2++;
            } else if (i3 <= 3) {
                return m8475d(i4);
            } else {
                return null;
            }
        }
    }

    /* renamed from: d */
    public static C4597j m8475d(int i) {
        if (i > 0 && i <= 40) {
            return f8623f[i - 1];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public int mo16251c() {
        return (this.f8624a * 4) + 17;
    }

    public String toString() {
        return String.valueOf(this.f8624a);
    }
}
