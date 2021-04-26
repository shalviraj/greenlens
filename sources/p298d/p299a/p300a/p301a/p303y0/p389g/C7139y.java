package p298d.p299a.p300a.p301a.p303y0.p389g;

/* renamed from: d.a.a.a.y0.g.y */
public enum C7139y {
    DOUBLE(C7144z.DOUBLE, 1),
    FLOAT(C7144z.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(C7144z.BOOLEAN, 0),
    STRING(C7144z.STRING, 2) {
        /* renamed from: d */
        public boolean mo24784d() {
            return false;
        }
    },
    GROUP(r13, 3) {
        /* renamed from: d */
        public boolean mo24784d() {
            return false;
        }
    },
    MESSAGE(r13, 2) {
        /* renamed from: d */
        public boolean mo24784d() {
            return false;
        }
    },
    BYTES(C7144z.BYTE_STRING, 2) {
        /* renamed from: d */
        public boolean mo24784d() {
            return false;
        }
    },
    UINT32(r11, 0),
    ENUM(C7144z.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: g */
    public final C7144z f14275g;

    /* renamed from: h */
    public final int f14276h;

    /* access modifiers changed from: public */
    C7139y(C7144z zVar, int i) {
        this.f14275g = zVar;
        this.f14276h = i;
    }

    /* access modifiers changed from: public */
    C7139y(C7144z zVar, int i, C7138x xVar) {
        this.f14275g = zVar;
        this.f14276h = i;
    }

    /* renamed from: d */
    public boolean mo24784d() {
        return true;
    }
}
