package p005b.p096l.p180d.p191q.p192f.p195g;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import p005b.p096l.p097a.p113c.p150j.C3414a;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p097a.p113c.p150j.C3429i;

/* renamed from: b.l.d.q.f.g.r0 */
public class C4036r0 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ Callable f7412g;

    /* renamed from: h */
    public final /* synthetic */ C3429i f7413h;

    /* renamed from: b.l.d.q.f.g.r0$a */
    public class C4037a implements C3414a<T, Void> {
        public C4037a() {
        }

        /* renamed from: a */
        public Object mo14670a(@NonNull C3428h hVar) {
            if (hVar.mo14692n()) {
                C3429i iVar = C4036r0.this.f7413h;
                iVar.f6197a.mo14695q(hVar.mo14688j());
                return null;
            }
            C3429i iVar2 = C4036r0.this.f7413h;
            iVar2.f6197a.mo14694p(hVar.mo14687i());
            return null;
        }
    }

    public C4036r0(Callable callable, C3429i iVar) {
        this.f7412g = callable;
        this.f7413h = iVar;
    }

    public void run() {
        try {
            ((C3428h) this.f7412g.call()).mo14684f(new C4037a());
        } catch (Exception e) {
            this.f7413h.f6197a.mo14694p(e);
        }
    }
}
