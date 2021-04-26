package p005b.p082j.p083a.p084a;

/* renamed from: b.j.a.a.j */
public enum C1525j {
    NOT_AVAILABLE((String) null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME((String) null, 5),
    VALUE_EMBEDDED_OBJECT((String) null, 12),
    VALUE_STRING((String) null, 6),
    VALUE_NUMBER_INT((String) null, 7),
    VALUE_NUMBER_FLOAT((String) null, 8),
    VALUE_TRUE("true", 9),
    VALUE_FALSE("false", 10),
    VALUE_NULL("null", 11);
    

    /* renamed from: g */
    public final String f2400g;

    /* renamed from: h */
    public final char[] f2401h;

    /* renamed from: i */
    public final byte[] f2402i;

    /* renamed from: j */
    public final int f2403j;

    /* renamed from: k */
    public final boolean f2404k;

    /* renamed from: l */
    public final boolean f2405l;

    /* renamed from: m */
    public final boolean f2406m;

    /* access modifiers changed from: public */
    C1525j(String str, int i) {
        boolean z = false;
        if (str == null) {
            this.f2400g = null;
            this.f2401h = null;
            this.f2402i = null;
        } else {
            this.f2400g = str;
            char[] charArray = str.toCharArray();
            this.f2401h = charArray;
            int length = charArray.length;
            this.f2402i = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                this.f2402i[i2] = (byte) this.f2401h[i2];
            }
        }
        this.f2403j = i;
        this.f2406m = i == 7 || i == 8;
        boolean z2 = i == 1 || i == 3;
        this.f2404k = z2;
        z = (i == 2 || i == 4) ? true : z;
        this.f2405l = z;
        if (!z2 && !z) {
        }
    }
}
