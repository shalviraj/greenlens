package p005b.p096l.p097a.p098a.p101f.p106q.p107h;

import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p005b.p096l.p097a.p098a.C1584b;
import p005b.p096l.p097a.p098a.p101f.p106q.p107h.C1675c;
import p005b.p096l.p097a.p098a.p101f.p110s.C1735a;

@AutoValue
/* renamed from: b.l.a.a.f.q.h.f */
public abstract class C1680f {

    @AutoValue
    /* renamed from: b.l.a.a.f.q.h.f$a */
    public static abstract class C1681a {

        @AutoValue.Builder
        /* renamed from: b.l.a.a.f.q.h.f$a$a */
        public static abstract class C1682a {
            /* renamed from: a */
            public abstract C1681a mo11871a();

            /* renamed from: b */
            public abstract C1682a mo11872b(long j);

            /* renamed from: c */
            public abstract C1682a mo11873c(long j);
        }

        /* renamed from: a */
        public static C1682a m2207a() {
            C1675c.C1677b bVar = new C1675c.C1677b();
            Set<C1683b> emptySet = Collections.emptySet();
            Objects.requireNonNull(emptySet, "Null flags");
            bVar.f2957c = emptySet;
            return bVar;
        }

        /* renamed from: b */
        public abstract long mo11865b();

        /* renamed from: c */
        public abstract Set<C1683b> mo11866c();

        /* renamed from: d */
        public abstract long mo11867d();
    }

    /* renamed from: b.l.a.a.f.q.h.f$b */
    public enum C1683b {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    public abstract C1735a mo11860a();

    /* renamed from: b */
    public long mo11877b(C1584b bVar, long j, int i) {
        long a = j - mo11860a().mo11926a();
        C1681a aVar = mo11861c().get(bVar);
        long b = aVar.mo11865b();
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, (double) i2) * ((double) b) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((b > 1 ? b : 2) * ((long) i2))))), a), aVar.mo11867d());
    }

    /* renamed from: c */
    public abstract Map<C1584b, C1681a> mo11861c();
}
