package p005b.p096l.p232f.p237c0.p238c0.p239f;

import java.util.ArrayList;
import java.util.List;

/* renamed from: b.l.f.c0.c0.f.b */
public final class C4504b {

    /* renamed from: a */
    public final List<C4503a> f8401a;

    /* renamed from: b */
    public final int f8402b;

    /* renamed from: c */
    public final boolean f8403c;

    public C4504b(List<C4503a> list, int i, boolean z) {
        this.f8401a = new ArrayList(list);
        this.f8402b = i;
        this.f8403c = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4504b)) {
            return false;
        }
        C4504b bVar = (C4504b) obj;
        if (!this.f8401a.equals(bVar.f8401a) || this.f8403c != bVar.f8403c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f8401a.hashCode() ^ Boolean.valueOf(this.f8403c).hashCode();
    }

    public String toString() {
        return "{ " + this.f8401a + " }";
    }
}
