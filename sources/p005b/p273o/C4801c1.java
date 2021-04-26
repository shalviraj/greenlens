package p005b.p273o;

import p005b.p273o.C4857i2;

/* renamed from: b.o.c1 */
public class C4801c1 extends C4821e1 {
    /* renamed from: a */
    public String mo16543a() {
        return "location";
    }

    /* renamed from: b */
    public void mo16544b(C4857i2.C4873p pVar) {
        if (!C4857i2.m8930G("promptLocation()")) {
            C4904m2 m2Var = new C4904m2(pVar, true);
            if (C4857i2.f9358c == null || C4857i2.m8931H()) {
                C4857i2.m8933a(C4857i2.C4868k.ERROR, "OneSignal.init has not been called. Could not prompt for location at this time - moving this operation to awaiting queue.", (Throwable) null);
                C4857i2.m8936d(new C4857i2.C4875r(m2Var));
                return;
            }
            m2Var.run();
        }
    }
}
