package p005b.p096l.p180d.p191q.p192f.p197i;

import com.amplitude.api.Constants;
import com.amplitude.api.DatabaseHelper;
import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.integrations.BasePayload;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;
import p005b.p096l.p180d.p208s.C4205d;
import p005b.p096l.p180d.p208s.C4206e;
import p005b.p096l.p180d.p208s.C4207f;
import p005b.p096l.p180d.p208s.p209i.C4210a;
import p005b.p096l.p180d.p208s.p209i.C4211b;
import p005b.p096l.p180d.p208s.p210j.C4216e;

/* renamed from: b.l.d.q.f.i.a */
public final class C4063a implements C4210a {

    /* renamed from: a */
    public static final C4210a f7474a = new C4063a();

    /* renamed from: b.l.d.q.f.i.a$a */
    public static final class C4064a implements C4206e<C4129v.C4131b> {

        /* renamed from: a */
        public static final C4064a f7475a = new C4064a();

        /* renamed from: b */
        public static final C4205d f7476b = C4205d.m7742a("key");

        /* renamed from: c */
        public static final C4205d f7477c = C4205d.m7742a("value");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C4129v.C4131b bVar = (C4129v.C4131b) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15801f(f7476b, bVar.mo15595a());
            fVar.mo15801f(f7477c, bVar.mo15596b());
        }
    }

    /* renamed from: b.l.d.q.f.i.a$b */
    public static final class C4065b implements C4206e<C4129v> {

        /* renamed from: a */
        public static final C4065b f7478a = new C4065b();

        /* renamed from: b */
        public static final C4205d f7479b = C4205d.m7742a("sdkVersion");

        /* renamed from: c */
        public static final C4205d f7480c = C4205d.m7742a("gmpAppId");

        /* renamed from: d */
        public static final C4205d f7481d = C4205d.m7742a(Constants.AMP_TRACKING_OPTION_PLATFORM);

        /* renamed from: e */
        public static final C4205d f7482e = C4205d.m7742a("installationUuid");

        /* renamed from: f */
        public static final C4205d f7483f = C4205d.m7742a("buildVersion");

        /* renamed from: g */
        public static final C4205d f7484g = C4205d.m7742a("displayVersion");

        /* renamed from: h */
        public static final C4205d f7485h = C4205d.m7742a("session");

        /* renamed from: i */
        public static final C4205d f7486i = C4205d.m7742a("ndkPayload");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C4129v vVar = (C4129v) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15801f(f7479b, vVar.mo15589g());
            fVar.mo15801f(f7480c, vVar.mo15584c());
            fVar.mo15800c(f7481d, vVar.mo15588f());
            fVar.mo15801f(f7482e, vVar.mo15585d());
            fVar.mo15801f(f7483f, vVar.mo15582a());
            fVar.mo15801f(f7484g, vVar.mo15583b());
            fVar.mo15801f(f7485h, vVar.mo15590h());
            fVar.mo15801f(f7486i, vVar.mo15586e());
        }
    }

    /* renamed from: b.l.d.q.f.i.a$c */
    public static final class C4066c implements C4206e<C4129v.C4132c> {

        /* renamed from: a */
        public static final C4066c f7487a = new C4066c();

        /* renamed from: b */
        public static final C4205d f7488b = C4205d.m7742a("files");

        /* renamed from: c */
        public static final C4205d f7489c = C4205d.m7742a("orgId");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C4129v.C4132c cVar = (C4129v.C4132c) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15801f(f7488b, cVar.mo15600a());
            fVar.mo15801f(f7489c, cVar.mo15601b());
        }
    }

    /* renamed from: b.l.d.q.f.i.a$d */
    public static final class C4067d implements C4206e<C4129v.C4132c.C4133a> {

        /* renamed from: a */
        public static final C4067d f7490a = new C4067d();

        /* renamed from: b */
        public static final C4205d f7491b = C4205d.m7742a("filename");

        /* renamed from: c */
        public static final C4205d f7492c = C4205d.m7742a("contents");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C4129v.C4132c.C4133a aVar = (C4129v.C4132c.C4133a) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15801f(f7491b, aVar.mo15606b());
            fVar.mo15801f(f7492c, aVar.mo15605a());
        }
    }

    /* renamed from: b.l.d.q.f.i.a$e */
    public static final class C4068e implements C4206e<C4129v.C4134d.C4135a> {

        /* renamed from: a */
        public static final C4068e f7493a = new C4068e();

        /* renamed from: b */
        public static final C4205d f7494b = C4205d.m7742a("identifier");

        /* renamed from: c */
        public static final C4205d f7495c = C4205d.m7742a("version");

        /* renamed from: d */
        public static final C4205d f7496d = C4205d.m7742a("displayVersion");

        /* renamed from: e */
        public static final C4205d f7497e = C4205d.m7742a("organization");

        /* renamed from: f */
        public static final C4205d f7498f = C4205d.m7742a("installationUuid");

        /* renamed from: g */
        public static final C4205d f7499g = C4205d.m7742a("developmentPlatform");

        /* renamed from: h */
        public static final C4205d f7500h = C4205d.m7742a("developmentPlatformVersion");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C4129v.C4134d.C4135a aVar = (C4129v.C4134d.C4135a) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15801f(f7494b, aVar.mo15630d());
            fVar.mo15801f(f7495c, aVar.mo15634g());
            fVar.mo15801f(f7496d, aVar.mo15629c());
            fVar.mo15801f(f7497e, aVar.mo15633f());
            fVar.mo15801f(f7498f, aVar.mo15631e());
            fVar.mo15801f(f7499g, aVar.mo15627a());
            fVar.mo15801f(f7500h, aVar.mo15628b());
        }
    }

    /* renamed from: b.l.d.q.f.i.a$f */
    public static final class C4069f implements C4206e<C4129v.C4134d.C4135a.C4136a> {

        /* renamed from: a */
        public static final C4069f f7501a = new C4069f();

        /* renamed from: b */
        public static final C4205d f7502b = C4205d.m7742a("clsId");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            ((C4207f) obj2).mo15801f(f7502b, ((C4129v.C4134d.C4135a.C4136a) obj).mo15637a());
        }
    }

    /* renamed from: b.l.d.q.f.i.a$g */
    public static final class C4070g implements C4206e<C4129v.C4134d.C4138c> {

        /* renamed from: a */
        public static final C4070g f7503a = new C4070g();

        /* renamed from: b */
        public static final C4205d f7504b = C4205d.m7742a("arch");

        /* renamed from: c */
        public static final C4205d f7505c = C4205d.m7742a(AnalyticsContext.Device.DEVICE_MODEL_KEY);

        /* renamed from: d */
        public static final C4205d f7506d = C4205d.m7742a("cores");

        /* renamed from: e */
        public static final C4205d f7507e = C4205d.m7742a("ram");

        /* renamed from: f */
        public static final C4205d f7508f = C4205d.m7742a("diskSpace");

        /* renamed from: g */
        public static final C4205d f7509g = C4205d.m7742a("simulator");

        /* renamed from: h */
        public static final C4205d f7510h = C4205d.m7742a("state");

        /* renamed from: i */
        public static final C4205d f7511i = C4205d.m7742a(AnalyticsContext.Device.DEVICE_MANUFACTURER_KEY);

        /* renamed from: j */
        public static final C4205d f7512j = C4205d.m7742a("modelClass");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C4129v.C4134d.C4138c cVar = (C4129v.C4134d.C4138c) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15800c(f7504b, cVar.mo15641a());
            fVar.mo15801f(f7505c, cVar.mo15645e());
            fVar.mo15800c(f7506d, cVar.mo15642b());
            fVar.mo15799b(f7507e, cVar.mo15648g());
            fVar.mo15799b(f7508f, cVar.mo15643c());
            fVar.mo15798a(f7509g, cVar.mo15651i());
            fVar.mo15800c(f7510h, cVar.mo15649h());
            fVar.mo15801f(f7511i, cVar.mo15644d());
            fVar.mo15801f(f7512j, cVar.mo15647f());
        }
    }

    /* renamed from: b.l.d.q.f.i.a$h */
    public static final class C4071h implements C4206e<C4129v.C4134d> {

        /* renamed from: a */
        public static final C4071h f7513a = new C4071h();

        /* renamed from: b */
        public static final C4205d f7514b = C4205d.m7742a("generator");

        /* renamed from: c */
        public static final C4205d f7515c = C4205d.m7742a("identifier");

        /* renamed from: d */
        public static final C4205d f7516d = C4205d.m7742a("startedAt");

        /* renamed from: e */
        public static final C4205d f7517e = C4205d.m7742a("endedAt");

        /* renamed from: f */
        public static final C4205d f7518f = C4205d.m7742a("crashed");

        /* renamed from: g */
        public static final C4205d f7519g = C4205d.m7742a("app");

        /* renamed from: h */
        public static final C4205d f7520h = C4205d.m7742a("user");

        /* renamed from: i */
        public static final C4205d f7521i = C4205d.m7742a("os");

        /* renamed from: j */
        public static final C4205d f7522j = C4205d.m7742a("device");

        /* renamed from: k */
        public static final C4205d f7523k = C4205d.m7742a(DatabaseHelper.EVENT_TABLE_NAME);

        /* renamed from: l */
        public static final C4205d f7524l = C4205d.m7742a("generatorType");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C4129v.C4134d dVar = (C4129v.C4134d) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15801f(f7514b, dVar.mo15614e());
            fVar.mo15801f(f7515c, dVar.mo15617g().getBytes(C4129v.f7711a));
            fVar.mo15799b(f7516d, dVar.mo15620i());
            fVar.mo15801f(f7517e, dVar.mo15612c());
            fVar.mo15798a(f7518f, dVar.mo15622k());
            fVar.mo15801f(f7519g, dVar.mo15610a());
            fVar.mo15801f(f7520h, dVar.mo15621j());
            fVar.mo15801f(f7521i, dVar.mo15618h());
            fVar.mo15801f(f7522j, dVar.mo15611b());
            fVar.mo15801f(f7523k, dVar.mo15613d());
            fVar.mo15800c(f7524l, dVar.mo15616f());
        }
    }

    /* renamed from: b.l.d.q.f.i.a$i */
    public static final class C4072i implements C4206e<C4129v.C4134d.C4140d.C4141a> {

        /* renamed from: a */
        public static final C4072i f7525a = new C4072i();

        /* renamed from: b */
        public static final C4205d f7526b = C4205d.m7742a("execution");

        /* renamed from: c */
        public static final C4205d f7527c = C4205d.m7742a("customAttributes");

        /* renamed from: d */
        public static final C4205d f7528d = C4205d.m7742a("background");

        /* renamed from: e */
        public static final C4205d f7529e = C4205d.m7742a("uiOrientation");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C4129v.C4134d.C4140d.C4141a aVar = (C4129v.C4134d.C4140d.C4141a) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15801f(f7526b, aVar.mo15664c());
            fVar.mo15801f(f7527c, aVar.mo15663b());
            fVar.mo15801f(f7528d, aVar.mo15662a());
            fVar.mo15800c(f7529e, aVar.mo15665d());
        }
    }

    /* renamed from: b.l.d.q.f.i.a$j */
    public static final class C4073j implements C4206e<C4129v.C4134d.C4140d.C4141a.C4143b.C4144a> {

        /* renamed from: a */
        public static final C4073j f7530a = new C4073j();

        /* renamed from: b */
        public static final C4205d f7531b = C4205d.m7742a("baseAddress");

        /* renamed from: c */
        public static final C4205d f7532c = C4205d.m7742a("size");

        /* renamed from: d */
        public static final C4205d f7533d = C4205d.m7742a("name");

        /* renamed from: e */
        public static final C4205d f7534e = C4205d.m7742a("uuid");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C4129v.C4134d.C4140d.C4141a.C4143b.C4144a aVar = (C4129v.C4134d.C4140d.C4141a.C4143b.C4144a) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15799b(f7531b, aVar.mo15678a());
            fVar.mo15799b(f7532c, aVar.mo15680c());
            fVar.mo15801f(f7533d, aVar.mo15679b());
            C4205d dVar = f7534e;
            String d = aVar.mo15681d();
            fVar.mo15801f(dVar, d != null ? d.getBytes(C4129v.f7711a) : null);
        }
    }

    /* renamed from: b.l.d.q.f.i.a$k */
    public static final class C4074k implements C4206e<C4129v.C4134d.C4140d.C4141a.C4143b> {

        /* renamed from: a */
        public static final C4074k f7535a = new C4074k();

        /* renamed from: b */
        public static final C4205d f7536b = C4205d.m7742a("threads");

        /* renamed from: c */
        public static final C4205d f7537c = C4205d.m7742a("exception");

        /* renamed from: d */
        public static final C4205d f7538d = C4205d.m7742a("signal");

        /* renamed from: e */
        public static final C4205d f7539e = C4205d.m7742a("binaries");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C4129v.C4134d.C4140d.C4141a.C4143b bVar = (C4129v.C4134d.C4140d.C4141a.C4143b) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15801f(f7536b, bVar.mo15674d());
            fVar.mo15801f(f7537c, bVar.mo15672b());
            fVar.mo15801f(f7538d, bVar.mo15673c());
            fVar.mo15801f(f7539e, bVar.mo15671a());
        }
    }

    /* renamed from: b.l.d.q.f.i.a$l */
    public static final class C4075l implements C4206e<C4129v.C4134d.C4140d.C4141a.C4143b.C4145b> {

        /* renamed from: a */
        public static final C4075l f7540a = new C4075l();

        /* renamed from: b */
        public static final C4205d f7541b = C4205d.m7742a("type");

        /* renamed from: c */
        public static final C4205d f7542c = C4205d.m7742a("reason");

        /* renamed from: d */
        public static final C4205d f7543d = C4205d.m7742a("frames");

        /* renamed from: e */
        public static final C4205d f7544e = C4205d.m7742a("causedBy");

        /* renamed from: f */
        public static final C4205d f7545f = C4205d.m7742a("overflowCount");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C4129v.C4134d.C4140d.C4141a.C4143b.C4145b bVar = (C4129v.C4134d.C4140d.C4141a.C4143b.C4145b) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15801f(f7541b, bVar.mo15689e());
            fVar.mo15801f(f7542c, bVar.mo15688d());
            fVar.mo15801f(f7543d, bVar.mo15686b());
            fVar.mo15801f(f7544e, bVar.mo15685a());
            fVar.mo15800c(f7545f, bVar.mo15687c());
        }
    }

    /* renamed from: b.l.d.q.f.i.a$m */
    public static final class C4076m implements C4206e<C4129v.C4134d.C4140d.C4141a.C4143b.C4146c> {

        /* renamed from: a */
        public static final C4076m f7546a = new C4076m();

        /* renamed from: b */
        public static final C4205d f7547b = C4205d.m7742a("name");

        /* renamed from: c */
        public static final C4205d f7548c = C4205d.m7742a("code");

        /* renamed from: d */
        public static final C4205d f7549d = C4205d.m7742a("address");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C4129v.C4134d.C4140d.C4141a.C4143b.C4146c cVar = (C4129v.C4134d.C4140d.C4141a.C4143b.C4146c) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15801f(f7547b, cVar.mo15695c());
            fVar.mo15801f(f7548c, cVar.mo15694b());
            fVar.mo15799b(f7549d, cVar.mo15693a());
        }
    }

    /* renamed from: b.l.d.q.f.i.a$n */
    public static final class C4077n implements C4206e<C4129v.C4134d.C4140d.C4141a.C4143b.C4147d> {

        /* renamed from: a */
        public static final C4077n f7550a = new C4077n();

        /* renamed from: b */
        public static final C4205d f7551b = C4205d.m7742a("name");

        /* renamed from: c */
        public static final C4205d f7552c = C4205d.m7742a("importance");

        /* renamed from: d */
        public static final C4205d f7553d = C4205d.m7742a("frames");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C4129v.C4134d.C4140d.C4141a.C4143b.C4147d dVar = (C4129v.C4134d.C4140d.C4141a.C4143b.C4147d) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15801f(f7551b, dVar.mo15701c());
            fVar.mo15800c(f7552c, dVar.mo15700b());
            fVar.mo15801f(f7553d, dVar.mo15699a());
        }
    }

    /* renamed from: b.l.d.q.f.i.a$o */
    public static final class C4078o implements C4206e<C4129v.C4134d.C4140d.C4141a.C4143b.C4147d.C4148a> {

        /* renamed from: a */
        public static final C4078o f7554a = new C4078o();

        /* renamed from: b */
        public static final C4205d f7555b = C4205d.m7742a("pc");

        /* renamed from: c */
        public static final C4205d f7556c = C4205d.m7742a("symbol");

        /* renamed from: d */
        public static final C4205d f7557d = C4205d.m7742a("file");

        /* renamed from: e */
        public static final C4205d f7558e = C4205d.m7742a("offset");

        /* renamed from: f */
        public static final C4205d f7559f = C4205d.m7742a("importance");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C4129v.C4134d.C4140d.C4141a.C4143b.C4147d.C4148a aVar = (C4129v.C4134d.C4140d.C4141a.C4143b.C4147d.C4148a) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15799b(f7555b, aVar.mo15708d());
            fVar.mo15801f(f7556c, aVar.mo15709e());
            fVar.mo15801f(f7557d, aVar.mo15705a());
            fVar.mo15799b(f7558e, aVar.mo15707c());
            fVar.mo15800c(f7559f, aVar.mo15706b());
        }
    }

    /* renamed from: b.l.d.q.f.i.a$p */
    public static final class C4079p implements C4206e<C4129v.C4134d.C4140d.C4150b> {

        /* renamed from: a */
        public static final C4079p f7560a = new C4079p();

        /* renamed from: b */
        public static final C4205d f7561b = C4205d.m7742a("batteryLevel");

        /* renamed from: c */
        public static final C4205d f7562c = C4205d.m7742a("batteryVelocity");

        /* renamed from: d */
        public static final C4205d f7563d = C4205d.m7742a("proximityOn");

        /* renamed from: e */
        public static final C4205d f7564e = C4205d.m7742a("orientation");

        /* renamed from: f */
        public static final C4205d f7565f = C4205d.m7742a("ramUsed");

        /* renamed from: g */
        public static final C4205d f7566g = C4205d.m7742a("diskUsed");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C4129v.C4134d.C4140d.C4150b bVar = (C4129v.C4134d.C4140d.C4150b) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15801f(f7561b, bVar.mo15714a());
            fVar.mo15800c(f7562c, bVar.mo15715b());
            fVar.mo15798a(f7563d, bVar.mo15720f());
            fVar.mo15800c(f7564e, bVar.mo15717d());
            fVar.mo15799b(f7565f, bVar.mo15718e());
            fVar.mo15799b(f7566g, bVar.mo15716c());
        }
    }

    /* renamed from: b.l.d.q.f.i.a$q */
    public static final class C4080q implements C4206e<C4129v.C4134d.C4140d> {

        /* renamed from: a */
        public static final C4080q f7567a = new C4080q();

        /* renamed from: b */
        public static final C4205d f7568b = C4205d.m7742a(BasePayload.TIMESTAMP_KEY);

        /* renamed from: c */
        public static final C4205d f7569c = C4205d.m7742a("type");

        /* renamed from: d */
        public static final C4205d f7570d = C4205d.m7742a("app");

        /* renamed from: e */
        public static final C4205d f7571e = C4205d.m7742a("device");

        /* renamed from: f */
        public static final C4205d f7572f = C4205d.m7742a("log");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C4129v.C4134d.C4140d dVar = (C4129v.C4134d.C4140d) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15799b(f7568b, dVar.mo15657d());
            fVar.mo15801f(f7569c, dVar.mo15658e());
            fVar.mo15801f(f7570d, dVar.mo15654a());
            fVar.mo15801f(f7571e, dVar.mo15655b());
            fVar.mo15801f(f7572f, dVar.mo15656c());
        }
    }

    /* renamed from: b.l.d.q.f.i.a$r */
    public static final class C4081r implements C4206e<C4129v.C4134d.C4140d.C4152c> {

        /* renamed from: a */
        public static final C4081r f7573a = new C4081r();

        /* renamed from: b */
        public static final C4205d f7574b = C4205d.m7742a("content");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            ((C4207f) obj2).mo15801f(f7574b, ((C4129v.C4134d.C4140d.C4152c) obj).mo15724a());
        }
    }

    /* renamed from: b.l.d.q.f.i.a$s */
    public static final class C4082s implements C4206e<C4129v.C4134d.C4153e> {

        /* renamed from: a */
        public static final C4082s f7575a = new C4082s();

        /* renamed from: b */
        public static final C4205d f7576b = C4205d.m7742a(Constants.AMP_TRACKING_OPTION_PLATFORM);

        /* renamed from: c */
        public static final C4205d f7577c = C4205d.m7742a("version");

        /* renamed from: d */
        public static final C4205d f7578d = C4205d.m7742a("buildVersion");

        /* renamed from: e */
        public static final C4205d f7579e = C4205d.m7742a("jailbroken");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            C4129v.C4134d.C4153e eVar = (C4129v.C4134d.C4153e) obj;
            C4207f fVar = (C4207f) obj2;
            fVar.mo15800c(f7576b, eVar.mo15729b());
            fVar.mo15801f(f7577c, eVar.mo15730c());
            fVar.mo15801f(f7578d, eVar.mo15728a());
            fVar.mo15798a(f7579e, eVar.mo15731d());
        }
    }

    /* renamed from: b.l.d.q.f.i.a$t */
    public static final class C4083t implements C4206e<C4129v.C4134d.C4154f> {

        /* renamed from: a */
        public static final C4083t f7580a = new C4083t();

        /* renamed from: b */
        public static final C4205d f7581b = C4205d.m7742a("identifier");

        /* renamed from: a */
        public void mo11751a(Object obj, Object obj2) {
            ((C4207f) obj2).mo15801f(f7581b, ((C4129v.C4134d.C4154f) obj).mo15735a());
        }
    }

    /* renamed from: a */
    public void mo15581a(C4211b<?> bVar) {
        Class<C4129v> cls = C4129v.class;
        C4065b bVar2 = C4065b.f7478a;
        C4216e eVar = (C4216e) bVar;
        eVar.f7802a.put(cls, bVar2);
        eVar.f7803b.remove(cls);
        Class<C4084b> cls2 = C4084b.class;
        eVar.f7802a.put(cls2, bVar2);
        eVar.f7803b.remove(cls2);
        Class<C4129v.C4134d> cls3 = C4129v.C4134d.class;
        C4071h hVar = C4071h.f7513a;
        eVar.f7802a.put(cls3, hVar);
        eVar.f7803b.remove(cls3);
        Class<C4093f> cls4 = C4093f.class;
        eVar.f7802a.put(cls4, hVar);
        eVar.f7803b.remove(cls4);
        Class<C4129v.C4134d.C4135a> cls5 = C4129v.C4134d.C4135a.class;
        C4068e eVar2 = C4068e.f7493a;
        eVar.f7802a.put(cls5, eVar2);
        eVar.f7803b.remove(cls5);
        Class<C4096g> cls6 = C4096g.class;
        eVar.f7802a.put(cls6, eVar2);
        eVar.f7803b.remove(cls6);
        Class<C4129v.C4134d.C4135a.C4136a> cls7 = C4129v.C4134d.C4135a.C4136a.class;
        C4069f fVar = C4069f.f7501a;
        eVar.f7802a.put(cls7, fVar);
        eVar.f7803b.remove(cls7);
        Class<C4098h> cls8 = C4098h.class;
        eVar.f7802a.put(cls8, fVar);
        eVar.f7803b.remove(cls8);
        Class<C4129v.C4134d.C4154f> cls9 = C4129v.C4134d.C4154f.class;
        C4083t tVar = C4083t.f7580a;
        eVar.f7802a.put(cls9, tVar);
        eVar.f7803b.remove(cls9);
        Class<C4127u> cls10 = C4127u.class;
        eVar.f7802a.put(cls10, tVar);
        eVar.f7803b.remove(cls10);
        Class<C4129v.C4134d.C4153e> cls11 = C4129v.C4134d.C4153e.class;
        C4082s sVar = C4082s.f7575a;
        eVar.f7802a.put(cls11, sVar);
        eVar.f7803b.remove(cls11);
        Class<C4125t> cls12 = C4125t.class;
        eVar.f7802a.put(cls12, sVar);
        eVar.f7803b.remove(cls12);
        Class<C4129v.C4134d.C4138c> cls13 = C4129v.C4134d.C4138c.class;
        C4070g gVar = C4070g.f7503a;
        eVar.f7802a.put(cls13, gVar);
        eVar.f7803b.remove(cls13);
        Class<C4099i> cls14 = C4099i.class;
        eVar.f7802a.put(cls14, gVar);
        eVar.f7803b.remove(cls14);
        Class<C4129v.C4134d.C4140d> cls15 = C4129v.C4134d.C4140d.class;
        C4080q qVar = C4080q.f7567a;
        eVar.f7802a.put(cls15, qVar);
        eVar.f7803b.remove(cls15);
        Class<C4102j> cls16 = C4102j.class;
        eVar.f7802a.put(cls16, qVar);
        eVar.f7803b.remove(cls16);
        Class<C4129v.C4134d.C4140d.C4141a> cls17 = C4129v.C4134d.C4140d.C4141a.class;
        C4072i iVar = C4072i.f7525a;
        eVar.f7802a.put(cls17, iVar);
        eVar.f7803b.remove(cls17);
        Class<C4104k> cls18 = C4104k.class;
        eVar.f7802a.put(cls18, iVar);
        eVar.f7803b.remove(cls18);
        Class<C4129v.C4134d.C4140d.C4141a.C4143b> cls19 = C4129v.C4134d.C4140d.C4141a.C4143b.class;
        C4074k kVar = C4074k.f7535a;
        eVar.f7802a.put(cls19, kVar);
        eVar.f7803b.remove(cls19);
        Class<C4107l> cls20 = C4107l.class;
        eVar.f7802a.put(cls20, kVar);
        eVar.f7803b.remove(cls20);
        Class<C4129v.C4134d.C4140d.C4141a.C4143b.C4147d> cls21 = C4129v.C4134d.C4140d.C4141a.C4143b.C4147d.class;
        C4077n nVar = C4077n.f7550a;
        eVar.f7802a.put(cls21, nVar);
        eVar.f7803b.remove(cls21);
        Class<C4115p> cls22 = C4115p.class;
        eVar.f7802a.put(cls22, nVar);
        eVar.f7803b.remove(cls22);
        Class<C4129v.C4134d.C4140d.C4141a.C4143b.C4147d.C4148a> cls23 = C4129v.C4134d.C4140d.C4141a.C4143b.C4147d.C4148a.class;
        C4078o oVar = C4078o.f7554a;
        eVar.f7802a.put(cls23, oVar);
        eVar.f7803b.remove(cls23);
        Class<C4117q> cls24 = C4117q.class;
        eVar.f7802a.put(cls24, oVar);
        eVar.f7803b.remove(cls24);
        Class<C4129v.C4134d.C4140d.C4141a.C4143b.C4145b> cls25 = C4129v.C4134d.C4140d.C4141a.C4143b.C4145b.class;
        C4075l lVar = C4075l.f7540a;
        eVar.f7802a.put(cls25, lVar);
        eVar.f7803b.remove(cls25);
        Class<C4111n> cls26 = C4111n.class;
        eVar.f7802a.put(cls26, lVar);
        eVar.f7803b.remove(cls26);
        Class<C4129v.C4134d.C4140d.C4141a.C4143b.C4146c> cls27 = C4129v.C4134d.C4140d.C4141a.C4143b.C4146c.class;
        C4076m mVar = C4076m.f7546a;
        eVar.f7802a.put(cls27, mVar);
        eVar.f7803b.remove(cls27);
        Class<C4113o> cls28 = C4113o.class;
        eVar.f7802a.put(cls28, mVar);
        eVar.f7803b.remove(cls28);
        Class<C4129v.C4134d.C4140d.C4141a.C4143b.C4144a> cls29 = C4129v.C4134d.C4140d.C4141a.C4143b.C4144a.class;
        C4073j jVar = C4073j.f7530a;
        eVar.f7802a.put(cls29, jVar);
        eVar.f7803b.remove(cls29);
        Class<C4109m> cls30 = C4109m.class;
        eVar.f7802a.put(cls30, jVar);
        eVar.f7803b.remove(cls30);
        Class<C4129v.C4131b> cls31 = C4129v.C4131b.class;
        C4064a aVar = C4064a.f7475a;
        eVar.f7802a.put(cls31, aVar);
        eVar.f7803b.remove(cls31);
        Class<C4087c> cls32 = C4087c.class;
        eVar.f7802a.put(cls32, aVar);
        eVar.f7803b.remove(cls32);
        Class<C4129v.C4134d.C4140d.C4150b> cls33 = C4129v.C4134d.C4140d.C4150b.class;
        C4079p pVar = C4079p.f7560a;
        eVar.f7802a.put(cls33, pVar);
        eVar.f7803b.remove(cls33);
        Class<C4120r> cls34 = C4120r.class;
        eVar.f7802a.put(cls34, pVar);
        eVar.f7803b.remove(cls34);
        Class<C4129v.C4134d.C4140d.C4152c> cls35 = C4129v.C4134d.C4140d.C4152c.class;
        C4081r rVar = C4081r.f7573a;
        eVar.f7802a.put(cls35, rVar);
        eVar.f7803b.remove(cls35);
        Class<C4123s> cls36 = C4123s.class;
        eVar.f7802a.put(cls36, rVar);
        eVar.f7803b.remove(cls36);
        Class<C4129v.C4132c> cls37 = C4129v.C4132c.class;
        C4066c cVar = C4066c.f7487a;
        eVar.f7802a.put(cls37, cVar);
        eVar.f7803b.remove(cls37);
        Class<C4089d> cls38 = C4089d.class;
        eVar.f7802a.put(cls38, cVar);
        eVar.f7803b.remove(cls38);
        Class<C4129v.C4132c.C4133a> cls39 = C4129v.C4132c.C4133a.class;
        C4067d dVar = C4067d.f7490a;
        eVar.f7802a.put(cls39, dVar);
        eVar.f7803b.remove(cls39);
        Class<C4091e> cls40 = C4091e.class;
        eVar.f7802a.put(cls40, dVar);
        eVar.f7803b.remove(cls40);
    }
}
