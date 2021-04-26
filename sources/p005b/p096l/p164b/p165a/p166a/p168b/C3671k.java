package p005b.p096l.p164b.p165a.p166a.p168b;

import com.google.api.client.auth.oauth2.TokenErrorResponse;
import p005b.p096l.p164b.p165a.p169b.C3680i;

/* renamed from: b.l.b.a.a.b.k */
public class C3671k extends C3680i {

    /* renamed from: g */
    public final transient TokenErrorResponse f6751g;

    public C3671k(C3680i.C3681a aVar, TokenErrorResponse tokenErrorResponse) {
        super(aVar);
        this.f6751g = tokenErrorResponse;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.google.api.client.auth.oauth2.TokenErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: com.google.api.client.auth.oauth2.TokenErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: com.google.api.client.auth.oauth2.TokenErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r10v10, types: [com.google.api.client.auth.oauth2.TokenErrorResponse, b.l.b.a.c.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p005b.p096l.p164b.p165a.p166a.p168b.C3671k m6921a(p005b.p096l.p164b.p165a.p171c.C3700c r10, p005b.p096l.p164b.p165a.p169b.C3679h r11) {
        /*
            b.l.b.a.b.i$a r0 = new b.l.b.a.b.i$a
            int r1 = r11.f6789f
            java.lang.String r2 = r11.f6790g
            b.l.b.a.b.f r3 = r11.f6791h
            com.google.api.client.http.HttpHeaders r3 = r3.f6767c
            r0.<init>(r1, r2, r3)
            java.util.Objects.requireNonNull(r10)
            java.lang.String r1 = r11.f6786c
            r2 = 0
            boolean r3 = r11.mo14997e()     // Catch:{ IOException -> 0x00a4 }
            if (r3 != 0) goto L_0x009c
            if (r1 == 0) goto L_0x009c
            java.io.InputStream r3 = r11.mo14994b()     // Catch:{ IOException -> 0x00a4 }
            if (r3 == 0) goto L_0x009c
            java.lang.String r3 = "application/json; charset=UTF-8"
            boolean r1 = p005b.p096l.p164b.p165a.p169b.C3676e.m6922c(r3, r1)     // Catch:{ IOException -> 0x00a4 }
            if (r1 == 0) goto L_0x009c
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ IOException -> 0x00a4 }
            r1.<init>()     // Catch:{ IOException -> 0x00a4 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ IOException -> 0x00a4 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x00a4 }
            java.io.InputStream r1 = r11.mo14994b()     // Catch:{ IOException -> 0x00a4 }
            java.nio.charset.Charset r4 = r11.mo14995c()     // Catch:{ IOException -> 0x00a4 }
            java.lang.Class<com.google.api.client.auth.oauth2.TokenErrorResponse> r5 = com.google.api.client.auth.oauth2.TokenErrorResponse.class
            b.l.b.a.c.f r10 = r10.mo15025b(r1, r4)     // Catch:{ IOException -> 0x00a4 }
            boolean r1 = r3.isEmpty()     // Catch:{ IOException -> 0x00a4 }
            r4 = 1
            if (r1 == 0) goto L_0x0049
            goto L_0x0084
        L_0x0049:
            b.l.b.a.c.i r1 = r10.mo15038f0()     // Catch:{ all -> 0x0093 }
        L_0x004d:
            b.l.b.a.c.i r6 = p005b.p096l.p164b.p165a.p171c.C3707i.FIELD_NAME     // Catch:{ all -> 0x0093 }
            if (r1 != r6) goto L_0x006c
            java.lang.String r1 = r10.mo15039q()     // Catch:{ all -> 0x0093 }
            r10.mo15040z()     // Catch:{ all -> 0x0093 }
            boolean r6 = r3.contains(r1)     // Catch:{ all -> 0x0093 }
            if (r6 == 0) goto L_0x005f
            goto L_0x006d
        L_0x005f:
            r1 = r10
            b.l.b.a.c.j.c r1 = (p005b.p096l.p164b.p165a.p171c.p172j.C3710c) r1     // Catch:{ all -> 0x0093 }
            b.j.a.a.g r1 = r1.f6848i     // Catch:{ all -> 0x0093 }
            r1.mo11498n0()     // Catch:{ all -> 0x0093 }
            b.l.b.a.c.i r1 = r10.mo15040z()     // Catch:{ all -> 0x0093 }
            goto L_0x004d
        L_0x006c:
            r1 = r2
        L_0x006d:
            r6 = 0
            if (r1 == 0) goto L_0x007a
            b.l.b.a.c.i r1 = r10.mo15037e()     // Catch:{ all -> 0x0093 }
            b.l.b.a.c.i r7 = p005b.p096l.p164b.p165a.p171c.C3707i.END_OBJECT     // Catch:{ all -> 0x0093 }
            if (r1 == r7) goto L_0x007a
            r1 = r4
            goto L_0x007b
        L_0x007a:
            r1 = r6
        L_0x007b:
            java.lang.String r7 = "wrapper key(s) not found: %s"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x0093 }
            r8[r6] = r3     // Catch:{ all -> 0x0093 }
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2845s(r1, r7, r8)     // Catch:{ all -> 0x0093 }
        L_0x0084:
            java.lang.Object r10 = r10.mo15032H(r5, r4, r2)     // Catch:{ IOException -> 0x00a4 }
            com.google.api.client.auth.oauth2.TokenErrorResponse r10 = (com.google.api.client.auth.oauth2.TokenErrorResponse) r10     // Catch:{ IOException -> 0x00a4 }
            java.lang.String r1 = r10.toPrettyString()     // Catch:{ IOException -> 0x0091 }
            r2 = r10
            r10 = r1
            goto L_0x00a0
        L_0x0091:
            r1 = move-exception
            goto L_0x00a7
        L_0x0093:
            r1 = move-exception
            b.l.b.a.c.j.c r10 = (p005b.p096l.p164b.p165a.p171c.p172j.C3710c) r10     // Catch:{ IOException -> 0x00a4 }
            b.j.a.a.g r10 = r10.f6848i     // Catch:{ IOException -> 0x00a4 }
            r10.close()     // Catch:{ IOException -> 0x00a4 }
            throw r1     // Catch:{ IOException -> 0x00a4 }
        L_0x009c:
            java.lang.String r10 = r11.mo14998f()     // Catch:{ IOException -> 0x00a4 }
        L_0x00a0:
            r9 = r2
            r2 = r10
            r10 = r9
            goto L_0x00aa
        L_0x00a4:
            r10 = move-exception
            r1 = r10
            r10 = r2
        L_0x00a7:
            r1.printStackTrace()
        L_0x00aa:
            java.lang.StringBuilder r11 = p005b.p096l.p164b.p165a.p169b.C3680i.computeMessageBuffer(r11)
            boolean r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2834p0(r2)
            if (r1 != 0) goto L_0x00be
            java.lang.String r1 = p005b.p096l.p164b.p165a.p173d.C3746w.f6927a
            r11.append(r1)
            r11.append(r2)
            r0.f6798d = r2
        L_0x00be:
            java.lang.String r11 = r11.toString()
            r0.f6799e = r11
            b.l.b.a.a.b.k r11 = new b.l.b.a.a.b.k
            r11.<init>(r0, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p164b.p165a.p166a.p168b.C3671k.m6921a(b.l.b.a.c.c, b.l.b.a.b.h):b.l.b.a.a.b.k");
    }
}
