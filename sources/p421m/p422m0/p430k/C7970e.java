package p421m.p422m0.p430k;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p421m.C7835d0;

/* renamed from: m.m0.k.e */
public final class C7970e extends C7976h {

    /* renamed from: d */
    public final Method f16000d;

    /* renamed from: e */
    public final Method f16001e;

    /* renamed from: f */
    public final Method f16002f;

    /* renamed from: g */
    public final Class<?> f16003g;

    /* renamed from: h */
    public final Class<?> f16004h;

    /* renamed from: m.m0.k.e$a */
    public static final class C7971a implements InvocationHandler {

        /* renamed from: a */
        public boolean f16005a;

        /* renamed from: b */
        public String f16006b;

        /* renamed from: c */
        public final List<String> f16007c;

        public C7971a(List<String> list) {
            C6888i.m12438e(list, "protocols");
            this.f16007c = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            C6888i.m12438e(obj, "proxy");
            C6888i.m12438e(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (C6888i.m12434a(name, "supports") && C6888i.m12434a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (!C6888i.m12434a(name, "unsupported") || !C6888i.m12434a(Void.TYPE, returnType)) {
                if (C6888i.m12434a(name, "protocols")) {
                    if (objArr.length == 0) {
                        return this.f16007c;
                    }
                }
                if ((C6888i.m12434a(name, "selectProtocol") || C6888i.m12434a(name, "select")) && C6888i.m12434a(String.class, returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            Object obj3 = list.get(i);
                            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            if (!this.f16007c.contains(str)) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                this.f16006b = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.f16007c.get(0);
                    this.f16006b = str2;
                    return str2;
                } else if ((!C6888i.m12434a(name, "protocolSelected") && !C6888i.m12434a(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                } else {
                    Object obj4 = objArr[0];
                    Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
                    this.f16006b = (String) obj4;
                    return null;
                }
            } else {
                this.f16005a = true;
                return null;
            }
        }
    }

    public C7970e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        C6888i.m12438e(method, "putMethod");
        C6888i.m12438e(method2, "getMethod");
        C6888i.m12438e(method3, "removeMethod");
        C6888i.m12438e(cls, "clientProviderClass");
        C6888i.m12438e(cls2, "serverProviderClass");
        this.f16000d = method;
        this.f16001e = method2;
        this.f16002f = method3;
        this.f16003g = cls;
        this.f16004h = cls2;
    }

    /* renamed from: a */
    public void mo25769a(SSLSocket sSLSocket) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        try {
            this.f16002f.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    /* renamed from: d */
    public void mo25753d(SSLSocket sSLSocket, String str, List<? extends C7835d0> list) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        C6888i.m12438e(list, "protocols");
        C6888i.m12438e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((C7835d0) next) == C7835d0.HTTP_1_0) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C5266a.m9892V(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C7835d0) it2.next()).f15512g);
        }
        try {
            this.f16000d.invoke((Object) null, new Object[]{sSLSocket, Proxy.newProxyInstance(C7976h.class.getClassLoader(), new Class[]{this.f16003g, this.f16004h}, new C7971a(arrayList2))});
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    /* renamed from: f */
    public String mo25754f(SSLSocket sSLSocket) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f16001e.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                C7971a aVar = (C7971a) invocationHandler;
                boolean z = aVar.f16005a;
                if (!z && aVar.f16006b == null) {
                    C7976h.m14586j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, (Throwable) null, 6, (Object) null);
                    return null;
                } else if (z) {
                    return null;
                } else {
                    return aVar.f16006b;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
