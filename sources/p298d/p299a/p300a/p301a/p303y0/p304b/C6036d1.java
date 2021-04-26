package p298d.p299a.p300a.p301a.p303y0.p304b;

import androidx.core.p003os.EnvironmentCompat;
import java.util.Map;
import p298d.p334t.p335z.C6808a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.d1 */
public final class C6036d1 {

    /* renamed from: a */
    public static final C6036d1 f11877a = new C6036d1();

    /* renamed from: b */
    public static final Map<C6050e1, Integer> f11878b;

    /* renamed from: d.a.a.a.y0.b.d1$a */
    public static final class C6037a extends C6050e1 {

        /* renamed from: c */
        public static final C6037a f11879c = new C6037a();

        public C6037a() {
            super("inherited", false);
        }
    }

    /* renamed from: d.a.a.a.y0.b.d1$b */
    public static final class C6038b extends C6050e1 {

        /* renamed from: c */
        public static final C6038b f11880c = new C6038b();

        public C6038b() {
            super("internal", false);
        }
    }

    /* renamed from: d.a.a.a.y0.b.d1$c */
    public static final class C6039c extends C6050e1 {

        /* renamed from: c */
        public static final C6039c f11881c = new C6039c();

        public C6039c() {
            super("invisible_fake", false);
        }
    }

    /* renamed from: d.a.a.a.y0.b.d1$d */
    public static final class C6040d extends C6050e1 {

        /* renamed from: c */
        public static final C6040d f11882c = new C6040d();

        public C6040d() {
            super("local", false);
        }
    }

    /* renamed from: d.a.a.a.y0.b.d1$e */
    public static final class C6041e extends C6050e1 {

        /* renamed from: c */
        public static final C6041e f11883c = new C6041e();

        public C6041e() {
            super("private", false);
        }
    }

    /* renamed from: d.a.a.a.y0.b.d1$f */
    public static final class C6042f extends C6050e1 {

        /* renamed from: c */
        public static final C6042f f11884c = new C6042f();

        public C6042f() {
            super("private_to_this", false);
        }

        /* renamed from: b */
        public String mo23152b() {
            return "private/*private to this*/";
        }
    }

    /* renamed from: d.a.a.a.y0.b.d1$g */
    public static final class C6043g extends C6050e1 {

        /* renamed from: c */
        public static final C6043g f11885c = new C6043g();

        public C6043g() {
            super("protected", true);
        }
    }

    /* renamed from: d.a.a.a.y0.b.d1$h */
    public static final class C6044h extends C6050e1 {

        /* renamed from: c */
        public static final C6044h f11886c = new C6044h();

        public C6044h() {
            super("public", true);
        }
    }

    /* renamed from: d.a.a.a.y0.b.d1$i */
    public static final class C6045i extends C6050e1 {

        /* renamed from: c */
        public static final C6045i f11887c = new C6045i();

        public C6045i() {
            super(EnvironmentCompat.MEDIA_UNKNOWN, false);
        }
    }

    static {
        C6808a aVar = new C6808a();
        aVar.put(C6042f.f11884c, 0);
        aVar.put(C6041e.f11883c, 0);
        aVar.put(C6038b.f11880c, 1);
        aVar.put(C6043g.f11885c, 1);
        aVar.put(C6044h.f11886c, 2);
        C6888i.m12438e(aVar, "builder");
        aVar.mo24087c();
        aVar.f13728l = true;
        f11878b = aVar;
    }

    /* renamed from: a */
    public final boolean mo23151a(C6050e1 e1Var) {
        C6888i.m12438e(e1Var, "visibility");
        return e1Var == C6041e.f11883c || e1Var == C6042f.f11884c;
    }
}
