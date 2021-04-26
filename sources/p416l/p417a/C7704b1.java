package p416l.p417a;

import kotlin.Metadata;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\n8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, mo24462d2 = {"Ll/a/b1;", "Ll/a/s;", "Ll/a/i0;", "Ll/a/t0;", "Ld/r;", "dispose", "()V", "", "toString", "()Ljava/lang/String;", "", "d", "()Z", "isActive", "Ll/a/h1;", "e", "()Ll/a/h1;", "list", "Ll/a/c1;", "j", "Ll/a/c1;", "n", "()Ll/a/c1;", "setJob", "(Ll/a/c1;)V", "job", "<init>", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: l.a.b1 */
public abstract class C7704b1 extends C7760s implements C7728i0, C7765t0 {

    /* renamed from: j */
    public C7707c1 f15243j;

    /* renamed from: d */
    public boolean mo25318d() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x000c A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispose() {
        /*
            r4 = this;
            l.a.c1 r0 = r4.f15243j
            if (r0 == 0) goto L_0x002a
        L_0x0004:
            java.lang.Object r1 = r0.mo25346s()
            boolean r2 = r1 instanceof p416l.p417a.C7704b1
            if (r2 == 0) goto L_0x001a
            if (r1 == r4) goto L_0x000f
            goto L_0x0029
        L_0x000f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p416l.p417a.C7707c1.f15245g
            l.a.k0 r3 = p416l.p417a.C7714d1.f15263g
            boolean r1 = r2.compareAndSet(r0, r1, r3)
            if (r1 == 0) goto L_0x0004
            goto L_0x0029
        L_0x001a:
            boolean r0 = r1 instanceof p416l.p417a.C7765t0
            if (r0 == 0) goto L_0x0029
            l.a.t0 r1 = (p416l.p417a.C7765t0) r1
            l.a.h1 r0 = r1.mo25320e()
            if (r0 == 0) goto L_0x0029
            r4.mo25449l()
        L_0x0029:
            return
        L_0x002a:
            java.lang.String r0 = "job"
            p298d.p344x.p346c.C6888i.m12446m(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.C7704b1.dispose():void");
    }

    /* renamed from: e */
    public C7726h1 mo25320e() {
        return null;
    }

    /* renamed from: n */
    public final C7707c1 mo25321n() {
        C7707c1 c1Var = this.f15243j;
        if (c1Var != null) {
            return c1Var;
        }
        C6888i.m12446m("job");
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(C5266a.m10027s1(this));
        sb.append("[job@");
        C7707c1 c1Var = this.f15243j;
        if (c1Var != null) {
            sb.append(C5266a.m10027s1(c1Var));
            sb.append(']');
            return sb.toString();
        }
        C6888i.m12446m("job");
        throw null;
    }
}
