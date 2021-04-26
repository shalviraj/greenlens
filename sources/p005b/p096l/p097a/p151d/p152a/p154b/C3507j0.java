package p005b.p096l.p097a.p151d.p152a.p154b;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: b.l.a.d.a.b.j0 */
public final class C3507j0 extends OutputStream {

    /* renamed from: g */
    public final C3492f1 f6445g = new C3492f1();

    /* renamed from: h */
    public final File f6446h;

    /* renamed from: i */
    public final C3543s1 f6447i;

    /* renamed from: j */
    public long f6448j;

    /* renamed from: k */
    public long f6449k;

    /* renamed from: l */
    public FileOutputStream f6450l;

    /* renamed from: m */
    public C3558x1 f6451m;

    public C3507j0(File file, C3543s1 s1Var) {
        this.f6446h = file;
        this.f6447i = s1Var;
    }

    public final void write(int i) {
        write(new byte[]{(byte) i});
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        while (i2 > 0) {
            if (this.f6448j == 0 && this.f6449k == 0) {
                int a = this.f6445g.mo14775a(bArr, i, i2);
                if (a != -1) {
                    i += a;
                    i2 -= a;
                    C3558x1 b = this.f6445g.mo14776b();
                    this.f6451m = b;
                    if (b.f6615e) {
                        this.f6448j = 0;
                        C3543s1 s1Var = this.f6447i;
                        byte[] bArr2 = b.f6616f;
                        s1Var.mo14813k(bArr2, bArr2.length);
                        this.f6449k = (long) this.f6451m.f6616f.length;
                    } else if (!b.mo14861b() || this.f6451m.mo14860a()) {
                        byte[] bArr3 = this.f6451m.f6616f;
                        this.f6447i.mo14813k(bArr3, bArr3.length);
                        this.f6448j = this.f6451m.f6612b;
                    } else {
                        this.f6447i.mo14808f(this.f6451m.f6616f);
                        File file = new File(this.f6446h, this.f6451m.f6611a);
                        file.getParentFile().mkdirs();
                        this.f6448j = this.f6451m.f6612b;
                        this.f6450l = new FileOutputStream(file);
                    }
                } else {
                    return;
                }
            }
            if (!this.f6451m.mo14860a()) {
                C3558x1 x1Var = this.f6451m;
                if (x1Var.f6615e) {
                    this.f6447i.mo14810h(this.f6449k, bArr, i, i2);
                    this.f6449k += (long) i2;
                    i3 = i2;
                } else if (x1Var.mo14861b()) {
                    i3 = (int) Math.min((long) i2, this.f6448j);
                    this.f6450l.write(bArr, i, i3);
                    long j = this.f6448j - ((long) i3);
                    this.f6448j = j;
                    if (j == 0) {
                        this.f6450l.close();
                    }
                } else {
                    i3 = (int) Math.min((long) i2, this.f6448j);
                    C3558x1 x1Var2 = this.f6451m;
                    int length = x1Var2.f6616f.length;
                    long j2 = x1Var2.f6612b;
                    this.f6447i.mo14810h((((long) length) + j2) - this.f6448j, bArr, i, i3);
                    this.f6448j -= (long) i3;
                }
                i += i3;
                i2 -= i3;
            }
        }
    }
}
