package p005b.p096l.p164b.p165a.p169b;

import com.google.api.client.http.HttpHeaders;
import java.io.IOException;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.b.a.b.i */
public class C3680i extends IOException {
    public final int statusCode;

    /* renamed from: b.l.b.a.b.i$a */
    public static class C3681a {

        /* renamed from: a */
        public int f6795a;

        /* renamed from: b */
        public String f6796b;

        /* renamed from: c */
        public HttpHeaders f6797c;

        /* renamed from: d */
        public String f6798d;

        /* renamed from: e */
        public String f6799e;

        public C3681a(int i, String str, HttpHeaders httpHeaders) {
            C1960d.m2849t(i >= 0);
            this.f6795a = i;
            this.f6796b = str;
            Objects.requireNonNull(httpHeaders);
            this.f6797c = httpHeaders;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3680i(p005b.p096l.p164b.p165a.p169b.C3679h r5) {
        /*
            r4 = this;
            b.l.b.a.b.i$a r0 = new b.l.b.a.b.i$a
            int r1 = r5.f6789f
            java.lang.String r2 = r5.f6790g
            b.l.b.a.b.f r3 = r5.f6791h
            com.google.api.client.http.HttpHeaders r3 = r3.f6767c
            r0.<init>(r1, r2, r3)
            java.lang.String r1 = r5.mo14998f()     // Catch:{ IOException -> 0x0022, IllegalArgumentException -> 0x001d }
            r0.f6798d = r1     // Catch:{ IOException -> 0x0022, IllegalArgumentException -> 0x001d }
            int r1 = r1.length()     // Catch:{ IOException -> 0x0022, IllegalArgumentException -> 0x001d }
            if (r1 != 0) goto L_0x0026
            r1 = 0
            r0.f6798d = r1     // Catch:{ IOException -> 0x0022, IllegalArgumentException -> 0x001d }
            goto L_0x0026
        L_0x001d:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0026
        L_0x0022:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0026:
            java.lang.StringBuilder r5 = computeMessageBuffer(r5)
            java.lang.String r1 = r0.f6798d
            if (r1 == 0) goto L_0x0038
            java.lang.String r1 = p005b.p096l.p164b.p165a.p173d.C3746w.f6927a
            r5.append(r1)
            java.lang.String r1 = r0.f6798d
            r5.append(r1)
        L_0x0038:
            java.lang.String r5 = r5.toString()
            r0.f6799e = r5
            r4.<init>((p005b.p096l.p164b.p165a.p169b.C3680i.C3681a) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p164b.p165a.p169b.C3680i.<init>(b.l.b.a.b.h):void");
    }

    public C3680i(C3681a aVar) {
        super(aVar.f6799e);
        this.statusCode = aVar.f6795a;
    }

    public static StringBuilder computeMessageBuffer(C3679h hVar) {
        StringBuilder sb = new StringBuilder();
        int i = hVar.f6789f;
        if (i != 0) {
            sb.append(i);
        }
        String str = hVar.f6790g;
        if (str != null) {
            if (i != 0) {
                sb.append(' ');
            }
            sb.append(str);
        }
        return sb;
    }
}
