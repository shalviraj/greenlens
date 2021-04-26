package p005b.p082j.p083a.p084a.p090t;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: b.j.a.a.t.f */
public final class C1566f extends ConcurrentHashMap<String, String> {

    /* renamed from: h */
    public static final C1566f f2626h = new C1566f();

    /* renamed from: g */
    public final Object f2627g = new Object();

    public C1566f() {
        super(BaseTransientBottomBar.ANIMATION_FADE_DURATION, 0.8f, 4);
    }

    /* renamed from: a */
    public String mo11695a(String str) {
        String str2 = (String) get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.f2627g) {
                if (size() >= 180) {
                    clear();
                }
            }
        }
        String intern = str.intern();
        put(intern, intern);
        return intern;
    }
}
