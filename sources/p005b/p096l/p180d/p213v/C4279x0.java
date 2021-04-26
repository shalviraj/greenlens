package p005b.p096l.p180d.p213v;

import java.security.KeyPair;
import java.util.Arrays;

/* renamed from: b.l.d.v.x0 */
public final class C4279x0 {

    /* renamed from: a */
    public final KeyPair f7928a;

    /* renamed from: b */
    public final long f7929b;

    public C4279x0(KeyPair keyPair, long j) {
        this.f7928a = keyPair;
        this.f7929b = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4279x0)) {
            return false;
        }
        C4279x0 x0Var = (C4279x0) obj;
        return this.f7929b == x0Var.f7929b && this.f7928a.getPublic().equals(x0Var.f7928a.getPublic()) && this.f7928a.getPrivate().equals(x0Var.f7928a.getPrivate());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7928a.getPublic(), this.f7928a.getPrivate(), Long.valueOf(this.f7929b)});
    }
}
