package p005b.p032d.p033a;

import android.app.Dialog;
import android.view.View;
import com.andrefrsousa.superbottomsheet.CornerRadiusFrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Objects;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.d.a.e */
public final class C0840e extends BottomSheetBehavior.BottomSheetCallback {

    /* renamed from: a */
    public final /* synthetic */ C0841f f680a;

    public C0840e(C0841f fVar) {
        this.f680a = fVar;
    }

    public void onSlide(View view, float f) {
        float f2;
        C6888i.m12438e(view, "bottomSheet");
        C0841f fVar = this.f680a;
        Objects.requireNonNull(fVar);
        C6888i.m12438e(view, "bottomSheet");
        if (fVar.f691q) {
            int height = view.getHeight();
            View view2 = fVar.f681g;
            if (view2 == null) {
                C6888i.m12446m("sheetTouchOutsideContainer");
                throw null;
            } else if (height != view2.getHeight()) {
                fVar.f691q = false;
            } else if (Float.isNaN(f) || f <= ((float) 0)) {
                CornerRadiusFrameLayout cornerRadiusFrameLayout = fVar.f682h;
                if (cornerRadiusFrameLayout != null) {
                    cornerRadiusFrameLayout.setCornerRadius$lib_release(fVar.f686l);
                } else {
                    C6888i.m12446m("sheetContainer");
                    throw null;
                }
            } else if (fVar.f691q) {
                float f3 = fVar.f686l;
                float f4 = f3 - (f * f3);
                CornerRadiusFrameLayout cornerRadiusFrameLayout2 = fVar.f682h;
                if (cornerRadiusFrameLayout2 != null) {
                    cornerRadiusFrameLayout2.setCornerRadius$lib_release(f4);
                } else {
                    C6888i.m12446m("sheetContainer");
                    throw null;
                }
            }
        }
        C0841f fVar2 = this.f680a;
        Objects.requireNonNull(fVar2);
        C6888i.m12438e(view, "bottomSheet");
        if (fVar2.f692r) {
            int height2 = view.getHeight();
            View view3 = fVar2.f681g;
            if (view3 == null) {
                C6888i.m12446m("sheetTouchOutsideContainer");
                throw null;
            } else if (height2 != view3.getHeight()) {
                fVar2.f692r = false;
            } else {
                if (Float.isNaN(f) || f <= ((float) 0)) {
                    f2 = 1.0f;
                } else {
                    float f5 = (float) 1;
                    f2 = f5 - (f * f5);
                }
                fVar2.mo10679f(f2);
            }
        }
    }

    public void onStateChanged(View view, int i) {
        C6888i.m12438e(view, "bottomSheet");
        if (i == 5) {
            this.f680a.mo10679f(1.0f);
            Dialog dialog = this.f680a.getDialog();
            if (dialog != null) {
                dialog.cancel();
            }
        }
    }
}
