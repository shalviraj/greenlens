package p005b.p096l.p224e.p226e0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p224e.C4473r;

/* renamed from: b.l.e.e0.j */
public class C4362j implements C4380t<T> {

    /* renamed from: a */
    public final /* synthetic */ Type f8075a;

    public C4362j(C4357g gVar, Type type) {
        this.f8075a = type;
    }

    /* renamed from: a */
    public T mo15987a() {
        Type type = this.f8075a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            StringBuilder u = C0843a.m460u("Invalid EnumSet type: ");
            u.append(this.f8075a.toString());
            throw new C4473r(u.toString());
        }
        StringBuilder u2 = C0843a.m460u("Invalid EnumSet type: ");
        u2.append(this.f8075a.toString());
        throw new C4473r(u2.toString());
    }
}
