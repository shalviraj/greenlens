package p005b.p096l.p180d.p191q.p192f.p197i;

import androidx.annotation.Nullable;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;

/* renamed from: b.l.d.q.f.i.r */
public final class C4120r extends C4129v.C4134d.C4140d.C4150b {

    /* renamed from: a */
    public final Double f7693a;

    /* renamed from: b */
    public final int f7694b;

    /* renamed from: c */
    public final boolean f7695c;

    /* renamed from: d */
    public final int f7696d;

    /* renamed from: e */
    public final long f7697e;

    /* renamed from: f */
    public final long f7698f;

    /* renamed from: b.l.d.q.f.i.r$b */
    public static final class C4122b extends C4129v.C4134d.C4140d.C4150b.C4151a {

        /* renamed from: a */
        public Double f7699a;

        /* renamed from: b */
        public Integer f7700b;

        /* renamed from: c */
        public Boolean f7701c;

        /* renamed from: d */
        public Integer f7702d;

        /* renamed from: e */
        public Long f7703e;

        /* renamed from: f */
        public Long f7704f;

        /* renamed from: a */
        public C4129v.C4134d.C4140d.C4150b mo15723a() {
            String str = this.f7700b == null ? " batteryVelocity" : "";
            if (this.f7701c == null) {
                str = C0843a.m451l(str, " proximityOn");
            }
            if (this.f7702d == null) {
                str = C0843a.m451l(str, " orientation");
            }
            if (this.f7703e == null) {
                str = C0843a.m451l(str, " ramUsed");
            }
            if (this.f7704f == null) {
                str = C0843a.m451l(str, " diskUsed");
            }
            if (str.isEmpty()) {
                return new C4120r(this.f7699a, this.f7700b.intValue(), this.f7701c.booleanValue(), this.f7702d.intValue(), this.f7703e.longValue(), this.f7704f.longValue(), (C4121a) null);
            }
            throw new IllegalStateException(C0843a.m451l("Missing required properties:", str));
        }
    }

    public C4120r(Double d, int i, boolean z, int i2, long j, long j2, C4121a aVar) {
        this.f7693a = d;
        this.f7694b = i;
        this.f7695c = z;
        this.f7696d = i2;
        this.f7697e = j;
        this.f7698f = j2;
    }

    @Nullable
    /* renamed from: a */
    public Double mo15714a() {
        return this.f7693a;
    }

    /* renamed from: b */
    public int mo15715b() {
        return this.f7694b;
    }

    /* renamed from: c */
    public long mo15716c() {
        return this.f7698f;
    }

    /* renamed from: d */
    public int mo15717d() {
        return this.f7696d;
    }

    /* renamed from: e */
    public long mo15718e() {
        return this.f7697e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4129v.C4134d.C4140d.C4150b)) {
            return false;
        }
        C4129v.C4134d.C4140d.C4150b bVar = (C4129v.C4134d.C4140d.C4150b) obj;
        Double d = this.f7693a;
        if (d != null ? d.equals(bVar.mo15714a()) : bVar.mo15714a() == null) {
            if (this.f7694b == bVar.mo15715b() && this.f7695c == bVar.mo15720f() && this.f7696d == bVar.mo15717d() && this.f7697e == bVar.mo15718e() && this.f7698f == bVar.mo15716c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo15720f() {
        return this.f7695c;
    }

    public int hashCode() {
        Double d = this.f7693a;
        int hashCode = ((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f7694b) * 1000003;
        int i = this.f7695c ? 1231 : 1237;
        long j = this.f7697e;
        long j2 = this.f7698f;
        return ((((((hashCode ^ i) * 1000003) ^ this.f7696d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Device{batteryLevel=");
        u.append(this.f7693a);
        u.append(", batteryVelocity=");
        u.append(this.f7694b);
        u.append(", proximityOn=");
        u.append(this.f7695c);
        u.append(", orientation=");
        u.append(this.f7696d);
        u.append(", ramUsed=");
        u.append(this.f7697e);
        u.append(", diskUsed=");
        u.append(this.f7698f);
        u.append("}");
        return u.toString();
    }
}
