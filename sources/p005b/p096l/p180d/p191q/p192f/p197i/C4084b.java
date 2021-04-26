package p005b.p096l.p180d.p191q.p192f.p197i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;

/* renamed from: b.l.d.q.f.i.b */
public final class C4084b extends C4129v {

    /* renamed from: b */
    public final String f7582b;

    /* renamed from: c */
    public final String f7583c;

    /* renamed from: d */
    public final int f7584d;

    /* renamed from: e */
    public final String f7585e;

    /* renamed from: f */
    public final String f7586f;

    /* renamed from: g */
    public final String f7587g;

    /* renamed from: h */
    public final C4129v.C4134d f7588h;

    /* renamed from: i */
    public final C4129v.C4132c f7589i;

    /* renamed from: b.l.d.q.f.i.b$b */
    public static final class C4086b extends C4129v.C4130a {

        /* renamed from: a */
        public String f7590a;

        /* renamed from: b */
        public String f7591b;

        /* renamed from: c */
        public Integer f7592c;

        /* renamed from: d */
        public String f7593d;

        /* renamed from: e */
        public String f7594e;

        /* renamed from: f */
        public String f7595f;

        /* renamed from: g */
        public C4129v.C4134d f7596g;

        /* renamed from: h */
        public C4129v.C4132c f7597h;

        public C4086b() {
        }

        public C4086b(C4129v vVar, C4085a aVar) {
            C4084b bVar = (C4084b) vVar;
            this.f7590a = bVar.f7582b;
            this.f7591b = bVar.f7583c;
            this.f7592c = Integer.valueOf(bVar.f7584d);
            this.f7593d = bVar.f7585e;
            this.f7594e = bVar.f7586f;
            this.f7595f = bVar.f7587g;
            this.f7596g = bVar.f7588h;
            this.f7597h = bVar.f7589i;
        }

        /* renamed from: a */
        public C4129v mo15594a() {
            String str = this.f7590a == null ? " sdkVersion" : "";
            if (this.f7591b == null) {
                str = C0843a.m451l(str, " gmpAppId");
            }
            if (this.f7592c == null) {
                str = C0843a.m451l(str, " platform");
            }
            if (this.f7593d == null) {
                str = C0843a.m451l(str, " installationUuid");
            }
            if (this.f7594e == null) {
                str = C0843a.m451l(str, " buildVersion");
            }
            if (this.f7595f == null) {
                str = C0843a.m451l(str, " displayVersion");
            }
            if (str.isEmpty()) {
                return new C4084b(this.f7590a, this.f7591b, this.f7592c.intValue(), this.f7593d, this.f7594e, this.f7595f, this.f7596g, this.f7597h, (C4085a) null);
            }
            throw new IllegalStateException(C0843a.m451l("Missing required properties:", str));
        }
    }

    public C4084b(String str, String str2, int i, String str3, String str4, String str5, C4129v.C4134d dVar, C4129v.C4132c cVar, C4085a aVar) {
        this.f7582b = str;
        this.f7583c = str2;
        this.f7584d = i;
        this.f7585e = str3;
        this.f7586f = str4;
        this.f7587g = str5;
        this.f7588h = dVar;
        this.f7589i = cVar;
    }

    @NonNull
    /* renamed from: a */
    public String mo15582a() {
        return this.f7586f;
    }

    @NonNull
    /* renamed from: b */
    public String mo15583b() {
        return this.f7587g;
    }

    @NonNull
    /* renamed from: c */
    public String mo15584c() {
        return this.f7583c;
    }

    @NonNull
    /* renamed from: d */
    public String mo15585d() {
        return this.f7585e;
    }

    @Nullable
    /* renamed from: e */
    public C4129v.C4132c mo15586e() {
        return this.f7589i;
    }

    public boolean equals(Object obj) {
        C4129v.C4134d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4129v)) {
            return false;
        }
        C4129v vVar = (C4129v) obj;
        if (this.f7582b.equals(vVar.mo15589g()) && this.f7583c.equals(vVar.mo15584c()) && this.f7584d == vVar.mo15588f() && this.f7585e.equals(vVar.mo15585d()) && this.f7586f.equals(vVar.mo15582a()) && this.f7587g.equals(vVar.mo15583b()) && ((dVar = this.f7588h) != null ? dVar.equals(vVar.mo15590h()) : vVar.mo15590h() == null)) {
            C4129v.C4132c cVar = this.f7589i;
            C4129v.C4132c e = vVar.mo15586e();
            if (cVar == null) {
                if (e == null) {
                    return true;
                }
            } else if (cVar.equals(e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public int mo15588f() {
        return this.f7584d;
    }

    @NonNull
    /* renamed from: g */
    public String mo15589g() {
        return this.f7582b;
    }

    @Nullable
    /* renamed from: h */
    public C4129v.C4134d mo15590h() {
        return this.f7588h;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f7582b.hashCode() ^ 1000003) * 1000003) ^ this.f7583c.hashCode()) * 1000003) ^ this.f7584d) * 1000003) ^ this.f7585e.hashCode()) * 1000003) ^ this.f7586f.hashCode()) * 1000003) ^ this.f7587g.hashCode()) * 1000003;
        C4129v.C4134d dVar = this.f7588h;
        int i = 0;
        int hashCode2 = (hashCode ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        C4129v.C4132c cVar = this.f7589i;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode2 ^ i;
    }

    /* renamed from: i */
    public C4129v.C4130a mo15592i() {
        return new C4086b(this, (C4085a) null);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("CrashlyticsReport{sdkVersion=");
        u.append(this.f7582b);
        u.append(", gmpAppId=");
        u.append(this.f7583c);
        u.append(", platform=");
        u.append(this.f7584d);
        u.append(", installationUuid=");
        u.append(this.f7585e);
        u.append(", buildVersion=");
        u.append(this.f7586f);
        u.append(", displayVersion=");
        u.append(this.f7587g);
        u.append(", session=");
        u.append(this.f7588h);
        u.append(", ndkPayload=");
        u.append(this.f7589i);
        u.append("}");
        return u.toString();
    }
}
