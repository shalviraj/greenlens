package p005b.p096l.p097a.p113c.p131e.p136e;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: b.l.a.c.e.e.x3 */
public final class C2586x3 implements C2464s1 {

    /* renamed from: c */
    public static final byte[] f4428c = new byte[0];

    /* renamed from: a */
    public final C2181g9 f4429a;

    /* renamed from: b */
    public final C2464s1 f4430b;

    public C2586x3(C2181g9 g9Var, C2464s1 s1Var) {
        this.f4429a = g9Var;
        this.f4430b = s1Var;
    }

    /* renamed from: a */
    public final byte[] mo12385a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    /* renamed from: b */
    public final byte[] mo12386b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((C2464s1) C2537v2.m4284f(this.f4429a.mo12674s(), this.f4430b.mo12386b(bArr3, f4428c), C2464s1.class)).mo12386b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
