package p005b.p096l.p097a.p151d.p152a.p154b;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: b.l.a.d.a.b.a0 */
public final class C3471a0 extends FilterInputStream {

    /* renamed from: g */
    public final C3492f1 f6296g = new C3492f1();

    /* renamed from: h */
    public byte[] f6297h = new byte[4096];

    /* renamed from: i */
    public long f6298i;

    /* renamed from: j */
    public boolean f6299j = false;

    /* renamed from: k */
    public boolean f6300k = false;

    public C3471a0(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: d */
    public final C3558x1 mo14747d() {
        byte[] bArr;
        if (this.f6298i > 0) {
            do {
                bArr = this.f6297h;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f6299j || this.f6300k) {
            return new C3558x1((String) null, -1, -1, false, false, (byte[]) null);
        }
        if (!mo14748e(30)) {
            this.f6299j = true;
            return this.f6296g.mo14776b();
        }
        C3558x1 b = this.f6296g.mo14776b();
        if (b.f6615e) {
            this.f6300k = true;
            return b;
        } else if (b.f6612b != 4294967295L) {
            int i = this.f6296g.f6400f - 30;
            long j = (long) i;
            int length = this.f6297h.length;
            if (j > ((long) length)) {
                do {
                    length += length;
                } while (((long) length) < j);
                this.f6297h = Arrays.copyOf(this.f6297h, length);
            }
            if (!mo14748e(i)) {
                this.f6299j = true;
                return this.f6296g.mo14776b();
            }
            C3558x1 b2 = this.f6296g.mo14776b();
            this.f6298i = b2.f6612b;
            return b2;
        } else {
            throw new C3495g0("Files bigger than 4GiB are not supported.");
        }
    }

    /* renamed from: e */
    public final boolean mo14748e(int i) {
        int q = mo14749q(this.f6297h, 0, i);
        if (q != i) {
            int i2 = i - q;
            if (mo14749q(this.f6297h, q, i2) != i2) {
                this.f6296g.mo14775a(this.f6297h, 0, q);
                return false;
            }
        }
        this.f6296g.mo14775a(this.f6297h, 0, i);
        return true;
    }

    /* renamed from: q */
    public final int mo14749q(byte[] bArr, int i, int i2) {
        return Math.max(0, super.read(bArr, i, i2));
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f6298i;
        if (j <= 0 || this.f6299j) {
            return -1;
        }
        int max = Math.max(0, super.read(bArr, i, (int) Math.min(j, (long) i2)));
        this.f6298i -= (long) max;
        if (max != 0) {
            return max;
        }
        this.f6299j = true;
        return 0;
    }
}
