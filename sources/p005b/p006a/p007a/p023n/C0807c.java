package p005b.p006a.p007a.p023n;

import androidx.core.app.NotificationCompat;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.activities.BravoActivity;
import com.appfoundry.previewer.model.UploadInfoResponse;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import p005b.p006a.p007a.p018i.C0758q;
import p005b.p006a.p007a.p019j.C0774e;
import p005b.p006a.p007a.p019j.C0776g;
import p005b.p006a.p007a.p024o.C0820c;
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
import p421m.C7829b0;
import p421m.C7839e0;
import p421m.C7841f;
import p421m.C7842f0;
import p421m.C7843g;
import p421m.p422m0.p426g.C7887e;
import p441p.p442a.C8091a;

@C6840e(mo24177c = "com.appfoundry.previewer.singletons.Forms$processImageUpload$2$1", mo24178f = "Forms.kt", mo24179l = {148}, mo24180m = "invokeSuspend")
/* renamed from: b.a.a.n.c */
public final class C0807c extends C6844h implements C6866p<C7821y, C6824d<? super C6777r>, Object> {

    /* renamed from: k */
    public int f609k;

    /* renamed from: l */
    public final /* synthetic */ List f610l;

    /* renamed from: m */
    public final /* synthetic */ BravoActivity f611m;

    /* renamed from: n */
    public final /* synthetic */ C0776g f612n;

    @C6840e(mo24177c = "com.appfoundry.previewer.singletons.Forms$processImageUpload$2$1$requestInfo$1", mo24178f = "Forms.kt", mo24179l = {}, mo24180m = "invokeSuspend")
    /* renamed from: b.a.a.n.c$a */
    public static final class C0808a extends C6844h implements C6866p<C7821y, C6824d<? super UploadInfoResponse>, Object> {
        public C0808a(C6824d dVar) {
            super(2, dVar);
        }

        /* renamed from: b */
        public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
            C6888i.m12438e(dVar, "completion");
            return new C0808a(dVar);
        }

        /* renamed from: e */
        public final Object mo10326e(Object obj) {
            C5266a.m10018q4(obj);
            return C0820c.m314n("image/jpeg");
        }

