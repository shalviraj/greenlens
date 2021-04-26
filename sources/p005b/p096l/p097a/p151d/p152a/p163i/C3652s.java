package p005b.p096l.p097a.p151d.p152a.p163i;

import java.util.concurrent.CountDownLatch;

/* renamed from: b.l.a.d.a.i.s */
public final class C3652s implements C3636c, C3635b {

    /* renamed from: a */
    public final CountDownLatch f6729a = new CountDownLatch(1);

    public /* synthetic */ C3652s(byte[] bArr) {
    }

    /* renamed from: a */
    public final void mo10458a(Object obj) {
        this.f6729a.countDown();
    }

    /* renamed from: b */
    public final void mo10469b(Exception exc) {
        this.f6729a.countDown();
    }
}
