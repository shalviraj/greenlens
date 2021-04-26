package p005b.p082j.p083a.p084a.p090t;

import java.io.Serializable;
import p005b.p082j.p083a.p084a.C1517d;
import p005b.p082j.p083a.p084a.C1527l;
import p005b.p082j.p083a.p084a.C1528m;
import p005b.p082j.p083a.p084a.p087q.C1543h;

/* renamed from: b.j.a.a.t.e */
public class C1563e implements C1527l, Object<C1563e> {

    /* renamed from: m */
    public static final C1543h f2619m = new C1543h(" ");

    /* renamed from: g */
    public C1564a f2620g = C1562d.f2615k;

    /* renamed from: h */
    public final C1528m f2621h;

    /* renamed from: i */
    public boolean f2622i = true;

    /* renamed from: j */
    public transient int f2623j;

    /* renamed from: k */
    public C1567g f2624k;

    /* renamed from: l */
    public String f2625l;

    /* renamed from: b.j.a.a.t.e$a */
    public interface C1564a {
        /* renamed from: a */
        void mo11692a(C1517d dVar, int i);

        boolean isInline();
    }

    /* renamed from: b.j.a.a.t.e$b */
    public static class C1565b implements C1564a, Serializable {
    }

    public C1563e() {
        C1543h hVar = f2619m;
        this.f2621h = hVar;
        this.f2624k = C1527l.f2407a;
        this.f2625l = " : ";
    }

    /* renamed from: a */
    public void mo11694a(C1517d dVar, int i) {
        if (!this.f2620g.isInline()) {
            this.f2623j--;
        }
        if (i > 0) {
            this.f2620g.mo11692a(dVar, this.f2623j);
        } else {
            dVar.mo11472n0(' ');
        }
        dVar.mo11472n0('}');
    }
}
