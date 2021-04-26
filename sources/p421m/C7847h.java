package p421m;

import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6905z;
import p298d.p344x.p346c.p347a0.C6875a;
import p298d.p344x.p346c.p347a0.C6876b;
import p298d.p415c0.C7694h;
import p421m.p422m0.p433m.C7999c;
import p435n.C8044h;

/* renamed from: m.h */
public final class C7847h {

    /* renamed from: c */
    public static final C7847h f15545c = new C7847h(C6790h.m12349e0(new ArrayList()), (C7999c) null, 2);

    /* renamed from: d */
    public static final C7848a f15546d = new C7848a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final Set<C7849b> f15547a;

    /* renamed from: b */
    public final C7999c f15548b;

    /* renamed from: m.h$a */
    public static final class C7848a {
        public C7848a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: a */
        public final String mo25550a(Certificate certificate) {
            C6888i.m12438e(certificate, "certificate");
            return "sha256/" + mo25551b((X509Certificate) certificate).mo25955d();
        }

        /* renamed from: b */
        public final C8044h mo25551b(X509Certificate x509Certificate) {
            C6888i.m12438e(x509Certificate, "$this$sha256Hash");
            C8044h.C8045a aVar = C8044h.f16143k;
            PublicKey publicKey = x509Certificate.getPublicKey();
            C6888i.m12437d(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C6888i.m12437d(encoded, "publicKey.encoded");
            return C8044h.C8045a.m14853c(aVar, encoded, 0, 0, 3).mo25958i("SHA-256");
        }
    }

    /* renamed from: m.h$b */
    public static final class C7849b {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7849b)) {
                return false;
            }
            C7849b bVar = (C7849b) obj;
            Objects.requireNonNull(bVar);
            if (!C6888i.m12434a((Object) null, (Object) null)) {
                return false;
            }
            Objects.requireNonNull(bVar);
            if (!C6888i.m12434a((Object) null, (Object) null)) {
                return false;
            }
            Objects.requireNonNull(bVar);
            return !(C6888i.m12434a((Object) null, (Object) null) ^ true);
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append((String) null);
            sb.append('/');
            throw null;
        }
    }

    public C7847h(Set<C7849b> set, C7999c cVar) {
        C6888i.m12438e(set, "pins");
        this.f15547a = set;
        this.f15548b = cVar;
    }

    public C7847h(Set set, C7999c cVar, int i) {
        int i2 = i & 2;
        C6888i.m12438e(set, "pins");
        this.f15547a = set;
        this.f15548b = null;
    }

    /* renamed from: a */
    public final void mo25546a(String str, C6851a<? extends List<? extends X509Certificate>> aVar) {
        C6888i.m12438e(str, "hostname");
        C6888i.m12438e(aVar, "cleanedPeerCertificatesFn");
        C6888i.m12438e(str, "hostname");
        Set<C7849b> set = this.f15547a;
        List<C7849b> list = C6798p.f13713g;
        for (T next : set) {
            Objects.requireNonNull((C7849b) next);
            C6888i.m12438e(str, "hostname");
            if (C7694h.m13910A((String) null, "**.", false, 2)) {
                throw null;
            } else if (C7694h.m13910A((String) null, "*.", false, 2)) {
                throw null;
            } else if (C6888i.m12434a(str, (Object) null)) {
                if (list.isEmpty()) {
                    list = new ArrayList<>();
                }
                if (!(list instanceof C6875a) || (list instanceof C6876b)) {
                    list.add(next);
                } else {
                    C6905z.m12474c(list, "kotlin.collections.MutableList");
                    throw null;
                }
            }
        }
        if (!list.isEmpty()) {
            List<X509Certificate> list2 = (List) aVar.invoke();
            for (X509Certificate x509Certificate : list2) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    Objects.requireNonNull((C7849b) it.next());
                    throw null;
                }
            }
            StringBuilder y = C0843a.m464y("Certificate pinning failure!", "\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list2) {
                y.append("\n    ");
                C6888i.m12438e(x509Certificate2, "certificate");
                StringBuilder sb = new StringBuilder();
                sb.append("sha256/");
                C6888i.m12438e(x509Certificate2, "$this$sha256Hash");
                C8044h.C8045a aVar2 = C8044h.f16143k;
                PublicKey publicKey = x509Certificate2.getPublicKey();
                C6888i.m12437d(publicKey, "publicKey");
                byte[] encoded = publicKey.getEncoded();
                C6888i.m12437d(encoded, "publicKey.encoded");
                sb.append(C8044h.C8045a.m14853c(aVar2, encoded, 0, 0, 3).mo25958i("SHA-256").mo25955d());
                y.append(sb.toString());
                y.append(": ");
                Principal subjectDN = x509Certificate2.getSubjectDN();
                C6888i.m12437d(subjectDN, "element.subjectDN");
                y.append(subjectDN.getName());
            }
            y.append("\n  Pinned certificates for ");
            y.append(str);
            y.append(":");
            for (C7849b append : list) {
                y.append("\n    ");
                y.append(append);
            }
            String sb2 = y.toString();
            C6888i.m12437d(sb2, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb2);
        }
    }

    /* renamed from: b */
    public final C7847h mo25547b(C7999c cVar) {
        C6888i.m12438e(cVar, "certificateChainCleaner");
        return C6888i.m12434a(this.f15548b, cVar) ? this : new C7847h(this.f15547a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7847h) {
            C7847h hVar = (C7847h) obj;
            return C6888i.m12434a(hVar.f15547a, this.f15547a) && C6888i.m12434a(hVar.f15548b, this.f15548b);
        }
    }

    public int hashCode() {
        int hashCode = (this.f15547a.hashCode() + 1517) * 41;
        C7999c cVar = this.f15548b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
