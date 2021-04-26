package p005b.p006a.p007a.p018i;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.model.Actions;
import com.appfoundry.previewer.model.App;
import com.appfoundry.previewer.model.Component;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Data;
import com.appfoundry.previewer.model.Dimensions;
import com.appfoundry.previewer.model.JsonApp;
import com.appfoundry.previewer.model.Page;
import com.appfoundry.previewer.model.Params;
import com.appfoundry.previewer.model.States;
import com.appfoundry.previewer.model.Style;
import com.appfoundry.previewer.model.Tap;
import com.appfoundry.previewer.model.Text;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.segment.analytics.integrations.BasePayload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p005b.p006a.p007a.p008a.C0594b;
import p005b.p006a.p007a.p008a.C0605h;
import p005b.p006a.p007a.p008a.C0612j;
import p005b.p006a.p007a.p017h.C0711k;
import p005b.p006a.p007a.p019j.C0771b;
import p005b.p006a.p007a.p019j.C0772c;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p038f.p039a.C0849e;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;
import p437o.p438a.p439a.C8068c;

/* renamed from: b.a.a.i.e */
public final class C0744e {

    /* renamed from: b.a.a.i.e$a */
    public static final class C0745a implements TextWatcher {

        /* renamed from: g */
        public final /* synthetic */ String f459g;

        public C0745a(String str) {
            this.f459g = str;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C8068c b = C8068c.m14948b();
            String valueOf = String.valueOf(charSequence);
            String str = this.f459g;
            if (str == null) {
                str = "";
            }
            b.mo26008g(new C0711k(valueOf, str));
        }
    }

    /* renamed from: b.a.a.i.e$b */
    public static final class C0746b implements View.OnClickListener {

        /* renamed from: g */
        public final /* synthetic */ Component f460g;

        /* renamed from: h */
        public final /* synthetic */ String f461h;

        public C0746b(Component component, String str) {
            this.f460g = component;
            this.f461h = str;
        }

        public final void onClick(View view) {
            C8068c b = C8068c.m14948b();
            String str = this.f461h;
            Component component = this.f460g;
            b.mo26008g(C0849e.m491M(str, component.f10960v, component.f10943e, component.f10949k, component.f10952n, component.f10947i, component.f10939a));
        }
    }

