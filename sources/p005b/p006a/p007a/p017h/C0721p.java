package p005b.p006a.p007a.p017h;

import android.widget.ImageView;
import com.appfoundry.previewer.model.Style;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.p */
public final class C0721p {

    /* renamed from: a */
    public final String f427a;

    /* renamed from: b */
    public final String f428b;

    /* renamed from: c */
    public ImageView f429c;

    /* renamed from: d */
    public final Style f430d;

    /* renamed from: e */
    public final int f431e;

    /* renamed from: f */
    public final int f432f;

    /* renamed from: g */
    public final int f433g;

    public C0721p(String str, String str2, ImageView imageView, Style style, int i, int i2, int i3) {
        C6888i.m12438e(imageView, "imageView");
        this.f427a = str;
        this.f428b = str2;
        this.f429c = imageView;
        this.f430d = style;
        this.f431e = i;
        this.f432f = i2;
        this.f433g = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0721p)) {
            return false;
        }
        C0721p pVar = (C0721p) obj;
        return C6888i.m12434a(this.f427a, pVar.f427a) && C6888i.m12434a(this.f428b, pVar.f428b) && C6888i.m12434a(this.f429c, pVar.f429c) && C6888i.m12434a(this.f430d, pVar.f430d) && this.f431e == pVar.f431e && this.f432f == pVar.f432f && this.f433g == pVar.f433g;
    }

    public int hashCode() {
        String str = this.f427a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f428b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ImageView imageView = this.f429c;
        int hashCode3 = (hashCode2 + (imageView != null ? imageView.hashCode() : 0)) * 31;
        Style style = this.f430d;
        if (style != null) {
            i = style.hashCode();
        }
        return Integer.hashCode(this.f433g) + ((Integer.hashCode(this.f432f) + ((Integer.hashCode(this.f431e) + ((hashCode3 + i) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("InputImageEvent(pageId=");
        u.append(this.f427a);
        u.append(", componentId=");
        u.append(this.f428b);
        u.append(", imageView=");
        u.append(this.f429c);
        u.append(", style=");
        u.append(this.f430d);
        u.append(", width=");
        u.append(this.f431e);
        u.append(", height=");
        u.append(this.f432f);
        u.append(", extraHeight=");
        return C0843a.m453n(u, this.f433g, ")");
    }
}
