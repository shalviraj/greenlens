package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.appcompat.widget.ActivityChooserView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.e.r */
public final class C2438r extends C2094cm<Long> implements RandomAccess, C2171g, C2222i0 {

    /* renamed from: j */
    public static final C2438r f4247j;

    /* renamed from: h */
    public long[] f4248h;

    /* renamed from: i */
    public int f4249i;

    static {
        C2438r rVar = new C2438r(new long[0], 0);
        f4247j = rVar;
        rVar.f3693g = false;
    }

    public C2438r() {
        this.f4248h = new long[10];
        this.f4249i = 0;
    }

    public C2438r(long[] jArr, int i) {
        this.f4248h = jArr;
        this.f4249i = i;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo12479d();
        if (i < 0 || i > (i2 = this.f4249i)) {
            throw new IndexOutOfBoundsException(mo12956q(i));
        }
        long[] jArr = this.f4248h;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[C0843a.m432H(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f4248h, i, jArr2, i + 1, this.f4249i - i);
            this.f4248h = jArr2;
        }
        this.f4248h[i] = longValue;
        this.f4249i++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo12954l(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo12479d();
        Charset charset = C2196h.f3910a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C2438r)) {
            return super.addAll(collection);
        }
        C2438r rVar = (C2438r) collection;
        int i = rVar.f4249i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4249i;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f4248h;
            if (i3 > jArr.length) {
                this.f4248h = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(rVar.f4248h, 0, this.f4248h, this.f4249i, rVar.f4249i);
            this.f4249i = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final long mo12951e(int i) {
        mo12955n(i);
        return this.f4248h[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2438r)) {
            return super.equals(obj);
        }
        C2438r rVar = (C2438r) obj;
        if (this.f4249i != rVar.f4249i) {
            return false;
        }
        long[] jArr = rVar.f4248h;
        for (int i = 0; i < this.f4249i; i++) {
            if (this.f4248h[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo12955n(i);
        return Long.valueOf(this.f4248h[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2171g mo12494h(int i) {
        if (i >= this.f4249i) {
            return new C2438r(Arrays.copyOf(this.f4248h, i), this.f4249i);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4249i; i2++) {
            i = (i * 31) + C2196h.m3459a(this.f4248h[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f4249i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f4248h[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final void mo12954l(long j) {
        mo12479d();
        int i = this.f4249i;
        long[] jArr = this.f4248h;
        if (i == jArr.length) {
            long[] jArr2 = new long[C0843a.m432H(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f4248h = jArr2;
        }
        long[] jArr3 = this.f4248h;
        int i2 = this.f4249i;
        this.f4249i = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: n */
    public final void mo12955n(int i) {
        if (i < 0 || i >= this.f4249i) {
            throw new IndexOutOfBoundsException(mo12956q(i));
        }
    }

    /* renamed from: q */
    public final String mo12956q(int i) {
        return C0843a.m439O(35, "Index:", i, ", Size:", this.f4249i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo12479d();
        mo12955n(i);
        long[] jArr = this.f4248h;
        long j = jArr[i];
        int i2 = this.f4249i;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f4249i--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        mo12479d();
        if (i2 >= i) {
            long[] jArr = this.f4248h;
            System.arraycopy(jArr, i2, jArr, i, this.f4249i - i2);
            this.f4249i -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo12479d();
        mo12955n(i);
        long[] jArr = this.f4248h;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f4249i;
    }
}
