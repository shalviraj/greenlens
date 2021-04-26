package p005b.p280p.p281a.p284z;

import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;

/* renamed from: b.p.a.z.a */
public final class C5116a<T> extends C5075l<T> {

    /* renamed from: a */
    public final C5075l<T> f9902a;

    public C5116a(C5075l<T> lVar) {
        this.f9902a = lVar;
    }

    /* renamed from: a */
    public T mo16804a(C5081q qVar) {
        if (qVar.mo16842h0() != C5081q.C5083b.NULL) {
            return this.f9902a.mo16804a(qVar);
        }
        qVar.mo16838Z();
        return null;
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, T t) {
        if (t == null) {
            uVar.mo16866S();
        } else {
            this.f9902a.mo16805e(uVar, t);
        }
    }

    public String toString() {
        return this.f9902a + ".nullSafe()";
    }
}
