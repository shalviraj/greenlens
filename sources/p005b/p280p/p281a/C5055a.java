package p005b.p280p.p281a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import p005b.p273o.C4805c3;
import p005b.p280p.p281a.C5075l;

/* renamed from: b.p.a.a */
public final class C5055a extends C5075l<Object> {

    /* renamed from: c */
    public static final C5075l.C5076a f9762c = new C5056a();

    /* renamed from: a */
    public final Class<?> f9763a;

    /* renamed from: b */
    public final C5075l<Object> f9764b;

    /* renamed from: b.p.a.a$a */
    public class C5056a implements C5075l.C5076a {
        /* renamed from: a */
        public C5075l<?> mo16807a(Type type, Set<? extends Annotation> set, C5099x xVar) {
            Type genericComponentType = type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : type instanceof Class ? ((Class) type).getComponentType() : null;
            if (genericComponentType != null && set.isEmpty()) {
                return new C5055a(C4805c3.m8811j(genericComponentType), xVar.mo16930b(genericComponentType)).mo16831c();
            }
            return null;
        }
    }

    public C5055a(Class<?> cls, C5075l<Object> lVar) {
        this.f9763a = cls;
        this.f9764b = lVar;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        ArrayList arrayList = new ArrayList();
        qVar.mo16839d();
        while (qVar.mo16835N()) {
            arrayList.add(this.f9764b.mo16804a(qVar));
        }
        qVar.mo16847q();
        Object newInstance = Array.newInstance(this.f9763a, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        uVar.mo16868d();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f9764b.mo16805e(uVar, Array.get(obj, i));
        }
        uVar.mo16880z();
    }

    public String toString() {
        return this.f9764b + ".array()";
    }
}
