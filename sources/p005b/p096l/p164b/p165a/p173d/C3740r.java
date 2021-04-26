package p005b.p096l.p164b.p165a.p173d;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: b.l.b.a.d.r */
public final class C3740r implements C3745v {

    /* renamed from: a */
    public final C3745v f6923a;

    /* renamed from: b */
    public final int f6924b;

    /* renamed from: c */
    public final Logger f6925c;

    public C3740r(C3745v vVar, Logger logger, Level level, int i) {
        this.f6923a = vVar;
        this.f6925c = logger;
        this.f6924b = i;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo15014a(OutputStream outputStream) {
        C3739q qVar = new C3739q(outputStream, this.f6925c, Level.CONFIG, this.f6924b);
        try {
            this.f6923a.mo15014a(qVar);
            qVar.f6922g.close();
            outputStream.flush();
        } catch (Throwable th) {
            qVar.f6922g.close();
            throw th;
        }
    }
}
