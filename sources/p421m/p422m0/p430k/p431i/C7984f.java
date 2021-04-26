package p421m.p422m0.p430k.p431i;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p421m.C7835d0;
import p421m.p422m0.p430k.C7962b;
import p421m.p422m0.p430k.C7976h;
import p421m.p422m0.p430k.p431i.C7991j;

/* renamed from: m.m0.k.i.f */
public class C7984f implements C7993k {

    /* renamed from: f */
    public static final C7991j.C7992a f16023f = new C7983e("com.google.android.gms.org.conscrypt");

    /* renamed from: g */
    public static final C7985a f16024g;

    /* renamed from: a */
    public final Method f16025a;

    /* renamed from: b */
    public final Method f16026b;

    /* renamed from: c */
    public final Method f16027c;

    /* renamed from: d */
    public final Method f16028d;

    /* renamed from: e */
    public final Class<? super SSLSocket> f16029e;

    /* renamed from: m.m0.k.i.f$a */
    public static final class C7985a {
        public C7985a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        C7985a aVar = new C7985a((DefaultConstructorMarker) null);
        f16024g = aVar;
        Objects.requireNonNull(aVar);
        C6888i.m12438e("com.google.android.gms.org.conscrypt", "packageName");
    }

    public C7984f(Class<? super SSLSocket> cls) {
        C6888i.m12438e(cls, "sslSocketClass");
        this.f16029e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        C6888i.m12437d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f16025a = declaredMethod;
        this.f16026b = cls.getMethod("setHostname", new Class[]{String.class});
        this.f16027c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f16028d = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    /* renamed from: a */
    public boolean mo25776a(SSLSocket sSLSocket) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        return this.f16029e.isInstance(sSLSocket);
    }

    /* renamed from: b */
    public String mo25777b(SSLSocket sSLSocket) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        if (!mo25776a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f16027c.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            C6888i.m12437d(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (NullPointerException e) {
            if (C6888i.m12434a(e.getMessage(), "ssl == null")) {
                return null;
            }
            throw e;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
    }

    /* renamed from: c */
    public X509TrustManager mo25778c(SSLSocketFactory sSLSocketFactory) {
        C6888i.m12438e(sSLSocketFactory, "sslSocketFactory");
        C5266a.m9805F4(sSLSocketFactory);
        return null;
    }

    /* renamed from: d */
    public boolean mo25779d(SSLSocketFactory sSLSocketFactory) {
        C6888i.m12438e(sSLSocketFactory, "sslSocketFactory");
        C5266a.m9975j3(sSLSocketFactory);
        return false;
    }

    /* renamed from: e */
    public boolean mo25780e() {
        C7962b.C7963a aVar = C7962b.f15988g;
        return C7962b.f15987f;
    }

    /* renamed from: f */
    public void mo25781f(SSLSocket sSLSocket, String str, List<? extends C7835d0> list) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        C6888i.m12438e(list, "protocols");
        if (mo25776a(sSLSocket)) {
            try {
                this.f16025a.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.f16026b.invoke(sSLSocket, new Object[]{str});
                }
                this.f16028d.invoke(sSLSocket, new Object[]{C7976h.f16015c.mo25774b(list)});
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
