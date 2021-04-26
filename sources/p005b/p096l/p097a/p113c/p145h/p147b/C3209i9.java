package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.ArrayList;
import java.util.List;
import p005b.p096l.p097a.p113c.p131e.p140i.C2908p1;
import p005b.p096l.p097a.p113c.p131e.p140i.C3012x1;

/* renamed from: b.l.a.c.h.b.i9 */
public final class C3209i9 {

    /* renamed from: a */
    public C3012x1 f5615a;

    /* renamed from: b */
    public List<Long> f5616b;

    /* renamed from: c */
    public List<C2908p1> f5617c;

    /* renamed from: d */
    public long f5618d;

    /* renamed from: e */
    public final /* synthetic */ C3220j9 f5619e;

    public /* synthetic */ C3209i9(C3220j9 j9Var) {
        this.f5619e = j9Var;
    }

    /* renamed from: a */
    public final boolean mo14285a(long j, C2908p1 p1Var) {
        if (this.f5617c == null) {
            this.f5617c = new ArrayList();
        }
        if (this.f5616b == null) {
            this.f5616b = new ArrayList();
        }
        if (this.f5617c.size() > 0 && ((this.f5617c.get(0).mo13559x() / 1000) / 60) / 60 != ((p1Var.mo13559x() / 1000) / 60) / 60) {
            return false;
        }
        long b = this.f5618d + ((long) p1Var.mo13540b());
        this.f5619e.mo14341G();
        if (b >= ((long) Math.max(0, C3134c3.f5386i.mo14064a(null).intValue()))) {
            return false;
        }
        this.f5618d = b;
        this.f5617c.add(p1Var);
        this.f5616b.add(Long.valueOf(j));
        int size = this.f5617c.size();
        this.f5619e.mo14341G();
        if (size >= Math.max(1, C3134c3.f5388j.mo14064a(null).intValue())) {
            return false;
        }
        return true;
    }
}
