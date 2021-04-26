package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.dn */
public enum C2120dn {
    DOUBLE(0, 1, r7),
    FLOAT(1, 1, r14),
    INT64(2, 1, r6),
    UINT64(3, 1, r6),
    INT32(4, 1, r9),
    FIXED64(5, 1, r6),
    FIXED32(6, 1, r9),
    BOOL(7, 1, r10),
    STRING(8, 1, r11),
    MESSAGE(9, 1, r12),
    BYTES(10, 1, r13),
    UINT32(11, 1, r6),
    ENUM(12, 1, r21),
    SFIXED32(13, 1, r6),
    SFIXED64(14, 1, r8),
    SINT32(15, 1, r9),
    SINT64(16, 1, r8),
    GROUP(17, 1, r12),
    DOUBLE_LIST(18, 2, r7),
    FLOAT_LIST(19, 2, r14),
    INT64_LIST(20, 2, r6),
    UINT64_LIST(21, 2, r6),
    INT32_LIST(22, 2, r9),
    FIXED64_LIST(23, 2, r8),
    FIXED32_LIST(24, 2, r9),
    BOOL_LIST(25, 2, r10),
    STRING_LIST(26, 2, r11),
    MESSAGE_LIST(27, 2, r12),
    BYTES_LIST(28, 2, r13),
    UINT32_LIST(29, 2, r9),
    ENUM_LIST(30, 2, r21),
    SFIXED32_LIST(31, 2, r9),
    SFIXED64_LIST(32, 2, r8),
    SINT32_LIST(33, 2, r9),
    SINT64_LIST(34, 2, r8),
    DOUBLE_LIST_PACKED(35, 3, r7),
    FLOAT_LIST_PACKED(36, 3, r14),
    INT64_LIST_PACKED(37, 3, r6),
    UINT64_LIST_PACKED(38, 3, r6),
    INT32_LIST_PACKED(39, 3, r9),
    FIXED64_LIST_PACKED(40, 3, r8),
    FIXED32_LIST_PACKED(41, 3, r9),
    BOOL_LIST_PACKED(42, 3, r10),
    UINT32_LIST_PACKED(43, 3, r9),
    ENUM_LIST_PACKED(44, 3, r21),
    SFIXED32_LIST_PACKED(45, 3, r6),
    SFIXED64_LIST_PACKED(46, 3, r7),
    SINT32_LIST_PACKED(47, 3, r6),
    SINT64_LIST_PACKED(48, 3, r7),
    GROUP_LIST(49, 2, r12),
    MAP(50, 4, C2270k.VOID);
    

    /* renamed from: g0 */
    public static final C2120dn[] f3775g0 = null;

    /* renamed from: g */
    public final int f3796g;

    /* access modifiers changed from: public */
    static {
        C2120dn[] values = values();
        f3775g0 = new C2120dn[51];
        for (int i = 0; i < 51; i++) {
            C2120dn dnVar = values[i];
            f3775g0[dnVar.f3796g] = dnVar;
        }
    }

    /* access modifiers changed from: public */
    C2120dn(int i, int i2, C2270k kVar) {
        this.f3796g = i;
        C2270k kVar2 = C2270k.VOID;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            Class<?> cls = kVar.f3986g;
        }
        if (i2 == 1) {
            kVar.ordinal();
        }
    }
}
