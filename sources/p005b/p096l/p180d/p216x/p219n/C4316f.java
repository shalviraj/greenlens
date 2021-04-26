package p005b.p096l.p180d.p216x.p219n;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import p005b.p096l.p180d.p216x.p219n.C4309b;

@AutoValue
/* renamed from: b.l.d.x.n.f */
public abstract class C4316f {

    @AutoValue.Builder
    /* renamed from: b.l.d.x.n.f$a */
    public static abstract class C4317a {
        @NonNull
        /* renamed from: a */
        public abstract C4316f mo15942a();

        @NonNull
        /* renamed from: b */
        public abstract C4317a mo15943b(long j);
    }

    /* renamed from: b.l.d.x.n.f$b */
    public enum C4318b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @NonNull
    /* renamed from: a */
    public static C4317a m7925a() {
        C4309b.C4311b bVar = new C4309b.C4311b();
        bVar.mo15943b(0);
        return bVar;
    }

    @Nullable
    /* renamed from: b */
    public abstract C4318b mo15936b();

    @Nullable
    /* renamed from: c */
    public abstract String mo15937c();

    @NonNull
    /* renamed from: d */
    public abstract long mo15938d();
}
