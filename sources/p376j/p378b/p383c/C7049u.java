package p376j.p378b.p383c;

import java.util.Arrays;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: j.b.c.u */
public final class C7049u {

    /* renamed from: b */
    public static final C7049u f14150b = new C7049u((byte) 0);

    /* renamed from: a */
    public final byte f14151a;

    public C7049u(byte b) {
        this.f14151a = b;
    }

    /* renamed from: a */
    public boolean mo24456a() {
        return (this.f14151a & 1) != 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7049u)) {
            return false;
        }
        return this.f14151a == ((C7049u) obj).f14151a;
    }

    public int hashCode() {
        return Arrays.hashCode(new byte[]{this.f14151a});
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("TraceOptions{sampled=");
        u.append(mo24456a());
        u.append("}");
        return u.toString();
    }
}
