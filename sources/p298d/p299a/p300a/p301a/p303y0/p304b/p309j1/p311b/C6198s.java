package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6412a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6422i;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6423j;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6436w;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p334t.C6798p;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.j1.b.s */
public final class C6198s extends C6180d0 implements C6423j {

    /* renamed from: a */
    public final Type f12224a;

    /* renamed from: b */
    public final C6422i f12225b;

    public C6198s(Type type) {
        C6422i iVar;
        C6888i.m12438e(type, "reflectType");
        this.f12224a = type;
        if (type instanceof Class) {
            iVar = new C6196q((Class) type);
        } else if (type instanceof TypeVariable) {
            iVar = new C6182e0((TypeVariable) type);
        } else if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            Objects.requireNonNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            iVar = new C6196q((Class) rawType);
        } else {
            StringBuilder u = C0843a.m460u("Not a classifier type (");
            u.append(type.getClass());
            u.append("): ");
            u.append(type);
            throw new IllegalStateException(u.toString());
        }
        this.f12225b = iVar;
    }

    /* renamed from: M */
    public boolean mo23403M() {
        Type type = this.f12224a;
        if (!(type instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
        C6888i.m12437d(typeParameters, "getTypeParameters()");
        return (typeParameters.length == 0) ^ true;
    }

    /* renamed from: N */
    public String mo23404N() {
        throw new UnsupportedOperationException(C6888i.m12444k("Type not found: ", this.f12224a));
    }

    /* renamed from: O */
    public Type mo23357O() {
        return this.f12224a;
    }

    public Collection<C6412a> getAnnotations() {
        return C6798p.f13713g;
    }

    /* renamed from: h */
    public C6422i mo23405h() {
        return this.f12225b;
    }

    /* renamed from: j */
    public C6412a mo23344j(C6714b bVar) {
        C6888i.m12438e(bVar, "fqName");
        return null;
    }

    /* renamed from: q */
    public boolean mo23346q() {
        return false;
    }

    /* renamed from: u */
    public List<C6436w> mo23406u() {
        Object obj;
        List<Type> d = C6173b.m11075d(this.f12224a);
        ArrayList arrayList = new ArrayList(C5266a.m9892V(d, 10));
        for (Type type : d) {
            C6888i.m12438e(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    obj = new C6178c0(cls);
                    arrayList.add(obj);
                }
            }
            obj = ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new C6187h(type) : type instanceof WildcardType ? new C6186g0((WildcardType) type) : new C6198s(type);
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: x */
    public String mo23407x() {
        return this.f12224a.toString();
    }
}
