package p005b.p006a.p007a.p008a;

import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appfoundry.previewer.model.AuthInfoFromBackend;
import com.appfoundry.previewer.model.ExchangeResponse;
import com.appfoundry.previewer.model.Page;
import p005b.p006a.p007a.p017h.C0727s;
import p005b.p006a.p007a.p018i.C0758q;
import p005b.p006a.p007a.p019j.C0779j;
import p005b.p006a.p007a.p021l.C0794i;
import p005b.p006a.p007a.p023n.C0816e;
import p005b.p006a.p007a.p024o.C0820c;
import p005b.p038f.p039a.C0849e;
import p005b.p096l.p164b.p165a.p166a.p168b.C3663f;
import p005b.p280p.p281a.C5075l;
import p005b.p291q.p292a.C5266a;
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

@C6840e(mo24177c = "com.appfoundry.previewer.fragments.BravoFragment$getAuthSecretsAndRefreshCredentials$1", mo24178f = "BravoFragment.kt", mo24179l = {125, 127}, mo24180m = "invokeSuspend")
/* renamed from: b.a.a.a.a */
public final class C0586a extends C6844h implements C6866p<C7821y, C6824d<? super C6777r>, Object> {

    /* renamed from: k */
    public int f197k;

    /* renamed from: l */
    public final /* synthetic */ C0605h f198l;

    /* renamed from: m */
    public final /* synthetic */ boolean f199m;

    /* renamed from: n */
    public final /* synthetic */ RelativeLayout f200n;

    /* renamed from: b.a.a.a.a$a */
    public static final class C0587a implements C0794i {

        /* renamed from: a */
        public final /* synthetic */ C0586a f201a;

        @C6840e(mo24177c = "com.appfoundry.previewer.fragments.BravoFragment$getAuthSecretsAndRefreshCredentials$1$1$withNewCredential$1", mo24178f = "BravoFragment.kt", mo24179l = {148}, mo24180m = "invokeSuspend")
        /* renamed from: b.a.a.a.a$a$a */
        public static final class C0588a extends C6844h implements C6866p<C7821y, C6824d<? super C6777r>, Object> {

            /* renamed from: k */
            public Object f202k;

            /* renamed from: l */
            public int f203l;

            /* renamed from: m */
            public final /* synthetic */ C0587a f204m;

            /* renamed from: b.a.a.a.a$a$a$a */
            /* compiled from: java-style lambda group */
            public static final class C0589a implements Runnable {

                /* renamed from: g */
                public final /* synthetic */ int f205g;

                /* renamed from: h */
                public final /* synthetic */ Object f206h;

                public C0589a(int i, Object obj) {
                    this.f205g = i;
                    this.f206h = obj;
                }

                public final void run() {
                    int i = this.f205g;
                    if (i == 0) {
                        RelativeLayout relativeLayout = ((C0588a) this.f206h).f204m.f201a.f200n;
                        C6888i.m12437d(relativeLayout, "loading");
                        C0758q.m240e(relativeLayout);
                    } else if (i == 1) {
                        SwipeRefreshLayout swipeRefreshLayout = ((C0588a) this.f206h).f204m.f201a.f198l.f238l;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(false);
                        }
                    } else {
                        throw null;
                    }
                }
            }

            @C6840e(mo24177c = "com.appfoundry.previewer.fragments.BravoFragment$getAuthSecretsAndRefreshCredentials$1$1$withNewCredential$1$1", mo24178f = "BravoFragment.kt", mo24179l = {}, mo24180m = "invokeSuspend")
            /* renamed from: b.a.a.a.a$a$a$b */
            public static final class C0590b extends C6844h implements C6866p<C7821y, C6824d<? super Page>, Object> {

                /* renamed from: k */
                public final /* synthetic */ C0588a f207k;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0590b(C0588a aVar, C6824d dVar) {
                    super(2, dVar);
                    this.f207k = aVar;
                }

                /* renamed from: b */
                public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
                    C6888i.m12438e(dVar, "completion");
                    return new C0590b(this.f207k, dVar);
                }

                /* renamed from: e */
                public final Object mo10326e(Object obj) {
                    C5266a.m10018q4(obj);
                    C0779j k = C0820c.m311k(this.f207k.f204m.f201a.f198l.f210g, false, 2);
                    if (k != null) {
                        return k.f549a;
                    }
                    return null;
                }

