package p421m.p422m0.p429j;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.C6777r;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p421m.p422m0.C7867c;
import p421m.p422m0.p425f.C7873a;
import p421m.p422m0.p425f.C7875c;
import p421m.p422m0.p425f.C7876d;
import p421m.p422m0.p429j.C7947n;
import p421m.p422m0.p429j.C7950o;
import p421m.p422m0.p430k.C7976h;
import p435n.C8040e;
import p435n.C8042f;
import p435n.C8043g;
import p435n.C8044h;

/* renamed from: m.m0.j.f */
public final class C7929f implements Closeable {

    /* renamed from: I */
    public static final C7959t f15844I;

    /* renamed from: J */
    public static final C7929f f15845J = null;

    /* renamed from: A */
    public long f15846A;

    /* renamed from: B */
    public long f15847B;

    /* renamed from: C */
    public long f15848C;

    /* renamed from: D */
    public long f15849D;

    /* renamed from: E */
    public final Socket f15850E;

    /* renamed from: F */
    public final C7954p f15851F;

    /* renamed from: G */
    public final C7934d f15852G;

    /* renamed from: H */
    public final Set<Integer> f15853H;

    /* renamed from: g */
    public final boolean f15854g;

    /* renamed from: h */
    public final C7932c f15855h;

    /* renamed from: i */
    public final Map<Integer, C7950o> f15856i = new LinkedHashMap();

    /* renamed from: j */
    public final String f15857j;

    /* renamed from: k */
    public int f15858k;

    /* renamed from: l */
    public int f15859l;

    /* renamed from: m */
    public boolean f15860m;

    /* renamed from: n */
    public final C7876d f15861n;

    /* renamed from: o */
    public final C7875c f15862o;

    /* renamed from: p */
    public final C7875c f15863p;

    /* renamed from: q */
    public final C7875c f15864q;

    /* renamed from: r */
    public final C7958s f15865r;

    /* renamed from: s */
    public long f15866s;

    /* renamed from: t */
    public long f15867t;

    /* renamed from: u */
    public long f15868u;

    /* renamed from: v */
    public long f15869v;

    /* renamed from: w */
    public long f15870w;

    /* renamed from: x */
    public long f15871x;

    /* renamed from: y */
    public final C7959t f15872y;

    /* renamed from: z */
    public C7959t f15873z;

    /* renamed from: m.m0.j.f$a */
    public static final class C7930a extends C7873a {

        /* renamed from: e */
        public final /* synthetic */ C7929f f15874e;

        /* renamed from: f */
        public final /* synthetic */ long f15875f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7930a(String str, String str2, C7929f fVar, long j) {
            super(str2, true);
            this.f15874e = fVar;
            this.f15875f = j;
        }

        /* renamed from: a */
        public long mo25587a() {
            C7929f fVar;
            boolean z;
            synchronized (this.f15874e) {
                fVar = this.f15874e;
                long j = fVar.f15867t;
                long j2 = fVar.f15866s;
                if (j < j2) {
                    z = true;
                } else {
                    fVar.f15866s = j2 + 1;
                    z = false;
                }
            }
            if (z) {
                C7922b bVar = C7922b.PROTOCOL_ERROR;
                fVar.mo25698d(bVar, bVar, (IOException) null);
                return -1;
            }
            fVar.mo25695S(false, 1, 0);
            return this.f15875f;
        }
    }

    /* renamed from: m.m0.j.f$b */
    public static final class C7931b {

        /* renamed from: a */
        public Socket f15876a;

        /* renamed from: b */
        public String f15877b;

        /* renamed from: c */
        public C8043g f15878c;

        /* renamed from: d */
        public C8042f f15879d;

        /* renamed from: e */
        public C7932c f15880e = C7932c.f15885a;

        /* renamed from: f */
        public C7958s f15881f = C7958s.f15980a;

        /* renamed from: g */
        public int f15882g;

        /* renamed from: h */
        public boolean f15883h;

        /* renamed from: i */
        public final C7876d f15884i;

        public C7931b(boolean z, C7876d dVar) {
            C6888i.m12438e(dVar, "taskRunner");
            this.f15883h = z;
            this.f15884i = dVar;
        }
    }

    /* renamed from: m.m0.j.f$c */
    public static abstract class C7932c {

        /* renamed from: a */
        public static final C7932c f15885a = new C7933a();

        /* renamed from: m.m0.j.f$c$a */
        public static final class C7933a extends C7932c {
            /* renamed from: b */
            public void mo25632b(C7950o oVar) {
                C6888i.m12438e(oVar, "stream");
                oVar.mo25720c(C7922b.REFUSED_STREAM, (IOException) null);
            }
        }

