package p005b.p040g.p041a.p047i.p048b;

import java.util.Map;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p040g.p041a.C0851b;
import p005b.p040g.p041a.C0853d;
import p005b.p040g.p041a.p047i.C0907a;
import p005b.p096l.p224e.C4465k;
import p005b.p096l.p224e.p230f0.C4455a;
import p005b.p280p.p285b.C5227e;
import p005b.p280p.p285b.C5245o;
import p005b.p280p.p285b.C5251q;
import p005b.p280p.p285b.C5252r;
import p005b.p280p.p285b.C5255t;
import p005b.p280p.p285b.C5259v;

/* renamed from: b.g.a.i.b.j */
public class C0917j<T, U extends C0851b> extends C0910c<T, U> implements C0907a<T, U>, C5227e {

    /* renamed from: i */
    public final String f823i;

    public C0917j(C5245o oVar, C5252r rVar, C4465k kVar, String str, C4455a<T> aVar, C0908a<U> aVar2) {
        super(oVar, rVar, kVar, kVar.mo16119e(aVar), aVar2);
        this.f823i = str;
    }

    public C0917j(C5245o oVar, C5252r rVar, C4465k kVar, String str, Class<T> cls, C0908a<U> aVar) {
        super(oVar, rVar, kVar, kVar.mo16120f(cls), aVar);
        this.f823i = str;
    }

