package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C5480R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.shape.MaterialShapeDrawable;

public class BottomSheetDialog extends AppCompatDialog {
    /* access modifiers changed from: private */
    public BottomSheetBehavior<FrameLayout> behavior;
    /* access modifiers changed from: private */
    public FrameLayout bottomSheet;
    @NonNull
    private BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    public boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    private CoordinatorLayout coordinator;
    public boolean dismissWithAnimation;
    /* access modifiers changed from: private */
    public BottomSheetBehavior.BottomSheetCallback edgeToEdgeCallback;
    private boolean edgeToEdgeEnabled;

    public static class EdgeToEdgeCallback extends BottomSheetBehavior.BottomSheetCallback {
        private final WindowInsetsCompat insetsCompat;
        private final boolean lightBottomSheet;
        private final boolean lightStatusBar;

        private EdgeToEdgeCallback(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            int color;
            this.insetsCompat = windowInsetsCompat;
            boolean z = (view.getSystemUiVisibility() & 8192) != 0;
            this.lightStatusBar = z;
            MaterialShapeDrawable materialShapeDrawable = BottomSheetBehavior.from(view).getMaterialShapeDrawable();
            ColorStateList fillColor = materialShapeDrawable != null ? materialShapeDrawable.getFillColor() : ViewCompat.getBackgroundTintList(view);
            if (fillColor != null) {
                color = fillColor.getDefaultColor();
            } else if (view.getBackground() instanceof ColorDrawable) {
                color = ((ColorDrawable) view.getBackground()).getColor();
            } else {
                this.lightBottomSheet = z;
                return;
            }
            this.lightBottomSheet = MaterialColors.isColorLight(color);
        }

        private void setPaddingForPosition(View view) {
            int paddingLeft;
            int i;
            if (view.getTop() <= this.insetsCompat.getSystemWindowInsetTop()) {
                BottomSheetDialog.setLightStatusBar(view, this.lightBottomSheet);
                paddingLeft = view.getPaddingLeft();
                i = this.insetsCompat.getSystemWindowInsetTop() - view.getTop();
            } else if (view.getTop() != 0) {
                BottomSheetDialog.setLightStatusBar(view, this.lightStatusBar);
                paddingLeft = view.getPaddingLeft();
                i = 0;
            } else {
                return;
            }
            view.setPadding(paddingLeft, i, view.getPaddingRight(), view.getPaddingBottom());
        }

        public void onSlide(@NonNull View view, float f) {
            setPaddingForPosition(view);
        }

        public void onStateChanged(@NonNull View view, int i) {
            setPaddingForPosition(view);
        }
    }

    public BottomSheetDialog(@NonNull Context context) {
        this(context, 0);
    }

    public BottomSheetDialog(@NonNull Context context, @StyleRes int i) {
        super(context, getThemeResId(context, i));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new BottomSheetBehavior.BottomSheetCallback() {
            public void onSlide(@NonNull View view, float f) {
            }

            public void onStateChanged(@NonNull View view, int i) {
                if (i == 5) {
                    BottomSheetDialog.this.cancel();
                }
            }
        };
        supportRequestWindowFeature(1);
    }

    public BottomSheetDialog(@NonNull Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new BottomSheetBehavior.BottomSheetCallback() {
            public void onSlide(@NonNull View view, float f) {
            }

            public void onStateChanged(@NonNull View view, int i) {
                if (i == 5) {
                    BottomSheetDialog.this.cancel();
                }
            }
        };
        supportRequestWindowFeature(1);
        this.cancelable = z;
    }

    private FrameLayout ensureContainerAndBehavior() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C5480R.layout.design_bottom_sheet_dialog, (ViewGroup) null);
            this.container = frameLayout;
            this.coordinator = (CoordinatorLayout) frameLayout.findViewById(C5480R.C5483id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.container.findViewById(C5480R.C5483id.design_bottom_sheet);
            this.bottomSheet = frameLayout2;
            BottomSheetBehavior<FrameLayout> from = BottomSheetBehavior.from(frameLayout2);
            this.behavior = from;
            from.addBottomSheetCallback(this.bottomSheetCallback);
            this.behavior.setHideable(this.cancelable);
        }
        return this.container;
    }

    private static int getThemeResId(@NonNull Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(C5480R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : C5480R.style.Theme_Design_Light_BottomSheetDialog;
    }

    public static void setLightStatusBar(@NonNull View view, boolean z) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & -8193);
    }

    private View wrapInBottomSheet(int i, @Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.container.findViewById(C5480R.C5483id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this.bottomSheet, new OnApplyWindowInsetsListener() {
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                if (BottomSheetDialog.this.edgeToEdgeCallback != null) {
                    BottomSheetDialog.this.behavior.removeBottomSheetCallback(BottomSheetDialog.this.edgeToEdgeCallback);
                }
                if (windowInsetsCompat != null) {
                    BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                    BottomSheetBehavior.BottomSheetCallback unused = bottomSheetDialog.edgeToEdgeCallback = new EdgeToEdgeCallback(bottomSheetDialog.bottomSheet, windowInsetsCompat);
                    BottomSheetDialog.this.behavior.addBottomSheetCallback(BottomSheetDialog.this.edgeToEdgeCallback);
                }
                return windowInsetsCompat;
            }
        });
        this.bottomSheet.removeAllViews();
        FrameLayout frameLayout = this.bottomSheet;
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C5480R.C5483id.touch_outside).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                if (bottomSheetDialog.cancelable && bottomSheetDialog.isShowing() && BottomSheetDialog.this.shouldWindowCloseOnTouchOutside()) {
                    BottomSheetDialog.this.cancel();
                }
            }
        });
        ViewCompat.setAccessibilityDelegate(this.bottomSheet, new AccessibilityDelegateCompat() {
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                boolean z;
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                if (BottomSheetDialog.this.cancelable) {
                    accessibilityNodeInfoCompat.addAction(1048576);
                    z = true;
                } else {
                    z = false;
                }
                accessibilityNodeInfoCompat.setDismissable(z);
            }

            public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                if (i == 1048576) {
                    BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                    if (bottomSheetDialog.cancelable) {
                        bottomSheetDialog.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view, i, bundle);
            }
        });
        this.bottomSheet.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        return this.container;
    }

    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior2 = getBehavior();
        if (!this.dismissWithAnimation || behavior2.getState() == 5) {
            super.cancel();
        } else {
            behavior2.setState(5);
        }
    }

    @NonNull
    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    public boolean getDismissWithAnimation() {
        return this.dismissWithAnimation;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.edgeToEdgeEnabled;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.edgeToEdgeEnabled && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.container;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.coordinator;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{C5480R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior != null && bottomSheetBehavior.getState() == 5) {
            this.behavior.setState(4);
        }
    }

    public void removeDefaultCallback() {
        this.behavior.removeBottomSheetCallback(this.bottomSheetCallback);
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.cancelable != z) {
            this.cancelable = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z;
        this.canceledOnTouchOutsideSet = true;
    }

    public void setContentView(@LayoutRes int i) {
        super.setContentView(wrapInBottomSheet(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view) {
        super.setContentView(wrapInBottomSheet(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInBottomSheet(0, view, layoutParams));
    }

    public void setDismissWithAnimation(boolean z) {
        this.dismissWithAnimation = z;
    }

    public void setEdgeToEdgeEnabled(boolean z) {
        this.edgeToEdgeEnabled = z;
    }

    public boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.canceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }
}
