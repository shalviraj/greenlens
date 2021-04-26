package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.k8 */
public enum C2279k8 implements C2121e {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    public final int f4011g;

    /* access modifiers changed from: public */
    C2279k8(int i) {
        this.f4011g = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(C2279k8.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        C2279k8 k8Var = UNRECOGNIZED;
        if (this != k8Var) {
            sb.append(" number=");
            if (this != k8Var) {
                sb.append(this.f4011g);
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
