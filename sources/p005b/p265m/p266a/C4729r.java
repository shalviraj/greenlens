package p005b.p265m.p266a;

import androidx.annotation.NonNull;

/* renamed from: b.m.a.r */
public class C4729r implements Comparable<C4729r> {

    /* renamed from: g */
    public final int f9029g;

    /* renamed from: h */
    public final int f9030h;

    public C4729r(int i, int i2) {
        this.f9029g = i;
        this.f9030h = i2;
    }

    public int compareTo(@NonNull Object obj) {
        C4729r rVar = (C4729r) obj;
        int i = this.f9030h * this.f9029g;
        int i2 = rVar.f9030h * rVar.f9029g;
        if (i2 < i) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    /* renamed from: d */
    public C4729r mo16453d(C4729r rVar) {
        int i = this.f9029g;
        int i2 = rVar.f9030h;
        int i3 = i * i2;
        int i4 = rVar.f9029g;
        int i5 = this.f9030h;
        return i3 <= i4 * i5 ? new C4729r(i4, (i5 * i4) / i) : new C4729r((i * i2) / i5, i2);
    }

    /* renamed from: e */
    public C4729r mo16454e(C4729r rVar) {
        int i = this.f9029g;
        int i2 = rVar.f9030h;
        int i3 = i * i2;
        int i4 = rVar.f9029g;
        int i5 = this.f9030h;
        return i3 >= i4 * i5 ? new C4729r(i4, (i5 * i4) / i) : new C4729r((i * i2) / i5, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4729r.class != obj.getClass()) {
            return false;
        }
        C4729r rVar = (C4729r) obj;
        return this.f9029g == rVar.f9029g && this.f9030h == rVar.f9030h;
    }

    public int hashCode() {
        return (this.f9029g * 31) + this.f9030h;
    }

    public String toString() {
        return this.f9029g + "x" + this.f9030h;
    }
}
