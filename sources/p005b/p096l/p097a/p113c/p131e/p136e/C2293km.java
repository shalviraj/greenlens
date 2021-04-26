package p005b.p096l.p097a.p113c.p131e.p136e;

import java.nio.charset.Charset;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.e.km */
public class C2293km extends C2317lm {

    /* renamed from: i */
    public final byte[] f4030i;

    public C2293km(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f4030i = bArr;
    }

    /* renamed from: A */
    public final void mo12772A(C2194gm gmVar) {
        gmVar.mo12688a(this.f4030i, 0, mo12755l());
    }

    /* renamed from: B */
    public final String mo12773B(Charset charset) {
        return new String(this.f4030i, 0, mo12755l(), charset);
    }

    /* renamed from: E */
    public final boolean mo12774E() {
        return C2344n1.m3788a(this.f4030i, 0, mo12755l());
    }

    /* renamed from: F */
    public final int mo12775F(int i, int i2, int i3) {
        byte[] bArr = this.f4030i;
        Charset charset = C2196h.f3910a;
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: H */
    public final C2365nm mo12776H() {
        byte[] bArr = this.f4030i;
        int l = mo12755l();
        C2365nm nmVar = new C2365nm(bArr, l);
        try {
            nmVar.mo12856j(l);
            return nmVar;
        } catch (C2246j e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: R */
    public int mo12752R() {
        return 0;
    }

    /* renamed from: d */
    public byte mo12753d(int i) {
        return this.f4030i[i];
    }

    /* renamed from: e */
    public byte mo12754e(int i) {
        return this.f4030i[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2317lm) || mo12755l() != ((C2317lm) obj).mo12755l()) {
            return false;
        }
        if (mo12755l() == 0) {
            return true;
        }
        if (!(obj instanceof C2293km)) {
            return obj.equals(this);
        }
        C2293km kmVar = (C2293km) obj;
        int i = this.f4052g;
        int i2 = kmVar.f4052g;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int l = mo12755l();
        if (l > kmVar.mo12755l()) {
            int l2 = mo12755l();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(l);
            sb.append(l2);
            throw new IllegalArgumentException(sb.toString());
        } else if (l <= kmVar.mo12755l()) {
            byte[] bArr = this.f4030i;
            byte[] bArr2 = kmVar.f4030i;
            kmVar.mo12752R();
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
            throw new IllegalArgumentException(C0843a.m439O(59, "Ran off end of other: 0, ", l, ", ", kmVar.mo12755l()));
        }
    }

    /* renamed from: l */
    public int mo12755l() {
        return this.f4030i.length;
    }

    /* renamed from: q */
    public void mo12756q(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f4030i, 0, bArr, 0, i3);
    }

    /* renamed from: w */
    public final C2317lm mo12778w(int i, int i2) {
        int M = C2317lm.m3707M(0, i2, mo12755l());
        return M == 0 ? C2317lm.f4051h : new C2269jm(this.f4030i, M);
    }
}
