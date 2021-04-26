package p005b.p280p.p285b.p286a0.p288k;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4805c3;
import p005b.p280p.p285b.C5219b;
import p005b.p280p.p285b.C5231g;
import p005b.p280p.p285b.C5242n;
import p005b.p280p.p285b.C5245o;
import p005b.p280p.p285b.C5255t;
import p005b.p280p.p285b.C5260w;
import p005b.p280p.p285b.p286a0.C5127f;

/* renamed from: b.p.b.a0.k.j */
public final class C5204j {

    /* renamed from: a */
    public static final Comparator<String> f10205a = new C5205a();

    /* renamed from: b */
    public static final String f10206b = "OkHttp";

    /* renamed from: c */
    public static final String f10207c = C0843a.m451l("OkHttp", "-Sent-Millis");

    /* renamed from: d */
    public static final String f10208d = C0843a.m451l("OkHttp", "-Received-Millis");

    /* renamed from: b.p.b.a0.k.j$a */
    public static class C5205a implements Comparator<String> {
        public int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
        }
    }

    static {
        Objects.requireNonNull(C5127f.f9935a);
    }

    /* renamed from: a */
    public static long m9650a(C5242n nVar) {
        String a = nVar.mo17153a("Content-Length");
        if (a == null) {
            return -1;
        }
        try {
            return Long.parseLong(a);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static boolean m9651b(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    /* renamed from: c */
    public static C5255t m9652c(C5219b bVar, C5260w wVar, Proxy proxy) {
        C5260w wVar2 = wVar;
        Proxy proxy2 = proxy;
        int i = 0;
        if (wVar2.f10497c == 407) {
            C5182a aVar = (C5182a) bVar;
            Objects.requireNonNull(aVar);
            List<C5231g> b = wVar.mo17200b();
            C5255t tVar = wVar2.f10495a;
            C5245o oVar = tVar.f10479a;
            int size = b.size();
            while (i < size) {
                C5231g gVar = b.get(i);
                if ("Basic".equalsIgnoreCase(gVar.f10290a)) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                    String hostName = inetSocketAddress.getHostName();
                    InetAddress a = aVar.mo17070a(proxy2, oVar);
                    int port = inetSocketAddress.getPort();
                    String str = oVar.f10420a;
                    String str2 = gVar.f10291b;
                    String str3 = gVar.f10290a;
                    try {
                        PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, a, port, str, str2, str3, new URL(oVar.f10428i), Authenticator.RequestorType.PROXY);
                        if (requestPasswordAuthentication != null) {
                            String a2 = C4805c3.m8802a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()));
                            C5255t.C5257b c = tVar.mo17192c();
                            c.mo17196b("Proxy-Authorization", a2);
                            return c.mo17195a();
                        }
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                }
                i++;
            }
        } else {
            C5182a aVar2 = (C5182a) bVar;
            Objects.requireNonNull(aVar2);
            List<C5231g> b2 = wVar.mo17200b();
            C5255t tVar2 = wVar2.f10495a;
            C5245o oVar2 = tVar2.f10479a;
            int size2 = b2.size();
            while (i < size2) {
                C5231g gVar2 = b2.get(i);
                if ("Basic".equalsIgnoreCase(gVar2.f10290a)) {
                    String str4 = oVar2.f10423d;
                    InetAddress a3 = aVar2.mo17070a(proxy2, oVar2);
                    int i2 = oVar2.f10424e;
                    String str5 = oVar2.f10420a;
                    String str6 = gVar2.f10291b;
                    String str7 = gVar2.f10290a;
                    try {
                        PasswordAuthentication requestPasswordAuthentication2 = Authenticator.requestPasswordAuthentication(str4, a3, i2, str5, str6, str7, new URL(oVar2.f10428i), Authenticator.RequestorType.SERVER);
                        if (requestPasswordAuthentication2 != null) {
                            String a4 = C4805c3.m8802a(requestPasswordAuthentication2.getUserName(), new String(requestPasswordAuthentication2.getPassword()));
                            C5255t.C5257b c2 = tVar2.mo17192c();
                            c2.mo17196b("Authorization", a4);
                            return c2.mo17195a();
                        }
                    } catch (MalformedURLException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                i++;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static Map<String, List<String>> m9653d(C5242n nVar, String str) {
        TreeMap treeMap = new TreeMap(f10205a);
        int d = nVar.mo17156d();
        for (int i = 0; i < d; i++) {
            String b = nVar.mo17154b(i);
            String e = nVar.mo17157e(i);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(b);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(e);
            treeMap.put(b, Collections.unmodifiableList(arrayList));
        }
        return Collections.unmodifiableMap(treeMap);
    }
}
