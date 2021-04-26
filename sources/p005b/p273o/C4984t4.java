package p005b.p273o;

import android.webkit.ValueCallback;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: b.o.t4 */
public class C4984t4 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C4968s4 f9636g;

    /* renamed from: b.o.t4$a */
    public class C4985a implements ValueCallback<String> {
        public C4985a() {
        }

        public void onReceiveValue(Object obj) {
            try {
                C4984t4.this.f9636g.mo16703j(Integer.valueOf(C4968s4.m9124d(C4984t4.this.f9636g.f9601c, new JSONObject((String) obj))));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public C4984t4(C4968s4 s4Var) {
        this.f9636g = s4Var;
    }

    public void run() {
        C4968s4 s4Var = this.f9636g;
        C4968s4.m9125e(s4Var, s4Var.f9601c);
        this.f9636g.f9599a.evaluateJavascript("getPageMetaData()", new C4985a());
    }
}
