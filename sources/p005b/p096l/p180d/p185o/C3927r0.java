package p005b.p096l.p180d.p185o;

import com.google.firebase.auth.FirebaseAuth;
import p005b.p096l.p180d.p185o.p189e0.C3864a;
import p005b.p096l.p180d.p221y.C4321b;

/* renamed from: b.l.d.o.r0 */
public final class C3927r0 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ FirebaseAuth f7200g;

    /* renamed from: h */
    public final /* synthetic */ C4321b f7201h;

    public C3927r0(FirebaseAuth firebaseAuth, C4321b bVar) {
        this.f7200g = firebaseAuth;
        this.f7201h = bVar;
    }

    public final void run() {
        for (C3864a a : this.f7200g.f11417c) {
            a.mo15369a(this.f7201h);
        }
        for (FirebaseAuth.C5767b a2 : this.f7200g.f11416b) {
            a2.mo22160a(this.f7200g);
        }
    }
}
