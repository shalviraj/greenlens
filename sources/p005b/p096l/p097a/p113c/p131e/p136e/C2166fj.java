package p005b.p096l.p097a.p113c.p131e.p136e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p126p.C1957a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1961e;

/* renamed from: b.l.a.c.e.e.fj */
public final class C2166fj {

    /* renamed from: a */
    public final String f3868a;

    /* renamed from: b */
    public final String f3869b;

    public C2166fj(Context context, String str) {
        C0823f.m376j(str);
        this.f3868a = str;
        try {
            byte[] a = C1957a.m2688a(context, str);
            if (a == null) {
                String valueOf = String.valueOf(str);
                Log.e("FBA-PackageInfo", valueOf.length() != 0 ? "single cert required: ".concat(valueOf) : new String("single cert required: "));
                this.f3869b = null;
                return;
            }
            this.f3869b = C1961e.m2877a(a, false);
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf2 = String.valueOf(str);
            Log.e("FBA-PackageInfo", valueOf2.length() != 0 ? "no pkg: ".concat(valueOf2) : new String("no pkg: "));
            this.f3869b = null;
        }
    }
}
