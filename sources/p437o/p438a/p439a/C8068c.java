package p437o.p438a.p439a;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import p005b.p035e.p036a.p037a.C0843a;
import p437o.p438a.p439a.C8077h;

/* renamed from: o.a.a.c */
public class C8068c {

    /* renamed from: q */
    public static volatile C8068c f16202q;

    /* renamed from: r */
    public static final C8071d f16203r = new C8071d();

    /* renamed from: s */
    public static final Map<Class<?>, List<Class<?>>> f16204s = new HashMap();

    /* renamed from: a */
    public final Map<Class<?>, CopyOnWriteArrayList<C8088q>> f16205a;

    /* renamed from: b */
    public final Map<Object, List<Class<?>>> f16206b;

    /* renamed from: c */
    public final Map<Class<?>, Object> f16207c;

    /* renamed from: d */
    public final ThreadLocal<C8070b> f16208d = new C8069a(this);

    /* renamed from: e */
    public final C8077h f16209e;

    /* renamed from: f */
    public final C8082l f16210f;

    /* renamed from: g */
    public final C8067b f16211g;

    /* renamed from: h */
    public final C8066a f16212h;

    /* renamed from: i */
    public final C8086p f16213i;

    /* renamed from: j */
    public final ExecutorService f16214j;

    /* renamed from: k */
    public final boolean f16215k;

    /* renamed from: l */
    public final boolean f16216l;

    /* renamed from: m */
    public final boolean f16217m;

    /* renamed from: n */
    public final boolean f16218n;

    /* renamed from: o */
    public final boolean f16219o;

    /* renamed from: p */
    public final C8074g f16220p;

    /* renamed from: o.a.a.c$a */
    public class C8069a extends ThreadLocal<C8070b> {
        public C8069a(C8068c cVar) {
        }

        public Object initialValue() {
            return new C8070b();
        }
    }

    /* renamed from: o.a.a.c$b */
    public static final class C8070b {

        /* renamed from: a */
        public final List<Object> f16221a = new ArrayList();

        /* renamed from: b */
        public boolean f16222b;

        /* renamed from: c */
        public boolean f16223c;

        /* renamed from: d */
        public Object f16224d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0044 A[SYNTHETIC, Splitter:B:11:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8068c() {
        /*
            r5 = this;
            o.a.a.d r0 = f16203r
            r5.<init>()
            o.a.a.c$a r1 = new o.a.a.c$a
            r1.<init>(r5)
            r5.f16208d = r1
            java.util.Objects.requireNonNull(r0)
            boolean r1 = p437o.p438a.p439a.C8074g.C8075a.f16231a
            r2 = 0
            if (r1 == 0) goto L_0x0024
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ RuntimeException -> 0x0019 }
            goto L_0x001a
        L_0x0019:
            r1 = r2
        L_0x001a:
            if (r1 == 0) goto L_0x0024
            o.a.a.g$a r1 = new o.a.a.g$a
            java.lang.String r3 = "EventBus"
            r1.<init>(r3)
            goto L_0x0029
        L_0x0024:
            o.a.a.g$b r1 = new o.a.a.g$b
            r1.<init>()
        L_0x0029:
            r5.f16220p = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r5.f16205a = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r5.f16206b = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r5.f16207c = r1
            boolean r1 = p437o.p438a.p439a.C8074g.C8075a.f16231a
            if (r1 == 0) goto L_0x0053
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ RuntimeException -> 0x0049 }
            goto L_0x004a
        L_0x0049:
            r1 = r2
        L_0x004a:
            if (r1 != 0) goto L_0x004d
            goto L_0x0053
        L_0x004d:
            o.a.a.h$a r3 = new o.a.a.h$a
            r3.<init>(r1)
            goto L_0x0054
        L_0x0053:
            r3 = r2
        L_0x0054:
            r5.f16209e = r3
            if (r3 == 0) goto L_0x0062
            o.a.a.f r1 = new o.a.a.f
            android.os.Looper r3 = r3.f16232a
            r4 = 10
            r1.<init>(r5, r3, r4)
            goto L_0x0063
        L_0x0062:
            r1 = r2
        L_0x0063:
            r5.f16210f = r1
            o.a.a.b r1 = new o.a.a.b
            r1.<init>(r5)
            r5.f16211g = r1
            o.a.a.a r1 = new o.a.a.a
            r1.<init>(r5)
            r5.f16212h = r1
            r1 = 0
            o.a.a.p r3 = new o.a.a.p
            r3.<init>(r2, r1, r1)
            r5.f16213i = r3
            r1 = 1
            r5.f16215k = r1
            r5.f16216l = r1
            r5.f16217m = r1
            r5.f16218n = r1
            r5.f16219o = r1
            java.util.concurrent.ExecutorService r0 = r0.f16226a
            r5.f16214j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p437o.p438a.p439a.C8068c.<init>():void");
    }

    /* renamed from: a */
    public static void m14947a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                m14947a(list, cls.getInterfaces());
            }
        }
    }