                public final Object invoke(Object obj, Object obj2) {
                    C6824d dVar = (C6824d) obj2;
                    C6888i.m12438e(dVar, "completion");
                    C0588a aVar = this.f207k;
                    dVar.getContext();
                    C5266a.m10018q4(C6777r.f13694a);
                    C0779j k = C0820c.m311k(aVar.f204m.f201a.f198l.f210g, false, 2);
                    if (k != null) {
                        return k.f549a;
                    }
                    return null;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0588a(C0587a aVar, C6824d dVar) {
                super(2, dVar);
                this.f204m = aVar;
            }

            /* renamed from: b */
            public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
                C6888i.m12438e(dVar, "completion");
                return new C0588a(this.f204m, dVar);
            }

            /* renamed from: e */
            public final Object mo10326e(Object obj) {
                C0605h hVar;
                FragmentActivity fragmentActivity;
                C0589a aVar;
                C6833a aVar2 = C6833a.COROUTINE_SUSPENDED;
                int i = this.f203l;
                if (i == 0) {
                    C5266a.m10018q4(obj);
                    C0605h hVar2 = this.f204m.f201a.f198l;
                    C7815w wVar = C7725h0.f15274b;
                    C0590b bVar = new C0590b(this, (C6824d) null);
                    this.f202k = hVar2;
                    this.f203l = 1;
                    Object N4 = C5266a.m9853N4(wVar, bVar, this);
                    if (N4 == aVar2) {
                        return aVar2;
                    }
                    hVar = hVar2;
                    obj = N4;
                } else if (i == 1) {
                    hVar = (C0605h) this.f202k;
                    C5266a.m10018q4(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar.f210g = (Page) obj;
                C0586a aVar3 = this.f204m.f201a;
                C0605h hVar3 = aVar3.f198l;
                if (hVar3.f210g == null) {
                    C8068c.m14948b().mo26008g(new C0727s(false, 1));
                } else {
                    if (!aVar3.f199m) {
                        fragmentActivity = hVar3.getActivity();
                        if (fragmentActivity != null) {
                            aVar = new C0589a(0, this);
                        }
                        C0605h hVar4 = this.f204m.f201a.f198l;
                        int i2 = C0605h.f235p;
                        hVar4.mo10334e();
                    } else {
                        fragmentActivity = hVar3.getActivity();
                        if (fragmentActivity != null) {
                            aVar = new C0589a(1, this);
                        }
                        C0605h hVar42 = this.f204m.f201a.f198l;
                        int i22 = C0605h.f235p;
                        hVar42.mo10334e();
                    }
                    fragmentActivity.runOnUiThread(aVar);
                    C0605h hVar422 = this.f204m.f201a.f198l;
                    int i222 = C0605h.f235p;
                    hVar422.mo10334e();
                }
                return C6777r.f13694a;
            }

            public final Object invoke(Object obj, Object obj2) {
                C6824d dVar = (C6824d) obj2;
                C6888i.m12438e(dVar, "completion");
                return new C0588a(this.f204m, dVar).mo10326e(C6777r.f13694a);
            }
        }

        public C0587a(C0586a aVar) {
            this.f201a = aVar;
        }

        /* renamed from: a */
        public void mo10327a(String str) {
            C8091a.f16272d.mo26044b("Error refreshing: %s", str);
        }

        /* renamed from: b */
        public void mo10328b(C3663f fVar) {
            Object[] objArr = new Object[1];
            objArr[0] = fVar != null ? fVar.getAccessToken() : null;
            C8091a.f16272d.mo26043a("AuthHandler: AuthToken: = %s", objArr);
            C0849e.m544t0(fVar);
            C7815w wVar = C7725h0.f15273a;
            C5266a.m9880S2(C5266a.m9953g(C7785l.f15351b.plus(C5266a.m9959h((C7819x0) null, 1, (Object) null))), (C6827f) null, (C7823z) null, new C0588a(this, (C6824d) null), 3, (Object) null);
        }
    }

