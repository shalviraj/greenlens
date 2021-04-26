package p421m;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6890k;
import p421m.p422m0.p433m.C7999c;

/* renamed from: m.i */
public final class C7852i extends C6890k implements C6851a<List<? extends X509Certificate>> {

    /* renamed from: g */
    public final /* synthetic */ C7847h f15575g;

    /* renamed from: h */
    public final /* synthetic */ List f15576h;

    /* renamed from: i */
    public final /* synthetic */ String f15577i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7852i(C7847h hVar, List list, String str) {
        super(0);
        this.f15575g = hVar;
        this.f15576h = list;
        this.f15577i = str;
    }

    public Object invoke() {
        List<Certificate> list;
        C7999c cVar = this.f15575g.f15548b;
        if (cVar == null || (list = cVar.mo25782a(this.f15576h, this.f15577i)) == null) {
            list = this.f15576h;
        }
        ArrayList arrayList = new ArrayList(C5266a.m9892V(list, 10));
        for (Certificate certificate : list) {
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
