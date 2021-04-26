package p005b.p040g.p041a.p042e;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b.g.a.e.d */
public class C0857d {

    /* renamed from: a */
    public Map<String, Object> f719a;

    public C0857d(Map<String, Object> map) {
        if (map != null) {
            this.f719a = new HashMap(map);
            return;
        }
        throw new IllegalArgumentException("Must provide non-null parameters");
    }

    /* renamed from: b */
    public static C0857d m561b() {
        return new C0857d(new HashMap());
    }

    /* renamed from: a */
    public Map<String, Object> mo10692a() {
        return Collections.unmodifiableMap(new HashMap(this.f719a));
    }
}
