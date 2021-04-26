package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.appcompat.widget.ActivityChooserView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.e.en */
public final class C2145en extends C2094cm<Float> implements RandomAccess, C2171g, C2222i0 {

    /* renamed from: j */
    public static final C2145en f3841j;

    /* renamed from: h */
    public float[] f3842h;

    /* renamed from: i */
    public int f3843i;

    static {
        C2145en enVar = new C2145en(new float[0], 0);
        f3841j = enVar;
        enVar.f3693g = false;
    }

    public C2145en() {
        this.f3842h = new float[10];
        this.f3843i = 0;
    }

    public C2145en(float[] fArr, int i) {
        this.f3842h = fArr;
        this.f3843i = i;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo12479d();
        if (i < 0 || i > (i2 = this.f3843i)) {
            throw new IndexOutOfBoundsException(mo12620n(i));
        }
        float[] fArr = this.f3842h;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[C0843a.m432H(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f3842h, i, fArr2, i + 1, this.f3843i - i);
            this.f3842h = fArr2;
        }
        this.f3842h[i] = floatValue;
        this.f3843i++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo12616e(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo12479d();
        Charset charset = C2196h.f3910a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C2145en)) {
            return super.addAll(collection);
        }
        C2145en enVar = (C2145en) collection;
        int i = enVar.f3843i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f3843i;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f3842h;
            if (i3 > fArr.length) {
                this.f3842h = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(enVar.f3842h, 0, this.f3842h, this.f3843i, enVar.f3843i);
            this.f3843i = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo12616e(float f) {
        mo12479d();
        int i = this.f3843i;
        float[] fArr = this.f3842h;
        if (i == fArr.length) {
            float[] fArr2 = new float[C0843a.m432H(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f3842h = fArr2;
        }
        float[] fArr3 = this.f3842h;
        int i2 = this.f3843i;
        this.f3843i = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2145en)) {
            return super.equals(obj);
        }
        C2145en enVar = (C2145en) obj;
        if (this.f3843i != enVar.f3843i) {
            return false;
        }
        float[] fArr = enVar.f3842h;
        for (int i = 0; i < this.f3843i; i++) {
            if (Float.floatToIntBits(this.f3842h[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo12619l(i);
        return Float.valueOf(this.f3842h[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2171g mo12494h(int i) {
        if (i >= this.f3843i) {
            return new C2145en(Arrays.copyOf(this.f3842h, i), this.f3843i);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f3843i; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f3842h[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f3843i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f3842h[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final void mo12619l(int i) {
        if (i < 0 || i >= this.f3843i) {
            throw new IndexOutOfBoundsException(mo12620n(i));
        }
    }

    /* renamed from: n */
    public final String mo12620n(int i) {
        return C0843a.m439O(35, "Index:", i, ", Size:", this.f3843i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo12479d();
        mo12619l(i);
        float[] fArr = this.f3842h;
        float f = fArr[i];
        int i2 = this.f3843i;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f3843i--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final void removeRange(int i, int i2) {
        mo12479d();
        if (i2 >= i) {
            float[] fArr = this.f3842h;
            System.arraycopy(fArr, i2, fArr, i, this.f3843i - i2);
            this.f3843i -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo12479d();
        mo12619l(i);
        float[] fArr = this.f3842h;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f3843i;
    }
}
