package p005b.p082j.p083a.p084a.p085o;

import java.math.BigDecimal;
import p005b.p082j.p083a.p084a.C1516c;
import p005b.p082j.p083a.p084a.C1517d;
import p005b.p082j.p083a.p084a.C1526k;
import p005b.p082j.p083a.p084a.p088r.C1547b;
import p005b.p082j.p083a.p084a.p088r.C1550e;
import p005b.p082j.p083a.p084a.p090t.C1563e;

/* renamed from: b.j.a.a.o.a */
public abstract class C1530a extends C1517d {

    /* renamed from: h */
    public int f2408h;

    /* renamed from: i */
    public boolean f2409i;

    /* renamed from: j */
    public C1550e f2410j;

    public C1530a(int i, C1526k kVar) {
        this.f2408h = i;
        boolean z = true;
        this.f2410j = new C1550e(0, (C1550e) null, (C1517d.C1518a.STRICT_DUPLICATE_DETECTION.f2358h & i) != 0 ? new C1547b(this) : null);
        this.f2409i = (i & C1517d.C1518a.WRITE_NUMBERS_AS_STRINGS.f2358h) == 0 ? false : z;
    }

    /* renamed from: d */
    public C1517d mo11466d() {
        if (this.f2345g != null) {
            return this;
        }
        this.f2345g = new C1563e();
        return this;
    }

    /* renamed from: u0 */
    public String mo11509u0(BigDecimal bigDecimal) {
        if (!C1517d.C1518a.WRITE_BIGDECIMAL_AS_PLAIN.mo11481e(this.f2408h)) {
            return bigDecimal.toString();
        }
        int scale = bigDecimal.scale();
        if (scale >= -9999 && scale <= 9999) {
            return bigDecimal.toPlainString();
        }
        throw new C1516c(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", new Object[]{Integer.valueOf(scale), 9999, 9999}), this);
    }

    /* renamed from: v0 */
    public final boolean mo11510v0(C1517d.C1518a aVar) {
        return (aVar.f2358h & this.f2408h) != 0;
    }
}
