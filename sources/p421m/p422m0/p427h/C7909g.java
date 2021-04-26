package p421m.p422m0.p427h;

import androidx.core.app.NotificationCompat;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;
import p421m.C7826a0;
import p421m.C7839e0;
import p421m.C7850h0;
import p421m.C7861l;
import p421m.p422m0.p426g.C7883c;
import p421m.p422m0.p426g.C7887e;

/* renamed from: m.m0.h.g */
public final class C7909g implements C7826a0.C7827a {

    /* renamed from: a */
    public int f15759a;

    /* renamed from: b */
    public final C7887e f15760b;

    /* renamed from: c */
    public final List<C7826a0> f15761c;

    /* renamed from: d */
    public final int f15762d;

    /* renamed from: e */
    public final C7883c f15763e;

    /* renamed from: f */
    public final C7839e0 f15764f;

    /* renamed from: g */
    public final int f15765g;

    /* renamed from: h */
    public final int f15766h;

    /* renamed from: i */
    public final int f15767i;

    public C7909g(C7887e eVar, List<? extends C7826a0> list, int i, C7883c cVar, C7839e0 e0Var, int i2, int i3, int i4) {
        C6888i.m12438e(eVar, NotificationCompat.CATEGORY_CALL);
        C6888i.m12438e(list, "interceptors");
        C6888i.m12438e(e0Var, "request");
        this.f15760b = eVar;
        this.f15761c = list;
        this.f15762d = i;
        this.f15763e = cVar;
        this.f15764f = e0Var;
        this.f15765g = i2;
        this.f15766h = i3;
        this.f15767i = i4;
    }

    /* renamed from: b */
    public static C7909g m14397b(C7909g gVar, int i, C7883c cVar, C7839e0 e0Var, int i2, int i3, int i4, int i5) {
        C7909g gVar2 = gVar;
        int i6 = (i5 & 1) != 0 ? gVar2.f15762d : i;
        C7883c cVar2 = (i5 & 2) != 0 ? gVar2.f15763e : cVar;
        C7839e0 e0Var2 = (i5 & 4) != 0 ? gVar2.f15764f : e0Var;
        int i7 = (i5 & 8) != 0 ? gVar2.f15765g : i2;
        int i8 = (i5 & 16) != 0 ? gVar2.f15766h : i3;
        int i9 = (i5 & 32) != 0 ? gVar2.f15767i : i4;
        C6888i.m12438e(e0Var2, "request");
        return new C7909g(gVar2.f15760b, gVar2.f15761c, i6, cVar2, e0Var2, i7, i8, i9);
    }

    /* renamed from: a */
    public C7861l mo25662a() {
        C7883c cVar = this.f15763e;
        if (cVar != null) {
            return cVar.f15660b;
        }
        return null;
    }

    /* renamed from: c */
    public C7850h0 mo25663c(C7839e0 e0Var) {
        C6888i.m12438e(e0Var, "request");
        boolean z = false;
        if (this.f15762d < this.f15761c.size()) {
            this.f15759a++;
            C7883c cVar = this.f15763e;
            if (cVar != null) {
                if (cVar.f15663e.mo25615b(e0Var.f15528b)) {
                    if (!(this.f15759a == 1)) {
                        StringBuilder u = C0843a.m460u("network interceptor ");
                        u.append(this.f15761c.get(this.f15762d - 1));
                        u.append(" must call proceed() exactly once");
                        throw new IllegalStateException(u.toString().toString());
                    }
                } else {
                    StringBuilder u2 = C0843a.m460u("network interceptor ");
                    u2.append(this.f15761c.get(this.f15762d - 1));
                    u2.append(" must retain the same host and port");
                    throw new IllegalStateException(u2.toString().toString());
                }
            }
            C7909g b = m14397b(this, this.f15762d + 1, (C7883c) null, e0Var, 0, 0, 0, 58);
            C7826a0 a0Var = this.f15761c.get(this.f15762d);
            C7850h0 a = a0Var.mo18360a(b);
            if (a != null) {
                if (this.f15763e != null) {
                    if (!(this.f15762d + 1 >= this.f15761c.size() || b.f15759a == 1)) {
                        throw new IllegalStateException(("network interceptor " + a0Var + " must call proceed() exactly once").toString());
                    }
                }
                if (a.f15555m != null) {
                    z = true;
                }
                if (z) {
                    return a;
                }
                throw new IllegalStateException(("interceptor " + a0Var + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + a0Var + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
