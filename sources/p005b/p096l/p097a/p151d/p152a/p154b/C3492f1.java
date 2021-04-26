package p005b.p096l.p097a.p151d.p152a.p154b;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: b.l.a.d.a.b.f1 */
public final class C3492f1 {

    /* renamed from: a */
    public byte[] f6395a = new byte[4096];

    /* renamed from: b */
    public int f6396b;

    /* renamed from: c */
    public long f6397c;

    /* renamed from: d */
    public long f6398d;

    /* renamed from: e */
    public int f6399e;

    /* renamed from: f */
    public int f6400f;

    /* renamed from: g */
    public int f6401g;

    /* renamed from: h */
    public boolean f6402h;
    @Nullable

    /* renamed from: i */
    public String f6403i;

    public C3492f1() {
        mo14777c();
    }

    /* renamed from: a */
    public final int mo14775a(byte[] bArr, int i, int i2) {
        int d = mo14778d(30, bArr, i, i2);
        if (d == -1) {
            return -1;
        }
        if (this.f6397c == -1) {
            long b = C3484d1.m6656b(this.f6395a, 0);
            this.f6397c = b;
            if (b == 67324752) {
                this.f6402h = false;
                this.f6398d = C3484d1.m6656b(this.f6395a, 18);
                this.f6401g = C3484d1.m6657c(this.f6395a, 8);
                this.f6399e = C3484d1.m6657c(this.f6395a, 26);
                int c = this.f6399e + 30 + C3484d1.m6657c(this.f6395a, 28);
                this.f6400f = c;
                int length = this.f6395a.length;
                if (length < c) {
                    do {
                        length += length;
                    } while (length < c);
                    this.f6395a = Arrays.copyOf(this.f6395a, length);
                }
            } else {
                this.f6402h = true;
            }
        }
        int d2 = mo14778d(this.f6400f, bArr, i + d, i2 - d);
        if (d2 == -1) {
            return -1;
        }
        int i3 = d + d2;
        if (!this.f6402h && this.f6403i == null) {
            this.f6403i = new String(this.f6395a, 30, this.f6399e);
        }
        return i3;
    }

    /* renamed from: b */
    public final C3558x1 mo14776b() {
        int i = this.f6396b;
        int i2 = this.f6400f;
        if (i < i2) {
            return new C3558x1(this.f6403i, this.f6398d, this.f6401g, true, this.f6402h, Arrays.copyOf(this.f6395a, i));
        }
        C3558x1 x1Var = new C3558x1(this.f6403i, this.f6398d, this.f6401g, false, this.f6402h, Arrays.copyOf(this.f6395a, i2));
        mo14777c();
        return x1Var;
    }

    /* renamed from: c */
    public final void mo14777c() {
        this.f6396b = 0;
        this.f6399e = -1;
        this.f6397c = -1;
        this.f6402h = false;
        this.f6400f = 30;
        this.f6398d = -1;
        this.f6401g = -1;
        this.f6403i = null;
    }

    /* renamed from: d */
    public final int mo14778d(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f6396b;
        if (i4 >= i) {
            return 0;
        }
        int min = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.f6395a, this.f6396b, min);
        int i5 = this.f6396b + min;
        this.f6396b = i5;
        if (i5 < i) {
            return -1;
        }
        return min;
    }
}
