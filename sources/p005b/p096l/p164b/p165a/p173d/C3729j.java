package p005b.p096l.p164b.p165a.p173d;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.b.a.d.j */
public class C3729j {

    /* renamed from: e */
    public static final Map<Field, C3729j> f6903e = new WeakHashMap();

    /* renamed from: a */
    public final boolean f6904a;

    /* renamed from: b */
    public final Field f6905b;

    /* renamed from: c */
    public final Method[] f6906c;

    /* renamed from: d */
    public final String f6907d;

    public C3729j(Field field, String str) {
        this.f6905b = field;
        this.f6907d = str == null ? null : str.intern();
        this.f6904a = C3723g.m7021d(field.getType());
        ArrayList arrayList = new ArrayList();
        for (Method method : field.getDeclaringClass().getDeclaredMethods()) {
            String O0 = C1960d.m2738O0(method.getName());
            StringBuilder u = C0843a.m460u("set");
            u.append(C1960d.m2738O0(field.getName()));
            if (O0.equals(u.toString()) && method.getParameterTypes().length == 1) {
                arrayList.add(method);
            }
        }
        this.f6906c = (Method[]) arrayList.toArray(new Method[0]);
    }

    /* renamed from: c */
    public static C3729j m7031c(Enum<?> enumR) {
        try {
            C3729j d = m7032d(enumR.getClass().getField(enumR.name()));
            C1960d.m2845s(d != null, "enum constant missing @Value or @NullValue annotation: %s", enumR);
            return d;
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        return r2;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p005b.p096l.p164b.p165a.p173d.C3729j m7032d(java.lang.reflect.Field r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.Map<java.lang.reflect.Field, b.l.b.a.d.j> r1 = f6903e
            monitor-enter(r1)
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0067 }
            b.l.b.a.d.j r2 = (p005b.p096l.p164b.p165a.p173d.C3729j) r2     // Catch:{ all -> 0x0067 }
            boolean r3 = r5.isEnumConstant()     // Catch:{ all -> 0x0067 }
            if (r2 != 0) goto L_0x0065
            if (r3 != 0) goto L_0x001f
            int r4 = r5.getModifiers()     // Catch:{ all -> 0x0067 }
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)     // Catch:{ all -> 0x0067 }
            if (r4 != 0) goto L_0x0065
        L_0x001f:
            if (r3 == 0) goto L_0x003d
            java.lang.Class<b.l.b.a.d.y> r2 = p005b.p096l.p164b.p165a.p173d.C3749y.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x0067 }
            b.l.b.a.d.y r2 = (p005b.p096l.p164b.p165a.p173d.C3749y) r2     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x0030
            java.lang.String r0 = r2.value()     // Catch:{ all -> 0x0067 }
            goto L_0x0051
        L_0x0030:
            java.lang.Class<b.l.b.a.d.s> r2 = p005b.p096l.p164b.p165a.p173d.C3741s.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x0067 }
            b.l.b.a.d.s r2 = (p005b.p096l.p164b.p165a.p173d.C3741s) r2     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x003b
            goto L_0x0051
        L_0x003b:
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            return r0
        L_0x003d:
            java.lang.Class<b.l.b.a.d.n> r2 = p005b.p096l.p164b.p165a.p173d.C3736n.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x0067 }
            b.l.b.a.d.n r2 = (p005b.p096l.p164b.p165a.p173d.C3736n) r2     // Catch:{ all -> 0x0067 }
            if (r2 != 0) goto L_0x0049
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            return r0
        L_0x0049:
            java.lang.String r0 = r2.value()     // Catch:{ all -> 0x0067 }
            r2 = 1
            r5.setAccessible(r2)     // Catch:{ all -> 0x0067 }
        L_0x0051:
            java.lang.String r2 = "##default"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x005d
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x0067 }
        L_0x005d:
            b.l.b.a.d.j r2 = new b.l.b.a.d.j     // Catch:{ all -> 0x0067 }
            r2.<init>(r5, r0)     // Catch:{ all -> 0x0067 }
            r1.put(r5, r2)     // Catch:{ all -> 0x0067 }
        L_0x0065:
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            return r2
        L_0x0067:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p164b.p165a.p173d.C3729j.m7032d(java.lang.reflect.Field):b.l.b.a.d.j");
    }

    /* renamed from: e */
    public static void m7033e(Field field, Object obj, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            try {
                Object obj3 = field.get(obj);
                if (obj2 == null) {
                    if (obj3 == null) {
                        return;
                    }
                } else if (obj2.equals(obj3)) {
                    return;
                }
                throw new IllegalArgumentException("expected final value <" + obj3 + "> but was <" + obj2 + "> on " + field.getName() + " field in " + obj.getClass().getName());
            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            try {
                field.set(obj, obj2);
            } catch (SecurityException e2) {
                throw new IllegalArgumentException(e2);
            } catch (IllegalAccessException e3) {
                throw new IllegalArgumentException(e3);
            }
        }
    }

    /* renamed from: a */
    public Type mo15100a() {
        return this.f6905b.getGenericType();
    }

    /* renamed from: b */
    public Object mo15101b(Object obj) {
        try {
            return this.f6905b.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: f */
    public void mo15102f(Object obj, Object obj2) {
        Method[] methodArr = this.f6906c;
        if (methodArr.length > 0) {
            int length = methodArr.length;
            int i = 0;
            while (i < length) {
                Method method = methodArr[i];
                if (obj2 == null || method.getParameterTypes()[0].isAssignableFrom(obj2.getClass())) {
                    try {
                        method.invoke(obj, new Object[]{obj2});
                        return;
                    } catch (IllegalAccessException | InvocationTargetException unused) {
                        continue;
                    }
                } else {
                    i++;
                }
            }
        }
        m7033e(this.f6905b, obj, obj2);
    }
}
