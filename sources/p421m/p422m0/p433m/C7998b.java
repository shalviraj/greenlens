package p421m.p422m0.p433m;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import p298d.p344x.p346c.C6888i;

/* renamed from: m.m0.m.b */
public final class C7998b implements C8001e {

    /* renamed from: a */
    public final Map<X500Principal, Set<X509Certificate>> f16042a;

    public C7998b(X509Certificate... x509CertificateArr) {
        C6888i.m12438e(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            C6888i.m12437d(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f16042a = linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.security.cert.X509Certificate} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.security.cert.X509Certificate mo25761a(java.security.cert.X509Certificate r5) {
        /*
            r4 = this;
            java.lang.String r0 = "cert"
            p298d.p344x.p346c.C6888i.m12438e(r5, r0)
            javax.security.auth.x500.X500Principal r0 = r5.getIssuerX500Principal()
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r1 = r4.f16042a
            java.lang.Object r0 = r1.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            r1 = 0
            if (r0 == 0) goto L_0x0034
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            java.security.PublicKey r3 = r3.getPublicKey()     // Catch:{ Exception -> 0x002e }
            r5.verify(r3)     // Catch:{ Exception -> 0x002e }
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            if (r3 == 0) goto L_0x0018
            r1 = r2
        L_0x0032:
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p433m.C7998b.mo25761a(java.security.cert.X509Certificate):java.security.cert.X509Certificate");
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C7998b) && C6888i.m12434a(((C7998b) obj).f16042a, this.f16042a));
    }

    public int hashCode() {
        return this.f16042a.hashCode();
    }
}
