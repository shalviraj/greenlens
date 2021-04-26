package p005b.p080i.p081a;

/* renamed from: b.i.a.c */
public class C1417c {

    /* renamed from: a */
    public int f1887a;

    /* renamed from: b */
    public long f1888b;

    public C1417c(long j, int i) {
        this.f1888b = j;
        this.f1887a = i;
    }

    /* renamed from: a */
    public static C1417c m1514a(String str, int i, int i2, boolean z) {
        if (i >= i2) {
            return null;
        }
        boolean z2 = false;
        if (z) {
            char charAt = str.charAt(i);
            if (charAt != '+') {
                if (charAt == '-') {
                    z2 = true;
                }
            }
            i++;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char charAt2 = str.charAt(i3);
            if (charAt2 < '0' || charAt2 > '9') {
                break;
            }
            long j2 = j * 10;
            long j3 = (long) (charAt2 - '0');
            if (z2) {
                j = j2 - j3;
                if (j < -2147483648L) {
                    return null;
                }
            } else {
                j = j2 + j3;
                if (j > 2147483647L) {
                    return null;
                }
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new C1417c(j, i3);
    }
}
