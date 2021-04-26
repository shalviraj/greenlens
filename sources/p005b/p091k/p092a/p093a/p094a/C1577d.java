package p005b.p091k.p092a.p093a.p094a;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import p005b.p091k.p092a.p093a.p094a.C1574c;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.k.a.a.a.d */
public final class C1577d extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ C1574c f2680a;

    /* renamed from: b */
    public final /* synthetic */ C1580g f2681b;

    public C1577d(C1574c cVar, C1580g gVar) {
        this.f2680a = cVar;
        this.f2681b = gVar;
    }

    public void onPageFinished(WebView webView, String str) {
        C6888i.m12438e(webView, "view");
        C6888i.m12438e(str, "url");
        C1574c cVar = this.f2680a;
        C1580g gVar = this.f2681b;
        int i = C1574c.f2672m;
        cVar.mo11714a(gVar);
        C1574c.C1575a callBack = this.f2680a.getCallBack();
        if (callBack != null) {
            callBack.mo11726a(this.f2680a);
        }
    }
}
