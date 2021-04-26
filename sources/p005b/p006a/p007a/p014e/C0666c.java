package p005b.p006a.p007a.p014e;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.appfoundry.previewer.activities.BravoActivity;
import com.appfoundry.previewer.model.JsonApp;
import p005b.p006a.p007a.p018i.C0742c;
import p005b.p006a.p007a.p024o.C0820c;
import p005b.p038f.p039a.C0849e;
import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p337v.C6824d;
import p298d.p337v.p338i.C6833a;
import p298d.p337v.p339j.p340a.C6840e;
import p298d.p337v.p339j.p340a.C6844h;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p416l.p417a.C7725h0;
import p416l.p417a.C7815w;
import p416l.p417a.C7821y;

@C6840e(mo24177c = "com.appfoundry.previewer.activities.BravoActivity$checkIfNewJsonAvailable$1", mo24178f = "BravoActivity.kt", mo24179l = {1276}, mo24180m = "invokeSuspend")
/* renamed from: b.a.a.e.c */
public final class C0666c extends C6844h implements C6866p<C7821y, C6824d<? super C6777r>, Object> {

    /* renamed from: k */
    public int f357k;

    /* renamed from: l */
    public final /* synthetic */ BravoActivity f358l;

    @C6840e(mo24177c = "com.appfoundry.previewer.activities.BravoActivity$checkIfNewJsonAvailable$1$1", mo24178f = "BravoActivity.kt", mo24179l = {1280}, mo24180m = "invokeSuspend")
    /* renamed from: b.a.a.e.c$a */
    public static final class C0667a extends C6844h implements C6866p<C7821y, C6824d<? super C6777r>, Object> {

        /* renamed from: k */
        public /* synthetic */ Object f359k;

        /* renamed from: l */
        public int f360l;

        /* renamed from: m */
        public final /* synthetic */ C0666c f361m;

        /* renamed from: b.a.a.e.c$a$a */
        public static final class C0668a implements Runnable {

            /* renamed from: g */
            public final /* synthetic */ C0667a f362g;

            /* renamed from: h */
            public final /* synthetic */ JsonApp f363h;

            public C0668a(C0667a aVar, JsonApp jsonApp) {
                this.f362g = aVar;
                this.f363h = jsonApp;
            }

            public final void run() {
                BravoActivity bravoActivity = this.f362g.f361m.f358l;
                String str = this.f363h.f11023f;
                C6888i.m12438e(bravoActivity, "$this$showStopperAlert");
                AlertDialog.Builder builder = new AlertDialog.Builder(bravoActivity);
                builder.setTitle(bravoActivity.getTitle());
                builder.setCancelable(false);
                if (str == null) {
                    str = "An error occurred, please contact support";
                }
                builder.setMessage((CharSequence) str);
                builder.setPositiveButton((CharSequence) "Close", (DialogInterface.OnClickListener) new C0742c(bravoActivity));
                AlertDialog create = builder.create();
                C6888i.m12437d(create, "builder.create()");
                create.requestWindowFeature(0);
                create.show();
            }
        }

        @C6840e(mo24177c = "com.appfoundry.previewer.activities.BravoActivity$checkIfNewJsonAvailable$1$1$jsonTask$1", mo24178f = "BravoActivity.kt", mo24179l = {}, mo24180m = "invokeSuspend")
        /* renamed from: b.a.a.e.c$a$b */
        public static final class C0669b extends C6844h implements C6866p<C7821y, C6824d<? super JsonApp>, Object> {
            public C0669b(C6824d dVar) {
                super(2, dVar);
            }

            /* renamed from: b */
            public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
                C6888i.m12438e(dVar, "completion");
                return new C0669b(dVar);
            }

            /* renamed from: e */
            public final Object mo10326e(Object obj) {
                C5266a.m10018q4(obj);
                return C0820c.m320t("https://apps-service.bravostudio.app/devices/apps/" + C0849e.m507b());
            }

