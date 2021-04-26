package p005b.p006a.p007a.p017h;

import android.widget.TextView;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.o */
public final class C0719o {

    /* renamed from: a */
    public final String f423a;

    /* renamed from: b */
    public final String f424b;

    /* renamed from: c */
    public TextView f425c;

    public C0719o(String str, String str2, TextView textView) {
        C6888i.m12438e(textView, "textView");
        this.f423a = str;
        this.f424b = str2;
        this.f425c = textView;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0719o)) {
            return false;
        }
        C0719o oVar = (C0719o) obj;
        return C6888i.m12434a(this.f423a, oVar.f423a) && C6888i.m12434a(this.f424b, oVar.f424b) && C6888i.m12434a(this.f425c, oVar.f425c);
    }

    public int hashCode() {
        String str = this.f423a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f424b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        TextView textView = this.f425c;
        if (textView != null) {
            i = textView.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("InputFileEvent(pageId=");
        u.append(this.f423a);
        u.append(", componentId=");
        u.append(this.f424b);
        u.append(", textView=");
        u.append(this.f425c);
        u.append(")");
        return u.toString();
    }
}
