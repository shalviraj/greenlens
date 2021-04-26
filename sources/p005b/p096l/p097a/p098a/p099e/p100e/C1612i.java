package p005b.p096l.p097a.p098a.p099e.p100e;

import androidx.annotation.Nullable;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p098a.p099e.p100e.C1621o;

/* renamed from: b.l.a.a.e.e.i */
public final class C1612i extends C1621o {

    /* renamed from: a */
    public final C1621o.C1623b f2788a;

    /* renamed from: b */
    public final C1621o.C1622a f2789b;

    public C1612i(C1621o.C1623b bVar, C1621o.C1622a aVar, C1613a aVar2) {
        this.f2788a = bVar;
        this.f2789b = aVar;
    }

    @Nullable
    /* renamed from: a */
    public C1621o.C1622a mo11788a() {
        return this.f2789b;
    }

    @Nullable
    /* renamed from: b */
    public C1621o.C1623b mo11789b() {
        return this.f2788a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1621o)) {
            return false;
        }
        C1621o oVar = (C1621o) obj;
        C1621o.C1623b bVar = this.f2788a;
        if (bVar != null ? bVar.equals(oVar.mo11789b()) : oVar.mo11789b() == null) {
            C1621o.C1622a aVar = this.f2789b;
            C1621o.C1622a a = oVar.mo11788a();
            if (aVar == null) {
                if (a == null) {
                    return true;
                }
            } else if (aVar.equals(a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        C1621o.C1623b bVar = this.f2788a;
        int i = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        C1621o.C1622a aVar = this.f2789b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("NetworkConnectionInfo{networkType=");
        u.append(this.f2788a);
        u.append(", mobileSubtype=");
        u.append(this.f2789b);
        u.append("}");
        return u.toString();
    }
}
