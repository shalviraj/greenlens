package p005b.p096l.p180d.p216x.p218m;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p216x.p218m.C4303c;
import p005b.p096l.p180d.p216x.p218m.C4305d;

/* renamed from: b.l.d.x.m.a */
public final class C4299a extends C4305d {

    /* renamed from: b */
    public final String f7971b;

    /* renamed from: c */
    public final C4303c.C4304a f7972c;

    /* renamed from: d */
    public final String f7973d;

    /* renamed from: e */
    public final String f7974e;

    /* renamed from: f */
    public final long f7975f;

    /* renamed from: g */
    public final long f7976g;

    /* renamed from: h */
    public final String f7977h;

    /* renamed from: b.l.d.x.m.a$b */
    public static final class C4301b extends C4305d.C4306a {

        /* renamed from: a */
        public String f7978a;

        /* renamed from: b */
        public C4303c.C4304a f7979b;

        /* renamed from: c */
        public String f7980c;

        /* renamed from: d */
        public String f7981d;

        /* renamed from: e */
        public Long f7982e;

        /* renamed from: f */
        public Long f7983f;

        /* renamed from: g */
        public String f7984g;

        public C4301b() {
        }

        public C4301b(C4305d dVar, C4300a aVar) {
            C4299a aVar2 = (C4299a) dVar;
            this.f7978a = aVar2.f7971b;
            this.f7979b = aVar2.f7972c;
            this.f7980c = aVar2.f7973d;
            this.f7981d = aVar2.f7974e;
            this.f7982e = Long.valueOf(aVar2.f7975f);
            this.f7983f = Long.valueOf(aVar2.f7976g);
            this.f7984g = aVar2.f7977h;
        }

        /* renamed from: a */
        public C4305d mo15919a() {
            String str = this.f7979b == null ? " registrationStatus" : "";
            if (this.f7982e == null) {
                str = C0843a.m451l(str, " expiresInSecs");
            }
            if (this.f7983f == null) {
                str = C0843a.m451l(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new C4299a(this.f7978a, this.f7979b, this.f7980c, this.f7981d, this.f7982e.longValue(), this.f7983f.longValue(), this.f7984g, (C4300a) null);
            }
            throw new IllegalStateException(C0843a.m451l("Missing required properties:", str));
        }

        /* renamed from: b */
        public C4305d.C4306a mo15920b(C4303c.C4304a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f7979b = aVar;
            return this;
        }

        /* renamed from: c */
        public C4305d.C4306a mo15921c(long j) {
            this.f7982e = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C4305d.C4306a mo15922d(long j) {
            this.f7983f = Long.valueOf(j);
            return this;
        }
    }

    public C4299a(String str, C4303c.C4304a aVar, String str2, String str3, long j, long j2, String str4, C4300a aVar2) {
        this.f7971b = str;
        this.f7972c = aVar;
        this.f7973d = str2;
        this.f7974e = str3;
        this.f7975f = j;
        this.f7976g = j2;
        this.f7977h = str4;
    }

    @Nullable
    /* renamed from: a */
    public String mo15908a() {
        return this.f7973d;
    }

    /* renamed from: b */
    public long mo15909b() {
        return this.f7975f;
    }

    @Nullable
    /* renamed from: c */
    public String mo15910c() {
        return this.f7971b;
    }

    @Nullable
    /* renamed from: d */
    public String mo15911d() {
        return this.f7977h;
    }

    @Nullable
    /* renamed from: e */
    public String mo15912e() {
        return this.f7974e;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4305d)) {
            return false;
        }
        C4305d dVar = (C4305d) obj;
        String str3 = this.f7971b;
        if (str3 != null ? str3.equals(dVar.mo15910c()) : dVar.mo15910c() == null) {
            if (this.f7972c.equals(dVar.mo15914f()) && ((str = this.f7973d) != null ? str.equals(dVar.mo15908a()) : dVar.mo15908a() == null) && ((str2 = this.f7974e) != null ? str2.equals(dVar.mo15912e()) : dVar.mo15912e() == null) && this.f7975f == dVar.mo15909b() && this.f7976g == dVar.mo15915g()) {
                String str4 = this.f7977h;
                String d = dVar.mo15911d();
                if (str4 == null) {
                    if (d == null) {
                        return true;
                    }
                } else if (str4.equals(d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public C4303c.C4304a mo15914f() {
        return this.f7972c;
    }

    /* renamed from: g */
    public long mo15915g() {
        return this.f7976g;
    }

    public int hashCode() {
        String str = this.f7971b;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f7972c.hashCode()) * 1000003;
        String str2 = this.f7973d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f7974e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f7975f;
        long j2 = this.f7976g;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f7977h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    /* renamed from: j */
    public C4305d.C4306a mo15917j() {
        return new C4301b(this, (C4300a) null);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("PersistedInstallationEntry{firebaseInstallationId=");
        u.append(this.f7971b);
        u.append(", registrationStatus=");
        u.append(this.f7972c);
        u.append(", authToken=");
        u.append(this.f7973d);
        u.append(", refreshToken=");
        u.append(this.f7974e);
        u.append(", expiresInSecs=");
        u.append(this.f7975f);
        u.append(", tokenCreationEpochInSecs=");
        u.append(this.f7976g);
        u.append(", fisError=");
        return C0843a.m455p(u, this.f7977h, "}");
    }
}
