package p005b.p096l.p224e.p226e0.p228z;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p005b.p096l.p224e.C4332b0;
import p005b.p096l.p224e.C4465k;
import p005b.p096l.p224e.p226e0.p228z.C4402j;
import p005b.p096l.p224e.p230f0.C4455a;
import p005b.p096l.p224e.p231g0.C4457a;
import p005b.p096l.p224e.p231g0.C4460c;

/* renamed from: b.l.e.e0.z.n */
public final class C4413n<T> extends C4332b0<T> {

    /* renamed from: a */
    public final C4465k f8176a;

    /* renamed from: b */
    public final C4332b0<T> f8177b;

    /* renamed from: c */
    public final Type f8178c;

    public C4413n(C4465k kVar, C4332b0<T> b0Var, Type type) {
        this.f8176a = kVar;
        this.f8177b = b0Var;
        this.f8178c = type;
    }

    /* renamed from: a */
    public T mo10755a(C4457a aVar) {
        return this.f8177b.mo10755a(aVar);
    }

    /* renamed from: b */
    public void mo10756b(C4460c cVar, T t) {
        C4332b0<T> b0Var = this.f8177b;
        Type type = this.f8178c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f8178c) {
            b0Var = this.f8176a.mo16119e(new C4455a(type));
            if (b0Var instanceof C4402j.C4403a) {
                C4332b0<T> b0Var2 = this.f8177b;
                if (!(b0Var2 instanceof C4402j.C4403a)) {
                    b0Var = b0Var2;
                }
            }
        }
        b0Var.mo10756b(cVar, t);
    }
}
