package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* renamed from: b.l.a.c.e.e.lb */
public final class C2306lb extends ThreadLocal<Mac> {

    /* renamed from: a */
    public final /* synthetic */ C2330mb f4042a;

    public C2306lb(C2330mb mbVar) {
        this.f4042a = mbVar;
    }

    public final Object initialValue() {
        try {
            Mac a = C2058bb.f3638f.mo12428a(this.f4042a.f4062b);
            a.init(this.f4042a.f4063c);
            return a;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
