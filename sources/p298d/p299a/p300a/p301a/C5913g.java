package p298d.p299a.p300a.p301a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.C6725d;
import p298d.p299a.C6734k;
import p298d.p299a.C6741n;
import p298d.p299a.p300a.p301a.p302x0.C5986h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6305b;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p332w.C6753a;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.g */
public abstract class C5913g<R> implements C6725d<R>, C5929k0 {

    /* renamed from: g */
    public final C5939n0<List<Annotation>> f11713g;

    /* renamed from: h */
    public final C5939n0<ArrayList<C6734k>> f11714h;

    /* renamed from: i */
    public final C5939n0<C5922i0> f11715i;

    /* renamed from: d.a.a.a.g$a */
    public static final class C5914a extends C6890k implements C6851a<List<? extends Annotation>> {

        /* renamed from: g */
        public final /* synthetic */ C5913g f11716g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5914a(C5913g gVar) {
            super(0);
            this.f11716g = gVar;
        }

        public Object invoke() {
            return C5970v0.m10809d(this.f11716g.mo22976x());
        }
    }

    /* renamed from: d.a.a.a.g$b */
    public static final class C5915b extends C6890k implements C6851a<ArrayList<C6734k>> {

        /* renamed from: g */
        public final /* synthetic */ C5913g f11717g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5915b(C5913g gVar) {
            super(0);
            this.f11717g = gVar;
        }

