package p005b.p006a.p007a.p019j;

import android.view.View;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.j.i */
public final class C0778i {

    /* renamed from: a */
    public final String f547a;

    /* renamed from: b */
    public final View f548b;

    public C0778i(String str, View view) {
        C6888i.m12438e(view, "view");
        this.f547a = str;
        this.f548b = view;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0778i)) {
            return false;
        }
        C0778i iVar = (C0778i) obj;
        return C6888i.m12434a(this.f547a, iVar.f547a) && C6888i.m12434a(this.f548b, iVar.f548b);
    }

    public int hashCode() {
        String str = this.f547a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        View view = this.f548b;
        if (view != null) {
            i = view.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("PushButtonView(id=");
        u.append(this.f547a);
        u.append(", view=");
        u.append(this.f548b);
        u.append(")");
        return u.toString();
    }
}
