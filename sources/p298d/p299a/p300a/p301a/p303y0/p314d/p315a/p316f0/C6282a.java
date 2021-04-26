package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p316f0;

import java.util.Collection;
import java.util.Set;
import p298d.C6777r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7199k;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7201m;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7391p;
import p298d.p344x.p345b.C6862l;

/* renamed from: d.a.a.a.y0.d.a.f0.a */
public final class C6282a extends C7199k {

    /* renamed from: a */
    public final /* synthetic */ C7391p f12367a;

    /* renamed from: b */
    public final /* synthetic */ Set f12368b;

    /* renamed from: c */
    public final /* synthetic */ boolean f12369c;

    /* renamed from: d.a.a.a.y0.d.a.f0.a$a */
    public class C6283a implements C6862l<C6023b, C6777r> {
        public C6283a() {
        }

        public Object invoke(Object obj) {
            C6023b bVar = (C6023b) obj;
            if (bVar != null) {
                C6282a.this.f12367a.mo23335b(bVar);
                return C6777r.f13694a;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"}));
        }
    }

    public C6282a(C7391p pVar, Set set, boolean z) {
        this.f12367a = pVar;
        this.f12368b = set;
        this.f12369c = z;
    }

    /* renamed from: f */
    public static /* synthetic */ void m11272f(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: a */
    public void mo23273a(C6023b bVar) {
        if (bVar != null) {
            C7201m.m13073r(bVar, new C6283a());
            this.f12368b.add(bVar);
            return;
        }
        m11272f(0);
        throw null;
    }

    /* renamed from: d */
    public void mo23454d(C6023b bVar, Collection<? extends C6023b> collection) {
        if (bVar == null) {
            m11272f(3);
            throw null;
        } else if (!this.f12369c || bVar.getKind() == C6023b.C6024a.FAKE_OVERRIDE) {
            super.mo23454d(bVar, collection);
        }
    }

    /* renamed from: e */
    public void mo23274e(C6023b bVar, C6023b bVar2) {
    }
}
