package p005b.p096l.p097a.p113c.p131e.p136e;

import org.json.JSONException;
import org.json.JSONObject;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p119b.p126p.C1963g;

/* renamed from: b.l.a.c.e.e.cl */
public final class C2093cl implements C2577wi<C2093cl> {

    /* renamed from: h */
    public static final String f3691h = "cl";

    /* renamed from: g */
    public String f3692g;

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2577wi mo12435d(String str) {
        try {
            this.f3692g = C1963g.m2880a(new JSONObject(str).optString("sessionInfo", (String) null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C1960d.m2701C1(e, f3691h, str);
        }
    }
}
