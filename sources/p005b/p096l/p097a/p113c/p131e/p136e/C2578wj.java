package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p124n.C1955a;
import p005b.p096l.p180d.p185o.C3857b;
import p005b.p096l.p180d.p185o.C3861d;

/* renamed from: b.l.a.c.e.e.wj */
public final class C2578wj implements C2553vi {

    /* renamed from: g */
    public final String f4409g;

    /* renamed from: h */
    public final String f4410h;
    @Nullable

    /* renamed from: i */
    public final String f4411i;

    static {
        new C1955a(C2578wj.class.getSimpleName(), new String[0]);
    }

    public C2578wj(C3861d dVar, @Nullable String str) {
        String str2 = dVar.f7107g;
        C0823f.m376j(str2);
        this.f4409g = str2;
        String str3 = dVar.f7109i;
        C0823f.m376j(str3);
        this.f4410h = str3;
        this.f4411i = str;
    }

    /* renamed from: a */
    public final String mo12411a() {
        C3857b bVar;
        String str = this.f4410h;
        int i = C3857b.f7099c;
        C0823f.m376j(str);
        String str2 = null;
        try {
            bVar = new C3857b(str);
        } catch (IllegalArgumentException unused) {
            bVar = null;
        }
        String str3 = bVar != null ? bVar.f7100a : null;
        if (bVar != null) {
            str2 = bVar.f7101b;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NotificationCompat.CATEGORY_EMAIL, this.f4409g);
        if (str3 != null) {
            jSONObject.put("oobCode", str3);
        }
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        String str4 = this.f4411i;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        return jSONObject.toString();
    }
}
