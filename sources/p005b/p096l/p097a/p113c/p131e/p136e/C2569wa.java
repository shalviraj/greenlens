package p005b.p096l.p097a.p113c.p131e.p136e;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.wa */
public abstract class C2569wa implements C2464s1 {

    /* renamed from: a */
    public final C2521ua f4393a;

    /* renamed from: b */
    public final C2521ua f4394b;

    public C2569wa(byte[] bArr) {
        this.f4393a = mo12985c(bArr, 1);
        this.f4394b = mo12985c(bArr, 0);
    }

    /* renamed from: a */
    public final byte[] mo12385a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    /* renamed from: b */
    public final byte[] mo12386b(byte[] bArr, byte[] bArr2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.remaining() >= this.f4393a.mo12973c() + 16) {
            int position = wrap.position();
            byte[] bArr3 = new byte[16];
            wrap.position(wrap.limit() - 16);
            wrap.get(bArr3);
            wrap.position(position);
            wrap.limit(wrap.limit() - 16);
            byte[] bArr4 = new byte[this.f4393a.mo12973c()];
            wrap.get(bArr4);
            try {
                byte[] bArr5 = new byte[32];
                this.f4394b.mo13029e(bArr4, 0).get(bArr5);
                int length = bArr2.length;
                int i = length & 15;
                int i2 = i == 0 ? length : (length + 16) - i;
                int remaining = wrap.remaining();
                int i3 = remaining % 16;
                int i4 = (i3 == 0 ? remaining : (remaining + 16) - i3) + i2;
                ByteBuffer order = ByteBuffer.allocate(i4 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(i2);
                order.put(wrap);
                order.position(i4);
                order.putLong((long) length);
                order.putLong((long) remaining);
                if (C1960d.m2851t1(C1960d.m2859v1(bArr5, order.array()), bArr3)) {
                    wrap.position(position);
                    return this.f4393a.mo13028d(wrap);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    /* renamed from: c */
    public abstract C2521ua mo12985c(byte[] bArr, int i);
}
