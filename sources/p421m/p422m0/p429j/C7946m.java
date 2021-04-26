package p421m.p422m0.p429j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p298d.p344x.p346c.C6888i;
import p421m.C7831c0;
import p421m.C7835d0;
import p421m.C7839e0;
import p421m.C7850h0;
import p421m.C8022y;
import p421m.C8025z;
import p421m.p422m0.C7867c;
import p421m.p422m0.p426g.C7894i;
import p421m.p422m0.p427h.C7906d;
import p421m.p422m0.p427h.C7907e;
import p421m.p422m0.p427h.C7909g;
import p421m.p422m0.p429j.C7950o;
import p435n.C8030a0;
import p435n.C8044h;
import p435n.C8064y;

/* renamed from: m.m0.j.m */
public final class C7946m implements C7906d {

    /* renamed from: g */
    public static final List<String> f15921g = C7867c.m14291l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    public static final List<String> f15922h = C7867c.m14291l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    public volatile C7950o f15923a;

    /* renamed from: b */
    public final C7835d0 f15924b;

    /* renamed from: c */
    public volatile boolean f15925c;

    /* renamed from: d */
    public final C7894i f15926d;

    /* renamed from: e */
    public final C7909g f15927e;

    /* renamed from: f */
    public final C7929f f15928f;

    public C7946m(C7831c0 c0Var, C7894i iVar, C7909g gVar, C7929f fVar) {
        C6888i.m12438e(c0Var, "client");
        C6888i.m12438e(iVar, "connection");
        C6888i.m12438e(gVar, "chain");
        C6888i.m12438e(fVar, "http2Connection");
        this.f15926d = iVar;
        this.f15927e = gVar;
        this.f15928f = fVar;
        List<C7835d0> list = c0Var.f15477x;
        C7835d0 d0Var = C7835d0.H2_PRIOR_KNOWLEDGE;
        this.f15924b = !list.contains(d0Var) ? C7835d0.HTTP_2 : d0Var;
    }

    /* renamed from: a */
    public void mo25653a() {
        C7950o oVar = this.f15923a;
        C6888i.m12436c(oVar);
        ((C7950o.C7951a) oVar.mo25724g()).close();
    }

