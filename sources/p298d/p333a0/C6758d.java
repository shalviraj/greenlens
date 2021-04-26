package p298d.p333a0;

/* renamed from: d.a0.d */
public final class C6758d extends C6756b implements C6755a<Integer> {

    /* renamed from: j */
    public static final C6758d f13665j = new C6758d(1, 0);

    /* renamed from: k */
    public static final C6758d f13666k = null;

    public C6758d(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: e */
    public Integer getEndInclusive() {
        return Integer.valueOf(this.f13659h);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6758d) {
            if (!isEmpty() || !((C6758d) obj).isEmpty()) {
                C6758d dVar = (C6758d) obj;
                if (!(this.f13658g == dVar.f13658g && this.f13659h == dVar.f13659h)) {
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
        return (this.f13658g * 31) + this.f13659h;
    }

    public boolean isEmpty() {
        return this.f13658g > this.f13659h;
    }

    /* renamed from: l */
    public Integer getStart() {
        return Integer.valueOf(this.f13658g);
    }

    public String toString() {
        return this.f13658g + ".." + this.f13659h;
    }
}
