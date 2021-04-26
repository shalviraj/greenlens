package p298d.p415c0;

import java.util.List;
import p298d.C6768j;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.c0.j */
public final class C7696j extends C6890k implements C6866p<CharSequence, Integer, C6768j<? extends Integer, ? extends Integer>> {

    /* renamed from: g */
    public final /* synthetic */ List f15232g;

    /* renamed from: h */
    public final /* synthetic */ boolean f15233h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7696j(List list, boolean z) {
        super(2);
        this.f15232g = list;
        this.f15233h = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15) {
        /*
            r13 = this;
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            java.lang.String r0 = "$receiver"
            p298d.p344x.p346c.C6888i.m12438e(r14, r0)
            java.util.List r6 = r13.f15232g
            boolean r7 = r13.f15233h
            r0 = 0
            r8 = 0
            if (r7 != 0) goto L_0x0036
            int r1 = r6.size()
            r2 = 1
            if (r1 != r2) goto L_0x0036
            java.lang.Object r1 = p298d.p334t.C6790h.m12328O(r6)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 4
            int r14 = p298d.p415c0.C7694h.m13934l(r14, r1, r15, r0, r2)
            if (r14 >= 0) goto L_0x002b
            goto L_0x00c4
        L_0x002b:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            d.j r15 = new d.j
            r15.<init>(r14, r1)
            goto L_0x00c5
        L_0x0036:
            if (r15 >= 0) goto L_0x0039
            r15 = r0
        L_0x0039:
            d.a0.d r0 = new d.a0.d
            int r1 = r14.length()
            r0.<init>(r15, r1)
            boolean r1 = r14 instanceof java.lang.String
            if (r1 == 0) goto L_0x0086
            int r9 = r0.f13659h
            int r10 = r0.f13660i
            if (r10 < 0) goto L_0x004f
            if (r15 > r9) goto L_0x00c4
            goto L_0x0051
        L_0x004f:
            if (r15 < r9) goto L_0x00c4
        L_0x0051:
            java.util.Iterator r11 = r6.iterator()
        L_0x0055:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0073
            java.lang.Object r12 = r11.next()
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            r2 = r14
            java.lang.String r2 = (java.lang.String) r2
            int r4 = r0.length()
            r3 = r15
            r5 = r7
            boolean r0 = p298d.p415c0.C7694h.m13939q(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0055
            goto L_0x0074
        L_0x0073:
            r12 = r8
        L_0x0074:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x0082
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            d.j r15 = new d.j
            r15.<init>(r14, r12)
            goto L_0x00c5
        L_0x0082:
            if (r15 == r9) goto L_0x00c4
            int r15 = r15 + r10
            goto L_0x0051
        L_0x0086:
            int r9 = r0.f13659h
            int r10 = r0.f13660i
            if (r10 < 0) goto L_0x008f
            if (r15 > r9) goto L_0x00c4
            goto L_0x0091
        L_0x008f:
            if (r15 < r9) goto L_0x00c4
        L_0x0091:
            java.util.Iterator r11 = r6.iterator()
        L_0x0095:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r12 = r11.next()
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            int r4 = r0.length()
            r2 = r14
            r3 = r15
            r5 = r7
            boolean r0 = p298d.p415c0.C7694h.m13940r(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0095
            goto L_0x00b2
        L_0x00b1:
            r12 = r8
        L_0x00b2:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x00c0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            d.j r15 = new d.j
            r15.<init>(r14, r12)
            goto L_0x00c5
        L_0x00c0:
            if (r15 == r9) goto L_0x00c4
            int r15 = r15 + r10
            goto L_0x0091
        L_0x00c4:
            r15 = r8
        L_0x00c5:
            if (r15 == 0) goto L_0x00da
            A r14 = r15.f13681g
            B r15 = r15.f13682h
            java.lang.String r15 = (java.lang.String) r15
            int r15 = r15.length()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            d.j r8 = new d.j
            r8.<init>(r14, r15)
        L_0x00da:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p415c0.C7696j.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
