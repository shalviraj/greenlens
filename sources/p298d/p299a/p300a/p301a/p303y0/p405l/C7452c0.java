package p298d.p299a.p300a.p301a.p303y0.p405l;

import com.segment.analytics.integrations.BasePayload;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6053a;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7508n;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7534h;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.c0 */
public abstract class C7452c0 implements C6053a, C7534h {

    /* renamed from: g */
    public int f14868g;

    public C7452c0() {
    }

    public C7452c0(DefaultConstructorMarker defaultConstructorMarker) {
    }

    /* renamed from: U */
    public abstract List<C7580w0> mo24886U();

    /* renamed from: V */
    public abstract C7567t0 mo24887V();

    /* renamed from: W */
    public abstract boolean mo23566W();

    /* renamed from: X */
    public abstract C7452c0 mo23544X(C7495e eVar);

    /* renamed from: Y */
    public abstract C7481g1 mo25056Y();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7452c0)) {
            return false;
        }
        C7452c0 c0Var = (C7452c0) obj;
        if (mo23566W() == c0Var.mo23566W()) {
            C7481g1 Y = mo25056Y();
            C7481g1 Y2 = c0Var.mo25056Y();
            C6888i.m12438e(Y, "a");
            C6888i.m12438e(Y2, "b");
            C7508n nVar = C7508n.f14951a;
            C6888i.m12438e(nVar, BasePayload.CONTEXT_KEY);
            C6888i.m12438e(Y, "a");
            C6888i.m12438e(Y2, "b");
            if (C7454d.m13425b(nVar, Y, Y2)) {
                return true;
            }
        }
        return false;
    }

    public abstract C7277h getMemberScope();

    public final int hashCode() {
        int i;
        int i2 = this.f14868g;
        if (i2 != 0) {
            return i2;
        }
        if (C5266a.m10046v2(this)) {
            i = super.hashCode();
        } else {
            int hashCode = mo24886U().hashCode();
            i = (mo23566W() ? 1 : 0) + ((hashCode + (mo24887V().hashCode() * 31)) * 31);
        }
        this.f14868g = i;
        return i;
    }
}
