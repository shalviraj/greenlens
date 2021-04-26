package p005b.p096l.p180d.p191q.p192f.p195g;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p005b.p096l.p180d.p191q.p192f.C3982b;

/* renamed from: b.l.d.q.f.g.o0 */
public class C4028o0 {

    /* renamed from: a */
    public final Map<String, String> f7381a = new HashMap();

    /* renamed from: b.l.d.q.f.g.o0$a */
    public class C4029a extends HashMap<String, String> {

        /* renamed from: g */
        public final /* synthetic */ String f7382g;

        /* renamed from: h */
        public final /* synthetic */ String f7383h;

        public C4029a(C4028o0 o0Var, String str, String str2) {
            this.f7382g = str;
            this.f7383h = str2;
            if (str != null) {
                put(C4028o0.m7427a(str), C4028o0.m7427a(str2));
                return;
            }
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
    }

    /* renamed from: a */
    public static String m7427a(String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > 1024 ? trim.substring(0, 1024) : trim;
    }

    /* renamed from: b */
    public void mo15534b(String str, String str2) {
        C4029a aVar = new C4029a(this, str, str2);
        synchronized (this) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : aVar.entrySet()) {
                String str3 = (String) entry.getKey();
                if (str3 != null) {
                    String a = m7427a(str3);
                    String a2 = entry.getValue() == null ? "" : m7427a((String) entry.getValue());
                    if (this.f7381a.containsKey(a)) {
                        hashMap.put(a, a2);
                    } else {
                        hashMap2.put(a, a2);
                    }
                } else {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
            }
            this.f7381a.putAll(hashMap);
            if (this.f7381a.size() + hashMap2.size() > 64) {
                int size = 64 - this.f7381a.size();
                C3982b.f7289a.mo15499e("Exceeded maximum number of custom attributes (64).");
                hashMap2.keySet().retainAll(new ArrayList(hashMap2.keySet()).subList(0, size));
            }
            this.f7381a.putAll(hashMap2);
        }
    }
}
