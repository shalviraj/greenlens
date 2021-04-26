package p005b.p096l.p180d.p191q.p192f.p197i;

import androidx.annotation.NonNull;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;

/* renamed from: b.l.d.q.f.i.i */
public final class C4099i extends C4129v.C4134d.C4138c {

    /* renamed from: a */
    public final int f7633a;

    /* renamed from: b */
    public final String f7634b;

    /* renamed from: c */
    public final int f7635c;

    /* renamed from: d */
    public final long f7636d;

    /* renamed from: e */
    public final long f7637e;

    /* renamed from: f */
    public final boolean f7638f;

    /* renamed from: g */
    public final int f7639g;

    /* renamed from: h */
    public final String f7640h;

    /* renamed from: i */
    public final String f7641i;

    /* renamed from: b.l.d.q.f.i.i$b */
    public static final class C4101b extends C4129v.C4134d.C4138c.C4139a {

        /* renamed from: a */
        public Integer f7642a;

        /* renamed from: b */
        public String f7643b;

        /* renamed from: c */
        public Integer f7644c;

        /* renamed from: d */
        public Long f7645d;

        /* renamed from: e */
        public Long f7646e;

        /* renamed from: f */
        public Boolean f7647f;

        /* renamed from: g */
        public Integer f7648g;

        /* renamed from: h */
        public String f7649h;

        /* renamed from: i */
        public String f7650i;

        /* renamed from: a */
        public C4129v.C4134d.C4138c mo15653a() {
            String str = this.f7642a == null ? " arch" : "";
            if (this.f7643b == null) {
                str = C0843a.m451l(str, " model");
            }
            if (this.f7644c == null) {
                str = C0843a.m451l(str, " cores");
            }
            if (this.f7645d == null) {
                str = C0843a.m451l(str, " ram");
            }
            if (this.f7646e == null) {
                str = C0843a.m451l(str, " diskSpace");
            }
            if (this.f7647f == null) {
                str = C0843a.m451l(str, " simulator");
            }
            if (this.f7648g == null) {
                str = C0843a.m451l(str, " state");
            }
            if (this.f7649h == null) {
                str = C0843a.m451l(str, " manufacturer");
            }
            if (this.f7650i == null) {
                str = C0843a.m451l(str, " modelClass");
            }
            if (str.isEmpty()) {
                return new C4099i(this.f7642a.intValue(), this.f7643b, this.f7644c.intValue(), this.f7645d.longValue(), this.f7646e.longValue(), this.f7647f.booleanValue(), this.f7648g.intValue(), this.f7649h, this.f7650i, (C4100a) null);
            }
            throw new IllegalStateException(C0843a.m451l("Missing required properties:", str));
        }
    }

    public C4099i(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3, C4100a aVar) {
        this.f7633a = i;
        this.f7634b = str;
        this.f7635c = i2;
        this.f7636d = j;
        this.f7637e = j2;
        this.f7638f = z;
        this.f7639g = i3;
        this.f7640h = str2;
        this.f7641i = str3;
    }

    @NonNull
    /* renamed from: a */
    public int mo15641a() {
        return this.f7633a;
    }

    /* renamed from: b */
    public int mo15642b() {
        return this.f7635c;
    }

    /* renamed from: c */
    public long mo15643c() {
        return this.f7637e;
    }

    @NonNull
    /* renamed from: d */
    public String mo15644d() {
        return this.f7640h;
    }

    @NonNull
    /* renamed from: e */
    public String mo15645e() {
        return this.f7634b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4129v.C4134d.C4138c)) {
            return false;
        }
        C4129v.C4134d.C4138c cVar = (C4129v.C4134d.C4138c) obj;
        return this.f7633a == cVar.mo15641a() && this.f7634b.equals(cVar.mo15645e()) && this.f7635c == cVar.mo15642b() && this.f7636d == cVar.mo15648g() && this.f7637e == cVar.mo15643c() && this.f7638f == cVar.mo15651i() && this.f7639g == cVar.mo15649h() && this.f7640h.equals(cVar.mo15644d()) && this.f7641i.equals(cVar.mo15647f());
    }

    @NonNull
    /* renamed from: f */
    public String mo15647f() {
        return this.f7641i;
    }

    /* renamed from: g */
    public long mo15648g() {
        return this.f7636d;
    }

    /* renamed from: h */
    public int mo15649h() {
        return this.f7639g;
    }

    public int hashCode() {
        long j = this.f7636d;
        long j2 = this.f7637e;
        return ((((((((((((((((this.f7633a ^ 1000003) * 1000003) ^ this.f7634b.hashCode()) * 1000003) ^ this.f7635c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f7638f ? 1231 : 1237)) * 1000003) ^ this.f7639g) * 1000003) ^ this.f7640h.hashCode()) * 1000003) ^ this.f7641i.hashCode();
    }

    /* renamed from: i */
    public boolean mo15651i() {
        return this.f7638f;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Device{arch=");
        u.append(this.f7633a);
        u.append(", model=");
        u.append(this.f7634b);
        u.append(", cores=");
        u.append(this.f7635c);
        u.append(", ram=");
        u.append(this.f7636d);
        u.append(", diskSpace=");
        u.append(this.f7637e);
        u.append(", simulator=");
        u.append(this.f7638f);
        u.append(", state=");
        u.append(this.f7639g);
        u.append(", manufacturer=");
        u.append(this.f7640h);
        u.append(", modelClass=");
        return C0843a.m455p(u, this.f7641i, "}");
    }
}
