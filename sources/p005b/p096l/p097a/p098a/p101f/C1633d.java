package p005b.p096l.p097a.p098a.p101f;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p098a.C1583a;

/* renamed from: b.l.a.a.f.d */
public final class C1633d {

    /* renamed from: a */
    public final C1583a f2877a;

    /* renamed from: b */
    public final byte[] f2878b;

    public C1633d(@NonNull C1583a aVar, @NonNull byte[] bArr) {
        Objects.requireNonNull(aVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f2877a = aVar;
        this.f2878b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1633d)) {
            return false;
        }
        C1633d dVar = (C1633d) obj;
        if (!this.f2877a.equals(dVar.f2877a)) {
            return false;
        }
        return Arrays.equals(this.f2878b, dVar.f2878b);
    }

    public int hashCode() {
        return ((this.f2877a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2878b);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("EncodedPayload{encoding=");
        u.append(this.f2877a);
        u.append(", bytes=[...]}");
        return u.toString();
    }
}
