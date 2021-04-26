package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Bundle;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;

/* renamed from: b.l.a.c.h.b.g9 */
public final class C3187g9 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ String f5564g;

    /* renamed from: h */
    public final /* synthetic */ Bundle f5565h;

    /* renamed from: i */
    public final /* synthetic */ C3198h9 f5566i;

    public C3187g9(C3198h9 h9Var, String str, Bundle bundle) {
        this.f5566i = h9Var;
        this.f5564g = str;
        this.f5565h = bundle;
    }

    public final void run() {
        C3297q9 L = this.f5566i.f5592a.mo14346L();
        String str = this.f5564g;
        Bundle bundle = this.f5565h;
        Objects.requireNonNull((C1959c) this.f5566i.f5592a.mo14330e());
        C3309s J = L.mo14519J(str, "_err", bundle, "auto", System.currentTimeMillis(), false, false);
        C3220j9 j9Var = this.f5566i.f5592a;
        Objects.requireNonNull(J, "null reference");
        j9Var.mo14351Q(J, this.f5564g);
    }
}
