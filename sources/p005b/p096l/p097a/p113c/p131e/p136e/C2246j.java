package p005b.p096l.p097a.p113c.p131e.p136e;

import java.io.IOException;

/* renamed from: b.l.a.c.e.e.j */
public class C2246j extends IOException {

    /* renamed from: g */
    public static final /* synthetic */ int f3950g = 0;

    public C2246j(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public C2246j(String str) {
        super(str);
    }

    /* renamed from: a */
    public static C2246j m3524a() {
        return new C2246j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    public static C2246j m3525b() {
        return new C2246j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    public static C2246j m3526c() {
        return new C2246j("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    public static C2246j m3527d() {
        return new C2246j("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    public static C2246j m3528e() {
        return new C2246j("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: f */
    public static C2246j m3529f() {
        return new C2246j("Failed to parse the message.");
    }

    /* renamed from: g */
    public static C2246j m3530g() {
        return new C2246j("Protocol message had invalid UTF-8.");
    }
}
