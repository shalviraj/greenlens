package p005b.p096l.p175c.p177b;

import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.c.b.x */
public class C3802x<E> extends C3789n<E> {

    /* renamed from: k */
    public static final C3789n<Object> f7010k = new C3802x(new Object[0], 0);

    /* renamed from: i */
    public final transient Object[] f7011i;

    /* renamed from: j */
    public final transient int f7012j;

    public C3802x(Object[] objArr, int i) {
        this.f7011i = objArr;
        this.f7012j = i;
    }

    /* renamed from: d */
    public int mo15272d(Object[] objArr, int i) {
        System.arraycopy(this.f7011i, 0, objArr, i, this.f7012j);
        return i + this.f7012j;
    }

    /* renamed from: e */
    public Object[] mo15273e() {
        return this.f7011i;
    }

    public E get(int i) {
        C1960d.m2857v(i, this.f7012j);
        return this.f7011i[i];
    }

    /* renamed from: l */
    public int mo15274l() {
        return this.f7012j;
    }

    /* renamed from: q */
    public int mo15275q() {
        return 0;
    }

    public int size() {
        return this.f7012j;
    }
}
