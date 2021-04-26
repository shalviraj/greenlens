package p005b.p096l.p097a.p113c.p131e.p136e;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: b.l.a.c.e.e.m */
public final class C2318m extends C2094cm<String> implements RandomAccess, C2342n {

    /* renamed from: i */
    public static final C2318m f4053i;

    /* renamed from: h */
    public final List<Object> f4054h;

    static {
        C2318m mVar = new C2318m(10);
        f4053i = mVar;
        mVar.f3693g = false;
    }

    public C2318m() {
        this(10);
    }

    public C2318m(int i) {
        this.f4054h = new ArrayList(i);
    }

    public C2318m(ArrayList<Object> arrayList) {
        this.f4054h = arrayList;
    }

    /* renamed from: l */
    public static String m3719l(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C2317lm) {
            C2317lm lmVar = (C2317lm) obj;
            return lmVar.mo12755l() == 0 ? "" : lmVar.mo12773B(C2196h.f3910a);
        }
        Charset charset = C2196h.f3910a;
        return new String((byte[]) obj, C2196h.f3910a);
    }

    /* renamed from: N */
    public final void mo12625N(C2317lm lmVar) {
        mo12479d();
        this.f4054h.add(lmVar);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo12479d();
        this.f4054h.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo12479d();
        if (collection instanceof C2342n) {
            collection = ((C2342n) collection).mo12627g();
        }
        boolean addAll = this.f4054h.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        mo12479d();
        this.f4054h.clear();
        this.modCount++;
    }

    /* renamed from: e */
    public final String get(int i) {
        Object obj = this.f4054h.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C2317lm) {
            C2317lm lmVar = (C2317lm) obj;
            String B = lmVar.mo12755l() == 0 ? "" : lmVar.mo12773B(C2196h.f3910a);
            if (lmVar.mo12774E()) {
                this.f4054h.set(i, B);
            }
            return B;
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = C2196h.f3910a;
        String str = new String(bArr, C2196h.f3910a);
        if (C2344n1.f4087a.mo12784a(bArr, 0, bArr.length)) {
            this.f4054h.set(i, str);
        }
        return str;
    }

    /* renamed from: f */
    public final C2342n mo12626f() {
        return this.f3693g ? new C2148f1(this) : this;
    }

    /* renamed from: g */
    public final List<?> mo12627g() {
        return Collections.unmodifiableList(this.f4054h);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2171g mo12494h(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f4054h);
            return new C2318m((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    public final Object mo12629i(int i) {
        return this.f4054h.get(i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo12479d();
        Object remove = this.f4054h.remove(i);
        this.modCount++;
        return m3719l(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo12479d();
        return m3719l(this.f4054h.set(i, (String) obj));
    }

    public final int size() {
        return this.f4054h.size();
    }
}
