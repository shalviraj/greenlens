package p005b.p280p.p285b;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p285b.p286a0.C5134i;
import p435n.C8044h;

/* renamed from: b.p.b.f */
public final class C5228f {

    /* renamed from: b */
    public static final C5228f f10287b = new C5228f(new C5230b(), (C5229a) null);

    /* renamed from: a */
    public final Map<String, Set<C8044h>> f10288a;

    /* renamed from: b.p.b.f$b */
    public static final class C5230b {

        /* renamed from: a */
        public final Map<String, Set<C8044h>> f10289a = new LinkedHashMap();
    }

    public C5228f(C5230b bVar, C5229a aVar) {
        Map<String, Set<C8044h>> map = bVar.f10289a;
        byte[] bArr = C5134i.f9953a;
        this.f10288a = Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: b */
    public static String m9692b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder u = C0843a.m460u("sha1/");
            u.append(m9693c((X509Certificate) certificate).mo25955d());
            return u.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: c */
    public static C8044h m9693c(X509Certificate x509Certificate) {
        C8044h t = C8044h.m14840t(x509Certificate.getPublicKey().getEncoded());
        byte[] bArr = C5134i.f9953a;
        try {
            return C8044h.m14840t(MessageDigest.getInstance("SHA-1").digest(t.mo25967y()));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public void mo17133a(String str, List<Certificate> list) {
        Set set;
        Set<C8044h> set2 = this.f10288a.get(str);
        int indexOf = str.indexOf(46);
        if (indexOf != str.lastIndexOf(46)) {
            Map<String, Set<C8044h>> map = this.f10288a;
            StringBuilder u = C0843a.m460u("*.");
            u.append(str.substring(indexOf + 1));
            set = map.get(u.toString());
        } else {
            set = null;
        }
        if (set2 == null && set == null) {
            set2 = null;
        } else if (set2 != null && set != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(set2);
            linkedHashSet.addAll(set);
            set2 = linkedHashSet;
        } else if (set2 == null) {
            set2 = set;
        }
        if (set2 != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                if (!set2.contains(m9693c((X509Certificate) list.get(i)))) {
                    i++;
                } else {
                    return;
                }
            }
            StringBuilder y = C0843a.m464y("Certificate pinning failure!", "\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                y.append("\n    ");
                y.append(m9692b(x509Certificate));
                y.append(": ");
                y.append(x509Certificate.getSubjectDN().getName());
            }
            y.append("\n  Pinned certificates for ");
            y.append(str);
            y.append(":");
            for (C8044h d : set2) {
                y.append("\n    sha1/");
                y.append(d.mo25955d());
            }
            throw new SSLPeerUnverifiedException(y.toString());
        }
    }
}
