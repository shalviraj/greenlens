package p005b.p051h.p052a.p078s;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: b.h.a.s.h */
public class C1378h extends FilterInputStream {

    /* renamed from: g */
    public int f1797g = Integer.MIN_VALUE;

    public C1378h(@NonNull InputStream inputStream) {
        super(inputStream);
    }

    public int available() {
        int i = this.f1797g;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    /* renamed from: d */
    public final long mo11256d(long j) {
        int i = this.f1797g;
        if (i == 0) {
            return -1;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : (long) i;
    }

    /* renamed from: e */
    public final void mo11257e(long j) {
        int i = this.f1797g;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f1797g = (int) (((long) i) - j);
        }
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f1797g = i;
    }

    public int read() {
        if (mo11256d(1) == -1) {
            return -1;
        }
        int read = super.read();
        mo11257e(1);
        return read;
    }

    public int read(@NonNull byte[] bArr, int i, int i2) {
        int d = (int) mo11256d((long) i2);
        if (d == -1) {
            return -1;
        }
        int read = super.read(bArr, i, d);
        mo11257e((long) read);
        return read;
    }

    public synchronized void reset() {
        super.reset();
        this.f1797g = Integer.MIN_VALUE;
    }

    public long skip(long j) {
        long d = mo11256d(j);
        if (d == -1) {
            return 0;
        }
        long skip = super.skip(d);
        mo11257e(skip);
        return skip;
    }
}
