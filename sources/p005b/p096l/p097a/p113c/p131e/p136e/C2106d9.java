package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.d9 */
public enum C2106d9 implements C2121e {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    public final int f3714g;

    /* access modifiers changed from: public */
    C2106d9(int i) {
        this.f3714g = i;
    }

    /* renamed from: a */
    public final int mo12518a() {
        if (this != UNRECOGNIZED) {
            return this.f3714g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(C2106d9.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(mo12518a());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
