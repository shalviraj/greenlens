package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p316f0;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6070m;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6071n;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6414b;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6426m;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7221b;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7227g;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7232k;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7570v;
import p298d.p334t.C6790h;
import p298d.p334t.C6800r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.d.a.f0.d */
public final class C6287d {

    /* renamed from: a */
    public static final C6287d f12385a = new C6287d();

    /* renamed from: b */
    public static final Map<String, EnumSet<C6071n>> f12386b = C6790h.m12317D(new C6768j("PACKAGE", EnumSet.noneOf(C6071n.class)), new C6768j("TYPE", EnumSet.of(C6071n.CLASS, C6071n.FILE)), new C6768j("ANNOTATION_TYPE", EnumSet.of(C6071n.ANNOTATION_CLASS)), new C6768j("TYPE_PARAMETER", EnumSet.of(C6071n.TYPE_PARAMETER)), new C6768j("FIELD", EnumSet.of(C6071n.FIELD)), new C6768j("LOCAL_VARIABLE", EnumSet.of(C6071n.LOCAL_VARIABLE)), new C6768j("PARAMETER", EnumSet.of(C6071n.VALUE_PARAMETER)), new C6768j("CONSTRUCTOR", EnumSet.of(C6071n.CONSTRUCTOR)), new C6768j("METHOD", EnumSet.of(C6071n.FUNCTION, C6071n.PROPERTY_GETTER, C6071n.PROPERTY_SETTER)), new C6768j("TYPE_USE", EnumSet.of(C6071n.TYPE)));

    /* renamed from: c */
    public static final Map<String, C6070m> f12387c = C6790h.m12317D(new C6768j("RUNTIME", C6070m.RUNTIME), new C6768j("CLASS", C6070m.BINARY), new C6768j("SOURCE", C6070m.SOURCE));

    /* renamed from: d.a.a.a.y0.d.a.f0.d$a */
    public static final class C6288a extends C6890k implements C6862l<C6021a0, C7452c0> {

        /* renamed from: g */
        public static final C6288a f12388g = new C6288a();

        public C6288a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C6021a0 a0Var = (C6021a0) obj;
            C6888i.m12438e(a0Var, "module");
            C6286c cVar = C6286c.f12379a;
            C6030b1 a1 = C5266a.m9919a1(C6286c.f12381c, a0Var.getBuiltIns().getBuiltInClassByFqName(StandardNames.FqNames.target));
            C7452c0 a = a1 == null ? null : a1.mo23093a();
            if (a != null) {
                return a;
            }
            C7489j0 d = C7570v.m13783d("Error: AnnotationTarget[]");
            C6888i.m12437d(d, "createErrorType(\"Error: AnnotationTarget[]\")");
            return d;
        }
    }

    /* renamed from: a */
    public final C7227g<?> mo23458a(List<? extends C6414b> list) {
        C6888i.m12438e(list, "arguments");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (next instanceof C6426m) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6717d a = ((C6426m) it.next()).mo23410a();
            Iterable iterable = f12386b.get(a == null ? null : a.mo23886e());
            if (iterable == null) {
                iterable = C6800r.f13715g;
            }
            C6790h.m12342b(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(C5266a.m9892V(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C6713a l = C6713a.m12239l(StandardNames.FqNames.annotationTarget);
            C6888i.m12437d(l, "topLevel(StandardNames.FqNames.annotationTarget)");
            C6717d l2 = C6717d.m12270l(((C6071n) it2.next()).name());
            C6888i.m12437d(l2, "identifier(kotlinTarget.name)");
            arrayList3.add(new C7232k(l, l2));
        }
        return new C7221b(arrayList3, C6288a.f12388g);
    }
}
