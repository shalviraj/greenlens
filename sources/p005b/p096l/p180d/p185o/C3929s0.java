package p005b.p096l.p180d.p185o;

import com.google.firebase.auth.FirebaseAuth;

/* renamed from: b.l.d.o.s0 */
public final class C3929s0 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ FirebaseAuth f7204g;

    public C3929s0(FirebaseAuth firebaseAuth) {
        this.f7204g = firebaseAuth;
    }

    public final void run() {
        for (FirebaseAuth.C5766a a : this.f7204g.f11418d) {
            a.mo22159a(this.f7204g);
        }
    }
}
