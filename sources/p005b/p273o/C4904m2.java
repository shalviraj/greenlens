package p005b.p273o;

import android.app.AlertDialog;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import java.util.List;
import java.util.Objects;
import p005b.p273o.C4794c0;
import p005b.p273o.C4857i2;
import p005b.p273o.C4990u0;

/* renamed from: b.o.m2 */
public final class C4904m2 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C4857i2.C4873p f9469g;

    /* renamed from: h */
    public final /* synthetic */ boolean f9470h;

    /* renamed from: b.o.m2$a */
    public class C4905a extends C4794c0.C4799e {
        public C4905a() {
        }

        /* renamed from: a */
        public C4794c0.C4800f mo16539a() {
            return C4794c0.C4800f.PROMPT_LOCATION;
        }

        /* renamed from: b */
        public void mo16540b(C4794c0.C4798d dVar) {
            if (!C4857i2.m8930G("promptLocation()") && dVar != null) {
                C4947q3.m9085e(dVar);
            }
        }

        /* renamed from: c */
        public void mo16542c(C4857i2.C4876s sVar) {
            C4857i2.C4873p pVar = C4904m2.this.f9469g;
            if (pVar != null) {
                C4990u0.C4994d dVar = (C4990u0.C4994d) pVar;
                C4990u0.this.f9652j = null;
                C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
                C4857i2.m8933a(kVar, "IAM prompt to handle finished with result: " + sVar, (Throwable) null);
                C4964s0 s0Var = dVar.f9659a;
                if (!s0Var.f9587k || sVar != C4857i2.C4876s.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                    C4990u0.this.mo16740w(s0Var, dVar.f9660b);
                    return;
                }
                C4990u0 u0Var = C4990u0.this;
                List list = dVar.f9660b;
                Objects.requireNonNull(u0Var);
                String string = C4857i2.f9358c.getString(R.string.location_not_available_title);
                new AlertDialog.Builder(C4857i2.m8943k()).setTitle(string).setMessage(C4857i2.f9358c.getString(R.string.location_not_available_message)).setPositiveButton(17039370, new C5021x0(u0Var, s0Var, list)).show();
            }
        }
    }

    public C4904m2(C4857i2.C4873p pVar, boolean z) {
        this.f9469g = pVar;
        this.f9470h = z;
    }

    public void run() {
        C4794c0.m8788d(C4857i2.f9358c, true, this.f9470h, new C4905a());
        C4857i2.f9335E = true;
    }
}
