package p005b.p051h.p052a.p055m.p058v.p059c0;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1038l;

/* renamed from: b.h.a.m.v.c0.g */
public class C1028g<K extends C1038l, V> {

    /* renamed from: a */
    public final C1029a<K, V> f1089a = new C1029a<>(null);

    /* renamed from: b */
    public final Map<K, C1029a<K, V>> f1090b = new HashMap();

    /* renamed from: b.h.a.m.v.c0.g$a */
    public static class C1029a<K, V> {

        /* renamed from: a */
        public final K f1091a;

        /* renamed from: b */
        public List<V> f1092b;

        /* renamed from: c */
        public C1029a<K, V> f1093c;

        /* renamed from: d */
        public C1029a<K, V> f1094d;

        public C1029a() {
            this((Object) null);
        }

        public C1029a(K k) {
            this.f1094d = this;
            this.f1093c = this;
            this.f1091a = k;
        }

        @Nullable
        /* renamed from: a */
        public V mo10901a() {
            List<V> list = this.f1092b;
            int size = list != null ? list.size() : 0;
            if (size > 0) {
                return this.f1092b.remove(size - 1);
            }
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public V mo10897a(K k) {
        C1029a<K, V> aVar = this.f1090b.get(k);
        if (aVar == null) {
            aVar = new C1029a<>(k);
            this.f1090b.put(k, aVar);
        } else {
            k.mo10907a();
        }
        C1029a<K, V> aVar2 = aVar.f1094d;
        aVar2.f1093c = aVar.f1093c;
        aVar.f1093c.f1094d = aVar2;
        C1029a<K, V> aVar3 = this.f1089a;
        aVar.f1094d = aVar3;
        C1029a<K, V> aVar4 = aVar3.f1093c;
        aVar.f1093c = aVar4;
        aVar4.f1094d = aVar;
        aVar.f1094d.f1093c = aVar;
        return aVar.mo10901a();
    }

    /* renamed from: b */
    public void mo10898b(K k, V v) {
        C1029a<K, V> aVar = this.f1090b.get(k);
        if (aVar == null) {
            aVar = new C1029a<>(k);
            C1029a<K, V> aVar2 = aVar.f1094d;
            aVar2.f1093c = aVar.f1093c;
            aVar.f1093c.f1094d = aVar2;
            C1029a<K, V> aVar3 = this.f1089a;
            aVar.f1094d = aVar3.f1094d;
            aVar.f1093c = aVar3;
            aVar3.f1094d = aVar;
            aVar.f1094d.f1093c = aVar;
            this.f1090b.put(k, aVar);
        } else {
            k.mo10907a();
        }
        if (aVar.f1092b == null) {
            aVar.f1092b = new ArrayList();
        }
        aVar.f1092b.add(v);
    }

    @Nullable
    /* renamed from: c */
    public V mo10899c() {
        C1029a<K, V> aVar = this.f1089a;
        while (true) {
            aVar = aVar.f1094d;
            if (aVar.equals(this.f1089a)) {
                return null;
            }
            V a = aVar.mo10901a();
            if (a != null) {
                return a;
            }
            C1029a<K, V> aVar2 = aVar.f1094d;
            aVar2.f1093c = aVar.f1093c;
            aVar.f1093c.f1094d = aVar2;
            this.f1090b.remove(aVar.f1091a);
            ((C1038l) aVar.f1091a).mo10907a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C1029a<K, V> aVar = this.f1089a.f1093c; !aVar.equals(this.f1089a); aVar = aVar.f1093c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f1091a);
            sb.append(':');
            List<V> list = aVar.f1092b;
            sb.append(list != null ? list.size() : 0);
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
