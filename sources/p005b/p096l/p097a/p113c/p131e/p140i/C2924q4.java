package p005b.p096l.p097a.p113c.p131e.p140i;

import java.nio.charset.Charset;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.i.q4 */
public class C2924q4 extends C2937r4 {

    /* renamed from: i */
    public final byte[] f4949i;

    public C2924q4(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f4949i = bArr;
    }

    /* renamed from: A */
    public final String mo13593A(Charset charset) {
        return new String(this.f4949i, 0, mo13567l(), charset);
    }

    /* renamed from: B */
    public final boolean mo13594B() {
        return C3044z7.m5738a(this.f4949i, 0, mo13567l());
    }

    /* renamed from: E */
    public final int mo13595E(int i, int i2, int i3) {
        byte[] bArr = this.f4949i;
        Charset charset = C2990v5.f5088a;
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: I */
    public int mo13564I() {
        return 0;
    }

    /* renamed from: d */
    public byte mo13565d(int i) {
        return this.f4949i[i];
    }

    /* renamed from: e */
    public byte mo13566e(int i) {
        return this.f4949i[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2937r4) || mo13567l() != ((C2937r4) obj).mo13567l()) {
            return false;
        }
        if (mo13567l() == 0) {
            return true;
        }
        if (!(obj instanceof C2924q4)) {
            return obj.equals(this);
        }
        C2924q4 q4Var = (C2924q4) obj;
        int i = this.f4978g;
        int i2 = q4Var.f4978g;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int l = mo13567l();
        if (l > q4Var.mo13567l()) {
            int l2 = mo13567l();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(l);
            sb.append(l2);
            throw new IllegalArgumentException(sb.toString());
        } else if (l <= q4Var.mo13567l()) {
            byte[] bArr = this.f4949i;
            byte[] bArr2 = q4Var.f4949i;
            q4Var.mo13564I();
            int i3 = 0;
            int i4 = 0;
            while (i3 < l) {
                if (bArr[i3] != bArr2[i4]) {
                    return false;
                }
                i3++;
                i4++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(C0843a.m439O(59, "Ran off end of other: 0, ", l, ", ", q4Var.mo13567l()));
        }
    }

    /* renamed from: l */
    public int mo13567l() {
        return this.f4949i.length;
    }

    /* renamed from: q */
    public final C2937r4 mo13597q(int i, int i2) {
        int H = C2937r4.m5129H(0, i2, mo13567l());
        return H == 0 ? C2937r4.f4977h : new C2911p4(this.f4949i, H);
    }

    /* renamed from: w */
    public final void mo13598w(C2872m4 m4Var) {
        ((C2976u4) m4Var).mo13785x(this.f4949i, 0, mo13567l());
    }
}
