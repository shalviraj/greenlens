package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Bundle;

/* renamed from: b.l.a.c.h.b.o8 */
public final /* synthetic */ class C3274o8 implements Runnable {

    /* renamed from: g */
    public final C3285p8 f5818g;

    public C3274o8(C3285p8 p8Var) {
        this.f5818g = p8Var;
    }

    public final void run() {
        C3285p8 p8Var = this.f5818g;
        C3296q8 q8Var = p8Var.f5875i;
        long j = p8Var.f5873g;
        long j2 = p8Var.f5874h;
        q8Var.f5909b.mo14126h();
        q8Var.f5909b.f5638a.mo14329d().f5806m.mo14414a("Application going to the background");
        boolean z = true;
        if (q8Var.f5909b.f5638a.f5848g.mo14197r((String) null, C3134c3.f5407s0)) {
            q8Var.f5909b.f5638a.mo14464q().f5437q.mo14614b(true);
        }
        Bundle bundle = new Bundle();
        if (!q8Var.f5909b.f5638a.f5848g.mo14202w()) {
            q8Var.f5909b.f6003e.f5962c.mo14387c();
            if (q8Var.f5909b.f5638a.f5848g.mo14197r((String) null, C3134c3.f5391k0)) {
                C3318s8 s8Var = q8Var.f5909b.f6003e;
                long j3 = s8Var.f5961b;
                s8Var.f5961b = j2;
                bundle.putLong("_et", j2 - j3);
                C3174f7.m5964r(q8Var.f5909b.f5638a.mo14472y().mo14213p(true), bundle, true);
            } else {
                z = false;
            }
            q8Var.f5909b.f6003e.mo14587a(false, z, j2);
        }
        q8Var.f5909b.f5638a.mo14466s().mo14494B("auto", "_ab", j, bundle);
    }
}
