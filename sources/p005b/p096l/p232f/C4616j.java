package p005b.p096l.p232f;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: b.l.f.j */
public abstract class C4616j {

    /* renamed from: a */
    public final int f8680a;

    /* renamed from: b */
    public final int f8681b;

    public C4616j(int i, int i2) {
        this.f8680a = i;
        this.f8681b = i2;
    }

    /* renamed from: a */
    public abstract byte[] mo16273a();

    /* renamed from: b */
    public abstract byte[] mo16274b(int i, byte[] bArr);

    /* renamed from: c */
    public C4616j mo16275c() {
        return new C4615i(this);
    }

    /* renamed from: d */
    public boolean mo16276d() {
        return false;
    }

    /* renamed from: e */
    public C4616j mo16277e() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i = this.f8680a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder((i + 1) * this.f8681b);
        for (int i2 = 0; i2 < this.f8681b; i2++) {
            bArr = mo16274b(i2, bArr);
            for (int i3 = 0; i3 < this.f8680a; i3++) {
                byte b = bArr[i3] & ExifInterface.MARKER;
                sb.append(b < 64 ? '#' : b < 128 ? '+' : b < 192 ? '.' : ' ');
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
