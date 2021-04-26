package p298d.p337v;

import com.segment.analytics.integrations.BasePayload;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.v.f */
public interface C6827f {

    /* renamed from: d.v.f$a */
    public interface C6828a extends C6827f {

        /* renamed from: d.v.f$a$a */
        public static final class C6829a {
            /* renamed from: a */
            public static <R> R m12392a(C6828a aVar, R r, C6866p<? super R, ? super C6828a, ? extends R> pVar) {
                C6888i.m12438e(pVar, "operation");
                return pVar.invoke(r, aVar);
            }

            /* renamed from: b */
            public static <E extends C6828a> E m12393b(C6828a aVar, C6830b<E> bVar) {
                C6888i.m12438e(bVar, "key");
                if (C6888i.m12434a(aVar.getKey(), bVar)) {
                    return aVar;
                }
                return null;
            }

            /* renamed from: c */
            public static C6827f m12394c(C6828a aVar, C6830b<?> bVar) {
                C6888i.m12438e(bVar, "key");
                return C6888i.m12434a(aVar.getKey(), bVar) ? C6832h.f13753g : aVar;
            }

            /* renamed from: d */
            public static C6827f m12395d(C6828a aVar, C6827f fVar) {
                C6888i.m12438e(fVar, BasePayload.CONTEXT_KEY);
                C6888i.m12438e(fVar, BasePayload.CONTEXT_KEY);
                return fVar == C6832h.f13753g ? aVar : (C6827f) fVar.fold(aVar, C6831g.f13752g);
            }
        }

        <E extends C6828a> E get(C6830b<E> bVar);

        C6830b<?> getKey();
    }

    /* renamed from: d.v.f$b */
    public interface C6830b<E extends C6828a> {
    }

    <R> R fold(R r, C6866p<? super R, ? super C6828a, ? extends R> pVar);

    <E extends C6828a> E get(C6830b<E> bVar);

    C6827f minusKey(C6830b<?> bVar);

    C6827f plus(C6827f fVar);
}
