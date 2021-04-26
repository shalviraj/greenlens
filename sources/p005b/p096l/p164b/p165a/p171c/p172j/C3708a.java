package p005b.p096l.p164b.p165a.p171c.p172j;

import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Objects;
import p005b.p082j.p083a.p084a.C1513a;
import p005b.p082j.p083a.p084a.C1514b;
import p005b.p082j.p083a.p084a.C1517d;
import p005b.p082j.p083a.p084a.C1525j;
import p005b.p082j.p083a.p084a.C1526k;
import p005b.p082j.p083a.p084a.C1528m;
import p005b.p082j.p083a.p084a.p087q.C1537b;
import p005b.p082j.p083a.p084a.p088r.C1552g;
import p005b.p096l.p164b.p165a.p171c.C3700c;
import p005b.p096l.p164b.p165a.p171c.C3701d;
import p005b.p096l.p164b.p165a.p171c.C3703f;
import p005b.p096l.p164b.p165a.p171c.C3707i;

/* renamed from: b.l.b.a.c.j.a */
public final class C3708a extends C3700c {

    /* renamed from: a */
    public final C1514b f6846a;

    public C3708a() {
        C1514b bVar = new C1514b((C1526k) null);
        this.f6846a = bVar;
        C1517d.C1518a aVar = C1517d.C1518a.AUTO_CLOSE_JSON_CONTENT;
        bVar.f2335k = (~aVar.f2358h) & bVar.f2335k;
    }

    /* renamed from: f */
    public static C3707i m6997f(C1525j jVar) {
        if (jVar == null) {
            return null;
        }
        switch (jVar.ordinal()) {
            case 1:
                return C3707i.START_OBJECT;
            case 2:
                return C3707i.END_OBJECT;
            case 3:
                return C3707i.START_ARRAY;
            case 4:
                return C3707i.END_ARRAY;
            case 5:
                return C3707i.FIELD_NAME;
            case 7:
                return C3707i.VALUE_STRING;
            case 8:
                return C3707i.VALUE_NUMBER_INT;
            case 9:
                return C3707i.VALUE_NUMBER_FLOAT;
            case 10:
                return C3707i.VALUE_TRUE;
            case 11:
                return C3707i.VALUE_FALSE;
            case 12:
                return C3707i.VALUE_NULL;
            default:
                return C3707i.NOT_AVAILABLE;
        }
    }

