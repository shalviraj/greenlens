package p005b.p096l.p097a.p098a.p099e.p100e;

import com.amplitude.api.Constants;
import com.segment.analytics.AnalyticsContext;
import p005b.p096l.p180d.p208s.C4205d;
import p005b.p096l.p180d.p208s.C4206e;
import p005b.p096l.p180d.p208s.C4207f;
import p005b.p096l.p180d.p208s.p209i.C4210a;
import p005b.p096l.p180d.p208s.p209i.C4211b;
import p005b.p096l.p180d.p208s.p210j.C4216e;

/* renamed from: b.l.a.a.e.e.b */
public final class C1594b implements C4210a {

    /* renamed from: a */
    public static final C4210a f2713a = new C1594b();

    /* renamed from: b.l.a.a.e.e.b$a */
    public static final class C1595a implements C4206e<C1593a> {

        /* renamed from: a */
        public static final C1595a f2714a = new C1595a();

        /* renamed from: b */
        public static final C4205d f2715b = C4205d.m7742a("sdkVersion");

        /* renamed from: c */
        public static final C4205d f2716c = C4205d.m7742a(AnalyticsContext.Device.DEVICE_MODEL_KEY);

        /* renamed from: d */
        public static final C4205d f2717d = C4205d.m7742a("hardware");

        /* renamed from: e */
        public static final C4205d f2718e = C4205d.m7742a("device");

        /* renamed from: f */
        public static final C4205d f2719f = C4205d.m7742a("product");

        /* renamed from: g */
        public static final C4205d f2720g = C4205d.m7742a("osBuild");

        /* renamed from: h */
        public static final C4205d f2721h = C4205d.m7742a(AnalyticsContext.Device.DEVICE_MANUFACTURER_KEY);

        /* renamed from: i */
        public static final C4205d f2722i = C4205d.m7742a("fingerprint");

        /* renamed from: j */
        public static final C4205d f2723j = C4205d.m7742a("locale");

        /* renamed from: k */
        public static final C4205d f2724k = C4205d.m7742a(Constants.AMP_TRACKING_OPTION_COUNTRY);

        /* renamed from: l */
        public static final C4205d f2725l = C4205d.m7742a("mccMnc");

