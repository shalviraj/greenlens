package p298d.p299a.p300a.p301a.p303y0.p304b.p305f1;

import java.util.Objects;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.f1.e */
public enum C6057e {
    FIELD((String) null),
    FILE((String) null),
    PROPERTY((String) null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER((String) null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");
    

    /* renamed from: g */
    public final String f11913g;

    /* access modifiers changed from: public */
    C6057e(String str) {
        if (str == null) {
            String name = name();
            Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
            str = name.toLowerCase();
            C6888i.m12437d(str, "(this as java.lang.String).toLowerCase()");
        }
        this.f11913g = str;
    }
}
