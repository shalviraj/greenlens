package p005b.p096l.p097a.p098a.p101f;

import java.util.concurrent.Executor;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.a.f.g */
public class C1638g implements Executor {

    /* renamed from: g */
    public final Executor f2880g;

    /* renamed from: b.l.a.a.f.g$a */
    public static class C1639a implements Runnable {

        /* renamed from: g */
        public final Runnable f2881g;

        public C1639a(Runnable runnable) {
            this.f2881g = runnable;
        }

        public void run() {
            try {
                this.f2881g.run();
            } catch (Exception e) {
                C0823f.m406y("Executor", "Background execution failure.", e);
            }
        }
    }

    public C1638g(Executor executor) {
        this.f2880g = executor;
    }

    public void execute(Runnable runnable) {
        this.f2880g.execute(new C1639a(runnable));
    }
}
