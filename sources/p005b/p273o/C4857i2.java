package p005b.p273o;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplitude.api.Constants;
import com.appfoundry.previewer.constants.AnimationStrength;
import com.onesignal.OSPermissionChangedInternalObserver;
import com.onesignal.OSSubscriptionChangedInternalObserver;
import com.onesignal.OSSubscriptionState;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p265m.p266a.p267t.C4748i;
import p005b.p273o.C4794c0;
import p005b.p273o.C4823e3;
import p005b.p273o.C4894l1;
import p005b.p273o.C5009w3;
import p005b.p273o.C5041y1;
import p005b.p273o.p274w4.C5011a;
import p005b.p273o.p274w4.C5015e;
import p005b.p273o.p274w4.p275f.C5016a;
import p005b.p273o.p274w4.p275f.C5019c;
import p005b.p273o.p276x4.C5028c;

/* renamed from: b.o.i2 */
public class C4857i2 {
    @NonNull

    /* renamed from: A */
    public static C4835f2 f9331A = new C4835f2();

    /* renamed from: B */
    public static String f9332B;

    /* renamed from: C */
    public static boolean f9333C;

    /* renamed from: D */
    public static boolean f9334D;

    /* renamed from: E */
    public static boolean f9335E;

    /* renamed from: F */
    public static C4794c0.C4798d f9336F;

    /* renamed from: G */
    public static boolean f9337G = true;
    @NonNull

    /* renamed from: H */
    public static C4864g f9338H = new C4864g((C4859b) null);

    /* renamed from: I */
    public static Collection<JSONArray> f9339I = new ArrayList();

    /* renamed from: J */
    public static HashSet<String> f9340J = new HashSet<>();

    /* renamed from: K */
    public static ArrayList<C4866i> f9341K = new ArrayList<>();

    /* renamed from: L */
    public static boolean f9342L;

    /* renamed from: M */
    public static boolean f9343M;

    /* renamed from: N */
    public static boolean f9344N = false;

    /* renamed from: O */
    public static C4886k f9345O;

    /* renamed from: P */
    public static C4823e3.C4829e f9346P;

    /* renamed from: Q */
    public static C4981t1 f9347Q;

    /* renamed from: R */
    public static C4981t1 f9348R;

    /* renamed from: S */
    public static C4927o1<Object, C4995u1> f9349S;

    /* renamed from: T */
    public static OSSubscriptionState f9350T;

    /* renamed from: U */
    public static OSSubscriptionState f9351U;

    /* renamed from: V */
    public static C4927o1<Object, C4782a2> f9352V;

    /* renamed from: W */
    public static C4952r0 f9353W;

    /* renamed from: X */
    public static C4867j f9354X;

    /* renamed from: Y */
    public static C5009w3 f9355Y;
    @Nullable

    /* renamed from: a */
    public static String f9356a;

    /* renamed from: b */
    public static String f9357b;

    /* renamed from: c */
    public static Context f9358c;

    /* renamed from: d */
    public static String f9359d = null;

    /* renamed from: e */
    public static String f9360e = null;

    /* renamed from: f */
    public static int f9361f;

    /* renamed from: g */
    public static boolean f9362g;

    /* renamed from: h */
    public static boolean f9363h;
    @NonNull

    /* renamed from: i */
    public static C4863f f9364i = C4863f.APP_CLOSE;

    /* renamed from: j */
    public static ExecutorService f9365j;

    /* renamed from: k */
    public static ConcurrentLinkedQueue<Runnable> f9366k = new ConcurrentLinkedQueue<>();

    /* renamed from: l */
    public static AtomicLong f9367l = new AtomicLong();

    /* renamed from: m */
    public static C4830e4 f9368m;

    /* renamed from: n */
    public static C4806c4 f9369n;

    /* renamed from: o */
    public static C4818d4 f9370o;

    /* renamed from: p */
    public static C5041y1.C5043b f9371p = new C4859b();

    /* renamed from: q */
    public static C4787b1 f9372q = new C4787b1();

    /* renamed from: r */
    public static C4882j1 f9373r;

    /* renamed from: s */
    public static C4956r2 f9374s = new C4939p3();

    /* renamed from: t */
    public static C5052z1 f9375t;

    /* renamed from: u */
    public static C5015e f9376u;

    /* renamed from: v */
    public static C5041y1 f9377v;
    @Nullable

    /* renamed from: w */
    public static C4953r1 f9378w;
    @Nullable

    /* renamed from: x */
    public static C5028c f9379x;
    @Nullable

    /* renamed from: y */
    public static C4819e f9380y;

    /* renamed from: z */
    public static String f9381z = "native";

    /* renamed from: b.o.i2$a */
    public static class C4858a implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ JSONObject f9382g;

        /* renamed from: h */
        public final /* synthetic */ C4865h f9383h;

        public C4858a(JSONObject jSONObject, C4865h hVar) {
            this.f9382g = jSONObject;
            this.f9383h = hVar;
        }

