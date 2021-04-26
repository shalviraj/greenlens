package p298d.p299a.p300a.p301a.p303y0.p326e.p330z;

import androidx.core.p003os.EnvironmentCompat;
import java.util.ArrayList;
import java.util.List;
import p005b.p291q.p292a.C5266a;
import p298d.p334t.C6781b;
import p298d.p334t.C6789g;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.e.z.a */
public abstract class C6699a {

    /* renamed from: a */
    public final int[] f13547a;

    /* renamed from: b */
    public final int f13548b;

    /* renamed from: c */
    public final int f13549c;

    /* renamed from: d */
    public final int f13550d;

    /* renamed from: e */
    public final List<Integer> f13551e;

    public C6699a(int... iArr) {
        List<Integer> list;
        C6888i.m12438e(iArr, "numbers");
        this.f13547a = iArr;
        Integer G1 = C5266a.m9808G1(iArr, 0);
        int i = -1;
        this.f13548b = G1 == null ? -1 : G1.intValue();
        Integer G12 = C5266a.m9808G1(iArr, 1);
        this.f13549c = G12 == null ? -1 : G12.intValue();
        Integer G13 = C5266a.m9808G1(iArr, 2);
        this.f13550d = G13 != null ? G13.intValue() : i;
        if (iArr.length > 3) {
            C6888i.m12438e(iArr, "$this$asList");
            list = C6790h.m12337X(new C6781b.C6784c(new C6789g(iArr), 3, iArr.length));
        } else {
            list = C6798p.f13713g;
        }
        this.f13551e = list;
    }

    /* renamed from: a */
    public final boolean mo23835a(int i, int i2, int i3) {
        int i4 = this.f13548b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.f13549c;
        if (i5 > i2) {
            return true;
        }
        if (i5 < i2) {
            return false;
        }
        return this.f13550d >= i3;
    }

    /* renamed from: b */
    public final boolean mo23836b(C6699a aVar) {
        C6888i.m12438e(aVar, "ourVersion");
        int i = this.f13548b;
        if (i == 0) {
            if (aVar.f13548b == 0 && this.f13549c == aVar.f13549c) {
                return true;
            }
        } else if (i == aVar.f13548b && this.f13549c <= aVar.f13549c) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj != null && C6888i.m12434a(getClass(), obj.getClass())) {
            C6699a aVar = (C6699a) obj;
            return this.f13548b == aVar.f13548b && this.f13549c == aVar.f13549c && this.f13550d == aVar.f13550d && C6888i.m12434a(this.f13551e, aVar.f13551e);
        }
    }

    public int hashCode() {
        int i = this.f13548b;
        int i2 = (i * 31) + this.f13549c + i;
        int i3 = (i2 * 31) + this.f13550d + i2;
        return this.f13551e.hashCode() + (i3 * 31) + i3;
    }

    public String toString() {
        int[] iArr = this.f13547a;
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (!(i2 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList.isEmpty() ? EnvironmentCompat.MEDIA_UNKNOWN : C6790h.m12369w(arrayList, ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6862l) null, 62);
    }
}
