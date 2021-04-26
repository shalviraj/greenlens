package p298d.p337v.p338i;

import java.util.Objects;
import p005b.p291q.p292a.C5266a;
import p298d.p337v.C6824d;
import p298d.p337v.p339j.p340a.C6843g;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6905z;

/* renamed from: d.v.i.b */
public final class C6834b extends C6843g {

    /* renamed from: h */
    public int f13756h;

    /* renamed from: i */
    public final /* synthetic */ C6824d f13757i;

    /* renamed from: j */
    public final /* synthetic */ C6866p f13758j;

    /* renamed from: k */
    public final /* synthetic */ Object f13759k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6834b(C6824d dVar, C6824d dVar2, C6866p pVar, Object obj) {
        super(dVar2);
        this.f13757i = dVar;
        this.f13758j = pVar;
        this.f13759k = obj;
    }

    /* renamed from: e */
    public Object mo10326e(Object obj) {
        int i = this.f13756h;
        if (i == 0) {
            this.f13756h = 1;
            C5266a.m10018q4(obj);
            C6866p pVar = this.f13758j;
            Objects.requireNonNull(pVar, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            C6905z.m12473b(pVar, 2);
            return pVar.invoke(this.f13759k, this);
        } else if (i == 1) {
            this.f13756h = 2;
            C5266a.m10018q4(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