        public void run() {
            if (this.f9382g == null) {
                C4865h hVar = this.f9383h;
                if (hVar != null) {
                    hVar.mo16614a(new C4877t(-1, "Attempted to send null tags"));
                    return;
                }
                return;
            }
            JSONObject jSONObject = C4947q3.m9084d(false).f9505b;
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> keys = this.f9382g.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    Object opt = this.f9382g.opt(next);
                    if (!(opt instanceof JSONArray)) {
                        if (!(opt instanceof JSONObject)) {
                            if (!this.f9382g.isNull(next)) {
                                if (!"".equals(opt)) {
                                    jSONObject2.put(next, opt.toString());
                                }
                            }
                            if (jSONObject != null && jSONObject.has(next)) {
                                jSONObject2.put(next, "");
                            }
                        }
                    }
                    C4868k kVar = C4868k.ERROR;
                    C4857i2.m8933a(kVar, "Omitting key '" + next + "'! sendTags DO NOT supported nested values!", (Throwable) null);
                } catch (Throwable unused) {
                }
            }
            if (!jSONObject2.toString().equals("{}")) {
                C4865h hVar2 = this.f9383h;
                try {
                    JSONObject put = new JSONObject().put("tags", jSONObject2);
                    C4907m4 b = C4947q3.m9082b();
                    if (hVar2 != null) {
                        b.f9497e.add(hVar2);
                    }
                    b.mo16662o().mo16595d(put, (Set<String>) null);
                    C4885j4 a = C4947q3.m9081a();
                    if (hVar2 != null) {
                        a.f9497e.add(hVar2);
                    }
                    a.mo16662o().mo16595d(put, (Set<String>) null);
                } catch (JSONException e) {
                    if (hVar2 != null) {
                        StringBuilder u = C0843a.m460u("Encountered an error attempting to serialize your tags into JSON: ");
                        u.append(e.getMessage());
                        u.append("\n");
                        u.append(e.getStackTrace());
                        hVar2.mo16614a(new C4877t(-1, u.toString()));
                    }
                    e.printStackTrace();
                }
            } else {
                C4865h hVar3 = this.f9383h;
                if (hVar3 != null) {
                    hVar3.mo16615b(jSONObject);
                }
            }
        }
    }

    /* renamed from: b.o.i2$b */
    public static class C4859b implements C5041y1.C5043b {
    }

    /* renamed from: b.o.i2$c */
    public static class C4860c implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ int f9384g;

        public C4860c(int i) {
            this.f9384g = i;
        }

        public void run() {
            C4783a3 e = C4783a3.m8766e(C4857i2.f9358c);
            StringBuilder u = C0843a.m460u("android_notification_id = ");
            u.append(this.f9384g);
            u.append(" AND ");
            u.append("opened");
            u.append(" = 0 AND ");
            String p = C0843a.m455p(u, "dismissed", " = 0");
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", 1);
            if (e.mo16514l0("notification", contentValues, p, (String[]) null) > 0) {
                Context context = C4857i2.f9358c;
                Cursor S = e.mo16511S("notification", new String[]{"group_id"}, C0843a.m444e("android_notification_id = ", this.f9384g), (String[]) null, (String) null, (String) null, (String) null);
                if (S.moveToFirst()) {
                    String string = S.getString(S.getColumnIndex("group_id"));
                    S.close();
                    if (string != null) {
                        C1960d.m2747R0(context, e, string, true);
                    }
                } else {
                    S.close();
                }
            }
            C4839g.m8876b(e, C4857i2.f9358c);
            C4805c3.m8809h(C4857i2.f9358c).cancel(this.f9384g);
        }
    }

    /* renamed from: b.o.i2$d */
    public static class C4861d implements C5009w3.C5010a {
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
            if (r0 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
            if (r0 != false) goto L_0x001c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo16612a(java.lang.String r5, int r6) {
            /*
                r4 = this;
                r0 = 0
                r1 = -6
                r2 = 1
                if (r6 >= r2) goto L_0x0015
                java.lang.String r3 = p005b.p273o.C4947q3.m9083c()
                if (r3 != 0) goto L_0x001e
                int r3 = p005b.p273o.C4857i2.f9361f
                if (r3 == r2) goto L_0x001c
                if (r3 >= r1) goto L_0x0012
                r0 = r2
            L_0x0012:
                if (r0 == 0) goto L_0x001e
                goto L_0x001c
            L_0x0015:
                int r3 = p005b.p273o.C4857i2.f9361f
                if (r3 >= r1) goto L_0x001a
                r0 = r2
            L_0x001a:
                if (r0 == 0) goto L_0x001e
            L_0x001c:
                p005b.p273o.C4857i2.f9361f = r6
            L_0x001e:
                p005b.p273o.C4857i2.f9332B = r5
                p005b.p273o.C4857i2.f9333C = r2
                android.content.Context r6 = p005b.p273o.C4857i2.f9358c
                com.onesignal.OSSubscriptionState r6 = p005b.p273o.C4857i2.m8945m(r6)
                java.util.Objects.requireNonNull(r6)
                if (r5 != 0) goto L_0x002e
                goto L_0x003e
            L_0x002e:
                java.lang.String r0 = r6.f11502k
                boolean r0 = r5.equals(r0)
                r0 = r0 ^ r2
                r6.f11502k = r5
                if (r0 == 0) goto L_0x003e
                b.o.o1<java.lang.Object, com.onesignal.OSSubscriptionState> r5 = r6.f11498g
                r5.mo16673a(r6)
            L_0x003e:
                p005b.p273o.C4857i2.m8935c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4857i2.C4861d.mo16612a(java.lang.String, int):void");
        }
    }

    /* renamed from: b.o.i2$e */
    public static class C4862e implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ C4868k f9385g;

        /* renamed from: h */
        public final /* synthetic */ String f9386h;

        public C4862e(C4868k kVar, String str) {
            this.f9385g = kVar;
            this.f9386h = str;
        }

        public void run() {
            Activity k = C4857i2.m8943k();
            if (k != null) {
                new AlertDialog.Builder(k).setTitle(this.f9385g.toString()).setMessage(this.f9386h).show();
            }
        }
    }

    /* renamed from: b.o.i2$f */
    public enum C4863f {
        NOTIFICATION_CLICK,
        APP_OPEN,
        APP_CLOSE
    }

    /* renamed from: b.o.i2$g */
    public static class C4864g {

        /* renamed from: a */
        public Context f9391a;

        /* renamed from: b */
        public C4869l f9392b;

        /* renamed from: c */
        public C4870m f9393c;

        /* renamed from: d */
        public boolean f9394d;

        /* renamed from: e */
        public C4871n f9395e = C4871n.InAppAlert;

        public C4864g(Context context, C4859b bVar) {
            this.f9391a = context;
        }

        public C4864g(C4859b bVar) {
        }
    }

    /* renamed from: b.o.i2$h */
    public interface C4865h {
        /* renamed from: a */
        void mo16614a(C4877t tVar);

        /* renamed from: b */
        void mo16615b(JSONObject jSONObject);
    }

    /* renamed from: b.o.i2$i */
    public interface C4866i {
        /* renamed from: a */
        void mo16616a(JSONObject jSONObject);
    }

    /* renamed from: b.o.i2$j */
    public static class C4867j {

        /* renamed from: a */
        public JSONArray f9396a;

        /* renamed from: b */
        public boolean f9397b;

        /* renamed from: c */
        public C4920n3 f9398c;

        public C4867j(JSONArray jSONArray) {
            this.f9396a = jSONArray;
        }
    }

    /* renamed from: b.o.i2$k */
    public enum C4868k {
        NONE,
        FATAL,
        ERROR,
        WARN,
        INFO,
        DEBUG,
        VERBOSE
    }

    /* renamed from: b.o.i2$l */
    public interface C4869l {
        /* renamed from: a */
        void mo10614a(C4903m1 m1Var);
    }

    /* renamed from: b.o.i2$m */
    public interface C4870m {
        /* renamed from: a */
        void mo10615a(C4888k1 k1Var);
    }

    /* renamed from: b.o.i2$n */
    public enum C4871n {
        None,
        InAppAlert,
        Notification
    }

    /* renamed from: b.o.i2$o */
    public interface C4872o {
        /* renamed from: a */
        void mo16617a(String str, boolean z);
    }

    /* renamed from: b.o.i2$p */
    public interface C4873p {
    }

    /* renamed from: b.o.i2$q */
    public interface C4874q {
        /* renamed from: a */
        void mo16618a(@Nullable C4967s3 s3Var);
    }

    /* renamed from: b.o.i2$r */
    public static class C4875r implements Runnable {

        /* renamed from: g */
        public Runnable f9411g;

        /* renamed from: h */
        public long f9412h;

        public C4875r(Runnable runnable) {
            this.f9411g = runnable;
        }

        public void run() {
            this.f9411g.run();
            if (C4857i2.f9367l.get() == this.f9412h) {
                C4857i2.m8933a(C4868k.INFO, "Last Pending Task has ran, shutting down", (Throwable) null);
                C4857i2.f9365j.shutdown();
            }
        }
    }

    /* renamed from: b.o.i2$s */
    public enum C4876s {
        PERMISSION_GRANTED,
        PERMISSION_DENIED,
        LOCATION_PERMISSIONS_MISSING_MANIFEST,
        ERROR
    }

    /* renamed from: b.o.i2$t */
    public static class C4877t {
        public C4877t(int i, String str) {
        }
    }

    static {
        C4856i1 i1Var = new C4856i1();
        f9373r = i1Var;
        C5052z1 z1Var = new C5052z1();
        f9375t = z1Var;
        C5015e eVar = new C5015e(z1Var, i1Var);
        f9376u = eVar;
        f9377v = new C5041y1(f9371p, eVar, f9373r);
    }

    /* renamed from: A */
    public static void m8924A(String str) {
        f9360e = str;
        if (f9358c != null) {
            C4815d3.m8833h(C4815d3.f9230a, "OS_EMAIL_ID", "".equals(f9360e) ? null : f9360e);
        }
    }

    /* renamed from: B */
    public static void m8925B(JSONArray jSONArray, boolean z, C4920n3 n3Var) {
        if (!m8930G("sendPurchases()")) {
            if (m8950r() == null) {
                C4867j jVar = new C4867j(jSONArray);
                f9354X = jVar;
                jVar.f9397b = z;
                jVar.f9398c = n3Var;
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("app_id", m8949q());
                if (z) {
                    jSONObject.put("existing", true);
                }
                jSONObject.put("purchases", jSONArray);
                C4805c3.m8817p("players/" + m8950r() + "/on_purchase", jSONObject, n3Var);
                if (m8946n() != null) {
                    C4805c3.m8817p("players/" + m8946n() + "/on_purchase", jSONObject, (C4920n3) null);
                }
            } catch (Throwable th) {
                m8933a(C4868k.ERROR, "Failed to generate JSON for sendPurchases.", th);
            }
        }
    }

    /* renamed from: C */
    public static void m8926C(String str, String str2) {
        if (!m8930G("sendTag()")) {
            try {
                m8927D(new JSONObject().put(str, str2), (C4865h) null);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: D */
    public static void m8927D(JSONObject jSONObject, C4865h hVar) {
        if (!m8930G("sendTags()")) {
            C4858a aVar = new C4858a(jSONObject, hVar);
            if (f9358c == null || m8931H()) {
                m8933a(C4868k.ERROR, "You must initialize OneSignal before modifying tags!Moving this operation to a pending task queue.", (Throwable) null);
                if (hVar != null) {
                    hVar.mo16614a(new C4877t(-1, "You must initialize OneSignal before modifying tags!Moving this operation to a pending task queue."));
                }
                m8936d(new C4875r(aVar));
                return;
            }
            aVar.run();
        }
    }

    /* renamed from: E */
    public static void m8928E(@NonNull Context context) {
        if (context == null) {
            m8933a(C4868k.WARN, "setAppContext(null) is not valid, ignoring!", (Throwable) null);
            return;
        }
        boolean z = f9358c == null;
        Context applicationContext = context.getApplicationContext();
        f9358c = applicationContext;
        Application application = (Application) applicationContext;
        if (C4793c.f9173g == null) {
            C4793c cVar = new C4793c();
            C4793c.f9173g = cVar;
            application.registerActivityLifecycleCallbacks(cVar);
        }
        if (C4793c.f9174h == null) {
            C4793c.f9174h = new C4771a();
        }
        if (C4793c.f9175i == null) {
            C4785b bVar = new C4785b();
            C4793c.f9175i = bVar;
            application.registerComponentCallbacks(bVar);
        }
        if (z) {
            if (f9379x == null) {
                f9379x = new C5028c(f9373r, f9374s, C4783a3.m8766e(f9358c), f9375t);
            }
            C5041y1 y1Var = f9377v;
            ((C4856i1) y1Var.f9746c).mo16609a("OneSignal SessionManager initSessionFromCache");
            for (C5011a k : y1Var.f9744a.f9690a.values()) {
                k.mo16761k();
            }
            f9378w = new C4953r1(f9377v, f9379x);
            C4815d3.m8836k();
            Class<C5023x2> cls = C5023x2.class;
            C4783a3 e = C4783a3.m8766e(context);
            synchronized (cls) {
                new Thread(new C5002v2(e), "OS_DELETE_CACHED_NOTIFICATIONS_THREAD").start();
            }
            synchronized (cls) {
                new Thread(new C5008w2(e), "OS_DELETE_CACHED_REDISPLAYED_IAMS_THREAD").start();
            }
        }
    }

    /* renamed from: F */
    public static void m8929F(long j) {
        C4815d3.m8835j(C4815d3.f9230a, "OS_LAST_SESSION_TIME", j);
    }

    /* renamed from: G */
    public static boolean m8930G(String str) {
        if (!(f9344N && !C4815d3.m8827b(C4815d3.f9230a, "ONESIGNAL_USER_PROVIDED_CONSENT", false))) {
            return false;
        }
        if (str != null) {
            C4868k kVar = C4868k.WARN;
            m8933a(kVar, "Method " + str + " was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.userProvidedPrivacyConsent()", (Throwable) null);
        }
        return true;
    }

    /* renamed from: H */
    public static boolean m8931H() {
        boolean z = f9362g;
        if (z && f9365j == null) {
            return false;
        }
        if (!z && f9365j == null) {
            return true;
        }
        ExecutorService executorService = f9365j;
        return executorService != null && !executorService.isShutdown();
    }

    /* renamed from: I */
    public static boolean m8932I(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return false;
        }
        launchIntentForPackage.setFlags(268566528);
        context.startActivity(launchIntentForPackage);
        return true;
    }

    /* renamed from: a */
    public static void m8933a(@NonNull C4868k kVar, @NonNull String str, @Nullable Throwable th) {
        C4868k kVar2 = C4868k.WARN;
        if (kVar.compareTo(kVar2) < 1) {
            if (kVar == C4868k.VERBOSE) {
                Log.v("OneSignal", str, th);
            } else if (kVar == C4868k.DEBUG) {
                Log.d("OneSignal", str, th);
            } else if (kVar == C4868k.INFO) {
                Log.i("OneSignal", str, th);
            } else if (kVar == kVar2) {
                Log.w("OneSignal", str, th);
            } else if (kVar == C4868k.ERROR || kVar == C4868k.FATAL) {
                Log.e("OneSignal", str, th);
            }
        }
        if (kVar.compareTo(C4868k.NONE) < 1 && m8943k() != null) {
            try {
                String str2 = str + "\n";
                if (th != null) {
                    StringWriter stringWriter = new StringWriter();
                    th.printStackTrace(new PrintWriter(stringWriter));
                    str2 = (str2 + th.getMessage()) + stringWriter.toString();
                }
                C4835f2.m8871u(new C4862e(kVar, str2));
            } catch (Throwable th2) {
                Log.e("OneSignal", "Error showing logging message.", th2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cd, code lost:
        if ("".equals(r0) != false) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0191  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m8934b() {
        /*
            android.content.Context r0 = f9358c
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r1 = f9358c
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = m8949q()
            java.lang.String r4 = "app_id"
            r2.put(r4, r3)
            b.o.e r3 = m8942j()
            r4 = 0
            if (r3 == 0) goto L_0x0050
            b.o.e r3 = m8942j()
            android.content.Context r5 = f9358c
            b.o.d r3 = (p005b.p273o.C4809d) r3
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r3 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r5)     // Catch:{ all -> 0x0040 }
            boolean r5 = r3.isLimitAdTrackingEnabled()     // Catch:{ all -> 0x0040 }
            if (r5 == 0) goto L_0x0039
            java.lang.String r3 = "OptedOut"
            goto L_0x003d
        L_0x0039:
            java.lang.String r3 = r3.getId()     // Catch:{ all -> 0x0040 }
        L_0x003d:
            p005b.p273o.C4809d.f9203a = r3     // Catch:{ all -> 0x0040 }
            goto L_0x0049
        L_0x0040:
            r3 = move-exception
            b.o.i2$k r5 = p005b.p273o.C4857i2.C4868k.INFO
            java.lang.String r6 = "Error getting Google Ad id: "
            m8933a(r5, r6, r3)
            r3 = r4
        L_0x0049:
            if (r3 == 0) goto L_0x0050
            java.lang.String r5 = "ad_id"
            r2.put(r5, r3)
        L_0x0050:
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            java.lang.String r5 = "device_os"
            r2.put(r5, r3)
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            java.util.TimeZone r3 = r3.getTimeZone()
            int r5 = r3.getRawOffset()
            java.util.Date r6 = new java.util.Date
            r6.<init>()
            boolean r6 = r3.inDaylightTime(r6)
            if (r6 == 0) goto L_0x0073
            int r3 = r3.getDSTSavings()
            int r5 = r5 + r3
        L_0x0073:
            int r5 = r5 / 1000
            java.lang.String r3 = "timezone"
            r2.put(r3, r5)
            java.lang.String r3 = p005b.p273o.C4835f2.m8854b()
            java.lang.String r5 = "language"
            r2.put(r5, r3)
            java.lang.String r3 = "sdk"
            java.lang.String r5 = "031507"
            r2.put(r3, r5)
            java.lang.String r3 = f9381z
            java.lang.String r5 = "sdk_type"
            r2.put(r5, r3)
            java.lang.String r3 = "android_package"
            r2.put(r3, r0)
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r5 = "device_model"
            r2.put(r5, r3)
            r3 = 0
            java.lang.String r5 = "game_version"
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r3)     // Catch:{ NameNotFoundException -> 0x00a9 }
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x00a9 }
            r2.put(r5, r0)     // Catch:{ NameNotFoundException -> 0x00a9 }
        L_0x00a9:
            b.o.f2 r0 = f9331A
            java.lang.Integer r0 = r0.mo16573e()
            java.lang.String r1 = "net_type"
            r2.put(r1, r0)
            b.o.f2 r0 = f9331A
            java.util.Objects.requireNonNull(r0)
            android.content.Context r0 = f9358c     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x00d0 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r0.getNetworkOperatorName()     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x00d5
            goto L_0x00d4
        L_0x00d0:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00d4:
            r0 = r4
        L_0x00d5:
            java.lang.String r1 = "carrier"
            r2.put(r1, r0)
            java.lang.String r5 = "/sbin/"
            java.lang.String r6 = "/system/bin/"
            java.lang.String r7 = "/system/xbin/"
            java.lang.String r8 = "/data/local/xbin/"
            java.lang.String r9 = "/data/local/bin/"
            java.lang.String r10 = "/system/sd/xbin/"
            java.lang.String r11 = "/system/bin/failsafe/"
            java.lang.String r12 = "/data/local/"
            java.lang.String[] r0 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12}
            r1 = r3
        L_0x00ef:
            r5 = 8
            r6 = 1
            if (r1 >= r5) goto L_0x0117
            r5 = r0[r1]     // Catch:{ all -> 0x0117 }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0117 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0117 }
            r8.<init>()     // Catch:{ all -> 0x0117 }
            r8.append(r5)     // Catch:{ all -> 0x0117 }
            java.lang.String r5 = "su"
            r8.append(r5)     // Catch:{ all -> 0x0117 }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x0117 }
            r7.<init>(r5)     // Catch:{ all -> 0x0117 }
            boolean r5 = r7.exists()     // Catch:{ all -> 0x0117 }
            if (r5 == 0) goto L_0x0114
            r0 = r6
            goto L_0x0118
        L_0x0114:
            int r1 = r1 + 1
            goto L_0x00ef
        L_0x0117:
            r0 = r3
        L_0x0118:
            java.lang.String r1 = "rooted"
            r2.put(r1, r0)
            b.o.m4 r0 = p005b.p273o.C4947q3.m9082b()
            b.o.h4 r0 = r0.mo16662o()
            r0.mo16595d(r2, r4)
            b.o.j4 r0 = p005b.p273o.C4947q3.m9081a()
            b.o.h4 r0 = r0.mo16662o()
            r0.mo16595d(r2, r4)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = f9332B
            java.lang.String r2 = "identifier"
            r0.put(r2, r1)
            int r1 = f9361f
            java.lang.String r2 = "subscribableStatus"
            r0.put(r2, r1)
            b.o.i2$g r1 = f9338H
            boolean r1 = r1.f9394d
            if (r1 == 0) goto L_0x0151
            boolean r1 = p005b.p273o.C4835f2.m8853a()
            goto L_0x0152
        L_0x0151:
            r1 = r6
        L_0x0152:
            java.lang.String r2 = "androidPermission"
            r0.put(r2, r1)
            b.o.f2 r1 = f9331A
            int r1 = r1.mo16572c()
            java.lang.String r2 = "device_type"
            r0.put(r2, r1)
            p005b.p273o.C4947q3.m9086f(r0)
            boolean r0 = f9337G
            if (r0 == 0) goto L_0x0170
            b.o.c0$d r0 = f9336F
            if (r0 == 0) goto L_0x0170
            p005b.p273o.C4947q3.m9085e(r0)
        L_0x0170:
            b.o.m4 r0 = p005b.p273o.C4947q3.m9082b()
            boolean r1 = r0.f9495c
            if (r1 == r6) goto L_0x017a
            r1 = r6
            goto L_0x017b
        L_0x017a:
            r1 = r3
        L_0x017b:
            r0.f9495c = r6
            if (r1 == 0) goto L_0x0182
            r0.mo16631v()
        L_0x0182:
            b.o.j4 r0 = p005b.p273o.C4947q3.m9081a()
            boolean r1 = r0.f9495c
            if (r1 == r6) goto L_0x018c
            r1 = r6
            goto L_0x018d
        L_0x018c:
            r1 = r3
        L_0x018d:
            r0.f9495c = r6
            if (r1 == 0) goto L_0x0194
            r0.mo16631v()
        L_0x0194:
            f9343M = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4857i2.m8934b():void");
    }

    /* renamed from: c */
    public static void m8935c() {
        C4868k kVar = C4868k.DEBUG;
        StringBuilder u = C0843a.m460u("registerUser:registerForPushFired:");
        u.append(f9333C);
        u.append(", locationFired: ");
        u.append(f9334D);
        u.append(", remoteParams: ");
        u.append(f9346P);
        u.append(", appId: ");
        u.append(f9356a);
        m8933a(kVar, u.toString(), (Throwable) null);
        if (f9333C && f9334D && f9346P != null && f9356a != null) {
            new Thread(new C4946q2(), "OS_REG_USER").start();
        }
    }

    /* renamed from: d */
    public static void m8936d(C4875r rVar) {
        C4868k kVar = C4868k.INFO;
        rVar.f9412h = f9367l.incrementAndGet();
        ExecutorService executorService = f9365j;
        if (executorService == null) {
            StringBuilder u = C0843a.m460u("Adding a task to the pending queue with ID: ");
            u.append(rVar.f9412h);
            m8933a(kVar, u.toString(), (Throwable) null);
            f9366k.add(rVar);
        } else if (!executorService.isShutdown()) {
            StringBuilder u2 = C0843a.m460u("Executor is still running, add to the executor with ID: ");
            u2.append(rVar.f9412h);
            m8933a(kVar, u2.toString(), (Throwable) null);
            try {
                f9365j.submit(rVar);
            } catch (RejectedExecutionException e) {
                StringBuilder u3 = C0843a.m460u("Executor is shutdown, running task manually with ID: ");
                u3.append(rVar.f9412h);
                m8933a(kVar, u3.toString(), (Throwable) null);
                rVar.run();
                e.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    public static boolean m8937e(C4868k kVar) {
        return kVar.compareTo(C4868k.NONE) < 1 || kVar.compareTo(C4868k.WARN) < 1;
    }

    /* renamed from: f */
    public static void m8938f(int i) {
        C4860c cVar = new C4860c(i);
        if (f9358c == null || m8931H()) {
            C4868k kVar = C4868k.ERROR;
            m8933a(kVar, "OneSignal.init has not been called. Could not clear notification id: " + i + " at this time - movingthis operation to a waiting task queue. The notification will still be canceledfrom NotificationManager at this time.", (Throwable) null);
            f9366k.add(cVar);
            return;
        }
        cVar.run();
    }

    /* renamed from: g */
    public static void m8939g() {
        C4868k kVar = C4868k.DEBUG;
        boolean z = true;
        if (System.currentTimeMillis() - C4815d3.m8829d(C4815d3.f9230a, "OS_LAST_SESSION_TIME", -31000) >= Constants.EVENT_UPLOAD_PERIOD_MILLIS) {
            m8933a(kVar, "Starting new session", (Throwable) null);
            C4947q3.m9082b().mo16668x();
            C4947q3.m9081a().mo16668x();
            if (f9363h) {
                C4953r1 r1Var = f9378w;
                Objects.requireNonNull(r1Var);
                m8933a(kVar, "OneSignal cleanOutcomes for session", (Throwable) null);
                r1Var.f9558a = C4835f2.m8866p();
                r1Var.mo16685a();
                C5041y1 y1Var = f9377v;
                C4863f fVar = f9364i;
                List<C5011a> b = y1Var.f9744a.mo16767b(fVar);
                ArrayList arrayList = new ArrayList();
                ((C4856i1) y1Var.f9746c).mo16609a("OneSignal SessionManager restartSessionIfNeeded with entryAction: " + fVar + "\n channelTrackers: " + b.toString());
                Iterator it = ((ArrayList) b).iterator();
                while (it.hasNext()) {
                    C5011a aVar = (C5011a) it.next();
                    JSONArray j = aVar.mo16760j();
                    ((C4856i1) y1Var.f9746c).mo16609a("OneSignal SessionManager restartSessionIfNeeded lastIds: " + j);
                    C5016a e = aVar.mo16753e();
                    if (j.length() > 0 ? y1Var.mo16796e(aVar, C5019c.INDIRECT, (String) null, j) : y1Var.mo16796e(aVar, C5019c.UNATTRIBUTED, (String) null, (JSONArray) null)) {
                        arrayList.add(e);
                    }
                }
                y1Var.mo16795d(arrayList);
                Objects.requireNonNull(m8948p());
                Date date = C4935p0.f9523c;
                C4935p0.f9523c = new Date();
            }
        } else if (f9363h) {
            m8933a(kVar, "Continue on same session", (Throwable) null);
            f9377v.mo16792a(f9364i, (String) null);
        }
        m8948p().mo16730m();
        if (!f9363h) {
            if (m8950r() != null) {
                return;
            }
        }
        m8929F(System.currentTimeMillis());
        if (!f9343M) {
            f9343M = true;
            if (C4947q3.m9082b().mo16662o().mo16596e().f9670a.optBoolean("session") || C4947q3.m9081a().mo16662o().mo16596e().f9670a.optBoolean("session")) {
                f9334D = false;
            }
            C4929o2 o2Var = new C4929o2();
            Objects.requireNonNull(f9338H);
            if (!f9335E) {
                Objects.requireNonNull(f9338H);
                z = false;
            }
            f9335E = z;
            C4794c0.m8788d(f9358c, false, false, o2Var);
            f9333C = false;
            if (f9346P != null) {
                m8957y();
            } else {
                C4823e3.m8846a(new C4938p2());
            }
        }
    }

    /* renamed from: h */
    public static void m8940h() {
        for (JSONArray z : f9339I) {
            m8958z(z, true, false);
        }
        f9339I.clear();
    }

    @NonNull
    /* renamed from: i */
    public static C4903m1 m8941i(JSONArray jSONArray, boolean z, boolean z2) {
        int length = jSONArray.length();
        C4903m1 m1Var = new C4903m1();
        C4888k1 k1Var = new C4888k1();
        jSONArray.optJSONObject(0).optInt("androidNotificationId");
        boolean z3 = true;
        String str = null;
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                k1Var.f9434a = C1960d.m2773a(jSONObject);
                if (str == null && jSONObject.has("actionId")) {
                    str = jSONObject.optString("actionId", (String) null);
                }
                if (z3) {
                    z3 = false;
                } else {
                    if (k1Var.f9435b == null) {
                        k1Var.f9435b = new ArrayList();
                    }
                    k1Var.f9435b.add(k1Var.f9434a);
                }
            } catch (Throwable th) {
                m8933a(C4868k.ERROR, C0843a.m447h("Error parsing JSON item ", i, "/", length, " for callback."), th);
            }
        }
        m1Var.f9467a = k1Var;
        C4894l1 l1Var = new C4894l1();
        m1Var.f9468b = l1Var;
        Objects.requireNonNull(l1Var);
        m1Var.f9468b.f9442a = str != null ? C4894l1.C4895a.ActionTaken : C4894l1.C4895a.Opened;
        Objects.requireNonNull(m1Var.f9467a);
        return m1Var;
    }

    @Nullable
    /* renamed from: j */
    public static synchronized C4819e m8942j() {
        C4819e eVar;
        synchronized (C4857i2.class) {
            if (f9380y == null && C4835f2.m8863m()) {
                f9380y = new C4809d();
            }
            eVar = f9380y;
        }
        return eVar;
    }

    @Nullable
    /* renamed from: k */
    public static Activity m8943k() {
        C4771a aVar = C4793c.f9174h;
        if (aVar != null) {
            return aVar.f9119a;
        }
        return null;
    }

    /* renamed from: l */
    public static C4981t1 m8944l(Context context) {
        if (context == null) {
            return null;
        }
        if (f9347Q == null) {
            C4981t1 t1Var = new C4981t1(false);
            f9347Q = t1Var;
            C4927o1<Object, C4981t1> o1Var = t1Var.f9634g;
            o1Var.f9513b.add(new OSPermissionChangedInternalObserver());
        }
        return f9347Q;
    }

    /* renamed from: m */
    public static OSSubscriptionState m8945m(Context context) {
        if (context == null) {
            return null;
        }
        if (f9350T == null) {
            f9350T = new OSSubscriptionState(false, m8944l(context).f9635h);
            m8944l(context).f9634g.f9513b.add(new WeakReference(f9350T));
            C4927o1<Object, OSSubscriptionState> o1Var = f9350T.f11498g;
            o1Var.f9513b.add(new OSSubscriptionChangedInternalObserver());
        }
        return f9350T;
    }

    /* renamed from: n */
    public static String m8946n() {
        if (f9360e == null && f9358c != null) {
            f9360e = C4815d3.m8831f(C4815d3.f9230a, "OS_EMAIL_ID", (String) null);
        }
        if (TextUtils.isEmpty(f9360e)) {
            return null;
        }
        return f9360e;
    }

    /* renamed from: o */
    public static boolean m8947o() {
        return C4815d3.m8827b(C4815d3.f9230a, "GT_FIREBASE_TRACKING_ENABLED", false);
    }

    /* renamed from: p */
    public static C4990u0 m8948p() {
        C4787b1 b1Var = f9372q;
        C4783a3 e = C4783a3.m8766e(f9358c);
        if (b1Var.f9164a == null) {
            synchronized (C4787b1.f9163b) {
                if (b1Var.f9164a == null) {
                    b1Var.f9164a = new C4990u0(e);
                }
            }
        }
        return b1Var.f9164a;
    }

    /* renamed from: q */
    public static String m8949q() {
        if (f9358c == null) {
            return null;
        }
        return C4815d3.m8831f(C4815d3.f9230a, "GT_APP_ID", (String) null);
    }

    /* renamed from: r */
    public static String m8950r() {
        if (f9359d == null && f9358c != null) {
            f9359d = C4815d3.m8831f(C4815d3.f9230a, "GT_PLAYER_ID", (String) null);
        }
        return f9359d;
    }

    /* renamed from: s */
    public static void m8951s(Context context, JSONArray jSONArray, boolean z, @Nullable String str) {
        boolean z2;
        String optString;
        String str2;
        String str3;
        Context context2 = context;
        JSONArray jSONArray2 = jSONArray;
        boolean z3 = z;
        String str4 = str;
        C4868k kVar = C4868k.ERROR;
        String str5 = null;
        if (!m8930G((String) null)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String optString2 = new JSONObject(jSONArray2.getJSONObject(i).optString("custom", (String) null)).optString(C4748i.f9096b, (String) null);
                    if (!f9340J.contains(optString2)) {
                        f9340J.add(optString2);
                        JSONObject jSONObject = new JSONObject();
                        if (context2 == null) {
                            str2 = null;
                        } else {
                            str2 = C4815d3.m8831f(C4815d3.f9230a, "GT_APP_ID", (String) null);
                        }
                        jSONObject.put("app_id", str2);
                        if (context2 == null) {
                            str3 = null;
                        } else {
                            str3 = C4815d3.m8831f(C4815d3.f9230a, "GT_PLAYER_ID", (String) null);
                        }
                        jSONObject.put("player_id", str3);
                        jSONObject.put("opened", true);
                        jSONObject.put("device_type", f9331A.mo16572c());
                        new Thread(new C4846g3("notifications/" + optString2, jSONObject, new C4896l2()), "OS_REST_ASYNC_PUT").start();
                    }
                } catch (Throwable th) {
                    m8933a(kVar, "Failed to generate JSON to send notification opened.", th);
                }
            }
            if (f9370o != null && m8947o()) {
                C4818d4 d4Var = f9370o;
                C4903m1 i2 = m8941i(jSONArray2, true, z3);
                Objects.requireNonNull(d4Var);
                if (C4818d4.f9239e == null) {
                    C4818d4.f9239e = new AtomicLong();
                }
                C4818d4.f9239e.set(System.currentTimeMillis());
                try {
                    Object b = d4Var.mo16558b(d4Var.f9242b);
                    Method c = C4818d4.m8838c(C4818d4.f9237c);
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "OneSignal");
                    bundle.putString(AnimationStrength.MEDIUM, "notification");
                    bundle.putString("notification_id", i2.f9467a.f9434a.f9486a);
                    bundle.putString("campaign", d4Var.mo16557a(i2.f9467a.f9434a));
                    c.invoke(b, new Object[]{"os_notification_opened", bundle});
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            boolean equals = "DISABLE".equals(C4835f2.m8855d(context2, "com.onesignal.NotificationOpened.DEFAULT"));
            if (equals || m8930G((String) null)) {
                z2 = false;
            } else {
                int length = jSONArray.length();
                int i3 = 0;
                z2 = false;
                while (i3 < length) {
                    try {
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i3);
                        if (jSONObject2.has("custom")) {
                            JSONObject jSONObject3 = new JSONObject(jSONObject2.optString("custom"));
                            if (jSONObject3.has("u") && (optString = jSONObject3.optString("u", str5)) != null) {
                                C4835f2.m8868r(optString);
                                z2 = true;
                            }
                        }
                    } catch (Throwable th3) {
                        m8933a(kVar, C0843a.m447h("Error parsing JSON item ", i3, "/", length, " for launching a web URL."), th3);
                    }
                    i3++;
                    str5 = null;
                }
            }
            if (!z3 && !z2 && !equals && !f9363h && m8932I(context)) {
                C4863f fVar = C4863f.NOTIFICATION_CLICK;
                f9364i = fVar;
                C5041y1 y1Var = f9377v;
                ((C4856i1) y1Var.f9746c).mo16609a(C0843a.m451l("OneSignal SessionManager onDirectInfluenceFromNotificationOpen notificationId: ", str4));
                if (str4 != null && !str.isEmpty()) {
                    y1Var.mo16792a(fVar, str4);
                }
            }
            m8958z(jSONArray2, true, z3);
        }
    }

    /* renamed from: t */
    public static void m8952t(JSONArray jSONArray, boolean z, boolean z2) {
        C4870m mVar;
        C4903m1 i = m8941i(jSONArray, z, z2);
        if (f9370o != null && m8947o()) {
            C4818d4 d4Var = f9370o;
            Objects.requireNonNull(d4Var);
            try {
                Object b = d4Var.mo16558b(d4Var.f9242b);
                Method c = C4818d4.m8838c(C4818d4.f9237c);
                Bundle bundle = new Bundle();
                bundle.putString("source", "OneSignal");
                bundle.putString(AnimationStrength.MEDIUM, "notification");
                bundle.putString("notification_id", i.f9467a.f9434a.f9486a);
                bundle.putString("campaign", d4Var.mo16557a(i.f9467a.f9434a));
                c.invoke(b, new Object[]{"os_notification_received", bundle});
                if (C4818d4.f9238d == null) {
                    C4818d4.f9238d = new AtomicLong();
                }
                C4818d4.f9238d.set(System.currentTimeMillis());
                C4818d4.f9240f = i.f9467a.f9434a;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        C4864g gVar = f9338H;
        if (gVar != null && (mVar = gVar.f9393c) != null) {
            mVar.mo10615a(i.f9467a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00df, code lost:
        if (1 == 0) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0106 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0107  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m8953u(android.content.Context r9, java.lang.String r10, java.lang.String r11, p005b.p273o.C4857i2.C4869l r12, p005b.p273o.C4857i2.C4870m r13) {
        /*
            b.o.i2$k r0 = p005b.p273o.C4857i2.C4868k.ERROR
            b.o.i2$g r1 = f9338H
            java.util.Objects.requireNonNull(r1)
            r1.f9392b = r12
            r1.f9393c = r13
            f9338H = r1
            m8928E(r9)
            r1 = 0
            android.content.pm.PackageManager r2 = r9.getPackageManager()     // Catch:{ all -> 0x003c }
            java.lang.String r3 = r9.getPackageName()     // Catch:{ all -> 0x003c }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r4)     // Catch:{ all -> 0x003c }
            android.os.Bundle r2 = r2.metaData     // Catch:{ all -> 0x003c }
            java.lang.String r3 = "com.onesignal.PrivacyConsent"
            java.lang.String r2 = r2.getString(r3)     // Catch:{ all -> 0x003c }
            java.lang.String r3 = "ENABLE"
            boolean r2 = r3.equalsIgnoreCase(r2)     // Catch:{ all -> 0x003c }
            boolean r3 = f9344N     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x0039
            if (r2 != 0) goto L_0x0039
            java.lang.String r2 = "Cannot change requiresUserPrivacyConsent() from TRUE to FALSE"
            m8933a(r0, r2, r1)     // Catch:{ all -> 0x003c }
            goto L_0x0040
        L_0x0039:
            f9344N = r2     // Catch:{ all -> 0x003c }
            goto L_0x0040
        L_0x003c:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0040:
            boolean r2 = f9344N
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0052
            java.lang.String r2 = p005b.p273o.C4815d3.f9230a
            java.lang.String r5 = "ONESIGNAL_USER_PROVIDED_CONSENT"
            boolean r2 = p005b.p273o.C4815d3.m8827b(r2, r5, r4)
            if (r2 != 0) goto L_0x0052
            r2 = r3
            goto L_0x0053
        L_0x0052:
            r2 = r4
        L_0x0053:
            if (r2 == 0) goto L_0x006a
            b.o.i2$k r0 = p005b.p273o.C4857i2.C4868k.VERBOSE
            java.lang.String r2 = "OneSignal SDK initialization delayed, user privacy consent is set to required for this application."
            m8933a(r0, r2, r1)
            b.o.k r0 = new b.o.k
            r3 = r0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            f9345O = r0
            return
        L_0x006a:
            b.o.i2$g r2 = f9338H
            java.util.Objects.requireNonNull(r2)
            r2.f9392b = r12
            r2.f9393c = r13
            f9338H = r2
            b.o.e3$e r12 = f9346P
            if (r12 == 0) goto L_0x007f
            java.lang.String r12 = r12.f9264a
            if (r12 == 0) goto L_0x007f
            r12 = r3
            goto L_0x0080
        L_0x007f:
            r12 = r4
        L_0x0080:
            if (r12 != 0) goto L_0x0084
            f9357b = r10
        L_0x0084:
            b.o.f2 r10 = f9331A
            b.o.i2$k r12 = p005b.p273o.C4857i2.C4868k.FATAL
            int r10 = r10.mo16572c()
            r13 = -999(0xfffffffffffffc19, float:NaN)
            java.util.UUID.fromString(r11)     // Catch:{ all -> 0x00f6 }
            java.lang.String r2 = "b2f7f966-d8cc-11e4-bed1-df8f05be55ba"
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L_0x00a1
            java.lang.String r2 = "5eb5a37e-b458-11e3-ac11-000c2940e62c"
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x00a6
        L_0x00a1:
            java.lang.String r2 = "OneSignal Example AppID detected, please update to your app's id found on OneSignal.com"
            m8933a(r0, r2, r1)
        L_0x00a6:
            if (r10 != r3) goto L_0x00b5
            boolean r10 = p005b.p273o.C4835f2.m8858h()
            if (r10 == 0) goto L_0x00b5
            b.o.i2$k r10 = p005b.p273o.C4857i2.C4868k.WARN
            java.lang.String r0 = "Both GCM & FCM Libraries detected! Please remove the deprecated GCM library."
            m8933a(r10, r0, r1)
        L_0x00b5:
            java.lang.Class<androidx.legacy.content.WakefulBroadcastReceiver> r10 = androidx.legacy.content.WakefulBroadcastReceiver.class
            r10 = r3
            goto L_0x00ba
        L_0x00b9:
            r10 = r4
        L_0x00ba:
            r0 = -5
            if (r10 == 0) goto L_0x00e4
            int r10 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r10 < r2) goto L_0x00e2
            java.lang.String r10 = r9.getPackageName()
            android.content.pm.PackageManager r5 = r9.getPackageManager()
            android.content.pm.ApplicationInfo r10 = r5.getApplicationInfo(r10, r4)     // Catch:{ NameNotFoundException -> 0x00d2 }
            int r10 = r10.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x00d2 }
            goto L_0x00d8
        L_0x00d2:
            r10 = move-exception
            r10.printStackTrace()
            r10 = 15
        L_0x00d8:
            if (r10 < r2) goto L_0x00e2
            java.lang.Class<androidx.core.app.JobIntentService> r10 = androidx.core.app.JobIntentService.class
            r10 = r3
            goto L_0x00df
        L_0x00de:
            r10 = r4
        L_0x00df:
            if (r10 != 0) goto L_0x00e2
            goto L_0x00e4
        L_0x00e2:
            r10 = r1
            goto L_0x00ed
        L_0x00e4:
            java.lang.String r10 = "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer."
            m8933a(r12, r10, r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
        L_0x00ed:
            if (r10 == 0) goto L_0x00f4
            int r10 = r10.intValue()
            goto L_0x00fd
        L_0x00f4:
            r10 = r3
            goto L_0x00fd
        L_0x00f6:
            r10 = move-exception
            java.lang.String r0 = "OneSignal AppId format is invalid.\nExample: 'b2f7f966-d8cc-11e4-bed1-df8f05be55ba'\n"
            m8933a(r12, r0, r10)
            r10 = r13
        L_0x00fd:
            f9361f = r10
            if (r10 != r13) goto L_0x0103
            r10 = r3
            goto L_0x0104
        L_0x0103:
            r10 = r4
        L_0x0104:
            if (r10 == 0) goto L_0x0107
            return
        L_0x0107:
            java.lang.String r10 = f9356a
            if (r10 == 0) goto L_0x0113
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0113
            f9362g = r4
        L_0x0113:
            boolean r10 = f9362g
            if (r10 == 0) goto L_0x0121
            b.o.i2$g r9 = f9338H
            b.o.i2$l r9 = r9.f9392b
            if (r9 == 0) goto L_0x0120
            m8940h()
        L_0x0120:
            return
        L_0x0121:
            f9356a = r11
            b.o.i2$g r10 = f9338H
            java.util.Objects.requireNonNull(r10)
            android.content.Context r10 = f9358c
            if (r10 != 0) goto L_0x012d
            goto L_0x0134
        L_0x012d:
            java.lang.String r10 = p005b.p273o.C4815d3.f9230a
            java.lang.String r11 = "OS_FILTER_OTHER_GCM_RECEIVERS"
            p005b.p273o.C4815d3.m8834i(r10, r11, r4)
        L_0x0134:
            b.o.a r10 = p005b.p273o.C4793c.f9174h
            boolean r11 = r9 instanceof android.app.Activity
            f9363h = r11
            if (r11 == 0) goto L_0x0166
            if (r10 == 0) goto L_0x0143
            android.app.Activity r9 = (android.app.Activity) r9
            r10.mo16491e(r9)
        L_0x0143:
            android.content.Context r9 = f9358c
            java.lang.Thread r10 = new java.lang.Thread
            b.o.m0 r11 = new b.o.m0
            r11.<init>(r9)
            java.lang.String r9 = "OS_RESTORE_NOTIFS"
            r10.<init>(r11, r9)
            r10.start()
            b.o.n r9 = p005b.p273o.C4908n.m9005a()
            java.util.Objects.requireNonNull(r9)
            long r10 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r9.f9474a = r10
            goto L_0x016a
        L_0x0166:
            if (r10 == 0) goto L_0x016a
            r10.f9120b = r3
        L_0x016a:
            b.o.m4 r9 = p005b.p273o.C4947q3.m9082b()
            r9.mo16663p()
            b.o.j4 r9 = p005b.p273o.C4947q3.m9081a()
            r9.mo16663p()
            java.lang.String r9 = "com.amazon.device.iap.PurchasingListener"
            java.lang.Class.forName(r9)     // Catch:{ ClassNotFoundException -> 0x0186 }
            b.o.c4 r9 = new b.o.c4     // Catch:{ ClassNotFoundException -> 0x0186 }
            android.content.Context r10 = f9358c     // Catch:{ ClassNotFoundException -> 0x0186 }
            r9.<init>(r10)     // Catch:{ ClassNotFoundException -> 0x0186 }
            f9369n = r9     // Catch:{ ClassNotFoundException -> 0x0186 }
        L_0x0186:
            java.lang.String r9 = m8949q()
            java.lang.String r10 = "GT_APP_ID"
            if (r9 == 0) goto L_0x01d2
            java.lang.String r11 = f9356a
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x01e3
            b.o.i2$k r9 = p005b.p273o.C4857i2.C4868k.DEBUG
            java.lang.String r11 = "APP ID changed, clearing user id as it is no longer valid."
            m8933a(r9, r11, r1)
            java.lang.String r9 = f9356a
            android.content.Context r11 = f9358c
            if (r11 != 0) goto L_0x01a4
            goto L_0x01a9
        L_0x01a4:
            java.lang.String r11 = p005b.p273o.C4815d3.f9230a
            p005b.p273o.C4815d3.m8833h(r11, r10, r9)
        L_0x01a9:
            b.o.m4 r9 = p005b.p273o.C4947q3.m9082b()
            r9.mo16666u()
            b.o.j4 r9 = p005b.p273o.C4947q3.m9081a()
            r9.mo16666u()
            f9359d = r1
            android.content.Context r9 = f9358c
            if (r9 != 0) goto L_0x01be
            goto L_0x01c7
        L_0x01be:
            java.lang.String r9 = p005b.p273o.C4815d3.f9230a
            java.lang.String r10 = f9359d
            java.lang.String r11 = "GT_PLAYER_ID"
            p005b.p273o.C4815d3.m8833h(r9, r11, r10)
        L_0x01c7:
            m8924A(r1)
            r9 = -3660(0xfffffffffffff1b4, double:NaN)
            m8929F(r9)
            f9346P = r1
            goto L_0x01e3
        L_0x01d2:
            android.content.Context r9 = f9358c
            p005b.p273o.C4839g.m8877c(r4, r9)
            java.lang.String r9 = f9356a
            android.content.Context r11 = f9358c
            if (r11 != 0) goto L_0x01de
            goto L_0x01e3
        L_0x01de:
            java.lang.String r11 = p005b.p273o.C4815d3.f9230a
            p005b.p273o.C4815d3.m8833h(r11, r10, r9)
        L_0x01e3:
            android.content.Context r9 = f9358c
            b.o.t1 r9 = m8944l(r9)
            com.onesignal.OSPermissionChangedInternalObserver.m10590a(r9)
            m8939g()
            b.o.i2$g r9 = f9338H
            b.o.i2$l r9 = r9.f9392b
            if (r9 == 0) goto L_0x01f8
            m8940h()
        L_0x01f8:
            android.content.Context r9 = f9358c
            int r10 = p005b.p273o.C4830e4.f9273i
            r11 = -99
            if (r10 != r11) goto L_0x0208
            java.lang.String r10 = "com.android.vending.BILLING"
            int r9 = r9.checkCallingOrSelfPermission(r10)
            p005b.p273o.C4830e4.f9273i = r9
        L_0x0208:
            int r9 = p005b.p273o.C4830e4.f9273i     // Catch:{ all -> 0x021a }
            if (r9 != 0) goto L_0x0214
            java.lang.String r9 = "com.android.vending.billing.IInAppBillingService"
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x021a }
            p005b.p273o.C4830e4.f9274j = r9     // Catch:{ all -> 0x021a }
        L_0x0214:
            int r9 = p005b.p273o.C4830e4.f9273i
            if (r9 != 0) goto L_0x021c
            r9 = r3
            goto L_0x021d
        L_0x021a:
            p005b.p273o.C4830e4.f9273i = r4
        L_0x021c:
            r9 = r4
        L_0x021d:
            if (r9 == 0) goto L_0x0228
            b.o.e4 r9 = new b.o.e4
            android.content.Context r10 = f9358c
            r9.<init>(r10)
            f9368m = r9
        L_0x0228:
            java.lang.String r9 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ ClassNotFoundException -> 0x0231 }
            p005b.p273o.C4818d4.f9237c = r9     // Catch:{ ClassNotFoundException -> 0x0231 }
            r4 = r3
        L_0x0231:
            if (r4 == 0) goto L_0x023c
            b.o.d4 r9 = new b.o.d4
            android.content.Context r10 = f9358c
            r9.<init>(r10)
            f9370o = r9
        L_0x023c:
            android.content.Context r9 = f9358c
            p005b.p273o.C4784a4.m8780d(r9)
            f9362g = r3
            b.o.r1 r9 = f9378w
            java.util.Objects.requireNonNull(r9)
            java.lang.Thread r10 = new java.lang.Thread
            b.o.p1 r11 = new b.o.p1
            r11.<init>(r9)
            java.lang.String r9 = "OS_SEND_SAVED_OUTCOMES"
            r10.<init>(r11, r9)
            r10.start()
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r9 = f9366k
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0280
            b.o.n2 r9 = new b.o.n2
            r9.<init>()
            java.util.concurrent.ExecutorService r9 = java.util.concurrent.Executors.newSingleThreadExecutor(r9)
            f9365j = r9
        L_0x026a:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r9 = f9366k
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0280
            java.util.concurrent.ExecutorService r9 = f9365j
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r10 = f9366k
            java.lang.Object r10 = r10.poll()
            java.lang.Runnable r10 = (java.lang.Runnable) r10
            r9.submit(r10)
            goto L_0x026a
        L_0x0280:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4857i2.m8953u(android.content.Context, java.lang.String, java.lang.String, b.o.i2$l, b.o.i2$m):void");
    }

    /* renamed from: v */
    public static boolean m8954v() {
        return f9362g && f9363h;
    }

    /* renamed from: w */
    public static void m8955w(String str, int i, Throwable th, String str2) {
        String m = (str2 == null || !m8937e(C4868k.INFO)) ? "" : C0843a.m452m("\n", str2, "\n");
        C4868k kVar = C4868k.WARN;
        m8933a(kVar, "HTTP code: " + i + " " + str + m, th);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m8956x(android.content.Context r11, org.json.JSONObject r12) {
        /*
            java.lang.String r12 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2752T(r12)
            r0 = 0
            r1 = 1
            if (r12 == 0) goto L_0x004f
            java.lang.String r2 = ""
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L_0x0011
            goto L_0x004c
        L_0x0011:
            b.o.a3 r3 = p005b.p273o.C4783a3.m8766e(r11)
            java.lang.String r11 = "notification_id"
            java.lang.String[] r5 = new java.lang.String[]{r11}
            java.lang.String[] r7 = new java.lang.String[r1]
            r7[r0] = r12
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r4 = "notification"
            java.lang.String r6 = "notification_id = ?"
            android.database.Cursor r11 = r3.mo16511S(r4, r5, r6, r7, r8, r9, r10)
            boolean r2 = r11.moveToFirst()
            r11.close()
            if (r2 == 0) goto L_0x004c
            b.o.i2$k r11 = p005b.p273o.C4857i2.C4868k.DEBUG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Duplicate GCM message received, skip processing of "
            r2.append(r3)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            r2 = 0
            m8933a(r11, r12, r2)
            r11 = r1
            goto L_0x004d
        L_0x004c:
            r11 = r0
        L_0x004d:
            if (r11 == 0) goto L_0x0050
        L_0x004f:
            r0 = r1
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4857i2.m8956x(android.content.Context, org.json.JSONObject):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
        if (p005b.p273o.C4835f2.m8869s("com.huawei.hwid") == false) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003f  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m8957y() {
        /*
            b.o.w3 r0 = f9355Y
            if (r0 == 0) goto L_0x0006
            goto L_0x006f
        L_0x0006:
            r0 = 1
            r1 = 0
            java.lang.String r2 = "com.amazon.device.messaging.ADM"
            java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x000f }
            r2 = r0
            goto L_0x0010
        L_0x000f:
            r2 = r1
        L_0x0010:
            r3 = 2
            if (r2 == 0) goto L_0x0015
            r4 = r3
            goto L_0x0050
        L_0x0015:
            boolean r2 = p005b.p273o.C4835f2.m8864n()
            if (r2 == 0) goto L_0x001c
            goto L_0x004f
        L_0x001c:
            boolean r2 = p005b.p273o.C4835f2.m8860j()
            if (r2 == 0) goto L_0x0039
            boolean r2 = p005b.p273o.C4835f2.m8859i()
            if (r2 == 0) goto L_0x0030
            boolean r2 = p005b.p273o.C4835f2.m8862l()
            if (r2 == 0) goto L_0x0030
            r2 = r0
            goto L_0x0031
        L_0x0030:
            r2 = r1
        L_0x0031:
            if (r2 != 0) goto L_0x0034
            goto L_0x0039
        L_0x0034:
            boolean r2 = p005b.p273o.C4835f2.m8865o()
            goto L_0x003a
        L_0x0039:
            r2 = r1
        L_0x003a:
            r4 = 13
            if (r2 == 0) goto L_0x003f
            goto L_0x0050
        L_0x003f:
            boolean r2 = p005b.p273o.C4835f2.m8864n()
            if (r2 == 0) goto L_0x0046
            goto L_0x004f
        L_0x0046:
            java.lang.String r2 = "com.huawei.hwid"
            boolean r2 = p005b.p273o.C4835f2.m8869s(r2)
            if (r2 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r4 = r0
        L_0x0050:
            if (r4 != r3) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r1
        L_0x0054:
            if (r0 == 0) goto L_0x005c
            b.o.x3 r0 = new b.o.x3
            r0.<init>()
            goto L_0x006d
        L_0x005c:
            boolean r0 = p005b.p273o.C4835f2.m8863m()
            if (r0 == 0) goto L_0x0068
            b.o.a4 r0 = new b.o.a4
            r0.<init>()
            goto L_0x006d
        L_0x0068:
            b.o.b4 r0 = new b.o.b4
            r0.<init>()
        L_0x006d:
            f9355Y = r0
        L_0x006f:
            android.content.Context r1 = f9358c
            java.lang.String r2 = f9357b
            b.o.i2$d r3 = new b.o.i2$d
            r3.<init>()
            r0.mo16529a(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4857i2.m8957y():void");
    }

    /* renamed from: z */
    public static void m8958z(JSONArray jSONArray, boolean z, boolean z2) {
        C4864g gVar = f9338H;
        if (gVar == null || gVar.f9392b == null) {
            f9339I.add(jSONArray);
        } else {
            C4835f2.m8871u(new C4889k2(m8941i(jSONArray, z, z2)));
        }
    }
}
