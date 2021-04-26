package p005b.p096l.p232f.p246e0.p247c;

/* renamed from: b.l.f.e0.c.h */
public enum C4595h {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: g */
    public final int[] f8619g;

    /* renamed from: h */
    public final int f8620h;

    /* access modifiers changed from: public */
    C4595h(int[] iArr, int i) {
        this.f8619g = iArr;
        this.f8620h = i;
    }

    /* renamed from: d */
    public int mo16250d(C4597j jVar) {
        int i = jVar.f8624a;
        return this.f8619g[i <= 9 ? 0 : i <= 26 ? (char) 1 : 2];
    }
}
