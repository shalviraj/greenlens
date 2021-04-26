package p298d.p299a.p300a.p301a.p303y0.p314d.p315a;

import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;

/* renamed from: d.a.a.a.y0.d.a.y */
public final class C6522y {

    /* renamed from: a */
    public static final C6522y f12767a = null;

    /* renamed from: b */
    public static final C6714b f12768b = new C6714b("kotlin.jvm.JvmField");

    static {
        C6888i.m12437d(C6713a.m12239l(new C6714b("kotlin.reflect.jvm.internal.ReflectionFactoryImpl")), "topLevel(FqName(\"kotlin.reflect.jvm.internal.ReflectionFactoryImpl\"))");
    }

    /* renamed from: a */
    public static final String m11550a(String str) {
        C6888i.m12438e(str, "propertyName");
        return m11552c(str) ? str : C6888i.m12444k("get", C5266a.m9830K(str));
    }

    /* renamed from: b */
    public static final String m11551b(String str) {
        String str2;
        C6888i.m12438e(str, "propertyName");
        if (m11552c(str)) {
            str2 = str.substring(2);
            C6888i.m12437d(str2, "(this as java.lang.String).substring(startIndex)");
        } else {
            str2 = C5266a.m9830K(str);
        }
        return C6888i.m12444k("set", str2);
    }

    /* renamed from: c */
    public static final boolean m11552c(String str) {
        C6888i.m12438e(str, "name");
        if (!C7694h.m13910A(str, "is", false, 2) || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        return C6888i.m12440g(97, charAt) > 0 || C6888i.m12440g(charAt, 122) > 0;
    }
}
