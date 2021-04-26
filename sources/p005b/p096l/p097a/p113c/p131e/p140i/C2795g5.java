package p005b.p096l.p097a.p113c.p131e.p140i;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p131e.p140i.C2782f5;

/* renamed from: b.l.a.c.e.i.g5 */
public final class C2795g5<T extends C2782f5<T>> {

    /* renamed from: d */
    public static final C2795g5 f4747d = new C2795g5(true);

    /* renamed from: a */
    public final C2836j7<T, Object> f4748a;

    /* renamed from: b */
    public boolean f4749b;

    /* renamed from: c */
    public boolean f4750c;

    public C2795g5() {
        this.f4748a = new C2742c7(16);
    }

    public C2795g5(boolean z) {
        C2742c7 c7Var = new C2742c7(0);
        this.f4748a = c7Var;
        if (!this.f4749b) {
            c7Var.mo13268a();
            this.f4749b = true;
        }
        if (!this.f4749b) {
            c7Var.mo13268a();
            this.f4749b = true;
        }
    }

    /* renamed from: b */
    public static final void m4772b(T t, Object obj) {
        boolean z;
        C2715a8 b = t.mo13318b();
        Charset charset = C2990v5.f5088a;
        Objects.requireNonNull(obj);
        C2715a8 a8Var = C2715a8.DOUBLE;
        C2729b8 b8Var = C2729b8.INT;
        switch (b.f4632g.ordinal()) {
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
                if ((obj instanceof C2937r4) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof C2925q5)) {
                    return;
                }
            case 8:
                if (obj instanceof C2913p6) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.mo13317a()), t.mo13318b().f4632g, obj.getClass().getName()}));
    }

    /* renamed from: a */
    public final void mo13342a(T t, Object obj) {
        if (!t.mo13319c()) {
            m4772b(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m4772b(t, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f4748a.put(t, obj);
    }

    public final Object clone() {
        C2795g5 g5Var = new C2795g5();
        for (int i = 0; i < this.f4748a.mo13420b(); i++) {
            Map.Entry<T, Object> c = this.f4748a.mo13421c(i);
            g5Var.mo13342a((C2782f5) c.getKey(), c.getValue());
        }
        C2836j7<T, Object> j7Var = this.f4748a;
        for (Map.Entry entry : j7Var.f4857i.isEmpty() ? C2784f7.f4726b : j7Var.f4857i.entrySet()) {
            g5Var.mo13342a((C2782f5) entry.getKey(), entry.getValue());
        }
        g5Var.f4750c = this.f4750c;
        return g5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2795g5)) {
            return false;
        }
        return this.f4748a.equals(((C2795g5) obj).f4748a);
    }

    public final int hashCode() {
        return this.f4748a.hashCode();
    }
}
