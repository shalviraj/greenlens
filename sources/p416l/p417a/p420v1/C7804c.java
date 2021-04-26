package p416l.p417a.p420v1;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import p298d.p337v.C6827f;
import p416l.p417a.C7703b0;
import p416l.p417a.C7755q0;

/* renamed from: l.a.v1.c */
public class C7804c extends C7755q0 {

    /* renamed from: h */
    public C7800a f15398h;

    /* renamed from: i */
    public final int f15399i;

    /* renamed from: j */
    public final int f15400j;

    /* renamed from: k */
    public final long f15401k;

    /* renamed from: l */
    public final String f15402l;

    public C7804c(int i, int i2, String str, int i3) {
        int i4 = (i3 & 1) != 0 ? C7813l.f15415b : i;
        int i5 = (i3 & 2) != 0 ? C7813l.f15416c : i2;
        String str2 = (i3 & 4) != 0 ? "DefaultDispatcher" : null;
        long j = C7813l.f15417d;
        this.f15399i = i4;
        this.f15400j = i5;
        this.f15401k = j;
        this.f15402l = str2;
        this.f15398h = new C7800a(i4, i5, j, str2);
    }

    /* renamed from: n0 */
    public void mo25402n0(C6827f fVar, Runnable runnable) {
        try {
            C7800a aVar = this.f15398h;
            AtomicLongFieldUpdater atomicLongFieldUpdater = C7800a.f15371n;
            aVar.mo25484z(runnable, C7808g.f15410g, false);
        } catch (RejectedExecutionException unused) {
            C7703b0.f15242n.mo25409w0(runnable);
        }
    }
}
