package p005b.p096l.p224e;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p005b.p096l.p224e.p226e0.C4357g;
import p005b.p096l.p224e.p226e0.C4367o;
import p005b.p096l.p224e.p226e0.p228z.C4386a;
import p005b.p096l.p224e.p226e0.p228z.C4388b;
import p005b.p096l.p224e.p226e0.p228z.C4390c;
import p005b.p096l.p224e.p226e0.p228z.C4392d;
import p005b.p096l.p224e.p226e0.p228z.C4397g;
import p005b.p096l.p224e.p226e0.p228z.C4399h;
import p005b.p096l.p224e.p226e0.p228z.C4402j;
import p005b.p096l.p224e.p226e0.p228z.C4405k;
import p005b.p096l.p224e.p226e0.p228z.C4407l;
import p005b.p096l.p224e.p226e0.p228z.C4414o;
import p005b.p096l.p224e.p226e0.p228z.C4448q;
import p005b.p096l.p224e.p226e0.p228z.C4449r;
import p005b.p096l.p224e.p230f0.C4455a;
import p005b.p096l.p224e.p231g0.C4457a;
import p005b.p096l.p224e.p231g0.C4459b;
import p005b.p096l.p224e.p231g0.C4460c;
import p005b.p096l.p224e.p231g0.C4461d;

/* renamed from: b.l.e.k */
public final class C4465k {

    /* renamed from: n */
    public static final C4455a<?> f8292n = new C4455a<>(Object.class);

    /* renamed from: a */
    public final ThreadLocal<Map<C4455a<?>, C4466a<?>>> f8293a;

    /* renamed from: b */
    public final Map<C4455a<?>, C4332b0<?>> f8294b;

    /* renamed from: c */
    public final C4357g f8295c;

    /* renamed from: d */
    public final C4392d f8296d;

    /* renamed from: e */
    public final List<C4334c0> f8297e;

    /* renamed from: f */
    public final Map<Type, C4468m<?>> f8298f;

    /* renamed from: g */
    public final boolean f8299g;

    /* renamed from: h */
    public final boolean f8300h;

    /* renamed from: i */
    public final boolean f8301i;

    /* renamed from: j */
    public final boolean f8302j;

    /* renamed from: k */
    public final boolean f8303k;

    /* renamed from: l */
    public final List<C4334c0> f8304l;

    /* renamed from: m */
    public final List<C4334c0> f8305m;

    /* renamed from: b.l.e.k$a */
    public static class C4466a<T> extends C4332b0<T> {

        /* renamed from: a */
        public C4332b0<T> f8306a;

        /* renamed from: a */
        public T mo10755a(C4457a aVar) {
            C4332b0<T> b0Var = this.f8306a;
            if (b0Var != null) {
                return b0Var.mo10755a(aVar);
            }
            throw new IllegalStateException();
        }

