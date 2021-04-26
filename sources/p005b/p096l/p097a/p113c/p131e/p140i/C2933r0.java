package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.r0 */
public enum C2933r0 implements C2925q5 {
    UNKNOWN_COMPARISON_TYPE(0),
    LESS_THAN(1),
    GREATER_THAN(2),
    EQUAL(3),
    BETWEEN(4);
    

    /* renamed from: g */
    public final int f4968g;

    /* access modifiers changed from: public */
    C2933r0(int i) {
        this.f4968g = i;
    }

    /* renamed from: d */
    public static C2933r0 m5123d(int i) {
        if (i == 0) {
            return UNKNOWN_COMPARISON_TYPE;
        }
        if (i == 1) {
            return LESS_THAN;
        }
        if (i == 2) {
            return GREATER_THAN;
        }
        if (i == 3) {
            return EQUAL;
        }
        if (i != 4) {
            return null;
        }
        return BETWEEN;
    }

    public final String toString() {
        return "<" + C2933r0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4968g + " name=" + name() + '>';
    }
}
