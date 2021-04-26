package p298d.p299a.p300a.p301a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6764f;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.C5922i0;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.g0 */
public final class C5918g0 extends C6890k implements C6851a<Type> {

    /* renamed from: g */
    public final /* synthetic */ int f11720g;

    /* renamed from: h */
    public final /* synthetic */ C5922i0.C5923a f11721h;

    /* renamed from: i */
    public final /* synthetic */ C6764f f11722i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5918g0(int i, C5922i0.C5923a aVar, C6764f fVar, C6736l lVar) {
        super(0);
        this.f11720g = i;
        this.f11721h = aVar;
        this.f11722i = fVar;
    }

    public Object invoke() {
        String str;
        Class cls;
        Type t = this.f11721h.f11731g.mo23020t();
        if (t instanceof Class) {
            Class cls2 = (Class) t;
            cls = cls2.isArray() ? cls2.getComponentType() : Object.class;
            str = "if (javaType.isArray) ja…Type else Any::class.java";
        } else if (t instanceof GenericArrayType) {
            if (this.f11720g == 0) {
                cls = ((GenericArrayType) t).getGenericComponentType();
                str = "javaType.genericComponentType";
            } else {
                StringBuilder u = C0843a.m460u("Array type has been queried for a non-0th argument: ");
                u.append(this.f11721h.f11731g);
                throw new C5931l0(u.toString());
            }
        } else if (t instanceof ParameterizedType) {
            Type type = (Type) ((List) this.f11722i.getValue()).get(this.f11720g);
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                C6888i.m12437d(lowerBounds, "argument.lowerBounds");
                Type type2 = (Type) C5266a.m9878S0(lowerBounds);
                if (type2 != null) {
                    type = type2;
                } else {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    C6888i.m12437d(upperBounds, "argument.upperBounds");
                    type = (Type) C5266a.m9873R0(upperBounds);
                }
            }
            str = "if (argument !is Wildcar…ument.upperBounds.first()";
        } else {
            StringBuilder u2 = C0843a.m460u("Non-generic type has been queried for arguments: ");
            u2.append(this.f11721h.f11731g);
            throw new C5931l0(u2.toString());
        }
        C6888i.m12437d(cls, str);
        return cls;
    }
}
