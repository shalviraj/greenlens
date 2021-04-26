package p005b.p032d.p033a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.andrefrsousa.superbottomsheet.CornerRadiusFrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p005b.p032d.p033a.p034g.C0842a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.d.a.c */
public final class C0835c extends AppCompatDialog {

    /* renamed from: g */
    public C0842a f670g;

    /* renamed from: h */
    public BottomSheetBehavior<FrameLayout> f671h;

    /* renamed from: i */
    public boolean f672i = true;

    /* renamed from: j */
    public boolean f673j = true;

    /* renamed from: k */
    public boolean f674k;

    /* renamed from: l */
    public final C0834b f675l = new C0834b(this);

    /* renamed from: b.d.a.c$a */
    public static final class C0836a implements View.OnClickListener {

        /* renamed from: g */
        public final /* synthetic */ C0835c f676g;

        public C0836a(C0835c cVar) {
            this.f676g = cVar;
        }

        public final void onClick(View view) {
            C0835c cVar = this.f676g;
            if (cVar.f672i && cVar.isShowing()) {
                C0835c cVar2 = this.f676g;
                if (!cVar2.f674k) {
                    if (C0833a.m420a(11)) {
                        cVar2.f673j = true;
                    } else {
                        TypedArray obtainStyledAttributes = cVar2.getContext().obtainStyledAttributes(new int[]{16843611});
                        C6888i.m12437d(obtainStyledAttributes, "context.obtainStyledAttr…ndowCloseOnTouchOutside))");
                        cVar2.f673j = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    }
                    cVar2.f674k = true;
                }
                if (cVar2.f673j) {
                    this.f676g.cancel();
                }
            }
        }
    }

    /* renamed from: b.d.a.c$b */
    public static final class C0837b extends AccessibilityDelegateCompat {

        /* renamed from: a */
        public final /* synthetic */ C0835c f677a;

        public C0837b(C0835c cVar) {
            this.f677a = cVar;
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            boolean z;
            C6888i.m12438e(view, "host");
            C6888i.m12438e(accessibilityNodeInfoCompat, "info");
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (this.f677a.f672i) {
                accessibilityNodeInfoCompat.addAction(1048576);
                z = true;
            } else {
                z = false;
            }
            accessibilityNodeInfoCompat.setDismissable(z);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            C6888i.m12438e(view, "host");
            C6888i.m12438e(bundle, "args");
            if (i == 1048576) {
                C0835c cVar = this.f677a;
                if (cVar.f672i) {
                    cVar.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    /* renamed from: b.d.a.c$c */
    public static final class C0838c implements View.OnTouchListener {

        /* renamed from: g */
        public static final C0838c f678g = new C0838c();

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public C0835c(Context context) {
        super(context, 0);
        supportRequestWindowFeature(1);
    }

    public C0835c(Context context, int i) {
        super(context, i);
        supportRequestWindowFeature(1);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (C0833a.m420a(21)) {
                window.addFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f671h;
        if (bottomSheetBehavior == null) {
            return;
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(4);
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = this.f671h;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.addBottomSheetCallback(this.f675l);
            } else {
                C6888i.m12446m("behavior");
                throw null;
            }
        } else {
            C6888i.m12446m("behavior");
            throw null;
        }
    }

    public void onStop() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f671h;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.removeBottomSheetCallback(this.f675l);
            super.onStop();
            return;
        }
        C6888i.m12446m("behavior");
        throw null;
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f672i != z) {
            this.f672i = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f671h;
            if (bottomSheetBehavior == null) {
                return;
            }
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            } else {
                C6888i.m12446m("behavior");
                throw null;
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f672i) {
            this.f672i = true;
        }
        this.f673j = z;
        this.f674k = true;
    }

    public void setContentView(@LayoutRes int i) {
        super.setContentView(wrapInBottomSheet(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view) {
        C6888i.m12438e(view, "view");
        super.setContentView(wrapInBottomSheet(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C6888i.m12438e(view, "view");
        super.setContentView(wrapInBottomSheet(0, view, layoutParams));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final View wrapInBottomSheet(int i, View view, ViewGroup.LayoutParams layoutParams) {
        View inflate = getLayoutInflater().inflate(R.layout.super_bottom_sheet_dialog, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) inflate;
        int i2 = R.id.coordinator;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate.findViewById(R.id.coordinator);
        if (coordinatorLayout != null) {
            i2 = R.id.super_bottom_sheet;
            CornerRadiusFrameLayout cornerRadiusFrameLayout = (CornerRadiusFrameLayout) inflate.findViewById(R.id.super_bottom_sheet);
            if (cornerRadiusFrameLayout != null) {
                i2 = R.id.touch_outside;
                View findViewById = inflate.findViewById(R.id.touch_outside);
                if (findViewById != null) {
                    C0842a aVar = new C0842a((FrameLayout) inflate, frameLayout, coordinatorLayout, cornerRadiusFrameLayout, findViewById);
                    C6888i.m12437d(aVar, "SuperBottomSheetDialogBi…g.inflate(layoutInflater)");
                    this.f670g = aVar;
                    if (i != 0 && view == null) {
                        LayoutInflater layoutInflater = getLayoutInflater();
                        C0842a aVar2 = this.f670g;
                        if (aVar2 != null) {
                            view = layoutInflater.inflate(i, aVar2.f695c, false);
                        } else {
                            C6888i.m12446m("binding");
                            throw null;
                        }
                    }
                    C0842a aVar3 = this.f670g;
                    if (aVar3 != null) {
                        BottomSheetBehavior<FrameLayout> from = BottomSheetBehavior.from(aVar3.f696d);
                        C6888i.m12437d(from, "BottomSheetBehavior.from(binding.superBottomSheet)");
                        this.f671h = from;
                        if (from != null) {
                            from.setHideable(this.f672i);
                            C0842a aVar4 = this.f670g;
                            if (layoutParams == null) {
                                if (aVar4 != null) {
                                    aVar4.f696d.addView(view);
                                } else {
                                    C6888i.m12446m("binding");
                                    throw null;
                                }
                            } else if (aVar4 != null) {
                                aVar4.f696d.addView(view, layoutParams);
                            } else {
                                C6888i.m12446m("binding");
                                throw null;
                            }
                            C0842a aVar5 = this.f670g;
                            if (aVar5 != null) {
                                aVar5.f697e.setOnClickListener(new C0836a(this));
                                C0842a aVar6 = this.f670g;
                                if (aVar6 != null) {
                                    ViewCompat.setAccessibilityDelegate(aVar6.f696d, new C0837b(this));
                                    C0842a aVar7 = this.f670g;
                                    if (aVar7 != null) {
                                        aVar7.f696d.setOnTouchListener(C0838c.f678g);
                                        C0842a aVar8 = this.f670g;
                                        if (aVar8 != null) {
                                            FrameLayout frameLayout2 = aVar8.f694b;
                                            C6888i.m12437d(frameLayout2, "binding.container");
                                            return frameLayout2;
                                        }
                                        C6888i.m12446m("binding");
                                        throw null;
                                    }
                                    C6888i.m12446m("binding");
                                    throw null;
                                }
                                C6888i.m12446m("binding");
                                throw null;
                            }
                            C6888i.m12446m("binding");
                            throw null;
                        }
                        C6888i.m12446m("behavior");
                        throw null;
                    }
                    C6888i.m12446m("binding");
                    throw null;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
