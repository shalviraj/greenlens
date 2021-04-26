package p005b.p051h.p052a.p055m.p058v;

import java.util.Objects;
import p005b.p051h.p052a.p055m.p058v.C1014a;

/* renamed from: b.h.a.m.v.b */
public class C1019b implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C1014a f1080g;

    public C1019b(C1014a aVar) {
        this.f1080g = aVar;
    }

    public void run() {
        C1014a aVar = this.f1080g;
        Objects.requireNonNull(aVar);
        while (true) {
            try {
                aVar.mo10871b((C1014a.C1017b) aVar.f1072c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
