package p005b.p006a.p007a.p018i;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieListener;
import com.appfoundry.previewer.model.Asset;
import p441p.p442a.C8091a;

/* renamed from: b.a.a.i.l */
public final class C0753l<T> implements LottieListener<Throwable> {

    /* renamed from: a */
    public final /* synthetic */ Asset f482a;

    public C0753l(LottieAnimationView lottieAnimationView, Asset asset) {
        this.f482a = asset;
    }

    public void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        C8091a.f16272d.mo26044b("LottieComposition error: %s", this.f482a.f10895a);
    }
}
