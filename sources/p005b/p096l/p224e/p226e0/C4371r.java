package p005b.p096l.p224e.p226e0;

import java.math.BigDecimal;

/* renamed from: b.l.e.e0.r */
public final class C4371r extends Number {

    /* renamed from: g */
    public final String f8087g;

    public C4371r(String str) {
        this.f8087g = str;
    }

    public double doubleValue() {
        return Double.parseDouble(this.f8087g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4371r)) {
            return false;
        }
        String str = this.f8087g;
        String str2 = ((C4371r) obj).f8087g;
        return str == str2 || str.equals(str2);
    }

    public float floatValue() {
        return Float.parseFloat(this.f8087g);
    }

    public int hashCode() {
        return this.f8087g.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f8087g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f8087g).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f8087g     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f8087g     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r0 = (int) r0
            return r0
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f8087g
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p224e.p226e0.C4371r.intValue():int");
    }

    public long longValue() {
        try {
            return Long.parseLong(this.f8087g);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f8087g).longValue();
        }
    }

    public String toString() {
        return this.f8087g;
    }
}
