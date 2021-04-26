package p298d.p299a;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.C6766h;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.p */
public final class C6743p {

    /* renamed from: c */
    public static final C6743p f13640c = new C6743p((C6745q) null, (C6741n) null);

    /* renamed from: d */
    public static final C6744a f13641d = new C6744a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C6745q f13642a;

    /* renamed from: b */
    public final C6741n f13643b;

    /* renamed from: d.a.p$a */
    public static final class C6744a {
        public C6744a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public C6743p(C6745q qVar, C6741n nVar) {
        String str;
        this.f13642a = qVar;
        this.f13643b = nVar;
        if (!((qVar == null) != (nVar == null) ? false : true)) {
            if (qVar == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + qVar + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6743p)) {
            return false;
        }
        C6743p pVar = (C6743p) obj;
        return C6888i.m12434a(this.f13642a, pVar.f13642a) && C6888i.m12434a(this.f13643b, pVar.f13643b);
    }

    public int hashCode() {
        C6745q qVar = this.f13642a;
        int i = 0;
        int hashCode = (qVar != null ? qVar.hashCode() : 0) * 31;
        C6741n nVar = this.f13643b;
        if (nVar != null) {
            i = nVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str;
        StringBuilder sb;
        C6745q qVar = this.f13642a;
        if (qVar == null) {
            return "*";
        }
        int ordinal = qVar.ordinal();
        if (ordinal == 0) {
            return String.valueOf(this.f13643b);
        }
        if (ordinal == 1) {
            sb = new StringBuilder();
            str = "in ";
        } else if (ordinal == 2) {
            sb = new StringBuilder();
            str = "out ";
        } else {
            throw new C6766h();
        }
        sb.append(str);
        sb.append(this.f13643b);
        return sb.toString();
    }
}
