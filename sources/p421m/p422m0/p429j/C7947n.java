package p421m.p422m0.p429j;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;
import p421m.p422m0.C7867c;
import p421m.p422m0.p429j.C7925d;
import p435n.C8030a0;
import p435n.C8034b0;
import p435n.C8040e;
import p435n.C8043g;
import p435n.C8044h;

/* renamed from: m.m0.j.n */
public final class C7947n implements Closeable {

    /* renamed from: k */
    public static final Logger f15929k;

    /* renamed from: l */
    public static final C7947n f15930l = null;

    /* renamed from: g */
    public final C7948a f15931g;

    /* renamed from: h */
    public final C7925d.C7926a f15932h;

    /* renamed from: i */
    public final C8043g f15933i;

    /* renamed from: j */
    public final boolean f15934j;

    /* renamed from: m.m0.j.n$a */
    public static final class C7948a implements C8030a0 {

        /* renamed from: g */
        public int f15935g;

        /* renamed from: h */
        public int f15936h;

        /* renamed from: i */
        public int f15937i;

        /* renamed from: j */
        public int f15938j;

        /* renamed from: k */
        public int f15939k;

        /* renamed from: l */
        public final C8043g f15940l;

        public C7948a(C8043g gVar) {
            C6888i.m12438e(gVar, "source");
            this.f15940l = gVar;
        }

        /* renamed from: T */
        public long mo17031T(C8040e eVar, long j) {
            int i;
            int readInt;
            C6888i.m12438e(eVar, "sink");
            do {
                int i2 = this.f15938j;
                if (i2 == 0) {
                    this.f15940l.skip((long) this.f15939k);
                    this.f15939k = 0;
                    if ((this.f15936h & 4) != 0) {
                        return -1;
                    }
                    i = this.f15937i;
                    int t = C7867c.m14299t(this.f15940l);
                    this.f15938j = t;
                    this.f15935g = t;
                    byte readByte = this.f15940l.readByte() & ExifInterface.MARKER;
                    this.f15936h = this.f15940l.readByte() & ExifInterface.MARKER;
                    C7947n nVar = C7947n.f15930l;
                    Logger logger = C7947n.f15929k;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(C7928e.f15843e.mo25691b(true, this.f15937i, this.f15935g, readByte, this.f15936h));
                    }
                    readInt = this.f15940l.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                    this.f15937i = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                } else {
                    long T = this.f15940l.mo17031T(eVar, Math.min(j, (long) i2));
                    if (T == -1) {
                        return -1;
                    }
                    this.f15938j -= (int) T;
                    return T;
                }
            } while (readInt == i);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        public void close() {
        }

        /* renamed from: f */
        public C8034b0 mo17035f() {
            return this.f15940l.mo17035f();
        }
    }

    /* renamed from: m.m0.j.n$b */
    public interface C7949b {
        /* renamed from: a */
        void mo25703a();

        /* renamed from: b */
        void mo25704b(boolean z, int i, int i2);

        /* renamed from: c */
        void mo25705c(boolean z, C7959t tVar);

        /* renamed from: d */
        void mo25706d(boolean z, int i, C8043g gVar, int i2);

        /* renamed from: e */
        void mo25707e(int i, int i2, int i3, boolean z);

        /* renamed from: f */
        void mo25708f(int i, C7922b bVar);

        /* renamed from: g */
        void mo25709g(int i, long j);

        /* renamed from: h */
        void mo25710h(boolean z, int i, int i2, List<C7924c> list);

        /* renamed from: i */
        void mo25711i(int i, int i2, List<C7924c> list);

        /* renamed from: j */
        void mo25712j(int i, C7922b bVar, C8044h hVar);
    }

    static {
        Logger logger = Logger.getLogger(C7928e.class.getName());
        C6888i.m12437d(logger, "Logger.getLogger(Http2::class.java.name)");
        f15929k = logger;
    }

