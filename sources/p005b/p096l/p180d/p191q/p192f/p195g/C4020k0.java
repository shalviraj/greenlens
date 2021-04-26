package p005b.p096l.p180d.p191q.p192f.p195g;

import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p150j.C3414a;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p180d.p191q.p192f.C3982b;
import p005b.p096l.p180d.p191q.p192f.p200k.C4168a;
import p005b.p096l.p180d.p191q.p192f.p200k.C4174g;

/* renamed from: b.l.d.q.f.g.k0 */
public final /* synthetic */ class C4020k0 implements C3414a {

    /* renamed from: a */
    public final C4024m0 f7365a;

    public C4020k0(C4024m0 m0Var) {
        this.f7365a = m0Var;
    }

    /* renamed from: a */
    public Object mo14670a(C3428h hVar) {
        C4024m0 m0Var = this.f7365a;
        Objects.requireNonNull(m0Var);
        boolean z = false;
        if (hVar.mo14692n()) {
            C3996a0 a0Var = (C3996a0) hVar.mo14688j();
            C3982b bVar = C3982b.f7289a;
            StringBuilder u = C0843a.m460u("Crashlytics report successfully enqueued to DataTransport: ");
            u.append(a0Var.mo15506b());
            bVar.mo15496b(u.toString());
            C4174g gVar = m0Var.f7375b;
            C4168a aVar = new C4168a(a0Var.mo15506b());
            Iterator it = ((ArrayList) C4174g.m7704a(C4174g.m7707e(gVar.f7739c, aVar), C4174g.m7707e(gVar.f7741e, aVar), C4174g.m7707e(gVar.f7740d, aVar))).iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
            z = true;
        } else {
            C3982b bVar2 = C3982b.f7289a;
            Exception i = hVar.mo14687i();
            if (bVar2.mo15495a(5)) {
                Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", i);
            }
        }
        return Boolean.valueOf(z);
    }
}
