package p416l.p417a.p419u1;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.Metadata;
import p298d.p344x.p346c.C6888i;
import p416l.p417a.C7741m0;
import p416l.p417a.p419u1.C7796t;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0013\u0010\u001c\u001a\u00020\u00198F@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, mo24462d2 = {"Ll/a/u1/s;", "Ll/a/u1/t;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "e", "()Ll/a/u1/t;", "b", "", "index", "d", "(I)Ll/a/u1/t;", "node", "Ld/r;", "a", "(Ll/a/u1/t;)V", "i", "f", "(I)V", "j", "g", "(II)V", "", "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "c", "()Z", "isEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: l.a.u1.s */
public class C7795s<T extends C7796t & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    public T[] f15363a;

    /* renamed from: a */
    public final void mo25463a(T t) {
        C7741m0.C7742a aVar = (C7741m0.C7742a) t;
        aVar.mo25416i(this);
        T[] tArr = this.f15363a;
        if (tArr == null) {
            tArr = new C7796t[4];
            this.f15363a = tArr;
        } else if (this._size >= tArr.length) {
            T[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            C6888i.m12437d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            tArr = (C7796t[]) copyOf;
            this.f15363a = tArr;
        }
        int i = this._size;
        this._size = i + 1;
        tArr[i] = t;
        aVar.f15290h = i;
        mo25468f(i);
    }

    /* renamed from: b */
    public final T mo25464b() {
        T[] tArr = this.f15363a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo25465c() {
        return this._size == 0;
    }

    /* renamed from: d */
    public final T mo25466d(int i) {
        T[] tArr = this.f15363a;
        C6888i.m12436c(tArr);
        this._size--;
        if (i < this._size) {
            mo25469g(i, this._size);
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                C6888i.m12436c(t);
                T t2 = tArr[i2];
                C6888i.m12436c(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    mo25469g(i, i2);
                    mo25468f(i2);
                }
            }
            while (true) {
                int i3 = (i * 2) + 1;
                if (i3 >= this._size) {
                    break;
                }
                T[] tArr2 = this.f15363a;
                C6888i.m12436c(tArr2);
                int i4 = i3 + 1;
                if (i4 < this._size) {
                    T t3 = tArr2[i4];
                    C6888i.m12436c(t3);
                    T t4 = tArr2[i3];
                    C6888i.m12436c(t4);
                    if (((Comparable) t3).compareTo(t4) < 0) {
                        i3 = i4;
                    }
                }
                T t5 = tArr2[i];
                C6888i.m12436c(t5);
                T t6 = tArr2[i3];
                C6888i.m12436c(t6);
                if (((Comparable) t5).compareTo(t6) <= 0) {
                    break;
                }
                mo25469g(i, i3);
                i = i3;
            }
        }
        T t7 = tArr[this._size];
        C6888i.m12436c(t7);
        t7.mo25416i((C7795s<?>) null);
        t7.mo25415e(-1);
        tArr[this._size] = null;
        return t7;
    }

    /* renamed from: e */
    public final T mo25467e() {
        T d;
        synchronized (this) {
            d = this._size > 0 ? mo25466d(0) : null;
        }
        return d;
    }

    /* renamed from: f */
    public final void mo25468f(int i) {
        while (i > 0) {
            T[] tArr = this.f15363a;
            C6888i.m12436c(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            C6888i.m12436c(t);
            T t2 = tArr[i];
            C6888i.m12436c(t2);
            if (((Comparable) t).compareTo(t2) > 0) {
                mo25469g(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final void mo25469g(int i, int i2) {
        T[] tArr = this.f15363a;
        C6888i.m12436c(tArr);
        T t = tArr[i2];
        C6888i.m12436c(t);
        T t2 = tArr[i];
        C6888i.m12436c(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.mo25415e(i);
        t2.mo25415e(i2);
    }
}
