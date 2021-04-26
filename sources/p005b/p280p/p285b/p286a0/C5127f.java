package p005b.p280p.p285b.p286a0;

import com.segment.analytics.integrations.BasePayload;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p005b.p280p.p285b.C5254s;
import p005b.p280p.p285b.p286a0.p290m.C5213a;
import p005b.p280p.p285b.p286a0.p290m.C5217e;
import p005b.p280p.p285b.p286a0.p290m.C5218f;
import p435n.C8040e;

/* renamed from: b.p.b.a0.f */
public class C5127f {

    /* renamed from: a */
    public static final C5127f f9935a;

    /* renamed from: b.p.b.a0.f$a */
    public static class C5128a extends C5127f {

        /* renamed from: b */
        public final Class<?> f9936b;

        /* renamed from: c */
        public final C5126e<Socket> f9937c;

        /* renamed from: d */
        public final C5126e<Socket> f9938d;

        /* renamed from: e */
        public final C5126e<Socket> f9939e;

        /* renamed from: f */
        public final C5126e<Socket> f9940f;

        public C5128a(Class<?> cls, C5126e<Socket> eVar, C5126e<Socket> eVar2, Method method, Method method2, C5126e<Socket> eVar3, C5126e<Socket> eVar4) {
            this.f9936b = cls;
            this.f9937c = eVar;
            this.f9938d = eVar2;
            this.f9939e = eVar3;
            this.f9940f = eVar4;
        }

        /* renamed from: b */
        public void mo16981b(SSLSocket sSLSocket, String str, List<C5254s> list) {
            if (str != null) {
                this.f9937c.mo16978c(sSLSocket, Boolean.TRUE);
                this.f9938d.mo16978c(sSLSocket, str);
            }
            C5126e<Socket> eVar = this.f9940f;
            if (eVar != null) {
                if (eVar.mo16976a(sSLSocket.getClass()) != null) {
                    Object[] objArr = new Object[1];
                    C8040e eVar2 = new C8040e();
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        C5254s sVar = list.get(i);
                        if (sVar != C5254s.HTTP_1_0) {
                            eVar2.mo25940v0(sVar.f10478g.length());
                            eVar2.mo25947z0(sVar.f10478g);
                        }
                    }
                    objArr[0] = eVar2.mo25882A();
                    this.f9940f.mo16979d(sSLSocket, objArr);
                }
            }
        }

