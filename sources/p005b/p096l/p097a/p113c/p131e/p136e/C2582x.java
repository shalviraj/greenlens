package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.Iterator;
import java.util.Map;

/* renamed from: b.l.a.c.e.e.x */
public final class C2582x {
    /* renamed from: a */
    public static final int m4363a(int i, Object obj, Object obj2) {
        C2558w wVar = (C2558w) obj;
        C2534v vVar = (C2534v) obj2;
        if (wVar.isEmpty()) {
            return 0;
        }
        Iterator it = wVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final Object m4364b(Object obj, Object obj2) {
        C2558w wVar = (C2558w) obj;
        C2558w wVar2 = (C2558w) obj2;
        if (!wVar2.isEmpty()) {
            if (!wVar.f4384g) {
                wVar = wVar.mo13070a();
            }
            wVar.mo13071c();
            if (!wVar2.isEmpty()) {
                wVar.putAll(wVar2);
            }
        }
        return wVar;
    }
}
