package p005b.p096l.p232f.p246e0.p247c;

import p005b.p096l.p232f.p258y.C4658b;

/* renamed from: b.l.f.e0.c.c */
public enum C4582c {
    DATA_MASK_000 {
        /* renamed from: d */
        public boolean mo16244d(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    },
    DATA_MASK_001 {
        /* renamed from: d */
        public boolean mo16244d(int i, int i2) {
            return (i & 1) == 0;
        }
    },
    DATA_MASK_010 {
        /* renamed from: d */
        public boolean mo16244d(int i, int i2) {
            return i2 % 3 == 0;
        }
    },
    DATA_MASK_011 {
        /* renamed from: d */
        public boolean mo16244d(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    },
    DATA_MASK_100 {
        /* renamed from: d */
        public boolean mo16244d(int i, int i2) {
            return (((i2 / 3) + (i / 2)) & 1) == 0;
        }
    },
    DATA_MASK_101 {
        /* renamed from: d */
        public boolean mo16244d(int i, int i2) {
            return (i * i2) % 6 == 0;
        }
    },
    DATA_MASK_110 {
        /* renamed from: d */
        public boolean mo16244d(int i, int i2) {
            return (i * i2) % 6 < 3;
        }
    },
    DATA_MASK_111 {
        /* renamed from: d */
        public boolean mo16244d(int i, int i2) {
            return ((((i * i2) % 3) + (i + i2)) & 1) == 0;
        }
    };

    /* access modifiers changed from: public */
    C4582c(C4583a aVar) {
    }

    /* renamed from: d */
    public abstract boolean mo16244d(int i, int i2);

    /* renamed from: e */
    public final void mo16245e(C4658b bVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (mo16244d(i2, i3)) {
                    bVar.mo16332a(i3, i2);
                }
            }
        }
    }
}
