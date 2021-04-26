package p005b.p096l.p180d.p191q.p192f.p197i;

import androidx.annotation.NonNull;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;

/* renamed from: b.l.d.q.f.i.t */
public final class C4125t extends C4129v.C4134d.C4153e {

    /* renamed from: a */
    public final int f7706a;

    /* renamed from: b */
    public final String f7707b;

    /* renamed from: c */
    public final String f7708c;

    /* renamed from: d */
    public final boolean f7709d;

    public C4125t(int i, String str, String str2, boolean z, C4126a aVar) {
        this.f7706a = i;
        this.f7707b = str;
        this.f7708c = str2;
        this.f7709d = z;
    }

    @NonNull
    /* renamed from: a */
    public String mo15728a() {
        return this.f7708c;
    }

    /* renamed from: b */
    public int mo15729b() {
        return this.f7706a;
    }

    @NonNull
    /* renamed from: c */
    public String mo15730c() {
        return this.f7707b;
    }

    /* renamed from: d */
    public boolean mo15731d() {
        return this.f7709d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4129v.C4134d.C4153e)) {
            return false;
        }
        C4129v.C4134d.C4153e eVar = (C4129v.C4134d.C4153e) obj;
        return this.f7706a == eVar.mo15729b() && this.f7707b.equals(eVar.mo15730c()) && this.f7708c.equals(eVar.mo15728a()) && this.f7709d == eVar.mo15731d();
    }

    public int hashCode() {
        return ((((((this.f7706a ^ 1000003) * 1000003) ^ this.f7707b.hashCode()) * 1000003) ^ this.f7708c.hashCode()) * 1000003) ^ (this.f7709d ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("OperatingSystem{platform=");
        u.append(this.f7706a);
        u.append(", version=");
        u.append(this.f7707b);
        u.append(", buildVersion=");
        u.append(this.f7708c);
        u.append(", jailbroken=");
        u.append(this.f7709d);
        u.append("}");
        return u.toString();
    }
}
