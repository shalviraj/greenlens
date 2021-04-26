package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.appcompat.widget.ActivityChooserView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.e.fm */
public final class C2169fm extends C2094cm<Boolean> implements RandomAccess, C2171g, C2222i0 {

    /* renamed from: j */
    public static final C2169fm f3873j;

    /* renamed from: h */
    public boolean[] f3874h;

    /* renamed from: i */
    public int f3875i;

    static {
        C2169fm fmVar = new C2169fm(new boolean[0], 0);
        f3873j = fmVar;
        fmVar.f3693g = false;
    }

    public C2169fm() {
        this.f3874h = new boolean[10];
        this.f3875i = 0;
    }

    public C2169fm(boolean[] zArr, int i) {
        this.f3874h = zArr;
        this.f3875i = i;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo12479d();
        if (i < 0 || i > (i2 = this.f3875i)) {
            throw new IndexOutOfBoundsException(mo12659n(i));
        }
        boolean[] zArr = this.f3874h;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[C0843a.m432H(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f3874h, i, zArr2, i + 1, this.f3875i - i);
            this.f3874h = zArr2;
        }
        this.f3874h[i] = booleanValue;
        this.f3875i++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo12655e(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo12479d();
        Charset charset = C2196h.f3910a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C2169fm)) {
            return super.addAll(collection);
        }
        C2169fm fmVar = (C2169fm) collection;
        int i = fmVar.f3875i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f3875i;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f3874h;
            if (i3 > zArr.length) {
                this.f3874h = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(fmVar.f3874h, 0, this.f3874h, this.f3875i, fmVar.f3875i);
            this.f3875i = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo12655e(boolean z) {
        mo12479d();
        int i = this.f3875i;
        boolean[] zArr = this.f3874h;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[C0843a.m432H(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f3874h = zArr2;
        }
        boolean[] zArr3 = this.f3874h;
        int i2 = this.f3875i;
        this.f3875i = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2169fm)) {
            return super.equals(obj);
        }
        C2169fm fmVar = (C2169fm) obj;
        if (this.f3875i != fmVar.f3875i) {
            return false;
        }
        boolean[] zArr = fmVar.f3874h;
        for (int i = 0; i < this.f3875i; i++) {
            if (this.f3874h[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo12658l(i);
        return Boolean.valueOf(this.f3874h[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2171g mo12494h(int i) {
        if (i >= this.f3875i) {
            return new C2169fm(Arrays.copyOf(this.f3874h, i), this.f3875i);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f3875i; i2++) {
            i = (i * 31) + C2196h.m3460b(this.f3874h[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f3875i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f3874h[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final void mo12658l(int i) {
        if (i < 0 || i >= this.f3875i) {
            throw new IndexOutOfBoundsException(mo12659n(i));
        }
    }

    /* renamed from: n */
    public final String mo12659n(int i) {
        return C0843a.m439O(35, "Index:", i, ", Size:", this.f3875i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo12479d();
        mo12658l(i);
        boolean[] zArr = this.f3874h;
        boolean z = zArr[i];
        int i2 = this.f3875i;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f3875i--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i, int i2) {
        mo12479d();
        if (i2 >= i) {
            boolean[] zArr = this.f3874h;
            System.arraycopy(zArr, i2, zArr, i, this.f3875i - i2);
            this.f3875i -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo12479d();
        mo12658l(i);
        boolean[] zArr = this.f3874h;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f3875i;
    }
}
