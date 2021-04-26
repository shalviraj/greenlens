package p005b.p096l.p097a.p113c.p145h.p147b;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p005b.p096l.p097a.p113c.p131e.p140i.C2737c2;
import p005b.p096l.p097a.p113c.p131e.p140i.C2751d2;
import p005b.p096l.p097a.p113c.p131e.p140i.C2765e2;
import p005b.p096l.p097a.p113c.p131e.p140i.C2779f2;
import p005b.p096l.p097a.p113c.p131e.p140i.C2799g9;
import p005b.p096l.p097a.p113c.p131e.p140i.C2830j1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2843k1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2856l1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2882n1;

/* renamed from: b.l.a.c.h.b.y9 */
public final class C3385y9 {

    /* renamed from: a */
    public String f6129a;

    /* renamed from: b */
    public boolean f6130b;

    /* renamed from: c */
    public C2751d2 f6131c;

    /* renamed from: d */
    public BitSet f6132d;

    /* renamed from: e */
    public BitSet f6133e;

    /* renamed from: f */
    public Map<Integer, Long> f6134f;

    /* renamed from: g */
    public Map<Integer, List<Long>> f6135g;

    /* renamed from: h */
    public final /* synthetic */ C3153da f6136h;

    public /* synthetic */ C3385y9(C3153da daVar, String str) {
        this.f6136h = daVar;
        this.f6129a = str;
        this.f6130b = true;
        this.f6132d = new BitSet();
        this.f6133e = new BitSet();
        this.f6134f = new ArrayMap();
        this.f6135g = new ArrayMap();
    }

    public /* synthetic */ C3385y9(C3153da daVar, String str, C2751d2 d2Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.f6136h = daVar;
        this.f6129a = str;
        this.f6132d = bitSet;
        this.f6133e = bitSet2;
        this.f6134f = map;
        this.f6135g = new ArrayMap();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f6135g.put(num, arrayList);
        }
        this.f6130b = false;
        this.f6131c = d2Var;
    }

    /* renamed from: a */
    public final void mo14639a(@NonNull C3129ba baVar) {
        int a = baVar.mo14120a();
        Boolean bool = baVar.f5331c;
        if (bool != null) {
            this.f6133e.set(a, bool.booleanValue());
        }
        Boolean bool2 = baVar.f5332d;
        if (bool2 != null) {
            this.f6132d.set(a, bool2.booleanValue());
        }
        if (baVar.f5333e != null) {
            Map<Integer, Long> map = this.f6134f;
            Integer valueOf = Integer.valueOf(a);
            Long l = map.get(valueOf);
            long longValue = baVar.f5333e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f6134f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (baVar.f5334f != null) {
            Map<Integer, List<Long>> map2 = this.f6135g;
            Integer valueOf2 = Integer.valueOf(a);
            List list = map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f6135g.put(valueOf2, list);
            }
            if (baVar.mo14121b()) {
                list.clear();
            }
            C2799g9.m4777b();
            C3166f fVar = this.f6136h.f5638a.f5848g;
            String str = this.f6129a;
            C3110a3<Boolean> a3Var = C3134c3.f5371a0;
            if (fVar.mo14197r(str, a3Var) && baVar.mo14122c()) {
                list.clear();
            }
            C2799g9.m4777b();
            boolean r = this.f6136h.f5638a.f5848g.mo14197r(this.f6129a, a3Var);
            Long valueOf3 = Long.valueOf(baVar.f5334f.longValue() / 1000);
            if (!r) {
                list.add(valueOf3);
            } else if (!list.contains(valueOf3)) {
                list.add(valueOf3);
            }
        }
    }

    @NonNull
    /* renamed from: b */
    public final C2843k1 mo14640b(int i) {
        ArrayList arrayList;
        List list;
        C2830j1 z = C2843k1.m4885z();
        if (z.f4886i) {
            z.mo13487j();
            z.f4886i = false;
        }
        C2843k1.m4881B((C2843k1) z.f4885h, i);
        boolean z2 = this.f6130b;
        if (z.f4886i) {
            z.mo13487j();
            z.f4886i = false;
        }
        C2843k1.m4884E((C2843k1) z.f4885h, z2);
        C2751d2 d2Var = this.f6131c;
        if (d2Var != null) {
            if (z.f4886i) {
                z.mo13487j();
                z.f4886i = false;
            }
            C2843k1.m4883D((C2843k1) z.f4885h, d2Var);
        }
        C2737c2 C = C2751d2.m4685C();
        List<Long> B = C3242l9.m6191B(this.f6132d);
        if (C.f4886i) {
            C.mo13487j();
            C.f4886i = false;
        }
        C2751d2.m4690H((C2751d2) C.f4885h, B);
        List<Long> B2 = C3242l9.m6191B(this.f6133e);
        if (C.f4886i) {
            C.mo13487j();
            C.f4886i = false;
        }
        C2751d2.m4688F((C2751d2) C.f4885h, B2);
        Map<Integer, Long> map = this.f6134f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer intValue : this.f6134f.keySet()) {
                int intValue2 = intValue.intValue();
                Long l = this.f6134f.get(Integer.valueOf(intValue2));
                if (l != null) {
                    C2856l1 w = C2882n1.m4981w();
                    if (w.f4886i) {
                        w.mo13487j();
                        w.f4886i = false;
                    }
                    C2882n1.m4983y((C2882n1) w.f4885h, intValue2);
                    long longValue = l.longValue();
                    if (w.f4886i) {
                        w.mo13487j();
                        w.f4886i = false;
                    }
                    C2882n1.m4984z((C2882n1) w.f4885h, longValue);
                    arrayList2.add((C2882n1) w.mo13484g());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            if (C.f4886i) {
                C.mo13487j();
                C.f4886i = false;
            }
            C2751d2.m4692J((C2751d2) C.f4885h, arrayList);
        }
        Map<Integer, List<Long>> map2 = this.f6135g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer next : this.f6135g.keySet()) {
                C2765e2 x = C2779f2.m4738x();
                int intValue3 = next.intValue();
                if (x.f4886i) {
                    x.mo13487j();
                    x.f4886i = false;
                }
                C2779f2.m4740z((C2779f2) x.f4885h, intValue3);
                List list2 = this.f6135g.get(next);
                if (list2 != null) {
                    Collections.sort(list2);
                    if (x.f4886i) {
                        x.mo13487j();
                        x.f4886i = false;
                    }
                    C2779f2.m4737A((C2779f2) x.f4885h, list2);
                }
                arrayList3.add((C2779f2) x.mo13484g());
            }
            list = arrayList3;
        }
        if (C.f4886i) {
            C.mo13487j();
            C.f4886i = false;
        }
        C2751d2.m4694L((C2751d2) C.f4885h, list);
        if (z.f4886i) {
            z.mo13487j();
            z.f4886i = false;
        }
        C2843k1.m4882C((C2843k1) z.f4885h, (C2751d2) C.mo13484g());
        return (C2843k1) z.mo13484g();
    }
}
