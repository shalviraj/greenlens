package p005b.p280p.p281a.p282a0.p283a;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5078n;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;
import p005b.p280p.p281a.p284z.C5117b;
import p298d.p299a.C6729h;
import p298d.p299a.C6732j;
import p298d.p299a.C6734k;
import p298d.p299a.C6739m;
import p298d.p334t.C6785c;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.p.a.a0.a.a */
public final class C5057a<T> extends C5075l<T> {

    /* renamed from: a */
    public final C6729h<T> f9765a;

    /* renamed from: b */
    public final List<C5058a<T, Object>> f9766b;

    /* renamed from: c */
    public final List<C5058a<T, Object>> f9767c;

    /* renamed from: d */
    public final C5081q.C5082a f9768d;

    /* renamed from: b.p.a.a0.a.a$a */
    public static final class C5058a<K, P> {

        /* renamed from: a */
        public final String f9769a;

        /* renamed from: b */
        public final String f9770b;

        /* renamed from: c */
        public final C5075l<P> f9771c;

        /* renamed from: d */
        public final C6739m<K, P> f9772d;

        /* renamed from: e */
        public final C6734k f9773e;

        /* renamed from: f */
        public final int f9774f;

        public C5058a(String str, String str2, C5075l<P> lVar, C6739m<K, ? extends P> mVar, C6734k kVar, int i) {
            C6888i.m12438e(str, "name");
            C6888i.m12438e(lVar, "adapter");
            C6888i.m12438e(mVar, "property");
            this.f9769a = str;
            this.f9770b = str2;
            this.f9771c = lVar;
            this.f9772d = mVar;
            this.f9773e = kVar;
            this.f9774f = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5058a)) {
                return false;
            }
            C5058a aVar = (C5058a) obj;
            return C6888i.m12434a(this.f9769a, aVar.f9769a) && C6888i.m12434a(this.f9770b, aVar.f9770b) && C6888i.m12434a(this.f9771c, aVar.f9771c) && C6888i.m12434a(this.f9772d, aVar.f9772d) && C6888i.m12434a(this.f9773e, aVar.f9773e) && this.f9774f == aVar.f9774f;
        }

        public int hashCode() {
            String str = this.f9769a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f9770b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            C5075l<P> lVar = this.f9771c;
            int hashCode3 = (hashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31;
            C6739m<K, P> mVar = this.f9772d;
            int hashCode4 = (hashCode3 + (mVar != null ? mVar.hashCode() : 0)) * 31;
            C6734k kVar = this.f9773e;
            if (kVar != null) {
                i = kVar.hashCode();
            }
            return ((hashCode4 + i) * 31) + this.f9774f;
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("Binding(name=");
            u.append(this.f9769a);
            u.append(", jsonName=");
            u.append(this.f9770b);
            u.append(", adapter=");
            u.append(this.f9771c);
            u.append(", property=");
            u.append(this.f9772d);
            u.append(", parameter=");
            u.append(this.f9773e);
            u.append(", propertyIndex=");
            return C0843a.m453n(u, this.f9774f, ")");
        }
    }

    /* renamed from: b.p.a.a0.a.a$b */
    public static final class C5059b extends C6785c<C6734k, Object> {

        /* renamed from: g */
        public final List<C6734k> f9775g;

        /* renamed from: h */
        public final Object[] f9776h;

        public C5059b(List<? extends C6734k> list, Object[] objArr) {
            C6888i.m12438e(list, "parameterKeys");
            C6888i.m12438e(objArr, "parameterValues");
            this.f9775g = list;
            this.f9776h = objArr;
        }

        public final boolean containsKey(Object obj) {
            if (!(obj instanceof C6734k)) {
                return false;
            }
            C6734k kVar = (C6734k) obj;
            C6888i.m12438e(kVar, "key");
            Object obj2 = this.f9776h[kVar.mo23056d()];
            Class<Metadata> cls = C5061c.f9777a;
            return obj2 != C5061c.f9778b;
        }

        public final Object get(Object obj) {
            if (!(obj instanceof C6734k)) {
                return null;
            }
            C6734k kVar = (C6734k) obj;
            C6888i.m12438e(kVar, "key");
            Object obj2 = this.f9776h[kVar.mo23056d()];
            Class<Metadata> cls = C5061c.f9777a;
            if (obj2 != C5061c.f9778b) {
                return obj2;
            }
            return null;
        }

        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return obj instanceof C6734k ? super.getOrDefault((C6734k) obj, obj2) : obj2;
        }

        public Object put(Object obj, Object obj2) {
            C6888i.m12438e((C6734k) obj, "key");
            return null;
        }

        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof C6734k) {
                return super.remove((C6734k) obj);
            }
            return null;
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj instanceof C6734k) {
                return super.remove((C6734k) obj, obj2);
            }
            return false;
        }
    }

    public C5057a(C6729h<? extends T> hVar, List<C5058a<T, Object>> list, List<C5058a<T, Object>> list2, C5081q.C5082a aVar) {
        C6888i.m12438e(hVar, "constructor");
        C6888i.m12438e(list, "allBindings");
        C6888i.m12438e(list2, "nonTransientBindings");
        C6888i.m12438e(aVar, "options");
        this.f9765a = hVar;
        this.f9766b = list;
        this.f9767c = list2;
        this.f9768d = aVar;
    }

    /* renamed from: a */
    public T mo16804a(C5081q qVar) {
        C6888i.m12438e(qVar, "reader");
        int size = this.f9765a.getParameters().size();
        int size2 = this.f9766b.size();
        Object[] objArr = new Object[size2];
        for (int i = 0; i < size2; i++) {
            Class<Metadata> cls = C5061c.f9777a;
            objArr[i] = C5061c.f9778b;
        }
        qVar.mo16840e();
        while (qVar.mo16835N()) {
            int n0 = qVar.mo16844n0(this.f9768d);
            if (n0 == -1) {
                qVar.mo16845o0();
                qVar.mo16846p0();
            } else {
                C5058a aVar = this.f9767c.get(n0);
                int i2 = aVar.f9774f;
                Object obj = objArr[i2];
                Class<Metadata> cls2 = C5061c.f9777a;
                if (obj == C5061c.f9778b) {
                    objArr[i2] = aVar.f9771c.mo16804a(qVar);
                    if (objArr[i2] == null && !aVar.f9772d.getReturnType().mo23019p()) {
                        C5078n m = C5117b.m9426m(aVar.f9772d.getName(), aVar.f9770b, qVar);
                        C6888i.m12437d(m, "Util.unexpectedNull(\n   …         reader\n        )");
                        throw m;
                    }
                } else {
                    StringBuilder u = C0843a.m460u("Multiple values for '");
                    u.append(aVar.f9772d.getName());
                    u.append("' at ");
                    u.append(qVar.mo16834H());
                    throw new C5078n(u.toString());
                }
            }
        }
        qVar.mo16849z();
        boolean z = this.f9766b.size() == size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj2 = objArr[i3];
            Class<Metadata> cls3 = C5061c.f9777a;
            if (obj2 == C5061c.f9778b) {
                if (this.f9765a.getParameters().get(i3).mo23063s()) {
                    z = false;
                } else {
                    String str = null;
                    if (this.f9765a.getParameters().get(i3).mo23055a().mo23019p()) {
                        objArr[i3] = null;
                    } else {
                        String name = this.f9765a.getParameters().get(i3).getName();
                        C5058a aVar2 = this.f9766b.get(i3);
                        if (aVar2 != null) {
                            str = aVar2.f9770b;
                        }
                        C5078n g = C5117b.m9420g(name, str, qVar);
                        C6888i.m12437d(g, "Util.missingProperty(\n  …       reader\n          )");
                        throw g;
                    }
                }
            }
        }
        C6729h<T> hVar = this.f9765a;
        T k = z ? hVar.mo23009k(Arrays.copyOf(objArr, size2)) : hVar.mo23010l(new C5059b(this.f9765a.getParameters(), objArr));
        int size3 = this.f9766b.size();
        while (size < size3) {
            C5058a<T, Object> aVar3 = this.f9766b.get(size);
            C6888i.m12436c(aVar3);
            C5058a aVar4 = aVar3;
            Object obj3 = objArr[size];
            Class<Metadata> cls4 = C5061c.f9777a;
            if (obj3 != C5061c.f9778b) {
                C6739m<K, P> mVar = aVar4.f9772d;
                Objects.requireNonNull(mVar, "null cannot be cast to non-null type kotlin.reflect.KMutableProperty1<K, P>");
                ((C6732j) mVar).mo23050o(k, obj3);
            }
            size++;
        }
        return k;
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, T t) {
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(t, "value == null");
        uVar.mo16869e();
        for (C5058a next : this.f9766b) {
            if (next != null) {
                uVar.mo16865O(next.f9769a);
                next.f9771c.mo16805e(uVar, next.f9772d.get(t));
            }
        }
        uVar.mo16864H();
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("KotlinJsonAdapter(");
        u.append(this.f9765a.getReturnType());
        u.append(')');
        return u.toString();
    }
}
