package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.app.PendingIntent;
import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.Map;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p122m.C1889b;
import p005b.p096l.p097a.p113c.p119b.p122m.C1927m;
import p005b.p096l.p097a.p113c.p148i.C3412e;

/* renamed from: b.l.a.c.b.l.k.y */
public final class C1879y extends C1825h0 {

    /* renamed from: h */
    public final Map<C1770a.C1779f, C1882z> f3355h;

    /* renamed from: i */
    public final /* synthetic */ C1876x f3356i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1879y(C1876x xVar, Map<C1770a.C1779f, C1882z> map) {
        super(xVar, (C1873w) null);
        this.f3356i = xVar;
        this.f3355h = map;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo12075a() {
        C3412e eVar;
        C1927m mVar = new C1927m(this.f3356i.f3323d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C1770a.C1779f next : this.f3355h.keySet()) {
            if (!next.mo12023m() || this.f3355h.get(next).f3360c) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                i = mVar.mo12262a(this.f3356i.f3322c, (C1770a.C1779f) obj);
                if (i != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                i = mVar.mo12262a(this.f3356i.f3322c, (C1770a.C1779f) obj2);
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            C1754b bVar = new C1754b(i, (PendingIntent) null);
            C1876x xVar = this.f3356i;
            C1853p0 p0Var = xVar.f3320a;
            p0Var.f3280e.sendMessage(p0Var.f3280e.obtainMessage(1, new C1797b0(this, xVar, bVar)));
            return;
        }
        C1876x xVar2 = this.f3356i;
        if (xVar2.f3332m && (eVar = xVar2.f3330k) != null) {
            eVar.mo14651c();
        }
        for (C1770a.C1779f next2 : this.f3355h.keySet()) {
            C1889b.C1892c cVar = this.f3355h.get(next2);
            if (!next2.mo12023m() || mVar.mo12262a(this.f3356i.f3322c, next2) == 0) {
                next2.mo12028r(cVar);
            } else {
                C1876x xVar3 = this.f3356i;
                C1853p0 p0Var2 = xVar3.f3320a;
                p0Var2.f3280e.sendMessage(p0Var2.f3280e.obtainMessage(1, new C1793a0(xVar3, cVar)));
            }
        }
    }
}
