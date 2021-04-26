package p005b.p032d.p033a;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.d.a.b */
public final class C0834b extends BottomSheetBehavior.BottomSheetCallback {

    /* renamed from: a */
    public final /* synthetic */ C0835c f669a;

    public C0834b(C0835c cVar) {
        this.f669a = cVar;
    }

    public void onSlide(View view, float f) {
        C6888i.m12438e(view, "bottomSheet");
    }

    public void onStateChanged(View view, int i) {
        C6888i.m12438e(view, "bottomSheet");
        if (i == 5) {
            this.f669a.cancel();
        }
    }
}
