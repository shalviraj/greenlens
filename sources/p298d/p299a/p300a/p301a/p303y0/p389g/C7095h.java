package p298d.p299a.p300a.p301a.p303y0.p389g;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7081a;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7093g;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7103i;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7107k;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7117p;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7127u;

/* renamed from: d.a.a.a.y0.g.h */
public abstract class C7095h extends C7081a implements Serializable {

    /* renamed from: d.a.a.a.y0.g.h$b */
    public static abstract class C7097b<MessageType extends C7095h, BuilderType extends C7097b> extends C7081a.C7082a<BuilderType> {

        /* renamed from: g */
        public C7085c f14190g = C7085c.f14160g;

        /* renamed from: i */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* renamed from: j */
        public abstract BuilderType mo23694j(MessageType messagetype);
    }

    /* renamed from: d.a.a.a.y0.g.h$c */
    public static abstract class C7098c<MessageType extends C7099d<MessageType>, BuilderType extends C7098c<MessageType, BuilderType>> extends C7097b<MessageType, BuilderType> implements Object<MessageType> {

        /* renamed from: h */
        public C7093g<C7101e> f14191h = C7093g.f14186d;

        /* renamed from: i */
        public boolean f14192i;

        /* renamed from: k */
        public final void mo24678k(MessageType messagetype) {
            if (!this.f14192i) {
                this.f14191h = this.f14191h.clone();
                this.f14192i = true;
            }
            C7093g<C7101e> gVar = this.f14191h;
            C7093g<C7101e> gVar2 = messagetype.f14193g;
            Objects.requireNonNull(gVar);
            for (int i = 0; i < gVar2.f14187a.mo24738e(); i++) {
                gVar.mo24670j(gVar2.f14187a.mo24735c(i));
            }
            for (Map.Entry<FieldDescriptorType, Object> j : gVar2.f14187a.mo24740f()) {
                gVar.mo24670j(j);
            }
        }
    }

    /* renamed from: d.a.a.a.y0.g.h$e */
    public static final class C7101e implements C7093g.C7094a<C7101e> {

        /* renamed from: g */
        public final C7103i.C7105b<?> f14198g;

        /* renamed from: h */
        public final int f14199h;

        /* renamed from: i */
        public final C7139y f14200i;

        /* renamed from: j */
        public final boolean f14201j;

        /* renamed from: k */
        public final boolean f14202k;

        public C7101e(C7103i.C7105b<?> bVar, int i, C7139y yVar, boolean z, boolean z2) {
            this.f14198g = bVar;
            this.f14199h = i;
            this.f14200i = yVar;
            this.f14201j = z;
            this.f14202k = z2;
        }

        public int compareTo(Object obj) {
            return this.f14199h - ((C7101e) obj).f14199h;
        }

        /* renamed from: f */
        public int mo24672f() {
            return this.f14199h;
        }

        /* renamed from: g */
        public C7117p.C7118a mo24673g(C7117p.C7118a aVar, C7117p pVar) {
            return ((C7097b) aVar).mo23694j((C7095h) pVar);
        }

        /* renamed from: h */
        public boolean mo24674h() {
            return this.f14201j;
        }

        /* renamed from: j */
        public C7139y mo24675j() {
            return this.f14200i;
        }

        /* renamed from: m */
        public C7144z mo24676m() {
            return this.f14200i.f14275g;
        }

        /* renamed from: o */
        public boolean mo24677o() {
            return this.f14202k;
        }
    }

    /* renamed from: d.a.a.a.y0.g.h$f */
    public static class C7102f<ContainingType extends C7117p, Type> {

        /* renamed from: a */
        public final ContainingType f14203a;

        /* renamed from: b */
        public final Type f14204b;

        /* renamed from: c */
        public final C7117p f14205c;

        /* renamed from: d */
        public final C7101e f14206d;

        /* renamed from: e */
        public final Method f14207e;

