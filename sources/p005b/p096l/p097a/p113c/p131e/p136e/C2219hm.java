package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.NoSuchElementException;

/* renamed from: b.l.a.c.e.e.hm */
public final class C2219hm extends C2244im {

    /* renamed from: g */
    public int f3930g = 0;

    /* renamed from: h */
    public final int f3931h;

    /* renamed from: i */
    public final /* synthetic */ C2317lm f3932i;

    public C2219hm(C2317lm lmVar) {
        this.f3932i = lmVar;
        this.f3931h = lmVar.mo12755l();
    }

    /* renamed from: b */
    public final byte mo12709b() {
        int i = this.f3930g;
        if (i < this.f3931h) {
            this.f3930g = i + 1;
            return this.f3932i.mo12754e(i);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f3930g < this.f3931h;
    }
}
