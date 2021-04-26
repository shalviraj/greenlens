package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b;

import java.lang.annotation.Annotation;
import java.util.Collection;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6412a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6436w;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6439z;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.j1.b.f0 */
public final class C6184f0 extends C6200u implements C6439z {

    /* renamed from: a */
    public final C6180d0 f12204a;

    /* renamed from: b */
    public final Annotation[] f12205b;

    /* renamed from: c */
    public final String f12206c;

    /* renamed from: d */
    public final boolean f12207d;

    public C6184f0(C6180d0 d0Var, Annotation[] annotationArr, String str, boolean z) {
        C6888i.m12438e(d0Var, "type");
        C6888i.m12438e(annotationArr, "reflectAnnotations");
        this.f12204a = d0Var;
        this.f12205b = annotationArr;
        this.f12206c = str;
        this.f12207d = z;
    }

    /* renamed from: a */
    public C6436w mo23370a() {
        return this.f12204a;
    }

    /* renamed from: e */
    public boolean mo23371e() {
        return this.f12207d;
    }

    public Collection getAnnotations() {
        return C5266a.m9931c1(this.f12205b);
    }

    public C6717d getName() {
        String str = this.f12206c;
        if (str == null) {
            return null;
        }
        return C6717d.m12269k(str);
    }

    /* renamed from: j */
    public C6412a mo23344j(C6714b bVar) {
        C6888i.m12438e(bVar, "fqName");
        return C5266a.m9843M0(this.f12205b, bVar);
    }

    /* renamed from: q */
    public boolean mo23346q() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C6184f0.class.getName());
        sb.append(": ");
        sb.append(this.f12207d ? "vararg " : "");
        String str = this.f12206c;
        sb.append(str == null ? null : C6717d.m12269k(str));
        sb.append(": ");
        sb.append(this.f12204a);
        return sb.toString();
    }
}
