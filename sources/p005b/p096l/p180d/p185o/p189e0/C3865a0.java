package p005b.p096l.p180d.p185o.p189e0;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: b.l.d.o.e0.a0 */
public final class C3865a0 {

    /* renamed from: a */
    public static final C3865a0 f7114a = new C3865a0();

    /* renamed from: a */
    public static void m7252a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String remove : sharedPreferences.getAll().keySet()) {
            edit.remove(remove);
        }
        edit.apply();
    }

    /* renamed from: b */
    public static final SharedPreferences m7253b(Context context, String str) {
        return context.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", new Object[]{str}), 0);
    }
}
