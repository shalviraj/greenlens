package com.yalantis.ucrop;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p005b.p291q.p292a.C5266a;
import p005b.p291q.p292a.C5273h;
import p005b.p291q.p292a.p294j.C5280b;
import p005b.p291q.p292a.p294j.C5282d;
import p005b.p291q.p292a.p295k.C5283a;
import p005b.p291q.p292a.p297m.C5298c;

public class UCropActivity extends AppCompatActivity {

    /* renamed from: K */
    public static final Bitmap.CompressFormat f11521K = Bitmap.CompressFormat.JPEG;

    /* renamed from: A */
    public List<ViewGroup> f11522A = new ArrayList();

    /* renamed from: B */
    public TextView f11523B;

    /* renamed from: C */
    public TextView f11524C;

    /* renamed from: D */
    public View f11525D;

    /* renamed from: E */
    public Transition f11526E;

    /* renamed from: F */
    public Bitmap.CompressFormat f11527F = f11521K;

    /* renamed from: G */
    public int f11528G = 90;

    /* renamed from: H */
    public int[] f11529H = {1, 2, 3};

    /* renamed from: I */
    public C5298c.C5299a f11530I = new C5851a();

    /* renamed from: J */
    public final View.OnClickListener f11531J = new C5852b();

    /* renamed from: g */
    public String f11532g;

    /* renamed from: h */
    public int f11533h;

    /* renamed from: i */
    public int f11534i;

    /* renamed from: j */
    public int f11535j;

    /* renamed from: k */
    public int f11536k;
    @ColorInt

    /* renamed from: l */
    public int f11537l;
    @DrawableRes

    /* renamed from: m */
    public int f11538m;
    @DrawableRes

    /* renamed from: n */
    public int f11539n;

    /* renamed from: o */
    public int f11540o;

    /* renamed from: p */
    public boolean f11541p;

    /* renamed from: q */
    public boolean f11542q = true;

    /* renamed from: r */
    public UCropView f11543r;

    /* renamed from: s */
    public GestureCropImageView f11544s;

    /* renamed from: t */
    public OverlayView f11545t;

    /* renamed from: u */
    public ViewGroup f11546u;

    /* renamed from: v */
    public ViewGroup f11547v;

    /* renamed from: w */
    public ViewGroup f11548w;

    /* renamed from: x */
    public ViewGroup f11549x;

    /* renamed from: y */
    public ViewGroup f11550y;

    /* renamed from: z */
    public ViewGroup f11551z;

    /* renamed from: com.yalantis.ucrop.UCropActivity$a */
    public class C5851a implements C5298c.C5299a {
        public C5851a() {
        }

        /* renamed from: a */
        public void mo22892a(float f) {
            TextView textView = UCropActivity.this.f11523B;
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f°", new Object[]{Float.valueOf(f)}));
            }
        }

