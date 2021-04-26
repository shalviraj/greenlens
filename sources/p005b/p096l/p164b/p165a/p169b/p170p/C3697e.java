package p005b.p096l.p164b.p165a.p169b.p170p;

import com.google.api.client.http.HttpTransport;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import javax.net.ssl.HttpsURLConnection;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p164b.p165a.p169b.C3683k;

/* renamed from: b.l.b.a.b.p.e */
public final class C3697e extends HttpTransport {

    /* renamed from: d */
    public static final String[] f6827d;

    /* renamed from: c */
    public final C3689a f6828c;

    static {
        String[] strArr = {"DELETE", "GET", "HEAD", "OPTIONS", "POST", "PUT", "TRACE"};
        f6827d = strArr;
        Arrays.sort(strArr);
    }

    public C3697e() {
        this.f6828c = System.getProperty("com.google.api.client.should_use_proxy") != null ? new C3690b(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("https.proxyHost"), Integer.parseInt(System.getProperty("https.proxyPort"))))) : new C3690b();
    }

    /* renamed from: a */
    public C3683k mo15022a(String str, String str2) {
        C1960d.m2845s(Arrays.binarySearch(f6827d, str) >= 0, "HTTP method %s not supported", str);
        HttpURLConnection a = this.f6828c.mo15015a(new URL(str2));
        a.setRequestMethod(str);
        if (a instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) a;
        }
        return new C3691c(a);
    }
}
