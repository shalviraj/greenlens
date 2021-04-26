package p005b.p096l.p097a.p113c.p131e.p140i;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: b.l.a.c.e.i.a6 */
public final class C2713a6 extends C2820i4<String> implements RandomAccess, C2727b6 {

    /* renamed from: i */
    public static final C2713a6 f4611i;

    /* renamed from: h */
    public final List<Object> f4612h;

    static {
        C2713a6 a6Var = new C2713a6(10);
        f4611i = a6Var;
        a6Var.f4835g = false;
    }

    public C2713a6() {
        this(10);
    }

    public C2713a6(int i) {
        this.f4612h = new ArrayList(i);
    }

    public C2713a6(ArrayList<Object> arrayList) {
        this.f4612h = arrayList;
    }

    /* renamed from: l */
    public static String m4560l(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C2937r4) {
            C2937r4 r4Var = (C2937r4) obj;
            return r4Var.mo13567l() == 0 ? "" : r4Var.mo13593A(C2990v5.f5088a);
        }
        Charset charset = C2990v5.f5088a;
        return new String((byte[]) obj, C2990v5.f5088a);
    }

    /* renamed from: G */
    public final void mo13221G(C2937r4 r4Var) {
        mo13387d();
        this.f4612h.add(r4Var);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo13387d();
        this.f4612h.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo13387d();
        if (collection instanceof C2727b6) {
            collection = ((C2727b6) collection).mo13228g();
        }
        boolean addAll = this.f4612h.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        mo13387d();
        this.f4612h.clear();
        this.modCount++;
    }

    /* renamed from: e */
    public final String get(int i) {
        Object obj = this.f4612h.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C2937r4) {
            C2937r4 r4Var = (C2937r4) obj;
            String A = r4Var.mo13567l() == 0 ? "" : r4Var.mo13593A(C2990v5.f5088a);
            if (r4Var.mo13594B()) {
                this.f4612h.set(i, A);
            }
            return A;
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = C2990v5.f5088a;
        String str = new String(bArr, C2990v5.f5088a);
        if (C3044z7.f5186a.mo13978a(bArr, 0, bArr.length)) {
            this.f4612h.set(i, str);
        }
        return str;
    }

    /* renamed from: f */
    public final C2727b6 mo13227f() {
        return this.f4835g ? new C2940r7(this) : this;
    }

    /* renamed from: g */
    public final List<?> mo13228g() {
        return Collections.unmodifiableList(this.f4612h);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2977u5 mo13230h(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f4612h);
            return new C2713a6((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    public final Object mo13231i(int i) {
        return this.f4612h.get(i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13387d();
        Object remove = this.f4612h.remove(i);
        this.modCount++;
        return m4560l(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo13387d();
        return m4560l(this.f4612h.set(i, (String) obj));
    }

    public final int size() {
        return this.f4612h.size();
    }
}
