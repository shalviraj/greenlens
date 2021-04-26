package p005b.p096l.p224e;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;
import p005b.p096l.p224e.p231g0.C4457a;
import p005b.p096l.p224e.p231g0.C4460c;

/* renamed from: b.l.e.j */
public class C4464j extends C4332b0<AtomicLongArray> {

    /* renamed from: a */
    public final /* synthetic */ C4332b0 f8291a;

    public C4464j(C4332b0 b0Var) {
        this.f8291a = b0Var;
    }

    /* renamed from: a */
    public Object mo10755a(C4457a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.mo16050d();
        while (aVar.mo16048Z()) {
            arrayList.add(Long.valueOf(((Number) this.f8291a.mo10755a(aVar)).longValue()));
        }
        aVar.mo16045H();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    /* renamed from: b */
    public void mo10756b(C4460c cVar, Object obj) {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        cVar.mo16068e();
        int length = atomicLongArray.length();
        for (int i = 0; i < length; i++) {
            this.f8291a.mo10756b(cVar, Long.valueOf(atomicLongArray.get(i)));
        }
        cVar.mo16063H();
    }
}
