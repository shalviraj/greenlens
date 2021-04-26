package p005b.p096l.p175c.p177b;

import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p175c.p177b.C3792o;

/* renamed from: b.l.c.b.g0 */
public final class C3774g0<E> extends C3769e<E> implements Serializable {

    /* renamed from: n */
    public static final /* synthetic */ int f6961n = 0;

    /* renamed from: k */
    public final transient C3780d<C3779c<E>> f6962k;

    /* renamed from: l */
    public final transient C3787l<E> f6963l;

    /* renamed from: m */
    public final transient C3779c<E> f6964m;

    /* renamed from: b.l.c.b.g0$a */
    public class C3775a implements Iterator<C3792o.C3793a<E>> {

        /* renamed from: g */
        public C3779c<E> f6965g;

        /* renamed from: h */
        public C3792o.C3793a<E> f6966h;

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
            if (r5.f6963l.mo15262a(r0.f6971a) != false) goto L_0x0045;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
            if (r5.f6952i.compare(r1, r0.f6971a) == 0) goto L_0x0034;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C3775a() {
            /*
                r4 = this;
                p005b.p096l.p175c.p177b.C3774g0.this = r5
                r4.<init>()
                b.l.c.b.g0$d<b.l.c.b.g0$c<E>> r0 = r5.f6962k
                T r0 = r0.f6980a
                b.l.c.b.g0$c r0 = (p005b.p096l.p175c.p177b.C3774g0.C3779c) r0
                if (r0 != 0) goto L_0x000e
                goto L_0x0044
            L_0x000e:
                b.l.c.b.l<E> r1 = r5.f6963l
                boolean r2 = r1.f6989h
                if (r2 == 0) goto L_0x0032
                T r1 = r1.f6990i
                java.util.Comparator<? super E> r2 = r5.f6952i
                b.l.c.b.g0$c r0 = r0.mo15222e(r2, r1)
                if (r0 != 0) goto L_0x001f
                goto L_0x0044
            L_0x001f:
                b.l.c.b.l<E> r2 = r5.f6963l
                b.l.c.b.f r2 = r2.f6991j
                b.l.c.b.f r3 = p005b.p096l.p175c.p177b.C3771f.OPEN
                if (r2 != r3) goto L_0x0036
                java.util.Comparator<? super E> r2 = r5.f6952i
                E r3 = r0.f6971a
                int r1 = r2.compare(r1, r3)
                if (r1 != 0) goto L_0x0036
                goto L_0x0034
            L_0x0032:
                b.l.c.b.g0$c<E> r0 = r5.f6964m
            L_0x0034:
                b.l.c.b.g0$c<E> r0 = r0.f6979i
            L_0x0036:
                b.l.c.b.g0$c<E> r1 = r5.f6964m
                if (r0 == r1) goto L_0x0044
                b.l.c.b.l<E> r5 = r5.f6963l
                E r1 = r0.f6971a
                boolean r5 = r5.mo15262a(r1)
                if (r5 != 0) goto L_0x0045
            L_0x0044:
                r0 = 0
            L_0x0045:
                r4.f6965g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p175c.p177b.C3774g0.C3775a.<init>(b.l.c.b.g0):void");
        }

        public boolean hasNext() {
            C3779c<E> cVar = this.f6965g;
            if (cVar == null) {
                return false;
            }
            if (!C3774g0.this.f6963l.mo15264c(cVar.f6971a)) {
                return true;
            }
            this.f6965g = null;
            return false;
        }

        public Object next() {
            if (hasNext()) {
                C3774g0 g0Var = C3774g0.this;
                C3779c<E> cVar = this.f6965g;
                Objects.requireNonNull(g0Var);
                C3772f0 f0Var = new C3772f0(g0Var, cVar);
                this.f6966h = f0Var;
                C3779c<E> cVar2 = this.f6965g.f6979i;
                if (cVar2 == C3774g0.this.f6964m) {
                    cVar2 = null;
                }
                this.f6965g = cVar2;
                return f0Var;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            C1960d.m2873z(this.f6966h != null);
            C3774g0.this.mo15209E(this.f6966h.mo15201d(), 0);
            this.f6966h = null;
        }
    }

    /* renamed from: b.l.c.b.g0$b */
    public enum C3776b {
        SIZE {
            /* renamed from: d */
            public int mo15216d(C3779c<?> cVar) {
                return cVar.f6972b;
            }

            /* renamed from: e */
            public long mo15217e(C3779c<?> cVar) {
                if (cVar == null) {
                    return 0;
                }
                return cVar.f6974d;
            }
        },
        DISTINCT {
            /* renamed from: d */
            public int mo15216d(C3779c<?> cVar) {
                return 1;
            }

            /* renamed from: e */
            public long mo15217e(C3779c<?> cVar) {
                if (cVar == null) {
                    return 0;
                }
                return (long) cVar.f6973c;
            }
        };

        /* access modifiers changed from: public */
        C3776b(C3772f0 f0Var) {
        }

        /* renamed from: d */
        public abstract int mo15216d(C3779c<?> cVar);

        /* renamed from: e */
        public abstract long mo15217e(C3779c<?> cVar);
    }

    /* renamed from: b.l.c.b.g0$c */
    public static final class C3779c<E> {

        /* renamed from: a */
        public final E f6971a;

        /* renamed from: b */
        public int f6972b;

        /* renamed from: c */
        public int f6973c;

        /* renamed from: d */
        public long f6974d;

        /* renamed from: e */
        public int f6975e;

        /* renamed from: f */
        public C3779c<E> f6976f;

        /* renamed from: g */
        public C3779c<E> f6977g;

        /* renamed from: h */
        public C3779c<E> f6978h;

        /* renamed from: i */
        public C3779c<E> f6979i;

        public C3779c(E e, int i) {
            C1960d.m2849t(i > 0);
            this.f6971a = e;
            this.f6972b = i;
            this.f6974d = (long) i;
            this.f6973c = 1;
            this.f6975e = 1;
            this.f6976f = null;
            this.f6977g = null;
        }

        /* renamed from: i */
        public static int m7119i(C3779c<?> cVar) {
            if (cVar == null) {
                return 0;
            }
            return cVar.f6975e;
        }

        /* renamed from: a */
        public C3779c<E> mo15218a(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int compare = comparator.compare(e, this.f6971a);
            boolean z = true;
            if (compare < 0) {
                C3779c<E> cVar = this.f6976f;
                if (cVar == null) {
                    iArr[0] = 0;
                    mo15219b(e, i);
                    return this;
                }
                int i2 = cVar.f6975e;
                C3779c<E> a = cVar.mo15218a(comparator, e, i, iArr);
                this.f6976f = a;
                if (iArr[0] == 0) {
                    this.f6973c++;
                }
                this.f6974d += (long) i;
                return a.f6975e == i2 ? this : mo15226j();
            } else if (compare > 0) {
                C3779c<E> cVar2 = this.f6977g;
                if (cVar2 == null) {
                    iArr[0] = 0;
                    mo15220c(e, i);
                    return this;
                }
                int i3 = cVar2.f6975e;
                C3779c<E> a2 = cVar2.mo15218a(comparator, e, i, iArr);
                this.f6977g = a2;
                if (iArr[0] == 0) {
                    this.f6973c++;
                }
                this.f6974d += (long) i;
                return a2.f6975e == i3 ? this : mo15226j();
            } else {
                int i4 = this.f6972b;
                iArr[0] = i4;
                long j = (long) i;
                if (((long) i4) + j > 2147483647L) {
                    z = false;
                }
                C1960d.m2849t(z);
                this.f6972b += i;
                this.f6974d += j;
                return this;
            }
        }

        /* renamed from: b */
        public final C3779c<E> mo15219b(E e, int i) {
            C3779c<E> cVar = new C3779c<>(e, i);
            this.f6976f = cVar;
            C3779c<E> cVar2 = this.f6978h;
            int i2 = C3774g0.f6961n;
            cVar2.f6979i = cVar;
            cVar.f6978h = cVar2;
            cVar.f6979i = this;
            this.f6978h = cVar;
            this.f6975e = Math.max(2, this.f6975e);
            this.f6973c++;
            this.f6974d += (long) i;
            return this;
        }

        /* renamed from: c */
        public final C3779c<E> mo15220c(E e, int i) {
            C3779c<E> cVar = new C3779c<>(e, i);
            this.f6977g = cVar;
            C3779c<E> cVar2 = this.f6979i;
            int i2 = C3774g0.f6961n;
            this.f6979i = cVar;
            cVar.f6978h = this;
            cVar.f6979i = cVar2;
            cVar2.f6978h = cVar;
            this.f6975e = Math.max(2, this.f6975e);
            this.f6973c++;
            this.f6974d += (long) i;
            return this;
        }

        /* renamed from: d */
        public final int mo15221d() {
            return m7119i(this.f6976f) - m7119i(this.f6977g);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
            r2 = r0.mo15222e(r2, r3);
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p005b.p096l.p175c.p177b.C3774g0.C3779c<E> mo15222e(java.util.Comparator<? super E> r2, E r3) {
            /*
                r1 = this;
                E r0 = r1.f6971a
                int r0 = r2.compare(r3, r0)
                if (r0 >= 0) goto L_0x0016
                b.l.c.b.g0$c<E> r0 = r1.f6976f
                if (r0 != 0) goto L_0x000d
                goto L_0x0014
            L_0x000d:
                b.l.c.b.g0$c r2 = r0.mo15222e(r2, r3)
                if (r2 == 0) goto L_0x0014
                goto L_0x0015
            L_0x0014:
                r2 = r1
            L_0x0015:
                return r2
            L_0x0016:
                if (r0 != 0) goto L_0x0019
                return r1
            L_0x0019:
                b.l.c.b.g0$c<E> r0 = r1.f6977g
                if (r0 != 0) goto L_0x001f
                r2 = 0
                goto L_0x0023
            L_0x001f:
                b.l.c.b.g0$c r2 = r0.mo15222e(r2, r3)
            L_0x0023:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p175c.p177b.C3774g0.C3779c.mo15222e(java.util.Comparator, java.lang.Object):b.l.c.b.g0$c");
        }

        /* renamed from: f */
        public int mo15223f(Comparator<? super E> comparator, E e) {
            int compare = comparator.compare(e, this.f6971a);
            if (compare < 0) {
                C3779c<E> cVar = this.f6976f;
                if (cVar == null) {
                    return 0;
                }
                return cVar.mo15223f(comparator, e);
            } else if (compare <= 0) {
                return this.f6972b;
            } else {
                C3779c<E> cVar2 = this.f6977g;
                if (cVar2 == null) {
                    return 0;
                }
                return cVar2.mo15223f(comparator, e);
            }
        }

        /* renamed from: g */
        public final C3779c<E> mo15224g() {
            int i = this.f6972b;
            this.f6972b = 0;
            C3779c<E> cVar = this.f6978h;
            C3779c<E> cVar2 = this.f6979i;
            int i2 = C3774g0.f6961n;
            cVar.f6979i = cVar2;
            cVar2.f6978h = cVar;
            C3779c<E> cVar3 = this.f6976f;
            if (cVar3 == null) {
                return this.f6977g;
            }
            C3779c<E> cVar4 = this.f6977g;
            if (cVar4 == null) {
                return cVar3;
            }
            if (cVar3.f6975e >= cVar4.f6975e) {
                C3779c<E> cVar5 = this.f6978h;
                cVar5.f6976f = cVar3.mo15230n(cVar5);
                cVar5.f6977g = this.f6977g;
                cVar5.f6973c = this.f6973c - 1;
                cVar5.f6974d = this.f6974d - ((long) i);
                return cVar5.mo15226j();
            }
            C3779c<E> cVar6 = this.f6979i;
            cVar6.f6977g = cVar4.mo15231o(cVar6);
            cVar6.f6976f = this.f6976f;
            cVar6.f6973c = this.f6973c - 1;
            cVar6.f6974d = this.f6974d - ((long) i);
            return cVar6.mo15226j();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
            r2 = r0.mo15225h(r2, r3);
         */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p005b.p096l.p175c.p177b.C3774g0.C3779c<E> mo15225h(java.util.Comparator<? super E> r2, E r3) {
            /*
                r1 = this;
                E r0 = r1.f6971a
                int r0 = r2.compare(r3, r0)
                if (r0 <= 0) goto L_0x0016
                b.l.c.b.g0$c<E> r0 = r1.f6977g
                if (r0 != 0) goto L_0x000d
                goto L_0x0014
            L_0x000d:
                b.l.c.b.g0$c r2 = r0.mo15225h(r2, r3)
                if (r2 == 0) goto L_0x0014
                goto L_0x0015
            L_0x0014:
                r2 = r1
            L_0x0015:
                return r2
            L_0x0016:
                if (r0 != 0) goto L_0x0019
                return r1
            L_0x0019:
                b.l.c.b.g0$c<E> r0 = r1.f6976f
                if (r0 != 0) goto L_0x001f
                r2 = 0
                goto L_0x0023
            L_0x001f:
                b.l.c.b.g0$c r2 = r0.mo15225h(r2, r3)
            L_0x0023:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p175c.p177b.C3774g0.C3779c.mo15225h(java.util.Comparator, java.lang.Object):b.l.c.b.g0$c");
        }

        /* renamed from: j */
        public final C3779c<E> mo15226j() {
            int d = mo15221d();
            if (d == -2) {
                if (this.f6977g.mo15221d() > 0) {
                    this.f6977g = this.f6977g.mo15233q();
                }
                return mo15232p();
            } else if (d != 2) {
                mo15228l();
                return this;
            } else {
                if (this.f6976f.mo15221d() < 0) {
                    this.f6976f = this.f6976f.mo15232p();
                }
                return mo15233q();
            }
        }

        /* renamed from: k */
        public final void mo15227k() {
            int i;
            long j;
            C3779c<E> cVar = this.f6976f;
            int i2 = C3774g0.f6961n;
            int i3 = 0;
            if (cVar == null) {
                i = 0;
            } else {
                i = cVar.f6973c;
            }
            int i4 = i + 1;
            C3779c<E> cVar2 = this.f6977g;
            if (cVar2 != null) {
                i3 = cVar2.f6973c;
            }
            this.f6973c = i4 + i3;
            long j2 = (long) this.f6972b;
            long j3 = 0;
            if (cVar == null) {
                j = 0;
            } else {
                j = cVar.f6974d;
            }
            long j4 = j2 + j;
            if (cVar2 != null) {
                j3 = cVar2.f6974d;
            }
            this.f6974d = j4 + j3;
            mo15228l();
        }

        /* renamed from: l */
        public final void mo15228l() {
            this.f6975e = Math.max(m7119i(this.f6976f), m7119i(this.f6977g)) + 1;
        }

        /* renamed from: m */
        public C3779c<E> mo15229m(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            long j;
            long j2;
            int compare = comparator.compare(e, this.f6971a);
            if (compare < 0) {
                C3779c<E> cVar = this.f6976f;
                if (cVar == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f6976f = cVar.mo15229m(comparator, e, i, iArr);
                if (iArr[0] > 0) {
                    if (i >= iArr[0]) {
                        this.f6973c--;
                        j2 = this.f6974d;
                        i = iArr[0];
                    } else {
                        j2 = this.f6974d;
                    }
                    this.f6974d = j2 - ((long) i);
                }
                return iArr[0] == 0 ? this : mo15226j();
            } else if (compare > 0) {
                C3779c<E> cVar2 = this.f6977g;
                if (cVar2 == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f6977g = cVar2.mo15229m(comparator, e, i, iArr);
                if (iArr[0] > 0) {
                    if (i >= iArr[0]) {
                        this.f6973c--;
                        j = this.f6974d;
                        i = iArr[0];
                    } else {
                        j = this.f6974d;
                    }
                    this.f6974d = j - ((long) i);
                }
                return mo15226j();
            } else {
                int i2 = this.f6972b;
                iArr[0] = i2;
                if (i >= i2) {
                    return mo15224g();
                }
                this.f6972b = i2 - i;
                this.f6974d -= (long) i;
                return this;
            }
        }

        /* renamed from: n */
        public final C3779c<E> mo15230n(C3779c<E> cVar) {
            C3779c<E> cVar2 = this.f6977g;
            if (cVar2 == null) {
                return this.f6976f;
            }
            this.f6977g = cVar2.mo15230n(cVar);
            this.f6973c--;
            this.f6974d -= (long) cVar.f6972b;
            return mo15226j();
        }

        /* renamed from: o */
        public final C3779c<E> mo15231o(C3779c<E> cVar) {
            C3779c<E> cVar2 = this.f6976f;
            if (cVar2 == null) {
                return this.f6977g;
            }
            this.f6976f = cVar2.mo15231o(cVar);
            this.f6973c--;
            this.f6974d -= (long) cVar.f6972b;
            return mo15226j();
        }

        /* renamed from: p */
        public final C3779c<E> mo15232p() {
            C1960d.m2699C(this.f6977g != null);
            C3779c<E> cVar = this.f6977g;
            this.f6977g = cVar.f6976f;
            cVar.f6976f = this;
            cVar.f6974d = this.f6974d;
            cVar.f6973c = this.f6973c;
            mo15227k();
            cVar.mo15228l();
            return cVar;
        }

        /* renamed from: q */
        public final C3779c<E> mo15233q() {
            C1960d.m2699C(this.f6976f != null);
            C3779c<E> cVar = this.f6976f;
            this.f6976f = cVar.f6977g;
            cVar.f6977g = this;
            cVar.f6974d = this.f6974d;
            cVar.f6973c = this.f6973c;
            mo15227k();
            cVar.mo15228l();
            return cVar;
        }

        /* renamed from: r */
        public C3779c<E> mo15234r(Comparator<? super E> comparator, E e, int i, int i2, int[] iArr) {
            int i3;
            int i4;
            int compare = comparator.compare(e, this.f6971a);
            if (compare < 0) {
                C3779c<E> cVar = this.f6976f;
                if (cVar == null) {
                    iArr[0] = 0;
                    if (i == 0 && i2 > 0) {
                        mo15219b(e, i2);
                    }
                    return this;
                }
                this.f6976f = cVar.mo15234r(comparator, e, i, i2, iArr);
                if (iArr[0] == i) {
                    if (i2 != 0 || iArr[0] == 0) {
                        if (i2 > 0 && iArr[0] == 0) {
                            i4 = this.f6973c + 1;
                        }
                        this.f6974d += (long) (i2 - iArr[0]);
                    } else {
                        i4 = this.f6973c - 1;
                    }
                    this.f6973c = i4;
                    this.f6974d += (long) (i2 - iArr[0]);
                }
                return mo15226j();
            } else if (compare > 0) {
                C3779c<E> cVar2 = this.f6977g;
                if (cVar2 == null) {
                    iArr[0] = 0;
                    if (i == 0 && i2 > 0) {
                        mo15220c(e, i2);
                    }
                    return this;
                }
                this.f6977g = cVar2.mo15234r(comparator, e, i, i2, iArr);
                if (iArr[0] == i) {
                    if (i2 != 0 || iArr[0] == 0) {
                        if (i2 > 0 && iArr[0] == 0) {
                            i3 = this.f6973c + 1;
                        }
                        this.f6974d += (long) (i2 - iArr[0]);
                    } else {
                        i3 = this.f6973c - 1;
                    }
                    this.f6973c = i3;
                    this.f6974d += (long) (i2 - iArr[0]);
                }
                return mo15226j();
            } else {
                int i5 = this.f6972b;
                iArr[0] = i5;
                if (i == i5) {
                    if (i2 == 0) {
                        return mo15224g();
                    }
                    this.f6974d += (long) (i2 - i5);
                    this.f6972b = i2;
                }
                return this;
            }
        }

        /* renamed from: s */
        public C3779c<E> mo15235s(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            long j;
            int i2;
            int i3;
            int i4;
            int compare = comparator.compare(e, this.f6971a);
            if (compare < 0) {
                C3779c<E> cVar = this.f6976f;
                if (cVar == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        mo15219b(e, i);
                    }
                    return this;
                }
                this.f6976f = cVar.mo15235s(comparator, e, i, iArr);
                if (i != 0 || iArr[0] == 0) {
                    if (i > 0 && iArr[0] == 0) {
                        i4 = this.f6973c + 1;
                    }
                    j = this.f6974d;
                    i2 = iArr[0];
                } else {
                    i4 = this.f6973c - 1;
                }
                this.f6973c = i4;
                j = this.f6974d;
                i2 = iArr[0];
            } else if (compare > 0) {
                C3779c<E> cVar2 = this.f6977g;
                if (cVar2 == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        mo15220c(e, i);
                    }
                    return this;
                }
                this.f6977g = cVar2.mo15235s(comparator, e, i, iArr);
                if (i != 0 || iArr[0] == 0) {
                    if (i > 0 && iArr[0] == 0) {
                        i3 = this.f6973c + 1;
                    }
                    j = this.f6974d;
                    i2 = iArr[0];
                } else {
                    i3 = this.f6973c - 1;
                }
                this.f6973c = i3;
                j = this.f6974d;
                i2 = iArr[0];
            } else {
                int i5 = this.f6972b;
                iArr[0] = i5;
                if (i == 0) {
                    return mo15224g();
                }
                this.f6974d += (long) (i - i5);
                this.f6972b = i;
                return this;
            }
            this.f6974d = j + ((long) (i - i2));
            return mo15226j();
        }

        public String toString() {
            return new C3798t(this.f6971a, this.f6972b).toString();
        }
    }

    /* renamed from: b.l.c.b.g0$d */
    public static final class C3780d<T> {

        /* renamed from: a */
        public T f6980a;

        public C3780d(C3772f0 f0Var) {
        }

        /* renamed from: a */
        public void mo15237a(T t, T t2) {
            if (this.f6980a == t) {
                this.f6980a = t2;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    public C3774g0(C3780d<C3779c<E>> dVar, C3787l<E> lVar, C3779c<E> cVar) {
        super(lVar.f6988g);
        this.f6962k = dVar;
        this.f6963l = lVar;
        this.f6964m = cVar;
    }

    /* renamed from: A */
    public final long mo15207A(C3776b bVar, C3779c<E> cVar) {
        long j;
        long j2;
        if (cVar == null) {
            return 0;
        }
        int compare = this.f6952i.compare(this.f6963l.f6990i, cVar.f6971a);
        if (compare < 0) {
            return mo15207A(bVar, cVar.f6976f);
        }
        if (compare == 0) {
            int ordinal = this.f6963l.f6991j.ordinal();
            if (ordinal == 0) {
                j2 = (long) bVar.mo15216d(cVar);
                j = bVar.mo15217e(cVar.f6976f);
            } else if (ordinal == 1) {
                return bVar.mo15217e(cVar.f6976f);
            } else {
                throw new AssertionError();
            }
        } else {
            j2 = bVar.mo15217e(cVar.f6976f) + ((long) bVar.mo15216d(cVar));
            j = mo15207A(bVar, cVar.f6977g);
        }
        return j + j2;
    }

    /* renamed from: B */
    public final long mo15208B(C3776b bVar) {
        C3779c cVar = (C3779c) this.f6962k.f6980a;
        long e = bVar.mo15217e(cVar);
        if (this.f6963l.f6989h) {
            e -= mo15207A(bVar, cVar);
        }
        return this.f6963l.f6992k ? e - mo15212w(bVar, cVar) : e;
    }

    /* renamed from: D */
    public boolean mo15140D(E e, int i, int i2) {
        C1960d.m2861w(i2, "newCount");
        C1960d.m2861w(i, "oldCount");
        C1960d.m2849t(this.f6963l.mo15262a(e));
        T t = (C3779c) this.f6962k.f6980a;
        if (t != null) {
            int[] iArr = new int[1];
            T r = t.mo15234r(this.f6952i, e, i, i2, iArr);
            C3780d<C3779c<E>> dVar = this.f6962k;
            if (dVar.f6980a == t) {
                dVar.f6980a = r;
                if (iArr[0] == i) {
                    return true;
                }
                return false;
            }
            throw new ConcurrentModificationException();
        } else if (i != 0) {
            return false;
        } else {
            if (i2 > 0) {
                mo15147o(e, i2);
            }
            return true;
        }
    }

    /* renamed from: E */
    public int mo15209E(E e, int i) {
        C1960d.m2861w(i, "count");
        boolean z = true;
        if (!this.f6963l.mo15262a(e)) {
            if (i != 0) {
                z = false;
            }
            C1960d.m2849t(z);
            return 0;
        }
        T t = (C3779c) this.f6962k.f6980a;
        if (t == null) {
            if (i > 0) {
                mo15147o(e, i);
            }
            return 0;
        }
        int[] iArr = new int[1];
        T s = t.mo15235s(this.f6952i, e, i, iArr);
        C3780d<C3779c<E>> dVar = this.f6962k;
        if (dVar.f6980a == t) {
            dVar.f6980a = s;
            return iArr[0];
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: O */
    public C3762b0<E> mo15151O(E e, C3771f fVar) {
        return new C3774g0(this.f6962k, this.f6963l.mo15263b(new C3787l(this.f6952i, false, null, C3771f.OPEN, true, e, fVar)), this.f6964m);
    }

    /* renamed from: S */
    public int mo15141S(Object obj) {
        try {
            C3779c cVar = (C3779c) this.f6962k.f6980a;
            if (this.f6963l.mo15262a(obj)) {
                if (cVar != null) {
                    return cVar.mo15223f(this.f6952i, obj);
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    public void clear() {
        C3787l<E> lVar = this.f6963l;
        if (lVar.f6989h || lVar.f6992k) {
            C3775a aVar = new C3775a();
            while (aVar.hasNext()) {
                aVar.next();
                aVar.remove();
            }
            return;
        }
        C3779c<E> cVar = this.f6964m.f6979i;
        while (true) {
            C3779c<E> cVar2 = this.f6964m;
            if (cVar != cVar2) {
                C3779c<E> cVar3 = cVar.f6979i;
                cVar.f6972b = 0;
                cVar.f6976f = null;
                cVar.f6977g = null;
                cVar.f6978h = null;
                cVar.f6979i = null;
                cVar = cVar3;
            } else {
                cVar2.f6979i = cVar2;
                cVar2.f6978h = cVar2;
                this.f6962k.f6980a = null;
                return;
            }
        }
    }

    /* renamed from: e */
    public int mo15143e() {
        return C1960d.m2714G0(mo15208B(C3776b.DISTINCT));
    }

    public Iterator<E> iterator() {
        return new C3799u(this, entrySet().iterator());
    }

    /* renamed from: k */
    public int mo15145k(Object obj, int i) {
        C1960d.m2861w(i, "occurrences");
        if (i == 0) {
            return mo15141S(obj);
        }
        T t = (C3779c) this.f6962k.f6980a;
        int[] iArr = new int[1];
        try {
            if (this.f6963l.mo15262a(obj)) {
                if (t != null) {
                    T m = t.mo15229m(this.f6952i, obj, i, iArr);
                    C3780d<C3779c<E>> dVar = this.f6962k;
                    if (dVar.f6980a == t) {
                        dVar.f6980a = m;
                        return iArr[0];
                    }
                    throw new ConcurrentModificationException();
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    /* renamed from: l */
    public Iterator<E> mo15146l() {
        return new C3794p(new C3775a());
    }

    /* renamed from: m */
    public C3762b0<E> mo15156m(E e, C3771f fVar) {
        return new C3774g0(this.f6962k, this.f6963l.mo15263b(new C3787l(this.f6952i, true, e, fVar, false, null, C3771f.OPEN)), this.f6964m);
    }

    /* renamed from: o */
    public int mo15147o(E e, int i) {
        C1960d.m2861w(i, "occurrences");
        if (i == 0) {
            return mo15141S(e);
        }
        C1960d.m2849t(this.f6963l.mo15262a(e));
        T t = (C3779c) this.f6962k.f6980a;
        if (t == null) {
            this.f6952i.compare(e, e);
            C3779c<E> cVar = new C3779c<>(e, i);
            C3779c<E> cVar2 = this.f6964m;
            cVar2.f6979i = cVar;
            cVar.f6978h = cVar2;
            cVar.f6979i = cVar2;
            cVar2.f6978h = cVar;
            this.f6962k.mo15237a(t, cVar);
            return 0;
        }
        int[] iArr = new int[1];
        T a = t.mo15218a(this.f6952i, e, i, iArr);
        C3780d<C3779c<E>> dVar = this.f6962k;
        if (dVar.f6980a == t) {
            dVar.f6980a = a;
            return iArr[0];
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: q */
    public Iterator<C3792o.C3793a<E>> mo15148q() {
        return new C3775a();
    }

    public int size() {
        return C1960d.m2714G0(mo15208B(C3776b.SIZE));
    }

    /* renamed from: w */
    public final long mo15212w(C3776b bVar, C3779c<E> cVar) {
        long j;
        long j2;
        if (cVar == null) {
            return 0;
        }
        int compare = this.f6952i.compare(this.f6963l.f6993l, cVar.f6971a);
        if (compare > 0) {
            return mo15212w(bVar, cVar.f6977g);
        }
        if (compare == 0) {
            int ordinal = this.f6963l.f6994m.ordinal();
            if (ordinal == 0) {
                j2 = (long) bVar.mo15216d(cVar);
                j = bVar.mo15217e(cVar.f6977g);
            } else if (ordinal == 1) {
                return bVar.mo15217e(cVar.f6977g);
            } else {
                throw new AssertionError();
            }
        } else {
            j2 = bVar.mo15217e(cVar.f6977g) + ((long) bVar.mo15216d(cVar));
            j = mo15212w(bVar, cVar.f6976f);
        }
        return j + j2;
    }

    public C3774g0(Comparator<? super E> comparator) {
        super(comparator);
        C3771f fVar = C3771f.OPEN;
        this.f6963l = new C3787l(comparator, false, null, fVar, false, null, fVar);
        C3779c<E> cVar = new C3779c<>(null, 1);
        this.f6964m = cVar;
        cVar.f6979i = cVar;
        cVar.f6978h = cVar;
        this.f6962k = new C3780d<>((C3772f0) null);
    }
}
