package p005b.p082j.p083a.p084a.p088r;

import java.util.Objects;
import p005b.p082j.p083a.p084a.C1516c;
import p005b.p082j.p083a.p084a.C1517d;
import p005b.p082j.p083a.p084a.C1526k;
import p005b.p082j.p083a.p084a.C1528m;
import p005b.p082j.p083a.p084a.p085o.C1530a;
import p005b.p082j.p083a.p084a.p087q.C1535a;
import p005b.p082j.p083a.p084a.p087q.C1537b;
import p005b.p082j.p083a.p084a.p090t.C1563e;
import p005b.p082j.p083a.p084a.p090t.C1571j;

/* renamed from: b.j.a.a.r.c */
public abstract class C1548c extends C1530a {

    /* renamed from: p */
    public static final int[] f2497p = C1535a.f2448h;

    /* renamed from: k */
    public final C1537b f2498k;

    /* renamed from: l */
    public int[] f2499l = f2497p;

    /* renamed from: m */
    public int f2500m;

    /* renamed from: n */
    public C1528m f2501n = C1563e.f2619m;

    /* renamed from: o */
    public boolean f2502o;

    public C1548c(C1537b bVar, int i, C1526k kVar) {
        super(i, kVar);
        this.f2498k = bVar;
        boolean z = false;
        if ((C1517d.C1518a.ESCAPE_NON_ASCII.f2358h & i) != 0) {
            this.f2500m = 127;
        }
        this.f2502o = !((C1517d.C1518a.QUOTE_FIELD_NAMES.f2358h & i) != 0 ? true : z);
    }

    /* renamed from: w0 */
    public void mo11567w0(String str) {
        throw new C1516c(String.format("Can not %s, expecting field name (context: %s)", new Object[]{str, this.f2410j.mo11507e()}), this);
    }

    /* renamed from: x0 */
    public void mo11568x0(String str, int i) {
        if (i != 0) {
            if (i == 1) {
                Objects.requireNonNull(((C1563e) this.f2345g).f2624k);
                mo11472n0(',');
                mo11472n0(' ');
            } else if (i == 2) {
                C1563e eVar = (C1563e) this.f2345g;
                if (eVar.f2622i) {
                    mo11474p0(eVar.f2625l);
                    return;
                }
                Objects.requireNonNull(eVar.f2624k);
                mo11472n0(':');
            } else if (i == 3) {
                C1528m mVar = ((C1563e) this.f2345g).f2621h;
                if (mVar != null) {
                    mo11473o0(mVar);
                }
            } else if (i != 5) {
                int i2 = C1571j.f2643a;
                throw new RuntimeException("Internal error: this code path should never get executed");
            } else {
                mo11567w0(str);
                throw null;
            }
        } else if (this.f2410j.mo11504b()) {
            Objects.requireNonNull((C1563e) this.f2345g);
            mo11472n0(' ');
        } else if (this.f2410j.mo11505c()) {
            C1563e eVar2 = (C1563e) this.f2345g;
            eVar2.f2620g.mo11692a(this, eVar2.f2623j);
        }
    }

    /* renamed from: y0 */
    public C1517d mo11569y0(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f2500m = i;
        return this;
    }
}
