package p005b.p096l.p097a.p113c.p131e.p136e;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.lm */
public abstract class C2317lm implements Iterable<Byte>, Serializable {

    /* renamed from: h */
    public static final C2317lm f4051h = new C2293km(C2196h.f3911b);

    /* renamed from: g */
    public int f4052g = 0;

    static {
        int i = C2119dm.f3742a;
    }

    /* renamed from: I */
    public static C2317lm m3705I(byte[] bArr, int i, int i2) {
        m3707M(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C2293km(bArr2);
    }

    /* renamed from: J */
    public static C2317lm m3706J(byte[] bArr) {
        return m3705I(bArr, 0, bArr.length);
    }

    /* renamed from: M */
    public static int m3707M(int i, int i2, int i3) {
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
    public abstract void mo12772A(C2194gm gmVar);

    /* renamed from: B */
    public abstract String mo12773B(Charset charset);

    /* renamed from: E */
    public abstract boolean mo12774E();

    /* renamed from: F */
    public abstract int mo12775F(int i, int i2, int i3);

    /* renamed from: H */
    public abstract C2365nm mo12776H();

    /* renamed from: K */
    public final byte[] mo12797K() {
        int l = mo12755l();
        if (l == 0) {
            return C2196h.f3911b;
        }
        byte[] bArr = new byte[l];
        mo12756q(bArr, 0, 0, l);
        return bArr;
    }

    /* renamed from: d */
    public abstract byte mo12753d(int i);

    /* renamed from: e */
    public abstract byte mo12754e(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f4052g;
        if (i == 0) {
            int l = mo12755l();
            i = mo12775F(l, 0, l);
            if (i == 0) {
                i = 1;
            }
            this.f4052g = i;
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new C2219hm(this);
    }

    /* renamed from: l */
    public abstract int mo12755l();

    /* renamed from: q */
    public abstract void mo12756q(byte[] bArr, int i, int i2, int i3);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo12755l());
        objArr[2] = mo12755l() <= 50 ? C1960d.m2799g1(this) : String.valueOf(C1960d.m2799g1(mo12778w(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: w */
    public abstract C2317lm mo12778w(int i, int i2);
}
