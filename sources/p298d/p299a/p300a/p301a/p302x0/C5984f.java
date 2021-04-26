package p298d.p299a.p300a.p301a.p302x0;

import java.util.Map;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.x0.f */
public final class C5984f extends C6890k implements C6851a<String> {

    /* renamed from: g */
    public final /* synthetic */ Class f11830g;

    /* renamed from: h */
    public final /* synthetic */ Map f11831h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5984f(Class cls, Map map) {
        super(0);
        this.f11830g = cls;
        this.f11831h = map;
    }

    public Object invoke() {
        StringBuilder t = C0843a.m459t('@');
        t.append(this.f11830g.getCanonicalName());
        C6790h.m12367u(this.f11831h.entrySet(), t, ", ", "(", ")", 0, (CharSequence) null, C5983e.f11829g, 48);
        String sb = t.toString();
        C6888i.m12437d(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }
}
