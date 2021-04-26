package p421m;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6764f;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p421m.p422m0.C7867c;

/* renamed from: m.x */
public final class C8020x {

    /* renamed from: a */
    public final C6764f f16092a;

    /* renamed from: b */
    public final C7862l0 f16093b;

    /* renamed from: c */
    public final C7857k f16094c;

    /* renamed from: d */
    public final List<Certificate> f16095d;

    /* renamed from: m.x$a */
    public static final class C8021a extends C6890k implements C6851a<List<? extends Certificate>> {

        /* renamed from: g */
        public final /* synthetic */ C6851a f16096g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8021a(C6851a aVar) {
            super(0);
            this.f16096g = aVar;
        }

        public Object invoke() {
            try {
                return (List) this.f16096g.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return C6798p.f13713g;
            }
        }
    }

    public C8020x(C7862l0 l0Var, C7857k kVar, List<? extends Certificate> list, C6851a<? extends List<? extends Certificate>> aVar) {
        C6888i.m12438e(l0Var, "tlsVersion");
        C6888i.m12438e(kVar, "cipherSuite");
        C6888i.m12438e(list, "localCertificates");
        C6888i.m12438e(aVar, "peerCertificatesFn");
        this.f16093b = l0Var;
        this.f16094c = kVar;
        this.f16095d = list;
        this.f16092a = C5266a.m9890U2(new C8021a(aVar));
    }

    /* renamed from: a */
    public static final C8020x m14696a(SSLSession sSLSession) {
        List list;
        C6888i.m12438e(sSLSession, "$this$handshake");
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            int hashCode = cipherSuite.hashCode();
            if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(C0843a.m451l("cipherSuite == ", cipherSuite));
            }
            C7857k b = C7857k.f15602t.mo25575b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            } else if (!C6888i.m12434a("NONE", protocol)) {
                C7862l0 a = C7862l0.f15613n.mo25581a(protocol);
                try {
                    Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                    list = peerCertificates != null ? C7867c.m14291l((Certificate[]) Arrays.copyOf(peerCertificates, peerCertificates.length)) : C6798p.f13713g;
                } catch (SSLPeerUnverifiedException unused) {
                    list = C6798p.f13713g;
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new C8020x(a, b, localCertificates != null ? C7867c.m14291l((Certificate[]) Arrays.copyOf(localCertificates, localCertificates.length)) : C6798p.f13713g, new C8019w(list));
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IllegalStateException("cipherSuite == null".toString());
        }
    }

    /* renamed from: b */
    public final String mo25831b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        C6888i.m12437d(type, "type");
        return type;
    }

    /* renamed from: c */
    public final List<Certificate> mo25832c() {
        return (List) this.f16092a.getValue();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8020x) {
            C8020x xVar = (C8020x) obj;
            return xVar.f16093b == this.f16093b && C6888i.m12434a(xVar.f16094c, this.f16094c) && C6888i.m12434a(xVar.mo25832c(), mo25832c()) && C6888i.m12434a(xVar.f16095d, this.f16095d);
        }
    }

    public int hashCode() {
        int hashCode = this.f16094c.hashCode();
        int hashCode2 = mo25832c().hashCode();
        return this.f16095d.hashCode() + ((hashCode2 + ((hashCode + ((this.f16093b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public String toString() {
        List<Certificate> c = mo25832c();
        ArrayList arrayList = new ArrayList(C5266a.m9892V(c, 10));
        for (Certificate b : c) {
            arrayList.add(mo25831b(b));
        }
        String obj = arrayList.toString();
        StringBuilder y = C0843a.m464y("Handshake{", "tlsVersion=");
        y.append(this.f16093b);
        y.append(' ');
        y.append("cipherSuite=");
        y.append(this.f16094c);
        y.append(' ');
        y.append("peerCertificates=");
        y.append(obj);
        y.append(' ');
        y.append("localCertificates=");
        List<Certificate> list = this.f16095d;
        ArrayList arrayList2 = new ArrayList(C5266a.m9892V(list, 10));
        for (Certificate b2 : list) {
            arrayList2.add(mo25831b(b2));
        }
        y.append(arrayList2);
        y.append('}');
        return y.toString();
    }
}
