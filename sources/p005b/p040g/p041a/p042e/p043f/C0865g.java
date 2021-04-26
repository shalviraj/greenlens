package p005b.p040g.p041a.p042e.p043f;

import java.util.Objects;
import p005b.p040g.p041a.C0851b;
import p005b.p040g.p041a.p042e.C0856c;
import p005b.p040g.p041a.p044f.C0869a;
import p005b.p040g.p041a.p049j.C0921a;

/* renamed from: b.g.a.e.f.g */
public class C0865g implements Object<C0921a> {

    /* renamed from: a */
    public final /* synthetic */ C0921a f727a;

    /* renamed from: b */
    public final /* synthetic */ C0869a f728b;

    /* renamed from: c */
    public final /* synthetic */ C0866h f729c;

    public C0865g(C0866h hVar, C0921a aVar, C0869a aVar2) {
        this.f729c = hVar;
        this.f727a = aVar;
        this.f728b = aVar2;
    }

    /* renamed from: a */
    public void mo10700a(Object obj) {
        C0921a aVar = (C0921a) obj;
        C0921a aVar2 = new C0921a(aVar.f826c, aVar.f824a, aVar.f825b, this.f727a.f827d, aVar.f829f, aVar.f828e);
        this.f729c.mo10704c(aVar2);
        this.f728b.mo10712a(aVar2);
        Objects.requireNonNull(this.f729c);
    }

    /* renamed from: b */
    public void mo10701b(C0851b bVar) {
        this.f728b.mo10713b(new C0860b("An error occurred while trying to use the Refresh Token to renew the Credentials.", (C0856c) bVar));
        Objects.requireNonNull(this.f729c);
    }
}
