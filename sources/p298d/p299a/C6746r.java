package p298d.p299a;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6887h;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.r */
public final class C6746r implements ParameterizedType, Type {

    /* renamed from: g */
    public final Type[] f13648g;

    /* renamed from: h */
    public final Class<?> f13649h;

    /* renamed from: i */
    public final Type f13650i;

    /* renamed from: d.a.r$a */
    public static final /* synthetic */ class C6747a extends C6887h implements C6862l<Type, String> {

        /* renamed from: p */
        public static final C6747a f13651p = new C6747a();

        public C6747a() {
            super(1, C6750u.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        public Object invoke(Object obj) {
            Type type = (Type) obj;
            C6888i.m12438e(type, "p1");
            return C6750u.m12298a(type);
        }
    }

    public C6746r(Class<?> cls, Type type, List<? extends Type> list) {
        C6888i.m12438e(cls, "rawType");
        C6888i.m12438e(list, "typeArguments");
        this.f13649h = cls;
        this.f13650i = type;
        Object[] array = list.toArray(new Type[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        this.f13648g = (Type[]) array;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return C6888i.m12434a(this.f13649h, parameterizedType.getRawType()) && C6888i.m12434a(this.f13650i, parameterizedType.getOwnerType()) && Arrays.equals(this.f13648g, parameterizedType.getActualTypeArguments());
        }
    }

    public Type[] getActualTypeArguments() {
        return this.f13648g;
    }

    public Type getOwnerType() {
        return this.f13650i;
    }

    public Type getRawType() {
        return this.f13649h;
    }

    public String getTypeName() {
        String str;
        StringBuilder sb = new StringBuilder();
        Type type = this.f13650i;
        if (type != null) {
            sb.append(C6750u.m12298a(type));
            sb.append("$");
            str = this.f13649h.getSimpleName();
        } else {
            str = C6750u.m12298a(this.f13649h);
        }
        sb.append(str);
        Type[] typeArr = this.f13648g;
        if (!(typeArr.length == 0)) {
            C5266a.m9863P2(typeArr, sb, ", ", "<", ">", -1, "...", C6747a.f13651p);
        }
        String sb2 = sb.toString();
        C6888i.m12437d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public int hashCode() {
        int hashCode = this.f13649h.hashCode();
        Type type = this.f13650i;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f13648g);
    }

    public String toString() {
        return getTypeName();
    }
}
