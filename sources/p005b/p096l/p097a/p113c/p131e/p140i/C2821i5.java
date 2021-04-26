package p005b.p096l.p097a.p113c.p131e.p140i;

import androidx.appcompat.widget.ActivityChooserView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.i.i5 */
public final class C2821i5 extends C2820i4<Float> implements RandomAccess, C2977u5, C2991v6 {

    /* renamed from: j */
    public static final C2821i5 f4836j;

    /* renamed from: h */
    public float[] f4837h;

    /* renamed from: i */
    public int f4838i;

    static {
        C2821i5 i5Var = new C2821i5(new float[0], 0);
        f4836j = i5Var;
        i5Var.f4835g = false;
    }

    public C2821i5() {
        this.f4837h = new float[10];
        this.f4838i = 0;
    }

    public C2821i5(float[] fArr, int i) {
        this.f4837h = fArr;
        this.f4838i = i;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo13387d();
        if (i < 0 || i > (i2 = this.f4838i)) {
            throw new IndexOutOfBoundsException(mo13397n(i));
        }
        float[] fArr = this.f4837h;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[C0843a.m432H(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f4837h, i, fArr2, i + 1, this.f4838i - i);
            this.f4837h = fArr2;
        }
        this.f4837h[i] = floatValue;
        this.f4838i++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo13393e(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo13387d();
        Charset charset = C2990v5.f5088a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C2821i5)) {
            return super.addAll(collection);
        }
        C2821i5 i5Var = (C2821i5) collection;
        int i = i5Var.f4838i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4838i;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f4837h;
            if (i3 > fArr.length) {
                this.f4837h = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(i5Var.f4837h, 0, this.f4837h, this.f4838i, i5Var.f4838i);
            this.f4838i = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo13393e(float f) {
        mo13387d();
        int i = this.f4838i;
        float[] fArr = this.f4837h;
        if (i == fArr.length) {
            float[] fArr2 = new float[C0843a.m432H(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f4837h = fArr2;
        }
        float[] fArr3 = this.f4837h;
        int i2 = this.f4838i;
        this.f4838i = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2821i5)) {
            return super.equals(obj);
        }
        C2821i5 i5Var = (C2821i5) obj;
        if (this.f4838i != i5Var.f4838i) {
            return false;
        }
        float[] fArr = i5Var.f4837h;
        for (int i = 0; i < this.f4838i; i++) {
            if (Float.floatToIntBits(this.f4837h[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo13396l(i);
        return Float.valueOf(this.f4837h[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2977u5 mo13230h(int i) {
        if (i >= this.f4838i) {
            return new C2821i5(Arrays.copyOf(this.f4837h, i), this.f4838i);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4838i; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f4837h[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f4838i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f4837h[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final void mo13396l(int i) {
        if (i < 0 || i >= this.f4838i) {
            throw new IndexOutOfBoundsException(mo13397n(i));
        }
    }

    /* renamed from: n */
    public final String mo13397n(int i) {
        return C0843a.m439O(35, "Index:", i, ", Size:", this.f4838i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13387d();
        mo13396l(i);
        float[] fArr = this.f4837h;
        float f = fArr[i];
        int i2 = this.f4838i;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f4838i--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final void removeRange(int i, int i2) {
        mo13387d();
        if (i2 >= i) {
            float[] fArr = this.f4837h;
            System.arraycopy(fArr, i2, fArr, i, this.f4838i - i2);
            this.f4838i -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo13387d();
        mo13396l(i);
        float[] fArr = this.f4837h;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f4838i;
    }
}
