package p005b.p096l.p224e.p226e0.p228z;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p005b.p096l.p224e.C4332b0;
import p005b.p096l.p224e.C4334c0;
import p005b.p096l.p224e.C4465k;
import p005b.p096l.p224e.p226e0.C4345a;
import p005b.p096l.p224e.p230f0.C4455a;
import p005b.p096l.p224e.p231g0.C4457a;
import p005b.p096l.p224e.p231g0.C4459b;
import p005b.p096l.p224e.p231g0.C4460c;

/* renamed from: b.l.e.e0.z.a */
public final class C4386a<E> extends C4332b0<Object> {

    /* renamed from: c */
    public static final C4334c0 f8115c = new C4387a();

    /* renamed from: a */
    public final Class<E> f8116a;

    /* renamed from: b */
    public final C4332b0<E> f8117b;

    /* renamed from: b.l.e.e0.z.a$a */
    public class C4387a implements C4334c0 {
        /* renamed from: a */
        public <T> C4332b0<T> mo10754a(C4465k kVar, C4455a<T> aVar) {
            Type type = aVar.f8250b;
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new C4386a(kVar, kVar.mo16119e(new C4455a(genericComponentType)), C4345a.m7965e(genericComponentType));
        }
    }

    public C4386a(C4465k kVar, C4332b0<E> b0Var, Class<E> cls) {
        this.f8117b = new C4413n(kVar, b0Var, cls);
        this.f8116a = cls;
    }

    /* renamed from: a */
    public Object mo10755a(C4457a aVar) {
        if (aVar.mo16060w0() == C4459b.NULL) {
            aVar.mo16057s0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.mo16050d();
        while (aVar.mo16048Z()) {
            arrayList.add(this.f8117b.mo10755a(aVar));
        }
        aVar.mo16045H();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f8116a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: b */
    public void mo10756b(C4460c cVar, Object obj) {
        if (obj == null) {
            cVar.mo16066Z();
            return;
        }
        cVar.mo16068e();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f8117b.mo10756b(cVar, Array.get(obj, i));
        }
        cVar.mo16063H();
    }
}
