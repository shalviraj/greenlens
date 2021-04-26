package p416l.p417a;

import java.util.Objects;
import p298d.p334t.C6790h;
import p416l.p417a.p419u1.C7771a;

/* renamed from: l.a.l0 */
public abstract class C7737l0 extends C7815w {

    /* renamed from: h */
    public long f15280h;

    /* renamed from: i */
    public boolean f15281i;

    /* renamed from: j */
    public C7771a<C7722g0<?>> f15282j;

    /* renamed from: p0 */
    public final void mo25394p0(boolean z) {
        long q0 = this.f15280h - mo25395q0(z);
        this.f15280h = q0;
        if (q0 <= 0 && this.f15281i) {
            shutdown();
        }
    }

    /* renamed from: q0 */
    public final long mo25395q0(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* renamed from: r0 */
    public final void mo25396r0(C7722g0<?> g0Var) {
        C7771a<C7722g0<?>> aVar = this.f15282j;
        if (aVar == null) {
            aVar = new C7771a<>();
            this.f15282j = aVar;
        }
        Object[] objArr = aVar.f15321a;
        int i = aVar.f15323c;
        objArr[i] = g0Var;
        int length = (objArr.length - 1) & (i + 1);
        aVar.f15323c = length;
        int i2 = aVar.f15322b;
        if (length == i2) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[(length2 << 1)];
            C6790h.m12354h(objArr, objArr2, 0, i2, 0, 10);
            Object[] objArr3 = aVar.f15321a;
            int length3 = objArr3.length;
            int i3 = aVar.f15322b;
            C6790h.m12354h(objArr3, objArr2, length3 - i3, 0, i3, 4);
            aVar.f15321a = objArr2;
            aVar.f15322b = 0;
            aVar.f15323c = length2;
        }
    }

    /* renamed from: s0 */
    public final void mo25397s0(boolean z) {
        this.f15280h = mo25395q0(z) + this.f15280h;
        if (!z) {
            this.f15281i = true;
        }
    }

    public void shutdown() {
    }

    /* renamed from: t0 */
    public final boolean mo25399t0() {
        return this.f15280h >= mo25395q0(true);
    }

    /* renamed from: u0 */
    public final boolean mo25400u0() {
        C7771a<C7722g0<?>> aVar = this.f15282j;
        if (aVar != null) {
            int i = aVar.f15322b;
            Object obj = null;
            if (i != aVar.f15323c) {
                Object[] objArr = aVar.f15321a;
                Object obj2 = objArr[i];
                objArr[i] = null;
                aVar.f15322b = (i + 1) & (objArr.length - 1);
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type T");
                obj = obj2;
            }
            C7722g0 g0Var = (C7722g0) obj;
            if (g0Var != null) {
                g0Var.run();
                return true;
            }
        }
        return false;
    }
}
