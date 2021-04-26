package p005b.p006a.p007a.p018i;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.motion.widget.Key;
import androidx.recyclerview.widget.RecyclerView;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.model.Animation;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Page;
import com.appfoundry.previewer.model.Style;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;
import p005b.p006a.p007a.p017h.C0719o;
import p005b.p006a.p007a.p019j.C0771b;
import p005b.p006a.p007a.p024o.C0820c;
import p005b.p038f.p039a.C0849e;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;
import p437o.p438a.p439a.C8068c;

/* renamed from: b.a.a.i.q */
public final class C0758q {

    /* renamed from: b.a.a.i.q$a */
    public static final class C0759a implements View.OnClickListener {

        /* renamed from: g */
        public final /* synthetic */ TextView f486g;

        /* renamed from: h */
        public final /* synthetic */ String f487h;

        /* renamed from: i */
        public final /* synthetic */ String f488i;

        public C0759a(TextView textView, String str, String str2) {
            this.f486g = textView;
            this.f487h = str;
            this.f488i = str2;
        }

        public final void onClick(View view) {
            C8068c.m14948b().mo26008g(new C0719o(this.f487h, this.f488i, this.f486g));
        }
    }

    /* renamed from: a */
    public static final void m236a(View view, String str, Container container, Boolean bool) {
        C6888i.m12438e(view, "$this$addPageBackground");
        if (container != null) {
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.page_background);
            BravoApp.C5403b bVar = BravoApp.f10730N;
            int i = BravoApp.f10726J;
            Context context = view.getContext();
            C6888i.m12437d(frameLayout, "backgroundParent");
            C0744e.m199c(container, context, str, frameLayout, C0820c.m325y(), i, bool, 0, false, 192);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m237b(View view, String str, Container container, Boolean bool, int i) {
        m236a(view, str, container, (i & 4) != 0 ? Boolean.FALSE : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: android.graphics.Shader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: android.graphics.RadialGradient} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.View m238c(android.view.View r18, com.appfoundry.previewer.model.Style r19, int r20, int r21, int r22) {
        /*
            r8 = r18
            r9 = r19
            java.lang.String r0 = "$this$addRadialGradient"
            p298d.p344x.p346c.C6888i.m12438e(r8, r0)
            r5 = 0
            r7 = 8
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r6 = r22
            m243h(r1, r2, r3, r4, r5, r6, r7)
            android.view.ViewGroup$LayoutParams r0 = r18.getLayoutParams()
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            java.util.Objects.requireNonNull(r0, r1)
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r1 = r20
            r2 = r21
            com.appfoundry.previewer.model.Size r0 = p005b.p038f.p039a.C0849e.m498T(r0, r1, r2)
            java.lang.Integer r3 = r0.f11109a
            if (r3 == 0) goto L_0x0034
            int r1 = r3.intValue()
        L_0x0034:
            java.lang.Integer r0 = r0.f11110b
            if (r0 == 0) goto L_0x003d
            int r0 = r0.intValue()
            goto L_0x003e
        L_0x003d:
            r0 = r2
        L_0x003e:
            r2 = 0
            if (r9 == 0) goto L_0x0046
            com.appfoundry.previewer.model.Coordinate r3 = p005b.p038f.p039a.C0849e.m482H(r9, r1, r0)
            goto L_0x0047
        L_0x0046:
            r3 = r2
        L_0x0047:
            if (r9 == 0) goto L_0x004d
            d.j r2 = p005b.p038f.p039a.C0849e.m493O(r19)
        L_0x004d:
            android.graphics.drawable.ShapeDrawable r4 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.RectShape r5 = new android.graphics.drawable.shapes.RectShape
            r5.<init>()
            r4.<init>(r5)
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x00cb
            A r7 = r2.f13681g
            int[] r7 = (int[]) r7
            int r7 = r7.length
            if (r7 != 0) goto L_0x0064
            r7 = r6
            goto L_0x0065
        L_0x0064:
            r7 = r5
        L_0x0065:
            r7 = r7 ^ r6
            if (r7 == 0) goto L_0x00cb
            B r7 = r2.f13682h
            float[] r7 = (float[]) r7
            int r7 = r7.length
            if (r7 != 0) goto L_0x0071
            r7 = r6
            goto L_0x0072
        L_0x0071:
            r7 = r5
        L_0x0072:
            r7 = r7 ^ r6
            if (r7 == 0) goto L_0x00cb
            android.graphics.Paint r7 = r4.getPaint()
            java.lang.String r10 = "gradientDrawable.paint"
            p298d.p344x.p346c.C6888i.m12437d(r7, r10)
            android.graphics.RadialGradient r10 = new android.graphics.RadialGradient     // Catch:{ Exception -> 0x00b0 }
            r11 = 0
            if (r3 == 0) goto L_0x008c
            java.lang.Float r12 = r3.f10982a     // Catch:{ Exception -> 0x00b0 }
            if (r12 == 0) goto L_0x008c
            float r12 = r12.floatValue()     // Catch:{ Exception -> 0x00b0 }
            goto L_0x008d
        L_0x008c:
            r12 = r11
        L_0x008d:
            if (r3 == 0) goto L_0x0099
            java.lang.Float r3 = r3.f10983b     // Catch:{ Exception -> 0x00b0 }
            if (r3 == 0) goto L_0x0099
            float r3 = r3.floatValue()     // Catch:{ Exception -> 0x00b0 }
            r13 = r3
            goto L_0x009a
        L_0x0099:
            r13 = r11
        L_0x009a:
            float r14 = p005b.p038f.p039a.C0849e.m517g(r9, r1, r0)     // Catch:{ Exception -> 0x00b0 }
            A r0 = r2.f13681g     // Catch:{ Exception -> 0x00b0 }
            r15 = r0
            int[] r15 = (int[]) r15     // Catch:{ Exception -> 0x00b0 }
            B r0 = r2.f13682h     // Catch:{ Exception -> 0x00b0 }
            r16 = r0
            float[] r16 = (float[]) r16     // Catch:{ Exception -> 0x00b0 }
            android.graphics.Shader$TileMode r17 = android.graphics.Shader.TileMode.CLAMP     // Catch:{ Exception -> 0x00b0 }
            r11 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00b0 }
            goto L_0x00c5
        L_0x00b0:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r0.getLocalizedMessage()
            r1[r5] = r0
            p.a.a$b r0 = p441p.p442a.C8091a.f16272d
            java.lang.String r2 = "Exception with linear gradient: %s"
            r0.mo26044b(r2, r1)
            android.graphics.Shader r10 = new android.graphics.Shader
            r10.<init>()
        L_0x00c5:
            r7.setShader(r10)
            r8.setBackground(r4)
        L_0x00cb:
            if (r9 == 0) goto L_0x00e2
            boolean r0 = p005b.p038f.p039a.C0849e.m503Y(r19)
            if (r0 != r6) goto L_0x00e2
            java.lang.Integer r0 = r9.f11138O
            if (r0 == 0) goto L_0x00db
            int r5 = r0.intValue()
        L_0x00db:
            android.graphics.drawable.Drawable r0 = p005b.p038f.p039a.C0849e.m529m(r9, r5)
            r8.setForeground(r0)
        L_0x00e2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p018i.C0758q.m238c(android.view.View, com.appfoundry.previewer.model.Style, int, int, int):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if ((r11 != null ? r11.f10973g : null) != null) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e1  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.appcompat.widget.Toolbar m239d(android.view.View r20, java.lang.String r21, com.appfoundry.previewer.model.Container r22, java.lang.Boolean r23) {
        /*
            r0 = r20
            r11 = r22
            java.lang.String r1 = "$this$addTopBar"
            p298d.p344x.p346c.C6888i.m12438e(r0, r1)
            r12 = 0
            if (r11 == 0) goto L_0x000f
            java.util.List<com.appfoundry.previewer.model.Component> r1 = r11.f10972f
            goto L_0x0010
        L_0x000f:
            r1 = r12
        L_0x0010:
            if (r1 != 0) goto L_0x001a
            if (r11 == 0) goto L_0x0017
            com.appfoundry.previewer.model.Container r1 = r11.f10973g
            goto L_0x0018
        L_0x0017:
            r1 = r12
        L_0x0018:
            if (r1 == 0) goto L_0x0156
        L_0x001a:
            r1 = 2131231292(0x7f08023c, float:1.807866E38)
            android.view.View r1 = r0.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x0156
            r2 = 2131427469(0x7f0b008d, float:1.8476555E38)
            r1.setLayoutResource(r2)
            r1.inflate()
            r1 = 2131231267(0x7f080223, float:1.807861E38)
            android.view.View r1 = r0.findViewById(r1)
            r13 = r1
            androidx.appcompat.widget.Toolbar r13 = (androidx.appcompat.widget.Toolbar) r13
            android.content.Context r7 = r20.getContext()
            java.lang.String r1 = "topBar"
            p298d.p344x.p346c.C6888i.m12437d(r13, r1)
            java.lang.String r2 = "$this$createToolbarLayout"
            p298d.p344x.p346c.C6888i.m12438e(r11, r2)
            p298d.p344x.p346c.C6888i.m12438e(r13, r1)
            java.lang.String r2 = r11.f10969c
            r8 = r23
            com.appfoundry.previewer.model.Style r14 = p005b.p006a.p007a.p024o.C0823f.m345N(r2, r8)
            r15 = 0
            if (r14 == 0) goto L_0x005a
            int r2 = p005b.p038f.p039a.C0849e.m550w0(r14)
            r9 = r2
            goto L_0x005b
        L_0x005a:
            r9 = r15
        L_0x005b:
            if (r14 == 0) goto L_0x006d
            java.util.List<java.lang.String> r2 = r11.f10976j
            if (r2 == 0) goto L_0x0066
            boolean r2 = p005b.p038f.p039a.C0849e.m500V(r2)
            goto L_0x0067
        L_0x0066:
            r2 = r15
        L_0x0067:
            int r2 = p005b.p038f.p039a.C0849e.m468A(r14, r2)
            r10 = r2
            goto L_0x006e
        L_0x006d:
            r10 = r15
        L_0x006e:
            android.view.ViewGroup$LayoutParams r2 = r13.getLayoutParams()
            boolean r2 = r2 instanceof com.google.android.material.appbar.AppBarLayout.LayoutParams
            if (r2 == 0) goto L_0x007c
            com.google.android.material.appbar.AppBarLayout$LayoutParams r2 = new com.google.android.material.appbar.AppBarLayout$LayoutParams
            r2.<init>((int) r9, (int) r10)
            goto L_0x0089
        L_0x007c:
            android.view.ViewGroup$LayoutParams r2 = r13.getLayoutParams()
            boolean r2 = r2 instanceof android.widget.FrameLayout.LayoutParams
            if (r2 == 0) goto L_0x008c
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r9, r10)
        L_0x0089:
            r13.setLayoutParams(r2)
        L_0x008c:
            r2 = 2131231268(0x7f080224, float:1.8078612E38)
            android.view.View r2 = r13.findViewById(r2)
            r6 = r2
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r2 = 2131231093(0x7f080175, float:1.8078257E38)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r6.setTag(r2, r3)
            java.lang.String r2 = "topBarParentFrameLayout"
            p298d.p344x.p346c.C6888i.m12437d(r6, r2)
            com.appfoundry.previewer.model.Container r2 = r11.f10973g
            java.lang.String r3 = "$this$handleNotchIfFlagActive"
            p298d.p344x.p346c.C6888i.m12438e(r6, r3)
            p298d.p344x.p346c.C6888i.m12438e(r13, r1)
            b.a.a.i.i r1 = new b.a.a.i.i
            r1.<init>(r6, r13, r2)
            r6.addOnLayoutChangeListener(r1)
            r1 = r22
            r2 = r7
            r3 = r6
            r4 = r9
            r5 = r10
            r16 = r6
            r6 = r23
            p005b.p006a.p007a.p018i.C0744e.m197a(r1, r2, r3, r4, r5, r6)
            r17 = 0
            r18 = 0
            r19 = 192(0xc0, float:2.69E-43)
            r3 = r21
            r4 = r16
            r5 = r9
            r6 = r10
            r7 = r23
            r8 = r17
            r9 = r18
            r10 = r19
            p005b.p006a.p007a.p018i.C0744e.m199c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            boolean r1 = r1 instanceof com.google.android.material.appbar.AppBarLayout.LayoutParams
            if (r1 == 0) goto L_0x0124
            if (r14 == 0) goto L_0x00e6
            java.lang.String r1 = r14.f11130G
            goto L_0x00e7
        L_0x00e6:
            r1 = r12
        L_0x00e7:
            java.lang.String r2 = "scroll"
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r2)
            java.lang.String r2 = "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams"
            if (r1 != 0) goto L_0x0112
            if (r14 == 0) goto L_0x00f6
            java.lang.String r1 = r14.f11130G
            goto L_0x00f7
        L_0x00f6:
            r1 = r12
        L_0x00f7:
            java.lang.String r3 = "hidescroll"
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r3)
            if (r1 == 0) goto L_0x0100
            goto L_0x0112
        L_0x0100:
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            java.util.Objects.requireNonNull(r1, r2)
            com.google.android.material.appbar.AppBarLayout$LayoutParams r1 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r1
            java.lang.String r2 = "$this$setFixedToolbarOnScroll"
            p298d.p344x.p346c.C6888i.m12438e(r1, r2)
            r1.setScrollFlags(r15)
            goto L_0x0124
        L_0x0112:
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            java.util.Objects.requireNonNull(r1, r2)
            com.google.android.material.appbar.AppBarLayout$LayoutParams r1 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r1
            java.lang.String r2 = "$this$setScrollToolbarOnScroll"
            p298d.p344x.p346c.C6888i.m12438e(r1, r2)
            r2 = 5
            r1.setScrollFlags(r2)
        L_0x0124:
            java.lang.String r1 = r11.f10969c
            r2 = 2
            com.appfoundry.previewer.model.Style r1 = p005b.p006a.p007a.p024o.C0823f.m346O(r1, r12, r2)
            if (r1 == 0) goto L_0x0135
            java.lang.Boolean r1 = r1.f11161v
            if (r1 == 0) goto L_0x0135
            boolean r15 = r1.booleanValue()
        L_0x0135:
            r1 = 2131231221(0x7f0801f5, float:1.8078517E38)
            android.view.View r0 = r0.findViewById(r1)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r0
            if (r15 != 0) goto L_0x0155
            if (r0 == 0) goto L_0x0155
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams"
            java.util.Objects.requireNonNull(r0, r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r1 = new com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior
            r1.<init>()
            r0.setBehavior(r1)
        L_0x0155:
            return r13
        L_0x0156:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p018i.C0758q.m239d(android.view.View, java.lang.String, com.appfoundry.previewer.model.Container, java.lang.Boolean):androidx.appcompat.widget.Toolbar");
    }

    /* renamed from: e */
    public static final void m240e(View view) {
        C6888i.m12438e(view, "$this$hide");
        view.setVisibility(8);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0264, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0265, code lost:
        r0.setHint(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x027a, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x027b, code lost:
        r6.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0310, code lost:
        if (r9.equals("component:input-url") != false) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x031d, code lost:
        r6.setInputType(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x032a, code lost:
        if (r9.equals("component:date") != false) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x036a, code lost:
        if (r9.equals("component:input-date") != false) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x036c, code lost:
        r0 = (android.widget.EditText) r6;
        r7 = r0.getContext();
        p298d.p344x.p346c.C6888i.m12437d(r7, com.segment.analytics.integrations.BasePayload.CONTEXT_KEY);
        p298d.p344x.p346c.C6888i.m12438e(r0, "$this$transformIntoDatePicker");
        p298d.p344x.p346c.C6888i.m12438e(r7, com.segment.analytics.integrations.BasePayload.CONTEXT_KEY);
        r0.setClickable(true);
        r0.setShowSoftInputOnFocus(false);
        r0.setCursorVisible(false);
        r0.setOnFocusChangeListener(new p005b.p006a.p007a.p018i.C0760r(r0));
        r3 = java.util.Calendar.getInstance();
        r23 = "(this as java.lang.String).toLowerCase(locale)";
        r26 = "strike";
        r0.setOnClickListener(new p005b.p006a.p007a.p018i.C0761s(r7, new p005b.p006a.p007a.p018i.C0762t(r0, r3), r3, (java.util.Date) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03c5, code lost:
        r6.setInputType(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0023, code lost:
        r1 = r8.f11168a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d5, code lost:
        if (r2.equals("center") != false) goto L_0x00d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x05c8  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x05f1  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x05f7  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x061f  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0633  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0642  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x060e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0630 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0175  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.View m241f(android.widget.TextView r18, java.lang.String r19, java.lang.String r20, com.appfoundry.previewer.model.Style r21, int r22, int r23, com.appfoundry.previewer.model.Text r24, boolean r25, boolean r26, int r27, java.lang.String r28, java.util.List<com.appfoundry.previewer.model.RichText> r29, java.lang.String r30, java.lang.String r31) {
        /*
            r6 = r18
            r7 = r21
            r8 = r24
            r9 = r28
            r10 = r29
            r11 = r30
            java.lang.String r0 = "$this$setup"
            p298d.p344x.p346c.C6888i.m12438e(r6, r0)
            r0 = r18
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r25
            r5 = r27
            m242g(r0, r1, r2, r3, r4, r5)
            r0 = 0
            if (r8 == 0) goto L_0x002c
            java.lang.String r1 = r8.f11168a
            if (r1 == 0) goto L_0x002c
            java.lang.String r1 = p005b.p006a.p007a.p018i.C0756o.m235m(r1)
            goto L_0x002d
        L_0x002c:
            r1 = r0
        L_0x002d:
            if (r7 == 0) goto L_0x0038
            java.lang.String r2 = r7.f11141b
            if (r2 == 0) goto L_0x0038
            int r2 = p005b.p006a.p007a.p018i.C0756o.m233k(r2)
            goto L_0x003a
        L_0x0038:
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x003a:
            boolean r3 = r6 instanceof android.widget.EditText
            r4 = 4
            r5 = 0
            if (r3 == 0) goto L_0x004a
            r11 = r6
            android.widget.EditText r11 = (android.widget.EditText) r11
            r11.setHint(r1)
            r6.setHintTextColor(r2)
            goto L_0x009a
        L_0x004a:
            if (r11 == 0) goto L_0x0070
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "<a href="
            r12.append(r13)
            r12.append(r11)
            r11 = 62
            r12.append(r11)
            r12.append(r1)
            java.lang.String r11 = r12.toString()
            android.text.Spanned r11 = android.text.Html.fromHtml(r11)
            r6.setText(r11)
            r6.setLinkTextColor(r2)
            goto L_0x008d
        L_0x0070:
            java.lang.String r11 = "html"
            r12 = r31
            boolean r11 = p298d.p344x.p346c.C6888i.m12434a(r12, r11)
            if (r11 == 0) goto L_0x0095
            if (r1 == 0) goto L_0x0085
            java.lang.String r11 = "”"
            java.lang.String r12 = "\""
            java.lang.String r11 = p298d.p415c0.C7694h.m13944v(r1, r11, r12, r5, r4)
            goto L_0x0086
        L_0x0085:
            r11 = r0
        L_0x0086:
            android.text.Spanned r11 = android.text.Html.fromHtml(r11)
            r6.setText(r11)
        L_0x008d:
            android.text.method.MovementMethod r11 = android.text.method.LinkMovementMethod.getInstance()
            r6.setMovementMethod(r11)
            goto L_0x009a
        L_0x0095:
            android.widget.TextView$BufferType r11 = android.widget.TextView.BufferType.EDITABLE
            r6.setText(r1, r11)
        L_0x009a:
            r6.setTextColor(r2)
            if (r7 == 0) goto L_0x00a2
            java.lang.String r2 = r7.f11153n
            goto L_0x00a3
        L_0x00a2:
            r2 = r0
        L_0x00a3:
            r11 = 2
            if (r2 != 0) goto L_0x00a7
            goto L_0x00d8
        L_0x00a7:
            int r12 = r2.hashCode()
            r13 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r12 == r13) goto L_0x00cf
            r4 = 3317767(0x32a007, float:4.649182E-39)
            if (r12 == r4) goto L_0x00c5
            r4 = 108511772(0x677c21c, float:4.6598146E-35)
            if (r12 == r4) goto L_0x00bb
            goto L_0x00d8
        L_0x00bb:
            java.lang.String r4 = "right"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00d8
            r4 = 3
            goto L_0x00d9
        L_0x00c5:
            java.lang.String r4 = "left"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00d8
            r4 = r11
            goto L_0x00d9
        L_0x00cf:
            java.lang.String r12 = "center"
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r4 = r5
        L_0x00d9:
            r6.setTextAlignment(r4)
            if (r7 == 0) goto L_0x00e1
            java.lang.String r2 = r7.f11155p
            goto L_0x00e2
        L_0x00e1:
            r2 = r0
        L_0x00e2:
            if (r2 != 0) goto L_0x00e5
            goto L_0x010a
        L_0x00e5:
            int r4 = r2.hashCode()
            r12 = -1704601170(0xffffffff9a65d9ae, float:-4.753193E-23)
            if (r4 == r12) goto L_0x00ff
            r12 = -1245812558(0xffffffffb5be68b2, float:-1.4186573E-6)
            if (r4 == r12) goto L_0x00f4
            goto L_0x010a
        L_0x00f4:
            java.lang.String r4 = "from-top"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x010a
            r2 = 48
            goto L_0x010c
        L_0x00ff:
            java.lang.String r4 = "from-bottom"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x010a
            r2 = 80
            goto L_0x010c
        L_0x010a:
            r2 = 16
        L_0x010c:
            if (r7 == 0) goto L_0x0111
            java.lang.String r4 = r7.f11154o
            goto L_0x0112
        L_0x0111:
            r4 = r0
        L_0x0112:
            r12 = 1
            if (r4 != 0) goto L_0x0116
            goto L_0x013d
        L_0x0116:
            int r13 = r4.hashCode()
            r14 = 34268234(0x20ae44a, float:1.0204155E-37)
            if (r13 == r14) goto L_0x0131
            r14 = 1067976249(0x3fa80639, float:1.3126899)
            if (r13 == r14) goto L_0x0125
            goto L_0x013d
        L_0x0125:
            java.lang.String r13 = "from-right"
            boolean r4 = r4.equals(r13)
            if (r4 == 0) goto L_0x013d
            r4 = 8388613(0x800005, float:1.175495E-38)
            goto L_0x013e
        L_0x0131:
            java.lang.String r13 = "from-left"
            boolean r4 = r4.equals(r13)
            if (r4 == 0) goto L_0x013d
            r4 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x013e
        L_0x013d:
            r4 = r12
        L_0x013e:
            r2 = r2 | r4
            r6.setGravity(r2)
            if (r7 == 0) goto L_0x0147
            java.lang.String r2 = r7.f11144e
            goto L_0x0148
        L_0x0147:
            r2 = r0
        L_0x0148:
            if (r2 == 0) goto L_0x0155
            b.a.a.n.a r2 = p005b.p006a.p007a.p023n.C0801a.f597b
            java.lang.String r4 = r7.f11144e
            android.graphics.Typeface r2 = p005b.p006a.p007a.p023n.C0801a.m267a(r2, r4, r5, r11)
            r6.setTypeface(r2)
        L_0x0155:
            r2 = 0
            if (r7 == 0) goto L_0x0161
            java.lang.Float r4 = r7.f11145f
            if (r4 == 0) goto L_0x0161
            float r4 = r4.floatValue()
            goto L_0x0162
        L_0x0161:
            r4 = r2
        L_0x0162:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x016d
            float r5 = p005b.p006a.p007a.p024o.C0820c.m323w(r4)
            r6.setTextSize(r5)
        L_0x016d:
            int r5 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            r13 = 1120403456(0x42c80000, float:100.0)
            if (r5 < r11) goto L_0x0198
            if (r7 == 0) goto L_0x017a
            java.lang.Float r11 = r7.f11146g
            goto L_0x017b
        L_0x017a:
            r11 = r0
        L_0x017b:
            if (r11 == 0) goto L_0x0198
            android.text.TextPaint r11 = r18.getPaint()
            int r11 = r11.getFontMetricsInt(r0)
            java.lang.Float r14 = r7.f11146g
            float r14 = r14.floatValue()
            float r14 = p005b.p006a.p007a.p024o.C0820c.m305e(r14)
            float r14 = r14 / r13
            float r14 = r14 * r4
            float r4 = (float) r11
            float r14 = r14 - r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r6.setLineSpacing(r14, r4)
        L_0x0198:
            if (r7 == 0) goto L_0x019d
            com.appfoundry.previewer.model.Shadow r4 = r7.f11165z
            goto L_0x019e
        L_0x019d:
            r4 = r0
        L_0x019e:
            if (r4 == 0) goto L_0x01c0
            b.a.a.j.k r4 = p005b.p038f.p039a.C0849e.m492N(r21, r22, r23)
            android.text.TextPaint r11 = r18.getPaint()
            float r14 = r4.f555e
            float r15 = r4.f556f
            float r13 = r4.f557g
            int r16 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r16 >= 0) goto L_0x01b3
            goto L_0x01b4
        L_0x01b3:
            r2 = r13
        L_0x01b4:
            int r4 = r4.f554d
            r11.setShadowLayer(r14, r15, r2, r4)
            r2 = 27
            if (r5 > r2) goto L_0x01c0
            r6.setLayerType(r12, r0)
        L_0x01c0:
            if (r26 == 0) goto L_0x01cb
            r2 = 2
            r6.setLines(r2)
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r6.setEllipsize(r2)
        L_0x01cb:
            if (r7 == 0) goto L_0x01cf
            java.lang.String r0 = r7.f11127D
        L_0x01cf:
            java.lang.String r2 = "upper"
            java.lang.String r4 = "title"
            java.lang.String r11 = "lower"
            java.lang.String r13 = "(this as java.lang.String).toUpperCase(locale)"
            java.lang.String r14 = "(this as java.lang.String).toLowerCase(locale)"
            java.lang.String r15 = "Locale.getDefault()"
            if (r0 == 0) goto L_0x027e
            java.lang.String r0 = r7.f11127D
            if (r0 != 0) goto L_0x01e3
            goto L_0x027e
        L_0x01e3:
            int r16 = r0.hashCode()
            switch(r16) {
                case 103164673: goto L_0x0244;
                case 110371416: goto L_0x022b;
                case 111499426: goto L_0x01fb;
                case 1229499161: goto L_0x01ec;
                default: goto L_0x01ea;
            }
        L_0x01ea:
            goto L_0x027e
        L_0x01ec:
            java.lang.String r1 = "small_caps"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x027e
            java.lang.String r0 = "smcp"
            r6.setFontFeatureSettings(r0)
            goto L_0x027e
        L_0x01fb:
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x027e
            r6.setAllCaps(r12)
            if (r3 == 0) goto L_0x021a
            r0 = r6
            android.widget.EditText r0 = (android.widget.EditText) r0
            if (r1 == 0) goto L_0x0264
            java.util.Locale r12 = java.util.Locale.getDefault()
            p298d.p344x.p346c.C6888i.m12437d(r12, r15)
            java.lang.String r1 = r1.toUpperCase(r12)
            p298d.p344x.p346c.C6888i.m12437d(r1, r13)
            goto L_0x0265
        L_0x021a:
            if (r1 == 0) goto L_0x027a
            java.util.Locale r0 = java.util.Locale.getDefault()
            p298d.p344x.p346c.C6888i.m12437d(r0, r15)
            java.lang.String r0 = r1.toUpperCase(r0)
            p298d.p344x.p346c.C6888i.m12437d(r0, r13)
            goto L_0x027b
        L_0x022b:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x027e
            if (r3 == 0) goto L_0x023d
            r0 = r6
            android.widget.EditText r0 = (android.widget.EditText) r0
            if (r1 == 0) goto L_0x0264
            java.lang.String r1 = p005b.p006a.p007a.p018i.C0756o.m234l(r1)
            goto L_0x0265
        L_0x023d:
            if (r1 == 0) goto L_0x027a
            java.lang.String r0 = p005b.p006a.p007a.p018i.C0756o.m234l(r1)
            goto L_0x027b
        L_0x0244:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x027e
            r0 = 0
            r6.setAllCaps(r0)
            if (r3 == 0) goto L_0x0269
            r0 = r6
            android.widget.EditText r0 = (android.widget.EditText) r0
            if (r1 == 0) goto L_0x0264
            java.util.Locale r12 = java.util.Locale.getDefault()
            p298d.p344x.p346c.C6888i.m12437d(r12, r15)
            java.lang.String r1 = r1.toLowerCase(r12)
            p298d.p344x.p346c.C6888i.m12437d(r1, r14)
            goto L_0x0265
        L_0x0264:
            r1 = 0
        L_0x0265:
            r0.setHint(r1)
            goto L_0x027e
        L_0x0269:
            if (r1 == 0) goto L_0x027a
            java.util.Locale r0 = java.util.Locale.getDefault()
            p298d.p344x.p346c.C6888i.m12437d(r0, r15)
            java.lang.String r0 = r1.toLowerCase(r0)
            p298d.p344x.p346c.C6888i.m12437d(r0, r14)
            goto L_0x027b
        L_0x027a:
            r0 = 0
        L_0x027b:
            r6.setText(r0)
        L_0x027e:
            if (r7 == 0) goto L_0x0283
            java.lang.String r0 = r7.f11128E
            goto L_0x0284
        L_0x0283:
            r0 = 0
        L_0x0284:
            java.lang.String r1 = "strike"
            java.lang.String r12 = "underline"
            r22 = r13
            r13 = 8
            if (r0 == 0) goto L_0x02b2
            java.lang.String r0 = r7.f11128E
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r12)
            if (r0 == 0) goto L_0x029e
            int r0 = r18.getPaintFlags()
            r0 = r0 | r13
            r16 = 16
            goto L_0x02ae
        L_0x029e:
            java.lang.String r0 = r7.f11128E
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r1)
            if (r0 == 0) goto L_0x02b2
            int r0 = r18.getPaintFlags()
            r16 = 16
            r0 = r0 | 16
        L_0x02ae:
            r6.setPaintFlags(r0)
            goto L_0x02b4
        L_0x02b2:
            r16 = 16
        L_0x02b4:
            if (r7 == 0) goto L_0x02b9
            java.lang.Float r0 = r7.f11147h
            goto L_0x02ba
        L_0x02b9:
            r0 = 0
        L_0x02ba:
            if (r0 == 0) goto L_0x02cb
            java.lang.Float r0 = r7.f11147h
            float r0 = r0.floatValue()
            r17 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r17
            float r13 = (float) r13
            float r0 = r0 * r13
            r6.setLetterSpacing(r0)
        L_0x02cb:
            r0 = 1
            r6.setClipToOutline(r0)
            if (r3 == 0) goto L_0x0405
            if (r7 == 0) goto L_0x02e1
            boolean r0 = p005b.p038f.p039a.C0849e.m503Y(r21)
            if (r0 != 0) goto L_0x02e1
            r0 = r6
            android.widget.EditText r0 = (android.widget.EditText) r0
            r3 = 0
            r0.setBackground(r3)
            goto L_0x02e2
        L_0x02e1:
            r3 = 0
        L_0x02e2:
            r0 = 0
            r6.setPadding(r0, r0, r0, r0)
            r0 = 29
            if (r5 != r0) goto L_0x02f0
            r0 = r6
            android.widget.EditText r0 = (android.widget.EditText) r0
            r0.setTextCursorDrawable(r3)
        L_0x02f0:
            if (r9 == 0) goto L_0x03e2
            java.lang.String r0 = "component:input-textarea"
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r9, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02ff
            r18.setSingleLine()
        L_0x02ff:
            int r0 = r28.hashCode()
            java.lang.String r3 = "context"
            switch(r0) {
                case -1794194085: goto L_0x03c9;
                case -996722468: goto L_0x03b7;
                case -568224247: goto L_0x03a8;
                case 1214732910: goto L_0x0364;
                case 1215217037: goto L_0x032d;
                case 1335671819: goto L_0x0324;
                case 1840315739: goto L_0x0313;
                case 1840317103: goto L_0x030a;
                default: goto L_0x0308;
            }
        L_0x0308:
            goto L_0x03e2
        L_0x030a:
            java.lang.String r0 = "component:input-url"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x03e2
            goto L_0x031d
        L_0x0313:
            java.lang.String r0 = "component:input-tel"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x03e2
            r16 = 3
        L_0x031d:
            r0 = r16
            r6.setInputType(r0)
            goto L_0x03e2
        L_0x0324:
            java.lang.String r0 = "component:date"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x03e2
            goto L_0x036c
        L_0x032d:
            java.lang.String r0 = "component:input-time"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x03e2
            r0 = r6
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.content.Context r7 = r0.getContext()
            p298d.p344x.p346c.C6888i.m12437d(r7, r3)
            java.lang.String r13 = "$this$transformIntoTimePicker"
            p298d.p344x.p346c.C6888i.m12438e(r0, r13)
            p298d.p344x.p346c.C6888i.m12438e(r7, r3)
            r3 = 1
            r0.setClickable(r3)
            r3 = 0
            r0.setShowSoftInputOnFocus(r3)
            r0.setCursorVisible(r3)
            b.a.a.i.u r3 = new b.a.a.i.u
            r3.<init>(r0)
            r0.setOnFocusChangeListener(r3)
            b.a.a.i.v r3 = new b.a.a.i.v
            r3.<init>(r0, r7)
            r0.setOnClickListener(r3)
            goto L_0x03e2
        L_0x0364:
            java.lang.String r0 = "component:input-date"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x03e2
        L_0x036c:
            r0 = r6
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.content.Context r7 = r0.getContext()
            p298d.p344x.p346c.C6888i.m12437d(r7, r3)
            java.lang.String r13 = "$this$transformIntoDatePicker"
            p298d.p344x.p346c.C6888i.m12438e(r0, r13)
            p298d.p344x.p346c.C6888i.m12438e(r7, r3)
            r3 = 1
            r0.setClickable(r3)
            r3 = 0
            r0.setShowSoftInputOnFocus(r3)
            r0.setCursorVisible(r3)
            b.a.a.i.r r3 = new b.a.a.i.r
            r3.<init>(r0)
            r0.setOnFocusChangeListener(r3)
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            b.a.a.i.t r13 = new b.a.a.i.t
            r13.<init>(r0, r3)
            r23 = r14
            b.a.a.i.s r14 = new b.a.a.i.s
            r26 = r1
            r1 = 0
            r14.<init>(r7, r13, r3, r1)
            r0.setOnClickListener(r14)
            goto L_0x03e6
        L_0x03a8:
            r26 = r1
            r23 = r14
            java.lang.String r0 = "component:input-number"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x03e6
            r0 = 8194(0x2002, float:1.1482E-41)
            goto L_0x03c5
        L_0x03b7:
            r26 = r1
            r23 = r14
            java.lang.String r0 = "component:input-email"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x03e6
            r0 = 32
        L_0x03c5:
            r6.setInputType(r0)
            goto L_0x03e6
        L_0x03c9:
            r26 = r1
            r23 = r14
            java.lang.String r0 = "component:input-password"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x03e6
            r0 = 129(0x81, float:1.81E-43)
            r6.setInputType(r0)
            android.text.method.PasswordTransformationMethod r0 = android.text.method.PasswordTransformationMethod.getInstance()
            r6.setTransformationMethod(r0)
            goto L_0x03e6
        L_0x03e2:
            r26 = r1
            r23 = r14
        L_0x03e6:
            r0 = 24
            if (r5 == r0) goto L_0x03f7
            r0 = 25
            if (r5 != r0) goto L_0x03ef
            goto L_0x03f7
        L_0x03ef:
            r0 = 1
            r6.setTextIsSelectable(r0)
            r6.setSelectAllOnFocus(r0)
            goto L_0x0409
        L_0x03f7:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            p.a.a$b r1 = p441p.p442a.C8091a.f16272d
            java.lang.String r3 = ">>>>>>>>>> IS NOUGAT"
            r1.mo26043a(r3, r0)
            r18.clearFocus()
            goto L_0x0409
        L_0x0405:
            r26 = r1
            r23 = r14
        L_0x0409:
            if (r8 != 0) goto L_0x063a
            if (r10 == 0) goto L_0x063a
            java.lang.String r0 = "$this$parseFigmaRichText"
            p298d.p344x.p346c.C6888i.m12438e(r10, r0)
            java.util.Iterator r0 = r29.iterator()
            java.lang.String r1 = ""
        L_0x0418:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0436
            java.lang.Object r3 = r0.next()
            com.appfoundry.previewer.model.RichText r3 = (com.appfoundry.previewer.model.RichText) r3
            java.lang.String r5 = r3.f11101a
            if (r5 == 0) goto L_0x0418
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r1)
            java.lang.String r3 = r3.f11101a
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            goto L_0x0418
        L_0x0436:
            java.lang.String r0 = "$this$setRichText"
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            java.lang.String r3 = "richTextList"
            p298d.p344x.p346c.C6888i.m12438e(r10, r3)
            java.util.Iterator r5 = r29.iterator()
        L_0x0444:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x04db
            java.lang.Object r7 = r5.next()
            com.appfoundry.previewer.model.RichText r7 = (com.appfoundry.previewer.model.RichText) r7
            java.lang.String r8 = r7.f11102b
            r13 = 2
            r14 = 0
            com.appfoundry.previewer.model.Style r8 = p005b.p006a.p007a.p024o.C0823f.m346O(r8, r14, r13)
            if (r8 == 0) goto L_0x045d
            java.lang.String r13 = r8.f11127D
            goto L_0x045e
        L_0x045d:
            r13 = 0
        L_0x045e:
            if (r13 == 0) goto L_0x04d5
            java.lang.String r13 = r7.f11101a
            if (r13 == 0) goto L_0x04d5
            java.lang.String r8 = r8.f11127D
            if (r8 != 0) goto L_0x046a
            goto L_0x04d5
        L_0x046a:
            int r13 = r8.hashCode()
            r14 = 103164673(0x6262b01, float:3.1252724E-35)
            r21 = r5
            java.lang.String r5 = "null cannot be cast to non-null type java.lang.String"
            if (r13 == r14) goto L_0x04b3
            r14 = 110371416(0x6942258, float:5.5721876E-35)
            if (r13 == r14) goto L_0x049b
            r14 = 111499426(0x6a558a2, float:6.2196336E-35)
            if (r13 == r14) goto L_0x0482
            goto L_0x04d7
        L_0x0482:
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x04d7
            java.lang.String r7 = r7.f11101a
            java.util.Locale r8 = java.util.Locale.getDefault()
            p298d.p344x.p346c.C6888i.m12437d(r8, r15)
            java.util.Objects.requireNonNull(r7, r5)
            java.lang.String r5 = r7.toUpperCase(r8)
            r8 = r22
            goto L_0x04cb
        L_0x049b:
            boolean r5 = r8.equals(r4)
            if (r5 == 0) goto L_0x04d7
            java.lang.String r5 = r7.f11101a
            java.lang.String r8 = p005b.p006a.p007a.p018i.C0756o.m234l(r5)
            if (r8 == 0) goto L_0x04aa
            goto L_0x04ac
        L_0x04aa:
            java.lang.String r8 = r7.f11101a
        L_0x04ac:
            r7 = 4
            r13 = 0
            java.lang.String r1 = p298d.p415c0.C7694h.m13944v(r1, r5, r8, r13, r7)
            goto L_0x04d7
        L_0x04b3:
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x04d7
            java.lang.String r7 = r7.f11101a
            java.util.Locale r8 = java.util.Locale.getDefault()
            p298d.p344x.p346c.C6888i.m12437d(r8, r15)
            java.util.Objects.requireNonNull(r7, r5)
            java.lang.String r5 = r7.toLowerCase(r8)
            r8 = r23
        L_0x04cb:
            p298d.p344x.p346c.C6888i.m12437d(r5, r8)
            r8 = 4
            r13 = 0
            java.lang.String r1 = p298d.p415c0.C7694h.m13944v(r1, r7, r5, r13, r8)
            goto L_0x04d7
        L_0x04d5:
            r21 = r5
        L_0x04d7:
            r5 = r21
            goto L_0x0444
        L_0x04db:
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r1)
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            p298d.p344x.p346c.C6888i.m12438e(r10, r3)
            java.util.Iterator r0 = r29.iterator()
        L_0x04ea:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0612
            java.lang.Object r1 = r0.next()
            com.appfoundry.previewer.model.RichText r1 = (com.appfoundry.previewer.model.RichText) r1
            java.lang.String r3 = r1.f11102b
            r4 = 2
            r5 = 0
            com.appfoundry.previewer.model.Style r3 = p005b.p006a.p007a.p024o.C0823f.m346O(r3, r5, r4)
            if (r3 == 0) goto L_0x060a
            java.lang.String r5 = r1.f11101a
            if (r5 == 0) goto L_0x060a
            r7 = 1
            boolean r5 = p298d.p415c0.C7694h.m13924b(r2, r5, r7)
            if (r5 == 0) goto L_0x060a
            java.lang.String r5 = r1.f11101a
            r8 = 0
            int r4 = p298d.p415c0.C7694h.m13934l(r2, r5, r8, r7, r4)
            java.lang.String r5 = r1.f11101a
            int r5 = r5.length()
            int r5 = r5 + r4
            java.lang.String r7 = r3.f11141b
            r11 = 33
            if (r7 == 0) goto L_0x0530
            int r7 = p005b.p006a.p007a.p018i.C0756o.m233k(r7)
            java.lang.String r13 = "$this$setTextColorSpan"
            p298d.p344x.p346c.C6888i.m12438e(r2, r13)
            android.text.style.ForegroundColorSpan r13 = new android.text.style.ForegroundColorSpan
            r13.<init>(r7)
            r2.setSpan(r13, r4, r5, r11)
        L_0x0530:
            java.lang.Float r7 = r3.f11145f
            if (r7 == 0) goto L_0x054b
            float r7 = r7.floatValue()
            java.lang.String r13 = "$this$setTextSizeSpan"
            p298d.p344x.p346c.C6888i.m12438e(r2, r13)
            android.text.style.AbsoluteSizeSpan r13 = new android.text.style.AbsoluteSizeSpan
            float r7 = p005b.p006a.p007a.p024o.C0820c.m323w(r7)
            int r7 = (int) r7
            r14 = 1
            r13.<init>(r7, r14)
            r2.setSpan(r13, r4, r5, r11)
        L_0x054b:
            java.lang.Boolean r7 = r3.f11131H
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            boolean r7 = p298d.p344x.p346c.C6888i.m12434a(r7, r13)
            if (r7 == 0) goto L_0x056a
            boolean r7 = p005b.p038f.p039a.C0849e.m516f0(r3)
            if (r7 == 0) goto L_0x056a
            java.lang.String r7 = "$this$setBoldItalicSpan"
            p298d.p344x.p346c.C6888i.m12438e(r2, r7)
            android.text.style.StyleSpan r7 = new android.text.style.StyleSpan
            r13 = 3
            r7.<init>(r13)
            r2.setSpan(r7, r4, r5, r11)
            goto L_0x0595
        L_0x056a:
            boolean r7 = p005b.p038f.p039a.C0849e.m516f0(r3)
            if (r7 == 0) goto L_0x057f
            java.lang.String r7 = "$this$setBoldSpan"
            p298d.p344x.p346c.C6888i.m12438e(r2, r7)
            android.text.style.StyleSpan r7 = new android.text.style.StyleSpan
            r13 = 1
            r7.<init>(r13)
            r2.setSpan(r7, r4, r5, r11)
            goto L_0x0595
        L_0x057f:
            java.lang.Boolean r7 = r3.f11131H
            boolean r7 = p298d.p344x.p346c.C6888i.m12434a(r7, r13)
            if (r7 == 0) goto L_0x0595
            java.lang.String r7 = "$this$setItalicSpan"
            p298d.p344x.p346c.C6888i.m12438e(r2, r7)
            android.text.style.StyleSpan r7 = new android.text.style.StyleSpan
            r13 = 2
            r7.<init>(r13)
            r2.setSpan(r7, r4, r5, r11)
        L_0x0595:
            java.lang.Float r7 = r3.f11147h
            if (r7 == 0) goto L_0x05c2
            float r7 = r7.floatValue()
            r13 = 0
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x05a3
            r8 = 1
        L_0x05a3:
            r7 = r8 ^ 1
            if (r7 == 0) goto L_0x05c2
            java.lang.Float r7 = r3.f11147h
            float r7 = r7.floatValue()
            java.lang.String r8 = "$this$setLetterSpacingSpan"
            p298d.p344x.p346c.C6888i.m12438e(r2, r8)
            b.a.a.b.b r8 = new b.a.a.b.b
            r13 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 / r13
            r14 = 8
            float r14 = (float) r14
            float r7 = r7 * r14
            r8.<init>(r7)
            r2.setSpan(r8, r4, r5, r11)
            goto L_0x05c4
        L_0x05c2:
            r13 = 1120403456(0x42c80000, float:100.0)
        L_0x05c4:
            java.lang.String r3 = r3.f11128E
            if (r3 == 0) goto L_0x05f1
            java.lang.String r7 = "$this$setTextDecorationSpan"
            p298d.p344x.p346c.C6888i.m12438e(r2, r7)
            java.lang.String r7 = "textDecoration"
            p298d.p344x.p346c.C6888i.m12438e(r3, r7)
            boolean r7 = p298d.p344x.p346c.C6888i.m12434a(r3, r12)
            if (r7 == 0) goto L_0x05e0
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan
            r3.<init>()
            r7 = r26
            goto L_0x05ed
        L_0x05e0:
            r7 = r26
            boolean r3 = p298d.p344x.p346c.C6888i.m12434a(r3, r7)
            if (r3 == 0) goto L_0x05f3
            android.text.style.StrikethroughSpan r3 = new android.text.style.StrikethroughSpan
            r3.<init>()
        L_0x05ed:
            r2.setSpan(r3, r4, r5, r11)
            goto L_0x05f3
        L_0x05f1:
            r7 = r26
        L_0x05f3:
            java.lang.String r1 = r1.f11103c
            if (r1 == 0) goto L_0x060e
            java.lang.String r3 = "$this$setHyperlinkSpan"
            p298d.p344x.p346c.C6888i.m12438e(r2, r3)
            java.lang.String r3 = "url"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            android.text.style.URLSpan r3 = new android.text.style.URLSpan
            r3.<init>(r1)
            r2.setSpan(r3, r4, r5, r11)
            goto L_0x060e
        L_0x060a:
            r7 = r26
            r13 = 1120403456(0x42c80000, float:100.0)
        L_0x060e:
            r26 = r7
            goto L_0x04ea
        L_0x0612:
            r6.setText(r2)
            java.util.Iterator r0 = r29.iterator()
        L_0x0619:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0630
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.appfoundry.previewer.model.RichText r2 = (com.appfoundry.previewer.model.RichText) r2
            java.lang.String r2 = r2.f11103c
            if (r2 == 0) goto L_0x062c
            r2 = 1
            goto L_0x062d
        L_0x062c:
            r2 = 0
        L_0x062d:
            if (r2 == 0) goto L_0x0619
            goto L_0x0631
        L_0x0630:
            r1 = 0
        L_0x0631:
            if (r1 == 0) goto L_0x063a
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r6.setMovementMethod(r0)
        L_0x063a:
            java.lang.String r0 = "component:input-file"
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r9, r0)
            if (r0 == 0) goto L_0x064e
            b.a.a.i.q$a r0 = new b.a.a.i.q$a
            r1 = r19
            r2 = r20
            r0.<init>(r6, r1, r2)
            r6.setOnClickListener(r0)
        L_0x064e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p018i.C0758q.m241f(android.widget.TextView, java.lang.String, java.lang.String, com.appfoundry.previewer.model.Style, int, int, com.appfoundry.previewer.model.Text, boolean, boolean, int, java.lang.String, java.util.List, java.lang.String, java.lang.String):android.view.View");
    }

    /* renamed from: g */
    public static final C0771b m242g(View view, Style style, int i, int i2, boolean z, int i3) {
        Integer num;
        C6888i.m12438e(view, "$this$setup");
        Float f = null;
        C0771b i4 = C0849e.m521i(style != null ? style.f11152m : null, i, i2, z, i3);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, z ? -2 : -1);
        C0849e.m552x0(layoutParams, i4.f516c);
        view.setLayoutParams(layoutParams);
        if (style != null) {
            style.f11138O = Integer.valueOf(i4.f514a);
        }
        if (style != null) {
            style.f11139P = Integer.valueOf(i4.f515b);
        }
        if (!(view instanceof CardView)) {
            if (style != null && C0849e.m503Y(style)) {
                view.setBackground(C0849e.m529m(style, i4.f514a));
            } else if (style != null && C0849e.m501W(style)) {
                String str = style.f11142c;
                Integer valueOf = str != null ? Integer.valueOf(C0756o.m233k(str)) : null;
                C6888i.m12436c(valueOf);
                view.setBackgroundColor(valueOf.intValue());
            }
        }
        view.setAlpha((style == null || (num = style.f11157r) == null) ? 1.0f : ((float) num.intValue()) / 100.0f);
        if (style != null) {
            f = style.f11129F;
        }
        if (f != null) {
            view.setRotation(style.f11129F.floatValue());
        }
        view.setClipToOutline(true);
        return i4;
    }

    /* renamed from: h */
    public static /* synthetic */ C0771b m243h(View view, Style style, int i, int i2, boolean z, int i3, int i4) {
        return m242g(view, style, i, i2, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? 0 : i3);
    }

    /* renamed from: i */
    public static final void m244i(View view) {
        C6888i.m12438e(view, "$this$setupAppBar");
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.appbar);
        if (appBarLayout != null) {
            C6888i.m12438e(appBarLayout, "$this$removeShadow");
            C6888i.m12438e(view, "parentView");
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, Key.ELEVATION, new float[]{0.1f}));
            appBarLayout.setStateListAnimator(stateListAnimator);
        }
    }

    /* renamed from: j */
    public static final void m245j(View view, Page page, Float f) {
        Container container;
        int i;
        C6888i.m12438e(view, "$this$setupWithPage");
        if (page != null) {
            C6888i.m12438e(page, "$this$shouldSetupTopbar");
            C6888i.m12438e(page, "$this$isPageModal");
            String str = page.f11035c;
            boolean z = false;
            if (!(str != null && C7694h.m13926d(str, "modal", false, 2) && (C6888i.m12434a(page.f11035c, "menu:modal") ^ true)) && C6888i.m12434a(C0744e.m222z(page), Boolean.FALSE)) {
                z = true;
            }
            if (z) {
                m244i(view);
                m239d(view, page.f11033a, page.f11036d, Boolean.valueOf(page.f11056x));
            }
        }
        C6888i.m12438e(view, "$this$addPageBackground");
        if (!(page == null || (container = page.f11041i) == null)) {
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.page_background);
            if (C0744e.m221y(page)) {
                i = C0744e.m208l(page, view.getContext());
            } else {
                BravoApp.C5403b bVar = BravoApp.f10730N;
                i = BravoApp.f10726J;
            }
            int i2 = i;
            Context context = view.getContext();
            String str2 = page.f11033a;
            C6888i.m12437d(frameLayout, "backgroundParent");
            int y = C0820c.m325y();
            if (f != null) {
                y = (int) ((f.floatValue() * ((float) y)) / 100.0f);
            }
            C0744e.m199c(container, context, str2, frameLayout, y, i2, Boolean.valueOf(page.f11056x), 0, false, 192);
        }
        C6888i.m12438e(view, "$this$getRecyclerView");
        View findViewById = view.findViewById(R.id.recyclerView);
        C6888i.m12437d(findViewById, "this.findViewById(R.id.recyclerView)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        Boolean bool = null;
        String str3 = page != null ? page.f11033a : null;
        List<Container> list = page != null ? page.f11038f : null;
        Animation animation = page != null ? page.f11053u : null;
        if (page != null) {
            bool = Boolean.valueOf(page.f11056x);
        }
        C0849e.m556z0(recyclerView, str3, list, animation, bool, false, false, f, 48);
    }

    /* renamed from: k */
    public static /* synthetic */ void m246k(View view, Page page, Float f, int i) {
        m245j(view, page, (i & 2) != 0 ? Float.valueOf(100.0f) : null);
    }

    /* renamed from: l */
    public static final void m247l(View view) {
        C6888i.m12438e(view, "$this$show");
        view.setVisibility(0);
    }
}
