package p005b.p006a.p007a.p023n;

import androidx.core.app.NotificationCompat;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.activities.BravoActivity;
import com.appfoundry.previewer.model.UploadInfoResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p005b.p006a.p007a.p018i.C0758q;
import p005b.p006a.p007a.p019j.C0775f;
import p005b.p006a.p007a.p024o.C0820c;
import p005b.p038f.p039a.C0844a;
import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p337v.C6824d;
import p298d.p337v.p338i.C6833a;
import p298d.p337v.p339j.p340a.C6840e;
import p298d.p337v.p339j.p340a.C6844h;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6899t;
import p416l.p417a.C7725h0;
import p416l.p417a.C7815w;
import p416l.p417a.C7821y;
import p421m.C7829b0;
import p421m.C7839e0;
import p421m.C7841f;
import p421m.C7843g;
import p421m.C7844g0;
import p421m.p422m0.p426g.C7887e;
import p441p.p442a.C8091a;

@C6840e(mo24177c = "com.appfoundry.previewer.singletons.Forms$processFileUpload$2$1", mo24178f = "Forms.kt", mo24179l = {88}, mo24180m = "invokeSuspend")
/* renamed from: b.a.a.n.b */
public final class C0802b extends C6844h implements C6866p<C7821y, C6824d<? super C6777r>, Object> {

    /* renamed from: k */
    public int f598k;

    /* renamed from: l */
    public final /* synthetic */ List f599l;

    /* renamed from: m */
    public final /* synthetic */ C0844a f600m;

    /* renamed from: n */
    public final /* synthetic */ BravoActivity f601n;

    /* renamed from: o */
    public final /* synthetic */ C6899t f602o;

    /* renamed from: p */
    public final /* synthetic */ C0775f f603p;

    @C6840e(mo24177c = "com.appfoundry.previewer.singletons.Forms$processFileUpload$2$1$requestInfo$1", mo24178f = "Forms.kt", mo24179l = {}, mo24180m = "invokeSuspend")
    /* renamed from: b.a.a.n.b$a */
    public static final class C0803a extends C6844h implements C6866p<C7821y, C6824d<? super UploadInfoResponse>, Object> {

        /* renamed from: k */
        public final /* synthetic */ C0802b f604k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0803a(C0802b bVar, C6824d dVar) {
            super(2, dVar);
            this.f604k = bVar;
        }

        /* renamed from: b */
        public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
            C6888i.m12438e(dVar, "completion");
            return new C0803a(this.f604k, dVar);
        }

        /* renamed from: e */
        public final Object mo10326e(Object obj) {
            C5266a.m10018q4(obj);
            return C0820c.m314n(this.f604k.f600m.f702k);
        }

