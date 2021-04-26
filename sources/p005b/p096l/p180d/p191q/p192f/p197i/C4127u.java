package p005b.p096l.p180d.p191q.p192f.p197i;

import androidx.annotation.NonNull;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;

/* renamed from: b.l.d.q.f.i.u */
public final class C4127u extends C4129v.C4134d.C4154f {

    /* renamed from: a */
    public final String f7710a;

    public C4127u(String str, C4128a aVar) {
        this.f7710a = str;
    }

    @NonNull
    /* renamed from: a */
    public String mo15735a() {
        return this.f7710a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4129v.C4134d.C4154f) {
            return this.f7710a.equals(((C4129v.C4134d.C4154f) obj).mo15735a());
        }
        return false;
    }

    public int hashCode() {
        return this.f7710a.hashCode() ^ 1000003;
    }

    public String toString() {
        return C0843a.m455p(C0843a.m460u("User{identifier="), this.f7710a, "}");
    }
}
