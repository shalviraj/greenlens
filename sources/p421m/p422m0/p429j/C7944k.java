package p421m.p422m0.p429j;

import p421m.p422m0.p425f.C7873a;

/* renamed from: m.m0.j.k */
public final class C7944k extends C7873a {

    /* renamed from: e */
    public final /* synthetic */ C7929f f15917e;

    /* renamed from: f */
    public final /* synthetic */ int f15918f;

    /* renamed from: g */
    public final /* synthetic */ C7922b f15919g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7944k(String str, boolean z, String str2, boolean z2, C7929f fVar, int i, C7922b bVar) {
        super(str2, z2);
        this.f15917e = fVar;
        this.f15918f = i;
        this.f15919g = bVar;
    }

    /* renamed from: a */
    public long mo25587a() {
        this.f15917e.f15865r.mo25747c(this.f15918f, this.f15919g);
        synchronized (this.f15917e) {
            this.f15917e.f15853H.remove(Integer.valueOf(this.f15918f));
        }
        return -1;
    }
}
