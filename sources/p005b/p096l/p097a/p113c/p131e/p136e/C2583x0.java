package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: b.l.a.c.e.e.x0 */
public abstract class C2583x0 extends C2583x0<String> implements Iterator {

    /* renamed from: g */
    public T f4420g;

    /* renamed from: h */
    public int f4421h = 2;

    /* renamed from: i */
    public final CharSequence f4422i;

    /* renamed from: j */
    public int f4423j = 0;

    /* renamed from: k */
    public int f4424k;

    public C2583x0(C2440r1 r1Var, CharSequence charSequence) {
        Objects.requireNonNull(r1Var);
        this.f4424k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f4422i = charSequence;
    }

    /* renamed from: b */
    public abstract int mo12413b(int i);

    /* renamed from: c */
    public abstract int mo12414c(int i);

    public final boolean hasNext() {
        int i;
        int i2 = this.f4421h;
        if (i2 != 4) {
            int i3 = i2 - 1;
            T t = null;
            if (i2 == 0) {
                throw null;
            } else if (i3 == 0) {
                return true;
            } else {
                if (i3 != 2) {
                    this.f4421h = 4;
                    int i4 = this.f4423j;
                    while (true) {
                        int i5 = this.f4423j;
                        if (i5 == -1) {
                            this.f4421h = 3;
                            break;
                        }
                        int b = mo12413b(i5);
                        if (b == -1) {
                            b = this.f4422i.length();
                            this.f4423j = -1;
                            i = -1;
                        } else {
                            i = mo12414c(b);
                            this.f4423j = i;
                        }
                        if (i == i4) {
                            int i6 = i + 1;
                            this.f4423j = i6;
                            if (i6 > this.f4422i.length()) {
                                this.f4423j = -1;
                            }
                        } else {
                            if (i4 < b) {
                                this.f4422i.charAt(i4);
                            }
                            if (i4 < b) {
                                this.f4422i.charAt(b - 1);
                            }
                            int i7 = this.f4424k;
                            if (i7 == 1) {
                                b = this.f4422i.length();
                                this.f4423j = -1;
                                if (b > i4) {
                                    this.f4422i.charAt(b - 1);
                                }
                            } else {
                                this.f4424k = i7 - 1;
                            }
                            t = this.f4422i.subSequence(i4, b).toString();
                        }
                    }
                    this.f4420g = t;
                    if (this.f4421h != 3) {
                        this.f4421h = 1;
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f4421h = 2;
            T t = this.f4420g;
            this.f4420g = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
