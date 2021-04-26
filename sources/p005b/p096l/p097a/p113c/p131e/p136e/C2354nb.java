package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.nb */
public final class C2354nb implements C2249j2 {

    /* renamed from: a */
    public final C2420q5 f4091a;

    /* renamed from: b */
    public final int f4092b;

    public C2354nb(C2420q5 q5Var, int i) {
        this.f4091a = q5Var;
        this.f4092b = i;
        if (i >= 10) {
            q5Var.mo12741a(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public final void mo12733a(byte[] bArr, byte[] bArr2) {
        if (!C1960d.m2851t1(this.f4091a.mo12741a(bArr2, this.f4092b), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
