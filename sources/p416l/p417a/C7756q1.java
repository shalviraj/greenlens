package p416l.p417a;

import kotlin.Metadata;
import p005b.p291q.p292a.C5266a;
import p298d.p337v.C6824d;
import p298d.p337v.C6827f;
import p416l.p417a.p419u1.C7788o;
import p416l.p417a.p419u1.C7791r;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, mo24462d2 = {"Ll/a/q1;", "T", "Ll/a/u1/o;", "", "U", "()Z", "", "state", "Ld/r;", "L", "(Ljava/lang/Object;)V", "l", "Ljava/lang/Object;", "savedOldValue", "Ld/v/f;", "k", "Ld/v/f;", "savedContext", "context", "Ld/v/d;", "uCont", "<init>", "(Ld/v/f;Ld/v/d;)V", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: l.a.q1 */
public final class C7756q1<T> extends C7788o<T> {

    /* renamed from: k */
    public C6827f f15307k;

    /* renamed from: l */
    public Object f15308l;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7756q1(p298d.p337v.C6827f r3, p298d.p337v.C6824d<? super T> r4) {
        /*
            r2 = this;
            l.a.r1 r0 = p416l.p417a.C7759r1.f15312g
            d.v.f$a r1 = r3.get(r0)
            if (r1 != 0) goto L_0x000c
            d.v.f r3 = r3.plus(r0)
        L_0x000c:
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.C7756q1.<init>(d.v.f, d.v.d):void");
    }

    /* renamed from: L */
    public void mo25300L(Object obj) {
        C6827f fVar = this.f15307k;
        C7756q1<?> q1Var = null;
        if (fVar != null) {
            C7791r.m14155a(fVar, this.f15308l);
            this.f15307k = q1Var;
            this.f15308l = q1Var;
        }
        Object v3 = C5266a.m10047v3(obj, this.f15353j);
        C6824d<T> dVar = this.f15353j;
        C6827f context = dVar.getContext();
        Object b = C7791r.m14156b(context, q1Var);
        if (b != C7791r.f15356a) {
            q1Var = C7769u.m14115b(dVar, context, b);
        }
        try {
            this.f15353j.mo24166c(v3);
        } finally {
            if (q1Var == null || q1Var.mo25428U()) {
                C7791r.m14155a(context, b);
            }
        }
    }

    /* renamed from: U */
    public final boolean mo25428U() {
        if (this.f15307k == null) {
            return false;
        }
        this.f15307k = null;
        this.f15308l = null;
        return true;
    }
}
