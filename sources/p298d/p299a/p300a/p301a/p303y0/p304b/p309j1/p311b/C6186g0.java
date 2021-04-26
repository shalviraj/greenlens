package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6412a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6413a0;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6436w;
import p298d.p334t.C6798p;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.j1.b.g0 */
public final class C6186g0 extends C6180d0 implements C6413a0 {

    /* renamed from: a */
    public final WildcardType f12209a;

    /* renamed from: b */
    public final Collection<C6412a> f12210b = C6798p.f13713g;

    public C6186g0(WildcardType wildcardType) {
        C6888i.m12438e(wildcardType, "reflectType");
        this.f12209a = wildcardType;
    }

    /* renamed from: C */
    public boolean mo23375C() {
        Type[] upperBounds = this.f12209a.getUpperBounds();
        C6888i.m12437d(upperBounds, "reflectType.upperBounds");
        return !C6888i.m12434a(C5266a.m9878S0(upperBounds), Object.class);
    }

    /* renamed from: O */
    public Type mo23357O() {
        return this.f12209a;
    }

    public Collection<C6412a> getAnnotations() {
        return this.f12210b;
    }

    /* renamed from: o */
    public C6436w mo23376o() {
        C6436w hVar;
        C6178c0 c0Var;
        Type[] upperBounds = this.f12209a.getUpperBounds();
        Type[] lowerBounds = this.f12209a.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException(C6888i.m12444k("Wildcard types with many bounds are not yet supported: ", this.f12209a));
        }
        if (lowerBounds.length == 1) {
            C6888i.m12437d(lowerBounds, "lowerBounds");
            Object Y3 = C5266a.m9911Y3(lowerBounds);
            C6888i.m12437d(Y3, "lowerBounds.single()");
            Type type = (Type) Y3;
            C6888i.m12438e(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    c0Var = new C6178c0(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                hVar = new C6187h(type);
                return hVar;
            }
            hVar = type instanceof WildcardType ? new C6186g0((WildcardType) type) : new C6198s(type);
            return hVar;
        } else if (upperBounds.length != 1) {
            return null;
        } else {
            C6888i.m12437d(upperBounds, "upperBounds");
            Type type2 = (Type) C5266a.m9911Y3(upperBounds);
            if (C6888i.m12434a(type2, Object.class)) {
                return null;
            }
            C6888i.m12437d(type2, "ub");
            C6888i.m12438e(type2, "type");
            boolean z2 = type2 instanceof Class;
            if (z2) {
                Class cls2 = (Class) type2;
                if (cls2.isPrimitive()) {
                    c0Var = new C6178c0(cls2);
                }
            }
            if ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) {
                hVar = new C6187h(type2);
                return hVar;
            }
            hVar = type2 instanceof WildcardType ? new C6186g0((WildcardType) type2) : new C6198s(type2);
            return hVar;
        }
        return c0Var;
    }

    /* renamed from: q */
    public boolean mo23346q() {
        return false;
    }
}
