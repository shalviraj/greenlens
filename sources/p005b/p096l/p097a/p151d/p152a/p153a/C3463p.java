package p005b.p096l.p097a.p151d.p152a.p153a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p151d.p152a.p156c.C3566b;
import p005b.p096l.p097a.p151d.p152a.p157d.C3570a;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;
import p005b.p096l.p097a.p151d.p152a.p159e.C3597l0;
import p005b.p096l.p097a.p151d.p152a.p159e.C3604p;
import p005b.p096l.p097a.p151d.p152a.p159e.C3608r;
import p005b.p096l.p097a.p151d.p152a.p163i.C3651r;

/* renamed from: b.l.a.d.a.a.p */
public final class C3463p {

    /* renamed from: e */
    public static final C3584f f6264e = new C3584f("AppUpdateService");

    /* renamed from: f */
    public static final Intent f6265f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    @Nullable

    /* renamed from: a */
    public C3604p<C3597l0> f6266a;

    /* renamed from: b */
    public final String f6267b;

    /* renamed from: c */
    public final Context f6268c;

    /* renamed from: d */
    public final C3465r f6269d;

    public C3463p(Context context, C3465r rVar) {
        this.f6267b = context.getPackageName();
        this.f6268c = context;
        this.f6269d = rVar;
        if (C3608r.m6844a(context)) {
            Context applicationContext = context.getApplicationContext();
            this.f6266a = new C3604p(applicationContext != null ? applicationContext : context, f6264e, "AppUpdateService", f6265f, C3457j.f6252a);
        }
    }

    /* renamed from: a */
    public static Bundle m6614a(C3463p pVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putAll(C3566b.m6788a("app_update"));
        bundle2.putInt("playcore.version.code", 11000);
        bundle.putAll(bundle2);
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(pVar.f6268c.getPackageManager().getPackageInfo(pVar.f6268c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f6264e.mo14884b(6, "The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    /* renamed from: b */
    public static <T> C3651r<T> m6615b() {
        f6264e.mo14884b(6, "onError(%d)", new Object[]{-9});
        return C1960d.m2805i(new C3570a(-9));
    }
}
