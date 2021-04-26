package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6412a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6437x;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.j1.b.e0 */
public final class C6182e0 extends C6200u implements C6183f, C6437x {

    /* renamed from: a */
    public final TypeVariable<?> f12203a;

    public C6182e0(TypeVariable<?> typeVariable) {
        C6888i.m12438e(typeVariable, "typeVariable");
        this.f12203a = typeVariable;
    }

    /* renamed from: d */
    public AnnotatedElement mo23364d() {
        TypeVariable<?> typeVariable = this.f12203a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6182e0) && C6888i.m12434a(this.f12203a, ((C6182e0) obj).f12203a);
    }

    public Collection getAnnotations() {
        return C5266a.m9925b1(this);
    }

    public C6717d getName() {
        C6717d l = C6717d.m12270l(this.f12203a.getName());
        C6888i.m12437d(l, "identifier(typeVariable.name)");
        return l;
    }

    public Collection getUpperBounds() {
        Type type;
        Type[] bounds = this.f12203a.getBounds();
        C6888i.m12437d(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type sVar : bounds) {
            arrayList.add(new C6198s(sVar));
        }
        C6198s sVar2 = (C6198s) C6790h.m12331R(arrayList);
        if (sVar2 == null) {
            type = null;
        } else {
            type = sVar2.f12224a;
        }
        return C6888i.m12434a(type, Object.class) ? C6798p.f13713g : arrayList;
    }

    public int hashCode() {
        return this.f12203a.hashCode();
    }

    /* renamed from: j */
    public C6412a mo23344j(C6714b bVar) {
        return C5266a.m9837L0(this, bVar);
    }

    /* renamed from: q */
    public boolean mo23346q() {
        C5266a.m10028s2(this);
        return false;
    }

    public String toString() {
        return C6182e0.class.getName() + ": " + this.f12203a;
    }
}
