package p005b.p006a.p007a.p018i;

import android.view.View;
import android.widget.ImageView;
import com.appfoundry.previewer.model.Style;
import p005b.p006a.p007a.p017h.C0721p;
import p437o.p438a.p439a.C8068c;

/* renamed from: b.a.a.i.j */
public final class C0751j implements View.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ ImageView f474g;

    /* renamed from: h */
    public final /* synthetic */ String f475h;

    /* renamed from: i */
    public final /* synthetic */ String f476i;

    /* renamed from: j */
    public final /* synthetic */ Style f477j;

    /* renamed from: k */
    public final /* synthetic */ int f478k;

    /* renamed from: l */
    public final /* synthetic */ int f479l;

    /* renamed from: m */
    public final /* synthetic */ int f480m;

    public C0751j(ImageView imageView, String str, String str2, Style style, int i, int i2, int i3) {
        this.f474g = imageView;
        this.f475h = str;
        this.f476i = str2;
        this.f477j = style;
        this.f478k = i;
        this.f479l = i2;
        this.f480m = i3;
    }

    public final void onClick(View view) {
        C8068c.m14948b().mo26008g(new C0721p(this.f475h, this.f476i, this.f474g, this.f477j, this.f478k, this.f479l, this.f480m));
    }
}
