package p005b.p096l.p097a.p113c.p131e.p140i;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.i.r4 */
public abstract class C2937r4 implements Iterable<Byte>, Serializable {

    /* renamed from: h */
    public static final C2937r4 f4977h = new C2924q4(C2990v5.f5089b);

    /* renamed from: g */
    public int f4978g = 0;

    static {
        int i = C2833j4.f4851a;
    }

    /* renamed from: F */
    public static C2937r4 m5128F(byte[] bArr, int i, int i2) {
        m5129H(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C2924q4(bArr2);
    }

    /* renamed from: H */
    public static int m5129H(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException(C0843a.m439O(66, "Beginning index larger than ending index: ", i, ", ", i2));
        } else {
            throw new IndexOutOfBoundsException(C0843a.m439O(37, "End index: ", i2, " >= ", i3));
        }
    }

    /* renamed from: A */
    public abstract String mo13593A(Charset charset);

    /* renamed from: B */
    public abstract boolean mo13594B();

    /* renamed from: E */
    public abstract int mo13595E(int i, int i2, int i3);

    /* renamed from: d */
    public abstract byte mo13565d(int i);

    /* renamed from: e */
    public abstract byte mo13566e(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f4978g;
        if (i == 0) {
            int l = mo13567l();
            i = mo13595E(l, 0, l);
            if (i == 0) {
                i = 1;
            }
            this.f4978g = i;
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new C2885n4(this);
    }

    /* renamed from: l */
    public abstract int mo13567l();

    /* renamed from: q */
    public abstract C2937r4 mo13597q(int i, int i2);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo13567l());
        objArr[2] = mo13567l() <= 50 ? C1960d.m2803h1(this) : String.valueOf(C1960d.m2803h1(mo13597q(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: w */
    public abstract void mo13598w(C2872m4 m4Var);
}