        public Object invoke() {
            int i;
            C6023b x = this.f11717g.mo22976x();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            if (!this.f11717g.mo22977z()) {
                C6213n0 g = C5970v0.m10812g(x);
                if (g != null) {
                    arrayList.add(new C5971w(this.f11717g, 0, C6734k.C6735a.INSTANCE, new C6914e(0, g)));
                    i = 1;
                } else {
                    i = 0;
                }
                C6213n0 extensionReceiverParameter = x.getExtensionReceiverParameter();
                if (extensionReceiverParameter != null) {
                    arrayList.add(new C5971w(this.f11717g, i, C6734k.C6735a.EXTENSION_RECEIVER, new C6914e(1, extensionReceiverParameter)));
                    i++;
                }
            } else {
                i = 0;
            }
            List<C6030b1> valueParameters = x.getValueParameters();
            C6888i.m12437d(valueParameters, "descriptor.valueParameters");
            int size = valueParameters.size();
            while (i2 < size) {
                arrayList.add(new C5971w(this.f11717g, i, C6734k.C6735a.VALUE, new C5921i(x, i2)));
                i2++;
                i++;
            }
            if (this.f11717g.mo23012y() && (x instanceof C6305b) && arrayList.size() > 1) {
                C5266a.m9928b4(arrayList, new C5919h());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    /* renamed from: d.a.a.a.g$c */
    public static final class C5916c extends C6890k implements C6851a<C5922i0> {

        /* renamed from: g */
        public final /* synthetic */ C5913g f11718g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5916c(C5913g gVar) {
            super(0);
            this.f11718g = gVar;
        }

        public Object invoke() {
            C7452c0 returnType = this.f11718g.mo22976x().getReturnType();
            C6888i.m12436c(returnType);
            C6888i.m12437d(returnType, "descriptor.returnType!!");
            return new C5922i0(returnType, new C5925j(this));
        }
    }

    /* renamed from: d.a.a.a.g$d */
    public static final class C5917d extends C6890k implements C6851a<List<? extends C5926j0>> {

        /* renamed from: g */
        public final /* synthetic */ C5913g f11719g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5917d(C5913g gVar) {
            super(0);
            this.f11719g = gVar;
        }

        public Object invoke() {
            List<C6248w0> typeParameters = this.f11719g.mo22976x().getTypeParameters();
            C6888i.m12437d(typeParameters, "descriptor.typeParameters");
            ArrayList arrayList = new ArrayList(C5266a.m9892V(typeParameters, 10));
            for (C6248w0 w0Var : typeParameters) {
                C5913g gVar = this.f11719g;
                C6888i.m12437d(w0Var, "descriptor");
                arrayList.add(new C5926j0(gVar, w0Var));
            }
            return arrayList;
        }
    }

    public C5913g() {
        C5939n0<List<Annotation>> X2 = C5266a.m9905X2(new C5914a(this));
        C6888i.m12437d(X2, "ReflectProperties.lazySo…or.computeAnnotations() }");
        this.f11713g = X2;
        C5939n0<ArrayList<C6734k>> X22 = C5266a.m9905X2(new C5915b(this));
        C6888i.m12437d(X22, "ReflectProperties.lazySo…ze()\n        result\n    }");
        this.f11714h = X22;
        C5939n0<C5922i0> X23 = C5266a.m9905X2(new C5916c(this));
        C6888i.m12437d(X23, "ReflectProperties.lazySo…eturnType\n        }\n    }");
        this.f11715i = X23;
        C6888i.m12437d(C5266a.m9905X2(new C5917d(this)), "ReflectProperties.lazySo…this, descriptor) }\n    }");
    }

    public List<Annotation> getAnnotations() {
        List<Annotation> invoke = this.f11713g.invoke();
        C6888i.m12437d(invoke, "_annotations()");
        return invoke;
    }

    public List<C6734k> getParameters() {
        ArrayList<C6734k> invoke = this.f11714h.invoke();
        C6888i.m12437d(invoke, "_parameters()");
        return invoke;
    }

    public C6741n getReturnType() {
        C5922i0 invoke = this.f11715i.invoke();
        C6888i.m12437d(invoke, "_returnType()");
        return invoke;
    }

    /* renamed from: k */
    public R mo23009k(Object... objArr) {
        C6888i.m12438e(objArr, "args");
        try {
            return mo22973u().mo23072k(objArr);
        } catch (IllegalAccessException e) {
            throw new C6753a(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011c, code lost:
        r9 = r9.f11730j;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x00dd A[SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public R mo23010l(java.util.Map<p298d.p299a.C6734k, ? extends java.lang.Object> r15) {
        /*
            r14 = this;
            java.lang.String r0 = "args"
            p298d.p344x.p346c.C6888i.m12438e(r15, r0)
            boolean r1 = r14.mo23012y()
            java.lang.String r2 = "No argument provided for a required parameter: "
            java.lang.String r3 = "This callable does not support a default call: "
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T>"
            r5 = 0
            r6 = 0
            if (r1 == 0) goto L_0x00c0
            java.util.List r0 = r14.getParameters()
            java.util.ArrayList r1 = new java.util.ArrayList
            r7 = 10
            int r7 = p005b.p291q.p292a.C5266a.m9892V(r0, r7)
            r1.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x0026:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x008a
            java.lang.Object r7 = r0.next()
            d.a.k r7 = (p298d.p299a.C6734k) r7
            boolean r8 = r15.containsKey(r7)
            if (r8 == 0) goto L_0x005b
            java.lang.Object r8 = r15.get(r7)
            if (r8 == 0) goto L_0x003f
            goto L_0x0071
        L_0x003f:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Annotation argument value cannot be null ("
            r0.append(r1)
            r0.append(r7)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x005b:
            boolean r8 = r7.mo23063s()
            if (r8 == 0) goto L_0x0063
            r8 = r5
            goto L_0x0071
        L_0x0063:
            boolean r8 = r7.mo23057e()
            if (r8 == 0) goto L_0x0075
            d.a.n r7 = r7.mo23055a()
            java.lang.Object r8 = r14.mo23011r(r7)
        L_0x0071:
            r1.add(r8)
            goto L_0x0026
        L_0x0075:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x008a:
            d.a.a.a.x0.h r15 = r14.mo22975w()
            if (r15 == 0) goto L_0x00ab
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException -> 0x00a4 }
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch:{ IllegalAccessException -> 0x00a4 }
            if (r0 == 0) goto L_0x009e
            java.lang.Object r15 = r15.mo23072k(r0)     // Catch:{ IllegalAccessException -> 0x00a4 }
            goto L_0x01aa
        L_0x009e:
            java.lang.NullPointerException r15 = new java.lang.NullPointerException     // Catch:{ IllegalAccessException -> 0x00a4 }
            r15.<init>(r4)     // Catch:{ IllegalAccessException -> 0x00a4 }
            throw r15     // Catch:{ IllegalAccessException -> 0x00a4 }
        L_0x00a4:
            r15 = move-exception
            d.a.w.a r0 = new d.a.w.a
            r0.<init>(r15)
            throw r0
        L_0x00ab:
            d.a.a.a.l0 r15 = new d.a.a.a.l0
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r3)
            d.a.a.a.y0.b.b r1 = r14.mo22976x()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x00c0:
            p298d.p344x.p346c.C6888i.m12438e(r15, r0)
            java.util.List r0 = r14.getParameters()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r7 = r0.size()
            r1.<init>(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 1
            r7.<init>(r8)
            java.util.Iterator r0 = r0.iterator()
            r9 = r6
            r10 = r9
            r11 = r10
        L_0x00dd:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x0176
            java.lang.Object r12 = r0.next()
            d.a.k r12 = (p298d.p299a.C6734k) r12
            if (r10 == 0) goto L_0x00f7
            int r13 = r10 % 32
            if (r13 != 0) goto L_0x00f7
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r7.add(r11)
            r11 = r6
        L_0x00f7:
            boolean r13 = r15.containsKey(r12)
            if (r13 == 0) goto L_0x0102
            java.lang.Object r13 = r15.get(r12)
            goto L_0x0152
        L_0x0102:
            boolean r13 = r12.mo23063s()
            if (r13 == 0) goto L_0x0144
            d.a.n r9 = r12.mo23055a()
            d.a.a.a.y0.f.b r13 = p298d.p299a.p300a.p301a.C5970v0.f11793a
            java.lang.String r13 = "$this$isInlineClassType"
            p298d.p344x.p346c.C6888i.m12438e(r9, r13)
            boolean r13 = r9 instanceof p298d.p299a.p300a.p301a.C5922i0
            if (r13 != 0) goto L_0x0118
            r9 = r5
        L_0x0118:
            d.a.a.a.i0 r9 = (p298d.p299a.p300a.p301a.C5922i0) r9
            if (r9 == 0) goto L_0x0128
            d.a.a.a.y0.l.c0 r9 = r9.f11730j
            if (r9 == 0) goto L_0x0128
            boolean r9 = p298d.p299a.p300a.p301a.p303y0.p391i.C7197i.m13051c(r9)
            if (r9 != r8) goto L_0x0128
            r9 = r8
            goto L_0x0129
        L_0x0128:
            r9 = r6
        L_0x0129:
            if (r9 == 0) goto L_0x012d
            r9 = r5
            goto L_0x0139
        L_0x012d:
            d.a.n r9 = r12.mo23055a()
            java.lang.reflect.Type r9 = p005b.p291q.p292a.C5266a.m10063y1(r9)
            java.lang.Object r9 = p298d.p299a.p300a.p301a.C5970v0.m10810e(r9)
        L_0x0139:
            r1.add(r9)
            int r9 = r10 % 32
            int r9 = r8 << r9
            r9 = r9 | r11
            r11 = r9
            r9 = r8
            goto L_0x0155
        L_0x0144:
            boolean r13 = r12.mo23057e()
            if (r13 == 0) goto L_0x0161
            d.a.n r13 = r12.mo23055a()
            java.lang.Object r13 = r14.mo23011r(r13)
        L_0x0152:
            r1.add(r13)
        L_0x0155:
            d.a.k$a r12 = r12.getKind()
            d.a.k$a r13 = p298d.p299a.C6734k.C6735a.VALUE
            if (r12 != r13) goto L_0x00dd
            int r10 = r10 + 1
            goto L_0x00dd
        L_0x0161:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x0176:
            if (r9 != 0) goto L_0x018b
            java.lang.Object[] r15 = new java.lang.Object[r6]
            java.lang.Object[] r15 = r1.toArray(r15)
            java.util.Objects.requireNonNull(r15, r4)
            int r0 = r15.length
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r0)
            java.lang.Object r15 = r14.mo23009k(r15)
            goto L_0x01aa
        L_0x018b:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            r7.add(r15)
            d.a.a.a.x0.h r15 = r14.mo22975w()
            if (r15 == 0) goto L_0x01b8
            r1.addAll(r7)
            r1.add(r5)
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException -> 0x01b1 }
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch:{ IllegalAccessException -> 0x01b1 }
            if (r0 == 0) goto L_0x01ab
            java.lang.Object r15 = r15.mo23072k(r0)     // Catch:{ IllegalAccessException -> 0x01b1 }
        L_0x01aa:
            return r15
        L_0x01ab:
            java.lang.NullPointerException r15 = new java.lang.NullPointerException     // Catch:{ IllegalAccessException -> 0x01b1 }
            r15.<init>(r4)     // Catch:{ IllegalAccessException -> 0x01b1 }
            throw r15     // Catch:{ IllegalAccessException -> 0x01b1 }
        L_0x01b1:
            r15 = move-exception
            d.a.w.a r0 = new d.a.w.a
            r0.<init>(r15)
            throw r0
        L_0x01b8:
            d.a.a.a.l0 r15 = new d.a.a.a.l0
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r3)
            d.a.a.a.y0.b.b r1 = r14.mo22976x()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.C5913g.mo23010l(java.util.Map):java.lang.Object");
    }

    /* renamed from: r */
    public final Object mo23011r(C6741n nVar) {
        Class<?> t1 = C5266a.m10033t1(C5266a.m9772A1(nVar));
        if (t1.isArray()) {
            Object newInstance = Array.newInstance(t1.getComponentType(), 0);
            C6888i.m12437d(newInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return newInstance;
        }
        StringBuilder u = C0843a.m460u("Cannot instantiate the default empty array of type ");
        u.append(t1.getSimpleName());
        u.append(", because it is not an array type");
        throw new C5931l0(u.toString());
    }

    /* renamed from: u */
    public abstract C5986h<?> mo22973u();

    /* renamed from: v */
    public abstract C5934n mo22974v();

    /* renamed from: w */
    public abstract C5986h<?> mo22975w();

    /* renamed from: x */
    public abstract C6023b mo22976x();

    /* renamed from: y */
    public final boolean mo23012y() {
        return C6888i.m12434a(getName(), "<init>") && mo22974v().mo22949n().isAnnotation();
    }

    /* renamed from: z */
    public abstract boolean mo22977z();
}
