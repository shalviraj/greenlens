package p005b.p051h.p052a.p055m;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.h.a.m.o */
public final class C0976o<T> {

    /* renamed from: e */
    public static final C0978b<Object> f1020e = new C0977a();

    /* renamed from: a */
    public final T f1021a;

    /* renamed from: b */
    public final C0978b<T> f1022b;

    /* renamed from: c */
    public final String f1023c;

    /* renamed from: d */
    public volatile byte[] f1024d;

    /* renamed from: b.h.a.m.o$a */
    public class C0977a implements C0978b<Object> {
        /* renamed from: a */
        public void mo10832a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }

    /* renamed from: b.h.a.m.o$b */
    public interface C0978b<T> {
        /* renamed from: a */
        void mo10832a(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    public C0976o(@NonNull String str, @Nullable T t, @NonNull C0978b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f1023c = str;
            this.f1021a = t;
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.f1022b = bVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    @NonNull
    /* renamed from: a */
    public static <T> C0976o<T> m746a(@NonNull String str, @NonNull T t) {
        return new C0976o<>(str, t, f1020e);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0976o) {
            return this.f1023c.equals(((C0976o) obj).f1023c);
        }
        return false;
    }

    public int hashCode() {
        return this.f1023c.hashCode();
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Option{key='");
        u.append(this.f1023c);
        u.append('\'');
        u.append('}');
        return u.toString();
    }
}
