package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.x0 */
public enum C3011x0 implements C2925q5 {
    UNKNOWN_MATCH_TYPE(0),
    REGEXP(1),
    BEGINS_WITH(2),
    ENDS_WITH(3),
    PARTIAL(4),
    EXACT(5),
    IN_LIST(6);
    

    /* renamed from: g */
    public final int f5133g;

    /* access modifiers changed from: public */
    C3011x0(int i) {
        this.f5133g = i;
    }

    /* renamed from: d */
    public static C3011x0 m5556d(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_MATCH_TYPE;
            case 1:
                return REGEXP;
            case 2:
                return BEGINS_WITH;
            case 3:
                return ENDS_WITH;
            case 4:
                return PARTIAL;
            case 5:
                return EXACT;
            case 6:
                return IN_LIST;
            default:
                return null;
        }
    }

    public final String toString() {
        return "<" + C3011x0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f5133g + " name=" + name() + '>';
    }
}
