package p421m.p422m0.p433m;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p298d.p334t.C6798p;
import p298d.p344x.p346c.C6888i;

/* renamed from: m.m0.m.d */
public final class C8000d implements HostnameVerifier {

    /* renamed from: a */
    public static final C8000d f16043a = new C8000d();

    /* renamed from: a */
    public final List<String> mo25798a(X509Certificate x509Certificate, int i) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C6798p.f13713g;
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (!(!C6888i.m12434a(next.get(0), Integer.valueOf(i)))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C6798p.f13713g;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0132 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25799b(java.lang.String r13, java.security.cert.X509Certificate r14) {
        /*
            r12 = this;
            java.lang.String r0 = "host"
            p298d.p344x.p346c.C6888i.m12438e(r13, r0)
            java.lang.String r0 = "certificate"
            p298d.p344x.p346c.C6888i.m12438e(r14, r0)
            byte[] r0 = p421m.p422m0.C7867c.f15619a
            java.lang.String r0 = "$this$canParseAsIpAddress"
            p298d.p344x.p346c.C6888i.m12438e(r13, r0)
            d.c0.d r0 = p421m.p422m0.C7867c.f15624f
            boolean r0 = r0.mo25278a(r13)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0048
            java.lang.String r13 = p005b.p291q.p292a.C5266a.m10024r4(r13)
            r0 = 7
            java.util.List r14 = r12.mo25798a(r14, r0)
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x002c
            goto L_0x0133
        L_0x002c:
            java.util.Iterator r14 = r14.iterator()
        L_0x0030:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0133
            java.lang.Object r0 = r14.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = p005b.p291q.p292a.C5266a.m10024r4(r0)
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r13, r0)
            if (r0 == 0) goto L_0x0030
            goto L_0x0132
        L_0x0048:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = "Locale.US"
            p298d.p344x.p346c.C6888i.m12437d(r0, r3)
            java.lang.String r13 = r13.toLowerCase(r0)
            java.lang.String r0 = "(this as java.lang.String).toLowerCase(locale)"
            p298d.p344x.p346c.C6888i.m12437d(r13, r0)
            r4 = 2
            java.util.List r14 = r12.mo25798a(r14, r4)
            boolean r5 = r14.isEmpty()
            if (r5 == 0) goto L_0x0065
            goto L_0x0133
        L_0x0065:
            java.util.Iterator r14 = r14.iterator()
        L_0x0069:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x0133
            java.lang.Object r5 = r14.next()
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r13.length()
            if (r6 != 0) goto L_0x007d
            r6 = r2
            goto L_0x007e
        L_0x007d:
            r6 = r1
        L_0x007e:
            if (r6 != 0) goto L_0x012f
            java.lang.String r6 = "."
            boolean r7 = p298d.p415c0.C7694h.m13910A(r13, r6, r1, r4)
            if (r7 != 0) goto L_0x012f
            java.lang.String r7 = ".."
            boolean r8 = p298d.p415c0.C7694h.m13927e(r13, r7, r1, r4)
            if (r8 == 0) goto L_0x0092
            goto L_0x012f
        L_0x0092:
            if (r5 == 0) goto L_0x009d
            int r8 = r5.length()
            if (r8 != 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r8 = r1
            goto L_0x009e
        L_0x009d:
            r8 = r2
        L_0x009e:
            if (r8 != 0) goto L_0x012f
            boolean r8 = p298d.p415c0.C7694h.m13910A(r5, r6, r1, r4)
            if (r8 != 0) goto L_0x012f
            boolean r7 = p298d.p415c0.C7694h.m13927e(r5, r7, r1, r4)
            if (r7 == 0) goto L_0x00ae
            goto L_0x012f
        L_0x00ae:
            boolean r7 = p298d.p415c0.C7694h.m13927e(r13, r6, r1, r4)
            if (r7 != 0) goto L_0x00b9
            java.lang.String r7 = p005b.p035e.p036a.p037a.C0843a.m451l(r13, r6)
            goto L_0x00ba
        L_0x00b9:
            r7 = r13
        L_0x00ba:
            boolean r8 = p298d.p415c0.C7694h.m13927e(r5, r6, r1, r4)
            if (r8 != 0) goto L_0x00c4
            java.lang.String r5 = p005b.p035e.p036a.p037a.C0843a.m451l(r5, r6)
        L_0x00c4:
            java.util.Locale r6 = java.util.Locale.US
            p298d.p344x.p346c.C6888i.m12437d(r6, r3)
            java.lang.String r8 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r5, r8)
            java.lang.String r5 = r5.toLowerCase(r6)
            p298d.p344x.p346c.C6888i.m12437d(r5, r0)
            java.lang.String r6 = "*"
            boolean r6 = p298d.p415c0.C7694h.m13926d(r5, r6, r1, r4)
            if (r6 != 0) goto L_0x00e2
            boolean r5 = p298d.p344x.p346c.C6888i.m12434a(r7, r5)
            goto L_0x0130
        L_0x00e2:
            java.lang.String r6 = "*."
            boolean r8 = p298d.p415c0.C7694h.m13910A(r5, r6, r1, r4)
            if (r8 == 0) goto L_0x012f
            r8 = 42
            r9 = 4
            int r8 = p298d.p415c0.C7694h.m13933k(r5, r8, r2, r1, r9)
            r10 = -1
            if (r8 == r10) goto L_0x00f5
            goto L_0x012f
        L_0x00f5:
            int r8 = r7.length()
            int r11 = r5.length()
            if (r8 >= r11) goto L_0x0100
            goto L_0x012f
        L_0x0100:
            boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r6, r5)
            if (r6 == 0) goto L_0x0107
            goto L_0x012f
        L_0x0107:
            java.lang.String r5 = r5.substring(r2)
            java.lang.String r6 = "(this as java.lang.String).substring(startIndex)"
            p298d.p344x.p346c.C6888i.m12437d(r5, r6)
            boolean r6 = p298d.p415c0.C7694h.m13927e(r7, r5, r1, r4)
            if (r6 != 0) goto L_0x0117
            goto L_0x012f
        L_0x0117:
            int r6 = r7.length()
            int r5 = r5.length()
            int r6 = r6 - r5
            if (r6 <= 0) goto L_0x012d
            r5 = 46
            int r6 = r6 + -1
            int r5 = p298d.p415c0.C7694h.m13937o(r7, r5, r6, r1, r9)
            if (r5 == r10) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r5 = r2
            goto L_0x0130
        L_0x012f:
            r5 = r1
        L_0x0130:
            if (r5 == 0) goto L_0x0069
        L_0x0132:
            r1 = r2
        L_0x0133:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p433m.C8000d.mo25799b(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public boolean verify(String str, SSLSession sSLSession) {
        C6888i.m12438e(str, "host");
        C6888i.m12438e(sSLSession, "session");
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return mo25799b(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
