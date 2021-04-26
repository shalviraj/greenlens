package p298d.p299a.p300a.p301a.p303y0.p390h;

import java.util.ArrayList;
import java.util.Set;
import p005b.p291q.p292a.C5266a;
import p298d.p334t.C6790h;

/* renamed from: d.a.a.a.y0.h.h */
public enum C7172h {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);
    

    /* renamed from: h */
    public static final Set<C7172h> f14319h = null;

    /* renamed from: i */
    public static final Set<C7172h> f14320i = null;

    /* renamed from: g */
    public final boolean f14336g;

    /* access modifiers changed from: public */
    static {
        C7172h[] values = values();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 14; i++) {
            C7172h hVar = values[i];
            if (hVar.f14336g) {
                arrayList.add(hVar);
            }
        }
        f14319h = C6790h.m12349e0(arrayList);
        f14320i = C5266a.m9781B4(values());
    }

    /* access modifiers changed from: public */
    C7172h(boolean z) {
        this.f14336g = z;
    }
}