    /* renamed from: a */
    public C3701d mo15024a(OutputStream outputStream, Charset charset) {
        C1514b bVar = this.f6846a;
        C1513a aVar = C1513a.UTF8;
        C1537b a = bVar.mo11457a(outputStream, false);
        a.f2453b = aVar;
        C1552g gVar = new C1552g(a, bVar.f2335k, bVar.f2336l, outputStream, bVar.f2338n);
        C1528m mVar = bVar.f2337m;
        if (mVar != C1514b.f2330r) {
            gVar.f2501n = mVar;
        }
        return new C3709b(this, gVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: b.j.a.a.r.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: b.j.a.a.r.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: b.j.a.a.r.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: b.j.a.a.q.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: b.j.a.a.q.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: b.j.a.a.r.h} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d4, code lost:
        if (r6.mo11562a(r4 >>> 16) == false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0101, code lost:
        if (r6.mo11562a((r0[r4 + 1] & androidx.exifinterface.media.ExifInterface.MARKER) | ((r0[r4] & 255) << 8)) != false) goto L_0x0103;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p096l.p164b.p165a.p171c.C3703f mo15025b(java.io.InputStream r21, java.nio.charset.Charset r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.util.Objects.requireNonNull(r21)
            b.l.b.a.c.j.c r2 = new b.l.b.a.c.j.c
            b.j.a.a.b r3 = r0.f6846a
            r4 = 0
            b.j.a.a.q.b r5 = r3.mo11457a(r1, r4)
            b.j.a.a.r.a r6 = new b.j.a.a.r.a
            r6.<init>(r5, r1)
            int r9 = r3.f2334j
            b.j.a.a.k r11 = r3.f2336l
            b.j.a.a.s.a r13 = r3.f2332h
            b.j.a.a.s.b r1 = r3.f2331g
            int r3 = r3.f2333i
            int r5 = r6.f2488d
            b.j.a.a.a r7 = p005b.p082j.p083a.p084a.C1513a.UTF8
            r8 = 4
            boolean r10 = r6.mo11563b(r8)
            r12 = 16
            r15 = 8
            if (r10 == 0) goto L_0x00e3
            byte[] r10 = r6.f2487c
            int r8 = r6.f2488d
            byte r16 = r10[r8]
            int r16 = r16 << 24
            int r17 = r8 + 1
            byte r4 = r10[r17]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r12
            r4 = r16 | r4
            int r12 = r8 + 2
            byte r14 = r10[r12]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << r15
            r4 = r4 | r14
            int r14 = r8 + 3
            byte r10 = r10[r14]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r4 = r4 | r10
            r10 = -16842752(0xfffffffffeff0000, float:-1.6947657E38)
            java.lang.String r15 = "3412"
            r19 = 0
            if (r4 == r10) goto L_0x00df
            r10 = -131072(0xfffffffffffe0000, float:NaN)
            java.lang.String r0 = "2143"
            if (r4 == r10) goto L_0x0097
            r10 = 65279(0xfeff, float:9.1475E-41)
            if (r4 == r10) goto L_0x008d
            r8 = 65534(0xfffe, float:9.1833E-41)
            if (r4 == r8) goto L_0x0089
            int r8 = r4 >>> 16
            if (r8 != r10) goto L_0x0071
            r6.f2488d = r12
            r8 = 2
            r6.f2492h = r8
            r10 = 1
            goto L_0x009f
        L_0x0071:
            r10 = 65534(0xfffe, float:9.1833E-41)
            if (r8 != r10) goto L_0x007a
            r6.f2488d = r12
            r8 = 2
            goto L_0x009c
        L_0x007a:
            int r8 = r4 >>> 8
            r10 = 15711167(0xefbbbf, float:2.2016034E-38)
            if (r8 != r10) goto L_0x0087
            r6.f2488d = r14
            r10 = 1
            r6.f2492h = r10
            goto L_0x009f
        L_0x0087:
            r8 = 0
            goto L_0x00a2
        L_0x0089:
            r6.mo11564c(r0)
            throw r19
        L_0x008d:
            r10 = 1
            r6.f2491g = r10
            r10 = 4
            int r8 = r8 + r10
            r6.f2488d = r8
            r6.f2492h = r10
            goto L_0x00a1
        L_0x0097:
            r10 = 4
            int r8 = r8 + r10
            r6.f2488d = r8
            r8 = 4
        L_0x009c:
            r6.f2492h = r8
            r10 = 0
        L_0x009f:
            r6.f2491g = r10
        L_0x00a1:
            r8 = 1
        L_0x00a2:
            if (r8 == 0) goto L_0x00a5
            goto L_0x0103
        L_0x00a5:
            int r8 = r4 >> 8
            if (r8 != 0) goto L_0x00ae
            r8 = 1
            r6.f2491g = r8
            r8 = 0
            goto L_0x00b7
        L_0x00ae:
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            r8 = r8 & r4
            if (r8 != 0) goto L_0x00bc
            r8 = 0
            r6.f2491g = r8
        L_0x00b7:
            r0 = 4
            r6.f2492h = r0
            r0 = 1
            goto L_0x00ca
        L_0x00bc:
            r8 = 0
            r10 = -16711681(0xffffffffff00ffff, float:-1.714704E38)
            r10 = r10 & r4
            if (r10 == 0) goto L_0x00db
            r10 = -65281(0xffffffffffff00ff, float:NaN)
            r10 = r10 & r4
            if (r10 == 0) goto L_0x00d7
            r0 = r8
        L_0x00ca:
            if (r0 == 0) goto L_0x00cd
            goto L_0x0103
        L_0x00cd:
            r0 = 16
            int r4 = r4 >>> r0
            boolean r0 = r6.mo11562a(r4)
            if (r0 == 0) goto L_0x0105
            goto L_0x0103
        L_0x00d7:
            r6.mo11564c(r0)
            throw r19
        L_0x00db:
            r6.mo11564c(r15)
            throw r19
        L_0x00df:
            r6.mo11564c(r15)
            throw r19
        L_0x00e3:
            r0 = 2
            r8 = 0
            boolean r4 = r6.mo11563b(r0)
            if (r4 == 0) goto L_0x0105
            byte[] r0 = r6.f2487c
            int r4 = r6.f2488d
            byte r10 = r0[r4]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r12 = 8
            int r10 = r10 << r12
            r12 = 1
            int r4 = r4 + r12
            byte r0 = r0[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r10
            boolean r0 = r6.mo11562a(r0)
            if (r0 == 0) goto L_0x0105
        L_0x0103:
            r4 = 1
            goto L_0x0106
        L_0x0105:
            r4 = r8
        L_0x0106:
            java.lang.String r0 = "Internal error"
            if (r4 != 0) goto L_0x010b
            goto L_0x0130
        L_0x010b:
            int r4 = r6.f2492h
            r8 = 1
            if (r4 == r8) goto L_0x0130
            r8 = 2
            if (r4 == r8) goto L_0x0126
            r8 = 4
            if (r4 != r8) goto L_0x0120
            boolean r4 = r6.f2491g
            if (r4 == 0) goto L_0x011d
            b.j.a.a.a r4 = p005b.p082j.p083a.p084a.C1513a.UTF32_BE
            goto L_0x0131
        L_0x011d:
            b.j.a.a.a r4 = p005b.p082j.p083a.p084a.C1513a.UTF32_LE
            goto L_0x0131
        L_0x0120:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0126:
            boolean r4 = r6.f2491g
            if (r4 == 0) goto L_0x012d
            b.j.a.a.a r4 = p005b.p082j.p083a.p084a.C1513a.UTF16_BE
            goto L_0x0131
        L_0x012d:
            b.j.a.a.a r4 = p005b.p082j.p083a.p084a.C1513a.UTF16_LE
            goto L_0x0131
        L_0x0130:
            r4 = r7
        L_0x0131:
            b.j.a.a.q.b r8 = r6.f2485a
            r8.f2453b = r4
            int r8 = r6.f2488d
            int r5 = r8 - r5
            if (r4 != r7) goto L_0x017c
            b.j.a.a.b$a r4 = p005b.p082j.p083a.p084a.C1514b.C1515a.CANONICALIZE_FIELD_NAMES
            boolean r4 = r4.mo11459d(r3)
            if (r4 == 0) goto L_0x017c
            java.util.Objects.requireNonNull(r13)
            b.j.a.a.s.a r0 = new b.j.a.a.s.a
            b.j.a.a.b$a r1 = p005b.p082j.p083a.p084a.C1514b.C1515a.INTERN_FIELD_NAMES
            boolean r14 = r1.mo11459d(r3)
            int r15 = r13.f2563c
            b.j.a.a.b$a r1 = p005b.p082j.p083a.p084a.C1514b.C1515a.FAIL_ON_SYMBOL_HASH_OVERFLOW
            boolean r16 = r1.mo11459d(r3)
            java.util.concurrent.atomic.AtomicReference<b.j.a.a.s.a$a> r1 = r13.f2562b
            java.lang.Object r1 = r1.get()
            r17 = r1
            b.j.a.a.s.a$a r17 = (p005b.p082j.p083a.p084a.p089s.C1554a.C1555a) r17
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            b.j.a.a.r.h r1 = new b.j.a.a.r.h
            b.j.a.a.q.b r8 = r6.f2485a
            java.io.InputStream r10 = r6.f2486b
            byte[] r13 = r6.f2487c
            int r14 = r6.f2488d
            int r15 = r6.f2489e
            boolean r3 = r6.f2490f
            r7 = r1
            r16 = r5
            r17 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01eb
        L_0x017c:
            b.j.a.a.r.f r4 = new b.j.a.a.r.f
            b.j.a.a.q.b r8 = r6.f2485a
            b.j.a.a.a r5 = r8.f2453b
            int r7 = r5.f2326i
            r10 = 8
            if (r7 == r10) goto L_0x01b1
            r10 = 16
            if (r7 == r10) goto L_0x01b1
            r5 = 32
            if (r7 != r5) goto L_0x01ab
            b.j.a.a.q.i r0 = new b.j.a.a.q.i
            b.j.a.a.q.b r13 = r6.f2485a
            java.io.InputStream r14 = r6.f2486b
            byte[] r15 = r6.f2487c
            int r5 = r6.f2488d
            int r6 = r6.f2489e
            b.j.a.a.a r7 = r13.f2453b
            boolean r7 = r7.f2325h
            r12 = r0
            r16 = r5
            r17 = r6
            r18 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18)
            goto L_0x01e1
        L_0x01ab:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x01b1:
            java.io.InputStream r14 = r6.f2486b
            if (r14 != 0) goto L_0x01c1
            java.io.ByteArrayInputStream r14 = new java.io.ByteArrayInputStream
            byte[] r0 = r6.f2487c
            int r7 = r6.f2488d
            int r6 = r6.f2489e
            r14.<init>(r0, r7, r6)
            goto L_0x01da
        L_0x01c1:
            int r0 = r6.f2488d
            int r7 = r6.f2489e
            if (r0 >= r7) goto L_0x01da
            b.j.a.a.q.e r0 = new b.j.a.a.q.e
            b.j.a.a.q.b r13 = r6.f2485a
            byte[] r15 = r6.f2487c
            int r7 = r6.f2488d
            int r6 = r6.f2489e
            r12 = r0
            r16 = r7
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17)
            r14 = r0
        L_0x01da:
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.lang.String r5 = r5.f2324g
            r0.<init>(r14, r5)
        L_0x01e1:
            r10 = r0
            b.j.a.a.s.b r12 = r1.mo11682d(r3)
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            r1 = r4
        L_0x01eb:
            r0 = r20
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p164b.p165a.p171c.p172j.C3708a.mo15025b(java.io.InputStream, java.nio.charset.Charset):b.l.b.a.c.f");
    }

    /* renamed from: c */
    public C3703f mo15026c(Reader reader) {
        Objects.requireNonNull(reader);
        return new C3710c(this, this.f6846a.mo11458b(reader));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: b.j.a.a.r.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: b.j.a.a.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: b.j.a.a.r.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: b.j.a.a.r.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p096l.p164b.p165a.p171c.C3703f mo15027d(java.lang.String r15) {
        /*
            r14 = this;
            java.util.Objects.requireNonNull(r15)
            b.l.b.a.c.j.c r0 = new b.l.b.a.c.j.c
            b.j.a.a.b r1 = r14.f6846a
            java.util.Objects.requireNonNull(r1)
            int r2 = r15.length()
            r3 = 32768(0x8000, float:4.5918E-41)
            if (r2 > r3) goto L_0x0041
            r3 = 1
            b.j.a.a.q.b r5 = r1.mo11457a(r15, r3)
            char[] r3 = r5.f2458g
            r5.mo11538a(r3)
            b.j.a.a.t.a r3 = r5.f2455d
            r4 = 0
            char[] r10 = r3.mo11685b(r4, r2)
            r5.f2458g = r10
            r15.getChars(r4, r2, r10, r4)
            r13 = 1
            b.j.a.a.r.f r15 = new b.j.a.a.r.f
            int r6 = r1.f2334j
            b.j.a.a.k r8 = r1.f2336l
            b.j.a.a.s.b r3 = r1.f2331g
            int r1 = r1.f2333i
            b.j.a.a.s.b r9 = r3.mo11682d(r1)
            int r12 = r2 + 0
            r7 = 0
            r11 = 0
            r4 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x004a
        L_0x0041:
            java.io.StringReader r2 = new java.io.StringReader
            r2.<init>(r15)
            b.j.a.a.g r15 = r1.mo11458b(r2)
        L_0x004a:
            r0.<init>(r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p164b.p165a.p171c.p172j.C3708a.mo15027d(java.lang.String):b.l.b.a.c.f");
    }
}
