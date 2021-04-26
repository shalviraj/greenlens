package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p273o.C4857i2;
import p005b.p273o.C4887k0;

public class NotificationOpenedActivityHMS extends Activity {
    /* renamed from: a */
    public final void mo22359a() {
        JSONObject jSONObject;
        Intent intent = getIntent();
        C4857i2.m8928E(this);
        if (intent != null) {
            if (!C1960d.m2838q0(intent.getExtras())) {
                jSONObject = null;
            } else {
                jSONObject = C1960d.m2821m(intent.getExtras());
                try {
                    String str = (String) C1960d.m2749S(jSONObject).remove("actionId");
                    if (str != null) {
                        jSONObject.put("actionId", str);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (jSONObject != null && !C4887k0.m8984a(this, jSONObject)) {
                C4857i2.m8951s(this, new JSONArray().put(jSONObject), false, C1960d.m2752T(jSONObject));
            }
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo22359a();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        mo22359a();
    }
}
