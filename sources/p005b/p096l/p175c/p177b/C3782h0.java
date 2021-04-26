package p005b.p096l.p175c.p177b;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p175c.p177b.C3774g0;
import p005b.p096l.p175c.p177b.C3792o;

/* renamed from: b.l.c.b.h0 */
public class C3782h0 implements Iterator<C3792o.C3793a<E>> {

    /* renamed from: g */
    public C3774g0.C3779c<E> f6982g;

    /* renamed from: h */
    public C3792o.C3793a<E> f6983h;

    /* renamed from: i */
    public final /* synthetic */ C3774g0 f6984i;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r6.f6963l.mo15262a(r0.f6971a) != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r6.f6952i.compare(r2, r0.f6971a) == 0) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3782h0(p005b.p096l.p175c.p177b.C3774g0 r6) {
        /*
            r5 = this;
            r5.f6984i = r6
            r5.<init>()
            b.l.c.b.g0$d<b.l.c.b.g0$c<E>> r0 = r6.f6962k
            T r0 = r0.f6980a
            b.l.c.b.g0$c r0 = (p005b.p096l.p175c.p177b.C3774g0.C3779c) r0
            r1 = 0
            if (r0 != 0) goto L_0x000f
            goto L_0x0045
        L_0x000f:
            b.l.c.b.l<E> r2 = r6.f6963l
            boolean r3 = r2.f6992k
            if (r3 == 0) goto L_0x0033
            T r2 = r2.f6993l
            java.util.Comparator<? super E> r3 = r6.f6952i
            b.l.c.b.g0$c r0 = r0.mo15225h(r3, r2)
            if (r0 != 0) goto L_0x0020
            goto L_0x0045
        L_0x0020:
            b.l.c.b.l<E> r3 = r6.f6963l
            b.l.c.b.f r3 = r3.f6994m
            b.l.c.b.f r4 = p005b.p096l.p175c.p177b.C3771f.OPEN
            if (r3 != r4) goto L_0x0037
            java.util.Comparator<? super E> r3 = r6.f6952i
            E r4 = r0.f6971a
            int r2 = r3.compare(r2, r4)
            if (r2 != 0) goto L_0x0037
            goto L_0x0035
        L_0x0033:
            b.l.c.b.g0$c<E> r0 = r6.f6964m
        L_0x0035:
            b.l.c.b.g0$c<E> r0 = r0.f6978h
        L_0x0037:
            b.l.c.b.g0$c<E> r2 = r6.f6964m
            if (r0 == r2) goto L_0x0045
            b.l.c.b.l<E> r6 = r6.f6963l
            E r2 = r0.f6971a
            boolean r6 = r6.mo15262a(r2)
            if (r6 != 0) goto L_0x0046
        L_0x0045:
            r0 = r1
        L_0x0046:
            r5.f6982g = r0
            r5.f6983h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p175c.p177b.C3782h0.<init>(b.l.c.b.g0):void");
    }

    public boolean hasNext() {
        C3774g0.C3779c<E> cVar = this.f6982g;
        if (cVar == null) {
            return false;
        }
        if (!this.f6984i.f6963l.mo15265d(cVar.f6971a)) {
            return true;
        }
        this.f6982g = null;
        return false;
    }

    public Object next() {
        if (hasNext()) {
            C3774g0 g0Var = this.f6984i;
            C3774g0.C3779c<E> cVar = this.f6982g;
            Objects.requireNonNull(g0Var);
            C3772f0 f0Var = new C3772f0(g0Var, cVar);
            this.f6983h = f0Var;
            C3774g0.C3779c<E> cVar2 = this.f6982g.f6978h;
            if (cVar2 == this.f6984i.f6964m) {
                cVar2 = null;
            }
            this.f6982g = cVar2;
            return f0Var;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        C1960d.m2873z(this.f6983h != null);
        this.f6984i.mo15209E(this.f6983h.mo15201d(), 0);
        this.f6983h = null;
    }
}
