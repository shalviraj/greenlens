package p005b.p273o.p274w4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p005b.p273o.C4857i2;
import p005b.p273o.C4882j1;
import p005b.p273o.C5052z1;

/* renamed from: b.o.w4.e */
public class C5015e {

    /* renamed from: a */
    public ConcurrentHashMap<String, C5011a> f9690a;

    /* renamed from: b */
    public C5013c f9691b;

    public C5015e(C5052z1 z1Var, C4882j1 j1Var) {
        ConcurrentHashMap<String, C5011a> concurrentHashMap = new ConcurrentHashMap<>();
        this.f9690a = concurrentHashMap;
        this.f9691b = new C5013c(z1Var);
        concurrentHashMap.put(C5012b.f9687f, new C5012b(this.f9691b, j1Var));
        this.f9690a.put(C5014d.f9689f, new C5014d(this.f9691b, j1Var));
    }

    /* renamed from: a */
    public List<C5011a> mo16766a() {
        ArrayList arrayList = new ArrayList();
        C5011a d = mo16769d();
        if (d != null) {
            arrayList.add(d);
        }
        C5011a c = mo16768c();
        if (c != null) {
            arrayList.add(c);
        }
        return arrayList;
    }

    /* renamed from: b */
    public List<C5011a> mo16767b(C4857i2.C4863f fVar) {
        C5011a d;
        ArrayList arrayList = new ArrayList();
        if (fVar.equals(C4857i2.C4863f.APP_CLOSE)) {
            return arrayList;
        }
        if (fVar.equals(C4857i2.C4863f.APP_OPEN) && (d = mo16769d()) != null) {
            arrayList.add(d);
        }
        C5011a c = mo16768c();
        if (c != null) {
            arrayList.add(c);
        }
        return arrayList;
    }

    /* renamed from: c */
    public C5011a mo16768c() {
        return this.f9690a.get(C5012b.f9687f);
    }

    /* renamed from: d */
    public C5011a mo16769d() {
        return this.f9690a.get(C5014d.f9689f);
    }
}
