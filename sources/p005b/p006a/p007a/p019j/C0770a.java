package p005b.p006a.p007a.p019j;

import android.view.View;
import com.segment.analytics.AnalyticsContext;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.j.a */
public final class C0770a {

    /* renamed from: a */
    public final String f510a;

    /* renamed from: b */
    public final String f511b;

    /* renamed from: c */
    public final String f512c;

    /* renamed from: d */
    public View f513d;

    public C0770a(String str, String str2, String str3, View view) {
        C6888i.m12438e(str, AnalyticsContext.Device.DEVICE_ID_KEY);
        C6888i.m12438e(str2, "containerId");
        C6888i.m12438e(str3, "type");
        C6888i.m12438e(view, "view");
        this.f510a = str;
        this.f511b = str2;
        this.f512c = str3;
        this.f513d = view;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0770a)) {
            return false;
        }
        C0770a aVar = (C0770a) obj;
        return C6888i.m12434a(this.f510a, aVar.f510a) && C6888i.m12434a(this.f511b, aVar.f511b) && C6888i.m12434a(this.f512c, aVar.f512c) && C6888i.m12434a(this.f513d, aVar.f513d);
    }

    public int hashCode() {
        String str = this.f510a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f511b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f512c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        View view = this.f513d;
        if (view != null) {
            i = view.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("AudioComponent(id=");
        u.append(this.f510a);
        u.append(", containerId=");
        u.append(this.f511b);
        u.append(", type=");
        u.append(this.f512c);
        u.append(", view=");
        u.append(this.f513d);
        u.append(")");
        return u.toString();
    }
}
