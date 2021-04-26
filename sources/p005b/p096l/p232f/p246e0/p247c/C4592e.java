package p005b.p096l.p232f.p246e0.p247c;

import java.util.Map;
import p005b.p096l.p232f.C4550d;
import p005b.p096l.p232f.C4577e;
import p005b.p096l.p232f.C4614h;
import p005b.p096l.p232f.p258y.C4658b;
import p005b.p096l.p232f.p258y.C4661e;
import p005b.p096l.p232f.p258y.p260l.C4668a;
import p005b.p096l.p232f.p258y.p260l.C4670c;

/* renamed from: b.l.f.e0.c.e */
public final class C4592e {

    /* renamed from: a */
    public final C4670c f8597a = new C4670c(C4668a.f8863l);

    /* renamed from: a */
    public C4661e mo16246a(C4658b bVar, Map<C4577e, ?> map) {
        C4550d dVar;
        C4580a aVar = new C4580a(bVar);
        try {
            return mo16247b(aVar, map);
        } catch (C4614h e) {
            e = e;
            dVar = null;
            try {
                aVar.mo16243e();
                aVar.f8582b = null;
                aVar.f8583c = null;
                aVar.f8584d = true;
                aVar.mo16242d();
                aVar.mo16241c();
                aVar.mo16240b();
                C4661e b = mo16247b(aVar, map);
                b.f8831f = new C4596i(true);
                return b;
            } catch (C4550d | C4614h unused) {
                if (e != null) {
                    throw e;
                }
                throw dVar;
            }
        } catch (C4550d e2) {
            dVar = e2;
            e = null;
            aVar.mo16243e();
            aVar.f8582b = null;
            aVar.f8583c = null;
            aVar.f8584d = true;
            aVar.mo16242d();
            aVar.mo16241c();
            aVar.mo16240b();
            C4661e b2 = mo16247b(aVar, map);
            b2.f8831f = new C4596i(true);
            return b2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x0257 A[Catch:{ IllegalArgumentException -> 0x0348 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0343 A[LOOP:19: B:102:0x0204->B:196:0x0343, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0329 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p096l.p232f.p258y.C4661e mo16247b(p005b.p096l.p232f.p246e0.p247c.C4580a r28, java.util.Map<p005b.p096l.p232f.C4577e, ?> r29) {
        /*
            r27 = this;
            r0 = r28
            b.l.f.e0.c.j r1 = r28.mo16242d()
            b.l.f.e0.c.g r2 = r28.mo16241c()
            b.l.f.e0.c.f r2 = r2.f8606a
            b.l.f.e0.c.g r3 = r28.mo16241c()
            b.l.f.e0.c.j r4 = r28.mo16242d()
            b.l.f.e0.c.c[] r5 = p005b.p096l.p232f.p246e0.p247c.C4582c.values()
            byte r3 = r3.f8607b
            r3 = r5[r3]
            b.l.f.y.b r5 = r0.f8581a
            int r6 = r5.f8788h
            r3.mo16245e(r5, r6)
            int r3 = r4.mo16251c()
            b.l.f.y.b r5 = new b.l.f.y.b
            r5.<init>(r3, r3)
            r7 = 0
            r8 = 9
            r5.mo16340h(r7, r7, r8, r8)
            int r9 = r3 + -8
            r10 = 8
            r5.mo16340h(r9, r7, r10, r8)
            r5.mo16340h(r7, r9, r8, r10)
            int[] r9 = r4.f8625b
            int r9 = r9.length
            r11 = r7
        L_0x0040:
            r12 = 5
            if (r11 >= r9) goto L_0x0069
            int[] r13 = r4.f8625b
            r13 = r13[r11]
            int r13 = r13 + -2
            r14 = r7
        L_0x004a:
            if (r14 >= r9) goto L_0x0066
            if (r11 != 0) goto L_0x0054
            if (r14 == 0) goto L_0x0063
            int r15 = r9 + -1
            if (r14 == r15) goto L_0x0063
        L_0x0054:
            int r15 = r9 + -1
            if (r11 != r15) goto L_0x005a
            if (r14 == 0) goto L_0x0063
        L_0x005a:
            int[] r15 = r4.f8625b
            r15 = r15[r14]
            int r15 = r15 + -2
            r5.mo16340h(r15, r13, r12, r12)
        L_0x0063:
            int r14 = r14 + 1
            goto L_0x004a
        L_0x0066:
            int r11 = r11 + 1
            goto L_0x0040
        L_0x0069:
            int r9 = r3 + -17
            r11 = 6
            r13 = 1
            r5.mo16340h(r11, r8, r13, r9)
            r5.mo16340h(r8, r11, r9, r13)
            int r9 = r4.f8624a
            r14 = 3
            if (r9 <= r11) goto L_0x0080
            int r3 = r3 + -11
            r5.mo16340h(r3, r7, r14, r11)
            r5.mo16340h(r7, r3, r11, r14)
        L_0x0080:
            int r3 = r4.f8627d
            byte[] r9 = new byte[r3]
            int r15 = r6 + -1
            r12 = r7
            r17 = r12
            r18 = r17
            r16 = r13
            r8 = r15
        L_0x008e:
            r14 = 2
            if (r8 <= 0) goto L_0x00f1
            if (r8 != r11) goto L_0x0095
            int r8 = r8 + -1
        L_0x0095:
            r11 = r7
        L_0x0096:
            if (r11 >= r6) goto L_0x00e5
            if (r16 == 0) goto L_0x009f
            int r19 = r15 - r11
            r13 = r19
            goto L_0x00a0
        L_0x009f:
            r13 = r11
        L_0x00a0:
            if (r7 >= r14) goto L_0x00db
            int r14 = r8 - r7
            boolean r20 = r5.mo16333b(r14, r13)
            if (r20 != 0) goto L_0x00d1
            int r10 = r17 + 1
            int r17 = r18 << 1
            r21 = r5
            b.l.f.y.b r5 = r0.f8581a
            boolean r5 = r5.mo16333b(r14, r13)
            if (r5 == 0) goto L_0x00bb
            r5 = r17 | 1
            goto L_0x00bd
        L_0x00bb:
            r5 = r17
        L_0x00bd:
            r14 = 8
            if (r10 != r14) goto L_0x00cc
            int r10 = r12 + 1
            byte r5 = (byte) r5
            r9[r12] = r5
            r12 = r10
            r17 = 0
            r18 = 0
            goto L_0x00d3
        L_0x00cc:
            r18 = r5
            r17 = r10
            goto L_0x00d3
        L_0x00d1:
            r21 = r5
        L_0x00d3:
            int r7 = r7 + 1
            r5 = r21
            r10 = 8
            r14 = 2
            goto L_0x00a0
        L_0x00db:
            r21 = r5
            int r11 = r11 + 1
            r7 = 0
            r10 = 8
            r13 = 1
            r14 = 2
            goto L_0x0096
        L_0x00e5:
            r21 = r5
            r16 = r16 ^ 1
            int r8 = r8 + -2
            r7 = 0
            r10 = 8
            r11 = 6
            r13 = 1
            goto L_0x008e
        L_0x00f1:
            int r0 = r4.f8627d
            if (r12 != r0) goto L_0x0355
            int r0 = r1.f8627d
            if (r3 != r0) goto L_0x034d
            b.l.f.e0.c.j$b[] r0 = r1.f8626c
            int r3 = r2.ordinal()
            r0 = r0[r3]
            b.l.f.e0.c.j$a[] r3 = r0.f8631b
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L_0x0106:
            if (r5 >= r4) goto L_0x0110
            r7 = r3[r5]
            int r7 = r7.f8628a
            int r6 = r6 + r7
            int r5 = r5 + 1
            goto L_0x0106
        L_0x0110:
            b.l.f.e0.c.b[] r4 = new p005b.p096l.p232f.p246e0.p247c.C4581b[r6]
            int r5 = r3.length
            r7 = 0
            r8 = 0
        L_0x0115:
            if (r7 >= r5) goto L_0x0135
            r10 = r3[r7]
            r11 = 0
        L_0x011a:
            int r12 = r10.f8628a
            if (r11 >= r12) goto L_0x0132
            int r12 = r10.f8629b
            int r13 = r0.f8630a
            int r13 = r13 + r12
            int r14 = r8 + 1
            b.l.f.e0.c.b r15 = new b.l.f.e0.c.b
            byte[] r13 = new byte[r13]
            r15.<init>(r12, r13)
            r4[r8] = r15
            int r11 = r11 + 1
            r8 = r14
            goto L_0x011a
        L_0x0132:
            int r7 = r7 + 1
            goto L_0x0115
        L_0x0135:
            r7 = 0
            r3 = r4[r7]
            byte[] r3 = r3.f8586b
            int r3 = r3.length
            int r5 = r6 + -1
        L_0x013d:
            if (r5 < 0) goto L_0x0149
            r7 = r4[r5]
            byte[] r7 = r7.f8586b
            int r7 = r7.length
            if (r7 == r3) goto L_0x0149
            int r5 = r5 + -1
            goto L_0x013d
        L_0x0149:
            r7 = 1
            int r5 = r5 + r7
            int r0 = r0.f8630a
            int r3 = r3 - r0
            r0 = 0
            r7 = 0
        L_0x0150:
            if (r7 >= r3) goto L_0x0166
            r10 = 0
        L_0x0153:
            if (r10 >= r8) goto L_0x0163
            r11 = r4[r10]
            byte[] r11 = r11.f8586b
            int r12 = r0 + 1
            byte r0 = r9[r0]
            r11[r7] = r0
            int r10 = r10 + 1
            r0 = r12
            goto L_0x0153
        L_0x0163:
            int r7 = r7 + 1
            goto L_0x0150
        L_0x0166:
            r7 = r5
        L_0x0167:
            if (r7 >= r8) goto L_0x0177
            r10 = r4[r7]
            byte[] r10 = r10.f8586b
            int r11 = r0 + 1
            byte r0 = r9[r0]
            r10[r3] = r0
            int r7 = r7 + 1
            r0 = r11
            goto L_0x0167
        L_0x0177:
            r7 = 0
            r10 = r4[r7]
            byte[] r10 = r10.f8586b
            int r10 = r10.length
        L_0x017d:
            if (r3 >= r10) goto L_0x0199
            r11 = r7
        L_0x0180:
            if (r11 >= r8) goto L_0x0196
            if (r11 >= r5) goto L_0x0186
            r12 = r3
            goto L_0x0188
        L_0x0186:
            int r12 = r3 + 1
        L_0x0188:
            r13 = r4[r11]
            byte[] r13 = r13.f8586b
            int r14 = r0 + 1
            byte r0 = r9[r0]
            r13[r12] = r0
            int r11 = r11 + 1
            r0 = r14
            goto L_0x0180
        L_0x0196:
            int r3 = r3 + 1
            goto L_0x017d
        L_0x0199:
            r0 = r7
            r3 = r0
        L_0x019b:
            if (r0 >= r6) goto L_0x01a5
            r5 = r4[r0]
            int r5 = r5.f8585a
            int r3 = r3 + r5
            int r0 = r0 + 1
            goto L_0x019b
        L_0x01a5:
            byte[] r9 = new byte[r3]
            r0 = r7
            r3 = r0
        L_0x01a9:
            if (r0 >= r6) goto L_0x01e9
            r5 = r4[r0]
            byte[] r8 = r5.f8586b
            int r5 = r5.f8585a
            int r10 = r8.length
            int[] r11 = new int[r10]
            r12 = r7
        L_0x01b5:
            if (r12 >= r10) goto L_0x01c0
            byte r13 = r8[r12]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11[r12] = r13
            int r12 = r12 + 1
            goto L_0x01b5
        L_0x01c0:
            r15 = r27
            b.l.f.y.l.c r10 = r15.f8597a     // Catch:{ e -> 0x01e4 }
            int r12 = r8.length     // Catch:{ e -> 0x01e4 }
            int r12 = r12 - r5
            r10.mo16363a(r11, r12)     // Catch:{ e -> 0x01e4 }
            r10 = r7
        L_0x01ca:
            if (r10 >= r5) goto L_0x01d4
            r12 = r11[r10]
            byte r12 = (byte) r12
            r8[r10] = r12
            int r10 = r10 + 1
            goto L_0x01ca
        L_0x01d4:
            r10 = r7
        L_0x01d5:
            if (r10 >= r5) goto L_0x01e1
            int r11 = r3 + 1
            byte r12 = r8[r10]
            r9[r3] = r12
            int r10 = r10 + 1
            r3 = r11
            goto L_0x01d5
        L_0x01e1:
            int r0 = r0 + 1
            goto L_0x01a9
        L_0x01e4:
            b.l.f.d r0 = p005b.p096l.p232f.C4550d.m8384a()
            throw r0
        L_0x01e9:
            r15 = r27
            char[] r0 = p005b.p096l.p232f.p246e0.p247c.C4591d.f8596a
            b.l.f.e0.c.h r0 = p005b.p096l.p232f.p246e0.p247c.C4595h.TERMINATOR
            b.l.f.y.c r3 = new b.l.f.y.c
            r3.<init>(r9)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 50
            r4.<init>(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 1
            r5.<init>(r6)
            r8 = -1
            r10 = r8
            r11 = 0
        L_0x0204:
            int r12 = r3.mo16343a()     // Catch:{ IllegalArgumentException -> 0x0348 }
            r13 = 7
            r14 = 4
            if (r12 >= r14) goto L_0x020d
            goto L_0x0250
        L_0x020d:
            int r12 = r3.mo16344b(r14)     // Catch:{ IllegalArgumentException -> 0x0348 }
            if (r12 == 0) goto L_0x0250
            r6 = 1
            if (r12 == r6) goto L_0x024d
            r6 = 2
            if (r12 == r6) goto L_0x024a
            r6 = 3
            if (r12 == r6) goto L_0x0247
            if (r12 == r14) goto L_0x0244
            r6 = 5
            if (r12 == r6) goto L_0x0241
            if (r12 == r13) goto L_0x023e
            r6 = 8
            if (r12 == r6) goto L_0x023b
            r6 = 9
            if (r12 == r6) goto L_0x0238
            r6 = 13
            if (r12 != r6) goto L_0x0232
            b.l.f.e0.c.h r6 = p005b.p096l.p232f.p246e0.p247c.C4595h.HANZI     // Catch:{ IllegalArgumentException -> 0x0348 }
            goto L_0x0251
        L_0x0232:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0348 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0348 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0348 }
        L_0x0238:
            b.l.f.e0.c.h r6 = p005b.p096l.p232f.p246e0.p247c.C4595h.FNC1_SECOND_POSITION     // Catch:{ IllegalArgumentException -> 0x0348 }
            goto L_0x0251
        L_0x023b:
            b.l.f.e0.c.h r6 = p005b.p096l.p232f.p246e0.p247c.C4595h.KANJI     // Catch:{ IllegalArgumentException -> 0x0348 }
            goto L_0x0251
        L_0x023e:
            b.l.f.e0.c.h r6 = p005b.p096l.p232f.p246e0.p247c.C4595h.ECI     // Catch:{ IllegalArgumentException -> 0x0348 }
            goto L_0x0251
        L_0x0241:
            b.l.f.e0.c.h r6 = p005b.p096l.p232f.p246e0.p247c.C4595h.FNC1_FIRST_POSITION     // Catch:{ IllegalArgumentException -> 0x0348 }
            goto L_0x0251
        L_0x0244:
            b.l.f.e0.c.h r6 = p005b.p096l.p232f.p246e0.p247c.C4595h.BYTE     // Catch:{ IllegalArgumentException -> 0x0348 }
            goto L_0x0251
        L_0x0247:
            b.l.f.e0.c.h r6 = p005b.p096l.p232f.p246e0.p247c.C4595h.STRUCTURED_APPEND     // Catch:{ IllegalArgumentException -> 0x0348 }
            goto L_0x0251
        L_0x024a:
            b.l.f.e0.c.h r6 = p005b.p096l.p232f.p246e0.p247c.C4595h.ALPHANUMERIC     // Catch:{ IllegalArgumentException -> 0x0348 }
            goto L_0x0251
        L_0x024d:
            b.l.f.e0.c.h r6 = p005b.p096l.p232f.p246e0.p247c.C4595h.NUMERIC     // Catch:{ IllegalArgumentException -> 0x0348 }
            goto L_0x0251
        L_0x0250:
            r6 = r0
        L_0x0251:
            int r12 = r6.ordinal()     // Catch:{ IllegalArgumentException -> 0x0348 }
            if (r12 == 0) goto L_0x0321
            r14 = 3
            if (r12 == r14) goto L_0x0308
            r14 = 5
            if (r12 == r14) goto L_0x02c1
            if (r12 == r13) goto L_0x02be
            r13 = 8
            if (r12 == r13) goto L_0x02be
            r13 = 9
            if (r12 == r13) goto L_0x02a7
            int r12 = r6.mo16250d(r1)     // Catch:{ IllegalArgumentException -> 0x0348 }
            int r12 = r3.mo16344b(r12)     // Catch:{ IllegalArgumentException -> 0x0348 }
            int r13 = r6.ordinal()     // Catch:{ IllegalArgumentException -> 0x0348 }
            r14 = 1
            if (r13 == r14) goto L_0x02a1
            r14 = 2
            if (r13 == r14) goto L_0x029b
            r14 = 4
            if (r13 == r14) goto L_0x0289
            r14 = 6
            if (r13 != r14) goto L_0x0284
            p005b.p096l.p232f.p246e0.p247c.C4591d.m8465d(r3, r4, r12)     // Catch:{ IllegalArgumentException -> 0x0348 }
            goto L_0x0321
        L_0x0284:
            b.l.f.h r0 = p005b.p096l.p232f.C4614h.m8506a()     // Catch:{ IllegalArgumentException -> 0x0348 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0348 }
        L_0x0289:
            r14 = 6
            r21 = r3
            r22 = r4
            r23 = r12
            r24 = r11
            r25 = r5
            r26 = r29
            p005b.p096l.p232f.p246e0.p247c.C4591d.m8463b(r21, r22, r23, r24, r25, r26)     // Catch:{ IllegalArgumentException -> 0x0348 }
            goto L_0x0321
        L_0x029b:
            r14 = 6
            p005b.p096l.p232f.p246e0.p247c.C4591d.m8462a(r3, r4, r12, r7)     // Catch:{ IllegalArgumentException -> 0x0348 }
            goto L_0x0321
        L_0x02a1:
            r14 = 6
            p005b.p096l.p232f.p246e0.p247c.C4591d.m8466e(r3, r4, r12)     // Catch:{ IllegalArgumentException -> 0x0348 }
            goto L_0x0321
        L_0x02a7:
            r12 = 4
            r14 = 6
            int r12 = r3.mo16344b(r12)     // Catch:{ IllegalArgumentException -> 0x0348 }
            int r13 = r6.mo16250d(r1)     // Catch:{ IllegalArgumentException -> 0x0348 }
            int r13 = r3.mo16344b(r13)     // Catch:{ IllegalArgumentException -> 0x0348 }
            r14 = 1
            if (r12 != r14) goto L_0x02bb
            p005b.p096l.p232f.p246e0.p247c.C4591d.m8464c(r3, r4, r13)     // Catch:{ IllegalArgumentException -> 0x0348 }
        L_0x02bb:
            r12 = 8
            goto L_0x0324
        L_0x02be:
            r14 = 1
            r7 = r14
            goto L_0x02f8
        L_0x02c1:
            r11 = 8
            r14 = 1
            int r12 = r3.mo16344b(r11)     // Catch:{ IllegalArgumentException -> 0x0348 }
            r11 = r12 & 128(0x80, float:1.794E-43)
            if (r11 != 0) goto L_0x02cf
            r11 = r12 & 127(0x7f, float:1.78E-43)
            goto L_0x02f2
        L_0x02cf:
            r11 = r12 & 192(0xc0, float:2.69E-43)
            r13 = 128(0x80, float:1.794E-43)
            if (r11 != r13) goto L_0x02e1
            r11 = 8
            int r13 = r3.mo16344b(r11)     // Catch:{ IllegalArgumentException -> 0x0348 }
            r12 = r12 & 63
            int r12 = r12 << r11
            r11 = r12 | r13
            goto L_0x02f2
        L_0x02e1:
            r11 = r12 & 224(0xe0, float:3.14E-43)
            r13 = 192(0xc0, float:2.69E-43)
            if (r11 != r13) goto L_0x0303
            r11 = 16
            int r13 = r3.mo16344b(r11)     // Catch:{ IllegalArgumentException -> 0x0348 }
            r12 = r12 & 31
            int r11 = r12 << 16
            r11 = r11 | r13
        L_0x02f2:
            b.l.f.y.d r11 = p005b.p096l.p232f.p258y.C4660d.m8585d(r11)     // Catch:{ IllegalArgumentException -> 0x0348 }
            if (r11 == 0) goto L_0x02fe
        L_0x02f8:
            r13 = r8
            r16 = r10
            r12 = 8
            goto L_0x0327
        L_0x02fe:
            b.l.f.h r0 = p005b.p096l.p232f.C4614h.m8506a()     // Catch:{ IllegalArgumentException -> 0x0348 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0348 }
        L_0x0303:
            b.l.f.h r0 = p005b.p096l.p232f.C4614h.m8506a()     // Catch:{ IllegalArgumentException -> 0x0348 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0348 }
        L_0x0308:
            r14 = 1
            int r8 = r3.mo16343a()     // Catch:{ IllegalArgumentException -> 0x0348 }
            r10 = 16
            if (r8 < r10) goto L_0x031c
            r12 = 8
            int r8 = r3.mo16344b(r12)     // Catch:{ IllegalArgumentException -> 0x0348 }
            int r10 = r3.mo16344b(r12)     // Catch:{ IllegalArgumentException -> 0x0348 }
            goto L_0x0324
        L_0x031c:
            b.l.f.h r0 = p005b.p096l.p232f.C4614h.m8506a()     // Catch:{ IllegalArgumentException -> 0x0348 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0348 }
        L_0x0321:
            r12 = 8
            r14 = 1
        L_0x0324:
            r13 = r8
            r16 = r10
        L_0x0327:
            if (r6 != r0) goto L_0x0343
            b.l.f.y.e r0 = new b.l.f.y.e
            java.lang.String r10 = r4.toString()
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x0337
            r11 = 0
            goto L_0x0338
        L_0x0337:
            r11 = r5
        L_0x0338:
            java.lang.String r12 = r2.toString()
            r8 = r0
            r14 = r16
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r0
        L_0x0343:
            r8 = r13
            r10 = r16
            goto L_0x0204
        L_0x0348:
            b.l.f.h r0 = p005b.p096l.p232f.C4614h.m8506a()
            throw r0
        L_0x034d:
            r15 = r27
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0355:
            r15 = r27
            b.l.f.h r0 = p005b.p096l.p232f.C4614h.m8506a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p246e0.p247c.C4592e.mo16247b(b.l.f.e0.c.a, java.util.Map):b.l.f.y.e");
    }
}
