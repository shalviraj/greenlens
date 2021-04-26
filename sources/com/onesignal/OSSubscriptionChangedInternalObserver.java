package com.onesignal;

import java.util.Objects;
import p005b.p273o.C4782a2;
import p005b.p273o.C4815d3;
import p005b.p273o.C4857i2;
import p005b.p273o.C4927o1;

public class OSSubscriptionChangedInternalObserver {
    public void changed(OSSubscriptionState oSSubscriptionState) {
        C4782a2 a2Var = new C4782a2();
        a2Var.f9154b = C4857i2.f9351U;
        a2Var.f9153a = (OSSubscriptionState) oSSubscriptionState.clone();
        if (C4857i2.f9352V == null) {
            C4857i2.f9352V = new C4927o1<>("onOSSubscriptionChanged", true);
        }
        if (C4857i2.f9352V.mo16673a(a2Var)) {
            OSSubscriptionState oSSubscriptionState2 = (OSSubscriptionState) oSSubscriptionState.clone();
            C4857i2.f9351U = oSSubscriptionState2;
            Objects.requireNonNull(oSSubscriptionState2);
            String str = C4815d3.f9230a;
            C4815d3.m8834i(str, "ONESIGNAL_SUBSCRIPTION_LAST", oSSubscriptionState2.f11500i);
            C4815d3.m8833h(str, "ONESIGNAL_PLAYER_ID_LAST", oSSubscriptionState2.f11501j);
            C4815d3.m8833h(str, "ONESIGNAL_PUSH_TOKEN_LAST", oSSubscriptionState2.f11502k);
            C4815d3.m8834i(str, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", oSSubscriptionState2.f11499h);
        }
    }
}
