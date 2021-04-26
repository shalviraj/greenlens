package p005b.p273o;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p273o.C4794c0;
import p005b.p273o.C4857i2;
import p005b.p273o.C4947q3;

/* renamed from: b.o.n4 */
public abstract class C4921n4 {

    /* renamed from: a */
    public final Object f9493a = new Object();

    /* renamed from: b */
    public C4947q3.C4948a f9494b;

    /* renamed from: c */
    public boolean f9495c;

    /* renamed from: d */
    public AtomicBoolean f9496d = new AtomicBoolean();

    /* renamed from: e */
    public final Queue<C4857i2.C4865h> f9497e = new ConcurrentLinkedQueue();

    /* renamed from: f */
    public final Queue<C4857i2.C4872o> f9498f = new ConcurrentLinkedQueue();

    /* renamed from: g */
    public HashMap<Integer, C4924c> f9499g = new HashMap<>();

    /* renamed from: h */
    public final Object f9500h = new C4922a(this);

    /* renamed from: i */
    public boolean f9501i = false;

    /* renamed from: j */
    public C4853h4 f9502j;

    /* renamed from: k */
    public C4853h4 f9503k;

    /* renamed from: b.o.n4$a */
    public class C4922a {
        public C4922a(C4921n4 n4Var) {
        }
    }

    /* renamed from: b.o.n4$b */
    public static class C4923b {

        /* renamed from: a */
        public boolean f9504a;

        /* renamed from: b */
        public JSONObject f9505b;

        public C4923b(boolean z, JSONObject jSONObject) {
            this.f9504a = z;
            this.f9505b = jSONObject;
        }
    }

    /* renamed from: b.o.n4$c */
    public class C4924c extends HandlerThread {

        /* renamed from: g */
        public int f9506g;

        /* renamed from: h */
        public Handler f9507h = null;

        /* renamed from: i */
        public int f9508i;

        public C4924c(int i) {
            super("OSH_NetworkHandlerThread");
            this.f9506g = i;
            start();
            this.f9507h = new Handler(getLooper());
        }

        /* renamed from: a */
        public void mo16670a() {
            if (C4921n4.this.f9495c) {
                synchronized (this.f9507h) {
                    this.f9508i = 0;
                    C4962r4 r4Var = null;
                    this.f9507h.removeCallbacksAndMessages((Object) null);
                    Handler handler = this.f9507h;
                    if (this.f9506g == 0) {
                        r4Var = new C4962r4(this);
                    }
                    handler.postDelayed(r4Var, 5000);
                }
            }
        }
    }

    public C4921n4(C4947q3.C4948a aVar) {
        this.f9494b = aVar;
    }

