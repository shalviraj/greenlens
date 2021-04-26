package p005b.p096l.p232f;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: b.l.f.i */
public final class C4615i extends C4616j {

    /* renamed from: c */
    public final C4616j f8679c;

    public C4615i(C4616j jVar) {
        super(jVar.f8680a, jVar.f8681b);
        this.f8679c = jVar;
    }

    /* renamed from: a */
    public byte[] mo16273a() {
        byte[] a = this.f8679c.mo16273a();
        int i = this.f8680a * this.f8681b;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (255 - (a[i2] & ExifInterface.MARKER));
        }
        return bArr;
    }

    /* renamed from: b */
    public byte[] mo16274b(int i, byte[] bArr) {
        byte[] b = this.f8679c.mo16274b(i, bArr);
        int i2 = this.f8680a;
        for (int i3 = 0; i3 < i2; i3++) {
            b[i3] = (byte) (255 - (b[i3] & ExifInterface.MARKER));
        }
        return b;
    }

    /* renamed from: c */
    public C4616j mo16275c() {
        return this.f8679c;
    }

    /* renamed from: d */
    public boolean mo16276d() {
        return this.f8679c.mo16276d();
    }

    /* renamed from: e */
    public C4616j mo16277e() {
        return new C4615i(this.f8679c.mo16277e());
    }
}
