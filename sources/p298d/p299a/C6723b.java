package p298d.p299a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.b */
public final class C6723b implements GenericArrayType, Type {

    /* renamed from: g */
    public final Type f13635g;

    public C6723b(Type type) {
        C6888i.m12438e(type, "elementType");
        this.f13635g = type;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && C6888i.m12434a(this.f13635g, ((GenericArrayType) obj).getGenericComponentType());
    }

    public Type getGenericComponentType() {
        return this.f13635g;
    }

    public String getTypeName() {
        return C6750u.m12298a(this.f13635g) + "[]";
    }

    public int hashCode() {
        return this.f13635g.hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
