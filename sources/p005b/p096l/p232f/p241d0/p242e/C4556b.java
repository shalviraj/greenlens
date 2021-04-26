package p005b.p096l.p232f.p241d0.p242e;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p005b.p096l.p232f.p241d0.C4551a;

/* renamed from: b.l.f.d0.e.b */
public final class C4556b {

    /* renamed from: a */
    public final Map<Integer, Integer> f8502a = new HashMap();

    /* renamed from: a */
    public int[] mo16209a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry next : this.f8502a.entrySet()) {
            if (((Integer) next.getValue()).intValue() > i) {
                i = ((Integer) next.getValue()).intValue();
                arrayList.clear();
            } else if (((Integer) next.getValue()).intValue() != i) {
            }
            arrayList.add(next.getKey());
        }
        return C4551a.m8386b(arrayList);
    }

    /* renamed from: b */
    public void mo16210b(int i) {
        Integer num = this.f8502a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f8502a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
