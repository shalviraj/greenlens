package okhttp3.internal.publicsuffix;

import androidx.exifinterface.media.ExifInterface;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;
import p421m.p422m0.C7867c;

public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final byte[] f16261e = {(byte) 42};

    /* renamed from: f */
    public static final List<String> f16262f = C5266a.m9910Y2("*");

    /* renamed from: g */
    public static final PublicSuffixDatabase f16263g = new PublicSuffixDatabase();

    /* renamed from: h */
    public static final C8090a f16264h = new C8090a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final AtomicBoolean f16265a = new AtomicBoolean(false);

    /* renamed from: b */
    public final CountDownLatch f16266b = new CountDownLatch(1);

    /* renamed from: c */
    public byte[] f16267c;

    /* renamed from: d */
    public byte[] f16268d;

    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a */
    public static final class C8090a {
        public C8090a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: a */
        public static final String m14985a(C8090a aVar, byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            byte b;
            int i3;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            int length = bArr3.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr3[i5] != ((byte) 10)) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i2 = i6 + i7;
                    if (bArr3[i2] == ((byte) 10)) {
                        break;
                    }
                    i7++;
                }
                int i8 = i2 - i6;
                int i9 = i;
                boolean z2 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        b = 46;
                        z = false;
                    } else {
                        byte b2 = bArr4[i9][i10];
                        byte[] bArr5 = C7867c.f15619a;
                        byte b3 = b2 & ExifInterface.MARKER;
                        z = z2;
                        b = b3;
                    }
                    byte b4 = bArr3[i6 + i11];
                    byte[] bArr6 = C7867c.f15619a;
                    i3 = b - (b4 & ExifInterface.MARKER);
                    if (i3 == 0) {
                        i11++;
                        i10++;
                        if (i11 == i8) {
                            break;
                        } else if (bArr4[i9].length != i10) {
                            z2 = z;
                        } else if (i9 == bArr4.length - 1) {
                            break;
                        } else {
                            i9++;
                            i10 = -1;
                            z2 = true;
                        }
                    } else {
                        break;
                    }
                }
                if (i3 >= 0) {
                    if (i3 <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr4[i9].length - i10;
                        int length3 = bArr4.length;
                        for (int i13 = i9 + 1; i13 < length3; i13++) {
                            length2 += bArr4[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset charset = StandardCharsets.UTF_8;
                                C6888i.m12437d(charset, "UTF_8");
                                return new String(bArr3, i6, i8, charset);
                            }
                        }
                    }
                    i4 = i2 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r1 == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r1 != false) goto L_0x003a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0042 */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x014f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0150  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo26040a(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "domain"
            p298d.p344x.p346c.C6888i.m12438e(r14, r0)
            java.lang.String r0 = java.net.IDN.toUnicode(r14)
            java.lang.String r1 = "unicodeDomain"
            p298d.p344x.p346c.C6888i.m12437d(r0, r1)
            java.util.List r0 = r13.mo26042c(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r13.f16265a
            boolean r1 = r1.get()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0051
            java.util.concurrent.atomic.AtomicBoolean r1 = r13.f16265a
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x0051
            r1 = r2
        L_0x0025:
            r13.mo26041b()     // Catch:{ InterruptedIOException -> 0x0042, IOException -> 0x002d }
            if (r1 == 0) goto L_0x005e
            goto L_0x003a
        L_0x002b:
            r14 = move-exception
            goto L_0x0047
        L_0x002d:
            r4 = move-exception
            m.m0.k.h$a r5 = p421m.p422m0.p430k.C7976h.f16015c     // Catch:{ all -> 0x002b }
            m.m0.k.h r5 = p421m.p422m0.p430k.C7976h.f16013a     // Catch:{ all -> 0x002b }
            java.lang.String r6 = "Failed to read public suffix list"
            r7 = 5
            r5.mo25771i(r6, r7, r4)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x005e
        L_0x003a:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            goto L_0x005e
        L_0x0042:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x002b }
            r1 = r3
            goto L_0x0025
        L_0x0047:
            if (r1 == 0) goto L_0x0050
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0050:
            throw r14
        L_0x0051:
            java.util.concurrent.CountDownLatch r1 = r13.f16266b     // Catch:{ InterruptedException -> 0x0057 }
            r1.await()     // Catch:{ InterruptedException -> 0x0057 }
            goto L_0x005e
        L_0x0057:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x005e:
            byte[] r1 = r13.f16267c
            if (r1 == 0) goto L_0x0064
            r1 = r3
            goto L_0x0065
        L_0x0064:
            r1 = r2
        L_0x0065:
            if (r1 == 0) goto L_0x01d5
            int r1 = r0.size()
            byte[][] r4 = new byte[r1][]
            r5 = r2
        L_0x006e:
            if (r5 >= r1) goto L_0x0090
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r8 = "UTF_8"
            p298d.p344x.p346c.C6888i.m12437d(r7, r8)
            java.lang.String r8 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r6, r8)
            byte[] r6 = r6.getBytes(r7)
            java.lang.String r7 = "(this as java.lang.String).getBytes(charset)"
            p298d.p344x.p346c.C6888i.m12437d(r6, r7)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x006e
        L_0x0090:
            r5 = r2
        L_0x0091:
            java.lang.String r6 = "publicSuffixListBytes"
            r7 = 0
            if (r5 >= r1) goto L_0x00aa
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r8 = f16264h
            byte[] r9 = r13.f16267c
            if (r9 == 0) goto L_0x00a6
            java.lang.String r8 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.C8090a.m14985a(r8, r9, r4, r5)
            if (r8 == 0) goto L_0x00a3
            goto L_0x00ab
        L_0x00a3:
            int r5 = r5 + 1
            goto L_0x0091
        L_0x00a6:
            p298d.p344x.p346c.C6888i.m12446m(r6)
            throw r7
        L_0x00aa:
            r8 = r7
        L_0x00ab:
            if (r1 <= r3) goto L_0x00d0
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            int r9 = r5.length
            int r9 = r9 - r3
            r10 = r2
        L_0x00b6:
            if (r10 >= r9) goto L_0x00d0
            byte[] r11 = f16261e
            r5[r10] = r11
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r11 = f16264h
            byte[] r12 = r13.f16267c
            if (r12 == 0) goto L_0x00cc
            java.lang.String r11 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.C8090a.m14985a(r11, r12, r5, r10)
            if (r11 == 0) goto L_0x00c9
            goto L_0x00d1
        L_0x00c9:
            int r10 = r10 + 1
            goto L_0x00b6
        L_0x00cc:
            p298d.p344x.p346c.C6888i.m12446m(r6)
            throw r7
        L_0x00d0:
            r11 = r7
        L_0x00d1:
            if (r11 == 0) goto L_0x00ed
            int r1 = r1 - r3
            r5 = r2
        L_0x00d5:
            if (r5 >= r1) goto L_0x00ed
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r6 = f16264h
            byte[] r9 = r13.f16268d
            if (r9 == 0) goto L_0x00e7
            java.lang.String r6 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.C8090a.m14985a(r6, r9, r4, r5)
            if (r6 == 0) goto L_0x00e4
            goto L_0x00ee
        L_0x00e4:
            int r5 = r5 + 1
            goto L_0x00d5
        L_0x00e7:
            java.lang.String r14 = "publicSuffixExceptionListBytes"
            p298d.p344x.p346c.C6888i.m12446m(r14)
            throw r7
        L_0x00ed:
            r6 = r7
        L_0x00ee:
            r1 = 6
            r4 = 46
            r5 = 33
            if (r6 == 0) goto L_0x010d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            char[] r8 = new char[r3]
            r8[r2] = r4
            java.util.List r1 = p298d.p415c0.C7694h.m13945w(r6, r8, r2, r2, r1)
            goto L_0x0139
        L_0x010d:
            if (r8 != 0) goto L_0x0114
            if (r11 != 0) goto L_0x0114
            java.util.List<java.lang.String> r1 = f16262f
            goto L_0x0139
        L_0x0114:
            if (r8 == 0) goto L_0x011f
            char[] r6 = new char[r3]
            r6[r2] = r4
            java.util.List r6 = p298d.p415c0.C7694h.m13945w(r8, r6, r2, r2, r1)
            goto L_0x0121
        L_0x011f:
            d.t.p r6 = p298d.p334t.C6798p.f13713g
        L_0x0121:
            if (r11 == 0) goto L_0x012c
            char[] r8 = new char[r3]
            r8[r2] = r4
            java.util.List r1 = p298d.p415c0.C7694h.m13945w(r11, r8, r2, r2, r1)
            goto L_0x012e
        L_0x012c:
            d.t.p r1 = p298d.p334t.C6798p.f13713g
        L_0x012e:
            int r4 = r6.size()
            int r8 = r1.size()
            if (r4 <= r8) goto L_0x0139
            r1 = r6
        L_0x0139:
            int r4 = r0.size()
            int r6 = r1.size()
            if (r4 != r6) goto L_0x0150
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            char r4 = r4.charAt(r2)
            if (r4 == r5) goto L_0x0150
            return r7
        L_0x0150:
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            char r4 = r4.charAt(r2)
            int r0 = r0.size()
            int r1 = r1.size()
            if (r4 != r5) goto L_0x0165
            goto L_0x0166
        L_0x0165:
            int r1 = r1 + r3
        L_0x0166:
            int r0 = r0 - r1
            java.util.List r14 = r13.mo26042c(r14)
            d.b0.h r14 = p298d.p334t.C6790h.m12346d(r14)
            d.b0.h r14 = p298d.p414b0.C7679s.m13894b(r14, r0)
            java.lang.String r0 = "."
            java.lang.String r1 = ""
            java.lang.String r4 = "..."
            java.lang.String r5 = "$this$joinToString"
            p298d.p344x.p346c.C6888i.m12438e(r14, r5)
            java.lang.String r5 = "separator"
            p298d.p344x.p346c.C6888i.m12438e(r0, r5)
            java.lang.String r6 = "prefix"
            p298d.p344x.p346c.C6888i.m12438e(r1, r6)
            java.lang.String r8 = "postfix"
            p298d.p344x.p346c.C6888i.m12438e(r1, r8)
            java.lang.String r9 = "truncated"
            p298d.p344x.p346c.C6888i.m12438e(r4, r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "$this$joinTo"
            p298d.p344x.p346c.C6888i.m12438e(r14, r11)
            java.lang.String r11 = "buffer"
            p298d.p344x.p346c.C6888i.m12438e(r10, r11)
            p298d.p344x.p346c.C6888i.m12438e(r0, r5)
            p298d.p344x.p346c.C6888i.m12438e(r1, r6)
            p298d.p344x.p346c.C6888i.m12438e(r1, r8)
            p298d.p344x.p346c.C6888i.m12438e(r4, r9)
            r10.append(r1)
            java.util.Iterator r14 = r14.iterator()
        L_0x01b4:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x01c8
            java.lang.Object r4 = r14.next()
            int r2 = r2 + r3
            if (r2 <= r3) goto L_0x01c4
            r10.append(r0)
        L_0x01c4:
            p005b.p291q.p292a.C5266a.m10013q(r10, r4, r7)
            goto L_0x01b4
        L_0x01c8:
            r10.append(r1)
            java.lang.String r14 = r10.toString()
            java.lang.String r0 = "joinTo(StringBuilder(), …ed, transform).toString()"
            p298d.p344x.p346c.C6888i.m12437d(r14, r0)
            return r14
        L_0x01d5:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.mo26040a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        p005b.p291q.p292a.C5266a.m9877S(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        throw r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26041b() {
        /*
            r5 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x0049
            n.m r1 = new n.m
            n.a0 r0 = p005b.p291q.p292a.C5266a.m9940d4(r0)
            r1.<init>(r0)
            n.g r0 = p005b.p291q.p292a.C5266a.m9812H(r1)
            r1 = 0
            int r2 = r0.readInt()     // Catch:{ all -> 0x0042 }
            long r2 = (long) r2     // Catch:{ all -> 0x0042 }
            byte[] r2 = r0.mo25888G(r2)     // Catch:{ all -> 0x0042 }
            int r3 = r0.readInt()     // Catch:{ all -> 0x0042 }
            long r3 = (long) r3     // Catch:{ all -> 0x0042 }
            byte[] r3 = r0.mo25888G(r3)     // Catch:{ all -> 0x0042 }
            p005b.p291q.p292a.C5266a.m9877S(r0, r1)
            monitor-enter(r5)
            p298d.p344x.p346c.C6888i.m12436c(r2)     // Catch:{ all -> 0x003f }
            r5.f16267c = r2     // Catch:{ all -> 0x003f }
            p298d.p344x.p346c.C6888i.m12436c(r3)     // Catch:{ all -> 0x003f }
            r5.f16268d = r3     // Catch:{ all -> 0x003f }
            monitor-exit(r5)
            java.util.concurrent.CountDownLatch r0 = r5.f16266b
            r0.countDown()
            return
        L_0x003f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0042:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r2 = move-exception
            p005b.p291q.p292a.C5266a.m9877S(r0, r1)
            throw r2
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.mo26041b():void");
    }

    /* renamed from: c */
    public final List<String> mo26042c(String str) {
        List<String> w = C7694h.m13945w(str, new char[]{'.'}, false, 0, 6);
        return C6888i.m12434a((String) C6790h.m12371y(w), "") ? C6790h.m12358l(w, 1) : w;
    }
}
