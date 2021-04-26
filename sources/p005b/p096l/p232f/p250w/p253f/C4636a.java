package p005b.p096l.p232f.p250w.p253f;

import p005b.p096l.p232f.p258y.C4657a;

/* renamed from: b.l.f.w.f.a */
public final class C4636a extends C4642g {

    /* renamed from: c */
    public final short f8735c;

    /* renamed from: d */
    public final short f8736d;

    public C4636a(C4642g gVar, int i, int i2) {
        super(gVar);
        this.f8735c = (short) i;
        this.f8736d = (short) i2;
    }

    /* renamed from: a */
    public void mo16298a(C4657a aVar, byte[] bArr) {
        int i;
        int i2 = 0;
        while (true) {
            short s = this.f8736d;
            if (i2 < s) {
                if (i2 == 0 || (i2 == 31 && s <= 62)) {
                    int i3 = 5;
                    aVar.mo16319c(31, 5);
                    short s2 = this.f8736d;
                    if (s2 > 62) {
                        i = s2 - 31;
                        i3 = 16;
                    } else if (i2 == 0) {
                        aVar.mo16319c(Math.min(s2, 31), 5);
                    } else {
                        i = s2 - 31;
                    }
                    aVar.mo16319c(i, i3);
                }
                aVar.mo16319c(bArr[this.f8735c + i2], 8);
                i2++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f8735c);
        sb.append("::");
        sb.append((this.f8735c + this.f8736d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
