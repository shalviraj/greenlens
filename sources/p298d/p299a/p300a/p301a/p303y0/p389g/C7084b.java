package p298d.p299a.p300a.p301a.p303y0.p389g;

import java.io.InputStream;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7117p;

/* renamed from: d.a.a.a.y0.g.b */
public abstract class C7084b<MessageType extends C7117p> implements C7120r<MessageType> {
    static {
        C7091f fVar = C7091f.f14182b;
    }

    /* renamed from: b */
    public final MessageType mo24597b(MessageType messagetype) {
        C7134v vVar;
        if (messagetype == null || messagetype.mo23687g()) {
            return messagetype;
        }
        if (messagetype instanceof C7081a) {
            C7081a aVar = (C7081a) messagetype;
            vVar = new C7134v();
        } else {
            vVar = new C7134v();
        }
        C7106j jVar = new C7106j(vVar.getMessage());
        jVar.f14209g = messagetype;
        throw jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r2 >= 64) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        r3 = r6.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r3 == -1) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if ((r3 & 128) != 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
        r2 = r2 + 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004e, code lost:
        throw p298d.p299a.p300a.p301a.p303y0.p389g.C7106j.m12798d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0056, code lost:
        throw new p298d.p299a.p300a.p301a.p303y0.p389g.C7106j("CodedInputStream encountered a malformed varint.");
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo24598c(java.io.InputStream r6, p298d.p299a.p300a.p301a.p303y0.p389g.C7091f r7) {
        /*
            r5 = this;
            int r0 = r6.read()     // Catch:{ IOException -> 0x0057 }
            r1 = -1
            if (r0 != r1) goto L_0x0009
            r6 = 0
            goto L_0x0043
        L_0x0009:
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x000e
            goto L_0x003a
        L_0x000e:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            r2 = 7
        L_0x0011:
            r3 = 32
            if (r2 >= r3) goto L_0x002c
            int r3 = r6.read()     // Catch:{ IOException -> 0x0057 }
            if (r3 == r1) goto L_0x0027
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r4 = r4 << r2
            r0 = r0 | r4
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x0024
            goto L_0x003a
        L_0x0024:
            int r2 = r2 + 7
            goto L_0x0011
        L_0x0027:
            d.a.a.a.y0.g.j r6 = p298d.p299a.p300a.p301a.p303y0.p389g.C7106j.m12798d()     // Catch:{ IOException -> 0x0057 }
            throw r6     // Catch:{ IOException -> 0x0057 }
        L_0x002c:
            r3 = 64
            if (r2 >= r3) goto L_0x004f
            int r3 = r6.read()     // Catch:{ IOException -> 0x0057 }
            if (r3 == r1) goto L_0x004a
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x0047
        L_0x003a:
            d.a.a.a.y0.g.a$a$a r1 = new d.a.a.a.y0.g.a$a$a
            r1.<init>(r6, r0)
            d.a.a.a.y0.g.p r6 = r5.mo24599d(r1, r7)
        L_0x0043:
            r5.mo24597b(r6)
            return r6
        L_0x0047:
            int r2 = r2 + 7
            goto L_0x002c
        L_0x004a:
            d.a.a.a.y0.g.j r6 = p298d.p299a.p300a.p301a.p303y0.p389g.C7106j.m12798d()     // Catch:{ IOException -> 0x0057 }
            throw r6     // Catch:{ IOException -> 0x0057 }
        L_0x004f:
            d.a.a.a.y0.g.j r6 = new d.a.a.a.y0.g.j     // Catch:{ IOException -> 0x0057 }
            java.lang.String r7 = "CodedInputStream encountered a malformed varint."
            r6.<init>(r7)     // Catch:{ IOException -> 0x0057 }
            throw r6     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            r6 = move-exception
            d.a.a.a.y0.g.j r7 = new d.a.a.a.y0.g.j
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p389g.C7084b.mo24598c(java.io.InputStream, d.a.a.a.y0.g.f):java.lang.Object");
    }

    /* renamed from: d */
    public MessageType mo24599d(InputStream inputStream, C7091f fVar) {
        C7088d dVar = new C7088d(inputStream);
        MessageType messagetype = (C7117p) mo23688a(dVar, fVar);
        try {
            dVar.mo24623a(0);
            return messagetype;
        } catch (C7106j e) {
            e.f14209g = messagetype;
            throw e;
        }
    }
}
