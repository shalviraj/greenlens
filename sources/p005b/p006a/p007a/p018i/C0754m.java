package p005b.p006a.p007a.p018i;

import com.airbnb.lottie.LottieListener;
import com.appfoundry.previewer.model.Asset;
import p298d.p344x.p346c.C6888i;
import p441p.p442a.C8091a;

/* renamed from: b.a.a.i.m */
public final class C0754m<T> implements LottieListener<Throwable> {

    /* renamed from: a */
    public final /* synthetic */ Asset f483a;

    public C0754m(Asset asset) {
        this.f483a = asset;
    }

    public void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        C6888i.m12437d(th, "result");
        C8091a.f16272d.mo26044b("Exception in Lottie with url: %s -> %s", this.f483a.f10896b, th.getLocalizedMessage());
    }
}
