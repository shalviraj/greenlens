package p005b.p082j.p083a.p084a.p087q;

import androidx.recyclerview.widget.RecyclerView;
import java.math.BigDecimal;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.j.a.a.q.f */
public final class C1541f {

    /* renamed from: a */
    public static final String f2466a = String.valueOf(Long.MIN_VALUE).substring(1);

    /* renamed from: b */
    public static final String f2467b = String.valueOf(RecyclerView.FOREVER_NS);

    /* renamed from: a */
    public static NumberFormatException m1856a(String str) {
        return new NumberFormatException(C0843a.m452m("Value \"", str, "\" can not be represented as BigDecimal"));
    }

    /* renamed from: b */
    public static BigDecimal m1857b(char[] cArr, int i, int i2) {
        try {
            return new BigDecimal(cArr, i, i2);
        } catch (NumberFormatException unused) {
            throw m1856a(new String(cArr, i, i2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return r0 + ((r2[r3] - '0') * 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        r0 = r0 + ((r2[r3] - '0') * 10000000);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0024, code lost:
        r0 = r0 + ((r2[r3] - '0') * 1000000);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        r0 = r0 + ((r2[r3] - '0') * 100000);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        r0 = r0 + ((r2[r3] - '0') * 10000);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0046, code lost:
        r0 = r0 + ((r2[r3] - '0') * 1000);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0050, code lost:
        r0 = r0 + ((r2[r3] - '0') * 100);
        r3 = r3 + 1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m1858c(char[] r2, int r3, int r4) {
        /*
            int r0 = r3 + r4
            int r0 = r0 + -1
            char r0 = r2[r0]
            int r0 = r0 + -48
            switch(r4) {
                case 2: goto L_0x005a;
                case 3: goto L_0x0050;
                case 4: goto L_0x0046;
                case 5: goto L_0x003c;
                case 6: goto L_0x0030;
                case 7: goto L_0x0024;
                case 8: goto L_0x0018;
                case 9: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0061
        L_0x000c:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            r1 = 100000000(0x5f5e100, float:2.3122341E-35)
            int r3 = r3 * r1
            int r0 = r0 + r3
            r3 = r4
        L_0x0018:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            r1 = 10000000(0x989680, float:1.4012985E-38)
            int r3 = r3 * r1
            int r0 = r0 + r3
            r3 = r4
        L_0x0024:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            r1 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r3 * r1
            int r0 = r0 + r3
            r3 = r4
        L_0x0030:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            r1 = 100000(0x186a0, float:1.4013E-40)
            int r3 = r3 * r1
            int r0 = r0 + r3
            r3 = r4
        L_0x003c:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            int r3 = r3 * 10000
            int r0 = r0 + r3
            r3 = r4
        L_0x0046:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            int r3 = r3 * 1000
            int r0 = r0 + r3
            r3 = r4
        L_0x0050:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            int r3 = r3 * 100
            int r0 = r0 + r3
            r3 = r4
        L_0x005a:
            char r2 = r2[r3]
            int r2 = r2 + -48
            int r2 = r2 * 10
            int r0 = r0 + r2
        L_0x0061:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p082j.p083a.p084a.p087q.C1541f.m1858c(char[], int, int):int");
    }

    /* renamed from: d */
    public static long m1859d(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (((long) m1858c(cArr, i, i3)) * 1000000000) + ((long) m1858c(cArr, i + i3, 9));
    }
}
