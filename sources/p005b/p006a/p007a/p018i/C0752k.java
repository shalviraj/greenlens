package p005b.p006a.p007a.p018i;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieListener;
import com.appfoundry.previewer.model.Asset;

/* renamed from: b.a.a.i.k */
public final class C0752k<T> implements LottieListener<LottieComposition> {

    /* renamed from: a */
    public final /* synthetic */ LottieAnimationView f481a;

    public C0752k(LottieAnimationView lottieAnimationView, Asset asset) {
        this.f481a = lottieAnimationView;
    }

    public void onResult(Object obj) {
        this.f481a.setComposition((LottieComposition) obj);
        this.f481a.setRepeatCount(-1);
        this.f481a.playAnimation();
    }
}
