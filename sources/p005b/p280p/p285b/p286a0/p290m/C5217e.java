package p005b.p280p.p285b.p286a0.p290m;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.security.auth.x500.X500Principal;

/* renamed from: b.p.b.a0.m.e */
public final class C5217e implements C5218f {

    /* renamed from: a */
    public final Map<X500Principal, List<X509Certificate>> f10260a = new LinkedHashMap();

    public C5217e(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            List list = this.f10260a.get(subjectX500Principal);
            if (list == null) {
                list = new ArrayList(1);
                this.f10260a.put(subjectX500Principal, list);
            }
            list.add(x509Certificate);
        }
    }

    /* renamed from: a */
    public X509Certificate mo17120a(X509Certificate x509Certificate) {
        List<X509Certificate> list = this.f10260a.get(x509Certificate.getIssuerX500Principal());
        if (list == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : list) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
