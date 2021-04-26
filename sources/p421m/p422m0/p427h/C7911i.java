package p421m.p422m0.p427h;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import p298d.p344x.p346c.C6888i;
import p421m.C7826a0;
import p421m.C7831c0;
import p421m.C7839e0;
import p421m.C7844g0;
import p421m.C7850h0;
import p421m.C7860k0;
import p421m.p422m0.C7867c;
import p421m.p422m0.p426g.C7886d;
import p421m.p422m0.p426g.C7887e;
import p421m.p422m0.p426g.C7894i;
import p421m.p422m0.p426g.C7899m;

/* renamed from: m.m0.h.i */
public final class C7911i implements C7826a0 {

    /* renamed from: a */
    public final C7831c0 f15771a;

    public C7911i(C7831c0 c0Var) {
        C6888i.m12438e(c0Var, "client");
        this.f15771a = c0Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: m.m0.h.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: m.m0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: m.m0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: m.m0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: m.m0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: m.m0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: m.m0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: m.m0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: m.m0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: m.m0.h.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: m.m0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: m.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p421m.C7850h0 mo18360a(p421m.C7826a0.C7827a r49) {
        /*
            r48 = this;
            r1 = r48
            r0 = r49
            java.lang.String r2 = "chain"
            p298d.p344x.p346c.C6888i.m12438e(r0, r2)
            r2 = r0
            m.m0.h.g r2 = (p421m.p422m0.p427h.C7909g) r2
            m.e0 r0 = r2.f15764f
            m.m0.g.e r3 = r2.f15760b
            d.t.p r4 = p298d.p334t.C6798p.f13713g
            r7 = 1
            r8 = r4
            r9 = 0
            r10 = 0
            r4 = r0
            r0 = r7
        L_0x0018:
            java.util.Objects.requireNonNull(r3)
            java.lang.String r11 = "request"
            p298d.p344x.p346c.C6888i.m12438e(r4, r11)
            m.m0.g.c r11 = r3.f15694o
            if (r11 != 0) goto L_0x0026
            r11 = r7
            goto L_0x0027
        L_0x0026:
            r11 = 0
        L_0x0027:
            if (r11 == 0) goto L_0x02f7
            monitor-enter(r3)
            boolean r11 = r3.f15696q     // Catch:{ all -> 0x02f2 }
            r11 = r11 ^ r7
            if (r11 == 0) goto L_0x02e2
            boolean r11 = r3.f15695p     // Catch:{ all -> 0x02f2 }
            r11 = r11 ^ r7
            if (r11 == 0) goto L_0x02d4
            monitor-exit(r3)
            if (r0 == 0) goto L_0x0092
            m.m0.g.d r0 = new m.m0.g.d
            m.m0.g.j r11 = r3.f15686g
            m.z r12 = r4.f15528b
            boolean r13 = r12.f16102a
            if (r13 == 0) goto L_0x005a
            m.c0 r13 = r3.f15701v
            javax.net.ssl.SSLSocketFactory r14 = r13.f15474u
            if (r14 == 0) goto L_0x0052
            javax.net.ssl.HostnameVerifier r15 = r13.f15478y
            m.h r13 = r13.f15479z
            r19 = r13
            r17 = r14
            r18 = r15
            goto L_0x0060
        L_0x0052:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "CLEARTEXT-only client"
            r0.<init>(r2)
            throw r0
        L_0x005a:
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x0060:
            m.a r15 = new m.a
            java.lang.String r13 = r12.f16106e
            int r14 = r12.f16107f
            m.c0 r12 = r3.f15701v
            m.t r5 = r12.f15470q
            javax.net.SocketFactory r6 = r12.f15473t
            m.c r7 = r12.f15472s
            r21 = 0
            r25 = r8
            java.util.List<m.d0> r8 = r12.f15477x
            r26 = r9
            java.util.List<m.n> r9 = r12.f15476w
            java.net.ProxySelector r12 = r12.f15471r
            r24 = r12
            r12 = r15
            r1 = r15
            r15 = r5
            r16 = r6
            r20 = r7
            r22 = r8
            r23 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            m.u r5 = r3.f15687h
            r0.<init>(r11, r1, r3, r5)
            r3.f15691l = r0
            goto L_0x0096
        L_0x0092:
            r25 = r8
            r26 = r9
        L_0x0096:
            boolean r0 = r3.f15698s     // Catch:{ all -> 0x02cb }
            if (r0 != 0) goto L_0x02be
            m.h0 r0 = r2.mo25663c(r4)     // Catch:{ l -> 0x0291, IOException -> 0x026b }
            if (r10 == 0) goto L_0x01ff
            java.lang.String r1 = "response"
            p298d.p344x.p346c.C6888i.m12438e(r0, r1)     // Catch:{ all -> 0x01f6 }
            m.e0 r1 = r0.f15549g     // Catch:{ all -> 0x01f6 }
            m.d0 r4 = r0.f15550h     // Catch:{ all -> 0x01f6 }
            int r5 = r0.f15552j     // Catch:{ all -> 0x01f6 }
            java.lang.String r6 = r0.f15551i     // Catch:{ all -> 0x01f6 }
            m.x r7 = r0.f15553k     // Catch:{ all -> 0x01f6 }
            m.y r8 = r0.f15554l     // Catch:{ all -> 0x01f6 }
            m.y$a r8 = r8.mo25841n()     // Catch:{ all -> 0x01f6 }
            m.j0 r9 = r0.f15555m     // Catch:{ all -> 0x01f6 }
            m.h0 r11 = r0.f15556n     // Catch:{ all -> 0x01f6 }
            m.h0 r12 = r0.f15557o     // Catch:{ all -> 0x01f6 }
            long r13 = r0.f15559q     // Catch:{ all -> 0x01f6 }
            r15 = r2
            r16 = r3
            long r2 = r0.f15560r     // Catch:{ all -> 0x01f4 }
            m.m0.g.c r0 = r0.f15561s     // Catch:{ all -> 0x01f4 }
            r17 = r15
            java.lang.String r15 = "response"
            p298d.p344x.p346c.C6888i.m12438e(r10, r15)     // Catch:{ all -> 0x01f4 }
            m.e0 r15 = r10.f15549g     // Catch:{ all -> 0x01f4 }
            r18 = r0
            m.d0 r0 = r10.f15550h     // Catch:{ all -> 0x01f4 }
            r19 = r2
            int r2 = r10.f15552j     // Catch:{ all -> 0x01f4 }
            java.lang.String r3 = r10.f15551i     // Catch:{ all -> 0x01f4 }
            r21 = r13
            m.x r13 = r10.f15553k     // Catch:{ all -> 0x01f4 }
            m.y r14 = r10.f15554l     // Catch:{ all -> 0x01f4 }
            m.y$a r14 = r14.mo25841n()     // Catch:{ all -> 0x01f4 }
            r23 = r12
            m.h0 r12 = r10.f15556n     // Catch:{ all -> 0x01f4 }
            r24 = r11
            m.h0 r11 = r10.f15557o     // Catch:{ all -> 0x01f4 }
            r43 = r9
            m.h0 r9 = r10.f15558p     // Catch:{ all -> 0x01f4 }
            r44 = r7
            r45 = r8
            long r7 = r10.f15559q     // Catch:{ all -> 0x01f4 }
            r46 = r4
            r47 = r5
            long r4 = r10.f15560r     // Catch:{ all -> 0x01f4 }
            m.m0.g.c r10 = r10.f15561s     // Catch:{ all -> 0x01f4 }
            r34 = 0
            if (r2 < 0) goto L_0x0102
            r27 = 1
            goto L_0x0104
        L_0x0102:
            r27 = 0
        L_0x0104:
            if (r27 == 0) goto L_0x01d9
            if (r15 == 0) goto L_0x01cd
            if (r0 == 0) goto L_0x01c1
            if (r3 == 0) goto L_0x01b5
            m.y r33 = r14.mo25846b()     // Catch:{ all -> 0x01f4 }
            m.h0 r14 = new m.h0     // Catch:{ all -> 0x01f4 }
            r27 = r14
            r28 = r15
            r29 = r0
            r30 = r3
            r31 = r2
            r32 = r13
            r35 = r12
            r36 = r11
            r37 = r9
            r38 = r7
            r40 = r4
            r42 = r10
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42)     // Catch:{ all -> 0x01f4 }
            m.j0 r0 = r14.f15555m     // Catch:{ all -> 0x01f4 }
            if (r0 != 0) goto L_0x0133
            r0 = 1
            goto L_0x0134
        L_0x0133:
            r0 = 0
        L_0x0134:
            if (r0 == 0) goto L_0x01a9
            if (r47 < 0) goto L_0x013a
            r0 = 1
            goto L_0x013b
        L_0x013a:
            r0 = 0
        L_0x013b:
            if (r0 == 0) goto L_0x018c
            if (r1 == 0) goto L_0x0180
            if (r46 == 0) goto L_0x0174
            if (r6 == 0) goto L_0x0168
            m.y r33 = r45.mo25846b()     // Catch:{ all -> 0x01f4 }
            m.h0 r0 = new m.h0     // Catch:{ all -> 0x01f4 }
            r27 = r0
            r28 = r1
            r29 = r46
            r30 = r6
            r31 = r47
            r32 = r44
            r34 = r43
            r35 = r24
            r36 = r23
            r37 = r14
            r38 = r21
            r40 = r19
            r42 = r18
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42)     // Catch:{ all -> 0x01f4 }
            goto L_0x0203
        L_0x0168:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "message == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x0174:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "protocol == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x0180:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "request == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x018c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f4 }
            r0.<init>()     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "code < 0: "
            r0.append(r1)     // Catch:{ all -> 0x01f4 }
            r1 = r47
            r0.append(r1)     // Catch:{ all -> 0x01f4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01f4 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01f4 }
            r1.<init>(r0)     // Catch:{ all -> 0x01f4 }
            throw r1     // Catch:{ all -> 0x01f4 }
        L_0x01a9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "priorResponse.body != null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x01b5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "message == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x01c1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "protocol == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x01cd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "request == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x01d9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f4 }
            r0.<init>()     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "code < 0: "
            r0.append(r1)     // Catch:{ all -> 0x01f4 }
            r0.append(r2)     // Catch:{ all -> 0x01f4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01f4 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01f4 }
            r1.<init>(r0)     // Catch:{ all -> 0x01f4 }
            throw r1     // Catch:{ all -> 0x01f4 }
        L_0x01f4:
            r0 = move-exception
            goto L_0x01f9
        L_0x01f6:
            r0 = move-exception
            r16 = r3
        L_0x01f9:
            r2 = r48
            r1 = r16
            goto L_0x02cf
        L_0x01ff:
            r17 = r2
            r16 = r3
        L_0x0203:
            r10 = r0
            r1 = r16
            m.m0.g.c r0 = r1.f15694o     // Catch:{ all -> 0x0266 }
            r2 = r48
            m.e0 r4 = r2.mo25664b(r10, r0)     // Catch:{ all -> 0x02c9 }
            if (r4 != 0) goto L_0x0235
            if (r0 == 0) goto L_0x0230
            boolean r0 = r0.f15659a     // Catch:{ all -> 0x02c9 }
            if (r0 == 0) goto L_0x0230
            boolean r0 = r1.f15693n     // Catch:{ all -> 0x02c9 }
            r3 = 1
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0224
            r1.f15693n = r3     // Catch:{ all -> 0x02c9 }
            m.m0.g.e$c r0 = r1.f15688i     // Catch:{ all -> 0x02c9 }
            r0.mo25870i()     // Catch:{ all -> 0x02c9 }
            goto L_0x0230
        L_0x0224:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02c9 }
            java.lang.String r3 = "Check failed."
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02c9 }
            r0.<init>(r3)     // Catch:{ all -> 0x02c9 }
            throw r0     // Catch:{ all -> 0x02c9 }
        L_0x0230:
            r3 = 0
            r1.mo25624i(r3)
            return r10
        L_0x0235:
            m.j0 r0 = r10.f15555m     // Catch:{ all -> 0x02c9 }
            if (r0 == 0) goto L_0x023c
            p421m.p422m0.C7867c.m14283d(r0)     // Catch:{ all -> 0x02c9 }
        L_0x023c:
            int r9 = r26 + 1
            r0 = 20
            if (r9 > r0) goto L_0x024f
            r3 = 1
            r1.mo25624i(r3)
            r3 = r1
            r1 = r2
            r2 = r17
            r8 = r25
            r0 = 1
            goto L_0x02b5
        L_0x024f:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ all -> 0x02c9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c9 }
            r3.<init>()     // Catch:{ all -> 0x02c9 }
            java.lang.String r4 = "Too many follow-up requests: "
            r3.append(r4)     // Catch:{ all -> 0x02c9 }
            r3.append(r9)     // Catch:{ all -> 0x02c9 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02c9 }
            r0.<init>(r3)     // Catch:{ all -> 0x02c9 }
            throw r0     // Catch:{ all -> 0x02c9 }
        L_0x0266:
            r0 = move-exception
            r2 = r48
            goto L_0x02cf
        L_0x026b:
            r0 = move-exception
            r17 = r2
            r1 = r3
            r2 = r48
            r3 = r0
            boolean r0 = r3 instanceof p421m.p422m0.p429j.C7921a     // Catch:{ all -> 0x02c9 }
            if (r0 != 0) goto L_0x0279
            r0 = 1
            goto L_0x027a
        L_0x0279:
            r0 = 0
        L_0x027a:
            boolean r0 = r2.mo25665c(r3, r1, r4, r0)     // Catch:{ all -> 0x02c9 }
            r5 = r25
            if (r0 == 0) goto L_0x028d
            java.util.List r0 = p298d.p334t.C6790h.m12323J(r5, r3)     // Catch:{ all -> 0x02c9 }
            r3 = 1
            r1.mo25624i(r3)
            r8 = r0
            r6 = 0
            goto L_0x02ae
        L_0x028d:
            p421m.p422m0.C7867c.m14279B(r3, r5)     // Catch:{ all -> 0x02c9 }
            throw r3     // Catch:{ all -> 0x02c9 }
        L_0x0291:
            r0 = move-exception
            r17 = r2
            r1 = r3
            r5 = r25
            r2 = r48
            r3 = r0
            java.io.IOException r0 = r3.f15737g     // Catch:{ all -> 0x02c9 }
            r6 = 0
            boolean r0 = r2.mo25665c(r0, r1, r4, r6)     // Catch:{ all -> 0x02c9 }
            if (r0 == 0) goto L_0x02b8
            java.io.IOException r0 = r3.f15738h     // Catch:{ all -> 0x02c9 }
            java.util.List r0 = p298d.p334t.C6790h.m12323J(r5, r0)     // Catch:{ all -> 0x02c9 }
            r3 = 1
            r1.mo25624i(r3)
            r8 = r0
        L_0x02ae:
            r3 = r1
            r1 = r2
            r0 = r6
            r2 = r17
            r9 = r26
        L_0x02b5:
            r7 = 1
            goto L_0x0018
        L_0x02b8:
            java.io.IOException r0 = r3.f15738h     // Catch:{ all -> 0x02c9 }
            p421m.p422m0.C7867c.m14279B(r0, r5)     // Catch:{ all -> 0x02c9 }
            throw r0     // Catch:{ all -> 0x02c9 }
        L_0x02be:
            r2 = r48
            r1 = r3
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x02c9 }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x02c9 }
            throw r0     // Catch:{ all -> 0x02c9 }
        L_0x02c9:
            r0 = move-exception
            goto L_0x02cf
        L_0x02cb:
            r0 = move-exception
            r2 = r48
            r1 = r3
        L_0x02cf:
            r3 = 1
            r1.mo25624i(r3)
            throw r0
        L_0x02d4:
            r2 = r1
            r1 = r3
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02f0 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02f0 }
            r3.<init>(r0)     // Catch:{ all -> 0x02f0 }
            throw r3     // Catch:{ all -> 0x02f0 }
        L_0x02e2:
            r2 = r1
            r1 = r3
            java.lang.String r0 = "cannot make a new request because the previous response is still open: please call response.close()"
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02f0 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02f0 }
            r3.<init>(r0)     // Catch:{ all -> 0x02f0 }
            throw r3     // Catch:{ all -> 0x02f0 }
        L_0x02f0:
            r0 = move-exception
            goto L_0x02f5
        L_0x02f2:
            r0 = move-exception
            r2 = r1
            r1 = r3
        L_0x02f5:
            monitor-exit(r1)
            throw r0
        L_0x02f7:
            r2 = r1
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p427h.C7911i.mo18360a(m.a0$a):m.h0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r13.f15660b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p421m.C7839e0 mo25664b(p421m.C7850h0 r12, p421m.p422m0.p426g.C7883c r13) {
        /*
            r11 = this;
            r0 = 0
            if (r13 == 0) goto L_0x000a
            m.m0.g.i r1 = r13.f15660b
            if (r1 == 0) goto L_0x000a
            m.k0 r1 = r1.f15729q
            goto L_0x000b
        L_0x000a:
            r1 = r0
        L_0x000b:
            int r2 = r12.f15552j
            m.e0 r3 = r12.f15549g
            java.lang.String r3 = r3.f15529c
            r4 = 0
            r5 = 308(0x134, float:4.32E-43)
            r6 = 307(0x133, float:4.3E-43)
            r7 = 1
            if (r2 == r6) goto L_0x00b3
            if (r2 == r5) goto L_0x00b3
            r8 = 401(0x191, float:5.62E-43)
            if (r2 == r8) goto L_0x00aa
            r8 = 421(0x1a5, float:5.9E-43)
            if (r2 == r8) goto L_0x0081
            r13 = 503(0x1f7, float:7.05E-43)
            if (r2 == r13) goto L_0x006b
            r13 = 407(0x197, float:5.7E-43)
            if (r2 == r13) goto L_0x004d
            r13 = 408(0x198, float:5.72E-43)
            if (r2 == r13) goto L_0x0033
            switch(r2) {
                case 300: goto L_0x00b3;
                case 301: goto L_0x00b3;
                case 302: goto L_0x00b3;
                case 303: goto L_0x00b3;
                default: goto L_0x0032;
            }
        L_0x0032:
            return r0
        L_0x0033:
            m.c0 r1 = r11.f15771a
            boolean r1 = r1.f15465l
            if (r1 != 0) goto L_0x003a
            return r0
        L_0x003a:
            m.h0 r1 = r12.f15558p
            if (r1 == 0) goto L_0x0043
            int r1 = r1.f15552j
            if (r1 != r13) goto L_0x0043
            return r0
        L_0x0043:
            int r13 = r11.mo25666d(r12, r4)
            if (r13 <= 0) goto L_0x004a
            return r0
        L_0x004a:
            m.e0 r12 = r12.f15549g
            return r12
        L_0x004d:
            p298d.p344x.p346c.C6888i.m12436c(r1)
            java.net.Proxy r13 = r1.f15605b
            java.net.Proxy$Type r13 = r13.type()
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r13 != r0) goto L_0x0063
            m.c0 r13 = r11.f15771a
            m.c r13 = r13.f15472s
            m.e0 r12 = r13.mo25520a(r1, r12)
            return r12
        L_0x0063:
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r13 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r12.<init>(r13)
            throw r12
        L_0x006b:
            m.h0 r1 = r12.f15558p
            if (r1 == 0) goto L_0x0074
            int r1 = r1.f15552j
            if (r1 != r13) goto L_0x0074
            return r0
        L_0x0074:
            r13 = 2147483647(0x7fffffff, float:NaN)
            int r13 = r11.mo25666d(r12, r13)
            if (r13 != 0) goto L_0x0080
            m.e0 r12 = r12.f15549g
            return r12
        L_0x0080:
            return r0
        L_0x0081:
            if (r13 == 0) goto L_0x00a9
            m.m0.g.d r1 = r13.f15663e
            m.a r1 = r1.f15683h
            m.z r1 = r1.f15435a
            java.lang.String r1 = r1.f16106e
            m.m0.g.i r2 = r13.f15660b
            m.k0 r2 = r2.f15729q
            m.a r2 = r2.f15604a
            m.z r2 = r2.f15435a
            java.lang.String r2 = r2.f16106e
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r2)
            r1 = r1 ^ r7
            if (r1 != 0) goto L_0x009d
            goto L_0x00a9
        L_0x009d:
            m.m0.g.i r13 = r13.f15660b
            monitor-enter(r13)
            r13.f15722j = r7     // Catch:{ all -> 0x00a6 }
            monitor-exit(r13)
            m.e0 r12 = r12.f15549g
            return r12
        L_0x00a6:
            r12 = move-exception
            monitor-exit(r13)
            throw r12
        L_0x00a9:
            return r0
        L_0x00aa:
            m.c0 r13 = r11.f15771a
            m.c r13 = r13.f15466m
            m.e0 r12 = r13.mo25520a(r1, r12)
            return r12
        L_0x00b3:
            m.c0 r13 = r11.f15771a
            boolean r13 = r13.f15467n
            if (r13 != 0) goto L_0x00bb
            goto L_0x0161
        L_0x00bb:
            r13 = 2
            java.lang.String r1 = "Location"
            java.lang.String r13 = p421m.C7850h0.m14257d(r12, r1, r0, r13)
            if (r13 == 0) goto L_0x0161
            m.e0 r1 = r12.f15549g
            m.z r1 = r1.f15528b
            java.util.Objects.requireNonNull(r1)
            java.lang.String r2 = "link"
            p298d.p344x.p346c.C6888i.m12438e(r13, r2)
            p298d.p344x.p346c.C6888i.m12438e(r13, r2)
            m.z$a r2 = new m.z$a     // Catch:{ IllegalArgumentException -> 0x00dc }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x00dc }
            r2.mo25864d(r1, r13)     // Catch:{ IllegalArgumentException -> 0x00dc }
            goto L_0x00dd
        L_0x00dc:
            r2 = r0
        L_0x00dd:
            if (r2 == 0) goto L_0x00e4
            m.z r13 = r2.mo25861a()
            goto L_0x00e5
        L_0x00e4:
            r13 = r0
        L_0x00e5:
            if (r13 == 0) goto L_0x0161
            java.lang.String r1 = r13.f16103b
            m.e0 r2 = r12.f15549g
            m.z r2 = r2.f15528b
            java.lang.String r2 = r2.f16103b
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r2)
            if (r1 != 0) goto L_0x00fc
            m.c0 r1 = r11.f15771a
            boolean r1 = r1.f15468o
            if (r1 != 0) goto L_0x00fc
            goto L_0x0161
        L_0x00fc:
            m.e0 r1 = r12.f15549g
            java.util.Objects.requireNonNull(r1)
            m.e0$a r2 = new m.e0$a
            r2.<init>(r1)
            boolean r1 = p421m.p422m0.p427h.C7908f.m14396a(r3)
            if (r1 == 0) goto L_0x014b
            int r1 = r12.f15552j
            java.lang.String r8 = "method"
            p298d.p344x.p346c.C6888i.m12438e(r3, r8)
            java.lang.String r9 = "PROPFIND"
            boolean r10 = p298d.p344x.p346c.C6888i.m12434a(r3, r9)
            if (r10 != 0) goto L_0x011f
            if (r1 == r5) goto L_0x011f
            if (r1 != r6) goto L_0x0120
        L_0x011f:
            r4 = r7
        L_0x0120:
            p298d.p344x.p346c.C6888i.m12438e(r3, r8)
            boolean r8 = p298d.p344x.p346c.C6888i.m12434a(r3, r9)
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x0131
            if (r1 == r5) goto L_0x0131
            if (r1 == r6) goto L_0x0131
            java.lang.String r3 = "GET"
            goto L_0x0137
        L_0x0131:
            if (r4 == 0) goto L_0x0137
            m.e0 r0 = r12.f15549g
            m.g0 r0 = r0.f15531e
        L_0x0137:
            r2.mo25537c(r3, r0)
            if (r4 != 0) goto L_0x014b
            java.lang.String r0 = "Transfer-Encoding"
            r2.mo25539e(r0)
            java.lang.String r0 = "Content-Length"
            r2.mo25539e(r0)
            java.lang.String r0 = "Content-Type"
            r2.mo25539e(r0)
        L_0x014b:
            m.e0 r12 = r12.f15549g
            m.z r12 = r12.f15528b
            boolean r12 = p421m.p422m0.C7867c.m14280a(r12, r13)
            if (r12 != 0) goto L_0x015a
            java.lang.String r12 = "Authorization"
            r2.mo25539e(r12)
        L_0x015a:
            r2.mo25541g(r13)
            m.e0 r0 = r2.mo25535a()
        L_0x0161:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p427h.C7911i.mo25664b(m.h0, m.m0.g.c):m.e0");
    }

    /* renamed from: c */
    public final boolean mo25665c(IOException iOException, C7887e eVar, C7839e0 e0Var, boolean z) {
        boolean z2;
        C7899m mVar;
        C7894i iVar;
        if (!this.f15771a.f15465l) {
            return false;
        }
        if (z) {
            C7844g0 g0Var = e0Var.f15531e;
            if (iOException instanceof FileNotFoundException) {
                return false;
            }
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z))) {
            return false;
        }
        C7886d dVar = eVar.f15691l;
        C6888i.m12436c(dVar);
        int i = dVar.f15678c;
        if (i == 0 && dVar.f15679d == 0 && dVar.f15680e == 0) {
            z2 = false;
        } else {
            if (dVar.f15681f == null) {
                C7860k0 k0Var = null;
                if (i <= 1 && dVar.f15679d <= 1 && dVar.f15680e <= 0 && (iVar = dVar.f15684i.f15692m) != null) {
                    synchronized (iVar) {
                        if (iVar.f15723k == 0) {
                            if (C7867c.m14280a(iVar.f15729q.f15604a.f15435a, dVar.f15683h.f15435a)) {
                                k0Var = iVar.f15729q;
                            }
                        }
                    }
                }
                if (k0Var != null) {
                    dVar.f15681f = k0Var;
                } else {
                    C7899m.C7900a aVar = dVar.f15676a;
                    if ((aVar == null || !aVar.mo25649a()) && (mVar = dVar.f15677b) != null) {
                        z2 = mVar.mo25647a();
                    }
                }
            }
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final int mo25666d(C7850h0 h0Var, int i) {
        String d = C7850h0.m14257d(h0Var, "Retry-After", (String) null, 2);
        if (d == null) {
            return i;
        }
        C6888i.m12438e("\\d+", "pattern");
        Pattern compile = Pattern.compile("\\d+");
        C6888i.m12437d(compile, "Pattern.compile(pattern)");
        C6888i.m12438e(compile, "nativePattern");
        C6888i.m12438e(d, "input");
        if (!compile.matcher(d).matches()) {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        Integer valueOf = Integer.valueOf(d);
        C6888i.m12437d(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }
}
