package p005b.p051h.p052a.p078s;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.h.a.s.c */
public final class C1371c extends FilterInputStream {

    /* renamed from: g */
    public final long f1784g;

    /* renamed from: h */
    public int f1785h;

    public C1371c(@NonNull InputStream inputStream, long j) {
        super(inputStream);
        this.f1784g = j;
    }

    public synchronized int available() {
        return (int) Math.max(this.f1784g - ((long) this.f1785h), (long) this.in.available());
    }

    /* renamed from: d */
    public final int mo11236d(int i) {
        if (i >= 0) {
            this.f1785h += i;
        } else if (this.f1784g - ((long) this.f1785h) > 0) {
            StringBuilder u = C0843a.m460u("Failed to read all expected data, expected: ");
            u.append(this.f1784g);
            u.append(", but read: ");
            u.append(this.f1785h);
            throw new IOException(u.toString());
        }
        return i;
    }

    public synchronized int read() {
        int read;
        read = super.read();
        mo11236d(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = super.read(bArr, i, i2);
        mo11236d(read);
        return read;
    }
}
