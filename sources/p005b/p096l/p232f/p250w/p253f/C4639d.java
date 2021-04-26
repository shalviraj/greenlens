package p005b.p096l.p232f.p250w.p253f;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: b.l.f.w.f.d */
public final class C4639d {

    /* renamed from: b */
    public static final String[] f8738b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c */
    public static final int[][] f8739c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: d */
    public static final int[][] f8740d;

    /* renamed from: e */
    public static final int[][] f8741e;

    /* renamed from: a */
    public final byte[] f8742a;

    static {
        Class<int> cls = int.class;
        int[][] iArr = (int[][]) Array.newInstance(cls, new int[]{5, 256});
        f8740d = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f8740d[0][i] = (i - 65) + 2;
        }
        f8740d[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f8740d[1][i2] = (i2 - 97) + 2;
        }
        f8740d[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f8740d[2][i3] = (i3 - 48) + 2;
        }
        int[][] iArr2 = f8740d;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            f8740d[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr4[i5] > 0) {
                f8740d[4][iArr4[i5]] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(cls, new int[]{6, 6});
        f8741e = iArr5;
        for (int[] fill : iArr5) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr6 = f8741e;
        iArr6[0][4] = 0;
        iArr6[1][4] = 0;
        iArr6[1][0] = 28;
        iArr6[3][4] = 0;
        iArr6[2][4] = 0;
        iArr6[2][0] = 15;
    }

    public C4639d(byte[] bArr) {
        this.f8742a = bArr;
    }

    /* renamed from: a */
    public static Collection<C4641f> m8551a(Iterable<C4641f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (C4641f next : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C4641f fVar = (C4641f) it.next();
                if (fVar.mo16304d(next)) {
                    z = false;
                    break;
                } else if (next.mo16304d(fVar)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(next);
            }
        }
        return linkedList;
    }
}
