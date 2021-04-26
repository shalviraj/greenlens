package p298d.p299a.p300a.p301a;

import java.lang.reflect.Field;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p332w.C6754b;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.z */
public final class C6721z extends C6890k implements C6851a<Object> {

    /* renamed from: g */
    public final /* synthetic */ C5975x f13633g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6721z(C5975x xVar) {
        super(0);
        this.f13633g = xVar;
    }

    public final Object invoke() {
        C5975x xVar = this.f13633g;
        Field A = xVar.mo22993A();
        C5975x xVar2 = this.f13633g;
        Object T = C5266a.m9882T(xVar2.f11672o, xVar2.mo22976x());
        try {
            if (T == C5885c0.f11666p) {
                if (xVar.mo22976x().getExtensionReceiverParameter() == null) {
                    throw new RuntimeException('\'' + xVar + "' is not an extension property and thus getExtensionDelegate() " + "is not going to work, use getDelegate() instead");
                }
            }
            if (A != null) {
                return A.get(T);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new C6754b(e);
        }
    }
}
