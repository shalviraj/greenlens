package p005b.p006a.p007a.p023n;

import android.content.SharedPreferences;
import p005b.p038f.p039a.C0849e;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.n.f */
public final class C0817f {

    /* renamed from: a */
    public static final SharedPreferences f640a;

    /* renamed from: b */
    public static final C0817f f641b = null;

    static {
        SharedPreferences sharedPreferences = C0849e.m505a().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        C6888i.m12437d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        f640a = sharedPreferences;
    }

    /* renamed from: a */
    public static final void m293a(String str) {
        C6888i.m12438e(str, "key");
        f640a.edit().remove(str).apply();
    }

    /* renamed from: b */
    public static final String m294b(String str) {
        C6888i.m12438e(str, "key");
        return f640a.getString(str, "");
    }

    /* renamed from: c */
    public static final boolean m295c(String str) {
        C6888i.m12438e(str, "key");
        return f640a.getBoolean(str, false);
    }

    /* renamed from: d */
    public static final int m296d(String str) {
        C6888i.m12438e(str, "key");
        return f640a.getInt(str, 0);
    }

    /* renamed from: e */
    public static final void m297e(String str) {
        C6888i.m12438e(str, "key");
        f640a.edit().putBoolean(str, true).apply();
    }

    /* renamed from: f */
    public static final void m298f(String str, String str2) {
        C6888i.m12438e(str, "key");
        C6888i.m12438e(str2, "value");
        f640a.edit().putString(str, str2).apply();
    }
}
