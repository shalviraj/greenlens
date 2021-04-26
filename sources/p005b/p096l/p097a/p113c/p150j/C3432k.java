package p005b.p096l.p097a.p113c.p150j;

import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;

/* renamed from: b.l.a.c.j.k */
public final class C3432k implements C3433l {

    /* renamed from: a */
    public final CountDownLatch f6201a = new CountDownLatch(1);

    public C3432k(C3426f0 f0Var) {
    }

    /* renamed from: a */
    public final void mo14678a(Object obj) {
        this.f6201a.countDown();
    }

    /* renamed from: b */
    public final void mo12749b(@NonNull Exception exc) {
        this.f6201a.countDown();
    }

    /* renamed from: d */
    public final void mo14672d() {
        this.f6201a.countDown();
    }
}
