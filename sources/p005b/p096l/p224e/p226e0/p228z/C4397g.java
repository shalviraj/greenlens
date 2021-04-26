package p005b.p096l.p224e.p226e0.p228z;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p224e.C4332b0;
import p005b.p096l.p224e.C4334c0;
import p005b.p096l.p224e.C4465k;
import p005b.p096l.p224e.C4469n;
import p005b.p096l.p224e.C4472q;
import p005b.p096l.p224e.C4473r;
import p005b.p096l.p224e.C4474s;
import p005b.p096l.p224e.C4475t;
import p005b.p096l.p224e.C4477v;
import p005b.p096l.p224e.C4480y;
import p005b.p096l.p224e.p226e0.C4345a;
import p005b.p096l.p224e.p226e0.C4357g;
import p005b.p096l.p224e.p226e0.C4370q;
import p005b.p096l.p224e.p226e0.C4380t;
import p005b.p096l.p224e.p230f0.C4455a;
import p005b.p096l.p224e.p231g0.C4457a;
import p005b.p096l.p224e.p231g0.C4459b;
import p005b.p096l.p224e.p231g0.C4460c;

/* renamed from: b.l.e.e0.z.g */
public final class C4397g implements C4334c0 {

    /* renamed from: g */
    public final C4357g f8135g;

    /* renamed from: h */
    public final boolean f8136h;

    /* renamed from: b.l.e.e0.z.g$a */
    public final class C4398a<K, V> extends C4332b0<Map<K, V>> {

        /* renamed from: a */
        public final C4332b0<K> f8137a;

        /* renamed from: b */
        public final C4332b0<V> f8138b;

        /* renamed from: c */
        public final C4380t<? extends Map<K, V>> f8139c;

        public C4398a(C4465k kVar, Type type, C4332b0<K> b0Var, Type type2, C4332b0<V> b0Var2, C4380t<? extends Map<K, V>> tVar) {
            this.f8137a = new C4413n(kVar, b0Var, type);
            this.f8138b = new C4413n(kVar, b0Var2, type2);
            this.f8139c = tVar;
        }

        /* renamed from: a */
        public Object mo10755a(C4457a aVar) {
            int i;
            C4459b w0 = aVar.mo16060w0();
            if (w0 == C4459b.NULL) {
                aVar.mo16057s0();
                return null;
            }
            Map map = (Map) this.f8139c.mo15987a();
            if (w0 == C4459b.BEGIN_ARRAY) {
                aVar.mo16050d();
                while (aVar.mo16048Z()) {
                    aVar.mo16050d();
                    K a = this.f8137a.mo10755a(aVar);
                    if (map.put(a, this.f8138b.mo10755a(aVar)) == null) {
                        aVar.mo16045H();
                    } else {
                        throw new C4480y("duplicate key: " + a);
                    }
                }
                aVar.mo16045H();
            } else {
                aVar.mo16051e();
                while (aVar.mo16048Z()) {
                    Objects.requireNonNull((C4457a.C4458a) C4370q.f8086a);
                    if (aVar instanceof C4393e) {
                        C4393e eVar = (C4393e) aVar;
                        eVar.mo16041D0(C4459b.NAME);
                        Map.Entry entry = (Map.Entry) ((Iterator) eVar.mo16042E0()).next();
                        eVar.mo16044G0(entry.getValue());
                        eVar.mo16044G0(new C4477v((String) entry.getKey()));
                    } else {
                        int i2 = aVar.f8260n;
                        if (i2 == 0) {
                            i2 = aVar.mo16106z();
                        }
                        if (i2 == 13) {
                            i = 9;
                        } else if (i2 == 12) {
                            i = 8;
                        } else if (i2 == 14) {
                            i = 10;
                        } else {
                            StringBuilder u = C0843a.m460u("Expected a name but was ");
                            u.append(aVar.mo16060w0());
                            u.append(aVar.mo16099h0());
                            throw new IllegalStateException(u.toString());
                        }
                        aVar.f8260n = i;
                    }
                    K a2 = this.f8137a.mo10755a(aVar);
                    if (map.put(a2, this.f8138b.mo10755a(aVar)) != null) {
                        throw new C4480y("duplicate key: " + a2);
                    }
                }
                aVar.mo16046N();
            }
            return map;
        }

