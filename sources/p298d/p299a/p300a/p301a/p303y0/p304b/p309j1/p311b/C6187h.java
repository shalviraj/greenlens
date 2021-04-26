package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6412a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6419f;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6436w;
import p298d.p334t.C6798p;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.j1.b.h */
public final class C6187h extends C6180d0 implements C6419f {

    /* renamed from: a */
    public final Type f12211a;

    /* renamed from: b */
    public final C6180d0 f12212b;

    /* renamed from: c */
    public final Collection<C6412a> f12213c;

    public C6187h(Type type) {
        C6180d0 d0Var;
        C6180d0 c0Var;
        C6888i.m12438e(type, "reflectType");
        this.f12211a = type;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            C6888i.m12437d(genericComponentType, "genericComponentType");
            C6888i.m12438e(genericComponentType, "type");
            boolean z = genericComponentType instanceof Class;
            if (z) {
                Class cls = (Class) genericComponentType;
                if (cls.isPrimitive()) {
                    d0Var = new C6178c0(cls);
                    this.f12212b = d0Var;
                    this.f12213c = C6798p.f13713g;
                }
            }
            c0Var = ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) ? new C6187h(genericComponentType) : genericComponentType instanceof WildcardType ? new C6186g0((WildcardType) genericComponentType) : new C6198s(genericComponentType);
        } else {
            if (type instanceof Class) {
                Class cls2 = (Class) type;
                if (cls2.isArray()) {
                    Class<?> componentType = cls2.getComponentType();
                    C6888i.m12437d(componentType, "getComponentType()");
                    C6888i.m12438e(componentType, "type");
                    c0Var = componentType.isPrimitive() ? new C6178c0(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new C6187h(componentType) : componentType instanceof WildcardType ? new C6186g0((WildcardType) componentType) : new C6198s(componentType);
                }
            }
            StringBuilder u = C0843a.m460u("Not an array type (");
            u.append(type.getClass());
            u.append("): ");
            u.append(type);
            throw new IllegalArgumentException(u.toString());
        }
        d0Var = c0Var;
        this.f12212b = d0Var;
        this.f12213c = C6798p.f13713g;
    }

    /* renamed from: O */
    public Type mo23357O() {
        return this.f12211a;
    }

    public Collection<C6412a> getAnnotations() {
        return this.f12213c;
    }

    /* renamed from: q */
    public boolean mo23346q() {
        return false;
    }

    /* renamed from: r */
    public C6436w mo23377r() {
        return this.f12212b;
    }
}