        public C7102f(ContainingType containingtype, Type type, C7117p pVar, C7101e eVar, Class cls) {
            Method method;
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (eVar.f14200i == C7139y.MESSAGE && pVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f14203a = containingtype;
                this.f14204b = type;
                this.f14205c = pVar;
                this.f14206d = eVar;
                if (C7103i.C7104a.class.isAssignableFrom(cls)) {
                    try {
                        method = cls.getMethod("valueOf", new Class[]{Integer.TYPE});
                    } catch (NoSuchMethodException e) {
                        String name = cls.getName();
                        StringBuilder sb = new StringBuilder(name.length() + 45 + 7);
                        C0843a.m431G(sb, "Generated message class \"", name, "\" missing method \"", "valueOf");
                        sb.append("\".");
                        throw new RuntimeException(sb.toString(), e);
                    }
                } else {
                    method = null;
                }
                this.f14207e = method;
            }
        }

        /* renamed from: a */
        public Object mo24689a(Object obj) {
            if (this.f14206d.f14200i.f14275g != C7144z.ENUM) {
                return obj;
            }
            try {
                return this.f14207e.invoke((Object) null, new Object[]{(Integer) obj});
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else if (cause instanceof Error) {
                    throw ((Error) cause);
                } else {
                    throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
                }
            }
        }

        /* renamed from: b */
        public Object mo24690b(Object obj) {
            return this.f14206d.f14200i.f14275g == C7144z.ENUM ? Integer.valueOf(((C7103i.C7104a) obj).mo23715f()) : obj;
        }
    }

    public C7095h() {
    }

    public C7095h(C7097b bVar) {
    }

    /* renamed from: h */
    public static <ContainingType extends C7117p, Type> C7102f<ContainingType, Type> m12772h(ContainingType containingtype, C7117p pVar, C7103i.C7105b<?> bVar, int i, C7139y yVar, boolean z, Class cls) {
        return new C7102f(containingtype, Collections.emptyList(), pVar, new C7101e((C7103i.C7105b<?>) null, i, yVar, true, z), cls);
    }

    /* renamed from: i */
    public static <ContainingType extends C7117p, Type> C7102f<ContainingType, Type> m12773i(ContainingType containingtype, Type type, C7117p pVar, C7103i.C7105b<?> bVar, int i, C7139y yVar, Class cls) {
        return new C7102f(containingtype, type, pVar, new C7101e((C7103i.C7105b<?>) null, i, yVar, false, false), cls);
    }

    /* renamed from: d.a.a.a.y0.g.h$d */
    public static abstract class C7099d<MessageType extends C7099d<MessageType>> extends C7095h implements Object<MessageType> {

        /* renamed from: g */
        public final C7093g<C7101e> f14193g;

        /* renamed from: d.a.a.a.y0.g.h$d$a */
        public class C7100a {

            /* renamed from: a */
            public final Iterator<Map.Entry<C7101e, Object>> f14194a;

            /* renamed from: b */
            public Map.Entry<C7101e, Object> f14195b;

            /* renamed from: c */
            public final boolean f14196c;

            public C7100a(boolean z, C7096a aVar) {
                C7093g<C7101e> gVar = C7099d.this.f14193g;
                Iterator<Map.Entry<C7101e, Object>> cVar = gVar.f14189c ? new C7107k.C7110c<>(((C7127u.C7133d) gVar.f14187a.entrySet()).iterator()) : ((C7127u.C7133d) gVar.f14187a.entrySet()).iterator();
                this.f14194a = cVar;
                if (cVar.hasNext()) {
                    this.f14195b = cVar.next();
                }
                this.f14196c = z;
            }

