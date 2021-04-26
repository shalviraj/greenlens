package p298d.p299a.p300a.p301a.p303y0.p390h;

/* renamed from: d.a.a.a.y0.h.a */
public enum C7145a {
    NO_ARGUMENTS(false, false, 3),
    UNLESS_EMPTY(true, false, 2),
    ALWAYS_PARENTHESIZED(true, true);
    

    /* renamed from: g */
    public final boolean f14292g;

    /* renamed from: h */
    public final boolean f14293h;

    /* access modifiers changed from: public */
    C7145a(boolean z, boolean z2) {
        this.f14292g = z;
        this.f14293h = z2;
    }

    /* access modifiers changed from: public */
    C7145a(boolean z, boolean z2, int i) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        this.f14292g = z;
        this.f14293h = z2;
    }
}
