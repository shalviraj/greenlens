package p005b.p040g.p041a.p047i.p048b;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p005b.p040g.p041a.C0851b;
import p005b.p040g.p041a.p047i.C0907a;
import p005b.p096l.p224e.C4465k;
import p005b.p280p.p285b.C5245o;
import p005b.p280p.p285b.C5252r;

/* renamed from: b.g.a.i.b.i */
public class C0916i {

    /* renamed from: a */
    public final HashMap<String, String> f822a;

    public C0916i() {
        HashMap<String, String> hashMap = new HashMap<>();
        this.f822a = hashMap;
        String locale = Locale.getDefault().toString();
        hashMap.put("Accept-Language", locale.isEmpty() ? "en_US" : locale);
    }

    /* renamed from: a */
    public <T, U extends C0851b> C0907a<T, U> mo10751a(C5245o oVar, C5252r rVar, C4465k kVar, Class<T> cls, C0908a<U> aVar) {
        C0917j jVar = new C0917j(oVar, rVar, kVar, "POST", cls, aVar);
        mo10752b(jVar);
        return jVar;
    }

    /* renamed from: b */
    public final <T, U extends C0851b> void mo10752b(C0907a<T, U> aVar) {
        for (Map.Entry next : this.f822a.entrySet()) {
            ((C0910c) aVar).f813a.put((String) next.getKey(), (String) next.getValue());
        }
    }
}
