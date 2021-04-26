package p005b.p273o;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4857i2;

/* renamed from: b.o.v1 */
public class C5001v1 extends C4920n3 {

    /* renamed from: a */
    public final /* synthetic */ String f9672a;

    public C5001v1(C5007w1 w1Var, String str) {
        this.f9672a = str;
    }

    /* renamed from: a */
    public void mo16563a(int i, String str, Throwable th) {
        C4857i2.C4868k kVar = C4857i2.C4868k.ERROR;
        C4857i2.m8933a(kVar, "Receive receipt failed with statusCode: " + i + " response: " + str, (Throwable) null);
    }

    /* renamed from: b */
    public void mo16564b(String str) {
        C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
        StringBuilder u = C0843a.m460u("Receive receipt sent for notificationID: ");
        u.append(this.f9672a);
        C4857i2.m8933a(kVar, u.toString(), (Throwable) null);
    }
}
