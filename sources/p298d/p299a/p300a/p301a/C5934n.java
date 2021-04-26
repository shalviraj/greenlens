package p298d.p299a.p300a.p301a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p299a.C6726e;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6157j;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p310a.C6167i;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6173b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6881c;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p344x.p346c.C6896q;
import p298d.p344x.p346c.C6902w;
import p298d.p415c0.C7690d;
import p298d.p415c0.C7694h;

/* renamed from: d.a.a.a.n */
public abstract class C5934n implements C6881c {

    /* renamed from: g */
    public static final Class<?> f11745g = Class.forName("kotlin.jvm.internal.DefaultConstructorMarker");

    /* renamed from: h */
    public static final C7690d f11746h = new C7690d("<v#(\\d+)>");

    /* renamed from: d.a.a.a.n$a */
    public abstract class C5935a {

        /* renamed from: c */
        public static final /* synthetic */ C6736l[] f11747c = {C6902w.m12462c(new C6896q(C6902w.m12460a(C5935a.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: a */
        public final C5939n0 f11748a = C5266a.m9905X2(new C5936a(this));

        /* renamed from: d.a.a.a.n$a$a */
        public static final class C5936a extends C6890k implements C6851a<C6167i> {

            /* renamed from: g */
            public final /* synthetic */ C5935a f11750g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5936a(C5935a aVar) {
                super(0);
                this.f11750g = aVar;
            }

            public Object invoke() {
                return C5933m0.m10750a(C5934n.this.mo22949n());
            }
        }

        public C5935a() {
        }
    }

    /* renamed from: d.a.a.a.n$b */
    public enum C5937b {
        DECLARED,
        INHERITED
    }

    /* renamed from: d.a.a.a.n$c */
    public static final class C5938c extends C5884c {
        public C5938c(C5934n nVar, C5934n nVar2) {
            super(nVar2);
        }

        /* renamed from: e */
        public Object mo22984e(C6157j jVar, Object obj) {
            C6888i.m12438e(jVar, "descriptor");
            C6888i.m12438e((C6777r) obj, "data");
            throw new IllegalStateException("No constructors should appear here: " + jVar);
        }
    }

    /* renamed from: A */
    public abstract Collection<C6207k0> mo22937A(C6717d dVar);

    /* renamed from: B */
    public final List<Class<?>> mo23029B(String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            char charAt = str.charAt(i3);
            if (C7694h.m13925c("VZCBSIFJD", charAt, false, 2)) {
                i = i3 + 1;
            } else if (charAt == 'L') {
                i = C7694h.m13933k(str, ';', i2, false, 4) + 1;
            } else {
                throw new C5931l0(C0843a.m451l("Unknown type prefix in the method signature: ", str));
            }
            arrayList.add(mo23032E(str, i2, i));
            i2 = i;
        }
        return arrayList;
    }

    /* renamed from: C */
    public final Class<?> mo23030C(String str) {
        return mo23032E(str, C7694h.m13933k(str, ')', 0, false, 6) + 1, str.length());
    }

    /* renamed from: D */
    public final Method mo23031D(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z) {
        Method D;
        if (z) {
            clsArr[0] = cls;
        }
        Method G = mo23034G(cls, str, clsArr, cls2);
        if (G != null) {
            return G;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && (D = mo23031D(superclass, str, clsArr, cls2, z)) != null) {
            return D;
        }
        for (Class<?> cls3 : cls.getInterfaces()) {
            C6888i.m12437d(cls3, "superInterface");
            Method D2 = mo23031D(cls3, str, clsArr, cls2, z);
            if (D2 != null) {
                return D2;
            }
            if (z) {
                Class<?> G4 = C5266a.m9811G4(C6173b.m11076e(cls3), cls3.getName() + "$DefaultImpls");
                if (G4 != null) {
                    clsArr[0] = cls3;
                    Method G2 = mo23034G(G4, str, clsArr, cls2);
                    if (G2 != null) {
                        return G2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: E */
    public final Class<?> mo23032E(String str, int i, int i2) {
        String str2;
        Class<?> cls;
        char charAt = str.charAt(i);
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'L') {
            ClassLoader e = C6173b.m11076e(mo22949n());
            String substring = str.substring(i + 1, i2 - 1);
            C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            cls = e.loadClass(C7694h.m13943u(substring, '/', '.', false, 4));
            str2 = "jClass.safeClassLoader.l…d - 1).replace('/', '.'))";
        } else if (charAt == 'S') {
            return Short.TYPE;
        } else {
            if (charAt == 'V') {
                cls = Void.TYPE;
                str2 = "Void.TYPE";
            } else if (charAt == 'I') {
                return Integer.TYPE;
            } else {
                if (charAt == 'J') {
                    return Long.TYPE;
                }
                if (charAt == 'Z') {
                    return Boolean.TYPE;
                }
                if (charAt == '[') {
                    return C6173b.m11072a(mo23032E(str, i + 1, i2));
                }
                switch (charAt) {
                    case 'B':
                        return Byte.TYPE;
                    case 'C':
                        return Character.TYPE;
                    case 'D':
                        return Double.TYPE;
                    default:
                        throw new C5931l0(C0843a.m451l("Unknown type prefix in the method signature: ", str));
                }
            }
        }
        C6888i.m12437d(cls, str2);
        return cls;
    }

    /* renamed from: F */
    public final Constructor<?> mo23033F(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Object[] array = list.toArray(new Class[0]);
            if (array != null) {
                Class[] clsArr = (Class[]) array;
                return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a A[LOOP:0: B:6:0x0029->B:17:0x005a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058 A[SYNTHETIC] */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method mo23034G(java.lang.Class<?> r7, java.lang.String r8, java.lang.Class<?>[] r9, java.lang.Class<?> r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = r9.length     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r9, r1)     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.Class[] r1 = (java.lang.Class[]) r1     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.reflect.Method r1 = r7.getDeclaredMethod(r8, r1)     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.String r2 = "result"
            p298d.p344x.p346c.C6888i.m12437d(r1, r2)     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.Class r2 = r1.getReturnType()     // Catch:{ NoSuchMethodException -> 0x005d }
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r2, r10)     // Catch:{ NoSuchMethodException -> 0x005d }
            if (r2 == 0) goto L_0x001d
            r0 = r1
            goto L_0x005d
        L_0x001d:
            java.lang.reflect.Method[] r7 = r7.getDeclaredMethods()     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.String r1 = "declaredMethods"
            p298d.p344x.p346c.C6888i.m12437d(r7, r1)     // Catch:{ NoSuchMethodException -> 0x005d }
            int r1 = r7.length     // Catch:{ NoSuchMethodException -> 0x005d }
            r2 = 0
            r3 = r2
        L_0x0029:
            if (r3 >= r1) goto L_0x005d
            r4 = r7[r3]     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.String r5 = "method"
            p298d.p344x.p346c.C6888i.m12437d(r4, r5)     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.String r5 = r4.getName()     // Catch:{ NoSuchMethodException -> 0x005d }
            boolean r5 = p298d.p344x.p346c.C6888i.m12434a(r5, r8)     // Catch:{ NoSuchMethodException -> 0x005d }
            if (r5 == 0) goto L_0x0055
            java.lang.Class r5 = r4.getReturnType()     // Catch:{ NoSuchMethodException -> 0x005d }
            boolean r5 = p298d.p344x.p346c.C6888i.m12434a(r5, r10)     // Catch:{ NoSuchMethodException -> 0x005d }
            if (r5 == 0) goto L_0x0055
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch:{ NoSuchMethodException -> 0x005d }
            p298d.p344x.p346c.C6888i.m12436c(r5)     // Catch:{ NoSuchMethodException -> 0x005d }
            boolean r5 = java.util.Arrays.equals(r5, r9)     // Catch:{ NoSuchMethodException -> 0x005d }
            if (r5 == 0) goto L_0x0055
            r5 = 1
            goto L_0x0056
        L_0x0055:
            r5 = r2
        L_0x0056:
            if (r5 == 0) goto L_0x005a
            r0 = r4
            goto L_0x005d
        L_0x005a:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x005d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.C5934n.mo23034G(java.lang.Class, java.lang.String, java.lang.Class[], java.lang.Class):java.lang.reflect.Method");
    }

    /* renamed from: r */
    public final void mo23035r(List<Class<?>> list, String str, boolean z) {
        List<Class<?>> B = mo23029B(str);
        list.addAll(B);
        int size = ((((ArrayList) B).size() + 32) - 1) / 32;
        for (int i = 0; i < size; i++) {
            Class cls = Integer.TYPE;
            C6888i.m12437d(cls, "Integer.TYPE");
            list.add(cls);
        }
        Class cls2 = z ? f11745g : Object.class;
        C6888i.m12437d(cls2, "if (isConstructor) DEFAU…RKER else Any::class.java");
        list.add(cls2);
    }

    /* renamed from: u */
    public final Method mo23036u(String str, String str2) {
        Method D;
        C6888i.m12438e(str, "name");
        C6888i.m12438e(str2, "desc");
        if (C6888i.m12434a(str, "<init>")) {
            return null;
        }
        Object[] array = mo23029B(str2).toArray(new Class[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        Class[] clsArr = (Class[]) array;
        Class<?> C = mo23030C(str2);
        Method D2 = mo23031D(mo23038z(), str, clsArr, C, false);
        if (D2 != null) {
            return D2;
        }
        if (!mo23038z().isInterface() || (D = mo23031D(Object.class, str, clsArr, C, false)) == null) {
            return null;
        }
        return D;
    }

    /* renamed from: v */
    public abstract Collection<C6157j> mo22952v();

    /* renamed from: w */
    public abstract Collection<C6244v> mo22953w(C6717d dVar);

    /* renamed from: x */
    public abstract C6207k0 mo22954x(int i);

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x001e A[SYNTHETIC] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<p298d.p299a.p300a.p301a.C5913g<?>> mo23037y(p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h r9, p298d.p299a.p300a.p301a.C5934n.C5937b r10) {
        /*
            r8 = this;
            java.lang.String r0 = "scope"
            p298d.p344x.p346c.C6888i.m12438e(r9, r0)
            java.lang.String r0 = "belonginess"
            p298d.p344x.p346c.C6888i.m12438e(r10, r0)
            d.a.a.a.n$c r0 = new d.a.a.a.n$c
            r0.<init>(r8, r8)
            r1 = 0
            r2 = 3
            java.util.Collection r9 = p005b.p291q.p292a.C5266a.m9985l1(r9, r1, r1, r2, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x001e:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x006f
            java.lang.Object r3 = r9.next()
            d.a.a.a.y0.b.k r3 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6206k) r3
            boolean r4 = r3 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6023b
            if (r4 == 0) goto L_0x0068
            r4 = r3
            d.a.a.a.y0.b.b r4 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6023b) r4
            d.a.a.a.y0.b.r r5 = r4.getVisibility()
            d.a.a.a.y0.b.r r6 = p298d.p299a.p300a.p301a.p303y0.p304b.C6219q.f12248h
            boolean r5 = p298d.p344x.p346c.C6888i.m12434a(r5, r6)
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x0068
            java.lang.String r5 = "member"
            p298d.p344x.p346c.C6888i.m12438e(r4, r5)
            d.a.a.a.y0.b.b$a r4 = r4.getKind()
            java.lang.String r5 = "member.kind"
            p298d.p344x.p346c.C6888i.m12437d(r4, r5)
            boolean r4 = r4.mo23098d()
            d.a.a.a.n$b r5 = p298d.p299a.p300a.p301a.C5934n.C5937b.DECLARED
            r7 = 0
            if (r10 != r5) goto L_0x0058
            r5 = r6
            goto L_0x0059
        L_0x0058:
            r5 = r7
        L_0x0059:
            if (r4 != r5) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r6 = r7
        L_0x005d:
            if (r6 == 0) goto L_0x0068
            d.r r4 = p298d.C6777r.f13694a
            java.lang.Object r3 = r3.accept(r0, r4)
            d.a.a.a.g r3 = (p298d.p299a.p300a.p301a.C5913g) r3
            goto L_0x0069
        L_0x0068:
            r3 = r1
        L_0x0069:
            if (r3 == 0) goto L_0x001e
            r2.add(r3)
            goto L_0x001e
        L_0x006f:
            java.util.List r9 = p298d.p334t.C6790h.m12337X(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.C5934n.mo23037y(d.a.a.a.y0.i.z.h, d.a.a.a.n$b):java.util.Collection");
    }

    /* renamed from: z */
    public Class<?> mo23038z() {
        Class<?> n = mo22949n();
        List<C6726e<? extends Object>> list = C6173b.f12191a;
        C6888i.m12438e(n, "<this>");
        Class<?> cls = C6173b.f12193c.get(n);
        return cls != null ? cls : mo22949n();
    }
}
