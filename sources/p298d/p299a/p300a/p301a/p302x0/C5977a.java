package p298d.p299a.p300a.p301a.p302x0;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.C6726e;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6173b;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.x0.a */
public final class C5977a implements C5986h {

    /* renamed from: a */
    public final List<Type> f11807a;

    /* renamed from: b */
    public final List<Class<?>> f11808b;

    /* renamed from: c */
    public final List<Object> f11809c;

    /* renamed from: d */
    public final Class<?> f11810d;

    /* renamed from: e */
    public final List<String> f11811e;

    /* renamed from: f */
    public final C5978a f11812f;

    /* renamed from: g */
    public final List<Method> f11813g;

    /* renamed from: d.a.a.a.x0.a$a */
    public enum C5978a {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    /* renamed from: d.a.a.a.x0.a$b */
    public enum C5979b {
        JAVA,
        KOTLIN
    }

    public C5977a(Class<?> cls, List<String> list, C5978a aVar, C5979b bVar, List<Method> list2) {
        C6888i.m12438e(cls, "jClass");
        C6888i.m12438e(list, "parameterNames");
        C6888i.m12438e(aVar, "callMode");
        C6888i.m12438e(bVar, "origin");
        C6888i.m12438e(list2, "methods");
        this.f11810d = cls;
        this.f11811e = list;
        this.f11812f = aVar;
        this.f11813g = list2;
        ArrayList arrayList = new ArrayList(C5266a.m9892V(list2, 10));
        for (Method genericReturnType : list2) {
            arrayList.add(genericReturnType.getGenericReturnType());
        }
        this.f11807a = arrayList;
        List<Method> list3 = this.f11813g;
        ArrayList arrayList2 = new ArrayList(C5266a.m9892V(list3, 10));
        for (Method returnType : list3) {
            Class<?> returnType2 = returnType.getReturnType();
            C6888i.m12437d(returnType2, "it");
            List<C6726e<? extends Object>> list4 = C6173b.f12191a;
            C6888i.m12438e(returnType2, "<this>");
            Class<?> cls2 = C6173b.f12193c.get(returnType2);
            if (cls2 != null) {
                returnType2 = cls2;
            }
            arrayList2.add(returnType2);
        }
        this.f11808b = arrayList2;
        List<Method> list5 = this.f11813g;
        ArrayList arrayList3 = new ArrayList(C5266a.m9892V(list5, 10));
        for (Method defaultValue : list5) {
            arrayList3.add(defaultValue.getDefaultValue());
        }
        this.f11809c = arrayList3;
        if (this.f11812f == C5978a.POSITIONAL_CALL && bVar == C5979b.JAVA) {
            List<String> list6 = this.f11811e;
            C6888i.m12438e(list6, "$this$minus");
            ArrayList arrayList4 = new ArrayList(C5266a.m9892V(list6, 10));
            Iterator<T> it = list6.iterator();
            boolean z = false;
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (!z && C6888i.m12434a(next, "value")) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList4.add(next);
                }
            }
            if (!arrayList4.isEmpty()) {
                throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C5977a(java.lang.Class r7, java.util.List r8, p298d.p299a.p300a.p301a.p302x0.C5977a.C5978a r9, p298d.p299a.p300a.p301a.p302x0.C5977a.C5979b r10, java.util.List r11, int r12) {
        /*
            r6 = this;
            r11 = r12 & 16
            if (r11 == 0) goto L_0x002a
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = p005b.p291q.p292a.C5266a.m9892V(r8, r12)
            r11.<init>(r12)
            java.util.Iterator r12 = r8.iterator()
        L_0x0013:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.reflect.Method r0 = r7.getDeclaredMethod(r0, r1)
            r11.add(r0)
            goto L_0x0013
        L_0x002a:
            r11 = 0
        L_0x002b:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p302x0.C5977a.<init>(java.lang.Class, java.util.List, d.a.a.a.x0.a$a, d.a.a.a.x0.a$b, java.util.List, int):void");
    }

    /* renamed from: a */
    public List<Type> mo23069a() {
        return this.f11807a;
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ Member mo23070b() {
        return null;
    }

    public Type getReturnType() {
        return this.f11810d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        if (r7.isInstance(r5) != false) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010d  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo23072k(java.lang.Object[] r14) {
        /*
            r13 = this;
            java.lang.String r0 = "args"
            p298d.p344x.p346c.C6888i.m12438e(r14, r0)
            p298d.p344x.p346c.C6888i.m12438e(r14, r0)
            p005b.p291q.p292a.C5266a.m9836L(r13, r14)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r14.length
            r0.<init>(r1)
            int r1 = r14.length
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0015:
            if (r3 >= r1) goto L_0x0138
            r5 = r14[r3]
            int r6 = r4 + 1
            if (r5 != 0) goto L_0x002a
            d.a.a.a.x0.a$a r7 = r13.f11812f
            d.a.a.a.x0.a$a r8 = p298d.p299a.p300a.p301a.p302x0.C5977a.C5978a.CALL_BY_NAME
            if (r7 != r8) goto L_0x002a
            java.util.List<java.lang.Object> r5 = r13.f11809c
            java.lang.Object r5 = r5.get(r4)
            goto L_0x0085
        L_0x002a:
            java.util.List<java.lang.Class<?>> r7 = r13.f11808b
            java.lang.Object r7 = r7.get(r4)
            java.lang.Class r7 = (java.lang.Class) r7
            boolean r8 = r5 instanceof java.lang.Class
            r9 = 0
            if (r8 == 0) goto L_0x0038
            goto L_0x0084
        L_0x0038:
            boolean r8 = r5 instanceof p298d.p299a.C6726e
            if (r8 == 0) goto L_0x0043
            d.a.e r5 = (p298d.p299a.C6726e) r5
            java.lang.Class r5 = p005b.p291q.p292a.C5266a.m10033t1(r5)
            goto L_0x007d
        L_0x0043:
            boolean r8 = r5 instanceof java.lang.Object[]
            if (r8 == 0) goto L_0x007d
            r8 = r5
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            boolean r10 = r8 instanceof java.lang.Class[]
            if (r10 == 0) goto L_0x004f
            goto L_0x0084
        L_0x004f:
            boolean r10 = r8 instanceof p298d.p299a.C6726e[]
            if (r10 == 0) goto L_0x007c
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>"
            java.util.Objects.requireNonNull(r5, r8)
            d.a.e[] r5 = (p298d.p299a.C6726e[]) r5
            java.util.ArrayList r8 = new java.util.ArrayList
            int r10 = r5.length
            r8.<init>(r10)
            int r10 = r5.length
            r11 = r2
        L_0x0062:
            if (r11 >= r10) goto L_0x0070
            r12 = r5[r11]
            java.lang.Class r12 = p005b.p291q.p292a.C5266a.m10033t1(r12)
            r8.add(r12)
            int r11 = r11 + 1
            goto L_0x0062
        L_0x0070:
            java.lang.Class[] r5 = new java.lang.Class[r2]
            java.lang.Object[] r5 = r8.toArray(r5)
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r5, r8)
            goto L_0x007d
        L_0x007c:
            r5 = r8
        L_0x007d:
            boolean r7 = r7.isInstance(r5)
            if (r7 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r5 = r9
        L_0x0085:
            if (r5 == 0) goto L_0x008e
            r0.add(r5)
            int r3 = r3 + 1
            r4 = r6
            goto L_0x0015
        L_0x008e:
            java.util.List<java.lang.String> r14 = r13.f11811e
            java.lang.Object r14 = r14.get(r4)
            java.lang.String r14 = (java.lang.String) r14
            java.util.List<java.lang.Class<?>> r0 = r13.f11808b
            java.lang.Object r0 = r0.get(r4)
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r0, r1)
            if (r1 == 0) goto L_0x00a9
            java.lang.Class<d.a.e> r0 = p298d.p299a.C6726e.class
            goto L_0x00bd
        L_0x00a9:
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x00c2
            java.lang.Class r1 = r0.getComponentType()
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r2)
            if (r1 == 0) goto L_0x00c2
            java.lang.Class<d.a.e[]> r0 = p298d.p299a.C6726e[].class
        L_0x00bd:
            d.a.e r0 = p298d.p344x.p346c.C6902w.m12460a(r0)
            goto L_0x00c6
        L_0x00c2:
            d.a.e r0 = p005b.p291q.p292a.C5266a.m9784C1(r0)
        L_0x00c6:
            java.lang.String r1 = r0.mo22948m()
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            d.a.e r2 = p298d.p344x.p346c.C6902w.m12460a(r2)
            java.lang.String r2 = r2.mo22948m()
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r2)
            if (r1 == 0) goto L_0x010d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.mo22948m()
            r1.append(r2)
            r2 = 60
            r1.append(r2)
            java.lang.Class r0 = p005b.p291q.p292a.C5266a.m10033t1(r0)
            java.lang.Class r0 = r0.getComponentType()
            java.lang.String r2 = "kotlinClass.java.componentType"
            p298d.p344x.p346c.C6888i.m12437d(r0, r2)
            d.a.e r0 = p005b.p291q.p292a.C5266a.m9784C1(r0)
            java.lang.String r0 = r0.mo22948m()
            r1.append(r0)
            r0 = 62
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0111
        L_0x010d:
            java.lang.String r0 = r0.mo22948m()
        L_0x0111:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Argument #"
            r2.append(r3)
            r2.append(r4)
            r3 = 32
            r2.append(r3)
            r2.append(r14)
            java.lang.String r14 = " is not of the required type "
            r2.append(r14)
            r2.append(r0)
            java.lang.String r14 = r2.toString()
            r1.<init>(r14)
            throw r1
        L_0x0138:
            java.lang.Class<?> r14 = r13.f11810d
            java.util.List<java.lang.String> r1 = r13.f11811e
            java.util.List r0 = p298d.p334t.C6790h.m12353g0(r1, r0)
            java.util.Map r0 = p298d.p334t.C6790h.m12338Y(r0)
            java.util.List<java.lang.reflect.Method> r1 = r13.f11813g
            java.lang.Object r14 = p005b.p291q.p292a.C5266a.m9990m0(r14, r0, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p302x0.C5977a.mo23072k(java.lang.Object[]):java.lang.Object");
    }
}
