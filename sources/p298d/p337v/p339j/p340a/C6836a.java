package p298d.p337v.p339j.p340a;

import java.io.Serializable;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.C6777r;
import p298d.p337v.C6824d;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.v.j.a.a */
public abstract class C6836a implements C6824d<Object>, C6839d, Serializable {

    /* renamed from: g */
    public final C6824d<Object> f13765g;

    public C6836a(C6824d<Object> dVar) {
        this.f13765g = dVar;
    }

    /* renamed from: a */
    public C6839d mo24172a() {
        C6824d<Object> dVar = this.f13765g;
        if (!(dVar instanceof C6839d)) {
            dVar = null;
        }
        return (C6839d) dVar;
    }

    /* renamed from: b */
    public C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
        C6888i.m12438e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [d.v.d, java.lang.Object, d.v.d<java.lang.Object>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24166c(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r3
        L_0x0001:
            java.lang.String r1 = "frame"
            p298d.p344x.p346c.C6888i.m12438e(r0, r1)
            d.v.d<java.lang.Object> r1 = r0.f13765g
            p298d.p344x.p346c.C6888i.m12436c(r1)
            java.lang.Object r4 = r0.mo10326e(r4)     // Catch:{ all -> 0x0014 }
            d.v.i.a r2 = p298d.p337v.p338i.C6833a.COROUTINE_SUSPENDED     // Catch:{ all -> 0x0014 }
            if (r4 != r2) goto L_0x0019
            return
        L_0x0014:
            r4 = move-exception
            java.lang.Object r4 = p005b.p291q.p292a.C5266a.m10038u0(r4)
        L_0x0019:
            r0.mo24174f()
            boolean r0 = r1 instanceof p298d.p337v.p339j.p340a.C6836a
            if (r0 == 0) goto L_0x0024
            r0 = r1
            d.v.j.a.a r0 = (p298d.p337v.p339j.p340a.C6836a) r0
            goto L_0x0001
        L_0x0024:
            r1.mo24166c(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p337v.p339j.p340a.C6836a.mo24166c(java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.StackTraceElement mo24173d() {
        /*
            r9 = this;
            java.lang.String r0 = "$this$getStackTraceElementImpl"
            p298d.p344x.p346c.C6888i.m12438e(r9, r0)
            java.lang.Class r0 = r9.getClass()
            java.lang.Class<d.v.j.a.e> r1 = p298d.p337v.p339j.p340a.C6840e.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            d.v.j.a.e r0 = (p298d.p337v.p339j.p340a.C6840e) r0
            r1 = 0
            if (r0 == 0) goto L_0x0112
            int r2 = r0.mo24181v()
            r3 = 1
            if (r2 > r3) goto L_0x00fe
            r2 = 0
            r4 = -1
            java.lang.Class r5 = r9.getClass()     // Catch:{ Exception -> 0x0044 }
            java.lang.String r6 = "label"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r6 = "field"
            p298d.p344x.p346c.C6888i.m12437d(r5, r6)     // Catch:{ Exception -> 0x0044 }
            r5.setAccessible(r3)     // Catch:{ Exception -> 0x0044 }
            java.lang.Object r5 = r5.get(r9)     // Catch:{ Exception -> 0x0044 }
            boolean r6 = r5 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0044 }
            if (r6 != 0) goto L_0x0038
            r5 = r1
        L_0x0038:
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x0044 }
            if (r5 == 0) goto L_0x0041
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0044 }
            goto L_0x0042
        L_0x0041:
            r5 = r2
        L_0x0042:
            int r5 = r5 - r3
            goto L_0x0045
        L_0x0044:
            r5 = r4
        L_0x0045:
            if (r5 >= 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            int[] r3 = r0.mo24179l()
            r4 = r3[r5]
        L_0x004e:
            java.lang.String r3 = "continuation"
            p298d.p344x.p346c.C6888i.m12438e(r9, r3)
            d.v.j.a.f$a r3 = p298d.p337v.p339j.p340a.C6841f.f13770b
            if (r3 == 0) goto L_0x0058
            goto L_0x009b
        L_0x0058:
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            java.lang.String r5 = "getModule"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0097 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r6)     // Catch:{ Exception -> 0x0097 }
            java.lang.Class r5 = r9.getClass()     // Catch:{ Exception -> 0x0097 }
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r6 = "java.lang.Module"
            java.lang.Class r5 = r5.loadClass(r6)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r6 = "getDescriptor"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0097 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x0097 }
            java.lang.Class r6 = r9.getClass()     // Catch:{ Exception -> 0x0097 }
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r7 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r6 = r6.loadClass(r7)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r7 = "name"
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0097 }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r8)     // Catch:{ Exception -> 0x0097 }
            d.v.j.a.f$a r7 = new d.v.j.a.f$a     // Catch:{ Exception -> 0x0097 }
            r7.<init>(r3, r5, r6)     // Catch:{ Exception -> 0x0097 }
            p298d.p337v.p339j.p340a.C6841f.f13770b = r7     // Catch:{ Exception -> 0x0097 }
            r3 = r7
            goto L_0x009b
        L_0x0097:
            d.v.j.a.f$a r3 = p298d.p337v.p339j.p340a.C6841f.f13769a
            p298d.p337v.p339j.p340a.C6841f.f13770b = r3
        L_0x009b:
            d.v.j.a.f$a r5 = p298d.p337v.p339j.p340a.C6841f.f13769a
            if (r3 != r5) goto L_0x00a0
            goto L_0x00d0
        L_0x00a0:
            java.lang.reflect.Method r5 = r3.f13772a
            if (r5 == 0) goto L_0x00d0
            java.lang.Class r6 = r9.getClass()
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Object r5 = r5.invoke(r6, r7)
            if (r5 == 0) goto L_0x00d0
            java.lang.reflect.Method r6 = r3.f13773b
            if (r6 == 0) goto L_0x00d0
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Object r5 = r6.invoke(r5, r7)
            if (r5 == 0) goto L_0x00d0
            java.lang.reflect.Method r3 = r3.f13774c
            if (r3 == 0) goto L_0x00c7
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r2 = r3.invoke(r5, r2)
            goto L_0x00c8
        L_0x00c7:
            r2 = r1
        L_0x00c8:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 != 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r1 = r2
        L_0x00ce:
            java.lang.String r1 = (java.lang.String) r1
        L_0x00d0:
            if (r1 != 0) goto L_0x00d7
            java.lang.String r1 = r0.mo24177c()
            goto L_0x00ef
        L_0x00d7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r1 = 47
            r2.append(r1)
            java.lang.String r1 = r0.mo24177c()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x00ef:
            java.lang.StackTraceElement r2 = new java.lang.StackTraceElement
            java.lang.String r3 = r0.mo24180m()
            java.lang.String r0 = r0.mo24178f()
            r2.<init>(r1, r3, r0, r4)
            r1 = r2
            goto L_0x0112
        L_0x00fe:
            java.lang.String r0 = "Debug metadata version mismatch. Expected: "
            java.lang.String r1 = ", got "
            java.lang.String r4 = ". Please update the Kotlin standard library."
            java.lang.String r0 = p005b.p035e.p036a.p037a.C0843a.m447h(r0, r3, r1, r2, r4)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0112:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p337v.p339j.p340a.C6836a.mo24173d():java.lang.StackTraceElement");
    }

    /* renamed from: e */
    public abstract Object mo10326e(Object obj);

    /* renamed from: f */
    public void mo24174f() {
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Continuation at ");
        Object d = mo24173d();
        if (d == null) {
            d = getClass().getName();
        }
        u.append(d);
        return u.toString();
    }
}
