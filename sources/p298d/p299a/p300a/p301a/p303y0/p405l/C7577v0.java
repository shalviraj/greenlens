package p298d.p299a.p300a.p301a.p303y0.p405l;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.v0 */
public abstract class C7577v0 extends C7586z0 {

    /* renamed from: b */
    public static final C7578a f15028b = new C7578a((DefaultConstructorMarker) null);

    /* renamed from: d.a.a.a.y0.l.v0$a */
    public static final class C7578a {
        public C7578a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: c */
        public static C7577v0 m13801c(C7578a aVar, Map map, boolean z, int i) {
            if ((i & 2) != 0) {
                z = false;
            }
            C6888i.m12438e(map, "map");
            return new C7569u0(map, z);
        }

        /* renamed from: a */
        public final C7586z0 mo25186a(C7452c0 c0Var) {
            C6888i.m12438e(c0Var, "kotlinType");
            return mo25187b(c0Var.mo24887V(), c0Var.mo24886U());
        }

        /* renamed from: b */
        public final C7586z0 mo25187b(C7567t0 t0Var, List<? extends C7580w0> list) {
            C6888i.m12438e(t0Var, "typeConstructor");
            C6888i.m12438e(list, "arguments");
            List<C6248w0> parameters = t0Var.getParameters();
            C6888i.m12437d(parameters, "typeConstructor.parameters");
            C6248w0 w0Var = (C6248w0) C6790h.m12372z(parameters);
            if (C6888i.m12434a(w0Var == null ? null : Boolean.valueOf(w0Var.mo23140u()), Boolean.TRUE)) {
                List<C6248w0> parameters2 = t0Var.getParameters();
                C6888i.m12437d(parameters2, "typeConstructor.parameters");
                ArrayList arrayList = new ArrayList(C5266a.m9892V(parameters2, 10));
                for (C6248w0 typeConstructor : parameters2) {
                    arrayList.add(typeConstructor.getTypeConstructor());
                }
                return m13801c(this, C6790h.m12338Y(C6790h.m12353g0(arrayList, list)), false, 2);
            }
            C6888i.m12438e(parameters, "parameters");
            C6888i.m12438e(list, "argumentsList");
            Object[] array = parameters.toArray(new C6248w0[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Object[] array2 = list.toArray(new C7580w0[0]);
            Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
            return new C7585z((C6248w0[]) array, (C7580w0[]) array2, false);
        }
    }

    /* renamed from: e */
    public C7580w0 mo23539e(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "key");
        return mo25168h(c0Var.mo24887V());
    }

    /* renamed from: h */
    public abstract C7580w0 mo25168h(C7567t0 t0Var);
}