    /* renamed from: b */
    public void mo25654b(C7839e0 e0Var) {
        int i;
        C7950o oVar;
        C6888i.m12438e(e0Var, "request");
        if (this.f15923a == null) {
            boolean z = false;
            boolean z2 = e0Var.f15531e != null;
            C6888i.m12438e(e0Var, "request");
            C8022y yVar = e0Var.f15530d;
            ArrayList arrayList = new ArrayList(yVar.size() + 4);
            arrayList.add(new C7924c(C7924c.f15811f, e0Var.f15529c));
            C8044h hVar = C7924c.f15812g;
            C8025z zVar = e0Var.f15528b;
            C6888i.m12438e(zVar, "url");
            String b = zVar.mo25852b();
            String d = zVar.mo25854d();
            if (d != null) {
                b = b + '?' + d;
            }
            arrayList.add(new C7924c(hVar, b));
            String b2 = e0Var.mo25533b("Host");
            if (b2 != null) {
                arrayList.add(new C7924c(C7924c.f15814i, b2));
            }
            arrayList.add(new C7924c(C7924c.f15813h, e0Var.f15528b.f16103b));
            int size = yVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                String l = yVar.mo25840l(i2);
                Locale locale = Locale.US;
                C6888i.m12437d(locale, "Locale.US");
                Objects.requireNonNull(l, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = l.toLowerCase(locale);
                C6888i.m12437d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!f15921g.contains(lowerCase) || (C6888i.m12434a(lowerCase, "te") && C6888i.m12434a(yVar.mo25842q(i2), "trailers"))) {
                    arrayList.add(new C7924c(lowerCase, yVar.mo25842q(i2)));
                }
            }
            C7929f fVar = this.f15928f;
            Objects.requireNonNull(fVar);
            C6888i.m12438e(arrayList, "requestHeaders");
            boolean z3 = !z2;
            synchronized (fVar.f15851F) {
                synchronized (fVar) {
                    if (fVar.f15859l > 1073741823) {
                        fVar.mo25692H(C7922b.REFUSED_STREAM);
                    }
                    if (!fVar.f15860m) {
                        i = fVar.f15859l;
                        fVar.f15859l = i + 2;
                        oVar = new C7950o(i, fVar, z3, false, (C8022y) null);
                        if (!z2 || fVar.f15848C >= fVar.f15849D || oVar.f15943c >= oVar.f15944d) {
                            z = true;
                        }
                        if (oVar.mo25726i()) {
                            fVar.f15856i.put(Integer.valueOf(i), oVar);
                        }
                    } else {
                        throw new C7921a();
                    }
                }
                fVar.f15851F.mo25743z(z3, i, arrayList);
            }
            if (z) {
                fVar.f15851F.flush();
            }
            this.f15923a = oVar;
            if (!this.f15925c) {
                C7950o oVar2 = this.f15923a;
                C6888i.m12436c(oVar2);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                oVar2.f15949i.mo25879g((long) this.f15927e.f15766h, timeUnit);
                C7950o oVar3 = this.f15923a;
                C6888i.m12436c(oVar3);
                oVar3.f15950j.mo25879g((long) this.f15927e.f15767i, timeUnit);
                return;
            }
            C7950o oVar4 = this.f15923a;
            C6888i.m12436c(oVar4);
            oVar4.mo25722e(C7922b.CANCEL);
            throw new IOException("Canceled");
        }
    }

    /* renamed from: c */
    public void mo25655c() {
        this.f15928f.f15851F.flush();
    }

    public void cancel() {
        this.f15925c = true;
        C7950o oVar = this.f15923a;
        if (oVar != null) {
            oVar.mo25722e(C7922b.CANCEL);
        }
    }

    /* renamed from: d */
    public long mo25657d(C7850h0 h0Var) {
        C6888i.m12438e(h0Var, "response");
        if (!C7907e.m14391a(h0Var)) {
            return 0;
        }
        return C7867c.m14290k(h0Var);
    }

    /* renamed from: e */
    public C8030a0 mo25658e(C7850h0 h0Var) {
        C6888i.m12438e(h0Var, "response");
        C7950o oVar = this.f15923a;
        C6888i.m12436c(oVar);
        return oVar.f15947g;
    }

    /* renamed from: f */
    public C8064y mo25659f(C7839e0 e0Var, long j) {
        C6888i.m12438e(e0Var, "request");
        C7950o oVar = this.f15923a;
        C6888i.m12436c(oVar);
        return oVar.mo25724g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e9, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ea, code lost:
        r0.f15949i.mo25732l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ef, code lost:
        throw r12;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p421m.C7850h0.C7851a mo25660g(boolean r12) {
        /*
            r11 = this;
            m.m0.j.o r0 = r11.f15923a
            p298d.p344x.p346c.C6888i.m12436c(r0)
            monitor-enter(r0)
            m.m0.j.o$c r1 = r0.f15949i     // Catch:{ all -> 0x00f0 }
            r1.mo25869h()     // Catch:{ all -> 0x00f0 }
        L_0x000b:
            java.util.ArrayDeque<m.y> r1 = r0.f15945e     // Catch:{ all -> 0x00e9 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00e9 }
            if (r1 == 0) goto L_0x001b
            m.m0.j.b r1 = r0.f15951k     // Catch:{ all -> 0x00e9 }
            if (r1 != 0) goto L_0x001b
            r0.mo25729l()     // Catch:{ all -> 0x00e9 }
            goto L_0x000b
        L_0x001b:
            m.m0.j.o$c r1 = r0.f15949i     // Catch:{ all -> 0x00f0 }
            r1.mo25732l()     // Catch:{ all -> 0x00f0 }
            java.util.ArrayDeque<m.y> r1 = r0.f15945e     // Catch:{ all -> 0x00f0 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00f0 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00d9
            java.util.ArrayDeque<m.y> r1 = r0.f15945e     // Catch:{ all -> 0x00f0 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x00f0 }
            java.lang.String r2 = "headersQueue.removeFirst()"
            p298d.p344x.p346c.C6888i.m12437d(r1, r2)     // Catch:{ all -> 0x00f0 }
            m.y r1 = (p421m.C8022y) r1     // Catch:{ all -> 0x00f0 }
            monitor-exit(r0)
            m.d0 r0 = r11.f15924b
            java.lang.String r2 = "headerBlock"
            p298d.p344x.p346c.C6888i.m12438e(r1, r2)
            java.lang.String r2 = "protocol"
            p298d.p344x.p346c.C6888i.m12438e(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            int r3 = r1.size()
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r5
        L_0x0053:
            if (r6 >= r3) goto L_0x009e
            java.lang.String r8 = r1.mo25840l(r6)
            java.lang.String r9 = r1.mo25842q(r6)
            java.lang.String r10 = ":status"
            boolean r10 = p298d.p344x.p346c.C6888i.m12434a(r8, r10)
            if (r10 == 0) goto L_0x007b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "HTTP/1.1 "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            m.m0.h.j r7 = p421m.p422m0.p427h.C7912j.m14407a(r7)
            goto L_0x009b
        L_0x007b:
            java.util.List<java.lang.String> r10 = f15922h
            boolean r10 = r10.contains(r8)
            if (r10 != 0) goto L_0x009b
            java.lang.String r10 = "name"
            p298d.p344x.p346c.C6888i.m12438e(r8, r10)
            java.lang.String r10 = "value"
            p298d.p344x.p346c.C6888i.m12438e(r9, r10)
            r2.add(r8)
            java.lang.CharSequence r8 = p298d.p415c0.C7694h.m13921L(r9)
            java.lang.String r8 = r8.toString()
            r2.add(r8)
        L_0x009b:
            int r6 = r6 + 1
            goto L_0x0053
        L_0x009e:
            if (r7 == 0) goto L_0x00d1
            m.h0$a r1 = new m.h0$a
            r1.<init>()
            r1.mo25563f(r0)
            int r0 = r7.f15773b
            r1.f15564c = r0
            java.lang.String r0 = r7.f15774c
            r1.mo25562e(r0)
            m.y r0 = new m.y
            java.lang.String[] r3 = new java.lang.String[r4]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.<init>(r2, r5)
            r1.mo25561d(r0)
            if (r12 == 0) goto L_0x00cf
            int r12 = r1.f15564c
            r0 = 100
            if (r12 != r0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r5 = r1
        L_0x00d0:
            return r5
        L_0x00d1:
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r0 = "Expected ':status' header not present"
            r12.<init>(r0)
            throw r12
        L_0x00d9:
            java.io.IOException r12 = r0.f15952l     // Catch:{ all -> 0x00f0 }
            if (r12 == 0) goto L_0x00de
            goto L_0x00e8
        L_0x00de:
            m.m0.j.u r12 = new m.m0.j.u     // Catch:{ all -> 0x00f0 }
            m.m0.j.b r1 = r0.f15951k     // Catch:{ all -> 0x00f0 }
            p298d.p344x.p346c.C6888i.m12436c(r1)     // Catch:{ all -> 0x00f0 }
            r12.<init>(r1)     // Catch:{ all -> 0x00f0 }
        L_0x00e8:
            throw r12     // Catch:{ all -> 0x00f0 }
        L_0x00e9:
            r12 = move-exception
            m.m0.j.o$c r1 = r0.f15949i     // Catch:{ all -> 0x00f0 }
            r1.mo25732l()     // Catch:{ all -> 0x00f0 }
            throw r12     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p429j.C7946m.mo25660g(boolean):m.h0$a");
    }

    /* renamed from: h */
    public C7894i mo25661h() {
        return this.f15926d;
    }
}
