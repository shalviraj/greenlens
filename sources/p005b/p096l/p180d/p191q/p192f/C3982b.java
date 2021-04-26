package p005b.p096l.p180d.p191q.p192f;

import android.util.Log;

/* renamed from: b.l.d.q.f.b */
public class C3982b {

    /* renamed from: a */
    public static final C3982b f7289a = new C3982b("FirebaseCrashlytics");

    public C3982b(String str) {
    }

    /* renamed from: a */
    public final boolean mo15495a(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    /* renamed from: b */
    public void mo15496b(String str) {
        if (mo15495a(3)) {
            Log.d("FirebaseCrashlytics", str, (Throwable) null);
        }
    }

    /* renamed from: c */
    public void mo15497c(String str) {
        if (mo15495a(6)) {
            Log.e("FirebaseCrashlytics", str, (Throwable) null);
        }
    }

    /* renamed from: d */
    public void mo15498d(String str, Throwable th) {
        if (mo15495a(6)) {
            Log.e("FirebaseCrashlytics", str, th);
        }
    }

    /* renamed from: e */
    public void mo15499e(String str) {
        if (mo15495a(2)) {
            Log.v("FirebaseCrashlytics", str, (Throwable) null);
        }
    }

    /* renamed from: f */
    public void mo15500f(String str) {
        if (mo15495a(5)) {
            Log.w("FirebaseCrashlytics", str, (Throwable) null);
        }
    }

    /* renamed from: g */
    public void mo15501g(String str, Throwable th) {
        if (mo15495a(5)) {
            Log.w("FirebaseCrashlytics", str, th);
        }
    }
}
