package p005b.p096l.p097a.p113c.p119b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p122m.C1928m0;
import p005b.p096l.p097a.p113c.p119b.p122m.C1932n0;
import p005b.p096l.p097a.p113c.p119b.p122m.C1935o0;
import p005b.p096l.p097a.p113c.p129c.C1984d;

/* renamed from: b.l.a.c.b.t */
public final class C1971t {

    /* renamed from: a */
    public static volatile C1932n0 f3532a;

    /* renamed from: b */
    public static final Object f3533b = new Object();

    /* renamed from: c */
    public static Context f3534c;

    /* renamed from: a */
    public static C1757c0 m2886a(String str, C1972u uVar, boolean z, boolean z2) {
        C1932n0 n0Var;
        try {
            if (f3532a == null) {
                Objects.requireNonNull(f3534c, "null reference");
                synchronized (f3533b) {
                    if (f3532a == null) {
                        IBinder b = DynamiteModule.m10395c(f3534c, DynamiteModule.f11310j, "com.google.android.gms.googlecertificates").mo18876b("com.google.android.gms.common.GoogleCertificatesImpl");
                        int i = C1928m0.f3476a;
                        if (b == null) {
                            n0Var = null;
                        } else {
                            IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                            n0Var = queryLocalInterface instanceof C1932n0 ? (C1932n0) queryLocalInterface : new C1935o0(b);
                        }
                        f3532a = n0Var;
                    }
                }
            }
            Objects.requireNonNull(f3534c, "null reference");
            try {
                if (f3532a.mo12264E0(new C1753a0(str, uVar, z, z2), new C1984d(f3534c.getPackageManager()))) {
                    return C1757c0.f3100d;
                }
                return new C1762e0(new C1973v(z, str, uVar), (C1764f0) null);
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return new C1757c0(false, "module call", e);
            }
        } catch (DynamiteModule.C5474a e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String valueOf = String.valueOf(e2.getMessage());
            return new C1757c0(false, valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e2);
        }
    }
}
