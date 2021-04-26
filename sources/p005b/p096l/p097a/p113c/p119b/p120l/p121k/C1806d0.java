package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p122m.C1905d;

/* renamed from: b.l.a.c.b.l.k.d0 */
public final class C1806d0 extends C1825h0 {

    /* renamed from: h */
    public final ArrayList<C1770a.C1779f> f3160h;

    /* renamed from: i */
    public final /* synthetic */ C1876x f3161i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1806d0(C1876x xVar, ArrayList<C1770a.C1779f> arrayList) {
        super(xVar, (C1873w) null);
        this.f3161i = xVar;
        this.f3160h = arrayList;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo12075a() {
        Set<Scope> set;
        C1876x xVar = this.f3161i;
        C1834j0 j0Var = xVar.f3320a.f3288m;
        if (xVar.f3337r == null) {
            set = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet(xVar.f3337r.f3413b);
            Map<C1770a<?>, C1905d.C1907b> map = xVar.f3337r.f3415d;
            for (C1770a next : map.keySet()) {
                if (!xVar.f3320a.f3282g.containsKey(next.mo12012a())) {
                    Objects.requireNonNull(map.get(next));
                    hashSet.addAll((Collection) null);
                }
            }
            set = hashSet;
        }
        j0Var.f3250p = set;
        ArrayList<C1770a.C1779f> arrayList = this.f3160h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C1770a.C1779f fVar = arrayList.get(i);
            i++;
            C1876x xVar2 = this.f3161i;
            fVar.mo12022j(xVar2.f3334o, xVar2.f3320a.f3288m.f3250p);
        }
    }
}
