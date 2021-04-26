package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p273o.C4849h0;
import p005b.p273o.C4857i2;
import p005b.p273o.C5024x3;

public class ADMMessageHandler extends ADMMessageHandlerBase {
    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    public void onMessage(Intent intent) {
        Context applicationContext = getApplicationContext();
        Bundle extras = intent.getExtras();
        if (!C1960d.m2696B0(applicationContext, extras).mo16559a()) {
            C4849h0 h0Var = new C4849h0(applicationContext);
            h0Var.f9312b = C1960d.m2821m(extras);
            C1960d.m2781c(h0Var);
        }
    }

    public void onRegistered(String str) {
        C4857i2.C4868k kVar = C4857i2.C4868k.INFO;
        C4857i2.m8933a(kVar, "ADM registration ID: " + str, (Throwable) null);
        C5024x3.m9224b(str);
    }

    public void onRegistrationError(String str) {
        C4857i2.C4868k kVar = C4857i2.C4868k.ERROR;
        C4857i2.m8933a(kVar, "ADM:onRegistrationError: " + str, (Throwable) null);
        if ("INVALID_SENDER".equals(str)) {
            C4857i2.m8933a(kVar, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", (Throwable) null);
        }
        C5024x3.m9224b((String) null);
    }

    public void onUnregistered(String str) {
        C4857i2.C4868k kVar = C4857i2.C4868k.INFO;
        C4857i2.m8933a(kVar, "ADM:onUnregistered: " + str, (Throwable) null);
    }
}
