package p298d.p337v;

import com.segment.analytics.integrations.BasePayload;
import p298d.p337v.C6827f;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.v.a */
public abstract class C6820a implements C6827f.C6828a {
    private final C6827f.C6830b<?> key;

    public C6820a(C6827f.C6830b<?> bVar) {
        C6888i.m12438e(bVar, "key");
        this.key = bVar;
    }

    public <R> R fold(R r, C6866p<? super R, ? super C6827f.C6828a, ? extends R> pVar) {
        C6888i.m12438e(pVar, "operation");
        return C6827f.C6828a.C6829a.m12392a(this, r, pVar);
    }

    public <E extends C6827f.C6828a> E get(C6827f.C6830b<E> bVar) {
        C6888i.m12438e(bVar, "key");
        return C6827f.C6828a.C6829a.m12393b(this, bVar);
    }

    public C6827f.C6830b<?> getKey() {
        return this.key;
    }

    public C6827f minusKey(C6827f.C6830b<?> bVar) {
        C6888i.m12438e(bVar, "key");
        return C6827f.C6828a.C6829a.m12394c(this, bVar);
    }

    public C6827f plus(C6827f fVar) {
        C6888i.m12438e(fVar, BasePayload.CONTEXT_KEY);
        return C6827f.C6828a.C6829a.m12395d(this, fVar);
    }
}
