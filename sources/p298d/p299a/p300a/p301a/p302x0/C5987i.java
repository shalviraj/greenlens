package p298d.p299a.p300a.p301a.p302x0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6904y;

/* renamed from: d.a.a.a.x0.i */
public abstract class C5987i<M extends Member> implements C5986h<M> {

    /* renamed from: a */
    public final List<Type> f11832a;

    /* renamed from: b */
    public final M f11833b;

    /* renamed from: c */
    public final Type f11834c;

    /* renamed from: d */
    public final Class<?> f11835d;

    /* renamed from: d.a.a.a.x0.i$a */
    public static final class C5988a extends C5987i<Constructor<?>> implements C5985g {

        /* renamed from: e */
        public final Object f11836e;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.reflect.Type[]} */
        /* JADX WARNING: Illegal instructions before constructor call */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C5988a(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                p298d.p344x.p346c.C6888i.m12438e(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                p298d.p344x.p346c.C6888i.m12437d(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                p298d.p344x.p346c.C6888i.m12437d(r0, r1)
                int r1 = r0.length
                r2 = 2
                if (r1 > r2) goto L_0x001f
                r0 = 0
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                goto L_0x0026
            L_0x001f:
                int r1 = r0.length
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object[] r0 = p298d.p334t.C6790h.m12355i(r0, r2, r1)
            L_0x0026:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f11836e = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p302x0.C5987i.C5988a.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        /* renamed from: k */
        public Object mo23072k(Object[] objArr) {
            C6888i.m12438e(objArr, "args");
            mo23075c(objArr);
            C6904y yVar = new C6904y(3);
            yVar.f13804a.add(this.f11836e);
            yVar.mo24208a(objArr);
            yVar.f13804a.add((Object) null);
            return ((Constructor) this.f11833b).newInstance(yVar.f13804a.toArray(new Object[yVar.mo24209b()]));
        }
    }

    /* renamed from: d.a.a.a.x0.i$b */
    public static final class C5989b extends C5987i<Constructor<?>> {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.reflect.Type[]} */
        /* JADX WARNING: Illegal instructions before constructor call */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C5989b(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                p298d.p344x.p346c.C6888i.m12438e(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                p298d.p344x.p346c.C6888i.m12437d(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                p298d.p344x.p346c.C6888i.m12437d(r0, r1)
                int r1 = r0.length
                r2 = 0
                r4 = 1
                if (r1 > r4) goto L_0x001f
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                goto L_0x0025
            L_0x001f:
                int r1 = r0.length
                int r1 = r1 - r4
                java.lang.Object[] r0 = p298d.p334t.C6790h.m12355i(r0, r2, r1)
            L_0x0025:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p302x0.C5987i.C5989b.<init>(java.lang.reflect.Constructor):void");
        }

        /* renamed from: k */
        public Object mo23072k(Object[] objArr) {
            C6888i.m12438e(objArr, "args");
            mo23075c(objArr);
            C6904y yVar = new C6904y(2);
            yVar.mo24208a(objArr);
            yVar.f13804a.add((Object) null);
            return ((Constructor) this.f11833b).newInstance(yVar.f13804a.toArray(new Object[yVar.mo24209b()]));
        }
    }

    /* renamed from: d.a.a.a.x0.i$c */
    public static final class C5990c extends C5987i<Constructor<?>> implements C5985g {

        /* renamed from: e */
        public final Object f11837e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C5990c(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                p298d.p344x.p346c.C6888i.m12438e(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                p298d.p344x.p346c.C6888i.m12437d(r3, r0)
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                p298d.p344x.p346c.C6888i.m12437d(r5, r0)
                r4 = 0
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f11837e = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p302x0.C5987i.C5990c.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        /* renamed from: k */
        public Object mo23072k(Object[] objArr) {
            C6888i.m12438e(objArr, "args");
            mo23075c(objArr);
            C6904y yVar = new C6904y(2);
            yVar.f13804a.add(this.f11837e);
            yVar.mo24208a(objArr);
            return ((Constructor) this.f11833b).newInstance(yVar.f13804a.toArray(new Object[yVar.mo24209b()]));
        }
    }

    /* renamed from: d.a.a.a.x0.i$d */
    public static final class C5991d extends C5987i<Constructor<?>> {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C5991d(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                p298d.p344x.p346c.C6888i.m12438e(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                p298d.p344x.p346c.C6888i.m12437d(r3, r0)
                java.lang.Class r0 = r8.getDeclaringClass()
                java.lang.String r1 = "klass"
                p298d.p344x.p346c.C6888i.m12437d(r0, r1)
                java.lang.Class r1 = r0.getDeclaringClass()
                if (r1 == 0) goto L_0x0029
                int r0 = r0.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
                if (r0 != 0) goto L_0x0029
                r4 = r1
                goto L_0x002b
            L_0x0029:
                r0 = 0
                r4 = r0
            L_0x002b:
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                p298d.p344x.p346c.C6888i.m12437d(r5, r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p302x0.C5987i.C5991d.<init>(java.lang.reflect.Constructor):void");
        }

        /* renamed from: k */
        public Object mo23072k(Object[] objArr) {
            C6888i.m12438e(objArr, "args");
            mo23075c(objArr);
            return ((Constructor) this.f11833b).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: d.a.a.a.x0.i$e */
    public static abstract class C5992e extends C5987i<Field> {

        /* renamed from: d.a.a.a.x0.i$e$a */
        public static final class C5993a extends C5992e implements C5985g {

            /* renamed from: e */
            public final Object f11838e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5993a(Field field, Object obj) {
                super(field, false, (DefaultConstructorMarker) null);
                C6888i.m12438e(field, "field");
                this.f11838e = obj;
            }

            /* renamed from: k */
            public Object mo23072k(Object[] objArr) {
                C6888i.m12438e(objArr, "args");
                mo23075c(objArr);
                return ((Field) this.f11833b).get(this.f11838e);
            }
        }

        /* renamed from: d.a.a.a.x0.i$e$b */
        public static final class C5994b extends C5992e implements C5985g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5994b(Field field) {
                super(field, false, (DefaultConstructorMarker) null);
                C6888i.m12438e(field, "field");
            }
        }

        /* renamed from: d.a.a.a.x0.i$e$c */
        public static final class C5995c extends C5992e {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5995c(Field field) {
                super(field, true, (DefaultConstructorMarker) null);
                C6888i.m12438e(field, "field");
            }
        }

        /* renamed from: d.a.a.a.x0.i$e$d */
        public static final class C5996d extends C5992e {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5996d(Field field) {
                super(field, true, (DefaultConstructorMarker) null);
                C6888i.m12438e(field, "field");
            }

            /* renamed from: c */
            public void mo23075c(Object[] objArr) {
                C6888i.m12438e(objArr, "args");
                C5987i.super.mo23075c(objArr);
                mo23076d(C5266a.m9878S0(objArr));
            }
        }

        /* renamed from: d.a.a.a.x0.i$e$e */
        public static final class C5997e extends C5992e {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5997e(Field field) {
                super(field, false, (DefaultConstructorMarker) null);
                C6888i.m12438e(field, "field");
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C5992e(java.lang.reflect.Field r7, boolean r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericType()
                java.lang.String r9 = "field.genericType"
                p298d.p344x.p346c.C6888i.m12437d(r2, r9)
                if (r8 == 0) goto L_0x0010
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L_0x0011
            L_0x0010:
                r8 = 0
            L_0x0011:
                r3 = r8
                r8 = 0
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r8]
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p302x0.C5987i.C5992e.<init>(java.lang.reflect.Field, boolean, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* renamed from: k */
        public Object mo23072k(Object[] objArr) {
            C6888i.m12438e(objArr, "args");
            mo23075c(objArr);
            return ((Field) this.f11833b).get(this.f11835d != null ? C5266a.m9873R0(objArr) : null);
        }
    }

    /* renamed from: d.a.a.a.x0.i$f */
    public static abstract class C5998f extends C5987i<Field> {

        /* renamed from: e */
        public final boolean f11839e;

        /* renamed from: d.a.a.a.x0.i$f$a */
        public static final class C5999a extends C5998f implements C5985g {

            /* renamed from: f */
            public final Object f11840f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5999a(Field field, boolean z, Object obj) {
                super(field, z, false, (DefaultConstructorMarker) null);
                C6888i.m12438e(field, "field");
                this.f11840f = obj;
            }

            /* renamed from: k */
            public Object mo23072k(Object[] objArr) {
                C6888i.m12438e(objArr, "args");
                mo23075c(objArr);
                ((Field) this.f11833b).set(this.f11840f, C5266a.m9873R0(objArr));
                return C6777r.f13694a;
            }
        }

        /* renamed from: d.a.a.a.x0.i$f$b */
        public static final class C6000b extends C5998f implements C5985g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6000b(Field field, boolean z) {
                super(field, z, false, (DefaultConstructorMarker) null);
                C6888i.m12438e(field, "field");
            }

            /* renamed from: k */
            public Object mo23072k(Object[] objArr) {
                C6888i.m12438e(objArr, "args");
                mo23075c(objArr);
                ((Field) this.f11833b).set((Object) null, C5266a.m9875R2(objArr));
                return C6777r.f13694a;
            }
        }

        /* renamed from: d.a.a.a.x0.i$f$c */
        public static final class C6001c extends C5998f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6001c(Field field, boolean z) {
                super(field, z, true, (DefaultConstructorMarker) null);
                C6888i.m12438e(field, "field");
            }
        }

        /* renamed from: d.a.a.a.x0.i$f$d */
        public static final class C6002d extends C5998f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6002d(Field field, boolean z) {
                super(field, z, true, (DefaultConstructorMarker) null);
                C6888i.m12438e(field, "field");
            }

            /* renamed from: c */
            public void mo23075c(Object[] objArr) {
                C6888i.m12438e(objArr, "args");
                super.mo23075c(objArr);
                mo23076d(C5266a.m9878S0(objArr));
            }
        }

        /* renamed from: d.a.a.a.x0.i$f$e */
        public static final class C6003e extends C5998f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6003e(Field field, boolean z) {
                super(field, z, false, (DefaultConstructorMarker) null);
                C6888i.m12438e(field, "field");
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C5998f(java.lang.reflect.Field r7, boolean r8, boolean r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r6 = this;
                java.lang.Class r2 = java.lang.Void.TYPE
                java.lang.String r10 = "Void.TYPE"
                p298d.p344x.p346c.C6888i.m12437d(r2, r10)
                if (r9 == 0) goto L_0x000e
                java.lang.Class r9 = r7.getDeclaringClass()
                goto L_0x000f
            L_0x000e:
                r9 = 0
            L_0x000f:
                r3 = r9
                r9 = 1
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r9]
                r9 = 0
                java.lang.reflect.Type r10 = r7.getGenericType()
                java.lang.String r0 = "field.genericType"
                p298d.p344x.p346c.C6888i.m12437d(r10, r0)
                r4[r9] = r10
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f11839e = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p302x0.C5987i.C5998f.<init>(java.lang.reflect.Field, boolean, boolean, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* renamed from: c */
        public void mo23075c(Object[] objArr) {
            C6888i.m12438e(objArr, "args");
            C5987i.super.mo23075c(objArr);
            if (this.f11839e && C5266a.m9875R2(objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        /* renamed from: k */
        public Object mo23072k(Object[] objArr) {
            C6888i.m12438e(objArr, "args");
            mo23075c(objArr);
            ((Field) this.f11833b).set(this.f11835d != null ? C5266a.m9873R0(objArr) : null, C5266a.m9875R2(objArr));
            return C6777r.f13694a;
        }
    }

    /* renamed from: d.a.a.a.x0.i$g */
    public static abstract class C6004g extends C5987i<Method> {

        /* renamed from: e */
        public final boolean f11841e;

        /* renamed from: d.a.a.a.x0.i$g$a */
        public static final class C6005a extends C6004g implements C5985g {

            /* renamed from: f */
            public final Object f11842f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6005a(Method method, Object obj) {
                super(method, false, (Type[]) null, 4);
                C6888i.m12438e(method, "method");
                this.f11842f = obj;
            }

            /* renamed from: k */
            public Object mo23072k(Object[] objArr) {
                C6888i.m12438e(objArr, "args");
                mo23075c(objArr);
                return mo23077e(this.f11842f, objArr);
            }
        }

        /* renamed from: d.a.a.a.x0.i$g$b */
        public static final class C6006b extends C6004g implements C5985g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6006b(Method method) {
                super(method, false, (Type[]) null, 4);
                C6888i.m12438e(method, "method");
            }

            /* renamed from: k */
            public Object mo23072k(Object[] objArr) {
                C6888i.m12438e(objArr, "args");
                mo23075c(objArr);
                return mo23077e((Object) null, objArr);
            }
        }

        /* renamed from: d.a.a.a.x0.i$g$c */
        public static final class C6007c extends C6004g implements C5985g {

            /* renamed from: f */
            public final Object f11843f;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C6007c(java.lang.reflect.Method r5, java.lang.Object r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "method"
                    p298d.p344x.p346c.C6888i.m12438e(r5, r0)
                    java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
                    java.lang.String r1 = "method.genericParameterTypes"
                    p298d.p344x.p346c.C6888i.m12437d(r0, r1)
                    int r1 = r0.length
                    r2 = 1
                    r3 = 0
                    if (r1 > r2) goto L_0x0016
                    java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r3]
                    goto L_0x001b
                L_0x0016:
                    int r1 = r0.length
                    java.lang.Object[] r0 = p298d.p334t.C6790h.m12355i(r0, r2, r1)
                L_0x001b:
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r4.<init>(r5, r3, r0)
                    r4.f11843f = r6
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p302x0.C5987i.C6004g.C6007c.<init>(java.lang.reflect.Method, java.lang.Object):void");
            }

            /* renamed from: k */
            public Object mo23072k(Object[] objArr) {
                C6888i.m12438e(objArr, "args");
                mo23075c(objArr);
                C6904y yVar = new C6904y(2);
                yVar.f13804a.add(this.f11843f);
                yVar.mo24208a(objArr);
                return mo23077e((Object) null, yVar.f13804a.toArray(new Object[yVar.mo24209b()]));
            }
        }

        /* renamed from: d.a.a.a.x0.i$g$d */
        public static final class C6008d extends C6004g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6008d(Method method) {
                super(method, false, (Type[]) null, 6);
                C6888i.m12438e(method, "method");
            }

            /* renamed from: k */
            public Object mo23072k(Object[] objArr) {
                C6888i.m12438e(objArr, "args");
                mo23075c(objArr);
                return mo23077e(objArr[0], objArr.length <= 1 ? new Object[0] : C6790h.m12355i(objArr, 1, objArr.length));
            }
        }

        /* renamed from: d.a.a.a.x0.i$g$e */
        public static final class C6009e extends C6004g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6009e(Method method) {
                super(method, true, (Type[]) null, 4);
                C6888i.m12438e(method, "method");
            }

            /* renamed from: k */
            public Object mo23072k(Object[] objArr) {
                C6888i.m12438e(objArr, "args");
                mo23075c(objArr);
                mo23076d(C5266a.m9878S0(objArr));
                return mo23077e((Object) null, objArr.length <= 1 ? new Object[0] : C6790h.m12355i(objArr, 1, objArr.length));
            }
        }

        /* renamed from: d.a.a.a.x0.i$g$f */
        public static final class C6010f extends C6004g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6010f(Method method) {
                super(method, false, (Type[]) null, 6);
                C6888i.m12438e(method, "method");
            }

            /* renamed from: k */
            public Object mo23072k(Object[] objArr) {
                C6888i.m12438e(objArr, "args");
                mo23075c(objArr);
                return mo23077e((Object) null, objArr);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C6004g(java.lang.reflect.Method r8, boolean r9, java.lang.reflect.Type[] r10) {
            /*
                r7 = this;
                java.lang.reflect.Type r6 = r8.getGenericReturnType()
                java.lang.String r0 = "method.genericReturnType"
                p298d.p344x.p346c.C6888i.m12437d(r6, r0)
                if (r9 == 0) goto L_0x0010
                java.lang.Class r9 = r8.getDeclaringClass()
                goto L_0x0011
            L_0x0010:
                r9 = 0
            L_0x0011:
                r3 = r9
                r5 = 0
                r0 = r7
                r1 = r8
                r2 = r6
                r4 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.Class r8 = java.lang.Void.TYPE
                boolean r8 = p298d.p344x.p346c.C6888i.m12434a(r6, r8)
                r7.f11841e = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p302x0.C5987i.C6004g.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C6004g(java.lang.reflect.Method r1, boolean r2, java.lang.reflect.Type[] r3, int r4) {
            /*
                r0 = this;
                r3 = r4 & 2
                if (r3 == 0) goto L_0x000e
                int r2 = r1.getModifiers()
                boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
                r2 = r2 ^ 1
            L_0x000e:
                r3 = r4 & 4
                if (r3 == 0) goto L_0x001c
                java.lang.reflect.Type[] r3 = r1.getGenericParameterTypes()
                java.lang.String r4 = "method.genericParameterTypes"
                p298d.p344x.p346c.C6888i.m12437d(r3, r4)
                goto L_0x001d
            L_0x001c:
                r3 = 0
            L_0x001d:
                r0.<init>(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p302x0.C5987i.C6004g.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[], int):void");
        }

        /* renamed from: e */
        public final Object mo23077e(Object obj, Object[] objArr) {
            C6888i.m12438e(objArr, "args");
            return this.f11841e ? C6777r.f13694a : ((Method) this.f11833b).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public C5987i(Member member, Type type, Class cls, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
        List<Type> list;
        this.f11833b = member;
        this.f11834c = type;
        this.f11835d = cls;
        if (cls != null) {
            C6904y yVar = new C6904y(2);
            yVar.f13804a.add(cls);
            yVar.mo24208a(typeArr);
            list = C6790h.m12314A((Type[]) yVar.f13804a.toArray(new Type[yVar.mo24209b()]));
        } else {
            list = C5266a.m10066y4(typeArr);
        }
        this.f11832a = list;
    }

    /* renamed from: a */
    public List<Type> mo23069a() {
        return this.f11832a;
    }

    /* renamed from: b */
    public final M mo23070b() {
        return this.f11833b;
    }

    /* renamed from: c */
    public void mo23075c(Object[] objArr) {
        C6888i.m12438e(objArr, "args");
        C5266a.m9836L(this, objArr);
    }

    /* renamed from: d */
    public final void mo23076d(Object obj) {
        if (obj == null || !this.f11833b.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public final Type getReturnType() {
        return this.f11834c;
    }
}
