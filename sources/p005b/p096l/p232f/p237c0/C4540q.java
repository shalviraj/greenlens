package p005b.p096l.p232f.p237c0;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4577e;
import p005b.p096l.p232f.C4619m;
import p005b.p096l.p232f.C4622p;
import p005b.p096l.p232f.C4623q;
import p005b.p096l.p232f.p258y.C4657a;

/* renamed from: b.l.f.c0.q */
public final class C4540q extends C4541r {

    /* renamed from: b */
    public static final C4548y[] f8470b = new C4548y[0];

    /* renamed from: a */
    public final C4548y[] f8471a;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4540q(java.util.Map<p005b.p096l.p232f.C4577e, ?> r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L_0x0007
            r3 = 0
            goto L_0x000f
        L_0x0007:
            b.l.f.e r0 = p005b.p096l.p232f.C4577e.POSSIBLE_FORMATS
            java.lang.Object r3 = r3.get(r0)
            java.util.Collection r3 = (java.util.Collection) r3
        L_0x000f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L_0x0054
            b.l.f.a r1 = p005b.p096l.p232f.C4484a.EAN_13
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0024
            b.l.f.c0.i r1 = new b.l.f.c0.i
            r1.<init>()
            goto L_0x0031
        L_0x0024:
            b.l.f.a r1 = p005b.p096l.p232f.C4484a.UPC_A
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0034
            b.l.f.c0.t r1 = new b.l.f.c0.t
            r1.<init>()
        L_0x0031:
            r0.add(r1)
        L_0x0034:
            b.l.f.a r1 = p005b.p096l.p232f.C4484a.EAN_8
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0044
            b.l.f.c0.k r1 = new b.l.f.c0.k
            r1.<init>()
            r0.add(r1)
        L_0x0044:
            b.l.f.a r1 = p005b.p096l.p232f.C4484a.UPC_E
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L_0x0054
            b.l.f.c0.a0 r3 = new b.l.f.c0.a0
            r3.<init>()
            r0.add(r3)
        L_0x0054:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0072
            b.l.f.c0.i r3 = new b.l.f.c0.i
            r3.<init>()
            r0.add(r3)
            b.l.f.c0.k r3 = new b.l.f.c0.k
            r3.<init>()
            r0.add(r3)
            b.l.f.c0.a0 r3 = new b.l.f.c0.a0
            r3.<init>()
            r0.add(r3)
        L_0x0072:
            b.l.f.c0.y[] r3 = f8470b
            java.lang.Object[] r3 = r0.toArray(r3)
            b.l.f.c0.y[] r3 = (p005b.p096l.p232f.p237c0.C4548y[]) r3
            r2.f8471a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p237c0.C4540q.<init>(java.util.Map):void");
    }

    /* renamed from: c */
    public void mo16154c() {
        for (C4548y requireNonNull : this.f8471a) {
            Objects.requireNonNull(requireNonNull);
        }
    }

    /* renamed from: d */
    public C4623q mo16159d(int i, C4657a aVar, Map<C4577e, ?> map) {
        boolean z;
        C4484a aVar2 = C4484a.UPC_A;
        int[] p = C4548y.m8375p(aVar);
        C4548y[] yVarArr = this.f8471a;
        int i2 = 0;
        while (i2 < yVarArr.length) {
            try {
                C4623q n = yVarArr[i2].mo16206n(i, aVar, p, map);
                boolean z2 = n.f8694d == C4484a.EAN_13 && n.f8691a.charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(C4577e.POSSIBLE_FORMATS);
                if (collection != null) {
                    if (!collection.contains(aVar2)) {
                        z = false;
                        if (z2 || !z) {
                            return n;
                        }
                        C4623q qVar = new C4623q(n.f8691a.substring(1), n.f8692b, n.f8693c, aVar2);
                        qVar.mo16282a(n.f8695e);
                        return qVar;
                    }
                }
                z = true;
                if (z2) {
                }
                return n;
            } catch (C4622p unused) {
                i2++;
            }
        }
        throw C4619m.f8685i;
    }
}
