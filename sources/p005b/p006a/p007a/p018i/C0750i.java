package p005b.p006a.p007a.p018i;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.model.Container;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.i.i */
public final class C0750i implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ FrameLayout f471a;

    /* renamed from: b */
    public final /* synthetic */ Toolbar f472b;

    /* renamed from: c */
    public final /* synthetic */ Container f473c;

    public C0750i(FrameLayout frameLayout, Toolbar toolbar, Container container) {
        this.f471a = frameLayout;
        this.f472b = toolbar;
        this.f473c = container;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (C6888i.m12434a(view.getTag(R.id.notch_handled), Boolean.FALSE)) {
            BravoApp.C5403b bVar = BravoApp.f10730N;
            BravoApp bravoApp = BravoApp.f10731g;
        }
    }
}
