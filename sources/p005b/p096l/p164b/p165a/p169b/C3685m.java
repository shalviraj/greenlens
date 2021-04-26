package p005b.p096l.p164b.p165a.p169b;

import com.google.api.client.http.HttpHeaders;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p175c.p177b.C3789n;
import p005b.p291q.p292a.C5266a;
import p376j.p378b.p380b.p381a.p382a.C7015a;
import p376j.p378b.p383c.C7034m;
import p376j.p378b.p383c.C7039o;
import p376j.p378b.p383c.C7050v;
import p376j.p378b.p383c.C7056x;
import p376j.p378b.p383c.p385y.C7057a;
import p376j.p378b.p383c.p385y.C7060b;
import p376j.p378b.p383c.p386z.C7063a;

/* renamed from: b.l.b.a.b.m */
public class C3685m {

    /* renamed from: a */
    public static final Logger f6804a = Logger.getLogger(C3685m.class.getName());

    /* renamed from: b */
    public static final String f6805b;

    /* renamed from: c */
    public static final C7050v f6806c = C7056x.f14156b.mo24450b();

    /* renamed from: d */
    public static final AtomicLong f6807d = new AtomicLong();

    /* renamed from: e */
    public static volatile boolean f6808e = true;

    /* renamed from: f */
    public static volatile C7063a f6809f;

    /* renamed from: g */
    public static volatile C7063a.C7064a f6810g;

    /* renamed from: b.l.b.a.b.m$a */
    public static class C3686a extends C7063a.C7064a<HttpHeaders> {
    }

    static {
        StringBuilder u = C0843a.m460u("Sent.");
        u.append(C3677f.class.getName());
        u.append(".execute");
        f6805b = u.toString();
        f6809f = null;
        f6810g = null;
        try {
            f6809f = new C7015a();
            f6810g = new C3686a();
        } catch (Exception e) {
            f6804a.log(Level.WARNING, "Cannot initialize default OpenCensus HTTP propagation text format.", e);
        }
        try {
            C7060b bVar = ((C7057a.C7059b) C7056x.f14156b.mo24449a()).f14157a;
            C3789n B = C3789n.m7164B(f6805b);
            C7060b.C7062b bVar2 = (C7060b.C7062b) bVar;
            Objects.requireNonNull(bVar2);
            C5266a.m9842M(B, "spanNames");
            synchronized (bVar2.f14158a) {
                bVar2.f14158a.addAll(B);
            }
        } catch (Exception e2) {
            f6804a.log(Level.WARNING, "Cannot register default OpenCensus span names for collection.", e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0060  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p376j.p378b.p383c.C7033l m6952a(java.lang.Integer r4) {
        /*
            j.b.c.l r0 = p376j.p378b.p383c.C7033l.f14096a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = 0
            if (r4 != 0) goto L_0x0008
            goto L_0x0035
        L_0x0008:
            int r2 = r4.intValue()
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 < r3) goto L_0x0016
            r3 = 300(0x12c, float:4.2E-43)
            if (r2 >= r3) goto L_0x0016
            r2 = 1
            goto L_0x0017
        L_0x0016:
            r2 = r1
        L_0x0017:
            if (r2 != 0) goto L_0x004a
            int r4 = r4.intValue()
            r2 = 400(0x190, float:5.6E-43)
            if (r4 == r2) goto L_0x0047
            r2 = 401(0x191, float:5.62E-43)
            if (r4 == r2) goto L_0x0044
            r2 = 403(0x193, float:5.65E-43)
            if (r4 == r2) goto L_0x0041
            r2 = 404(0x194, float:5.66E-43)
            if (r4 == r2) goto L_0x003e
            r2 = 412(0x19c, float:5.77E-43)
            if (r4 == r2) goto L_0x003b
            r2 = 500(0x1f4, float:7.0E-43)
            if (r4 == r2) goto L_0x0038
        L_0x0035:
            j.b.c.r r4 = p376j.p378b.p383c.C7043r.f14118e
            goto L_0x004c
        L_0x0038:
            j.b.c.r r4 = p376j.p378b.p383c.C7043r.f14124k
            goto L_0x004c
        L_0x003b:
            j.b.c.r r4 = p376j.p378b.p383c.C7043r.f14123j
            goto L_0x004c
        L_0x003e:
            j.b.c.r r4 = p376j.p378b.p383c.C7043r.f14120g
            goto L_0x004c
        L_0x0041:
            j.b.c.r r4 = p376j.p378b.p383c.C7043r.f14121h
            goto L_0x004c
        L_0x0044:
            j.b.c.r r4 = p376j.p378b.p383c.C7043r.f14122i
            goto L_0x004c
        L_0x0047:
            j.b.c.r r4 = p376j.p378b.p383c.C7043r.f14119f
            goto L_0x004c
        L_0x004a:
            j.b.c.r r4 = p376j.p378b.p383c.C7043r.f14117d
        L_0x004c:
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = " sampleToLocalSpanStore"
            goto L_0x0053
        L_0x0051:
            java.lang.String r0 = ""
        L_0x0053:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0060
            j.b.c.c r0 = new j.b.c.c
            r2 = 0
            r0.<init>(r1, r4, r2)
            return r0
        L_0x0060:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing required properties:"
            java.lang.String r0 = p005b.p035e.p036a.p037a.C0843a.m451l(r1, r0)
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p164b.p165a.p169b.C3685m.m6952a(java.lang.Integer):j.b.c.l");
    }

    /* renamed from: b */
    public static void m6953b(C7039o oVar, long j, C7034m.C7036b bVar) {
        C1960d.m2833p(oVar != null, "span should not be null.");
        if (j < 0) {
            j = 0;
        }
        C7034m.C7035a a = C7034m.m12643a(bVar, f6807d.getAndIncrement());
        a.mo24417b(j);
        oVar.mo24430a(a.mo24416a());
    }
}
