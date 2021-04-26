package p005b.p096l.p097a.p098a.p101f.p106q;

import com.amplitude.api.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p005b.p096l.p097a.p098a.C1584b;
import p005b.p096l.p097a.p098a.p101f.p106q.p107h.C1674b;
import p005b.p096l.p097a.p098a.p101f.p106q.p107h.C1675c;
import p005b.p096l.p097a.p098a.p101f.p106q.p107h.C1680f;
import p005b.p096l.p097a.p098a.p101f.p110s.C1735a;
import p387k.p388a.C7065a;

/* renamed from: b.l.a.a.f.q.f */
public final class C1671f implements Object<C1680f> {

    /* renamed from: a */
    public final C7065a<C1735a> f2944a;

    public C1671f(C7065a<C1735a> aVar) {
        this.f2944a = aVar;
    }

    public Object get() {
        C1735a aVar = this.f2944a.get();
        HashMap hashMap = new HashMap();
        C1584b bVar = C1584b.DEFAULT;
        C1680f.C1681a.C1682a a = C1680f.C1681a.m2207a();
        a.mo11872b(Constants.EVENT_UPLOAD_PERIOD_MILLIS);
        a.mo11873c(86400000);
        hashMap.put(bVar, a.mo11871a());
        C1584b bVar2 = C1584b.HIGHEST;
        C1680f.C1681a.C1682a a2 = C1680f.C1681a.m2207a();
        a2.mo11872b(1000);
        a2.mo11873c(86400000);
        hashMap.put(bVar2, a2.mo11871a());
        C1584b bVar3 = C1584b.VERY_LOW;
        C1680f.C1681a.C1682a a3 = C1680f.C1681a.m2207a();
        a3.mo11872b(86400000);
        a3.mo11873c(86400000);
        Set<C1680f.C1683b> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C1680f.C1683b[]{C1680f.C1683b.NETWORK_UNMETERED, C1680f.C1683b.DEVICE_IDLE})));
        C1675c.C1677b bVar4 = (C1675c.C1677b) a3;
        Objects.requireNonNull(unmodifiableSet, "Null flags");
        bVar4.f2957c = unmodifiableSet;
        hashMap.put(bVar3, bVar4.mo11871a());
        Objects.requireNonNull(aVar, "missing required property: clock");
        int size = hashMap.keySet().size();
        C1584b.values();
        if (size >= 3) {
            new HashMap();
            return new C1674b(aVar, hashMap);
        }
        throw new IllegalStateException("Not all priorities have been configured");
    }
}
