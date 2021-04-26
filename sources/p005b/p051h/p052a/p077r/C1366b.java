package p005b.p051h.p052a.p077r;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.p055m.C0974m;

/* renamed from: b.h.a.r.b */
public final class C1366b implements C0974m {

    /* renamed from: b */
    public final Object f1776b;

    public C1366b(@NonNull Object obj) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f1776b = obj;
    }

    /* renamed from: b */
    public void mo10372b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f1776b.toString().getBytes(C0974m.f1018a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1366b) {
            return this.f1776b.equals(((C1366b) obj).f1776b);
        }
        return false;
    }

    public int hashCode() {
        return this.f1776b.hashCode();
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("ObjectKey{object=");
        u.append(this.f1776b);
        u.append('}');
        return u.toString();
    }
}
