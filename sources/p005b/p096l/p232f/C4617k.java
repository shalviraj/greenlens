package p005b.p096l.p232f;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p005b.p096l.p232f.p235b0.C4488a;
import p005b.p096l.p232f.p237c0.C4539p;
import p005b.p096l.p232f.p241d0.C4552b;
import p005b.p096l.p232f.p246e0.C4578a;
import p005b.p096l.p232f.p250w.C4630b;
import p005b.p096l.p232f.p261z.C4673a;

/* renamed from: b.l.f.k */
public final class C4617k implements C4621o {

    /* renamed from: c */
    public static final C4621o[] f8682c = new C4621o[0];

    /* renamed from: a */
    public Map<C4577e, ?> f8683a;

    /* renamed from: b */
    public C4621o[] f8684b;

    /* renamed from: a */
    public C4623q mo16152a(C4492c cVar, Map<C4577e, ?> map) {
        mo16280e(map);
        return mo16279d(cVar);
    }

    /* renamed from: b */
    public C4623q mo16153b(C4492c cVar) {
        mo16280e((Map<C4577e, ?>) null);
        return mo16279d(cVar);
    }

    /* renamed from: c */
    public void mo16154c() {
        C4621o[] oVarArr = this.f8684b;
        if (oVarArr != null) {
            for (C4621o c : oVarArr) {
                c.mo16154c();
            }
        }
    }

    /* renamed from: d */
    public final C4623q mo16279d(C4492c cVar) {
        C4621o[] oVarArr = this.f8684b;
        if (oVarArr != null) {
            int length = oVarArr.length;
            int i = 0;
            while (i < length) {
                try {
                    return oVarArr[i].mo16152a(cVar, this.f8683a);
                } catch (C4622p unused) {
                    i++;
                }
            }
        }
        throw C4619m.f8685i;
    }

    /* renamed from: e */
    public void mo16280e(Map<C4577e, ?> map) {
        this.f8683a = map;
        boolean z = true;
        boolean z2 = map != null && map.containsKey(C4577e.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(C4577e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(C4484a.UPC_A) && !collection.contains(C4484a.UPC_E) && !collection.contains(C4484a.EAN_13) && !collection.contains(C4484a.EAN_8) && !collection.contains(C4484a.CODABAR) && !collection.contains(C4484a.CODE_39) && !collection.contains(C4484a.CODE_93) && !collection.contains(C4484a.CODE_128) && !collection.contains(C4484a.ITF) && !collection.contains(C4484a.RSS_14) && !collection.contains(C4484a.RSS_EXPANDED)) {
                z = false;
            }
            if (z && !z2) {
                arrayList.add(new C4539p(map));
            }
            if (collection.contains(C4484a.QR_CODE)) {
                arrayList.add(new C4578a());
            }
            if (collection.contains(C4484a.DATA_MATRIX)) {
                arrayList.add(new C4673a());
            }
            if (collection.contains(C4484a.AZTEC)) {
                arrayList.add(new C4630b());
            }
            if (collection.contains(C4484a.PDF_417)) {
                arrayList.add(new C4552b());
            }
            if (collection.contains(C4484a.MAXICODE)) {
                arrayList.add(new C4488a());
            }
            if (z && z2) {
                arrayList.add(new C4539p(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z2) {
                arrayList.add(new C4539p(map));
            }
            arrayList.add(new C4578a());
            arrayList.add(new C4673a());
            arrayList.add(new C4630b());
            arrayList.add(new C4552b());
            arrayList.add(new C4488a());
            if (z2) {
                arrayList.add(new C4539p(map));
            }
        }
        this.f8684b = (C4621o[]) arrayList.toArray(f8682c);
    }
}
