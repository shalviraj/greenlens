package p005b.p096l.p097a.p098a.p099e.p100e;

import androidx.annotation.Nullable;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.a.e.e.g */
public final class C1609g extends C1619m {

    /* renamed from: a */
    public final long f2780a;

    /* renamed from: b */
    public final long f2781b;

    /* renamed from: c */
    public final C1615k f2782c;

    /* renamed from: d */
    public final Integer f2783d;

    /* renamed from: e */
    public final String f2784e;

    /* renamed from: f */
    public final List<C1617l> f2785f;

    /* renamed from: g */
    public final C1624p f2786g;

    public C1609g(long j, long j2, C1615k kVar, Integer num, String str, List list, C1624p pVar, C1610a aVar) {
        this.f2780a = j;
        this.f2781b = j2;
        this.f2782c = kVar;
        this.f2783d = num;
        this.f2784e = str;
        this.f2785f = list;
        this.f2786g = pVar;
    }

    @Nullable
    /* renamed from: a */
    public C1615k mo11774a() {
        return this.f2782c;
    }

    @Nullable
    /* renamed from: b */
    public List<C1617l> mo11775b() {
        return this.f2785f;
    }

    @Nullable
    /* renamed from: c */
    public Integer mo11776c() {
        return this.f2783d;
    }

    @Nullable
    /* renamed from: d */
    public String mo11777d() {
        return this.f2784e;
    }

    @Nullable
    /* renamed from: e */
    public C1624p mo11778e() {
        return this.f2786g;
    }

    public boolean equals(Object obj) {
        C1615k kVar;
        Integer num;
        String str;
        List<C1617l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1619m)) {
            return false;
        }
        C1619m mVar = (C1619m) obj;
        if (this.f2780a == mVar.mo11780f() && this.f2781b == mVar.mo11781g() && ((kVar = this.f2782c) != null ? kVar.equals(mVar.mo11774a()) : mVar.mo11774a() == null) && ((num = this.f2783d) != null ? num.equals(mVar.mo11776c()) : mVar.mo11776c() == null) && ((str = this.f2784e) != null ? str.equals(mVar.mo11777d()) : mVar.mo11777d() == null) && ((list = this.f2785f) != null ? list.equals(mVar.mo11775b()) : mVar.mo11775b() == null)) {
            C1624p pVar = this.f2786g;
            C1624p e = mVar.mo11778e();
            if (pVar == null) {
                if (e == null) {
                    return true;
                }
            } else if (pVar.equals(e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public long mo11780f() {
        return this.f2780a;
    }

    /* renamed from: g */
    public long mo11781g() {
        return this.f2781b;
    }

    public int hashCode() {
        long j = this.f2780a;
        long j2 = this.f2781b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        C1615k kVar = this.f2782c;
        int i2 = 0;
        int hashCode = (i ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f2783d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f2784e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<C1617l> list = this.f2785f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        C1624p pVar = this.f2786g;
        if (pVar != null) {
            i2 = pVar.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("LogRequest{requestTimeMs=");
        u.append(this.f2780a);
        u.append(", requestUptimeMs=");
        u.append(this.f2781b);
        u.append(", clientInfo=");
        u.append(this.f2782c);
        u.append(", logSource=");
        u.append(this.f2783d);
        u.append(", logSourceName=");
        u.append(this.f2784e);
        u.append(", logEvents=");
        u.append(this.f2785f);
        u.append(", qosTier=");
        u.append(this.f2786g);
        u.append("}");
        return u.toString();
    }
}
