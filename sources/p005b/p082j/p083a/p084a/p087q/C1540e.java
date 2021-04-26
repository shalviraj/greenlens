package p005b.p082j.p083a.p084a.p087q;

import androidx.exifinterface.media.ExifInterface;
import java.io.InputStream;

/* renamed from: b.j.a.a.q.e */
public final class C1540e extends InputStream {

    /* renamed from: g */
    public final C1537b f2461g;

    /* renamed from: h */
    public final InputStream f2462h;

    /* renamed from: i */
    public byte[] f2463i;

    /* renamed from: j */
    public int f2464j;

    /* renamed from: k */
    public final int f2465k;

    public C1540e(C1537b bVar, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.f2461g = bVar;
        this.f2462h = inputStream;
        this.f2463i = bArr;
        this.f2464j = i;
        this.f2465k = i2;
    }

    public int available() {
        return this.f2463i != null ? this.f2465k - this.f2464j : this.f2462h.available();
    }

    public void close() {
        mo11545d();
        this.f2462h.close();
    }

    /* renamed from: d */
    public final void mo11545d() {
        byte[] bArr = this.f2463i;
        if (bArr != null) {
            this.f2463i = null;
            C1537b bVar = this.f2461g;
            if (bVar != null) {
                bVar.mo11540c(bArr);
            }
        }
    }

    public void mark(int i) {
        if (this.f2463i == null) {
            this.f2462h.mark(i);
        }
    }

    public boolean markSupported() {
        return this.f2463i == null && this.f2462h.markSupported();
    }

    public int read() {
        byte[] bArr = this.f2463i;
        if (bArr == null) {
            return this.f2462h.read();
        }
        int i = this.f2464j;
        int i2 = i + 1;
        this.f2464j = i2;
        byte b = bArr[i] & ExifInterface.MARKER;
        if (i2 >= this.f2465k) {
            mo11545d();
        }
        return b;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f2463i;
        if (bArr2 == null) {
            return this.f2462h.read(bArr, i, i2);
        }
        int i3 = this.f2465k;
        int i4 = this.f2464j;
        int i5 = i3 - i4;
        if (i2 > i5) {
            i2 = i5;
        }
        System.arraycopy(bArr2, i4, bArr, i, i2);
        int i6 = this.f2464j + i2;
        this.f2464j = i6;
        if (i6 >= this.f2465k) {
            mo11545d();
        }
        return i2;
    }

    public void reset() {
        if (this.f2463i == null) {
            this.f2462h.reset();
        }
    }

    public long skip(long j) {
        long j2;
        if (this.f2463i != null) {
            int i = this.f2465k;
            int i2 = this.f2464j;
            long j3 = (long) (i - i2);
            if (j3 > j) {
                this.f2464j = i2 + ((int) j);
                return j;
            }
            mo11545d();
            j2 = j3 + 0;
            j -= j3;
        } else {
            j2 = 0;
        }
        return j > 0 ? j2 + this.f2462h.skip(j) : j2;
    }
}
