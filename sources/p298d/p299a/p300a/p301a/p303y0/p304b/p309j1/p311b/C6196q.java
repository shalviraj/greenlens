package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6050e1;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6412a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6415b0;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6420g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6423j;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6435v;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6904y;
import p298d.p414b0.C7679s;

/* renamed from: d.a.a.a.y0.b.j1.b.q */
public final class C6196q extends C6200u implements C6183f, C6172a0, C6420g {

    /* renamed from: a */
    public final Class<?> f12222a;

    public C6196q(Class<?> cls) {
        C6888i.m12438e(cls, "klass");
        this.f12222a = cls;
    }

    /* renamed from: A */
    public boolean mo23378A() {
        return this.f12222a.isInterface();
    }

    /* renamed from: B */
    public C6415b0 mo23379B() {
        return null;
    }

    /* renamed from: D */
    public boolean mo23380D() {
        return false;
    }

    /* renamed from: E */
    public Collection mo23381E() {
        Class[] declaredClasses = this.f12222a.getDeclaredClasses();
        C6888i.m12437d(declaredClasses, "klass.declaredClasses");
        return C7679s.m13901i(C7679s.m13899g(C7679s.m13896d(C5266a.m9776B(declaredClasses), C6192m.f12218g), C6193n.f12219g));
    }

    /* renamed from: G */
    public Collection mo23382G() {
        Method[] declaredMethods = this.f12222a.getDeclaredMethods();
        C6888i.m12437d(declaredMethods, "klass.declaredMethods");
        return C7679s.m13901i(C7679s.m13898f(C7679s.m13895c(C5266a.m9776B(declaredMethods), new C6194o(this)), C6195p.f12221p));
    }

    /* renamed from: H */
    public boolean mo23383H() {
        return false;
    }

    /* renamed from: I */
    public Collection<C6423j> mo23384I() {
        return C6798p.f13713g;
    }

    /* renamed from: d */
    public AnnotatedElement mo23364d() {
        return this.f12222a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6196q) && C6888i.m12434a(this.f12222a, ((C6196q) obj).f12222a);
    }

    /* renamed from: f */
    public boolean mo23386f() {
        return false;
    }

    public Collection getAnnotations() {
        return C5266a.m9925b1(this);
    }

    public Collection getConstructors() {
        Constructor[] declaredConstructors = this.f12222a.getDeclaredConstructors();
        C6888i.m12437d(declaredConstructors, "klass.declaredConstructors");
        return C7679s.m13901i(C7679s.m13898f(C7679s.m13896d(C5266a.m9776B(declaredConstructors), C6188i.f12214p), C6189j.f12215p));
    }

    public C6714b getFqName() {
        C6714b b = C6173b.m11073b(this.f12222a).mo23851b();
        C6888i.m12437d(b, "klass.classId.asSingleFqName()");
        return b;
    }

    public C6717d getName() {
        C6717d l = C6717d.m12270l(this.f12222a.getSimpleName());
        C6888i.m12437d(l, "identifier(klass.simpleName)");
        return l;
    }

    public Collection<C6423j> getSupertypes() {
        Type type = Object.class;
        if (C6888i.m12434a(this.f12222a, type)) {
            return C6798p.f13713g;
        }
        C6904y yVar = new C6904y(2);
        Type genericSuperclass = this.f12222a.getGenericSuperclass();
        if (genericSuperclass != null) {
            type = genericSuperclass;
        }
        yVar.f13804a.add(type);
        Type[] genericInterfaces = this.f12222a.getGenericInterfaces();
        C6888i.m12437d(genericInterfaces, "klass.genericInterfaces");
        yVar.mo24208a(genericInterfaces);
        List<Type> A = C6790h.m12314A(yVar.f13804a.toArray(new Type[yVar.mo24209b()]));
        ArrayList arrayList = new ArrayList(C5266a.m9892V(A, 10));
        for (Type sVar : A) {
            arrayList.add(new C6198s(sVar));
        }
        return arrayList;
    }

    public List<C6182e0> getTypeParameters() {
        TypeVariable[] typeParameters = this.f12222a.getTypeParameters();
        C6888i.m12437d(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable e0Var : typeParameters) {
            arrayList.add(new C6182e0(e0Var));
        }
        return arrayList;
    }

    public C6050e1 getVisibility() {
        return C5266a.m9899W1(this);
    }

    public int hashCode() {
        return this.f12222a.hashCode();
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

    /* renamed from: l */
    public C6420g mo23395l() {
        Class<?> declaringClass = this.f12222a.getDeclaringClass();
        if (declaringClass == null) {
            return null;
        }
        return new C6196q(declaringClass);
    }

    /* renamed from: n */
    public boolean mo23396n() {
        return this.f12222a.isEnum();
    }

    /* renamed from: p */
    public Collection<C6435v> mo23397p() {
        return C6798p.f13713g;
    }

    /* renamed from: q */
    public boolean mo23346q() {
        C5266a.m10028s2(this);
        return false;
    }

    /* renamed from: s */
    public Collection mo23398s() {
        Field[] declaredFields = this.f12222a.getDeclaredFields();
        C6888i.m12437d(declaredFields, "klass.declaredFields");
        return C7679s.m13901i(C7679s.m13898f(C7679s.m13896d(C5266a.m9776B(declaredFields), C6190k.f12216p), C6191l.f12217p));
    }

    /* renamed from: t */
    public int mo23339t() {
        return this.f12222a.getModifiers();
    }

    public String toString() {
        return C6196q.class.getName() + ": " + this.f12222a;
    }

    /* renamed from: v */
    public boolean mo23400v() {
        C6888i.m12438e(this, "this");
        return Modifier.isFinal(mo23339t());
    }

    /* renamed from: z */
    public boolean mo23401z() {
        return this.f12222a.isAnnotation();
    }
}
