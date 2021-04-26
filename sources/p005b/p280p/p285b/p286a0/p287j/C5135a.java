package p005b.p280p.p285b.p286a0.p287j;

/* renamed from: b.p.b.a0.j.a */
public enum C5135a {
    NO_ERROR(0, -1, 0),
    PROTOCOL_ERROR(1, 1, 1),
    INVALID_STREAM(1, 2, -1),
    UNSUPPORTED_VERSION(1, 4, -1),
    STREAM_IN_USE(1, 8, -1),
    STREAM_ALREADY_CLOSED(1, 9, -1),
    INTERNAL_ERROR(2, 6, 2),
    FLOW_CONTROL_ERROR(3, 7, -1),
    STREAM_CLOSED(5, -1, -1),
    FRAME_TOO_LARGE(6, 11, -1),
    REFUSED_STREAM(7, 3, -1),
    CANCEL(8, 5, -1),
    COMPRESSION_ERROR(9, -1, -1),
    CONNECT_ERROR(10, -1, -1),
    ENHANCE_YOUR_CALM(11, -1, -1),
    INADEQUATE_SECURITY(12, -1, -1),
    HTTP_1_1_REQUIRED(13, -1, -1),
    INVALID_CREDENTIALS(-1, 10, -1);
    

    /* renamed from: g */
    public final int f9975g;

    /* renamed from: h */
    public final int f9976h;

    /* renamed from: i */
    public final int f9977i;

    /* access modifiers changed from: public */
    C5135a(int i, int i2, int i3) {
        this.f9975g = i;
        this.f9976h = i2;
        this.f9977i = i3;
    }

    /* renamed from: d */
    public static C5135a m9468d(int i) {
        C5135a[] values = values();
        for (int i2 = 0; i2 < 18; i2++) {
            C5135a aVar = values[i2];
            if (aVar.f9975g == i) {
                return aVar;
            }
        }
        return null;
    }
}