        /* renamed from: b */
        public void mo10756b(C4460c cVar, T t) {
            C4332b0<T> b0Var = this.f8306a;
            if (b0Var != null) {
                b0Var.mo10756b(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C4465k() {
        this(C4367o.f8076i, C4335d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, C4481z.DEFAULT, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public C4465k(C4367o oVar, C4344e eVar, Map<Type, C4468m<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C4481z zVar, String str, int i, int i2, List<C4334c0> list, List<C4334c0> list2, List<C4334c0> list3) {
        C4367o oVar2 = oVar;
        this.f8293a = new ThreadLocal<>();
        this.f8294b = new ConcurrentHashMap();
        this.f8298f = map;
        C4357g gVar = new C4357g(map);
        this.f8295c = gVar;
        this.f8299g = z;
        this.f8300h = z3;
        this.f8301i = z4;
        this.f8302j = z5;
        this.f8303k = z6;
        this.f8304l = list;
        this.f8305m = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C4414o.f8203Y);
        arrayList.add(C4399h.f8141b);
        arrayList.add(oVar);
        arrayList.addAll(list3);
        arrayList.add(C4414o.f8182D);
        arrayList.add(C4414o.f8217m);
        arrayList.add(C4414o.f8211g);
        arrayList.add(C4414o.f8213i);
        arrayList.add(C4414o.f8215k);
        C4332b0 hVar = zVar == C4481z.DEFAULT ? C4414o.f8224t : new C4462h();
        arrayList.add(new C4449r(Long.TYPE, Long.class, hVar));
        arrayList.add(new C4449r(Double.TYPE, Double.class, z7 ? C4414o.f8226v : new C4454f(this)));
        arrayList.add(new C4449r(Float.TYPE, Float.class, z7 ? C4414o.f8225u : new C4456g(this)));
        arrayList.add(C4414o.f8228x);
        arrayList.add(C4414o.f8219o);
        arrayList.add(C4414o.f8221q);
        arrayList.add(new C4448q(AtomicLong.class, new C4330a0(new C4463i(hVar))));
        arrayList.add(new C4448q(AtomicLongArray.class, new C4330a0(new C4464j(hVar))));
        arrayList.add(C4414o.f8223s);
        arrayList.add(C4414o.f8230z);
        arrayList.add(C4414o.f8184F);
        arrayList.add(C4414o.f8186H);
        arrayList.add(new C4448q(BigDecimal.class, C4414o.f8180B));
        arrayList.add(new C4448q(BigInteger.class, C4414o.f8181C));
        arrayList.add(C4414o.f8188J);
        arrayList.add(C4414o.f8190L);
        arrayList.add(C4414o.f8194P);
        arrayList.add(C4414o.f8196R);
        arrayList.add(C4414o.f8201W);
        arrayList.add(C4414o.f8192N);
        arrayList.add(C4414o.f8208d);
        arrayList.add(C4390c.f8121b);
        arrayList.add(C4414o.f8199U);
        arrayList.add(C4407l.f8161b);
        arrayList.add(C4405k.f8159b);
        arrayList.add(C4414o.f8197S);
        arrayList.add(C4386a.f8115c);
        arrayList.add(C4414o.f8206b);
        arrayList.add(new C4388b(gVar));
        boolean z8 = z2;
        arrayList.add(new C4397g(gVar, z2));
        C4392d dVar = new C4392d(gVar);
        this.f8296d = dVar;
        arrayList.add(dVar);
        arrayList.add(C4414o.f8204Z);
        C4344e eVar2 = eVar;
        arrayList.add(new C4402j(gVar, eVar, oVar, dVar));
        this.f8297e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static void m8212a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: b */
    public <T> T mo16116b(C4457a aVar, Type type) {
        boolean z = aVar.f8254h;
        aVar.f8254h = true;
        try {
            aVar.mo16060w0();
            T a = mo16119e(new C4455a(type)).mo10755a(aVar);
            aVar.f8254h = z;
            return a;
        } catch (EOFException e) {
            if (1 != 0) {
                aVar.f8254h = z;
                return null;
            }
            throw new C4480y((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new C4480y((Throwable) e2);
        } catch (IOException e3) {
            throw new C4480y((Throwable) e3);
        } catch (AssertionError e4) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e4.getMessage());
            assertionError.initCause(e4);
            throw assertionError;
        } catch (Throwable th) {
            aVar.f8254h = z;
            throw th;
        }
    }

    /* renamed from: c */
    public <T> T mo16117c(String str, Class<T> cls) {
        Class<Integer> cls2;
        T d = mo16118d(str, cls);
        if (cls == Integer.TYPE) {
            cls2 = Integer.class;
        } else if (cls == Float.TYPE) {
            cls2 = Float.class;
        } else if (cls == Byte.TYPE) {
            cls2 = Byte.class;
        } else if (cls == Double.TYPE) {
            cls2 = Double.class;
        } else if (cls == Long.TYPE) {
            cls2 = Long.class;
        } else if (cls == Character.TYPE) {
            cls2 = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls2 = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls2 = Short.class;
        } else {
            cls2 = cls;
            if (cls == Void.TYPE) {
                cls2 = Void.class;
            }
        }
        return cls2.cast(d);
    }

    /* renamed from: d */
    public <T> T mo16118d(String str, Type type) {
        if (str == null) {
            return null;
        }
        C4457a aVar = new C4457a(new StringReader(str));
        aVar.f8254h = this.f8303k;
        T b = mo16116b(aVar, type);
        if (b != null) {
            try {
                if (aVar.mo16060w0() != C4459b.END_DOCUMENT) {
                    throw new C4473r("JSON document was not fully consumed.");
                }
            } catch (C4461d e) {
                throw new C4480y((Throwable) e);
            } catch (IOException e2) {
                throw new C4473r((Throwable) e2);
            }
        }
        return b;
    }

    /* renamed from: e */
    public <T> C4332b0<T> mo16119e(C4455a<T> aVar) {
        C4332b0<T> b0Var = this.f8294b.get(aVar == null ? f8292n : aVar);
        if (b0Var != null) {
            return b0Var;
        }
        Map map = this.f8293a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap();
            this.f8293a.set(map);
            z = true;
        }
        C4466a aVar2 = (C4466a) map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            C4466a aVar3 = new C4466a();
            map.put(aVar, aVar3);
            for (C4334c0 a : this.f8297e) {
                C4332b0<T> a2 = a.mo10754a(this, aVar);
                if (a2 != null) {
                    if (aVar3.f8306a == null) {
                        aVar3.f8306a = a2;
                        this.f8294b.put(aVar, a2);
                        return a2;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f8293a.remove();
            }
        }
    }

    /* renamed from: f */
    public <T> C4332b0<T> mo16120f(Class<T> cls) {
        return mo16119e(new C4455a(cls));
    }

    /* renamed from: g */
    public <T> C4332b0<T> mo16121g(C4334c0 c0Var, C4455a<T> aVar) {
        if (!this.f8297e.contains(c0Var)) {
            c0Var = this.f8296d;
        }
        boolean z = false;
        for (C4334c0 next : this.f8297e) {
            if (z) {
                C4332b0<T> a = next.mo10754a(this, aVar);
                if (a != null) {
                    return a;
                }
            } else if (next == c0Var) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    /* renamed from: h */
    public C4460c mo16122h(Writer writer) {
        if (this.f8300h) {
            writer.write(")]}'\n");
        }
        C4460c cVar = new C4460c(writer);
        if (this.f8302j) {
            cVar.f8284j = "  ";
            cVar.f8285k = ": ";
        }
        cVar.f8289o = this.f8299g;
        return cVar;
    }

    /* renamed from: i */
    public String mo16123i(Object obj) {
        if (obj == null) {
            C4474s sVar = C4474s.f8318a;
            StringWriter stringWriter = new StringWriter();
            try {
                mo16124j(sVar, mo16122h(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new C4473r((Throwable) e);
            }
        } else {
            Class<?> cls = obj.getClass();
            StringWriter stringWriter2 = new StringWriter();
            try {
                mo16125k(obj, cls, mo16122h(stringWriter2));
                return stringWriter2.toString();
            } catch (IOException e2) {
                throw new C4473r((Throwable) e2);
            }
        }
    }

    /* renamed from: j */
    public void mo16124j(C4472q qVar, C4460c cVar) {
        boolean z = cVar.f8286l;
        cVar.f8286l = true;
        boolean z2 = cVar.f8287m;
        cVar.f8287m = this.f8301i;
        boolean z3 = cVar.f8289o;
        cVar.f8289o = this.f8299g;
        try {
            C4414o.f8202X.mo10756b(cVar, qVar);
            cVar.f8286l = z;
            cVar.f8287m = z2;
            cVar.f8289o = z3;
        } catch (IOException e) {
            throw new C4473r((Throwable) e);
        } catch (AssertionError e2) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
            assertionError.initCause(e2);
            throw assertionError;
        } catch (Throwable th) {
            cVar.f8286l = z;
            cVar.f8287m = z2;
            cVar.f8289o = z3;
            throw th;
        }
    }

    /* renamed from: k */
    public void mo16125k(Object obj, Type type, C4460c cVar) {
        C4332b0 e = mo16119e(new C4455a(type));
        boolean z = cVar.f8286l;
        cVar.f8286l = true;
        boolean z2 = cVar.f8287m;
        cVar.f8287m = this.f8301i;
        boolean z3 = cVar.f8289o;
        cVar.f8289o = this.f8299g;
        try {
            e.mo10756b(cVar, obj);
            cVar.f8286l = z;
            cVar.f8287m = z2;
            cVar.f8289o = z3;
        } catch (IOException e2) {
            throw new C4473r((Throwable) e2);
        } catch (AssertionError e3) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e3.getMessage());
            assertionError.initCause(e3);
            throw assertionError;
        } catch (Throwable th) {
            cVar.f8286l = z;
            cVar.f8287m = z2;
            cVar.f8289o = z3;
            throw th;
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f8299g + ",factories:" + this.f8297e + ",instanceCreators:" + this.f8295c + "}";
    }
}
