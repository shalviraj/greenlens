package p298d.p299a;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.v */
public final class C6751v implements WildcardType, Type {

    /* renamed from: i */
    public static final C6751v f13654i = new C6751v((Type) null, (Type) null);

    /* renamed from: j */
    public static final C6752a f13655j = new C6752a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public final Type f13656g;

    /* renamed from: h */
    public final Type f13657h;

    /* renamed from: d.a.v$a */
    public static final class C6752a {
        public C6752a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public C6751v(Type type, Type type2) {
        this.f13656g = type;
        this.f13657h = type2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
        }
    }

    public Type[] getLowerBounds() {
        Type type = this.f13657h;
        if (type == null) {
            return new Type[0];
        }
        return new Type[]{type};
    }

    public String getTypeName() {
        Type type;
        StringBuilder sb;
        if (this.f13657h != null) {
            sb = C0843a.m460u("? super ");
            type = this.f13657h;
        } else {
            Type type2 = this.f13656g;
            if (type2 == null || !(!C6888i.m12434a(type2, Object.class))) {
                return "?";
            }
            sb = C0843a.m460u("? extends ");
            type = this.f13656g;
        }
        sb.append(C6750u.m12298a(type));
        return sb.toString();
    }

    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f13656g;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}
