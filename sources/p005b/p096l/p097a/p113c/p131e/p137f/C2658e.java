package p005b.p096l.p097a.p113c.p131e.p137f;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* renamed from: b.l.a.c.e.f.e */
public final class C2658e extends FilterInputStream {

    /* renamed from: g */
    public long f4545g;

    /* renamed from: h */
    public long f4546h = -1;

    public C2658e(InputStream inputStream) {
        super(inputStream);
        Objects.requireNonNull(inputStream);
        this.f4545g = 1048576;
    }

    public final int available() {
        return (int) Math.min((long) this.in.available(), this.f4545g);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f4546h = this.f4545g;
    }

    public final int read() {
        if (this.f4545g == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f4545g--;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f4545g;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f4545g -= (long) read;
        }
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f4546h != -1) {
            this.in.reset();
            this.f4545g = this.f4546h;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) {
        long skip = this.in.skip(Math.min(j, this.f4545g));
        this.f4545g -= skip;
        return skip;
    }
}
