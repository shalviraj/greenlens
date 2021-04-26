package p298d.p337v.p338i;

import java.util.Objects;
import p005b.p291q.p292a.C5266a;
import p298d.p337v.C6824d;
import p298d.p337v.C6827f;
import p298d.p337v.p339j.p340a.C6838c;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6905z;

/* renamed from: d.v.i.c */
public final class C6835c extends C6838c {

    /* renamed from: j */
    public int f13760j;

    /* renamed from: k */
    public final /* synthetic */ C6824d f13761k;

    /* renamed from: l */
    public final /* synthetic */ C6827f f13762l;

    /* renamed from: m */
    public final /* synthetic */ C6866p f13763m;

    /* renamed from: n */
    public final /* synthetic */ Object f13764n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6835c(C6824d dVar, C6827f fVar, C6824d dVar2, C6827f fVar2, C6866p pVar, Object obj) {
        super(dVar2, fVar2);
        this.f13761k = dVar;
        this.f13762l = fVar;
        this.f13763m = pVar;
        this.f13764n = obj;
    }

    /* renamed from: e */
    public Object mo10326e(Object obj) {
        int i = this.f13760j;
        if (i == 0) {
            this.f13760j = 1;
            C5266a.m10018q4(obj);
            C6866p pVar = this.f13763m;
            Objects.requireNonNull(pVar, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            C6905z.m12473b(pVar, 2);
            return pVar.invoke(this.f13764n, this);
        } else if (i == 1) {
            this.f13760j = 2;
            C5266a.m10018q4(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
