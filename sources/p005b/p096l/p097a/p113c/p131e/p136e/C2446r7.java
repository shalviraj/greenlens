package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.r7 */
public enum C2446r7 implements C2121e {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    public final int f4258g;

    /* access modifiers changed from: public */
    C2446r7(int i) {
        this.f4258g = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(C2446r7.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        C2446r7 r7Var = UNRECOGNIZED;
        if (this != r7Var) {
            sb.append(" number=");
            if (this != r7Var) {
                sb.append(this.f4258g);
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
