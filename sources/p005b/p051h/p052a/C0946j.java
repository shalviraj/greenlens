package p005b.p051h.p052a;

import p005b.p051h.p052a.C0946j;
import p005b.p051h.p052a.p074q.p076i.C1360c;
import p005b.p051h.p052a.p074q.p076i.C1364e;

/* renamed from: b.h.a.j */
public abstract class C0946j<CHILD extends C0946j<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: g */
    public C1364e<? super TranscodeType> f914g = C1360c.f1774b;

    /* renamed from: a */
    public final CHILD mo10785a() {
        try {
            return (C0946j) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Object clone() {
        try {
            return (C0946j) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
