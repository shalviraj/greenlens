package p005b.p096l.p232f.p250w.p253f;

import p005b.p096l.p232f.p258y.C4657a;

/* renamed from: b.l.f.w.f.e */
public final class C4640e extends C4642g {

    /* renamed from: c */
    public final short f8743c;

    /* renamed from: d */
    public final short f8744d;

    public C4640e(C4642g gVar, int i, int i2) {
        super(gVar);
        this.f8743c = (short) i;
        this.f8744d = (short) i2;
    }

    /* renamed from: a */
    public void mo16298a(C4657a aVar, byte[] bArr) {
        aVar.mo16319c(this.f8743c, this.f8744d);
    }

    public String toString() {
        short s = this.f8743c;
        short s2 = this.f8744d;
        short s3 = (s & ((1 << s2) - 1)) | (1 << s2);
        return "<" + Integer.toBinaryString(s3 | (1 << this.f8744d)).substring(1) + '>';
    }
}