    /* renamed from: b */
    public C5255t mo10749b() {
        boolean z = this.f823i.equals("HEAD") || this.f823i.equals("GET");
        C5255t.C5257b bVar = new C5255t.C5257b();
        bVar.mo17198d(this.f814b);
        for (Map.Entry next : this.f813a.entrySet()) {
            bVar.f10488c.mo17159a((String) next.getKey(), (String) next.getValue());
        }
        String str = this.f823i;
        C5259v vVar = null;
        if (!z) {
            Map<String, Object> a = this.f819g.mo10692a();
            if (!a.isEmpty()) {
                C4465k kVar = this.f818f;
                C5251q qVar = C0913f.f821a;
                try {
                    vVar = C5259v.m9756a(C0913f.f821a, kVar.mo16123i(a));
                } catch (Exception e) {
                    StringBuilder u = C0843a.m460u("Failed to convert ");
                    u.append(a.getClass().getName());
                    u.append(" to JSON");
                    throw new C0853d(u.toString(), e);
                }
            }
        }
        bVar.mo17197c(str, vVar);
        return bVar.mo17195a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1 = new p005b.p040g.p041a.C0851b("Error parsing the server response", r5);
        java.util.Objects.requireNonNull(r4.f817e);
        r3 = new p005b.p040g.p041a.p042e.C0856c("Request to " + r4.f814b.f10428i + " failed", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
        r1 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031 A[ExcHandler: IOException (r5v4 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:8:0x0011] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10753d(p005b.p280p.p285b.C5260w r5) {
        /*
            r4 = this;
            int r0 = r5.f10497c
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L_0x000c
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 >= r1) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            if (r0 != 0) goto L_0x0078
            b.p.b.x r0 = r5.f10501g
            java.lang.String r1 = r0.mo17208H()     // Catch:{ y -> 0x005e, IOException -> 0x0031 }
            b.g.a.i.b.b r2 = new b.g.a.i.b.b     // Catch:{ y -> 0x005f, IOException -> 0x0031 }
            r2.<init>(r4)     // Catch:{ y -> 0x005f, IOException -> 0x0031 }
            java.lang.reflect.Type r2 = r2.f8250b     // Catch:{ y -> 0x005f, IOException -> 0x0031 }
            b.l.e.k r3 = r4.f818f     // Catch:{ y -> 0x005f, IOException -> 0x0031 }
            java.lang.Object r2 = r3.mo16118d(r1, r2)     // Catch:{ y -> 0x005f, IOException -> 0x0031 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ y -> 0x005f, IOException -> 0x0031 }
            b.g.a.i.b.a<U> r3 = r4.f817e     // Catch:{ y -> 0x005f, IOException -> 0x0031 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ y -> 0x005f, IOException -> 0x0031 }
            b.g.a.e.c r3 = new b.g.a.e.c     // Catch:{ y -> 0x005f, IOException -> 0x0031 }
            r3.<init>(r2)     // Catch:{ y -> 0x005f, IOException -> 0x0031 }
            goto L_0x006b
        L_0x002f:
            r5 = move-exception
            goto L_0x0074
        L_0x0031:
            r5 = move-exception
            b.g.a.b r1 = new b.g.a.b     // Catch:{ all -> 0x002f }
            java.lang.String r2 = "Error parsing the server response"
            r1.<init>(r2, r5)     // Catch:{ all -> 0x002f }
            b.g.a.i.b.a<U> r5 = r4.f817e     // Catch:{ all -> 0x002f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x002f }
            r2.<init>()     // Catch:{ all -> 0x002f }
            java.lang.String r3 = "Request to "
            r2.append(r3)     // Catch:{ all -> 0x002f }
            b.p.b.o r3 = r4.f814b     // Catch:{ all -> 0x002f }
            java.lang.String r3 = r3.f10428i     // Catch:{ all -> 0x002f }
            r2.append(r3)     // Catch:{ all -> 0x002f }
            java.lang.String r3 = " failed"
            r2.append(r3)     // Catch:{ all -> 0x002f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x002f }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x002f }
            b.g.a.e.c r3 = new b.g.a.e.c     // Catch:{ all -> 0x002f }
            r3.<init>((java.lang.String) r2, (p005b.p040g.p041a.C0851b) r1)     // Catch:{ all -> 0x002f }
            goto L_0x006b
        L_0x005e:
            r1 = 0
        L_0x005f:
            b.g.a.i.b.a<U> r2 = r4.f817e     // Catch:{ all -> 0x002f }
            int r5 = r5.f10497c     // Catch:{ all -> 0x002f }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x002f }
            b.g.a.e.c r3 = new b.g.a.e.c     // Catch:{ all -> 0x002f }
            r3.<init>((java.lang.String) r1, (int) r5)     // Catch:{ all -> 0x002f }
        L_0x006b:
            r0.close()     // Catch:{ IOException -> 0x006e }
        L_0x006e:
            b.g.a.f.a<T, U> r5 = r4.f820h
            r5.mo10713b(r3)
            return
        L_0x0074:
            r0.close()     // Catch:{ IOException -> 0x0077 }
        L_0x0077:
            throw r5
        L_0x0078:
            b.p.b.x r5 = r5.f10501g
            java.io.Reader r0 = r5.mo17210d()     // Catch:{ IOException -> 0x0094 }
            b.l.e.b0<T> r1 = r4.f816d     // Catch:{ IOException -> 0x0094 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ IOException -> 0x0094 }
            b.l.e.g0.a r2 = new b.l.e.g0.a     // Catch:{ IOException -> 0x0094 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0094 }
            java.lang.Object r0 = r1.mo10755a(r2)     // Catch:{ IOException -> 0x0094 }
            b.g.a.f.a<T, U> r1 = r4.f820h     // Catch:{ IOException -> 0x0094 }
            r1.mo10712a(r0)     // Catch:{ IOException -> 0x0094 }
            goto L_0x00be
        L_0x0092:
            r0 = move-exception
            goto L_0x00c2
        L_0x0094:
            r0 = move-exception
            b.g.a.b r1 = new b.g.a.b     // Catch:{ all -> 0x0092 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            r2.<init>()     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = "Failed to parse response to request to "
            r2.append(r3)     // Catch:{ all -> 0x0092 }
            b.p.b.o r3 = r4.f814b     // Catch:{ all -> 0x0092 }
            r2.append(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0092 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0092 }
            b.g.a.i.b.a<U> r0 = r4.f817e     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = "Failed to parse a successful response"
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0092 }
            b.g.a.e.c r0 = new b.g.a.e.c     // Catch:{ all -> 0x0092 }
            r0.<init>((java.lang.String) r2, (p005b.p040g.p041a.C0851b) r1)     // Catch:{ all -> 0x0092 }
            b.g.a.f.a<T, U> r1 = r4.f820h     // Catch:{ all -> 0x0092 }
            r1.mo10713b(r0)     // Catch:{ all -> 0x0092 }
        L_0x00be:
            r5.close()     // Catch:{ IOException -> 0x00c1 }
        L_0x00c1:
            return
        L_0x00c2:
            r5.close()     // Catch:{ IOException -> 0x00c5 }
        L_0x00c5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p040g.p041a.p047i.p048b.C0917j.mo10753d(b.p.b.w):void");
    }
}
