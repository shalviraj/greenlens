package p421m.p422m0.p427h;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p334t.C6799q;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;
import p421m.C7850h0;
import p421m.C7854j;
import p421m.p422m0.C7867c;
import p435n.C8040e;
import p435n.C8044h;

/* renamed from: m.m0.h.e */
public final class C7907e {

    /* renamed from: a */
    public static final C8044h f15757a;

    /* renamed from: b */
    public static final C8044h f15758b;

    static {
        C8044h.C8045a aVar = C8044h.f16143k;
        f15757a = aVar.mo25970b("\"\\");
        f15758b = aVar.mo25970b("\t ,=");
    }

    /* renamed from: a */
    public static final boolean m14391a(C7850h0 h0Var) {
        C6888i.m12438e(h0Var, "$this$promisesBody");
        if (C6888i.m12434a(h0Var.f15549g.f15529c, "HEAD")) {
            return false;
        }
        int i = h0Var.f15552j;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && C7867c.m14290k(h0Var) == -1 && !C7694h.m13928f("chunked", C7850h0.m14257d(h0Var, "Transfer-Encoding", (String) null, 2), true)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final void m14392b(C8040e eVar, List<C7854j> list) {
        String c;
        int u;
        String str;
        C8040e eVar2 = eVar;
        List<C7854j> list2 = list;
        while (true) {
            String str2 = null;
            while (true) {
                if (str2 == null) {
                    m14395e(eVar);
                    str2 = m14393c(eVar);
                    if (str2 == null) {
                        return;
                    }
                }
                boolean e = m14395e(eVar);
                c = m14393c(eVar);
                if (c != null) {
                    byte b = (byte) 61;
                    u = C7867c.m14300u(eVar2, b);
                    boolean e2 = m14395e(eVar);
                    if (e || (!e2 && !eVar.mo25886D())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int u2 = C7867c.m14300u(eVar2, b) + u;
                        while (true) {
                            if (c == null) {
                                c = m14393c(eVar);
                                if (m14395e(eVar)) {
                                    continue;
                                    break;
                                }
                                u2 = C7867c.m14300u(eVar2, b);
                            }
                            if (u2 == 0) {
                                continue;
                                break;
                            }
                            boolean z = true;
                            if (u2 <= 1 && !m14395e(eVar)) {
                                byte b2 = (byte) 34;
                                if (!eVar.mo25886D() && eVar2.mo25891N(0) == b2) {
                                    if (eVar.readByte() != b2) {
                                        z = false;
                                    }
                                    if (z) {
                                        C8040e eVar3 = new C8040e();
                                        while (true) {
                                            long P = eVar2.mo25893P(f15757a);
                                            if (P == -1) {
                                                break;
                                            } else if (eVar2.mo25891N(P) == b2) {
                                                eVar3.mo17030j(eVar2, P);
                                                eVar.readByte();
                                                str = eVar3.mo25919n0();
                                                break;
                                            } else if (eVar2.f16140h == P + 1) {
                                                break;
                                            } else {
                                                eVar3.mo17030j(eVar2, P);
                                                eVar.readByte();
                                                eVar3.mo17030j(eVar2, 1);
                                            }
                                        }
                                        str = null;
                                    } else {
                                        throw new IllegalArgumentException("Failed requirement.".toString());
                                    }
                                } else {
                                    str = m14393c(eVar);
                                }
                                if (str != null && ((String) linkedHashMap.put(c, str)) == null) {
                                    if (m14395e(eVar) || eVar.mo25886D()) {
                                        c = null;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list2.add(new C7854j(str2, linkedHashMap));
                        str2 = c;
                    }
                } else if (eVar.mo25886D()) {
                    list2.add(new C7854j(str2, C6799q.f13714g));
                    return;
                } else {
                    return;
                }
            }
            StringBuilder u3 = C0843a.m460u(c);
            u3.append(C7694h.m13942t("=", u));
            Map singletonMap = Collections.singletonMap((Object) null, u3.toString());
            C6888i.m12437d(singletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
            list2.add(new C7854j(str2, singletonMap));
        }
    }

    /* renamed from: c */
    public static final String m14393c(C8040e eVar) {
        long P = eVar.mo25893P(f15758b);
        if (P == -1) {
            P = eVar.f16140h;
        }
        if (P != 0) {
            return eVar.mo25921o0(P);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020b, code lost:
        if (okhttp3.internal.publicsuffix.PublicSuffixDatabase.f16263g.mo26040a(r7) == null) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f6, code lost:
        if (r8 == false) goto L_0x020d;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0252 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c1  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m14394d(p421m.C8010q r28, p421m.C8025z r29, p421m.C8022y r30) {
        /*
            r0 = r28
            r1 = r29
            r2 = r30
            java.lang.String r3 = "$this$receiveHeaders"
            p298d.p344x.p346c.C6888i.m12438e(r0, r3)
            java.lang.String r3 = "url"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r4 = "headers"
            p298d.p344x.p346c.C6888i.m12438e(r2, r4)
            m.q r5 = p421m.C8010q.f16078a
            if (r0 != r5) goto L_0x001a
            return
        L_0x001a:
            m.o r5 = p421m.C8008o.f16068n
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            p298d.p344x.p346c.C6888i.m12438e(r2, r4)
            java.lang.String r4 = "Set-Cookie"
            java.lang.String r5 = "name"
            p298d.p344x.p346c.C6888i.m12438e(r4, r5)
            int r5 = r30.size()
            r6 = 0
            r7 = 0
            r8 = r6
        L_0x0030:
            r9 = 2
            r10 = 1
            if (r8 >= r5) goto L_0x004f
            java.lang.String r11 = r2.mo25840l(r8)
            boolean r10 = p298d.p415c0.C7694h.m13928f(r4, r11, r10)
            if (r10 == 0) goto L_0x004c
            if (r7 != 0) goto L_0x0045
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r9)
        L_0x0045:
            java.lang.String r9 = r2.mo25842q(r8)
            r7.add(r9)
        L_0x004c:
            int r8 = r8 + 1
            goto L_0x0030
        L_0x004f:
            if (r7 == 0) goto L_0x005b
            java.util.List r2 = java.util.Collections.unmodifiableList(r7)
            java.lang.String r4 = "Collections.unmodifiableList(result)"
            p298d.p344x.p346c.C6888i.m12437d(r2, r4)
            goto L_0x005d
        L_0x005b:
            d.t.p r2 = p298d.p334t.C6798p.f13713g
        L_0x005d:
            int r4 = r2.size()
            r5 = 0
            r7 = r6
        L_0x0063:
            if (r6 >= r4) goto L_0x0258
            java.lang.Object r8 = r2.get(r6)
            java.lang.String r8 = (java.lang.String) r8
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r9 = "setCookie"
            p298d.p344x.p346c.C6888i.m12438e(r8, r9)
            long r10 = java.lang.System.currentTimeMillis()
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            p298d.p344x.p346c.C6888i.m12438e(r8, r9)
            byte[] r9 = p421m.p422m0.C7867c.f15619a
            int r9 = r8.length()
            r12 = 59
            int r9 = p421m.p422m0.C7867c.m14285f(r8, r12, r7, r9)
            r13 = 61
            int r13 = p421m.p422m0.C7867c.m14285f(r8, r13, r7, r9)
            if (r13 != r9) goto L_0x0095
        L_0x0091:
            r30 = r2
            goto L_0x0245
        L_0x0095:
            java.lang.String r15 = p421m.p422m0.C7867c.m14278A(r8, r7, r13)
            int r14 = r15.length()
            if (r14 != 0) goto L_0x00a1
            r14 = 1
            goto L_0x00a2
        L_0x00a1:
            r14 = r7
        L_0x00a2:
            if (r14 != 0) goto L_0x0091
            int r7 = p421m.p422m0.C7867c.m14292m(r15)
            r14 = -1
            if (r7 == r14) goto L_0x00ac
            goto L_0x00b8
        L_0x00ac:
            int r13 = r13 + 1
            java.lang.String r16 = p421m.p422m0.C7867c.m14278A(r8, r13, r9)
            int r7 = p421m.p422m0.C7867c.m14292m(r16)
            if (r7 == r14) goto L_0x00bc
        L_0x00b8:
            r30 = r2
            goto L_0x020d
        L_0x00bc:
            int r9 = r9 + 1
            int r7 = r8.length()
            r17 = -1
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 1
            r23 = 0
            r24 = 0
            r26 = r23
            r27 = r24
            r23 = r21
            r24 = r22
            r21 = r19
            r22 = r20
            r19 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
        L_0x00e1:
            if (r9 >= r7) goto L_0x017e
            int r12 = p421m.p422m0.C7867c.m14285f(r8, r12, r9, r7)
            r13 = 61
            int r13 = p421m.p422m0.C7867c.m14285f(r8, r13, r9, r12)
            java.lang.String r9 = p421m.p422m0.C7867c.m14278A(r8, r9, r13)
            if (r13 >= r12) goto L_0x00fa
            int r13 = r13 + 1
            java.lang.String r13 = p421m.p422m0.C7867c.m14278A(r8, r13, r12)
            goto L_0x00fc
        L_0x00fa:
            java.lang.String r13 = ""
        L_0x00fc:
            java.lang.String r14 = "expires"
            r30 = r2
            r2 = 1
            boolean r14 = p298d.p415c0.C7694h.m13928f(r9, r14, r2)
            if (r14 == 0) goto L_0x0111
            int r9 = r13.length()     // Catch:{ IllegalArgumentException -> 0x0176 }
            r14 = 0
            long r19 = p421m.C8008o.m14675b(r13, r14, r9)     // Catch:{ IllegalArgumentException -> 0x0176 }
            goto L_0x011d
        L_0x0111:
            java.lang.String r14 = "max-age"
            boolean r14 = p298d.p415c0.C7694h.m13928f(r9, r14, r2)
            if (r14 == 0) goto L_0x0120
            long r17 = p421m.C8008o.m14676c(r13)     // Catch:{  }
        L_0x011d:
            r23 = r2
            goto L_0x0176
        L_0x0120:
            java.lang.String r14 = "domain"
            boolean r2 = p298d.p415c0.C7694h.m13928f(r9, r14, r2)
            if (r2 == 0) goto L_0x0155
            java.lang.String r2 = "."
            r9 = 0
            r14 = 2
            boolean r9 = p298d.p415c0.C7694h.m13927e(r13, r2, r9, r14)     // Catch:{ IllegalArgumentException -> 0x0176 }
            r9 = r9 ^ 1
            if (r9 == 0) goto L_0x0149
            java.lang.String r2 = p298d.p415c0.C7694h.m13941s(r13, r2)     // Catch:{ IllegalArgumentException -> 0x0176 }
            java.lang.String r2 = p005b.p291q.p292a.C5266a.m10024r4(r2)     // Catch:{ IllegalArgumentException -> 0x0176 }
            if (r2 == 0) goto L_0x0143
            r24 = 0
            r26 = r2
            goto L_0x0176
        L_0x0143:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0176 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0176 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0176 }
        L_0x0149:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0176 }
            java.lang.String r9 = "Failed requirement."
            java.lang.String r9 = r9.toString()     // Catch:{ IllegalArgumentException -> 0x0176 }
            r2.<init>(r9)     // Catch:{ IllegalArgumentException -> 0x0176 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0176 }
        L_0x0155:
            java.lang.String r2 = "path"
            r14 = 1
            boolean r2 = p298d.p415c0.C7694h.m13928f(r9, r2, r14)
            if (r2 == 0) goto L_0x0161
            r27 = r13
            goto L_0x0176
        L_0x0161:
            java.lang.String r2 = "secure"
            boolean r2 = p298d.p415c0.C7694h.m13928f(r9, r2, r14)
            if (r2 == 0) goto L_0x016c
            r21 = r14
            goto L_0x0176
        L_0x016c:
            java.lang.String r2 = "httponly"
            boolean r2 = p298d.p415c0.C7694h.m13928f(r9, r2, r14)
            if (r2 == 0) goto L_0x0176
            r22 = 1
        L_0x0176:
            int r9 = r12 + 1
            r12 = 59
            r2 = r30
            goto L_0x00e1
        L_0x017e:
            r30 = r2
            r7 = -9223372036854775808
            int r2 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0187
            goto L_0x01b1
        L_0x0187:
            r7 = -1
            int r2 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x01b7
            r7 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r2 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x019c
            r2 = 1000(0x3e8, float:1.401E-42)
            long r7 = (long) r2
            long r17 = r17 * r7
            goto L_0x01a1
        L_0x019c:
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x01a1:
            long r7 = r10 + r17
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            r9 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            if (r2 < 0) goto L_0x01b4
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x01b1
            goto L_0x01b4
        L_0x01b1:
            r17 = r7
            goto L_0x01b9
        L_0x01b4:
            r17 = r9
            goto L_0x01b9
        L_0x01b7:
            r17 = r19
        L_0x01b9:
            java.lang.String r2 = r1.f16106e
            r7 = r26
            if (r7 != 0) goto L_0x01c1
            r7 = r2
            goto L_0x01f9
        L_0x01c1:
            boolean r8 = p298d.p344x.p346c.C6888i.m12434a(r2, r7)
            if (r8 == 0) goto L_0x01c9
            r8 = 1
            goto L_0x01f6
        L_0x01c9:
            r8 = 2
            r9 = 0
            boolean r8 = p298d.p415c0.C7694h.m13927e(r2, r7, r9, r8)
            if (r8 == 0) goto L_0x01f5
            int r8 = r2.length()
            int r9 = r7.length()
            int r8 = r8 - r9
            r9 = 1
            int r8 = r8 - r9
            char r8 = r2.charAt(r8)
            r10 = 46
            if (r8 != r10) goto L_0x01f5
            byte[] r8 = p421m.p422m0.C7867c.f15619a
            java.lang.String r8 = "$this$canParseAsIpAddress"
            p298d.p344x.p346c.C6888i.m12438e(r2, r8)
            d.c0.d r8 = p421m.p422m0.C7867c.f15624f
            boolean r8 = r8.mo25278a(r2)
            if (r8 != 0) goto L_0x01f5
            r8 = r9
            goto L_0x01f6
        L_0x01f5:
            r8 = 0
        L_0x01f6:
            if (r8 != 0) goto L_0x01f9
            goto L_0x020d
        L_0x01f9:
            int r2 = r2.length()
            int r8 = r7.length()
            if (r2 == r8) goto L_0x020f
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f16264h
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f16263g
            java.lang.String r2 = r2.mo26040a(r7)
            if (r2 != 0) goto L_0x020f
        L_0x020d:
            r7 = 0
            goto L_0x0245
        L_0x020f:
            java.lang.String r2 = "/"
            r8 = 2
            r9 = 0
            r10 = r27
            if (r10 == 0) goto L_0x0221
            boolean r8 = p298d.p415c0.C7694h.m13910A(r10, r2, r9, r8)
            if (r8 != 0) goto L_0x021e
            goto L_0x0221
        L_0x021e:
            r20 = r10
            goto L_0x0239
        L_0x0221:
            java.lang.String r8 = r29.mo25852b()
            r10 = 47
            r11 = 6
            int r10 = p298d.p415c0.C7694h.m13937o(r8, r10, r9, r9, r11)
            if (r10 == 0) goto L_0x0237
            java.lang.String r2 = r8.substring(r9, r10)
            java.lang.String r8 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p298d.p344x.p346c.C6888i.m12437d(r2, r8)
        L_0x0237:
            r20 = r2
        L_0x0239:
            m.o r2 = new m.o
            r25 = 0
            r14 = r2
            r19 = r7
            r14.<init>(r15, r16, r17, r19, r20, r21, r22, r23, r24, r25)
            r7 = r9
            goto L_0x0246
        L_0x0245:
            r2 = 0
        L_0x0246:
            if (r2 == 0) goto L_0x0252
            if (r5 != 0) goto L_0x024f
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x024f:
            r5.add(r2)
        L_0x0252:
            int r6 = r6 + 1
            r2 = r30
            goto L_0x0063
        L_0x0258:
            if (r5 == 0) goto L_0x0264
            java.util.List r2 = java.util.Collections.unmodifiableList(r5)
            java.lang.String r3 = "Collections.unmodifiableList(cookies)"
            p298d.p344x.p346c.C6888i.m12437d(r2, r3)
            goto L_0x0266
        L_0x0264:
            d.t.p r2 = p298d.p334t.C6798p.f13713g
        L_0x0266:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x026d
            return
        L_0x026d:
            r0.mo25820b(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p427h.C7907e.m14394d(m.q, m.z, m.y):void");
    }

    /* renamed from: e */
    public static final boolean m14395e(C8040e eVar) {
        boolean z = false;
        while (!eVar.mo25886D()) {
            byte N = eVar.mo25891N(0);
            if (N == 9 || N == 32) {
                eVar.readByte();
            } else if (N != 44) {
                break;
            } else {
                eVar.readByte();
                z = true;
            }
        }
        return z;
    }
}
