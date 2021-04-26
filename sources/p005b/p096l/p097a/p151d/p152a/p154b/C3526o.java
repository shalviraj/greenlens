package p005b.p096l.p097a.p151d.p152a.p154b;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackState;

/* renamed from: b.l.a.d.a.b.o */
public final /* synthetic */ class C3526o implements Runnable {

    /* renamed from: g */
    public final C3534q f6497g;

    /* renamed from: h */
    public final Bundle f6498h;

    /* renamed from: i */
    public final AssetPackState f6499i;

    public C3526o(C3534q qVar, Bundle bundle, AssetPackState assetPackState) {
        this.f6497g = qVar;
        this.f6498h = bundle;
        this.f6499i = assetPackState;
    }

    public final void run() {
        C3534q qVar = this.f6497g;
        Bundle bundle = this.f6498h;
        AssetPackState assetPackState = this.f6499i;
        C3551v0 v0Var = qVar.f6524g;
        if (((Boolean) v0Var.mo14843b(new C3519m0(v0Var, bundle))).booleanValue()) {
            qVar.f6531n.post(new C3522n(qVar, assetPackState));
            qVar.f6526i.mo14881a().mo14760c();
        }
    }
}
