package p005b.p040g.p041a.p047i.p048b;

import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.Date;
import java.util.Objects;
import p005b.p040g.p041a.p049j.C0921a;
import p005b.p096l.p224e.C4470o;
import p005b.p096l.p224e.C4471p;
import p005b.p096l.p224e.C4472q;
import p005b.p096l.p224e.C4474s;
import p005b.p096l.p224e.C4475t;
import p005b.p096l.p224e.C4476u;
import p005b.p096l.p224e.p226e0.p228z.C4409m;

/* renamed from: b.g.a.i.b.d */
public class C0911d implements C4471p<C0921a> {
    /* renamed from: a */
    public Object mo10724a(C4472q qVar, Type type, C4470o oVar) {
        Class<String> cls = String.class;
        Objects.requireNonNull(qVar);
        if (!(qVar instanceof C4475t) || (qVar instanceof C4474s) || ((AbstractCollection) qVar.mo16136e().entrySet()).isEmpty()) {
            throw new C4476u("credentials json is not a valid json object");
        }
        C4475t e = qVar.mo16136e();
        C4409m.C4411b bVar = (C4409m.C4411b) oVar;
        String str = (String) bVar.mo16085a(e.f8319a.remove("id_token"), cls);
        String str2 = (String) bVar.mo16085a(e.f8319a.remove("access_token"), cls);
        String str3 = (String) bVar.mo16085a(e.f8319a.remove("token_type"), cls);
        String str4 = (String) bVar.mo16085a(e.f8319a.remove("refresh_token"), cls);
        Long l = (Long) bVar.mo16085a(e.f8319a.remove("expires_in"), Long.class);
        String str5 = (String) bVar.mo16085a(e.f8319a.remove("scope"), cls);
        Date date = (Date) bVar.mo16085a(e.f8319a.remove("expires_at"), Date.class);
        if (date == null && l != null) {
            date = new Date((l.longValue() * 1000) + System.currentTimeMillis());
        }
        return new C0921a(str, str2, str3, str4, date, str5);
    }
}
