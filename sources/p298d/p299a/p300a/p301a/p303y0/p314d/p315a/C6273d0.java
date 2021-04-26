package p298d.p299a.p300a.p301a.p303y0.p314d.p315a;

import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.d.a.d0 */
public final class C6273d0 extends C6890k implements C6862l<C6023b, Boolean> {

    /* renamed from: g */
    public static final C6273d0 f12340g = new C6273d0();

    public C6273d0() {
        super(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        if (r4 != null) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            d.a.a.a.y0.b.b r6 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6023b) r6
            java.lang.String r0 = "it"
            p298d.p344x.p346c.C6888i.m12438e(r6, r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(r6)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x009a
            d.a.a.a.y0.d.a.h r0 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6317h.f12423m
            java.lang.String r3 = "<this>"
            p298d.p344x.p346c.C6888i.m12438e(r6, r3)
            java.util.Set<d.a.a.a.y0.f.d> r3 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6275e0.f12347f
            d.a.a.a.y0.f.d r4 = r6.getName()
            boolean r3 = r3.contains(r4)
            r4 = 0
            if (r3 != 0) goto L_0x0025
            goto L_0x0097
        L_0x0025:
            d.a.a.a.y0.d.a.i r3 = new d.a.a.a.y0.d.a.i
            r3.<init>(r0)
            d.a.a.a.y0.b.b r6 = p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a.m13130c(r6, r2, r3, r1)
            if (r6 != 0) goto L_0x0032
            r6 = r4
            goto L_0x0036
        L_0x0032:
            java.lang.String r6 = p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6561p.m11654c(r6)
        L_0x0036:
            if (r6 != 0) goto L_0x0039
            goto L_0x0097
        L_0x0039:
            java.lang.String r0 = "builtinSignature"
            p298d.p344x.p346c.C6888i.m12438e(r6, r0)
            java.util.List<java.lang.String> r0 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6275e0.f12344c
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x004a
            d.a.a.a.y0.d.a.e0$b r6 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6275e0.C6278b.ONE_COLLECTION_PARAMETER
        L_0x0048:
            r4 = r6
            goto L_0x0097
        L_0x004a:
            java.util.Map<java.lang.String, d.a.a.a.y0.d.a.e0$c> r0 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6275e0.f12346e
            java.lang.String r3 = "$this$getValue"
            p298d.p344x.p346c.C6888i.m12438e(r0, r3)
            java.lang.String r3 = "$this$getOrImplicitDefault"
            p298d.p344x.p346c.C6888i.m12438e(r0, r3)
            boolean r3 = r0 instanceof p298d.p334t.C6806x
            if (r3 == 0) goto L_0x0061
            d.t.x r0 = (p298d.p334t.C6806x) r0
            java.lang.Object r6 = r0.mo24078d(r6)
            goto L_0x008b
        L_0x0061:
            java.lang.Object r3 = r0.get(r6)
            if (r3 != 0) goto L_0x008a
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L_0x006e
            goto L_0x008a
        L_0x006e:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Key "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = " is missing in the map."
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L_0x008a:
            r6 = r3
        L_0x008b:
            d.a.a.a.y0.d.a.e0$c r6 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6275e0.C6279c) r6
            d.a.a.a.y0.d.a.e0$c r0 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6275e0.C6279c.NULL
            if (r6 != r0) goto L_0x0094
            d.a.a.a.y0.d.a.e0$b r6 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6275e0.C6278b.OBJECT_PARAMETER_GENERIC
            goto L_0x0048
        L_0x0094:
            d.a.a.a.y0.d.a.e0$b r6 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6275e0.C6278b.OBJECT_PARAMETER_NON_GENERIC
            goto L_0x0048
        L_0x0097:
            if (r4 == 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r1 = r2
        L_0x009b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6273d0.invoke(java.lang.Object):java.lang.Object");
    }
}
