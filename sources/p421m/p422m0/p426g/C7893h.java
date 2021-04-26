package p421m.p422m0.p426g;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p421m.C8020x;

/* renamed from: m.m0.g.h */
public final class C7893h extends C6890k implements C6851a<List<? extends X509Certificate>> {

    /* renamed from: g */
    public final /* synthetic */ C7894i f15713g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7893h(C7894i iVar) {
        super(0);
        this.f15713g = iVar;
    }

    public Object invoke() {
        C8020x xVar = this.f15713g.f15716d;
        C6888i.m12436c(xVar);
        List<Certificate> c = xVar.mo25832c();
        ArrayList arrayList = new ArrayList(C5266a.m9892V(c, 10));
        for (Certificate certificate : c) {
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
