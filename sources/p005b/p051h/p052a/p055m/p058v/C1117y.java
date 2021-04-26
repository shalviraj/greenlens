package p005b.p051h.p052a.p055m.p058v;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0983t;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1023b;
import p005b.p051h.p052a.p078s.C1377g;
import p005b.p051h.p052a.p078s.C1380j;

/* renamed from: b.h.a.m.v.y */
public final class C1117y implements C0974m {

    /* renamed from: j */
    public static final C1377g<Class<?>, byte[]> f1356j = new C1377g<>(50);

    /* renamed from: b */
    public final C1023b f1357b;

    /* renamed from: c */
    public final C0974m f1358c;

    /* renamed from: d */
    public final C0974m f1359d;

    /* renamed from: e */
    public final int f1360e;

    /* renamed from: f */
    public final int f1361f;

    /* renamed from: g */
    public final Class<?> f1362g;

    /* renamed from: h */
    public final C0979p f1363h;

    /* renamed from: i */
    public final C0983t<?> f1364i;

    public C1117y(C1023b bVar, C0974m mVar, C0974m mVar2, int i, int i2, C0983t<?> tVar, Class<?> cls, C0979p pVar) {
        this.f1357b = bVar;
        this.f1358c = mVar;
        this.f1359d = mVar2;
        this.f1360e = i;
        this.f1361f = i2;
        this.f1364i = tVar;
        this.f1362g = cls;
        this.f1363h = pVar;
    }

    /* renamed from: b */
    public void mo10372b(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f1357b.mo10886c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f1360e).putInt(this.f1361f).array();
        this.f1359d.mo10372b(messageDigest);
        this.f1358c.mo10372b(messageDigest);
        messageDigest.update(bArr);
        C0983t<?> tVar = this.f1364i;
        if (tVar != null) {
            tVar.mo10372b(messageDigest);
        }
        this.f1363h.mo10372b(messageDigest);
        C1377g<Class<?>, byte[]> gVar = f1356j;
        byte[] a = gVar.mo11252a(this.f1362g);
        if (a == null) {
            a = this.f1362g.getName().getBytes(C0974m.f1018a);
            gVar.mo11253d(this.f1362g, a);
        }
        messageDigest.update(a);
        this.f1357b.mo10887d(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1117y)) {
            return false;
        }
        C1117y yVar = (C1117y) obj;
        return this.f1361f == yVar.f1361f && this.f1360e == yVar.f1360e && C1380j.m1469b(this.f1364i, yVar.f1364i) && this.f1362g.equals(yVar.f1362g) && this.f1358c.equals(yVar.f1358c) && this.f1359d.equals(yVar.f1359d) && this.f1363h.equals(yVar.f1363h);
    }

    public int hashCode() {
        int hashCode = ((((this.f1359d.hashCode() + (this.f1358c.hashCode() * 31)) * 31) + this.f1360e) * 31) + this.f1361f;
        C0983t<?> tVar = this.f1364i;
        if (tVar != null) {
            hashCode = (hashCode * 31) + tVar.hashCode();
        }
        int hashCode2 = this.f1362g.hashCode();
        return this.f1363h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("ResourceCacheKey{sourceKey=");
        u.append(this.f1358c);
        u.append(", signature=");
        u.append(this.f1359d);
        u.append(", width=");
        u.append(this.f1360e);
        u.append(", height=");
        u.append(this.f1361f);
        u.append(", decodedResourceClass=");
        u.append(this.f1362g);
        u.append(", transformation='");
        u.append(this.f1364i);
        u.append('\'');
        u.append(", options=");
        u.append(this.f1363h);
        u.append('}');
        return u.toString();
    }
}
