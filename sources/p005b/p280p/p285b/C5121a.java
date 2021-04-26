package p005b.p280p.p285b;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p285b.C5245o;
import p005b.p280p.p285b.p286a0.C5134i;

/* renamed from: b.p.b.a */
public final class C5121a {

    /* renamed from: a */
    public final C5245o f9914a;

    /* renamed from: b */
    public final C5239l f9915b;

    /* renamed from: c */
    public final SocketFactory f9916c;

    /* renamed from: d */
    public final C5219b f9917d;

    /* renamed from: e */
    public final List<C5254s> f9918e;

    /* renamed from: f */
    public final List<C5235j> f9919f;

    /* renamed from: g */
    public final ProxySelector f9920g;

    /* renamed from: h */
    public final Proxy f9921h;

    /* renamed from: i */
    public final SSLSocketFactory f9922i;

    /* renamed from: j */
    public final HostnameVerifier f9923j;

    /* renamed from: k */
    public final C5228f f9924k;

    public C5121a(String str, int i, C5239l lVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C5228f fVar, C5219b bVar, Proxy proxy, List<C5254s> list, List<C5235j> list2, ProxySelector proxySelector) {
        String str2 = str;
        int i2 = i;
        C5239l lVar2 = lVar;
        SocketFactory socketFactory2 = socketFactory;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        C5219b bVar2 = bVar;
        ProxySelector proxySelector2 = proxySelector;
        C5245o.C5247b bVar3 = new C5245o.C5247b();
        String str3 = "https";
        String str4 = sSLSocketFactory2 != null ? str3 : "http";
        if (str4.equalsIgnoreCase("http")) {
            str3 = "http";
        } else if (!str4.equalsIgnoreCase(str3)) {
            throw new IllegalArgumentException(C0843a.m451l("unexpected scheme: ", str4));
        }
        bVar3.f10429a = str3;
        if (str2 != null) {
            String d = C5245o.C5247b.m9735d(str, 0, str.length());
            if (d != null) {
                bVar3.f10432d = d;
                if (i2 <= 0 || i2 > 65535) {
                    throw new IllegalArgumentException(C0843a.m444e("unexpected port: ", i));
                }
                bVar3.f10433e = i2;
                this.f9914a = bVar3.mo17177c();
                if (lVar2 != null) {
                    this.f9915b = lVar2;
                    if (socketFactory2 != null) {
                        this.f9916c = socketFactory2;
                        if (bVar2 != null) {
                            this.f9917d = bVar2;
                            if (list != null) {
                                this.f9918e = C5134i.m9463h(list);
                                if (list2 != null) {
                                    this.f9919f = C5134i.m9463h(list2);
                                    if (proxySelector2 != null) {
                                        this.f9920g = proxySelector2;
                                        this.f9921h = proxy;
                                        this.f9922i = sSLSocketFactory2;
                                        this.f9923j = hostnameVerifier;
                                        this.f9924k = fVar;
                                        return;
                                    }
                                    throw new IllegalArgumentException("proxySelector == null");
                                }
                                throw new IllegalArgumentException("connectionSpecs == null");
                            }
                            throw new IllegalArgumentException("protocols == null");
                        }
                        throw new IllegalArgumentException("authenticator == null");
                    }
                    throw new IllegalArgumentException("socketFactory == null");
                }
                throw new IllegalArgumentException("dns == null");
            }
            throw new IllegalArgumentException(C0843a.m451l("unexpected host: ", str));
        }
        throw new IllegalArgumentException("host == null");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5121a)) {
            return false;
        }
        C5121a aVar = (C5121a) obj;
        return this.f9914a.equals(aVar.f9914a) && this.f9915b.equals(aVar.f9915b) && this.f9917d.equals(aVar.f9917d) && this.f9918e.equals(aVar.f9918e) && this.f9919f.equals(aVar.f9919f) && this.f9920g.equals(aVar.f9920g) && C5134i.m9461f(this.f9921h, aVar.f9921h) && C5134i.m9461f(this.f9922i, aVar.f9922i) && C5134i.m9461f(this.f9923j, aVar.f9923j) && C5134i.m9461f(this.f9924k, aVar.f9924k);
    }

    public int hashCode() {
        int hashCode = this.f9915b.hashCode();
        int hashCode2 = (this.f9920g.hashCode() + ((this.f9919f.hashCode() + ((this.f9918e.hashCode() + ((this.f9917d.hashCode() + ((hashCode + ((this.f9914a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.f9921h;
        int i = 0;
        int hashCode3 = (hashCode2 + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f9922i;
        int hashCode4 = (hashCode3 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f9923j;
        int hashCode5 = (hashCode4 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C5228f fVar = this.f9924k;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode5 + i;
    }
}
