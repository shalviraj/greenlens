package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.C6726e;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6412a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6414b;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6420g;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.j1.b.c */
public final class C6177c extends C6200u implements C6412a {

    /* renamed from: a */
    public final Annotation f12198a;

    public C6177c(Annotation annotation) {
        C6888i.m12438e(annotation, "annotation");
        this.f12198a = annotation;
    }

    /* renamed from: L */
    public boolean mo23349L() {
        C6888i.m12438e(this, "this");
        return false;
    }

    /* renamed from: b */
    public C6713a mo23350b() {
        return C6173b.m11073b(C5266a.m10033t1(C5266a.m9913Z0(this.f12198a)));
    }

    /* renamed from: c */
    public boolean mo23351c() {
        C6888i.m12438e(this, "this");
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6177c) && C6888i.m12434a(this.f12198a, ((C6177c) obj).f12198a);
    }

    /* renamed from: g */
    public Collection<C6414b> mo23353g() {
        Method[] declaredMethods = C5266a.m10033t1(C5266a.m9913Z0(this.f12198a)).getDeclaredMethods();
        C6888i.m12437d(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object invoke = method.invoke(this.f12198a, new Object[0]);
            C6888i.m12437d(invoke, "method.invoke(annotation)");
            C6717d l = C6717d.m12270l(method.getName());
            C6888i.m12438e(invoke, "value");
            Class<?> cls = invoke.getClass();
            List<C6726e<? extends Object>> list = C6173b.f12191a;
            C6888i.m12438e(cls, "<this>");
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new C6201v(l, (Enum) invoke) : invoke instanceof Annotation ? new C6181e(l, (Annotation) invoke) : invoke instanceof Object[] ? new C6185g(l, (Object[]) invoke) : invoke instanceof Class ? new C6197r(l, (Class) invoke) : new C6203x(l, invoke));
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f12198a.hashCode();
    }

    /* renamed from: k */
    public C6420g mo23355k() {
        return new C6196q(C5266a.m10033t1(C5266a.m9913Z0(this.f12198a)));
    }

    public String toString() {
        return C6177c.class.getName() + ": " + this.f12198a;
    }
}
