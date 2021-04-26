package p298d.p414b0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6887h;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.b0.s */
public class C7679s extends C7676p {

    /* renamed from: d.b0.s$a */
    public static final /* synthetic */ class C7680a extends C6887h implements C6862l<C7668h<? extends R>, Iterator<? extends R>> {

        /* renamed from: p */
        public static final C7680a f15199p = new C7680a();

        public C7680a() {
            super(1, C7668h.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        public Object invoke(Object obj) {
            C7668h hVar = (C7668h) obj;
            C6888i.m12438e(hVar, "p1");
            return hVar.iterator();
        }
    }

    /* renamed from: a */
    public static final <T> int m13893a(C7668h<? extends T> hVar) {
        C6888i.m12438e(hVar, "$this$count");
        Iterator<? extends T> it = hVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }

    /* renamed from: b */
    public static final <T> C7668h<T> m13894b(C7668h<? extends T> hVar, int i) {
        C6888i.m12438e(hVar, "$this$drop");
        if (i >= 0) {
            return i == 0 ? hVar : hVar instanceof C7660c ? ((C7660c) hVar).mo25248a(i) : new C7658b(hVar, i);
        }
        throw new IllegalArgumentException(C0843a.m445f("Requested element count ", i, " is less than zero.").toString());
    }

    /* renamed from: c */
    public static final <T> C7668h<T> m13895c(C7668h<? extends T> hVar, C6862l<? super T, Boolean> lVar) {
        C6888i.m12438e(hVar, "$this$filter");
        C6888i.m12438e(lVar, "predicate");
        return new C7662e(hVar, true, lVar);
    }

    /* renamed from: d */
    public static final <T> C7668h<T> m13896d(C7668h<? extends T> hVar, C6862l<? super T, Boolean> lVar) {
        C6888i.m12438e(hVar, "$this$filterNot");
        C6888i.m12438e(lVar, "predicate");
        return new C7662e(hVar, false, lVar);
    }

    /* renamed from: e */
    public static final <T, R> C7668h<R> m13897e(C7668h<? extends T> hVar, C6862l<? super T, ? extends C7668h<? extends R>> lVar) {
        C6888i.m12438e(hVar, "$this$flatMap");
        C6888i.m12438e(lVar, "transform");
        return new C7664f(hVar, lVar, C7680a.f15199p);
    }

    /* renamed from: f */
    public static final <T, R> C7668h<R> m13898f(C7668h<? extends T> hVar, C6862l<? super T, ? extends R> lVar) {
        C6888i.m12438e(hVar, "$this$map");
        C6888i.m12438e(lVar, "transform");
        return new C7683u(hVar, lVar);
    }

    /* renamed from: g */
    public static final <T, R> C7668h<R> m13899g(C7668h<? extends T> hVar, C6862l<? super T, ? extends R> lVar) {
        C6888i.m12438e(hVar, "$this$mapNotNull");
        C6888i.m12438e(lVar, "transform");
        C7683u uVar = new C7683u(hVar, lVar);
        C6888i.m12438e(uVar, "$this$filterNotNull");
        return m13896d(uVar, C7678r.f15198g);
    }

    /* renamed from: h */
    public static final <T> C7668h<T> m13900h(C7668h<? extends T> hVar, T t) {
        C6888i.m12438e(hVar, "$this$plus");
        return C5266a.m9888U0(C5266a.m9881S3(hVar, C5266a.m9881S3(t)));
    }

    /* renamed from: i */
    public static final <T> List<T> m13901i(C7668h<? extends T> hVar) {
        C6888i.m12438e(hVar, "$this$toList");
        return C6790h.m12319F(m13902j(hVar));
    }

    /* renamed from: j */
    public static final <T> List<T> m13902j(C7668h<? extends T> hVar) {
        C6888i.m12438e(hVar, "$this$toMutableList");
        ArrayList arrayList = new ArrayList();
        C6888i.m12438e(hVar, "$this$toCollection");
        C6888i.m12438e(arrayList, "destination");
        for (Object add : hVar) {
            arrayList.add(add);
        }
        return arrayList;
    }
}
