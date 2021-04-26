package p005b.p051h.p052a.p055m.p058v;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.p055m.C0974m;

/* renamed from: b.h.a.m.v.e */
public final class C1066e implements C0974m {

    /* renamed from: b */
    public final C0974m f1164b;

    /* renamed from: c */
    public final C0974m f1165c;

    public C1066e(C0974m mVar, C0974m mVar2) {
        this.f1164b = mVar;
        this.f1165c = mVar2;
    }

    /* renamed from: b */
    public void mo10372b(@NonNull MessageDigest messageDigest) {
        this.f1164b.mo10372b(messageDigest);
        this.f1165c.mo10372b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1066e)) {
            return false;
        }
        C1066e eVar = (C1066e) obj;
        return this.f1164b.equals(eVar.f1164b) && this.f1165c.equals(eVar.f1165c);
    }

    public int hashCode() {
        return this.f1165c.hashCode() + (this.f1164b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("DataCacheKey{sourceKey=");
        u.append(this.f1164b);
        u.append(", signature=");
        u.append(this.f1165c);
        u.append('}');
        return u.toString();
    }
}
