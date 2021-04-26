package p005b.p273o;

import android.os.Bundle;
import org.json.JSONArray;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.o.d0 */
public final class C4810d0 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ Bundle f9204g;

    public C4810d0(Bundle bundle) {
        this.f9204g = bundle;
    }

    public void run() {
        Bundle bundle = this.f9204g;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(C1960d.m2821m(bundle));
        C4857i2.m8952t(jSONArray, false, false);
    }
}
