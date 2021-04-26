package p005b.p051h.p052a.p055m.p058v;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0983t;

/* renamed from: b.h.a.m.v.o */
public class C1104o implements C0974m {

    /* renamed from: b */
    public final Object f1312b;

    /* renamed from: c */
    public final int f1313c;

    /* renamed from: d */
    public final int f1314d;

    /* renamed from: e */
    public final Class<?> f1315e;

    /* renamed from: f */
    public final Class<?> f1316f;

    /* renamed from: g */
    public final C0974m f1317g;

    /* renamed from: h */
    public final Map<Class<?>, C0983t<?>> f1318h;

    /* renamed from: i */
    public final C0979p f1319i;

    /* renamed from: j */
    public int f1320j;

    public C1104o(Object obj, C0974m mVar, int i, int i2, Map<Class<?>, C0983t<?>> map, Class<?> cls, Class<?> cls2, C0979p pVar) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f1312b = obj;
        Objects.requireNonNull(mVar, "Signature must not be null");
        this.f1317g = mVar;
        this.f1313c = i;
        this.f1314d = i2;
        Objects.requireNonNull(map, "Argument must not be null");
        this.f1318h = map;
        Objects.requireNonNull(cls, "Resource class must not be null");
        this.f1315e = cls;
        Objects.requireNonNull(cls2, "Transcode class must not be null");
        this.f1316f = cls2;
        Objects.requireNonNull(pVar, "Argument must not be null");
        this.f1319i = pVar;
    }

    /* renamed from: b */
    public void mo10372b(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1104o)) {
            return false;
        }
        C1104o oVar = (C1104o) obj;
        return this.f1312b.equals(oVar.f1312b) && this.f1317g.equals(oVar.f1317g) && this.f1314d == oVar.f1314d && this.f1313c == oVar.f1313c && this.f1318h.equals(oVar.f1318h) && this.f1315e.equals(oVar.f1315e) && this.f1316f.equals(oVar.f1316f) && this.f1319i.equals(oVar.f1319i);
    }

    public int hashCode() {
        if (this.f1320j == 0) {
            int hashCode = this.f1312b.hashCode();
            this.f1320j = hashCode;
            int hashCode2 = this.f1317g.hashCode() + (hashCode * 31);
            this.f1320j = hashCode2;
            int i = (hashCode2 * 31) + this.f1313c;
            this.f1320j = i;
            int i2 = (i * 31) + this.f1314d;
            this.f1320j = i2;
            int hashCode3 = this.f1318h.hashCode() + (i2 * 31);
            this.f1320j = hashCode3;
            int hashCode4 = this.f1315e.hashCode() + (hashCode3 * 31);
            this.f1320j = hashCode4;
            int hashCode5 = this.f1316f.hashCode() + (hashCode4 * 31);
            this.f1320j = hashCode5;
            this.f1320j = this.f1319i.hashCode() + (hashCode5 * 31);
        }
        return this.f1320j;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("EngineKey{model=");
        u.append(this.f1312b);
        u.append(", width=");
        u.append(this.f1313c);
        u.append(", height=");
        u.append(this.f1314d);
        u.append(", resourceClass=");
        u.append(this.f1315e);
        u.append(", transcodeClass=");
        u.append(this.f1316f);
        u.append(", signature=");
        u.append(this.f1317g);
        u.append(", hashCode=");
        u.append(this.f1320j);
        u.append(", transformations=");
        u.append(this.f1318h);
        u.append(", options=");
        u.append(this.f1319i);
        u.append('}');
        return u.toString();
    }
}
