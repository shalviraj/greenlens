package p005b.p096l.p180d.p185o.p189e0;

import p005b.p096l.p097a.p113c.p119b.p124n.C1955a;
import p005b.p096l.p097a.p113c.p150j.C3420d;
import p005b.p096l.p180d.C3837k;

/* renamed from: b.l.d.o.e0.i */
public final class C3880i implements C3420d {

    /* renamed from: a */
    public final /* synthetic */ C3882j f7142a;

    public C3880i(C3882j jVar) {
        this.f7142a = jVar;
    }

    /* renamed from: b */
    public final void mo12749b(Exception exc) {
        long j;
        if (exc instanceof C3837k) {
            C1955a aVar = C3884k.f7157h;
            aVar.mo12285d("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            C3884k kVar = this.f7142a.f7144h;
            int i = (int) kVar.f7160c;
            if (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) {
                long j2 = kVar.f7160c;
                j = j2 + j2;
            } else {
                j = i != 960 ? 30 : 960;
            }
            kVar.f7160c = j;
            kVar.f7159b = (kVar.f7160c * 1000) + System.currentTimeMillis();
            long j3 = kVar.f7159b;
            StringBuilder sb = new StringBuilder(43);
            sb.append("Scheduling refresh for ");
            sb.append(j3);
            aVar.mo12285d(sb.toString(), new Object[0]);
            kVar.f7163f.postDelayed(kVar.f7164g, kVar.f7160c * 1000);
        }
    }
}
