package p005b.p096l.p097a.p113c.p131e.p136e;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: b.l.a.c.e.e.ra */
public final class C2449ra implements C2464s1 {

    /* renamed from: b */
    public static final ThreadLocal<Cipher> f4259b = new C2425qa();

    /* renamed from: a */
    public final SecretKey f4260a;

    public C2449ra(byte[] bArr) {
        C2426qb.m4029a(bArr.length);
        this.f4260a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: a */
    public final byte[] mo12385a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo12386b(byte[] r8, byte[] r9) {
        /*
            r7 = this;
            int r0 = r8.length
            r1 = 28
            if (r0 < r1) goto L_0x0059
            boolean r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2843r1()
            r2 = 0
            r3 = 12
            if (r1 == 0) goto L_0x002b
            java.lang.String r1 = "android.os.Build$VERSION"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0020 }
            java.lang.String r4 = "SDK_INT"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0020 }
            r4 = 0
            int r1 = r1.getInt(r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0020 }
            goto L_0x0021
        L_0x0020:
            r1 = -1
        L_0x0021:
            r4 = 19
            if (r1 > r4) goto L_0x002b
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec
            r1.<init>(r8, r2, r3)
            goto L_0x0032
        L_0x002b:
            javax.crypto.spec.GCMParameterSpec r1 = new javax.crypto.spec.GCMParameterSpec
            r4 = 128(0x80, float:1.794E-43)
            r1.<init>(r4, r8, r2, r3)
        L_0x0032:
            java.lang.ThreadLocal<javax.crypto.Cipher> r2 = f4259b
            java.lang.Object r4 = r2.get()
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
            r5 = 2
            javax.crypto.SecretKey r6 = r7.f4260a
            r4.init(r5, r6, r1)
            int r1 = r9.length
            if (r1 == 0) goto L_0x004c
            java.lang.Object r1 = r2.get()
            javax.crypto.Cipher r1 = (javax.crypto.Cipher) r1
            r1.updateAAD(r9)
        L_0x004c:
            java.lang.Object r9 = r2.get()
            javax.crypto.Cipher r9 = (javax.crypto.Cipher) r9
            int r0 = r0 + -12
            byte[] r8 = r9.doFinal(r8, r3, r0)
            return r8
        L_0x0059:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "ciphertext too short"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2449ra.mo12386b(byte[], byte[]):byte[]");
    }
}
