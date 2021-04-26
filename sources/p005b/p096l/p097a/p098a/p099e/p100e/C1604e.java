package p005b.p096l.p097a.p098a.p099e.p100e;

import androidx.annotation.Nullable;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p098a.p099e.p100e.C1615k;

/* renamed from: b.l.a.a.e.e.e */
public final class C1604e extends C1615k {

    /* renamed from: a */
    public final C1615k.C1616a f2764a;

    /* renamed from: b */
    public final C1593a f2765b;

    public C1604e(C1615k.C1616a aVar, C1593a aVar2, C1605a aVar3) {
        this.f2764a = aVar;
        this.f2765b = aVar2;
    }

    @Nullable
    /* renamed from: a */
    public C1593a mo11759a() {
        return this.f2765b;
    }

    @Nullable
    /* renamed from: b */
    public C1615k.C1616a mo11760b() {
        return this.f2764a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1615k)) {
            return false;
        }
        C1615k kVar = (C1615k) obj;
        C1615k.C1616a aVar = this.f2764a;
        if (aVar != null ? aVar.equals(kVar.mo11760b()) : kVar.mo11760b() == null) {
            C1593a aVar2 = this.f2765b;
            C1593a a = kVar.mo11759a();
            if (aVar2 == null) {
                if (a == null) {
                    return true;
                }
            } else if (aVar2.equals(a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        C1615k.C1616a aVar = this.f2764a;
        int i = 0;
        int hashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        C1593a aVar2 = this.f2765b;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("ClientInfo{clientType=");
        u.append(this.f2764a);
        u.append(", androidClientInfo=");
        u.append(this.f2765b);
        u.append("}");
        return u.toString();
    }
}
