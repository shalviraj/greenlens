package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.appcompat.widget.ActivityChooserView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.e.d */
public final class C2096d extends C2094cm<Integer> implements RandomAccess, C2171g, C2222i0 {

    /* renamed from: j */
    public static final C2096d f3698j;

    /* renamed from: h */
    public int[] f3699h;

    /* renamed from: i */
    public int f3700i;

    static {
        C2096d dVar = new C2096d(new int[0], 0);
        f3698j = dVar;
        dVar.f3693g = false;
    }

    public C2096d() {
        this.f3699h = new int[10];
        this.f3700i = 0;
    }

    public C2096d(int[] iArr, int i) {
        this.f3699h = iArr;
        this.f3700i = i;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo12479d();
        if (i < 0 || i > (i2 = this.f3700i)) {
            throw new IndexOutOfBoundsException(mo12498q(i));
        }
        int[] iArr = this.f3699h;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[C0843a.m432H(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f3699h, i, iArr2, i + 1, this.f3700i - i);
            this.f3699h = iArr2;
        }
        this.f3699h[i] = intValue;
        this.f3700i++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo12496l(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo12479d();
        Charset charset = C2196h.f3910a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C2096d)) {
            return super.addAll(collection);
        }
        C2096d dVar = (C2096d) collection;
        int i = dVar.f3700i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f3700i;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f3699h;
            if (i3 > iArr.length) {
                this.f3699h = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(dVar.f3699h, 0, this.f3699h, this.f3700i, dVar.f3700i);
            this.f3700i = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final int mo12492e(int i) {
        mo12497n(i);
        return this.f3699h[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2096d)) {
            return super.equals(obj);
        }
        C2096d dVar = (C2096d) obj;
        if (this.f3700i != dVar.f3700i) {
            return false;
        }
        int[] iArr = dVar.f3699h;
        for (int i = 0; i < this.f3700i; i++) {
            if (this.f3699h[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo12497n(i);
        return Integer.valueOf(this.f3699h[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2171g mo12494h(int i) {
        if (i >= this.f3700i) {
            return new C2096d(Arrays.copyOf(this.f3699h, i), this.f3700i);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f3700i; i2++) {
            i = (i * 31) + this.f3699h[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f3700i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f3699h[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final void mo12496l(int i) {
        mo12479d();
        int i2 = this.f3700i;
        int[] iArr = this.f3699h;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C0843a.m432H(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f3699h = iArr2;
        }
        int[] iArr3 = this.f3699h;
        int i3 = this.f3700i;
        this.f3700i = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: n */
    public final void mo12497n(int i) {
        if (i < 0 || i >= this.f3700i) {
            throw new IndexOutOfBoundsException(mo12498q(i));
        }
    }

    /* renamed from: q */
    public final String mo12498q(int i) {
        return C0843a.m439O(35, "Index:", i, ", Size:", this.f3700i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo12479d();
        mo12497n(i);
        int[] iArr = this.f3699h;
        int i2 = iArr[i];
        int i3 = this.f3700i;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f3700i--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        mo12479d();
        if (i2 >= i) {
            int[] iArr = this.f3699h;
            System.arraycopy(iArr, i2, iArr, i, this.f3700i - i2);
            this.f3700i -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo12479d();
        mo12497n(i);
        int[] iArr = this.f3699h;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f3700i;
    }
}
