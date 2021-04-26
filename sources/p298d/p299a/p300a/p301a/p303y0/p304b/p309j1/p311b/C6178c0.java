package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b;

import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6412a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6434u;
import p298d.p334t.C6798p;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.j1.b.c0 */
public final class C6178c0 extends C6180d0 implements C6434u {

    /* renamed from: a */
    public final Class<?> f12199a;

    /* renamed from: b */
    public final Collection<C6412a> f12200b = C6798p.f13713g;

    public C6178c0(Class<?> cls) {
        C6888i.m12438e(cls, "reflectType");
        this.f12199a = cls;
    }

    /* renamed from: O */
    public Type mo23357O() {
        return this.f12199a;
    }

    /* renamed from: a */
    public PrimitiveType mo23358a() {
        if (C6888i.m12434a(this.f12199a, Void.TYPE)) {
            return null;
        }
        return JvmPrimitiveType.get(this.f12199a.getName()).getPrimitiveType();
    }

    public Collection<C6412a> getAnnotations() {
        return this.f12200b;
    }

    /* renamed from: q */
    public boolean mo23346q() {
        return false;
    }
}
