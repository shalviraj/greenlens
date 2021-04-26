package p416l.p417a;

import kotlin.Metadata;
import p298d.C6777r;
import p298d.p337v.C6824d;
import p416l.p417a.p419u1.C7775e;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00078\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, mo24462d2 = {"Ll/a/i;", "Ll/a/z0;", "", "cause", "Ld/r;", "m", "(Ljava/lang/Throwable;)V", "Ll/a/g;", "k", "Ll/a/g;", "child", "<init>", "(Ll/a/g;)V", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: l.a.i */
public final class C7727i extends C7824z0 {

    /* renamed from: k */
    public final C7721g<?> f15275k;

    public C7727i(C7721g<?> gVar) {
        this.f15275k = gVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo25355m((Throwable) obj);
        return C6777r.f13694a;
    }

    /* renamed from: m */
    public void mo25355m(Throwable th) {
        C7721g<?> gVar = this.f15275k;
        Throwable p = gVar.mo25353p(mo25321n());
        boolean z = false;
        if (gVar.f15271i == 2) {
            C6824d<T> dVar = gVar.f15270k;
            if (!(dVar instanceof C7775e)) {
                dVar = null;
            }
            C7775e eVar = (C7775e) dVar;
            if (eVar != null) {
                z = eVar.mo25441l(p);
            }
        }
        if (!z) {
            gVar.mo25376l(p);
            gVar.mo25378n();
        }
    }
}
