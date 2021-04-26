package p005b.p273o;

import android.content.Context;

/* renamed from: b.o.m0 */
public final class C4902m0 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ Context f9466g;

    public C4902m0(Context context) {
        this.f9466g = context;
    }

    public void run() {
        Thread.currentThread().setPriority(10);
        C4915n0.m9028b(this.f9466g);
    }
}
