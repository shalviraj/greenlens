package p005b.p280p.p285b.p286a0.p287j;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p285b.C5254s;
import p005b.p280p.p285b.p286a0.C5123b;
import p005b.p280p.p285b.p286a0.C5125d;
import p005b.p280p.p285b.p286a0.C5133h;
import p005b.p280p.p285b.p286a0.C5134i;
import p005b.p280p.p285b.p286a0.p287j.C5136b;
import p005b.p280p.p285b.p286a0.p287j.C5154k;
import p435n.C8040e;
import p435n.C8042f;
import p435n.C8043g;
import p435n.C8044h;

/* renamed from: b.p.b.a0.j.d */
public final class C5139d implements Closeable {

    /* renamed from: A */
    public static final ExecutorService f9978A;

    /* renamed from: g */
    public final C5254s f9979g;

    /* renamed from: h */
    public final boolean f9980h;

    /* renamed from: i */
    public final C5143d f9981i;

    /* renamed from: j */
    public final Map<Integer, C5154k> f9982j = new HashMap();

    /* renamed from: k */
    public final String f9983k;

    /* renamed from: l */
    public int f9984l;

    /* renamed from: m */
    public int f9985m;

    /* renamed from: n */
    public boolean f9986n;

    /* renamed from: o */
    public final ExecutorService f9987o;

    /* renamed from: p */
    public final C5175s f9988p;

    /* renamed from: q */
    public long f9989q;

    /* renamed from: r */
    public long f9990r;

    /* renamed from: s */
    public C5177t f9991s;

    /* renamed from: t */
    public final C5177t f9992t;

    /* renamed from: u */
    public boolean f9993u;

    /* renamed from: v */
    public final C5181v f9994v;

    /* renamed from: w */
    public final Socket f9995w;

    /* renamed from: x */
    public final C5138c f9996x;

    /* renamed from: y */
    public final C5145e f9997y;

    /* renamed from: z */
    public final Set<Integer> f9998z;

    /* renamed from: b.p.b.a0.j.d$a */
    public class C5140a extends C5125d {

        /* renamed from: h */
        public final /* synthetic */ int f9999h;

        /* renamed from: i */
        public final /* synthetic */ C5135a f10000i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5140a(String str, Object[] objArr, int i, C5135a aVar) {
            super(str, objArr);
            this.f9999h = i;
            this.f10000i = aVar;
        }

