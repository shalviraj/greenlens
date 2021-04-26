package p005b.p096l.p224e.p226e0.p228z;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005b.p096l.p224e.C4331b;
import p005b.p096l.p224e.C4332b0;
import p005b.p096l.p224e.C4333c;
import p005b.p096l.p224e.C4334c0;
import p005b.p096l.p224e.C4344e;
import p005b.p096l.p224e.C4480y;
import p005b.p096l.p224e.p226e0.C4357g;
import p005b.p096l.p224e.p226e0.C4367o;
import p005b.p096l.p224e.p226e0.C4380t;
import p005b.p096l.p224e.p226e0.p227a0.C4350b;
import p005b.p096l.p224e.p231g0.C4457a;
import p005b.p096l.p224e.p231g0.C4459b;
import p005b.p096l.p224e.p231g0.C4460c;

/* renamed from: b.l.e.e0.z.j */
public final class C4402j implements C4334c0 {

    /* renamed from: g */
    public final C4357g f8149g;

    /* renamed from: h */
    public final C4344e f8150h;

    /* renamed from: i */
    public final C4367o f8151i;

    /* renamed from: j */
    public final C4392d f8152j;

    /* renamed from: k */
    public final C4350b f8153k = C4350b.f8061a;

    /* renamed from: b.l.e.e0.z.j$a */
    public static final class C4403a<T> extends C4332b0<T> {

        /* renamed from: a */
        public final C4380t<T> f8154a;

        /* renamed from: b */
        public final Map<String, C4404b> f8155b;

        public C4403a(C4380t<T> tVar, Map<String, C4404b> map) {
            this.f8154a = tVar;
            this.f8155b = map;
        }

