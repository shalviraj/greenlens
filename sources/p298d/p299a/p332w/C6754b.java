package p298d.p299a.p332w;

import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.w.b */
public final class C6754b extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6754b(IllegalAccessException illegalAccessException) {
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", illegalAccessException);
        C6888i.m12438e(illegalAccessException, "cause");
    }
}