        public final Object invoke(Object obj, Object obj2) {
            C6824d dVar = (C6824d) obj2;
            C6888i.m12438e(dVar, "completion");
            C0802b bVar = this.f604k;
            dVar.getContext();
            C5266a.m10018q4(C6777r.f13694a);
            return C0820c.m314n(bVar.f600m.f702k);
        }
    }

    /* renamed from: b.a.a.n.b$b */
    public static final class C0804b implements C7843g {

        /* renamed from: a */
        public final /* synthetic */ C0802b f605a;

        /* renamed from: b */
        public final /* synthetic */ UploadInfoResponse f606b;

        /* renamed from: b.a.a.n.b$b$a */
        public static final class C0805a implements Runnable {

            /* renamed from: g */
            public final /* synthetic */ C0804b f607g;

            public C0805a(C0804b bVar) {
                this.f607g = bVar;
            }

            public final void run() {
                C0758q.m240e(this.f607g.f605a.f603p.f537b);
            }
        }

        /* renamed from: b.a.a.n.b$b$b */
        public static final class C0806b implements Runnable {

            /* renamed from: g */
            public final /* synthetic */ C0804b f608g;

            public C0806b(C0804b bVar) {
                this.f608g = bVar;
            }

            public final void run() {
                C0758q.m240e(this.f608g.f605a.f603p.f537b);
            }
        }

        public C0804b(C0802b bVar, UploadInfoResponse uploadInfoResponse) {
            this.f605a = bVar;
            this.f606b = uploadInfoResponse;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
            p005b.p291q.p292a.C5266a.m9877S(r7, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
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
                b.a.a.n.b r6 = r5.f605a
                com.appfoundry.previewer.activities.BravoActivity r6 = r6.f601n
                b.a.a.n.b$b$b r0 = new b.a.a.n.b$b$b
                r0.<init>(r5)
                r6.runOnUiThread(r0)
                boolean r6 = r7.isSuccessful()     // Catch:{ all -> 0x0078 }
                r0 = 1
                r1 = 0
                if (r6 != 0) goto L_0x002d
                java.lang.String r6 = "ERROR: %s"
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0078 }
                r2 = 0
                java.lang.String r3 = r7.f15551i     // Catch:{ all -> 0x0078 }
                r0[r2] = r3     // Catch:{ all -> 0x0078 }
                p.a.a$b r2 = p441p.p442a.C8091a.f16272d     // Catch:{ all -> 0x0078 }
                r2.mo26044b(r6, r0)     // Catch:{ all -> 0x0078 }
                goto L_0x0074
            L_0x002d:
                b.a.a.n.d r6 = p005b.p006a.p007a.p023n.C0812d.f622f     // Catch:{ all -> 0x0078 }
                java.util.List<b.a.a.j.f> r6 = p005b.p006a.p007a.p023n.C0812d.f618b     // Catch:{ all -> 0x0078 }
                b.a.a.h.o r2 = p005b.p006a.p007a.p023n.C0812d.f621e     // Catch:{ all -> 0x0078 }
                if (r2 == 0) goto L_0x0038
                java.lang.String r2 = r2.f424b     // Catch:{ all -> 0x0078 }
                goto L_0x0039
            L_0x0038:
                r2 = r1
            L_0x0039:
                java.lang.String r3 = "$this$setFinished"
                p298d.p344x.p346c.C6888i.m12438e(r6, r3)     // Catch:{ all -> 0x0078 }
                java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0078 }
            L_0x0042:
                boolean r3 = r6.hasNext()     // Catch:{ all -> 0x0078 }
                if (r3 == 0) goto L_0x0058
                java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x0078 }
                r4 = r3
                b.a.a.j.f r4 = (p005b.p006a.p007a.p019j.C0775f) r4     // Catch:{ all -> 0x0078 }
                java.lang.String r4 = r4.f536a     // Catch:{ all -> 0x0078 }
                boolean r4 = p298d.p344x.p346c.C6888i.m12434a(r4, r2)     // Catch:{ all -> 0x0078 }
                if (r4 == 0) goto L_0x0042
                goto L_0x0059
            L_0x0058:
                r3 = r1
            L_0x0059:
                b.a.a.j.f r3 = (p005b.p006a.p007a.p019j.C0775f) r3     // Catch:{ all -> 0x0078 }
                if (r3 == 0) goto L_0x005f
                r3.f538c = r0     // Catch:{ all -> 0x0078 }
            L_0x005f:
                b.a.a.n.d r6 = p005b.p006a.p007a.p023n.C0812d.f622f     // Catch:{ all -> 0x0078 }
                b.a.a.n.b r0 = r5.f605a     // Catch:{ all -> 0x0078 }
                java.util.List r0 = r0.f599l     // Catch:{ all -> 0x0078 }
                b.a.a.h.o r2 = p005b.p006a.p007a.p023n.C0812d.f621e     // Catch:{ all -> 0x0078 }
                if (r2 == 0) goto L_0x006c
                java.lang.String r2 = r2.f424b     // Catch:{ all -> 0x0078 }
                goto L_0x006d
            L_0x006c:
                r2 = r1
            L_0x006d:
                com.appfoundry.previewer.model.UploadInfoResponse r3 = r5.f606b     // Catch:{ all -> 0x0078 }
                java.lang.String r3 = r3.f11173a     // Catch:{ all -> 0x0078 }
                r6.mo10644j(r0, r2, r3)     // Catch:{ all -> 0x0078 }
            L_0x0074:
                p005b.p291q.p292a.C5266a.m9877S(r7, r1)
                return
            L_0x0078:
                r6 = move-exception
                throw r6     // Catch:{ all -> 0x007a }
            L_0x007a:
                r0 = move-exception
                p005b.p291q.p292a.C5266a.m9877S(r7, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p023n.C0802b.C0804b.mo10629a(m.f, m.h0):void");
        }

        /* renamed from: b */
        public void mo10630b(C7841f fVar, IOException iOException) {
            C6888i.m12438e(fVar, NotificationCompat.CATEGORY_CALL);
            C6888i.m12438e(iOException, "e");
            this.f605a.f601n.runOnUiThread(new C0805a(this));
            C8091a.f16272d.mo26044b("ERROR: %s", iOException.getMessage());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0802b(List list, C6824d dVar, C0844a aVar, BravoActivity bravoActivity, C6899t tVar, C0775f fVar) {
        super(2, dVar);
        this.f599l = list;
        this.f600m = aVar;
        this.f601n = bravoActivity;
        this.f602o = tVar;
        this.f603p = fVar;
    }

    /* renamed from: b */
    public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
        C6888i.m12438e(dVar, "completion");
        return new C0802b(this.f599l, dVar, this.f600m, this.f601n, this.f602o, this.f603p);
    }

    /* renamed from: e */
    public final Object mo10326e(Object obj) {
        byte[] bArr;
        C6833a aVar = C6833a.COROUTINE_SUSPENDED;
        int i = this.f598k;
        String str = null;
        if (i == 0) {
            C5266a.m10018q4(obj);
            C7815w wVar = C7725h0.f15274b;
            C0803a aVar2 = new C0803a(this, (C6824d) null);
            this.f598k = 1;
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
        InputStream openInputStream = this.f601n.getContentResolver().openInputStream(this.f600m.f698g);
        int i2 = 0;
        if (openInputStream != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = openInputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            bArr = byteArrayOutputStream.toByteArray();
        } else {
            bArr = null;
        }
        C6899t tVar = this.f602o;
        if (bArr != null) {
            i2 = new Integer(bArr.length).intValue();
        }
        tVar.f13799g = i2;
        if (uploadInfoResponse != null) {
            str = uploadInfoResponse.f11174b;
        }
        if (!(str == null || bArr == null)) {
            C7839e0.C7840a aVar3 = new C7839e0.C7840a();
            aVar3.mo25540f(uploadInfoResponse.f11174b);
            C7844g0.C7845a aVar4 = C7844g0.f15540a;
            C7829b0 b0Var = C7829b0.f15448e;
            C7844g0 c = C7844g0.C7845a.m14248c(aVar4, bArr, C7829b0.m14222b(C6888i.m12444k(this.f600m.f702k, "; charset=utf-8")), 0, 0, 6);
            C6888i.m12438e(c, "body");
            aVar3.mo25537c("PUT", c);
            ((C7887e) BravoApp.f10730N.mo18363c().mo25525a(aVar3.mo25535a())).mo25622g(new C0804b(this, uploadInfoResponse));
        }
        return C6777r.f13694a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C0802b) mo10325b(obj, (C6824d) obj2)).mo10326e(C6777r.f13694a);
    }
}