            public final Object invoke(Object obj, Object obj2) {
                C6824d dVar = (C6824d) obj2;
                C6888i.m12438e(dVar, "completion");
                dVar.getContext();
                C5266a.m10018q4(C6777r.f13694a);
                return C0820c.m320t("https://apps-service.bravostudio.app/devices/apps/" + C0849e.m507b());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0667a(C0666c cVar, C6824d dVar) {
            super(2, dVar);
            this.f361m = cVar;
        }

        /* renamed from: b */
        public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
            C6888i.m12438e(dVar, "completion");
            C0667a aVar = new C0667a(this.f361m, dVar);
            aVar.f359k = obj;
            return aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
            r0 = r11.f11022e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
            if ((!p298d.p344x.p346c.C6888i.m12434a(r0, r2)) != false) goto L_0x0086;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo10326e(java.lang.Object r11) {
            /*
                r10 = this;
                d.v.i.a r0 = p298d.p337v.p338i.C6833a.COROUTINE_SUSPENDED
                int r1 = r10.f360l
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0016
                if (r1 != r3) goto L_0x000e
                p005b.p291q.p292a.C5266a.m10018q4(r11)
                goto L_0x0037
            L_0x000e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0016:
                p005b.p291q.p292a.C5266a.m10018q4(r11)
                java.lang.Object r11 = r10.f359k
                r4 = r11
                l.a.y r4 = (p416l.p417a.C7821y) r4
                l.a.w r5 = p416l.p417a.C7725h0.f15274b
                r6 = 0
                b.a.a.e.c$a$b r7 = new b.a.a.e.c$a$b
                r7.<init>(r2)
                r8 = 2
                r9 = 0
                l.a.c0 r11 = p005b.p291q.p292a.C5266a.m9800F(r4, r5, r6, r7, r8, r9)
                r10.f360l = r3
                l.a.e0 r11 = (p416l.p417a.C7716e0) r11
                java.lang.Object r11 = p416l.p417a.C7716e0.m14025U(r11, r10)
                if (r11 != r0) goto L_0x0037
                return r0
            L_0x0037:
                com.appfoundry.previewer.model.JsonApp r11 = (com.appfoundry.previewer.model.JsonApp) r11
                if (r11 == 0) goto L_0x00ae
                java.lang.String r0 = "$this$isDeletedAppOrPolicyViolation"
                p298d.p344x.p346c.C6888i.m12438e(r11, r0)
                java.lang.Integer r0 = r11.f11022e
                r1 = 0
                if (r0 == 0) goto L_0x005c
                r4 = 404(0x194, float:5.66E-43)
                int r0 = r0.intValue()
                if (r0 == r4) goto L_0x005a
                java.lang.Integer r0 = r11.f11022e
                r4 = 451(0x1c3, float:6.32E-43)
                if (r0 != 0) goto L_0x0054
                goto L_0x005c
            L_0x0054:
                int r0 = r0.intValue()
                if (r0 != r4) goto L_0x005c
            L_0x005a:
                r0 = r3
                goto L_0x005d
            L_0x005c:
                r0 = r1
            L_0x005d:
                if (r0 == 0) goto L_0x006c
                b.a.a.e.c r0 = r10.f361m
                com.appfoundry.previewer.activities.BravoActivity r0 = r0.f358l
                b.a.a.e.c$a$a r1 = new b.a.a.e.c$a$a
                r1.<init>(r10, r11)
                r0.runOnUiThread(r1)
                goto L_0x00ae
            L_0x006c:
                java.lang.String r0 = "$this$isNewVersion"
                p298d.p344x.p346c.C6888i.m12438e(r11, r0)
                java.lang.String r0 = r11.f11020c
                if (r0 == 0) goto L_0x0085
                com.appfoundry.previewer.BravoApp$b r4 = com.appfoundry.previewer.BravoApp.f10730N
                com.appfoundry.previewer.model.JsonApp r4 = com.appfoundry.previewer.BravoApp.f10738n
                if (r4 == 0) goto L_0x007d
                java.lang.String r2 = r4.f11020c
            L_0x007d:
                boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r2)
                r0 = r0 ^ r3
                if (r0 == 0) goto L_0x0085
                goto L_0x0086
            L_0x0085:
                r3 = r1
            L_0x0086:
                if (r3 == 0) goto L_0x00ae
                java.lang.Object[] r0 = new java.lang.Object[r1]
                p.a.a$b r1 = p441p.p442a.C8091a.f16272d
                java.lang.String r2 = "JSON IS NEWER"
                r1.mo26043a(r2, r0)
                boolean r0 = p005b.p006a.p007a.p024o.C0820c.m302b()
                if (r0 == 0) goto L_0x009e
                com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.f10730N
                com.appfoundry.previewer.BravoApp.f10738n = r11
                com.appfoundry.previewer.BravoApp.f10737m = r11
                goto L_0x00a2
            L_0x009e:
                com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.f10730N
                com.appfoundry.previewer.BravoApp.f10738n = r11
            L_0x00a2:
                o.a.a.c r11 = p437o.p438a.p439a.C8068c.m14948b()
                b.a.a.h.w r0 = new b.a.a.h.w
                r0.<init>()
                r11.mo26008g(r0)
            L_0x00ae:
                d.r r11 = p298d.C6777r.f13694a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p014e.C0666c.C0667a.mo10326e(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(Object obj, Object obj2) {
            C6824d dVar = (C6824d) obj2;
            C6888i.m12438e(dVar, "completion");
            C0667a aVar = new C0667a(this.f361m, dVar);
            aVar.f359k = obj;
            return aVar.mo10326e(C6777r.f13694a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0666c(BravoActivity bravoActivity, C6824d dVar) {
        super(2, dVar);
        this.f358l = bravoActivity;
    }

    /* renamed from: b */
    public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
        C6888i.m12438e(dVar, "completion");
        return new C0666c(this.f358l, dVar);
    }

    /* renamed from: e */
    public final Object mo10326e(Object obj) {
        C6833a aVar = C6833a.COROUTINE_SUSPENDED;
        int i = this.f357k;
        if (i == 0) {
            C5266a.m10018q4(obj);
            C7815w wVar = C7725h0.f15274b;
            C0667a aVar2 = new C0667a(this, (C6824d) null);
            this.f357k = 1;
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
        return new C0666c(this.f358l, dVar).mo10326e(C6777r.f13694a);
    }
}
