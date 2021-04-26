package p005b.p096l.p232f.p237c0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4577e;
import p005b.p096l.p232f.C4619m;
import p005b.p096l.p232f.C4622p;
import p005b.p096l.p232f.C4623q;
import p005b.p096l.p232f.p237c0.p238c0.C4502e;
import p005b.p096l.p232f.p237c0.p238c0.p239f.C4505c;
import p005b.p096l.p232f.p258y.C4657a;

/* renamed from: b.l.f.c0.p */
public final class C4539p extends C4541r {

    /* renamed from: b */
    public static final C4541r[] f8468b = new C4541r[0];

    /* renamed from: a */
    public final C4541r[] f8469a;

    public C4539p(Map<C4577e, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(C4577e.POSSIBLE_FORMATS);
        boolean z = (map == null || map.get(C4577e.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(C4484a.EAN_13) || collection.contains(C4484a.UPC_A) || collection.contains(C4484a.EAN_8) || collection.contains(C4484a.UPC_E)) {
                arrayList.add(new C4540q(map));
            }
            if (collection.contains(C4484a.CODE_39)) {
                arrayList.add(new C4528e(z));
            }
            if (collection.contains(C4484a.CODE_93)) {
                arrayList.add(new C4530g());
            }
            if (collection.contains(C4484a.CODE_128)) {
                arrayList.add(new C4497c());
            }
            if (collection.contains(C4484a.ITF)) {
                arrayList.add(new C4537n());
            }
            if (collection.contains(C4484a.CODABAR)) {
                arrayList.add(new C4493a());
            }
            if (collection.contains(C4484a.RSS_14)) {
                arrayList.add(new C4502e());
            }
            if (collection.contains(C4484a.RSS_EXPANDED)) {
                arrayList.add(new C4505c());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C4540q(map));
            arrayList.add(new C4528e(false));
            arrayList.add(new C4493a());
            arrayList.add(new C4530g());
            arrayList.add(new C4497c());
            arrayList.add(new C4537n());
            arrayList.add(new C4502e());
            arrayList.add(new C4505c());
        }
        this.f8469a = (C4541r[]) arrayList.toArray(f8468b);
    }

    /* renamed from: c */
    public void mo16154c() {
        for (C4541r c : this.f8469a) {
            c.mo16154c();
        }
    }

    /* renamed from: d */
    public C4623q mo16159d(int i, C4657a aVar, Map<C4577e, ?> map) {
        C4541r[] rVarArr = this.f8469a;
        int i2 = 0;
        while (i2 < rVarArr.length) {
            try {
                return rVarArr[i2].mo16159d(i, aVar, map);
            } catch (C4622p unused) {
                i2++;
            }
        }
        throw C4619m.f8685i;
    }
}
