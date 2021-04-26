package p005b.p096l.p180d.p216x.p218m;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p216x.p218m.C4303c;

@AutoValue
/* renamed from: b.l.d.x.m.d */
public abstract class C4305d {

    /* renamed from: a */
    public static final /* synthetic */ int f7996a = 0;

    @AutoValue.Builder
    /* renamed from: b.l.d.x.m.d$a */
    public static abstract class C4306a {
        @NonNull
        /* renamed from: a */
        public abstract C4305d mo15919a();

        @NonNull
        /* renamed from: b */
        public abstract C4306a mo15920b(@NonNull C4303c.C4304a aVar);
    }

    static {
        Long l = 0L;
        String str = l == null ? " expiresInSecs" : "";
        if (l == null) {
            str = C0843a.m451l(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            l.longValue();
            l.longValue();
            return;
        }
        throw new IllegalStateException(C0843a.m451l("Missing required properties:", str));
    }

    @Nullable
    /* renamed from: a */
    public abstract String mo15908a();

    /* renamed from: b */
    public abstract long mo15909b();

    @Nullable
    /* renamed from: c */
    public abstract String mo15910c();

    @Nullable
    /* renamed from: d */
    public abstract String mo15911d();

    @Nullable
    /* renamed from: e */
    public abstract String mo15912e();

    @NonNull
    /* renamed from: f */
    public abstract C4303c.C4304a mo15914f();

    /* renamed from: g */
    public abstract long mo15915g();

    /* renamed from: h */
    public boolean mo15926h() {
        return mo15914f() == C4303c.C4304a.REGISTER_ERROR;
    }

    /* renamed from: i */
    public boolean mo15927i() {
        C4303c.C4304a aVar = ((C4299a) this).f7972c;
        return aVar == C4303c.C4304a.NOT_GENERATED || aVar == C4303c.C4304a.ATTEMPT_MIGRATION;
    }

    @NonNull
    /* renamed from: j */
    public abstract C4306a mo15917j();
}
