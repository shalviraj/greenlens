package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.appcompat.widget.ActivityChooserView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.e.vm */
public final class C2557vm extends C2094cm<Double> implements RandomAccess, C2171g, C2222i0 {

    /* renamed from: j */
    public static final C2557vm f4380j;

    /* renamed from: h */
    public double[] f4381h;

    /* renamed from: i */
    public int f4382i;

    static {
        C2557vm vmVar = new C2557vm(new double[0], 0);
        f4380j = vmVar;
        vmVar.f3693g = false;
    }

    public C2557vm() {
        this.f4381h = new double[10];
        this.f4382i = 0;
    }

    public C2557vm(double[] dArr, int i) {
        this.f4381h = dArr;
        this.f4382i = i;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo12479d();
        if (i < 0 || i > (i2 = this.f4382i)) {
            throw new IndexOutOfBoundsException(mo13066n(i));
        }
        double[] dArr = this.f4381h;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[C0843a.m432H(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f4381h, i, dArr2, i + 1, this.f4382i - i);
            this.f4381h = dArr2;
        }
        this.f4381h[i] = doubleValue;
        this.f4382i++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo13062e(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo12479d();
        Charset charset = C2196h.f3910a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C2557vm)) {
            return super.addAll(collection);
        }
        C2557vm vmVar = (C2557vm) collection;
        int i = vmVar.f4382i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4382i;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f4381h;
            if (i3 > dArr.length) {
                this.f4381h = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(vmVar.f4381h, 0, this.f4381h, this.f4382i, vmVar.f4382i);
            this.f4382i = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo13062e(double d) {
        mo12479d();
        int i = this.f4382i;
        double[] dArr = this.f4381h;
        if (i == dArr.length) {
            double[] dArr2 = new double[C0843a.m432H(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f4381h = dArr2;
        }
        double[] dArr3 = this.f4381h;
        int i2 = this.f4382i;
        this.f4382i = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2557vm)) {
            return super.equals(obj);
        }
        C2557vm vmVar = (C2557vm) obj;
        if (this.f4382i != vmVar.f4382i) {
            return false;
        }
        double[] dArr = vmVar.f4381h;
        for (int i = 0; i < this.f4382i; i++) {
            if (Double.doubleToLongBits(this.f4381h[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo13065l(i);
        return Double.valueOf(this.f4381h[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2171g mo12494h(int i) {
        if (i >= this.f4382i) {
            return new C2557vm(Arrays.copyOf(this.f4381h, i), this.f4382i);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4382i; i2++) {
            i = (i * 31) + C2196h.m3459a(Double.doubleToLongBits(this.f4381h[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f4382i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f4381h[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final void mo13065l(int i) {
        if (i < 0 || i >= this.f4382i) {
            throw new IndexOutOfBoundsException(mo13066n(i));
        }
    }

    /* renamed from: n */
    public final String mo13066n(int i) {
        return C0843a.m439O(35, "Index:", i, ", Size:", this.f4382i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo12479d();
        mo13065l(i);
        double[] dArr = this.f4381h;
        double d = dArr[i];
        int i2 = this.f4382i;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f4382i--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i, int i2) {
        mo12479d();
        if (i2 >= i) {
            double[] dArr = this.f4381h;
            System.arraycopy(dArr, i2, dArr, i, this.f4382i - i2);
            this.f4382i -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo12479d();
        mo13065l(i);
        double[] dArr = this.f4381h;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f4382i;
    }
}
