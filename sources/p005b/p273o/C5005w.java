package p005b.p273o;

import android.view.ViewGroup;
import android.webkit.WebView;
import p005b.p273o.C4857i2;

/* renamed from: b.o.w */
public class C5005w implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ int f9675g;

    /* renamed from: h */
    public final /* synthetic */ C4777a0 f9676h;

    public C5005w(C4777a0 a0Var, int i) {
        this.f9676h = a0Var;
        this.f9675g = i;
    }

    public void run() {
        WebView webView = this.f9676h.f9142k;
        if (webView == null) {
            C4857i2.m8933a(C4857i2.C4868k.WARN, "WebView height update skipped, new height will be used once it is displayed.", (Throwable) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
        layoutParams.height = this.f9675g;
        this.f9676h.f9142k.setLayoutParams(layoutParams);
        C4777a0 a0Var = this.f9676h;
        C4899m mVar = a0Var.f9144m;
        if (mVar != null) {
            mVar.mo16637a(a0Var.mo16498c(this.f9675g, a0Var.f9141j));
        }
    }
}
