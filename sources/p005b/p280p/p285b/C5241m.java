package p005b.p280p.p285b;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p005b.p280p.p285b.p286a0.C5134i;

/* renamed from: b.p.b.m */
public final class C5241m {

    /* renamed from: a */
    public final String f10414a;

    /* renamed from: b */
    public final List<Certificate> f10415b;

    /* renamed from: c */
    public final List<Certificate> f10416c;

    public C5241m(String str, List<Certificate> list, List<Certificate> list2) {
        this.f10414a = str;
        this.f10415b = list;
        this.f10416c = list2;
    }

    /* renamed from: a */
    public static C5241m m9706a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            try {
                certificateArr = sSLSession.getPeerCertificates();
            } catch (SSLPeerUnverifiedException unused) {
                certificateArr = null;
            }
            List i = certificateArr != null ? C5134i.m9464i(certificateArr) : Collections.emptyList();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new C5241m(cipherSuite, i, localCertificates != null ? C5134i.m9464i(localCertificates) : Collections.emptyList());
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5241m)) {
            return false;
        }
        C5241m mVar = (C5241m) obj;
        return this.f10414a.equals(mVar.f10414a) && this.f10415b.equals(mVar.f10415b) && this.f10416c.equals(mVar.f10416c);
    }

    public int hashCode() {
        int hashCode = this.f10415b.hashCode();
        return this.f10416c.hashCode() + ((hashCode + ((this.f10414a.hashCode() + 527) * 31)) * 31);
    }
}
