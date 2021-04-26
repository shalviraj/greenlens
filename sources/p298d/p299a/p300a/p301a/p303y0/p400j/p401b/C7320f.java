package p298d.p299a.p300a.p301a.p303y0.p400j.p401b;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6621c;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6699a;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6705c;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.j.b.f */
public final class C7320f {

    /* renamed from: a */
    public final C6705c f14582a;

    /* renamed from: b */
    public final C6621c f14583b;

    /* renamed from: c */
    public final C6699a f14584c;

    /* renamed from: d */
    public final C6234r0 f14585d;

    public C7320f(C6705c cVar, C6621c cVar2, C6699a aVar, C6234r0 r0Var) {
        C6888i.m12438e(cVar, "nameResolver");
        C6888i.m12438e(cVar2, "classProto");
        C6888i.m12438e(aVar, "metadataVersion");
        C6888i.m12438e(r0Var, "sourceElement");
        this.f14582a = cVar;
        this.f14583b = cVar2;
        this.f14584c = aVar;
        this.f14585d = r0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7320f)) {
            return false;
        }
        C7320f fVar = (C7320f) obj;
        return C6888i.m12434a(this.f14582a, fVar.f14582a) && C6888i.m12434a(this.f14583b, fVar.f14583b) && C6888i.m12434a(this.f14584c, fVar.f14584c) && C6888i.m12434a(this.f14585d, fVar.f14585d);
    }

    public int hashCode() {
        int hashCode = this.f14583b.hashCode();
        int hashCode2 = this.f14584c.hashCode();
        return this.f14585d.hashCode() + ((hashCode2 + ((hashCode + (this.f14582a.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("ClassData(nameResolver=");
        u.append(this.f14582a);
        u.append(", classProto=");
        u.append(this.f14583b);
        u.append(", metadataVersion=");
        u.append(this.f14584c);
        u.append(", sourceElement=");
        u.append(this.f14585d);
        u.append(')');
        return u.toString();
    }
}
