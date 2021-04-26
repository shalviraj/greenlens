package p005b.p096l.p097a.p113c.p131e.p140i;

import java.io.IOException;

/* renamed from: b.l.a.c.e.i.x5 */
public class C3016x5 extends IOException {

    /* renamed from: g */
    public static final /* synthetic */ int f5137g = 0;

    public C3016x5(String str) {
        super(str);
    }

    /* renamed from: a */
    public static C3016x5 m5682a() {
        return new C3016x5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    public static C3016x5 m5683b() {
        return new C3016x5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    public static C3016x5 m5684c() {
        return new C3016x5("Failed to parse the message.");
    }

    /* renamed from: d */
    public static C3016x5 m5685d() {
        return new C3016x5("Protocol message had invalid UTF-8.");
    }
}
