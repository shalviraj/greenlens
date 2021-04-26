package p005b.p051h.p052a.p078s;

import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b.h.a.s.a */
public final class C1367a {

    /* renamed from: a */
    public static final AtomicReference<byte[]> f1777a = new AtomicReference<>();

    /* renamed from: b.h.a.s.a$a */
    public static class C1368a extends InputStream {
        @NonNull

        /* renamed from: g */
        public final ByteBuffer f1778g;

        /* renamed from: h */
        public int f1779h = -1;

        public C1368a(@NonNull ByteBuffer byteBuffer) {
            this.f1778g = byteBuffer;
        }

        public int available() {
            return this.f1778g.remaining();
        }

        public synchronized void mark(int i) {
            this.f1779h = this.f1778g.position();
        }

        public boolean markSupported() {
            return true;
        }

        public int read() {
            if (!this.f1778g.hasRemaining()) {
                return -1;
            }
            return this.f1778g.get() & ExifInterface.MARKER;
        }

        public int read(@NonNull byte[] bArr, int i, int i2) {
            if (!this.f1778g.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, available());
            this.f1778g.get(bArr, i, min);
            return min;
        }

        public synchronized void reset() {
            int i = this.f1779h;
            if (i != -1) {
                this.f1778g.position(i);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        public long skip(long j) {
            if (!this.f1778g.hasRemaining()) {
                return -1;
            }
            long min = Math.min(j, (long) available());
            ByteBuffer byteBuffer = this.f1778g;
            byteBuffer.position((int) (((long) byteBuffer.position()) + min));
            return min;
        }
    }

    /* renamed from: b.h.a.s.a$b */
    public static final class C1369b {

        /* renamed from: a */
        public final int f1780a;

        /* renamed from: b */
        public final int f1781b;

        /* renamed from: c */
        public final byte[] f1782c;

        public C1369b(@NonNull byte[] bArr, int i, int i2) {
            this.f1782c = bArr;
            this.f1780a = i;
            this.f1781b = i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.io.RandomAccessFile} */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|9|10|11|12|13) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002d */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047 A[SYNTHETIC, Splitter:B:24:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004c A[SYNTHETIC, Splitter:B:28:0x004c] */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer m1456a(@androidx.annotation.NonNull java.io.File r8) {
        /*
            r0 = 0
            long r5 = r8.length()     // Catch:{ all -> 0x0043 }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x003b
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0033
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "r"
            r7.<init>(r8, r1)     // Catch:{ all -> 0x0043 }
            java.nio.channels.FileChannel r0 = r7.getChannel()     // Catch:{ all -> 0x0031 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0031 }
            r3 = 0
            r1 = r0
            java.nio.MappedByteBuffer r8 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0031 }
            java.nio.MappedByteBuffer r8 = r8.load()     // Catch:{ all -> 0x0031 }
            r0.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            r7.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            return r8
        L_0x0031:
            r8 = move-exception
            goto L_0x0045
        L_0x0033:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "File unsuitable for memory mapping"
            r8.<init>(r1)     // Catch:{ all -> 0x0043 }
            throw r8     // Catch:{ all -> 0x0043 }
        L_0x003b:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "File too large to map into memory"
            r8.<init>(r1)     // Catch:{ all -> 0x0043 }
            throw r8     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r8 = move-exception
            r7 = r0
        L_0x0045:
            if (r0 == 0) goto L_0x004a
            r0.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            if (r7 == 0) goto L_0x004f
            r7.close()     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p078s.C1367a.m1456a(java.io.File):java.nio.ByteBuffer");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:3|4|5|6|7|8|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A[SYNTHETIC, Splitter:B:14:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e A[SYNTHETIC, Splitter:B:18:0x002e] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m1457b(@androidx.annotation.NonNull java.nio.ByteBuffer r4, @androidx.annotation.NonNull java.io.File r5) {
        /*
            r0 = 0
            r4.position(r0)
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0025 }
            java.lang.String r3 = "rw"
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0025 }
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch:{ all -> 0x0023 }
            r1.write(r4)     // Catch:{ all -> 0x0023 }
            r1.force(r0)     // Catch:{ all -> 0x0023 }
            r1.close()     // Catch:{ all -> 0x0023 }
            r2.close()     // Catch:{ all -> 0x0023 }
            r1.close()     // Catch:{ IOException -> 0x001f }
        L_0x001f:
            r2.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            return
        L_0x0023:
            r4 = move-exception
            goto L_0x0027
        L_0x0025:
            r4 = move-exception
            r2 = r1
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            if (r2 == 0) goto L_0x0031
            r2.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p078s.C1367a.m1457b(java.nio.ByteBuffer, java.io.File):void");
    }
}
