package p005b.p006a.p007a;

import com.appfoundry.previewer.model.Asset;
import p005b.p038f.p039a.C0849e;
import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p337v.C6824d;
import p298d.p337v.p339j.p340a.C6840e;
import p298d.p337v.p339j.p340a.C6844h;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p416l.p417a.C7821y;
import p441p.p442a.C8091a;

@C6840e(mo24177c = "com.appfoundry.previewer.BravoApp$Companion$cacheAssetsInsideLoadingPages$1$1$1$1$1", mo24178f = "BravoApp.kt", mo24179l = {}, mo24180m = "invokeSuspend")
/* renamed from: b.a.a.c */
public final class C0662c extends C6844h implements C6866p<C7821y, C6824d<? super C6777r>, Object> {

    /* renamed from: k */
    public final /* synthetic */ Asset f353k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0662c(Asset asset, C6824d dVar) {
        super(2, dVar);
        this.f353k = asset;
    }

    /* renamed from: b */
    public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
        C6888i.m12438e(dVar, "completion");
        return new C0662c(this.f353k, dVar);
    }

    /* renamed from: e */
    public final Object mo10326e(Object obj) {
        C5266a.m10018q4(obj);
        if (C6888i.m12434a(C0849e.m537q(this.f353k), Boolean.TRUE)) {
            C8091a.f16272d.mo26043a("ASSETCACHING: SUCCESS", new Object[0]);
            this.f353k.f10901g = true;
        } else {
            C8091a.f16272d.mo26043a("ASSETCACHING: Error caching asset: %s", this.f353k.f10896b);
        }
        return C6777r.f13694a;
    }

    public final Object invoke(Object obj, Object obj2) {
        C6824d dVar = (C6824d) obj2;
        C6888i.m12438e(dVar, "completion");
        Asset asset = this.f353k;
        dVar.getContext();
        C6777r rVar = C6777r.f13694a;
        C5266a.m10018q4(rVar);
        if (C6888i.m12434a(C0849e.m537q(asset), Boolean.TRUE)) {
            C8091a.f16272d.mo26043a("ASSETCACHING: SUCCESS", new Object[0]);
            asset.f10901g = true;
        } else {
            C8091a.f16272d.mo26043a("ASSETCACHING: Error caching asset: %s", asset.f10896b);
        }
        return rVar;
    }
}
