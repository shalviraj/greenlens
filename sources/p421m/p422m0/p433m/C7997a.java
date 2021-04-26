package p421m.p422m0.p433m;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import p298d.p344x.p346c.C6888i;

/* renamed from: m.m0.m.a */
public final class C7997a extends C7999c {

    /* renamed from: a */
    public final C8001e f16041a;

    public C7997a(C8001e eVar) {
        C6888i.m12438e(eVar, "trustRootIndex");
        this.f16041a = eVar;
    }

    /* renamed from: a */
    public List<Certificate> mo25782a(List<? extends Certificate> list, String str) {
        C6888i.m12438e(list, "chain");
        C6888i.m12438e(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        C6888i.m12437d(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a = this.f16041a.mo25761a(x509Certificate);
            if (a != null) {
                if (arrayList.size() > 1 || (!C6888i.m12434a(x509Certificate, a))) {
                    arrayList.add(a);
                }
                if (mo25793b(a, a)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                C6888i.m12437d(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    Objects.requireNonNull(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (mo25793b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    /* renamed from: b */
    public final boolean mo25793b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!C6888i.m12434a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C7997a) && C6888i.m12434a(((C7997a) obj).f16041a, this.f16041a);
    }

    public int hashCode() {
        return this.f16041a.hashCode();
    }
}
