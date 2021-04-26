package p005b.p096l.p097a.p113c.p131e.p140i;

import androidx.appcompat.widget.ActivityChooserView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.i.l4 */
public final class C2859l4 extends C2820i4<Boolean> implements RandomAccess, C2977u5, C2991v6 {

    /* renamed from: j */
    public static final C2859l4 f4881j;

    /* renamed from: h */
    public boolean[] f4882h;

    /* renamed from: i */
    public int f4883i;

    static {
        C2859l4 l4Var = new C2859l4(new boolean[0], 0);
        f4881j = l4Var;
        l4Var.f4835g = false;
    }

    public C2859l4() {
        this.f4882h = new boolean[10];
        this.f4883i = 0;
    }

    public C2859l4(boolean[] zArr, int i) {
        this.f4882h = zArr;
        this.f4883i = i;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo13387d();
        if (i < 0 || i > (i2 = this.f4883i)) {
            throw new IndexOutOfBoundsException(mo13478n(i));
        }
        boolean[] zArr = this.f4882h;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[C0843a.m432H(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f4882h, i, zArr2, i + 1, this.f4883i - i);
            this.f4882h = zArr2;
        }
        this.f4882h[i] = booleanValue;
        this.f4883i++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo13474e(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo13387d();
        Charset charset = C2990v5.f5088a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C2859l4)) {
            return super.addAll(collection);
        }
        C2859l4 l4Var = (C2859l4) collection;
        int i = l4Var.f4883i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4883i;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f4882h;
            if (i3 > zArr.length) {
                this.f4882h = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(l4Var.f4882h, 0, this.f4882h, this.f4883i, l4Var.f4883i);
            this.f4883i = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo13474e(boolean z) {
        mo13387d();
        int i = this.f4883i;
        boolean[] zArr = this.f4882h;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[C0843a.m432H(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f4882h = zArr2;
        }
        boolean[] zArr3 = this.f4882h;
        int i2 = this.f4883i;
        this.f4883i = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2859l4)) {
            return super.equals(obj);
        }
        C2859l4 l4Var = (C2859l4) obj;
        if (this.f4883i != l4Var.f4883i) {
            return false;
        }
        boolean[] zArr = l4Var.f4882h;
        for (int i = 0; i < this.f4883i; i++) {
            if (this.f4882h[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo13477l(i);
        return Boolean.valueOf(this.f4882h[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2977u5 mo13230h(int i) {
        if (i >= this.f4883i) {
            return new C2859l4(Arrays.copyOf(this.f4882h, i), this.f4883i);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4883i; i2++) {
            i = (i * 31) + C2990v5.m5405b(this.f4882h[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f4883i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f4882h[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final void mo13477l(int i) {
        if (i < 0 || i >= this.f4883i) {
            throw new IndexOutOfBoundsException(mo13478n(i));
        }
    }

    /* renamed from: n */
    public final String mo13478n(int i) {
        return C0843a.m439O(35, "Index:", i, ", Size:", this.f4883i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13387d();
        mo13477l(i);
        boolean[] zArr = this.f4882h;
        boolean z = zArr[i];
        int i2 = this.f4883i;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f4883i--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i, int i2) {
        mo13387d();
        if (i2 >= i) {
            boolean[] zArr = this.f4882h;
            System.arraycopy(zArr, i2, zArr, i, this.f4883i - i2);
            this.f4883i -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo13387d();
        mo13477l(i);
        boolean[] zArr = this.f4882h;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f4883i;
    }
}
