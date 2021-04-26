package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p131e.p140i.C2895o1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2908p1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2947s1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2960t1;

/* renamed from: b.l.a.c.h.b.q4 */
public final /* synthetic */ class C3292q4 implements Runnable {

    /* renamed from: g */
    public final C3205i5 f5880g;

    /* renamed from: h */
    public final String f5881h;

    /* renamed from: i */
    public final Bundle f5882i;

    public C3292q4(C3205i5 i5Var, String str, Bundle bundle) {
        this.f5880g = i5Var;
        this.f5881h = str;
        this.f5882i = bundle;
    }

    public final void run() {
        C3287q qVar;
        C3205i5 i5Var = this.f5880g;
        String str = this.f5881h;
        Bundle bundle = this.f5882i;
        C3210j jVar = i5Var.f5605a.f5650c;
        C3220j9.m6111F(jVar);
        jVar.mo14126h();
        jVar.mo14646i();
        C3281p4 p4Var = jVar.f5638a;
        C0823f.m376j(str);
        C0823f.m376j("dep");
        TextUtils.isEmpty("");
        if (bundle == null || bundle.isEmpty()) {
            qVar = new C3287q(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2 == null) {
                    p4Var.mo14329d().f5799f.mo14414a("Param name can't be null");
                } else {
                    Object s = p4Var.mo14467t().mo14552s(str2, bundle2.get(str2));
                    if (s == null) {
                        p4Var.mo14329d().f5802i.mo14415b("Param value can't be null", p4Var.mo14468u().mo14322q(str2));
                    } else {
                        p4Var.mo14467t().mo14559z(bundle2, str2, s);
                    }
                }
                it.remove();
            }
            qVar = new C3287q(bundle2);
        }
        C3242l9 l9Var = jVar.f6128b.f5654g;
        C3220j9.m6111F(l9Var);
        C2895o1 C = C2908p1.m5058C();
        if (C.f4886i) {
            C.mo13487j();
            C.f4886i = false;
        }
        C2908p1.m5067L((C2908p1) C.f4885h, 0);
        for (String str3 : qVar.f5876g.keySet()) {
            C2947s1 E = C2960t1.m5263E();
            E.mo13690m(str3);
            Object V = qVar.mo14484V(str3);
            Objects.requireNonNull(V, "null reference");
            l9Var.mo14405u(E, V);
            C.mo13530q(E);
        }
        byte[] e = ((C2908p1) C.mo13484g()).mo13371e();
        jVar.f5638a.mo14329d().f5807n.mo14416c("Saving default event parameters, appId, data size", jVar.f5638a.mo14468u().mo14321p(str), Integer.valueOf(e.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", e);
        try {
            if (jVar.mo14286A().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                jVar.f5638a.mo14329d().f5799f.mo14415b("Failed to insert default event parameters (got -1). appId", C3269o3.m6253t(str));
            }
        } catch (SQLiteException e2) {
            jVar.f5638a.mo14329d().f5799f.mo14416c("Error storing default event parameters. appId", C3269o3.m6253t(str), e2);
        }
    }
}