    /* renamed from: A */
    public static final boolean m188A(Page page) {
        C6888i.m12438e(page, "$this$isRemote");
        String str = page.f11043k;
        if (str == null || !(!C6888i.m12434a(str, ""))) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public static final boolean m189B(Container container) {
        C6888i.m12438e(container, "$this$isSlider");
        return C6888i.m12434a(container.f10968b, "container:slider");
    }

    /* renamed from: C */
    public static final boolean m190C(Component component, String str) {
        C6888i.m12438e(str, "someType");
        String str2 = component.f10940b;
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public static final void m191D(Component component, String str) {
        Text text;
        C6888i.m12438e(component, "$this$setText");
        if (str != null) {
            text = component.f10941c;
            if (text == null) {
                return;
            }
        } else {
            text = component.f10941c;
            if (text != null) {
                str = "";
            } else {
                return;
            }
        }
        text.f11168a = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0227  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.View m192E(android.widget.ImageView r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, com.appfoundry.previewer.model.Style r21, int r22, int r23, com.appfoundry.previewer.model.Asset r24, int r25) {
        /*
            r8 = r17
            r7 = r21
            r9 = r24
            java.lang.String r0 = "$this$setup"
            p298d.p344x.p346c.C6888i.m12438e(r8, r0)
            r4 = 0
            r6 = 8
            r0 = r17
            r1 = r21
            r2 = r22
            r3 = r23
            r5 = r25
            b.a.a.j.b r0 = p005b.p006a.p007a.p018i.C0758q.m243h(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = "fit"
            if (r7 == 0) goto L_0x0025
            java.lang.String r2 = r7.f11156q
            if (r2 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = r1
        L_0x0026:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r2, r1)
            if (r1 == 0) goto L_0x0037
            b.h.a.m.x.c.q r1 = new b.h.a.m.x.c.q
            r1.<init>()
            goto L_0x003c
        L_0x0037:
            b.h.a.m.x.c.i r1 = new b.h.a.m.x.c.i
            r1.<init>()
        L_0x003c:
            r3.add(r1)
            r1 = 1
            if (r7 == 0) goto L_0x0051
            boolean r2 = p005b.p038f.p039a.C0849e.m504Z(r21)
            if (r2 != r1) goto L_0x0051
            int r2 = r0.f514a
            b.a.a.b.f r2 = p005b.p038f.p039a.C0849e.m531n(r7, r2)
            r3.add(r2)
        L_0x0051:
            b.h.a.q.e r2 = new b.h.a.q.e
            r2.<init>()
            b.h.a.m.n r4 = new b.h.a.m.n
            r4.<init>(r3)
            b.h.a.q.a r2 = r2.mo11178v(r4, r1)
            java.lang.String r3 = "RequestOptions().transfo…Bitmap>(transformations))"
            p298d.p344x.p346c.C6888i.m12437d(r2, r3)
            b.h.a.q.e r2 = (p005b.p051h.p052a.p074q.C1343e) r2
            r4 = 0
            if (r9 == 0) goto L_0x01a3
            java.lang.String r5 = r9.f10896b
            if (r5 == 0) goto L_0x01a3
            java.lang.String r6 = "$this$needsToAdjustSize"
            p298d.p344x.p346c.C6888i.m12438e(r5, r6)
            r6 = 2
            java.lang.String r10 = "https://images-dev"
            boolean r10 = p298d.p415c0.C7694h.m13910A(r5, r10, r4, r6)
            if (r10 == 0) goto L_0x0085
            java.lang.String r10 = "g:sm"
            boolean r5 = p298d.p415c0.C7694h.m13926d(r5, r10, r4, r6)
            if (r5 == 0) goto L_0x0085
            r5 = r1
            goto L_0x0086
        L_0x0085:
            r5 = r4
        L_0x0086:
            if (r5 != r1) goto L_0x01a3
            r5 = 4
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r22)
            r10[r4] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r23)
            r10[r1] = r11
            int r11 = r0.f514a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r6] = r11
            int r11 = r0.f515b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 3
            r10[r12] = r11
            p.a.a$b r11 = p441p.p442a.C8091a.f16272d
            java.lang.String r13 = "parentWidth=%s, parentHeight=%s, viewWidth=%s, viewHeight=%s"
            r11.mo26043a(r13, r10)
            java.lang.String r10 = r9.f10896b
            if (r10 == 0) goto L_0x017c
            int r13 = r0.f514a
            int r0 = r0.f515b
            java.lang.String r14 = "$this$imgProxyUrl"
            p298d.p344x.p346c.C6888i.m12438e(r10, r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "s:"
            r14.append(r15)
            r14.append(r13)
            r13 = 58
            r14.append(r13)
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "$this$host"
            p298d.p344x.p346c.C6888i.m12438e(r10, r14)
            java.lang.String r14 = "/"
            int r12 = p005b.p006a.p007a.p018i.C0756o.m231i(r10, r14, r12, r4, r5)
            java.lang.String r12 = r10.substring(r4, r12)
            java.lang.String r15 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p298d.p344x.p346c.C6888i.m12437d(r12, r15)
            r13.append(r12)
            r13.append(r14)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r14)
            r12.append(r0)
            r12.append(r14)
            java.lang.String r15 = p005b.p006a.p007a.p018i.C0756o.m224b(r10)
            r12.append(r15)
            java.lang.String r12 = r12.toString()
            java.lang.String r15 = "path"
            p298d.p344x.p346c.C6888i.m12438e(r12, r15)
            java.lang.String r15 = "3683dcd25867e4caead59fc552dfb3c7"
            byte[] r15 = p005b.p038f.p039a.C0849e.m535p(r15)
            java.lang.String r16 = "5577e0cb9c28b0061234e2859e9d6ca2"
            byte[] r3 = p005b.p038f.p039a.C0849e.m535p(r16)
            java.lang.String r1 = "HmacSHA256"
            javax.crypto.Mac r4 = javax.crypto.Mac.getInstance(r1)
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec
            r5.<init>(r15, r1)
            r4.init(r5)
            r4.update(r3)
            java.nio.charset.Charset r1 = p298d.p415c0.C7685a.f15210a
            byte[] r3 = r12.getBytes(r1)
            java.lang.String r5 = "(this as java.lang.String).getBytes(charset)"
            p298d.p344x.p346c.C6888i.m12437d(r3, r5)
            byte[] r3 = r4.doFinal(r3)
            byte[] r3 = android.util.Base64.encode(r3, r6)
            java.lang.String r4 = "Base64.encode(sha256Hmac…Array()), Base64.NO_WRAP)"
            p298d.p344x.p346c.C6888i.m12437d(r3, r4)
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3, r1)
            java.lang.String r1 = "="
            java.lang.String r3 = ""
            r5 = 4
            r6 = 0
            java.lang.String r1 = p298d.p415c0.C7694h.m13944v(r4, r1, r3, r6, r5)
            java.lang.String r3 = "+"
            java.lang.String r4 = "-"
            java.lang.String r1 = p298d.p415c0.C7694h.m13944v(r1, r3, r4, r6, r5)
            java.lang.String r3 = "_"
            java.lang.String r1 = p298d.p415c0.C7694h.m13944v(r1, r14, r3, r6, r5)
            r13.append(r1)
            r13.append(r14)
            r13.append(r0)
            r13.append(r14)
            java.lang.String r0 = p005b.p006a.p007a.p018i.C0756o.m224b(r10)
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            goto L_0x017d
        L_0x017c:
            r0 = 0
        L_0x017d:
            r9.f10896b = r0
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r1 = 0
            r3[r1] = r0
            java.lang.String r0 = "imgproxy url=%s"
            r11.mo26043a(r0, r3)
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.f10730N
            java.lang.String r0 = r9.f10895a
            java.lang.String r3 = "assetId"
            p298d.p344x.p346c.C6888i.m12438e(r0, r3)
            java.lang.String r3 = "asset"
            p298d.p344x.p346c.C6888i.m12438e(r9, r3)
            java.util.Map<java.lang.String, com.appfoundry.previewer.model.Asset> r3 = com.appfoundry.previewer.BravoApp.f10741q
            if (r3 == 0) goto L_0x01a4
            java.lang.Object r0 = r3.put(r0, r9)
            com.appfoundry.previewer.model.Asset r0 = (com.appfoundry.previewer.model.Asset) r0
            goto L_0x01a4
        L_0x01a3:
            r1 = r4
        L_0x01a4:
            if (r9 == 0) goto L_0x01a9
            java.lang.String r0 = r9.f10899e
            goto L_0x01aa
        L_0x01a9:
            r0 = 0
        L_0x01aa:
            java.lang.String r3 = "image"
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r3)
            if (r0 == 0) goto L_0x01cd
            android.content.Context r0 = p005b.p038f.p039a.C0849e.m505a()
            b.h.a.i r0 = p005b.p051h.p052a.C0929c.m654d(r0)
            java.lang.String r3 = r9.f10896b
            b.h.a.h r0 = r0.mo10415p(r3)
            b.h.a.h r0 = r0.mo10382a(r2)
            b.h.a.m.x.e.c r2 = p005b.p051h.p052a.p055m.p064x.p067e.C1272c.m1272b()
            b.h.a.h r0 = r0.mo10406K(r2)
            goto L_0x01ea
        L_0x01cd:
            android.content.Context r0 = p005b.p038f.p039a.C0849e.m505a()
            b.h.a.i r0 = p005b.p051h.p052a.C0929c.m654d(r0)
            b.a.a.b.j r0 = (p005b.p006a.p007a.p009b.C0633j) r0
            if (r9 == 0) goto L_0x01dc
            java.lang.String r3 = r9.f10896b
            goto L_0x01dd
        L_0x01dc:
            r3 = 0
        L_0x01dd:
            b.h.a.h r0 = r0.mo10413m()
            r0.mo10405I(r3)
            b.a.a.b.i r0 = (p005b.p006a.p007a.p009b.C0632i) r0
            b.a.a.b.i r0 = r0.mo10407L(r2)
        L_0x01ea:
            r0.mo10771E(r8)
            r0 = 1
            r8.setClipToOutline(r0)
            if (r7 == 0) goto L_0x020a
            boolean r2 = p005b.p038f.p039a.C0849e.m502X(r21)
            if (r2 != r0) goto L_0x020a
            java.lang.Integer r0 = r7.f11138O
            if (r0 == 0) goto L_0x0202
            int r4 = r0.intValue()
            goto L_0x0203
        L_0x0202:
            r4 = r1
        L_0x0203:
            android.graphics.drawable.Drawable r0 = p005b.p038f.p039a.C0849e.m529m(r7, r4)
            r8.setForeground(r0)
        L_0x020a:
            if (r7 == 0) goto L_0x020f
            java.lang.String r3 = r7.f11140a
            goto L_0x0210
        L_0x020f:
            r3 = 0
        L_0x0210:
            java.lang.String r0 = "RYAKP746R2Y8QZP4NA7VRPFBQWSZKJ6M"
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r3, r0)
            if (r0 == 0) goto L_0x021d
            r0 = 8
            r8.setVisibility(r0)
        L_0x021d:
            java.lang.String r0 = "component:input-image"
            r1 = r20
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r1, r0)
            if (r0 == 0) goto L_0x023e
            b.a.a.i.j r9 = new b.a.a.i.j
            r0 = r9
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.setOnClickListener(r9)
        L_0x023e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p018i.C0744e.m192E(android.widget.ImageView, java.lang.String, java.lang.String, java.lang.String, com.appfoundry.previewer.model.Style, int, int, com.appfoundry.previewer.model.Asset, int):android.view.View");
    }

    /* renamed from: F */
    public static final void m193F(Component component, Context context, Component component2, C0771b bVar, FrameLayout frameLayout, C0772c cVar, String str) {
        Component component3 = component;
        Component component4 = component2;
        C0771b bVar2 = bVar;
        FrameLayout frameLayout2 = frameLayout;
        C6888i.m12438e(component3, "$this$setupStatefulCompound");
        C6888i.m12438e(component4, "statefulSet");
        C6888i.m12438e(bVar2, "dimensions");
        C6888i.m12438e(frameLayout2, "statefulSetFrameLayout");
        C6888i.m12436c(context);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, new FrameLayout.LayoutParams(bVar2.f514a, bVar2.f515b));
        component3.f10962x = frameLayout3;
        List<Component> list = component3.f10951m;
        if (list != null) {
            for (Component component5 : list) {
                C6888i.m12438e(component5, "$this$addToStatefulCompound");
                C6888i.m12438e(bVar2, "dimensions");
                C6888i.m12438e(frameLayout3, "statefulCompoundFrameLayout");
                View m = m209m(component5, context, str, C0823f.m346O(component5.f10942d, (Boolean) null, 2), bVar2.f514a, bVar2.f515b, Boolean.FALSE, 0, false);
                component5.f10962x = m;
                frameLayout3.addView(m);
                bVar2 = bVar;
            }
        }
        String str2 = component3.f10960v;
        C6888i.m12438e(component3, "$this$handleTouchEvents");
        C6888i.m12438e(component4, "statefulSetComponent");
        if (component4.f10961w == null) {
            component4.f10961w = "default";
        }
        View view = component3.f10962x;
        if (view != null) {
            view.setOnTouchListener(new C0747f(component, component2, str, str2, cVar));
        }
    }

    /* renamed from: G */
    public static final void m194G(Component component) {
        Component component2;
        List<Component> list;
        Component component3;
        List<Component> list2;
        Component component4;
        List<Component> list3;
        C6888i.m12438e(component, "$this$showActiveOnly");
        States states = component.f10950l;
        if (!(states == null || (component4 = states.f11113c) == null || (list3 = component4.f10951m) == null)) {
            for (Component component5 : list3) {
                View view = component5.f10962x;
                if (view != null) {
                    C0758q.m247l(view);
                }
            }
        }
        States states2 = component.f10950l;
        if (!(states2 == null || (component3 = states2.f11112b) == null || (list2 = component3.f10951m) == null)) {
            for (Component component6 : list2) {
                View view2 = component6.f10962x;
                if (view2 != null) {
                    C0758q.m240e(view2);
                }
            }
        }
        States states3 = component.f10950l;
        if (states3 != null && (component2 = states3.f11111a) != null && (list = component2.f10951m) != null) {
            for (Component component7 : list) {
                View view3 = component7.f10962x;
                if (view3 != null) {
                    C0758q.m240e(view3);
                }
            }
        }
    }

    /* renamed from: H */
    public static final void m195H(Component component) {
        Component component2;
        List<Component> list;
        Component component3;
        List<Component> list2;
        Component component4;
        List<Component> list3;
        C6888i.m12438e(component, "$this$showDefaultOnly");
        States states = component.f10950l;
        if (!(states == null || (component4 = states.f11111a) == null || (list3 = component4.f10951m) == null)) {
            for (Component component5 : list3) {
                View view = component5.f10962x;
                if (view != null) {
                    C0758q.m247l(view);
                }
            }
        }
        States states2 = component.f10950l;
        if (!(states2 == null || (component3 = states2.f11112b) == null || (list2 = component3.f10951m) == null)) {
            for (Component component6 : list2) {
                View view2 = component6.f10962x;
                if (view2 != null) {
                    C0758q.m240e(view2);
                }
            }
        }
        States states3 = component.f10950l;
        if (states3 != null && (component2 = states3.f11113c) != null && (list = component2.f10951m) != null) {
            for (Component component7 : list) {
                View view3 = component7.f10962x;
                if (view3 != null) {
                    C0758q.m240e(view3);
                }
            }
        }
    }

    /* renamed from: I */
    public static final void m196I(Fragment fragment, String str) {
        C6888i.m12438e(fragment, "$this$showStatusBar");
        C6888i.m12438e(str, "tone");
        if (fragment.getActivity() != null && (fragment.getActivity() instanceof AppCompatActivity)) {
            FragmentActivity activity = fragment.getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            ((AppCompatActivity) activity).getWindow().clearFlags(1024);
            boolean a = C6888i.m12434a(str, "statusbar:dark");
            FragmentActivity activity2 = fragment.getActivity();
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            Window window = ((AppCompatActivity) activity2).getWindow();
            C6888i.m12437d(window, "(activity as AppCompatActivity).window");
            View decorView = window.getDecorView();
            C6888i.m12437d(decorView, "(activity as AppCompatActivity).window.decorView");
            decorView.setSystemUiVisibility(a ? 9472 : 1280);
        }
    }

    /* renamed from: a */
    public static final void m197a(Container container, Context context, FrameLayout frameLayout, int i, int i2, Boolean bool) {
        List<Component> list;
        C6888i.m12438e(container, "$this$addBackgroundComponents");
        C6888i.m12438e(frameLayout, "containerParent");
        if (m189B(container)) {
            frameLayout = (FrameLayout) frameLayout.findViewById(R.id.container_viewpager_background);
        }
        Container container2 = container.f10973g;
        if (container2 != null && (list = container2.f10972f) != null) {
            for (Component component : list) {
                if (frameLayout != null) {
                    frameLayout.addView(m203g(component, context, (String) null, i, i2, bool, 0, false, 96));
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m198b(com.appfoundry.previewer.model.Container r15, android.content.Context r16, java.lang.String r17, android.widget.FrameLayout r18, int r19, int r20, java.lang.Boolean r21, int r22) {
        /*
            r0 = r15
            r3 = r18
            java.lang.String r1 = "$this$addChildren"
            p298d.p344x.p346c.C6888i.m12438e(r15, r1)
            java.lang.String r1 = "context"
            r2 = r16
            p298d.p344x.p346c.C6888i.m12438e(r2, r1)
            java.lang.String r1 = "containerParent"
            p298d.p344x.p346c.C6888i.m12438e(r3, r1)
            boolean r1 = m218v(r15)
            r4 = 2
            r5 = 0
            if (r1 == 0) goto L_0x004a
            r1 = 2131230861(0x7f08008d, float:1.8077787E38)
            android.view.View r1 = r3.findViewById(r1)
            r6 = r1
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 == 0) goto L_0x0282
            java.util.List<com.appfoundry.previewer.model.Container> r8 = r0.f10978l
            r9 = 0
            r10 = 0
            r11 = 1
            r12 = 0
            com.appfoundry.previewer.model.Page r0 = p005b.p006a.p007a.p024o.C0823f.m339H(r17)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r0.f11050r
            goto L_0x0038
        L_0x0037:
            r0 = r5
        L_0x0038:
            com.appfoundry.previewer.model.Style r0 = p005b.p006a.p007a.p024o.C0823f.m346O(r0, r5, r4)
            if (r0 == 0) goto L_0x0040
            java.lang.Float r5 = r0.f11148i
        L_0x0040:
            r13 = r5
            r14 = 44
            r7 = r17
            p005b.p038f.p039a.C0849e.m556z0(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0282
        L_0x004a:
            boolean r1 = m189B(r15)
            if (r1 == 0) goto L_0x026d
            b.a.a.m.a r1 = new b.a.a.m.a
            java.util.List<com.appfoundry.previewer.model.Container> r8 = r0.f10978l
            r9 = 0
            java.lang.String r2 = "$this$isSliderInfinite"
            p298d.p344x.p346c.C6888i.m12438e(r15, r2)
            com.appfoundry.previewer.model.Params r2 = r0.f10979m
            if (r2 == 0) goto L_0x0061
            java.lang.Boolean r2 = r2.f11077q
            goto L_0x0062
        L_0x0061:
            r2 = r5
        L_0x0062:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r2, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            com.appfoundry.previewer.model.Page r2 = p005b.p006a.p007a.p024o.C0823f.m339H(r17)
            if (r2 == 0) goto L_0x0075
            java.lang.String r2 = r2.f11050r
            goto L_0x0076
        L_0x0075:
            r2 = r5
        L_0x0076:
            com.appfoundry.previewer.model.Style r2 = p005b.p006a.p007a.p024o.C0823f.m346O(r2, r5, r4)
            if (r2 == 0) goto L_0x0080
            java.lang.Float r2 = r2.f11148i
            r11 = r2
            goto L_0x0081
        L_0x0080:
            r11 = r5
        L_0x0081:
            r12 = 4
            r6 = r1
            r7 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r2 = 2131230863(0x7f08008f, float:1.807779E38)
            android.view.View r2 = r3.findViewById(r2)
            androidx.viewpager2.widget.ViewPager2 r2 = (androidx.viewpager2.widget.ViewPager2) r2
            if (r2 == 0) goto L_0x0282
            r2.setAdapter(r1)
            java.lang.String r6 = "$this$getSliderAnimation"
            p298d.p344x.p346c.C6888i.m12438e(r15, r6)
            com.appfoundry.previewer.model.Params r6 = r0.f10979m
            if (r6 == 0) goto L_0x00a2
            java.lang.String r7 = r6.f11078r
            goto L_0x00a3
        L_0x00a2:
            r7 = r5
        L_0x00a3:
            if (r7 == 0) goto L_0x0115
            java.lang.String r6 = r6.f11078r
            if (r6 != 0) goto L_0x00ab
            goto L_0x0115
        L_0x00ab:
            int r7 = r6.hashCode()
            switch(r7) {
                case -925180581: goto L_0x0107;
                case 3064885: goto L_0x00f9;
                case 3744723: goto L_0x00eb;
                case 106426307: goto L_0x00dd;
                case 1171402135: goto L_0x00cf;
                case 1387629604: goto L_0x00c1;
                case 1397903036: goto L_0x00b3;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            goto L_0x0115
        L_0x00b3:
            java.lang.String r7 = "crossfade"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0115
            b.a.a.b.n.a r6 = new b.a.a.b.n.a
            r6.<init>()
            goto L_0x0116
        L_0x00c1:
            java.lang.String r7 = "horizontal"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0115
            b.a.a.b.n.c r6 = new b.a.a.b.n.c
            r6.<init>()
            goto L_0x0116
        L_0x00cf:
            java.lang.String r7 = "parallax"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0115
            b.a.a.b.n.e r6 = new b.a.a.b.n.e
            r6.<init>()
            goto L_0x0116
        L_0x00dd:
            java.lang.String r7 = "pager"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0115
            b.a.a.b.n.d r6 = new b.a.a.b.n.d
            r6.<init>()
            goto L_0x0116
        L_0x00eb:
            java.lang.String r7 = "zoom"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0115
            b.a.a.b.n.g r6 = new b.a.a.b.n.g
            r6.<init>()
            goto L_0x0116
        L_0x00f9:
            java.lang.String r7 = "cube"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0115
            b.a.a.b.n.b r6 = new b.a.a.b.n.b
            r6.<init>()
            goto L_0x0116
        L_0x0107:
            java.lang.String r7 = "rotate"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0115
            b.a.a.b.n.f r6 = new b.a.a.b.n.f
            r6.<init>()
            goto L_0x0116
        L_0x0115:
            r6 = r5
        L_0x0116:
            if (r6 == 0) goto L_0x011b
            r2.setPageTransformer(r6)
        L_0x011b:
            java.lang.String r6 = "$this$getIndicatorColor"
            p298d.p344x.p346c.C6888i.m12438e(r15, r6)
            java.util.List<java.lang.String> r6 = r0.f10976j
            r7 = 0
            if (r6 == 0) goto L_0x0143
            java.util.Iterator r6 = r6.iterator()
        L_0x0129:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x013f
            java.lang.Object r8 = r6.next()
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "slider-indicator"
            boolean r9 = p298d.p415c0.C7694h.m13926d(r9, r10, r7, r4)
            if (r9 == 0) goto L_0x0129
            goto L_0x0140
        L_0x013f:
            r8 = r5
        L_0x0140:
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0144
        L_0x0143:
            r8 = r5
        L_0x0144:
            r4 = 1
            if (r8 == 0) goto L_0x0158
            java.lang.String r6 = p005b.p006a.p007a.p018i.C0756o.m232j(r8)
            if (r6 == 0) goto L_0x0158
            boolean r6 = p005b.p006a.p007a.p018i.C0756o.m229g(r6)
            if (r6 != r4) goto L_0x0158
            java.lang.String r6 = p005b.p006a.p007a.p018i.C0756o.m232j(r8)
            goto L_0x015a
        L_0x0158:
            java.lang.String r6 = "#FFFFFF"
        L_0x015a:
            if (r6 == 0) goto L_0x023b
            int r8 = r1.getItemCount()
            if (r8 <= r4) goto L_0x023b
            java.util.List<com.appfoundry.previewer.model.Container> r8 = r0.f10978l
            if (r8 == 0) goto L_0x016f
            int r8 = r8.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0170
        L_0x016f:
            r8 = r5
        L_0x0170:
            if (r8 == 0) goto L_0x023b
            java.util.List<com.appfoundry.previewer.model.Container> r8 = r0.f10978l
            int r8 = r8.size()
            if (r8 <= r4) goto L_0x023b
            r4 = 2131230865(0x7f080091, float:1.8077795E38)
            android.view.View r3 = r3.findViewById(r4)
            com.appfoundry.previewer.custom.DotIndicator r3 = (com.appfoundry.previewer.custom.DotIndicator) r3
            r3.setVisibility(r7)
            java.util.List<com.appfoundry.previewer.model.Container> r4 = r0.f10978l
            int r4 = r4.size()
            int r6 = p005b.p006a.p007a.p018i.C0756o.m233k(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.f10858g = r2
            r3.f10874w = r4
            if (r6 == 0) goto L_0x019f
            int r6 = r6.intValue()
            goto L_0x01a1
        L_0x019f:
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x01a1:
            r3.f10872u = r6
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f10858g
            if (r6 == 0) goto L_0x023b
            androidx.recyclerview.widget.RecyclerView$Adapter r6 = r6.getAdapter()
            if (r6 == 0) goto L_0x023b
            r6 = -1
            r3.f10873v = r6
            r3.removeAllViews()
            int r6 = r3.f10874w
            if (r6 > 0) goto L_0x01b8
            goto L_0x01fc
        L_0x01b8:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f10858g
            if (r6 == 0) goto L_0x01c5
            int r6 = r6.getCurrentItem()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x01c6
        L_0x01c5:
            r6 = r5
        L_0x01c6:
            if (r6 == 0) goto L_0x01e1
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f10858g
            if (r6 == 0) goto L_0x01d5
            int r6 = r6.getCurrentItem()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x01d6
        L_0x01d5:
            r6 = r5
        L_0x01d6:
            p298d.p344x.p346c.C6888i.m12436c(r6)
            int r6 = r6.intValue()
            int r8 = r3.f10874w
            int r6 = r6 % r8
            goto L_0x01e2
        L_0x01e1:
            r6 = r7
        L_0x01e2:
            int r8 = r3.getOrientation()
            int r9 = r3.f10874w
            r10 = r7
        L_0x01e9:
            if (r10 >= r9) goto L_0x01fc
            if (r6 != r10) goto L_0x01f2
            int r11 = r3.f10864m
            android.animation.Animator r12 = r3.f10868q
            goto L_0x01f6
        L_0x01f2:
            int r11 = r3.f10865n
            android.animation.Animator r12 = r3.f10869r
        L_0x01f6:
            r3.mo18471a(r8, r11, r12)
            int r10 = r10 + 1
            goto L_0x01e9
        L_0x01fc:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f10858g
            if (r6 == 0) goto L_0x0205
            androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback r8 = r3.f10875x
            r6.unregisterOnPageChangeCallback(r8)
        L_0x0205:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f10858g
            if (r6 == 0) goto L_0x020e
            androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback r8 = r3.f10875x
            r6.registerOnPageChangeCallback(r8)
        L_0x020e:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f10858g
            if (r6 == 0) goto L_0x021b
            int r6 = r6.getCurrentItem()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x021c
        L_0x021b:
            r6 = r5
        L_0x021c:
            if (r6 == 0) goto L_0x0235
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f10858g
            if (r6 == 0) goto L_0x022b
            int r6 = r6.getCurrentItem()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x022c
        L_0x022b:
            r6 = r5
        L_0x022c:
            p298d.p344x.p346c.C6888i.m12436c(r6)
            int r6 = r6.intValue()
            int r6 = r6 % r4
            goto L_0x0236
        L_0x0235:
            r6 = r7
        L_0x0236:
            androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback r3 = r3.f10875x
            r3.onPageSelected(r6)
        L_0x023b:
            java.lang.String r3 = "$this$isSliderAutomatic"
            p298d.p344x.p346c.C6888i.m12438e(r15, r3)
            com.appfoundry.previewer.model.Params r0 = r0.f10979m
            if (r0 == 0) goto L_0x0246
            java.lang.Boolean r5 = r0.f11079s
        L_0x0246:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r5, r0)
            if (r0 == 0) goto L_0x0282
            java.lang.String r0 = "$this$createAutoSlideHandler"
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            java.lang.String r0 = "viewPagerAdapter"
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            d.x.c.t r0 = new d.x.c.t
            r0.<init>()
            r0.f13799g = r7
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            b.a.a.i.y r4 = new b.a.a.i.y
            r4.<init>(r2, r1, r0, r3)
            r3.post(r4)
            goto L_0x0282
        L_0x026d:
            r8 = 0
            r9 = 128(0x80, float:1.794E-43)
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            m199c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0282:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p018i.C0744e.m198b(com.appfoundry.previewer.model.Container, android.content.Context, java.lang.String, android.widget.FrameLayout, int, int, java.lang.Boolean, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: b.a.a.j.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: b.a.a.j.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: b.a.a.j.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: android.widget.EditText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: android.widget.EditText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v49, resolved type: android.widget.EditText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v25, resolved type: b.a.a.j.a} */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x030e, code lost:
        if ((m190C(r10, "component:input-image") || m190C(r10, "component:input-file")) != false) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x054e, code lost:
        if (p298d.p344x.p346c.C6888i.m12434a(r3, "audio:loading") != false) goto L_0x0550;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x058d, code lost:
        if (p298d.p344x.p346c.C6888i.m12434a(r3, "audio:loading") != false) goto L_0x058f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x05a9  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x05c3  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x05ea  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0615  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x064f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0658  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m199c(com.appfoundry.previewer.model.Container r52, android.content.Context r53, java.lang.String r54, android.widget.FrameLayout r55, int r56, int r57, java.lang.Boolean r58, int r59, boolean r60, int r61) {
        /*
            r0 = r52
            r10 = r53
            r11 = r54
            r12 = r55
            r1 = r61
            r2 = r1 & 32
            if (r2 == 0) goto L_0x0012
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r13 = r2
            goto L_0x0014
        L_0x0012:
            r13 = r58
        L_0x0014:
            r2 = r1 & 64
            if (r2 == 0) goto L_0x001a
            r15 = 0
            goto L_0x001c
        L_0x001a:
            r15 = r59
        L_0x001c:
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0023
            r16 = 0
            goto L_0x0025
        L_0x0023:
            r16 = r60
        L_0x0025:
            java.lang.String r1 = "$this$addComponents"
            p298d.p344x.p346c.C6888i.m12438e(r0, r1)
            java.lang.String r9 = "containerParent"
            p298d.p344x.p346c.C6888i.m12438e(r12, r9)
            java.util.List<com.appfoundry.previewer.model.Component> r1 = r0.f10972f
            if (r1 == 0) goto L_0x0671
            java.util.Iterator r17 = r1.iterator()
            r8 = r10
        L_0x0038:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x0671
            java.lang.Object r1 = r17.next()
            r7 = r1
            com.appfoundry.previewer.model.Component r7 = (com.appfoundry.previewer.model.Component) r7
            java.lang.String r1 = r7.f10942d
            com.appfoundry.previewer.model.Style r1 = p005b.p006a.p007a.p024o.C0823f.m345N(r1, r13)
            if (r1 == 0) goto L_0x0050
            com.appfoundry.previewer.model.Shadow r2 = r1.f11165z
            goto L_0x0051
        L_0x0050:
            r2 = 0
        L_0x0051:
            java.lang.String r5 = "component:text"
            r4 = -1
            r3 = 1
            if (r2 == 0) goto L_0x00fb
            java.lang.String r2 = r7.f10940b
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r2, r5)
            r2 = r2 ^ r3
            java.lang.String r14 = "component:svg"
            if (r2 == 0) goto L_0x0099
            java.lang.String r2 = r7.f10940b
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r2, r14)
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x0099
            java.lang.String r2 = "style"
            p298d.p344x.p346c.C6888i.m12438e(r1, r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r4, r4)
            r4 = r56
            r6 = r57
            b.a.a.j.k r3 = p005b.p038f.p039a.C0849e.m492N(r1, r4, r6)
            com.appfoundry.previewer.model.Dimensions r4 = r3.f553c
            p005b.p038f.p039a.C0849e.m552x0(r2, r4)
            b.a.a.b.k r4 = new b.a.a.b.k
            r4.<init>(r8, r3)
            r4.setLayoutParams(r2)
            java.lang.Float r1 = r1.f11129F
            if (r1 == 0) goto L_0x0095
            float r1 = r1.floatValue()
            r4.setRotation(r1)
        L_0x0095:
            r12.addView(r4)
            goto L_0x009b
        L_0x0099:
            r6 = r57
        L_0x009b:
            java.lang.String r1 = r7.f10940b
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r14)
            if (r1 == 0) goto L_0x00fd
            java.lang.String r1 = "component:svg-web-view"
            r7.f10940b = r1
            java.lang.String r1 = r7.f10944f
            com.appfoundry.previewer.model.Asset r1 = p005b.p006a.p007a.p024o.C0823f.m334C(r1, r13)
            if (r1 == 0) goto L_0x00b4
            java.lang.String r1 = r1.f10896b
            r19 = r1
            goto L_0x00b6
        L_0x00b4:
            r19 = 0
        L_0x00b6:
            com.appfoundry.previewer.model.Params r1 = new com.appfoundry.previewer.model.Params
            r18 = r1
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 268435454(0xffffffe, float:2.5243546E-29)
            r48 = 0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            r7.f10948j = r1
            goto L_0x00fd
        L_0x00fb:
            r6 = r57
        L_0x00fd:
            java.lang.String r1 = r0.f10967a
            r7.f10960v = r1
            java.lang.String r1 = "$this$isEnablePushButtonThatShouldBeHidden"
            p298d.p344x.p346c.C6888i.m12438e(r7, r1)
            com.appfoundry.previewer.BravoApp$b r1 = com.appfoundry.previewer.BravoApp.f10730N
            boolean r1 = com.appfoundry.previewer.BravoApp.f10746v
            if (r1 != 0) goto L_0x0110
            boolean r1 = com.appfoundry.previewer.BravoApp.f10747w
            if (r1 == 0) goto L_0x012b
        L_0x0110:
            java.lang.String r1 = "$this$hasEnableNotificationsTag"
            p298d.p344x.p346c.C6888i.m12438e(r7, r1)
            java.util.List<java.lang.String> r1 = r7.f10947i
            if (r1 == 0) goto L_0x0120
            java.lang.String r2 = "enablenotifications"
            boolean r1 = p005b.p038f.p039a.C0849e.m508b0(r1, r2)
            goto L_0x0121
        L_0x0120:
            r1 = 0
        L_0x0121:
            if (r1 == 0) goto L_0x012b
            boolean r1 = p005b.p038f.p039a.C0849e.m489K0()
            if (r1 == 0) goto L_0x012b
            r1 = 1
            goto L_0x012c
        L_0x012b:
            r1 = 0
        L_0x012c:
            if (r1 != 0) goto L_0x0664
            java.lang.String r1 = r7.f10940b
            r14 = 2
            if (r1 != 0) goto L_0x013b
        L_0x0133:
            r4 = -1
            r51 = r14
            r14 = r9
            r9 = r51
            goto L_0x01e5
        L_0x013b:
            int r2 = r1.hashCode()
            r3 = -2143027778(0xffffffff8043fdbe, float:-6.244004E-39)
            if (r2 == r3) goto L_0x01e9
            r3 = -317907064(0xffffffffed0d1f88, float:-2.729719E27)
            if (r2 == r3) goto L_0x014a
            goto L_0x0133
        L_0x014a:
            java.lang.String r2 = "component:compound"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0133
            java.lang.String r1 = "$this$addCompoundComponentWithoutStates"
            p298d.p344x.p346c.C6888i.m12438e(r7, r1)
            p298d.p344x.p346c.C6888i.m12438e(r12, r9)
            java.lang.String r1 = "$this$createClickHandlerView"
            p298d.p344x.p346c.C6888i.m12438e(r7, r1)
            android.widget.FrameLayout r5 = new android.widget.FrameLayout
            p298d.p344x.p346c.C6888i.m12436c(r53)
            r5.<init>(r8)
            java.lang.String r1 = r7.f10942d
            r2 = 0
            com.appfoundry.previewer.model.Style r1 = p005b.p006a.p007a.p024o.C0823f.m346O(r1, r2, r14)
            if (r1 == 0) goto L_0x0175
            com.appfoundry.previewer.model.Dimensions r1 = r1.f11152m
            r18 = r1
            goto L_0x0177
        L_0x0175:
            r18 = 0
        L_0x0177:
            java.lang.String r1 = "$this$setupTransparentView"
            p298d.p344x.p346c.C6888i.m12438e(r5, r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r1.<init>(r4, r4)
            r21 = 0
            r22 = 0
            r23 = 24
            r19 = r56
            r20 = r57
            b.a.a.j.b r14 = p005b.p038f.p039a.C0849e.m523j(r18, r19, r20, r21, r22, r23)
            com.appfoundry.previewer.model.Dimensions r2 = r14.f516c
            p005b.p038f.p039a.C0849e.m552x0(r1, r2)
            r5.setLayoutParams(r1)
            r1 = 0
            r5.setBackgroundColor(r1)
            r12.addView(r5)
            java.util.List<com.appfoundry.previewer.model.Component> r1 = r7.f10951m
            if (r1 == 0) goto L_0x0664
            java.util.Iterator r18 = r1.iterator()
        L_0x01a7:
            boolean r1 = r18.hasNext()
            if (r1 == 0) goto L_0x0664
            java.lang.Object r1 = r18.next()
            com.appfoundry.previewer.model.Component r1 = (com.appfoundry.previewer.model.Component) r1
            int r4 = r14.f514a
            int r7 = r14.f515b
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 112(0x70, float:1.57E-43)
            r2 = r53
            r3 = r54
            r49 = r5
            r5 = r7
            r6 = r19
            r7 = r20
            r50 = r8
            r8 = r21
            r59 = r14
            r14 = r9
            r9 = r22
            android.view.View r1 = m203g(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = r49
            r2.addView(r1)
            r6 = r57
            r5 = r2
            r9 = r14
            r8 = r50
            r14 = r59
            goto L_0x01a7
        L_0x01e5:
            r10 = r7
            r6 = 0
            goto L_0x02be
        L_0x01e9:
            r50 = r8
            r4 = -1
            r51 = r14
            r14 = r9
            r9 = r51
            java.lang.String r2 = "component:stateful-set"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x01e5
            java.lang.String r1 = "$this$addStatefulSet"
            p298d.p344x.p346c.C6888i.m12438e(r7, r1)
            p298d.p344x.p346c.C6888i.m12438e(r12, r14)
            java.lang.String r1 = r7.f10942d
            r6 = 0
            com.appfoundry.previewer.model.Style r1 = p005b.p006a.p007a.p024o.C0823f.m346O(r1, r6, r9)
            if (r1 == 0) goto L_0x020c
            com.appfoundry.previewer.model.Dimensions r6 = r1.f11152m
        L_0x020c:
            r18 = r6
            r21 = 0
            r22 = 0
            r23 = 24
            r19 = r56
            r20 = r57
            b.a.a.j.b r9 = p005b.p038f.p039a.C0849e.m523j(r18, r19, r20, r21, r22, r23)
            android.widget.FrameLayout r8 = new android.widget.FrameLayout
            p298d.p344x.p346c.C6888i.m12436c(r53)
            r1 = r50
            r8.<init>(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            int r2 = r9.f514a
            int r3 = r9.f515b
            r1.<init>(r2, r3)
            com.appfoundry.previewer.model.Dimensions r2 = r9.f516c
            p005b.p038f.p039a.C0849e.m552x0(r1, r2)
            r12.addView(r8, r1)
            b.a.a.j.c r18 = new b.a.a.j.c
            java.lang.String r3 = r7.f10960v
            java.lang.String r4 = r7.f10943e
            com.appfoundry.previewer.model.Actions r5 = r7.f10949k
            java.lang.String r6 = r7.f10952n
            java.util.List<java.lang.String> r2 = r7.f10947i
            java.lang.String r1 = r7.f10939a
            r19 = r1
            r1 = r18
            r20 = r2
            r2 = r54
            r10 = r7
            r7 = r20
            r20 = r8
            r8 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.appfoundry.previewer.model.States r8 = r10.f10950l
            if (r8 == 0) goto L_0x065e
            com.appfoundry.previewer.model.Component r1 = r8.f11112b
            if (r1 == 0) goto L_0x026c
            r2 = r53
            r3 = r10
            r4 = r9
            r5 = r20
            r6 = r18
            r7 = r54
            m193F(r1, r2, r3, r4, r5, r6, r7)
        L_0x026c:
            com.appfoundry.previewer.model.Component r1 = r8.f11111a
            if (r1 == 0) goto L_0x027d
            r2 = r53
            r3 = r10
            r4 = r9
            r5 = r20
            r6 = r18
            r7 = r54
            m193F(r1, r2, r3, r4, r5, r6, r7)
        L_0x027d:
            com.appfoundry.previewer.model.Component r1 = r8.f11113c
            if (r1 == 0) goto L_0x028e
            r2 = r53
            r3 = r10
            r4 = r9
            r5 = r20
            r6 = r18
            r7 = r54
            m193F(r1, r2, r3, r4, r5, r6, r7)
        L_0x028e:
            java.lang.String r1 = r10.f10957s
            if (r1 == 0) goto L_0x065e
            r10.f10961w = r1
            int r2 = r1.hashCode()
            r3 = -1422950650(0xffffffffab2f7f06, float:-6.234877E-13)
            if (r2 == r3) goto L_0x02b1
            r3 = 1544803905(0x5c13d641, float:1.66449585E17)
            if (r2 == r3) goto L_0x02a4
            goto L_0x065e
        L_0x02a4:
            java.lang.String r2 = "default"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x065e
            m195H(r10)
            goto L_0x065e
        L_0x02b1:
            java.lang.String r2 = "active"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x065e
            m194G(r10)
            goto L_0x065e
        L_0x02be:
            java.lang.String r1 = "$this$addSingleComponent"
            p298d.p344x.p346c.C6888i.m12438e(r0, r1)
            java.lang.String r1 = "component"
            p298d.p344x.p346c.C6888i.m12438e(r10, r1)
            p298d.p344x.p346c.C6888i.m12438e(r12, r14)
            java.lang.String r1 = "dev:ignore:android"
            boolean r1 = m215s(r10, r1)
            if (r1 != 0) goto L_0x065e
            r1 = r10
            r2 = r53
            r8 = 1
            r3 = r54
            r7 = r4
            r4 = r56
            r9 = r5
            r5 = r57
            r19 = r14
            r14 = r6
            r6 = r13
            r7 = r15
            r14 = r8
            r8 = r16
            android.view.View r6 = m202f(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r1 = "componentView"
            java.lang.String r2 = ""
            if (r11 == 0) goto L_0x03ae
            boolean r3 = r6 instanceof android.widget.EditText
            java.lang.String r4 = "component:input-file"
            java.lang.String r5 = "component:input-image"
            if (r3 != 0) goto L_0x0310
            java.lang.String r3 = "$this$isUpload"
            p298d.p344x.p346c.C6888i.m12438e(r10, r3)
            boolean r3 = m190C(r10, r5)
            if (r3 != 0) goto L_0x030d
            boolean r3 = m190C(r10, r4)
            if (r3 == 0) goto L_0x030b
            goto L_0x030d
        L_0x030b:
            r3 = 0
            goto L_0x030e
        L_0x030d:
            r3 = r14
        L_0x030e:
            if (r3 == 0) goto L_0x03ae
        L_0x0310:
            b.a.a.n.d r3 = p005b.p006a.p007a.p023n.C0812d.f622f
            java.lang.String r3 = "$this$createFormInput"
            p298d.p344x.p346c.C6888i.m12438e(r10, r3)
            p298d.p344x.p346c.C6888i.m12438e(r6, r1)
            b.a.a.j.e r3 = new b.a.a.j.e
            java.lang.String r7 = r10.f10940b
            if (r7 == 0) goto L_0x0323
            r21 = r7
            goto L_0x0325
        L_0x0323:
            r21 = r2
        L_0x0325:
            java.lang.String r7 = r10.f10939a
            if (r7 == 0) goto L_0x032c
            r22 = r7
            goto L_0x032e
        L_0x032c:
            r22 = r2
        L_0x032e:
            java.lang.String r7 = "$this$toEditText"
            p298d.p344x.p346c.C6888i.m12438e(r10, r7)
            p298d.p344x.p346c.C6888i.m12438e(r6, r1)
            boolean r5 = m190C(r10, r5)
            if (r5 != 0) goto L_0x0345
            boolean r4 = m190C(r10, r4)
            if (r4 == 0) goto L_0x0343
            goto L_0x0345
        L_0x0343:
            r4 = r6
            goto L_0x0346
        L_0x0345:
            r4 = 0
        L_0x0346:
            r23 = r4
            android.widget.EditText r23 = (android.widget.EditText) r23
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            com.appfoundry.previewer.model.Params r4 = r10.f10948j
            if (r4 == 0) goto L_0x035d
            java.lang.Boolean r4 = r4.f11060B
            r29 = r4
            goto L_0x035f
        L_0x035d:
            r29 = 0
        L_0x035f:
            r30 = 248(0xf8, float:3.48E-43)
            r20 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.String r4 = "newFormInput"
            p298d.p344x.p346c.C6888i.m12438e(r3, r4)
            java.lang.String r4 = "pageId"
            p298d.p344x.p346c.C6888i.m12438e(r11, r4)
            java.util.Map<java.lang.String, java.util.List<b.a.a.j.e>> r4 = p005b.p006a.p007a.p023n.C0812d.f617a
            java.lang.Object r4 = r4.get(r11)
            if (r4 != 0) goto L_0x0382
            java.util.Map<java.lang.String, java.util.List<b.a.a.j.e>> r4 = p005b.p006a.p007a.p023n.C0812d.f617a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.put(r11, r5)
        L_0x0382:
            java.util.Map<java.lang.String, java.util.List<b.a.a.j.e>> r4 = p005b.p006a.p007a.p023n.C0812d.f617a
            java.lang.Object r4 = r4.get(r11)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x03ae
            int r5 = r4.size()
            r7 = 0
        L_0x0391:
            if (r7 >= r5) goto L_0x03ab
            java.lang.Object r8 = r4.get(r7)
            b.a.a.j.e r8 = (p005b.p006a.p007a.p019j.C0774e) r8
            java.lang.String r8 = r8.f528b
            java.lang.String r14 = r3.f528b
            boolean r8 = p298d.p344x.p346c.C6888i.m12434a(r8, r14)
            if (r8 == 0) goto L_0x03a7
            r4.set(r7, r3)
            goto L_0x03ae
        L_0x03a7:
            int r7 = r7 + 1
            r14 = 1
            goto L_0x0391
        L_0x03ab:
            r4.add(r3)
        L_0x03ae:
            java.lang.String r3 = r0.f10980n
            if (r3 == 0) goto L_0x0593
            java.lang.String r3 = "$this$getAudioType"
            p298d.p344x.p346c.C6888i.m12438e(r10, r3)
            java.lang.String r3 = "play"
            boolean r3 = m213q(r10, r3)
            java.lang.String r5 = "action:pause"
            java.lang.String r7 = "action:play"
            if (r3 == 0) goto L_0x03c5
            r3 = r7
            goto L_0x03e5
        L_0x03c5:
            java.lang.String r3 = "pause"
            boolean r3 = m213q(r10, r3)
            if (r3 == 0) goto L_0x03cf
            r3 = r5
            goto L_0x03e5
        L_0x03cf:
            java.lang.String r3 = "audio"
            boolean r8 = m215s(r10, r3)
            if (r8 == 0) goto L_0x03e4
            java.util.List<java.lang.String> r8 = r10.f10947i
            if (r8 == 0) goto L_0x03e2
            java.lang.String r3 = p005b.p038f.p039a.C0849e.m495Q(r8, r3)
            if (r3 == 0) goto L_0x03e2
            goto L_0x03e5
        L_0x03e2:
            r3 = r2
            goto L_0x03e5
        L_0x03e4:
            r3 = 0
        L_0x03e5:
            if (r3 == 0) goto L_0x0593
            com.appfoundry.previewer.BravoApp$b r8 = com.appfoundry.previewer.BravoApp.f10730N
            java.util.Map<java.lang.String, java.util.List<b.a.a.j.a>> r8 = com.appfoundry.previewer.BravoApp.f10719C
            java.lang.String r14 = r0.f10980n
            java.lang.Object r8 = r8.get(r14)
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x041d
            java.util.Iterator r8 = r8.iterator()
        L_0x03f9:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x0416
            java.lang.Object r14 = r8.next()
            r4 = r14
            b.a.a.j.a r4 = (p005b.p006a.p007a.p019j.C0770a) r4
            java.lang.String r4 = r4.f510a
            r20 = r2
            java.lang.String r2 = r10.f10939a
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r4, r2)
            if (r2 == 0) goto L_0x0413
            goto L_0x0419
        L_0x0413:
            r2 = r20
            goto L_0x03f9
        L_0x0416:
            r20 = r2
            r14 = 0
        L_0x0419:
            r2 = r14
            b.a.a.j.a r2 = (p005b.p006a.p007a.p019j.C0770a) r2
            goto L_0x0420
        L_0x041d:
            r20 = r2
            r2 = 0
        L_0x0420:
            if (r2 != 0) goto L_0x0447
            com.appfoundry.previewer.BravoApp$b r2 = com.appfoundry.previewer.BravoApp.f10730N
            java.util.Map<java.lang.String, java.util.List<b.a.a.j.a>> r2 = com.appfoundry.previewer.BravoApp.f10719C
            java.lang.String r4 = r0.f10980n
            java.lang.Object r2 = r2.get(r4)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x044e
            b.a.a.j.a r4 = new b.a.a.j.a
            java.lang.String r8 = r10.f10939a
            if (r8 == 0) goto L_0x0437
            goto L_0x0439
        L_0x0437:
            r8 = r20
        L_0x0439:
            java.lang.String r14 = r0.f10967a
            if (r14 == 0) goto L_0x043e
            goto L_0x0440
        L_0x043e:
            r14 = r20
        L_0x0440:
            r4.<init>(r8, r14, r3, r6)
            r2.add(r4)
            goto L_0x044e
        L_0x0447:
            java.lang.String r4 = "<set-?>"
            p298d.p344x.p346c.C6888i.m12438e(r6, r4)
            r2.f513d = r6
        L_0x044e:
            java.lang.String r2 = r0.f10967a
            r10.f10960v = r2
            com.appfoundry.previewer.BravoApp$b r2 = com.appfoundry.previewer.BravoApp.f10730N
            b.a.a.j.h r2 = com.appfoundry.previewer.BravoApp.f10720D
            java.lang.String r4 = "0:00"
            java.lang.String r8 = "audio:currenttime"
            java.lang.String r14 = "audio:totaltime"
            java.lang.String r0 = "audio:loading"
            if (r2 != 0) goto L_0x0496
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r3, r14)
            if (r2 == 0) goto L_0x046b
            r2 = 8
            r6.setVisibility(r2)
        L_0x046b:
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r3, r8)
            if (r2 == 0) goto L_0x0477
            r2 = r6
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r4)
        L_0x0477:
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r3, r7)
            if (r2 == 0) goto L_0x0481
            r2 = 0
            r6.setVisibility(r2)
        L_0x0481:
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r3, r5)
            if (r2 == 0) goto L_0x048c
            r2 = 8
            r6.setVisibility(r2)
        L_0x048c:
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r3, r0)
            if (r0 == 0) goto L_0x0593
            r2 = r53
            goto L_0x0550
        L_0x0496:
            java.lang.String r2 = r2.f542a
            if (r2 == 0) goto L_0x049b
            goto L_0x049d
        L_0x049b:
            r2 = r20
        L_0x049d:
            r20 = r10
            java.lang.String r10 = m204h(r52)
            if (r10 == 0) goto L_0x0554
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r10, r2)
            if (r2 == 0) goto L_0x0554
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r3, r14)
            if (r2 == 0) goto L_0x04cd
            r2 = 0
            r6.setVisibility(r2)
            r2 = r6
            android.widget.TextView r2 = (android.widget.TextView) r2
            b.a.a.j.h r4 = com.appfoundry.previewer.BravoApp.f10720D
            if (r4 == 0) goto L_0x04c9
            android.media.MediaPlayer r4 = r4.f544c
            if (r4 == 0) goto L_0x04c9
            int r4 = r4.getDuration()
            java.lang.String r4 = p005b.p038f.p039a.C0849e.m520h0(r4)
            goto L_0x04ca
        L_0x04c9:
            r4 = 0
        L_0x04ca:
            r2.setText(r4)
        L_0x04cd:
            b.a.a.j.h r2 = com.appfoundry.previewer.BravoApp.f10720D
            if (r2 == 0) goto L_0x0513
            android.media.MediaPlayer r2 = r2.f544c
            if (r2 == 0) goto L_0x0513
            boolean r2 = r2.isPlaying()
            r4 = 1
            if (r2 != r4) goto L_0x0513
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r3, r7)
            if (r2 == 0) goto L_0x04e8
            r2 = 8
            r6.setVisibility(r2)
            goto L_0x04ea
        L_0x04e8:
            r2 = 8
        L_0x04ea:
            boolean r4 = p298d.p344x.p346c.C6888i.m12434a(r3, r5)
            if (r4 == 0) goto L_0x04f4
            r4 = 0
            r6.setVisibility(r4)
        L_0x04f4:
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r3, r0)
            if (r0 == 0) goto L_0x04fd
            r6.setVisibility(r2)
        L_0x04fd:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            r2 = r53
            r10 = r20
            java.util.Objects.requireNonNull(r2, r0)
            r0 = r2
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            b.a.a.i.g r4 = new b.a.a.i.g
            r4.<init>(r3, r6)
            r0.runOnUiThread(r4)
            goto L_0x0595
        L_0x0513:
            r2 = r53
            r10 = r20
            boolean r4 = p298d.p344x.p346c.C6888i.m12434a(r3, r7)
            if (r4 == 0) goto L_0x0521
            r4 = 0
            r6.setVisibility(r4)
        L_0x0521:
            boolean r4 = p298d.p344x.p346c.C6888i.m12434a(r3, r5)
            if (r4 == 0) goto L_0x052c
            r4 = 8
            r6.setVisibility(r4)
        L_0x052c:
            boolean r4 = p298d.p344x.p346c.C6888i.m12434a(r3, r8)
            if (r4 == 0) goto L_0x054a
            r4 = r6
            android.widget.TextView r4 = (android.widget.TextView) r4
            b.a.a.j.h r5 = com.appfoundry.previewer.BravoApp.f10720D
            if (r5 == 0) goto L_0x0546
            android.media.MediaPlayer r5 = r5.f544c
            if (r5 == 0) goto L_0x0546
            int r5 = r5.getCurrentPosition()
            java.lang.String r5 = p005b.p038f.p039a.C0849e.m520h0(r5)
            goto L_0x0547
        L_0x0546:
            r5 = 0
        L_0x0547:
            r4.setText(r5)
        L_0x054a:
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r3, r0)
            if (r0 == 0) goto L_0x0595
        L_0x0550:
            r4 = 0
            r5 = 8
            goto L_0x058f
        L_0x0554:
            r2 = r53
            r10 = r20
            boolean r14 = p298d.p344x.p346c.C6888i.m12434a(r3, r14)
            if (r14 == 0) goto L_0x0563
            r14 = 8
            r6.setVisibility(r14)
        L_0x0563:
            boolean r8 = p298d.p344x.p346c.C6888i.m12434a(r3, r8)
            if (r8 == 0) goto L_0x056f
            r8 = r6
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setText(r4)
        L_0x056f:
            boolean r4 = p298d.p344x.p346c.C6888i.m12434a(r3, r7)
            if (r4 == 0) goto L_0x057a
            r4 = 0
            r6.setVisibility(r4)
            goto L_0x057b
        L_0x057a:
            r4 = 0
        L_0x057b:
            boolean r5 = p298d.p344x.p346c.C6888i.m12434a(r3, r5)
            if (r5 == 0) goto L_0x0587
            r5 = 8
            r6.setVisibility(r5)
            goto L_0x0589
        L_0x0587:
            r5 = 8
        L_0x0589:
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r3, r0)
            if (r0 == 0) goto L_0x0596
        L_0x058f:
            r6.setVisibility(r5)
            goto L_0x0596
        L_0x0593:
            r2 = r53
        L_0x0595:
            r4 = 0
        L_0x0596:
            java.lang.String r0 = "goBack"
            boolean r0 = m213q(r10, r0)
            if (r0 == 0) goto L_0x05c8
            if (r2 == 0) goto L_0x05c8
            java.lang.String r0 = "$this$hasNowhereToGoIfBack"
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            boolean r0 = r2 instanceof androidx.appcompat.app.AppCompatActivity
            if (r0 == 0) goto L_0x05bf
            r0 = r2
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            java.lang.String r3 = "supportFragmentManager"
            p298d.p344x.p346c.C6888i.m12437d(r0, r3)
            int r0 = r0.getBackStackEntryCount()
            r3 = 1
            if (r0 > r3) goto L_0x05bd
            goto L_0x05c0
        L_0x05bd:
            r0 = r4
            goto L_0x05c1
        L_0x05bf:
            r3 = 1
        L_0x05c0:
            r0 = r3
        L_0x05c1:
            if (r0 != r3) goto L_0x05c8
            r0 = 8
            r6.setVisibility(r0)
        L_0x05c8:
            r12.addView(r6)
            java.lang.String r0 = "$this$handleLayoutGravityOnTexts"
            p298d.p344x.p346c.C6888i.m12438e(r10, r0)
            p298d.p344x.p346c.C6888i.m12438e(r6, r1)
            java.lang.String r0 = r10.f10940b
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r9)
            if (r0 == 0) goto L_0x065c
            java.lang.String r0 = r10.f10942d
            r1 = 2
            r3 = 0
            com.appfoundry.previewer.model.Style r0 = p005b.p006a.p007a.p024o.C0823f.m346O(r0, r3, r1)
            if (r0 == 0) goto L_0x065c
            java.lang.String r1 = r0.f11155p
            if (r1 != 0) goto L_0x05ea
            goto L_0x060f
        L_0x05ea:
            int r3 = r1.hashCode()
            r5 = -1704601170(0xffffffff9a65d9ae, float:-4.753193E-23)
            if (r3 == r5) goto L_0x0604
            r5 = -1245812558(0xffffffffb5be68b2, float:-1.4186573E-6)
            if (r3 == r5) goto L_0x05f9
            goto L_0x060f
        L_0x05f9:
            java.lang.String r3 = "from-top"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x060f
            r1 = 48
            goto L_0x0610
        L_0x0604:
            java.lang.String r3 = "from-bottom"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x060f
            r1 = 80
            goto L_0x0610
        L_0x060f:
            r1 = -1
        L_0x0610:
            java.lang.String r0 = r0.f11154o
            if (r0 != 0) goto L_0x0615
            goto L_0x063c
        L_0x0615:
            int r3 = r0.hashCode()
            r5 = 34268234(0x20ae44a, float:1.0204155E-37)
            if (r3 == r5) goto L_0x0630
            r5 = 1067976249(0x3fa80639, float:1.3126899)
            if (r3 == r5) goto L_0x0624
            goto L_0x063c
        L_0x0624:
            java.lang.String r3 = "from-right"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x063c
            r0 = 8388613(0x800005, float:1.175495E-38)
            goto L_0x063d
        L_0x0630:
            java.lang.String r3 = "from-left"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x063c
            r0 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x063d
        L_0x063c:
            r0 = -1
        L_0x063d:
            r3 = -1
            if (r1 != r3) goto L_0x0642
            if (r0 == r3) goto L_0x065c
        L_0x0642:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            java.lang.String r6 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            java.util.Objects.requireNonNull(r5, r6)
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
            if (r1 == r3) goto L_0x0653
            if (r0 == r3) goto L_0x0653
            r0 = r0 | r1
            goto L_0x0655
        L_0x0653:
            if (r1 != r3) goto L_0x0658
        L_0x0655:
            r5.gravity = r0
            goto L_0x065c
        L_0x0658:
            if (r0 != r3) goto L_0x065c
            r5.gravity = r1
        L_0x065c:
            r8 = r2
            goto L_0x066a
        L_0x065e:
            r2 = r53
            r19 = r14
            r4 = 0
            goto L_0x065c
        L_0x0664:
            r1 = r8
            r19 = r9
            r2 = r10
            r4 = 0
            r8 = r1
        L_0x066a:
            r0 = r52
            r10 = r2
            r9 = r19
            goto L_0x0038
        L_0x0671:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p018i.C0744e.m199c(com.appfoundry.previewer.model.Container, android.content.Context, java.lang.String, android.widget.FrameLayout, int, int, java.lang.Boolean, int, boolean, int):void");
    }

    /* renamed from: d */
    public static C0594b m200d(Page page, Boolean bool, int i) {
        Boolean bool2 = (i & 1) != 0 ? Boolean.FALSE : null;
        C6888i.m12438e(page, "$this$createFragment");
        C0594b jVar = C6888i.m12434a(page.f11035c, "page:swipe") ? new C0612j() : new C0605h();
        jVar.f210g = page;
        jVar.f212i = bool2;
        return jVar;
    }

    /* renamed from: e */
    public static final void m201e(Container container, Context context, String str, FrameLayout frameLayout, Boolean bool, float f) {
        int i;
        App app2;
        Data data;
        List<Page> list;
        T t;
        List<Component> list2;
        int i2;
        Container container2 = container;
        Context context2 = context;
        FrameLayout frameLayout2 = frameLayout;
        float f2 = f;
        C6888i.m12438e(container, "$this$createLayout");
        C6888i.m12438e(context2, BasePayload.CONTEXT_KEY);
        C6888i.m12438e(frameLayout2, "containerParent");
        Style N = C0823f.m345N(container2.f10969c, bool);
        int l = N != null ? C0849e.m527l(N, f2) : 0;
        if (N != null) {
            List<String> list3 = container2.f10976j;
            boolean V = list3 != null ? C0849e.m500V(list3) : false;
            C6888i.m12438e(N, "$this$containerHeight");
            if (N.f11162w == null || V) {
                i2 = C0849e.m548v0(N);
            } else {
                Float f3 = N.f11162w;
                C6888i.m12436c(f3);
                i2 = (int) (((float) C0849e.m527l(N, f2)) / f3.floatValue());
            }
            i = i2;
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        int j = N != null ? C0849e.m518g0(N) : false ? m206j(container, context2, l, i) : 0;
        String str2 = null;
        if (layoutParams instanceof FlexboxLayoutManager.C5464c) {
            FlexboxLayoutManager.C5464c cVar = (FlexboxLayoutManager.C5464c) layoutParams;
            cVar.f11226g = 0.0f;
            cVar.width = l;
            cVar.height = i + j;
            Dimensions k = C0849e.m525k(N != null ? N.f11150k : null, l);
            C6888i.m12438e(cVar, "$this$setComputedMargins");
            Float f4 = k.f10989a;
            int floatValue = f4 != null ? (int) f4.floatValue() : 0;
            Float f5 = k.f10990b;
            int floatValue2 = f5 != null ? (int) f5.floatValue() : 0;
            Float f6 = k.f10991c;
            int floatValue3 = f6 != null ? (int) f6.floatValue() : 0;
            Float f7 = k.f10992d;
            cVar.setMargins(floatValue, floatValue2, floatValue3, f7 != null ? (int) f7.floatValue() : 0);
        } else if ((layoutParams instanceof RecyclerView.LayoutParams) && C6888i.m12434a(container2.f10981o, Boolean.TRUE)) {
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            layoutParams2.width = l;
            layoutParams2.height = i;
            Dimensions k2 = C0849e.m525k(N != null ? N.f11150k : null, l);
            C6888i.m12438e(layoutParams2, "$this$setComputedMargins");
            Float f8 = k2.f10989a;
            int floatValue4 = f8 != null ? (int) f8.floatValue() : 0;
            Float f9 = k2.f10990b;
            int floatValue5 = f9 != null ? (int) f9.floatValue() : 0;
            Float f10 = k2.f10991c;
            int floatValue6 = f10 != null ? (int) f10.floatValue() : 0;
            Float f11 = k2.f10992d;
            layoutParams2.setMargins(floatValue4, floatValue5, floatValue6, f11 != null ? (int) f11.floatValue() : 0);
        } else if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams3.width = -1;
            layoutParams3.height = -1;
            C0849e.m552x0(layoutParams3, C0849e.m525k(N != null ? N.f11150k : null, -1));
        }
        m211o(container);
        Container container3 = container;
        Context context3 = context;
        m197a(container3, context3, frameLayout, l, i + j, bool);
        m198b(container3, context3, str, frameLayout, l, i, bool, j);
        m212p(container, str, frameLayout2);
        if (C6888i.m12434a(C0823f.m352U(container2.f10967a), Boolean.TRUE)) {
            Container p = C0823f.m388p();
            if (!(p == null || (list2 = p.f10972f) == null)) {
                for (Component H : list2) {
                    m195H(H);
                }
            }
            BravoApp.C5403b bVar = BravoApp.f10730N;
            JsonApp jsonApp = BravoApp.f10738n;
            if (!(jsonApp == null || (app2 = jsonApp.f11021d) == null || (data = app2.f10891e) == null || (list = data.f10985b) == null)) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    Page page = (Page) t;
                    boolean z = true;
                    if (!C6888i.m12434a(page.f11042j, Boolean.TRUE) || !(!C6888i.m12434a(page.f11035c, "page:swipe"))) {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                Page page2 = (Page) t;
                if (page2 != null) {
                    str2 = page2.f11033a;
                }
            }
            Component s = C0849e.m541s(str2);
            if (s != null) {
                m194G(s);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d6, code lost:
        if (r13 != false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e4, code lost:
        if (r12 != null) goto L_0x00e6;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.View m202f(com.appfoundry.previewer.model.Component r14, android.content.Context r15, java.lang.String r16, int r17, int r18, java.lang.Boolean r19, int r20, boolean r21) {
        /*
            r9 = r14
            r10 = r16
            java.lang.String r0 = "$this$createView"
            p298d.p344x.p346c.C6888i.m12438e(r14, r0)
            java.lang.String r0 = "$this$parseTags"
            p298d.p344x.p346c.C6888i.m12438e(r14, r0)
            java.util.List<java.lang.String> r0 = r9.f10947i
            java.lang.String r11 = "dev:scan"
            r12 = 0
            r13 = 1
            if (r0 == 0) goto L_0x008d
            java.lang.String r1 = "$this$getDevTag"
            p298d.p344x.p346c.C6888i.m12438e(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x001e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0038
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "$this$isDevTag"
            p298d.p344x.p346c.C6888i.m12438e(r1, r2)
            java.lang.String r2 = "dev:"
            boolean r2 = p298d.p415c0.C7694h.m13924b(r1, r2, r13)
            if (r2 == 0) goto L_0x001e
            goto L_0x0039
        L_0x0038:
            r1 = r12
        L_0x0039:
            if (r1 == 0) goto L_0x008d
            java.lang.String r0 = "$this$isBuildNumber"
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            java.lang.String r0 = "buildnumber"
            boolean r0 = p298d.p415c0.C7694h.m13924b(r1, r0, r13)
            if (r0 == 0) goto L_0x0051
            com.appfoundry.previewer.model.Text r0 = r9.f10941c
            if (r0 == 0) goto L_0x008d
            java.lang.String r1 = "3.0.180"
            r0.f11168a = r1
            goto L_0x008d
        L_0x0051:
            java.lang.String r0 = "$this$isSvgFill"
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            java.lang.String r0 = "dev:fill"
            boolean r0 = p298d.p415c0.C7694h.m13924b(r1, r0, r13)
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r9.f10942d
            r1 = 2
            com.appfoundry.previewer.model.Style r0 = p005b.p006a.p007a.p024o.C0823f.m346O(r0, r12, r1)
            if (r0 == 0) goto L_0x008d
            java.lang.String r1 = "fill"
            r0.f11156q = r1
            goto L_0x008d
        L_0x006c:
            java.lang.String r0 = "$this$isDevScan"
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            boolean r0 = p298d.p415c0.C7694h.m13928f(r1, r11, r13)
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r9.f10940b
            java.lang.String r2 = "component:image"
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r2)
            if (r0 == 0) goto L_0x008d
            java.util.List<java.lang.String> r0 = r9.f10947i
            java.lang.String r2 = "action:show-emulator-appList"
            r0.add(r2)
            java.util.List<java.lang.String> r0 = r9.f10947i
            r0.remove(r1)
        L_0x008d:
            java.lang.String r0 = r9.f10942d
            r6 = r19
            com.appfoundry.previewer.model.Style r3 = p005b.p006a.p007a.p024o.C0823f.m345N(r0, r6)
            r0 = r14
            r1 = r15
            r2 = r16
            r4 = r17
            r5 = r18
            r7 = r20
            r8 = r21
            android.view.View r0 = m209m(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            com.appfoundry.previewer.model.Actions r1 = r9.f10949k
            r2 = 0
            if (r1 == 0) goto L_0x00ca
            com.appfoundry.previewer.model.Tap r1 = r1.f10886a
            if (r1 == 0) goto L_0x00ca
            java.lang.String r1 = r1.f11166a
            if (r1 == 0) goto L_0x00ca
            java.lang.String r3 = "filter"
            boolean r1 = r1.equals(r3)
            if (r1 != r13) goto L_0x00ca
            boolean r1 = r0 instanceof android.widget.EditText
            if (r1 == 0) goto L_0x00ca
            r1 = r0
            android.widget.EditText r1 = (android.widget.EditText) r1
            b.a.a.i.e$a r3 = new b.a.a.i.e$a
            r3.<init>(r10)
            r1.addTextChangedListener(r3)
            goto L_0x00ee
        L_0x00ca:
            java.lang.String r1 = r9.f10943e
            if (r1 == 0) goto L_0x00d8
            int r1 = r1.length()
            if (r1 != 0) goto L_0x00d5
            goto L_0x00d6
        L_0x00d5:
            r13 = r2
        L_0x00d6:
            if (r13 == 0) goto L_0x00e6
        L_0x00d8:
            com.appfoundry.previewer.model.Actions r1 = r9.f10949k
            if (r1 != 0) goto L_0x00e6
            java.util.List<java.lang.String> r1 = r9.f10947i
            if (r1 == 0) goto L_0x00e4
            java.lang.String r12 = p005b.p038f.p039a.C0849e.m549w(r1)
        L_0x00e4:
            if (r12 == 0) goto L_0x00ee
        L_0x00e6:
            b.a.a.i.e$b r1 = new b.a.a.i.e$b
            r1.<init>(r14, r10)
            r0.setOnClickListener(r1)
        L_0x00ee:
            java.util.List<java.lang.String> r1 = r9.f10947i
            if (r1 == 0) goto L_0x00fb
            java.lang.String r3 = "$this$hasScanTag"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r1 = p005b.p038f.p039a.C0849e.m495Q(r1, r11)
        L_0x00fb:
            java.lang.String r1 = "$this$hasEnableNotificationsTag"
            p298d.p344x.p346c.C6888i.m12438e(r14, r1)
            java.util.List<java.lang.String> r1 = r9.f10947i
            if (r1 == 0) goto L_0x010a
            java.lang.String r2 = "enablenotifications"
            boolean r2 = p005b.p038f.p039a.C0849e.m508b0(r1, r2)
        L_0x010a:
            if (r2 == 0) goto L_0x0141
            com.appfoundry.previewer.BravoApp$b r1 = com.appfoundry.previewer.BravoApp.f10730N
            java.util.List<b.a.a.j.i> r1 = com.appfoundry.previewer.BravoApp.f10749y
            b.a.a.j.i r2 = new b.a.a.j.i
            java.lang.String r3 = r9.f10939a
            r2.<init>(r3, r0)
            java.lang.String r3 = "$this$addIfNotThere"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r3 = "newView"
            p298d.p344x.p346c.C6888i.m12438e(r2, r3)
            java.util.Iterator r3 = r1.iterator()
        L_0x0125:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x013e
            java.lang.Object r4 = r3.next()
            b.a.a.j.i r4 = (p005b.p006a.p007a.p019j.C0778i) r4
            java.lang.String r5 = r4.f547a
            java.lang.String r6 = r2.f547a
            boolean r5 = p298d.p344x.p346c.C6888i.m12434a(r5, r6)
            if (r5 == 0) goto L_0x0125
            r1.remove(r4)
        L_0x013e:
            r1.add(r2)
        L_0x0141:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p018i.C0744e.m202f(com.appfoundry.previewer.model.Component, android.content.Context, java.lang.String, int, int, java.lang.Boolean, int, boolean):android.view.View");
    }

    /* renamed from: g */
    public static /* synthetic */ View m203g(Component component, Context context, String str, int i, int i2, Boolean bool, int i3, boolean z, int i4) {
        return m202f(component, context, (i4 & 2) != 0 ? null : str, i, i2, (i4 & 16) != 0 ? Boolean.FALSE : bool, (i4 & 32) != 0 ? 0 : i3, (i4 & 64) != 0 ? false : z);
    }

    /* renamed from: h */
    public static final String m204h(Container container) {
        T t;
        Actions actions;
        C6888i.m12438e(container, "$this$getAudioUrl");
        List<Component> list = container.f10972f;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (m213q((Component) t, "play")) {
                break;
            }
        }
        Component component = (Component) t;
        if (component == null || (actions = component.f10949k) == null) {
            return null;
        }
        return C0849e.m496R(actions);
    }

    /* renamed from: i */
    public static final Component m205i(Container container, String str) {
        C6888i.m12438e(container, "$this$getComponentWithTag");
        C6888i.m12438e(str, "tagToFind");
        List<Component> list = container.f10972f;
        T t = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            List<String> list2 = ((Component) next).f10947i;
            boolean z = true;
            if (list2 == null || !C0849e.m508b0(list2, str)) {
                z = false;
                continue;
            }
            if (z) {
                t = next;
                break;
            }
        }
        return (Component) t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0050, code lost:
        r9 = r9.f11168a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0181  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m206j(com.appfoundry.previewer.model.Container r23, android.content.Context r24, int r25, int r26) {
        /*
            r0 = r23
            r1 = r24
            java.lang.String r2 = "$this$getFlexoComponentExtraHeight"
            p298d.p344x.p346c.C6888i.m12438e(r0, r2)
            java.util.List<com.appfoundry.previewer.model.Component> r0 = r0.f10972f
            r2 = 0
            if (r0 == 0) goto L_0x027f
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x027f
            java.lang.Object r3 = r0.next()
            com.appfoundry.previewer.model.Component r3 = (com.appfoundry.previewer.model.Component) r3
            java.lang.String r4 = r3.f10942d
            r5 = 2
            r6 = 0
            com.appfoundry.previewer.model.Style r4 = p005b.p006a.p007a.p024o.C0823f.m346O(r4, r6, r5)
            if (r4 == 0) goto L_0x0012
            boolean r7 = p005b.p038f.p039a.C0849e.m518g0(r4)
            r8 = 1
            if (r7 != r8) goto L_0x0012
            com.appfoundry.previewer.model.Dimensions r9 = r4.f11152m
            r12 = 0
            r13 = 0
            r14 = 24
            r10 = r25
            r11 = r26
            b.a.a.j.b r0 = p005b.p038f.p039a.C0849e.m523j(r9, r10, r11, r12, r13, r14)
            java.lang.String r7 = "$this$getFlexoView"
            p298d.p344x.p346c.C6888i.m12438e(r3, r7)
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r1)
            com.appfoundry.previewer.model.Text r9 = r3.f10941c
            java.lang.String r10 = "$this$setupFlexo"
            p298d.p344x.p346c.C6888i.m12438e(r7, r10)
            if (r9 == 0) goto L_0x0059
            java.lang.String r9 = r9.f11168a
            if (r9 == 0) goto L_0x0059
            java.lang.String r9 = p005b.p006a.p007a.p018i.C0756o.m235m(r9)
            goto L_0x005a
        L_0x0059:
            r9 = r6
        L_0x005a:
            android.widget.TextView$BufferType r10 = android.widget.TextView.BufferType.EDITABLE
            r7.setText(r9, r10)
            java.lang.String r10 = r4.f11141b
            if (r10 == 0) goto L_0x0068
            int r10 = p005b.p006a.p007a.p018i.C0756o.m233k(r10)
            goto L_0x006a
        L_0x0068:
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x006a:
            r7.setTextColor(r10)
            java.lang.String r10 = r4.f11153n
            r11 = 3
            if (r10 != 0) goto L_0x0073
            goto L_0x00a5
        L_0x0073:
            int r13 = r10.hashCode()
            r14 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r13 == r14) goto L_0x009b
            r14 = 3317767(0x32a007, float:4.649182E-39)
            if (r13 == r14) goto L_0x0091
            r14 = 108511772(0x677c21c, float:4.6598146E-35)
            if (r13 == r14) goto L_0x0087
            goto L_0x00a5
        L_0x0087:
            java.lang.String r13 = "right"
            boolean r10 = r10.equals(r13)
            if (r10 == 0) goto L_0x00a5
            r10 = r11
            goto L_0x00a6
        L_0x0091:
            java.lang.String r13 = "left"
            boolean r10 = r10.equals(r13)
            if (r10 == 0) goto L_0x00a5
            r10 = r5
            goto L_0x00a6
        L_0x009b:
            java.lang.String r13 = "center"
            boolean r10 = r10.equals(r13)
            if (r10 == 0) goto L_0x00a5
            r10 = 4
            goto L_0x00a6
        L_0x00a5:
            r10 = r2
        L_0x00a6:
            r7.setTextAlignment(r10)
            java.lang.String r10 = r4.f11155p
            r13 = 16
            if (r10 != 0) goto L_0x00b0
            goto L_0x00d5
        L_0x00b0:
            int r14 = r10.hashCode()
            r15 = -1704601170(0xffffffff9a65d9ae, float:-4.753193E-23)
            if (r14 == r15) goto L_0x00ca
            r15 = -1245812558(0xffffffffb5be68b2, float:-1.4186573E-6)
            if (r14 == r15) goto L_0x00bf
            goto L_0x00d5
        L_0x00bf:
            java.lang.String r14 = "from-top"
            boolean r10 = r10.equals(r14)
            if (r10 == 0) goto L_0x00d5
            r10 = 48
            goto L_0x00d6
        L_0x00ca:
            java.lang.String r14 = "from-bottom"
            boolean r10 = r10.equals(r14)
            if (r10 == 0) goto L_0x00d5
            r10 = 80
            goto L_0x00d6
        L_0x00d5:
            r10 = r13
        L_0x00d6:
            java.lang.String r14 = r4.f11154o
            if (r14 != 0) goto L_0x00db
            goto L_0x0102
        L_0x00db:
            int r15 = r14.hashCode()
            r12 = 34268234(0x20ae44a, float:1.0204155E-37)
            if (r15 == r12) goto L_0x00f6
            r12 = 1067976249(0x3fa80639, float:1.3126899)
            if (r15 == r12) goto L_0x00ea
            goto L_0x0102
        L_0x00ea:
            java.lang.String r12 = "from-right"
            boolean r12 = r14.equals(r12)
            if (r12 == 0) goto L_0x0102
            r12 = 8388613(0x800005, float:1.175495E-38)
            goto L_0x0103
        L_0x00f6:
            java.lang.String r12 = "from-left"
            boolean r12 = r14.equals(r12)
            if (r12 == 0) goto L_0x0102
            r12 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x0103
        L_0x0102:
            r12 = r8
        L_0x0103:
            r10 = r10 | r12
            r7.setGravity(r10)
            java.lang.String r10 = r4.f11144e
            if (r10 == 0) goto L_0x0140
            b.a.a.n.a r12 = p005b.p006a.p007a.p023n.C0801a.f597b
            android.graphics.Typeface r10 = p005b.p006a.p007a.p023n.C0801a.m267a(r12, r10, r2, r5)
            java.lang.Boolean r12 = r4.f11131H
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            boolean r12 = p298d.p344x.p346c.C6888i.m12434a(r12, r14)
            if (r12 == 0) goto L_0x0125
            boolean r12 = p005b.p038f.p039a.C0849e.m516f0(r4)
            if (r12 == 0) goto L_0x0125
            r7.setTypeface(r10, r11)
            goto L_0x0140
        L_0x0125:
            java.lang.Boolean r11 = r4.f11131H
            boolean r11 = p298d.p344x.p346c.C6888i.m12434a(r11, r14)
            if (r11 == 0) goto L_0x0131
            r7.setTypeface(r10, r5)
            goto L_0x0140
        L_0x0131:
            java.lang.Boolean r5 = r4.f11131H
            boolean r5 = p298d.p344x.p346c.C6888i.m12434a(r5, r14)
            if (r5 == 0) goto L_0x013d
            r7.setTypeface(r10, r8)
            goto L_0x0140
        L_0x013d:
            r7.setTypeface(r10)
        L_0x0140:
            r5 = 0
            java.lang.Float r10 = r4.f11145f
            if (r10 == 0) goto L_0x014a
            float r10 = r10.floatValue()
            goto L_0x014b
        L_0x014a:
            r10 = r5
        L_0x014b:
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0156
            float r5 = p005b.p006a.p007a.p024o.C0820c.m323w(r10)
            r7.setTextSize(r5)
        L_0x0156:
            int r5 = android.os.Build.VERSION.SDK_INT
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 1120403456(0x42c80000, float:100.0)
            r14 = 28
            if (r5 < r14) goto L_0x017d
            java.lang.Float r15 = r4.f11146g
            if (r15 == 0) goto L_0x017d
            android.text.TextPaint r15 = r7.getPaint()
            int r15 = r15.getFontMetricsInt(r6)
            java.lang.Float r6 = r4.f11146g
            float r6 = r6.floatValue()
            float r6 = p005b.p006a.p007a.p024o.C0820c.m305e(r6)
            float r6 = r6 / r12
            float r6 = r6 * r10
            float r10 = (float) r15
            float r6 = r6 - r10
            r7.setLineSpacing(r6, r11)
        L_0x017d:
            java.lang.String r6 = r4.f11127D
            if (r6 == 0) goto L_0x01c3
            java.lang.String r10 = "upper"
            boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r6, r10)
            if (r6 == 0) goto L_0x0195
            r7.setAllCaps(r8)
            if (r9 == 0) goto L_0x01bf
            java.lang.String r6 = r9.toUpperCase()
            java.lang.String r9 = "(this as java.lang.String).toUpperCase()"
            goto L_0x01aa
        L_0x0195:
            java.lang.String r6 = r4.f11127D
            java.lang.String r10 = "lower"
            boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r6, r10)
            if (r6 == 0) goto L_0x01ae
            r7.setAllCaps(r2)
            if (r9 == 0) goto L_0x01bf
            java.lang.String r6 = r9.toLowerCase()
            java.lang.String r9 = "(this as java.lang.String).toLowerCase()"
        L_0x01aa:
            p298d.p344x.p346c.C6888i.m12437d(r6, r9)
            goto L_0x01c0
        L_0x01ae:
            java.lang.String r6 = r4.f11127D
            java.lang.String r10 = "title"
            boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r6, r10)
            if (r6 == 0) goto L_0x01c3
            if (r9 == 0) goto L_0x01bf
            java.lang.String r6 = p005b.p006a.p007a.p018i.C0756o.m234l(r9)
            goto L_0x01c0
        L_0x01bf:
            r6 = 0
        L_0x01c0:
            r7.setText(r6)
        L_0x01c3:
            java.lang.String r6 = r4.f11128E
            if (r6 == 0) goto L_0x01e8
            java.lang.String r9 = "underline"
            boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r6, r9)
            if (r6 == 0) goto L_0x01d6
            int r6 = r7.getPaintFlags()
            r6 = r6 | 8
            goto L_0x01e5
        L_0x01d6:
            java.lang.String r6 = r4.f11128E
            java.lang.String r9 = "strike"
            boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r6, r9)
            if (r6 == 0) goto L_0x01e8
            int r6 = r7.getPaintFlags()
            r6 = r6 | r13
        L_0x01e5:
            r7.setPaintFlags(r6)
        L_0x01e8:
            java.lang.Float r6 = r4.f11147h
            if (r6 == 0) goto L_0x01f7
            float r6 = r6.floatValue()
            float r6 = r6 / r12
            r9 = 4
            float r9 = (float) r9
            float r6 = r6 * r9
            r7.setLetterSpacing(r6)
        L_0x01f7:
            r7.setClipToOutline(r8)
            boolean r6 = r1 instanceof com.appfoundry.previewer.activities.BravoActivity
            if (r6 == 0) goto L_0x0207
            com.appfoundry.previewer.activities.BravoActivity r1 = (com.appfoundry.previewer.activities.BravoActivity) r1
            android.view.WindowManager r1 = r1.getWindowManager()
            java.lang.String r6 = "context.windowManager"
            goto L_0x021f
        L_0x0207:
            java.lang.String r6 = "null cannot be cast to non-null type android.content.ContextWrapper"
            java.util.Objects.requireNonNull(r1, r6)
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            java.lang.String r6 = "null cannot be cast to non-null type com.appfoundry.previewer.activities.BravoActivity"
            java.util.Objects.requireNonNull(r1, r6)
            com.appfoundry.previewer.activities.BravoActivity r1 = (com.appfoundry.previewer.activities.BravoActivity) r1
            android.view.WindowManager r1 = r1.getWindowManager()
            java.lang.String r6 = "((context as ContextWrap…voActivity).windowManager"
        L_0x021f:
            p298d.p344x.p346c.C6888i.m12437d(r1, r6)
            android.view.Display r1 = r1.getDefaultDisplay()
            android.graphics.Point r6 = new android.graphics.Point
            r6.<init>()
            r1.getSize(r6)
            int r1 = r6.x
            int r6 = r6.y
            r7.measure(r1, r6)
            android.text.TextPaint r1 = r7.getPaint()
            java.lang.String r6 = "(flexoViewBeforeExpanding as TextView).paint"
            p298d.p344x.p346c.C6888i.m12437d(r1, r6)
            r1.setAntiAlias(r8)
            if (r5 < r14) goto L_0x024d
            java.lang.Float r4 = r4.f11146g
            if (r4 == 0) goto L_0x024d
            float r4 = r4.floatValue()
            float r11 = r4 / r12
        L_0x024d:
            r20 = r11
            android.text.StaticLayout r4 = new android.text.StaticLayout
            com.appfoundry.previewer.model.Text r3 = r3.f10941c
            if (r3 == 0) goto L_0x025a
            java.lang.String r3 = r3.f11168a
            if (r3 == 0) goto L_0x025a
            goto L_0x025c
        L_0x025a:
            java.lang.String r3 = ""
        L_0x025c:
            r16 = r3
            int r3 = r0.f514a
            android.text.Layout$Alignment r19 = android.text.Layout.Alignment.ALIGN_NORMAL
            r21 = 0
            r22 = 0
            r15 = r4
            r17 = r1
            r18 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            int r1 = r4.getHeight()
            int r3 = r0.f515b
            if (r1 >= r3) goto L_0x0277
            goto L_0x027f
        L_0x0277:
            int r1 = r4.getHeight()
            int r0 = r0.f515b
            int r2 = r1 - r0
        L_0x027f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p018i.C0744e.m206j(com.appfoundry.previewer.model.Container, android.content.Context, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r1.f11116f;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.appfoundry.previewer.model.Page m207k(com.appfoundry.previewer.model.Page r1) {
        /*
            java.lang.String r0 = "$this$getLoadingStatePage"
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            com.appfoundry.previewer.model.States r1 = r1.f11048p
            if (r1 == 0) goto L_0x0010
            com.appfoundry.previewer.model.Component r1 = r1.f11116f
            if (r1 == 0) goto L_0x0010
            java.lang.String r1 = r1.f10959u
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            com.appfoundry.previewer.model.Page r1 = p005b.p006a.p007a.p024o.C0823f.m339H(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p018i.C0744e.m207k(com.appfoundry.previewer.model.Page):com.appfoundry.previewer.model.Page");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m208l(com.appfoundry.previewer.model.Page r9, android.content.Context r10) {
        /*
            java.lang.String r0 = "$this$getModalHeight"
            p298d.p344x.p346c.C6888i.m12438e(r9, r0)
            java.util.List<com.appfoundry.previewer.model.Container> r0 = r9.f11038f
            r1 = 2
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0057
            java.util.Iterator r0 = r0.iterator()
            r4 = r3
        L_0x0011:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0058
            java.lang.Object r5 = r0.next()
            com.appfoundry.previewer.model.Container r5 = (com.appfoundry.previewer.model.Container) r5
            java.lang.String r6 = r5.f10969c
            com.appfoundry.previewer.model.Style r6 = p005b.p006a.p007a.p024o.C0823f.m346O(r6, r2, r1)
            if (r6 == 0) goto L_0x0034
            java.util.List<java.lang.String> r7 = r5.f10976j
            if (r7 == 0) goto L_0x002e
            boolean r7 = p005b.p038f.p039a.C0849e.m500V(r7)
            goto L_0x002f
        L_0x002e:
            r7 = r3
        L_0x002f:
            int r7 = p005b.p038f.p039a.C0849e.m468A(r6, r7)
            goto L_0x0035
        L_0x0034:
            r7 = r3
        L_0x0035:
            int r4 = r4 + r7
            if (r6 == 0) goto L_0x0011
            boolean r7 = p005b.p038f.p039a.C0849e.m518g0(r6)
            r8 = 1
            if (r7 != r8) goto L_0x0011
            int r7 = p005b.p038f.p039a.C0849e.m550w0(r6)
            java.util.List<java.lang.String> r8 = r5.f10976j
            if (r8 == 0) goto L_0x004c
            boolean r8 = p005b.p038f.p039a.C0849e.m500V(r8)
            goto L_0x004d
        L_0x004c:
            r8 = r3
        L_0x004d:
            int r6 = p005b.p038f.p039a.C0849e.m468A(r6, r8)
            int r5 = m206j(r5, r10, r7, r6)
            int r4 = r4 + r5
            goto L_0x0011
        L_0x0057:
            r4 = r3
        L_0x0058:
            com.appfoundry.previewer.model.Container r9 = r9.f11036d
            if (r9 == 0) goto L_0x0071
            java.lang.String r10 = r9.f10969c
            com.appfoundry.previewer.model.Style r10 = p005b.p006a.p007a.p024o.C0823f.m346O(r10, r2, r1)
            if (r10 == 0) goto L_0x0070
            java.util.List<java.lang.String> r9 = r9.f10976j
            if (r9 == 0) goto L_0x006c
            boolean r3 = p005b.p038f.p039a.C0849e.m500V(r9)
        L_0x006c:
            int r3 = p005b.p038f.p039a.C0849e.m468A(r10, r3)
        L_0x0070:
            int r4 = r4 + r3
        L_0x0071:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p018i.C0744e.m208l(com.appfoundry.previewer.model.Page, android.content.Context):int");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: android.widget.EditText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: b.k.a.a.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: com.google.android.material.switchmaterial.SwitchMaterial} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v52, resolved type: android.widget.CheckBox} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: android.widget.EditText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: b.a.a.b.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: com.airbnb.lottie.LottieAnimationView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v96, resolved type: android.widget.EditText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v53, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: android.widget.EditText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v103, resolved type: android.widget.EditText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v104, resolved type: android.widget.EditText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v108, resolved type: android.widget.EditText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v153, resolved type: com.google.android.material.switchmaterial.SwitchMaterial} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v154, resolved type: com.google.android.material.switchmaterial.SwitchMaterial} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v155, resolved type: com.google.android.material.switchmaterial.SwitchMaterial} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v156, resolved type: com.google.android.material.switchmaterial.SwitchMaterial} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v157, resolved type: com.google.android.material.switchmaterial.SwitchMaterial} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v158, resolved type: com.google.android.material.switchmaterial.SwitchMaterial} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v36, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v38, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v39, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v40, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v41, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v42, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v43, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v44, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v45, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v46, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v47, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v48, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v49, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v50, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v51, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v52, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v53, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v54, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: boolean} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x028f, code lost:
        if (r3.equals("component:input-text") != false) goto L_0x0a5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x029b, code lost:
        if (r3.equals("component:input-file") != false) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x029d, code lost:
        r12 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02a9, code lost:
        if (r3.equals("component:input-date") != false) goto L_0x0a5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        if (r3.equals("component:formInput") != false) goto L_0x0a5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        if (r3.equals("component:input-url") != false) goto L_0x0a5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (r3.equals("component:input-tel") != false) goto L_0x0a5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x040a, code lost:
        r13 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x042e, code lost:
        if (r3.equals("component:input-textarea") != false) goto L_0x0a5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04d4, code lost:
        if (r3.equals("component:input-switch") != false) goto L_0x0659;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04df, code lost:
        if (r3.equals("component:web-view") != false) goto L_0x04e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04e1, code lost:
        if (r0 == null) goto L_0x055c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04e3, code lost:
        r13 = new p005b.p006a.p007a.p009b.C0614a(r0, r1.f10947i, p298d.p344x.p346c.C6888i.m12434a(r1.f10940b, "component:svg-web-view"));
        r0 = r1.f10948j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04f2, code lost:
        if (r0 == null) goto L_0x04f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04f4, code lost:
        r7 = r0.f11061a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04f6, code lost:
        r13.f261l = r9;
        r13.f262m = r10;
        r13.f263n = r11;
        r13.f264o = r7;
        r13.setBackgroundColor(0);
        r0 = r13.f260k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0503, code lost:
        if (r0 == null) goto L_0x0550;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x050b, code lost:
        if (p005b.p038f.p039a.C0849e.m508b0(r0, "camera") != r14) goto L_0x0550;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0517, code lost:
        if (androidx.core.content.ContextCompat.checkSelfPermission(r13.getContext(), "android.permission.CAMERA") == 0) goto L_0x054c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0519, code lost:
        r0 = r13.getContext();
        java.util.Objects.requireNonNull(r0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0528, code lost:
        if (androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale((androidx.appcompat.app.AppCompatActivity) r0, "android.permission.CAMERA") == false) goto L_0x053b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x052a, code lost:
        r0 = r13.getContext();
        java.util.Objects.requireNonNull(r0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        androidx.core.app.ActivityCompat.requestPermissions((androidx.appcompat.app.AppCompatActivity) r0, new java.lang.String[]{"android.permission.CAMERA"}, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x053b, code lost:
        r0 = r13.getContext();
        java.util.Objects.requireNonNull(r0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        androidx.core.app.ActivityCompat.requestPermissions((androidx.appcompat.app.AppCompatActivity) r0, new java.lang.String[]{"android.permission.CAMERA"}, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x054c, code lost:
        r13.mo10344d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0550, code lost:
        r13.mo10344d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0553, code lost:
        r0 = com.appfoundry.previewer.BravoApp.f10730N;
        com.appfoundry.previewer.BravoApp.f10735k.add(r13);
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x055c, code lost:
        r13 = new android.view.View(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x056a, code lost:
        if (r3.equals("component:input-number") != false) goto L_0x0a5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0577, code lost:
        if (r3.equals("component:button") != false) goto L_0x0579;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0579, code lost:
        r15 = new android.widget.TextView(r0);
        r0 = r15;
        p005b.p006a.p007a.p018i.C0758q.m241f(r15, r30, r1.f10939a, r31, r32, r33, r1.f10941c, r13, m215s(r1, "scanned-title"), r35, r1.f10940b, r1.f10955q, r1.f10954p, r1.f10956r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0643, code lost:
        if (r3.equals("component:input-image") != false) goto L_0x0855;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x064e, code lost:
        if (r3.equals("component:input-email") != false) goto L_0x0a5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0657, code lost:
        if (r3.equals("component:input-checkbox") != false) goto L_0x0659;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0659, code lost:
        if (r0 == null) goto L_0x072c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x065b, code lost:
        r13 = new android.widget.FrameLayout(r0);
        r0 = r1.f10940b;
        p298d.p344x.p346c.C6888i.m12438e(r13, "$this$createToggle");
        r6 = new android.widget.FrameLayout.LayoutParams(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x066d, code lost:
        if (r9 == null) goto L_0x0672;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x066f, code lost:
        r2 = r9.f11152m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0672, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0673, code lost:
        r10 = r6;
        p005b.p038f.p039a.C0849e.m552x0(r10, p005b.p038f.p039a.C0849e.m523j(r2, r32, r33, false, 0, 24).f516c);
        r13.setLayoutParams(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x068b, code lost:
        if (r9 == null) goto L_0x069a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x068d, code lost:
        r2 = r9.f11157r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x068f, code lost:
        if (r2 == null) goto L_0x069a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0691, code lost:
        r2 = ((float) r2.intValue()) / 100.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x069a, code lost:
        r2 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x069c, code lost:
        r13.setAlpha(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x069f, code lost:
        if (r9 == null) goto L_0x06ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x06a1, code lost:
        r2 = r9.f11129F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x06a3, code lost:
        if (r2 == null) goto L_0x06ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x06a5, code lost:
        r13.setRotation(r2.floatValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x06b3, code lost:
        if (p298d.p344x.p346c.C6888i.m12434a(r0, "component:input-checkbox") == false) goto L_0x06da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x06b5, code lost:
        r0 = new android.widget.CheckBox(r13.getContext());
        r4 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        r4.gravity = 17;
        r0.setLayoutParams(r4);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x06c8, code lost:
        if (r9 == null) goto L_0x0727;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x06ca, code lost:
        r2 = r9.f11142c;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x06cc, code lost:
        if (r2 == null) goto L_0x0727;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x06ce, code lost:
        r0.setButtonTintList(android.content.res.ColorStateList.valueOf(p005b.p006a.p007a.p018i.C0756o.m233k(r2)));
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x06da, code lost:
        r0 = new com.google.android.material.switchmaterial.SwitchMaterial(r13.getContext());
        r4 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        r4.gravity = 17;
        r0.setLayoutParams(r4);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x06ed, code lost:
        if (r9 == null) goto L_0x0727;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x06ef, code lost:
        r2 = r9.f11142c;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x06f1, code lost:
        if (r2 == null) goto L_0x0727;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x06f3, code lost:
        r5 = new int[3][];
        r6 = new int[r14];
        r6[0] = -16842910;
        r5[0] = r6;
        r6 = new int[r14];
        r6[0] = 16842912;
        r5[r14] = r6;
        r5[2] = new int[0];
        r4 = new int[3];
        r4[0] = p005b.p006a.p007a.p018i.C0756o.m233k(r2);
        r4[r14] = p005b.p006a.p007a.p018i.C0756o.m233k(r2);
        r4[2] = -3355444;
        r0.setThumbTintList(new android.content.res.ColorStateList(r5, r4));
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0727, code lost:
        r13.addView(r0);
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x072c, code lost:
        r13 = new android.view.View(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0853, code lost:
        if (r3.equals("component:image") != false) goto L_0x0855;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0855, code lost:
        r13 = new android.widget.ImageView(r0);
        m192E(r13, r30, r1.f10939a, r1.f10940b, r31, r32, r33, p005b.p006a.p007a.p024o.C0823f.m334C(r1.f10944f, r2), r35);
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x08c5, code lost:
        if (r3.equals("line") != false) goto L_0x08eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x08e9, code lost:
        if (r3.equals("multiline") != false) goto L_0x08eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x08eb, code lost:
        r8 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0a5c, code lost:
        if (r3.equals("component:input-password") != false) goto L_0x0a5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0a5e, code lost:
        r15 = new android.widget.EditText(r0);
        r0 = r15;
        p005b.p006a.p007a.p018i.C0758q.m241f(r15, r30, r1.f10939a, r31, r32, r33, r1.f10941c, r13, false, 0, r1.f10940b, r1.f10955q, r1.f10954p, r1.f10956r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x026c, code lost:
        if (r3.equals("component:text") != false) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0277, code lost:
        if (r3.equals("component:date") != false) goto L_0x0a5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0283, code lost:
        if (r3.equals("component:input-time") != false) goto L_0x0a5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (r3.equals("component:formLabel") != false) goto L_0x029d;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x040d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x098a  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x098d  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0990  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x09c8  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0a21  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0a30  */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0a38  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0a9d  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0aa1  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0ac0  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0aca  */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x0ad4  */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x0ae5  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0af2  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x0afb  */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x0b0c  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0b16  */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x0b1d  */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x0b20  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x0b23  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.View m209m(com.appfoundry.previewer.model.Component r28, android.content.Context r29, java.lang.String r30, com.appfoundry.previewer.model.Style r31, int r32, int r33, java.lang.Boolean r34, int r35, boolean r36) {
        /*
            r1 = r28
            r0 = r29
            r9 = r31
            r10 = r32
            r11 = r33
            r2 = r34
            java.lang.String r3 = "$this$getView"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            r12 = 0
            if (r9 == 0) goto L_0x001a
            boolean r3 = p005b.p038f.p039a.C0849e.m518g0(r31)
            r13 = r3
            goto L_0x001b
        L_0x001a:
            r13 = r12
        L_0x001b:
            java.lang.String r3 = r1.f10940b
            r7 = 0
            r6 = 1
            if (r3 != 0) goto L_0x0023
            goto L_0x0a8c
        L_0x0023:
            int r4 = r3.hashCode()
            java.lang.String r5 = "component:svg-web-view"
            java.lang.String r8 = "component:input-checkbox"
            r16 = 0
            java.lang.String r17 = ""
            r15 = 2
            switch(r4) {
                case -1794194085: goto L_0x0a56;
                case -1544579295: goto L_0x0875;
                case -1538889570: goto L_0x084a;
                case -1527000130: goto L_0x0733;
                case -1474287997: goto L_0x0652;
                case -996722468: goto L_0x0647;
                case -993028453: goto L_0x063a;
                case -688258489: goto L_0x05b0;
                case -653373361: goto L_0x056e;
                case -568224247: goto L_0x0563;
                case -483140773: goto L_0x04d8;
                case -423333388: goto L_0x04cd;
                case -372623172: goto L_0x0432;
                case 280543738: goto L_0x0427;
                case 371084557: goto L_0x02ed;
                case 972511780: goto L_0x02e1;
                case 1157896013: goto L_0x02ad;
                case 1214732910: goto L_0x02a1;
                case 1214799932: goto L_0x0293;
                case 1215213549: goto L_0x0287;
                case 1215217037: goto L_0x027b;
                case 1335671819: goto L_0x026f;
                case 1336152458: goto L_0x0264;
                case 1701801054: goto L_0x01c5;
                case 1705657287: goto L_0x010a;
                case 1705662815: goto L_0x0069;
                case 1705669223: goto L_0x005d;
                case 1840315739: goto L_0x0053;
                case 1840317103: goto L_0x0049;
                case 1923750697: goto L_0x003f;
                case 1926120019: goto L_0x0035;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x0a8c
        L_0x0035:
            java.lang.String r2 = "component:formLabel"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
            goto L_0x029d
        L_0x003f:
            java.lang.String r2 = "component:formInput"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
            goto L_0x0a5e
        L_0x0049:
            java.lang.String r2 = "component:input-url"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
            goto L_0x0a5e
        L_0x0053:
            java.lang.String r2 = "component:input-tel"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
            goto L_0x0a5e
        L_0x005d:
            java.lang.String r4 = "component:svg"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0a8c
            r12 = r35
            goto L_0x0855
        L_0x0069:
            java.lang.String r2 = "component:map"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
            b.a.a.b.d r13 = new b.a.a.b.d
            java.lang.String r2 = "$this$isMapInteractive"
            p298d.p344x.p346c.C6888i.m12438e(r1, r2)
            com.appfoundry.previewer.model.Params r2 = r1.f10948j
            if (r2 == 0) goto L_0x0088
            com.appfoundry.previewer.model.Map r2 = r2.f11080t
            if (r2 == 0) goto L_0x0088
            java.lang.Boolean r2 = r2.f11028c
            if (r2 == 0) goto L_0x0088
            boolean r12 = r2.booleanValue()
        L_0x0088:
            r13.<init>(r0, r12)
            com.appfoundry.previewer.model.Params r0 = r1.f10948j
            java.lang.String r2 = "$this$setupMap"
            p298d.p344x.p346c.C6888i.m12438e(r13, r2)
            r6 = 0
            r8 = 0
            r12 = 24
            r2 = r13
            r3 = r31
            r4 = r32
            r5 = r33
            r14 = r7
            r7 = r8
            r8 = r12
            p005b.p006a.p007a.p018i.C0758q.m243h(r2, r3, r4, r5, r6, r7, r8)
            android.os.Bundle r2 = android.os.Bundle.EMPTY
            android.os.StrictMode$ThreadPolicy r3 = android.os.StrictMode.getThreadPolicy()
            android.os.StrictMode$ThreadPolicy$Builder r4 = new android.os.StrictMode$ThreadPolicy$Builder
            r4.<init>(r3)
            android.os.StrictMode$ThreadPolicy$Builder r4 = r4.permitAll()
            android.os.StrictMode$ThreadPolicy r4 = r4.build()
            android.os.StrictMode.setThreadPolicy(r4)
            b.l.a.c.g.b$b r4 = r13.f5208g     // Catch:{ all -> 0x0105 }
            b.l.a.c.c.g r5 = new b.l.a.c.c.g     // Catch:{ all -> 0x0105 }
            r5.<init>(r4, r2)     // Catch:{ all -> 0x0105 }
            r4.mo12304b(r2, r5)     // Catch:{ all -> 0x0105 }
            b.l.a.c.g.b$b r2 = r13.f5208g     // Catch:{ all -> 0x0105 }
            T r2 = r2.f3544a     // Catch:{ all -> 0x0105 }
            if (r2 != 0) goto L_0x00cc
            p005b.p096l.p097a.p113c.p129c.C1978a.m2896a(r13)     // Catch:{ all -> 0x0105 }
        L_0x00cc:
            android.os.StrictMode.setThreadPolicy(r3)
            b.l.a.c.g.b$b r2 = r13.f5208g
            b.l.a.c.c.i r3 = new b.l.a.c.c.i
            r3.<init>(r2)
            r2.mo12304b(r14, r3)
            b.a.a.b.e r2 = new b.a.a.b.e
            r2.<init>(r0)
            java.lang.String r0 = "getMapAsync() must be called on the main thread"
            p005b.p006a.p007a.p024o.C0823f.m372h(r0)
            b.l.a.c.g.b$b r0 = r13.f5208g
            T r3 = r0.f3544a
            if (r3 == 0) goto L_0x00fe
            b.l.a.c.g.b$a r3 = (p005b.p096l.p097a.p113c.p142g.C3071b.C3072a) r3
            b.l.a.c.g.f.c r0 = r3.f5210b     // Catch:{ RemoteException -> 0x00f7 }
            b.l.a.c.g.i r3 = new b.l.a.c.g.i     // Catch:{ RemoteException -> 0x00f7 }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x00f7 }
            r0.mo14041u0(r3)     // Catch:{ RemoteException -> 0x00f7 }
            goto L_0x0b38
        L_0x00f7:
            r0 = move-exception
            b.l.a.c.g.g.d r1 = new b.l.a.c.g.g.d
            r1.<init>(r0)
            throw r1
        L_0x00fe:
            java.util.List<b.l.a.c.g.d> r0 = r0.f5216i
            r0.add(r2)
            goto L_0x0b38
        L_0x0105:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r3)
            throw r0
        L_0x010a:
            r14 = r7
            java.lang.String r4 = "component:gif"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0a8c
            android.widget.ImageView r13 = new android.widget.ImageView
            r13.<init>(r0)
            java.lang.String r0 = r1.f10944f
            com.appfoundry.previewer.model.Asset r0 = p005b.p006a.p007a.p024o.C0823f.m334C(r0, r2)
            java.lang.String r2 = "$this$setupWithGif"
            p298d.p344x.p346c.C6888i.m12438e(r13, r2)
            r7 = 0
            r8 = 0
            r14 = 24
            r2 = r13
            r3 = r31
            r4 = r32
            r5 = r33
            r15 = r6
            r6 = r7
            r7 = r8
            r8 = r14
            b.a.a.j.b r2 = p005b.p006a.p007a.p018i.C0758q.m243h(r2, r3, r4, r5, r6, r7, r8)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            b.h.a.m.x.c.i r4 = new b.h.a.m.x.c.i
            r4.<init>()
            r3.add(r4)
            if (r9 == 0) goto L_0x0154
            boolean r4 = p005b.p038f.p039a.C0849e.m504Z(r31)
            if (r4 != r15) goto L_0x0154
            int r2 = r2.f514a
            b.a.a.b.f r2 = p005b.p038f.p039a.C0849e.m531n(r9, r2)
            r3.add(r2)
        L_0x0154:
            com.appfoundry.previewer.BravoApp$b r2 = com.appfoundry.previewer.BravoApp.f10730N
            java.lang.Boolean r2 = com.appfoundry.previewer.BravoApp.f10728L
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r2, r4)
            if (r2 == 0) goto L_0x01c0
            if (r0 == 0) goto L_0x017e
            boolean r2 = r0.f10901g
            if (r2 != 0) goto L_0x017e
            java.lang.Object[] r2 = new java.lang.Object[r12]
            p.a.a$b r4 = p441p.p442a.C8091a.f16272d
            java.lang.String r5 = "ASSETCACHING: Gif not cached"
            r4.mo26043a(r5, r2)
            android.content.Context r2 = p005b.p038f.p039a.C0849e.m505a()
            b.h.a.i r2 = p005b.p051h.p052a.C0929c.m654d(r2)
            java.lang.String r0 = r0.f10896b
            b.h.a.h r0 = r2.mo10415p(r0)
            goto L_0x01a3
        L_0x017e:
            java.lang.Object[] r2 = new java.lang.Object[r12]
            p.a.a$b r4 = p441p.p442a.C8091a.f16272d
            java.lang.String r5 = "ASSETCACHING: CACHED GIF"
            r4.mo26043a(r5, r2)
            android.content.Context r2 = p005b.p038f.p039a.C0849e.m505a()
            b.h.a.i r2 = p005b.p051h.p052a.C0929c.m654d(r2)
            java.io.File r4 = new java.io.File
            if (r0 == 0) goto L_0x019a
            java.lang.String r0 = p005b.p038f.p039a.C0849e.m532n0(r0)
            if (r0 == 0) goto L_0x019a
            goto L_0x019c
        L_0x019a:
            r0 = r17
        L_0x019c:
            r4.<init>(r0)
            b.h.a.h r0 = r2.mo10414o(r4)
        L_0x01a3:
            b.h.a.q.e r2 = new b.h.a.q.e
            r2.<init>()
            b.h.a.m.n r4 = new b.h.a.m.n
            r4.<init>(r3)
            b.h.a.q.a r2 = r2.mo11178v(r4, r15)
            b.h.a.h r0 = r0.mo10382a(r2)
            b.h.a.m.x.e.c r2 = p005b.p051h.p052a.p055m.p064x.p067e.C1272c.m1272b()
            b.h.a.h r0 = r0.mo10406K(r2)
            r0.mo10771E(r13)
        L_0x01c0:
            r13.setClipToOutline(r15)
            goto L_0x0b38
        L_0x01c5:
            r15 = r6
            r14 = r7
            java.lang.String r2 = "componennt:qr"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
            android.widget.ImageView r13 = new android.widget.ImageView
            r13.<init>(r0)
            java.lang.String r0 = r1.f10945g
            java.lang.String r2 = "$this$setupQr"
            p298d.p344x.p346c.C6888i.m12438e(r13, r2)
            r6 = 0
            r7 = 0
            r8 = 24
            r2 = r13
            r3 = r31
            r4 = r32
            r5 = r33
            p005b.p006a.p007a.p018i.C0758q.m243h(r2, r3, r4, r5, r6, r7, r8)
            b.l.f.a r4 = p005b.p096l.p232f.C4484a.QR_CODE
            b.l.f.l r2 = new b.l.f.l     // Catch:{ v -> 0x0262, Exception -> 0x025b }
            r2.<init>()     // Catch:{ v -> 0x0262, Exception -> 0x025b }
            r7 = 0
            r3 = r0
            r5 = r32
            r6 = r33
            b.l.f.y.b r0 = r2.mo16167a(r3, r4, r5, r6, r7)     // Catch:{ v -> 0x0262, Exception -> 0x025b }
            int r2 = r0.f8787g
            int r3 = r0.f8788h
            int r4 = r2 * r3
            int[] r4 = new int[r4]
            r5 = r12
        L_0x0203:
            if (r5 >= r3) goto L_0x021e
            int r6 = r5 * r2
            r7 = r12
        L_0x0208:
            if (r7 >= r2) goto L_0x021b
            int r8 = r6 + r7
            boolean r10 = r0.mo16333b(r7, r5)
            if (r10 == 0) goto L_0x0215
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x0216
        L_0x0215:
            r10 = -1
        L_0x0216:
            r4[r8] = r10
            int r7 = r7 + 1
            goto L_0x0208
        L_0x021b:
            int r5 = r5 + 1
            goto L_0x0203
        L_0x021e:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r3, r0)
            r22 = 0
            r24 = 0
            r25 = 0
            r20 = r0
            r21 = r4
            r23 = r2
            r26 = r2
            r27 = r3
            r20.setPixels(r21, r22, r23, r24, r25, r26, r27)
            r13.setImageBitmap(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r13.setScaleType(r0)
            r13.setClipToOutline(r15)
            if (r9 == 0) goto L_0x0b38
            boolean r0 = p005b.p038f.p039a.C0849e.m502X(r31)
            if (r0 != r15) goto L_0x0b38
            java.lang.Integer r0 = r9.f11138O
            if (r0 == 0) goto L_0x0252
            int r12 = r0.intValue()
        L_0x0252:
            android.graphics.drawable.Drawable r0 = p005b.p038f.p039a.C0849e.m529m(r9, r12)
            r13.setForeground(r0)
            goto L_0x0b38
        L_0x025b:
            r0 = move-exception
            b.l.f.v r1 = new b.l.f.v
            r1.<init>((java.lang.Throwable) r0)
            throw r1
        L_0x0262:
            r0 = move-exception
            throw r0
        L_0x0264:
            r15 = r6
            r14 = r7
            java.lang.String r2 = "component:text"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
            goto L_0x029d
        L_0x026f:
            r15 = r6
            r14 = r7
            java.lang.String r2 = "component:date"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
            goto L_0x0a5e
        L_0x027b:
            r15 = r6
            r14 = r7
            java.lang.String r2 = "component:input-time"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
            goto L_0x0a5e
        L_0x0287:
            r15 = r6
            r14 = r7
            java.lang.String r2 = "component:input-text"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
            goto L_0x0a5e
        L_0x0293:
            r15 = r6
            r14 = r7
            java.lang.String r2 = "component:input-file"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
        L_0x029d:
            r12 = r35
            goto L_0x0579
        L_0x02a1:
            r15 = r6
            r14 = r7
            java.lang.String r2 = "component:input-date"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
            goto L_0x0a5e
        L_0x02ad:
            r15 = r6
            r14 = r7
            java.lang.String r2 = "component:localImage"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
            android.widget.ImageView r13 = new android.widget.ImageView
            r13.<init>(r0)
            java.lang.Integer r0 = r1.f10946h
            java.lang.String r2 = "$this$setupLocalImage"
            p298d.p344x.p346c.C6888i.m12438e(r13, r2)
            if (r0 == 0) goto L_0x0b38
            r6 = 0
            r7 = 0
            r8 = 24
            r2 = r13
            r3 = r31
            r4 = r32
            r5 = r33
            p005b.p006a.p007a.p018i.C0758q.m243h(r2, r3, r4, r5, r6, r7, r8)
            int r0 = r0.intValue()
            r13.setImageResource(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r13.setScaleType(r0)
            goto L_0x0b38
        L_0x02e1:
            r15 = r6
            r14 = r7
            boolean r2 = r3.equals(r5)
            if (r2 == 0) goto L_0x0a8c
            r7 = r14
            r14 = r15
            goto L_0x04e1
        L_0x02ed:
            r8 = r6
            r13 = r7
            java.lang.String r2 = "component:gradient"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
            if (r9 == 0) goto L_0x0309
            java.lang.String r2 = "$this$isLinearGradient"
            p298d.p344x.p346c.C6888i.m12438e(r9, r2)
            java.lang.String r2 = r9.f11158s
            if (r2 == 0) goto L_0x0309
            java.lang.String r3 = "linear"
            boolean r2 = r2.equals(r3)
            goto L_0x030a
        L_0x0309:
            r2 = r12
        L_0x030a:
            if (r2 == 0) goto L_0x040d
            android.view.View r7 = new android.view.View
            r7.<init>(r0)
            java.lang.String r0 = "$this$addLinearGradient"
            p298d.p344x.p346c.C6888i.m12438e(r7, r0)
            r6 = 0
            r0 = 8
            r2 = r7
            r3 = r31
            r4 = r32
            r5 = r33
            r29 = r7
            r7 = r35
            r14 = r8
            r8 = r0
            p005b.p006a.p007a.p018i.C0758q.m243h(r2, r3, r4, r5, r6, r7, r8)
            android.view.ViewGroup$LayoutParams r0 = r29.getLayoutParams()
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            java.util.Objects.requireNonNull(r0, r2)
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            com.appfoundry.previewer.model.Size r0 = p005b.p038f.p039a.C0849e.m498T(r0, r10, r11)
            if (r9 == 0) goto L_0x0353
            java.lang.Integer r2 = r0.f11109a
            if (r2 == 0) goto L_0x0343
            int r2 = r2.intValue()
            goto L_0x0344
        L_0x0343:
            r2 = r10
        L_0x0344:
            java.lang.Integer r3 = r0.f11110b
            if (r3 == 0) goto L_0x034d
            int r3 = r3.intValue()
            goto L_0x034e
        L_0x034d:
            r3 = r11
        L_0x034e:
            com.appfoundry.previewer.model.Coordinate r7 = p005b.p038f.p039a.C0849e.m482H(r9, r2, r3)
            goto L_0x0354
        L_0x0353:
            r7 = r13
        L_0x0354:
            if (r9 == 0) goto L_0x036d
            java.lang.Integer r2 = r0.f11109a
            if (r2 == 0) goto L_0x035f
            int r2 = r2.intValue()
            r10 = r2
        L_0x035f:
            java.lang.Integer r0 = r0.f11110b
            if (r0 == 0) goto L_0x0368
            int r0 = r0.intValue()
            r11 = r0
        L_0x0368:
            com.appfoundry.previewer.model.Coordinate r0 = p005b.p038f.p039a.C0849e.m480G(r9, r10, r11)
            goto L_0x036e
        L_0x036d:
            r0 = r13
        L_0x036e:
            if (r9 == 0) goto L_0x0375
            d.j r2 = p005b.p038f.p039a.C0849e.m493O(r31)
            r13 = r2
        L_0x0375:
            android.graphics.drawable.PaintDrawable r2 = new android.graphics.drawable.PaintDrawable
            r2.<init>()
            if (r13 == 0) goto L_0x03ee
            A r3 = r13.f13681g
            int[] r3 = (int[]) r3
            int r3 = r3.length
            if (r3 != 0) goto L_0x0385
            r6 = r14
            goto L_0x0386
        L_0x0385:
            r6 = r12
        L_0x0386:
            r3 = r6 ^ 1
            if (r3 == 0) goto L_0x03ee
            B r3 = r13.f13682h
            float[] r3 = (float[]) r3
            int r3 = r3.length
            if (r3 != 0) goto L_0x0393
            r6 = r14
            goto L_0x0394
        L_0x0393:
            r6 = r12
        L_0x0394:
            r3 = r6 ^ 1
            if (r3 == 0) goto L_0x03ee
            b.a.a.i.x r3 = new b.a.a.i.x
            r3.<init>(r7, r0, r13)
            android.graphics.drawable.shapes.RectShape r0 = new android.graphics.drawable.shapes.RectShape
            r0.<init>()
            r2.setShape(r0)
            r2.setShaderFactory(r3)
            java.util.List<java.lang.Float> r0 = r9.f11125B
            r3 = 4
            if (r0 != 0) goto L_0x03cc
            java.lang.Float r0 = r9.f11124A
            if (r0 == 0) goto L_0x03cc
            float r0 = r0.floatValue()
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x03cc
            java.lang.Float[] r0 = new java.lang.Float[r3]
            java.lang.Float r4 = r9.f11124A
            r0[r12] = r4
            r0[r14] = r4
            r0[r15] = r4
            r5 = 3
            r0[r5] = r4
            java.util.List r0 = p298d.p334t.C6790h.m12314A(r0)
            r9.f11125B = r0
        L_0x03cc:
            java.util.List<java.lang.Float> r0 = r9.f11125B
            if (r0 == 0) goto L_0x03e8
            int r0 = r0.size()
            if (r0 != r3) goto L_0x03e8
            java.lang.Integer r0 = r9.f11138O
            if (r0 == 0) goto L_0x03e8
            p298d.p344x.p346c.C6888i.m12436c(r0)
            int r0 = r0.intValue()
            float[] r0 = p005b.p038f.p039a.C0849e.m547v(r9, r0)
            r2.setCornerRadii(r0)
        L_0x03e8:
            r0 = r29
            r0.setBackground(r2)
            goto L_0x03f0
        L_0x03ee:
            r0 = r29
        L_0x03f0:
            r0.setClipToOutline(r14)
            if (r9 == 0) goto L_0x040a
            boolean r2 = p005b.p038f.p039a.C0849e.m503Y(r31)
            if (r2 != r14) goto L_0x040a
            java.lang.Integer r2 = r9.f11138O
            if (r2 == 0) goto L_0x0403
            int r12 = r2.intValue()
        L_0x0403:
            android.graphics.drawable.Drawable r2 = p005b.p038f.p039a.C0849e.m529m(r9, r12)
            r0.setForeground(r2)
        L_0x040a:
            r13 = r0
            goto L_0x0b38
        L_0x040d:
            if (r9 == 0) goto L_0x0419
            java.lang.String r2 = r9.f11158s
            if (r2 == 0) goto L_0x0419
            java.lang.String r3 = "radial"
            boolean r12 = r2.equals(r3)
        L_0x0419:
            android.view.View r13 = new android.view.View
            r13.<init>(r0)
            if (r12 == 0) goto L_0x0b38
            r12 = r35
            p005b.p006a.p007a.p018i.C0758q.m238c(r13, r9, r10, r11, r12)
            goto L_0x0b38
        L_0x0427:
            r14 = r6
            java.lang.String r2 = "component:input-textarea"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
            goto L_0x0a5e
        L_0x0432:
            r14 = r6
            java.lang.String r4 = "component:lottie"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0a8c
            com.airbnb.lottie.LottieAnimationView r13 = new com.airbnb.lottie.LottieAnimationView
            r13.<init>(r0)
            java.lang.String r0 = r1.f10944f
            com.appfoundry.previewer.model.Asset r8 = p005b.p006a.p007a.p024o.C0823f.m334C(r0, r2)
            java.lang.String r0 = "$this$customSetup"
            p298d.p344x.p346c.C6888i.m12438e(r13, r0)
            r6 = 0
            r7 = 0
            r0 = 24
            r2 = r13
            r3 = r31
            r4 = r32
            r5 = r33
            r9 = r8
            r8 = r0
            p005b.p006a.p007a.p018i.C0758q.m243h(r2, r3, r4, r5, r6, r7, r8)
            if (r9 == 0) goto L_0x0b38
            boolean r0 = r9.f10901g
            if (r0 != 0) goto L_0x04a2
            java.lang.Object[] r0 = new java.lang.Object[r12]
            p.a.a$b r2 = p441p.p442a.C8091a.f16272d
            java.lang.String r3 = "ASSETCACHING: Lottie not cached"
            r2.mo26043a(r3, r0)
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.f10730N
            java.lang.Boolean r0 = com.appfoundry.previewer.BravoApp.f10728L
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r2)
            if (r0 == 0) goto L_0x0b38
            java.lang.String r0 = r9.f10896b     // Catch:{ Exception -> 0x048c }
            r13.setAnimationFromUrl(r0)     // Catch:{ Exception -> 0x048c }
            r0 = -1
            r13.setRepeatCount(r0)     // Catch:{ Exception -> 0x048c }
            r13.playAnimation()     // Catch:{ Exception -> 0x048c }
            b.a.a.i.m r0 = new b.a.a.i.m     // Catch:{ Exception -> 0x048c }
            r0.<init>(r9)     // Catch:{ Exception -> 0x048c }
            r13.setFailureListener(r0)     // Catch:{ Exception -> 0x048c }
            goto L_0x0b38
        L_0x048c:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r15]
            java.lang.String r3 = r9.f10896b
            r2[r12] = r3
            java.lang.String r0 = r0.getLocalizedMessage()
            r2[r14] = r0
            p.a.a$b r0 = p441p.p442a.C8091a.f16272d
            java.lang.String r3 = "Exception in Lottie with url: %s -> %s"
            r0.mo26044b(r3, r2)
            goto L_0x0b38
        L_0x04a2:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            p.a.a$b r2 = p441p.p442a.C8091a.f16272d
            java.lang.String r3 = "ASSETCACHING: Lottie CACHED"
            r2.mo26043a(r3, r0)
            java.lang.String r0 = p005b.p038f.p039a.C0849e.m532n0(r9)
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r0)
            java.lang.String r0 = r9.f10895a
            com.airbnb.lottie.LottieTask r0 = com.airbnb.lottie.LottieCompositionFactory.fromJsonInputStream(r2, r0)
            b.a.a.i.k r2 = new b.a.a.i.k
            r2.<init>(r13, r9)
            com.airbnb.lottie.LottieTask r0 = r0.addListener(r2)
            b.a.a.i.l r2 = new b.a.a.i.l
            r2.<init>(r13, r9)
            r0.addFailureListener(r2)
            goto L_0x0b38
        L_0x04cd:
            r14 = r6
            java.lang.String r2 = "component:input-switch"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
            goto L_0x0659
        L_0x04d8:
            r14 = r6
            java.lang.String r2 = "component:web-view"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
        L_0x04e1:
            if (r0 == 0) goto L_0x055c
            b.a.a.b.a r13 = new b.a.a.b.a
            java.util.List<java.lang.String> r2 = r1.f10947i
            java.lang.String r3 = r1.f10940b
            boolean r3 = p298d.p344x.p346c.C6888i.m12434a(r3, r5)
            r13.<init>(r0, r2, r3)
            com.appfoundry.previewer.model.Params r0 = r1.f10948j
            if (r0 == 0) goto L_0x04f6
            java.lang.String r7 = r0.f11061a
        L_0x04f6:
            r13.f261l = r9
            r13.f262m = r10
            r13.f263n = r11
            r13.f264o = r7
            r13.setBackgroundColor(r12)
            java.util.List<java.lang.String> r0 = r13.f260k
            if (r0 == 0) goto L_0x0550
            java.lang.String r2 = "camera"
            boolean r0 = p005b.p038f.p039a.C0849e.m508b0(r0, r2)
            if (r0 != r14) goto L_0x0550
            android.content.Context r0 = r13.getContext()
            java.lang.String r2 = "android.permission.CAMERA"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r2)
            if (r0 == 0) goto L_0x054c
            android.content.Context r0 = r13.getContext()
            java.lang.String r3 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            java.util.Objects.requireNonNull(r0, r3)
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            boolean r0 = androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale(r0, r2)
            if (r0 == 0) goto L_0x053b
            android.content.Context r0 = r13.getContext()
            java.util.Objects.requireNonNull(r0, r3)
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            java.lang.String[] r2 = new java.lang.String[]{r2}
            androidx.core.app.ActivityCompat.requestPermissions(r0, r2, r14)
            goto L_0x0553
        L_0x053b:
            android.content.Context r0 = r13.getContext()
            java.util.Objects.requireNonNull(r0, r3)
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            java.lang.String[] r2 = new java.lang.String[]{r2}
            androidx.core.app.ActivityCompat.requestPermissions(r0, r2, r14)
            goto L_0x0553
        L_0x054c:
            r13.mo10344d()
            goto L_0x0553
        L_0x0550:
            r13.mo10344d()
        L_0x0553:
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.f10730N
            java.util.List<android.webkit.WebView> r0 = com.appfoundry.previewer.BravoApp.f10735k
            r0.add(r13)
            goto L_0x0b38
        L_0x055c:
            android.view.View r13 = new android.view.View
            r13.<init>(r0)
            goto L_0x0b38
        L_0x0563:
            r14 = r6
            java.lang.String r2 = "component:input-number"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
            goto L_0x0a5e
        L_0x056e:
            r12 = r35
            r14 = r6
            java.lang.String r2 = "component:button"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
        L_0x0579:
            android.widget.TextView r15 = new android.widget.TextView
            r15.<init>(r0)
            java.lang.String r4 = r1.f10939a
            com.appfoundry.previewer.model.Text r8 = r1.f10941c
            java.lang.String r0 = "scanned-title"
            boolean r0 = m215s(r1, r0)
            java.lang.String r14 = r1.f10940b
            java.util.List<com.appfoundry.previewer.model.RichText> r7 = r1.f10955q
            java.lang.String r6 = r1.f10954p
            java.lang.String r5 = r1.f10956r
            r2 = r15
            r3 = r30
            r16 = r5
            r5 = r31
            r17 = r6
            r6 = r32
            r18 = r7
            r7 = r33
            r9 = r13
            r10 = r0
            r11 = r35
            r12 = r14
            r13 = r18
            r14 = r17
            r0 = r15
            r15 = r16
            p005b.p006a.p007a.p018i.C0758q.m241f(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x040a
        L_0x05b0:
            r14 = r6
            java.lang.String r2 = "component:scannedAppIcon"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
            android.widget.ImageView r13 = new android.widget.ImageView
            r13.<init>(r0)
            java.lang.String r0 = r1.f10945g
            java.lang.String r2 = "$this$setupIcon"
            p298d.p344x.p346c.C6888i.m12438e(r13, r2)
            r6 = 0
            r7 = 0
            r8 = 24
            r2 = r13
            r3 = r31
            r4 = r32
            r5 = r33
            p005b.p006a.p007a.p018i.C0758q.m243h(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r2 = "fit"
            if (r9 == 0) goto L_0x05dc
            java.lang.String r3 = r9.f11156q
            if (r3 == 0) goto L_0x05dc
            goto L_0x05dd
        L_0x05dc:
            r3 = r2
        L_0x05dd:
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r3, r2)
            if (r2 == 0) goto L_0x05ee
            b.h.a.q.e r2 = new b.h.a.q.e
            r2.<init>()
            b.h.a.m.x.c.q r3 = new b.h.a.m.x.c.q
            r3.<init>()
            goto L_0x05f8
        L_0x05ee:
            b.h.a.q.e r2 = new b.h.a.q.e
            r2.<init>()
            b.h.a.m.x.c.i r3 = new b.h.a.m.x.c.i
            r3.<init>()
        L_0x05f8:
            b.h.a.q.a r2 = r2.mo11178v(r3, r14)
            b.h.a.q.e r2 = (p005b.p051h.p052a.p074q.C1343e) r2
            java.lang.String r3 = "if (scale == Scale.FIT) …sform(CenterCrop())\n    }"
            p298d.p344x.p346c.C6888i.m12437d(r2, r3)
            android.content.Context r3 = p005b.p038f.p039a.C0849e.m505a()
            b.h.a.i r3 = p005b.p051h.p052a.C0929c.m654d(r3)
            b.h.a.h r0 = r3.mo10415p(r0)
            b.h.a.h r0 = r0.mo10382a(r2)
            b.h.a.m.x.e.c r2 = p005b.p051h.p052a.p055m.p064x.p067e.C1272c.m1272b()
            b.h.a.h r0 = r0.mo10406K(r2)
            r0.mo10771E(r13)
            r13.setClipToOutline(r14)
            if (r9 == 0) goto L_0x0b38
            boolean r0 = p005b.p038f.p039a.C0849e.m502X(r31)
            if (r0 != r14) goto L_0x0b38
            java.lang.Integer r0 = r9.f11138O
            if (r0 == 0) goto L_0x0631
            int r12 = r0.intValue()
        L_0x0631:
            android.graphics.drawable.Drawable r0 = p005b.p038f.p039a.C0849e.m529m(r9, r12)
            r13.setForeground(r0)
            goto L_0x0b38
        L_0x063a:
            r12 = r35
            r14 = r6
            java.lang.String r4 = "component:input-image"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0a8c
            goto L_0x0855
        L_0x0647:
            r14 = r6
            java.lang.String r2 = "component:input-email"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
            goto L_0x0a5e
        L_0x0652:
            r14 = r6
            boolean r2 = r3.equals(r8)
            if (r2 == 0) goto L_0x0a8c
        L_0x0659:
            if (r0 == 0) goto L_0x072c
            android.widget.FrameLayout r13 = new android.widget.FrameLayout
            r13.<init>(r0)
            java.lang.String r0 = r1.f10940b
            java.lang.String r2 = "$this$createToggle"
            p298d.p344x.p346c.C6888i.m12438e(r13, r2)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r6.<init>(r2, r2)
            if (r9 == 0) goto L_0x0672
            com.appfoundry.previewer.model.Dimensions r2 = r9.f11152m
            goto L_0x0673
        L_0x0672:
            r2 = r7
        L_0x0673:
            r5 = 0
            r7 = 0
            r16 = 24
            r3 = r32
            r4 = r33
            r10 = r6
            r6 = r7
            r7 = r16
            b.a.a.j.b r2 = p005b.p038f.p039a.C0849e.m523j(r2, r3, r4, r5, r6, r7)
            com.appfoundry.previewer.model.Dimensions r2 = r2.f516c
            p005b.p038f.p039a.C0849e.m552x0(r10, r2)
            r13.setLayoutParams(r10)
            if (r9 == 0) goto L_0x069a
            java.lang.Integer r2 = r9.f11157r
            if (r2 == 0) goto L_0x069a
            int r2 = r2.intValue()
            float r2 = (float) r2
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r3
            goto L_0x069c
        L_0x069a:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x069c:
            r13.setAlpha(r2)
            if (r9 == 0) goto L_0x06ac
            java.lang.Float r2 = r9.f11129F
            if (r2 == 0) goto L_0x06ac
            float r2 = r2.floatValue()
            r13.setRotation(r2)
        L_0x06ac:
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r8)
            r2 = 17
            r3 = -2
            if (r0 == 0) goto L_0x06da
            android.widget.CheckBox r0 = new android.widget.CheckBox
            android.content.Context r4 = r13.getContext()
            r0.<init>(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r3, r3)
            r4.gravity = r2
            r0.setLayoutParams(r4)
            if (r9 == 0) goto L_0x0727
            java.lang.String r2 = r9.f11142c
            if (r2 == 0) goto L_0x0727
            int r2 = p005b.p006a.p007a.p018i.C0756o.m233k(r2)
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r0.setButtonTintList(r2)
            goto L_0x0727
        L_0x06da:
            com.google.android.material.switchmaterial.SwitchMaterial r0 = new com.google.android.material.switchmaterial.SwitchMaterial
            android.content.Context r4 = r13.getContext()
            r0.<init>(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r3, r3)
            r4.gravity = r2
            r0.setLayoutParams(r4)
            if (r9 == 0) goto L_0x0727
            java.lang.String r2 = r9.f11142c
            if (r2 == 0) goto L_0x0727
            android.content.res.ColorStateList r3 = new android.content.res.ColorStateList
            r4 = 3
            int[][] r5 = new int[r4][]
            int[] r6 = new int[r14]
            r7 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r6[r12] = r7
            r5[r12] = r6
            int[] r6 = new int[r14]
            r7 = 16842912(0x10100a0, float:2.3694006E-38)
            r6[r12] = r7
            r5[r14] = r6
            int[] r6 = new int[r12]
            r5[r15] = r6
            int[] r4 = new int[r4]
            int r6 = p005b.p006a.p007a.p018i.C0756o.m233k(r2)
            r4[r12] = r6
            int r2 = p005b.p006a.p007a.p018i.C0756o.m233k(r2)
            r4[r14] = r2
            r2 = -3355444(0xffffffffffcccccc, float:NaN)
            r4[r15] = r2
            r3.<init>(r5, r4)
            r0.setThumbTintList(r3)
        L_0x0727:
            r13.addView(r0)
            goto L_0x0b38
        L_0x072c:
            android.view.View r13 = new android.view.View
            r13.<init>(r0)
            goto L_0x0b38
        L_0x0733:
            r14 = r6
            java.lang.String r4 = "component:video"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0a8c
            if (r0 == 0) goto L_0x0843
            android.widget.FrameLayout r13 = new android.widget.FrameLayout
            r13.<init>(r0)
            java.lang.String r0 = r1.f10944f
            com.appfoundry.previewer.model.Asset r0 = p005b.p006a.p007a.p024o.C0823f.m334C(r0, r2)
            java.lang.String r2 = "$this$videoSetup"
            p298d.p344x.p346c.C6888i.m12438e(r13, r2)
            r6 = 0
            r8 = 0
            r15 = 24
            r2 = r13
            r3 = r31
            r4 = r32
            r5 = r33
            r14 = r7
            r7 = r8
            r8 = r15
            p005b.p006a.p007a.p018i.C0758q.m243h(r2, r3, r4, r5, r6, r7, r8)
            if (r9 == 0) goto L_0x0764
            com.appfoundry.previewer.model.Dimensions r2 = r9.f11152m
            goto L_0x0765
        L_0x0764:
            r2 = r14
        L_0x0765:
            r5 = 0
            r6 = 0
            r7 = 24
            r3 = r32
            r4 = r33
            b.a.a.j.b r2 = p005b.p038f.p039a.C0849e.m523j(r2, r3, r4, r5, r6, r7)
            androidx.cardview.widget.CardView r3 = new androidx.cardview.widget.CardView
            android.content.Context r4 = r13.getContext()
            r3.<init>(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            int r5 = r2.f514a
            int r6 = r2.f515b
            r4.<init>(r5, r6)
            r13.addView(r3, r4)
            b.a.a.b.m.a r5 = new b.a.a.b.m.a
            android.content.Context r6 = r13.getContext()
            java.lang.String r7 = "context"
            p298d.p344x.p346c.C6888i.m12437d(r6, r7)
            r7 = 6
            r5.<init>(r6, r14, r12, r7)
            r3.addView(r5, r4)
            if (r0 == 0) goto L_0x079d
            java.lang.String r7 = r0.f10896b
            goto L_0x079e
        L_0x079d:
            r7 = r14
        L_0x079e:
            if (r7 == 0) goto L_0x07a7
            r5.setDataSource(r7)
            r5.mo10430c()
            goto L_0x07bb
        L_0x07a7:
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            if (r9 == 0) goto L_0x07b2
            java.lang.String r4 = r9.f11140a
            if (r4 == 0) goto L_0x07b2
            r17 = r4
        L_0x07b2:
            r0[r12] = r17
            p.a.a$b r4 = p441p.p442a.C8091a.f16272d
            java.lang.String r6 = "Video URL is null for style id: %s"
            r4.mo26044b(r6, r0)
        L_0x07bb:
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r4 = r13.getContext()
            r0.<init>(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            int r6 = r2.f514a
            int r8 = r2.f515b
            r4.<init>(r6, r8)
            r3.addView(r0, r4)
            r5.setThumbnail(r0)
            p005b.p006a.p007a.p018i.C0758q.m240e(r13)
            com.appfoundry.previewer.BravoApp$b r4 = com.appfoundry.previewer.BravoApp.f10730N
            java.lang.Boolean r4 = com.appfoundry.previewer.BravoApp.f10728L
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r4 = p298d.p344x.p346c.C6888i.m12434a(r4, r6)
            if (r4 == 0) goto L_0x0803
            b.a.a.i.w r4 = new b.a.a.i.w
            r4.<init>(r13)
            r5.setListener(r4)
            android.content.Context r4 = r13.getContext()
            b.h.a.i r4 = p005b.p051h.p052a.C0929c.m654d(r4)
            b.h.a.h r4 = r4.mo10412l()
            b.h.a.h r4 = r4.mo10405I(r7)
            b.h.a.q.a r4 = r4.mo10409c()
            b.h.a.h r4 = (p005b.p051h.p052a.C0941h) r4
            r4.mo10771E(r0)
        L_0x0803:
            if (r9 == 0) goto L_0x0b38
            boolean r0 = p005b.p038f.p039a.C0849e.m503Y(r31)
            r4 = 1
            if (r0 != r4) goto L_0x0b38
            int r0 = r2.f514a
            java.lang.String r2 = "$this$getCornerRadiusForComponentWidth"
            p298d.p344x.p346c.C6888i.m12438e(r9, r2)
            java.util.List<java.lang.Float> r2 = r9.f11125B
            if (r2 == 0) goto L_0x081f
            java.lang.Object r2 = r2.get(r12)
            r7 = r2
            java.lang.Float r7 = (java.lang.Float) r7
            goto L_0x0820
        L_0x081f:
            r7 = r14
        L_0x0820:
            if (r7 == 0) goto L_0x083c
            java.util.List<java.lang.Float> r2 = r9.f11125B
            if (r2 == 0) goto L_0x082e
            java.lang.Object r2 = r2.get(r12)
            r7 = r2
            java.lang.Float r7 = (java.lang.Float) r7
            goto L_0x082f
        L_0x082e:
            r7 = r14
        L_0x082f:
            p298d.p344x.p346c.C6888i.m12436c(r7)
            float r2 = r7.floatValue()
            float r0 = (float) r0
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r16 = r2 / r0
        L_0x083c:
            r0 = r16
            r3.setRadius(r0)
            goto L_0x0b38
        L_0x0843:
            android.view.View r13 = new android.view.View
            r13.<init>(r0)
            goto L_0x0b38
        L_0x084a:
            r12 = r35
            r14 = r7
            java.lang.String r4 = "component:image"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0a8c
        L_0x0855:
            android.widget.ImageView r13 = new android.widget.ImageView
            r13.<init>(r0)
            java.lang.String r4 = r1.f10939a
            java.lang.String r5 = r1.f10940b
            java.lang.String r0 = r1.f10944f
            com.appfoundry.previewer.model.Asset r0 = p005b.p006a.p007a.p024o.C0823f.m334C(r0, r2)
            r2 = r13
            r3 = r30
            r6 = r31
            r7 = r32
            r8 = r33
            r9 = r0
            r10 = r35
            m192E(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0b38
        L_0x0875:
            r14 = r7
            java.lang.String r2 = "component:chart"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
            if (r0 == 0) goto L_0x0a4f
            b.k.a.a.a.c r13 = new b.k.a.a.a.c
            r13.<init>(r0)
            com.appfoundry.previewer.model.Params r0 = r1.f10948j
            b.k.a.a.a.b r15 = p005b.p091k.p092a.p093a.p094a.C1573b.Area
            b.k.a.a.a.b r8 = p005b.p091k.p092a.p093a.p094a.C1573b.Line
            b.k.a.a.a.b r7 = p005b.p091k.p092a.p093a.p094a.C1573b.Bar
            java.lang.String r2 = "$this$setup"
            p298d.p344x.p346c.C6888i.m12438e(r13, r2)
            r6 = 0
            r18 = 0
            r19 = 24
            r2 = r13
            r3 = r31
            r4 = r32
            r5 = r33
            r9 = r7
            r7 = r18
            r10 = r8
            r8 = r19
            p005b.p006a.p007a.p018i.C0758q.m243h(r2, r3, r4, r5, r6, r7, r8)
            b.k.a.a.a.a r2 = new b.k.a.a.a.a
            r2.<init>()
            if (r0 == 0) goto L_0x08ed
            java.lang.String r3 = "$this$getChartType"
            p298d.p344x.p346c.C6888i.m12438e(r0, r3)
            java.lang.String r3 = r0.f11083w
            if (r3 == 0) goto L_0x08ed
            int r4 = r3.hashCode()
            switch(r4) {
                case -1206239059: goto L_0x08e3;
                case -1001078227: goto L_0x08d9;
                case 97299: goto L_0x08d3;
                case 110988: goto L_0x08c8;
                case 3321844: goto L_0x08bf;
                default: goto L_0x08be;
            }
        L_0x08be:
            goto L_0x08ed
        L_0x08bf:
            java.lang.String r4 = "line"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x08ed
            goto L_0x08eb
        L_0x08c8:
            java.lang.String r4 = "pie"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x08ed
            b.k.a.a.a.b r8 = p005b.p091k.p092a.p093a.p094a.C1573b.Pie
            goto L_0x08ee
        L_0x08d3:
            java.lang.String r4 = "bar"
            r3.equals(r4)
            goto L_0x08ed
        L_0x08d9:
            java.lang.String r4 = "progress"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x08ed
            r8 = r15
            goto L_0x08ee
        L_0x08e3:
            java.lang.String r4 = "multiline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x08ed
        L_0x08eb:
            r8 = r10
            goto L_0x08ee
        L_0x08ed:
            r8 = r9
        L_0x08ee:
            java.lang.String r3 = "prop"
            p298d.p344x.p346c.C6888i.m12438e(r8, r3)
            r2.f2646c = r8
            if (r0 == 0) goto L_0x08fc
            java.lang.String r4 = r0.f11062b
            if (r4 == 0) goto L_0x08fc
            goto L_0x08fe
        L_0x08fc:
            r4 = r17
        L_0x08fe:
            p298d.p344x.p346c.C6888i.m12438e(r4, r3)
            r2.f2645b = r4
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r2.f2648e = r4
            java.lang.Float r4 = java.lang.Float.valueOf(r16)
            r2.f2650g = r4
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T>"
            if (r0 == 0) goto L_0x0981
            java.lang.String r5 = "$this$getChartData"
            p298d.p344x.p346c.C6888i.m12438e(r0, r5)
            java.util.List<com.appfoundry.previewer.model.ChartData> r5 = r0.f11085y
            if (r5 == 0) goto L_0x0981
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List<com.appfoundry.previewer.model.ChartData> r6 = r0.f11085y
            java.util.Iterator r6 = r6.iterator()
        L_0x0925:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0975
            java.lang.Object r7 = r6.next()
            com.appfoundry.previewer.model.ChartData r7 = (com.appfoundry.previewer.model.ChartData) r7
            b.k.a.a.a.h r8 = new b.k.a.a.a.h
            r8.<init>()
            java.lang.String r11 = r7.f10938b
            java.util.List<java.lang.Object> r11 = r7.f10937a
            if (r11 == 0) goto L_0x0946
            java.lang.Object[] r14 = new java.lang.Object[r12]
            java.lang.Object[] r11 = r11.toArray(r14)
            java.util.Objects.requireNonNull(r11, r4)
            goto L_0x0948
        L_0x0946:
            java.lang.Object[] r11 = new java.lang.Object[r12]
        L_0x0948:
            int r14 = r11.length
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r14)
            p298d.p344x.p346c.C6888i.m12438e(r11, r3)
            r8.f2685a = r11
            java.util.List<java.lang.String> r11 = r0.f11086z
            if (r11 == 0) goto L_0x0970
            int r11 = r11.size()
            java.util.List<com.appfoundry.previewer.model.ChartData> r14 = r0.f11085y
            int r14 = r14.indexOf(r7)
            if (r11 <= r14) goto L_0x0970
            java.util.List<java.lang.String> r11 = r0.f11086z
            java.util.List<com.appfoundry.previewer.model.ChartData> r14 = r0.f11085y
            int r7 = r14.indexOf(r7)
            java.lang.Object r7 = r11.get(r7)
            r8.f2686b = r7
        L_0x0970:
            r5.add(r8)
            r14 = 0
            goto L_0x0925
        L_0x0975:
            b.k.a.a.a.h[] r6 = new p005b.p091k.p092a.p093a.p094a.C1581h[r12]
            java.lang.Object[] r5 = r5.toArray(r6)
            java.util.Objects.requireNonNull(r5, r4)
            b.k.a.a.a.h[] r5 = (p005b.p091k.p092a.p093a.p094a.C1581h[]) r5
            goto L_0x0983
        L_0x0981:
            b.k.a.a.a.h[] r5 = new p005b.p091k.p092a.p093a.p094a.C1581h[r12]
        L_0x0983:
            p298d.p344x.p346c.C6888i.m12438e(r5, r3)
            r2.f2653j = r5
            if (r0 == 0) goto L_0x098d
            java.util.List<java.lang.String> r7 = r0.f11086z
            goto L_0x098e
        L_0x098d:
            r7 = 0
        L_0x098e:
            if (r7 == 0) goto L_0x09a0
            java.util.List<java.lang.String> r0 = r0.f11086z
            java.lang.Object[] r5 = new java.lang.Object[r12]
            java.lang.Object[] r0 = r0.toArray(r5)
            java.util.Objects.requireNonNull(r0, r4)
            p298d.p344x.p346c.C6888i.m12438e(r0, r3)
            r2.f2651h = r0
        L_0x09a0:
            java.lang.String r0 = "chartModel"
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            java.lang.String r0 = "$this$aa_toAAOptions"
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            b.k.a.a.a.b r0 = p005b.p091k.p092a.p093a.p094a.C1573b.Scatter
            b.k.a.a.a.b r4 = p005b.p091k.p092a.p093a.p094a.C1573b.Spline
            b.k.a.a.a.b r5 = p005b.p091k.p092a.p093a.p094a.C1573b.Areaspline
            java.lang.String r6 = "aaChartModel"
            p298d.p344x.p346c.C6888i.m12438e(r2, r6)
            b.k.a.a.b.a r6 = new b.k.a.a.b.a
            r6.<init>()
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            b.k.a.a.a.b r11 = r2.f2646c
            java.lang.Boolean r12 = r2.f2648e
            p298d.p344x.p346c.C6888i.m12434a(r12, r8)
            if (r11 != 0) goto L_0x09c8
            goto L_0x09df
        L_0x09c8:
            int r11 = r11.ordinal()
            if (r11 == 0) goto L_0x09dc
            r12 = 1
            if (r11 == r12) goto L_0x09dc
            r7 = 7
            if (r11 == r7) goto L_0x09d5
            goto L_0x09df
        L_0x09d5:
            java.lang.String r7 = "pointer"
            p298d.p344x.p346c.C6888i.m12438e(r7, r3)
            java.lang.Boolean r7 = r2.f2648e
        L_0x09dc:
            p298d.p344x.p346c.C6888i.m12434a(r7, r8)
        L_0x09df:
            b.k.a.a.a.g r7 = new b.k.a.a.a.g
            r7.<init>()
            p298d.p344x.p346c.C6888i.m12438e(r6, r3)
            r7.f2683a = r6
            java.lang.Object[] r3 = r2.f2651h
            r7.f2684b = r3
            b.k.a.a.a.b r3 = p005b.p091k.p092a.p093a.p094a.C1573b.Gauge
            b.k.a.a.a.b r2 = r2.f2646c
            b.k.a.a.a.b r6 = p005b.p091k.p092a.p093a.p094a.C1573b.Column
            if (r2 == r6) goto L_0x0a1f
            if (r2 == r9) goto L_0x0a1f
            if (r2 == r15) goto L_0x0a1f
            if (r2 == r5) goto L_0x0a1f
            if (r2 == r10) goto L_0x0a1f
            if (r2 == r4) goto L_0x0a1f
            if (r2 == r0) goto L_0x0a1f
            b.k.a.a.a.b r0 = p005b.p091k.p092a.p093a.p094a.C1573b.Bubble
            if (r2 == r0) goto L_0x0a1f
            b.k.a.a.a.b r0 = p005b.p091k.p092a.p093a.p094a.C1573b.Columnrange
            if (r2 == r0) goto L_0x0a1f
            b.k.a.a.a.b r0 = p005b.p091k.p092a.p093a.p094a.C1573b.Arearange
            if (r2 == r0) goto L_0x0a1f
            b.k.a.a.a.b r0 = p005b.p091k.p092a.p093a.p094a.C1573b.Areasplinerange
            if (r2 == r0) goto L_0x0a1f
            b.k.a.a.a.b r0 = p005b.p091k.p092a.p093a.p094a.C1573b.Boxplot
            if (r2 == r0) goto L_0x0a1f
            b.k.a.a.a.b r0 = p005b.p091k.p092a.p093a.p094a.C1573b.Waterfall
            if (r2 == r0) goto L_0x0a1f
            b.k.a.a.a.b r0 = p005b.p091k.p092a.p093a.p094a.C1573b.Polygon
            if (r2 == r0) goto L_0x0a1f
            if (r2 != r3) goto L_0x0a27
        L_0x0a1f:
            if (r2 == r3) goto L_0x0a24
            p298d.p344x.p346c.C6888i.m12436c(r8)
        L_0x0a24:
            p298d.p344x.p346c.C6888i.m12436c(r8)
        L_0x0a27:
            java.lang.String r0 = "chartOptions"
            p298d.p344x.p346c.C6888i.m12438e(r7, r0)
            java.lang.String r2 = r13.f2678l
            if (r2 == 0) goto L_0x0a38
            p298d.p344x.p346c.C6888i.m12438e(r7, r0)
            r13.mo11714a(r7)
            goto L_0x0b38
        L_0x0a38:
            java.lang.String r0 = "file:///android_asset/AAChartView.html"
            r13.loadUrl(r0)
            b.k.a.a.a.d r0 = new b.k.a.a.a.d
            r0.<init>(r13, r7)
            r13.setWebViewClient(r0)
            b.k.a.a.a.e r0 = new b.k.a.a.a.e
            r0.<init>(r13)
            r13.setWebChromeClient(r0)
            goto L_0x0b38
        L_0x0a4f:
            android.view.View r13 = new android.view.View
            r13.<init>(r0)
            goto L_0x0b38
        L_0x0a56:
            java.lang.String r2 = "component:input-password"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a8c
        L_0x0a5e:
            android.widget.EditText r15 = new android.widget.EditText
            r15.<init>(r0)
            java.lang.String r4 = r1.f10939a
            com.appfoundry.previewer.model.Text r8 = r1.f10941c
            java.lang.String r12 = r1.f10940b
            java.util.List<com.appfoundry.previewer.model.RichText> r0 = r1.f10955q
            java.lang.String r14 = r1.f10954p
            java.lang.String r7 = r1.f10956r
            r16 = 0
            r17 = 0
            r2 = r15
            r3 = r30
            r5 = r31
            r6 = r32
            r18 = r7
            r7 = r33
            r9 = r13
            r10 = r16
            r11 = r17
            r13 = r0
            r0 = r15
            r15 = r18
            p005b.p006a.p007a.p018i.C0758q.m241f(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x040a
        L_0x0a8c:
            android.view.View r13 = new android.view.View
            r13.<init>(r0)
            java.lang.String r0 = "$this$createView"
            p298d.p344x.p346c.C6888i.m12438e(r13, r0)
            java.lang.String r0 = "$this$setupColor"
            p298d.p344x.p346c.C6888i.m12438e(r13, r0)
            if (r9 == 0) goto L_0x0aa1
            com.appfoundry.previewer.model.Dimensions r0 = r9.f11152m
            r2 = r0
            goto L_0x0aa2
        L_0x0aa1:
            r2 = 0
        L_0x0aa2:
            r5 = 0
            r6 = 0
            r7 = 24
            r3 = r32
            r4 = r33
            b.a.a.j.b r0 = p005b.p038f.p039a.C0849e.m523j(r2, r3, r4, r5, r6, r7)
            int r2 = r0.f515b
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r2)
            com.appfoundry.previewer.model.Dimensions r2 = r0.f516c
            p005b.p038f.p039a.C0849e.m552x0(r3, r2)
            r13.setLayoutParams(r3)
            if (r9 == 0) goto L_0x0ac8
            int r2 = r0.f514a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9.f11138O = r2
        L_0x0ac8:
            if (r9 == 0) goto L_0x0ad2
            int r2 = r0.f515b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9.f11139P = r2
        L_0x0ad2:
            if (r9 == 0) goto L_0x0ae5
            boolean r2 = p005b.p038f.p039a.C0849e.m503Y(r31)
            r3 = 1
            if (r2 != r3) goto L_0x0ae6
            int r0 = r0.f514a
            android.graphics.drawable.Drawable r0 = p005b.p038f.p039a.C0849e.m529m(r9, r0)
            r13.setBackground(r0)
            goto L_0x0b06
        L_0x0ae5:
            r3 = 1
        L_0x0ae6:
            if (r9 == 0) goto L_0x0b06
            boolean r0 = p005b.p038f.p039a.C0849e.m501W(r31)
            if (r0 != r3) goto L_0x0b06
            java.lang.String r0 = r9.f11142c
            if (r0 == 0) goto L_0x0afb
            int r0 = p005b.p006a.p007a.p018i.C0756o.m233k(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            goto L_0x0afc
        L_0x0afb:
            r7 = 0
        L_0x0afc:
            p298d.p344x.p346c.C6888i.m12436c(r7)
            int r0 = r7.intValue()
            r13.setBackgroundColor(r0)
        L_0x0b06:
            if (r9 == 0) goto L_0x0b16
            java.lang.Integer r0 = r9.f11157r
            if (r0 == 0) goto L_0x0b16
            int r0 = r0.intValue()
            float r0 = (float) r0
            r2 = 1120403456(0x42c80000, float:100.0)
            float r8 = r0 / r2
            goto L_0x0b18
        L_0x0b16:
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0b18:
            r13.setAlpha(r8)
            if (r9 == 0) goto L_0x0b20
            java.lang.Float r7 = r9.f11129F
            goto L_0x0b21
        L_0x0b20:
            r7 = 0
        L_0x0b21:
            if (r7 == 0) goto L_0x0b2c
            java.lang.Float r0 = r9.f11129F
            float r0 = r0.floatValue()
            r13.setRotation(r0)
        L_0x0b2c:
            r2 = 1
            r13.setClipToOutline(r2)
            r0 = 2131230857(0x7f080089, float:1.8077779E38)
            java.lang.String r2 = "component:color"
            r13.setTag(r0, r2)
        L_0x0b38:
            java.lang.String r0 = r1.f10958t
            r13.setContentDescription(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p018i.C0744e.m209m(com.appfoundry.previewer.model.Component, android.content.Context, java.lang.String, com.appfoundry.previewer.model.Style, int, int, java.lang.Boolean, int, boolean):android.view.View");
    }

    /* renamed from: n */
    public static final Float m210n(Page page) {
        C6888i.m12438e(page, "$this$getWidth");
        Style O = C0823f.m346O(page.f11050r, (Boolean) null, 2);
        if (O != null) {
            return O.f11148i;
        }
        return null;
    }

    /* renamed from: o */
    public static final void m211o(Container container) {
        C6888i.m12438e(container, "$this$handleAudioIfExists");
        String h = m204h(container);
        if (h != null) {
            container.f10980n = h;
            BravoApp.C5403b bVar = BravoApp.f10730N;
            if (BravoApp.f10719C.get(h) == null) {
                BravoApp.f10719C.put(h, new ArrayList());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if ((r0.length() == 0) != false) goto L_0x001a;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m212p(com.appfoundry.previewer.model.Container r2, java.lang.String r3, android.widget.FrameLayout r4) {
        /*
            java.lang.String r0 = "$this$handleHrefIfExists"
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            java.lang.String r0 = "containerParent"
            p298d.p344x.p346c.C6888i.m12438e(r4, r0)
            java.lang.String r0 = r2.f10970d
            r1 = 1
            if (r0 == 0) goto L_0x001a
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0017
            r0 = r1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x002a
        L_0x001a:
            com.appfoundry.previewer.model.Actions r0 = r2.f10977k
            if (r0 != 0) goto L_0x002a
            java.util.List<java.lang.String> r0 = r2.f10976j
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = p005b.p038f.p039a.C0849e.m549w(r0)
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x0040
        L_0x002a:
            b.a.a.i.h r0 = new b.a.a.i.h
            r0.<init>(r2, r3)
            r4.setOnClickListener(r0)
            java.lang.String r3 = r2.f10971e
            if (r3 == 0) goto L_0x0040
            boolean r3 = p005b.p006a.p007a.p018i.C0756o.m228f(r3)
            if (r3 != r1) goto L_0x0040
            java.lang.String r3 = r2.f10971e
            r2.f10970d = r3
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p018i.C0744e.m212p(com.appfoundry.previewer.model.Container, java.lang.String, android.widget.FrameLayout):void");
    }

    /* renamed from: q */
    public static final boolean m213q(Component component, String str) {
        Tap tap;
        String str2;
        C6888i.m12438e(component, "$this$hasAction");
        C6888i.m12438e(str, "actionType");
        Actions actions = component.f10949k;
        if ((actions == null || (tap = actions.f10886a) == null || (str2 = tap.f11166a) == null || !C7694h.m13926d(str2, str, false, 2)) && !m215s(component, str)) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static final boolean m214r(Page page) {
        C6888i.m12438e(page, "$this$hasCallAlways");
        return m216t(page, "refresh:always");
    }

    /* renamed from: s */
    public static final boolean m215s(Component component, String str) {
        C6888i.m12438e(component, "$this$hasTag");
        C6888i.m12438e(str, "tag");
        List<String> list = component.f10947i;
        T t = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C7694h.m13924b((String) next, str, true)) {
                    t = next;
                    break;
                }
            }
            t = (String) t;
        }
        if (t != null) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static final boolean m216t(Page page, String str) {
        C6888i.m12438e(page, "$this$hasTag");
        C6888i.m12438e(str, "tag");
        List<String> list = page.f11045m;
        T t = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C7694h.m13924b((String) next, str, true)) {
                    t = next;
                    break;
                }
            }
            t = (String) t;
        }
        if (t != null) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public static final boolean m217u(Page page) {
        C6888i.m12438e(page, "$this$isAppList");
        return C6888i.m12434a(page.f11033a, "01DZ4603T6VVRA0F2RAKTXMQ64") || C6888i.m12434a(page.f11033a, "01DZ45B405STDZ8N44S6WBW58T");
    }

    /* renamed from: v */
    public static final boolean m218v(Container container) {
        List<Container> list;
        List<Container> list2;
        C6888i.m12438e(container, "$this$isCarousel");
        Params params = container.f10979m;
        boolean z = true;
        if (!C6888i.m12434a(params != null ? params.f11078r : null, "horizontal") || (list2 = container.f10978l) == null || !(!list2.isEmpty())) {
            z = false;
        }
        if (z && (list = container.f10978l) != null) {
            for (Container container2 : list) {
                container2.f10981o = Boolean.TRUE;
            }
        }
        return z;
    }

    /* renamed from: w */
    public static final boolean m219w(Page page) {
        C6888i.m12438e(page, "$this$isLogin");
        return C6888i.m12434a(page.f11035c, "page:login");
    }

    /* renamed from: x */
    public static final Boolean m220x(Page page) {
        C6888i.m12438e(page, "$this$isModal");
        String str = page.f11035c;
        if (str != null) {
            return Boolean.valueOf(str.equals("page:modal"));
        }
        return null;
    }

    /* renamed from: y */
    public static final boolean m221y(Page page) {
        C6888i.m12438e(page, "$this$isModalOrPopup");
        Boolean x = m220x(page);
        Boolean bool = Boolean.TRUE;
        return C6888i.m12434a(x, bool) || C6888i.m12434a(m222z(page), bool);
    }

    /* renamed from: z */
    public static final Boolean m222z(Page page) {
        C6888i.m12438e(page, "$this$isPopUp");
        String str = page.f11035c;
        if (str != null) {
            return Boolean.valueOf(str.equals("page:popup"));
        }
        return null;
    }
}
