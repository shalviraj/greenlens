package p005b.p025b.p026a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import androidx.annotation.RestrictTo;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;

/* renamed from: b.b.a.c */
public final class C0826c {
    /* renamed from: a */
    public static final float m410a(View view, int i) {
        C6888i.m12439f(view, "$this$dp");
        Resources resources = view.getResources();
        C6888i.m12435b(resources, "resources");
        return TypedValue.applyDimension(1, (float) i, resources.getDisplayMetrics());
    }

    /* renamed from: b */
    public static final int m411b(Context context, int i) {
        C6888i.m12438e(context, "$this$getAttrId");
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return -1;
        }
        return typedValue.resourceId;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r1 = (r1 = r1.getResources()).getConfiguration();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m412c(android.content.Context r1) {
        /*
            r0 = 1
            if (r1 == 0) goto L_0x0014
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L_0x0014
            android.content.res.Configuration r1 = r1.getConfiguration()
            if (r1 == 0) goto L_0x0014
            int r1 = r1.orientation
            if (r1 != r0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p025b.p026a.C0826c.m412c(android.content.Context):boolean");
    }

    /* renamed from: d */
    public static final <T extends View> boolean m413d(T t) {
        C6888i.m12439f(t, "$this$isRtl");
        Resources resources = t.getResources();
        C6888i.m12435b(resources, "resources");
        Configuration configuration = resources.getConfiguration();
        C6888i.m12435b(configuration, "resources.configuration");
        return configuration.getLayoutDirection() == 1;
    }

    /* renamed from: e */
    public static final boolean m414e(Context context) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return false;
        }
        return resources.getBoolean(R.bool.super_bottom_sheet_isTablet);
    }

    /* renamed from: f */
    public static final <T extends View> boolean m415f(T t) {
        C6888i.m12439f(t, "$this$isVisible");
        if (t instanceof Button) {
            Button button = (Button) t;
            if (button.getVisibility() != 0) {
                return false;
            }
            CharSequence text = button.getText();
            C6888i.m12435b(text, "this.text");
            if (!(!C7694h.m13936n(C7694h.m13921L(text)))) {
                return false;
            }
        } else if (t.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public static final boolean m416g(DialogActionButtonLayout dialogActionButtonLayout) {
        if (dialogActionButtonLayout == null) {
            return false;
        }
        return ((dialogActionButtonLayout.getVisibleButtons().length == 0) ^ true) || m415f(dialogActionButtonLayout.getCheckBoxPrompt());
    }
}
