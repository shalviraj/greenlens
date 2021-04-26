package p298d.p299a.p300a.p301a.p303y0.p314d.p324b;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.C6766h;
import p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6604e;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.b.o */
public final class C6560o {

    /* renamed from: a */
    public final String f12853a;

    public C6560o(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f12853a = str;
    }

    /* renamed from: a */
    public static final C6560o m11649a(String str, String str2) {
        C6888i.m12438e(str, "name");
        C6888i.m12438e(str2, "desc");
        return new C6560o(str + '#' + str2, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static final C6560o m11650b(C6604e eVar) {
        C6888i.m12438e(eVar, "signature");
        if (eVar instanceof C6604e.C6606b) {
            return m11651c(eVar.mo23718c(), eVar.mo23717b());
        }
        if (eVar instanceof C6604e.C6605a) {
            return m11649a(eVar.mo23718c(), eVar.mo23717b());
        }
        throw new C6766h();
    }

    /* renamed from: c */
    public static final C6560o m11651c(String str, String str2) {
        C6888i.m12438e(str, "name");
        C6888i.m12438e(str2, "desc");
        return new C6560o(C6888i.m12444k(str, str2), (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6560o) && C6888i.m12434a(this.f12853a, ((C6560o) obj).f12853a);
    }

    public int hashCode() {
        return this.f12853a.hashCode();
    }

    public String toString() {
        return C0843a.m454o(C0843a.m460u("MemberSignature(signature="), this.f12853a, ')');
    }
}
