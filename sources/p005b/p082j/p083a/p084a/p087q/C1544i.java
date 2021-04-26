package p005b.p082j.p083a.p084a.p087q;

import java.io.CharConversionException;
import java.io.InputStream;
import java.io.Reader;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.j.a.a.q.i */
public class C1544i extends Reader {

    /* renamed from: g */
    public final C1537b f2474g;

    /* renamed from: h */
    public InputStream f2475h;

    /* renamed from: i */
    public byte[] f2476i;

    /* renamed from: j */
    public int f2477j;

    /* renamed from: k */
    public int f2478k;

    /* renamed from: l */
    public final boolean f2479l;

    /* renamed from: m */
    public char f2480m = 0;

    /* renamed from: n */
    public int f2481n;

    /* renamed from: o */
    public int f2482o;

    /* renamed from: p */
    public final boolean f2483p;

    /* renamed from: q */
    public char[] f2484q;

    public C1544i(C1537b bVar, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        boolean z2 = false;
        this.f2474g = bVar;
        this.f2475h = inputStream;
        this.f2476i = bArr;
        this.f2477j = i;
        this.f2478k = i2;
        this.f2479l = z;
        this.f2483p = inputStream != null ? true : z2;
    }

    public void close() {
        InputStream inputStream = this.f2475h;
        if (inputStream != null) {
            this.f2475h = null;
            mo11558d();
            inputStream.close();
        }
    }

    /* renamed from: d */
    public final void mo11558d() {
        byte[] bArr = this.f2476i;
        if (bArr != null) {
            this.f2476i = null;
            this.f2474g.mo11540c(bArr);
        }
    }

    /* renamed from: e */
    public final void mo11559e(int i, int i2) {
        int i3 = this.f2482o + i;
        int i4 = this.f2481n;
        StringBuilder x = C0843a.m463x("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ", i, ", needed ", i2, ", at char #");
        x.append(i4);
        x.append(", byte #");
        x.append(i3);
        x.append(")");
        throw new CharConversionException(x.toString());
    }

