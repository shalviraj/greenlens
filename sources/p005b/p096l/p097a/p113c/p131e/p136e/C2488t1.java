package p005b.p096l.p097a.p113c.p131e.p136e;

import java.io.OutputStream;
import java.util.Objects;
import java.util.logging.Logger;

/* renamed from: b.l.a.c.e.e.t1 */
public final class C2488t1 implements C2174g2 {

    /* renamed from: a */
    public final OutputStream f4303a;

    public C2488t1(OutputStream outputStream) {
        this.f4303a = outputStream;
    }

    /* renamed from: a */
    public final void mo12664a(C2351n8 n8Var) {
        throw null;
    }

    /* renamed from: b */
    public final void mo12665b(C2352n9 n9Var) {
        try {
            OutputStream outputStream = this.f4303a;
            Objects.requireNonNull(n9Var);
            int o = n9Var.mo12451o();
            Logger logger = C2509tm.f4329b;
            if (o > 4096) {
                o = 4096;
            }
            C2485sm smVar = new C2485sm(outputStream, o);
            n9Var.mo12449k(smVar);
            if (smVar.f4296f > 0) {
                smVar.mo12994B();
            }
        } finally {
            this.f4303a.close();
        }
    }
}
