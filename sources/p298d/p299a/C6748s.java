package p298d.p299a;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6767i;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.s */
public final class C6748s implements TypeVariable<GenericDeclaration>, Object {

    /* renamed from: g */
    public final C6742o f13652g;

    public C6748s(C6742o oVar) {
        C6888i.m12438e(oVar, "typeParameter");
        this.f13652g = oVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !C6888i.m12434a(getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    public Type[] getBounds() {
        List<C6741n> upperBounds = this.f13652g.getUpperBounds();
        ArrayList arrayList = new ArrayList(C5266a.m9892V(upperBounds, 10));
        for (C6741n b : upperBounds) {
            arrayList.add(C6750u.m12299b(b, true));
        }
        Object[] array = arrayList.toArray(new Type[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (Type[]) array;
    }

    public GenericDeclaration getGenericDeclaration() {
        StringBuilder u = C0843a.m460u("getGenericDeclaration() is not yet supported for type variables created from KType: ");
        u.append(this.f13652g);
        throw new C6767i(C0843a.m451l("An operation is not implemented: ", u.toString()));
    }

    public String getName() {
        return this.f13652g.getName();
    }

    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        getName().hashCode();
        getGenericDeclaration();
        throw null;
    }

    public String toString() {
        return getName();
    }
}
