package p298d.p344x.p346c;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.C6725d;
import p298d.p299a.C6736l;
import p298d.p344x.C6850a;

/* renamed from: d.x.c.r */
public abstract class C6897r extends C6879b implements C6736l {
    public C6897r() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6897r(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) != 1 ? false : true);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6897r) {
            C6897r rVar = (C6897r) obj;
            if (!mo22957w().equals(rVar.mo22957w()) || !getName().equals(rVar.getName()) || !mo22958y().equals(rVar.mo22958y()) || !C6888i.m12434a(this.f13782h, rVar.f13782h)) {
                return false;
            }
            return true;
        } else if (obj instanceof C6736l) {
            return obj.equals(mo24187j());
        } else {
            return false;
        }
    }

    public int hashCode() {
        int hashCode = getName().hashCode();
        return mo22958y().hashCode() + ((hashCode + (mo22957w().hashCode() * 31)) * 31);
    }

    public String toString() {
        C6725d j = mo24187j();
        if (j != this) {
            return j.toString();
        }
        StringBuilder u = C0843a.m460u("property ");
        u.append(getName());
        u.append(" (Kotlin reflection is not available)");
        return u.toString();
    }

    /* renamed from: z */
    public C6736l mo24189x() {
        C6725d j = mo24187j();
        if (j != this) {
            return (C6736l) j;
        }
        throw new C6850a();
    }
}
