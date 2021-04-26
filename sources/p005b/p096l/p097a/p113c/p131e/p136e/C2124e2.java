package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.e.e2 */
public final class C2124e2 {

    /* renamed from: a */
    public final C2352n9 f3816a;

    public C2124e2(C2352n9 n9Var) {
        this.f3816a = n9Var;
    }

    /* renamed from: a */
    public static final C2124e2 m3282a(C2352n9 n9Var) {
        if (n9Var.mo12827u() > 0) {
            return new C2124e2(n9Var);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* renamed from: f */
    public static final C2124e2 m3283f(C2152f5 f5Var, C2464s1 s1Var) {
        C2351n8 t = C2351n8.m3801t(f5Var.mo12638a(), C2605xm.m4408a());
        if (t.mo12824s().mo12755l() != 0) {
            try {
                C2352n9 w = C2352n9.m3809w(s1Var.mo12386b(t.mo12824s().mo12797K(), new byte[0]), C2605xm.m4408a());
                if (w.mo12827u() > 0) {
                    return new C2124e2(w);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (C2246j unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } else {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* renamed from: b */
    public final void mo12578b(C2174g2 g2Var, C2464s1 s1Var) {
        C2352n9 n9Var = this.f3816a;
        byte[] a = s1Var.mo12385a(n9Var.mo12438a(), new byte[0]);
        try {
            if (C2352n9.m3809w(s1Var.mo12386b(a, new byte[0]), C2605xm.m4408a()).equals(n9Var)) {
                C2327m8 u = C2351n8.m3802u();
                C2317lm J = C2317lm.m3706J(a);
                if (u.f3909i) {
                    u.mo12689a();
                    u.f3909i = false;
                }
                ((C2351n8) u.f3908h).zzb = J;
                C2472s9 a2 = C2561w2.m4340a(n9Var);
                if (u.f3909i) {
                    u.mo12689a();
                    u.f3909i = false;
                }
                C2351n8.m3805x((C2351n8) u.f3908h, a2);
                g2Var.mo12664a((C2351n8) u.mo12691c());
                return;
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (C2246j unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12579c(p005b.p096l.p097a.p113c.p131e.p136e.C2174g2 r5) {
        /*
            r4 = this;
            b.l.a.c.e.e.n9 r0 = r4.f3816a
            java.util.List r0 = r0.mo12826t()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r0.next()
            b.l.a.c.e.e.m9 r1 = (p005b.p096l.p097a.p113c.p131e.p136e.C2328m9) r1
            b.l.a.c.e.e.c9 r2 = r1.mo12812t()
            b.l.a.c.e.e.b9 r2 = r2.mo12459u()
            b.l.a.c.e.e.b9 r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2056b9.UNKNOWN_KEYMATERIAL
            if (r2 == r3) goto L_0x003b
            b.l.a.c.e.e.c9 r2 = r1.mo12812t()
            b.l.a.c.e.e.b9 r2 = r2.mo12459u()
            b.l.a.c.e.e.b9 r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2056b9.SYMMETRIC
            if (r2 == r3) goto L_0x003b
            b.l.a.c.e.e.c9 r2 = r1.mo12812t()
            b.l.a.c.e.e.b9 r2 = r2.mo12459u()
            b.l.a.c.e.e.b9 r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2056b9.ASYMMETRIC_PRIVATE
            if (r2 == r3) goto L_0x003b
            goto L_0x000a
        L_0x003b:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            b.l.a.c.e.e.c9 r3 = r1.mo12812t()
            b.l.a.c.e.e.b9 r3 = r3.mo12459u()
            java.lang.String r3 = r3.name()
            r0[r2] = r3
            r2 = 1
            b.l.a.c.e.e.c9 r1 = r1.mo12812t()
            java.lang.String r1 = r1.mo12457s()
            r0[r2] = r1
            java.lang.String r1 = "keyset contains key material of type %s for type url %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r5.<init>(r0)
            throw r5
        L_0x0064:
            b.l.a.c.e.e.n9 r0 = r4.f3816a
            b.l.a.c.e.e.t1 r5 = (p005b.p096l.p097a.p113c.p131e.p136e.C2488t1) r5
            r5.mo12665b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2124e2.mo12579c(b.l.a.c.e.e.g2):void");
    }

    /* renamed from: d */
    public final C2124e2 mo12580d() {
        if (this.f3816a != null) {
            C2280k9 x = C2352n9.m3810x();
            for (C2328m9 next : this.f3816a.mo12826t()) {
                C2081c9 t = next.mo12812t();
                if (t.mo12459u() == C2056b9.ASYMMETRIC_PRIVATE) {
                    String s = t.mo12457s();
                    C2317lm t2 = t.mo12458t();
                    C2608y1 i = C2537v2.m4287i(s, (Class) null);
                    if (i instanceof C2393p2) {
                        C2393p2 p2Var = (C2393p2) i;
                        Objects.requireNonNull(p2Var);
                        try {
                            C2105d8 v = C2105d8.m3200v(t2, C2605xm.m4408a());
                            C2395p4.m3978h(v);
                            C2180g8 t3 = v.mo12516t();
                            p2Var.f4191c.mo12369d(t3);
                            C2639z8 v2 = C2081c9.m3127v();
                            if (v2.f3909i) {
                                v2.mo12689a();
                                v2.f3909i = false;
                            }
                            ((C2081c9) v2.f3908h).zzb = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
                            C2317lm n = t3.mo12441n();
                            if (v2.f3909i) {
                                v2.mo12689a();
                                v2.f3909i = false;
                            }
                            ((C2081c9) v2.f3908h).zze = n;
                            C2056b9 b9Var = C2056b9.ASYMMETRIC_PUBLIC;
                            if (v2.f3909i) {
                                v2.mo12689a();
                                v2.f3909i = false;
                            }
                            C2081c9.m3126A((C2081c9) v2.f3908h, b9Var);
                            C2081c9 c9Var = (C2081c9) v2.mo12691c();
                            C2537v2.m4288j(c9Var.mo12457s(), c9Var.mo12458t(), (Class) null);
                            C2304l9 x2 = C2328m9.m3758x();
                            x2.mo12693d(next);
                            if (x2.f3909i) {
                                x2.mo12689a();
                                x2.f3909i = false;
                            }
                            C2328m9.m3760z((C2328m9) x2.f3908h, c9Var);
                            C2328m9 m9Var = (C2328m9) x2.mo12691c();
                            if (x.f3909i) {
                                x.mo12689a();
                                x.f3909i = false;
                            }
                            C2352n9.m3808A((C2352n9) x.f3908h, m9Var);
                        } catch (C2246j e) {
                            throw new GeneralSecurityException("expected serialized proto of type ", e);
                        }
                    } else {
                        throw new GeneralSecurityException(C0843a.m456q(new StringBuilder(String.valueOf(s).length() + 48), "manager for key type ", s, " is not a PrivateKeyManager"));
                    }
                } else {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
            }
            int s2 = this.f3816a.mo12825s();
            if (x.f3909i) {
                x.mo12689a();
                x.f3909i = false;
            }
            ((C2352n9) x.f3908h).zzb = s2;
            return new C2124e2((C2352n9) x.mo12691c());
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x00f9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b1  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <P> P mo12581e(java.lang.Class<P> r15) {
        /*
            r14 = this;
            b.l.a.c.e.e.d9 r0 = p005b.p096l.p097a.p113c.p131e.p136e.C2106d9.ENABLED
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, b.l.a.c.e.e.o2<?, ?>> r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2537v2.f4364e
            java.lang.Object r1 = r1.get(r15)
            b.l.a.c.e.e.o2 r1 = (p005b.p096l.p097a.p113c.p131e.p136e.C2369o2) r1
            r2 = 0
            if (r1 != 0) goto L_0x000f
            r1 = r2
            goto L_0x0013
        L_0x000f:
            java.lang.Class r1 = r1.mo12365c()
        L_0x0013:
            java.lang.String r3 = "No wrapper found for "
            if (r1 != 0) goto L_0x0031
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r15 = r15.getName()
            int r1 = r15.length()
            if (r1 == 0) goto L_0x0028
            java.lang.String r15 = r3.concat(r15)
            goto L_0x002d
        L_0x0028:
            java.lang.String r15 = new java.lang.String
            r15.<init>(r3)
        L_0x002d:
            r0.<init>(r15)
            throw r0
        L_0x0031:
            b.l.a.c.e.e.n9 r4 = r14.f3816a
            int r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2561w2.f4392a
            int r5 = r4.mo12825s()
            java.util.List r4 = r4.mo12826t()
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
            r7 = 1
            r8 = r6
            r9 = r8
            r10 = r7
        L_0x0046:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x00db
            java.lang.Object r11 = r4.next()
            b.l.a.c.e.e.m9 r11 = (p005b.p096l.p097a.p113c.p131e.p136e.C2328m9) r11
            b.l.a.c.e.e.d9 r12 = r11.mo12813u()
            if (r12 != r0) goto L_0x0046
            boolean r12 = r11.mo12811s()
            if (r12 == 0) goto L_0x00c3
            b.l.a.c.e.e.da r12 = r11.mo12815w()
            b.l.a.c.e.e.da r13 = p005b.p096l.p097a.p113c.p131e.p136e.C2107da.UNKNOWN_PREFIX
            if (r12 == r13) goto L_0x00ab
            b.l.a.c.e.e.d9 r12 = r11.mo12813u()
            b.l.a.c.e.e.d9 r13 = p005b.p096l.p097a.p113c.p131e.p136e.C2106d9.UNKNOWN_STATUS
            if (r12 == r13) goto L_0x0093
            int r12 = r11.mo12814v()
            if (r12 != r5) goto L_0x0080
            if (r9 != 0) goto L_0x0078
            r9 = r7
            goto L_0x0080
        L_0x0078:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset contains multiple primary keys"
            r15.<init>(r0)
            throw r15
        L_0x0080:
            b.l.a.c.e.e.c9 r11 = r11.mo12812t()
            b.l.a.c.e.e.b9 r11 = r11.mo12459u()
            b.l.a.c.e.e.b9 r12 = p005b.p096l.p097a.p113c.p131e.p136e.C2056b9.ASYMMETRIC_PUBLIC
            if (r11 == r12) goto L_0x008e
            r11 = r6
            goto L_0x008f
        L_0x008e:
            r11 = r7
        L_0x008f:
            r10 = r10 & r11
            int r8 = r8 + 1
            goto L_0x0046
        L_0x0093:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r1 = r11.mo12814v()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r6] = r1
            java.lang.String r1 = "key %d has unknown status"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        L_0x00ab:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r1 = r11.mo12814v()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r6] = r1
            java.lang.String r1 = "key %d has unknown prefix"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        L_0x00c3:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r1 = r11.mo12814v()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r6] = r1
            java.lang.String r1 = "key %d has no key data"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        L_0x00db:
            if (r8 == 0) goto L_0x0253
            if (r9 != 0) goto L_0x00ea
            if (r10 == 0) goto L_0x00e2
            goto L_0x00ea
        L_0x00e2:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset doesn't contain a valid primary key"
            r15.<init>(r0)
            throw r15
        L_0x00ea:
            b.l.a.c.e.e.n2 r4 = new b.l.a.c.e.e.n2
            r4.<init>(r1)
            b.l.a.c.e.e.n9 r5 = r14.f3816a
            java.util.List r5 = r5.mo12826t()
            java.util.Iterator r5 = r5.iterator()
        L_0x00f9:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x01e4
            java.lang.Object r8 = r5.next()
            b.l.a.c.e.e.m9 r8 = (p005b.p096l.p097a.p113c.p131e.p136e.C2328m9) r8
            b.l.a.c.e.e.d9 r9 = r8.mo12813u()
            if (r9 != r0) goto L_0x00f9
            b.l.a.c.e.e.c9 r9 = r8.mo12812t()
            java.lang.String r10 = r9.mo12457s()
            b.l.a.c.e.e.lm r9 = r9.mo12458t()
            java.lang.Object r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2537v2.m4288j(r10, r9, r1)
            b.l.a.c.e.e.d9 r10 = r8.mo12813u()
            if (r10 != r0) goto L_0x01dc
            b.l.a.c.e.e.l2 r10 = new b.l.a.c.e.e.l2
            b.l.a.c.e.e.da r11 = r8.mo12815w()
            int r11 = r11.ordinal()
            r12 = 5
            if (r11 == r7) goto L_0x014c
            r13 = 2
            if (r11 == r13) goto L_0x0143
            r13 = 3
            if (r11 == r13) goto L_0x0140
            r13 = 4
            if (r11 != r13) goto L_0x0138
            goto L_0x0143
        L_0x0138:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown output prefix type"
            r15.<init>(r0)
            throw r15
        L_0x0140:
            byte[] r11 = p005b.p096l.p097a.p113c.p131e.p136e.C2512u1.f4338a
            goto L_0x0160
        L_0x0143:
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r12)
            java.nio.ByteBuffer r11 = r11.put(r6)
            goto L_0x0154
        L_0x014c:
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r12)
            java.nio.ByteBuffer r11 = r11.put(r7)
        L_0x0154:
            int r12 = r8.mo12814v()
            java.nio.ByteBuffer r11 = r11.putInt(r12)
            byte[] r11 = r11.array()
        L_0x0160:
            b.l.a.c.e.e.d9 r12 = r8.mo12813u()
            b.l.a.c.e.e.da r13 = r8.mo12815w()
            r10.<init>(r9, r11, r12, r13)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r9.add(r10)
            b.l.a.c.e.e.m2 r11 = new b.l.a.c.e.e.m2
            byte[] r12 = r10.f4038b
            if (r12 != 0) goto L_0x017b
            r12 = r2
            goto L_0x0180
        L_0x017b:
            int r13 = r12.length
            byte[] r12 = java.util.Arrays.copyOf(r12, r13)
        L_0x0180:
            r11.<init>(r12)
            java.util.concurrent.ConcurrentMap<b.l.a.c.e.e.m2, java.util.List<b.l.a.c.e.e.l2<P>>> r12 = r4.f4088a
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            java.lang.Object r9 = r12.put(r11, r9)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L_0x01a5
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r12.addAll(r9)
            r12.add(r10)
            java.util.concurrent.ConcurrentMap<b.l.a.c.e.e.m2, java.util.List<b.l.a.c.e.e.l2<P>>> r9 = r4.f4088a
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r9.put(r11, r12)
        L_0x01a5:
            int r8 = r8.mo12814v()
            b.l.a.c.e.e.n9 r9 = r14.f3816a
            int r9 = r9.mo12825s()
            if (r8 != r9) goto L_0x00f9
            b.l.a.c.e.e.d9 r8 = r10.f4039c
            if (r8 != r0) goto L_0x01d4
            byte[] r8 = r10.f4038b
            if (r8 != 0) goto L_0x01bb
            r8 = r2
            goto L_0x01c0
        L_0x01bb:
            int r9 = r8.length
            byte[] r8 = java.util.Arrays.copyOf(r8, r9)
        L_0x01c0:
            java.util.List r8 = r4.mo12823a(r8)
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x01cc
            goto L_0x00f9
        L_0x01cc:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "the primary entry cannot be set to an entry which is not held by this primitive set"
            r15.<init>(r0)
            throw r15
        L_0x01d4:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "the primary entry has to be ENABLED"
            r15.<init>(r0)
            throw r15
        L_0x01dc:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "only ENABLED key is allowed"
            r15.<init>(r0)
            throw r15
        L_0x01e4:
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, b.l.a.c.e.e.o2<?, ?>> r0 = p005b.p096l.p097a.p113c.p131e.p136e.C2537v2.f4364e
            java.lang.Object r15 = r0.get(r15)
            b.l.a.c.e.e.o2 r15 = (p005b.p096l.p097a.p113c.p131e.p136e.C2369o2) r15
            if (r15 != 0) goto L_0x020a
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.Class<P> r0 = r4.f4089b
            java.lang.String r0 = r0.getName()
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0201
            java.lang.String r0 = r3.concat(r0)
            goto L_0x0206
        L_0x0201:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        L_0x0206:
            r15.<init>(r0)
            throw r15
        L_0x020a:
            java.lang.Class r0 = r15.mo12365c()
            java.lang.Class<P> r1 = r4.f4089b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x021b
            java.lang.Object r15 = r15.mo12363a(r4)
            return r15
        L_0x021b:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.Class r15 = r15.mo12365c()
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.Class<P> r1 = r4.f4089b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r15.length()
            int r3 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 44
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "Wrong input primitive class, expected "
            r4.append(r2)
            r4.append(r15)
            java.lang.String r15 = ", got "
            r4.append(r15)
            r4.append(r1)
            java.lang.String r15 = r4.toString()
            r0.<init>(r15)
            throw r0
        L_0x0253:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset must contain at least one ENABLED key"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2124e2.mo12581e(java.lang.Class):java.lang.Object");
    }

    public final String toString() {
        return C2561w2.m4340a(this.f3816a).toString();
    }
}
