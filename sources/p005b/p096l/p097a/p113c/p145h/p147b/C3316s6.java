package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.segment.analytics.integrations.BasePayload;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: b.l.a.c.h.b.s6 */
public final /* synthetic */ class C3316s6 implements Runnable {

    /* renamed from: g */
    public final C3327t6 f5953g;

    /* renamed from: h */
    public final int f5954h;

    /* renamed from: i */
    public final Exception f5955i;

    /* renamed from: j */
    public final byte[] f5956j;

    /* renamed from: k */
    public final Map f5957k;

    public C3316s6(C3327t6 t6Var, int i, Exception exc, byte[] bArr, Map map) {
        this.f5953g = t6Var;
        this.f5954h = i;
        this.f5955i = exc;
        this.f5956j = bArr;
        this.f5957k = map;
    }

    public final void run() {
        C3327t6 t6Var = this.f5953g;
        int i = this.f5954h;
        Exception exc = this.f5955i;
        byte[] bArr = this.f5956j;
        C3281p4 p4Var = t6Var.f5978j.f5767a;
        if (!(i == 200 || i == 204)) {
            if (i == 304) {
                i = 304;
            }
            p4Var.mo14329d().f5802i.mo14416c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), exc);
        }
        if (exc == null) {
            p4Var.mo14464q().f5438r.mo14614b(true);
            if (bArr == null || bArr.length == 0) {
                p4Var.mo14329d().f5806m.mo14414a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble(BasePayload.TIMESTAMP_KEY, ShadowDrawableWrapper.COS_45);
                if (TextUtils.isEmpty(optString)) {
                    p4Var.mo14329d().f5806m.mo14414a("Deferred Deep Link is empty.");
                    return;
                }
                C3297q9 t = p4Var.mo14467t();
                C3281p4 p4Var2 = t.f5638a;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = t.f5638a.f5842a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        p4Var.f5857p.mo14493A("auto", "_cmp", bundle);
                        C3297q9 t2 = p4Var.mo14467t();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = t2.f5638a.f5842a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong(BasePayload.TIMESTAMP_KEY, Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    t2.f5638a.f5842a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (Exception e) {
                                t2.f5638a.mo14329d().f5799f.mo14415b("Failed to persist Deferred Deep Link. exception", e);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                p4Var.mo14329d().f5802i.mo14416c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e2) {
                p4Var.mo14329d().f5799f.mo14415b("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        p4Var.mo14329d().f5802i.mo14416c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), exc);
    }
}
