package p005b.p051h.p052a.p055m.p064x.p065c;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1023b;

/* renamed from: b.h.a.m.x.c.w */
public class C1260w extends FilterInputStream {

    /* renamed from: g */
    public volatile byte[] f1561g;

    /* renamed from: h */
    public int f1562h;

    /* renamed from: i */
    public int f1563i;

    /* renamed from: j */
    public int f1564j = -1;

    /* renamed from: k */
    public int f1565k;

    /* renamed from: l */
    public final C1023b f1566l;

    /* renamed from: b.h.a.m.x.c.w$a */
    public static class C1261a extends IOException {
        public C1261a(String str) {
            super(str);
        }
    }

    public C1260w(@NonNull InputStream inputStream, @NonNull C1023b bVar) {
        super(inputStream);
        this.f1566l = bVar;
        this.f1561g = (byte[]) bVar.mo10888e(65536, byte[].class);
    }

    /* renamed from: q */
    public static IOException m1253q() {
        throw new IOException("BufferedInputStream is closed");
    }

    public synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f1561g == null || inputStream == null) {
            m1253q();
            throw null;
        }
        return (this.f1562h - this.f1565k) + inputStream.available();
    }

    public void close() {
        if (this.f1561g != null) {
            this.f1566l.mo10887d(this.f1561g);
            this.f1561g = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: d */
    public final int mo11096d(InputStream inputStream, byte[] bArr) {
        int i;
        int i2 = this.f1564j;
        if (i2 == -1 || this.f1565k - i2 >= (i = this.f1563i)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f1564j = -1;
                this.f1565k = 0;
                this.f1562h = read;
            }
            return read;
        }
        if (i2 == 0 && i > bArr.length && this.f1562h == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i) {
                i = length;
            }
            byte[] bArr2 = (byte[]) this.f1566l.mo10888e(i, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f1561g = bArr2;
            this.f1566l.mo10887d(bArr);
            bArr = bArr2;
        } else if (i2 > 0) {
            System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
        }
        int i3 = this.f1565k - this.f1564j;
        this.f1565k = i3;
        this.f1564j = 0;
        this.f1562h = 0;
        int read2 = inputStream.read(bArr, i3, bArr.length - i3);
        int i4 = this.f1565k;
        if (read2 > 0) {
            i4 += read2;
        }
        this.f1562h = i4;
        return read2;
    }

    /* renamed from: e */
    public synchronized void mo11097e() {
        if (this.f1561g != null) {
            this.f1566l.mo10887d(this.f1561g);
            this.f1561g = null;
        }
    }

    public synchronized void mark(int i) {
        this.f1563i = Math.max(this.f1563i, i);
        this.f1564j = this.f1565k;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0026=Splitter:B:19:0x0026, B:11:0x0019=Splitter:B:11:0x0019, B:28:0x0039=Splitter:B:28:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f1561g     // Catch:{ all -> 0x003d }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x003d }
            r2 = 0
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            int r3 = r6.f1565k     // Catch:{ all -> 0x003d }
            int r4 = r6.f1562h     // Catch:{ all -> 0x003d }
            r5 = -1
            if (r3 < r4) goto L_0x0019
            int r1 = r6.mo11096d(r1, r0)     // Catch:{ all -> 0x003d }
            if (r1 != r5) goto L_0x0019
            monitor-exit(r6)
            return r5
        L_0x0019:
            byte[] r1 = r6.f1561g     // Catch:{ all -> 0x003d }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r6.f1561g     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            m1253q()     // Catch:{ all -> 0x003d }
            throw r2
        L_0x0026:
            int r1 = r6.f1562h     // Catch:{ all -> 0x003d }
            int r2 = r6.f1565k     // Catch:{ all -> 0x003d }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0037
            int r1 = r2 + 1
            r6.f1565k = r1     // Catch:{ all -> 0x003d }
            byte r0 = r0[r2]     // Catch:{ all -> 0x003d }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0037:
            monitor-exit(r6)
            return r5
        L_0x0039:
            m1253q()     // Catch:{ all -> 0x003d }
            throw r2
        L_0x003d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p055m.p064x.p065c.C1260w.read():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0048, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0055, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(@androidx.annotation.NonNull byte[] r8, int r9, int r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            byte[] r0 = r7.f1561g     // Catch:{ all -> 0x008e }
            r1 = 0
            if (r0 == 0) goto L_0x008a
            if (r10 != 0) goto L_0x000b
            r8 = 0
            monitor-exit(r7)
            return r8
        L_0x000b:
            java.io.InputStream r2 = r7.in     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x0086
            int r3 = r7.f1565k     // Catch:{ all -> 0x008e }
            int r4 = r7.f1562h     // Catch:{ all -> 0x008e }
            if (r3 >= r4) goto L_0x0033
            int r5 = r4 - r3
            if (r5 < r10) goto L_0x001b
            r4 = r10
            goto L_0x001c
        L_0x001b:
            int r4 = r4 - r3
        L_0x001c:
            java.lang.System.arraycopy(r0, r3, r8, r9, r4)     // Catch:{ all -> 0x008e }
            int r3 = r7.f1565k     // Catch:{ all -> 0x008e }
            int r3 = r3 + r4
            r7.f1565k = r3     // Catch:{ all -> 0x008e }
            if (r4 == r10) goto L_0x0031
            int r3 = r2.available()     // Catch:{ all -> 0x008e }
            if (r3 != 0) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            int r9 = r9 + r4
            int r3 = r10 - r4
            goto L_0x0034
        L_0x0031:
            monitor-exit(r7)
            return r4
        L_0x0033:
            r3 = r10
        L_0x0034:
            int r4 = r7.f1564j     // Catch:{ all -> 0x008e }
            r5 = -1
            if (r4 != r5) goto L_0x0049
            int r4 = r0.length     // Catch:{ all -> 0x008e }
            if (r3 < r4) goto L_0x0049
            int r4 = r2.read(r8, r9, r3)     // Catch:{ all -> 0x008e }
            if (r4 != r5) goto L_0x0076
            if (r3 != r10) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            int r5 = r10 - r3
        L_0x0047:
            monitor-exit(r7)
            return r5
        L_0x0049:
            int r4 = r7.mo11096d(r2, r0)     // Catch:{ all -> 0x008e }
            if (r4 != r5) goto L_0x0056
            if (r3 != r10) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            int r5 = r10 - r3
        L_0x0054:
            monitor-exit(r7)
            return r5
        L_0x0056:
            byte[] r4 = r7.f1561g     // Catch:{ all -> 0x008e }
            if (r0 == r4) goto L_0x0063
            byte[] r0 = r7.f1561g     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            m1253q()     // Catch:{ all -> 0x008e }
            throw r1
        L_0x0063:
            int r4 = r7.f1562h     // Catch:{ all -> 0x008e }
            int r5 = r7.f1565k     // Catch:{ all -> 0x008e }
            int r6 = r4 - r5
            if (r6 < r3) goto L_0x006d
            r4 = r3
            goto L_0x006e
        L_0x006d:
            int r4 = r4 - r5
        L_0x006e:
            java.lang.System.arraycopy(r0, r5, r8, r9, r4)     // Catch:{ all -> 0x008e }
            int r5 = r7.f1565k     // Catch:{ all -> 0x008e }
            int r5 = r5 + r4
            r7.f1565k = r5     // Catch:{ all -> 0x008e }
        L_0x0076:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x007b
            monitor-exit(r7)
            return r10
        L_0x007b:
            int r5 = r2.available()     // Catch:{ all -> 0x008e }
            if (r5 != 0) goto L_0x0084
            int r10 = r10 - r3
            monitor-exit(r7)
            return r10
        L_0x0084:
            int r9 = r9 + r4
            goto L_0x0034
        L_0x0086:
            m1253q()     // Catch:{ all -> 0x008e }
            throw r1
        L_0x008a:
            m1253q()     // Catch:{ all -> 0x008e }
            throw r1
        L_0x008e:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p055m.p064x.p065c.C1260w.read(byte[], int, int):int");
    }

    public synchronized void reset() {
        if (this.f1561g != null) {
            int i = this.f1564j;
            if (-1 != i) {
                this.f1565k = i;
            } else {
                throw new C1261a("Mark has been invalidated, pos: " + this.f1565k + " markLimit: " + this.f1563i);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public synchronized long skip(long j) {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f1561g;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i = this.f1562h;
                int i2 = this.f1565k;
                if (((long) (i - i2)) >= j) {
                    this.f1565k = (int) (((long) i2) + j);
                    return j;
                }
                long j2 = ((long) i) - ((long) i2);
                this.f1565k = i;
                if (this.f1564j == -1 || j > ((long) this.f1563i)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (mo11096d(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    int i3 = this.f1562h;
                    int i4 = this.f1565k;
                    if (((long) (i3 - i4)) >= j - j2) {
                        this.f1565k = (int) ((((long) i4) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) i3)) - ((long) i4);
                    this.f1565k = i3;
                    return j3;
                }
            } else {
                m1253q();
                throw null;
            }
        } else {
            m1253q();
            throw null;
        }
    }
}
