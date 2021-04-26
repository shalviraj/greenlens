package p298d.p333a0;

import java.util.Iterator;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.a0.b */
public class C6756b implements Iterable<Integer>, C6875a {

    /* renamed from: g */
    public final int f13658g;

    /* renamed from: h */
    public final int f13659h;

    /* renamed from: i */
    public final int f13660i;

    public C6756b(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f13658g = i;
            this.f13659h = C5266a.m9844M1(i, i2, i3);
            this.f13660i = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6756b) {
            if (!isEmpty() || !((C6756b) obj).isEmpty()) {
                C6756b bVar = (C6756b) obj;
                if (!(this.f13658g == bVar.f13658g && this.f13659h == bVar.f13659h && this.f13660i == bVar.f13660i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f13658g * 31) + this.f13659h) * 31) + this.f13660i;
    }

    public boolean isEmpty() {
        if (this.f13660i > 0) {
            if (this.f13658g > this.f13659h) {
                return true;
            }
        } else if (this.f13658g < this.f13659h) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return new C6757c(this.f13658g, this.f13659h, this.f13660i);
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f13660i > 0) {
            sb = new StringBuilder();
            sb.append(this.f13658g);
            sb.append("..");
            sb.append(this.f13659h);
            sb.append(" step ");
            i = this.f13660i;
        } else {
            sb = new StringBuilder();
            sb.append(this.f13658g);
            sb.append(" downTo ");
            sb.append(this.f13659h);
            sb.append(" step ");
            i = -this.f13660i;
        }
        sb.append(i);
        return sb.toString();
    }
}
