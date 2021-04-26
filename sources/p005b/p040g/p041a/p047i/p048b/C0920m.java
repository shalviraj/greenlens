package p005b.p040g.p041a.p047i.p048b;

import androidx.core.app.NotificationCompat;
import com.amplitude.api.AmplitudeClient;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p005b.p040g.p041a.p049j.C0922b;
import p005b.p096l.p224e.C4470o;
import p005b.p096l.p224e.C4471p;
import p005b.p096l.p224e.C4472q;
import p005b.p096l.p224e.C4474s;
import p005b.p096l.p224e.C4475t;
import p005b.p096l.p224e.C4476u;
import p005b.p096l.p224e.p226e0.p228z.C4409m;

/* renamed from: b.g.a.i.b.m */
public class C0920m implements C4471p<C0922b> {
    /* renamed from: a */
    public Object mo10724a(C4472q qVar, Type type, C4470o oVar) {
        C4472q qVar2 = qVar;
        Class<String> cls = String.class;
        Objects.requireNonNull(qVar);
        if (!(qVar2 instanceof C4475t) || (qVar2 instanceof C4474s) || ((AbstractCollection) qVar.mo16136e().entrySet()).isEmpty()) {
            throw new C4476u("user profile json is not a valid json object");
        }
        C4475t e = qVar.mo16136e();
        C4409m.C4411b bVar = (C4409m.C4411b) oVar;
        String str = (String) bVar.mo16085a(e.f8319a.remove(AmplitudeClient.USER_ID_KEY), cls);
        String str2 = (String) bVar.mo16085a(e.f8319a.remove("name"), cls);
        String str3 = (String) bVar.mo16085a(e.f8319a.remove("nickname"), cls);
        String str4 = (String) bVar.mo16085a(e.f8319a.remove("picture"), cls);
        String str5 = (String) bVar.mo16085a(e.f8319a.remove(NotificationCompat.CATEGORY_EMAIL), cls);
        String str6 = (String) bVar.mo16085a(e.f8319a.remove("given_name"), cls);
        String str7 = (String) bVar.mo16085a(e.f8319a.remove("family_name"), cls);
        Boolean valueOf = Boolean.valueOf(e.mo16145u("email_verified") ? ((Boolean) bVar.mo16085a(e.f8319a.remove("email_verified"), Boolean.class)).booleanValue() : false);
        Type type2 = new C0918k(this).f8250b;
        Type type3 = new C0919l(this).f8250b;
        return new C0922b(str, str2, str3, str4, str5, valueOf.booleanValue(), str7, (Date) bVar.mo16085a(e.f8319a.remove("created_at"), Date.class), (List) bVar.mo16085a(e.f8319a.remove("identities"), type2), (Map) bVar.mo16085a(e, type3), (Map) bVar.mo16085a(e.f8319a.remove("user_metadata"), type3), (Map) bVar.mo16085a(e.f8319a.remove("app_metadata"), type3), str6);
    }
}
