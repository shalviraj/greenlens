package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collection;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6050e1;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6412a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6420g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6429p;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6719f;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.j1.b.y */
public abstract class C6204y extends C6200u implements C6183f, C6172a0, C6429p {
    /* renamed from: K */
    public C6420g mo23416K() {
        Class<?> declaringClass = mo23408O().getDeclaringClass();
        C6888i.m12437d(declaringClass, "member.declaringClass");
        return new C6196q(declaringClass);
    }

    /* renamed from: O */
    public abstract Member mo23408O();

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010c A[LOOP:1: B:26:0x00a2->B:53:0x010c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0152 A[EDGE_INSN: B:58:0x0152->B:56:0x0152 ?: BREAK  , SYNTHETIC] */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6439z> mo23417P(java.lang.reflect.Type[] r13, java.lang.annotation.Annotation[][] r14, boolean r15) {
        /*
            r12 = this;
            java.lang.String r0 = "parameterTypes"
            p298d.p344x.p346c.C6888i.m12438e(r13, r0)
            java.lang.String r0 = "parameterAnnotations"
            p298d.p344x.p346c.C6888i.m12438e(r14, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r13.length
            r0.<init>(r1)
            java.lang.reflect.Member r1 = r12.mo23408O()
            java.lang.String r2 = "member"
            p298d.p344x.p346c.C6888i.m12438e(r1, r2)
            d.a.a.a.y0.b.j1.b.a$a r3 = p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6170a.f12188a
            r4 = 0
            r5 = 0
            if (r3 != 0) goto L_0x004f
            p298d.p344x.p346c.C6888i.m12438e(r1, r2)
            java.lang.Class r2 = r1.getClass()
            java.lang.String r3 = "getParameters"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x0047 }
            java.lang.reflect.Method r3 = r2.getMethod(r3, r6)     // Catch:{ NoSuchMethodException -> 0x0047 }
            java.lang.ClassLoader r2 = p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6173b.m11076e(r2)
            java.lang.String r6 = "java.lang.reflect.Parameter"
            java.lang.Class r2 = r2.loadClass(r6)
            d.a.a.a.y0.b.j1.b.a$a r6 = new d.a.a.a.y0.b.j1.b.a$a
            java.lang.Class[] r7 = new java.lang.Class[r5]
            java.lang.String r8 = "getName"
            java.lang.reflect.Method r2 = r2.getMethod(r8, r7)
            r6.<init>(r3, r2)
            r3 = r6
            goto L_0x004d
        L_0x0047:
            d.a.a.a.y0.b.j1.b.a$a r2 = new d.a.a.a.y0.b.j1.b.a$a
            r2.<init>(r4, r4)
            r3 = r2
        L_0x004d:
            p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6170a.f12188a = r3
        L_0x004f:
            java.lang.reflect.Method r2 = r3.f12189a
            if (r2 != 0) goto L_0x0054
            goto L_0x0058
        L_0x0054:
            java.lang.reflect.Method r3 = r3.f12190b
            if (r3 != 0) goto L_0x005a
        L_0x0058:
            r2 = r4
            goto L_0x0086
        L_0x005a:
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r1 = r2.invoke(r1, r6)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<*>"
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = r1.length
            r2.<init>(r6)
            int r6 = r1.length
            r7 = r5
        L_0x006f:
            if (r7 >= r6) goto L_0x0086
            r8 = r1[r7]
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.Object r8 = r3.invoke(r8, r9)
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.String"
            java.util.Objects.requireNonNull(r8, r9)
            java.lang.String r8 = (java.lang.String) r8
            r2.add(r8)
            int r7 = r7 + 1
            goto L_0x006f
        L_0x0086:
            if (r2 != 0) goto L_0x008a
            r1 = r4
            goto L_0x0092
        L_0x008a:
            int r1 = r2.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0092:
            if (r1 != 0) goto L_0x0096
            r1 = r5
            goto L_0x009c
        L_0x0096:
            int r1 = r1.intValue()
            int r3 = r13.length
            int r1 = r1 - r3
        L_0x009c:
            int r3 = r13.length
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0152
            r6 = r5
        L_0x00a2:
            int r7 = r6 + 1
            r8 = r13[r6]
            java.lang.String r9 = "type"
            p298d.p344x.p346c.C6888i.m12438e(r8, r9)
            boolean r9 = r8 instanceof java.lang.Class
            if (r9 == 0) goto L_0x00be
            r10 = r8
            java.lang.Class r10 = (java.lang.Class) r10
            boolean r11 = r10.isPrimitive()
            if (r11 == 0) goto L_0x00be
            d.a.a.a.y0.b.j1.b.c0 r8 = new d.a.a.a.y0.b.j1.b.c0
            r8.<init>(r10)
            goto L_0x00e6
        L_0x00be:
            boolean r10 = r8 instanceof java.lang.reflect.GenericArrayType
            if (r10 != 0) goto L_0x00e0
            if (r9 == 0) goto L_0x00ce
            r9 = r8
            java.lang.Class r9 = (java.lang.Class) r9
            boolean r9 = r9.isArray()
            if (r9 == 0) goto L_0x00ce
            goto L_0x00e0
        L_0x00ce:
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x00da
            d.a.a.a.y0.b.j1.b.g0 r9 = new d.a.a.a.y0.b.j1.b.g0
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            r9.<init>(r8)
            goto L_0x00e5
        L_0x00da:
            d.a.a.a.y0.b.j1.b.s r9 = new d.a.a.a.y0.b.j1.b.s
            r9.<init>(r8)
            goto L_0x00e5
        L_0x00e0:
            d.a.a.a.y0.b.j1.b.h r9 = new d.a.a.a.y0.b.j1.b.h
            r9.<init>(r8)
        L_0x00e5:
            r8 = r9
        L_0x00e6:
            if (r2 != 0) goto L_0x00ea
            r9 = r4
            goto L_0x00f4
        L_0x00ea:
            int r9 = r6 + r1
            java.lang.Object r9 = p298d.p334t.C6790h.m12365s(r2, r9)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x010e
        L_0x00f4:
            if (r15 == 0) goto L_0x00fe
            int r10 = p005b.p291q.p292a.C5266a.m9790D1(r13)
            if (r6 != r10) goto L_0x00fe
            r10 = 1
            goto L_0x00ff
        L_0x00fe:
            r10 = r5
        L_0x00ff:
            d.a.a.a.y0.b.j1.b.f0 r11 = new d.a.a.a.y0.b.j1.b.f0
            r6 = r14[r6]
            r11.<init>(r8, r6, r9, r10)
            r0.add(r11)
            if (r7 <= r3) goto L_0x010c
            goto L_0x0152
        L_0x010c:
            r6 = r7
            goto L_0x00a2
        L_0x010e:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "No parameter with index "
            r13.append(r14)
            r13.append(r6)
            r14 = 43
            r13.append(r14)
            r13.append(r1)
            java.lang.String r14 = " (name="
            r13.append(r14)
            d.a.a.a.y0.f.d r14 = r12.getName()
            r13.append(r14)
            java.lang.String r14 = " type="
            r13.append(r14)
            r13.append(r8)
            java.lang.String r14 = ") in "
            r13.append(r14)
            r13.append(r2)
            java.lang.String r14 = "@ReflectJavaMember"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L_0x0152:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6204y.mo23417P(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.List");
    }

    /* renamed from: d */
    public AnnotatedElement mo23364d() {
        return (AnnotatedElement) mo23408O();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6204y) && C6888i.m12434a(mo23408O(), ((C6204y) obj).mo23408O());
    }

    public Collection getAnnotations() {
        return C5266a.m9925b1(this);
    }

    public C6717d getName() {
        String name = mo23408O().getName();
        C6717d l = name == null ? null : C6717d.m12270l(name);
        if (l != null) {
            return l;
        }
        C6717d dVar = C6719f.f13626a;
        C6888i.m12437d(dVar, "NO_NAME_PROVIDED");
        return dVar;
    }

    public C6050e1 getVisibility() {
        return C5266a.m9899W1(this);
    }

    public int hashCode() {
        return mo23408O().hashCode();
    }

    /* renamed from: i */
    public boolean mo23393i() {
        C6888i.m12438e(this, "this");
        return Modifier.isAbstract(mo23339t());
    }

    public boolean isStatic() {
        C6888i.m12438e(this, "this");
        return Modifier.isStatic(mo23339t());
    }

    /* renamed from: j */
    public C6412a mo23344j(C6714b bVar) {
        return C5266a.m9837L0(this, bVar);
    }

    /* renamed from: q */
    public boolean mo23346q() {
        C5266a.m10028s2(this);
        return false;
    }

    /* renamed from: t */
    public int mo23339t() {
        return mo23408O().getModifiers();
    }

    public String toString() {
        return getClass().getName() + ": " + mo23408O();
    }

    /* renamed from: v */
    public boolean mo23400v() {
        C6888i.m12438e(this, "this");
        return Modifier.isFinal(mo23339t());
    }
}
