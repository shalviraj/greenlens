package p005b.p280p.p281a;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.p284z.C5116a;
import p435n.C8040e;

/* renamed from: b.p.a.l */
public abstract class C5075l<T> {

    /* renamed from: b.p.a.l$a */
    public interface C5076a {
        /* renamed from: a */
        C5075l<?> mo16807a(Type type, Set<? extends Annotation> set, C5099x xVar);
    }

    /* renamed from: a */
    public abstract T mo16804a(C5081q qVar);

    /* renamed from: b */
    public final T mo16830b(String str) {
        C8040e eVar = new C8040e();
        eVar.mo25947z0(str);
        C5084r rVar = new C5084r(eVar);
        T a = mo16804a(rVar);
        if (rVar.mo16842h0() == C5081q.C5083b.END_DOCUMENT) {
            return a;
        }
        throw new C5078n("JSON document was not fully consumed.");
    }

    /* renamed from: c */
    public final C5075l<T> mo16831c() {
        return this instanceof C5116a ? this : new C5116a(this);
    }

    /* renamed from: d */
    public final String mo16832d(T t) {
        C8040e eVar = new C8040e();
        try {
            mo16805e(new C5085s(eVar), t);
            return eVar.mo25919n0();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public abstract void mo16805e(C5087u uVar, T t);
}