    public int read() {
        if (this.f2484q == null) {
            this.f2484q = new char[1];
        }
        if (read(this.f2484q, 0, 1) < 1) {
            return -1;
        }
        return this.f2484q[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(char[] r13, int r14, int r15) {
        /*
            r12 = this;
            byte[] r0 = r12.f2476i
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            r2 = 1
            if (r15 >= r2) goto L_0x000a
            return r15
        L_0x000a:
            if (r14 < 0) goto L_0x0164
            int r3 = r14 + r15
            int r4 = r13.length
            if (r3 > r4) goto L_0x0164
            char r15 = r12.f2480m
            r4 = 0
            r5 = 4
            if (r15 == 0) goto L_0x001f
            int r0 = r14 + 1
            r13[r14] = r15
            r12.f2480m = r4
            goto L_0x009d
        L_0x001f:
            int r15 = r12.f2478k
            int r6 = r12.f2477j
            int r7 = r15 - r6
            if (r7 >= r5) goto L_0x009c
            int r8 = r12.f2482o
            int r15 = r15 - r7
            int r15 = r15 + r8
            r12.f2482o = r15
            java.lang.String r15 = "Strange I/O stream, returned 0 bytes on read"
            r8 = 0
            if (r7 <= 0) goto L_0x003b
            if (r6 <= 0) goto L_0x0039
            java.lang.System.arraycopy(r0, r6, r0, r4, r7)
            r12.f2477j = r4
        L_0x0039:
            r0 = r7
            goto L_0x005c
        L_0x003b:
            r12.f2477j = r4
            java.io.InputStream r6 = r12.f2475h
            if (r6 != 0) goto L_0x0043
            r0 = r1
            goto L_0x0047
        L_0x0043:
            int r0 = r6.read(r0)
        L_0x0047:
            if (r0 >= r2) goto L_0x005c
            r12.f2478k = r4
            if (r0 >= 0) goto L_0x0056
            boolean r15 = r12.f2483p
            if (r15 == 0) goto L_0x0054
            r12.mo11558d()
        L_0x0054:
            r15 = r4
            goto L_0x008e
        L_0x0056:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r15)
            throw r13
        L_0x005c:
            r12.f2478k = r0
        L_0x005e:
            int r0 = r12.f2478k
            if (r0 >= r5) goto L_0x008d
            java.io.InputStream r6 = r12.f2475h
            if (r6 != 0) goto L_0x0068
            r0 = r1
            goto L_0x0070
        L_0x0068:
            byte[] r9 = r12.f2476i
            int r10 = r9.length
            int r10 = r10 - r0
            int r0 = r6.read(r9, r0, r10)
        L_0x0070:
            if (r0 >= r2) goto L_0x0087
            if (r0 >= 0) goto L_0x0081
            boolean r13 = r12.f2483p
            if (r13 == 0) goto L_0x007b
            r12.mo11558d()
        L_0x007b:
            int r13 = r12.f2478k
            r12.mo11559e(r13, r5)
            throw r8
        L_0x0081:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r15)
            throw r13
        L_0x0087:
            int r6 = r12.f2478k
            int r6 = r6 + r0
            r12.f2478k = r6
            goto L_0x005e
        L_0x008d:
            r15 = r2
        L_0x008e:
            if (r15 != 0) goto L_0x009c
            if (r7 != 0) goto L_0x0093
            return r1
        L_0x0093:
            int r13 = r12.f2478k
            int r14 = r12.f2477j
            int r13 = r13 - r14
            r12.mo11559e(r13, r5)
            throw r8
        L_0x009c:
            r0 = r14
        L_0x009d:
            int r15 = r12.f2478k
            int r15 = r15 - r5
        L_0x00a0:
            if (r0 >= r3) goto L_0x015d
            int r5 = r12.f2477j
            boolean r6 = r12.f2479l
            if (r6 == 0) goto L_0x00c5
            byte[] r6 = r12.f2476i
            byte r7 = r6[r5]
            int r7 = r7 << 8
            int r8 = r5 + 1
            byte r8 = r6[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r7 = r7 | r8
            int r8 = r5 + 2
            byte r8 = r6[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            int r9 = r5 + 3
            byte r6 = r6[r9]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r6 | r8
            goto L_0x00e4
        L_0x00c5:
            byte[] r6 = r12.f2476i
            byte r7 = r6[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r5 + 1
            byte r8 = r6[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r7 = r7 | r8
            int r8 = r5 + 2
            byte r8 = r6[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r9 = r5 + 3
            byte r6 = r6[r9]
            int r6 = r6 << 8
            r6 = r6 | r8
            r11 = r7
            r7 = r6
            r6 = r11
        L_0x00e4:
            int r5 = r5 + 4
            r12.f2477j = r5
            if (r7 == 0) goto L_0x0155
            r8 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r8
            int r8 = r7 + -1
            r9 = 16
            int r8 = r8 << r9
            r6 = r6 | r8
            if (r7 > r9) goto L_0x0111
            int r7 = r0 + 1
            r8 = 55296(0xd800, float:7.7486E-41)
            int r9 = r6 >> 10
            int r9 = r9 + r8
            char r8 = (char) r9
            r13[r0] = r8
            r0 = 56320(0xdc00, float:7.8921E-41)
            r8 = r6 & 1023(0x3ff, float:1.434E-42)
            r0 = r0 | r8
            if (r7 < r3) goto L_0x010e
            char r13 = (char) r6
            r12.f2480m = r13
            r0 = r7
            goto L_0x015d
        L_0x010e:
            r6 = r0
            r0 = r7
            goto L_0x0155
        L_0x0111:
            int r0 = r0 - r14
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r14 = 1114111(0x10ffff, float:1.561202E-39)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r4] = r14
            java.lang.String r14 = " (above 0x%08x)"
            java.lang.String r13 = java.lang.String.format(r14, r13)
            int r14 = r12.f2482o
            int r15 = r12.f2477j
            int r14 = r14 + r15
            int r14 = r14 + r1
            int r15 = r12.f2481n
            int r15 = r15 + r0
            java.io.CharConversionException r0 = new java.io.CharConversionException
            java.lang.String r1 = "Invalid UTF-32 character 0x"
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r6)
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = " at char #"
            r1.append(r13)
            r1.append(r15)
            java.lang.String r13 = ", byte #"
            r1.append(r13)
            java.lang.String r13 = ")"
            java.lang.String r13 = p005b.p035e.p036a.p037a.C0843a.m453n(r1, r14, r13)
            r0.<init>(r13)
            throw r0
        L_0x0155:
            int r7 = r0 + 1
            char r6 = (char) r6
            r13[r0] = r6
            r0 = r7
            if (r5 <= r15) goto L_0x00a0
        L_0x015d:
            int r0 = r0 - r14
            int r13 = r12.f2481n
            int r13 = r13 + r0
            r12.f2481n = r13
            return r0
        L_0x0164:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r1 = "read(buf,"
            java.lang.String r2 = ","
            java.lang.String r3 = "), cbuf["
            java.lang.StringBuilder r14 = p005b.p035e.p036a.p037a.C0843a.m463x(r1, r14, r2, r15, r3)
            int r13 = r13.length
            java.lang.String r15 = "]"
            java.lang.String r13 = p005b.p035e.p036a.p037a.C0843a.m453n(r14, r13, r15)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p082j.p083a.p084a.p087q.C1544i.read(char[], int, int):int");
    }
}
