package p005b.p273o;

import p005b.p273o.p276x4.C5026a;
import p005b.p273o.p276x4.C5029d;
import p005b.p273o.p276x4.p277j.C5036b;

/* renamed from: b.o.q1 */
public class C4945q1 implements C4982t2 {

    /* renamed from: a */
    public final /* synthetic */ C5036b f9538a;

    /* renamed from: b */
    public final /* synthetic */ C4953r1 f9539b;

    public C4945q1(C4953r1 r1Var, C5036b bVar) {
        this.f9539b = r1Var;
        this.f9538a = bVar;
    }

    /* renamed from: a */
    public void mo16680a(String str) {
        C5029d b = this.f9539b.f9559b.mo16786b();
        C5036b bVar = this.f9538a;
        C5026a aVar = b.f9728b;
        synchronized (aVar) {
            C5053z2 z2Var = aVar.f9720b;
            ((C4783a3) z2Var).mo16513d("outcome", "timestamp = ?", new String[]{String.valueOf(bVar.f9735d)});
        }
    }

    /* renamed from: b */
    public void mo16681b(int i, String str, Throwable th) {
    }
}
