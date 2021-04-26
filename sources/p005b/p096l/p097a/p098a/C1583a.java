package p005b.p096l.p097a.p098a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.a.a */
public final class C1583a {

    /* renamed from: a */
    public final String f2687a;

    public C1583a(@NonNull String str) {
        Objects.requireNonNull(str, "name is null");
        this.f2687a = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1583a)) {
            return false;
        }
        return this.f2687a.equals(((C1583a) obj).f2687a);
    }

    public int hashCode() {
        return this.f2687a.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return C0843a.m455p(C0843a.m460u("Encoding{name=\""), this.f2687a, "\"}");
    }
}
