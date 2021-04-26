package p298d.p415c0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import p298d.C6768j;
import p298d.p333a0.C6758d;
import p298d.p333a0.C6759e;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.p347a0.C6875a;
import p298d.p414b0.C7668h;

/* renamed from: d.c0.b */
public final class C7686b implements C7668h<C6758d> {

    /* renamed from: a */
    public final CharSequence f15214a;

    /* renamed from: b */
    public final int f15215b;

    /* renamed from: c */
    public final int f15216c;

    /* renamed from: d */
    public final C6866p<CharSequence, Integer, C6768j<Integer, Integer>> f15217d;

    /* renamed from: d.c0.b$a */
    public static final class C7687a implements Iterator<C6758d>, C6875a {

        /* renamed from: g */
        public int f15218g = -1;

        /* renamed from: h */
        public int f15219h;

        /* renamed from: i */
        public int f15220i;

        /* renamed from: j */
        public C6758d f15221j;

        /* renamed from: k */
        public int f15222k;

        /* renamed from: l */
        public final /* synthetic */ C7686b f15223l;

        public C7687a(C7686b bVar) {
            this.f15223l = bVar;
            int a = C6759e.m12305a(bVar.f15215b, 0, bVar.f15214a.length());
            this.f15219h = a;
            this.f15220i = a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r6 < r3) goto L_0x001b;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo25273b() {
            /*
                r7 = this;
                int r0 = r7.f15220i
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r7.f15218g = r1
                r0 = 0
                r7.f15221j = r0
                goto L_0x007e
            L_0x000c:
                d.c0.b r2 = r7.f15223l
                int r3 = r2.f15216c
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L_0x001b
                int r6 = r7.f15222k
                int r6 = r6 + r5
                r7.f15222k = r6
                if (r6 >= r3) goto L_0x0023
            L_0x001b:
                java.lang.CharSequence r2 = r2.f15214a
                int r2 = r2.length()
                if (r0 <= r2) goto L_0x0033
            L_0x0023:
                int r0 = r7.f15219h
                d.a0.d r1 = new d.a0.d
                d.c0.b r2 = r7.f15223l
                java.lang.CharSequence r2 = r2.f15214a
                int r2 = p298d.p415c0.C7694h.m13929g(r2)
                r1.<init>(r0, r2)
                goto L_0x0056
            L_0x0033:
                d.c0.b r0 = r7.f15223l
                d.x.b.p<java.lang.CharSequence, java.lang.Integer, d.j<java.lang.Integer, java.lang.Integer>> r2 = r0.f15217d
                java.lang.CharSequence r0 = r0.f15214a
                int r3 = r7.f15220i
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r2.invoke(r0, r3)
                d.j r0 = (p298d.C6768j) r0
                if (r0 != 0) goto L_0x005b
                int r0 = r7.f15219h
                d.a0.d r1 = new d.a0.d
                d.c0.b r2 = r7.f15223l
                java.lang.CharSequence r2 = r2.f15214a
                int r2 = p298d.p415c0.C7694h.m13929g(r2)
                r1.<init>(r0, r2)
            L_0x0056:
                r7.f15221j = r1
                r7.f15220i = r4
                goto L_0x007c
            L_0x005b:
                A r2 = r0.f13681g
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f13682h
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f15219h
                d.a0.d r3 = p298d.p333a0.C6759e.m12308d(r3, r2)
                r7.f15221j = r3
                int r2 = r2 + r0
                r7.f15219h = r2
                if (r0 != 0) goto L_0x0079
                r1 = r5
            L_0x0079:
                int r2 = r2 + r1
                r7.f15220i = r2
            L_0x007c:
                r7.f15218g = r5
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p415c0.C7686b.C7687a.mo25273b():void");
        }

        public boolean hasNext() {
            if (this.f15218g == -1) {
                mo25273b();
            }
            return this.f15218g == 1;
        }

        public Object next() {
            if (this.f15218g == -1) {
                mo25273b();
            }
            if (this.f15218g != 0) {
                C6758d dVar = this.f15221j;
                Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f15221j = null;
                this.f15218g = -1;
                return dVar;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C7686b(CharSequence charSequence, int i, int i2, C6866p<? super CharSequence, ? super Integer, C6768j<Integer, Integer>> pVar) {
        C6888i.m12438e(charSequence, "input");
        C6888i.m12438e(pVar, "getNextMatch");
        this.f15214a = charSequence;
        this.f15215b = i;
        this.f15216c = i2;
        this.f15217d = pVar;
    }

    public Iterator<C6758d> iterator() {
        return new C7687a(this);
    }
}
