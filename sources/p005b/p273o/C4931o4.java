package p005b.p273o;

import p005b.p273o.C4857i2;

/* renamed from: b.o.o4 */
public class C4931o4 extends C4920n3 {

    /* renamed from: a */
    public final /* synthetic */ C4921n4 f9519a;

    public C4931o4(C4921n4 n4Var) {
        this.f9519a = n4Var;
    }

    /* renamed from: a */
    public void mo16563a(int i, String str, Throwable th) {
        C4857i2.C4868k kVar = C4857i2.C4868k.WARN;
        C4857i2.m8933a(kVar, "Failed last request. statusCode: " + i + "\nresponse: " + str, (Throwable) null);
        if (C4921n4.m9033a(this.f9519a, i, str, "already logged out of email")) {
            C4921n4.m9034b(this.f9519a);
        } else if (C4921n4.m9033a(this.f9519a, i, str, "not a valid device_type")) {
            C4921n4.m9035c(this.f9519a);
        } else {
            C4921n4.m9036d(this.f9519a, i);
        }
    }

    /* renamed from: b */
    public void mo16564b(String str) {
        C4921n4.m9034b(this.f9519a);
    }
}
