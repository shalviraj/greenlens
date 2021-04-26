package p005b.p032d.p033a;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.UiThread;
import androidx.core.content.ContextCompat;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.andrefrsousa.superbottomsheet.CornerRadiusFrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import p005b.p025b.p026a.C0826c;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.d.a.f */
public abstract class C0841f extends BottomSheetDialogFragment {

    /* renamed from: g */
    public View f681g;

    /* renamed from: h */
    public CornerRadiusFrameLayout f682h;

    /* renamed from: i */
    public BottomSheetBehavior<?> f683i;

    /* renamed from: j */
    public BottomSheetBehavior.BottomSheetCallback f684j;

    /* renamed from: k */
    public float f685k;

    /* renamed from: l */
    public float f686l;

    /* renamed from: m */
    public int f687m;

    /* renamed from: n */
    public boolean f688n;

    /* renamed from: o */
    public boolean f689o = true;

    /* renamed from: p */
    public boolean f690p = true;

    /* renamed from: q */
    public boolean f691q = true;

    /* renamed from: r */
    public boolean f692r;

    @IntRange(from = -2, mo119to = -1)
    /* renamed from: c */
    public abstract int mo10676c();

    /* renamed from: d */
    public abstract int mo10677d();

    /* renamed from: e */
    public final CornerRadiusFrameLayout mo10678e() {
        CornerRadiusFrameLayout cornerRadiusFrameLayout = this.f682h;
        if (cornerRadiusFrameLayout != null) {
            return cornerRadiusFrameLayout;
        }
        C6888i.m12446m("sheetContainer");
        throw null;
    }

