package com.appfoundry.previewer.activities;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.airbnb.lottie.LottieAnimationView;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.model.Asset;
import com.appfoundry.previewer.model.JsonApp;
import kotlin.Metadata;
import p005b.p006a.p007a.p018i.C0756o;
import p005b.p006a.p007a.p023n.C0816e;
import p005b.p006a.p007a.p023n.C0817f;
import p005b.p006a.p007a.p024o.C0820c;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p038f.p039a.C0849e;
import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p337v.C6824d;
import p298d.p337v.C6827f;
import p298d.p337v.p339j.p340a.C6840e;
import p298d.p337v.p339j.p340a.C6844h;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p416l.p417a.C7725h0;
import p416l.p417a.C7748o;
import p416l.p417a.C7815w;
import p416l.p417a.C7819x0;
import p416l.p417a.C7821y;
import p416l.p417a.C7823z;
import p416l.p417a.p419u1.C7785l;
import p421m.C7831c0;
import p421m.C7839e0;
import p421m.C7850h0;
import p421m.C7855j0;
import p421m.p422m0.p426g.C7887e;
import p441p.p442a.C8091a;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\bR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0017¨\u0006$"}, mo24462d2 = {"Lcom/appfoundry/previewer/activities/InitActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Ld/r;", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "()V", "", "unlink", "a", "(Z)V", "b", "Lcom/airbnb/lottie/LottieAnimationView;", "l", "Lcom/airbnb/lottie/LottieAnimationView;", "lottieLoading", "Landroid/widget/ImageView;", "k", "Landroid/widget/ImageView;", "splashImage", "h", "Z", "fromUnlink", "", "i", "Ljava/lang/String;", "newAppUrl", "Landroid/widget/TextView;", "j", "Landroid/widget/TextView;", "version", "g", "scanNewAppProcess", "<init>", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class InitActivity extends AppCompatActivity {

    /* renamed from: m */
    public static final /* synthetic */ int f10834m = 0;

    /* renamed from: g */
    public boolean f10835g;

    /* renamed from: h */
    public boolean f10836h;

    /* renamed from: i */
    public String f10837i;

    /* renamed from: j */
    public TextView f10838j;

    /* renamed from: k */
    public ImageView f10839k;

    /* renamed from: l */
    public LottieAnimationView f10840l;

    /* renamed from: com.appfoundry.previewer.activities.InitActivity$a */
    /* compiled from: java-style lambda group */
    public static final class C5443a implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ int f10841g;

        /* renamed from: h */
        public final /* synthetic */ Object f10842h;

        public C5443a(int i, Object obj) {
            this.f10841g = i;
            this.f10842h = obj;
        }

        public final void run() {
            int i = this.f10841g;
            if (i == 0) {
                BravoApp.C5403b bVar = BravoApp.f10730N;
                BravoApp.f10725I = ((FrameLayout) this.f10842h).getHeight();
            } else if (i == 1) {
                InitActivity initActivity = (InitActivity) this.f10842h;
                initActivity.mo18452a(initActivity.f10836h);
            } else {
                throw null;
            }
        }
    }

    @C6840e(mo24177c = "com.appfoundry.previewer.activities.InitActivity$start$1", mo24178f = "InitActivity.kt", mo24179l = {122, 123, 124, 138}, mo24180m = "invokeSuspend")
    /* renamed from: com.appfoundry.previewer.activities.InitActivity$b */
    public static final class C5444b extends C6844h implements C6866p<C7821y, C6824d<? super C6777r>, Object> {

        /* renamed from: k */
        public /* synthetic */ Object f10843k;

        /* renamed from: l */
        public Object f10844l;

        /* renamed from: m */
        public Object f10845m;

        /* renamed from: n */
        public Object f10846n;

        /* renamed from: o */
        public int f10847o;

        /* renamed from: p */
        public final /* synthetic */ InitActivity f10848p;

        @C6840e(mo24177c = "com.appfoundry.previewer.activities.InitActivity$start$1$1$fontTask$1", mo24178f = "InitActivity.kt", mo24179l = {}, mo24180m = "invokeSuspend")
        /* renamed from: com.appfoundry.previewer.activities.InitActivity$b$a */
        public static final class C5445a extends C6844h implements C6866p<C7821y, C6824d<? super Boolean>, Object> {

            /* renamed from: k */
            public final /* synthetic */ Asset f10849k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5445a(Asset asset, C6824d dVar) {
                super(2, dVar);
                this.f10849k = asset;
            }

            /* renamed from: b */
            public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
                C6888i.m12438e(dVar, "completion");
                return new C5445a(this.f10849k, dVar);
            }

            /* renamed from: e */
            public final Object mo10326e(Object obj) {
                C5266a.m10018q4(obj);
                return C0849e.m537q(this.f10849k);
            }

            public final Object invoke(Object obj, Object obj2) {
                C6824d dVar = (C6824d) obj2;
                C6888i.m12438e(dVar, "completion");
                Asset asset = this.f10849k;
                dVar.getContext();
                C5266a.m10018q4(C6777r.f13694a);
                return C0849e.m537q(asset);
            }
        }

        @C6840e(mo24177c = "com.appfoundry.previewer.activities.InitActivity$start$1$parsedJson$1", mo24178f = "InitActivity.kt", mo24179l = {}, mo24180m = "invokeSuspend")
        /* renamed from: com.appfoundry.previewer.activities.InitActivity$b$b */
        public static final class C5446b extends C6844h implements C6866p<C7821y, C6824d<? super JsonApp>, Object> {

            /* renamed from: k */
            public final /* synthetic */ C5444b f10850k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5446b(C5444b bVar, C6824d dVar) {
                super(2, dVar);
                this.f10850k = bVar;
            }

            /* renamed from: b */
            public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
                C6888i.m12438e(dVar, "completion");
                return new C5446b(this.f10850k, dVar);
            }

            /* renamed from: e */
            public final Object mo10326e(Object obj) {
                C5266a.m10018q4(obj);
                return C0820c.m320t(this.f10850k.f10848p.f10837i);
            }

            public final Object invoke(Object obj, Object obj2) {
                C6824d dVar = (C6824d) obj2;
                C6888i.m12438e(dVar, "completion");
                C5444b bVar = this.f10850k;
                dVar.getContext();
                C5266a.m10018q4(C6777r.f13694a);
                return C0820c.m320t(bVar.f10848p.f10837i);
            }
        }

        @C6840e(mo24177c = "com.appfoundry.previewer.activities.InitActivity$start$1$parsedJson$2", mo24178f = "InitActivity.kt", mo24179l = {}, mo24180m = "invokeSuspend")
        /* renamed from: com.appfoundry.previewer.activities.InitActivity$b$c */
        public static final class C5447c extends C6844h implements C6866p<C7821y, C6824d<? super JsonApp>, Object> {
            public C5447c(C6824d dVar) {
                super(2, dVar);
            }

            /* renamed from: b */
            public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
                C6888i.m12438e(dVar, "completion");
                return new C5447c(dVar);
            }

            /* renamed from: e */
            public final Object mo10326e(Object obj) {
                C5266a.m10018q4(obj);
                C8091a.f16272d.mo26043a("USER APP (Not Bravo Vision) with id: %s", C0849e.m507b());
                BravoApp.C5403b bVar = BravoApp.f10730N;
                JsonApp jsonApp = BravoApp.f10738n;
                if (jsonApp != null) {
                    return jsonApp;
                }
                C0817f fVar = C0817f.f641b;
                String b = C0817f.m294b("current_json");
                if (b == null || !C0756o.m228f(b)) {
                    StringBuilder u = C0843a.m460u("https://apps-service.bravostudio.app/devices/apps/");
                    u.append(C0849e.m507b());
                    return C0820c.m320t(u.toString());
                }
                C0816e eVar = C0816e.f639l;
                return C0816e.f628a.mo16830b(b);
            }

            public final Object invoke(Object obj, Object obj2) {
                C6824d dVar = (C6824d) obj2;
                C6888i.m12438e(dVar, "completion");
                dVar.getContext();
                C5266a.m10018q4(C6777r.f13694a);
                C8091a.f16272d.mo26043a("USER APP (Not Bravo Vision) with id: %s", C0849e.m507b());
                BravoApp.C5403b bVar = BravoApp.f10730N;
                JsonApp jsonApp = BravoApp.f10738n;
                if (jsonApp != null) {
                    return jsonApp;
                }
                C0817f fVar = C0817f.f641b;
                String b = C0817f.m294b("current_json");
                if (b == null || !C0756o.m228f(b)) {
                    StringBuilder u = C0843a.m460u("https://apps-service.bravostudio.app/devices/apps/");
                    u.append(C0849e.m507b());
                    return C0820c.m320t(u.toString());
                }
                C0816e eVar = C0816e.f639l;
                return C0816e.f628a.mo16830b(b);
            }
        }

        @C6840e(mo24177c = "com.appfoundry.previewer.activities.InitActivity$start$1$parsedJson$3", mo24178f = "InitActivity.kt", mo24179l = {}, mo24180m = "invokeSuspend")
        /* renamed from: com.appfoundry.previewer.activities.InitActivity$b$d */
        public static final class C5448d extends C6844h implements C6866p<C7821y, C6824d<? super JsonApp>, Object> {
            public C5448d(C6824d dVar) {
                super(2, dVar);
            }

            /* renamed from: b */
            public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
                C6888i.m12438e(dVar, "completion");
                return new C5448d(dVar);
            }

            /* renamed from: e */
            public final Object mo10326e(Object obj) {
                C5266a.m10018q4(obj);
                BravoApp.C5403b bVar = BravoApp.f10730N;
                if (BravoApp.f10738n != null && !C0849e.m511d()) {
                    return BravoApp.f10738n;
                }
                C0817f fVar = C0817f.f641b;
                String b = C0817f.m294b("current_json");
                if (b == null || !C0756o.m228f(b) || C0849e.m511d()) {
                    try {
                        String str = "https://apps-service.bravostudio.app/devices/apps/" + C0849e.m507b();
                        C7831c0 c = bVar.mo18363c();
                        C6888i.m12438e(str, "url");
                        C7839e0.C7840a aVar = new C7839e0.C7840a();
                        aVar.mo25540f(str);
                        C7850h0 h = ((C7887e) c.mo25525a(aVar.mo25535a())).mo25623h();
                        C7855j0 j0Var = h.f15555m;
                        return h.f15552j != 200 ? C0820c.m309i() : C0820c.m326z(j0Var != null ? j0Var.mo25572z() : null);
                    } catch (Exception unused) {
                        return C0820c.m309i();
                    }
                } else {
                    C0816e eVar = C0816e.f639l;
                    return C0816e.f628a.mo16830b(b);
                }
            }

            public final Object invoke(Object obj, Object obj2) {
                C6824d dVar = (C6824d) obj2;
                C6888i.m12438e(dVar, "completion");
                return new C5448d(dVar).mo10326e(C6777r.f13694a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5444b(InitActivity initActivity, C6824d dVar) {
            super(2, dVar);
            this.f10848p = initActivity;
        }

        /* renamed from: b */
        public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
            C6888i.m12438e(dVar, "completion");
            C5444b bVar = new C5444b(this.f10848p, dVar);
            bVar.f10843k = obj;
            return bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0175, code lost:
            if ((r9 != null ? p298d.p415c0.C7694h.m13926d(r9, "figma", false, 2) : false) == false) goto L_0x0179;
         */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0144  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x01b7  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x01cc  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0204  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x0222  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo10326e(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                d.v.i.a r1 = p298d.p337v.p338i.C6833a.COROUTINE_SUSPENDED
                int r2 = r0.f10847o
                r3 = 4
                r4 = 0
                r5 = 0
                r6 = 2
                r7 = 1
                r8 = 3
                if (r2 == 0) goto L_0x0041
                if (r2 == r7) goto L_0x0037
                if (r2 == r6) goto L_0x0037
                if (r2 == r8) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r2 = r0.f10846n
                com.appfoundry.previewer.model.Asset r2 = (com.appfoundry.previewer.model.Asset) r2
                java.lang.Object r4 = r0.f10845m
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r7 = r0.f10844l
                com.appfoundry.previewer.model.JsonApp r7 = (com.appfoundry.previewer.model.JsonApp) r7
                java.lang.Object r8 = r0.f10843k
                l.a.y r8 = (p416l.p417a.C7821y) r8
                p005b.p291q.p292a.C5266a.m10018q4(r19)
                r14 = r0
                r15 = r8
                r8 = r19
                goto L_0x01a6
            L_0x002f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0037:
                java.lang.Object r2 = r0.f10843k
                l.a.y r2 = (p416l.p417a.C7821y) r2
                p005b.p291q.p292a.C5266a.m10018q4(r19)
                r8 = r19
                goto L_0x008a
            L_0x0041:
                p005b.p291q.p292a.C5266a.m10018q4(r19)
                java.lang.Object r2 = r0.f10843k
                l.a.y r2 = (p416l.p417a.C7821y) r2
                com.appfoundry.previewer.activities.InitActivity r9 = r0.f10848p
                boolean r9 = r9.f10835g
                if (r9 == 0) goto L_0x0060
                l.a.w r8 = p416l.p417a.C7725h0.f15274b
                com.appfoundry.previewer.activities.InitActivity$b$b r9 = new com.appfoundry.previewer.activities.InitActivity$b$b
                r9.<init>(r0, r4)
                r0.f10843k = r2
                r0.f10847o = r7
                java.lang.Object r8 = p005b.p291q.p292a.C5266a.m9853N4(r8, r9, r0)
                if (r8 != r1) goto L_0x008a
                return r1
            L_0x0060:
                boolean r9 = p005b.p006a.p007a.p024o.C0820c.m301a()
                if (r9 == 0) goto L_0x0078
                l.a.w r8 = p416l.p417a.C7725h0.f15274b
                com.appfoundry.previewer.activities.InitActivity$b$c r9 = new com.appfoundry.previewer.activities.InitActivity$b$c
                r9.<init>(r4)
                r0.f10843k = r2
                r0.f10847o = r6
                java.lang.Object r8 = p005b.p291q.p292a.C5266a.m9853N4(r8, r9, r0)
                if (r8 != r1) goto L_0x008a
                return r1
            L_0x0078:
                l.a.w r9 = p416l.p417a.C7725h0.f15274b
                com.appfoundry.previewer.activities.InitActivity$b$d r10 = new com.appfoundry.previewer.activities.InitActivity$b$d
                r10.<init>(r4)
                r0.f10843k = r2
                r0.f10847o = r8
                java.lang.Object r8 = p005b.p291q.p292a.C5266a.m9853N4(r9, r10, r0)
                if (r8 != r1) goto L_0x008a
                return r1
            L_0x008a:
                com.appfoundry.previewer.model.JsonApp r8 = (com.appfoundry.previewer.model.JsonApp) r8
                if (r8 == 0) goto L_0x0099
                com.appfoundry.previewer.model.App r9 = r8.f11021d
                if (r9 == 0) goto L_0x0099
                com.appfoundry.previewer.model.Data r9 = r9.f10891e
                if (r9 == 0) goto L_0x0099
                java.util.List<com.appfoundry.previewer.model.Page> r9 = r9.f10985b
                goto L_0x009a
            L_0x0099:
                r9 = r4
            L_0x009a:
                if (r9 == 0) goto L_0x00ab
                com.appfoundry.previewer.model.App r9 = r8.f11021d
                com.appfoundry.previewer.model.Data r9 = r9.f10891e
                java.util.List<com.appfoundry.previewer.model.Page> r9 = r9.f10985b
                boolean r9 = r9.isEmpty()
                if (r9 == 0) goto L_0x00a9
                goto L_0x00ab
            L_0x00a9:
                r9 = r7
                goto L_0x00b5
            L_0x00ab:
                java.lang.Object[] r9 = new java.lang.Object[r5]
                p.a.a$b r10 = p441p.p442a.C8091a.f16272d
                java.lang.String r11 = "Json App is null or App does not have pages"
                r10.mo26044b(r11, r9)
                r9 = r5
            L_0x00b5:
                if (r9 == 0) goto L_0x02a4
                if (r8 == 0) goto L_0x00bc
                java.lang.String r9 = r8.f11018a
                goto L_0x00bd
            L_0x00bc:
                r9 = r4
            L_0x00bd:
                java.lang.String r10 = "appId"
                p005b.p273o.C4857i2.m8926C(r10, r9)
                com.appfoundry.previewer.BravoApp$b r9 = com.appfoundry.previewer.BravoApp.f10730N
                com.appfoundry.previewer.activities.InitActivity r10 = r0.f10848p
                java.lang.String r10 = r10.f10837i
                if (r10 == 0) goto L_0x00d5
                boolean r10 = p005b.p006a.p007a.p018i.C0756o.m228f(r10)
                if (r10 != r7) goto L_0x00d5
                com.appfoundry.previewer.activities.InitActivity r10 = r0.f10848p
                java.lang.String r10 = r10.f10837i
                goto L_0x00e8
            L_0x00d5:
                java.lang.String r10 = "https://apps-service.bravostudio.app/devices/apps/"
                java.lang.StringBuilder r10 = p005b.p035e.p036a.p037a.C0843a.m460u(r10)
                if (r8 == 0) goto L_0x00e0
                java.lang.String r11 = r8.f11018a
                goto L_0x00e1
            L_0x00e0:
                r11 = r4
            L_0x00e1:
                r10.append(r11)
                java.lang.String r10 = r10.toString()
            L_0x00e8:
                r9.mo18366f(r8, r10)
                com.appfoundry.previewer.activities.InitActivity r9 = r0.f10848p
                android.content.Intent r10 = r9.getIntent()
                java.lang.String r11 = "from_scanning"
                boolean r10 = r10.getBooleanExtra(r11, r5)
                if (r10 == 0) goto L_0x0127
                b.a.a.f.a r10 = p005b.p006a.p007a.p015f.C0688a.f391b
                java.lang.String r9 = r9.f10837i
                android.content.Context r10 = p005b.p038f.p039a.C0849e.m505a()
                com.segment.analytics.Analytics r10 = com.segment.analytics.Analytics.with(r10)
                java.lang.String r11 = p005b.p006a.p007a.p015f.C0688a.m185c()
                java.util.UUID r12 = java.util.UUID.randomUUID()
                java.lang.String r12 = r12.toString()
                java.lang.String r13 = "java.util.UUID.randomUUID().toString()"
                p298d.p344x.p346c.C6888i.m12437d(r12, r13)
                com.segment.analytics.Properties r11 = p005b.p006a.p007a.p015f.C0688a.m184b(r11, r12)
                java.lang.String r12 = "url"
                com.segment.analytics.Properties r9 = r11.putValue((java.lang.String) r12, (java.lang.Object) r9)
                java.lang.String r11 = "Slack"
                java.lang.String r12 = "QR Loaded"
                p005b.p035e.p036a.p037a.C0843a.m430F(r11, r5, r10, r12, r9)
            L_0x0127:
                if (r8 == 0) goto L_0x0207
                com.appfoundry.previewer.model.App r9 = r8.f11021d
                if (r9 == 0) goto L_0x0207
                java.util.List<com.appfoundry.previewer.model.Asset> r9 = r9.f10887a
                if (r9 == 0) goto L_0x0207
                java.util.Iterator r9 = r9.iterator()
                r14 = r0
                r15 = r2
                r2 = r4
                r4 = r9
                r17 = r8
                r8 = r7
                r7 = r17
            L_0x013e:
                boolean r9 = r4.hasNext()
                if (r9 == 0) goto L_0x0204
                java.lang.Object r9 = r4.next()
                r13 = r9
                com.appfoundry.previewer.model.Asset r13 = (com.appfoundry.previewer.model.Asset) r13
                java.lang.String r9 = "$this$shouldDownload"
                p298d.p344x.p346c.C6888i.m12438e(r13, r9)
                java.lang.String r9 = "$this$exists"
                p298d.p344x.p346c.C6888i.m12438e(r13, r9)
                java.io.File r9 = new java.io.File
                java.lang.String r10 = p005b.p038f.p039a.C0849e.m532n0(r13)
                r9.<init>(r10)
                boolean r9 = r9.exists()
                java.lang.String r10 = "figma"
                java.lang.String r11 = "$this$customFont"
                if (r9 != 0) goto L_0x0178
                p298d.p344x.p346c.C6888i.m12438e(r13, r11)
                java.lang.String r9 = r13.f10896b
                if (r9 == 0) goto L_0x0174
                boolean r9 = p298d.p415c0.C7694h.m13926d(r9, r10, r5, r6)
                goto L_0x0175
            L_0x0174:
                r9 = r5
            L_0x0175:
                if (r9 != 0) goto L_0x0178
                goto L_0x0179
            L_0x0178:
                r8 = r5
            L_0x0179:
                if (r8 == 0) goto L_0x01db
                l.a.w r10 = p416l.p417a.C7725h0.f15274b
                r11 = 0
                com.appfoundry.previewer.activities.InitActivity$b$a r12 = new com.appfoundry.previewer.activities.InitActivity$b$a
                r12.<init>(r13, r2)
                r2 = 2
                r8 = 0
                r9 = r15
                r16 = r13
                r13 = r2
                r2 = r14
                r14 = r8
                l.a.c0 r8 = p005b.p291q.p292a.C5266a.m9800F(r9, r10, r11, r12, r13, r14)
                r2.f10843k = r15
                r2.f10844l = r7
                r2.f10845m = r4
                r9 = r16
                r2.f10846n = r9
                r2.f10847o = r3
                l.a.e0 r8 = (p416l.p417a.C7716e0) r8
                java.lang.Object r8 = p416l.p417a.C7716e0.m14025U(r8, r2)
                if (r8 != r1) goto L_0x01a4
                return r1
            L_0x01a4:
                r14 = r2
                r2 = r9
            L_0x01a6:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                com.appfoundry.previewer.activities.InitActivity r9 = r14.f10848p
                int r10 = com.appfoundry.previewer.activities.InitActivity.f10834m
                java.util.Objects.requireNonNull(r9)
                java.lang.Boolean r9 = java.lang.Boolean.TRUE
                boolean r8 = p298d.p344x.p346c.C6888i.m12434a(r8, r9)
                if (r8 == 0) goto L_0x01cc
                java.lang.Object[] r8 = new java.lang.Object[r6]
                java.lang.String r9 = r2.f10896b
                r8[r5] = r9
                java.lang.String r2 = p005b.p038f.p039a.C0849e.m532n0(r2)
                r9 = 1
                r8[r9] = r2
                p.a.a$b r2 = p441p.p442a.C8091a.f16272d
                java.lang.String r9 = "ASSETCACHING FONTS: Downloaded font %s to path %s "
                r2.mo26043a(r9, r8)
                goto L_0x0200
            L_0x01cc:
                r8 = 1
                java.lang.Object[] r8 = new java.lang.Object[r8]
                java.lang.String r2 = r2.f10896b
                r8[r5] = r2
                p.a.a$b r2 = p441p.p442a.C8091a.f16272d
                java.lang.String r9 = "ASSETCACHING FONTS: Error downloading %s"
                r2.mo26044b(r9, r8)
                goto L_0x0200
            L_0x01db:
                r9 = r13
                r2 = r14
                java.lang.String r8 = "$this$logWhyNotDownloaded"
                p298d.p344x.p346c.C6888i.m12438e(r9, r8)
                p298d.p344x.p346c.C6888i.m12438e(r9, r11)
                java.lang.String r8 = r9.f10896b
                if (r8 == 0) goto L_0x01ee
                boolean r8 = p298d.p415c0.C7694h.m13926d(r8, r10, r5, r6)
                goto L_0x01ef
            L_0x01ee:
                r8 = r5
            L_0x01ef:
                if (r8 == 0) goto L_0x01ff
                r8 = 1
                java.lang.Object[] r8 = new java.lang.Object[r8]
                java.lang.String r9 = r9.f10896b
                r8[r5] = r9
                p.a.a$b r9 = p441p.p442a.C8091a.f16272d
                java.lang.String r10 = "ASSETCACHING FONTS: Font is custom (can't  be downloaded): %s"
                r9.mo26044b(r10, r8)
            L_0x01ff:
                r14 = r2
            L_0x0200:
                r2 = 0
                r8 = 1
                goto L_0x013e
            L_0x0204:
                r2 = r14
                r8 = r7
                goto L_0x0208
            L_0x0207:
                r14 = r0
            L_0x0208:
                com.appfoundry.previewer.BravoApp$b r1 = com.appfoundry.previewer.BravoApp.f10730N
                if (r8 == 0) goto L_0x0284
                com.appfoundry.previewer.model.App r1 = r8.f11021d
                if (r1 == 0) goto L_0x0284
                com.appfoundry.previewer.model.Data r1 = r1.f10891e
                if (r1 == 0) goto L_0x0284
                java.util.List<com.appfoundry.previewer.model.Page> r1 = r1.f10985b
                if (r1 == 0) goto L_0x0284
                java.util.Iterator r1 = r1.iterator()
            L_0x021c:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0284
                java.lang.Object r2 = r1.next()
                com.appfoundry.previewer.model.Page r2 = (com.appfoundry.previewer.model.Page) r2
                java.util.List<java.lang.String> r3 = r2.f11045m
                if (r3 == 0) goto L_0x021c
                java.lang.String r4 = "state:loading"
                boolean r3 = p005b.p038f.p039a.C0849e.m508b0(r3, r4)
                r4 = 1
                if (r3 != r4) goto L_0x021c
                java.util.List<com.appfoundry.previewer.model.Container> r2 = r2.f11038f
                if (r2 == 0) goto L_0x021c
                java.util.Iterator r2 = r2.iterator()
            L_0x023d:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x021c
                java.lang.Object r3 = r2.next()
                com.appfoundry.previewer.model.Container r3 = (com.appfoundry.previewer.model.Container) r3
                java.util.List<com.appfoundry.previewer.model.Component> r3 = r3.f10972f
                if (r3 == 0) goto L_0x023d
                java.util.Iterator r3 = r3.iterator()
            L_0x0251:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x023d
                java.lang.Object r4 = r3.next()
                com.appfoundry.previewer.model.Component r4 = (com.appfoundry.previewer.model.Component) r4
                java.lang.String r5 = "$this$shouldBeCached"
                p298d.p344x.p346c.C6888i.m12438e(r4, r5)
                java.lang.String r5 = "component:lottie"
                boolean r5 = p005b.p006a.p007a.p018i.C0744e.m190C(r4, r5)
                if (r5 == 0) goto L_0x0251
                java.lang.String r4 = r4.f10944f
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                com.appfoundry.previewer.model.Asset r4 = p005b.p006a.p007a.p024o.C0823f.m334C(r4, r5)
                if (r4 == 0) goto L_0x0251
                l.a.r0 r5 = p416l.p417a.C7758r0.f15311g
                r6 = 0
                r7 = 0
                b.a.a.c r8 = new b.a.a.c
                r9 = 0
                r8.<init>(r4, r9)
                r9 = 3
                r10 = 0
                p005b.p291q.p292a.C5266a.m9880S2(r5, r6, r7, r8, r9, r10)
                goto L_0x0251
            L_0x0284:
                com.appfoundry.previewer.activities.InitActivity r1 = r14.f10848p
                android.content.Intent r2 = new android.content.Intent
                com.appfoundry.previewer.activities.InitActivity r3 = r14.f10848p
                java.lang.Class<com.appfoundry.previewer.activities.BravoActivity> r4 = com.appfoundry.previewer.activities.BravoActivity.class
                r2.<init>(r3, r4)
                com.appfoundry.previewer.activities.InitActivity r3 = r14.f10848p
                boolean r3 = r3.f10836h
                java.lang.String r4 = "unlink"
                android.content.Intent r2 = r2.putExtra(r4, r3)
                r1.startActivity(r2)
                com.appfoundry.previewer.BravoApp$b r1 = com.appfoundry.previewer.BravoApp.f10730N
                r1.mo18365e()
                com.appfoundry.previewer.activities.InitActivity r1 = r14.f10848p
                goto L_0x02ff
            L_0x02a4:
                if (r8 == 0) goto L_0x02e4
                java.lang.String r1 = "$this$returnedError"
                p298d.p344x.p346c.C6888i.m12438e(r8, r1)
                java.lang.Integer r1 = r8.f11022e
                if (r1 == 0) goto L_0x02be
                r2 = 200(0xc8, float:2.8E-43)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x02be
                r1 = 1
                r2 = 1
                goto L_0x02c0
            L_0x02be:
                r1 = 1
                r2 = r5
            L_0x02c0:
                if (r2 != r1) goto L_0x02e4
                com.appfoundry.previewer.activities.InitActivity r1 = r0.f10848p
                java.lang.String r2 = "Error "
                java.lang.StringBuilder r2 = p005b.p035e.p036a.p037a.C0843a.m460u(r2)
                java.lang.Integer r3 = r8.f11022e
                r2.append(r3)
                java.lang.String r3 = ". "
                r2.append(r3)
                java.lang.String r3 = r8.f11023f
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r5)
                r1.show()
            L_0x02e4:
                com.appfoundry.previewer.BravoApp$b r1 = com.appfoundry.previewer.BravoApp.f10730N
                com.appfoundry.previewer.model.JsonApp r2 = p005b.p006a.p007a.p024o.C0820c.m309i()
                com.appfoundry.previewer.BravoApp.f10738n = r2
                com.appfoundry.previewer.activities.InitActivity r2 = r0.f10848p
                android.content.Intent r3 = new android.content.Intent
                com.appfoundry.previewer.activities.InitActivity r4 = r0.f10848p
                java.lang.Class<com.appfoundry.previewer.activities.BravoActivity> r5 = com.appfoundry.previewer.activities.BravoActivity.class
                r3.<init>(r4, r5)
                r2.startActivity(r3)
                r1.mo18365e()
                com.appfoundry.previewer.activities.InitActivity r1 = r0.f10848p
            L_0x02ff:
                r1.finish()
                d.r r1 = p298d.C6777r.f13694a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.InitActivity.C5444b.mo10326e(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(Object obj, Object obj2) {
            C6824d dVar = (C6824d) obj2;
            C6888i.m12438e(dVar, "completion");
            C5444b bVar = new C5444b(this.f10848p, dVar);
            bVar.f10843k = obj;
            return bVar.mo10326e(C6777r.f13694a);
        }
    }

    /* renamed from: a */
    public final void mo18452a(boolean z) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator alpha2;
        if (z) {
            ImageView imageView = this.f10839k;
            if (imageView != null) {
                imageView.setAlpha(0.0f);
            }
            TextView textView = this.f10838j;
            if (textView != null) {
                textView.setAlpha(0.0f);
            }
        } else {
            ImageView imageView2 = this.f10839k;
            if (!(imageView2 == null || (animate2 = imageView2.animate()) == null || (alpha2 = animate2.alpha(0.0f)) == null)) {
                alpha2.setDuration(500);
            }
            TextView textView2 = this.f10838j;
            if (!(textView2 == null || (animate = textView2.animate()) == null || (alpha = animate.alpha(0.0f)) == null)) {
                alpha.setDuration(500);
            }
        }
        mo18453b();
    }

    /* renamed from: b */
    public final void mo18453b() {
        C7748o h = C5266a.m9959h((C7819x0) null, 1, (Object) null);
        C7815w wVar = C7725h0.f15273a;
        C5266a.m9880S2(C5266a.m9953g(C7785l.f15351b.plus(h)), (C6827f) null, (C7823z) null, new C5444b(this, (C6824d) null), 3, (Object) null);
    }

    public void onBackPressed() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        C0849e.m554y0(this);
        C0849e.m512d0(this);
        Resources resources = getResources();
        C6888i.m12437d(resources, "resources");
        Object[] objArr = {Float.valueOf(resources.getDisplayMetrics().density)};
        C8091a.C8093b bVar = C8091a.f16272d;
        bVar.mo26043a("SCREEN DENSITY = %s", objArr);
        setContentView((int) R.layout.activity_init);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.splash_parent);
        if (frameLayout != null) {
            frameLayout.post(new C5443a(0, frameLayout));
        }
        TextView textView = (TextView) findViewById(R.id.version);
        this.f10838j = textView;
        if (textView != null) {
            textView.setText("3.0.180");
        }
        this.f10839k = (ImageView) findViewById(R.id.splash_image);
        this.f10840l = (LottieAnimationView) findViewById(R.id.lottie_loading);
        this.f10835g = getIntent().getBooleanExtra("scan_new_app", false);
        BravoApp.C5403b bVar2 = BravoApp.f10730N;
        if (BravoApp.f10728L == null) {
            BravoApp.f10728L = Boolean.valueOf(getIntent().getBooleanExtra("IS_APPIUM_UI_TEST", false));
            BravoApp.f10729M = Boolean.valueOf(getIntent().getBooleanExtra("IS_APPIUM_UI_TEST_WITH_SKIP_INTRO", false));
        }
        bVar.mo26043a("COMES FROM APPIUM = %b", BravoApp.f10728L);
        bVar.mo26043a("COMES FROM APPIUM, SKIP INTRO = %b", BravoApp.f10729M);
        bVar.mo26043a("scanNewAppProcess = %s", String.valueOf(this.f10835g));
        this.f10837i = getIntent().getStringExtra("new_app_url");
        this.f10836h = getIntent().getBooleanExtra("unlink", false);
        boolean booleanExtra = getIntent().getBooleanExtra("new_json", false);
        if (this.f10835g || booleanExtra) {
            LottieAnimationView lottieAnimationView = this.f10840l;
            if (lottieAnimationView != null) {
                lottieAnimationView.setAlpha(1.0f);
            }
            LottieAnimationView lottieAnimationView2 = this.f10840l;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.playAnimation();
            }
            ImageView imageView = this.f10839k;
            if (imageView != null) {
                imageView.setAlpha(0.0f);
            }
            TextView textView2 = this.f10838j;
            if (textView2 != null) {
                textView2.setAlpha(0.0f);
            }
            mo18453b();
            return;
        }
        boolean z = this.f10836h;
        if (z) {
            mo18452a(z);
        } else {
            new Handler().postDelayed(new C5443a(1, this), 800);
        }
    }
}
