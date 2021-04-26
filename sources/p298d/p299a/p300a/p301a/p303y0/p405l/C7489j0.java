package p298d.p299a.p300a.p301a.p303y0.p405l;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6055c;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6057e;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p390h.C7150c;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7536j;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.j0 */
public abstract class C7489j0 extends C7481g1 implements C7535i, C7536j {
    public C7489j0() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: c0 */
    public abstract C7489j0 mo23545Z(boolean z);

    /* renamed from: d0 */
    public abstract C7489j0 mo23568d0(C6060h hVar);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (C6055c s : getAnnotations()) {
            String[] strArr = {"[", C7150c.m12869s(C7150c.f14298b, s, (C6057e) null, 2, (Object) null), "] "};
            C6888i.m12438e(sb, "$this$append");
            C6888i.m12438e(strArr, "value");
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(mo24887V());
        if (!mo24886U().isEmpty()) {
            C6790h.m12367u(mo24886U(), sb, ", ", "<", ">", 0, (CharSequence) null, (C6862l) null, 112);
        }
        if (mo23566W()) {
            sb.append("?");
        }
        String sb2 = sb.toString();
        C6888i.m12437d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