        /* renamed from: c */
        public void mo16982c(Socket socket, InetSocketAddress inetSocketAddress, int i) {
            try {
                socket.connect(inetSocketAddress, i);
            } catch (AssertionError e) {
                if (C5134i.m9466k(e)) {
                    throw new IOException(e);
                }
                throw e;
            } catch (SecurityException e2) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e2);
                throw iOException;
            }
        }

        /* renamed from: d */
        public String mo16983d(SSLSocket sSLSocket) {
            byte[] bArr;
            C5126e<Socket> eVar = this.f9939e;
            if (eVar == null) {
                return null;
            }
            if ((eVar.mo16976a(sSLSocket.getClass()) != null) && (bArr = (byte[]) this.f9939e.mo16979d(sSLSocket, new Object[0])) != null) {
                return new String(bArr, C5134i.f9955c);
            }
            return null;
        }

        /* renamed from: f */
        public X509TrustManager mo16984f(SSLSocketFactory sSLSocketFactory) {
            Object e = C5127f.m9440e(sSLSocketFactory, this.f9936b, "sslParameters");
            if (e == null) {
                try {
                    e = C5127f.m9440e(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
                } catch (ClassNotFoundException unused) {
                    return null;
                }
            }
            X509TrustManager x509TrustManager = (X509TrustManager) C5127f.m9440e(e, X509TrustManager.class, "x509TrustManager");
            return x509TrustManager != null ? x509TrustManager : (X509TrustManager) C5127f.m9440e(e, X509TrustManager.class, "trustManager");
        }

        /* renamed from: g */
        public C5218f mo16985g(X509TrustManager x509TrustManager) {
            C5213a aVar;
            try {
                Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
                declaredMethod.setAccessible(true);
                aVar = new C5213a(x509TrustManager, declaredMethod);
            } catch (NoSuchMethodException unused) {
                aVar = null;
            }
            if (aVar != null) {
                return aVar;
            }
            return new C5217e(x509TrustManager.getAcceptedIssuers());
        }
    }

    /* renamed from: b.p.b.a0.f$b */
    public static class C5129b extends C5127f {

        /* renamed from: b */
        public final Class<?> f9941b;

        public C5129b(Class<?> cls) {
            this.f9941b = cls;
        }

        /* renamed from: f */
        public X509TrustManager mo16984f(SSLSocketFactory sSLSocketFactory) {
            Object e = C5127f.m9440e(sSLSocketFactory, this.f9941b, BasePayload.CONTEXT_KEY);
            if (e == null) {
                return null;
            }
            return (X509TrustManager) C5127f.m9440e(e, X509TrustManager.class, "trustManager");
        }
    }

    /* renamed from: b.p.b.a0.f$c */
    public static class C5130c extends C5129b {

        /* renamed from: c */
        public final Method f9942c;

        /* renamed from: d */
        public final Method f9943d;

        /* renamed from: e */
        public final Method f9944e;

        /* renamed from: f */
        public final Class<?> f9945f;

        /* renamed from: g */
        public final Class<?> f9946g;

        public C5130c(Class<?> cls, Method method, Method method2, Method method3, Class<?> cls2, Class<?> cls3) {
            super(cls);
            this.f9942c = method;
            this.f9943d = method2;
            this.f9944e = method3;
            this.f9945f = cls2;
            this.f9946g = cls3;
        }

        /* renamed from: a */
        public void mo16980a(SSLSocket sSLSocket) {
            try {
                this.f9944e.invoke((Object) null, new Object[]{sSLSocket});
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }

        /* renamed from: b */
        public void mo16981b(SSLSocket sSLSocket, String str, List<C5254s> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C5254s sVar = list.get(i);
                if (sVar != C5254s.HTTP_1_0) {
                    arrayList.add(sVar.f10478g);
                }
            }
            try {
                this.f9942c.invoke((Object) null, new Object[]{sSLSocket, Proxy.newProxyInstance(C5127f.class.getClassLoader(), new Class[]{this.f9945f, this.f9946g}, new C5131d(arrayList))});
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: d */
        public String mo16983d(SSLSocket sSLSocket) {
            try {
                C5131d dVar = (C5131d) Proxy.getInvocationHandler(this.f9943d.invoke((Object) null, new Object[]{sSLSocket}));
                boolean z = dVar.f9948b;
                if (!z && dVar.f9949c == null) {
                    C5123b.f9929a.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                } else if (z) {
                    return null;
                } else {
                    return dVar.f9949c;
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: b.p.b.a0.f$d */
    public static class C5131d implements InvocationHandler {

        /* renamed from: a */
        public final List<String> f9947a;

        /* renamed from: b */
        public boolean f9948b;

        /* renamed from: c */
        public String f9949c;

        public C5131d(List<String> list) {
            this.f9947a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C5134i.f9954b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f9948b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f9947a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            obj2 = this.f9947a.get(0);
                            break;
                        } else if (this.f9947a.contains(list.get(i))) {
                            obj2 = list.get(i);
                            break;
                        } else {
                            i++;
                        }
                    }
                    String str = (String) obj2;
                    this.f9949c = str;
                    return str;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f9949c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: b.p.b.a0.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: b.p.b.a0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: b.p.b.a0.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: b.p.b.a0.f$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: b.p.b.a0.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: b.p.b.a0.f$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: b.p.b.a0.f$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: b.p.b.a0.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: b.p.b.a0.e} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:35|34|36|37|38|39|40|41|42|43) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c9 */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<byte[]> r0 = byte[].class
            r1 = 1
            r2 = 0
            java.lang.String r3 = "com.android.org.conscrypt.SSLParametersImpl"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x000c }
        L_0x000a:
            r5 = r3
            goto L_0x0013
        L_0x000c:
            java.lang.String r3 = "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x007c }
            goto L_0x000a
        L_0x0013:
            b.p.b.a0.e r6 = new b.p.b.a0.e     // Catch:{ ClassNotFoundException -> 0x007c }
            java.lang.String r3 = "setUseSessionTickets"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x007c }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x007c }
            r4[r2] = r7     // Catch:{ ClassNotFoundException -> 0x007c }
            r7 = 0
            r6.<init>(r7, r3, r4)     // Catch:{ ClassNotFoundException -> 0x007c }
            b.p.b.a0.e r3 = new b.p.b.a0.e     // Catch:{ ClassNotFoundException -> 0x007c }
            java.lang.String r4 = "setHostname"
            java.lang.Class[] r8 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x007c }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r2] = r9     // Catch:{ ClassNotFoundException -> 0x007c }
            r3.<init>(r7, r4, r8)     // Catch:{ ClassNotFoundException -> 0x007c }
            java.lang.String r4 = "android.net.TrafficStats"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0070 }
            java.lang.String r8 = "tagSocket"
            java.lang.Class[] r9 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0070 }
            java.lang.Class<java.net.Socket> r10 = java.net.Socket.class
            r9[r2] = r10     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0070 }
            java.lang.reflect.Method r8 = r4.getMethod(r8, r9)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0070 }
            java.lang.String r9 = "untagSocket"
            java.lang.Class[] r10 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            java.lang.Class<java.net.Socket> r11 = java.net.Socket.class
            r10[r2] = r11     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            java.lang.reflect.Method r4 = r4.getMethod(r9, r10)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            java.lang.String r9 = "android.net.Network"
            java.lang.Class.forName(r9)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006b }
            b.p.b.a0.e r9 = new b.p.b.a0.e     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006b }
            java.lang.String r10 = "getAlpnSelectedProtocol"
            java.lang.Class[] r11 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006b }
            r9.<init>(r0, r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006b }
            b.p.b.a0.e r10 = new b.p.b.a0.e     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0067 }
            java.lang.String r11 = "setAlpnProtocols"
            java.lang.Class[] r12 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0067 }
            r12[r2] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0067 }
            r10.<init>(r7, r11, r12)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0067 }
            r11 = r10
            goto L_0x0068
        L_0x0067:
            r11 = r7
        L_0x0068:
            r10 = r9
            r9 = r4
            goto L_0x0074
        L_0x006b:
            r9 = r4
            r10 = r7
            goto L_0x0073
        L_0x006e:
            r9 = r7
            goto L_0x0072
        L_0x0070:
            r8 = r7
            r9 = r8
        L_0x0072:
            r10 = r9
        L_0x0073:
            r11 = r10
        L_0x0074:
            b.p.b.a0.f$a r0 = new b.p.b.a0.f$a     // Catch:{ ClassNotFoundException -> 0x007c }
            r4 = r0
            r7 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException -> 0x007c }
            goto L_0x00d5
        L_0x007c:
            java.lang.String r0 = "sun.security.ssl.SSLContextImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x00d0 }
            java.lang.String r3 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r8 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r9 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.String r5 = "put"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r2] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            r6[r1] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.reflect.Method r5 = r3.getMethod(r5, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.String r4 = "get"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r2] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.reflect.Method r6 = r3.getMethod(r4, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.String r4 = "remove"
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r1[r2] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.reflect.Method r7 = r3.getMethod(r4, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            b.p.b.a0.f$c r1 = new b.p.b.a0.f$c     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            r3 = r1
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            goto L_0x00ce
        L_0x00c9:
            b.p.b.a0.f$b r1 = new b.p.b.a0.f$b     // Catch:{ ClassNotFoundException -> 0x00d0 }
            r1.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x00d0 }
        L_0x00ce:
            r0 = r1
            goto L_0x00d5
        L_0x00d0:
            b.p.b.a0.f r0 = new b.p.b.a0.f
            r0.<init>()
        L_0x00d5:
            f9935a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.C5127f.<clinit>():void");
    }

    /* renamed from: e */
    public static <T> T m9440e(Object obj, Class<T> cls, String str) {
        Object e;
        Class<Object> cls2 = Object.class;
        Class cls3 = obj.getClass();
        while (cls3 != cls2) {
            try {
                Field declaredField = cls3.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 != null) {
                    if (cls.isInstance(obj2)) {
                        return cls.cast(obj2);
                    }
                }
                return null;
            } catch (NoSuchFieldException unused) {
                cls3 = cls3.getSuperclass();
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        }
        if (str.equals("delegate") || (e = m9440e(obj, cls2, "delegate")) == null) {
            return null;
        }
        return m9440e(e, cls, str);
    }

    /* renamed from: a */
    public void mo16980a(SSLSocket sSLSocket) {
    }

    /* renamed from: b */
    public void mo16981b(SSLSocket sSLSocket, String str, List<C5254s> list) {
    }

    /* renamed from: c */
    public void mo16982c(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: d */
    public String mo16983d(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: f */
    public X509TrustManager mo16984f(SSLSocketFactory sSLSocketFactory) {
        return null;
    }

    /* renamed from: g */
    public C5218f mo16985g(X509TrustManager x509TrustManager) {
        return new C5217e(x509TrustManager.getAcceptedIssuers());
    }
}
