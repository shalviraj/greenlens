package com.onesignal;

import java.util.Objects;
import org.json.JSONException;
import p005b.p273o.C4815d3;
import p005b.p273o.C4835f2;
import p005b.p273o.C4839g;
import p005b.p273o.C4857i2;
import p005b.p273o.C4907m4;
import p005b.p273o.C4927o1;
import p005b.p273o.C4947q3;
import p005b.p273o.C4981t1;
import p005b.p273o.C4995u1;

public class OSPermissionChangedInternalObserver {
    /* renamed from: a */
    public static void m10590a(C4981t1 t1Var) {
        if (!t1Var.f9635h) {
            C4839g.m8877c(0, C4857i2.f9358c);
        }
        boolean a = C4857i2.f9338H.f9394d ? C4835f2.m8853a() : true;
        C4907m4 b = C4947q3.m9082b();
        Objects.requireNonNull(b);
        try {
            b.mo16662o().mo16604m("androidPermission", Boolean.valueOf(a));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void changed(C4981t1 t1Var) {
        m10590a(t1Var);
        C4995u1 u1Var = new C4995u1();
        u1Var.f9663b = C4857i2.f9348R;
        u1Var.f9662a = (C4981t1) t1Var.clone();
        if (C4857i2.f9349S == null) {
            C4857i2.f9349S = new C4927o1<>("onOSPermissionChanged", true);
        }
        if (C4857i2.f9349S.mo16673a(u1Var)) {
            C4981t1 t1Var2 = (C4981t1) t1Var.clone();
            C4857i2.f9348R = t1Var2;
            Objects.requireNonNull(t1Var2);
            C4815d3.m8834i(C4815d3.f9230a, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", t1Var2.f9635h);
        }
    }
}
