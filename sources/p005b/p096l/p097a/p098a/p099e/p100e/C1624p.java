package p005b.p096l.p097a.p098a.p099e.p100e;

import android.util.SparseArray;

/* renamed from: b.l.a.a.e.e.p */
public enum C1624p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: m */
    public static final SparseArray<C1624p> f2845m = null;

    /* access modifiers changed from: public */
    static {
        C1624p pVar;
        C1624p pVar2;
        C1624p pVar3;
        C1624p pVar4;
        C1624p pVar5;
        C1624p pVar6;
        SparseArray<C1624p> sparseArray = new SparseArray<>();
        f2845m = sparseArray;
        sparseArray.put(0, pVar);
        sparseArray.put(1, pVar2);
        sparseArray.put(2, pVar3);
        sparseArray.put(3, pVar4);
        sparseArray.put(4, pVar5);
        sparseArray.put(-1, pVar6);
    }

    /* access modifiers changed from: public */
    C1624p(int i) {
    }
}
