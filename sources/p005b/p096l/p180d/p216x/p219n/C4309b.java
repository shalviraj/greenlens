package p005b.p096l.p180d.p216x.p219n;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p216x.p219n.C4316f;

/* renamed from: b.l.d.x.n.b */
public final class C4309b extends C4316f {

    /* renamed from: a */
    public final String f8002a;

    /* renamed from: b */
    public final long f8003b;

    /* renamed from: c */
    public final C4316f.C4318b f8004c;

    /* renamed from: b.l.d.x.n.b$b */
    public static final class C4311b extends C4316f.C4317a {

        /* renamed from: a */
        public String f8005a;

        /* renamed from: b */
        public Long f8006b;

        /* renamed from: c */
        public C4316f.C4318b f8007c;

        /* renamed from: a */
        public C4316f mo15942a() {
            String str = this.f8006b == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new C4309b(this.f8005a, this.f8006b.longValue(), this.f8007c, (C4310a) null);
            }
            throw new IllegalStateException(C0843a.m451l("Missing required properties:", str));
        }

        /* renamed from: b */
        public C4316f.C4317a mo15943b(long j) {
            this.f8006b = Long.valueOf(j);
            return this;
        }
    }

    public C4309b(String str, long j, C4316f.C4318b bVar, C4310a aVar) {
        this.f8002a = str;
        this.f8003b = j;
        this.f8004c = bVar;
    }

    @Nullable
    /* renamed from: b */
    public C4316f.C4318b mo15936b() {
        return this.f8004c;
    }

    @Nullable
    /* renamed from: c */
    public String mo15937c() {
        return this.f8002a;
    }

    @NonNull
    /* renamed from: d */
    public long mo15938d() {
        return this.f8003b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4316f)) {
            return false;
        }
        C4316f fVar = (C4316f) obj;
        String str = this.f8002a;
        if (str != null ? str.equals(fVar.mo15937c()) : fVar.mo15937c() == null) {
            if (this.f8003b == fVar.mo15938d()) {
                C4316f.C4318b bVar = this.f8004c;
                C4316f.C4318b b = fVar.mo15936b();
                if (bVar == null) {
                    if (b == null) {
                        return true;
                    }
                } else if (bVar.equals(b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f8002a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f8003b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        C4316f.C4318b bVar = this.f8004c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("TokenResult{token=");
        u.append(this.f8002a);
        u.append(", tokenExpirationTimestamp=");
        u.append(this.f8003b);
        u.append(", responseCode=");
        u.append(this.f8004c);
        u.append("}");
        return u.toString();
    }
}
