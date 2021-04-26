package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6058f;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6059g;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6064j;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7219a;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7221b;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7232k;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7249w;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

public final class JvmBuiltInsCustomizer$notConsideredDeprecation$2 extends C6890k implements C6851a<C6060h> {
    public final /* synthetic */ JvmBuiltInsCustomizer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$notConsideredDeprecation$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(0);
        this.this$0 = jvmBuiltInsCustomizer;
    }

    public final C6060h invoke() {
        KotlinBuiltIns builtIns = this.this$0.moduleDescriptor.getBuiltIns();
        C6717d dVar = C6059g.f11915a;
        C6888i.m12438e(builtIns, "<this>");
        C6888i.m12438e("This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "message");
        C6888i.m12438e("", "replaceWith");
        C6888i.m12438e("WARNING", "level");
        C6064j jVar = new C6064j(builtIns, StandardNames.FqNames.replaceWith, C6790h.m12317D(new C6768j(C6059g.f11918d, new C7249w("")), new C6768j(C6059g.f11919e, new C7221b(C6798p.f13713g, new C6058f(builtIns)))));
        C6714b bVar = StandardNames.FqNames.deprecated;
        C6717d dVar2 = C6059g.f11917c;
        C6713a l = C6713a.m12239l(StandardNames.FqNames.deprecationLevel);
        C6888i.m12437d(l, "topLevel(StandardNames.FqNames.deprecationLevel)");
        C6717d l2 = C6717d.m12270l("WARNING");
        C6888i.m12437d(l2, "identifier(level)");
        return C6060h.f11920d.mo23170a(C5266a.m9910Y2(new C6064j(builtIns, bVar, C6790h.m12317D(new C6768j(C6059g.f11915a, new C7249w("This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version")), new C6768j(C6059g.f11916b, new C7219a(jVar)), new C6768j(dVar2, new C7232k(l, l2))))));
    }
}