    @C6840e(mo24177c = "com.appfoundry.previewer.fragments.BravoFragment$getAuthSecretsAndRefreshCredentials$1$authInfo$1", mo24178f = "BravoFragment.kt", mo24179l = {}, mo24180m = "invokeSuspend")
    /* renamed from: b.a.a.a.a$b */
    public static final class C0591b extends C6844h implements C6866p<C7821y, C6824d<? super AuthInfoFromBackend>, Object> {

        /* renamed from: k */
        public final /* synthetic */ ExchangeResponse f208k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0591b(ExchangeResponse exchangeResponse, C6824d dVar) {
            super(2, dVar);
            this.f208k = exchangeResponse;
        }

        /* renamed from: b */
        public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
            C6888i.m12438e(dVar, "completion");
            return new C0591b(this.f208k, dVar);
        }

        /* renamed from: e */
        public final Object mo10326e(Object obj) {
            C5266a.m10018q4(obj);
            try {
                C0816e eVar = C0816e.f639l;
                C5075l<AuthInfoFromBackend> lVar = C0816e.f631d;
                String str = this.f208k.f10994b;
                if (str == null) {
                    str = "";
                }
                return lVar.mo16830b(str);
            } catch (Exception e) {
                C8091a.f16272d.mo26044b("Exception parsing secrets with backend: %s", e.toString());
                return null;
            }
        }

        public final Object invoke(Object obj, Object obj2) {
            C6824d dVar = (C6824d) obj2;
            C6888i.m12438e(dVar, "completion");
            ExchangeResponse exchangeResponse = this.f208k;
            dVar.getContext();
            C5266a.m10018q4(C6777r.f13694a);
            try {
                C0816e eVar = C0816e.f639l;
                C5075l<AuthInfoFromBackend> lVar = C0816e.f631d;
                String str = exchangeResponse.f10994b;
                if (str == null) {
                    str = "";
                }
                return lVar.mo16830b(str);
            } catch (Exception e) {
                C8091a.f16272d.mo26044b("Exception parsing secrets with backend: %s", e.toString());
                return null;
            }
        }
    }

    @C6840e(mo24177c = "com.appfoundry.previewer.fragments.BravoFragment$getAuthSecretsAndRefreshCredentials$1$exchangeResponse$1", mo24178f = "BravoFragment.kt", mo24179l = {}, mo24180m = "invokeSuspend")
    /* renamed from: b.a.a.a.a$c */
    public static final class C0592c extends C6844h implements C6866p<C7821y, C6824d<? super ExchangeResponse>, Object> {
        public C0592c(C6824d dVar) {
            super(2, dVar);
        }

        /* renamed from: b */
        public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
            C6888i.m12438e(dVar, "completion");
            return new C0592c(dVar);
        }

        /* renamed from: e */
        public final Object mo10326e(Object obj) {
            C5266a.m10018q4(obj);
            return C0849e.m478F();
        }

