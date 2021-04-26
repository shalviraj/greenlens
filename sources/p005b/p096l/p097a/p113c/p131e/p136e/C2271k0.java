package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.Arrays;
import java.util.RandomAccess;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.e.k0 */
public final class C2271k0<E> extends C2094cm<E> implements RandomAccess {

    /* renamed from: j */
    public static final C2271k0<Object> f3988j;

    /* renamed from: h */
    public E[] f3989h;

    /* renamed from: i */
    public int f3990i;

    static {
        C2271k0<Object> k0Var = new C2271k0<>(new Object[0], 0);
        f3988j = k0Var;
        k0Var.f3693g = false;
    }

    public C2271k0(E[] eArr, int i) {
        this.f3989h = eArr;
        this.f3990i = i;
    }

    public final void add(int i, E e) {
        int i2;
        mo12479d();
        if (i < 0 || i > (i2 = this.f3990i)) {
            throw new IndexOutOfBoundsException(mo12760l(i));
        }
        E[] eArr = this.f3989h;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[C0843a.m432H(i2, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f3989h, i, eArr2, i + 1, this.f3990i - i);
            this.f3989h = eArr2;
        }
        this.f3989h[i] = e;
        this.f3990i++;
        this.modCount++;
    }

    public final boolean add(E e) {
        mo12479d();
        int i = this.f3990i;
        E[] eArr = this.f3989h;
        if (i == eArr.length) {
            this.f3989h = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f3989h;
        int i2 = this.f3990i;
        this.f3990i = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    /* renamed from: e */
    public final void mo12758e(int i) {
        if (i < 0 || i >= this.f3990i) {
            throw new IndexOutOfBoundsException(mo12760l(i));
        }
    }

    public final E get(int i) {
        mo12758e(i);
        return this.f3989h[i];
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2171g mo12494h(int i) {
        if (i >= this.f3990i) {
            return new C2271k0(Arrays.copyOf(this.f3989h, i), this.f3990i);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: l */
    public final String mo12760l(int i) {
        return C0843a.m439O(35, "Index:", i, ", Size:", this.f3990i);
    }

    public final E remove(int i) {
        mo12479d();
        mo12758e(i);
        E[] eArr = this.f3989h;
        E e = eArr[i];
        int i2 = this.f3990i;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f3990i--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo12479d();
        mo12758e(i);
        E[] eArr = this.f3989h;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f3990i;
    }
}