        /* renamed from: a */
        public T mo10755a(C4457a aVar) {
            if (aVar.mo16060w0() == C4459b.NULL) {
                aVar.mo16057s0();
                return null;
            }
            T a = this.f8154a.mo15987a();
            try {
                aVar.mo16051e();
                while (aVar.mo16048Z()) {
                    C4404b bVar = this.f8155b.get(aVar.mo16056q0());
                    if (bVar != null) {
                        if (bVar.f8158c) {
                            bVar.mo16081a(aVar, a);
                        }
                    }
                    aVar.mo16040B0();
                }
                aVar.mo16046N();
                return a;
            } catch (IllegalStateException e) {
                throw new C4480y((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: b */
        public void mo10756b(C4460c cVar, T t) {
            if (t == null) {
                cVar.mo16066Z();
                return;
            }
            cVar.mo16072q();
            try {
                for (C4404b next : this.f8155b.values()) {
                    if (next.mo16083c(t)) {
                        cVar.mo16065O(next.f8156a);
                        next.mo16082b(cVar, t);
                    }
                }
                cVar.mo16064N();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: b.l.e.e0.z.j$b */
    public static abstract class C4404b {

        /* renamed from: a */
        public final String f8156a;

        /* renamed from: b */
        public final boolean f8157b;

        /* renamed from: c */
        public final boolean f8158c;

        public C4404b(String str, boolean z, boolean z2) {
            this.f8156a = str;
            this.f8157b = z;
            this.f8158c = z2;
        }

        /* renamed from: a */
        public abstract void mo16081a(C4457a aVar, Object obj);

        /* renamed from: b */
        public abstract void mo16082b(C4460c cVar, Object obj);

        /* renamed from: c */
        public abstract boolean mo16083c(Object obj);
    }

    public C4402j(C4357g gVar, C4344e eVar, C4367o oVar, C4392d dVar) {
        this.f8149g = gVar;
        this.f8150h = eVar;
        this.f8151i = oVar;
        this.f8152j = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0184 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> p005b.p096l.p224e.C4332b0<T> mo10754a(p005b.p096l.p224e.C4465k r35, p005b.p096l.p224e.p230f0.C4455a<T> r36) {
        /*
            r34 = this;
            r11 = r34
            r12 = r35
            r0 = r36
            java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
            java.lang.Class<? super T> r1 = r0.f8249a
            boolean r2 = r13.isAssignableFrom(r1)
            r14 = 0
            if (r2 != 0) goto L_0x0012
            return r14
        L_0x0012:
            b.l.e.e0.g r2 = r11.f8149g
            b.l.e.e0.t r15 = r2.mo15988a(r0)
            b.l.e.e0.z.j$a r10 = new b.l.e.e0.z.j$a
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            boolean r2 = r1.isInterface()
            if (r2 == 0) goto L_0x002c
        L_0x0025:
            r14 = r9
            r33 = r10
            r28 = r15
            goto L_0x01e2
        L_0x002c:
            java.lang.reflect.Type r8 = r0.f8250b
            r7 = r0
            r6 = r1
        L_0x0030:
            if (r6 == r13) goto L_0x0025
            java.lang.reflect.Field[] r5 = r6.getDeclaredFields()
            int r4 = r5.length
            r3 = 0
            r2 = r3
        L_0x0039:
            if (r2 >= r4) goto L_0x01bb
            r1 = r5[r2]
            r0 = 1
            boolean r16 = r11.mo16084b(r1, r0)
            boolean r17 = r11.mo16084b(r1, r3)
            if (r16 != 0) goto L_0x0060
            if (r17 != 0) goto L_0x0060
            r19 = r2
            r29 = r3
            r20 = r4
            r31 = r5
            r36 = r6
            r32 = r7
            r14 = r9
            r33 = r10
            r22 = r13
            r28 = r15
            r15 = r8
            goto L_0x0184
        L_0x0060:
            b.l.e.e0.a0.b r3 = r11.f8153k
            r3.mo15986a(r1)
            java.lang.reflect.Type r3 = r7.f8250b
            java.lang.reflect.Type r14 = r1.getGenericType()
            java.lang.reflect.Type r14 = p005b.p096l.p224e.p226e0.C4345a.m7967g(r3, r6, r14)
            java.lang.Class<b.l.e.d0.b> r3 = p005b.p096l.p224e.p225d0.C4343b.class
            java.lang.annotation.Annotation r3 = r1.getAnnotation(r3)
            b.l.e.d0.b r3 = (p005b.p096l.p224e.p225d0.C4343b) r3
            if (r3 != 0) goto L_0x0086
            b.l.e.e r3 = r11.f8150h
            java.lang.String r3 = r3.mo15966d(r1)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r19 = r2
            goto L_0x0097
        L_0x0086:
            java.lang.String r0 = r3.value()
            java.lang.String[] r3 = r3.alternate()
            r19 = r2
            int r2 = r3.length
            if (r2 != 0) goto L_0x009d
            java.util.List r3 = java.util.Collections.singletonList(r0)
        L_0x0097:
            r20 = r4
            r18 = 1
            r4 = r3
            goto L_0x00bd
        L_0x009d:
            java.util.ArrayList r2 = new java.util.ArrayList
            r20 = r4
            int r4 = r3.length
            r18 = 1
            int r4 = r4 + 1
            r2.<init>(r4)
            r2.add(r0)
            int r0 = r3.length
            r4 = 0
        L_0x00ae:
            if (r4 >= r0) goto L_0x00bc
            r21 = r0
            r0 = r3[r4]
            r2.add(r0)
            int r4 = r4 + 1
            r0 = r21
            goto L_0x00ae
        L_0x00bc:
            r4 = r2
        L_0x00bd:
            int r3 = r4.size()
            r0 = 0
            r2 = 0
        L_0x00c3:
            if (r2 >= r3) goto L_0x0171
            java.lang.Object r21 = r4.get(r2)
            r22 = r13
            r13 = r21
            java.lang.String r13 = (java.lang.String) r13
            r21 = r9
            if (r2 == 0) goto L_0x00d5
            r16 = 0
        L_0x00d5:
            b.l.e.f0.a r9 = new b.l.e.f0.a
            r9.<init>(r14)
            r23 = r0
            java.lang.Class<? super T> r0 = r9.f8249a
            r24 = r2
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 == 0) goto L_0x00ed
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L_0x00ed
            r25 = r18
            goto L_0x00ef
        L_0x00ed:
            r25 = 0
        L_0x00ef:
            java.lang.Class<b.l.e.d0.a> r0 = p005b.p096l.p224e.p225d0.C4342a.class
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            b.l.e.d0.a r0 = (p005b.p096l.p224e.p225d0.C4342a) r0
            if (r0 == 0) goto L_0x0104
            b.l.e.e0.z.d r2 = r11.f8152j
            r26 = r1
            b.l.e.e0.g r1 = r11.f8149g
            b.l.e.b0 r0 = r2.mo16039b(r1, r12, r9, r0)
            goto L_0x0107
        L_0x0104:
            r26 = r1
            r0 = 0
        L_0x0107:
            if (r0 == 0) goto L_0x010c
            r27 = r18
            goto L_0x010e
        L_0x010c:
            r27 = 0
        L_0x010e:
            if (r0 != 0) goto L_0x0114
            b.l.e.b0 r0 = r12.mo16119e(r9)
        L_0x0114:
            r28 = r0
            b.l.e.e0.z.i r2 = new b.l.e.e0.z.i
            r1 = r23
            r0 = r2
            r11 = r1
            r23 = r26
            r1 = r34
            r12 = r2
            r2 = r13
            r26 = r3
            r29 = 0
            r3 = r16
            r30 = r4
            r4 = r17
            r31 = r5
            r5 = r23
            r36 = r6
            r6 = r27
            r27 = r14
            r14 = r7
            r7 = r28
            r28 = r15
            r15 = r8
            r8 = r35
            r32 = r14
            r14 = r21
            r33 = r10
            r10 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r14.put(r13, r12)
            b.l.e.e0.z.j$b r0 = (p005b.p096l.p224e.p226e0.p228z.C4402j.C4404b) r0
            if (r11 != 0) goto L_0x0152
            goto L_0x0153
        L_0x0152:
            r0 = r11
        L_0x0153:
            int r2 = r24 + 1
            r11 = r34
            r12 = r35
            r6 = r36
            r9 = r14
            r8 = r15
            r13 = r22
            r1 = r23
            r3 = r26
            r14 = r27
            r15 = r28
            r4 = r30
            r5 = r31
            r7 = r32
            r10 = r33
            goto L_0x00c3
        L_0x0171:
            r11 = r0
            r31 = r5
            r36 = r6
            r32 = r7
            r14 = r9
            r33 = r10
            r22 = r13
            r28 = r15
            r29 = 0
            r15 = r8
            if (r11 != 0) goto L_0x019f
        L_0x0184:
            int r2 = r19 + 1
            r11 = r34
            r12 = r35
            r6 = r36
            r9 = r14
            r8 = r15
            r4 = r20
            r13 = r22
            r15 = r28
            r3 = r29
            r5 = r31
            r7 = r32
            r10 = r33
            r14 = 0
            goto L_0x0039
        L_0x019f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r2 = " declares multiple JSON fields named "
            r1.append(r2)
            java.lang.String r2 = r11.f8156a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01bb:
            r36 = r6
            r0 = r7
            r14 = r9
            r33 = r10
            r22 = r13
            r28 = r15
            r15 = r8
            java.lang.reflect.Type r0 = r0.f8250b
            java.lang.reflect.Type r1 = r36.getGenericSuperclass()
            r2 = r36
            java.lang.reflect.Type r0 = p005b.p096l.p224e.p226e0.C4345a.m7967g(r0, r2, r1)
            b.l.e.f0.a r7 = new b.l.e.f0.a
            r7.<init>(r0)
            java.lang.Class<? super T> r6 = r7.f8249a
            r11 = r34
            r12 = r35
            r15 = r28
            r14 = 0
            goto L_0x0030
        L_0x01e2:
            r0 = r28
            r1 = r33
            r1.<init>(r0, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p224e.p226e0.p228z.C4402j.mo10754a(b.l.e.k, b.l.e.f0.a):b.l.e.b0");
    }

    /* renamed from: b */
    public boolean mo16084b(Field field, boolean z) {
        boolean z2;
        C4367o oVar = this.f8151i;
        Class<?> type = field.getType();
        if (oVar.mo15991c(type) || oVar.mo15990b(type, z)) {
            return false;
        }
        if ((field.getModifiers() & 136) == 0 && !field.isSynthetic() && !oVar.mo15991c(field.getType())) {
            List<C4331b> list = z ? oVar.f8077g : oVar.f8078h;
            if (!list.isEmpty()) {
                C4333c cVar = new C4333c(field);
                Iterator<C4331b> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().mo15965b(cVar)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return true;
        }
        return false;
    }
}
