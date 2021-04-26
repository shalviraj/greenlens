package p005b.p096l.p097a.p113c.p131e.p140i;

import androidx.appcompat.widget.ActivityChooserView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.i.z4 */
public final class C3041z4 extends C2820i4<Double> implements RandomAccess, C2977u5, C2991v6 {

    /* renamed from: j */
    public static final C3041z4 f5181j;

    /* renamed from: h */
    public double[] f5182h;

    /* renamed from: i */
    public int f5183i;

    static {
        C3041z4 z4Var = new C3041z4(new double[0], 0);
        f5181j = z4Var;
        z4Var.f4835g = false;
    }

    public C3041z4() {
        this.f5182h = new double[10];
        this.f5183i = 0;
    }

    public C3041z4(double[] dArr, int i) {
        this.f5182h = dArr;
        this.f5183i = i;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo13387d();
        if (i < 0 || i > (i2 = this.f5183i)) {
            throw new IndexOutOfBoundsException(mo14000n(i));
        }
        double[] dArr = this.f5182h;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[C0843a.m432H(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f5182h, i, dArr2, i + 1, this.f5183i - i);
            this.f5182h = dArr2;
        }
        this.f5182h[i] = doubleValue;
        this.f5183i++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo13996e(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo13387d();
        Charset charset = C2990v5.f5088a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C3041z4)) {
            return super.addAll(collection);
        }
        C3041z4 z4Var = (C3041z4) collection;
        int i = z4Var.f5183i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f5183i;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f5182h;
            if (i3 > dArr.length) {
                this.f5182h = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(z4Var.f5182h, 0, this.f5182h, this.f5183i, z4Var.f5183i);
            this.f5183i = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo13996e(double d) {
        mo13387d();
        int i = this.f5183i;
        double[] dArr = this.f5182h;
        if (i == dArr.length) {
            double[] dArr2 = new double[C0843a.m432H(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f5182h = dArr2;
        }
        double[] dArr3 = this.f5182h;
        int i2 = this.f5183i;
        this.f5183i = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3041z4)) {
            return super.equals(obj);
        }
        C3041z4 z4Var = (C3041z4) obj;
        if (this.f5183i != z4Var.f5183i) {
            return false;
        }
        double[] dArr = z4Var.f5182h;
        for (int i = 0; i < this.f5183i; i++) {
            if (Double.doubleToLongBits(this.f5182h[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo13999l(i);
        return Double.valueOf(this.f5182h[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2977u5 mo13230h(int i) {
        if (i >= this.f5183i) {
            return new C3041z4(Arrays.copyOf(this.f5182h, i), this.f5183i);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f5183i; i2++) {
            i = (i * 31) + C2990v5.m5404a(Double.doubleToLongBits(this.f5182h[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f5183i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f5182h[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final void mo13999l(int i) {
        if (i < 0 || i >= this.f5183i) {
            throw new IndexOutOfBoundsException(mo14000n(i));
        }
    }

    /* renamed from: n */
    public final String mo14000n(int i) {
        return C0843a.m439O(35, "Index:", i, ", Size:", this.f5183i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13387d();
        mo13999l(i);
        double[] dArr = this.f5182h;
        double d = dArr[i];
        int i2 = this.f5183i;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f5183i--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i, int i2) {
        mo13387d();
        if (i2 >= i) {
            double[] dArr = this.f5182h;
            System.arraycopy(dArr, i2, dArr, i, this.f5183i - i2);
            this.f5183i -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo13387d();
        mo13999l(i);
        double[] dArr = this.f5182h;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f5183i;
    }
}
