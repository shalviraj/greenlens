package p005b.p082j.p083a.p084a.p087q;

import java.io.Serializable;
import p005b.p082j.p083a.p084a.C1528m;

/* renamed from: b.j.a.a.q.h */
public class C1543h implements C1528m, Serializable {

    /* renamed from: i */
    public static final C1539d f2471i = C1539d.f2460a;

    /* renamed from: g */
    public final String f2472g;

    /* renamed from: h */
    public byte[] f2473h;

    public C1543h(String str) {
        this.f2472g = str;
    }

    /* renamed from: a */
    public final byte[] mo11553a() {
        byte[] bArr = this.f2473h;
        if (bArr != null) {
            return bArr;
        }
        byte[] b = f2471i.mo11542b(this.f2472g);
        this.f2473h = b;
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C1543h.class) {
            return false;
        }
        return this.f2472g.equals(((C1543h) obj).f2472g);
    }

    public final int hashCode() {
        return this.f2472g.hashCode();
    }

    public final String toString() {
        return this.f2472g;
    }
}
