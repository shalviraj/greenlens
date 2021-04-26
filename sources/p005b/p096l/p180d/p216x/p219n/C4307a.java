package p005b.p096l.p180d.p216x.p219n;

import androidx.annotation.Nullable;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p216x.p219n.C4313d;

/* renamed from: b.l.d.x.n.a */
public final class C4307a extends C4313d {

    /* renamed from: a */
    public final String f7997a;

    /* renamed from: b */
    public final String f7998b;

    /* renamed from: c */
    public final String f7999c;

    /* renamed from: d */
    public final C4316f f8000d;

    /* renamed from: e */
    public final C4313d.C4314a f8001e;

    public C4307a(String str, String str2, String str3, C4316f fVar, C4313d.C4314a aVar, C4308a aVar2) {
        this.f7997a = str;
        this.f7998b = str2;
        this.f7999c = str3;
        this.f8000d = fVar;
        this.f8001e = aVar;
    }

    @Nullable
    /* renamed from: a */
    public C4316f mo15928a() {
        return this.f8000d;
    }

    @Nullable
    /* renamed from: b */
    public String mo15929b() {
        return this.f7998b;
    }

    @Nullable
    /* renamed from: c */
    public String mo15930c() {
        return this.f7999c;
    }

    @Nullable
    /* renamed from: d */
    public C4313d.C4314a mo15931d() {
        return this.f8001e;
    }

    @Nullable
    /* renamed from: e */
    public String mo15932e() {
        return this.f7997a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4313d)) {
            return false;
        }
        C4313d dVar = (C4313d) obj;
        String str = this.f7997a;
        if (str != null ? str.equals(dVar.mo15932e()) : dVar.mo15932e() == null) {
            String str2 = this.f7998b;
            if (str2 != null ? str2.equals(dVar.mo15929b()) : dVar.mo15929b() == null) {
                String str3 = this.f7999c;
                if (str3 != null ? str3.equals(dVar.mo15930c()) : dVar.mo15930c() == null) {
                    C4316f fVar = this.f8000d;
                    if (fVar != null ? fVar.equals(dVar.mo15928a()) : dVar.mo15928a() == null) {
                        C4313d.C4314a aVar = this.f8001e;
                        C4313d.C4314a d = dVar.mo15931d();
                        if (aVar == null) {
                            if (d == null) {
                                return true;
                            }
                        } else if (aVar.equals(d)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f7997a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f7998b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f7999c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C4316f fVar = this.f8000d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        C4313d.C4314a aVar = this.f8001e;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("InstallationResponse{uri=");
        u.append(this.f7997a);
        u.append(", fid=");
        u.append(this.f7998b);
        u.append(", refreshToken=");
        u.append(this.f7999c);
        u.append(", authToken=");
        u.append(this.f8000d);
        u.append(", responseCode=");
        u.append(this.f8001e);
        u.append("}");
        return u.toString();
    }
}