    /* renamed from: b */
    public static C8068c m14948b() {
        if (f16202q == null) {
            synchronized (C8068c.class) {
                if (f16202q == null) {
                    f16202q = new C8068c();
                }
            }
        }
        return f16202q;
    }

    /* renamed from: c */
    public void mo26004c(C8080j jVar) {
        Object obj = jVar.f16235a;
        C8088q qVar = jVar.f16236b;
        jVar.f16235a = null;
        jVar.f16236b = null;
        jVar.f16237c = null;
        List<C8080j> list = C8080j.f16234d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(jVar);
            }
        }
        if (qVar.f16260c) {
            mo26005d(qVar, obj);
        }
    }

    /* renamed from: d */
    public void mo26005d(C8088q qVar, Object obj) {
        try {
            qVar.f16259b.f16243a.invoke(qVar.f16258a, new Object[]{obj});
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (!(obj instanceof C8084n)) {
                if (this.f16215k) {
                    C8074g gVar = this.f16220p;
                    Level level = Level.SEVERE;
                    StringBuilder u = C0843a.m460u("Could not dispatch event: ");
                    u.append(obj.getClass());
                    u.append(" to subscribing class ");
                    u.append(qVar.f16258a.getClass());
                    gVar.mo26019b(level, u.toString(), cause);
                }
                if (this.f16217m) {
                    mo26008g(new C8084n(this, cause, obj, qVar.f16258a));
                }
            } else if (this.f16215k) {
                C8074g gVar2 = this.f16220p;
                Level level2 = Level.SEVERE;
                StringBuilder u2 = C0843a.m460u("SubscriberExceptionEvent subscriber ");
                u2.append(qVar.f16258a.getClass());
                u2.append(" threw an exception");
                gVar2.mo26019b(level2, u2.toString(), cause);
                C8084n nVar = (C8084n) obj;
                C8074g gVar3 = this.f16220p;
                StringBuilder u3 = C0843a.m460u("Initial event ");
                u3.append(nVar.f16241b);
                u3.append(" caused exception in ");
                u3.append(nVar.f16242c);
                gVar3.mo26019b(level2, u3.toString(), nVar.f16240a);
            }
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        }
    }

    /* renamed from: e */
    public final boolean mo26006e() {
        C8077h hVar = this.f16209e;
        return hVar == null || ((C8077h.C8078a) hVar).f16232a == Looper.myLooper();
    }

    /* renamed from: f */
    public synchronized boolean mo26007f(Object obj) {
        return this.f16206b.containsKey(obj);
    }

    /* renamed from: g */
    public void mo26008g(Object obj) {
        C8070b bVar = this.f16208d.get();
        List<Object> list = bVar.f16221a;
        list.add(obj);
        if (!bVar.f16222b) {
            bVar.f16223c = mo26006e();
            bVar.f16222b = true;
            while (!list.isEmpty()) {
                try {
                    mo26009h(list.remove(0), bVar);
                } finally {
                    bVar.f16222b = false;
                    bVar.f16223c = false;
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo26009h(Object obj, C8070b bVar) {
        boolean z;
        ArrayList arrayList;
        Class<?> cls = obj.getClass();
        if (this.f16219o) {
            Map<Class<?>, List<Class<?>>> map = f16204s;
            synchronized (map) {
                List list = map.get(cls);
                arrayList = list;
                if (list == null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                        arrayList2.add(cls2);
                        m14947a(arrayList2, cls2.getInterfaces());
                    }
                    f16204s.put(cls, arrayList2);
                    arrayList = arrayList2;
                }
            }
            int size = arrayList.size();
            z = false;
            for (int i = 0; i < size; i++) {
                z |= mo26010i(obj, bVar, (Class) arrayList.get(i));
            }
        } else {
            z = mo26010i(obj, bVar, cls);
        }
        if (!z) {
            if (this.f16216l) {
                this.f16220p.mo26018a(Level.FINE, "No subscribers registered for event " + cls);
            }
            if (this.f16218n && cls != C8079i.class && cls != C8084n.class) {
                mo26008g(new C8079i(this, obj));
            }
        }
    }

    /* renamed from: i */
    public final boolean mo26010i(Object obj, C8070b bVar, Class<?> cls) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f16205a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C8088q qVar = (C8088q) it.next();
            bVar.f16224d = obj;
            mo26011j(qVar, obj, bVar.f16223c);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r5 != null) goto L_0x0045;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26011j(p437o.p438a.p439a.C8088q r3, java.lang.Object r4, boolean r5) {
        /*
            r2 = this;
            o.a.a.o r0 = r3.f16259b
            org.greenrobot.eventbus.ThreadMode r0 = r0.f16244b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0049
            r1 = 1
            if (r0 == r1) goto L_0x0040
            r1 = 2
            if (r0 == r1) goto L_0x003b
            r1 = 3
            if (r0 == r1) goto L_0x0033
            r5 = 4
            if (r0 != r5) goto L_0x001c
            o.a.a.a r5 = r2.f16212h
            r5.mo26001a(r3, r4)
            goto L_0x004c
        L_0x001c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Unknown thread mode: "
            java.lang.StringBuilder r5 = p005b.p035e.p036a.p037a.C0843a.m460u(r5)
            o.a.a.o r3 = r3.f16259b
            org.greenrobot.eventbus.ThreadMode r3 = r3.f16244b
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x0033:
            if (r5 == 0) goto L_0x0049
            o.a.a.b r5 = r2.f16211g
            r5.mo26001a(r3, r4)
            goto L_0x004c
        L_0x003b:
            o.a.a.l r5 = r2.f16210f
            if (r5 == 0) goto L_0x0049
            goto L_0x0045
        L_0x0040:
            if (r5 == 0) goto L_0x0043
            goto L_0x0049
        L_0x0043:
            o.a.a.l r5 = r2.f16210f
        L_0x0045:
            r5.mo26001a(r3, r4)
            goto L_0x004c
        L_0x0049:
            r2.mo26005d(r3, r4)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p437o.p438a.p439a.C8068c.mo26011j(o.a.a.q, java.lang.Object, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r2.f16255e == r5.mo26038b()) goto L_0x003e;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26012k(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Class r0 = r12.getClass()
            o.a.a.p r1 = r11.f16213i
            java.util.Objects.requireNonNull(r1)
            java.util.Map<java.lang.Class<?>, java.util.List<o.a.a.o>> r2 = p437o.p438a.p439a.C8086p.f16249a
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0014
            goto L_0x0077
        L_0x0014:
            o.a.a.p$a r2 = r1.mo26031c()
            r2.f16255e = r0
            r3 = 0
            r2.f16256f = r3
            r4 = 0
            r2.f16257g = r4
        L_0x0020:
            java.lang.Class<?> r5 = r2.f16255e
            if (r5 == 0) goto L_0x0065
            o.a.a.r.a r5 = r2.f16257g
            if (r5 == 0) goto L_0x003d
            o.a.a.r.a r5 = r5.mo26039c()
            if (r5 == 0) goto L_0x003d
            o.a.a.r.a r5 = r2.f16257g
            o.a.a.r.a r5 = r5.mo26039c()
            java.lang.Class<?> r6 = r2.f16255e
            java.lang.Class r7 = r5.mo26038b()
            if (r6 != r7) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r5 = r4
        L_0x003e:
            r2.f16257g = r5
            if (r5 == 0) goto L_0x005e
            o.a.a.o[] r5 = r5.mo26037a()
            int r6 = r5.length
            r7 = r3
        L_0x0048:
            if (r7 >= r6) goto L_0x0061
            r8 = r5[r7]
            java.lang.reflect.Method r9 = r8.f16243a
            java.lang.Class<?> r10 = r8.f16245c
            boolean r9 = r2.mo26032a(r9, r10)
            if (r9 == 0) goto L_0x005b
            java.util.List<o.a.a.o> r9 = r2.f16251a
            r9.add(r8)
        L_0x005b:
            int r7 = r7 + 1
            goto L_0x0048
        L_0x005e:
            r1.mo26029a(r2)
        L_0x0061:
            r2.mo26034c()
            goto L_0x0020
        L_0x0065:
            java.util.List r2 = r1.mo26030b(r2)
            r1 = r2
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0091
            java.util.Map<java.lang.Class<?>, java.util.List<o.a.a.o>> r1 = p437o.p438a.p439a.C8086p.f16249a
            r1.put(r0, r2)
        L_0x0077:
            monitor-enter(r11)
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x008e }
        L_0x007c:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x008e }
            o.a.a.o r1 = (p437o.p438a.p439a.C8085o) r1     // Catch:{ all -> 0x008e }
            r11.mo26013l(r12, r1)     // Catch:{ all -> 0x008e }
            goto L_0x007c
        L_0x008c:
            monitor-exit(r11)     // Catch:{ all -> 0x008e }
            return
        L_0x008e:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x008e }
            throw r12
        L_0x0091:
            o.a.a.e r12 = new o.a.a.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Subscriber "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " and its super classes have no public methods with the @Subscribe annotation"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p437o.p438a.p439a.C8068c.mo26012k(java.lang.Object):void");
    }

    /* renamed from: l */
    public final void mo26013l(Object obj, C8085o oVar) {
        Object value;
        Class<?> cls = oVar.f16245c;
        C8088q qVar = new C8088q(obj, oVar);
        CopyOnWriteArrayList copyOnWriteArrayList = this.f16205a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f16205a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(qVar)) {
            StringBuilder u = C0843a.m460u("Subscriber ");
            u.append(obj.getClass());
            u.append(" already registered to event ");
            u.append(cls);
            throw new C8072e(u.toString());
        }
        int size = copyOnWriteArrayList.size();
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            } else if (i == size || oVar.f16246d > ((C8088q) copyOnWriteArrayList.get(i)).f16259b.f16246d) {
                copyOnWriteArrayList.add(i, qVar);
            } else {
                i++;
            }
        }
        copyOnWriteArrayList.add(i, qVar);
        List list = this.f16206b.get(obj);
        if (list == null) {
            list = new ArrayList();
            this.f16206b.put(obj, list);
        }
        list.add(cls);
        if (!oVar.f16247e) {
            return;
        }
        if (this.f16219o) {
            for (Map.Entry next : this.f16207c.entrySet()) {
                if (cls.isAssignableFrom((Class) next.getKey()) && (value = next.getValue()) != null) {
                    mo26011j(qVar, value, mo26006e());
                }
            }
            return;
        }
        Object obj2 = this.f16207c.get(cls);
        if (obj2 != null) {
            mo26011j(qVar, obj2, mo26006e());
        }
    }

    /* renamed from: m */
    public synchronized void mo26014m(Object obj) {
        List<Class> list = this.f16206b.get(obj);
        if (list != null) {
            for (Class cls : list) {
                List list2 = this.f16205a.get(cls);
                if (list2 != null) {
                    int size = list2.size();
                    int i = 0;
                    while (i < size) {
                        C8088q qVar = (C8088q) list2.get(i);
                        if (qVar.f16258a == obj) {
                            qVar.f16260c = false;
                            list2.remove(i);
                            i--;
                            size--;
                        }
                        i++;
                    }
                }
            }
            this.f16206b.remove(obj);
        } else {
            this.f16220p.mo26018a(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public String toString() {
        StringBuilder v = C0843a.m461v("EventBus[indexCount=", 0, ", eventInheritance=");
        v.append(this.f16219o);
        v.append("]");
        return v.toString();
    }
}