            /* renamed from: a */
            public void mo24687a(int i, C7089e eVar) {
                while (true) {
                    Map.Entry<C7101e, Object> entry = this.f14195b;
                    if (entry != null && entry.getKey().f14199h < i) {
                        C7101e key = this.f14195b.getKey();
                        if (!this.f14196c || key.f14200i.f14275g != C7144z.MESSAGE || key.f14201j) {
                            Object value = this.f14195b.getValue();
                            C7093g gVar = C7093g.f14186d;
                            C7139y j = key.mo24675j();
                            int f = key.mo24672f();
                            if (key.mo24674h()) {
                                List<Object> list = (List) value;
                                if (key.mo24677o()) {
                                    eVar.mo24643A(f, 2);
                                    int i2 = 0;
                                    for (Object d : list) {
                                        i2 += C7093g.m12751d(j, d);
                                    }
                                    eVar.mo24658y(i2);
                                    for (Object o : list) {
                                        C7093g.m12757o(eVar, j, o);
                                    }
                                } else {
                                    for (Object n : list) {
                                        C7093g.m12756n(eVar, j, f, n);
                                    }
                                }
                            } else if (value instanceof C7107k) {
                                C7093g.m12756n(eVar, j, f, ((C7107k) value).mo24693a());
                            } else {
                                C7093g.m12756n(eVar, j, f, value);
                            }
                        } else {
                            int i3 = key.f14199h;
                            eVar.mo24643A(1, 3);
                            eVar.mo24658y(16);
                            eVar.mo24658y(i3);
                            eVar.mo24651r(3, (C7117p) this.f14195b.getValue());
                            eVar.mo24643A(1, 4);
                        }
                        this.f14195b = this.f14194a.hasNext() ? this.f14194a.next() : null;
                    } else {
                        return;
                    }
                }
            }
        }

        public C7099d() {
            this.f14193g = new C7093g<>();
        }

