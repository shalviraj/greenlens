package p005b.p096l.p097a.p113c.p131e.p136e;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.ab */
public final class C2033ab implements C2464s1 {

    /* renamed from: a */
    public final C2233ib f3582a;

    /* renamed from: b */
    public final C2249j2 f3583b;

    /* renamed from: c */
    public final int f3584c;

    public C2033ab(C2233ib ibVar, C2249j2 j2Var, int i) {
        this.f3582a = ibVar;
        this.f3583b = j2Var;
        this.f3584c = i;
    }

    /* renamed from: a */
    public final byte[] mo12385a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    /* renamed from: b */
    public final byte[] mo12386b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f3584c;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length - this.f3584c, length);
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
            this.f3583b.mo12733a(copyOfRange2, C1960d.m2736N1(bArr2, copyOfRange, copyOf));
            return this.f3582a.mo12713a(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
