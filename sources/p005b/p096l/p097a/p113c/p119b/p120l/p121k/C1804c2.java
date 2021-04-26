package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p005b.p096l.p097a.p113c.p119b.p120l.C1781b;
import p005b.p096l.p097a.p113c.p150j.C3429i;

/* renamed from: b.l.a.c.b.l.k.c2 */
public final class C1804c2 {

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f3156a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    public final Map<C3429i<?>, Boolean> f3157b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: a */
    public final void mo12071a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f3156a) {
            hashMap = new HashMap(this.f3156a);
        }
        synchronized (this.f3157b) {
            hashMap2 = new HashMap(this.f3157b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo18867h(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C3429i) entry2.getKey()).mo14701a(new C1781b(status));
            }
        }
    }
}