        /* renamed from: m */
        public static final C4205d f2726m = C4205d.m7742a("applicationBuild");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C1593a aVar = (C1593a) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15801f(f2715b, aVar.mo11749l());
            fVar.mo15801f(f2716c, aVar.mo11746i());
            fVar.mo15801f(f2717d, aVar.mo11742e());
            fVar.mo15801f(f2718e, aVar.mo11740c());
            fVar.mo15801f(f2719f, aVar.mo11748k());
            fVar.mo15801f(f2720g, aVar.mo11747j());
            fVar.mo15801f(f2721h, aVar.mo11744g());
            fVar.mo15801f(f2722i, aVar.mo11741d());
            fVar.mo15801f(f2723j, aVar.mo11743f());
            fVar.mo15801f(f2724k, aVar.mo11739b());
            fVar.mo15801f(f2725l, aVar.mo11745h());
            fVar.mo15801f(f2726m, aVar.mo11738a());
        }
    }

    /* renamed from: b.l.a.a.e.e.b$b */
    public static final class C1596b implements C4206e<C1614j> {

        /* renamed from: a */
        public static final C1596b f2727a = new C1596b();

        /* renamed from: b */
        public static final C4205d f2728b = C4205d.m7742a("logRequest");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            ((C4207f) obj2).mo15801f(f2728b, ((C1614j) obj).mo11755a());
        }
    }

    /* renamed from: b.l.a.a.e.e.b$c */
    public static final class C1597c implements C4206e<C1615k> {

        /* renamed from: a */
        public static final C1597c f2729a = new C1597c();

        /* renamed from: b */
        public static final C4205d f2730b = C4205d.m7742a("clientType");

        /* renamed from: c */
        public static final C4205d f2731c = C4205d.m7742a("androidClientInfo");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C1615k kVar = (C1615k) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15801f(f2730b, kVar.mo11760b());
            fVar.mo15801f(f2731c, kVar.mo11759a());
        }
    }

    /* renamed from: b.l.a.a.e.e.b$d */
    public static final class C1598d implements C4206e<C1617l> {

        /* renamed from: a */
        public static final C1598d f2732a = new C1598d();

        /* renamed from: b */
        public static final C4205d f2733b = C4205d.m7742a("eventTimeMs");

        /* renamed from: c */
        public static final C4205d f2734c = C4205d.m7742a("eventCode");

        /* renamed from: d */
        public static final C4205d f2735d = C4205d.m7742a("eventUptimeMs");

        /* renamed from: e */
        public static final C4205d f2736e = C4205d.m7742a("sourceExtension");

        /* renamed from: f */
        public static final C4205d f2737f = C4205d.m7742a("sourceExtensionJsonProto3");

        /* renamed from: g */
        public static final C4205d f2738g = C4205d.m7742a("timezoneOffsetSeconds");

        /* renamed from: h */
        public static final C4205d f2739h = C4205d.m7742a("networkConnectionInfo");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C1617l lVar = (C1617l) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15799b(f2733b, lVar.mo11765b());
            fVar.mo15801f(f2734c, lVar.mo11764a());
            fVar.mo15799b(f2735d, lVar.mo11766c());
            fVar.mo15801f(f2736e, lVar.mo11768e());
            fVar.mo15801f(f2737f, lVar.mo11770f());
            fVar.mo15799b(f2738g, lVar.mo11771g());
            fVar.mo15801f(f2739h, lVar.mo11767d());
        }
    }

    /* renamed from: b.l.a.a.e.e.b$e */
    public static final class C1599e implements C4206e<C1619m> {

        /* renamed from: a */
        public static final C1599e f2740a = new C1599e();

        /* renamed from: b */
        public static final C4205d f2741b = C4205d.m7742a("requestTimeMs");

        /* renamed from: c */
        public static final C4205d f2742c = C4205d.m7742a("requestUptimeMs");

        /* renamed from: d */
        public static final C4205d f2743d = C4205d.m7742a("clientInfo");

        /* renamed from: e */
        public static final C4205d f2744e = C4205d.m7742a("logSource");

        /* renamed from: f */
        public static final C4205d f2745f = C4205d.m7742a("logSourceName");

        /* renamed from: g */
        public static final C4205d f2746g = C4205d.m7742a("logEvent");

        /* renamed from: h */
        public static final C4205d f2747h = C4205d.m7742a("qosTier");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C1619m mVar = (C1619m) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15799b(f2741b, mVar.mo11780f());
            fVar.mo15799b(f2742c, mVar.mo11781g());
            fVar.mo15801f(f2743d, mVar.mo11774a());
            fVar.mo15801f(f2744e, mVar.mo11776c());
            fVar.mo15801f(f2745f, mVar.mo11777d());
            fVar.mo15801f(f2746g, mVar.mo11775b());
            fVar.mo15801f(f2747h, mVar.mo11778e());
        }
    }

    /* renamed from: b.l.a.a.e.e.b$f */
    public static final class C1600f implements C4206e<C1621o> {

        /* renamed from: a */
        public static final C1600f f2748a = new C1600f();

        /* renamed from: b */
        public static final C4205d f2749b = C4205d.m7742a("networkType");

        /* renamed from: c */
        public static final C4205d f2750c = C4205d.m7742a("mobileSubtype");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C1621o oVar = (C1621o) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15801f(f2749b, oVar.mo11789b());
            fVar.mo15801f(f2750c, oVar.mo11788a());
        }
    }

    /* renamed from: a */
    public void mo11750a(C4211b<?> bVar) {
        Class<C1614j> cls = C1614j.class;
        C1596b bVar2 = C1596b.f2727a;
        C4216e eVar = (C4216e) bVar;
        eVar.f7802a.put(cls, bVar2);
        eVar.f7803b.remove(cls);
        Class<C1603d> cls2 = C1603d.class;
        eVar.f7802a.put(cls2, bVar2);
        eVar.f7803b.remove(cls2);
        Class<C1619m> cls3 = C1619m.class;
        C1599e eVar2 = C1599e.f2740a;
        eVar.f7802a.put(cls3, eVar2);
        eVar.f7803b.remove(cls3);
        Class<C1609g> cls4 = C1609g.class;
        eVar.f7802a.put(cls4, eVar2);
        eVar.f7803b.remove(cls4);
        Class<C1615k> cls5 = C1615k.class;
        C1597c cVar = C1597c.f2729a;
        eVar.f7802a.put(cls5, cVar);
        eVar.f7803b.remove(cls5);
        Class<C1604e> cls6 = C1604e.class;
        eVar.f7802a.put(cls6, cVar);
        eVar.f7803b.remove(cls6);
        Class<C1593a> cls7 = C1593a.class;
        C1595a aVar = C1595a.f2714a;
        eVar.f7802a.put(cls7, aVar);
        eVar.f7803b.remove(cls7);
        Class<C1601c> cls8 = C1601c.class;
        eVar.f7802a.put(cls8, aVar);
        eVar.f7803b.remove(cls8);
        Class<C1617l> cls9 = C1617l.class;
        C1598d dVar = C1598d.f2732a;
        eVar.f7802a.put(cls9, dVar);
        eVar.f7803b.remove(cls9);
        Class<C1606f> cls10 = C1606f.class;
        eVar.f7802a.put(cls10, dVar);
        eVar.f7803b.remove(cls10);
        Class<C1621o> cls11 = C1621o.class;
        C1600f fVar = C1600f.f2748a;
        eVar.f7802a.put(cls11, fVar);
        eVar.f7803b.remove(cls11);
        Class<C1612i> cls12 = C1612i.class;
        eVar.f7802a.put(cls12, fVar);
        eVar.f7803b.remove(cls12);
    }
}
