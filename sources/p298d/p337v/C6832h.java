package p298d.p337v;

import com.segment.analytics.integrations.BasePayload;
import java.io.Serializable;
import p298d.p337v.C6827f;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.v.h */
public final class C6832h implements C6827f, Serializable {

    /* renamed from: g */
    public static final C6832h f13753g = new C6832h();

    public <R> R fold(R r, C6866p<? super R, ? super C6827f.C6828a, ? extends R> pVar) {
        C6888i.m12438e(pVar, "operation");
        return r;
    }

    public <E extends C6827f.C6828a> E get(C6827f.C6830b<E> bVar) {
        C6888i.m12438e(bVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public C6827f minusKey(C6827f.C6830b<?> bVar) {
        C6888i.m12438e(bVar, "key");
        return this;
    }

    public C6827f plus(C6827f fVar) {
        C6888i.m12438e(fVar, BasePayload.CONTEXT_KEY);
        return fVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
