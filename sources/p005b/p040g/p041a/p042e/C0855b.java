package p005b.p040g.p041a.p042e;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p040g.p041a.C0850a;
import p005b.p040g.p041a.p047i.p048b.C0908a;
import p005b.p040g.p041a.p047i.p048b.C0916i;
import p005b.p040g.p041a.p050k.C0926c;
import p005b.p096l.p224e.C4465k;
import p005b.p280p.p285b.C5252r;
import p005b.p280p.p285b.C5254s;
import p005b.p280p.p285b.p286a0.C5134i;

/* renamed from: b.g.a.e.b */
public class C0855b {

    /* renamed from: a */
    public final C0850a f711a;

    /* renamed from: b */
    public final C5252r f712b;

    /* renamed from: c */
    public final C4465k f713c;

    /* renamed from: d */
    public final C0916i f714d;

    /* renamed from: e */
    public final C0908a<C0856c> f715e;

    public C0855b(@NonNull C0850a aVar) {
        C0916i iVar = new C0916i();
        C4465k a = C0823f.m358a();
        this.f711a = aVar;
        Objects.requireNonNull(aVar);
        C5252r rVar = new C5252r();
        C5254s sVar = C5254s.HTTP_1_1;
        List h = C5134i.m9463h(Arrays.asList(new C5254s[]{sVar, C5254s.SPDY_3}));
        if (!h.contains(sVar)) {
            throw new IllegalArgumentException("protocols doesn't contain http/1.1: " + h);
        } else if (h.contains(C5254s.HTTP_1_0)) {
            throw new IllegalArgumentException("protocols must not contain http/1.0: " + h);
        } else if (!h.contains((Object) null)) {
            rVar.f10456j = C5134i.m9463h(h);
            this.f712b = rVar;
            this.f713c = a;
            this.f714d = iVar;
            this.f715e = new C0908a();
            C0926c cVar = aVar.f709c;
            if (cVar != null) {
                iVar.f822a.put("Auth0-Client", cVar.f836b);
            }
        } else {
            throw new IllegalArgumentException("protocols must not contain null");
        }
    }
}
