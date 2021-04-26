package p437o.p438a.p439a;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p437o.p438a.p439a.p440r.C8089a;

/* renamed from: o.a.a.p */
public class C8086p {

    /* renamed from: a */
    public static final Map<Class<?>, List<C8085o>> f16249a = new ConcurrentHashMap();

    /* renamed from: b */
    public static final C8087a[] f16250b = new C8087a[4];

    /* renamed from: o.a.a.p$a */
    public static class C8087a {

        /* renamed from: a */
        public final List<C8085o> f16251a = new ArrayList();

        /* renamed from: b */
        public final Map<Class, Object> f16252b = new HashMap();

        /* renamed from: c */
        public final Map<String, Class> f16253c = new HashMap();

        /* renamed from: d */
        public final StringBuilder f16254d = new StringBuilder(128);

        /* renamed from: e */
        public Class<?> f16255e;

        /* renamed from: f */
        public boolean f16256f;

        /* renamed from: g */
        public C8089a f16257g;

        /* renamed from: a */
        public boolean mo26032a(Method method, Class<?> cls) {
            Object put = this.f16252b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (mo26033b((Method) put, cls)) {
                    this.f16252b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return mo26033b(method, cls);
        }

        /* renamed from: b */
        public final boolean mo26033b(Method method, Class<?> cls) {
            this.f16254d.setLength(0);
            this.f16254d.append(method.getName());
            StringBuilder sb = this.f16254d;
            sb.append('>');
            sb.append(cls.getName());
            String sb2 = this.f16254d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.f16253c.put(sb2, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f16253c.put(sb2, put);
            return false;
        }

        /* renamed from: c */
        public void mo26034c() {
            if (!this.f16256f) {
                Class<? super Object> superclass = this.f16255e.getSuperclass();
                this.f16255e = superclass;
                String name = superclass.getName();
                if (!name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("android.")) {
                    return;
                }
            }
            this.f16255e = null;
        }
    }

    public C8086p(List<Object> list, boolean z, boolean z2) {
    }

    /* renamed from: a */
    public final void mo26029a(C8087a aVar) {
        Method[] methodArr;
        C8083m mVar;
        try {
            methodArr = aVar.f16255e.getDeclaredMethods();
        } catch (Throwable unused) {
            methodArr = aVar.f16255e.getMethods();
            aVar.f16256f = true;
        }
        for (Method method : methodArr) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && (mVar = (C8083m) method.getAnnotation(C8083m.class)) != null) {
                    Class cls = parameterTypes[0];
                    if (aVar.mo26032a(method, cls)) {
                        aVar.f16251a.add(new C8085o(method, cls, mVar.threadMode(), mVar.priority(), mVar.sticky()));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final List<C8085o> mo26030b(C8087a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f16251a);
        aVar.f16251a.clear();
        aVar.f16252b.clear();
        aVar.f16253c.clear();
        int i = 0;
        aVar.f16254d.setLength(0);
        aVar.f16255e = null;
        aVar.f16256f = false;
        aVar.f16257g = null;
        synchronized (f16250b) {
            while (true) {
                if (i >= 4) {
                    break;
                }
                C8087a[] aVarArr = f16250b;
                if (aVarArr[i] == null) {
                    aVarArr[i] = aVar;
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final C8087a mo26031c() {
        synchronized (f16250b) {
            for (int i = 0; i < 4; i++) {
                C8087a[] aVarArr = f16250b;
                C8087a aVar = aVarArr[i];
                if (aVar != null) {
                    aVarArr[i] = null;
                    return aVar;
                }
            }
            return new C8087a();
        }
    }
}
