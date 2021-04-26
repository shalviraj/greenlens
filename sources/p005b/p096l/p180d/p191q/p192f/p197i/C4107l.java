package p005b.p096l.p180d.p191q.p192f.p197i;

import androidx.annotation.NonNull;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;

/* renamed from: b.l.d.q.f.i.l */
public final class C4107l extends C4129v.C4134d.C4140d.C4141a.C4143b {

    /* renamed from: a */
    public final C4155w<C4129v.C4134d.C4140d.C4141a.C4143b.C4147d> f7664a;

    /* renamed from: b */
    public final C4129v.C4134d.C4140d.C4141a.C4143b.C4145b f7665b;

    /* renamed from: c */
    public final C4129v.C4134d.C4140d.C4141a.C4143b.C4146c f7666c;

    /* renamed from: d */
    public final C4155w<C4129v.C4134d.C4140d.C4141a.C4143b.C4144a> f7667d;

    public C4107l(C4155w wVar, C4129v.C4134d.C4140d.C4141a.C4143b.C4145b bVar, C4129v.C4134d.C4140d.C4141a.C4143b.C4146c cVar, C4155w wVar2, C4108a aVar) {
        this.f7664a = wVar;
        this.f7665b = bVar;
        this.f7666c = cVar;
        this.f7667d = wVar2;
    }

    @NonNull
    /* renamed from: a */
    public C4155w<C4129v.C4134d.C4140d.C4141a.C4143b.C4144a> mo15671a() {
        return this.f7667d;
    }

    @NonNull
    /* renamed from: b */
    public C4129v.C4134d.C4140d.C4141a.C4143b.C4145b mo15672b() {
        return this.f7665b;
    }

    @NonNull
    /* renamed from: c */
    public C4129v.C4134d.C4140d.C4141a.C4143b.C4146c mo15673c() {
        return this.f7666c;
    }

    @NonNull
    /* renamed from: d */
    public C4155w<C4129v.C4134d.C4140d.C4141a.C4143b.C4147d> mo15674d() {
        return this.f7664a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4129v.C4134d.C4140d.C4141a.C4143b)) {
            return false;
        }
        C4129v.C4134d.C4140d.C4141a.C4143b bVar = (C4129v.C4134d.C4140d.C4141a.C4143b) obj;
        return this.f7664a.equals(bVar.mo15674d()) && this.f7665b.equals(bVar.mo15672b()) && this.f7666c.equals(bVar.mo15673c()) && this.f7667d.equals(bVar.mo15671a());
    }

    public int hashCode() {
        return ((((((this.f7664a.hashCode() ^ 1000003) * 1000003) ^ this.f7665b.hashCode()) * 1000003) ^ this.f7666c.hashCode()) * 1000003) ^ this.f7667d.hashCode();
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Execution{threads=");
        u.append(this.f7664a);
        u.append(", exception=");
        u.append(this.f7665b);
        u.append(", signal=");
        u.append(this.f7666c);
        u.append(", binaries=");
        u.append(this.f7667d);
        u.append("}");
        return u.toString();
    }
}
