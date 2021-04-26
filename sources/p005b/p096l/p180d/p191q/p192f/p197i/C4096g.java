package p005b.p096l.p180d.p191q.p192f.p197i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;

/* renamed from: b.l.d.q.f.i.g */
public final class C4096g extends C4129v.C4134d.C4135a {

    /* renamed from: a */
    public final String f7626a;

    /* renamed from: b */
    public final String f7627b;

    /* renamed from: c */
    public final String f7628c;

    /* renamed from: d */
    public final C4129v.C4134d.C4135a.C4136a f7629d = null;

    /* renamed from: e */
    public final String f7630e;

    /* renamed from: f */
    public final String f7631f;

    /* renamed from: g */
    public final String f7632g;

    public C4096g(String str, String str2, String str3, C4129v.C4134d.C4135a.C4136a aVar, String str4, String str5, String str6, C4097a aVar2) {
        this.f7626a = str;
        this.f7627b = str2;
        this.f7628c = str3;
        this.f7630e = str4;
        this.f7631f = str5;
        this.f7632g = str6;
    }

    @Nullable
    /* renamed from: a */
    public String mo15627a() {
        return this.f7631f;
    }

    @Nullable
    /* renamed from: b */
    public String mo15628b() {
        return this.f7632g;
    }

    @Nullable
    /* renamed from: c */
    public String mo15629c() {
        return this.f7628c;
    }

    @NonNull
    /* renamed from: d */
    public String mo15630d() {
        return this.f7626a;
    }

    @Nullable
    /* renamed from: e */
    public String mo15631e() {
        return this.f7630e;
    }

    public boolean equals(Object obj) {
        String str;
        C4129v.C4134d.C4135a.C4136a aVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4129v.C4134d.C4135a)) {
            return false;
        }
        C4129v.C4134d.C4135a aVar2 = (C4129v.C4134d.C4135a) obj;
        if (this.f7626a.equals(aVar2.mo15630d()) && this.f7627b.equals(aVar2.mo15634g()) && ((str = this.f7628c) != null ? str.equals(aVar2.mo15629c()) : aVar2.mo15629c() == null) && ((aVar = this.f7629d) != null ? aVar.equals(aVar2.mo15633f()) : aVar2.mo15633f() == null) && ((str2 = this.f7630e) != null ? str2.equals(aVar2.mo15631e()) : aVar2.mo15631e() == null) && ((str3 = this.f7631f) != null ? str3.equals(aVar2.mo15627a()) : aVar2.mo15627a() == null)) {
            String str4 = this.f7632g;
            String b = aVar2.mo15628b();
            if (str4 == null) {
                if (b == null) {
                    return true;
                }
            } else if (str4.equals(b)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public C4129v.C4134d.C4135a.C4136a mo15633f() {
        return this.f7629d;
    }

    @NonNull
    /* renamed from: g */
    public String mo15634g() {
        return this.f7627b;
    }

    public int hashCode() {
        int hashCode = (((this.f7626a.hashCode() ^ 1000003) * 1000003) ^ this.f7627b.hashCode()) * 1000003;
        String str = this.f7628c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        C4129v.C4134d.C4135a.C4136a aVar = this.f7629d;
        int hashCode3 = (hashCode2 ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003;
        String str2 = this.f7630e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f7631f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f7632g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 ^ i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Application{identifier=");
        u.append(this.f7626a);
        u.append(", version=");
        u.append(this.f7627b);
        u.append(", displayVersion=");
        u.append(this.f7628c);
        u.append(", organization=");
        u.append(this.f7629d);
        u.append(", installationUuid=");
        u.append(this.f7630e);
        u.append(", developmentPlatform=");
        u.append(this.f7631f);
        u.append(", developmentPlatformVersion=");
        return C0843a.m455p(u, this.f7632g, "}");
    }
}