        /* renamed from: b */
        public void mo22893b(float f) {
            TextView textView = UCropActivity.this.f11524C;
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%d%%", new Object[]{Integer.valueOf((int) (f * 100.0f))}));
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$b */
    public class C5852b implements View.OnClickListener {
        public C5852b() {
        }

        public void onClick(View view) {
            if (!view.isSelected()) {
                UCropActivity uCropActivity = UCropActivity.this;
                int id = view.getId();
                Bitmap.CompressFormat compressFormat = UCropActivity.f11521K;
                uCropActivity.mo22888c(id);
            }
        }
    }

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    /* renamed from: a */
    public final void mo22886a(int i) {
        GestureCropImageView gestureCropImageView = this.f11544s;
        int[] iArr = this.f11529H;
        boolean z = false;
        gestureCropImageView.setScaleEnabled(iArr[i] == 3 || iArr[i] == 1);
        GestureCropImageView gestureCropImageView2 = this.f11544s;
        int[] iArr2 = this.f11529H;
        if (iArr2[i] == 3 || iArr2[i] == 2) {
            z = true;
        }
        gestureCropImageView2.setRotateEnabled(z);
    }

    /* renamed from: b */
    public void mo22887b(Throwable th) {
        setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", th));
    }

    /* renamed from: c */
    public final void mo22888c(@IdRes int i) {
        if (this.f11541p) {
            this.f11546u.setSelected(i == R.id.state_aspect_ratio);
            this.f11547v.setSelected(i == R.id.state_rotate);
            this.f11548w.setSelected(i == R.id.state_scale);
            int i2 = 8;
            this.f11549x.setVisibility(i == R.id.state_aspect_ratio ? 0 : 8);
            this.f11550y.setVisibility(i == R.id.state_rotate ? 0 : 8);
            this.f11551z.setVisibility(i == R.id.state_scale ? 0 : 8);
            TransitionManager.beginDelayedTransition((ViewGroup) findViewById(R.id.ucrop_photobox), this.f11526E);
            this.f11548w.findViewById(R.id.text_view_scale).setVisibility(i == R.id.state_scale ? 0 : 8);
            this.f11546u.findViewById(R.id.text_view_crop).setVisibility(i == R.id.state_aspect_ratio ? 0 : 8);
            View findViewById = this.f11547v.findViewById(R.id.text_view_rotate);
            if (i == R.id.state_rotate) {
                i2 = 0;
            }
            findViewById.setVisibility(i2);
            if (i == R.id.state_scale) {
                mo22886a(0);
            } else if (i == R.id.state_rotate) {
                mo22886a(1);
            } else {
                mo22886a(2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x052a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0531  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r26) {
        /*
            r25 = this;
            r1 = r25
            super.onCreate(r26)
            r0 = 2131427494(0x7f0b00a6, float:1.8476606E38)
            r1.setContentView((int) r0)
            android.content.Intent r0 = r25.getIntent()
            r2 = 2131034375(0x7f050107, float:1.7679266E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r1, r2)
            java.lang.String r3 = "com.yalantis.ucrop.StatusBarColor"
            int r2 = r0.getIntExtra(r3, r2)
            r1.f11534i = r2
            r2 = 2131034376(0x7f050108, float:1.7679268E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r1, r2)
            java.lang.String r3 = "com.yalantis.ucrop.ToolbarColor"
            int r2 = r0.getIntExtra(r3, r2)
            r1.f11533h = r2
            r2 = 2131034362(0x7f0500fa, float:1.767924E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r1, r2)
            java.lang.String r3 = "com.yalantis.ucrop.UcropColorControlsWidgetActive"
            int r2 = r0.getIntExtra(r3, r2)
            r1.f11535j = r2
            r2 = 2131034377(0x7f050109, float:1.767927E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r1, r2)
            java.lang.String r3 = "com.yalantis.ucrop.UcropToolbarWidgetColor"
            int r2 = r0.getIntExtra(r3, r2)
            r1.f11536k = r2
            r2 = 2131165392(0x7f0700d0, float:1.7945E38)
            java.lang.String r3 = "com.yalantis.ucrop.UcropToolbarCancelDrawable"
            int r2 = r0.getIntExtra(r3, r2)
            r1.f11538m = r2
            r2 = 2131165393(0x7f0700d1, float:1.7945002E38)
            java.lang.String r3 = "com.yalantis.ucrop.UcropToolbarCropDrawable"
            int r2 = r0.getIntExtra(r3, r2)
            r1.f11539n = r2
            java.lang.String r2 = "com.yalantis.ucrop.UcropToolbarTitleText"
            java.lang.String r2 = r0.getStringExtra(r2)
            r1.f11532g = r2
            if (r2 == 0) goto L_0x006c
            goto L_0x0077
        L_0x006c:
            android.content.res.Resources r2 = r25.getResources()
            r3 = 2131755215(0x7f1000cf, float:1.9141303E38)
            java.lang.String r2 = r2.getString(r3)
        L_0x0077:
            r1.f11532g = r2
            r2 = 2131034369(0x7f050101, float:1.7679254E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r1, r2)
            java.lang.String r3 = "com.yalantis.ucrop.UcropLogoColor"
            int r2 = r0.getIntExtra(r3, r2)
            r1.f11540o = r2
            java.lang.String r2 = "com.yalantis.ucrop.HideBottomControls"
            r3 = 0
            boolean r2 = r0.getBooleanExtra(r2, r3)
            r4 = 1
            r2 = r2 ^ r4
            r1.f11541p = r2
            r2 = 2131034365(0x7f0500fd, float:1.7679245E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r1, r2)
            java.lang.String r5 = "com.yalantis.ucrop.UcropRootViewBackgroundColor"
            int r2 = r0.getIntExtra(r5, r2)
            r1.f11537l = r2
            int r2 = r1.f11534i
            android.view.Window r5 = r25.getWindow()
            if (r5 == 0) goto L_0x00b2
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r5.addFlags(r6)
            r5.setStatusBarColor(r2)
        L_0x00b2:
            r2 = 2131231263(0x7f08021f, float:1.8078602E38)
            android.view.View r5 = r1.findViewById(r2)
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5
            int r6 = r1.f11533h
            r5.setBackgroundColor(r6)
            int r6 = r1.f11536k
            r5.setTitleTextColor((int) r6)
            r6 = 2131231264(0x7f080220, float:1.8078604E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            int r7 = r1.f11536k
            r6.setTextColor(r7)
            java.lang.String r7 = r1.f11532g
            r6.setText(r7)
            int r6 = r1.f11538m
            android.graphics.drawable.Drawable r6 = androidx.core.content.ContextCompat.getDrawable(r1, r6)
            android.graphics.drawable.Drawable r6 = r6.mutate()
            int r7 = r1.f11536k
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r6.setColorFilter(r7, r8)
            r5.setNavigationIcon((android.graphics.drawable.Drawable) r6)
            r1.setSupportActionBar(r5)
            androidx.appcompat.app.ActionBar r5 = r25.getSupportActionBar()
            if (r5 == 0) goto L_0x00f8
            r5.setDisplayShowTitleEnabled(r3)
        L_0x00f8:
            r5 = 2131231278(0x7f08022e, float:1.8078633E38)
            android.view.View r5 = r1.findViewById(r5)
            com.yalantis.ucrop.view.UCropView r5 = (com.yalantis.ucrop.view.UCropView) r5
            r1.f11543r = r5
            com.yalantis.ucrop.view.GestureCropImageView r5 = r5.getCropImageView()
            r1.f11544s = r5
            com.yalantis.ucrop.view.UCropView r5 = r1.f11543r
            com.yalantis.ucrop.view.OverlayView r5 = r5.getOverlayView()
            r1.f11545t = r5
            com.yalantis.ucrop.view.GestureCropImageView r5 = r1.f11544s
            b.q.a.m.c$a r6 = r1.f11530I
            r5.setTransformImageListener(r6)
            r5 = 2131230976(0x7f080100, float:1.807802E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            int r6 = r1.f11540o
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r5.setColorFilter(r6, r7)
            r5 = 2131231279(0x7f08022f, float:1.8078635E38)
            android.view.View r6 = r1.findViewById(r5)
            int r7 = r1.f11537l
            r6.setBackgroundColor(r7)
            boolean r6 = r1.f11541p
            if (r6 != 0) goto L_0x014b
            android.view.View r6 = r1.findViewById(r5)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
            r6.bottomMargin = r3
            android.view.View r5 = r1.findViewById(r5)
            r5.requestLayout()
        L_0x014b:
            boolean r5 = r1.f11541p
            r6 = -1
            r7 = 0
            r8 = 2
            r9 = 0
            java.lang.String r10 = "com.yalantis.ucrop.AspectRatioOptions"
            java.lang.String r11 = "com.yalantis.ucrop.AspectRatioSelectedByDefault"
            r12 = 2131231211(0x7f0801eb, float:1.8078497E38)
            r13 = 2131231209(0x7f0801e9, float:1.8078493E38)
            r14 = 2131231280(0x7f080230, float:1.8078637E38)
            if (r5 == 0) goto L_0x0357
            android.view.View r5 = r1.findViewById(r14)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r15 = 2131230870(0x7f080096, float:1.8077805E38)
            android.view.View r5 = r5.findViewById(r15)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r5.setVisibility(r3)
            android.view.LayoutInflater r15 = android.view.LayoutInflater.from(r25)
            r14 = 2131427496(0x7f0b00a8, float:1.847661E38)
            r15.inflate(r14, r5, r4)
            androidx.transition.AutoTransition r5 = new androidx.transition.AutoTransition
            r5.<init>()
            r1.f11526E = r5
            r14 = 50
            r5.setDuration((long) r14)
            android.view.View r5 = r1.findViewById(r13)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r1.f11546u = r5
            android.view.View$OnClickListener r14 = r1.f11531J
            r5.setOnClickListener(r14)
            r5 = 2131231210(0x7f0801ea, float:1.8078495E38)
            android.view.View r5 = r1.findViewById(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r1.f11547v = r5
            android.view.View$OnClickListener r14 = r1.f11531J
            r5.setOnClickListener(r14)
            android.view.View r5 = r1.findViewById(r12)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r1.f11548w = r5
            android.view.View$OnClickListener r14 = r1.f11531J
            r5.setOnClickListener(r14)
            r5 = 2131230990(0x7f08010e, float:1.8078048E38)
            android.view.View r14 = r1.findViewById(r5)
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            r1.f11549x = r14
            r14 = 2131230991(0x7f08010f, float:1.807805E38)
            android.view.View r14 = r1.findViewById(r14)
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            r1.f11550y = r14
            r14 = 2131230992(0x7f080110, float:1.8078052E38)
            android.view.View r14 = r1.findViewById(r14)
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            r1.f11551z = r14
            int r14 = r0.getIntExtra(r11, r3)
            java.util.ArrayList r15 = r0.getParcelableArrayListExtra(r10)
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r15 == 0) goto L_0x01e5
            boolean r16 = r15.isEmpty()
            if (r16 == 0) goto L_0x0228
        L_0x01e5:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            b.q.a.j.a r14 = new b.q.a.j.a
            r14.<init>(r9, r12, r12)
            r15.add(r14)
            b.q.a.j.a r14 = new b.q.a.j.a
            r13 = 1082130432(0x40800000, float:4.0)
            r2 = 1077936128(0x40400000, float:3.0)
            r14.<init>(r9, r2, r13)
            r15.add(r14)
            b.q.a.j.a r13 = new b.q.a.j.a
            r14 = 2131755216(0x7f1000d0, float:1.9141305E38)
            java.lang.String r14 = r1.getString(r14)
            java.lang.String r14 = r14.toUpperCase()
            r13.<init>(r14, r7, r7)
            r15.add(r13)
            b.q.a.j.a r13 = new b.q.a.j.a
            r14 = 1073741824(0x40000000, float:2.0)
            r13.<init>(r9, r2, r14)
            r15.add(r13)
            b.q.a.j.a r2 = new b.q.a.j.a
            r13 = 1098907648(0x41800000, float:16.0)
            r14 = 1091567616(0x41100000, float:9.0)
            r2.<init>(r9, r13, r14)
            r15.add(r2)
            r14 = r8
        L_0x0228:
            android.view.View r2 = r1.findViewById(r5)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r3, r6)
            r5.weight = r12
            java.util.Iterator r12 = r15.iterator()
        L_0x0239:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x026e
            java.lang.Object r13 = r12.next()
            b.q.a.j.a r13 = (p005b.p291q.p292a.p294j.C5278a) r13
            android.view.LayoutInflater r15 = r25.getLayoutInflater()
            r6 = 2131427495(0x7f0b00a7, float:1.8476608E38)
            android.view.View r6 = r15.inflate(r6, r9)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r6.setLayoutParams(r5)
            android.view.View r15 = r6.getChildAt(r3)
            com.yalantis.ucrop.view.widget.AspectRatioTextView r15 = (com.yalantis.ucrop.view.widget.AspectRatioTextView) r15
            int r9 = r1.f11535j
            r15.setActiveColor(r9)
            r15.setAspectRatio(r13)
            r2.addView(r6)
            java.util.List<android.view.ViewGroup> r9 = r1.f11522A
            r9.add(r6)
            r6 = -1
            r9 = 0
            goto L_0x0239
        L_0x026e:
            java.util.List<android.view.ViewGroup> r2 = r1.f11522A
            java.lang.Object r2 = r2.get(r14)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r2.setSelected(r4)
            java.util.List<android.view.ViewGroup> r2 = r1.f11522A
            java.util.Iterator r2 = r2.iterator()
        L_0x027f:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0294
            java.lang.Object r5 = r2.next()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            b.q.a.c r6 = new b.q.a.c
            r6.<init>(r1)
            r5.setOnClickListener(r6)
            goto L_0x027f
        L_0x0294:
            r2 = 2131231250(0x7f080212, float:1.8078576E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f11523B = r2
            r2 = 2131231141(0x7f0801a5, float:1.8078355E38)
            android.view.View r5 = r1.findViewById(r2)
            com.yalantis.ucrop.view.widget.HorizontalProgressWheelView r5 = (com.yalantis.ucrop.view.widget.HorizontalProgressWheelView) r5
            b.q.a.d r6 = new b.q.a.d
            r6.<init>(r1)
            r5.setScrollingListener(r6)
            android.view.View r2 = r1.findViewById(r2)
            com.yalantis.ucrop.view.widget.HorizontalProgressWheelView r2 = (com.yalantis.ucrop.view.widget.HorizontalProgressWheelView) r2
            int r5 = r1.f11535j
            r2.setMiddleLineColor(r5)
            r2 = 2131231301(0x7f080245, float:1.807868E38)
            android.view.View r2 = r1.findViewById(r2)
            b.q.a.e r5 = new b.q.a.e
            r5.<init>(r1)
            r2.setOnClickListener(r5)
            r2 = 2131231302(0x7f080246, float:1.8078681E38)
            android.view.View r2 = r1.findViewById(r2)
            b.q.a.f r5 = new b.q.a.f
            r5.<init>(r1)
            r2.setOnClickListener(r5)
            int r2 = r1.f11535j
            android.widget.TextView r5 = r1.f11523B
            if (r5 == 0) goto L_0x02e2
            r5.setTextColor(r2)
        L_0x02e2:
            r2 = 2131231251(0x7f080213, float:1.8078578E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f11524C = r2
            r2 = 2131231151(0x7f0801af, float:1.8078375E38)
            android.view.View r5 = r1.findViewById(r2)
            com.yalantis.ucrop.view.widget.HorizontalProgressWheelView r5 = (com.yalantis.ucrop.view.widget.HorizontalProgressWheelView) r5
            b.q.a.g r6 = new b.q.a.g
            r6.<init>(r1)
            r5.setScrollingListener(r6)
            android.view.View r2 = r1.findViewById(r2)
            com.yalantis.ucrop.view.widget.HorizontalProgressWheelView r2 = (com.yalantis.ucrop.view.widget.HorizontalProgressWheelView) r2
            int r5 = r1.f11535j
            r2.setMiddleLineColor(r5)
            int r2 = r1.f11535j
            android.widget.TextView r5 = r1.f11524C
            if (r5 == 0) goto L_0x0312
            r5.setTextColor(r2)
        L_0x0312:
            r2 = 2131230979(0x7f080103, float:1.8078026E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r5 = 2131230978(0x7f080102, float:1.8078024E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r6 = 2131230977(0x7f080101, float:1.8078022E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            b.q.a.l.d r9 = new b.q.a.l.d
            android.graphics.drawable.Drawable r12 = r2.getDrawable()
            int r13 = r1.f11535j
            r9.<init>(r12, r13)
            r2.setImageDrawable(r9)
            b.q.a.l.d r2 = new b.q.a.l.d
            android.graphics.drawable.Drawable r9 = r5.getDrawable()
            int r12 = r1.f11535j
            r2.<init>(r9, r12)
            r5.setImageDrawable(r2)
            b.q.a.l.d r2 = new b.q.a.l.d
            android.graphics.drawable.Drawable r5 = r6.getDrawable()
            int r9 = r1.f11535j
            r2.<init>(r5, r9)
            r6.setImageDrawable(r2)
        L_0x0357:
            java.lang.String r2 = "com.yalantis.ucrop.InputUri"
            android.os.Parcelable r2 = r0.getParcelableExtra(r2)
            r19 = r2
            android.net.Uri r19 = (android.net.Uri) r19
            java.lang.String r2 = "com.yalantis.ucrop.OutputUri"
            android.os.Parcelable r2 = r0.getParcelableExtra(r2)
            r20 = r2
            android.net.Uri r20 = (android.net.Uri) r20
            java.lang.String r2 = "com.yalantis.ucrop.CompressionFormatName"
            java.lang.String r2 = r0.getStringExtra(r2)
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L_0x037c
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.valueOf(r2)
            goto L_0x037d
        L_0x037c:
            r9 = 0
        L_0x037d:
            if (r9 != 0) goto L_0x0381
            android.graphics.Bitmap$CompressFormat r9 = f11521K
        L_0x0381:
            r1.f11527F = r9
            r2 = 90
            java.lang.String r5 = "com.yalantis.ucrop.CompressionQuality"
            int r2 = r0.getIntExtra(r5, r2)
            r1.f11528G = r2
            java.lang.String r2 = "com.yalantis.ucrop.AllowedGestures"
            int[] r2 = r0.getIntArrayExtra(r2)
            r5 = 3
            if (r2 == 0) goto L_0x039b
            int r6 = r2.length
            if (r6 != r5) goto L_0x039b
            r1.f11529H = r2
        L_0x039b:
            com.yalantis.ucrop.view.GestureCropImageView r2 = r1.f11544s
            java.lang.String r6 = "com.yalantis.ucrop.MaxBitmapSize"
            int r6 = r0.getIntExtra(r6, r3)
            r2.setMaxBitmapSize(r6)
            com.yalantis.ucrop.view.GestureCropImageView r2 = r1.f11544s
            r6 = 1092616192(0x41200000, float:10.0)
            java.lang.String r9 = "com.yalantis.ucrop.MaxScaleMultiplier"
            float r6 = r0.getFloatExtra(r9, r6)
            r2.setMaxScaleMultiplier(r6)
            com.yalantis.ucrop.view.GestureCropImageView r2 = r1.f11544s
            r6 = 500(0x1f4, float:7.0E-43)
            java.lang.String r9 = "com.yalantis.ucrop.ImageToCropBoundsAnimDuration"
            int r6 = r0.getIntExtra(r9, r6)
            long r12 = (long) r6
            r2.setImageToWrapCropBoundsAnimDuration(r12)
            com.yalantis.ucrop.view.OverlayView r2 = r1.f11545t
            java.lang.String r6 = "com.yalantis.ucrop.FreeStyleCrop"
            boolean r6 = r0.getBooleanExtra(r6, r3)
            r2.setFreestyleCropEnabled(r6)
            com.yalantis.ucrop.view.OverlayView r2 = r1.f11545t
            android.content.res.Resources r6 = r25.getResources()
            r9 = 2131034368(0x7f050100, float:1.7679252E38)
            int r6 = r6.getColor(r9)
            java.lang.String r9 = "com.yalantis.ucrop.DimmedLayerColor"
            int r6 = r0.getIntExtra(r9, r6)
            r2.setDimmedColor(r6)
            com.yalantis.ucrop.view.OverlayView r2 = r1.f11545t
            java.lang.String r6 = "com.yalantis.ucrop.CircleDimmedLayer"
            boolean r6 = r0.getBooleanExtra(r6, r3)
            r2.setCircleDimmedLayer(r6)
            com.yalantis.ucrop.view.OverlayView r2 = r1.f11545t
            java.lang.String r6 = "com.yalantis.ucrop.ShowCropFrame"
            boolean r6 = r0.getBooleanExtra(r6, r4)
            r2.setShowCropFrame(r6)
            com.yalantis.ucrop.view.OverlayView r2 = r1.f11545t
            android.content.res.Resources r6 = r25.getResources()
            r9 = 2131034366(0x7f0500fe, float:1.7679248E38)
            int r6 = r6.getColor(r9)
            java.lang.String r9 = "com.yalantis.ucrop.CropFrameColor"
            int r6 = r0.getIntExtra(r9, r6)
            r2.setCropFrameColor(r6)
            com.yalantis.ucrop.view.OverlayView r2 = r1.f11545t
            android.content.res.Resources r6 = r25.getResources()
            r9 = 2131100118(0x7f0601d6, float:1.7812608E38)
            int r6 = r6.getDimensionPixelSize(r9)
            java.lang.String r9 = "com.yalantis.ucrop.CropFrameStrokeWidth"
            int r6 = r0.getIntExtra(r9, r6)
            r2.setCropFrameStrokeWidth(r6)
            com.yalantis.ucrop.view.OverlayView r2 = r1.f11545t
            java.lang.String r6 = "com.yalantis.ucrop.ShowCropGrid"
            boolean r6 = r0.getBooleanExtra(r6, r4)
            r2.setShowCropGrid(r6)
            com.yalantis.ucrop.view.OverlayView r2 = r1.f11545t
            java.lang.String r6 = "com.yalantis.ucrop.CropGridRowCount"
            int r6 = r0.getIntExtra(r6, r8)
            r2.setCropGridRowCount(r6)
            com.yalantis.ucrop.view.OverlayView r2 = r1.f11545t
            java.lang.String r6 = "com.yalantis.ucrop.CropGridColumnCount"
            int r6 = r0.getIntExtra(r6, r8)
            r2.setCropGridColumnCount(r6)
            com.yalantis.ucrop.view.OverlayView r2 = r1.f11545t
            android.content.res.Resources r6 = r25.getResources()
            r8 = 2131034367(0x7f0500ff, float:1.767925E38)
            int r6 = r6.getColor(r8)
            java.lang.String r8 = "com.yalantis.ucrop.CropGridColor"
            int r6 = r0.getIntExtra(r8, r6)
            r2.setCropGridColor(r6)
            com.yalantis.ucrop.view.OverlayView r2 = r1.f11545t
            android.content.res.Resources r6 = r25.getResources()
            r8 = 2131100119(0x7f0601d7, float:1.781261E38)
            int r6 = r6.getDimensionPixelSize(r8)
            java.lang.String r8 = "com.yalantis.ucrop.CropGridStrokeWidth"
            int r6 = r0.getIntExtra(r8, r6)
            r2.setCropGridStrokeWidth(r6)
            java.lang.String r2 = "com.yalantis.ucrop.AspectRatioX"
            float r2 = r0.getFloatExtra(r2, r7)
            java.lang.String r6 = "com.yalantis.ucrop.AspectRatioY"
            float r6 = r0.getFloatExtra(r6, r7)
            int r8 = r0.getIntExtra(r11, r3)
            java.util.ArrayList r9 = r0.getParcelableArrayListExtra(r10)
            int r10 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x0499
            int r10 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x0499
            android.view.ViewGroup r7 = r1.f11546u
            if (r7 == 0) goto L_0x0496
            r8 = 8
            r7.setVisibility(r8)
        L_0x0496:
            com.yalantis.ucrop.view.GestureCropImageView r7 = r1.f11544s
            goto L_0x04b3
        L_0x0499:
            if (r9 == 0) goto L_0x04b5
            int r2 = r9.size()
            if (r8 >= r2) goto L_0x04b5
            com.yalantis.ucrop.view.GestureCropImageView r7 = r1.f11544s
            java.lang.Object r2 = r9.get(r8)
            b.q.a.j.a r2 = (p005b.p291q.p292a.p294j.C5278a) r2
            float r2 = r2.f10535h
            java.lang.Object r6 = r9.get(r8)
            b.q.a.j.a r6 = (p005b.p291q.p292a.p294j.C5278a) r6
            float r6 = r6.f10536i
        L_0x04b3:
            float r2 = r2 / r6
            goto L_0x04bc
        L_0x04b5:
            com.yalantis.ucrop.view.GestureCropImageView r2 = r1.f11544s
            r24 = r7
            r7 = r2
            r2 = r24
        L_0x04bc:
            r7.setTargetAspectRatio(r2)
            java.lang.String r2 = "com.yalantis.ucrop.MaxSizeX"
            int r2 = r0.getIntExtra(r2, r3)
            java.lang.String r6 = "com.yalantis.ucrop.MaxSizeY"
            int r0 = r0.getIntExtra(r6, r3)
            if (r2 <= 0) goto L_0x04d9
            if (r0 <= 0) goto L_0x04d9
            com.yalantis.ucrop.view.GestureCropImageView r6 = r1.f11544s
            r6.setMaxResultImageSizeX(r2)
            com.yalantis.ucrop.view.GestureCropImageView r2 = r1.f11544s
            r2.setMaxResultImageSizeY(r0)
        L_0x04d9:
            if (r19 == 0) goto L_0x0501
            if (r20 == 0) goto L_0x0501
            com.yalantis.ucrop.view.GestureCropImageView r0 = r1.f11544s     // Catch:{ Exception -> 0x04ff }
            int r22 = r0.getMaxBitmapSize()     // Catch:{ Exception -> 0x04ff }
            android.content.Context r18 = r0.getContext()     // Catch:{ Exception -> 0x04ff }
            b.q.a.m.b r2 = new b.q.a.m.b     // Catch:{ Exception -> 0x04ff }
            r2.<init>(r0)     // Catch:{ Exception -> 0x04ff }
            b.q.a.k.b r0 = new b.q.a.k.b     // Catch:{ Exception -> 0x04ff }
            r17 = r0
            r21 = r22
            r23 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x04ff }
            java.util.concurrent.Executor r2 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch:{ Exception -> 0x04ff }
            java.lang.Void[] r6 = new java.lang.Void[r3]     // Catch:{ Exception -> 0x04ff }
            r0.executeOnExecutor(r2, r6)     // Catch:{ Exception -> 0x04ff }
            goto L_0x0513
        L_0x04ff:
            r0 = move-exception
            goto L_0x050d
        L_0x0501:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r2 = 2131755214(0x7f1000ce, float:1.91413E38)
            java.lang.String r2 = r1.getString(r2)
            r0.<init>(r2)
        L_0x050d:
            r1.mo22887b(r0)
            r25.finish()
        L_0x0513:
            boolean r0 = r1.f11541p
            if (r0 == 0) goto L_0x052a
            android.view.ViewGroup r0 = r1.f11546u
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0523
            r12 = 2131231209(0x7f0801e9, float:1.8078493E38)
            goto L_0x0526
        L_0x0523:
            r12 = 2131231211(0x7f0801eb, float:1.8078497E38)
        L_0x0526:
            r1.mo22888c(r12)
            goto L_0x052d
        L_0x052a:
            r1.mo22886a(r3)
        L_0x052d:
            android.view.View r0 = r1.f11525D
            if (r0 != 0) goto L_0x054e
            android.view.View r0 = new android.view.View
            r0.<init>(r1)
            r1.f11525D = r0
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r2 = -1
            r0.<init>(r2, r2)
            r2 = 2131231263(0x7f08021f, float:1.8078602E38)
            r0.addRule(r5, r2)
            android.view.View r2 = r1.f11525D
            r2.setLayoutParams(r0)
            android.view.View r0 = r1.f11525D
            r0.setClickable(r4)
        L_0x054e:
            r2 = 2131231280(0x7f080230, float:1.8078637E38)
            android.view.View r0 = r1.findViewById(r2)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            android.view.View r2 = r1.f11525D
            r0.addView(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.UCropActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ucrop_menu_activity, menu);
        MenuItem findItem = menu.findItem(R.id.menu_loader);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.f11536k, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (IllegalStateException e) {
                Log.i("UCropActivity", String.format("%s - %s", new Object[]{e.getMessage(), getString(R.string.ucrop_mutate_exception_hint)}));
            }
            ((Animatable) findItem.getIcon()).start();
        }
        MenuItem findItem2 = menu.findItem(R.id.menu_crop);
        Drawable drawable = ContextCompat.getDrawable(this, this.f11539n);
        if (drawable != null) {
            drawable.mutate();
            drawable.setColorFilter(this.f11536k, PorterDuff.Mode.SRC_ATOP);
            findItem2.setIcon(drawable);
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menu_crop) {
            this.f11525D.setClickable(true);
            this.f11542q = true;
            supportInvalidateOptionsMenu();
            GestureCropImageView gestureCropImageView = this.f11544s;
            Bitmap.CompressFormat compressFormat = this.f11527F;
            int i = this.f11528G;
            C5273h hVar = new C5273h(this);
            gestureCropImageView.mo17254i();
            gestureCropImageView.setImageToWrapCropBounds(false);
            new C5283a(gestureCropImageView.getContext(), gestureCropImageView.getViewBitmap(), new C5282d(gestureCropImageView.f10603v, C5266a.m9799E4(gestureCropImageView.f10626g), gestureCropImageView.getCurrentScale(), gestureCropImageView.getCurrentAngle()), new C5280b(gestureCropImageView.f10600E, gestureCropImageView.f10601F, compressFormat, i, gestureCropImageView.getImageInputPath(), gestureCropImageView.getImageOutputPath(), gestureCropImageView.getExifInfo()), hVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R.id.menu_crop).setVisible(!this.f11542q);
        menu.findItem(R.id.menu_loader).setVisible(this.f11542q);
        return super.onPrepareOptionsMenu(menu);
    }

    public void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.f11544s;
        if (gestureCropImageView != null) {
            gestureCropImageView.mo17254i();
        }
    }
}