    /* renamed from: a */
    public static boolean m9033a(C4921n4 n4Var, int i, String str, String str2) {
        Objects.requireNonNull(n4Var);
        if (i == 400 && str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return jSONObject.has("errors") && jSONObject.optString("errors").contains(str2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m9034b(C4921n4 n4Var) {
        n4Var.mo16661n().mo16606o("logoutEmail");
        n4Var.f9503k.mo16606o("email_auth_hash");
        n4Var.f9503k.mo16607p("parent_player_id");
        n4Var.f9503k.mo16607p(NotificationCompat.CATEGORY_EMAIL);
        n4Var.f9503k.mo16602k();
        n4Var.f9502j.mo16606o("email_auth_hash");
        n4Var.f9502j.mo16607p("parent_player_id");
        String optString = n4Var.f9502j.mo16598g().f9670a.optString(NotificationCompat.CATEGORY_EMAIL);
        n4Var.f9502j.mo16607p(NotificationCompat.CATEGORY_EMAIL);
        C4947q3.m9081a().mo16668x();
        C4857i2.C4868k kVar = C4857i2.C4868k.INFO;
        C4857i2.m8933a(kVar, "Device successfully logged out of email: " + optString, (Throwable) null);
        String str = C4857i2.f9356a;
    }

    /* renamed from: c */
    public static void m9035c(C4921n4 n4Var) {
        Objects.requireNonNull(n4Var);
        C4857i2.m8933a(C4857i2.C4868k.WARN, "Creating new player based on missing player_id noted above.", (Throwable) null);
        String str = C4857i2.f9356a;
        n4Var.mo16666u();
        n4Var.mo16632z((String) null);
        n4Var.mo16631v();
    }

    /* renamed from: d */
    public static void m9036d(C4921n4 n4Var, int i) {
        boolean hasMessages;
        Objects.requireNonNull(n4Var);
        C4962r4 r4Var = null;
        if (i == 403) {
            C4857i2.m8933a(C4857i2.C4868k.FATAL, "403 error updating player, omitting further retries!", (Throwable) null);
        } else {
            C4924c l = n4Var.mo16659l(0);
            synchronized (l.f9507h) {
                boolean z = l.f9508i < 3;
                boolean hasMessages2 = l.f9507h.hasMessages(0);
                if (z && !hasMessages2) {
                    int i2 = l.f9508i + 1;
                    l.f9508i = i2;
                    Handler handler = l.f9507h;
                    if (l.f9506g == 0) {
                        r4Var = new C4962r4(l);
                    }
                    handler.postDelayed(r4Var, (long) (i2 * 15000));
                }
                hasMessages = l.f9507h.hasMessages(0);
            }
            if (hasMessages) {
                return;
            }
        }
        n4Var.mo16658i();
    }

    /* renamed from: A */
    public void mo16655A(C4794c0.C4798d dVar) {
        C4853h4 o = mo16662o();
        Objects.requireNonNull(o);
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("lat", dVar.f9186a);
            hashMap.put("long", dVar.f9187b);
            hashMap.put("loc_acc", dVar.f9188c);
            hashMap.put("loc_type", dVar.f9189d);
            o.mo16605n(o.f9328c, hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("loc_bg", dVar.f9190e);
            hashMap2.put("loc_time_stamp", dVar.f9191f);
            o.mo16605n(o.f9327b, hashMap2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public abstract void mo16625e(JSONObject jSONObject);

    /* renamed from: f */
    public final void mo16656f() {
        while (true) {
            C4857i2.C4872o poll = this.f9498f.poll();
            if (poll != null) {
                poll.mo16617a(this.f9494b.name().toLowerCase(), false);
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final void mo16657g() {
        while (true) {
            C4857i2.C4872o poll = this.f9498f.poll();
            if (poll != null) {
                poll.mo16617a(this.f9494b.name().toLowerCase(), true);
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public abstract void mo16626h(JSONObject jSONObject);

    /* renamed from: i */
    public final void mo16658i() {
        JSONObject b = this.f9502j.mo16594b(this.f9503k, false);
        if (b != null) {
            mo16626h(b);
        }
        if (mo16661n().mo16596e().f9670a.optBoolean("logoutEmail", false)) {
            String str = C4857i2.f9356a;
        }
    }

    /* renamed from: j */
    public abstract String mo16627j();

    /* renamed from: k */
    public abstract C4857i2.C4868k mo16628k();

    /* renamed from: l */
    public C4924c mo16659l(Integer num) {
        C4924c cVar;
        synchronized (this.f9500h) {
            if (!this.f9499g.containsKey(num)) {
                this.f9499g.put(num, new C4924c(num.intValue()));
            }
            cVar = this.f9499g.get(num);
        }
        return cVar;
    }

    /* renamed from: m */
    public String mo16660m() {
        return mo16661n().mo16598g().f9670a.optString("identifier", (String) null);
    }

    /* renamed from: n */
    public C4853h4 mo16661n() {
        synchronized (this.f9493a) {
            if (this.f9503k == null) {
                this.f9503k = mo16629r("TOSYNC_STATE", true);
            }
        }
        return this.f9503k;
    }

    /* renamed from: o */
    public C4853h4 mo16662o() {
        if (this.f9503k == null) {
            synchronized (this.f9493a) {
                if (this.f9502j == null) {
                    this.f9502j = mo16629r("CURRENT_STATE", true);
                }
            }
            C4853h4 h4Var = this.f9502j;
            C4853h4 j = h4Var.mo16601j("TOSYNC_STATE");
            try {
                j.f9327b = h4Var.mo16597f();
                j.f9328c = h4Var.mo16599h();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.f9503k = j;
        }
        mo16631v();
        return this.f9503k;
    }

    /* renamed from: p */
    public void mo16663p() {
        synchronized (this.f9493a) {
            if (this.f9502j == null) {
                this.f9502j = mo16629r("CURRENT_STATE", true);
            }
        }
        mo16661n();
    }

    /* renamed from: q */
    public final boolean mo16664q() {
        return (mo16661n().mo16596e().f9670a.optBoolean("session") || mo16627j() == null) && !this.f9501i;
    }

    /* renamed from: r */
    public abstract C4853h4 mo16629r(String str, boolean z);

    /* renamed from: s */
    public abstract void mo16630s(JSONObject jSONObject);

    /* renamed from: t */
    public boolean mo16665t() {
        boolean z = false;
        if (this.f9503k == null) {
            return false;
        }
        synchronized (this.f9493a) {
            if (this.f9502j.mo16594b(this.f9503k, mo16664q()) != null) {
                z = true;
            }
            this.f9503k.mo16602k();
        }
        return z;
    }

    /* renamed from: u */
    public void mo16666u() {
        C4853h4 h4Var = this.f9502j;
        JSONObject jSONObject = new JSONObject();
        Objects.requireNonNull(h4Var);
        synchronized (C4853h4.f9323d) {
            h4Var.f9328c = jSONObject;
        }
        this.f9502j.mo16602k();
    }

    /* renamed from: v */
    public abstract void mo16631v();

    /* renamed from: w */
    public final void mo16667w() {
        JSONObject jSONObject = C4947q3.m9084d(false).f9505b;
        while (true) {
            C4857i2.C4865h poll = this.f9497e.poll();
            if (poll != null) {
                poll.mo16615b(jSONObject);
            } else {
                return;
            }
        }
    }

    /* renamed from: x */
    public void mo16668x() {
        try {
            synchronized (this.f9493a) {
                mo16662o().mo16604m("session", Boolean.TRUE);
                mo16662o().mo16602k();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: y */
    public void mo16669y(boolean z) {
        JSONObject R;
        String str;
        this.f9496d.set(true);
        String j = mo16627j();
        if (!mo16661n().mo16596e().f9670a.optBoolean("logoutEmail", false) || j == null) {
            if (this.f9502j == null) {
                mo16663p();
            }
            boolean z2 = !z && mo16664q();
            synchronized (this.f9493a) {
                JSONObject b = this.f9502j.mo16594b(mo16661n(), z2);
                C4853h4 n = mo16661n();
                C4853h4 h4Var = this.f9502j;
                Objects.requireNonNull(h4Var);
                synchronized (C4853h4.f9323d) {
                    R = C1960d.m2746R(h4Var.f9327b, n.f9327b, (JSONObject) null, (Set<String>) null);
                }
                if (b == null) {
                    this.f9502j.mo16603l(R, (JSONObject) null);
                    mo16667w();
                    mo16657g();
                } else {
                    mo16661n().mo16602k();
                    if (z2) {
                        if (j == null) {
                            str = "players";
                        } else {
                            str = C0843a.m452m("players/", j, "/on_session");
                        }
                        this.f9501i = true;
                        mo16625e(b);
                        C4805c3.m8818q(str, b, new C4949q4(this, R, b, j));
                    } else if (j == null) {
                        C4857i2.m8933a(mo16628k(), "Error updating the user record because of the null user id", (Throwable) null);
                        C4857i2.C4877t tVar = new C4857i2.C4877t(-1, "Unable to update tags: the current user is not registered with OneSignal");
                        while (true) {
                            C4857i2.C4865h poll = this.f9497e.poll();
                            if (poll == null) {
                                break;
                            }
                            poll.mo16614a(tVar);
                        }
                        mo16656f();
                    } else {
                        C4805c3.m8813l(C0843a.m451l("players/", j), "PUT", b, new C4940p4(this, b, R), 120000, (String) null);
                    }
                }
            }
        } else {
            String m = C0843a.m452m("players/", j, "/email_logout");
            JSONObject jSONObject = new JSONObject();
            try {
                C4999v e = this.f9502j.mo16596e();
                if (e.f9670a.has("email_auth_hash")) {
                    jSONObject.put("email_auth_hash", e.f9670a.optString("email_auth_hash"));
                }
                C4999v g = this.f9502j.mo16598g();
                if (g.f9670a.has("parent_player_id")) {
                    jSONObject.put("parent_player_id", g.f9670a.optString("parent_player_id"));
                }
                jSONObject.put("app_id", g.f9670a.optString("app_id"));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            C4805c3.m8818q(m, jSONObject, new C4931o4(this));
        }
        this.f9496d.set(false);
    }

    /* renamed from: z */
    public abstract void mo16632z(String str);
}