        /* renamed from: a */
        public void mo25631a(C7929f fVar, C7959t tVar) {
            C6888i.m12438e(fVar, "connection");
            C6888i.m12438e(tVar, "settings");
        }

        /* renamed from: b */
        public abstract void mo25632b(C7950o oVar);
    }

    /* renamed from: m.m0.j.f$d */
    public final class C7934d implements C7947n.C7949b, C6851a<C6777r> {

        /* renamed from: g */
        public final C7947n f15886g;

        /* renamed from: h */
        public final /* synthetic */ C7929f f15887h;

        /* renamed from: m.m0.j.f$d$a */
        public static final class C7935a extends C7873a {

            /* renamed from: e */
            public final /* synthetic */ C7950o f15888e;

            /* renamed from: f */
            public final /* synthetic */ C7934d f15889f;

            /* renamed from: g */
            public final /* synthetic */ List f15890g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C7935a(String str, boolean z, String str2, boolean z2, C7950o oVar, C7934d dVar, C7950o oVar2, int i, List list, boolean z3) {
                super(str2, z2);
                this.f15888e = oVar;
                this.f15889f = dVar;
                this.f15890g = list;
            }

            /* renamed from: a */
            public long mo25587a() {
                try {
                    this.f15889f.f15887h.f15855h.mo25632b(this.f15888e);
                    return -1;
                } catch (IOException e) {
                    C7976h.C7977a aVar = C7976h.f16015c;
                    C7976h hVar = C7976h.f16013a;
                    StringBuilder u = C0843a.m460u("Http2Connection.Listener failure for ");
                    u.append(this.f15889f.f15887h.f15857j);
                    hVar.mo25771i(u.toString(), 4, e);
                    try {
                        this.f15888e.mo25720c(C7922b.PROTOCOL_ERROR, e);
                        return -1;
                    } catch (IOException unused) {
                        return -1;
                    }
                }
            }
        }

        /* renamed from: m.m0.j.f$d$b */
        public static final class C7936b extends C7873a {

            /* renamed from: e */
            public final /* synthetic */ C7934d f15891e;

            /* renamed from: f */
            public final /* synthetic */ int f15892f;

            /* renamed from: g */
            public final /* synthetic */ int f15893g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C7936b(String str, boolean z, String str2, boolean z2, C7934d dVar, int i, int i2) {
                super(str2, z2);
                this.f15891e = dVar;
                this.f15892f = i;
                this.f15893g = i2;
            }

            /* renamed from: a */
            public long mo25587a() {
                this.f15891e.f15887h.mo25695S(true, this.f15892f, this.f15893g);
                return -1;
            }
        }

        /* renamed from: m.m0.j.f$d$c */
        public static final class C7937c extends C7873a {

            /* renamed from: e */
            public final /* synthetic */ C7934d f15894e;

            /* renamed from: f */
            public final /* synthetic */ boolean f15895f;

