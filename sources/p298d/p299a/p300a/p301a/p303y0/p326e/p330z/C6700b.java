package p298d.p299a.p300a.p301a.p303y0.p326e.p330z;

import p298d.p299a.p300a.p301a.p303y0.p326e.C6621c;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6646j;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6647k;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6695x;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7103i;

/* renamed from: d.a.a.a.y0.e.z.b */
public class C6700b {

    /* renamed from: A */
    public static final C6702b f13552A;

    /* renamed from: B */
    public static final C6702b f13553B;

    /* renamed from: C */
    public static final C6702b f13554C;

    /* renamed from: D */
    public static final C6702b f13555D;

    /* renamed from: E */
    public static final C6702b f13556E;

    /* renamed from: F */
    public static final C6702b f13557F;

    /* renamed from: G */
    public static final C6702b f13558G;

    /* renamed from: H */
    public static final C6702b f13559H;

    /* renamed from: I */
    public static final C6702b f13560I;

    /* renamed from: J */
    public static final C6702b f13561J;

    /* renamed from: K */
    public static final C6702b f13562K;

    /* renamed from: L */
    public static final C6702b f13563L;

    /* renamed from: M */
    public static final C6702b f13564M = C6704d.m12224c();

    /* renamed from: a */
    public static final C6702b f13565a = C6704d.m12224c();

    /* renamed from: b */
    public static final C6702b f13566b;

    /* renamed from: c */
    public static final C6704d<C6695x> f13567c;

    /* renamed from: d */
    public static final C6704d<C6647k> f13568d;

    /* renamed from: e */
    public static final C6704d<C6621c.C6624c> f13569e;

    /* renamed from: f */
    public static final C6702b f13570f;

    /* renamed from: g */
    public static final C6702b f13571g;

    /* renamed from: h */
    public static final C6702b f13572h;

    /* renamed from: i */
    public static final C6702b f13573i;

    /* renamed from: j */
    public static final C6702b f13574j;

    /* renamed from: k */
    public static final C6702b f13575k;

    /* renamed from: l */
    public static final C6702b f13576l;

    /* renamed from: m */
    public static final C6702b f13577m;

    /* renamed from: n */
    public static final C6704d<C6646j> f13578n;

    /* renamed from: o */
    public static final C6702b f13579o;

    /* renamed from: p */
    public static final C6702b f13580p;

    /* renamed from: q */
    public static final C6702b f13581q;

    /* renamed from: r */
    public static final C6702b f13582r;

    /* renamed from: s */
    public static final C6702b f13583s;

    /* renamed from: t */
    public static final C6702b f13584t;

    /* renamed from: u */
    public static final C6702b f13585u;

    /* renamed from: v */
    public static final C6702b f13586v;

    /* renamed from: w */
    public static final C6702b f13587w;

    /* renamed from: x */
    public static final C6702b f13588x;

    /* renamed from: y */
    public static final C6702b f13589y;

    /* renamed from: z */
    public static final C6702b f13590z;

    /* renamed from: d.a.a.a.y0.e.z.b$b */
    public static class C6702b extends C6704d<Boolean> {
        public C6702b(int i) {
            super(i, 1, (C6701a) null);
        }

