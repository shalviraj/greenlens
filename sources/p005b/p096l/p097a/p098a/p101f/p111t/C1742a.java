package p005b.p096l.p097a.p098a.p101f.p111t;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.util.HashMap;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p098a.C1584b;

/* renamed from: b.l.a.a.f.t.a */
public final class C1742a {

    /* renamed from: a */
    public static SparseArray<C1584b> f3058a = new SparseArray<>();

    /* renamed from: b */
    public static HashMap<C1584b, Integer> f3059b;

    static {
        HashMap<C1584b, Integer> hashMap = new HashMap<>();
        f3059b = hashMap;
        hashMap.put(C1584b.DEFAULT, 0);
        f3059b.put(C1584b.VERY_LOW, 1);
        f3059b.put(C1584b.HIGHEST, 2);
        for (C1584b next : f3059b.keySet()) {
            f3058a.append(f3059b.get(next).intValue(), next);
        }
    }

    /* renamed from: a */
    public static int m2277a(@NonNull C1584b bVar) {
        Integer num = f3059b.get(bVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + bVar);
    }

    @NonNull
    /* renamed from: b */
    public static C1584b m2278b(int i) {
        C1584b bVar = f3058a.get(i);
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException(C0843a.m444e("Unknown Priority for value ", i));
    }
}
