package p298d.p344x.p346c;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.C6725d;
import p298d.p299a.C6729h;
import p298d.p344x.C6850a;
import p298d.p344x.p346c.C6879b;

/* renamed from: d.x.c.g */
public class C6886g extends C6879b implements C6885f, C6729h {

    /* renamed from: n */
    public final int f13795n;

    /* renamed from: o */
    public final int f13796o;

    public C6886g(int i) {
        this(i, C6879b.C6880a.f13787g, (Class) null, (String) null, (String) null, 0);
    }

    public C6886g(int i, Object obj) {
        this(i, obj, (Class) null, (String) null, (String) null, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6886g(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f13795n = i;
        this.f13796o = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6886g) {
            C6886g gVar = (C6886g) obj;
            if (!C6888i.m12434a(mo22957w(), gVar.mo22957w()) || !getName().equals(gVar.getName()) || !mo22958y().equals(gVar.mo22958y()) || this.f13796o != gVar.f13796o || this.f13795n != gVar.f13795n || !C6888i.m12434a(this.f13782h, gVar.f13782h)) {
                return false;
            }
            return true;
        } else if (obj instanceof C6729h) {
            return obj.equals(mo24187j());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.f13795n;
    }

    public int hashCode() {
        return mo22958y().hashCode() + ((getName().hashCode() + (mo22957w() == null ? 0 : mo22957w().hashCode() * 31)) * 31);
    }

    public String toString() {
        C6725d j = mo24187j();
        if (j != this) {
            return j.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder u = C0843a.m460u("function ");
        u.append(getName());
        u.append(" (Kotlin reflection is not available)");
        return u.toString();
    }

    /* renamed from: v */
    public C6725d mo24188v() {
        return C6902w.f13802a.mo23041a(this);
    }

    /* renamed from: x */
    public C6725d mo24189x() {
        C6725d j = mo24187j();
        if (j != this) {
            return (C6729h) j;
        }
        throw new C6850a();
    }
}
