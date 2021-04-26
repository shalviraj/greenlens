package com.appfoundry.previewer.fragments;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.appfoundry.previewer.model.Page;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.segment.analytics.integrations.BasePayload;
import kotlin.Metadata;
import p005b.p006a.p007a.p017h.C0726r0;
import p005b.p006a.p007a.p017h.C0727s;
import p005b.p006a.p007a.p018i.C0744e;
import p005b.p006a.p007a.p018i.C0758q;
import p005b.p006a.p007a.p019j.C0779j;
import p005b.p006a.p007a.p024o.C0820c;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p025b.p026a.C0826c;
import p005b.p032d.p033a.C0833a;
import p005b.p032d.p033a.C0841f;
import p005b.p291q.p292a.C5266a;
import p298d.C6774o;
import p298d.C6777r;
import p298d.p337v.C6824d;
import p298d.p337v.C6827f;
import p298d.p337v.p338i.C6833a;
import p298d.p337v.p339j.p340a.C6840e;
import p298d.p337v.p339j.p340a.C6844h;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p416l.p417a.C7725h0;
import p416l.p417a.C7815w;
import p416l.p417a.C7819x0;
import p416l.p417a.C7821y;
import p416l.p417a.C7823z;
import p416l.p417a.p419u1.C7785l;
import p437o.p438a.p439a.C8068c;
import p441p.p442a.C8091a;

public final class BottomSheetFragment extends C0841f {

    /* renamed from: s */
    public Page f10876s;

    /* renamed from: t */
    public int f10877t;

    /* renamed from: u */
    public boolean f10878u = true;

    /* renamed from: v */
    public View f10879v;

    /* renamed from: w */
    public String f10880w;

    @Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ?\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JG\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001c\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010!\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006,"}, mo24462d2 = {"Lcom/appfoundry/previewer/fragments/BottomSheetFragment$LockedBottomSheetBehavior;", "Landroid/view/View;", "V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "child", "Landroid/view/MotionEvent;", "event", "", "onInterceptTouchEvent", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z", "onTouchEvent", "coordinatorLayout", "directTargetChild", "target", "", "axes", "type", "onStartNestedScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z", "dx", "dy", "", "consumed", "Ld/r;", "onNestedPreScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V", "onStopNestedScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V", "", "velocityX", "velocityY", "onNestedPreFling", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FF)Z", "a", "Z", "mLocked", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
    public static final class LockedBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {

