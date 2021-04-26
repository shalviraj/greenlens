package p298d.p299a.p300a.p301a.p303y0.p314d.p315a;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.d.a.k */
public final class C6440k {

    /* renamed from: a */
    public static final C6440k f12639a = new C6440k();

    /* renamed from: d.a.a.a.y0.d.a.k$a */
    public static final class C6441a extends C6890k implements C6862l<C6023b, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ C6440k f12640g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6441a(C6440k kVar) {
            super(1);
            this.f12640g = kVar;
        }

        public Object invoke(Object obj) {
            C6023b bVar = (C6023b) obj;
            C6888i.m12438e(bVar, "it");
            return Boolean.valueOf(this.f12640g.mo23555b(bVar));
        }
    }

    /* renamed from: a */
    public final String mo23554a(C6023b bVar) {
        C6888i.m12438e(bVar, "<this>");
        KotlinBuiltIns.isBuiltIn(bVar);
        C6023b c = C7255a.m13130c(C7255a.m13140m(bVar), false, new C6441a(this), 1);
        if (c == null) {
            return null;
        }
        C6411j jVar = C6411j.f12631a;
        C6717d dVar = C6411j.f12632b.get(C7255a.m13135h(c));
        if (dVar == null) {
            return null;
        }
        return dVar.mo23886e();
    }

    /* renamed from: b */
    public final boolean mo23555b(C6023b bVar) {
        C6888i.m12438e(bVar, "callableMemberDescriptor");
        C6411j jVar = C6411j.f12631a;
        if (!C6411j.f12635e.contains(bVar.getName())) {
            return false;
        }
        if (C6790h.m12348e(C6411j.f12634d, C7255a.m13131d(bVar)) && bVar.getValueParameters().isEmpty()) {
            return true;
        }
        if (!KotlinBuiltIns.isBuiltIn(bVar)) {
            return false;
        }
        Collection<? extends C6023b> overriddenDescriptors = bVar.getOverriddenDescriptors();
        C6888i.m12437d(overriddenDescriptors, "overriddenDescriptors");
        if (overriddenDescriptors.isEmpty()) {
            return false;
        }
        for (C6023b bVar2 : overriddenDescriptors) {
            C6888i.m12437d(bVar2, "it");
            if (mo23555b(bVar2)) {
                return true;
            }
        }
        return false;
    }
}
