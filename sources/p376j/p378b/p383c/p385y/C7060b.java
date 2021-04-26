package p376j.p378b.p383c.p385y;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p005b.p291q.p292a.C5266a;

/* renamed from: j.b.c.y.b */
public abstract class C7060b {

    /* renamed from: j.b.c.y.b$b */
    public static final class C7062b extends C7060b {

        /* renamed from: a */
        public final Set<String> f14158a = new HashSet();

        static {
            Map emptyMap = Collections.emptyMap();
            Map emptyMap2 = Collections.emptyMap();
            C5266a.m9842M(emptyMap, "numbersOfLatencySampledSpans");
            Map unmodifiableMap = Collections.unmodifiableMap(new HashMap(emptyMap));
            C5266a.m9842M(emptyMap2, "numbersOfErrorSampledSpans");
            Map unmodifiableMap2 = Collections.unmodifiableMap(new HashMap(emptyMap2));
            Objects.requireNonNull(unmodifiableMap, "Null numbersOfLatencySampledSpans");
            Objects.requireNonNull(unmodifiableMap2, "Null numbersOfErrorSampledSpans");
        }

        public C7062b() {
        }

        public C7062b(C7061a aVar) {
        }
    }
}