    public C7947n(C8043g gVar, boolean z) {
        C6888i.m12438e(gVar, "source");
        this.f15933i = gVar;
        this.f15934j = z;
        C7948a aVar = new C7948a(gVar);
        this.f15931g = aVar;
        this.f15932h = new C7925d.C7926a(aVar, 4096, 0, 4);
    }

    public void close() {
        this.f15933i.close();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v6, types: [int] */
    /* JADX WARNING: type inference failed for: r2v13, types: [int] */
    /* JADX WARNING: type inference failed for: r2v36, types: [int] */
    /* JADX WARNING: type inference failed for: r2v46 */
    /* JADX WARNING: type inference failed for: r2v66 */
    /* JADX WARNING: type inference failed for: r2v67 */
    /* JADX WARNING: type inference failed for: r2v68 */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d8, code lost:
        throw new java.io.IOException(p005b.p035e.p036a.p037a.C0843a.m444e("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r11));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25714d(boolean r17, p421m.p422m0.p429j.C7947n.C7949b r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.String r2 = "handler"
            p298d.p344x.p346c.C6888i.m12438e(r1, r2)
            r2 = 0
            n.g r3 = r0.f15933i     // Catch:{ EOFException -> 0x0319 }
            r4 = 9
            r3.mo25904d0(r4)     // Catch:{ EOFException -> 0x0319 }
            n.g r3 = r0.f15933i
            int r3 = p421m.p422m0.C7867c.m14299t(r3)
            r10 = 16384(0x4000, float:2.2959E-41)
            if (r3 > r10) goto L_0x030d
            n.g r4 = r0.f15933i
            byte r4 = r4.readByte()
            r11 = r4 & 255(0xff, float:3.57E-43)
            n.g r4 = r0.f15933i
            byte r4 = r4.readByte()
            r12 = r4 & 255(0xff, float:3.57E-43)
            n.g r4 = r0.f15933i
            int r4 = r4.readInt()
            r13 = 2147483647(0x7fffffff, float:NaN)
            r14 = r4 & r13
            java.util.logging.Logger r15 = f15929k
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            boolean r4 = r15.isLoggable(r4)
            if (r4 == 0) goto L_0x004e
            m.m0.j.e r4 = p421m.p422m0.p429j.C7928e.f15843e
            r5 = 1
            r6 = r14
            r7 = r3
            r8 = r11
            r9 = r12
            java.lang.String r4 = r4.mo25691b(r5, r6, r7, r8, r9)
            r15.fine(r4)
        L_0x004e:
            r4 = 4
            if (r17 == 0) goto L_0x006d
            if (r11 != r4) goto L_0x0054
            goto L_0x006d
        L_0x0054:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Expected a SETTINGS frame but was "
            java.lang.StringBuilder r2 = p005b.p035e.p036a.p037a.C0843a.m460u(r2)
            m.m0.j.e r3 = p421m.p422m0.p429j.C7928e.f15843e
            java.lang.String r3 = r3.mo25690a(r11)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x006d:
            r5 = 14
            r6 = 5
            java.lang.String r7 = " > remaining length "
            java.lang.String r8 = "PROTOCOL_ERROR padding "
            r9 = 8
            r15 = 1
            switch(r11) {
                case 0: goto L_0x02bf;
                case 1: goto L_0x027d;
                case 2: goto L_0x025e;
                case 3: goto L_0x0214;
                case 4: goto L_0x0174;
                case 5: goto L_0x0139;
                case 6: goto L_0x010b;
                case 7: goto L_0x00b1;
                case 8: goto L_0x0082;
                default: goto L_0x007a;
            }
        L_0x007a:
            n.g r1 = r0.f15933i
            long r2 = (long) r3
            r1.skip(r2)
            goto L_0x030c
        L_0x0082:
            if (r3 != r4) goto L_0x00a5
            n.g r2 = r0.f15933i
            int r2 = r2.readInt()
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            byte[] r5 = p421m.p422m0.C7867c.f15619a
            long r5 = (long) r2
            long r2 = r5 & r3
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x009d
            r1.mo25709g(r14, r2)
            goto L_0x030c
        L_0x009d:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "windowSizeIncrement was 0"
            r1.<init>(r2)
            throw r1
        L_0x00a5:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_WINDOW_UPDATE length !=4: "
            java.lang.String r2 = p005b.p035e.p036a.p037a.C0843a.m444e(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x00b1:
            if (r3 < r9) goto L_0x00ff
            if (r14 != 0) goto L_0x00f7
            n.g r4 = r0.f15933i
            int r4 = r4.readInt()
            n.g r6 = r0.f15933i
            int r6 = r6.readInt()
            int r3 = r3 - r9
            m.m0.j.b[] r7 = p421m.p422m0.p429j.C7922b.values()
            r8 = r2
        L_0x00c7:
            if (r8 >= r5) goto L_0x00d8
            r9 = r7[r8]
            int r10 = r9.f15808g
            if (r10 != r6) goto L_0x00d1
            r10 = r15
            goto L_0x00d2
        L_0x00d1:
            r10 = r2
        L_0x00d2:
            if (r10 == 0) goto L_0x00d5
            goto L_0x00d9
        L_0x00d5:
            int r8 = r8 + 1
            goto L_0x00c7
        L_0x00d8:
            r9 = 0
        L_0x00d9:
            if (r9 == 0) goto L_0x00eb
            n.h r2 = p435n.C8044h.f16142j
            if (r3 <= 0) goto L_0x00e6
            n.g r2 = r0.f15933i
            long r5 = (long) r3
            n.h r2 = r2.mo25922p(r5)
        L_0x00e6:
            r1.mo25712j(r4, r9, r2)
            goto L_0x030c
        L_0x00eb:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_GOAWAY unexpected error code: "
            java.lang.String r2 = p005b.p035e.p036a.p037a.C0843a.m444e(r2, r6)
            r1.<init>(r2)
            throw r1
        L_0x00f7:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_GOAWAY streamId != 0"
            r1.<init>(r2)
            throw r1
        L_0x00ff:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_GOAWAY length < 8: "
            java.lang.String r2 = p005b.p035e.p036a.p037a.C0843a.m444e(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x010b:
            if (r3 != r9) goto L_0x012d
            if (r14 != 0) goto L_0x0125
            n.g r3 = r0.f15933i
            int r3 = r3.readInt()
            n.g r4 = r0.f15933i
            int r4 = r4.readInt()
            r5 = r12 & 1
            if (r5 == 0) goto L_0x0120
            r2 = r15
        L_0x0120:
            r1.mo25704b(r2, r3, r4)
            goto L_0x030c
        L_0x0125:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PING streamId != 0"
            r1.<init>(r2)
            throw r1
        L_0x012d:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PING length != 8: "
            java.lang.String r2 = p005b.p035e.p036a.p037a.C0843a.m444e(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x0139:
            if (r14 == 0) goto L_0x016c
            r4 = r12 & 8
            if (r4 == 0) goto L_0x0149
            n.g r2 = r0.f15933i
            byte r2 = r2.readByte()
            byte[] r5 = p421m.p422m0.C7867c.f15619a
            r2 = r2 & 255(0xff, float:3.57E-43)
        L_0x0149:
            n.g r5 = r0.f15933i
            int r5 = r5.readInt()
            r5 = r5 & r13
            int r3 = r3 + -4
            if (r4 == 0) goto L_0x0156
            int r3 = r3 + -1
        L_0x0156:
            if (r2 > r3) goto L_0x0162
            int r3 = r3 - r2
            java.util.List r2 = r0.mo25716q(r3, r2, r12, r14)
            r1.mo25711i(r14, r5, r2)
            goto L_0x030c
        L_0x0162:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = p005b.p035e.p036a.p037a.C0843a.m446g(r8, r2, r7, r3)
            r1.<init>(r2)
            throw r1
        L_0x016c:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x0174:
            if (r14 != 0) goto L_0x020c
            r5 = r12 & 1
            if (r5 == 0) goto L_0x0189
            if (r3 != 0) goto L_0x0181
            r18.mo25703a()
            goto L_0x030c
        L_0x0181:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r1.<init>(r2)
            throw r1
        L_0x0189:
            int r5 = r3 % 6
            if (r5 != 0) goto L_0x0200
            m.m0.j.t r5 = new m.m0.j.t
            r5.<init>()
            d.a0.d r3 = p298d.p333a0.C6759e.m12308d(r2, r3)
            r7 = 6
            d.a0.b r3 = p298d.p333a0.C6759e.m12307c(r3, r7)
            int r7 = r3.f13658g
            int r8 = r3.f13659h
            int r3 = r3.f13660i
            if (r3 < 0) goto L_0x01a6
            if (r7 > r8) goto L_0x01fb
            goto L_0x01a8
        L_0x01a6:
            if (r7 < r8) goto L_0x01fb
        L_0x01a8:
            n.g r9 = r0.f15933i
            short r9 = r9.readShort()
            r11 = 65535(0xffff, float:9.1834E-41)
            byte[] r12 = p421m.p422m0.C7867c.f15619a
            r9 = r9 & r11
            n.g r11 = r0.f15933i
            int r11 = r11.readInt()
            r12 = 2
            if (r9 == r12) goto L_0x01e7
            r12 = 3
            if (r9 == r12) goto L_0x01e5
            if (r9 == r4) goto L_0x01d9
            if (r9 == r6) goto L_0x01c5
            goto L_0x01f4
        L_0x01c5:
            if (r11 < r10) goto L_0x01cd
            r12 = 16777215(0xffffff, float:2.3509886E-38)
            if (r11 > r12) goto L_0x01cd
            goto L_0x01f4
        L_0x01cd:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r2 = p005b.p035e.p036a.p037a.C0843a.m444e(r2, r11)
            r1.<init>(r2)
            throw r1
        L_0x01d9:
            r9 = 7
            if (r11 < 0) goto L_0x01dd
            goto L_0x01f4
        L_0x01dd:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r1.<init>(r2)
            throw r1
        L_0x01e5:
            r9 = r4
            goto L_0x01f4
        L_0x01e7:
            if (r11 == 0) goto L_0x01f4
            if (r11 != r15) goto L_0x01ec
            goto L_0x01f4
        L_0x01ec:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r1.<init>(r2)
            throw r1
        L_0x01f4:
            r5.mo25751c(r9, r11)
            if (r7 == r8) goto L_0x01fb
            int r7 = r7 + r3
            goto L_0x01a8
        L_0x01fb:
            r1.mo25705c(r2, r5)
            goto L_0x030c
        L_0x0200:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r2 = p005b.p035e.p036a.p037a.C0843a.m444e(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x020c:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_SETTINGS streamId != 0"
            r1.<init>(r2)
            throw r1
        L_0x0214:
            if (r3 != r4) goto L_0x0250
            if (r14 == 0) goto L_0x0248
            n.g r3 = r0.f15933i
            int r3 = r3.readInt()
            m.m0.j.b[] r4 = p421m.p422m0.p429j.C7922b.values()
            r6 = r2
        L_0x0223:
            if (r6 >= r5) goto L_0x0234
            r7 = r4[r6]
            int r8 = r7.f15808g
            if (r8 != r3) goto L_0x022d
            r8 = r15
            goto L_0x022e
        L_0x022d:
            r8 = r2
        L_0x022e:
            if (r8 == 0) goto L_0x0231
            goto L_0x0235
        L_0x0231:
            int r6 = r6 + 1
            goto L_0x0223
        L_0x0234:
            r7 = 0
        L_0x0235:
            if (r7 == 0) goto L_0x023c
            r1.mo25708f(r14, r7)
            goto L_0x030c
        L_0x023c:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_RST_STREAM unexpected error code: "
            java.lang.String r2 = p005b.p035e.p036a.p037a.C0843a.m444e(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x0248:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_RST_STREAM streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x0250:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_RST_STREAM length: "
            java.lang.String r4 = " != 4"
            java.lang.String r2 = p005b.p035e.p036a.p037a.C0843a.m445f(r2, r3, r4)
            r1.<init>(r2)
            throw r1
        L_0x025e:
            if (r3 != r6) goto L_0x026f
            if (r14 == 0) goto L_0x0267
            r0.mo25717z(r1, r14)
            goto L_0x030c
        L_0x0267:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PRIORITY streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x026f:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PRIORITY length: "
            java.lang.String r4 = " != 5"
            java.lang.String r2 = p005b.p035e.p036a.p037a.C0843a.m445f(r2, r3, r4)
            r1.<init>(r2)
            throw r1
        L_0x027d:
            if (r14 == 0) goto L_0x02b7
            r4 = r12 & 1
            if (r4 == 0) goto L_0x0285
            r4 = r15
            goto L_0x0286
        L_0x0285:
            r4 = r2
        L_0x0286:
            r5 = r12 & 8
            if (r5 == 0) goto L_0x0294
            n.g r2 = r0.f15933i
            byte r2 = r2.readByte()
            byte[] r6 = p421m.p422m0.C7867c.f15619a
            r2 = r2 & 255(0xff, float:3.57E-43)
        L_0x0294:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x029d
            r0.mo25717z(r1, r14)
            int r3 = r3 + -5
        L_0x029d:
            if (r5 == 0) goto L_0x02a1
            int r3 = r3 + -1
        L_0x02a1:
            if (r2 > r3) goto L_0x02ad
            int r3 = r3 - r2
            java.util.List r2 = r0.mo25716q(r3, r2, r12, r14)
            r3 = -1
            r1.mo25710h(r4, r14, r3, r2)
            goto L_0x030c
        L_0x02ad:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = p005b.p035e.p036a.p037a.C0843a.m446g(r8, r2, r7, r3)
            r1.<init>(r2)
            throw r1
        L_0x02b7:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x02bf:
            if (r14 == 0) goto L_0x0304
            r4 = r12 & 1
            if (r4 == 0) goto L_0x02c7
            r4 = r15
            goto L_0x02c8
        L_0x02c7:
            r4 = r2
        L_0x02c8:
            r5 = r12 & 32
            if (r5 == 0) goto L_0x02ce
            r5 = r15
            goto L_0x02cf
        L_0x02ce:
            r5 = r2
        L_0x02cf:
            if (r5 != 0) goto L_0x02fc
            r5 = r12 & 8
            if (r5 == 0) goto L_0x02df
            n.g r2 = r0.f15933i
            byte r2 = r2.readByte()
            byte[] r6 = p421m.p422m0.C7867c.f15619a
            r2 = r2 & 255(0xff, float:3.57E-43)
        L_0x02df:
            if (r5 == 0) goto L_0x02e3
            int r3 = r3 + -1
        L_0x02e3:
            if (r2 > r3) goto L_0x02f2
            int r3 = r3 - r2
            n.g r5 = r0.f15933i
            r1.mo25706d(r4, r14, r5, r3)
            n.g r1 = r0.f15933i
            long r2 = (long) r2
            r1.skip(r2)
            goto L_0x030c
        L_0x02f2:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = p005b.p035e.p036a.p037a.C0843a.m446g(r8, r2, r7, r3)
            r1.<init>(r2)
            throw r1
        L_0x02fc:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            r1.<init>(r2)
            throw r1
        L_0x0304:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x030c:
            return r15
        L_0x030d:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "FRAME_SIZE_ERROR: "
            java.lang.String r2 = p005b.p035e.p036a.p037a.C0843a.m444e(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x0319:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p429j.C7947n.mo25714d(boolean, m.m0.j.n$b):boolean");
    }

    /* renamed from: e */
    public final void mo25715e(C7949b bVar) {
        C6888i.m12438e(bVar, "handler");
        if (!this.f15934j) {
            C8043g gVar = this.f15933i;
            C8044h hVar = C7928e.f15839a;
            C8044h p = gVar.mo25922p((long) hVar.mo25959l());
            Logger logger = f15929k;
            if (logger.isLoggable(Level.FINE)) {
                StringBuilder u = C0843a.m460u("<< CONNECTION ");
                u.append(p.mo25960p());
                logger.fine(C7867c.m14288i(u.toString(), new Object[0]));
            }
            if (!C6888i.m12434a(hVar, p)) {
                StringBuilder u2 = C0843a.m460u("Expected a connection header but was ");
                u2.append(p.mo25968z());
                throw new IOException(u2.toString());
            }
        } else if (!mo25714d(true, bVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p421m.p422m0.p429j.C7924c> mo25716q(int r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            m.m0.j.n$a r0 = r2.f15931g
            r0.f15938j = r3
            r0.f15935g = r3
            r0.f15939k = r4
            r0.f15936h = r5
            r0.f15937i = r6
            m.m0.j.d$a r3 = r2.f15932h
        L_0x000e:
            n.g r4 = r3.f15822b
            boolean r4 = r4.mo25886D()
            if (r4 != 0) goto L_0x0132
            n.g r4 = r3.f15822b
            byte r4 = r4.readByte()
            byte[] r5 = p421m.p422m0.C7867c.f15619a
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x012a
            r6 = r4 & 128(0x80, float:1.794E-43)
            r0 = 1
            if (r6 != r5) goto L_0x007c
            r5 = 127(0x7f, float:1.78E-43)
            int r4 = r3.mo25683g(r4, r5)
            int r4 = r4 - r0
            if (r4 < 0) goto L_0x003c
            m.m0.j.d r5 = p421m.p422m0.p429j.C7925d.f15820c
            m.m0.j.c[] r5 = p421m.p422m0.p429j.C7925d.f15818a
            int r5 = r5.length
            int r5 = r5 - r0
            if (r4 > r5) goto L_0x003c
            r5 = r0
            goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            if (r5 == 0) goto L_0x004b
            m.m0.j.d r5 = p421m.p422m0.p429j.C7925d.f15820c
            m.m0.j.c[] r5 = p421m.p422m0.p429j.C7925d.f15818a
            r4 = r5[r4]
            java.util.List<m.m0.j.c> r5 = r3.f15821a
            r5.add(r4)
            goto L_0x000e
        L_0x004b:
            m.m0.j.d r5 = p421m.p422m0.p429j.C7925d.f15820c
            m.m0.j.c[] r5 = p421m.p422m0.p429j.C7925d.f15818a
            int r5 = r5.length
            int r5 = r4 - r5
            int r5 = r3.mo25678b(r5)
            if (r5 < 0) goto L_0x0068
            m.m0.j.c[] r6 = r3.f15823c
            int r1 = r6.length
            if (r5 >= r1) goto L_0x0068
            java.util.List<m.m0.j.c> r4 = r3.f15821a
            r5 = r6[r5]
            p298d.p344x.p346c.C6888i.m12436c(r5)
            r4.add(r5)
            goto L_0x000e
        L_0x0068:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r5 = "Header index too large "
            java.lang.StringBuilder r5 = p005b.p035e.p036a.p037a.C0843a.m460u(r5)
            int r4 = r4 + r0
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L_0x007c:
            r5 = -1
            r6 = 64
            if (r4 != r6) goto L_0x0098
            m.m0.j.d r4 = p421m.p422m0.p429j.C7925d.f15820c
            n.h r6 = r3.mo25682f()
            r4.mo25676a(r6)
            n.h r4 = r3.mo25682f()
            m.m0.j.c r0 = new m.m0.j.c
            r0.<init>((p435n.C8044h) r6, (p435n.C8044h) r4)
            r3.mo25681e(r5, r0)
            goto L_0x000e
        L_0x0098:
            r1 = r4 & 64
            if (r1 != r6) goto L_0x00b5
            r6 = 63
            int r4 = r3.mo25683g(r4, r6)
            int r4 = r4 - r0
            n.h r4 = r3.mo25680d(r4)
            n.h r6 = r3.mo25682f()
            m.m0.j.c r0 = new m.m0.j.c
            r0.<init>((p435n.C8044h) r4, (p435n.C8044h) r6)
            r3.mo25681e(r5, r0)
            goto L_0x000e
        L_0x00b5:
            r5 = r4 & 32
            r6 = 32
            if (r5 != r6) goto L_0x00ef
            r5 = 31
            int r4 = r3.mo25683g(r4, r5)
            r3.f15828h = r4
            if (r4 < 0) goto L_0x00da
            int r5 = r3.f15827g
            if (r4 > r5) goto L_0x00da
            int r5 = r3.f15826f
            if (r4 >= r5) goto L_0x000e
            if (r4 != 0) goto L_0x00d4
            r3.mo25677a()
            goto L_0x000e
        L_0x00d4:
            int r5 = r5 - r4
            r3.mo25679c(r5)
            goto L_0x000e
        L_0x00da:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Invalid dynamic table size update "
            java.lang.StringBuilder r5 = p005b.p035e.p036a.p037a.C0843a.m460u(r5)
            int r3 = r3.f15828h
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x00ef:
            r5 = 16
            if (r4 == r5) goto L_0x0111
            if (r4 != 0) goto L_0x00f6
            goto L_0x0111
        L_0x00f6:
            r5 = 15
            int r4 = r3.mo25683g(r4, r5)
            int r4 = r4 - r0
            n.h r4 = r3.mo25680d(r4)
            n.h r5 = r3.mo25682f()
            java.util.List<m.m0.j.c> r6 = r3.f15821a
            m.m0.j.c r0 = new m.m0.j.c
            r0.<init>((p435n.C8044h) r4, (p435n.C8044h) r5)
            r6.add(r0)
            goto L_0x000e
        L_0x0111:
            m.m0.j.d r4 = p421m.p422m0.p429j.C7925d.f15820c
            n.h r5 = r3.mo25682f()
            r4.mo25676a(r5)
            n.h r4 = r3.mo25682f()
            java.util.List<m.m0.j.c> r6 = r3.f15821a
            m.m0.j.c r0 = new m.m0.j.c
            r0.<init>((p435n.C8044h) r5, (p435n.C8044h) r4)
            r6.add(r0)
            goto L_0x000e
        L_0x012a:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "index == 0"
            r3.<init>(r4)
            throw r3
        L_0x0132:
            m.m0.j.d$a r3 = r2.f15932h
            java.util.List<m.m0.j.c> r4 = r3.f15821a
            java.util.List r4 = p298d.p334t.C6790h.m12337X(r4)
            java.util.List<m.m0.j.c> r3 = r3.f15821a
            r3.clear()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p429j.C7947n.mo25716q(int, int, int, int):java.util.List");
    }

    /* renamed from: z */
    public final void mo25717z(C7949b bVar, int i) {
        int readInt = this.f15933i.readInt();
        boolean z = (((int) 2147483648L) & readInt) != 0;
        int i2 = readInt & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        byte readByte = this.f15933i.readByte();
        byte[] bArr = C7867c.f15619a;
        bVar.mo25707e(i, i2, (readByte & ExifInterface.MARKER) + 1, z);
    }
}
