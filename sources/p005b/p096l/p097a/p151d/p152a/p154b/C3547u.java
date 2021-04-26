package p005b.p096l.p097a.p151d.p152a.p154b;

import java.io.InputStream;

/* renamed from: b.l.a.d.a.b.u */
public final class C3547u extends InputStream {

    /* renamed from: g */
    public final InputStream f6575g;

    /* renamed from: h */
    public long f6576h;

    public C3547u(InputStream inputStream, long j) {
        this.f6575g = inputStream;
        this.f6576h = j;
    }

    public final void close() {
        super.close();
        this.f6575g.close();
        this.f6576h = 0;
    }

    public final int read() {
        long j = this.f6576h;
        if (j <= 0) {
            return -1;
        }
        this.f6576h = j - 1;
        return this.f6575g.read();
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f6576h;
        if (j <= 0) {
            return -1;
        }
        int read = this.f6575g.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f6576h -= (long) read;
        }
        return read;
    }
}
