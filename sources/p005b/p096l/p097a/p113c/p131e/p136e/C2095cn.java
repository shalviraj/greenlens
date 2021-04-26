package p005b.p096l.p097a.p113c.p131e.p136e;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p131e.p136e.C2070bn;

/* renamed from: b.l.a.c.e.e.cn */
public final class C2095cn<T extends C2070bn<T>> {

    /* renamed from: d */
    public static final C2095cn f3694d = new C2095cn(true);

    /* renamed from: a */
    public final C2559w0<T, Object> f3695a;

    /* renamed from: b */
    public boolean f3696b;

    /* renamed from: c */
    public boolean f3697c;

    public C2095cn() {
        this.f3695a = new C2391p0(16);
    }

    public C2095cn(boolean z) {
        C2391p0 p0Var = new C2391p0(0);
        this.f3695a = p0Var;
        if (!this.f3696b) {
            p0Var.mo12908a();
            this.f3696b = true;
        }
        if (!this.f3696b) {
            p0Var.mo12908a();
            this.f3696b = true;
        }
    }

    /* renamed from: b */
    public static final void m3166b(T t, Object obj) {
        boolean z;
        C2368o1 b = t.mo12443b();
        Charset charset = C2196h.f3910a;
        Objects.requireNonNull(obj);
        C2368o1 o1Var = C2368o1.DOUBLE;
        C2392p1 p1Var = C2392p1.INT;
        switch (b.f4156g.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof C2317lm) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof C2121e)) {
                    return;
                }
            case 8:
                if (obj instanceof C2072c0) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.mo12442a()), t.mo12443b().f4156g, obj.getClass().getName()}));
    }

    /* renamed from: a */
    public final void mo12486a(T t, Object obj) {
        if (!t.mo12444c()) {
            m3166b(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m3166b(t, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f3695a.put(t, obj);
    }

    public final Object clone() {
        C2095cn cnVar = new C2095cn();
        for (int i = 0; i < this.f3695a.mo13079b(); i++) {
            Map.Entry<T, Object> c = this.f3695a.mo13080c(i);
            cnVar.mo12486a((C2070bn) c.getKey(), c.getValue());
        }
        C2559w0<T, Object> w0Var = this.f3695a;
        for (Map.Entry entry : w0Var.f4388i.isEmpty() ? C2463s0.f4274b : w0Var.f4388i.entrySet()) {
            cnVar.mo12486a((C2070bn) entry.getKey(), entry.getValue());
        }
        cnVar.f3697c = this.f3697c;
        return cnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2095cn)) {
            return false;
        }
        return this.f3695a.equals(((C2095cn) obj).f3695a);
    }

    public final int hashCode() {
        return this.f3695a.hashCode();
    }
}
