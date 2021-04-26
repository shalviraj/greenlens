package com.appfoundry.previewer;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebView;
import androidx.appcompat.widget.ActivityChooserModel;
import com.appfoundry.previewer.fragments.BottomSheetFragment;
import com.appfoundry.previewer.model.Asset;
import com.appfoundry.previewer.model.JsonApp;
import com.appfoundry.previewer.model.Page;
import com.appfoundry.previewer.model.Style;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p006a.p007a.p015f.C0688a;
import p005b.p006a.p007a.p019j.C0770a;
import p005b.p006a.p007a.p019j.C0777h;
import p005b.p006a.p007a.p019j.C0778i;
import p005b.p006a.p007a.p021l.C0785b;
import p005b.p006a.p007a.p024o.C0820c;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.C3980e;
import p005b.p096l.p180d.p191q.p192f.p195g.C4032q;
import p005b.p096l.p180d.p191q.p192f.p195g.C4035r;
import p005b.p096l.p180d.p191q.p192f.p195g.C4043w;
import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p334t.C6790h;
import p298d.p337v.C6824d;
import p298d.p337v.p338i.C6833a;
import p298d.p337v.p339j.p340a.C6840e;
import p298d.p337v.p339j.p340a.C6844h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p416l.p417a.C7725h0;
import p416l.p417a.C7815w;
import p416l.p417a.C7821y;
import p421m.C7826a0;
import p421m.C7831c0;
import p421m.C7839e0;
import p421m.C7850h0;
import p421m.p422m0.C7867c;
import p421m.p422m0.p427h.C7909g;
import p421m.p434n0.C8004a;
import p441p.p442a.C8091a;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\r¨\u0006\u0018"}, mo24462d2 = {"Lcom/appfoundry/previewer/BravoApp;", "Landroid/app/Application;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Ld/r;", "onCreate", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "<init>", "N", "b", "c", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class BravoApp extends Application implements Application.ActivityLifecycleCallbacks {

    /* renamed from: A */
    public static C0785b f10717A;

    /* renamed from: B */
    public static FirebaseAuth f10718B;

    /* renamed from: C */
    public static Map<String, List<C0770a>> f10719C = new LinkedHashMap();

    /* renamed from: D */
    public static C0777h f10720D;

    /* renamed from: E */
    public static boolean f10721E;

    /* renamed from: F */
    public static boolean f10722F;

    /* renamed from: G */
    public static String f10723G = "";

    /* renamed from: H */
    public static boolean f10724H;

    /* renamed from: I */
    public static int f10725I;

    /* renamed from: J */
    public static int f10726J;

    /* renamed from: K */
    public static String f10727K;

    /* renamed from: L */
    public static Boolean f10728L;

    /* renamed from: M */
    public static Boolean f10729M;

    /* renamed from: N */
    public static final C5403b f10730N = new C5403b((DefaultConstructorMarker) null);

    /* renamed from: g */
    public static BravoApp f10731g;

    /* renamed from: h */
    public static int f10732h;

    /* renamed from: i */
    public static List<String> f10733i = new ArrayList();

    /* renamed from: j */
    public static Activity f10734j;

    /* renamed from: k */
    public static List<WebView> f10735k = new ArrayList();

    /* renamed from: l */
    public static C7831c0 f10736l;

    /* renamed from: m */
    public static JsonApp f10737m;

    /* renamed from: n */
    public static JsonApp f10738n;

    /* renamed from: o */
    public static Map<String, Page> f10739o;

    /* renamed from: p */
    public static Map<String, Style> f10740p;

    /* renamed from: q */
    public static Map<String, Asset> f10741q;

    /* renamed from: r */
    public static Map<String, String> f10742r = new LinkedHashMap();

    /* renamed from: s */
    public static BottomSheetFragment f10743s;

    /* renamed from: t */
    public static boolean f10744t;

    /* renamed from: u */
    public static boolean f10745u;

    /* renamed from: v */
    public static boolean f10746v;

    /* renamed from: w */
    public static boolean f10747w;

    /* renamed from: x */
    public static String f10748x;

    /* renamed from: y */
    public static List<C0778i> f10749y = new ArrayList();

    /* renamed from: z */
    public static boolean f10750z;

    /* renamed from: com.appfoundry.previewer.BravoApp$a */
    public static final class C5402a implements C7826a0 {
        /* renamed from: a */
        public final C7850h0 mo18360a(C7826a0.C7827a aVar) {
            C6888i.m12438e(aVar, "chain");
            C7909g gVar = (C7909g) aVar;
            C7839e0 e0Var = gVar.f15764f;
            Objects.requireNonNull(e0Var);
            C7839e0.C7840a aVar2 = new C7839e0.C7840a(e0Var);
            aVar2.mo25536b("User-Agent", C0820c.m315o());
            aVar2.mo25536b("Accept-Version", "2.0");
            return gVar.mo25663c(aVar2.mo25535a());
        }
    }

    /* renamed from: com.appfoundry.previewer.BravoApp$b */
    public static final class C5403b {
        public C5403b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: a */
        public final void mo18361a() {
            mo18367g();
            BravoApp.f10720D = null;
            BravoApp.f10719C.clear();
            BravoApp.f10742r.clear();
            for (WebView destroy : BravoApp.f10735k) {
                destroy.destroy();
            }
            BravoApp.f10735k.clear();
            BravoApp.f10724H = false;
        }

        /* renamed from: b */
        public final Context mo18362b() {
            BravoApp bravoApp = BravoApp.f10731g;
            C6888i.m12436c(bravoApp);
            return bravoApp.getApplicationContext();
        }

        /* renamed from: c */
        public final C7831c0 mo18363c() {
            C7831c0 c0Var = BravoApp.f10736l;
            if (c0Var != null) {
                return c0Var;
            }
            C6888i.m12446m("okHttpClient");
            throw null;
        }

        /* renamed from: d */
        public final String mo18364d() {
            StringBuilder u = C0843a.m460u(" > ");
            u.append(C6790h.m12369w(BravoApp.f10733i, "\n\n > ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6862l) null, 62));
            return u.toString();
        }

        /* renamed from: e */
        public final void mo18365e() {
            BravoApp.f10732h = 0;
            BravoApp.f10733i.clear();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
            r0 = (r0 = r7.f11021d).f10891e;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo18366f(com.appfoundry.previewer.model.JsonApp r7, java.lang.String r8) {
            /*
                r6 = this;
                com.appfoundry.previewer.BravoApp.f10738n = r7
                if (r8 == 0) goto L_0x000d
                com.appfoundry.previewer.BravoApp.f10748x = r8
                b.a.a.n.f r0 = p005b.p006a.p007a.p023n.C0817f.f641b
                java.lang.String r0 = "current_app_url"
                p005b.p006a.p007a.p023n.C0817f.m298f(r0, r8)
            L_0x000d:
                b.a.a.n.f r8 = p005b.p006a.p007a.p023n.C0817f.f641b
                b.a.a.n.e r8 = p005b.p006a.p007a.p023n.C0816e.f639l
                b.p.a.l<com.appfoundry.previewer.model.JsonApp> r8 = p005b.p006a.p007a.p023n.C0816e.f628a
                com.appfoundry.previewer.model.JsonApp r0 = com.appfoundry.previewer.BravoApp.f10738n
                java.lang.String r8 = r8.mo16832d(r0)
                java.lang.String r0 = "Moshify.instance.toJson(jsonApp)"
                p298d.p344x.p346c.C6888i.m12437d(r8, r0)
                java.lang.String r0 = "current_json"
                p005b.p006a.p007a.p023n.C0817f.m298f(r0, r8)
                r8 = 0
                if (r7 == 0) goto L_0x0031
                com.appfoundry.previewer.model.App r0 = r7.f11021d
                if (r0 == 0) goto L_0x0031
                com.appfoundry.previewer.model.Data r0 = r0.f10891e
                if (r0 == 0) goto L_0x0031
                java.util.List<com.appfoundry.previewer.model.Page> r0 = r0.f10985b
                goto L_0x0032
            L_0x0031:
                r0 = r8
            L_0x0032:
                r1 = 16
                r2 = 10
                if (r0 == 0) goto L_0x0064
                int r3 = p005b.p291q.p292a.C5266a.m9892V(r0, r2)
                int r3 = p005b.p291q.p292a.C5266a.m9957g3(r3)
                if (r3 >= r1) goto L_0x0043
                r3 = r1
            L_0x0043:
                java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                r4.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L_0x004c:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x005e
                java.lang.Object r3 = r0.next()
                com.appfoundry.previewer.model.Page r3 = (com.appfoundry.previewer.model.Page) r3
                java.lang.String r5 = r3.f11033a
                r4.put(r5, r3)
                goto L_0x004c
            L_0x005e:
                java.util.Map r0 = p298d.p334t.C6790h.m12345c0(r4)
                com.appfoundry.previewer.BravoApp.f10739o = r0
            L_0x0064:
                if (r7 == 0) goto L_0x006d
                com.appfoundry.previewer.model.App r0 = r7.f11021d
                if (r0 == 0) goto L_0x006d
                java.util.List<com.appfoundry.previewer.model.Style> r0 = r0.f10892f
                goto L_0x006e
            L_0x006d:
                r0 = r8
            L_0x006e:
                if (r0 == 0) goto L_0x0098
                int r3 = p005b.p291q.p292a.C5266a.m9892V(r0, r2)
                int r3 = p005b.p291q.p292a.C5266a.m9957g3(r3)
                if (r3 >= r1) goto L_0x007b
                r3 = r1
            L_0x007b:
                java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                r4.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L_0x0084:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0096
                java.lang.Object r3 = r0.next()
                com.appfoundry.previewer.model.Style r3 = (com.appfoundry.previewer.model.Style) r3
                java.lang.String r5 = r3.f11140a
                r4.put(r5, r3)
                goto L_0x0084
            L_0x0096:
                com.appfoundry.previewer.BravoApp.f10740p = r4
            L_0x0098:
                if (r7 == 0) goto L_0x00a0
                com.appfoundry.previewer.model.App r7 = r7.f11021d
                if (r7 == 0) goto L_0x00a0
                java.util.List<com.appfoundry.previewer.model.Asset> r8 = r7.f10888b
            L_0x00a0:
                if (r8 == 0) goto L_0x00cf
                int r7 = p005b.p291q.p292a.C5266a.m9892V(r8, r2)
                int r7 = p005b.p291q.p292a.C5266a.m9957g3(r7)
                if (r7 >= r1) goto L_0x00ad
                goto L_0x00ae
            L_0x00ad:
                r1 = r7
            L_0x00ae:
                java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
                r7.<init>(r1)
                java.util.Iterator r8 = r8.iterator()
            L_0x00b7:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L_0x00c9
                java.lang.Object r0 = r8.next()
                com.appfoundry.previewer.model.Asset r0 = (com.appfoundry.previewer.model.Asset) r0
                java.lang.String r1 = r0.f10895a
                r7.put(r1, r0)
                goto L_0x00b7
            L_0x00c9:
                java.util.Map r7 = p298d.p334t.C6790h.m12345c0(r7)
                com.appfoundry.previewer.BravoApp.f10741q = r7
            L_0x00cf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.BravoApp.C5403b.mo18366f(com.appfoundry.previewer.model.JsonApp, java.lang.String):void");
        }

        /* renamed from: g */
        public final void mo18367g() {
            Handler handler;
            MediaPlayer mediaPlayer;
            C0777h hVar = BravoApp.f10720D;
            if (hVar != null && !hVar.f546e) {
                MediaPlayer mediaPlayer2 = hVar.f544c;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.pause();
                }
                C0777h hVar2 = BravoApp.f10720D;
                if (!(hVar2 == null || (mediaPlayer = hVar2.f544c) == null)) {
                    mediaPlayer.seekTo(0);
                }
                C0777h hVar3 = BravoApp.f10720D;
                if (hVar3 != null && (handler = hVar3.f545d) != null) {
                    handler.removeCallbacksAndMessages((Object) null);
                }
            }
        }
    }

    /* renamed from: com.appfoundry.previewer.BravoApp$c */
    public static final class C5404c extends C8091a.C8093b {
        /* renamed from: c */
        public void mo18368c(int i, String str, String str2, Throwable th) {
            C6888i.m12438e(str2, "message");
            if (i == 5) {
                C0688a aVar = C0688a.f391b;
                C6888i.m12438e(str2, "message");
                C0688a.m187e("Warn", str, str2);
            } else if (i == 6) {
                C0688a aVar2 = C0688a.f391b;
                C6888i.m12438e(str2, "message");
                C0688a.m187e("Error", str, str2);
            }
            C4043w wVar = C3980e.m7350a().f7288a;
            Objects.requireNonNull(wVar);
            C4032q qVar = wVar.f7427f;
            qVar.f7392e.mo15518b(new C4035r(qVar, System.currentTimeMillis() - wVar.f7424c, str2));
        }
    }

    @C6840e(mo24177c = "com.appfoundry.previewer.BravoApp$onCreate$1", mo24178f = "BravoApp.kt", mo24179l = {267}, mo24180m = "invokeSuspend")
    /* renamed from: com.appfoundry.previewer.BravoApp$d */
    public static final class C5405d extends C6844h implements C6866p<C7821y, C6824d<? super C6777r>, Object> {

        /* renamed from: k */
        public int f10751k;

        /* renamed from: l */
        public final /* synthetic */ BravoApp f10752l;

        @C6840e(mo24177c = "com.appfoundry.previewer.BravoApp$onCreate$1$1", mo24178f = "BravoApp.kt", mo24179l = {}, mo24180m = "invokeSuspend")
        /* renamed from: com.appfoundry.previewer.BravoApp$d$a */
        public static final class C5406a extends C6844h implements C6866p<C7821y, C6824d<? super C6777r>, Object> {

            /* renamed from: k */
            public final /* synthetic */ C5405d f10753k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5406a(C5405d dVar, C6824d dVar2) {
                super(2, dVar2);
                this.f10753k = dVar;
            }

            /* renamed from: b */
            public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
                C6888i.m12438e(dVar, "completion");
                return new C5406a(this.f10753k, dVar);
            }

            /* renamed from: e */
            public final Object mo10326e(Object obj) {
                C5266a.m10018q4(obj);
                BravoApp bravoApp = this.f10753k.f10752l;
                BravoApp bravoApp2 = BravoApp.f10731g;
                Objects.requireNonNull(bravoApp);
                BravoApp.f10750z = true;
                return C6777r.f13694a;
            }

            public final Object invoke(Object obj, Object obj2) {
                C6824d dVar = (C6824d) obj2;
                C6888i.m12438e(dVar, "completion");
                C5405d dVar2 = this.f10753k;
                dVar.getContext();
                C6777r rVar = C6777r.f13694a;
                C5266a.m10018q4(rVar);
                BravoApp bravoApp = dVar2.f10752l;
                BravoApp bravoApp2 = BravoApp.f10731g;
                Objects.requireNonNull(bravoApp);
                BravoApp.f10750z = true;
                return rVar;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5405d(BravoApp bravoApp, C6824d dVar) {
            super(2, dVar);
            this.f10752l = bravoApp;
        }

        /* renamed from: b */
        public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
            C6888i.m12438e(dVar, "completion");
            return new C5405d(this.f10752l, dVar);
        }

        /* renamed from: e */
        public final Object mo10326e(Object obj) {
            C6833a aVar = C6833a.COROUTINE_SUSPENDED;
            int i = this.f10751k;
            if (i == 0) {
                C5266a.m10018q4(obj);
                C7815w wVar = C7725h0.f15274b;
                C5406a aVar2 = new C5406a(this, (C6824d) null);
                this.f10751k = 1;
                if (C5266a.m9853N4(wVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C5266a.m10018q4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6777r.f13694a;
        }

        public final Object invoke(Object obj, Object obj2) {
            C6824d dVar = (C6824d) obj2;
            C6888i.m12438e(dVar, "completion");
            return new C5405d(this.f10752l, dVar).mo10326e(C6777r.f13694a);
        }
    }

    public BravoApp() {
        f10731g = this;
        C7831c0.C7832a aVar = new C7831c0.C7832a();
        C5402a aVar2 = new C5402a();
        C6888i.m12438e(aVar2, "interceptor");
        aVar.f15483d.add(aVar2);
        C8004a aVar3 = new C8004a((C8004a.C8006b) null, 1);
        C8004a.C8005a aVar4 = C8004a.C8005a.BODY;
        C6888i.m12438e(aVar4, "level");
        aVar3.f16057b = aVar4;
        C6888i.m12438e(aVar3, "interceptor");
        aVar.f15482c.add(aVar3);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C6888i.m12438e(timeUnit, "unit");
        aVar.f15500u = C7867c.m14281b("timeout", 60, timeUnit);
        C6888i.m12438e(timeUnit, "unit");
        aVar.f15501v = C7867c.m14281b("timeout", 60, timeUnit);
        C6888i.m12438e(timeUnit, "unit");
        aVar.f15502w = C7867c.m14281b("timeout", 60, timeUnit);
        f10736l = new C7831c0(aVar);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C6888i.m12438e(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C8091a.f16272d.mo26043a("onActivityCreated - %s", activity.getLocalClassName());
    }

    public void onActivityDestroyed(Activity activity) {
        C6888i.m12438e(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C8091a.f16272d.mo26043a("onActivityDestroyed - %s", activity.getLocalClassName());
    }

    public void onActivityPaused(Activity activity) {
        C6888i.m12438e(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C8091a.f16272d.mo26043a("onActivityPaused - %s", activity.getLocalClassName());
    }

    public void onActivityResumed(Activity activity) {
        C6888i.m12438e(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C8091a.f16272d.mo26043a("onActivityResumed - %s", activity.getLocalClassName());
        f10734j = activity;
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C6888i.m12438e(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C6888i.m12438e(bundle, "outState");
        C8091a.f16272d.mo26043a("onActivitySaveInstanceState - %s", activity.getLocalClassName());
    }

    public void onActivityStarted(Activity activity) {
        C6888i.m12438e(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C8091a.f16272d.mo26043a("onActivityStarted - %s", activity.getLocalClassName());
    }

    public void onActivityStopped(Activity activity) {
        C6888i.m12438e(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C8091a.f16272d.mo26043a("onActivityStopped - %s", activity.getLocalClassName());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01c5, code lost:
        if (p298d.p415c0.C7694h.m13910A(r5, "generic", false, 2) == false) goto L_0x01c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r14 = this;
            super.onCreate()
            r14.registerActivityLifecycleCallbacks(r14)
            boolean r0 = p005b.p273o.C4857i2.f9344N
            r0 = 1
            p005b.p273o.C4857i2.f9344N = r0
            b.o.i2$g r1 = new b.o.i2$g
            r2 = 0
            r1.<init>(r14, r2)
            b.o.i2$n r3 = p005b.p273o.C4857i2.C4871n.Notification
            r1.f9395e = r3
            b.a.a.k.b r3 = new b.a.a.k.b
            r3.<init>()
            r1.f9393c = r3
            b.a.a.k.a r3 = new b.a.a.k.a
            r3.<init>()
            r1.f9392b = r3
            r1.f9394d = r0
            b.o.i2$g r3 = p005b.p273o.C4857i2.f9338H
            java.util.Objects.requireNonNull(r3)
            p005b.p273o.C4857i2.f9338H = r1
            android.content.Context r3 = r1.f9391a
            r1.f9391a = r2
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ all -> 0x0063 }
            java.lang.String r4 = r3.getPackageName()     // Catch:{ all -> 0x0063 }
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r4, r5)     // Catch:{ all -> 0x0063 }
            android.os.Bundle r1 = r1.metaData     // Catch:{ all -> 0x0063 }
            java.lang.String r4 = "onesignal_google_project_number"
            java.lang.String r4 = r1.getString(r4)     // Catch:{ all -> 0x0063 }
            if (r4 == 0) goto L_0x0053
            int r5 = r4.length()     // Catch:{ all -> 0x0063 }
            r6 = 4
            if (r5 <= r6) goto L_0x0053
            java.lang.String r4 = r4.substring(r6)     // Catch:{ all -> 0x0063 }
        L_0x0053:
            java.lang.String r5 = "onesignal_app_id"
            java.lang.String r1 = r1.getString(r5)     // Catch:{ all -> 0x0063 }
            b.o.i2$g r5 = p005b.p273o.C4857i2.f9338H     // Catch:{ all -> 0x0063 }
            b.o.i2$l r6 = r5.f9392b     // Catch:{ all -> 0x0063 }
            b.o.i2$m r5 = r5.f9393c     // Catch:{ all -> 0x0063 }
            p005b.p273o.C4857i2.m8953u(r3, r4, r1, r6, r5)     // Catch:{ all -> 0x0063 }
            goto L_0x0067
        L_0x0063:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0067:
            java.lang.String r1 = p005b.p038f.p039a.C0849e.m507b()
            java.lang.String r3 = "appId"
            p005b.p273o.C4857i2.m8926C(r3, r1)
            java.lang.String r1 = "true"
            p005b.p273o.C4857i2.m8926C(r3, r1)
            com.appfoundry.previewer.BravoApp$c r1 = new com.appfoundry.previewer.BravoApp$c
            r1.<init>()
            p.a.a$b[] r3 = p441p.p442a.C8091a.f16269a
            p.a.a$b r3 = p441p.p442a.C8091a.f16272d
            if (r1 == r3) goto L_0x0219
            java.util.List<p.a.a$b> r3 = p441p.p442a.C8091a.f16270b
            monitor-enter(r3)
            r3.add(r1)     // Catch:{ all -> 0x0216 }
            int r1 = r3.size()     // Catch:{ all -> 0x0216 }
            p.a.a$b[] r1 = new p441p.p442a.C8091a.C8093b[r1]     // Catch:{ all -> 0x0216 }
            java.lang.Object[] r1 = r3.toArray(r1)     // Catch:{ all -> 0x0216 }
            p.a.a$b[] r1 = (p441p.p442a.C8091a.C8093b[]) r1     // Catch:{ all -> 0x0216 }
            p441p.p442a.C8091a.f16271c = r1     // Catch:{ all -> 0x0216 }
            monitor-exit(r3)     // Catch:{ all -> 0x0216 }
            g.a.a.e.a r1 = p360g.p361a.p362a.C6964c.f13964b
            g.a.a.e.a r3 = new g.a.a.e.a
            r3.<init>()
            int r4 = r1.f13969g
            r3.f13969g = r4
            boolean r4 = r1.f13970h
            r3.f13970h = r4
            boolean r4 = r1.f13971i
            r3.f13971i = r4
            boolean r4 = r1.f13972j
            r3.f13972j = r4
            boolean r4 = r1.f13973k
            r3.f13973k = r4
            boolean r4 = r1.f13974l
            r3.f13974l = r4
            int r4 = r1.f13975m
            r3.f13975m = r4
            java.lang.Integer r4 = r1.f13976n
            r3.f13976n = r4
            java.lang.Class<? extends android.app.Activity> r4 = r1.f13977o
            r3.f13977o = r4
            java.lang.Class<? extends android.app.Activity> r4 = r1.f13978p
            r3.f13978p = r4
            g.a.a.c$a r1 = r1.f13979q
            r3.f13979q = r1
            r1 = 0
            r3.f13969g = r1
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.f13975m = r4
            java.lang.Class<com.appfoundry.previewer.activities.CrashActivity> r4 = com.appfoundry.previewer.activities.CrashActivity.class
            r3.f13977o = r4
            p360g.p361a.p362a.C6964c.f13964b = r3
            com.segment.analytics.Analytics$Builder r3 = new com.segment.analytics.Analytics$Builder
            com.appfoundry.previewer.BravoApp r4 = f10731g
            p298d.p344x.p346c.C6888i.m12436c(r4)
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.String r5 = "6KP64Xa1OaKKo1525noEQZcNYC2gFxkv"
            r3.<init>(r4, r5)
            com.segment.analytics.integrations.Integration$Factory r4 = com.segment.analytics.android.integrations.amplitude.AmplitudeIntegration.FACTORY
            com.segment.analytics.Analytics$Builder r3 = r3.use(r4)
            com.segment.analytics.Analytics r3 = r3.build()
            com.segment.analytics.Analytics.setSingletonInstance(r3)
            l.a.w r3 = p416l.p417a.C7725h0.f15273a
            l.a.g1 r3 = p416l.p417a.p419u1.C7785l.f15351b
            l.a.o r4 = p005b.p291q.p292a.C5266a.m9959h(r2, r0, r2)
            d.v.f r3 = r3.plus(r4)
            l.a.y r4 = p005b.p291q.p292a.C5266a.m9953g(r3)
            r5 = 0
            r6 = 0
            com.appfoundry.previewer.BravoApp$d r7 = new com.appfoundry.previewer.BravoApp$d
            r7.<init>(r14, r2)
            r8 = 3
            r9 = 0
            p005b.p291q.p292a.C5266a.m9880S2(r4, r5, r6, r7, r8, r9)
            b.a.a.f.a r2 = p005b.p006a.p007a.p015f.C0688a.f391b
            b.a.a.n.f r2 = p005b.p006a.p007a.p023n.C0817f.f641b
            java.lang.String r2 = "device_registered"
            boolean r3 = p005b.p006a.p007a.p023n.C0817f.m295c(r2)
            if (r3 != 0) goto L_0x0215
            android.content.Context r3 = p005b.p038f.p039a.C0849e.m505a()
            com.segment.analytics.Analytics r3 = com.segment.analytics.Analytics.with(r3)
            java.lang.String r4 = p005b.p038f.p039a.C0849e.m507b()
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "java.util.UUID.randomUUID().toString()"
            p298d.p344x.p346c.C6888i.m12437d(r5, r6)
            com.segment.analytics.Properties r4 = p005b.p006a.p007a.p015f.C0688a.m184b(r4, r5)
            java.lang.String r5 = android.os.Build.VERSION.RELEASE
            java.lang.String r6 = "os"
            com.segment.analytics.Properties r4 = r4.putValue((java.lang.String) r6, (java.lang.Object) r5)
            int r5 = android.os.Build.VERSION.SDK_INT
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "version"
            com.segment.analytics.Properties r4 = r4.putValue((java.lang.String) r6, (java.lang.Object) r5)
            java.lang.String r5 = android.os.Build.BRAND
            java.lang.String r6 = "brand"
            com.segment.analytics.Properties r4 = r4.putValue((java.lang.String) r6, (java.lang.Object) r5)
            java.lang.String r6 = android.os.Build.MODEL
            java.lang.String r7 = "Build.MODEL"
            p298d.p344x.p346c.C6888i.m12437d(r6, r7)
            java.lang.String r8 = "model"
            com.segment.analytics.Properties r4 = r4.putValue((java.lang.String) r8, (java.lang.Object) r6)
            java.lang.String r8 = android.os.Build.PRODUCT
            java.lang.String r9 = "model_identifier"
            com.segment.analytics.Properties r4 = r4.putValue((java.lang.String) r9, (java.lang.Object) r8)
            java.lang.String r9 = android.os.Build.FINGERPRINT
            java.lang.String r10 = "Build.FINGERPRINT"
            p298d.p344x.p346c.C6888i.m12437d(r9, r10)
            java.lang.String r11 = "generic"
            r12 = 2
            boolean r13 = p298d.p415c0.C7694h.m13910A(r9, r11, r1, r12)
            if (r13 != 0) goto L_0x01cf
            p298d.p344x.p346c.C6888i.m12437d(r9, r10)
            java.lang.String r10 = "unknown"
            boolean r9 = p298d.p415c0.C7694h.m13910A(r9, r10, r1, r12)
            if (r9 != 0) goto L_0x01cf
            p298d.p344x.p346c.C6888i.m12437d(r6, r7)
            java.lang.String r9 = "google_sdk"
            boolean r10 = p298d.p415c0.C7694h.m13926d(r6, r9, r1, r12)
            if (r10 != 0) goto L_0x01cf
            p298d.p344x.p346c.C6888i.m12437d(r6, r7)
            java.lang.String r10 = "Emulator"
            boolean r10 = p298d.p415c0.C7694h.m13926d(r6, r10, r1, r12)
            if (r10 != 0) goto L_0x01cf
            p298d.p344x.p346c.C6888i.m12437d(r6, r7)
            java.lang.String r10 = "Android SDK built for x86"
            boolean r10 = p298d.p415c0.C7694h.m13926d(r6, r10, r1, r12)
            if (r10 != 0) goto L_0x01cf
            p298d.p344x.p346c.C6888i.m12437d(r6, r7)
            java.lang.String r7 = "Genymotion"
            boolean r6 = p298d.p415c0.C7694h.m13926d(r6, r7, r1, r12)
            if (r6 != 0) goto L_0x01cf
            java.lang.String r6 = "Build.BRAND"
            p298d.p344x.p346c.C6888i.m12437d(r5, r6)
            boolean r5 = p298d.p415c0.C7694h.m13910A(r5, r11, r1, r12)
            if (r5 == 0) goto L_0x01c7
            java.lang.String r5 = android.os.Build.DEVICE
            java.lang.String r6 = "Build.DEVICE"
            p298d.p344x.p346c.C6888i.m12437d(r5, r6)
            boolean r5 = p298d.p415c0.C7694h.m13910A(r5, r11, r1, r12)
            if (r5 != 0) goto L_0x01cf
        L_0x01c7:
            boolean r5 = p298d.p344x.p346c.C6888i.m12434a(r9, r8)
            if (r5 == 0) goto L_0x01ce
            goto L_0x01cf
        L_0x01ce:
            r0 = r1
        L_0x01cf:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "is_simulator"
            com.segment.analytics.Properties r0 = r4.putValue((java.lang.String) r1, (java.lang.Object) r0)
            java.lang.String r1 = "run_mode"
            java.lang.String r4 = "Release"
            com.segment.analytics.Properties r0 = r0.putValue((java.lang.String) r1, (java.lang.Object) r4)
            java.lang.String r1 = "bundle_id"
            java.lang.String r4 = "app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R"
            com.segment.analytics.Properties r0 = r0.putValue((java.lang.String) r1, (java.lang.Object) r4)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r4 = "Locale.getDefault()"
            p298d.p344x.p346c.C6888i.m12437d(r1, r4)
            java.lang.String r1 = r1.getDisplayLanguage()
            java.lang.String r5 = "lang"
            com.segment.analytics.Properties r0 = r0.putValue((java.lang.String) r5, (java.lang.Object) r1)
            java.util.Locale r1 = java.util.Locale.getDefault()
            p298d.p344x.p346c.C6888i.m12437d(r1, r4)
            java.lang.String r1 = r1.getDisplayCountry()
            java.lang.String r4 = "country"
            com.segment.analytics.Properties r0 = r0.putValue((java.lang.String) r4, (java.lang.Object) r1)
            java.lang.String r1 = "App Installed"
            r3.track(r1, r0)
            p005b.p006a.p007a.p023n.C0817f.m297e(r2)
        L_0x0215:
            return
        L_0x0216:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0216 }
            throw r0
        L_0x0219:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot plant Timber into itself."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.BravoApp.onCreate():void");
    }
}
