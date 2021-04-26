package p005b.p006a.p007a.p019j;

import com.appfoundry.previewer.model.Actions;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.j.c */
public final class C0772c {

    /* renamed from: a */
    public final String f518a;

    /* renamed from: b */
    public final String f519b;

    /* renamed from: c */
    public final String f520c;

    /* renamed from: d */
    public final Actions f521d;

    /* renamed from: e */
    public final String f522e;

    /* renamed from: f */
    public final List<String> f523f;

    /* renamed from: g */
    public final String f524g;

    public C0772c(String str, String str2, String str3, Actions actions, String str4, List<String> list, String str5) {
        this.f518a = str;
        this.f519b = str2;
        this.f520c = str3;
        this.f521d = actions;
        this.f522e = str4;
        this.f523f = list;
        this.f524g = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0772c)) {
            return false;
        }
        C0772c cVar = (C0772c) obj;
        return C6888i.m12434a(this.f518a, cVar.f518a) && C6888i.m12434a(this.f519b, cVar.f519b) && C6888i.m12434a(this.f520c, cVar.f520c) && C6888i.m12434a(this.f521d, cVar.f521d) && C6888i.m12434a(this.f522e, cVar.f522e) && C6888i.m12434a(this.f523f, cVar.f523f) && C6888i.m12434a(this.f524g, cVar.f524g);
    }

    public int hashCode() {
        String str = this.f518a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f519b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f520c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Actions actions = this.f521d;
        int hashCode4 = (hashCode3 + (actions != null ? actions.hashCode() : 0)) * 31;
        String str4 = this.f522e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<String> list = this.f523f;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        String str5 = this.f524g;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("ClickEventParams(pageId=");
        u.append(this.f518a);
        u.append(", containerId=");
        u.append(this.f519b);
        u.append(", href=");
        u.append(this.f520c);
        u.append(", actions=");
        u.append(this.f521d);
        u.append(", hrefRemote=");
        u.append(this.f522e);
        u.append(", tags=");
        u.append(this.f523f);
        u.append(", componentId=");
        return C0843a.m455p(u, this.f524g, ")");
    }
}
