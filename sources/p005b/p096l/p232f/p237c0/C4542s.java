package p005b.p096l.p232f.p237c0;

import java.util.Map;
import java.util.regex.Pattern;
import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4613g;
import p005b.p096l.p232f.C4627u;
import p005b.p096l.p232f.p258y.C4658b;

/* renamed from: b.l.f.c0.s */
public abstract class C4542s implements C4627u {

    /* renamed from: a */
    public static final Pattern f8472a = Pattern.compile("[0-9]+");

    /* renamed from: b */
    public static int m8357b(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    /* renamed from: c */
    public static void m8358c(String str) {
        if (!f8472a.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    /* renamed from: a */
    public C4658b mo16167a(String str, C4484a aVar, int i, int i2, Map<C4613g, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        } else {
            int e = mo16205e();
            if (map != null) {
                C4613g gVar = C4613g.MARGIN;
                if (map.containsKey(gVar)) {
                    e = Integer.parseInt(map.get(gVar).toString());
                }
            }
            boolean[] d = mo16166d(str);
            int length = d.length;
            int i3 = e + length;
            int max = Math.max(i, i3);
            int max2 = Math.max(1, i2);
            int i4 = max / i3;
            int i5 = (max - (length * i4)) / 2;
            C4658b bVar = new C4658b(max, max2);
            int i6 = 0;
            while (i6 < length) {
                if (d[i6]) {
                    bVar.mo16340h(i5, 0, i4, max2);
                }
                i6++;
                i5 += i4;
            }
            return bVar;
        }
    }

    /* renamed from: d */
    public abstract boolean[] mo16166d(String str);

    /* renamed from: e */
    public int mo16205e() {
        return 10;
    }
}
