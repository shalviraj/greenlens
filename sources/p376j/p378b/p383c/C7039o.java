package p376j.p378b.p383c;

import com.segment.analytics.integrations.BasePayload;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p376j.p378b.p379a.C7014a;
import p376j.p378b.p383c.C7022d;
import p376j.p378b.p383c.C7025e;
import p376j.p378b.p383c.C7034m;
import p376j.p378b.p383c.C7037n;

/* renamed from: j.b.c.o */
public abstract class C7039o {

    /* renamed from: c */
    public static final Map<String, C7016a> f14103c = Collections.emptyMap();

    /* renamed from: d */
    public static final Set<C7040a> f14104d = Collections.unmodifiableSet(EnumSet.noneOf(C7040a.class));

    /* renamed from: a */
    public final C7041p f14105a;

    /* renamed from: b */
    public final Set<C7040a> f14106b;

    /* renamed from: j.b.c.o$a */
    public enum C7040a {
        RECORD_EVENTS
    }

    public C7039o(C7041p pVar, EnumSet<C7040a> enumSet) {
        C5266a.m9842M(pVar, BasePayload.CONTEXT_KEY);
        this.f14105a = pVar;
        Set<C7040a> set = f14104d;
        this.f14106b = set;
        if (!(!pVar.f14113c.mo24456a() || set.contains(C7040a.RECORD_EVENTS))) {
            throw new IllegalArgumentException("Span is sampled, but does not have RECORD_EVENTS set.");
        }
    }

    /* renamed from: a */
    public void mo24430a(C7034m mVar) {
        C7037n nVar;
        C5266a.m9842M(mVar, "messageEvent");
        C5266a.m9842M(mVar, "event");
        if (mVar instanceof C7037n) {
            nVar = (C7037n) mVar;
        } else {
            C7037n.C7038a aVar = mVar.mo24411d() == C7034m.C7036b.RECEIVED ? C7037n.C7038a.RECV : C7037n.C7038a.SENT;
            long c = mVar.mo24410c();
            C5266a.m9842M(aVar, "type");
            Long valueOf = Long.valueOf(c);
            Long valueOf2 = Long.valueOf(mVar.mo24412e());
            Long valueOf3 = Long.valueOf(mVar.mo24409b());
            String str = valueOf == null ? " messageId" : "";
            if (valueOf2 == null) {
                str = C0843a.m451l(str, " uncompressedMessageSize");
            }
            if (valueOf3 == null) {
                str = C0843a.m451l(str, " compressedMessageSize");
            }
            if (str.isEmpty()) {
                nVar = new C7025e((C7014a) null, aVar, valueOf.longValue(), valueOf2.longValue(), valueOf3.longValue(), (C7025e.C7026a) null);
            } else {
                throw new IllegalStateException(C0843a.m451l("Missing required properties:", str));
            }
        }
        mo24431b(nVar);
    }

    @Deprecated
    /* renamed from: b */
    public void mo24431b(C7037n nVar) {
        C7034m mVar;
        C5266a.m9842M(nVar, "event");
        if (nVar instanceof C7034m) {
            mVar = (C7034m) nVar;
        } else {
            C7034m.C7035a a = C7034m.m12643a(nVar.mo24421d() == C7037n.C7038a.RECV ? C7034m.C7036b.RECEIVED : C7034m.C7036b.SENT, nVar.mo24420c());
            a.mo24417b(nVar.mo24422e());
            C7022d.C7024b bVar = (C7022d.C7024b) a;
            bVar.f14085d = Long.valueOf(nVar.mo24418a());
            mVar = bVar.mo24416a();
        }
        mo24430a(mVar);
    }

    /* renamed from: c */
    public abstract void mo24432c(C7033l lVar);

    /* renamed from: d */
    public void mo24433d(String str, C7016a aVar) {
        C5266a.m9842M(str, "key");
        C5266a.m9842M(aVar, "value");
        mo24434e(Collections.singletonMap(str, aVar));
    }

    /* renamed from: e */
    public void mo24434e(Map<String, C7016a> map) {
        C5266a.m9842M(map, "attributes");
        mo24434e(map);
    }
}