        public final Object invoke(Object obj, Object obj2) {
            C6824d dVar = (C6824d) obj2;
            C6888i.m12438e(dVar, "completion");
            dVar.getContext();
            C5266a.m10018q4(C6777r.f13694a);
            return C0820c.m314n("image/jpeg");
        }
    }

    /* renamed from: b.a.a.n.c$b */
    public static final class C0809b implements C7843g {

        /* renamed from: a */
        public final /* synthetic */ C0807c f613a;

        /* renamed from: b */
        public final /* synthetic */ UploadInfoResponse f614b;

        /* renamed from: b.a.a.n.c$b$a */
        public static final class C0810a implements Runnable {

            /* renamed from: g */
            public final /* synthetic */ C0809b f615g;

            public C0810a(C0809b bVar) {
                this.f615g = bVar;
            }

            public final void run() {
                C0758q.m240e(this.f615g.f613a.f612n.f540b);
            }
        }

        /* renamed from: b.a.a.n.c$b$b */
        public static final class C0811b implements Runnable {

            /* renamed from: g */
            public final /* synthetic */ C0809b f616g;

            public C0811b(C0809b bVar) {
                this.f616g = bVar;
            }

            public final void run() {
                C0758q.m240e(this.f616g.f613a.f612n.f540b);
            }
        }

        public C0809b(C0807c cVar, UploadInfoResponse uploadInfoResponse) {
            this.f613a = cVar;
            this.f614b = uploadInfoResponse;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
            p005b.p291q.p292a.C5266a.m9877S(r7, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
            throw r0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo10629a(p421m.C7841f r6, p421m.C7850h0 r7) {
            /*
                r5 = this;
                java.lang.String r0 = "call"
                p298d.p344x.p346c.C6888i.m12438e(r6, r0)
                java.lang.String r6 = "response"
                p298d.p344x.p346c.C6888i.m12438e(r7, r6)
                b.a.a.n.c r6 = r5.f613a
                com.appfoundry.previewer.activities.BravoActivity r6 = r6.f611m
                b.a.a.n.c$b$b r0 = new b.a.a.n.c$b$b
                r0.<init>(r5)
                r6.runOnUiThread(r0)
                boolean r6 = r7.isSuccessful()     // Catch:{ all -> 0x0076 }
                r0 = 1
                r1 = 0
                if (r6 != 0) goto L_0x002d
                java.lang.String r6 = "ERROR: %s"
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0076 }
                r2 = 0
                java.lang.String r3 = r7.f15551i     // Catch:{ all -> 0x0076 }
                r0[r2] = r3     // Catch:{ all -> 0x0076 }
                p.a.a$b r2 = p441p.p442a.C8091a.f16272d     // Catch:{ all -> 0x0076 }
                r2.mo26044b(r6, r0)     // Catch:{ all -> 0x0076 }
                goto L_0x0072
            L_0x002d:
                b.a.a.n.d r6 = p005b.p006a.p007a.p023n.C0812d.f622f     // Catch:{ all -> 0x0076 }
                java.util.List<b.a.a.j.g> r6 = p005b.p006a.p007a.p023n.C0812d.f619c     // Catch:{ all -> 0x0076 }
                b.a.a.n.c r2 = r5.f613a     // Catch:{ all -> 0x0076 }
                b.a.a.j.g r2 = r2.f612n     // Catch:{ all -> 0x0076 }
                java.lang.String r2 = r2.f539a     // Catch:{ all -> 0x0076 }
                java.lang.String r3 = "$this$setAsFinished"
                p298d.p344x.p346c.C6888i.m12438e(r6, r3)     // Catch:{ all -> 0x0076 }
                java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0076 }
            L_0x0040:
                boolean r3 = r6.hasNext()     // Catch:{ all -> 0x0076 }
                if (r3 == 0) goto L_0x0056
                java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x0076 }
                r4 = r3
                b.a.a.j.g r4 = (p005b.p006a.p007a.p019j.C0776g) r4     // Catch:{ all -> 0x0076 }
                java.lang.String r4 = r4.f539a     // Catch:{ all -> 0x0076 }
                boolean r4 = p298d.p344x.p346c.C6888i.m12434a(r4, r2)     // Catch:{ all -> 0x0076 }
                if (r4 == 0) goto L_0x0040
                goto L_0x0057
            L_0x0056:
                r3 = r1
            L_0x0057:
                b.a.a.j.g r3 = (p005b.p006a.p007a.p019j.C0776g) r3     // Catch:{ all -> 0x0076 }
                if (r3 == 0) goto L_0x005d
                r3.f541c = r0     // Catch:{ all -> 0x0076 }
            L_0x005d:
                b.a.a.n.d r6 = p005b.p006a.p007a.p023n.C0812d.f622f     // Catch:{ all -> 0x0076 }
                b.a.a.n.c r0 = r5.f613a     // Catch:{ all -> 0x0076 }
                java.util.List r0 = r0.f610l     // Catch:{ all -> 0x0076 }
                b.a.a.h.p r2 = p005b.p006a.p007a.p023n.C0812d.f620d     // Catch:{ all -> 0x0076 }
                if (r2 == 0) goto L_0x006a
                java.lang.String r2 = r2.f428b     // Catch:{ all -> 0x0076 }
                goto L_0x006b
            L_0x006a:
                r2 = r1
            L_0x006b:
                com.appfoundry.previewer.model.UploadInfoResponse r3 = r5.f614b     // Catch:{ all -> 0x0076 }
                java.lang.String r3 = r3.f11173a     // Catch:{ all -> 0x0076 }
                r6.mo10644j(r0, r2, r3)     // Catch:{ all -> 0x0076 }
            L_0x0072:
                p005b.p291q.p292a.C5266a.m9877S(r7, r1)
                return
            L_0x0076:
                r6 = move-exception
                throw r6     // Catch:{ all -> 0x0078 }
            L_0x0078:
                r0 = move-exception
                p005b.p291q.p292a.C5266a.m9877S(r7, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p023n.C0807c.C0809b.mo10629a(m.f, m.h0):void");
        }

        /* renamed from: b */
        public void mo10630b(C7841f fVar, IOException iOException) {
            C6888i.m12438e(fVar, NotificationCompat.CATEGORY_CALL);
            C6888i.m12438e(iOException, "e");
            this.f613a.f611m.runOnUiThread(new C0810a(this));
            C8091a.f16272d.mo26044b("ERROR: %s", iOException.getMessage());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0807c(List list, C6824d dVar, BravoActivity bravoActivity, C0776g gVar) {
        super(2, dVar);
        this.f610l = list;
        this.f611m = bravoActivity;
        this.f612n = gVar;
    }

    /* renamed from: b */
    public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
        C6888i.m12438e(dVar, "completion");
        return new C0807c(this.f610l, dVar, this.f611m, this.f612n);
    }

    /* renamed from: e */
    public final Object mo10326e(Object obj) {
        Object obj2;
        boolean z;
        C6833a aVar = C6833a.COROUTINE_SUSPENDED;
        int i = this.f609k;
        String str = null;
        if (i == 0) {
            C5266a.m10018q4(obj);
            C7815w wVar = C7725h0.f15274b;
            C0808a aVar2 = new C0808a((C6824d) null);
            this.f609k = 1;
            obj = C5266a.m9853N4(wVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            C5266a.m10018q4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        UploadInfoResponse uploadInfoResponse = (UploadInfoResponse) obj;
        C0812d dVar = C0812d.f622f;
        Iterator it = this.f610l.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((C0774e) obj2).f530d != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C0774e eVar = (C0774e) obj2;
        File file = eVar != null ? eVar.f530d : null;
        if (uploadInfoResponse != null) {
            str = uploadInfoResponse.f11174b;
        }
        if (!(str == null || file == null)) {
            C7839e0.C7840a aVar3 = new C7839e0.C7840a();
            aVar3.mo25540f(uploadInfoResponse.f11174b);
            C7829b0 b0Var = C7829b0.f15448e;
            C7829b0 b = C7829b0.m14222b("image/jpeg; charset=utf-8");
            C6888i.m12438e(file, "$this$asRequestBody");
            C7842f0 f0Var = new C7842f0(file, b);
            C6888i.m12438e(f0Var, "body");
            aVar3.mo25537c("PUT", f0Var);
            ((C7887e) BravoApp.f10730N.mo18363c().mo25525a(aVar3.mo25535a())).mo25622g(new C0809b(this, uploadInfoResponse));
        }
        return C6777r.f13694a;
    }

    public final Object invoke(Object obj, Object obj2) {
        C6824d dVar = (C6824d) obj2;
        C6888i.m12438e(dVar, "completion");
        return new C0807c(this.f610l, dVar, this.f611m, this.f612n).mo10326e(C6777r.f13694a);
    }
}
