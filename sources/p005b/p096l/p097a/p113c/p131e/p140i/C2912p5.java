package p005b.p096l.p097a.p113c.p131e.p140i;

import androidx.appcompat.widget.ActivityChooserView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.i.p5 */
public final class C2912p5 extends C2820i4<Integer> implements RandomAccess, C2951s5, C2991v6 {

    /* renamed from: j */
    public static final C2912p5 f4938j;

    /* renamed from: h */
    public int[] f4939h;

    /* renamed from: i */
    public int f4940i;

    static {
        C2912p5 p5Var = new C2912p5(new int[0], 0);
        f4938j = p5Var;
        p5Var.f4835g = false;
    }

    public C2912p5() {
        this.f4939h = new int[10];
        this.f4940i = 0;
    }

    public C2912p5(int[] iArr, int i) {
        this.f4939h = iArr;
        this.f4940i = i;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo13387d();
        if (i < 0 || i > (i2 = this.f4940i)) {
            throw new IndexOutOfBoundsException(mo13576r(i));
        }
        int[] iArr = this.f4939h;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[C0843a.m432H(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f4939h, i, iArr2, i + 1, this.f4940i - i);
            this.f4939h = iArr2;
        }
        this.f4939h[i] = intValue;
        this.f4940i++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo13574n(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo13387d();
        Charset charset = C2990v5.f5088a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C2912p5)) {
            return super.addAll(collection);
        }
        C2912p5 p5Var = (C2912p5) collection;
        int i = p5Var.f4940i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4940i;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f4939h;
            if (i3 > iArr.length) {
                this.f4939h = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(p5Var.f4939h, 0, this.f4939h, this.f4940i, p5Var.f4940i);
            this.f4940i = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final C2951s5 mo13230h(int i) {
        if (i >= this.f4940i) {
            return new C2912p5(Arrays.copyOf(this.f4939h, i), this.f4940i);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2912p5)) {
            return super.equals(obj);
        }
        C2912p5 p5Var = (C2912p5) obj;
        if (this.f4940i != p5Var.f4940i) {
            return false;
        }
        int[] iArr = p5Var.f4939h;
        for (int i = 0; i < this.f4940i; i++) {
            if (this.f4939h[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo13575q(i);
        return Integer.valueOf(this.f4939h[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4940i; i2++) {
            i = (i * 31) + this.f4939h[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f4940i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f4939h[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final int mo13573l(int i) {
        mo13575q(i);
        return this.f4939h[i];
    }

    /* renamed from: n */
    public final void mo13574n(int i) {
        mo13387d();
        int i2 = this.f4940i;
        int[] iArr = this.f4939h;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C0843a.m432H(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f4939h = iArr2;
        }
        int[] iArr3 = this.f4939h;
        int i3 = this.f4940i;
        this.f4940i = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: q */
    public final void mo13575q(int i) {
        if (i < 0 || i >= this.f4940i) {
            throw new IndexOutOfBoundsException(mo13576r(i));
        }
    }

    /* renamed from: r */
    public final String mo13576r(int i) {
        return C0843a.m439O(35, "Index:", i, ", Size:", this.f4940i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13387d();
        mo13575q(i);
        int[] iArr = this.f4939h;
        int i2 = iArr[i];
        int i3 = this.f4940i;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f4940i--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        mo13387d();
        if (i2 >= i) {
            int[] iArr = this.f4939h;
            System.arraycopy(iArr, i2, iArr, i, this.f4940i - i2);
            this.f4940i -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo13387d();
        mo13575q(i);
        int[] iArr = this.f4939h;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f4940i;
    }
}
