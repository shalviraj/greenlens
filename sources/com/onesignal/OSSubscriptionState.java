package com.onesignal;

import com.segment.analytics.integrations.BasePayload;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p273o.C4815d3;
import p005b.p273o.C4857i2;
import p005b.p273o.C4927o1;
import p005b.p273o.C4947q3;
import p005b.p273o.C4981t1;

public class OSSubscriptionState implements Cloneable {

    /* renamed from: g */
    public C4927o1<Object, OSSubscriptionState> f11498g = new C4927o1<>("changed", false);

    /* renamed from: h */
    public boolean f11499h;

    /* renamed from: i */
    public boolean f11500i;

    /* renamed from: j */
    public String f11501j;

    /* renamed from: k */
    public String f11502k;

    public OSSubscriptionState(boolean z, boolean z2) {
        if (z) {
            String str = C4815d3.f9230a;
            this.f11500i = C4815d3.m8827b(str, "ONESIGNAL_SUBSCRIPTION_LAST", false);
            this.f11501j = C4815d3.m8831f(str, "ONESIGNAL_PLAYER_ID_LAST", (String) null);
            this.f11502k = C4815d3.m8831f(str, "ONESIGNAL_PUSH_TOKEN_LAST", (String) null);
            this.f11499h = C4815d3.m8827b(str, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", false);
            return;
        }
        this.f11500i = C4947q3.m9082b().mo16661n().mo16596e().f9670a.optBoolean("userSubscribePref", true);
        this.f11501j = C4857i2.m8950r();
        this.f11502k = C4947q3.m9083c();
        this.f11499h = z2;
    }

    /* renamed from: a */
    public boolean mo22366a() {
        return this.f11501j != null && this.f11502k != null && this.f11500i && this.f11499h;
    }

    /* renamed from: b */
    public JSONObject mo22367b() {
        JSONObject jSONObject = new JSONObject();
        Object obj = this.f11501j;
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        try {
            jSONObject.put(BasePayload.USER_ID_KEY, obj);
            Object obj2 = this.f11502k;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("pushToken", obj2);
            jSONObject.put("userSubscriptionSetting", this.f11500i);
            jSONObject.put("subscribed", mo22366a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public void changed(C4981t1 t1Var) {
        boolean z = t1Var.f9635h;
        boolean a = mo22366a();
        this.f11499h = z;
        if (a != mo22366a()) {
            this.f11498g.mo16673a(this);
        }
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String toString() {
        return mo22367b().toString();
    }
}
