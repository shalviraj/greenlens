package p421m.p422m0.p427h;

import java.util.List;
import java.util.Objects;
import p005b.p291q.p292a.C5266a;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;
import p421m.C7826a0;
import p421m.C7829b0;
import p421m.C7839e0;
import p421m.C7844g0;
import p421m.C7850h0;
import p421m.C7855j0;
import p421m.C8008o;
import p421m.C8010q;
import p421m.C8022y;
import p421m.p422m0.C7867c;
import p435n.C8050m;

/* renamed from: m.m0.h.a */
public final class C7902a implements C7826a0 {

    /* renamed from: a */
    public final C8010q f15752a;

    public C7902a(C8010q qVar) {
        C6888i.m12438e(qVar, "cookieJar");
        this.f15752a = qVar;
    }

    /* renamed from: a */
    public C7850h0 mo18360a(C7826a0.C7827a aVar) {
        boolean z;
        C7855j0 j0Var;
        C7826a0.C7827a aVar2 = aVar;
        C6888i.m12438e(aVar2, "chain");
        C7909g gVar = (C7909g) aVar2;
        C7839e0 e0Var = gVar.f15764f;
        Objects.requireNonNull(e0Var);
        C7839e0.C7840a aVar3 = new C7839e0.C7840a(e0Var);
        C7844g0 g0Var = e0Var.f15531e;
        if (g0Var != null) {
            C7829b0 b = g0Var.mo25543b();
            if (b != null) {
                aVar3.mo25536b("Content-Type", b.f15449a);
            }
            long a = g0Var.mo25542a();
            if (a != -1) {
                aVar3.mo25536b("Content-Length", String.valueOf(a));
                aVar3.mo25539e("Transfer-Encoding");
            } else {
                aVar3.mo25536b("Transfer-Encoding", "chunked");
                aVar3.mo25539e("Content-Length");
            }
        }
        int i = 0;
        if (e0Var.mo25533b("Host") == null) {
            aVar3.mo25536b("Host", C7867c.m14303x(e0Var.f15528b, false));
        }
        if (e0Var.mo25533b("Connection") == null) {
            aVar3.mo25536b("Connection", "Keep-Alive");
        }
        if (e0Var.mo25533b("Accept-Encoding") == null && e0Var.mo25533b("Range") == null) {
            aVar3.mo25536b("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        List<C8008o> a2 = this.f15752a.mo25819a(e0Var.f15528b);
        if (!a2.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (T next : a2) {
                int i2 = i + 1;
                if (i >= 0) {
                    C8008o oVar = (C8008o) next;
                    if (i > 0) {
                        sb.append("; ");
                    }
                    sb.append(oVar.f16069a);
                    sb.append('=');
                    sb.append(oVar.f16070b);
                    i = i2;
                } else {
                    C6790h.m12333T();
                    throw null;
                }
            }
            String sb2 = sb.toString();
            C6888i.m12437d(sb2, "StringBuilder().apply(builderAction).toString()");
            aVar3.mo25536b("Cookie", sb2);
        }
        if (e0Var.mo25533b("User-Agent") == null) {
            aVar3.mo25536b("User-Agent", "okhttp/4.9.1");
        }
        C7850h0 c = gVar.mo25663c(aVar3.mo25535a());
        C7907e.m14394d(this.f15752a, e0Var.f15528b, c.f15554l);
        C7850h0.C7851a aVar4 = new C7850h0.C7851a(c);
        aVar4.mo25564g(e0Var);
        if (z && C7694h.m13928f("gzip", C7850h0.m14257d(c, "Content-Encoding", (String) null, 2), true) && C7907e.m14391a(c) && (j0Var = c.f15555m) != null) {
            C8050m mVar = new C8050m(j0Var.mo25567q());
            C8022y.C8023a n = c.f15554l.mo25841n();
            n.mo25847c("Content-Encoding");
            n.mo25847c("Content-Length");
            aVar4.mo25561d(n.mo25846b());
            aVar4.f15568g = new C7910h(C7850h0.m14257d(c, "Content-Type", (String) null, 2), -1, C5266a.m9812H(mVar));
        }
        return aVar4.mo25558a();
    }
}
