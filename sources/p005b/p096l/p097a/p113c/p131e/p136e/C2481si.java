package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.Arrays;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;

/* renamed from: b.l.a.c.e.e.si */
public final class C2481si extends C2335mg implements C1770a.C1774d {

    /* renamed from: h */
    public final String f4290h;

    public /* synthetic */ C2481si(String str) {
        C0823f.m374i(str, "A valid API key must be provided");
        this.f4290h = str;
    }

    public final Object clone() {
        String str = this.f4290h;
        C0823f.m376j(str);
        return new C2481si(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2481si)) {
            return false;
        }
        C2481si siVar = (C2481si) obj;
        return C0823f.m330A(this.f4290h, siVar.f4290h) && this.f4075g == siVar.f4075g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4290h}) + (true ^ this.f4075g ? 1 : 0);
    }
}
