package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.Arrays;
import java.util.RandomAccess;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.i.x6 */
public final class C3017x6<E> extends C2820i4<E> implements RandomAccess {

    /* renamed from: j */
    public static final C3017x6<Object> f5138j;

    /* renamed from: h */
    public E[] f5139h;

    /* renamed from: i */
    public int f5140i;

    static {
        C3017x6<Object> x6Var = new C3017x6<>(new Object[0], 0);
        f5138j = x6Var;
        x6Var.f4835g = false;
    }

    public C3017x6(E[] eArr, int i) {
        this.f5139h = eArr;
        this.f5140i = i;
    }

    public final void add(int i, E e) {
        int i2;
        mo13387d();
        if (i < 0 || i > (i2 = this.f5140i)) {
            throw new IndexOutOfBoundsException(mo13975l(i));
        }
        E[] eArr = this.f5139h;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[C0843a.m432H(i2, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f5139h, i, eArr2, i + 1, this.f5140i - i);
            this.f5139h = eArr2;
        }
        this.f5139h[i] = e;
        this.f5140i++;
        this.modCount++;
    }

    public final boolean add(E e) {
        mo13387d();
        int i = this.f5140i;
        E[] eArr = this.f5139h;
        if (i == eArr.length) {
            this.f5139h = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f5139h;
        int i2 = this.f5140i;
        this.f5140i = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    /* renamed from: e */
    public final void mo13973e(int i) {
        if (i < 0 || i >= this.f5140i) {
            throw new IndexOutOfBoundsException(mo13975l(i));
        }
    }

    public final E get(int i) {
        mo13973e(i);
        return this.f5139h[i];
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2977u5 mo13230h(int i) {
        if (i >= this.f5140i) {
            return new C3017x6(Arrays.copyOf(this.f5139h, i), this.f5140i);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: l */
    public final String mo13975l(int i) {
        return C0843a.m439O(35, "Index:", i, ", Size:", this.f5140i);
    }

    public final E remove(int i) {
        mo13387d();
        mo13973e(i);
        E[] eArr = this.f5139h;
        E e = eArr[i];
        int i2 = this.f5140i;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f5140i--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo13387d();
        mo13973e(i);
        E[] eArr = this.f5139h;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f5140i;
    }
}