        public final Object invoke(Object obj, Object obj2) {
            C6824d dVar = (C6824d) obj2;
            C6888i.m12438e(dVar, "completion");
            dVar.getContext();
            C5266a.m10018q4(C6777r.f13694a);
            return C0849e.m478F();
        }
    }

    /* renamed from: b.a.a.a.a$d */
    public static final class C0593d implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ C0586a f209g;

        public C0593d(C0586a aVar, ExchangeResponse exchangeResponse) {
            this.f209g = aVar;
        }

        public final void run() {
            RelativeLayout relativeLayout = this.f209g.f200n;
            C6888i.m12437d(relativeLayout, "loading");
            C0758q.m240e(relativeLayout);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0586a(C0605h hVar, boolean z, RelativeLayout relativeLayout, C6824d dVar) {
        super(2, dVar);
        this.f198l = hVar;
        this.f199m = z;
        this.f200n = relativeLayout;
    }

    /* renamed from: b */
    public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
        C6888i.m12438e(dVar, "completion");
        return new C0586a(this.f198l, this.f199m, this.f200n, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo10326e(java.lang.Object r12) {
        /*
            r11 = this;
            d.v.i.a r0 = p298d.p337v.p338i.C6833a.COROUTINE_SUSPENDED
            int r1 = r11.f197k
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x001d
            if (r1 == r3) goto L_0x0019
            if (r1 != r2) goto L_0x0011
            p005b.p291q.p292a.C5266a.m10018q4(r12)
            goto L_0x0048
        L_0x0011:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0019:
            p005b.p291q.p292a.C5266a.m10018q4(r12)
            goto L_0x0030
        L_0x001d:
            p005b.p291q.p292a.C5266a.m10018q4(r12)
            l.a.w r12 = p416l.p417a.C7725h0.f15274b
            b.a.a.a.a$c r1 = new b.a.a.a.a$c
            r1.<init>(r4)
            r11.f197k = r3
            java.lang.Object r12 = p005b.p291q.p292a.C5266a.m9853N4(r12, r1, r11)
            if (r12 != r0) goto L_0x0030
            return r0
        L_0x0030:
            com.appfoundry.previewer.model.ExchangeResponse r12 = (com.appfoundry.previewer.model.ExchangeResponse) r12
            int r1 = r12.f10993a
            r3 = 200(0xc8, float:2.8E-43)
            if (r1 != r3) goto L_0x00a1
            l.a.w r1 = p416l.p417a.C7725h0.f15274b
            b.a.a.a.a$b r3 = new b.a.a.a.a$b
            r3.<init>(r12, r4)
            r11.f197k = r2
            java.lang.Object r12 = p005b.p291q.p292a.C5266a.m9853N4(r1, r3, r11)
            if (r12 != r0) goto L_0x0048
            return r0
        L_0x0048:
            com.appfoundry.previewer.model.AuthInfoFromBackend r12 = (com.appfoundry.previewer.model.AuthInfoFromBackend) r12
            b.a.a.a.h r0 = r11.f198l
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x00be
            b.a.a.a.h r0 = r11.f198l
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L_0x00be
            b.a.a.l.b r0 = new b.a.a.l.b
            b.a.a.a.h r1 = r11.f198l
            android.content.Context r6 = r1.getContext()
            p298d.p344x.p346c.C6888i.m12436c(r6)
            java.lang.String r1 = "context!!"
            p298d.p344x.p346c.C6888i.m12437d(r6, r1)
            b.a.a.a.h r1 = r11.f198l
            androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
            p298d.p344x.p346c.C6888i.m12436c(r1)
            java.lang.String r2 = "activity!!"
            p298d.p344x.p346c.C6888i.m12437d(r1, r2)
            androidx.fragment.app.FragmentManager r7 = r1.getSupportFragmentManager()
            java.lang.String r1 = "activity!!.supportFragmentManager"
            p298d.p344x.p346c.C6888i.m12437d(r7, r1)
            if (r12 == 0) goto L_0x0085
            com.appfoundry.previewer.model.AuthSettings r4 = r12.f10905d
        L_0x0085:
            r8 = r4
            r9 = 0
            r10 = 8
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            com.appfoundry.previewer.BravoApp$b r12 = com.appfoundry.previewer.BravoApp.f10730N
            com.appfoundry.previewer.BravoApp.f10717A = r0
            b.a.a.l.c r12 = new b.a.a.l.c
            r12.<init>(r0)
            android.os.AsyncTask.execute(r12)
            b.a.a.a.a$a r12 = new b.a.a.a.a$a
            r12.<init>(r11)
            r0.f567d = r12
            goto L_0x00be
        L_0x00a1:
            b.a.a.a.h r0 = r11.f198l
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x00be
            b.a.a.a.a$d r1 = new b.a.a.a.a$d
            r1.<init>(r11, r12)
            r0.runOnUiThread(r1)
            boolean r1 = r0 instanceof com.appfoundry.previewer.activities.BravoActivity
            if (r1 == 0) goto L_0x00be
            com.appfoundry.previewer.activities.BravoActivity r0 = (com.appfoundry.previewer.activities.BravoActivity) r0
            java.lang.String r12 = r12.f10994b
            r1 = 0
            r2 = 6
            p005b.p038f.p039a.C0849e.m483H0(r0, r12, r4, r1, r2)
        L_0x00be:
            d.r r12 = p298d.C6777r.f13694a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p008a.C0586a.mo10326e(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(Object obj, Object obj2) {
        C6824d dVar = (C6824d) obj2;
        C6888i.m12438e(dVar, "completion");
        return new C0586a(this.f198l, this.f199m, this.f200n, dVar).mo10326e(C6777r.f13694a);
    }
}
