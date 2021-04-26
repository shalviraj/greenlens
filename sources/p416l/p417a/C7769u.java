package p416l.p417a;

import p298d.p337v.C6824d;
import p298d.p337v.C6825e;
import p298d.p337v.C6827f;
import p298d.p337v.p339j.p340a.C6839d;

/* renamed from: l.a.u */
public final class C7769u {

    /* renamed from: a */
    public static final boolean f15319a;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r0.equals("on") != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r0.equals("") != false) goto L_0x0033;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = p005b.p291q.p292a.C5266a.m9994m4(r0)
            if (r0 != 0) goto L_0x0009
            goto L_0x0033
        L_0x0009:
            int r1 = r0.hashCode()
            if (r1 == 0) goto L_0x002b
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L_0x0022
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L_0x0037
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
            r0 = 0
            goto L_0x0034
        L_0x0022:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
            goto L_0x0033
        L_0x002b:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
        L_0x0033:
            r0 = 1
        L_0x0034:
            f15319a = r0
            return
        L_0x0037:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.C7769u.<clinit>():void");
    }

    /* renamed from: a */
    public static final C6827f m14114a(C7821y yVar, C6827f fVar) {
        C6827f plus = yVar.mo25306b().plus(fVar);
        C7815w wVar = C7725h0.f15273a;
        if (plus == wVar) {
            return plus;
        }
        int i = C6825e.f13750c;
        return plus.get(C6825e.C6826a.f13751g) == null ? plus.plus(wVar) : plus;
    }

    /* renamed from: b */
    public static final C7756q1<?> m14115b(C6824d<?> dVar, C6827f fVar, Object obj) {
        C7756q1<?> q1Var = null;
        if (!(dVar instanceof C6839d)) {
            return null;
        }
        if (!(fVar.get(C7759r1.f15312g) != null)) {
            return null;
        }
        C6839d dVar2 = (C6839d) dVar;
        while (true) {
            if (!(dVar2 instanceof C7719f0) && (dVar2 = dVar2.mo24172a()) != null) {
                if (dVar2 instanceof C7756q1) {
                    q1Var = (C7756q1) dVar2;
                    break;
                }
            } else {
                break;
            }
        }
        if (q1Var != null) {
            q1Var.f15307k = fVar;
            q1Var.f15308l = obj;
        }
        return q1Var;
    }
}
