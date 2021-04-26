package p005b.p096l.p097a.p113c.p131e.p140i;

import java.io.IOException;

/* renamed from: b.l.a.c.e.i.v4 */
public final class C2989v4 extends IOException {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2989v4(java.lang.String r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            if (r0 == 0) goto L_0x0011
            java.lang.String r3 = r1.concat(r3)
            goto L_0x0016
        L_0x0011:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L_0x0016:
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C2989v4.<init>(java.lang.String, java.lang.Throwable):void");
    }

    public C2989v4(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
