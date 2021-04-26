package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: b.l.a.c.e.e.pj */
public final class C2410pj {

    /* renamed from: a */
    public static final Map<String, C2386oj> f4205a = new ArrayMap();

    /* renamed from: b */
    public static final Map<String, WeakReference<C2625yi>> f4206b = new ArrayMap();

    @NonNull
    /* renamed from: a */
    public static String m4011a(String str) {
        C2386oj ojVar;
        Map<String, C2386oj> map = f4205a;
        synchronized (map) {
            ojVar = map.get(str);
        }
        if (ojVar == null) {
            return String.valueOf("https://").concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
        }
        throw null;
    }
}