        /* renamed from: a */
        public boolean f10881a = true;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LockedBottomSheetBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C6888i.m12438e(context, BasePayload.CONTEXT_KEY);
            C6888i.m12438e(attributeSet, "attrs");
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            C6888i.m12438e(coordinatorLayout, "parent");
            C6888i.m12438e(v, "child");
            C6888i.m12438e(motionEvent, "event");
            if (!this.f10881a) {
                return super.onInterceptTouchEvent(coordinatorLayout, v, motionEvent);
            }
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            C6888i.m12438e(coordinatorLayout, "coordinatorLayout");
            C6888i.m12438e(v, "child");
            C6888i.m12438e(view, "target");
            if (!this.f10881a) {
                return super.onNestedPreFling(coordinatorLayout, v, view, f, f2);
            }
            return false;
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            C6888i.m12438e(coordinatorLayout, "coordinatorLayout");
            C6888i.m12438e(v, "child");
            C6888i.m12438e(view, "target");
            C6888i.m12438e(iArr, "consumed");
            if (!this.f10881a) {
                super.onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr, i3);
            }
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            C6888i.m12438e(coordinatorLayout, "coordinatorLayout");
            C6888i.m12438e(v, "child");
            C6888i.m12438e(view, "directTargetChild");
            C6888i.m12438e(view2, "target");
            if (!this.f10881a) {
                return super.onStartNestedScroll(coordinatorLayout, v, view, view2, i, i2);
            }
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            C6888i.m12438e(coordinatorLayout, "coordinatorLayout");
            C6888i.m12438e(v, "child");
            C6888i.m12438e(view, "target");
            if (!this.f10881a) {
                super.onStopNestedScroll(coordinatorLayout, v, view, i);
            }
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            C6888i.m12438e(coordinatorLayout, "parent");
            C6888i.m12438e(v, "child");
            C6888i.m12438e(motionEvent, "event");
            if (!this.f10881a) {
                return super.onTouchEvent(coordinatorLayout, v, motionEvent);
            }
            return false;
        }
    }

    @C6840e(mo24177c = "com.appfoundry.previewer.fragments.BottomSheetFragment$getRemotePageWithCoroutines$2", mo24178f = "BottomSheetFragment.kt", mo24179l = {121}, mo24180m = "invokeSuspend")
    /* renamed from: com.appfoundry.previewer.fragments.BottomSheetFragment$a */
    public static final class C5451a extends C6844h implements C6866p<C7821y, C6824d<? super C6777r>, Object> {

        /* renamed from: k */
        public int f10882k;

        /* renamed from: l */
        public final /* synthetic */ BottomSheetFragment f10883l;

        /* renamed from: m */
        public final /* synthetic */ RelativeLayout f10884m;

        @C6840e(mo24177c = "com.appfoundry.previewer.fragments.BottomSheetFragment$getRemotePageWithCoroutines$2$remoteResponse$1", mo24178f = "BottomSheetFragment.kt", mo24179l = {}, mo24180m = "invokeSuspend")
        /* renamed from: com.appfoundry.previewer.fragments.BottomSheetFragment$a$a */
        public static final class C5452a extends C6844h implements C6866p<C7821y, C6824d<? super C0779j>, Object> {

            /* renamed from: k */
            public final /* synthetic */ C5451a f10885k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5452a(C5451a aVar, C6824d dVar) {
                super(2, dVar);
                this.f10885k = aVar;
            }

            /* renamed from: b */
            public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
                C6888i.m12438e(dVar, "completion");
                return new C5452a(this.f10885k, dVar);
            }

            /* renamed from: e */
            public final Object mo10326e(Object obj) {
                C5266a.m10018q4(obj);
                return C0820c.m311k(this.f10885k.f10883l.f10876s, false, 2);
            }

            public final Object invoke(Object obj, Object obj2) {
                C6824d dVar = (C6824d) obj2;
                C6888i.m12438e(dVar, "completion");
                C5451a aVar = this.f10885k;
                dVar.getContext();
                C5266a.m10018q4(C6777r.f13694a);
                return C0820c.m311k(aVar.f10883l.f10876s, false, 2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5451a(BottomSheetFragment bottomSheetFragment, RelativeLayout relativeLayout, C6824d dVar) {
            super(2, dVar);
            this.f10883l = bottomSheetFragment;
            this.f10884m = relativeLayout;
        }

        /* renamed from: b */
        public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
            C6888i.m12438e(dVar, "completion");
            return new C5451a(this.f10883l, this.f10884m, dVar);
        }

        /* renamed from: e */
        public final Object mo10326e(Object obj) {
            C8068c cVar;
            Object obj2;
            C6833a aVar = C6833a.COROUTINE_SUSPENDED;
            int i = this.f10882k;
            if (i == 0) {
                C5266a.m10018q4(obj);
                C7815w wVar = C7725h0.f15274b;
                C5452a aVar2 = new C5452a(this, (C6824d) null);
                this.f10882k = 1;
                obj = C5266a.m9853N4(wVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C5266a.m10018q4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0779j jVar = (C0779j) obj;
            BottomSheetFragment bottomSheetFragment = this.f10883l;
            Page page = jVar != null ? jVar.f549a : null;
            bottomSheetFragment.f10876s = page;
            if (page != null) {
                page.f11043k = bottomSheetFragment.f10880w;
            }
            if (jVar != null && jVar.f550b) {
                cVar = C8068c.m14948b();
                obj2 = new C0726r0();
            } else if (page == null) {
                cVar = C8068c.m14948b();
                obj2 = new C0727s(false, 1);
            } else {
                RelativeLayout relativeLayout = this.f10884m;
                if (relativeLayout != null) {
                    C0758q.m240e(relativeLayout);
                }
                BottomSheetFragment bottomSheetFragment2 = this.f10883l;
                View view = bottomSheetFragment2.f10879v;
                if (view != null) {
                    C0758q.m246k(view, bottomSheetFragment2.f10876s, (Float) null, 2);
                    return C6777r.f13694a;
                }
                C6888i.m12446m("pageLayout");
                throw null;
            }
            cVar.mo26008g(obj2);
            return C6777r.f13694a;
        }

        public final Object invoke(Object obj, Object obj2) {
            C6824d dVar = (C6824d) obj2;
            C6888i.m12438e(dVar, "completion");
            return new C5451a(this.f10883l, this.f10884m, dVar).mo10326e(C6777r.f13694a);
        }
    }

    /* renamed from: c */
    public int mo10676c() {
        int i;
        if (this.f10878u && (i = this.f10877t) != 0) {
            return i;
        }
        Context context = getContext();
        C6888i.m12436c(context);
        C6888i.m12437d(context, "context!!");
        int b = C0826c.m411b(context, R.attr.superBottomSheet_expandedHeight);
        if (b != -1) {
            return getResources().getInteger(b);
        }
        Context context2 = getContext();
        C6888i.m12436c(context2);
        C6888i.m12437d(context2, "context!!");
        return context2.getResources().getInteger(R.integer.super_bottom_expanded_behaviour);
    }

    /* renamed from: d */
    public int mo10677d() {
        int i = this.f10877t;
        if (i != 0) {
            return i;
        }
        Context context = getContext();
        C6888i.m12436c(context);
        C6888i.m12437d(context, "context!!");
        int b = C0826c.m411b(context, R.attr.superBottomSheet_peekHeight);
        int dimensionPixelSize = b != -1 ? getResources().getDimensionPixelSize(b) : getResources().getDimensionPixelSize(R.dimen.super_bottom_sheet_peek_height);
        Resources resources = getResources();
        C6888i.m12437d(resources, "resources");
        int i2 = resources.getDisplayMetrics().heightPixels;
        int i3 = i2 - ((i2 * 9) / 16);
        return dimensionPixelSize < i3 ? i3 : dimensionPixelSize;
    }

    /* renamed from: g */
    public final void mo18475g() {
        View view = this.f10879v;
        if (view != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.fragment_loading);
            C6888i.m12437d(relativeLayout, "loadingLayout");
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = mo10677d();
                relativeLayout.setLayoutParams(layoutParams);
                Page I = C0823f.m340I("state:loading");
                if (I != null) {
                    View view2 = this.f10879v;
                    if (view2 != null) {
                        C0758q.m246k(view2, I, (Float) null, 2);
                    } else {
                        C6888i.m12446m("pageLayout");
                        throw null;
                    }
                } else {
                    C0758q.m247l(relativeLayout);
                }
                C7815w wVar = C7725h0.f15273a;
                C5266a.m9880S2(C5266a.m9953g(C7785l.f15351b.plus(C5266a.m9959h((C7819x0) null, 1, (Object) null))), (C6827f) null, (C7823z) null, new C5451a(this, relativeLayout, (C6824d) null), 3, (Object) null);
                return;
            }
            throw new C6774o("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        C6888i.m12446m("pageLayout");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        float f;
        float f2;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        View view;
        C6888i.m12438e(layoutInflater, "inflater");
        C6888i.m12438e(layoutInflater, "inflater");
        boolean a = C0833a.m420a(21);
        this.f692r = !C0826c.m414e(getContext()) && a;
        Context context = getContext();
        C6888i.m12436c(context);
        C6888i.m12437d(context, "context!!");
        int b = C0826c.m411b(context, R.attr.superBottomSheet_dim);
        if (b != -1) {
            TypedValue typedValue = new TypedValue();
            getResources().getValue(b, typedValue, true);
            f = typedValue.getFloat();
        } else {
            TypedValue typedValue2 = new TypedValue();
            getResources().getValue(R.dimen.super_bottom_sheet_dim, typedValue2, true);
            f = typedValue2.getFloat();
        }
        this.f685k = f;
        Context context2 = getContext();
        C6888i.m12436c(context2);
        C6888i.m12437d(context2, "context!!");
        int b2 = C0826c.m411b(context2, R.attr.superBottomSheet_cornerRadius);
        if (b2 != -1) {
            f2 = getResources().getDimension(b2);
        } else {
            Context context3 = getContext();
            C6888i.m12436c(context3);
            C6888i.m12437d(context3, "context!!");
            f2 = context3.getResources().getDimension(R.dimen.super_bottom_sheet_radius);
        }
        this.f686l = f2;
        Context context4 = getContext();
        C6888i.m12436c(context4);
        C6888i.m12437d(context4, "context!!");
        int b3 = C0826c.m411b(context4, R.attr.superBottomSheet_statusBarColor);
        if (b3 != -1) {
            Context context5 = getContext();
            C6888i.m12436c(context5);
            i = ContextCompat.getColor(context5, b3);
        } else {
            Context context6 = getContext();
            C6888i.m12436c(context6);
            Context context7 = getContext();
            C6888i.m12436c(context7);
            C6888i.m12437d(context7, "context!!");
            i = ContextCompat.getColor(context6, C0826c.m411b(context7, R.attr.colorPrimaryDark));
        }
        this.f687m = i;
        this.f688n = this.f10877t == 0;
        Context context8 = getContext();
        C6888i.m12436c(context8);
        C6888i.m12437d(context8, "context!!");
        int b4 = C0826c.m411b(context8, R.attr.superBottomSheet_cancelable);
        if (b4 != -1) {
            z = getResources().getBoolean(b4);
        } else {
            Context context9 = getContext();
            C6888i.m12436c(context9);
            C6888i.m12437d(context9, "context!!");
            z = context9.getResources().getBoolean(R.bool.super_bottom_sheet_cancelable);
        }
        this.f690p = z;
        Context context10 = getContext();
        C6888i.m12436c(context10);
        C6888i.m12437d(context10, "context!!");
        int b5 = C0826c.m411b(context10, R.attr.superBottomSheet_cancelableOnTouchOutside);
        if (b5 != -1) {
            z2 = getResources().getBoolean(b5);
        } else {
            Context context11 = getContext();
            C6888i.m12436c(context11);
            C6888i.m12437d(context11, "context!!");
            z2 = context11.getResources().getBoolean(R.bool.super_bottom_sheet_cancelableOnTouchOutside);
        }
        this.f689o = z2;
        Context context12 = getContext();
        C6888i.m12436c(context12);
        C6888i.m12437d(context12, "context!!");
        int b6 = C0826c.m411b(context12, R.attr.superBottomSheet_animateCornerRadius);
        if (b6 != -1) {
            z3 = getResources().getBoolean(b6);
        } else {
            Context context13 = getContext();
            C6888i.m12436c(context13);
            C6888i.m12437d(context13, "context!!");
            z3 = context13.getResources().getBoolean(R.bool.super_bottom_sheet_animate_corner_radius);
        }
        this.f691q = z3;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(this.f690p);
            dialog.setCanceledOnTouchOutside(this.f690p && this.f689o);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.setDimAmount(this.f685k);
                if (a) {
                    window.addFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    mo10679f(1.0f);
                }
                if (C0826c.m414e(window.getContext()) && !C0826c.m412c(window.getContext())) {
                    window.setGravity(1);
                    window.setLayout(getResources().getDimensionPixelSize(R.dimen.super_bottom_sheet_width), -2);
                }
            }
        }
        Page page = this.f10876s;
        if (C6888i.m12434a(page != null ? page.f11035c : null, "menu:modal")) {
            view = layoutInflater.inflate(R.layout.bottomsheet_fragment_list_original, viewGroup, false);
            str = "inflater.inflate(R.layou…iginal, container, false)";
        } else {
            view = layoutInflater.inflate(R.layout.dialog_fragment_list_simplified, viewGroup, false);
            str = "inflater.inflate(R.layou…lified, container, false)";
        }
        C6888i.m12437d(view, str);
        this.f10879v = view;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipeRefreshLayout);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setEnabled(false);
        }
        Page page2 = this.f10876s;
        C0820c.m303c(page2 != null ? page2.f11035c : null);
        Page page3 = this.f10876s;
        if (page3 == null || !C0744e.m188A(page3)) {
            View view2 = this.f10879v;
            if (view2 != null) {
                C0758q.m246k(view2, this.f10876s, (Float) null, 2);
            } else {
                C6888i.m12446m("pageLayout");
                throw null;
            }
        } else {
            Page page4 = this.f10876s;
            this.f10880w = page4 != null ? page4.f11043k : null;
            if (page4 == null || !C0744e.m214r(page4)) {
                Page page5 = this.f10876s;
                if ((page5 != null ? page5.f11038f : null) != null) {
                    View view3 = this.f10879v;
                    if (view3 != null) {
                        C0758q.m246k(view3, page5, (Float) null, 2);
                    } else {
                        C6888i.m12446m("pageLayout");
                        throw null;
                    }
                }
            }
            mo18475g();
        }
        View view4 = this.f10879v;
        if (view4 != null) {
            return view4;
        }
        C6888i.m12446m("pageLayout");
        throw null;
    }

    public void show(FragmentManager fragmentManager, String str) {
        C6888i.m12438e(fragmentManager, "manager");
        try {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            C6888i.m12437d(beginTransaction, "manager.beginTransaction()");
            beginTransaction.add((Fragment) this, str);
            beginTransaction.commitAllowingStateLoss();
        } catch (IllegalStateException e) {
            Object[] objArr = new Object[2];
            Page page = this.f10876s;
            objArr[0] = page != null ? page.f11033a : null;
            objArr[1] = e.getLocalizedMessage();
            C8091a.f16272d.mo26044b("Error showing BottomSheetFragment with pageID: %s. Exception: %s", objArr);
        }
    }
}
