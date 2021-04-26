package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Mac;

/* renamed from: b.l.a.c.e.e.mb */
public final class C2330mb implements C2420q5 {

    /* renamed from: a */
    public final ThreadLocal<Mac> f4061a;

    /* renamed from: b */
    public final String f4062b;

    /* renamed from: c */
    public final Key f4063c;

    /* renamed from: d */
    public final int f4064d;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2330mb(java.lang.String r6, java.security.Key r7) {
        /*
            r5 = this;
            r5.<init>()
            b.l.a.c.e.e.lb r0 = new b.l.a.c.e.e.lb
            r0.<init>(r5)
            r5.f4061a = r0
            r5.f4062b = r6
            r5.f4063c = r7
            byte[] r7 = r7.getEncoded()
            int r7 = r7.length
            r1 = 16
            if (r7 < r1) goto L_0x008c
            int r7 = r6.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r7) {
                case -1823053428: goto L_0x004b;
                case 392315023: goto L_0x0041;
                case 392315118: goto L_0x0037;
                case 392316170: goto L_0x002d;
                case 392317873: goto L_0x0023;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x0055
        L_0x0023:
            java.lang.String r7 = "HMACSHA512"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0055
            r7 = r1
            goto L_0x0056
        L_0x002d:
            java.lang.String r7 = "HMACSHA384"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0055
            r7 = r2
            goto L_0x0056
        L_0x0037:
            java.lang.String r7 = "HMACSHA256"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0055
            r7 = r3
            goto L_0x0056
        L_0x0041:
            java.lang.String r7 = "HMACSHA224"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0055
            r7 = r4
            goto L_0x0056
        L_0x004b:
            java.lang.String r7 = "HMACSHA1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0055
            r7 = 0
            goto L_0x0056
        L_0x0055:
            r7 = -1
        L_0x0056:
            if (r7 == 0) goto L_0x0084
            if (r7 == r4) goto L_0x0081
            if (r7 == r3) goto L_0x007e
            if (r7 == r2) goto L_0x007b
            if (r7 == r1) goto L_0x0078
            java.security.NoSuchAlgorithmException r7 = new java.security.NoSuchAlgorithmException
            java.lang.String r0 = "unknown Hmac algorithm: "
            int r1 = r6.length()
            if (r1 == 0) goto L_0x006f
            java.lang.String r6 = r0.concat(r6)
            goto L_0x0074
        L_0x006f:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
        L_0x0074:
            r7.<init>(r6)
            throw r7
        L_0x0078:
            r6 = 64
            goto L_0x0086
        L_0x007b:
            r6 = 48
            goto L_0x0086
        L_0x007e:
            r6 = 32
            goto L_0x0086
        L_0x0081:
            r6 = 28
            goto L_0x0086
        L_0x0084:
            r6 = 20
        L_0x0086:
            r5.f4064d = r6
            r0.get()
            return
        L_0x008c:
            java.security.InvalidAlgorithmParameterException r6 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r7 = "key size too small, need at least 16 bytes"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2330mb.<init>(java.lang.String, java.security.Key):void");
    }

    /* renamed from: a */
    public final byte[] mo12741a(byte[] bArr, int i) {
        if (i <= this.f4064d) {
            this.f4061a.get().update(bArr);
            return Arrays.copyOf(this.f4061a.get().doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
