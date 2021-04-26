package p005b.p096l.p097a.p113c.p131e.p140i;

import androidx.appcompat.widget.ActivityChooserView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.i.f6 */
public final class C2783f6 extends C2820i4<Long> implements RandomAccess, C2964t5, C2991v6 {

    /* renamed from: j */
    public static final C2783f6 f4722j;

    /* renamed from: h */
    public long[] f4723h;

    /* renamed from: i */
    public int f4724i;

    static {
        C2783f6 f6Var = new C2783f6(new long[0], 0);
        f4722j = f6Var;
        f6Var.f4835g = false;
    }

    public C2783f6() {
        this.f4723h = new long[10];
        this.f4724i = 0;
    }

    public C2783f6(long[] jArr, int i) {
        this.f4723h = jArr;
        this.f4724i = i;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo13387d();
        if (i < 0 || i > (i2 = this.f4724i)) {
            throw new IndexOutOfBoundsException(mo13331r(i));
        }
        long[] jArr = this.f4723h;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[C0843a.m432H(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f4723h, i, jArr2, i + 1, this.f4724i - i);
            this.f4723h = jArr2;
        }
        this.f4723h[i] = longValue;
        this.f4724i++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo13329n(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo13387d();
        Charset charset = C2990v5.f5088a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C2783f6)) {
            return super.addAll(collection);
        }
        C2783f6 f6Var = (C2783f6) collection;
        int i = f6Var.f4724i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4724i;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f4723h;
            if (i3 > jArr.length) {
                this.f4723h = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(f6Var.f4723h, 0, this.f4723h, this.f4724i, f6Var.f4724i);
            this.f4724i = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final long mo13323e(int i) {
        mo13330q(i);
        return this.f4723h[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2783f6)) {
            return super.equals(obj);
        }
        C2783f6 f6Var = (C2783f6) obj;
        if (this.f4724i != f6Var.f4724i) {
            return false;
        }
        long[] jArr = f6Var.f4723h;
        for (int i = 0; i < this.f4724i; i++) {
            if (this.f4723h[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo13330q(i);
        return Long.valueOf(this.f4723h[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4724i; i2++) {
            i = (i * 31) + C2990v5.m5404a(this.f4723h[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f4724i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f4723h[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final C2964t5 mo13230h(int i) {
        if (i >= this.f4724i) {
            return new C2783f6(Arrays.copyOf(this.f4723h, i), this.f4724i);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: n */
    public final void mo13329n(long j) {
        mo13387d();
        int i = this.f4724i;
        long[] jArr = this.f4723h;
        if (i == jArr.length) {
            long[] jArr2 = new long[C0843a.m432H(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f4723h = jArr2;
        }
        long[] jArr3 = this.f4723h;
        int i2 = this.f4724i;
        this.f4724i = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: q */
    public final void mo13330q(int i) {
        if (i < 0 || i >= this.f4724i) {
            throw new IndexOutOfBoundsException(mo13331r(i));
        }
    }

    /* renamed from: r */
    public final String mo13331r(int i) {
        return C0843a.m439O(35, "Index:", i, ", Size:", this.f4724i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13387d();
        mo13330q(i);
        long[] jArr = this.f4723h;
        long j = jArr[i];
        int i2 = this.f4724i;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f4724i--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        mo13387d();
        if (i2 >= i) {
            long[] jArr = this.f4723h;
            System.arraycopy(jArr, i2, jArr, i, this.f4724i - i2);
            this.f4724i -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo13387d();
        mo13330q(i);
        long[] jArr = this.f4723h;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f4724i;
    }
}
