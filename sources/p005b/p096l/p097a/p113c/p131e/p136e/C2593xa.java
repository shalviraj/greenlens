package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.interfaces.ECPrivateKey;

/* renamed from: b.l.a.c.e.e.xa */
public final class C2593xa implements C2560w1 {

    /* renamed from: g */
    public static final byte[] f4433g = new byte[0];

    /* renamed from: a */
    public final ECPrivateKey f4434a;

    /* renamed from: b */
    public final C2641za f4435b;

    /* renamed from: c */
    public final String f4436c;

    /* renamed from: d */
    public final byte[] f4437d;

    /* renamed from: e */
    public final C2611y4 f4438e;

    /* renamed from: f */
    public final int f4439f;

    public C2593xa(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i, C2611y4 y4Var) {
        this.f4434a = eCPrivateKey;
        this.f4435b = new C2641za(eCPrivateKey);
        this.f4437d = bArr;
        this.f4436c = str;
        this.f4439f = i;
        this.f4438e = y4Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0399 A[SYNTHETIC, Splitter:B:118:0x0399] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo13007a(byte[] r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.security.interfaces.ECPrivateKey r2 = r1.f4434a
            java.security.spec.ECParameterSpec r2 = r2.getParams()
            java.security.spec.EllipticCurve r2 = r2.getCurve()
            int r3 = r1.f4439f
            java.math.BigInteger r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2718H1(r2)
            java.math.BigInteger r4 = java.math.BigInteger.ONE
            java.math.BigInteger r2 = r2.subtract(r4)
            int r2 = r2.bitLength()
            int r2 = r2 + 7
            int r2 = r2 / 8
            r5 = -1
            int r3 = r3 + r5
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x002d
            if (r3 == r6) goto L_0x002b
            goto L_0x002e
        L_0x002b:
            int r2 = r2 + r2
            goto L_0x002f
        L_0x002d:
            int r2 = r2 + r2
        L_0x002e:
            int r2 = r2 + r7
        L_0x002f:
            int r3 = r0.length
            if (r3 < r2) goto L_0x03bc
            r8 = 0
            byte[] r9 = java.util.Arrays.copyOfRange(r0, r8, r2)
            b.l.a.c.e.e.za r10 = r1.f4435b
            java.lang.String r11 = r1.f4436c
            byte[] r12 = r1.f4437d
            b.l.a.c.e.e.y4 r13 = r1.f4438e
            int r13 = r13.f4477b
            int r14 = r1.f4439f
            java.security.interfaces.ECPrivateKey r15 = r10.f4524a
            java.security.spec.ECParameterSpec r15 = r15.getParams()
            java.security.spec.EllipticCurve r8 = r15.getCurve()
            java.math.BigInteger r7 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2718H1(r8)
            java.math.BigInteger r4 = r7.subtract(r4)
            int r4 = r4.bitLength()
            int r4 = r4 + 7
            int r4 = r4 / 8
            int r14 = r14 + r5
            java.lang.String r7 = "invalid point size"
            if (r14 == 0) goto L_0x00d6
            if (r14 == r6) goto L_0x00b1
            java.math.BigInteger r7 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2718H1(r8)
            int r14 = r9.length
            r5 = 1
            int r4 = r4 + r5
            if (r14 != r4) goto L_0x00a9
            r4 = 0
            byte r5 = r9[r4]
            if (r5 != r6) goto L_0x0074
            r4 = 0
            goto L_0x0078
        L_0x0074:
            r4 = 3
            if (r5 != r4) goto L_0x00a1
            r4 = 1
        L_0x0078:
            java.math.BigInteger r5 = new java.math.BigInteger
            r6 = 1
            byte[] r14 = java.util.Arrays.copyOfRange(r9, r6, r14)
            r5.<init>(r6, r14)
            int r6 = r5.signum()
            r14 = -1
            if (r6 == r14) goto L_0x0099
            int r6 = r5.compareTo(r7)
            if (r6 >= 0) goto L_0x0099
            java.math.BigInteger r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2776a2(r5, r4, r8)
            java.security.spec.ECPoint r6 = new java.security.spec.ECPoint
            r6.<init>(r5, r4)
            goto L_0x00ff
        L_0x0099:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "x is out of range"
            r0.<init>(r2)
            throw r0
        L_0x00a1:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "invalid format"
            r0.<init>(r2)
            throw r0
        L_0x00a9:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "compressed point has wrong length"
            r0.<init>(r2)
            throw r0
        L_0x00b1:
            int r5 = r9.length
            int r6 = r4 + r4
            if (r5 != r6) goto L_0x00d0
            java.math.BigInteger r6 = new java.math.BigInteger
            r7 = 0
            byte[] r14 = java.util.Arrays.copyOfRange(r9, r7, r4)
            r7 = 1
            r6.<init>(r7, r14)
            java.math.BigInteger r14 = new java.math.BigInteger
            byte[] r4 = java.util.Arrays.copyOfRange(r9, r4, r5)
            r14.<init>(r7, r4)
            java.security.spec.ECPoint r4 = new java.security.spec.ECPoint
            r4.<init>(r6, r14)
            goto L_0x00fb
        L_0x00d0:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r7)
            throw r0
        L_0x00d6:
            r5 = 1
            int r6 = r9.length
            int r14 = r4 + r4
            int r14 = r14 + r5
            if (r6 != r14) goto L_0x03b6
            r14 = 0
            byte r7 = r9[r14]
            r14 = 4
            if (r7 != r14) goto L_0x03ae
            int r4 = r4 + r5
            java.math.BigInteger r7 = new java.math.BigInteger
            byte[] r14 = java.util.Arrays.copyOfRange(r9, r5, r4)
            r7.<init>(r5, r14)
            java.math.BigInteger r14 = new java.math.BigInteger
            byte[] r4 = java.util.Arrays.copyOfRange(r9, r4, r6)
            r14.<init>(r5, r4)
            java.security.spec.ECPoint r4 = new java.security.spec.ECPoint
            r4.<init>(r7, r14)
        L_0x00fb:
            r6 = r4
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2839q1(r6, r8)
        L_0x00ff:
            java.security.spec.ECPublicKeySpec r4 = new java.security.spec.ECPublicKeySpec
            r4.<init>(r6, r15)
            b.l.a.c.e.e.bb<b.l.a.c.e.e.eb, java.security.KeyFactory> r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2058bb.f3641i
            java.lang.String r6 = "EC"
            java.lang.Object r7 = r5.mo12428a(r6)
            java.security.KeyFactory r7 = (java.security.KeyFactory) r7
            java.security.PublicKey r4 = r7.generatePublic(r4)
            java.security.interfaces.ECPublicKey r4 = (java.security.interfaces.ECPublicKey) r4
            java.security.interfaces.ECPrivateKey r7 = r10.f4524a
            java.security.spec.ECParameterSpec r8 = r4.getParams()     // Catch:{ IllegalArgumentException -> 0x03a3, NullPointerException -> 0x03a1 }
            java.security.spec.ECParameterSpec r10 = r7.getParams()     // Catch:{ IllegalArgumentException -> 0x03a3, NullPointerException -> 0x03a1 }
            java.security.spec.EllipticCurve r14 = r8.getCurve()     // Catch:{ IllegalArgumentException -> 0x03a3, NullPointerException -> 0x03a1 }
            java.security.spec.EllipticCurve r15 = r10.getCurve()     // Catch:{ IllegalArgumentException -> 0x03a3, NullPointerException -> 0x03a1 }
            boolean r14 = r14.equals(r15)     // Catch:{ IllegalArgumentException -> 0x03a3, NullPointerException -> 0x03a1 }
            if (r14 == 0) goto L_0x0399
            java.security.spec.ECPoint r14 = r8.getGenerator()     // Catch:{ IllegalArgumentException -> 0x03a3, NullPointerException -> 0x03a1 }
            java.security.spec.ECPoint r15 = r10.getGenerator()     // Catch:{ IllegalArgumentException -> 0x03a3, NullPointerException -> 0x03a1 }
            boolean r14 = r14.equals(r15)     // Catch:{ IllegalArgumentException -> 0x03a3, NullPointerException -> 0x03a1 }
            if (r14 == 0) goto L_0x0399
            java.math.BigInteger r14 = r8.getOrder()     // Catch:{ IllegalArgumentException -> 0x03a3, NullPointerException -> 0x03a1 }
            java.math.BigInteger r15 = r10.getOrder()     // Catch:{ IllegalArgumentException -> 0x03a3, NullPointerException -> 0x03a1 }
            boolean r14 = r14.equals(r15)     // Catch:{ IllegalArgumentException -> 0x03a3, NullPointerException -> 0x03a1 }
            if (r14 == 0) goto L_0x0399
            int r8 = r8.getCofactor()     // Catch:{ IllegalArgumentException -> 0x03a3, NullPointerException -> 0x03a1 }
            int r10 = r10.getCofactor()     // Catch:{ IllegalArgumentException -> 0x03a3, NullPointerException -> 0x03a1 }
            if (r8 != r10) goto L_0x0399
            java.security.spec.ECPoint r4 = r4.getW()
            java.security.spec.ECParameterSpec r8 = r7.getParams()
            java.security.spec.EllipticCurve r8 = r8.getCurve()
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2839q1(r4, r8)
            java.security.spec.ECParameterSpec r8 = r7.getParams()
            java.security.spec.ECPublicKeySpec r10 = new java.security.spec.ECPublicKeySpec
            r10.<init>(r4, r8)
            java.lang.Object r4 = r5.mo12428a(r6)
            java.security.KeyFactory r4 = (java.security.KeyFactory) r4
            java.security.PublicKey r4 = r4.generatePublic(r10)
            b.l.a.c.e.e.bb<b.l.a.c.e.e.db, javax.crypto.KeyAgreement> r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2058bb.f3639g
            java.lang.String r6 = "ECDH"
            java.lang.Object r5 = r5.mo12428a(r6)
            javax.crypto.KeyAgreement r5 = (javax.crypto.KeyAgreement) r5
            r5.init(r7)
            r6 = 1
            r5.doPhase(r4, r6)     // Catch:{ IllegalStateException -> 0x038e }
            byte[] r4 = r5.generateSecret()     // Catch:{ IllegalStateException -> 0x038e }
            java.security.spec.ECParameterSpec r5 = r7.getParams()     // Catch:{ IllegalStateException -> 0x038e }
            java.security.spec.EllipticCurve r5 = r5.getCurve()     // Catch:{ IllegalStateException -> 0x038e }
            java.math.BigInteger r6 = new java.math.BigInteger     // Catch:{ IllegalStateException -> 0x038e }
            r7 = 1
            r6.<init>(r7, r4)     // Catch:{ IllegalStateException -> 0x038e }
            int r8 = r6.signum()     // Catch:{ IllegalStateException -> 0x038e }
            r10 = -1
            if (r8 == r10) goto L_0x0386
            java.math.BigInteger r8 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2718H1(r5)     // Catch:{ IllegalStateException -> 0x038e }
            int r8 = r6.compareTo(r8)     // Catch:{ IllegalStateException -> 0x038e }
            if (r8 >= 0) goto L_0x0386
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2776a2(r6, r7, r5)     // Catch:{ IllegalStateException -> 0x038e }
            r5 = 2
            byte[][] r5 = new byte[r5][]
            r6 = 0
            r5[r6] = r9
            r5[r7] = r4
            byte[] r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2736N1(r5)
            b.l.a.c.e.e.bb<b.l.a.c.e.e.gb, javax.crypto.Mac> r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2058bb.f3638f
            java.lang.Object r5 = r5.mo12428a(r11)
            javax.crypto.Mac r5 = (javax.crypto.Mac) r5
            int r6 = r5.getMacLength()
            int r6 = r6 * 255
            if (r13 > r6) goto L_0x037e
            if (r12 == 0) goto L_0x01d3
            int r6 = r12.length
            if (r6 != 0) goto L_0x01cd
            goto L_0x01d3
        L_0x01cd:
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec
            r6.<init>(r12, r11)
            goto L_0x01de
        L_0x01d3:
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec
            int r8 = r5.getMacLength()
            byte[] r8 = new byte[r8]
            r6.<init>(r8, r11)
        L_0x01de:
            r5.init(r6)
            byte[] r4 = r5.doFinal(r4)
            byte[] r6 = new byte[r13]
            javax.crypto.spec.SecretKeySpec r8 = new javax.crypto.spec.SecretKeySpec
            r8.<init>(r4, r11)
            r5.init(r8)
            r4 = 0
            byte[] r8 = new byte[r4]
            r9 = r8
            r8 = r7
            r7 = r4
        L_0x01f5:
            r5.update(r9)
            r9 = 0
            r5.update(r9)
            byte r9 = (byte) r8
            r5.update(r9)
            byte[] r9 = r5.doFinal()
            int r10 = r9.length
            int r11 = r7 + r10
            if (r11 >= r13) goto L_0x0210
            java.lang.System.arraycopy(r9, r4, r6, r7, r10)
            int r8 = r8 + 1
            r7 = r11
            goto L_0x01f5
        L_0x0210:
            int r5 = r13 - r7
            java.lang.System.arraycopy(r9, r4, r6, r7, r5)
            b.l.a.c.e.e.y4 r4 = r1.f4438e
            java.util.Objects.requireNonNull(r4)
            java.lang.Class<b.l.a.c.e.e.s1> r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2464s1.class
            int r7 = r4.f4477b
            if (r13 != r7) goto L_0x0376
            java.lang.String r7 = r4.f4476a
            java.lang.String r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2585x2.f4426b
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x025f
            b.l.a.c.e.e.x6 r7 = p005b.p096l.p097a.p113c.p131e.p136e.C2613y6.m4417v()
            b.l.a.c.e.e.y6 r8 = r4.f4478c
            r7.mo12693d(r8)
            int r8 = r4.f4477b
            r9 = 0
            b.l.a.c.e.e.lm r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2317lm.m3705I(r6, r9, r8)
            boolean r8 = r7.f3909i
            if (r8 == 0) goto L_0x0243
            r7.mo12689a()
            r7.f3909i = r9
        L_0x0243:
            MessageType r8 = r7.f3908h
            b.l.a.c.e.e.y6 r8 = (p005b.p096l.p097a.p113c.p131e.p136e.C2613y6) r8
            r8.zze = r6
            b.l.a.c.e.e.c r6 = r7.mo12691c()
            b.l.a.c.e.e.y6 r6 = (p005b.p096l.p097a.p113c.p131e.p136e.C2613y6) r6
            b.l.a.c.e.e.z4 r7 = new b.l.a.c.e.e.z4
            java.lang.String r4 = r4.f4476a
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2537v2.m4283e(r4, r6, r5)
            b.l.a.c.e.e.s1 r4 = (p005b.p096l.p097a.p113c.p131e.p136e.C2464s1) r4
            r7.<init>((p005b.p096l.p097a.p113c.p131e.p136e.C2464s1) r4)
            goto L_0x0358
        L_0x025f:
            java.lang.String r7 = r4.f4476a
            java.lang.String r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2585x2.f4425a
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0319
            int r7 = r4.f4480e
            r8 = 0
            byte[] r7 = java.util.Arrays.copyOfRange(r6, r8, r7)
            int r8 = r4.f4480e
            int r9 = r4.f4477b
            byte[] r6 = java.util.Arrays.copyOfRange(r6, r8, r9)
            b.l.a.c.e.e.f6 r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2178g6.m3403w()
            b.l.a.c.e.e.a6 r9 = r4.f4479d
            b.l.a.c.e.e.g6 r9 = r9.mo12378t()
            r8.mo12693d(r9)
            b.l.a.c.e.e.lm r7 = p005b.p096l.p097a.p113c.p131e.p136e.C2317lm.m3706J(r7)
            boolean r9 = r8.f3909i
            if (r9 == 0) goto L_0x0293
            r8.mo12689a()
            r9 = 0
            r8.f3909i = r9
        L_0x0293:
            MessageType r9 = r8.f3908h
            b.l.a.c.e.e.g6 r9 = (p005b.p096l.p097a.p113c.p131e.p136e.C2178g6) r9
            r9.zzf = r7
            b.l.a.c.e.e.c r7 = r8.mo12691c()
            b.l.a.c.e.e.g6 r7 = (p005b.p096l.p097a.p113c.p131e.p136e.C2178g6) r7
            b.l.a.c.e.e.q8 r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2447r8.m4077w()
            b.l.a.c.e.e.a6 r9 = r4.f4479d
            b.l.a.c.e.e.r8 r9 = r9.mo12379u()
            r8.mo12693d(r9)
            b.l.a.c.e.e.lm r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2317lm.m3706J(r6)
            boolean r9 = r8.f3909i
            if (r9 == 0) goto L_0x02bb
            r8.mo12689a()
            r9 = 0
            r8.f3909i = r9
        L_0x02bb:
            MessageType r9 = r8.f3908h
            b.l.a.c.e.e.r8 r9 = (p005b.p096l.p097a.p113c.p131e.p136e.C2447r8) r9
            r9.zzf = r6
            b.l.a.c.e.e.c r6 = r8.mo12691c()
            b.l.a.c.e.e.r8 r6 = (p005b.p096l.p097a.p113c.p131e.p136e.C2447r8) r6
            b.l.a.c.e.e.z5 r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2028a6.m2982w()
            b.l.a.c.e.e.a6 r9 = r4.f4479d
            int r9 = r9.mo12377s()
            boolean r10 = r8.f3909i
            if (r10 == 0) goto L_0x02dd
            r8.mo12689a()
            r10 = 0
            r8.f3909i = r10
            goto L_0x02de
        L_0x02dd:
            r10 = 0
        L_0x02de:
            MessageType r11 = r8.f3908h
            b.l.a.c.e.e.a6 r11 = (p005b.p096l.p097a.p113c.p131e.p136e.C2028a6) r11
            r11.zzb = r9
            boolean r9 = r8.f3909i
            if (r9 == 0) goto L_0x02ee
            r8.mo12689a()
            r8.f3909i = r10
        L_0x02ee:
            MessageType r9 = r8.f3908h
            b.l.a.c.e.e.a6 r9 = (p005b.p096l.p097a.p113c.p131e.p136e.C2028a6) r9
            p005b.p096l.p097a.p113c.p131e.p136e.C2028a6.m2985z(r9, r7)
            boolean r7 = r8.f3909i
            if (r7 == 0) goto L_0x02fe
            r8.mo12689a()
            r8.f3909i = r10
        L_0x02fe:
            MessageType r7 = r8.f3908h
            b.l.a.c.e.e.a6 r7 = (p005b.p096l.p097a.p113c.p131e.p136e.C2028a6) r7
            p005b.p096l.p097a.p113c.p131e.p136e.C2028a6.m2980A(r7, r6)
            b.l.a.c.e.e.c r6 = r8.mo12691c()
            b.l.a.c.e.e.a6 r6 = (p005b.p096l.p097a.p113c.p131e.p136e.C2028a6) r6
            b.l.a.c.e.e.z4 r7 = new b.l.a.c.e.e.z4
            java.lang.String r4 = r4.f4476a
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2537v2.m4283e(r4, r6, r5)
            b.l.a.c.e.e.s1 r4 = (p005b.p096l.p097a.p113c.p131e.p136e.C2464s1) r4
            r7.<init>((p005b.p096l.p097a.p113c.p131e.p136e.C2464s1) r4)
            goto L_0x0358
        L_0x0319:
            java.lang.String r5 = r4.f4476a
            java.lang.String r7 = p005b.p096l.p097a.p113c.p131e.p136e.C2251j4.f3955a
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x036e
            b.l.a.c.e.e.i7 r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2254j7.m3567v()
            b.l.a.c.e.e.j7 r7 = r4.f4481f
            r5.mo12693d(r7)
            int r7 = r4.f4477b
            r8 = 0
            b.l.a.c.e.e.lm r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2317lm.m3705I(r6, r8, r7)
            boolean r7 = r5.f3909i
            if (r7 == 0) goto L_0x033c
            r5.mo12689a()
            r5.f3909i = r8
        L_0x033c:
            MessageType r7 = r5.f3908h
            b.l.a.c.e.e.j7 r7 = (p005b.p096l.p097a.p113c.p131e.p136e.C2254j7) r7
            r7.zze = r6
            b.l.a.c.e.e.c r5 = r5.mo12691c()
            b.l.a.c.e.e.j7 r5 = (p005b.p096l.p097a.p113c.p131e.p136e.C2254j7) r5
            b.l.a.c.e.e.z4 r7 = new b.l.a.c.e.e.z4
            java.lang.String r4 = r4.f4476a
            java.lang.Class<b.l.a.c.e.e.v1> r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2536v1.class
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2537v2.m4283e(r4, r5, r6)
            b.l.a.c.e.e.v1 r4 = (p005b.p096l.p097a.p113c.p131e.p136e.C2536v1) r4
            r7.<init>((p005b.p096l.p097a.p113c.p131e.p136e.C2536v1) r4)
        L_0x0358:
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r2, r3)
            byte[] r2 = f4433g
            b.l.a.c.e.e.s1 r3 = r7.f4522a
            if (r3 == 0) goto L_0x0367
            byte[] r0 = r3.mo12386b(r0, r2)
            goto L_0x036d
        L_0x0367:
            b.l.a.c.e.e.v1 r3 = r7.f4523b
            byte[] r0 = r3.mo12785a(r0, r2)
        L_0x036d:
            return r0
        L_0x036e:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "unknown DEM key type"
            r0.<init>(r2)
            throw r0
        L_0x0376:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Symmetric key has incorrect length"
            r0.<init>(r2)
            throw r0
        L_0x037e:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "size too large"
            r0.<init>(r2)
            throw r0
        L_0x0386:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ IllegalStateException -> 0x038e }
            java.lang.String r2 = "shared secret is out of range"
            r0.<init>(r2)     // Catch:{ IllegalStateException -> 0x038e }
            throw r0     // Catch:{ IllegalStateException -> 0x038e }
        L_0x038e:
            r0 = move-exception
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0399:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ IllegalArgumentException -> 0x03a3, NullPointerException -> 0x03a1 }
            java.lang.String r2 = "invalid public key spec"
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x03a3, NullPointerException -> 0x03a1 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x03a3, NullPointerException -> 0x03a1 }
        L_0x03a1:
            r0 = move-exception
            goto L_0x03a4
        L_0x03a3:
            r0 = move-exception
        L_0x03a4:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x03ae:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "invalid point format"
            r0.<init>(r2)
            throw r0
        L_0x03b6:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r7)
            throw r0
        L_0x03bc:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "ciphertext too short"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2593xa.mo13007a(byte[], byte[]):byte[]");
    }
}
