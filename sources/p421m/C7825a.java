package p421m;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;
import p421m.C8025z;
import p421m.p422m0.C7867c;

/* renamed from: m.a */
public final class C7825a {

    /* renamed from: a */
    public final C8025z f15435a;

    /* renamed from: b */
    public final List<C7835d0> f15436b;

    /* renamed from: c */
    public final List<C8002n> f15437c;

    /* renamed from: d */
    public final C8013t f15438d;

    /* renamed from: e */
    public final SocketFactory f15439e;

    /* renamed from: f */
    public final SSLSocketFactory f15440f;

    /* renamed from: g */
    public final HostnameVerifier f15441g;

    /* renamed from: h */
    public final C7847h f15442h;

    /* renamed from: i */
    public final C7830c f15443i;

    /* renamed from: j */
    public final Proxy f15444j = null;

    /* renamed from: k */
    public final ProxySelector f15445k;

    public C7825a(String str, int i, C8013t tVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C7847h hVar, C7830c cVar, Proxy proxy, List<? extends C7835d0> list, List<C8002n> list2, ProxySelector proxySelector) {
        String str2 = str;
        int i2 = i;
        SocketFactory socketFactory2 = socketFactory;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        C7830c cVar2 = cVar;
        ProxySelector proxySelector2 = proxySelector;
        C6888i.m12438e(str, "uriHost");
        C6888i.m12438e(tVar, "dns");
        C6888i.m12438e(socketFactory2, "socketFactory");
        C6888i.m12438e(cVar2, "proxyAuthenticator");
        C6888i.m12438e(list, "protocols");
        C6888i.m12438e(list2, "connectionSpecs");
        C6888i.m12438e(proxySelector2, "proxySelector");
        this.f15438d = tVar;
        this.f15439e = socketFactory2;
        this.f15440f = sSLSocketFactory2;
        this.f15441g = hostnameVerifier;
        this.f15442h = hVar;
        this.f15443i = cVar2;
        this.f15445k = proxySelector2;
        C8025z.C8026a aVar = new C8025z.C8026a();
        String str3 = "https";
        String str4 = sSLSocketFactory2 != null ? str3 : "http";
        C6888i.m12438e(str4, "scheme");
        boolean z = true;
        if (C7694h.m13928f(str4, "http", true)) {
            str3 = "http";
        } else if (!C7694h.m13928f(str4, str3, true)) {
            throw new IllegalArgumentException(C0843a.m451l("unexpected scheme: ", str4));
        }
        aVar.f16113a = str3;
        C6888i.m12438e(str, "host");
        String r4 = C5266a.m10024r4(C8025z.C8028b.m14721d(C8025z.f16101l, str, 0, 0, false, 7));
        if (r4 != null) {
            aVar.f16116d = r4;
            if ((1 > i2 || 65535 < i2) ? false : z) {
                aVar.f16117e = i2;
                this.f15435a = aVar.mo25861a();
                this.f15436b = C7867c.m14304y(list);
                this.f15437c = C7867c.m14304y(list2);
                return;
            }
            throw new IllegalArgumentException(C0843a.m444e("unexpected port: ", i).toString());
        }
        throw new IllegalArgumentException(C0843a.m451l("unexpected host: ", str));
    }

    /* renamed from: a */
    public final boolean mo25516a(C7825a aVar) {
        C6888i.m12438e(aVar, "that");
        return C6888i.m12434a(this.f15438d, aVar.f15438d) && C6888i.m12434a(this.f15443i, aVar.f15443i) && C6888i.m12434a(this.f15436b, aVar.f15436b) && C6888i.m12434a(this.f15437c, aVar.f15437c) && C6888i.m12434a(this.f15445k, aVar.f15445k) && C6888i.m12434a(this.f15444j, aVar.f15444j) && C6888i.m12434a(this.f15440f, aVar.f15440f) && C6888i.m12434a(this.f15441g, aVar.f15441g) && C6888i.m12434a(this.f15442h, aVar.f15442h) && this.f15435a.f16107f == aVar.f15435a.f16107f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7825a) {
            C7825a aVar = (C7825a) obj;
            return C6888i.m12434a(this.f15435a, aVar.f15435a) && mo25516a(aVar);
        }
    }

    public int hashCode() {
        int hashCode = this.f15438d.hashCode();
        int hashCode2 = this.f15443i.hashCode();
        int hashCode3 = this.f15436b.hashCode();
        int hashCode4 = this.f15437c.hashCode();
        int hashCode5 = this.f15445k.hashCode();
        int hashCode6 = Objects.hashCode(this.f15444j);
        int hashCode7 = Objects.hashCode(this.f15440f);
        int hashCode8 = Objects.hashCode(this.f15441g);
        return Objects.hashCode(this.f15442h) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f15435a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        Object obj;
        StringBuilder sb;
        StringBuilder u = C0843a.m460u("Address{");
        u.append(this.f15435a.f16106e);
        u.append(':');
        u.append(this.f15435a.f16107f);
        u.append(", ");
        if (this.f15444j != null) {
            sb = C0843a.m460u("proxy=");
            obj = this.f15444j;
        } else {
            sb = C0843a.m460u("proxySelector=");
            obj = this.f15445k;
        }
        sb.append(obj);
        u.append(sb.toString());
        u.append("}");
        return u.toString();
    }
}
