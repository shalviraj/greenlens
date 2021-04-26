package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.o5 */
public final class C2372o5 implements C2249j2 {

    /* renamed from: a */
    public final C2345n2<C2249j2> f4157a;

    /* renamed from: b */
    public final byte[] f4158b = {0};

    public /* synthetic */ C2372o5(C2345n2 n2Var) {
        this.f4157a = n2Var;
    }

    /* renamed from: a */
    public final void mo12733a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (C2297l2 next : this.f4157a.mo12823a(copyOf)) {
                try {
                    if (next.f4040d.equals(C2107da.LEGACY)) {
                        ((C2249j2) next.f4037a).mo12733a(copyOfRange, C1960d.m2736N1(bArr2, this.f4158b));
                        return;
                    }
                    ((C2249j2) next.f4037a).mo12733a(copyOfRange, bArr2);
                    return;
                } catch (GeneralSecurityException e) {
                    Logger logger = C2396p5.f4192a;
                    Level level = Level.INFO;
                    String valueOf = String.valueOf(e);
                    logger.logp(level, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", C0843a.m455p(new StringBuilder(valueOf.length() + 45), "tag prefix matches a key, but cannot verify: ", valueOf));
                }
            }
            for (C2297l2 l2Var : this.f4157a.mo12823a(C2512u1.f4338a)) {
                try {
                    ((C2249j2) l2Var.f4037a).mo12733a(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }
}
