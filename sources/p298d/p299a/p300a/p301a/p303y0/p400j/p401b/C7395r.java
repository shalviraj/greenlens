package p298d.p299a.p300a.p301a.p303y0.p400j.p401b;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.j.b.r */
public final class C7395r<T> {

    /* renamed from: a */
    public final T f14781a;

    /* renamed from: b */
    public final T f14782b;

    /* renamed from: c */
    public final String f14783c;

    /* renamed from: d */
    public final C6713a f14784d;

    public C7395r(T t, T t2, String str, C6713a aVar) {
        C6888i.m12438e(str, "filePath");
        C6888i.m12438e(aVar, "classId");
        this.f14781a = t;
        this.f14782b = t2;
        this.f14783c = str;
        this.f14784d = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7395r)) {
            return false;
        }
        C7395r rVar = (C7395r) obj;
        return C6888i.m12434a(this.f14781a, rVar.f14781a) && C6888i.m12434a(this.f14782b, rVar.f14782b) && C6888i.m12434a(this.f14783c, rVar.f14783c) && C6888i.m12434a(this.f14784d, rVar.f14784d);
    }

    public int hashCode() {
        T t = this.f14781a;
        int i = 0;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f14782b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return this.f14784d.hashCode() + ((this.f14783c.hashCode() + ((hashCode + i) * 31)) * 31);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("IncompatibleVersionErrorData(actualVersion=");
        u.append(this.f14781a);
        u.append(", expectedVersion=");
        u.append(this.f14782b);
        u.append(", filePath=");
        u.append(this.f14783c);
        u.append(", classId=");
        u.append(this.f14784d);
        u.append(')');
        return u.toString();
    }
}
