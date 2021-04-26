package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6427n;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6436w;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.j1.b.w */
public final class C6202w extends C6204y implements C6427n {

    /* renamed from: a */
    public final Field f12228a;

    public C6202w(Field field) {
        C6888i.m12438e(field, "member");
        this.f12228a = field;
    }

    /* renamed from: J */
    public boolean mo23412J() {
        return false;
    }

    /* renamed from: O */
    public Member mo23408O() {
        return this.f12228a;
    }

    /* renamed from: a */
    public C6436w mo23413a() {
        Type genericType = this.f12228a.getGenericType();
        C6888i.m12437d(genericType, "member.genericType");
        C6888i.m12438e(genericType, "type");
        boolean z = genericType instanceof Class;
        if (z) {
            Class cls = (Class) genericType;
            if (cls.isPrimitive()) {
                return new C6178c0(cls);
            }
        }
        return ((genericType instanceof GenericArrayType) || (z && ((Class) genericType).isArray())) ? new C6187h(genericType) : genericType instanceof WildcardType ? new C6186g0((WildcardType) genericType) : new C6198s(genericType);
    }

    /* renamed from: w */
    public boolean mo23414w() {
        return this.f12228a.isEnumConstant();
    }
}
