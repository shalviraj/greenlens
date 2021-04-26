package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.NoSuchElementException;

/* renamed from: b.l.a.c.e.i.n4 */
public final class C2885n4 extends C2898o4 {

    /* renamed from: g */
    public int f4902g = 0;

    /* renamed from: h */
    public final int f4903h;

    /* renamed from: i */
    public final /* synthetic */ C2937r4 f4904i;

    public C2885n4(C2937r4 r4Var) {
        this.f4904i = r4Var;
        this.f4903h = r4Var.mo13567l();
    }

    /* renamed from: b */
    public final byte mo13517b() {
        int i = this.f4902g;
        if (i < this.f4903h) {
            this.f4902g = i + 1;
            return this.f4904i.mo13566e(i);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f4902g < this.f4903h;
    }
}
