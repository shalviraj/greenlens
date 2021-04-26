package p005b.p096l.p180d.p191q.p192f.p197i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;

/* renamed from: b.l.d.q.f.i.j */
public final class C4102j extends C4129v.C4134d.C4140d {

    /* renamed from: a */
    public final long f7651a;

    /* renamed from: b */
    public final String f7652b;

    /* renamed from: c */
    public final C4129v.C4134d.C4140d.C4141a f7653c;

    /* renamed from: d */
    public final C4129v.C4134d.C4140d.C4150b f7654d;

    /* renamed from: e */
    public final C4129v.C4134d.C4140d.C4152c f7655e;

    public C4102j(long j, String str, C4129v.C4134d.C4140d.C4141a aVar, C4129v.C4134d.C4140d.C4150b bVar, C4129v.C4134d.C4140d.C4152c cVar, C4103a aVar2) {
        this.f7651a = j;
        this.f7652b = str;
        this.f7653c = aVar;
        this.f7654d = bVar;
        this.f7655e = cVar;
    }

    @NonNull
    /* renamed from: a */
    public C4129v.C4134d.C4140d.C4141a mo15654a() {
        return this.f7653c;
    }

    @NonNull
    /* renamed from: b */
    public C4129v.C4134d.C4140d.C4150b mo15655b() {
        return this.f7654d;
    }

    @Nullable
    /* renamed from: c */
    public C4129v.C4134d.C4140d.C4152c mo15656c() {
        return this.f7655e;
    }

    /* renamed from: d */
    public long mo15657d() {
        return this.f7651a;
    }

    @NonNull
    /* renamed from: e */
    public String mo15658e() {
        return this.f7652b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4129v.C4134d.C4140d)) {
            return false;
        }
        C4129v.C4134d.C4140d dVar = (C4129v.C4134d.C4140d) obj;
        if (this.f7651a == dVar.mo15657d() && this.f7652b.equals(dVar.mo15658e()) && this.f7653c.equals(dVar.mo15654a()) && this.f7654d.equals(dVar.mo15655b())) {
            C4129v.C4134d.C4140d.C4152c cVar = this.f7655e;
            C4129v.C4134d.C4140d.C4152c c = dVar.mo15656c();
            if (cVar == null) {
                if (c == null) {
                    return true;
                }
            } else if (cVar.equals(c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f7651a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f7652b.hashCode()) * 1000003) ^ this.f7653c.hashCode()) * 1000003) ^ this.f7654d.hashCode()) * 1000003;
        C4129v.C4134d.C4140d.C4152c cVar = this.f7655e;
        return hashCode ^ (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Event{timestamp=");
        u.append(this.f7651a);
        u.append(", type=");
        u.append(this.f7652b);
        u.append(", app=");
        u.append(this.f7653c);
        u.append(", device=");
        u.append(this.f7654d);
        u.append(", log=");
        u.append(this.f7655e);
        u.append("}");
        return u.toString();
    }
}