    @UiThread
    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public final void mo10679f(float f) {
        Window window;
        if (this.f692r) {
            int i = this.f687m;
            float f2 = (float) 255;
            int argb = Color.argb((int) (f2 - (f * f2)), Color.red(i), Color.green(i), Color.blue(i));
            Dialog dialog = getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setStatusBarColor(argb);
            }
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        boolean z;
        Context context = getContext();
        C6888i.m12436c(context);
        C6888i.m12437d(context, "context!!");
        int b = C0826c.m411b(context, R.attr.superBottomSheet_animateStatusBar);
        if (b != -1) {
            z = getResources().getBoolean(b);
        } else {
            Context context2 = getContext();
            C6888i.m12436c(context2);
            C6888i.m12437d(context2, "context!!");
            z = context2.getResources().getBoolean(R.bool.super_bottom_sheet_animate_status_bar);
        }
        return z ? new C0835c(getContext(), R.style.superBottomSheetDialog) : new C0835c(getContext());
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onPause() {
        BottomSheetBehavior<?> bottomSheetBehavior = this.f683i;
        if (bottomSheetBehavior != null) {
            BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = this.f684j;
            if (bottomSheetCallback != null) {
                bottomSheetBehavior.removeBottomSheetCallback(bottomSheetCallback);
                super.onPause();
                return;
            }
            C6888i.m12446m("callback");
            throw null;
        }
        C6888i.m12446m("behavior");
        throw null;
    }

    public void onResume() {
        super.onResume();
        BottomSheetBehavior<?> bottomSheetBehavior = this.f683i;
        if (bottomSheetBehavior != null) {
            BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = this.f684j;
            if (bottomSheetCallback != null) {
                bottomSheetBehavior.addBottomSheetCallback(bottomSheetCallback);
            } else {
                C6888i.m12446m("callback");
                throw null;
            }
        } else {
            C6888i.m12446m("behavior");
            throw null;
        }
    }

    @CallSuper
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        CornerRadiusFrameLayout cornerRadiusFrameLayout = dialog != null ? (CornerRadiusFrameLayout) dialog.findViewById(R.id.super_bottom_sheet) : null;
        C6888i.m12436c(cornerRadiusFrameLayout);
        this.f682h = cornerRadiusFrameLayout;
        Dialog dialog2 = getDialog();
        View findViewById = dialog2 != null ? dialog2.findViewById(R.id.touch_outside) : null;
        C6888i.m12436c(findViewById);
        this.f681g = findViewById;
        CornerRadiusFrameLayout cornerRadiusFrameLayout2 = this.f682h;
        if (cornerRadiusFrameLayout2 != null) {
            Context context = getContext();
            C6888i.m12436c(context);
            C6888i.m12437d(context, "context!!");
            int b = C0826c.m411b(context, R.attr.superBottomSheet_backgroundColor);
            int i = -1;
            if (b != -1) {
                Context context2 = getContext();
                C6888i.m12436c(context2);
                i = ContextCompat.getColor(context2, b);
            }
            cornerRadiusFrameLayout2.setBackgroundColor(i);
            CornerRadiusFrameLayout cornerRadiusFrameLayout3 = this.f682h;
            if (cornerRadiusFrameLayout3 != null) {
                cornerRadiusFrameLayout3.setCornerRadius$lib_release(this.f686l);
                CornerRadiusFrameLayout cornerRadiusFrameLayout4 = this.f682h;
                if (cornerRadiusFrameLayout4 != null) {
                    BottomSheetBehavior<?> from = BottomSheetBehavior.from(cornerRadiusFrameLayout4);
                    C6888i.m12437d(from, "BottomSheetBehavior.from(sheetContainer)");
                    this.f683i = from;
                    if (C0826c.m414e(getContext()) && !C0826c.m412c(getContext())) {
                        CornerRadiusFrameLayout cornerRadiusFrameLayout5 = this.f682h;
                        if (cornerRadiusFrameLayout5 != null) {
                            ViewGroup.LayoutParams layoutParams = cornerRadiusFrameLayout5.getLayoutParams();
                            layoutParams.width = getResources().getDimensionPixelSize(R.dimen.super_bottom_sheet_width);
                            layoutParams.height = mo10676c();
                            cornerRadiusFrameLayout5.setLayoutParams(layoutParams);
                        } else {
                            C6888i.m12446m("sheetContainer");
                            throw null;
                        }
                    }
                    if (this.f688n) {
                        CornerRadiusFrameLayout cornerRadiusFrameLayout6 = this.f682h;
                        if (cornerRadiusFrameLayout6 != null) {
                            ViewGroup.LayoutParams layoutParams2 = cornerRadiusFrameLayout6.getLayoutParams();
                            layoutParams2.height = mo10676c();
                            cornerRadiusFrameLayout6.setLayoutParams(layoutParams2);
                        } else {
                            C6888i.m12446m("sheetContainer");
                            throw null;
                        }
                    } else {
                        BottomSheetBehavior<?> bottomSheetBehavior = this.f683i;
                        if (bottomSheetBehavior != null) {
                            bottomSheetBehavior.setPeekHeight(mo10677d());
                            CornerRadiusFrameLayout cornerRadiusFrameLayout7 = this.f682h;
                            if (cornerRadiusFrameLayout7 != null) {
                                BottomSheetBehavior<?> bottomSheetBehavior2 = this.f683i;
                                if (bottomSheetBehavior2 != null) {
                                    cornerRadiusFrameLayout7.setMinimumHeight(bottomSheetBehavior2.getPeekHeight());
                                } else {
                                    C6888i.m12446m("behavior");
                                    throw null;
                                }
                            } else {
                                C6888i.m12446m("sheetContainer");
                                throw null;
                            }
                        } else {
                            C6888i.m12446m("behavior");
                            throw null;
                        }
                    }
                    boolean z = (!C0826c.m414e(getContext()) && !C0826c.m412c(getContext())) || this.f688n;
                    BottomSheetBehavior<?> bottomSheetBehavior3 = this.f683i;
                    if (bottomSheetBehavior3 != null) {
                        bottomSheetBehavior3.setSkipCollapsed(z);
                        if (z) {
                            BottomSheetBehavior<?> bottomSheetBehavior4 = this.f683i;
                            if (bottomSheetBehavior4 != null) {
                                bottomSheetBehavior4.setState(3);
                                mo10679f(1.0f);
                                CornerRadiusFrameLayout cornerRadiusFrameLayout8 = this.f682h;
                                if (cornerRadiusFrameLayout8 != null) {
                                    cornerRadiusFrameLayout8.getViewTreeObserver().addOnPreDrawListener(new C0839d(this));
                                } else {
                                    C6888i.m12446m("sheetContainer");
                                    throw null;
                                }
                            } else {
                                C6888i.m12446m("behavior");
                                throw null;
                            }
                        }
                        this.f684j = new C0840e(this);
                        return;
                    }
                    C6888i.m12446m("behavior");
                    throw null;
                }
                C6888i.m12446m("sheetContainer");
                throw null;
            }
            C6888i.m12446m("sheetContainer");
            throw null;
        }
        C6888i.m12446m("sheetContainer");
        throw null;
    }
}