            /* renamed from: g */
            public final /* synthetic */ C7959t f15896g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C7937c(String str, boolean z, String str2, boolean z2, C7934d dVar, boolean z3, C7959t tVar) {
                super(str2, z2);
                this.f15894e = dVar;
                this.f15895f = z3;
                this.f15896g = tVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:35:0x00e5  */
            /* JADX WARNING: Removed duplicated region for block: B:60:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public long mo25587a() {
                /*
                    r21 = this;
                    r1 = r21
                    m.m0.j.f$d r13 = r1.f15894e
                    boolean r9 = r1.f15895f
                    m.m0.j.t r10 = r1.f15896g
                    java.util.Objects.requireNonNull(r13)
                    java.lang.String r0 = "settings"
                    p298d.p344x.p346c.C6888i.m12438e(r10, r0)
                    d.x.c.u r14 = new d.x.c.u
                    r14.<init>()
                    d.x.c.v r15 = new d.x.c.v
                    r15.<init>()
                    d.x.c.v r0 = new d.x.c.v
                    r0.<init>()
                    m.m0.j.f r2 = r13.f15887h
                    m.m0.j.p r12 = r2.f15851F
                    monitor-enter(r12)
                    m.m0.j.f r11 = r13.f15887h     // Catch:{ all -> 0x0113 }
                    monitor-enter(r11)     // Catch:{ all -> 0x0113 }
                    m.m0.j.f r2 = r13.f15887h     // Catch:{ all -> 0x010a }
                    m.m0.j.t r2 = r2.f15873z     // Catch:{ all -> 0x010a }
                    if (r9 == 0) goto L_0x002f
                    r3 = r10
                    goto L_0x003a
                L_0x002f:
                    m.m0.j.t r3 = new m.m0.j.t     // Catch:{ all -> 0x010a }
                    r3.<init>()     // Catch:{ all -> 0x010a }
                    r3.mo25750b(r2)     // Catch:{ all -> 0x010a }
                    r3.mo25750b(r10)     // Catch:{ all -> 0x010a }
                L_0x003a:
                    r0.f13801g = r3     // Catch:{ all -> 0x010a }
                    int r3 = r3.mo25749a()     // Catch:{ all -> 0x010a }
                    long r3 = (long) r3     // Catch:{ all -> 0x010a }
                    int r2 = r2.mo25749a()     // Catch:{ all -> 0x010a }
                    long r5 = (long) r2     // Catch:{ all -> 0x010a }
                    long r3 = r3 - r5
                    r14.f13800g = r3     // Catch:{ all -> 0x010a }
                    r7 = 0
                    int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                    r6 = 0
                    if (r2 == 0) goto L_0x0076
                    m.m0.j.f r2 = r13.f15887h     // Catch:{ all -> 0x010a }
                    java.util.Map<java.lang.Integer, m.m0.j.o> r2 = r2.f15856i     // Catch:{ all -> 0x010a }
                    boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x010a }
                    if (r2 == 0) goto L_0x005b
                    goto L_0x0076
                L_0x005b:
                    m.m0.j.f r2 = r13.f15887h     // Catch:{ all -> 0x010a }
                    java.util.Map<java.lang.Integer, m.m0.j.o> r2 = r2.f15856i     // Catch:{ all -> 0x010a }
                    java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x010a }
                    m.m0.j.o[] r3 = new p421m.p422m0.p429j.C7950o[r6]     // Catch:{ all -> 0x010a }
                    java.lang.Object[] r2 = r2.toArray(r3)     // Catch:{ all -> 0x010a }
                    if (r2 == 0) goto L_0x006e
                    m.m0.j.o[] r2 = (p421m.p422m0.p429j.C7950o[]) r2     // Catch:{ all -> 0x010a }
                    goto L_0x0077
                L_0x006e:
                    java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x010a }
                    java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T>"
                    r0.<init>(r2)     // Catch:{ all -> 0x010a }
                    throw r0     // Catch:{ all -> 0x010a }
                L_0x0076:
                    r2 = 0
                L_0x0077:
                    r15.f13801g = r2     // Catch:{ all -> 0x010a }
                    m.m0.j.f r2 = r13.f15887h     // Catch:{ all -> 0x010a }
                    T r3 = r0.f13801g     // Catch:{ all -> 0x010a }
                    m.m0.j.t r3 = (p421m.p422m0.p429j.C7959t) r3     // Catch:{ all -> 0x010a }
                    java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x010a }
                    java.lang.String r4 = "<set-?>"
                    p298d.p344x.p346c.C6888i.m12438e(r3, r4)     // Catch:{ all -> 0x010a }
                    r2.f15873z = r3     // Catch:{ all -> 0x010a }
                    m.m0.j.f r2 = r13.f15887h     // Catch:{ all -> 0x010a }
                    m.m0.f.c r5 = r2.f15864q     // Catch:{ all -> 0x010a }
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x010a }
                    r2.<init>()     // Catch:{ all -> 0x010a }
                    m.m0.j.f r3 = r13.f15887h     // Catch:{ all -> 0x010a }
                    java.lang.String r3 = r3.f15857j     // Catch:{ all -> 0x010a }
                    r2.append(r3)     // Catch:{ all -> 0x010a }
                    java.lang.String r3 = " onSettings"
                    r2.append(r3)     // Catch:{ all -> 0x010a }
                    java.lang.String r16 = r2.toString()     // Catch:{ all -> 0x010a }
                    r17 = 1
                    m.m0.j.g r4 = new m.m0.j.g     // Catch:{ all -> 0x010a }
                    r2 = r4
                    r3 = r16
                    r18 = r4
                    r4 = r17
                    r19 = r5
                    r5 = r16
                    r16 = r6
                    r6 = r17
                    r7 = r13
                    r8 = r0
                    r17 = r11
                    r11 = r14
                    r20 = r12
                    r12 = r15
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0108 }
                    r3 = r18
                    r2 = r19
                    r4 = 0
                    r2.mo25591c(r3, r4)     // Catch:{ all -> 0x0108 }
                    monitor-exit(r17)     // Catch:{ all -> 0x0111 }
                    m.m0.j.f r2 = r13.f15887h     // Catch:{ IOException -> 0x00d6 }
                    m.m0.j.p r2 = r2.f15851F     // Catch:{ IOException -> 0x00d6 }
                    T r0 = r0.f13801g     // Catch:{ IOException -> 0x00d6 }
                    m.m0.j.t r0 = (p421m.p422m0.p429j.C7959t) r0     // Catch:{ IOException -> 0x00d6 }
                    r2.mo25738d(r0)     // Catch:{ IOException -> 0x00d6 }
                    goto L_0x00de
                L_0x00d6:
                    r0 = move-exception
                    m.m0.j.f r2 = r13.f15887h     // Catch:{ all -> 0x0111 }
                    m.m0.j.b r3 = p421m.p422m0.p429j.C7922b.PROTOCOL_ERROR     // Catch:{ all -> 0x0111 }
                    r2.mo25698d(r3, r3, r0)     // Catch:{ all -> 0x0111 }
                L_0x00de:
                    monitor-exit(r20)
                    T r0 = r15.f13801g
                    m.m0.j.o[] r0 = (p421m.p422m0.p429j.C7950o[]) r0
                    if (r0 == 0) goto L_0x0105
                    p298d.p344x.p346c.C6888i.m12436c(r0)
                    int r2 = r0.length
                    r6 = r16
                L_0x00eb:
                    if (r6 >= r2) goto L_0x0105
                    r3 = r0[r6]
                    monitor-enter(r3)
                    long r7 = r14.f13800g     // Catch:{ all -> 0x0102 }
                    long r9 = r3.f15944d     // Catch:{ all -> 0x0102 }
                    long r9 = r9 + r7
                    r3.f15944d = r9     // Catch:{ all -> 0x0102 }
                    int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                    if (r7 <= 0) goto L_0x00fe
                    r3.notifyAll()     // Catch:{ all -> 0x0102 }
                L_0x00fe:
                    monitor-exit(r3)
                    int r6 = r6 + 1
                    goto L_0x00eb
                L_0x0102:
                    r0 = move-exception
                    monitor-exit(r3)
                    throw r0
                L_0x0105:
                    r2 = -1
                    return r2
                L_0x0108:
                    r0 = move-exception
                    goto L_0x010f
                L_0x010a:
                    r0 = move-exception
                    r17 = r11
                    r20 = r12
                L_0x010f:
                    monitor-exit(r17)     // Catch:{ all -> 0x0111 }
                    throw r0     // Catch:{ all -> 0x0111 }
                L_0x0111:
                    r0 = move-exception
                    goto L_0x0116
                L_0x0113:
                    r0 = move-exception
                    r20 = r12
                L_0x0116:
                    monitor-exit(r20)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p429j.C7929f.C7934d.C7937c.mo25587a():long");
            }
        }

        public C7934d(C7929f fVar, C7947n nVar) {
            C6888i.m12438e(nVar, "reader");
            this.f15887h = fVar;
            this.f15886g = nVar;
        }

        /* renamed from: a */
        public void mo25703a() {
        }

        /* renamed from: b */
        public void mo25704b(boolean z, int i, int i2) {
            if (z) {
                synchronized (this.f15887h) {
                    if (i == 1) {
                        this.f15887h.f15867t++;
                    } else if (i == 2) {
                        this.f15887h.f15869v++;
                    } else if (i == 3) {
                        C7929f fVar = this.f15887h;
                        fVar.f15870w++;
                        fVar.notifyAll();
                    }
                }
                return;
            }
            C7875c cVar = this.f15887h.f15862o;
            String p = C0843a.m455p(new StringBuilder(), this.f15887h.f15857j, " ping");
            cVar.mo25591c(new C7936b(p, true, p, true, this, i, i2), 0);
        }

        /* renamed from: c */
        public void mo25705c(boolean z, C7959t tVar) {
            C6888i.m12438e(tVar, "settings");
            C7875c cVar = this.f15887h.f15862o;
            String p = C0843a.m455p(new StringBuilder(), this.f15887h.f15857j, " applyAndAckSettings");
            cVar.mo25591c(new C7937c(p, true, p, true, this, z, tVar), 0);
        }

        /* renamed from: d */
        public void mo25706d(boolean z, int i, C8043g gVar, int i2) {
            boolean z2;
            boolean z3;
            long j;
            int i3 = i;
            C8043g gVar2 = gVar;
            int i4 = i2;
            C6888i.m12438e(gVar2, "source");
            if (this.f15887h.mo25701q(i3)) {
                C7929f fVar = this.f15887h;
                Objects.requireNonNull(fVar);
                C6888i.m12438e(gVar2, "source");
                C8040e eVar = new C8040e();
                long j2 = (long) i4;
                gVar2.mo25904d0(j2);
                gVar2.mo17031T(eVar, j2);
                String str = fVar.f15857j + '[' + i3 + "] onData";
                fVar.f15863p.mo25591c(new C7941h(str, true, str, true, fVar, i, eVar, i2, z), 0);
                return;
            }
            C7950o e = this.f15887h.mo25699e(i3);
            if (e == null) {
                this.f15887h.mo25696Z(i3, C7922b.PROTOCOL_ERROR);
                long j3 = (long) i4;
                this.f15887h.mo25693N(j3);
                gVar2.skip(j3);
                return;
            }
            C6888i.m12438e(gVar2, "source");
            byte[] bArr = C7867c.f15619a;
            C7950o.C7952b bVar = e.f15947g;
            long j4 = (long) i4;
            Objects.requireNonNull(bVar);
            C6888i.m12438e(gVar2, "source");
            while (true) {
                boolean z4 = true;
                if (j4 <= 0) {
                    break;
                }
                synchronized (C7950o.this) {
                    z2 = bVar.f15963k;
                    z3 = bVar.f15960h.f16140h + j4 > bVar.f15962j;
                }
                if (z3) {
                    gVar2.skip(j4);
                    C7950o.this.mo25722e(C7922b.FLOW_CONTROL_ERROR);
                    break;
                } else if (z2) {
                    gVar2.skip(j4);
                    break;
                } else {
                    long T = gVar2.mo17031T(bVar.f15959g, j4);
                    if (T != -1) {
                        j4 -= T;
                        synchronized (C7950o.this) {
                            if (bVar.f15961i) {
                                C8040e eVar2 = bVar.f15959g;
                                j = eVar2.f16140h;
                                eVar2.skip(j);
                            } else {
                                C8040e eVar3 = bVar.f15960h;
                                if (eVar3.f16140h != 0) {
                                    z4 = false;
                                }
                                eVar3.mo25918n(bVar.f15959g);
                                if (z4) {
                                    C7950o oVar = C7950o.this;
                                    if (oVar != null) {
                                        oVar.notifyAll();
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                    }
                                }
                                j = 0;
                            }
                        }
                        if (j > 0) {
                            bVar.mo25731d(j);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (z) {
                e.mo25727j(C7867c.f15620b, true);
            }
        }

        /* renamed from: e */
        public void mo25707e(int i, int i2, int i3, boolean z) {
        }

        /* renamed from: f */
        public void mo25708f(int i, C7922b bVar) {
            C6888i.m12438e(bVar, "errorCode");
            if (this.f15887h.mo25701q(i)) {
                C7929f fVar = this.f15887h;
                Objects.requireNonNull(fVar);
                C6888i.m12438e(bVar, "errorCode");
                String str = fVar.f15857j + '[' + i + "] onReset";
                fVar.f15863p.mo25591c(new C7944k(str, true, str, true, fVar, i, bVar), 0);
                return;
            }
            C7950o z = this.f15887h.mo25702z(i);
            if (z != null) {
                z.mo25728k(bVar);
            }
        }

        /* renamed from: g */
        public void mo25709g(int i, long j) {
            Object obj;
            if (i == 0) {
                Object obj2 = this.f15887h;
                synchronized (obj2) {
                    C7929f fVar = this.f15887h;
                    fVar.f15849D += j;
                    fVar.notifyAll();
                    obj = obj2;
                }
            } else {
                C7950o e = this.f15887h.mo25699e(i);
                if (e != null) {
                    synchronized (e) {
                        e.f15944d += j;
                        obj = e;
                        if (j > 0) {
                            e.notifyAll();
                            obj = e;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: h */
        public void mo25710h(boolean z, int i, int i2, List<C7924c> list) {
            int i3 = i;
            List<C7924c> list2 = list;
            C6888i.m12438e(list2, "headerBlock");
            if (this.f15887h.mo25701q(i3)) {
                C7929f fVar = this.f15887h;
                Objects.requireNonNull(fVar);
                C6888i.m12438e(list2, "requestHeaders");
                String str = fVar.f15857j + '[' + i3 + "] onHeaders";
                fVar.f15863p.mo25591c(new C7942i(str, true, str, true, fVar, i, list, z), 0);
                return;
            }
            synchronized (this.f15887h) {
                C7950o e = this.f15887h.mo25699e(i3);
                if (e == null) {
                    C7929f fVar2 = this.f15887h;
                    if (!fVar2.f15860m) {
                        if (i3 > fVar2.f15858k) {
                            if (i3 % 2 != fVar2.f15859l % 2) {
                                C7950o oVar = new C7950o(i, this.f15887h, false, z, C7867c.m14302w(list));
                                C7929f fVar3 = this.f15887h;
                                fVar3.f15858k = i3;
                                fVar3.f15856i.put(Integer.valueOf(i), oVar);
                                C7875c f = this.f15887h.f15861n.mo25599f();
                                String str2 = this.f15887h.f15857j + '[' + i3 + "] onStream";
                                C7935a aVar = r1;
                                C7935a aVar2 = new C7935a(str2, true, str2, true, oVar, this, e, i, list, z);
                                f.mo25591c(aVar, 0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                e.mo25727j(C7867c.m14302w(list), z);
            }
        }

        /* renamed from: i */
        public void mo25711i(int i, int i2, List<C7924c> list) {
            C6888i.m12438e(list, "requestHeaders");
            C7929f fVar = this.f15887h;
            Objects.requireNonNull(fVar);
            C6888i.m12438e(list, "requestHeaders");
            synchronized (fVar) {
                if (fVar.f15853H.contains(Integer.valueOf(i2))) {
                    fVar.mo25696Z(i2, C7922b.PROTOCOL_ERROR);
                    return;
                }
                fVar.f15853H.add(Integer.valueOf(i2));
                String str = fVar.f15857j + '[' + i2 + "] onRequest";
                fVar.f15863p.mo25591c(new C7943j(str, true, str, true, fVar, i2, list), 0);
            }
        }

        public Object invoke() {
            C7922b bVar;
            C7922b bVar2 = C7922b.INTERNAL_ERROR;
            e = null;
            try {
                this.f15886g.mo25715e(this);
                while (this.f15886g.mo25714d(false, this)) {
                }
                bVar = C7922b.NO_ERROR;
                try {
                    this.f15887h.mo25698d(bVar, C7922b.CANCEL, (IOException) null);
                } catch (IOException e) {
                    e = e;
                    try {
                        C7922b bVar3 = C7922b.PROTOCOL_ERROR;
                        this.f15887h.mo25698d(bVar3, bVar3, e);
                        C7867c.m14283d(this.f15886g);
                        return C6777r.f13694a;
                    } catch (Throwable th) {
                        th = th;
                        this.f15887h.mo25698d(bVar, bVar2, e);
                        C7867c.m14283d(this.f15886g);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                bVar = bVar2;
                C7922b bVar32 = C7922b.PROTOCOL_ERROR;
                this.f15887h.mo25698d(bVar32, bVar32, e);
                C7867c.m14283d(this.f15886g);
                return C6777r.f13694a;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                this.f15887h.mo25698d(bVar, bVar2, e);
                C7867c.m14283d(this.f15886g);
                throw th;
            }
            C7867c.m14283d(this.f15886g);
            return C6777r.f13694a;
        }

        /* renamed from: j */
        public void mo25712j(int i, C7922b bVar, C8044h hVar) {
            int i2;
            C7950o[] oVarArr;
            C6888i.m12438e(bVar, "errorCode");
            C6888i.m12438e(hVar, "debugData");
            hVar.mo25959l();
            synchronized (this.f15887h) {
                Object[] array = this.f15887h.f15856i.values().toArray(new C7950o[0]);
                if (array != null) {
                    oVarArr = (C7950o[]) array;
                    this.f15887h.f15860m = true;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (C7950o oVar : oVarArr) {
                if (oVar.f15953m > i && oVar.mo25725h()) {
                    oVar.mo25728k(C7922b.REFUSED_STREAM);
                    this.f15887h.mo25702z(oVar.f15953m);
                }
            }
        }
    }

    /* renamed from: m.m0.j.f$e */
    public static final class C7938e extends C7873a {

        /* renamed from: e */
        public final /* synthetic */ C7929f f15897e;

        /* renamed from: f */
        public final /* synthetic */ int f15898f;

        /* renamed from: g */
        public final /* synthetic */ C7922b f15899g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7938e(String str, boolean z, String str2, boolean z2, C7929f fVar, int i, C7922b bVar) {
            super(str2, z2);
            this.f15897e = fVar;
            this.f15898f = i;
            this.f15899g = bVar;
        }

        /* renamed from: a */
        public long mo25587a() {
            try {
                C7929f fVar = this.f15897e;
                int i = this.f15898f;
                C7922b bVar = this.f15899g;
                Objects.requireNonNull(fVar);
                C6888i.m12438e(bVar, "statusCode");
                fVar.f15851F.mo25733H(i, bVar);
                return -1;
            } catch (IOException e) {
                C7929f fVar2 = this.f15897e;
                C7922b bVar2 = C7922b.PROTOCOL_ERROR;
                fVar2.mo25698d(bVar2, bVar2, e);
                return -1;
            }
        }
    }

    /* renamed from: m.m0.j.f$f */
    public static final class C7939f extends C7873a {

        /* renamed from: e */
        public final /* synthetic */ C7929f f15900e;

        /* renamed from: f */
        public final /* synthetic */ int f15901f;

        /* renamed from: g */
        public final /* synthetic */ long f15902g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7939f(String str, boolean z, String str2, boolean z2, C7929f fVar, int i, long j) {
            super(str2, z2);
            this.f15900e = fVar;
            this.f15901f = i;
            this.f15902g = j;
        }

        /* renamed from: a */
        public long mo25587a() {
            try {
                this.f15900e.f15851F.mo25741g(this.f15901f, this.f15902g);
                return -1;
            } catch (IOException e) {
                C7929f fVar = this.f15900e;
                C7922b bVar = C7922b.PROTOCOL_ERROR;
                fVar.mo25698d(bVar, bVar, e);
                return -1;
            }
        }
    }

    static {
        C7959t tVar = new C7959t();
        tVar.mo25751c(7, 65535);
        tVar.mo25751c(5, 16384);
        f15844I = tVar;
    }

    public C7929f(C7931b bVar) {
        C6888i.m12438e(bVar, "builder");
        boolean z = bVar.f15883h;
        this.f15854g = z;
        this.f15855h = bVar.f15880e;
        String str = bVar.f15877b;
        if (str != null) {
            this.f15857j = str;
            this.f15859l = bVar.f15883h ? 3 : 2;
            C7876d dVar = bVar.f15884i;
            this.f15861n = dVar;
            C7875c f = dVar.mo25599f();
            this.f15862o = f;
            this.f15863p = dVar.mo25599f();
            this.f15864q = dVar.mo25599f();
            this.f15865r = bVar.f15881f;
            C7959t tVar = new C7959t();
            if (bVar.f15883h) {
                tVar.mo25751c(7, 16777216);
            }
            this.f15872y = tVar;
            C7959t tVar2 = f15844I;
            this.f15873z = tVar2;
            this.f15849D = (long) tVar2.mo25749a();
            Socket socket = bVar.f15876a;
            if (socket != null) {
                this.f15850E = socket;
                C8042f fVar = bVar.f15879d;
                if (fVar != null) {
                    this.f15851F = new C7954p(fVar, z);
                    C8043g gVar = bVar.f15878c;
                    if (gVar != null) {
                        this.f15852G = new C7934d(this, new C7947n(gVar, z));
                        this.f15853H = new LinkedHashSet();
                        int i = bVar.f15882g;
                        if (i != 0) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
                            String l = C0843a.m451l(str, " ping");
                            f.mo25591c(new C7930a(l, l, this, nanos), nanos);
                            return;
                        }
                        return;
                    }
                    C6888i.m12446m("source");
                    throw null;
                }
                C6888i.m12446m("sink");
                throw null;
            }
            C6888i.m12446m("socket");
            throw null;
        }
        C6888i.m12446m("connectionName");
        throw null;
    }

    /* renamed from: H */
    public final void mo25692H(C7922b bVar) {
        C6888i.m12438e(bVar, "statusCode");
        synchronized (this.f15851F) {
            synchronized (this) {
                if (!this.f15860m) {
                    this.f15860m = true;
                    int i = this.f15858k;
                    this.f15851F.mo25742q(i, bVar, C7867c.f15619a);
                }
            }
        }
    }

    /* renamed from: N */
    public final synchronized void mo25693N(long j) {
        long j2 = this.f15846A + j;
        this.f15846A = j2;
        long j3 = j2 - this.f15847B;
        if (j3 >= ((long) (this.f15872y.mo25749a() / 2))) {
            mo25700f0(0, j3);
            this.f15847B += j3;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f15851F.f15968h);
        r6 = (long) r2;
        r8.f15848C += r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0059 */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25694O(int r9, boolean r10, p435n.C8040e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            m.m0.j.p r12 = r8.f15851F
            r12.mo25734L(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0068
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.f15848C     // Catch:{ InterruptedException -> 0x0059 }
            long r6 = r8.f15849D     // Catch:{ InterruptedException -> 0x0059 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0032
            java.util.Map<java.lang.Integer, m.m0.j.o> r2 = r8.f15856i     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0059 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x0059 }
            if (r2 == 0) goto L_0x002a
            r8.wait()     // Catch:{ InterruptedException -> 0x0059 }
            goto L_0x0012
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0059 }
            throw r9     // Catch:{ InterruptedException -> 0x0059 }
        L_0x0032:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch:{ all -> 0x0057 }
            int r2 = (int) r4     // Catch:{ all -> 0x0057 }
            m.m0.j.p r4 = r8.f15851F     // Catch:{ all -> 0x0057 }
            int r4 = r4.f15968h     // Catch:{ all -> 0x0057 }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0057 }
            long r4 = r8.f15848C     // Catch:{ all -> 0x0057 }
            long r6 = (long) r2     // Catch:{ all -> 0x0057 }
            long r4 = r4 + r6
            r8.f15848C = r4     // Catch:{ all -> 0x0057 }
            monitor-exit(r8)
            long r12 = r12 - r6
            m.m0.j.p r4 = r8.f15851F
            if (r10 == 0) goto L_0x0052
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0052
            r5 = 1
            goto L_0x0053
        L_0x0052:
            r5 = r3
        L_0x0053:
            r4.mo25734L(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0057:
            r9 = move-exception
            goto L_0x0066
        L_0x0059:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0057 }
            r9.interrupt()     // Catch:{ all -> 0x0057 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0057 }
            r9.<init>()     // Catch:{ all -> 0x0057 }
            throw r9     // Catch:{ all -> 0x0057 }
        L_0x0066:
            monitor-exit(r8)
            throw r9
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p429j.C7929f.mo25694O(int, boolean, n.e, long):void");
    }

    /* renamed from: S */
    public final void mo25695S(boolean z, int i, int i2) {
        try {
            this.f15851F.mo25736b(z, i, i2);
        } catch (IOException e) {
            C7922b bVar = C7922b.PROTOCOL_ERROR;
            mo25698d(bVar, bVar, e);
        }
    }

    /* renamed from: Z */
    public final void mo25696Z(int i, C7922b bVar) {
        C6888i.m12438e(bVar, "errorCode");
        String str = this.f15857j + '[' + i + "] writeSynReset";
        this.f15862o.mo25591c(new C7938e(str, true, str, true, this, i, bVar), 0);
    }

    public void close() {
        mo25698d(C7922b.NO_ERROR, C7922b.CANCEL, (IOException) null);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|(2:1|2)|3|10|(2:16|(5:18|19|20|33|21))|23|24|25|26|27|29) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004d */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25698d(p421m.p422m0.p429j.C7922b r4, p421m.p422m0.p429j.C7922b r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            p298d.p344x.p346c.C6888i.m12438e(r4, r0)
            java.lang.String r0 = "streamCode"
            p298d.p344x.p346c.C6888i.m12438e(r5, r0)
            byte[] r0 = p421m.p422m0.C7867c.f15619a
            r3.mo25692H(r4)     // Catch:{ IOException -> 0x000f }
        L_0x000f:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, m.m0.j.o> r0 = r3.f15856i     // Catch:{ all -> 0x0062 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0062 }
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.util.Map<java.lang.Integer, m.m0.j.o> r4 = r3.f15856i     // Catch:{ all -> 0x0062 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0062 }
            m.m0.j.o[] r0 = new p421m.p422m0.p429j.C7950o[r1]     // Catch:{ all -> 0x0062 }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x0062 }
            if (r4 == 0) goto L_0x0032
            m.m0.j.o[] r4 = (p421m.p422m0.p429j.C7950o[]) r4     // Catch:{ all -> 0x0062 }
            java.util.Map<java.lang.Integer, m.m0.j.o> r0 = r3.f15856i     // Catch:{ all -> 0x0062 }
            r0.clear()     // Catch:{ all -> 0x0062 }
            goto L_0x003a
        L_0x0032:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x0062 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0062 }
            throw r4     // Catch:{ all -> 0x0062 }
        L_0x003a:
            monitor-exit(r3)
            if (r4 == 0) goto L_0x0048
            int r0 = r4.length
        L_0x003e:
            if (r1 >= r0) goto L_0x0048
            r2 = r4[r1]
            r2.mo25720c(r5, r6)     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            int r1 = r1 + 1
            goto L_0x003e
        L_0x0048:
            m.m0.j.p r4 = r3.f15851F     // Catch:{ IOException -> 0x004d }
            r4.close()     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            java.net.Socket r4 = r3.f15850E     // Catch:{ IOException -> 0x0052 }
            r4.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            m.m0.f.c r4 = r3.f15862o
            r4.mo25593e()
            m.m0.f.c r4 = r3.f15863p
            r4.mo25593e()
            m.m0.f.c r4 = r3.f15864q
            r4.mo25593e()
            return
        L_0x0062:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p429j.C7929f.mo25698d(m.m0.j.b, m.m0.j.b, java.io.IOException):void");
    }

    /* renamed from: e */
    public final synchronized C7950o mo25699e(int i) {
        return this.f15856i.get(Integer.valueOf(i));
    }

    /* renamed from: f0 */
    public final void mo25700f0(int i, long j) {
        String str = this.f15857j + '[' + i + "] windowUpdate";
        this.f15862o.mo25591c(new C7939f(str, true, str, true, this, i, j), 0);
    }

    /* renamed from: q */
    public final boolean mo25701q(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* renamed from: z */
    public final synchronized C7950o mo25702z(int i) {
        C7950o remove;
        remove = this.f15856i.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }
}
