package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.b9 */
public enum C2056b9 implements C2121e {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    public final int f3633g;

    /* access modifiers changed from: public */
    C2056b9(int i) {
        this.f3633g = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(C2056b9.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        C2056b9 b9Var = UNRECOGNIZED;
        if (this != b9Var) {
            sb.append(" number=");
            if (this != b9Var) {
                sb.append(this.f3633g);
            } else {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
