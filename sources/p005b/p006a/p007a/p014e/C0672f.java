package p005b.p006a.p007a.p014e;

import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.activities.BravoActivity;
import com.appfoundry.previewer.model.BravoIdTokenResponseFromBackend;
import java.net.UnknownHostException;
import p005b.p006a.p007a.p018i.C0756o;
import p005b.p006a.p007a.p023n.C0816e;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p038f.p039a.C0849e;
import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p337v.C6824d;
import p298d.p337v.p339j.p340a.C6840e;
import p298d.p337v.p339j.p340a.C6844h;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6901v;
import p416l.p417a.C7821y;
import p421m.C7829b0;
import p421m.C7831c0;
import p421m.C7839e0;
import p421m.C7844g0;
import p421m.C7850h0;
import p421m.C7855j0;
import p421m.p422m0.p426g.C7887e;
import p441p.p442a.C8091a;

@C6840e(mo24177c = "com.appfoundry.previewer.activities.BravoActivity$getBravoIdTokenFromBackend$1", mo24178f = "BravoActivity.kt", mo24179l = {1634, 1639}, mo24180m = "invokeSuspend")
/* renamed from: b.a.a.e.f */
public final class C0672f extends C6844h implements C6866p<C7821y, C6824d<? super C6777r>, Object> {

    /* renamed from: k */
    public Object f366k;

    /* renamed from: l */
    public Object f367l;

    /* renamed from: m */
    public int f368m;

    /* renamed from: n */
    public final /* synthetic */ BravoActivity f369n;

    /* renamed from: o */
    public final /* synthetic */ String f370o;

    @C6840e(mo24177c = "com.appfoundry.previewer.activities.BravoActivity$getBravoIdTokenFromBackend$1$bravoIdTokenResponse$1", mo24178f = "BravoActivity.kt", mo24179l = {}, mo24180m = "invokeSuspend")
    /* renamed from: b.a.a.e.f$a */
    public static final class C0673a extends C6844h implements C6866p<C7821y, C6824d<? super BravoIdTokenResponseFromBackend>, Object> {

        /* renamed from: k */
        public final /* synthetic */ C6901v f371k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0673a(C6901v vVar, C6824d dVar) {
            super(2, dVar);
            this.f371k = vVar;
        }

        /* renamed from: b */
        public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
            C6888i.m12438e(dVar, "completion");
            return new C0673a(this.f371k, dVar);
        }

        /* renamed from: e */
        public final Object mo10326e(Object obj) {
            C5266a.m10018q4(obj);
            try {
                C0816e eVar = C0816e.f639l;
                return C0816e.f633f.mo16830b((String) this.f371k.f13801g);
            } catch (Exception e) {
                C8091a.f16272d.mo26044b("Exception parsing bravo id token with backend: %s", e.toString());
                return null;
            }
        }

