package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p120l.C1789h;

/* renamed from: b.l.a.c.b.l.k.o1 */
public final class C1850o1 {

    /* renamed from: d */
    public static final Status f3267d = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: e */
    public static final BasePendingResult<?>[] f3268e = new BasePendingResult[0];

    /* renamed from: a */
    public final Set<BasePendingResult<?>> f3269a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b */
    public final C1854p1 f3270b = new C1847n1(this);

    /* renamed from: c */
    public final Map<C1770a.C1773c<?>, C1770a.C1779f> f3271c;

    public C1850o1(Map<C1770a.C1773c<?>, C1770a.C1779f> map) {
        this.f3271c = map;
    }

    /* renamed from: a */
    public final void mo12156a() {
        boolean z;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f3269a.toArray(f3268e)) {
            basePendingResult.f11293g.set((Object) null);
            synchronized (basePendingResult.f11287a) {
                if (((GoogleApiClient) basePendingResult.f11289c.get()) == null || !basePendingResult.f11299m) {
                    basePendingResult.mo18862a();
                }
                synchronized (basePendingResult.f11287a) {
                    z = basePendingResult.f11297k;
                }
            }
            if (z) {
                this.f3269a.remove(basePendingResult);
            }
        }
    }

    /* renamed from: b */
    public final void mo12157b(BasePendingResult<? extends C1789h> basePendingResult) {
        this.f3269a.add(basePendingResult);
        basePendingResult.f11293g.set(this.f3270b);
    }
}