        /* renamed from: f */
        public Boolean mo23840d(int i) {
            Boolean valueOf = Boolean.valueOf((i & (1 << this.f13592a)) != 0);
            if (valueOf != null) {
                return valueOf;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"}));
        }

        /* renamed from: g */
        public int mo23841e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f13592a;
            }
            return 0;
        }
    }

    /* renamed from: d.a.a.a.y0.e.z.b$c */
    public static class C6703c<E extends C7103i.C7104a> extends C6704d<E> {

        /* renamed from: c */
        public final E[] f13591c;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C6703c(int r5, E[] r6) {
            /*
                r4 = this;
                r0 = 1
                if (r6 == 0) goto L_0x0033
                int r1 = r6.length
                int r1 = r1 - r0
                if (r1 != 0) goto L_0x0008
                goto L_0x0012
            L_0x0008:
                r2 = 31
            L_0x000a:
                if (r2 < 0) goto L_0x001c
                int r3 = r0 << r2
                r3 = r3 & r1
                if (r3 == 0) goto L_0x0019
                int r0 = r0 + r2
            L_0x0012:
                r1 = 0
                r4.<init>(r5, r0, r1)
                r4.f13591c = r6
                return
            L_0x0019:
                int r2 = r2 + -1
                goto L_0x000a
            L_0x001c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "Empty enum: "
                java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
                java.lang.Class r6 = r6.getClass()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r5.<init>(r6)
                throw r5
            L_0x0033:
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = 0
                java.lang.String r1 = "enumEntries"
                r5[r6] = r1
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField"
                r5[r0] = r6
                r6 = 2
                java.lang.String r0 = "bitWidth"
                r5[r6] = r0
                java.lang.String r6 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r5 = java.lang.String.format(r6, r5)
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6700b.C6703c.<init>(int, d.a.a.a.y0.g.i$a[]):void");
        }

        /* renamed from: d */
        public Object mo23840d(int i) {
            int i2 = this.f13592a;
            int i3 = (i & (((1 << this.f13593b) - 1) << i2)) >> i2;
            for (E e : this.f13591c) {
                if (e.mo23715f() == i3) {
                    return e;
                }
            }
            return null;
        }

        /* renamed from: e */
        public int mo23841e(Object obj) {
            return ((C7103i.C7104a) obj).mo23715f() << this.f13592a;
        }
    }

    /* renamed from: d.a.a.a.y0.e.z.b$d */
    public static abstract class C6704d<E> {

        /* renamed from: a */
        public final int f13592a;

        /* renamed from: b */
        public final int f13593b;

        public C6704d(int i, int i2, C6701a aVar) {
            this.f13592a = i;
            this.f13593b = i2;
        }

        /* renamed from: a */
        public static <E extends C7103i.C7104a> C6704d<E> m12222a(C6704d<?> dVar, E[] eArr) {
            return new C6703c(dVar.f13592a + dVar.f13593b, eArr);
        }

        /* renamed from: b */
        public static C6702b m12223b(C6704d<?> dVar) {
            return new C6702b(dVar.f13592a + dVar.f13593b);
        }

        /* renamed from: c */
        public static C6702b m12224c() {
            return new C6702b(0);
        }

        /* renamed from: d */
        public abstract E mo23840d(int i);

        /* renamed from: e */
        public abstract int mo23841e(E e);
    }

    static {
        C6702b c = C6704d.m12224c();
        f13566b = c;
        C6704d<C6695x> a = C6704d.m12222a(c, C6695x.values());
        f13567c = a;
        C6704d<C6647k> a2 = C6704d.m12222a(a, C6647k.values());
        f13568d = a2;
        C6704d<C6621c.C6624c> a3 = C6704d.m12222a(a2, C6621c.C6624c.values());
        f13569e = a3;
        C6702b b = C6704d.m12223b(a3);
        f13570f = b;
        C6702b b2 = C6704d.m12223b(b);
        f13571g = b2;
        C6702b b3 = C6704d.m12223b(b2);
        f13572h = b3;
        C6702b b4 = C6704d.m12223b(b3);
        f13573i = b4;
        C6702b b5 = C6704d.m12223b(b4);
        f13574j = b5;
        f13575k = C6704d.m12223b(b5);
        C6702b b6 = C6704d.m12223b(a);
        f13576l = b6;
        f13577m = C6704d.m12223b(b6);
        C6704d<C6646j> a4 = C6704d.m12222a(a2, C6646j.values());
        f13578n = a4;
        C6702b b7 = C6704d.m12223b(a4);
        f13579o = b7;
        C6702b b8 = C6704d.m12223b(b7);
        f13580p = b8;
        C6702b b9 = C6704d.m12223b(b8);
        f13581q = b9;
        C6702b b10 = C6704d.m12223b(b9);
        f13582r = b10;
        C6702b b11 = C6704d.m12223b(b10);
        f13583s = b11;
        C6702b b12 = C6704d.m12223b(b11);
        f13584t = b12;
        C6702b b13 = C6704d.m12223b(b12);
        f13585u = b13;
        f13586v = C6704d.m12223b(b13);
        C6702b b14 = C6704d.m12223b(a4);
        f13587w = b14;
        C6702b b15 = C6704d.m12223b(b14);
        f13588x = b15;
        C6702b b16 = C6704d.m12223b(b15);
        f13589y = b16;
        C6702b b17 = C6704d.m12223b(b16);
        f13590z = b17;
        C6702b b18 = C6704d.m12223b(b17);
        f13552A = b18;
        C6702b b19 = C6704d.m12223b(b18);
        f13553B = b19;
        C6702b b20 = C6704d.m12223b(b19);
        f13554C = b20;
        C6702b b21 = C6704d.m12223b(b20);
        f13555D = b21;
        f13556E = C6704d.m12223b(b21);
        C6702b b22 = C6704d.m12223b(c);
        f13557F = b22;
        C6702b b23 = C6704d.m12223b(b22);
        f13558G = b23;
        f13559H = C6704d.m12223b(b23);
        C6702b b24 = C6704d.m12223b(a2);
        f13560I = b24;
        C6702b b25 = C6704d.m12223b(b24);
        f13561J = b25;
        f13562K = C6704d.m12223b(b25);
        C6702b c2 = C6704d.m12224c();
        f13563L = c2;
        C6704d.m12223b(c2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m12215a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L_0x002b
            if (r5 == r3) goto L_0x0026
            r4 = 5
            if (r5 == r4) goto L_0x002b
            r4 = 6
            if (r5 == r4) goto L_0x0021
            r4 = 8
            if (r5 == r4) goto L_0x002b
            r4 = 9
            if (r5 == r4) goto L_0x0021
            r4 = 11
            if (r5 == r4) goto L_0x002b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L_0x002f
        L_0x0021:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L_0x002f
        L_0x0026:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L_0x002f
        L_0x002b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L_0x002f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L_0x004a;
                case 4: goto L_0x0045;
                case 5: goto L_0x0045;
                case 6: goto L_0x0045;
                case 7: goto L_0x0040;
                case 8: goto L_0x0040;
                case 9: goto L_0x0040;
                case 10: goto L_0x003b;
                case 11: goto L_0x003b;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x003b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0040:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0045:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x004a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L_0x004e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6700b.m12215a(int):void");
    }
}
