package p005b.p091k.p092a.p093a.p094a;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.k.a.a.a.e */
public final class C1578e extends WebChromeClient {

    /* renamed from: a */
    public final /* synthetic */ C1574c f2682a;

    public C1578e(C1574c cVar) {
        this.f2682a = cVar;
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        C6888i.m12438e(webView, "view");
        C6888i.m12438e(str, "url");
        C6888i.m12438e(str2, "message");
        C6888i.m12438e(jsResult, "result");
        super.onJsAlert(webView, str, str2, jsResult);
        String m = C0843a.m452m("url --->", str, "\n\n\n");
        String m2 = C0843a.m452m("message --->", str2, "\n\n\n");
        new AlertDialog.Builder(this.f2682a.getContext()).setTitle("JavaScript alert Information").setMessage(C0843a.m452m(m, m2, "result --->" + jsResult)).setNeutralButton("sure", (DialogInterface.OnClickListener) null).show();
        return true;
    }
}
