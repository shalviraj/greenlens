package p421m.p422m0.p426g;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p336u.C6818a;
import p298d.p344x.p346c.C6888i;
import p421m.C7857k;
import p421m.C8002n;
import p421m.p422m0.C7867c;

/* renamed from: m.m0.g.b */
public final class C7882b {

    /* renamed from: a */
    public int f15655a;

    /* renamed from: b */
    public boolean f15656b;

    /* renamed from: c */
    public boolean f15657c;

    /* renamed from: d */
    public final List<C8002n> f15658d;

    public C7882b(List<C8002n> list) {
        C6888i.m12438e(list, "connectionSpecs");
        this.f15658d = list;
    }

    /* renamed from: a */
    public final C8002n mo25606a(SSLSocket sSLSocket) {
        C8002n nVar;
        boolean z;
        String[] strArr;
        String[] strArr2;
        C6888i.m12438e(sSLSocket, "sslSocket");
        int i = this.f15655a;
        int size = this.f15658d.size();
        while (true) {
            if (i >= size) {
                nVar = null;
                break;
            }
            nVar = this.f15658d.get(i);
            if (nVar.mo25802b(sSLSocket)) {
                this.f15655a = i + 1;
                break;
            }
            i++;
        }
        if (nVar != null) {
            int i2 = this.f15655a;
            int size2 = this.f15658d.size();
            while (true) {
                if (i2 >= size2) {
                    z = false;
                    break;
                } else if (this.f15658d.get(i2).mo25802b(sSLSocket)) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f15656b = z;
            boolean z2 = this.f15657c;
            C6888i.m12438e(sSLSocket, "sslSocket");
            if (nVar.f16050c != null) {
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                C6888i.m12437d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
                String[] strArr3 = nVar.f16050c;
                C7857k.C7859b bVar = C7857k.f15602t;
                Comparator<String> comparator = C7857k.f15584b;
                strArr = C7867c.m14295p(enabledCipherSuites, strArr3, C7857k.f15584b);
            } else {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            if (nVar.f16051d != null) {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                C6888i.m12437d(enabledProtocols, "sslSocket.enabledProtocols");
                strArr2 = C7867c.m14295p(enabledProtocols, nVar.f16051d, C6818a.f13743g);
            } else {
                strArr2 = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            C6888i.m12437d(supportedCipherSuites, "supportedCipherSuites");
            C7857k.C7859b bVar2 = C7857k.f15602t;
            Comparator<String> comparator2 = C7857k.f15584b;
            Comparator<String> comparator3 = C7857k.f15584b;
            byte[] bArr = C7867c.f15619a;
            C6888i.m12438e(supportedCipherSuites, "$this$indexOf");
            C6888i.m12438e("TLS_FALLBACK_SCSV", "value");
            C6888i.m12438e(comparator3, "comparator");
            int length = supportedCipherSuites.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                if (((C7857k.C7858a) comparator3).compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                }
                i3++;
            }
            if (z2 && i3 != -1) {
                C6888i.m12437d(strArr, "cipherSuitesIntersection");
                String str = supportedCipherSuites[i3];
                C6888i.m12437d(str, "supportedCipherSuites[indexOfFallbackScsv]");
                C6888i.m12438e(strArr, "$this$concat");
                C6888i.m12438e(str, "value");
                Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
                C6888i.m12437d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                strArr = (String[]) copyOf;
                strArr[C5266a.m9790D1(strArr)] = str;
            }
            C8002n.C8003a aVar = new C8002n.C8003a(nVar);
            C6888i.m12437d(strArr, "cipherSuitesIntersection");
            aVar.mo25808b((String[]) Arrays.copyOf(strArr, strArr.length));
            C6888i.m12437d(strArr2, "tlsVersionsIntersection");
            aVar.mo25811e((String[]) Arrays.copyOf(strArr2, strArr2.length));
            C8002n a = aVar.mo25807a();
            if (a.mo25803c() != null) {
                sSLSocket.setEnabledProtocols(a.f16051d);
            }
            if (a.mo25801a() != null) {
                sSLSocket.setEnabledCipherSuites(a.f16050c);
            }
            return nVar;
        }
        StringBuilder u = C0843a.m460u("Unable to find acceptable protocols. isFallback=");
        u.append(this.f15657c);
        u.append(',');
        u.append(" modes=");
        u.append(this.f15658d);
        u.append(',');
        u.append(" supported protocols=");
        String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
        C6888i.m12436c(enabledProtocols2);
        String arrays = Arrays.toString(enabledProtocols2);
        C6888i.m12437d(arrays, "java.util.Arrays.toString(this)");
        u.append(arrays);
        throw new UnknownServiceException(u.toString());
    }
}
