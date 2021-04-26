package p298d.p414b0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.b0.e */
public final class C7662e<T> implements C7668h<T> {

    /* renamed from: a */
    public final C7668h<T> f15174a;

    /* renamed from: b */
    public final boolean f15175b;

    /* renamed from: c */
    public final C6862l<T, Boolean> f15176c;

    /* renamed from: d.b0.e$a */
    public static final class C7663a implements Iterator<T>, C6875a {

        /* renamed from: g */
        public final Iterator<T> f15177g;

        /* renamed from: h */
        public int f15178h = -1;

        /* renamed from: i */
        public T f15179i;

        /* renamed from: j */
        public final /* synthetic */ C7662e f15180j;

        public C7663a(C7662e eVar) {
            this.f15180j = eVar;
            this.f15177g = eVar.f15174a.iterator();
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo25253b() {
            /*
                r3 = this;
            L_0x0000:
                java.util.Iterator<T> r0 = r3.f15177g
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L_0x0028
                java.util.Iterator<T> r0 = r3.f15177g
                java.lang.Object r0 = r0.next()
                d.b0.e r1 = r3.f15180j
                d.x.b.l<T, java.lang.Boolean> r1 = r1.f15176c
                java.lang.Object r1 = r1.invoke(r0)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                d.b0.e r2 = r3.f15180j
                boolean r2 = r2.f15175b
                if (r1 != r2) goto L_0x0000
                r3.f15179i = r0
                r0 = 1
            L_0x0025:
                r3.f15178h = r0
                return
            L_0x0028:
                r0 = 0
                goto L_0x0025
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p414b0.C7662e.C7663a.mo25253b():void");
        }

        public boolean hasNext() {
            if (this.f15178h == -1) {
                mo25253b();
            }
            return this.f15178h == 1;
        }

        public T next() {
            if (this.f15178h == -1) {
                mo25253b();
            }
            if (this.f15178h != 0) {
                T t = this.f15179i;
                this.f15179i = null;
                this.f15178h = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C7662e(C7668h<? extends T> hVar, boolean z, C6862l<? super T, Boolean> lVar) {
        C6888i.m12438e(hVar, "sequence");
        C6888i.m12438e(lVar, "predicate");
        this.f15174a = hVar;
        this.f15175b = z;
        this.f15176c = lVar;
    }

    public Iterator<T> iterator() {
        return new C7663a(this);
    }
}
