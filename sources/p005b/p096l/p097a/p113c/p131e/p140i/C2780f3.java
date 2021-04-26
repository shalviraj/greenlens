package p005b.p096l.p097a.p113c.p131e.p140i;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;

/* renamed from: b.l.a.c.e.i.f3 */
public final class C2780f3 {

    /* renamed from: a */
    public static volatile C2949s3<Boolean> f4719a = C2936r3.f4976g;

    /* renamed from: b */
    public static final Object f4720b = new Object();

    /* renamed from: a */
    public static boolean m4747a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        }
        if (!f4719a.mo13607a()) {
            synchronized (f4720b) {
                if (f4719a.mo13607a()) {
                    boolean booleanValue = f4719a.mo13608b().booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0);
                    if (resolveContentProvider != null) {
                        if (!"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        }
                    }
                    f4719a = new C2962t3(Boolean.valueOf(z));
                }
                try {
                    if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                f4719a = new C2962t3(Boolean.valueOf(z));
            }
        }
        return f4719a.mo13608b().booleanValue();
    }
}