        /* renamed from: b */
        public void mo10756b(C4460c cVar, Object obj) {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                cVar.mo16066Z();
                return;
            }
            if (!C4397g.this.f8136h) {
                cVar.mo16072q();
                for (Map.Entry entry : map.entrySet()) {
                    cVar.mo16065O(String.valueOf(entry.getKey()));
                    this.f8138b.mo10756b(cVar, entry.getValue());
                }
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry entry2 : map.entrySet()) {
                    C4332b0<K> b0Var = this.f8137a;
                    Object key = entry2.getKey();
                    Objects.requireNonNull(b0Var);
                    try {
                        C4395f fVar = new C4395f();
                        b0Var.mo10756b(fVar, key);
                        if (fVar.f8132r.isEmpty()) {
                            C4472q qVar = fVar.f8134t;
                            arrayList.add(qVar);
                            arrayList2.add(entry2.getValue());
                            Objects.requireNonNull(qVar);
                            z |= (qVar instanceof C4469n) || (qVar instanceof C4475t);
                        } else {
                            throw new IllegalStateException("Expected one JSON element but was " + fVar.f8132r);
                        }
                    } catch (IOException e) {
                        throw new C4473r((Throwable) e);
                    }
                }
                if (z) {
                    cVar.mo16068e();
                    int size = arrayList.size();
                    while (i < size) {
                        cVar.mo16068e();
                        C4414o.f8202X.mo10756b(cVar, (C4472q) arrayList.get(i));
                        this.f8138b.mo10756b(cVar, arrayList2.get(i));
                        cVar.mo16063H();
                        i++;
                    }
                    cVar.mo16063H();
                    return;
                }
                cVar.mo16072q();
                int size2 = arrayList.size();
                while (i < size2) {
                    C4472q qVar2 = (C4472q) arrayList.get(i);
                    Objects.requireNonNull(qVar2);
                    if (qVar2 instanceof C4477v) {
                        C4477v l = qVar2.mo16137l();
                        Object obj2 = l.f8320a;
                        if (obj2 instanceof Number) {
                            str = String.valueOf(l.mo16149u());
                        } else if (obj2 instanceof Boolean) {
                            str = Boolean.toString(l.mo16148r());
                        } else if (obj2 instanceof String) {
                            str = l.mo16134q();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (qVar2 instanceof C4474s) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    cVar.mo16065O(str);
                    this.f8138b.mo10756b(cVar, arrayList2.get(i));
                    i++;
                }
            }
            cVar.mo16064N();
        }
    }

    public C4397g(C4357g gVar, boolean z) {
        this.f8135g = gVar;
        this.f8136h = z;
    }

    /* renamed from: a */
    public <T> C4332b0<T> mo10754a(C4465k kVar, C4455a<T> aVar) {
        Type[] typeArr;
        Type type = aVar.f8250b;
        if (!Map.class.isAssignableFrom(aVar.f8249a)) {
            return null;
        }
        Class<?> e = C4345a.m7965e(type);
        Class<Object> cls = Object.class;
        Class<String> cls2 = String.class;
        if (type == Properties.class) {
            typeArr = new Type[]{cls2, cls2};
        } else {
            Type f = C4345a.m7966f(type, e, Map.class);
            typeArr = f instanceof ParameterizedType ? ((ParameterizedType) f).getActualTypeArguments() : new Type[]{cls, cls};
        }
        Type type2 = typeArr[0];
        return new C4398a(kVar, typeArr[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? C4414o.f8210f : kVar.mo16119e(new C4455a(type2)), typeArr[1], kVar.mo16119e(new C4455a(typeArr[1])), this.f8135g.mo15988a(aVar));
    }
}
