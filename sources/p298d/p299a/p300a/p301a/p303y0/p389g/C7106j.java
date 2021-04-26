package p298d.p299a.p300a.p301a.p303y0.p389g;

import java.io.IOException;

/* renamed from: d.a.a.a.y0.g.j */
public class C7106j extends IOException {

    /* renamed from: g */
    public C7117p f14209g = null;

    public C7106j(String str) {
        super(str);
    }

    /* renamed from: a */
    public static C7106j m12796a() {
        return new C7106j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: b */
    public static C7106j m12797b() {
        return new C7106j("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: d */
    public static C7106j m12798d() {
        return new C7106j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: c */
    public C7106j mo24692c(C7117p pVar) {
        this.f14209g = pVar;
        return this;
    }
}
