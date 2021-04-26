package p298d.p299a.p300a.p301a.p302x0;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import p298d.p333a0.C6758d;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.x0.j */
public final class C6011j<M extends Member> implements C5986h<M> {

    /* renamed from: a */
    public final C6012a f11844a;

    /* renamed from: b */
    public final C5986h<M> f11845b;

    /* renamed from: c */
    public final boolean f11846c;

    /* renamed from: d.a.a.a.x0.j$a */
    public static final class C6012a {

        /* renamed from: a */
        public final C6758d f11847a;

        /* renamed from: b */
        public final Method[] f11848b;

        /* renamed from: c */
        public final Method f11849c;

        public C6012a(C6758d dVar, Method[] methodArr, Method method) {
            C6888i.m12438e(dVar, "argumentRange");
            C6888i.m12438e(methodArr, "unbox");
            this.f11847a = dVar;
            this.f11848b = methodArr;
            this.f11849c = method;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008c, code lost:
        if ((r11 instanceof p298d.p299a.p300a.p301a.p302x0.C5985g) != false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0103, code lost:
        if (p298d.p299a.p300a.p301a.p303y0.p391i.C7197i.m13050b(r1) != false) goto L_0x0105;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0121 A[LOOP:0: B:52:0x011b->B:54:0x0121, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6011j(p298d.p299a.p300a.p301a.p303y0.p304b.C6023b r10, p298d.p299a.p300a.p301a.p302x0.C5986h<? extends M> r11, boolean r12) {
        /*
            r9 = this;
            java.lang.String r0 = "descriptor"
            p298d.p344x.p346c.C6888i.m12438e(r10, r0)
            java.lang.String r1 = "caller"
            p298d.p344x.p346c.C6888i.m12438e(r11, r1)
            r9.<init>()
            r9.f11845b = r11
            r9.f11846c = r12
            d.a.a.a.y0.l.c0 r1 = r10.getReturnType()
            p298d.p344x.p346c.C6888i.m12436c(r1)
            java.lang.String r2 = "descriptor.returnType!!"
            p298d.p344x.p346c.C6888i.m12437d(r1, r2)
            java.lang.Class r1 = p005b.p291q.p292a.C5266a.m10060x4(r1)
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x006a
            java.lang.String r5 = "$this$getBoxMethod"
            p298d.p344x.p346c.C6888i.m12438e(r1, r5)
            p298d.p344x.p346c.C6888i.m12438e(r10, r0)
            java.lang.String r0 = "box-impl"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0046 }
            java.lang.reflect.Method r6 = p005b.p291q.p292a.C5266a.m9879S1(r1, r10)     // Catch:{ NoSuchMethodException -> 0x0046 }
            java.lang.Class r6 = r6.getReturnType()     // Catch:{ NoSuchMethodException -> 0x0046 }
            r5[r4] = r6     // Catch:{ NoSuchMethodException -> 0x0046 }
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r0, r5)     // Catch:{ NoSuchMethodException -> 0x0046 }
            java.lang.String r5 = "getDeclaredMethod(\"box\" …d(descriptor).returnType)"
            p298d.p344x.p346c.C6888i.m12437d(r0, r5)     // Catch:{ NoSuchMethodException -> 0x0046 }
            goto L_0x006b
        L_0x0046:
            d.a.a.a.l0 r11 = new d.a.a.a.l0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "No box method found in inline class: "
            r12.append(r0)
            r12.append(r1)
            java.lang.String r0 = " (calling "
            r12.append(r0)
            r12.append(r10)
            r10 = 41
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x006a:
            r0 = r3
        L_0x006b:
            boolean r1 = p298d.p299a.p300a.p301a.p303y0.p391i.C7197i.m13049a(r10)
            if (r1 == 0) goto L_0x007e
            d.a.a.a.x0.j$a r10 = new d.a.a.a.x0.j$a
            d.a0.d r11 = p298d.p333a0.C6758d.f13666k
            d.a0.d r11 = p298d.p333a0.C6758d.f13665j
            java.lang.reflect.Method[] r12 = new java.lang.reflect.Method[r4]
            r10.<init>(r11, r12, r0)
            goto L_0x0178
        L_0x007e:
            boolean r1 = r11 instanceof p298d.p299a.p300a.p301a.p302x0.C5987i.C6004g.C6007c
            java.lang.String r5 = "descriptor.containingDeclaration"
            r6 = -1
            if (r1 == 0) goto L_0x0086
            goto L_0x00aa
        L_0x0086:
            boolean r1 = r10 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6157j
            if (r1 == 0) goto L_0x008f
            boolean r11 = r11 instanceof p298d.p299a.p300a.p301a.p302x0.C5985g
            if (r11 == 0) goto L_0x00a9
            goto L_0x00aa
        L_0x008f:
            d.a.a.a.y0.b.n0 r1 = r10.getDispatchReceiverParameter()
            if (r1 == 0) goto L_0x00a9
            boolean r11 = r11 instanceof p298d.p299a.p300a.p301a.p302x0.C5985g
            if (r11 != 0) goto L_0x00a9
            d.a.a.a.y0.b.k r11 = r10.getContainingDeclaration()
            p298d.p344x.p346c.C6888i.m12437d(r11, r5)
            boolean r11 = p298d.p299a.p300a.p301a.p303y0.p391i.C7197i.m13050b(r11)
            if (r11 == 0) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            r6 = r2
            goto L_0x00aa
        L_0x00a9:
            r6 = r4
        L_0x00aa:
            if (r12 == 0) goto L_0x00ae
            r11 = 2
            goto L_0x00af
        L_0x00ae:
            r11 = r4
        L_0x00af:
            boolean r12 = r10 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6244v
            if (r12 == 0) goto L_0x00be
            r12 = r10
            d.a.a.a.y0.b.v r12 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6244v) r12
            boolean r12 = r12.isSuspend()
            if (r12 == 0) goto L_0x00be
            r12 = r2
            goto L_0x00bf
        L_0x00be:
            r12 = r4
        L_0x00bf:
            int r11 = r11 + r12
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            d.a.a.a.y0.b.n0 r1 = r10.getExtensionReceiverParameter()
            if (r1 == 0) goto L_0x00d0
            d.a.a.a.y0.l.c0 r1 = r1.mo23093a()
            goto L_0x00d1
        L_0x00d0:
            r1 = r3
        L_0x00d1:
            if (r1 == 0) goto L_0x00d4
            goto L_0x010b
        L_0x00d4:
            boolean r1 = r10 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6157j
            if (r1 == 0) goto L_0x00f4
            r1 = r10
            d.a.a.a.y0.b.j r1 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6157j) r1
            d.a.a.a.y0.b.e r1 = r1.mo23249r()
            java.lang.String r5 = "descriptor.constructedClass"
            p298d.p344x.p346c.C6888i.m12437d(r1, r5)
            boolean r5 = r1.isInner()
            if (r5 == 0) goto L_0x010e
            d.a.a.a.y0.b.k r1 = r1.getContainingDeclaration()
            java.lang.String r5 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            java.util.Objects.requireNonNull(r1, r5)
            goto L_0x0105
        L_0x00f4:
            d.a.a.a.y0.b.k r1 = r10.getContainingDeclaration()
            p298d.p344x.p346c.C6888i.m12437d(r1, r5)
            boolean r5 = r1 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6046e
            if (r5 == 0) goto L_0x010e
            boolean r5 = p298d.p299a.p300a.p301a.p303y0.p391i.C7197i.m13050b(r1)
            if (r5 == 0) goto L_0x010e
        L_0x0105:
            d.a.a.a.y0.b.e r1 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r1
            d.a.a.a.y0.l.j0 r1 = r1.getDefaultType()
        L_0x010b:
            r12.add(r1)
        L_0x010e:
            java.util.List r1 = r10.getValueParameters()
            java.lang.String r5 = "descriptor.valueParameters"
            p298d.p344x.p346c.C6888i.m12437d(r1, r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x011b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x012f
            java.lang.Object r5 = r1.next()
            d.a.a.a.y0.b.b1 r5 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1) r5
            d.a.a.a.y0.l.c0 r5 = r5.mo23093a()
            r12.add(r5)
            goto L_0x011b
        L_0x012f:
            int r1 = r12.size()
            int r1 = r1 + r6
            int r1 = r1 + r11
            int r11 = p005b.p291q.p292a.C5266a.m9943e1(r9)
            if (r11 != r1) goto L_0x017b
            int r11 = java.lang.Math.max(r6, r4)
            int r5 = r12.size()
            int r5 = r5 + r6
            d.a0.d r11 = p298d.p333a0.C6759e.m12308d(r11, r5)
            java.lang.reflect.Method[] r5 = new java.lang.reflect.Method[r1]
            r7 = r4
        L_0x014b:
            if (r7 >= r1) goto L_0x0173
            int r8 = r11.f13658g
            if (r8 > r7) goto L_0x0157
            int r8 = r11.f13659h
            if (r7 > r8) goto L_0x0157
            r8 = r2
            goto L_0x0158
        L_0x0157:
            r8 = r4
        L_0x0158:
            if (r8 == 0) goto L_0x016d
            int r8 = r7 - r6
            java.lang.Object r8 = r12.get(r8)
            d.a.a.a.y0.l.c0 r8 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r8
            java.lang.Class r8 = p005b.p291q.p292a.C5266a.m10060x4(r8)
            if (r8 == 0) goto L_0x016d
            java.lang.reflect.Method r8 = p005b.p291q.p292a.C5266a.m9879S1(r8, r10)
            goto L_0x016e
        L_0x016d:
            r8 = r3
        L_0x016e:
            r5[r7] = r8
            int r7 = r7 + 1
            goto L_0x014b
        L_0x0173:
            d.a.a.a.x0.j$a r10 = new d.a.a.a.x0.j$a
            r10.<init>(r11, r5, r0)
        L_0x0178:
            r9.f11844a = r10
            return
        L_0x017b:
            d.a.a.a.l0 r11 = new d.a.a.a.l0
            java.lang.String r12 = "Inconsistent number of parameters in the descriptor and Java reflection object: "
            java.lang.StringBuilder r12 = p005b.p035e.p036a.p037a.C0843a.m460u(r12)
            int r0 = p005b.p291q.p292a.C5266a.m9943e1(r9)
            r12.append(r0)
            java.lang.String r0 = " != "
            r12.append(r0)
            r12.append(r1)
            r0 = 10
            r12.append(r0)
            java.lang.String r1 = "Calling: "
            r12.append(r1)
            r12.append(r10)
            r12.append(r0)
            java.lang.String r10 = "Parameter types: "
            r12.append(r10)
            java.util.List r10 = r9.mo23069a()
            r12.append(r10)
            java.lang.String r10 = ")\n"
            r12.append(r10)
            java.lang.String r10 = "Default: "
            r12.append(r10)
            boolean r10 = r9.f11846c
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p302x0.C6011j.<init>(d.a.a.a.y0.b.b, d.a.a.a.x0.h, boolean):void");
    }

    /* renamed from: a */
    public List<Type> mo23069a() {
        return this.f11845b.mo23069a();
    }

    /* renamed from: b */
    public M mo23070b() {
        return this.f11845b.mo23070b();
    }

    public Type getReturnType() {
        return this.f11845b.getReturnType();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        r0 = r0.invoke((java.lang.Object) null, new java.lang.Object[]{r10});
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo23072k(java.lang.Object[] r10) {
        /*
            r9 = this;
            java.lang.String r0 = "args"
            p298d.p344x.p346c.C6888i.m12438e(r10, r0)
            d.a.a.a.x0.j$a r0 = r9.f11844a
            d.a0.d r1 = r0.f11847a
            java.lang.reflect.Method[] r2 = r0.f11848b
            java.lang.reflect.Method r0 = r0.f11849c
            int r3 = r10.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r10, r3)
            java.lang.String r4 = "java.util.Arrays.copyOf(this, size)"
            p298d.p344x.p346c.C6888i.m12437d(r3, r4)
            int r4 = r1.f13658g
            int r1 = r1.f13659h
            r5 = 0
            if (r4 > r1) goto L_0x0041
        L_0x001e:
            r6 = r2[r4]
            r7 = r10[r4]
            if (r6 == 0) goto L_0x003a
            if (r7 == 0) goto L_0x002d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r7 = r6.invoke(r7, r8)
            goto L_0x003a
        L_0x002d:
            java.lang.Class r6 = r6.getReturnType()
            java.lang.String r7 = "method.returnType"
            p298d.p344x.p346c.C6888i.m12437d(r6, r7)
            java.lang.Object r7 = p298d.p299a.p300a.p301a.C5970v0.m10810e(r6)
        L_0x003a:
            r3[r4] = r7
            if (r4 == r1) goto L_0x0041
            int r4 = r4 + 1
            goto L_0x001e
        L_0x0041:
            d.a.a.a.x0.h<M> r10 = r9.f11845b
            java.lang.Object r10 = r10.mo23072k(r3)
            if (r0 == 0) goto L_0x0056
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r5] = r10
            java.lang.Object r0 = r0.invoke(r1, r2)
            if (r0 == 0) goto L_0x0056
            r10 = r0
        L_0x0056:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p302x0.C6011j.mo23072k(java.lang.Object[]):java.lang.Object");
    }
}
