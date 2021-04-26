package p005b.p096l.p224e.p226e0.p228z;

import java.util.ArrayList;
import p005b.p096l.p224e.C4332b0;
import p005b.p096l.p224e.C4334c0;
import p005b.p096l.p224e.C4465k;
import p005b.p096l.p224e.p226e0.C4372s;
import p005b.p096l.p224e.p230f0.C4455a;
import p005b.p096l.p224e.p231g0.C4457a;
import p005b.p096l.p224e.p231g0.C4460c;

/* renamed from: b.l.e.e0.z.h */
public final class C4399h extends C4332b0<Object> {

    /* renamed from: b */
    public static final C4334c0 f8141b = new C4400a();

    /* renamed from: a */
    public final C4465k f8142a;

    /* renamed from: b.l.e.e0.z.h$a */
    public class C4400a implements C4334c0 {
        /* renamed from: a */
        public <T> C4332b0<T> mo10754a(C4465k kVar, C4455a<T> aVar) {
            if (aVar.f8249a == Object.class) {
                return new C4399h(kVar);
            }
            return null;
        }
    }

    public C4399h(C4465k kVar) {
        this.f8142a = kVar;
    }

    /* renamed from: a */
    public Object mo10755a(C4457a aVar) {
        int ordinal = aVar.mo16060w0().ordinal();
        if (ordinal == 0) {
            ArrayList arrayList = new ArrayList();
            aVar.mo16050d();
            while (aVar.mo16048Z()) {
                arrayList.add(mo10755a(aVar));
            }
            aVar.mo16045H();
            return arrayList;
        } else if (ordinal == 2) {
            C4372s sVar = new C4372s();
            aVar.mo16051e();
            while (aVar.mo16048Z()) {
                sVar.put(aVar.mo16056q0(), mo10755a(aVar));
            }
            aVar.mo16046N();
            return sVar;
        } else if (ordinal == 5) {
            return aVar.mo16059u0();
        } else {
            if (ordinal == 6) {
                return Double.valueOf(aVar.mo16053n0());
            }
            if (ordinal == 7) {
                return Boolean.valueOf(aVar.mo16052l0());
            }
            if (ordinal == 8) {
                aVar.mo16057s0();
                return null;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public void mo10756b(C4460c cVar, Object obj) {
        if (obj == null) {
            cVar.mo16066Z();
            return;
        }
        C4332b0<?> f = this.f8142a.mo16120f(obj.getClass());
        if (f instanceof C4399h) {
            cVar.mo16072q();
            cVar.mo16064N();
            return;
        }
        f.mo10756b(cVar, obj);
    }
}
