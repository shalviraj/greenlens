package p005b.p096l.p180d.p191q.p192f.p197i;

import androidx.annotation.NonNull;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;

/* renamed from: b.l.d.q.f.i.p */
public final class C4115p extends C4129v.C4134d.C4140d.C4141a.C4143b.C4147d {

    /* renamed from: a */
    public final String f7680a;

    /* renamed from: b */
    public final int f7681b;

    /* renamed from: c */
    public final C4155w<C4129v.C4134d.C4140d.C4141a.C4143b.C4147d.C4148a> f7682c;

    public C4115p(String str, int i, C4155w wVar, C4116a aVar) {
        this.f7680a = str;
        this.f7681b = i;
        this.f7682c = wVar;
    }

    @NonNull
    /* renamed from: a */
    public C4155w<C4129v.C4134d.C4140d.C4141a.C4143b.C4147d.C4148a> mo15699a() {
        return this.f7682c;
    }

    /* renamed from: b */
    public int mo15700b() {
        return this.f7681b;
    }

    @NonNull
    /* renamed from: c */
    public String mo15701c() {
        return this.f7680a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4129v.C4134d.C4140d.C4141a.C4143b.C4147d)) {
            return false;
        }
        C4129v.C4134d.C4140d.C4141a.C4143b.C4147d dVar = (C4129v.C4134d.C4140d.C4141a.C4143b.C4147d) obj;
        return this.f7680a.equals(dVar.mo15701c()) && this.f7681b == dVar.mo15700b() && this.f7682c.equals(dVar.mo15699a());
    }

    public int hashCode() {
        return ((((this.f7680a.hashCode() ^ 1000003) * 1000003) ^ this.f7681b) * 1000003) ^ this.f7682c.hashCode();
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Thread{name=");
        u.append(this.f7680a);
        u.append(", importance=");
        u.append(this.f7681b);
        u.append(", frames=");
        u.append(this.f7682c);
        u.append("}");
        return u.toString();
    }
}
