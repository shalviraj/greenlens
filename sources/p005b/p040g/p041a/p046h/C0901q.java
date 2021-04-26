package p005b.p040g.p041a.p046h;

import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.util.Map;
import p005b.p040g.p041a.C0851b;
import p005b.p040g.p041a.p042e.C0856c;
import p005b.p040g.p041a.p044f.C0869a;

/* renamed from: b.g.a.h.q */
public final class C0901q implements Object<Map<String, PublicKey>> {

    /* renamed from: a */
    public final /* synthetic */ String f807a;

    /* renamed from: b */
    public final /* synthetic */ C0869a f808b;

    public C0901q(String str, C0869a aVar) {
        this.f807a = str;
        this.f808b = aVar;
    }

    /* renamed from: a */
    public void mo10746a(Object obj) {
        try {
            this.f808b.mo10712a(new C0881c((PublicKey) ((Map) obj).get(this.f807a)));
        } catch (InvalidKeyException unused) {
            this.f808b.mo10713b(new C0904t(String.format("Could not find a public key for kid \"%s\"", new Object[]{this.f807a})));
        }
    }

    /* renamed from: b */
    public void mo10747b(C0851b bVar) {
        C0856c cVar = (C0856c) bVar;
        this.f808b.mo10713b(new C0904t(String.format("Could not find a public key for kid \"%s\"", new Object[]{this.f807a})));
    }
}
