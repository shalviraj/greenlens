package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.Map;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.p120l.C1782c;
import p005b.p096l.p097a.p113c.p150j.C3429i;

/* renamed from: b.l.a.c.b.l.k.u1 */
public final class C1869u1 {

    /* renamed from: a */
    public final ArrayMap<C1796b<?>, C1754b> f3308a;

    /* renamed from: b */
    public final ArrayMap<C1796b<?>, String> f3309b;

    /* renamed from: c */
    public final C3429i<Map<C1796b<?>, String>> f3310c;

    /* renamed from: d */
    public int f3311d;

    /* renamed from: e */
    public boolean f3312e;

    /* renamed from: a */
    public final void mo12164a(C1796b<?> bVar, C1754b bVar2, @Nullable String str) {
        this.f3308a.put(bVar, bVar2);
        this.f3309b.put(bVar, str);
        this.f3311d--;
        if (!bVar2.mo11986W()) {
            this.f3312e = true;
        }
        if (this.f3311d != 0) {
            return;
        }
        if (this.f3312e) {
            this.f3310c.f6197a.mo14694p(new C1782c(this.f3308a));
            return;
        }
        this.f3310c.f6197a.mo14695q(this.f3309b);
    }
}
