package p005b.p051h.p052a.p055m;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.security.MessageDigest;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.p055m.C0976o;
import p005b.p051h.p052a.p078s.C1370b;

/* renamed from: b.h.a.m.p */
public final class C0979p implements C0974m {

    /* renamed from: b */
    public final ArrayMap<C0976o<?>, Object> f1025b = new C1370b();

    /* renamed from: b */
    public void mo10372b(@NonNull MessageDigest messageDigest) {
        for (int i = 0; i < this.f1025b.size(); i++) {
            C0976o keyAt = this.f1025b.keyAt(i);
            Object valueAt = this.f1025b.valueAt(i);
            C0976o.C0978b<T> bVar = keyAt.f1022b;
            if (keyAt.f1024d == null) {
                keyAt.f1024d = keyAt.f1023c.getBytes(C0974m.f1018a);
            }
            bVar.mo10832a(keyAt.f1024d, valueAt, messageDigest);
        }
    }

    @Nullable
    /* renamed from: c */
    public <T> T mo10833c(@NonNull C0976o<T> oVar) {
        return this.f1025b.containsKey(oVar) ? this.f1025b.get(oVar) : oVar.f1021a;
    }

    /* renamed from: d */
    public void mo10834d(@NonNull C0979p pVar) {
        this.f1025b.putAll(pVar.f1025b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0979p) {
            return this.f1025b.equals(((C0979p) obj).f1025b);
        }
        return false;
    }

    public int hashCode() {
        return this.f1025b.hashCode();
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Options{values=");
        u.append(this.f1025b);
        u.append('}');
        return u.toString();
    }
}