        public final Object invoke(Object obj, Object obj2) {
            C6824d dVar = (C6824d) obj2;
            C6888i.m12438e(dVar, "completion");
            C6901v vVar = this.f371k;
            dVar.getContext();
            C5266a.m10018q4(C6777r.f13694a);
            try {
                C0816e eVar = C0816e.f639l;
                return C0816e.f633f.mo16830b((String) vVar.f13801g);
            } catch (Exception e) {
                C8091a.f16272d.mo26044b("Exception parsing bravo id token with backend: %s", e.toString());
                return null;
            }
        }
    }

    @C6840e(mo24177c = "com.appfoundry.previewer.activities.BravoActivity$getBravoIdTokenFromBackend$1$responseJsonAsString$1", mo24178f = "BravoActivity.kt", mo24179l = {}, mo24180m = "invokeSuspend")
    /* renamed from: b.a.a.e.f$b */
    public static final class C0674b extends C6844h implements C6866p<C7821y, C6824d<? super String>, Object> {

        /* renamed from: k */
        public final /* synthetic */ C0672f f372k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0674b(C0672f fVar, C6824d dVar) {
            super(2, dVar);
            this.f372k = fVar;
        }

        /* renamed from: b */
        public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
            C6888i.m12438e(dVar, "completion");
            return new C0674b(this.f372k, dVar);
        }

        /* renamed from: e */
        public final Object mo10326e(Object obj) {
            C5266a.m10018q4(obj);
            String str = this.f372k.f370o;
            StringBuilder sb = new StringBuilder();
            BravoApp.C5403b bVar = BravoApp.f10730N;
            String str2 = BravoApp.f10748x;
            sb.append(str2 != null ? C0756o.m225c(str2) : null);
            sb.append(C0823f.m332B());
            sb.append("/");
            sb.append("idtoken");
            String sb2 = sb.toString();
            C8091a.C8093b bVar2 = C8091a.f16272d;
            bVar2.mo26043a("URL for bravo token: %s", sb2);
            C7844g0 c = C7844g0.C7845a.m14248c(C7844g0.f15540a, new byte[0], (C7829b0) null, 0, 0, 7);
            try {
                C7831c0 c2 = bVar.mo18363c();
                C7839e0.C7840a aVar = new C7839e0.C7840a();
                if (str == null) {
                    str = "";
                }
                aVar.mo25536b("X-App-Authorization", str);
                aVar.mo25540f(sb2);
                aVar.mo25538d(c);
                C7850h0 h = ((C7887e) c2.mo25525a(aVar.mo25535a())).mo25623h();
                int i = h.f15552j;
                if (i != 200) {
                    if (i != 201) {
                        bVar2.mo26044b("getBravoIDTokenResponse FAILED: %s", String.valueOf(h.f15552j) + ": " + C0849e.m474D(h));
                        return null;
                    }
                }
                C7855j0 j0Var = h.f15555m;
                if (j0Var != null) {
                    return j0Var.mo25572z();
                }
                return null;
            } catch (UnknownHostException e) {
                C8091a.f16272d.mo26044b("getBravoIDTokenResponse noConnectionException: %s", e.getLocalizedMessage());
                return null;
            } catch (Exception e2) {
                C8091a.f16272d.mo26044b("getBravoIDTokenResponse exception: %s", e2.getLocalizedMessage());
                return null;
            }
        }

        public final Object invoke(Object obj, Object obj2) {
            C6824d dVar = (C6824d) obj2;
            C6888i.m12438e(dVar, "completion");
            return new C0674b(this.f372k, dVar).mo10326e(C6777r.f13694a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0672f(BravoActivity bravoActivity, String str, C6824d dVar) {
        super(2, dVar);
        this.f369n = bravoActivity;
        this.f370o = str;
    }

    /* renamed from: b */
    public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
        C6888i.m12438e(dVar, "completion");
        return new C0672f(this.f369n, this.f370o, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo10326e(T r7) {
        /*
            r6 = this;
            d.v.i.a r0 = p298d.p337v.p338i.C6833a.COROUTINE_SUSPENDED
            int r1 = r6.f368m
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0025
            if (r1 == r3) goto L_0x0019
            if (r1 != r2) goto L_0x0011
            p005b.p291q.p292a.C5266a.m10018q4(r7)
            goto L_0x0060
        L_0x0011:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0019:
            java.lang.Object r1 = r6.f367l
            d.x.c.v r1 = (p298d.p344x.p346c.C6901v) r1
            java.lang.Object r3 = r6.f366k
            d.x.c.v r3 = (p298d.p344x.p346c.C6901v) r3
            p005b.p291q.p292a.C5266a.m10018q4(r7)
            goto L_0x0042
        L_0x0025:
            p005b.p291q.p292a.C5266a.m10018q4(r7)
            d.x.c.v r1 = new d.x.c.v
            r1.<init>()
            l.a.w r7 = p416l.p417a.C7725h0.f15274b
            b.a.a.e.f$b r5 = new b.a.a.e.f$b
            r5.<init>(r6, r4)
            r6.f366k = r1
            r6.f367l = r1
            r6.f368m = r3
            java.lang.Object r7 = p005b.p291q.p292a.C5266a.m9853N4(r7, r5, r6)
            if (r7 != r0) goto L_0x0041
            return r0
        L_0x0041:
            r3 = r1
        L_0x0042:
            java.lang.String r7 = (java.lang.String) r7
            r1.f13801g = r7
            T r7 = r3.f13801g
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0095
            l.a.w r7 = p416l.p417a.C7725h0.f15274b
            b.a.a.e.f$a r1 = new b.a.a.e.f$a
            r1.<init>(r3, r4)
            r6.f366k = r4
            r6.f367l = r4
            r6.f368m = r2
            java.lang.Object r7 = p005b.p291q.p292a.C5266a.m9853N4(r7, r1, r6)
            if (r7 != r0) goto L_0x0060
            return r0
        L_0x0060:
            com.appfoundry.previewer.model.BravoIdTokenResponseFromBackend r7 = (com.appfoundry.previewer.model.BravoIdTokenResponseFromBackend) r7
            if (r7 == 0) goto L_0x0066
            java.lang.String r4 = r7.f10936d
        L_0x0066:
            if (r4 == 0) goto L_0x009f
            b.a.a.n.f r0 = p005b.p006a.p007a.p023n.C0817f.f641b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = p005b.p038f.p039a.C0849e.m505a()
            java.lang.String r2 = "appContext()"
            p298d.p344x.p346c.C6888i.m12437d(r1, r2)
            java.lang.String r1 = r1.getPackageName()
            r0.append(r1)
            java.lang.String r1 = p005b.p006a.p007a.p024o.C0823f.m332B()
            r0.append(r1)
            java.lang.String r1 = "bravo_id_token"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r7 = r7.f10936d
            p005b.p006a.p007a.p023n.C0817f.m298f(r0, r7)
            goto L_0x009f
        L_0x0095:
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            p.a.a$b r0 = p441p.p442a.C8091a.f16272d
            java.lang.String r1 = "getBravoIDTokenResponse returned null. Proceeding with login, but without bravo id token..."
            r0.mo26044b(r1, r7)
        L_0x009f:
            com.appfoundry.previewer.activities.BravoActivity r7 = r6.f369n
            com.appfoundry.previewer.activities.BravoActivity.m10142d(r7)
            d.r r7 = p298d.C6777r.f13694a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p014e.C0672f.mo10326e(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(Object obj, Object obj2) {
        C6824d dVar = (C6824d) obj2;
        C6888i.m12438e(dVar, "completion");
        return new C0672f(this.f369n, this.f370o, dVar).mo10326e(C6777r.f13694a);
    }
}
