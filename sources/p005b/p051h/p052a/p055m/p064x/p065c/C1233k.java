package p005b.p051h.p052a.p055m.p064x.p065c;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1023b;

/* renamed from: b.h.a.m.x.c.k */
public final class C1233k implements ImageHeaderParser {

    /* renamed from: a */
    public static final byte[] f1512a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    public static final int[] f1513b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: b.h.a.m.x.c.k$a */
    public static final class C1234a implements C1236c {

        /* renamed from: a */
        public final ByteBuffer f1514a;

        public C1234a(ByteBuffer byteBuffer) {
            this.f1514a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo11076a(byte[] bArr, int i) {
            int min = Math.min(i, this.f1514a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f1514a.get(bArr, 0, min);
            return min;
        }

        /* renamed from: b */
        public short mo11077b() {
            if (this.f1514a.remaining() >= 1) {
                return (short) (this.f1514a.get() & ExifInterface.MARKER);
            }
            throw new C1236c.C1237a();
        }

        /* renamed from: c */
        public int mo11078c() {
            return (mo11077b() << 8) | mo11077b();
        }

        public long skip(long j) {
            int min = (int) Math.min((long) this.f1514a.remaining(), j);
            ByteBuffer byteBuffer = this.f1514a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    /* renamed from: b.h.a.m.x.c.k$b */
    public static final class C1235b {

        /* renamed from: a */
        public final ByteBuffer f1515a;

        public C1235b(byte[] bArr, int i) {
            this.f1515a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: a */
        public short mo11080a(int i) {
            if (this.f1515a.remaining() - i >= 2) {
                return this.f1515a.getShort(i);
            }
            return -1;
        }

        /* renamed from: b */
        public int mo11081b(int i) {
            if (this.f1515a.remaining() - i >= 4) {
                return this.f1515a.getInt(i);
            }
            return -1;
        }
    }

    /* renamed from: b.h.a.m.x.c.k$c */
    public interface C1236c {

        /* renamed from: b.h.a.m.x.c.k$c$a */
        public static final class C1237a extends IOException {
            public C1237a() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo11076a(byte[] bArr, int i);

        /* renamed from: b */
        short mo11077b();

        /* renamed from: c */
        int mo11078c();

        long skip(long j);
    }

    /* renamed from: b.h.a.m.x.c.k$d */
    public static final class C1238d implements C1236c {

        /* renamed from: a */
        public final InputStream f1516a;

        public C1238d(InputStream inputStream) {
            this.f1516a = inputStream;
        }

        /* renamed from: a */
        public int mo11076a(byte[] bArr, int i) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f1516a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 != 0 || i3 != -1) {
                return i2;
            }
            throw new C1236c.C1237a();
        }

        /* renamed from: b */
        public short mo11077b() {
            int read = this.f1516a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new C1236c.C1237a();
        }

        /* renamed from: c */
        public int mo11078c() {
            return (mo11077b() << 8) | mo11077b();
        }

        public long skip(long j) {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f1516a.skip(j2);
                if (skip <= 0) {
                    if (this.f1516a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    @NonNull
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo11070a(@NonNull ByteBuffer byteBuffer) {
        Objects.requireNonNull(byteBuffer, "Argument must not be null");
        return mo11073d(new C1234a(byteBuffer));
    }

    /* renamed from: b */
    public int mo11071b(@NonNull InputStream inputStream, @NonNull C1023b bVar) {
        String str;
        byte[] bArr;
        Objects.requireNonNull(inputStream, "Argument must not be null");
        C1238d dVar = new C1238d(inputStream);
        Objects.requireNonNull(bVar, "Argument must not be null");
        try {
            int c = dVar.mo11078c();
            if ((c & 65496) == 65496 || c == 19789 || c == 18761) {
                int e = mo11074e(dVar);
                if (e != -1) {
                    bArr = (byte[]) bVar.mo10888e(e, byte[].class);
                    int f = mo11075f(dVar, bArr, e);
                    bVar.mo10887d(bArr);
                    return f;
                } else if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                } else {
                    str = "Failed to parse exif segment length, or exif segment not found";
                }
            } else if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                return -1;
            } else {
                str = "Parser doesn't handle magic number: " + c;
            }
            Log.d("DfltImageHeaderParser", str);
            return -1;
        } catch (C1236c.C1237a unused) {
            return -1;
        } catch (Throwable th) {
            bVar.mo10887d(bArr);
            throw th;
        }
    }

    @NonNull
    /* renamed from: c */
    public ImageHeaderParser.ImageType mo11072c(@NonNull InputStream inputStream) {
        Objects.requireNonNull(inputStream, "Argument must not be null");
        return mo11073d(new C1238d(inputStream));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    @androidx.annotation.NonNull
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.load.ImageHeaderParser.ImageType mo11073d(p005b.p051h.p052a.p055m.p064x.p065c.C1233k.C1236c r6) {
        /*
            r5 = this;
            int r0 = r6.mo11078c()     // Catch:{ a -> 0x00a0 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r6.mo11077b()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r6.mo11077b()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.mo11077b()     // Catch:{ a -> 0x0039 }
            r0 = 3
            if (r6 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ a -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x0039 }
        L_0x0038:
            return r6
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x0044
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0044:
            r0 = 4
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            int r2 = r6.mo11078c()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.mo11078c()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.16888601E14)
            if (r2 == r3) goto L_0x005c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x005c:
            int r2 = r6.mo11078c()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.mo11078c()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x0071
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0071:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x0088
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.mo11077b()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 16
            if (r6 == 0) goto L_0x0085
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x0087
        L_0x0085:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x0087:
            return r6
        L_0x0088:
            r3 = 76
            if (r2 != r3) goto L_0x009d
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.mo11077b()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x009a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x009c
        L_0x009a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x009c:
            return r6
        L_0x009d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x00a0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p055m.p064x.p065c.C1233k.mo11073d(b.h.a.m.x.c.k$c):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    /* renamed from: e */
    public final int mo11074e(C1236c cVar) {
        short b;
        int c;
        long j;
        long skip;
        do {
            short b2 = cVar.mo11077b();
            if (b2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + b2);
                }
                return -1;
            }
            b = cVar.mo11077b();
            if (b == 218) {
                return -1;
            }
            if (b == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            c = cVar.mo11078c() - 2;
            if (b == 225) {
                return c;
            }
            j = (long) c;
            skip = cVar.skip(j);
        } while (skip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder x = C0843a.m463x("Unable to skip enough data, type: ", b, ", wanted to skip: ", c, ", but actually skipped: ");
            x.append(skip);
            Log.d("DfltImageHeaderParser", x.toString());
        }
        return -1;
    }

    /* renamed from: f */
    public final int mo11075f(C1236c cVar, byte[] bArr, int i) {
        ByteOrder byteOrder;
        String str;
        String str2;
        StringBuilder sb;
        int a = cVar.mo11076a(bArr, i);
        if (a != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + a);
            }
            return -1;
        }
        boolean z = bArr != null && i > f1512a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f1512a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (z) {
            C1235b bVar = new C1235b(bArr, i);
            short a2 = bVar.mo11080a(6);
            if (a2 != 18761) {
                if (a2 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + a2);
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            bVar.f1515a.order(byteOrder);
            int b = bVar.mo11081b(10) + 6;
            short a3 = bVar.mo11080a(b);
            for (int i3 = 0; i3 < a3; i3++) {
                int i4 = (i3 * 12) + b + 2;
                short a4 = bVar.mo11080a(i4);
                if (a4 == 274) {
                    short a5 = bVar.mo11080a(i4 + 2);
                    if (a5 >= 1 && a5 <= 12) {
                        int b2 = bVar.mo11081b(i4 + 4);
                        if (b2 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder x = C0843a.m463x("Got tagIndex=", i3, " tagType=", a4, " formatCode=");
                                x.append(a5);
                                x.append(" componentCount=");
                                x.append(b2);
                                Log.d("DfltImageHeaderParser", x.toString());
                            }
                            int i5 = b2 + f1513b[a5];
                            if (i5 <= 4) {
                                int i6 = i4 + 8;
                                if (i6 < 0 || i6 > bVar.f1515a.remaining()) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        str = C0843a.m446g("Illegal tagValueOffset=", i6, " tagType=", a4);
                                        Log.d("DfltImageHeaderParser", str);
                                    }
                                } else if (i5 >= 0 && i5 + i6 <= bVar.f1515a.remaining()) {
                                    return bVar.mo11080a(i6);
                                } else {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        str = C0843a.m444e("Illegal number of bytes for TI tag data tagType=", a4);
                                        Log.d("DfltImageHeaderParser", str);
                                    }
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                sb = new StringBuilder();
                                str2 = "Got byte count > 4, not orientation, continuing, formatCode=";
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            str = "Negative tiff component count";
                            Log.d("DfltImageHeaderParser", str);
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        sb = new StringBuilder();
                        str2 = "Got invalid format code = ";
                    }
                    sb.append(str2);
                    sb.append(a5);
                    str = sb.toString();
                    Log.d("DfltImageHeaderParser", str);
                }
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }
}
