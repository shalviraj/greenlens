package p298d.p334t;

import java.util.RandomAccess;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.t.g */
public final class C6789g extends C6781b<Integer> implements RandomAccess {

    /* renamed from: g */
    public final /* synthetic */ int[] f13706g;

    public C6789g(int[] iArr) {
        this.f13706g = iArr;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f13706g;
        C6888i.m12438e(iArr, "$this$contains");
        if (C5266a.m9968i2(iArr, intValue) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public int mo23951e() {
        return this.f13706g.length;
    }

    public Object get(int i) {
        return Integer.valueOf(this.f13706g[i]);
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return C5266a.m9968i2(this.f13706g, ((Number) obj).intValue());
    }

    public boolean isEmpty() {
        return this.f13706g.length == 0;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f13706g;
        C6888i.m12438e(iArr, "$this$lastIndexOf");
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (intValue == iArr[length]) {
                return length;
            }
        }
        return -1;
    }
}