        /* renamed from: j */
        public boolean mo24679j() {
            C7093g<C7101e> gVar = this.f14193g;
            for (int i = 0; i < gVar.f14187a.mo24738e(); i++) {
                if (!gVar.mo24668h(gVar.f14187a.mo24735c(i))) {
                    return false;
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> h : gVar.f14187a.mo24740f()) {
                if (!gVar.mo24668h(h)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: k */
        public int mo24680k() {
            C7093g<C7101e> gVar = this.f14193g;
            int i = 0;
            for (int i2 = 0; i2 < gVar.f14187a.mo24738e(); i2++) {
                Map.Entry<FieldDescriptorType, Object> c = gVar.f14187a.mo24735c(i2);
                i += C7093g.m12752e((C7093g.C7094a) c.getKey(), c.getValue());
            }
            for (Map.Entry next : gVar.f14187a.mo24740f()) {
                i += C7093g.m12752e((C7093g.C7094a) next.getKey(), next.getValue());
            }
            return i;
        }

        /* renamed from: l */
        public final <Type> Type mo24681l(C7102f<MessageType, Type> fVar) {
            mo24686s(fVar);
            Type f = this.f14193g.mo24667f(fVar.f14206d);
            if (f == null) {
                return fVar.f14204b;
            }
            C7101e eVar = fVar.f14206d;
            if (!eVar.f14201j) {
                return fVar.mo24689a(f);
            }
            if (eVar.f14200i.f14275g != C7144z.ENUM) {
                return f;
            }
            Type arrayList = new ArrayList();
            for (Object a : (List) f) {
                arrayList.add(fVar.mo24689a(a));
            }
            return arrayList;
        }

        /* renamed from: m */
        public final <Type> boolean mo24682m(C7102f<MessageType, Type> fVar) {
            mo24686s(fVar);
            C7093g<C7101e> gVar = this.f14193g;
            C7101e eVar = fVar.f14206d;
            Objects.requireNonNull(gVar);
            if (!eVar.mo24674h()) {
                return gVar.f14187a.get(eVar) != null;
            }
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }

        /* renamed from: o */
        public void mo24683o() {
            this.f14193g.mo24669i();
        }

        /* renamed from: p */
        public C7099d<MessageType>.C0000a mo24684p() {
            return new C7100a(false, (C7096a) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo24685q(p298d.p299a.p300a.p301a.p303y0.p389g.C7088d r8, p298d.p299a.p300a.p301a.p303y0.p389g.C7089e r9, p298d.p299a.p300a.p301a.p303y0.p389g.C7091f r10, int r11) {
            /*
                r7 = this;
                d.a.a.a.y0.g.g<d.a.a.a.y0.g.h$e> r0 = r7.f14193g
                d.a.a.a.y0.g.p r1 = r7.mo23743b()
                r2 = r11 & 7
                int r3 = r11 >>> 3
                java.util.Map<d.a.a.a.y0.g.f$a, d.a.a.a.y0.g.h$f<?, ?>> r4 = r10.f14183a
                d.a.a.a.y0.g.f$a r5 = new d.a.a.a.y0.g.f$a
                r5.<init>(r1, r3)
                java.lang.Object r1 = r4.get(r5)
                d.a.a.a.y0.g.h$f r1 = (p298d.p299a.p300a.p301a.p303y0.p389g.C7095h.C7102f) r1
                r3 = 0
                r4 = 1
                if (r1 != 0) goto L_0x001c
                goto L_0x0044
            L_0x001c:
                d.a.a.a.y0.g.h$e r5 = r1.f14206d
                d.a.a.a.y0.g.y r5 = r5.f14200i
                int r5 = p298d.p299a.p300a.p301a.p303y0.p389g.C7093g.m12753g(r5, r3)
                if (r2 != r5) goto L_0x0029
                r2 = r3
                r5 = r2
                goto L_0x0046
            L_0x0029:
                d.a.a.a.y0.g.h$e r5 = r1.f14206d
                boolean r6 = r5.f14201j
                if (r6 == 0) goto L_0x0044
                d.a.a.a.y0.g.y r5 = r5.f14200i
                boolean r5 = r5.mo24784d()
                if (r5 == 0) goto L_0x0044
                d.a.a.a.y0.g.h$e r5 = r1.f14206d
                d.a.a.a.y0.g.y r5 = r5.f14200i
                int r5 = p298d.p299a.p300a.p301a.p303y0.p389g.C7093g.m12753g(r5, r4)
                if (r2 != r5) goto L_0x0044
                r2 = r3
                r5 = r4
                goto L_0x0046
            L_0x0044:
                r5 = r3
                r2 = r4
            L_0x0046:
                if (r2 == 0) goto L_0x004e
                boolean r4 = r8.mo24640r(r11, r9)
                goto L_0x014d
            L_0x004e:
                if (r5 == 0) goto L_0x009b
                int r9 = r8.mo24634l()
                int r9 = r8.mo24626d(r9)
                d.a.a.a.y0.g.h$e r10 = r1.f14206d
                d.a.a.a.y0.g.y r10 = r10.f14200i
                d.a.a.a.y0.g.y r11 = p298d.p299a.p300a.p301a.p303y0.p389g.C7139y.ENUM
                if (r10 != r11) goto L_0x0080
            L_0x0060:
                int r10 = r8.mo24624b()
                if (r10 <= 0) goto L_0x0094
                int r10 = r8.mo24634l()
                d.a.a.a.y0.g.h$e r11 = r1.f14206d
                d.a.a.a.y0.g.i$b<?> r11 = r11.f14198g
                d.a.a.a.y0.g.i$a r10 = r11.mo24691a(r10)
                if (r10 != 0) goto L_0x0076
                goto L_0x014d
            L_0x0076:
                d.a.a.a.y0.g.h$e r11 = r1.f14206d
                java.lang.Object r10 = r1.mo24690b(r10)
                r0.mo24663a(r11, r10)
                goto L_0x0060
            L_0x0080:
                int r10 = r8.mo24624b()
                if (r10 <= 0) goto L_0x0094
                d.a.a.a.y0.g.h$e r10 = r1.f14206d
                d.a.a.a.y0.g.y r10 = r10.f14200i
                java.lang.Object r10 = p298d.p299a.p300a.p301a.p303y0.p389g.C7093g.m12754k(r8, r10, r3)
                d.a.a.a.y0.g.h$e r11 = r1.f14206d
                r0.mo24663a(r11, r10)
                goto L_0x0080
            L_0x0094:
                r8.f14175i = r9
                r8.mo24638p()
                goto L_0x014d
            L_0x009b:
                d.a.a.a.y0.g.h$e r2 = r1.f14206d
                d.a.a.a.y0.g.y r2 = r2.f14200i
                d.a.a.a.y0.g.z r2 = r2.f14275g
                int r2 = r2.ordinal()
                r5 = 7
                if (r2 == r5) goto L_0x0126
                r9 = 8
                if (r2 == r9) goto L_0x00b6
                d.a.a.a.y0.g.h$e r9 = r1.f14206d
                d.a.a.a.y0.g.y r9 = r9.f14200i
                java.lang.Object r8 = p298d.p299a.p300a.p301a.p303y0.p389g.C7093g.m12754k(r8, r9, r3)
                goto L_0x013c
            L_0x00b6:
                r9 = 0
                d.a.a.a.y0.g.h$e r11 = r1.f14206d
                boolean r2 = r11.f14201j
                if (r2 != 0) goto L_0x00c9
                java.lang.Object r11 = r0.mo24667f(r11)
                d.a.a.a.y0.g.p r11 = (p298d.p299a.p300a.p301a.p303y0.p389g.C7117p) r11
                if (r11 == 0) goto L_0x00c9
                d.a.a.a.y0.g.p$a r9 = r11.mo23684c()
            L_0x00c9:
                if (r9 != 0) goto L_0x00d1
                d.a.a.a.y0.g.p r9 = r1.f14205c
                d.a.a.a.y0.g.p$a r9 = r9.mo23686f()
            L_0x00d1:
                d.a.a.a.y0.g.h$e r11 = r1.f14206d
                d.a.a.a.y0.g.y r2 = r11.f14200i
                d.a.a.a.y0.g.y r5 = p298d.p299a.p300a.p301a.p303y0.p389g.C7139y.GROUP
                r6 = 64
                if (r2 != r5) goto L_0x00fa
                int r11 = r11.f14199h
                int r2 = r8.f14176j
                if (r2 >= r6) goto L_0x00f5
                int r2 = r2 + r4
                r8.f14176j = r2
                r9.mo23689H(r8, r10)
                int r10 = r11 << 3
                r10 = r10 | 4
                r8.mo24623a(r10)
                int r10 = r8.f14176j
                int r10 = r10 + -1
                r8.f14176j = r10
                goto L_0x011c
            L_0x00f5:
                d.a.a.a.y0.g.j r8 = p298d.p299a.p300a.p301a.p303y0.p389g.C7106j.m12797b()
                throw r8
            L_0x00fa:
                int r11 = r8.mo24634l()
                int r2 = r8.f14176j
                if (r2 >= r6) goto L_0x0121
                int r11 = r8.mo24626d(r11)
                int r2 = r8.f14176j
                int r2 = r2 + r4
                r8.f14176j = r2
                r9.mo23689H(r8, r10)
                r8.mo24623a(r3)
                int r10 = r8.f14176j
                int r10 = r10 + -1
                r8.f14176j = r10
                r8.f14175i = r11
                r8.mo24638p()
            L_0x011c:
                d.a.a.a.y0.g.p r8 = r9.mo23691e()
                goto L_0x013c
            L_0x0121:
                d.a.a.a.y0.g.j r8 = p298d.p299a.p300a.p301a.p303y0.p389g.C7106j.m12797b()
                throw r8
            L_0x0126:
                int r8 = r8.mo24634l()
                d.a.a.a.y0.g.h$e r10 = r1.f14206d
                d.a.a.a.y0.g.i$b<?> r10 = r10.f14198g
                d.a.a.a.y0.g.i$a r10 = r10.mo24691a(r8)
                if (r10 != 0) goto L_0x013b
                r9.mo24658y(r11)
                r9.mo24658y(r8)
                goto L_0x014d
            L_0x013b:
                r8 = r10
            L_0x013c:
                d.a.a.a.y0.g.h$e r9 = r1.f14206d
                boolean r10 = r9.f14201j
                java.lang.Object r8 = r1.mo24690b(r8)
                if (r10 == 0) goto L_0x014a
                r0.mo24663a(r9, r8)
                goto L_0x014d
            L_0x014a:
                r0.mo24671l(r9, r8)
            L_0x014d:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p389g.C7095h.C7099d.mo24685q(d.a.a.a.y0.g.d, d.a.a.a.y0.g.e, d.a.a.a.y0.g.f, int):boolean");
        }

        /* renamed from: s */
        public final void mo24686s(C7102f<MessageType, ?> fVar) {
            if (fVar.f14203a != mo23743b()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public C7099d(C7098c<MessageType, ?> cVar) {
            cVar.f14191h.mo24669i();
            cVar.f14192i = false;
            this.f14193g = cVar.f14191h;
        }
    }
}
