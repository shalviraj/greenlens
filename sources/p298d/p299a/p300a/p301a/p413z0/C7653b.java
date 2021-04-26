package p298d.p299a.p300a.p301a.p413z0;

import java.util.NoSuchElementException;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: d.a.a.a.z0.b */
public final class C7653b<K, V> {

    /* renamed from: c */
    public static final C7653b<Object, Object> f15155c = new C7653b<>(C7655d.f15164b, 0);

    /* renamed from: a */
    public final C7655d<C7651a<C7656e<K, V>>> f15156a;

    /* renamed from: b */
    public final int f15157b;

    static {
        C7655d<Object> dVar = C7655d.f15164b;
    }

    public C7653b(C7655d<C7651a<C7656e<K, V>>> dVar, int i) {
        this.f15156a = dVar;
        this.f15157b = i;
    }

    /* renamed from: a */
    public C7653b<K, V> mo25240a(K k, V v) {
        C7651a<Object> aVar = (C7651a) this.f15156a.f15165a.mo25241a((long) k.hashCode());
        if (aVar == null) {
            aVar = C7651a.f15150j;
        }
        int i = aVar.f15153i;
        int i2 = 0;
        C7651a aVar2 = aVar;
        while (true) {
            if (aVar2 == null || aVar2.f15153i <= 0) {
                i2 = -1;
            } else if (((C7656e) aVar2.f15151g).f15166g.equals(k)) {
                break;
            } else {
                aVar2 = aVar2.f15152h;
                i2++;
            }
        }
        i2 = -1;
        if (i2 != -1) {
            if (i2 < 0 || i2 > aVar.f15153i) {
                throw new IndexOutOfBoundsException();
            }
            try {
                aVar = aVar.mo25234d(aVar.mo25235e(i2).f15151g);
            } catch (NoSuchElementException unused) {
                throw new IndexOutOfBoundsException(C0843a.m444e("Index: ", i2));
            }
        }
        C7656e eVar = new C7656e(k, v);
        Objects.requireNonNull(aVar);
        C7651a aVar3 = new C7651a(eVar, aVar);
        C7655d<C7651a<C7656e<K, V>>> dVar = this.f15156a;
        C7654c<V> b = dVar.f15165a.mo25242b((long) k.hashCode(), aVar3);
        if (b != dVar.f15165a) {
            dVar = new C7655d<>(b);
        }
        return new C7653b<>(dVar, (this.f15157b - i) + aVar3.f15153i);
    }
}