        /* renamed from: a */
        public void mo16974a() {
            try {
                C5139d dVar = C5139d.this;
                dVar.f9996x.mo16999s(this.f9999h, this.f10000i);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b.p.b.a0.j.d$b */
    public class C5141b extends C5125d {

        /* renamed from: h */
        public final /* synthetic */ int f10002h;

        /* renamed from: i */
        public final /* synthetic */ long f10003i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5141b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f10002h = i;
            this.f10003i = j;
        }

        /* renamed from: a */
        public void mo16974a() {
            try {
                C5139d.this.f9996x.mo16996g(this.f10002h, this.f10003i);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b.p.b.a0.j.d$c */
    public static class C5142c {

        /* renamed from: a */
        public Socket f10005a;

        /* renamed from: b */
        public String f10006b;

        /* renamed from: c */
        public C8043g f10007c;

        /* renamed from: d */
        public C8042f f10008d;

        /* renamed from: e */
        public C5254s f10009e = C5254s.SPDY_3;

        public C5142c(boolean z) {
        }
    }

    /* renamed from: b.p.b.a0.j.d$d */
    public static abstract class C5143d {

        /* renamed from: a */
        public static final C5143d f10010a = new C5144a();

        /* renamed from: b.p.b.a0.j.d$d$a */
        public static class C5144a extends C5143d {
        }
    }

    /* renamed from: b.p.b.a0.j.d$e */
    public class C5145e extends C5125d implements C5136b.C5137a {

        /* renamed from: h */
        public final C5136b f10011h;

        /* renamed from: b.p.b.a0.j.d$e$a */
        public class C5146a extends C5125d {

            /* renamed from: h */
            public final /* synthetic */ C5154k f10013h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5146a(String str, Object[] objArr, C5154k kVar) {
                super(str, objArr);
                this.f10013h = kVar;
            }

            /* renamed from: a */
            public void mo16974a() {
                try {
                    C5143d dVar = C5139d.this.f9981i;
                    C5154k kVar = this.f10013h;
                    Objects.requireNonNull((C5143d.C5144a) dVar);
                    kVar.mo17018c(C5135a.REFUSED_STREAM);
                } catch (IOException e) {
                    Logger logger = C5123b.f9929a;
                    Level level = Level.INFO;
                    StringBuilder u = C0843a.m460u("FramedConnection.Listener failure for ");
                    u.append(C5139d.this.f9983k);
                    logger.log(level, u.toString(), e);
                    try {
                        this.f10013h.mo17018c(C5135a.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: b.p.b.a0.j.d$e$b */
        public class C5147b extends C5125d {
            public C5147b(String str, Object... objArr) {
                super(str, objArr);
            }

            /* renamed from: a */
            public void mo16974a() {
                Objects.requireNonNull(C5139d.this.f9981i);
            }
        }

        public C5145e(C5136b bVar, C5140a aVar) {
            super("OkHttp %s", C5139d.this.f9983k);
            this.f10011h = bVar;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|19|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r0 = p005b.p280p.p285b.p286a0.p287j.C5135a.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r5.f10012i.mo17007e(r0, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0031, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0032, code lost:
            r4 = r2;
            r2 = r1;
            r1 = r4;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0024 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo16974a() {
            /*
                r5 = this;
                b.p.b.a0.j.a r0 = p005b.p280p.p285b.p286a0.p287j.C5135a.INTERNAL_ERROR
                b.p.b.a0.j.d r1 = p005b.p280p.p285b.p286a0.p287j.C5139d.this     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                boolean r1 = r1.f9980h     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                if (r1 != 0) goto L_0x000d
                b.p.b.a0.j.b r1 = r5.f10011h     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                r1.mo16989u()     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            L_0x000d:
                b.p.b.a0.j.b r1 = r5.f10011h     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                boolean r1 = r1.mo16988b0(r5)     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                if (r1 == 0) goto L_0x0016
                goto L_0x000d
            L_0x0016:
                b.p.b.a0.j.a r1 = p005b.p280p.p285b.p286a0.p287j.C5135a.NO_ERROR     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                b.p.b.a0.j.a r0 = p005b.p280p.p285b.p286a0.p287j.C5135a.CANCEL     // Catch:{ IOException -> 0x0024 }
                b.p.b.a0.j.d r2 = p005b.p280p.p285b.p286a0.p287j.C5139d.this     // Catch:{ IOException -> 0x002b }
                r2.mo17007e(r1, r0)     // Catch:{ IOException -> 0x002b }
                goto L_0x002b
            L_0x0020:
                r1 = move-exception
                r2 = r0
                goto L_0x0035
            L_0x0023:
                r1 = r0
            L_0x0024:
                b.p.b.a0.j.a r0 = p005b.p280p.p285b.p286a0.p287j.C5135a.PROTOCOL_ERROR     // Catch:{ all -> 0x0031 }
                b.p.b.a0.j.d r1 = p005b.p280p.p285b.p286a0.p287j.C5139d.this     // Catch:{ IOException -> 0x002b }
                r1.mo17007e(r0, r0)     // Catch:{ IOException -> 0x002b }
            L_0x002b:
                b.p.b.a0.j.b r0 = r5.f10011h
                p005b.p280p.p285b.p286a0.C5134i.m9458c(r0)
                return
            L_0x0031:
                r2 = move-exception
                r4 = r2
                r2 = r1
                r1 = r4
            L_0x0035:
                b.p.b.a0.j.d r3 = p005b.p280p.p285b.p286a0.p287j.C5139d.this     // Catch:{ IOException -> 0x003a }
                r3.mo17007e(r2, r0)     // Catch:{ IOException -> 0x003a }
            L_0x003a:
                b.p.b.a0.j.b r0 = r5.f10011h
                p005b.p280p.p285b.p286a0.C5134i.m9458c(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.p287j.C5139d.C5145e.mo16974a():void");
        }

        /* renamed from: b */
        public void mo17011b(boolean z, int i, C8043g gVar, int i2) {
            boolean z2;
            boolean z3;
            int i3 = i;
            C8043g gVar2 = gVar;
            int i4 = i2;
            if (C5139d.m9481d(C5139d.this, i3)) {
                C5139d dVar = C5139d.this;
                Objects.requireNonNull(dVar);
                C8040e eVar = new C8040e();
                long j = (long) i4;
                gVar2.mo25904d0(j);
                gVar2.mo17031T(eVar, j);
                if (eVar.f16140h == j) {
                    dVar.f9987o.execute(new C5151h(dVar, "OkHttp %s Push Data[%s]", new Object[]{dVar.f9983k, Integer.valueOf(i)}, i, eVar, i2, z));
                    return;
                }
                throw new IOException(eVar.f16140h + " != " + i4);
            }
            C5154k q = C5139d.this.mo17009q(i3);
            if (q == null) {
                C5139d.this.mo17004S(i3, C5135a.INVALID_STREAM);
                gVar2.skip((long) i4);
                return;
            }
            C5154k.C5157c cVar = q.f10044g;
            long j2 = (long) i4;
            Objects.requireNonNull(cVar);
            while (true) {
                if (j2 <= 0) {
                    break;
                }
                synchronized (C5154k.this) {
                    z2 = cVar.f10057k;
                    z3 = cVar.f10054h.f16140h + j2 > cVar.f10055i;
                }
                if (z3) {
                    gVar2.skip(j2);
                    C5154k.this.mo17020e(C5135a.FLOW_CONTROL_ERROR);
                    break;
                } else if (z2) {
                    gVar2.skip(j2);
                    break;
                } else {
                    long T = gVar2.mo17031T(cVar.f10053g, j2);
                    if (T != -1) {
                        j2 -= T;
                        synchronized (C5154k.this) {
                            C8040e eVar2 = cVar.f10054h;
                            boolean z4 = eVar2.f16140h == 0;
                            eVar2.mo25918n(cVar.f10053g);
                            if (z4) {
                                C5154k.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (z) {
                q.mo17025j();
            }
        }

        /* renamed from: c */
        public void mo17012c(int i, C5135a aVar, C8044h hVar) {
            C5154k[] kVarArr;
            hVar.mo25959l();
            synchronized (C5139d.this) {
                kVarArr = (C5154k[]) C5139d.this.f9982j.values().toArray(new C5154k[C5139d.this.f9982j.size()]);
                C5139d.this.f9986n = true;
            }
            for (C5154k kVar : kVarArr) {
                if (kVar.f10040c > i && kVar.mo17023h()) {
                    C5135a aVar2 = C5135a.REFUSED_STREAM;
                    synchronized (kVar) {
                        if (kVar.f10048k == null) {
                            kVar.f10048k = aVar2;
                            kVar.notifyAll();
                        }
                    }
                    C5139d.this.mo17010z(kVar.f10040c);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a6, code lost:
            if (r2 != p005b.p280p.p285b.p286a0.p287j.C5160m.f10070g) goto L_0x00aa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
            r8 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00aa, code lost:
            r8 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ab, code lost:
            if (r8 == false) goto L_0x00b6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ad, code lost:
            r6.mo17020e(r3);
            r1.f10012i.mo17010z(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b5, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b7, code lost:
            monitor-enter(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ba, code lost:
            if (r6.f10043f != null) goto L_0x00cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bc, code lost:
            if (r2 != r4) goto L_0x00bf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00be, code lost:
            r10 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bf, code lost:
            if (r10 == false) goto L_0x00c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c2, code lost:
            r6.f10043f = r7;
            r2 = r6.mo17024i();
            r6.notifyAll();
            r9 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cd, code lost:
            if (r2 != r5) goto L_0x00d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cf, code lost:
            r10 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d0, code lost:
            if (r10 == false) goto L_0x00d5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d2, code lost:
            r3 = p005b.p280p.p285b.p286a0.p287j.C5135a.STREAM_IN_USE;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d5, code lost:
            r2 = new java.util.ArrayList();
            r2.addAll(r6.f10043f);
            r2.addAll(r7);
            r6.f10043f = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e4, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e5, code lost:
            monitor-exit(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e6, code lost:
            if (r3 == null) goto L_0x00ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e8, code lost:
            r6.mo17020e(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ec, code lost:
            if (r9 != false) goto L_0x00f5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ee, code lost:
            r6.f10041d.mo17010z(r6.f10040c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f5, code lost:
            if (r15 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f7, code lost:
            r6.mo17025j();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
            return;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo17013d(boolean r14, boolean r15, int r16, int r17, java.util.List<p005b.p280p.p285b.p286a0.p287j.C5159l> r18, p005b.p280p.p285b.p286a0.p287j.C5160m r19) {
            /*
                r13 = this;
                r1 = r13
                r0 = r16
                r7 = r18
                r2 = r19
                b.p.b.a0.j.a r3 = p005b.p280p.p285b.p286a0.p287j.C5135a.PROTOCOL_ERROR
                b.p.b.a0.j.m r4 = p005b.p280p.p285b.p286a0.p287j.C5160m.SPDY_HEADERS
                b.p.b.a0.j.m r5 = p005b.p280p.p285b.p286a0.p287j.C5160m.SPDY_REPLY
                b.p.b.a0.j.d r6 = p005b.p280p.p285b.p286a0.p287j.C5139d.this
                boolean r6 = p005b.p280p.p285b.p286a0.p287j.C5139d.m9481d(r6, r0)
                r8 = 2
                r9 = 1
                r10 = 0
                if (r6 == 0) goto L_0x0039
                b.p.b.a0.j.d r3 = p005b.p280p.p285b.p286a0.p287j.C5139d.this
                java.util.concurrent.ExecutorService r11 = r3.f9987o
                b.p.b.a0.j.g r12 = new b.p.b.a0.j.g
                java.lang.Object[] r5 = new java.lang.Object[r8]
                java.lang.String r2 = r3.f9983k
                r5[r10] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
                r5[r9] = r2
                java.lang.String r4 = "OkHttp %s Push Headers[%s]"
                r2 = r12
                r6 = r16
                r7 = r18
                r8 = r15
                r2.<init>(r3, r4, r5, r6, r7, r8)
                r11.execute(r12)
                return
            L_0x0039:
                b.p.b.a0.j.d r11 = p005b.p280p.p285b.p286a0.p287j.C5139d.this
                monitor-enter(r11)
                b.p.b.a0.j.d r6 = p005b.p280p.p285b.p286a0.p287j.C5139d.this     // Catch:{ all -> 0x00fe }
                boolean r12 = r6.f9986n     // Catch:{ all -> 0x00fe }
                if (r12 == 0) goto L_0x0044
                monitor-exit(r11)     // Catch:{ all -> 0x00fe }
                return
            L_0x0044:
                b.p.b.a0.j.k r6 = r6.mo17009q(r0)     // Catch:{ all -> 0x00fe }
                if (r6 != 0) goto L_0x00a3
                if (r2 == r5) goto L_0x0051
                if (r2 != r4) goto L_0x004f
                goto L_0x0051
            L_0x004f:
                r2 = r10
                goto L_0x0052
            L_0x0051:
                r2 = r9
            L_0x0052:
                if (r2 == 0) goto L_0x005d
                b.p.b.a0.j.d r2 = p005b.p280p.p285b.p286a0.p287j.C5139d.this     // Catch:{ all -> 0x00fe }
                b.p.b.a0.j.a r3 = p005b.p280p.p285b.p286a0.p287j.C5135a.INVALID_STREAM     // Catch:{ all -> 0x00fe }
                r2.mo17004S(r0, r3)     // Catch:{ all -> 0x00fe }
                monitor-exit(r11)     // Catch:{ all -> 0x00fe }
                return
            L_0x005d:
                b.p.b.a0.j.d r4 = p005b.p280p.p285b.p286a0.p287j.C5139d.this     // Catch:{ all -> 0x00fe }
                int r2 = r4.f9984l     // Catch:{ all -> 0x00fe }
                if (r0 > r2) goto L_0x0065
                monitor-exit(r11)     // Catch:{ all -> 0x00fe }
                return
            L_0x0065:
                int r2 = r0 % 2
                int r3 = r4.f9985m     // Catch:{ all -> 0x00fe }
                int r3 = r3 % r8
                if (r2 != r3) goto L_0x006e
                monitor-exit(r11)     // Catch:{ all -> 0x00fe }
                return
            L_0x006e:
                b.p.b.a0.j.k r12 = new b.p.b.a0.j.k     // Catch:{ all -> 0x00fe }
                r2 = r12
                r3 = r16
                r5 = r14
                r6 = r15
                r7 = r18
                r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00fe }
                b.p.b.a0.j.d r2 = p005b.p280p.p285b.p286a0.p287j.C5139d.this     // Catch:{ all -> 0x00fe }
                r2.f9984l = r0     // Catch:{ all -> 0x00fe }
                java.util.Map<java.lang.Integer, b.p.b.a0.j.k> r2 = r2.f9982j     // Catch:{ all -> 0x00fe }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x00fe }
                r2.put(r3, r12)     // Catch:{ all -> 0x00fe }
                java.util.concurrent.ExecutorService r2 = p005b.p280p.p285b.p286a0.p287j.C5139d.f9978A     // Catch:{ all -> 0x00fe }
                b.p.b.a0.j.d$e$a r3 = new b.p.b.a0.j.d$e$a     // Catch:{ all -> 0x00fe }
                java.lang.String r4 = "OkHttp %s stream %d"
                java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x00fe }
                b.p.b.a0.j.d r6 = p005b.p280p.p285b.p286a0.p287j.C5139d.this     // Catch:{ all -> 0x00fe }
                java.lang.String r6 = r6.f9983k     // Catch:{ all -> 0x00fe }
                r5[r10] = r6     // Catch:{ all -> 0x00fe }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x00fe }
                r5[r9] = r0     // Catch:{ all -> 0x00fe }
                r3.<init>(r4, r5, r12)     // Catch:{ all -> 0x00fe }
                r2.execute(r3)     // Catch:{ all -> 0x00fe }
                monitor-exit(r11)     // Catch:{ all -> 0x00fe }
                return
            L_0x00a3:
                monitor-exit(r11)     // Catch:{ all -> 0x00fe }
                b.p.b.a0.j.m r8 = p005b.p280p.p285b.p286a0.p287j.C5160m.SPDY_SYN_STREAM
                if (r2 != r8) goto L_0x00aa
                r8 = r9
                goto L_0x00ab
            L_0x00aa:
                r8 = r10
            L_0x00ab:
                if (r8 == 0) goto L_0x00b6
                r6.mo17020e(r3)
                b.p.b.a0.j.d r2 = p005b.p280p.p285b.p286a0.p287j.C5139d.this
                r2.mo17010z(r0)
                return
            L_0x00b6:
                r0 = 0
                monitor-enter(r6)
                java.util.List<b.p.b.a0.j.l> r8 = r6.f10043f     // Catch:{ all -> 0x00fb }
                if (r8 != 0) goto L_0x00cd
                if (r2 != r4) goto L_0x00bf
                r10 = r9
            L_0x00bf:
                if (r10 == 0) goto L_0x00c2
                goto L_0x00e5
            L_0x00c2:
                r6.f10043f = r7     // Catch:{ all -> 0x00fb }
                boolean r2 = r6.mo17024i()     // Catch:{ all -> 0x00fb }
                r6.notifyAll()     // Catch:{ all -> 0x00fb }
                r9 = r2
                goto L_0x00e4
            L_0x00cd:
                if (r2 != r5) goto L_0x00d0
                r10 = r9
            L_0x00d0:
                if (r10 == 0) goto L_0x00d5
                b.p.b.a0.j.a r3 = p005b.p280p.p285b.p286a0.p287j.C5135a.STREAM_IN_USE     // Catch:{ all -> 0x00fb }
                goto L_0x00e5
            L_0x00d5:
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00fb }
                r2.<init>()     // Catch:{ all -> 0x00fb }
                java.util.List<b.p.b.a0.j.l> r3 = r6.f10043f     // Catch:{ all -> 0x00fb }
                r2.addAll(r3)     // Catch:{ all -> 0x00fb }
                r2.addAll(r7)     // Catch:{ all -> 0x00fb }
                r6.f10043f = r2     // Catch:{ all -> 0x00fb }
            L_0x00e4:
                r3 = r0
            L_0x00e5:
                monitor-exit(r6)     // Catch:{ all -> 0x00fb }
                if (r3 == 0) goto L_0x00ec
                r6.mo17020e(r3)
                goto L_0x00f5
            L_0x00ec:
                if (r9 != 0) goto L_0x00f5
                b.p.b.a0.j.d r0 = r6.f10041d
                int r2 = r6.f10040c
                r0.mo17010z(r2)
            L_0x00f5:
                if (r15 == 0) goto L_0x00fa
                r6.mo17025j()
            L_0x00fa:
                return
            L_0x00fb:
                r0 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x00fb }
                throw r0
            L_0x00fe:
                r0 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x00fe }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.p287j.C5139d.C5145e.mo17013d(boolean, boolean, int, int, java.util.List, b.p.b.a0.j.m):void");
        }

        /* renamed from: e */
        public void mo17014e(boolean z, int i, int i2) {
            if (z) {
                synchronized (C5139d.this) {
                }
                return;
            }
            C5139d dVar = C5139d.this;
            C5139d.f9978A.execute(new C5148e(dVar, "OkHttp %s ping %08x%08x", new Object[]{dVar.f9983k, Integer.valueOf(i), Integer.valueOf(i2)}, true, i, i2, (C5174r) null));
        }

        /* renamed from: f */
        public void mo17015f(int i, C5135a aVar) {
            if (C5139d.m9481d(C5139d.this, i)) {
                C5139d dVar = C5139d.this;
                dVar.f9987o.execute(new C5152i(dVar, "OkHttp %s Push Reset[%s]", new Object[]{dVar.f9983k, Integer.valueOf(i)}, i, aVar));
                return;
            }
            C5154k z = C5139d.this.mo17010z(i);
            if (z != null) {
                synchronized (z) {
                    if (z.f10048k == null) {
                        z.f10048k = aVar;
                        z.notifyAll();
                    }
                }
            }
        }

        /* JADX WARNING: type inference failed for: r1v12, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo17016g(boolean r11, p005b.p280p.p285b.p286a0.p287j.C5177t r12) {
            /*
                r10 = this;
                b.p.b.a0.j.d r0 = p005b.p280p.p285b.p286a0.p287j.C5139d.this
                monitor-enter(r0)
                b.p.b.a0.j.d r1 = p005b.p280p.p285b.p286a0.p287j.C5139d.this     // Catch:{ all -> 0x00db }
                b.p.b.a0.j.t r1 = r1.f9992t     // Catch:{ all -> 0x00db }
                r2 = 65536(0x10000, float:9.18355E-41)
                int r1 = r1.mo17063b(r2)     // Catch:{ all -> 0x00db }
                r3 = 0
                if (r11 == 0) goto L_0x001f
                b.p.b.a0.j.d r11 = p005b.p280p.p285b.p286a0.p287j.C5139d.this     // Catch:{ all -> 0x00db }
                b.p.b.a0.j.t r11 = r11.f9992t     // Catch:{ all -> 0x00db }
                r11.f10122c = r3     // Catch:{ all -> 0x00db }
                r11.f10121b = r3     // Catch:{ all -> 0x00db }
                r11.f10120a = r3     // Catch:{ all -> 0x00db }
                int[] r11 = r11.f10123d     // Catch:{ all -> 0x00db }
                java.util.Arrays.fill(r11, r3)     // Catch:{ all -> 0x00db }
            L_0x001f:
                b.p.b.a0.j.d r11 = p005b.p280p.p285b.p286a0.p287j.C5139d.this     // Catch:{ all -> 0x00db }
                b.p.b.a0.j.t r11 = r11.f9992t     // Catch:{ all -> 0x00db }
                java.util.Objects.requireNonNull(r11)     // Catch:{ all -> 0x00db }
                r4 = r3
            L_0x0027:
                r5 = 10
                if (r4 >= r5) goto L_0x0040
                boolean r5 = r12.mo17064c(r4)     // Catch:{ all -> 0x00db }
                if (r5 != 0) goto L_0x0032
                goto L_0x003d
            L_0x0032:
                int r5 = r12.mo17062a(r4)     // Catch:{ all -> 0x00db }
                int[] r6 = r12.f10123d     // Catch:{ all -> 0x00db }
                r6 = r6[r4]     // Catch:{ all -> 0x00db }
                r11.mo17065d(r4, r5, r6)     // Catch:{ all -> 0x00db }
            L_0x003d:
                int r4 = r4 + 1
                goto L_0x0027
            L_0x0040:
                b.p.b.a0.j.d r11 = p005b.p280p.p285b.p286a0.p287j.C5139d.this     // Catch:{ all -> 0x00db }
                b.p.b.s r4 = r11.f9979g     // Catch:{ all -> 0x00db }
                b.p.b.s r5 = p005b.p280p.p285b.C5254s.HTTP_2     // Catch:{ all -> 0x00db }
                r6 = 1
                if (r4 != r5) goto L_0x005b
                java.util.concurrent.ExecutorService r4 = p005b.p280p.p285b.p286a0.p287j.C5139d.f9978A     // Catch:{ all -> 0x00db }
                b.p.b.a0.j.j r5 = new b.p.b.a0.j.j     // Catch:{ all -> 0x00db }
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x00db }
                java.lang.String r11 = r11.f9983k     // Catch:{ all -> 0x00db }
                r7[r3] = r11     // Catch:{ all -> 0x00db }
                java.lang.String r11 = "OkHttp %s ACK Settings"
                r5.<init>(r10, r11, r7, r12)     // Catch:{ all -> 0x00db }
                r4.execute(r5)     // Catch:{ all -> 0x00db }
            L_0x005b:
                b.p.b.a0.j.d r11 = p005b.p280p.p285b.p286a0.p287j.C5139d.this     // Catch:{ all -> 0x00db }
                b.p.b.a0.j.t r11 = r11.f9992t     // Catch:{ all -> 0x00db }
                int r11 = r11.mo17063b(r2)     // Catch:{ all -> 0x00db }
                r12 = -1
                r4 = 0
                r2 = 0
                if (r11 == r12) goto L_0x00a7
                if (r11 == r1) goto L_0x00a7
                int r11 = r11 - r1
                long r11 = (long) r11     // Catch:{ all -> 0x00db }
                b.p.b.a0.j.d r1 = p005b.p280p.p285b.p286a0.p287j.C5139d.this     // Catch:{ all -> 0x00db }
                boolean r7 = r1.f9993u     // Catch:{ all -> 0x00db }
                if (r7 != 0) goto L_0x0083
                long r7 = r1.f9990r     // Catch:{ all -> 0x00db }
                long r7 = r7 + r11
                r1.f9990r = r7     // Catch:{ all -> 0x00db }
                int r7 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r7 <= 0) goto L_0x007f
                r1.notifyAll()     // Catch:{ all -> 0x00db }
            L_0x007f:
                b.p.b.a0.j.d r1 = p005b.p280p.p285b.p286a0.p287j.C5139d.this     // Catch:{ all -> 0x00db }
                r1.f9993u = r6     // Catch:{ all -> 0x00db }
            L_0x0083:
                b.p.b.a0.j.d r1 = p005b.p280p.p285b.p286a0.p287j.C5139d.this     // Catch:{ all -> 0x00db }
                java.util.Map<java.lang.Integer, b.p.b.a0.j.k> r1 = r1.f9982j     // Catch:{ all -> 0x00db }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00db }
                if (r1 != 0) goto L_0x00a8
                b.p.b.a0.j.d r1 = p005b.p280p.p285b.p286a0.p287j.C5139d.this     // Catch:{ all -> 0x00db }
                java.util.Map<java.lang.Integer, b.p.b.a0.j.k> r1 = r1.f9982j     // Catch:{ all -> 0x00db }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x00db }
                b.p.b.a0.j.d r2 = p005b.p280p.p285b.p286a0.p287j.C5139d.this     // Catch:{ all -> 0x00db }
                java.util.Map<java.lang.Integer, b.p.b.a0.j.k> r2 = r2.f9982j     // Catch:{ all -> 0x00db }
                int r2 = r2.size()     // Catch:{ all -> 0x00db }
                b.p.b.a0.j.k[] r2 = new p005b.p280p.p285b.p286a0.p287j.C5154k[r2]     // Catch:{ all -> 0x00db }
                java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ all -> 0x00db }
                r2 = r1
                b.p.b.a0.j.k[] r2 = (p005b.p280p.p285b.p286a0.p287j.C5154k[]) r2     // Catch:{ all -> 0x00db }
                goto L_0x00a8
            L_0x00a7:
                r11 = r4
            L_0x00a8:
                java.util.concurrent.ExecutorService r1 = p005b.p280p.p285b.p286a0.p287j.C5139d.f9978A     // Catch:{ all -> 0x00db }
                b.p.b.a0.j.d$e$b r7 = new b.p.b.a0.j.d$e$b     // Catch:{ all -> 0x00db }
                java.lang.String r8 = "OkHttp %s settings"
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00db }
                b.p.b.a0.j.d r9 = p005b.p280p.p285b.p286a0.p287j.C5139d.this     // Catch:{ all -> 0x00db }
                java.lang.String r9 = r9.f9983k     // Catch:{ all -> 0x00db }
                r6[r3] = r9     // Catch:{ all -> 0x00db }
                r7.<init>(r8, r6)     // Catch:{ all -> 0x00db }
                r1.execute(r7)     // Catch:{ all -> 0x00db }
                monitor-exit(r0)     // Catch:{ all -> 0x00db }
                if (r2 == 0) goto L_0x00da
                int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r0 == 0) goto L_0x00da
                int r1 = r2.length
            L_0x00c4:
                if (r3 >= r1) goto L_0x00da
                r4 = r2[r3]
                monitor-enter(r4)
                long r5 = r4.f10039b     // Catch:{ all -> 0x00d7 }
                long r5 = r5 + r11
                r4.f10039b = r5     // Catch:{ all -> 0x00d7 }
                if (r0 <= 0) goto L_0x00d3
                r4.notifyAll()     // Catch:{ all -> 0x00d7 }
            L_0x00d3:
                monitor-exit(r4)     // Catch:{ all -> 0x00d7 }
                int r3 = r3 + 1
                goto L_0x00c4
            L_0x00d7:
                r11 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x00d7 }
                throw r11
            L_0x00da:
                return
            L_0x00db:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00db }
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.p287j.C5139d.C5145e.mo17016g(boolean, b.p.b.a0.j.t):void");
        }

        /* renamed from: h */
        public void mo17017h(int i, long j) {
            C5139d dVar = C5139d.this;
            if (i == 0) {
                synchronized (dVar) {
                    C5139d dVar2 = C5139d.this;
                    dVar2.f9990r += j;
                    dVar2.notifyAll();
                }
                return;
            }
            C5154k q = dVar.mo17009q(i);
            if (q != null) {
                synchronized (q) {
                    q.f10039b += j;
                    if (j > 0) {
                        q.notifyAll();
                    }
                }
            }
        }
    }

    static {
        Class<C5139d> cls = C5139d.class;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = C5134i.f9953a;
        f9978A = new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, timeUnit, synchronousQueue, new C5133h("OkHttp FramedConnection", true));
    }

    public C5139d(C5142c cVar, C5140a aVar) {
        C5142c cVar2 = cVar;
        C5254s sVar = C5254s.HTTP_2;
        System.nanoTime();
        this.f9989q = 0;
        this.f9991s = new C5177t();
        C5177t tVar = new C5177t();
        this.f9992t = tVar;
        this.f9993u = false;
        this.f9998z = new LinkedHashSet();
        C5254s sVar2 = cVar2.f10009e;
        this.f9979g = sVar2;
        this.f9988p = C5175s.f10119a;
        this.f9980h = true;
        this.f9981i = C5143d.f10010a;
        this.f9985m = 1;
        if (sVar2 == sVar) {
            this.f9985m = 3;
        }
        this.f9991s.mo17065d(7, 0, 16777216);
        String str = cVar2.f10006b;
        this.f9983k = str;
        if (sVar2 == sVar) {
            this.f9994v = new C5164o();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            String format = String.format("OkHttp %s Push Observer", new Object[]{str});
            byte[] bArr = C5134i.f9953a;
            this.f9987o = new ThreadPoolExecutor(0, 1, 60, timeUnit, linkedBlockingQueue, new C5133h(format, true));
            tVar.mo17065d(7, 0, 65535);
            tVar.mo17065d(5, 0, 16384);
        } else if (sVar2 == C5254s.SPDY_3) {
            this.f9994v = new C5178u();
            this.f9987o = null;
        } else {
            throw new AssertionError(sVar2);
        }
        this.f9990r = (long) tVar.mo17063b(65536);
        this.f9995w = cVar2.f10005a;
        this.f9996x = this.f9994v.mo17053b(cVar2.f10008d, true);
        C5145e eVar = new C5145e(this.f9994v.mo17052a(cVar2.f10007c, true), (C5140a) null);
        this.f9997y = eVar;
        new Thread(eVar).start();
    }

    /* renamed from: d */
    public static boolean m9481d(C5139d dVar, int i) {
        return dVar.f9979g == C5254s.HTTP_2 && i != 0 && (i & 1) == 0;
    }

    /* renamed from: H */
    public final synchronized void mo17001H(boolean z) {
        if (z) {
            System.nanoTime();
        }
    }

    /* renamed from: N */
    public void mo17002N(C5135a aVar) {
        synchronized (this.f9996x) {
            synchronized (this) {
                if (!this.f9986n) {
                    this.f9986n = true;
                    int i = this.f9984l;
                    this.f9996x.mo17000w(i, aVar, C5134i.f9953a);
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.f9996x.mo16992a0());
        r6 = (long) r2;
        r8.f9990r -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0058 */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17003O(int r9, boolean r10, p435n.C8040e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            b.p.b.a0.j.c r12 = r8.f9996x
            r12.mo16991L(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0060
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.f9990r     // Catch:{ InterruptedException -> 0x0058 }
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, b.p.b.a0.j.k> r2 = r8.f9982j     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0058 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x0058 }
            if (r2 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0058 }
            throw r9     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0030:
            long r4 = java.lang.Math.min(r12, r4)     // Catch:{ all -> 0x0056 }
            int r2 = (int) r4     // Catch:{ all -> 0x0056 }
            b.p.b.a0.j.c r4 = r8.f9996x     // Catch:{ all -> 0x0056 }
            int r4 = r4.mo16992a0()     // Catch:{ all -> 0x0056 }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0056 }
            long r4 = r8.f9990r     // Catch:{ all -> 0x0056 }
            long r6 = (long) r2     // Catch:{ all -> 0x0056 }
            long r4 = r4 - r6
            r8.f9990r = r4     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            long r12 = r12 - r6
            b.p.b.a0.j.c r4 = r8.f9996x
            if (r10 == 0) goto L_0x0051
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = r3
        L_0x0052:
            r4.mo16991L(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0056:
            r9 = move-exception
            goto L_0x005e
        L_0x0058:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0056 }
            r9.<init>()     // Catch:{ all -> 0x0056 }
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x005e:
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            throw r9
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.p287j.C5139d.mo17003O(int, boolean, n.e, long):void");
    }

    /* renamed from: S */
    public void mo17004S(int i, C5135a aVar) {
        f9978A.submit(new C5140a("OkHttp %s stream %d", new Object[]{this.f9983k, Integer.valueOf(i)}, i, aVar));
    }

    /* renamed from: Z */
    public void mo17005Z(int i, long j) {
        f9978A.execute(new C5141b("OkHttp Window Update %s stream %d", new Object[]{this.f9983k, Integer.valueOf(i)}, i, j));
    }

    public void close() {
        mo17007e(C5135a.NO_ERROR, C5135a.CANCEL);
    }

    /* renamed from: e */
    public final void mo17007e(C5135a aVar, C5135a aVar2) {
        int i;
        C5154k[] kVarArr = null;
        try {
            mo17002N(aVar);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f9982j.isEmpty()) {
                kVarArr = (C5154k[]) this.f9982j.values().toArray(new C5154k[this.f9982j.size()]);
                this.f9982j.clear();
                mo17001H(false);
            }
        }
        if (kVarArr != null) {
            for (C5154k c : kVarArr) {
                try {
                    c.mo17018c(aVar2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.f9996x.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f9995w.close();
        } catch (IOException e4) {
            e = e4;
        }
        if (e != null) {
            throw e;
        }
    }

    public void flush() {
        this.f9996x.flush();
    }

    /* renamed from: q */
    public synchronized C5154k mo17009q(int i) {
        return this.f9982j.get(Integer.valueOf(i));
    }

    /* renamed from: z */
    public synchronized C5154k mo17010z(int i) {
        C5154k remove;
        remove = this.f9982j.remove(Integer.valueOf(i));
        if (remove != null && this.f9982j.isEmpty()) {
            mo17001H(true);
        }
        notifyAll();
        return remove;
    }
}
