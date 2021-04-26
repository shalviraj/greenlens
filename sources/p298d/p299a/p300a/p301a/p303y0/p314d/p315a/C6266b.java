package p298d.p299a.p300a.p301a.p303y0.p314d.p315a;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6451h;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6452i;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.a.b */
public final class C6266b {

    /* renamed from: a */
    public static final C6714b f12325a = new C6714b("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b */
    public static final C6714b f12326b = new C6714b("javax.annotation.meta.TypeQualifier");

    /* renamed from: c */
    public static final C6714b f12327c = new C6714b("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d */
    public static final C6714b f12328d = new C6714b("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e */
    public static final List<C6264a> f12329e;

    /* renamed from: f */
    public static final Map<C6714b, C6514t> f12330f;

    /* renamed from: g */
    public static final Map<C6714b, C6514t> f12331g;

    /* renamed from: h */
    public static final Set<C6714b> f12332h = C6790h.m12327N(C6265a0.f12316e, C6265a0.f12317f);

    static {
        C6264a aVar = C6264a.VALUE_PARAMETER;
        List<C6264a> A = C6790h.m12314A(C6264a.FIELD, C6264a.METHOD_RETURN_TYPE, aVar, C6264a.TYPE_PARAMETER_BOUNDS, C6264a.TYPE_USE);
        f12329e = A;
        C6714b bVar = C6265a0.f12314c;
        C6451h hVar = C6451h.NOT_NULL;
        Map<C6714b, C6514t> h3 = C5266a.m9963h3(new C6768j(bVar, new C6514t(new C6452i(hVar, false), A, false)));
        f12330f = h3;
        Map D = C6790h.m12317D(new C6768j(new C6714b("javax.annotation.ParametersAreNullableByDefault"), new C6514t(new C6452i(C6451h.NULLABLE, false), C5266a.m9910Y2(aVar), false, 4)), new C6768j(new C6714b("javax.annotation.ParametersAreNonnullByDefault"), new C6514t(new C6452i(hVar, false), C5266a.m9910Y2(aVar), false, 4)));
        C6888i.m12438e(D, "$this$plus");
        C6888i.m12438e(h3, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(D);
        linkedHashMap.putAll(h3);
        f12331g = linkedHashMap;
    }
}
