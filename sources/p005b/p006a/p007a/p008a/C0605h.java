package p005b.p006a.p007a.p008a;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appfoundry.previewer.model.Animation;
import com.appfoundry.previewer.model.Component;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Page;
import com.appfoundry.previewer.model.Text;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import p005b.p006a.p007a.p017h.C0701f;
import p005b.p006a.p007a.p017h.C0707i;
import p005b.p006a.p007a.p017h.C0711k;
import p005b.p038f.p039a.C0849e;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;
import p437o.p438a.p439a.C8068c;
import p437o.p438a.p439a.C8083m;
import p441p.p442a.C8091a;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bH\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0004J)\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020 H\u0007¢\u0006\u0004\b!\u0010\"R\"\u0010*\u001a\u00020#8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00101\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00109\u001a\u0004\u0018\u0001028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010G\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006I"}, mo24462d2 = {"Lb/a/a/a/h;", "Lb/a/a/a/b;", "Ld/r;", "e", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onStart", "onDestroy", "onPause", "", "transit", "", "enter", "nextAnim", "Landroid/view/animation/Animation;", "onCreateAnimation", "(IZI)Landroid/view/animation/Animation;", "Lb/a/a/h/k;", "event", "onFilterEventOld", "(Lb/a/a/h/k;)V", "Lb/a/a/h/i;", "onEnableRotationEvent", "(Lb/a/a/h/i;)V", "Lb/a/a/h/f;", "onDisableRotationEvent", "(Lb/a/a/h/f;)V", "Landroidx/recyclerview/widget/RecyclerView;", "j", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "recyclerView", "m", "Z", "getTransparentLoading", "()Z", "setTransparentLoading", "(Z)V", "transparentLoading", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "l", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getSwipeRefreshLayout", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "setSwipeRefreshLayout", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V", "swipeRefreshLayout", "k", "Landroid/view/View;", "c", "()Landroid/view/View;", "setPageView", "(Landroid/view/View;)V", "pageView", "", "n", "Ljava/lang/String;", "originalRemoteUrl", "o", "I", "currentScrollY", "<init>", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: b.a.a.a.h */
public final class C0605h extends C0594b {

    /* renamed from: p */
    public static final /* synthetic */ int f235p = 0;

    /* renamed from: j */
    public RecyclerView f236j;

    /* renamed from: k */
    public View f237k;

    /* renamed from: l */
    public SwipeRefreshLayout f238l;

    /* renamed from: m */
    public boolean f239m;

    /* renamed from: n */
    public String f240n;

    /* renamed from: o */
    public int f241o;

    /* renamed from: b.a.a.a.h$a */
    public static final class C0606a extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ C0605h f242a;

        /* renamed from: b */
        public final /* synthetic */ Toolbar f243b;

        public C0606a(C0605h hVar, Toolbar toolbar) {
            this.f242a = hVar;
            this.f243b = toolbar;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C6888i.m12438e(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            this.f242a.f241o += i2;
            int computeVerticalScrollExtent = recyclerView.computeVerticalScrollExtent();
            int computeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
            Toolbar toolbar = this.f243b;
            int height = toolbar != null ? toolbar.getHeight() : 0;
            int i3 = computeVerticalScrollRange - computeVerticalScrollExtent;
            if (i3 > height) {
                i3 = height;
            }
            C8091a.f16272d.mo26043a("TOOLBAR extent = %d, range = %d, topbar = %d", Integer.valueOf(computeVerticalScrollExtent), Integer.valueOf(computeVerticalScrollRange), Integer.valueOf(height));
            float f = 1.0f;
            float f2 = (((float) this.f242a.f241o) * 1.0f) / ((float) i3);
            Toolbar toolbar2 = this.f243b;
            if (toolbar2 != null) {
                if (f2 <= 1.0f) {
                    f = f2;
                }
                toolbar2.setAlpha(f);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c8, code lost:
        if (p298d.p344x.p346c.C6888i.m12434a(r6 != null ? r6.f11042j : null, java.lang.Boolean.TRUE) != false) goto L_0x00ca;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m73d(p005b.p006a.p007a.p008a.C0605h r19, boolean r20, boolean r21, int r22) {
        /*
            r0 = r19
            r1 = r22 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r20
        L_0x000b:
            r3 = r22 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r21
        L_0x0013:
            java.util.Objects.requireNonNull(r19)
            r4 = 1
            if (r3 == 0) goto L_0x001b
            r0.f239m = r4
        L_0x001b:
            b.a.a.n.f r3 = p005b.p006a.p007a.p023n.C0817f.f641b
            java.lang.String r3 = "refreshToken"
            java.lang.String r3 = p005b.p006a.p007a.p023n.C0817f.m294b(r3)
            java.lang.String r5 = "expirationTimeMilliseconds"
            java.lang.String r5 = p005b.p006a.p007a.p023n.C0817f.m294b(r5)
            if (r3 == 0) goto L_0x0051
            java.lang.String r6 = ""
            boolean r3 = p298d.p344x.p346c.C6888i.m12434a(r3, r6)
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0051
            if (r5 == 0) goto L_0x0051
            boolean r3 = p298d.p344x.p346c.C6888i.m12434a(r5, r6)
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0051
            boolean r3 = p005b.p038f.p039a.C0849e.m499U()
            if (r3 == 0) goto L_0x0051
            long r5 = java.lang.Long.parseLong(r5)
            long r7 = java.lang.System.currentTimeMillis()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x0051
            r3 = r4
            goto L_0x0052
        L_0x0051:
            r3 = r2
        L_0x0052:
            java.lang.String r5 = "loading"
            r6 = 2131230946(0x7f0800e2, float:1.807796E38)
            java.lang.String r7 = "pageView"
            r8 = 0
            if (r3 == 0) goto L_0x0090
            android.view.View r2 = r0.f237k
            if (r2 == 0) goto L_0x008c
            android.view.View r2 = r2.findViewById(r6)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            if (r1 != 0) goto L_0x006e
            p298d.p344x.p346c.C6888i.m12437d(r2, r5)
            p005b.p006a.p007a.p018i.C0758q.m247l(r2)
        L_0x006e:
            l.a.w r3 = p416l.p417a.C7725h0.f15273a
            l.a.g1 r3 = p416l.p417a.p419u1.C7785l.f15351b
            l.a.o r4 = p005b.p291q.p292a.C5266a.m9959h(r8, r4, r8)
            d.v.f r3 = r3.plus(r4)
            l.a.y r9 = p005b.p291q.p292a.C5266a.m9953g(r3)
            r10 = 0
            r11 = 0
            b.a.a.a.a r12 = new b.a.a.a.a
            r12.<init>(r0, r1, r2, r8)
            r13 = 3
            r14 = 0
            p005b.p291q.p292a.C5266a.m9880S2(r9, r10, r11, r12, r13, r14)
            goto L_0x0159
        L_0x008c:
            p298d.p344x.p346c.C6888i.m12446m(r7)
            throw r8
        L_0x0090:
            android.view.View r3 = r0.f237k
            if (r3 == 0) goto L_0x015a
            android.view.View r3 = r3.findViewById(r6)
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            boolean r6 = r0.f239m
            if (r6 == 0) goto L_0x00a1
            r3.setBackgroundResource(r2)
        L_0x00a1:
            if (r1 != 0) goto L_0x013d
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r6 = r0.f238l
            if (r6 == 0) goto L_0x00aa
            r6.setEnabled(r2)
        L_0x00aa:
            com.appfoundry.previewer.model.Page r2 = p005b.p006a.p007a.p024o.C0823f.m335D()
            com.appfoundry.previewer.model.Page r6 = r0.f210g
            if (r6 == 0) goto L_0x00b7
            com.appfoundry.previewer.model.Page r6 = p005b.p006a.p007a.p018i.C0744e.m207k(r6)
            goto L_0x00b8
        L_0x00b7:
            r6 = r8
        L_0x00b8:
            if (r6 == 0) goto L_0x00ca
            com.appfoundry.previewer.model.Page r6 = r0.f210g
            if (r6 == 0) goto L_0x00c1
            java.lang.Boolean r6 = r6.f11042j
            goto L_0x00c2
        L_0x00c1:
            r6 = r8
        L_0x00c2:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r6, r9)
            if (r6 == 0) goto L_0x013d
        L_0x00ca:
            if (r2 == 0) goto L_0x0137
            com.appfoundry.previewer.model.Page r6 = r0.f210g
            if (r6 == 0) goto L_0x00d3
            java.lang.Boolean r6 = r6.f11042j
            goto L_0x00d4
        L_0x00d3:
            r6 = r8
        L_0x00d4:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r6, r9)
            if (r6 == 0) goto L_0x00e3
            boolean r6 = p005b.p006a.p007a.p024o.C0820c.m302b()
            if (r6 == 0) goto L_0x00e3
            goto L_0x0137
        L_0x00e3:
            android.view.View r5 = r0.f237k
            if (r5 == 0) goto L_0x0133
            p005b.p006a.p007a.p018i.C0758q.m244i(r5)
            android.view.View r5 = r0.f237k
            if (r5 == 0) goto L_0x012f
            java.lang.String r6 = r2.f11033a
            com.appfoundry.previewer.model.Container r9 = r2.f11041i
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            p005b.p006a.p007a.p018i.C0758q.m236a(r5, r6, r9, r14)
            android.view.View r5 = r0.f237k
            if (r5 == 0) goto L_0x012b
            java.lang.String r6 = r2.f11033a
            com.appfoundry.previewer.model.Container r9 = r2.f11036d
            p005b.p006a.p007a.p018i.C0758q.m239d(r5, r6, r9, r14)
            android.view.View r5 = r0.f237k
            if (r5 == 0) goto L_0x0127
            r6 = 2131231131(0x7f08019b, float:1.8078334E38)
            android.view.View r5 = r5.findViewById(r6)
            java.lang.String r6 = "pageView.findViewById(R.id.recyclerView)"
            p298d.p344x.p346c.C6888i.m12437d(r5, r6)
            r10 = r5
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            r0.f236j = r10
            java.lang.String r11 = r2.f11033a
            java.util.List<com.appfoundry.previewer.model.Container> r12 = r2.f11038f
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 116(0x74, float:1.63E-43)
            p005b.p038f.p039a.C0849e.m556z0(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x013d
        L_0x0127:
            p298d.p344x.p346c.C6888i.m12446m(r7)
            throw r8
        L_0x012b:
            p298d.p344x.p346c.C6888i.m12446m(r7)
            throw r8
        L_0x012f:
            p298d.p344x.p346c.C6888i.m12446m(r7)
            throw r8
        L_0x0133:
            p298d.p344x.p346c.C6888i.m12446m(r7)
            throw r8
        L_0x0137:
            p298d.p344x.p346c.C6888i.m12437d(r3, r5)
            p005b.p006a.p007a.p018i.C0758q.m247l(r3)
        L_0x013d:
            l.a.w r2 = p416l.p417a.C7725h0.f15273a
            l.a.g1 r2 = p416l.p417a.p419u1.C7785l.f15351b
            l.a.o r4 = p005b.p291q.p292a.C5266a.m9959h(r8, r4, r8)
            d.v.f r2 = r2.plus(r4)
            l.a.y r9 = p005b.p291q.p292a.C5266a.m9953g(r2)
            r10 = 0
            r11 = 0
            b.a.a.a.d r12 = new b.a.a.a.d
            r12.<init>(r0, r1, r3, r8)
            r13 = 3
            r14 = 0
            p005b.p291q.p292a.C5266a.m9880S2(r9, r10, r11, r12, r13, r14)
        L_0x0159:
            return
        L_0x015a:
            p298d.p344x.p346c.C6888i.m12446m(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p008a.C0605h.m73d(b.a.a.a.h, boolean, boolean, int):void");
    }

    /* renamed from: c */
    public final View mo10333c() {
        View view = this.f237k;
        if (view != null) {
            return view;
        }
        C6888i.m12446m("pageView");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10334e() {
        /*
            r23 = this;
            r0 = r23
            com.appfoundry.previewer.model.Page r1 = r0.f210g
            if (r1 == 0) goto L_0x000e
            java.lang.String r3 = "nomenu"
            boolean r1 = p005b.p006a.p007a.p018i.C0744e.m216t(r1, r3)
            r9 = r1
            goto L_0x000f
        L_0x000e:
            r9 = 0
        L_0x000f:
            androidx.fragment.app.FragmentActivity r1 = r23.getActivity()
            java.lang.String r3 = "menu:tabs"
            r12 = 1
            if (r1 == 0) goto L_0x0065
            r4 = 2131231223(0x7f0801f7, float:1.807852E38)
            java.lang.String r5 = "it"
            if (r9 != 0) goto L_0x0048
            com.appfoundry.previewer.model.Page r6 = r0.f210g
            if (r6 == 0) goto L_0x002a
            boolean r6 = p005b.p006a.p007a.p018i.C0744e.m219w(r6)
            if (r6 != r12) goto L_0x002a
            goto L_0x0048
        L_0x002a:
            p298d.p344x.p346c.C6888i.m12437d(r1, r5)
            java.lang.String r5 = "$this$showTabMenu"
            p298d.p344x.p346c.C6888i.m12438e(r1, r5)
            java.lang.String r5 = p005b.p038f.p039a.C0849e.m490L()
            boolean r5 = p298d.p344x.p346c.C6888i.m12434a(r5, r3)
            if (r5 == 0) goto L_0x0065
            android.view.View r1 = r1.findViewById(r4)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            if (r1 == 0) goto L_0x0065
            p005b.p006a.p007a.p018i.C0758q.m247l(r1)
            goto L_0x0065
        L_0x0048:
            p298d.p344x.p346c.C6888i.m12437d(r1, r5)
            java.lang.String r5 = "$this$hideTabMenu"
            p298d.p344x.p346c.C6888i.m12438e(r1, r5)
            java.lang.String r5 = p005b.p038f.p039a.C0849e.m490L()
            boolean r5 = p298d.p344x.p346c.C6888i.m12434a(r5, r3)
            if (r5 == 0) goto L_0x0065
            android.view.View r1 = r1.findViewById(r4)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            if (r1 == 0) goto L_0x0065
            p005b.p006a.p007a.p018i.C0758q.m240e(r1)
        L_0x0065:
            android.view.View r1 = r0.f237k
            java.lang.String r13 = "pageView"
            if (r1 == 0) goto L_0x0308
            p005b.p006a.p007a.p018i.C0758q.m244i(r1)
            android.view.View r1 = r0.f237k
            if (r1 == 0) goto L_0x0303
            com.appfoundry.previewer.model.Page r4 = r0.f210g
            if (r4 == 0) goto L_0x0079
            java.lang.String r5 = r4.f11033a
            goto L_0x007a
        L_0x0079:
            r5 = 0
        L_0x007a:
            if (r4 == 0) goto L_0x007f
            com.appfoundry.previewer.model.Container r6 = r4.f11041i
            goto L_0x0080
        L_0x007f:
            r6 = 0
        L_0x0080:
            if (r4 == 0) goto L_0x0089
            boolean r4 = r4.f11056x
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x008a
        L_0x0089:
            r4 = 0
        L_0x008a:
            p005b.p006a.p007a.p018i.C0758q.m236a(r1, r5, r6, r4)
            android.view.View r1 = r0.f237k
            if (r1 == 0) goto L_0x02fe
            com.appfoundry.previewer.model.Page r4 = r0.f210g
            if (r4 == 0) goto L_0x0098
            java.lang.String r5 = r4.f11033a
            goto L_0x0099
        L_0x0098:
            r5 = 0
        L_0x0099:
            if (r4 == 0) goto L_0x009e
            com.appfoundry.previewer.model.Container r6 = r4.f11036d
            goto L_0x009f
        L_0x009e:
            r6 = 0
        L_0x009f:
            if (r4 == 0) goto L_0x00a8
            boolean r4 = r4.f11056x
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x00a9
        L_0x00a8:
            r4 = 0
        L_0x00a9:
            androidx.appcompat.widget.Toolbar r1 = p005b.p006a.p007a.p018i.C0758q.m239d(r1, r5, r6, r4)
            android.view.View r4 = r0.f237k
            if (r4 == 0) goto L_0x02f9
            com.appfoundry.previewer.model.Page r5 = r0.f210g
            if (r5 == 0) goto L_0x00b8
            java.lang.String r6 = r5.f11033a
            goto L_0x00b9
        L_0x00b8:
            r6 = 0
        L_0x00b9:
            if (r5 == 0) goto L_0x00be
            java.util.List<com.appfoundry.previewer.model.Container> r5 = r5.f11039g
            goto L_0x00bf
        L_0x00be:
            r5 = 0
        L_0x00bf:
            java.lang.String r7 = "$this$addLayers"
            p298d.p344x.p346c.C6888i.m12438e(r4, r7)
            if (r5 == 0) goto L_0x0169
            r7 = 2131230988(0x7f08010c, float:1.8078044E38)
            android.view.View r7 = r4.findViewById(r7)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            java.util.Iterator r5 = r5.iterator()
        L_0x00d3:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0169
            java.lang.Object r8 = r5.next()
            com.appfoundry.previewer.model.Container r8 = (com.appfoundry.previewer.model.Container) r8
            android.content.Context r10 = r4.getContext()
            java.lang.String r11 = "context"
            p298d.p344x.p346c.C6888i.m12437d(r10, r11)
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            java.lang.String r2 = "$this$createLayerLayout"
            p298d.p344x.p346c.C6888i.m12438e(r8, r2)
            p298d.p344x.p346c.C6888i.m12438e(r10, r11)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r10)
            java.lang.String r12 = r8.f10969c
            com.appfoundry.previewer.model.Style r17 = p005b.p006a.p007a.p024o.C0823f.m345N(r12, r15)
            java.lang.String r12 = "$this$setupAsLayer"
            p298d.p344x.p346c.C6888i.m12438e(r2, r12)
            com.appfoundry.previewer.BravoApp$b r12 = com.appfoundry.previewer.BravoApp.f10730N
            int r12 = com.appfoundry.previewer.BravoApp.f10726J
            java.lang.String r14 = p005b.p038f.p039a.C0849e.m490L()
            boolean r14 = p298d.p344x.p346c.C6888i.m12434a(r14, r3)
            if (r14 == 0) goto L_0x011c
            android.content.Context r14 = r2.getContext()
            p298d.p344x.p346c.C6888i.m12437d(r14, r11)
            int r11 = p005b.p038f.p039a.C0849e.m494P(r14)
            int r12 = r12 - r11
        L_0x011c:
            r19 = r12
            int r18 = p005b.p006a.p007a.p024o.C0820c.m325y()
            r20 = 0
            r21 = 0
            r22 = 24
            r16 = r2
            b.a.a.j.b r11 = p005b.p006a.p007a.p018i.C0758q.m243h(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r12 = "frameLayout"
            p298d.p344x.p346c.C6888i.m12438e(r2, r12)
            java.lang.String r12 = "dimensions"
            p298d.p344x.p346c.C6888i.m12438e(r11, r12)
            p005b.p006a.p007a.p018i.C0744e.m211o(r8)
            int r12 = r11.f514a
            int r14 = r11.f515b
            r21 = r15
            r15 = r8
            r16 = r10
            r17 = r2
            r18 = r12
            r19 = r14
            r20 = r21
            p005b.p006a.p007a.p018i.C0744e.m197a(r15, r16, r17, r18, r19, r20)
            int r12 = r11.f514a
            int r11 = r11.f515b
            r22 = 0
            r17 = r6
            r18 = r2
            r19 = r12
            r20 = r11
            p005b.p006a.p007a.p018i.C0744e.m198b(r15, r16, r17, r18, r19, r20, r21, r22)
            p005b.p006a.p007a.p018i.C0744e.m212p(r8, r6, r2)
            r7.addView(r2)
            r12 = 1
            goto L_0x00d3
        L_0x0169:
            android.view.View r2 = r0.f237k
            if (r2 == 0) goto L_0x02f4
            r3 = 2131231131(0x7f08019b, float:1.8078334E38)
            android.view.View r2 = r2.findViewById(r3)
            java.lang.String r3 = "pageView.findViewById(R.id.recyclerView)"
            p298d.p344x.p346c.C6888i.m12437d(r2, r3)
            r3 = r2
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r0.f236j = r3
            com.appfoundry.previewer.model.Page r2 = r0.f210g
            if (r2 == 0) goto L_0x0185
            java.lang.String r4 = r2.f11033a
            goto L_0x0186
        L_0x0185:
            r4 = 0
        L_0x0186:
            if (r2 == 0) goto L_0x018b
            java.util.List<com.appfoundry.previewer.model.Container> r5 = r2.f11038f
            goto L_0x018c
        L_0x018b:
            r5 = 0
        L_0x018c:
            if (r2 == 0) goto L_0x0191
            com.appfoundry.previewer.model.Animation r6 = r2.f11053u
            goto L_0x0192
        L_0x0191:
            r6 = 0
        L_0x0192:
            if (r2 == 0) goto L_0x019c
            boolean r2 = r2.f11056x
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r7 = r2
            goto L_0x019d
        L_0x019c:
            r7 = 0
        L_0x019d:
            r8 = 0
            r10 = 0
            r11 = 80
            p005b.p038f.p039a.C0849e.m556z0(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.appfoundry.previewer.model.Page r2 = r0.f210g
            if (r2 == 0) goto L_0x01af
            com.appfoundry.previewer.model.Container r2 = r2.f11036d
            if (r2 == 0) goto L_0x01af
            java.lang.String r2 = r2.f10969c
            goto L_0x01b0
        L_0x01af:
            r2 = 0
        L_0x01b0:
            r3 = 2
            r4 = 0
            com.appfoundry.previewer.model.Style r2 = p005b.p006a.p007a.p024o.C0823f.m346O(r2, r4, r3)
            java.lang.String r3 = "recyclerView"
            if (r2 == 0) goto L_0x01d9
            java.lang.String r2 = r2.f11130G
            if (r2 == 0) goto L_0x01d9
            java.lang.String r4 = "showscroll"
            boolean r2 = r2.equals(r4)
            r4 = 1
            if (r2 != r4) goto L_0x01d9
            androidx.recyclerview.widget.RecyclerView r2 = r0.f236j
            if (r2 == 0) goto L_0x01d4
            b.a.a.a.h$a r4 = new b.a.a.a.h$a
            r4.<init>(r0, r1)
            r2.addOnScrollListener(r4)
            goto L_0x01d9
        L_0x01d4:
            p298d.p344x.p346c.C6888i.m12446m(r3)
            r1 = 0
            throw r1
        L_0x01d9:
            java.lang.Boolean r1 = r0.f212i
            if (r1 == 0) goto L_0x01f9
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r2)
            if (r1 == 0) goto L_0x01f9
            androidx.recyclerview.widget.RecyclerView r1 = r0.f236j
            if (r1 == 0) goto L_0x01f4
            java.lang.String r2 = "$this$disableScroll"
            p298d.p344x.p346c.C6888i.m12438e(r1, r2)
            b.a.a.i.n r2 = p005b.p006a.p007a.p018i.C0755n.f484g
            r1.setOnTouchListener(r2)
            goto L_0x01f9
        L_0x01f4:
            p298d.p344x.p346c.C6888i.m12446m(r3)
            r1 = 0
            throw r1
        L_0x01f9:
            com.appfoundry.previewer.model.Page r1 = r0.f210g
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0254
            java.lang.String r4 = "$this$shouldHaveLoadMore"
            p298d.p344x.p346c.C6888i.m12438e(r1, r4)
            java.lang.String r4 = r1.f11043k
            if (r4 == 0) goto L_0x021d
            boolean r4 = p298d.p344x.p346c.C6888i.m12434a(r4, r2)
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x021e
            java.lang.String r1 = r1.f11044l
            if (r1 == 0) goto L_0x021e
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r2)
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x021e
            r1 = r5
            goto L_0x021f
        L_0x021d:
            r5 = 1
        L_0x021e:
            r1 = 0
        L_0x021f:
            if (r1 != r5) goto L_0x0254
            android.view.View r1 = r0.f237k
            if (r1 == 0) goto L_0x024f
            r4 = 2131231002(0x7f08011a, float:1.8078073E38)
            android.view.View r1 = r1.findViewById(r4)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            d.x.c.s r4 = new d.x.c.s
            r4.<init>()
            r4.f13798g = r5
            d.x.c.s r5 = new d.x.c.s
            r5.<init>()
            r6 = 0
            r5.f13798g = r6
            androidx.recyclerview.widget.RecyclerView r6 = r0.f236j
            if (r6 == 0) goto L_0x024a
            b.a.a.a.e r3 = new b.a.a.a.e
            r3.<init>(r0, r4, r5, r1)
            r6.addOnScrollListener(r3)
            goto L_0x0254
        L_0x024a:
            p298d.p344x.p346c.C6888i.m12446m(r3)
            r1 = 0
            throw r1
        L_0x024f:
            r1 = 0
            p298d.p344x.p346c.C6888i.m12446m(r13)
            throw r1
        L_0x0254:
            com.appfoundry.previewer.model.Page r1 = r0.f210g
            if (r1 == 0) goto L_0x02a5
            java.lang.String r3 = "$this$hasPullToRefresh"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r3 = r1.f11043k
            if (r3 == 0) goto L_0x027b
            boolean r3 = p298d.p344x.p346c.C6888i.m12434a(r3, r2)
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x027b
            java.lang.String r3 = "refresh:pull"
            boolean r3 = p005b.p006a.p007a.p018i.C0744e.m216t(r1, r3)
            if (r3 != 0) goto L_0x0279
            java.lang.String r3 = "dev:pullToRefresh"
            boolean r1 = p005b.p006a.p007a.p018i.C0744e.m216t(r1, r3)
            if (r1 == 0) goto L_0x027b
        L_0x0279:
            r1 = 1
            goto L_0x027c
        L_0x027b:
            r1 = 0
        L_0x027c:
            r3 = 1
            if (r1 != r3) goto L_0x02a5
            android.content.Context r1 = r23.getContext()
            if (r1 == 0) goto L_0x0298
            r4 = 2131034147(0x7f050023, float:1.7678803E38)
            int r1 = r1.getColor(r4)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r4 = r0.f238l
            if (r4 == 0) goto L_0x0298
            int[] r5 = new int[r3]
            r3 = 0
            r5[r3] = r1
            r4.setColorSchemeColors(r5)
        L_0x0298:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = r0.f238l
            if (r1 == 0) goto L_0x02ad
            b.a.a.a.f r3 = new b.a.a.a.f
            r3.<init>(r0)
            r1.setOnRefreshListener(r3)
            goto L_0x02ad
        L_0x02a5:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = r0.f238l
            if (r1 == 0) goto L_0x02ad
            r3 = 0
            r1.setEnabled(r3)
        L_0x02ad:
            com.appfoundry.previewer.model.Page r1 = r0.f210g
            if (r1 == 0) goto L_0x02c1
            java.lang.String r3 = "$this$hasRefreshInterval"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.util.List<java.lang.String> r1 = r1.f11045m
            if (r1 == 0) goto L_0x02c1
            java.lang.String r3 = "refresh:interval"
            java.lang.String r14 = p005b.p038f.p039a.C0849e.m495Q(r1, r3)
            goto L_0x02c2
        L_0x02c1:
            r14 = 0
        L_0x02c2:
            if (r14 == 0) goto L_0x02f3
            java.lang.String r1 = p005b.p006a.p007a.p018i.C0756o.m226d(r14)
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r1, r2)
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x02f3
            android.os.Handler r2 = new android.os.Handler     // Catch:{ Exception -> 0x02e6 }
            r2.<init>()     // Catch:{ Exception -> 0x02e6 }
            b.a.a.a.g r3 = new b.a.a.a.g     // Catch:{ Exception -> 0x02e6 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x02e6 }
            long r4 = java.lang.Long.parseLong(r1)     // Catch:{ Exception -> 0x02e6 }
            r1 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r1     // Catch:{ Exception -> 0x02e6 }
            long r4 = r4 * r6
            r2.postDelayed(r3, r4)     // Catch:{ Exception -> 0x02e6 }
            goto L_0x02f3
        L_0x02e6:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r14
            p.a.a$b r2 = p441p.p442a.C8091a.f16272d
            java.lang.String r3 = "Wrong refresh interval: %s"
            r2.mo26044b(r3, r1)
        L_0x02f3:
            return
        L_0x02f4:
            p298d.p344x.p346c.C6888i.m12446m(r13)
            r1 = 0
            throw r1
        L_0x02f9:
            r1 = 0
            p298d.p344x.p346c.C6888i.m12446m(r13)
            throw r1
        L_0x02fe:
            r1 = 0
            p298d.p344x.p346c.C6888i.m12446m(r13)
            throw r1
        L_0x0303:
            r1 = 0
            p298d.p344x.p346c.C6888i.m12446m(r13)
            throw r1
        L_0x0308:
            r1 = 0
            p298d.p344x.p346c.C6888i.m12446m(r13)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p008a.C0605h.mo10334e():void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.animation.Animation onCreateAnimation(int r2, boolean r3, int r4) {
        /*
            r1 = this;
            b.a.a.b.l.c r2 = p005b.p006a.p007a.p009b.p010l.C0639c.f305a
            java.lang.String r2 = "fragment"
            p298d.p344x.p346c.C6888i.m12438e(r1, r2)
            r0 = 0
            if (r3 != 0) goto L_0x0029
            com.appfoundry.previewer.BravoApp$b r3 = com.appfoundry.previewer.BravoApp.f10730N
            boolean r3 = com.appfoundry.previewer.BravoApp.f10722F
            if (r3 == 0) goto L_0x0029
            p298d.p344x.p346c.C6888i.m12438e(r1, r2)
            if (r4 != 0) goto L_0x0016
            goto L_0x003b
        L_0x0016:
            android.content.Context r2 = r1.getContext()     // Catch:{  }
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r2, r4)     // Catch:{  }
            if (r0 == 0) goto L_0x003b
            b.a.a.b.l.a r2 = new b.a.a.b.l.a
            r2.<init>(r1)
            r0.setAnimationListener(r2)
            goto L_0x003b
        L_0x0029:
            android.content.Context r2 = r1.getContext()     // Catch:{ NotFoundException -> 0x003b }
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r2, r4)     // Catch:{ NotFoundException -> 0x003b }
            if (r0 == 0) goto L_0x003b
            b.a.a.b.l.b r2 = new b.a.a.b.l.b
            r2.<init>(r1)
            r0.setAnimationListener(r2)
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p008a.C0605h.onCreateAnimation(int, boolean, int):android.view.animation.Animation");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        if (r4.equals(r6) != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        if (r4.equals(r6) != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        if ((r4 != null ? r4.f11038f : null) == null) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00dd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
        /*
            r3 = this;
            java.lang.String r6 = "inflater"
            p298d.p344x.p346c.C6888i.m12438e(r4, r6)
            androidx.fragment.app.FragmentActivity r6 = r3.getActivity()
            if (r6 == 0) goto L_0x000f
            r0 = 5
            r6.setRequestedOrientation(r0)
        L_0x000f:
            r6 = 2131427396(0x7f0b0044, float:1.8476407E38)
            r0 = 0
            android.view.View r4 = r4.inflate(r6, r5, r0)
            java.lang.String r5 = "inflater.inflate(R.layou…_solid, container, false)"
            p298d.p344x.p346c.C6888i.m12437d(r4, r5)
            r3.f237k = r4
            com.appfoundry.previewer.model.Page r4 = r3.f210g
            r5 = 0
            if (r4 == 0) goto L_0x0038
            java.lang.String r6 = "statusbar"
            java.lang.String r1 = "$this$getTag"
            p298d.p344x.p346c.C6888i.m12438e(r4, r1)
            java.lang.String r1 = "tag"
            p298d.p344x.p346c.C6888i.m12438e(r6, r1)
            java.util.List<java.lang.String> r4 = r4.f11045m
            if (r4 == 0) goto L_0x0038
            java.lang.String r4 = p005b.p038f.p039a.C0849e.m495Q(r4, r6)
            goto L_0x0039
        L_0x0038:
            r4 = r5
        L_0x0039:
            java.lang.String r6 = "$this$setupStatusBar"
            p298d.p344x.p346c.C6888i.m12438e(r3, r6)
            androidx.fragment.app.FragmentActivity r6 = r3.getActivity()
            if (r6 == 0) goto L_0x008d
            androidx.fragment.app.FragmentActivity r6 = r3.getActivity()
            boolean r6 = r6 instanceof androidx.appcompat.app.AppCompatActivity
            if (r6 == 0) goto L_0x008d
            androidx.fragment.app.FragmentActivity r6 = r3.getActivity()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            java.util.Objects.requireNonNull(r6, r1)
            androidx.appcompat.app.AppCompatActivity r6 = (androidx.appcompat.app.AppCompatActivity) r6
            p005b.p038f.p039a.C0849e.m554y0(r6)
            if (r4 != 0) goto L_0x005d
            goto L_0x0081
        L_0x005d:
            int r6 = r4.hashCode()
            r2 = -1046996881(0xffffffffc198186f, float:-19.01193)
            if (r6 == r2) goto L_0x0075
            r2 = 1910451005(0x71df2b3d, float:2.2101577E30)
            if (r6 == r2) goto L_0x006c
            goto L_0x0081
        L_0x006c:
            java.lang.String r6 = "statusbar:light"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0081
            goto L_0x007d
        L_0x0075:
            java.lang.String r6 = "statusbar:dark"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0081
        L_0x007d:
            p005b.p006a.p007a.p018i.C0744e.m196I(r3, r6)
            goto L_0x008d
        L_0x0081:
            androidx.fragment.app.FragmentActivity r4 = r3.getActivity()
            java.util.Objects.requireNonNull(r4, r1)
            androidx.appcompat.app.AppCompatActivity r4 = (androidx.appcompat.app.AppCompatActivity) r4
            p005b.p038f.p039a.C0849e.m512d0(r4)
        L_0x008d:
            com.appfoundry.previewer.model.Page r4 = r3.f210g
            if (r4 == 0) goto L_0x0094
            java.lang.String r4 = r4.f11035c
            goto L_0x0095
        L_0x0094:
            r4 = r5
        L_0x0095:
            p005b.p006a.p007a.p024o.C0820c.m303c(r4)
            android.view.View r4 = r3.f237k
            java.lang.String r6 = "pageView"
            if (r4 == 0) goto L_0x00e2
            r1 = 2131231221(0x7f0801f5, float:1.8078517E38)
            android.view.View r4 = r4.findViewById(r1)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r4 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r4
            r3.f238l = r4
            com.appfoundry.previewer.model.Page r4 = r3.f210g
            if (r4 == 0) goto L_0x00d6
            boolean r4 = p005b.p006a.p007a.p018i.C0744e.m188A(r4)
            r1 = 1
            if (r4 != r1) goto L_0x00d6
            com.appfoundry.previewer.model.Page r4 = r3.f210g
            if (r4 == 0) goto L_0x00bb
            java.lang.String r2 = r4.f11043k
            goto L_0x00bc
        L_0x00bb:
            r2 = r5
        L_0x00bc:
            r3.f240n = r2
            r2 = 3
            if (r4 == 0) goto L_0x00cb
            boolean r4 = p005b.p006a.p007a.p018i.C0744e.m214r(r4)
            if (r4 != r1) goto L_0x00cb
        L_0x00c7:
            m73d(r3, r0, r0, r2)
            goto L_0x00d9
        L_0x00cb:
            com.appfoundry.previewer.model.Page r4 = r3.f210g
            if (r4 == 0) goto L_0x00d2
            java.util.List<com.appfoundry.previewer.model.Container> r4 = r4.f11038f
            goto L_0x00d3
        L_0x00d2:
            r4 = r5
        L_0x00d3:
            if (r4 != 0) goto L_0x00d6
            goto L_0x00c7
        L_0x00d6:
            r3.mo10334e()
        L_0x00d9:
            android.view.View r4 = r3.f237k
            if (r4 == 0) goto L_0x00de
            return r4
        L_0x00de:
            p298d.p344x.p346c.C6888i.m12446m(r6)
            throw r5
        L_0x00e2:
            p298d.p344x.p346c.C6888i.m12446m(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p008a.C0605h.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDestroy() {
        super.onDestroy();
        C6888i.m12438e(this, "$this$unregisterFromEventBus");
        if (C8068c.m14948b().mo26007f(this)) {
            C8068c.m14948b().mo26014m(this);
        }
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onDisableRotationEvent(C0701f fVar) {
        C6888i.m12438e(fVar, "event");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(5);
        }
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onEnableRotationEvent(C0707i iVar) {
        C6888i.m12438e(iVar, "event");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(4);
        }
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onFilterEventOld(C0711k kVar) {
        Iterator<Container> it;
        C0711k kVar2;
        ArrayList arrayList;
        Text text;
        String str;
        Text text2;
        String str2;
        C0605h hVar = this;
        C0711k kVar3 = kVar;
        C6888i.m12438e(kVar3, "event");
        Page page = hVar.f210g;
        if (C6888i.m12434a(page != null ? page.f11033a : null, kVar3.f417b)) {
            Page page2 = hVar.f210g;
            if ((page2 != null ? page2.f11038f : null) != null) {
                ArrayList arrayList2 = new ArrayList();
                Page page3 = hVar.f210g;
                List<Container> list = page3 != null ? page3.f11038f : null;
                C6888i.m12436c(list);
                Iterator<Container> it2 = list.iterator();
                C0711k kVar4 = kVar3;
                while (it2.hasNext()) {
                    Container next = it2.next();
                    List<Component> list2 = next.f10972f;
                    if (list2 != null) {
                        C6888i.m12436c(list2);
                        Iterator<Component> it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Component next2 = it3.next();
                                String str3 = next2.f10940b;
                                if (str3 != null && str3.equals("component:text") && (text2 = next2.f10941c) != null && (str2 = text2.f11168a) != null && C7694h.m13924b(str2, kVar4.f416a, true)) {
                                    arrayList2.add(next);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } else if (next.f10978l != null) {
                        C6888i.m12438e(next, "container");
                        it = it2;
                        ArrayList arrayList3 = arrayList2;
                        Container container = new Container(next.f10967a, next.f10968b, next.f10969c, next.f10970d, next.f10971e, new ArrayList(), next.f10973g, next.f10974h, next.f10975i, next.f10976j, next.f10977k, new ArrayList(), next.f10979m, next.f10980n, next.f10981o);
                        for (Container next3 : next.f10978l) {
                            List<Component> list3 = next3.f10972f;
                            if (list3 != null) {
                                C6888i.m12436c(list3);
                                Iterator<Component> it4 = list3.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    Component next4 = it4.next();
                                    String str4 = next4.f10940b;
                                    if (str4 == null || !str4.equals("component:text") || (text = next4.f10941c) == null || (str = text.f11168a) == null) {
                                        C0711k kVar5 = kVar;
                                    } else if (C7694h.m13924b(str, kVar.f416a, true)) {
                                        List<Container> list4 = container.f10978l;
                                        if (list4 != null) {
                                            list4.add(next3);
                                        }
                                    }
                                }
                            }
                            C0711k kVar6 = kVar;
                        }
                        kVar2 = kVar;
                        List<Container> list5 = container.f10978l;
                        if (list5 == null || !(!list5.isEmpty())) {
                            arrayList = arrayList3;
                        } else {
                            arrayList = arrayList3;
                            arrayList.add(container);
                        }
                        kVar4 = kVar2;
                        arrayList2 = arrayList;
                        kVar3 = kVar2;
                        it2 = it;
                        hVar = this;
                    }
                    kVar2 = kVar3;
                    it = it2;
                    arrayList = arrayList2;
                    arrayList2 = arrayList;
                    kVar3 = kVar2;
                    it2 = it;
                    hVar = this;
                }
                C0605h hVar2 = hVar;
                ArrayList arrayList4 = arrayList2;
                RecyclerView recyclerView = hVar2.f236j;
                if (recyclerView != null) {
                    Page page4 = hVar2.f210g;
                    C0849e.m556z0(recyclerView, page4 != null ? page4.f11033a : null, arrayList4, (Animation) null, page4 != null ? Boolean.valueOf(page4.f11056x) : null, false, false, (Float) null, 116);
                    return;
                }
                C6888i.m12446m("recyclerView");
                throw null;
            }
        }
        C0605h hVar3 = hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: b.a.a.j.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: b.a.a.j.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: b.a.a.j.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: b.a.a.j.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPause() {
        /*
            r6 = this;
            super.onPause()
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.f10730N
            r0.mo18367g()
            b.a.a.j.h r0 = com.appfoundry.previewer.BravoApp.f10720D
            if (r0 == 0) goto L_0x00c3
            boolean r0 = r0.f546e
            if (r0 != 0) goto L_0x00c3
            java.util.Map<java.lang.String, java.util.List<b.a.a.j.a>> r0 = com.appfoundry.previewer.BravoApp.f10719C
            b.a.a.j.h r1 = com.appfoundry.previewer.BravoApp.f10720D
            r2 = 0
            if (r1 == 0) goto L_0x001a
            java.lang.String r1 = r1.f542a
            goto L_0x001b
        L_0x001a:
            r1 = r2
        L_0x001b:
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L_0x004c
            java.util.Iterator r0 = r0.iterator()
        L_0x0028:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0040
            java.lang.Object r3 = r0.next()
            r4 = r3
            b.a.a.j.a r4 = (p005b.p006a.p007a.p019j.C0770a) r4
            java.lang.String r4 = r4.f512c
            java.lang.String r5 = "action:play"
            boolean r4 = p298d.p344x.p346c.C6888i.m12434a(r4, r5)
            if (r4 == 0) goto L_0x0028
            goto L_0x0041
        L_0x0040:
            r3 = r2
        L_0x0041:
            b.a.a.j.a r3 = (p005b.p006a.p007a.p019j.C0770a) r3
            if (r3 == 0) goto L_0x004c
            android.view.View r0 = r3.f513d
            if (r0 == 0) goto L_0x004c
            r0.setVisibility(r1)
        L_0x004c:
            java.util.Map<java.lang.String, java.util.List<b.a.a.j.a>> r0 = com.appfoundry.previewer.BravoApp.f10719C
            b.a.a.j.h r3 = com.appfoundry.previewer.BravoApp.f10720D
            if (r3 == 0) goto L_0x0055
            java.lang.String r3 = r3.f542a
            goto L_0x0056
        L_0x0055:
            r3 = r2
        L_0x0056:
            java.lang.Object r0 = r0.get(r3)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0086
            java.util.Iterator r0 = r0.iterator()
        L_0x0062:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x007a
            java.lang.Object r3 = r0.next()
            r4 = r3
            b.a.a.j.a r4 = (p005b.p006a.p007a.p019j.C0770a) r4
            java.lang.String r4 = r4.f512c
            java.lang.String r5 = "action:pause"
            boolean r4 = p298d.p344x.p346c.C6888i.m12434a(r4, r5)
            if (r4 == 0) goto L_0x0062
            goto L_0x007b
        L_0x007a:
            r3 = r2
        L_0x007b:
            b.a.a.j.a r3 = (p005b.p006a.p007a.p019j.C0770a) r3
            if (r3 == 0) goto L_0x0086
            android.view.View r0 = r3.f513d
            if (r0 == 0) goto L_0x0086
            r0.setVisibility(r1)
        L_0x0086:
            java.util.Map<java.lang.String, java.util.List<b.a.a.j.a>> r0 = com.appfoundry.previewer.BravoApp.f10719C
            b.a.a.j.h r1 = com.appfoundry.previewer.BravoApp.f10720D
            if (r1 == 0) goto L_0x008f
            java.lang.String r1 = r1.f542a
            goto L_0x0090
        L_0x008f:
            r1 = r2
        L_0x0090:
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00c3
            java.util.Iterator r0 = r0.iterator()
        L_0x009c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00b4
            java.lang.Object r1 = r0.next()
            r3 = r1
            b.a.a.j.a r3 = (p005b.p006a.p007a.p019j.C0770a) r3
            java.lang.String r3 = r3.f512c
            java.lang.String r4 = "audio:currenttime"
            boolean r3 = p298d.p344x.p346c.C6888i.m12434a(r3, r4)
            if (r3 == 0) goto L_0x009c
            r2 = r1
        L_0x00b4:
            b.a.a.j.a r2 = (p005b.p006a.p007a.p019j.C0770a) r2
            if (r2 == 0) goto L_0x00c3
            android.view.View r0 = r2.f513d
            if (r0 == 0) goto L_0x00c3
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "0:00"
            r0.setText(r1)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p008a.C0605h.onPause():void");
    }

    public void onStart() {
        super.onStart();
        C6888i.m12438e(this, "$this$registerInEventBus");
        if (!C8068c.m14948b().mo26007f(this)) {
            C8068c.m14948b().mo26012k(this);
        }
    }
}
