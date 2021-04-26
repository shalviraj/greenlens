package p005b.p096l.p097a.p113c.p131e.p140i;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.core.content.PermissionChecker;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.i.d3 */
public final class C2752d3 {
    @GuardedBy("GservicesLoader.class")

    /* renamed from: c */
    public static C2752d3 f4683c;

    /* renamed from: a */
    public final Context f4684a;

    /* renamed from: b */
    public final ContentObserver f4685b;

    public C2752d3() {
        this.f4684a = null;
        this.f4685b = null;
    }

    public C2752d3(Context context) {
        this.f4684a = context;
        C2738c3 c3Var = new C2738c3();
        this.f4685b = c3Var;
        context.getContentResolver().registerContentObserver(C2974u2.f5054a, true, c3Var);
    }

    /* renamed from: a */
    public static C2752d3 m4707a(Context context) {
        C2752d3 d3Var;
        synchronized (C2752d3.class) {
            if (f4683c == null) {
                f4683c = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C2752d3(context) : new C2752d3();
            }
            d3Var = f4683c;
        }
        return d3Var;
    }

    /* renamed from: b */
    public final String mo13290b(String str) {
        if (this.f4684a == null) {
            return null;
        }
        try {
            return (String) C1960d.m2787d1(new C2724b3(this, str));
        } catch (IllegalStateException | SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }
}
