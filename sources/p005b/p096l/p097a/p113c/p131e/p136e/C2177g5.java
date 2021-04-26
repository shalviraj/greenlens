package p005b.p096l.p097a.p113c.p131e.p136e;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.g5 */
public final class C2177g5 implements C2174g2 {

    /* renamed from: a */
    public final SharedPreferences.Editor f3877a;

    public C2177g5(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f3877a = (str == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str, 0)).edit();
    }

    /* renamed from: a */
    public final void mo12664a(C2351n8 n8Var) {
        if (!this.f3877a.putString("GenericIdpKeyset", C1960d.m2807i1(n8Var.mo12438a())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    /* renamed from: b */
    public final void mo12665b(C2352n9 n9Var) {
        if (!this.f3877a.putString("GenericIdpKeyset", C1960d.m2807i1(n9Var.mo12438a())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
