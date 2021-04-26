package p005b.p096l.p097a.p113c.p119b.p128q;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.b.q.a */
public class C1967a {

    /* renamed from: a */
    public final Context f3529a;

    public C1967a(Context context) {
        this.f3529a = context;
    }

    /* renamed from: a */
    public ApplicationInfo mo12293a(String str, int i) {
        return this.f3529a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: b */
    public PackageInfo mo12294b(String str, int i) {
        return this.f3529a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: c */
    public boolean mo12295c() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C1960d.m2826n0(this.f3529a);
        }
        if (!C1960d.m2806i0() || (nameForUid = this.f3529a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f3529a.getPackageManager().isInstantApp(nameForUid);
    }
}
