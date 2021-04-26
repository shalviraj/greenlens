package p005b.p096l.p164b.p165a.p171c;

import java.io.Closeable;
import java.io.Flushable;

/* renamed from: b.l.b.a.c.d */
public abstract class C3701d implements Closeable, Flushable {
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0128, code lost:
        if (r11 == null) goto L_0x012a;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15029d(boolean r11, java.lang.Object r12) {
        /*
            r10 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Class r0 = r12.getClass()
            boolean r1 = p005b.p096l.p164b.p165a.p173d.C3723g.m7020c(r12)
            if (r1 == 0) goto L_0x000f
            goto L_0x012a
        L_0x000f:
            boolean r1 = r12 instanceof java.lang.String
            if (r1 == 0) goto L_0x001f
            java.lang.String r12 = (java.lang.String) r12
            r11 = r10
            b.l.b.a.c.j.b r11 = (p005b.p096l.p164b.p165a.p171c.p172j.C3709b) r11
            b.j.a.a.d r11 = r11.f6847g
            r11.mo11479t0(r12)
            goto L_0x01a7
        L_0x001f:
            boolean r1 = r12 instanceof java.lang.Number
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x00c4
            if (r11 == 0) goto L_0x002d
            java.lang.String r11 = r12.toString()
            goto L_0x0134
        L_0x002d:
            boolean r11 = r12 instanceof java.math.BigDecimal
            if (r11 == 0) goto L_0x003d
            java.math.BigDecimal r12 = (java.math.BigDecimal) r12
            r11 = r10
            b.l.b.a.c.j.b r11 = (p005b.p096l.p164b.p165a.p171c.p172j.C3709b) r11
            b.j.a.a.d r11 = r11.f6847g
            r11.mo11470h0(r12)
            goto L_0x01a7
        L_0x003d:
            boolean r11 = r12 instanceof java.math.BigInteger
            if (r11 == 0) goto L_0x004d
            java.math.BigInteger r12 = (java.math.BigInteger) r12
            r11 = r10
            b.l.b.a.c.j.b r11 = (p005b.p096l.p164b.p165a.p171c.p172j.C3709b) r11
            b.j.a.a.d r11 = r11.f6847g
            r11.mo11471l0(r12)
            goto L_0x01a7
        L_0x004d:
            boolean r11 = r12 instanceof java.lang.Long
            if (r11 == 0) goto L_0x0061
            java.lang.Long r12 = (java.lang.Long) r12
            long r11 = r12.longValue()
            r0 = r10
            b.l.b.a.c.j.b r0 = (p005b.p096l.p164b.p165a.p171c.p172j.C3709b) r0
            b.j.a.a.d r0 = r0.f6847g
            r0.mo11468f0(r11)
            goto L_0x01a7
        L_0x0061:
            boolean r11 = r12 instanceof java.lang.Float
            if (r11 == 0) goto L_0x0086
            java.lang.Number r12 = (java.lang.Number) r12
            float r11 = r12.floatValue()
            boolean r12 = java.lang.Float.isInfinite(r11)
            if (r12 != 0) goto L_0x0078
            boolean r12 = java.lang.Float.isNaN(r11)
            if (r12 != 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r2 = r3
        L_0x0079:
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2849t(r2)
            r12 = r10
            b.l.b.a.c.j.b r12 = (p005b.p096l.p164b.p165a.p171c.p172j.C3709b) r12
            b.j.a.a.d r12 = r12.f6847g
            r12.mo11463S(r11)
            goto L_0x01a7
        L_0x0086:
            boolean r11 = r12 instanceof java.lang.Integer
            if (r11 != 0) goto L_0x00b4
            boolean r11 = r12 instanceof java.lang.Short
            if (r11 != 0) goto L_0x00b4
            boolean r11 = r12 instanceof java.lang.Byte
            if (r11 == 0) goto L_0x0093
            goto L_0x00b4
        L_0x0093:
            java.lang.Number r12 = (java.lang.Number) r12
            double r11 = r12.doubleValue()
            boolean r0 = java.lang.Double.isInfinite(r11)
            if (r0 != 0) goto L_0x00a6
            boolean r0 = java.lang.Double.isNaN(r11)
            if (r0 != 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r2 = r3
        L_0x00a7:
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2849t(r2)
            r0 = r10
            b.l.b.a.c.j.b r0 = (p005b.p096l.p164b.p165a.p171c.p172j.C3709b) r0
            b.j.a.a.d r0 = r0.f6847g
            r0.mo11462O(r11)
            goto L_0x01a7
        L_0x00b4:
            java.lang.Number r12 = (java.lang.Number) r12
            int r11 = r12.intValue()
            r12 = r10
            b.l.b.a.c.j.b r12 = (p005b.p096l.p164b.p165a.p171c.p172j.C3709b) r12
            b.j.a.a.d r12 = r12.f6847g
            r12.mo11464Z(r11)
            goto L_0x01a7
        L_0x00c4:
            boolean r1 = r12 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x00d8
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            r12 = r10
            b.l.b.a.c.j.b r12 = (p005b.p096l.p164b.p165a.p171c.p172j.C3709b) r12
            b.j.a.a.d r12 = r12.f6847g
            r12.mo11467e(r11)
            goto L_0x01a7
        L_0x00d8:
            boolean r1 = r12 instanceof p005b.p096l.p164b.p165a.p173d.C3728i
            if (r1 == 0) goto L_0x00e3
            b.l.b.a.d.i r12 = (p005b.p096l.p164b.p165a.p173d.C3728i) r12
            java.lang.String r11 = r12.mo15096b()
            goto L_0x0134
        L_0x00e3:
            boolean r1 = r12 instanceof java.lang.Iterable
            if (r1 != 0) goto L_0x00ed
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x011a
        L_0x00ed:
            boolean r1 = r12 instanceof java.util.Map
            if (r1 != 0) goto L_0x011a
            boolean r1 = r12 instanceof p005b.p096l.p164b.p165a.p173d.C3730k
            if (r1 != 0) goto L_0x011a
            r0 = r10
            b.l.b.a.c.j.b r0 = (p005b.p096l.p164b.p165a.p171c.p172j.C3709b) r0
            b.j.a.a.d r1 = r0.f6847g
            r1.mo11477r0()
            java.lang.Iterable r12 = p005b.p096l.p164b.p165a.p173d.C3734l.m7048l(r12)
            java.util.Iterator r12 = r12.iterator()
        L_0x0105:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0113
            java.lang.Object r1 = r12.next()
            r10.mo15029d(r11, r1)
            goto L_0x0105
        L_0x0113:
            b.j.a.a.d r11 = r0.f6847g
            r11.mo11475q()
            goto L_0x01a7
        L_0x011a:
            boolean r1 = r0.isEnum()
            if (r1 == 0) goto L_0x013e
            java.lang.Enum r12 = (java.lang.Enum) r12
            b.l.b.a.d.j r11 = p005b.p096l.p164b.p165a.p173d.C3729j.m7031c(r12)
            java.lang.String r11 = r11.f6907d
            if (r11 != 0) goto L_0x0134
        L_0x012a:
            r11 = r10
            b.l.b.a.c.j.b r11 = (p005b.p096l.p164b.p165a.p171c.p172j.C3709b) r11
            b.j.a.a.d r11 = r11.f6847g
            r11.mo11461N()
            goto L_0x01a7
        L_0x0134:
            r12 = r10
            b.l.b.a.c.j.b r12 = (p005b.p096l.p164b.p165a.p171c.p172j.C3709b) r12
            b.j.a.a.d r12 = r12.f6847g
            r12.mo11479t0(r11)
            goto L_0x01a7
        L_0x013e:
            r1 = r10
            b.l.b.a.c.j.b r1 = (p005b.p096l.p164b.p165a.p171c.p172j.C3709b) r1
            b.j.a.a.d r4 = r1.f6847g
            r4.mo11478s0()
            boolean r4 = r12 instanceof java.util.Map
            if (r4 == 0) goto L_0x0150
            boolean r4 = r12 instanceof p005b.p096l.p164b.p165a.p173d.C3730k
            if (r4 != 0) goto L_0x0150
            r4 = r2
            goto L_0x0151
        L_0x0150:
            r4 = r3
        L_0x0151:
            r5 = 0
            if (r4 == 0) goto L_0x0156
            r0 = r5
            goto L_0x015a
        L_0x0156:
            b.l.b.a.d.e r0 = p005b.p096l.p164b.p165a.p173d.C3719e.m7013b(r0)
        L_0x015a:
            java.util.Map r12 = p005b.p096l.p164b.p165a.p173d.C3723g.m7022e(r12)
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x0166:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L_0x01a2
            java.lang.Object r6 = r12.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getValue()
            if (r7 == 0) goto L_0x0166
            java.lang.Object r6 = r6.getKey()
            java.lang.String r6 = (java.lang.String) r6
            if (r4 == 0) goto L_0x0182
            r8 = r11
            goto L_0x0199
        L_0x0182:
            b.l.b.a.d.j r8 = r0.mo15076a(r6)
            if (r8 != 0) goto L_0x018a
            r8 = r5
            goto L_0x018c
        L_0x018a:
            java.lang.reflect.Field r8 = r8.f6905b
        L_0x018c:
            if (r8 == 0) goto L_0x0198
            java.lang.Class<b.l.b.a.c.h> r9 = p005b.p096l.p164b.p165a.p171c.C3706h.class
            java.lang.annotation.Annotation r8 = r8.getAnnotation(r9)
            if (r8 == 0) goto L_0x0198
            r8 = r2
            goto L_0x0199
        L_0x0198:
            r8 = r3
        L_0x0199:
            b.j.a.a.d r9 = r1.f6847g
            r9.mo11460H(r6)
            r10.mo15029d(r8, r7)
            goto L_0x0166
        L_0x01a2:
            b.j.a.a.d r11 = r1.f6847g
            r11.mo11480z()
        L_0x01a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p164b.p165a.p171c.C3701d.mo15029d(boolean, java.lang.Object):void");
    }
}
