package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.amplitude.api.Constants;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: b.l.a.c.h.b.c4 */
public final class C3135c4 extends C3227k5 {

    /* renamed from: x */
    public static final Pair<String, Long> f5422x = new Pair<>("", 0L);

    /* renamed from: c */
    public SharedPreferences f5423c;

    /* renamed from: d */
    public C3390z3 f5424d;

    /* renamed from: e */
    public final C3379y3 f5425e = new C3379y3(this, "first_open_time", 0);

    /* renamed from: f */
    public final C3379y3 f5426f = new C3379y3(this, "app_install_time", 0);

    /* renamed from: g */
    public final C3123b4 f5427g = new C3123b4(this, "app_instance_id");

    /* renamed from: h */
    public String f5428h;

    /* renamed from: i */
    public boolean f5429i;

    /* renamed from: j */
    public long f5430j;

    /* renamed from: k */
    public final C3379y3 f5431k = new C3379y3(this, "session_timeout", Constants.SESSION_TIMEOUT_MILLIS);

    /* renamed from: l */
    public final C3357w3 f5432l = new C3357w3(this, "start_new_session", true);

    /* renamed from: m */
    public final C3123b4 f5433m = new C3123b4(this, "non_personalized_ads");

    /* renamed from: n */
    public final C3357w3 f5434n = new C3357w3(this, "allow_remote_dynamite", false);

    /* renamed from: o */
    public final C3379y3 f5435o = new C3379y3(this, "last_pause_time", 0);

    /* renamed from: p */
    public boolean f5436p;

    /* renamed from: q */
    public final C3357w3 f5437q = new C3357w3(this, "app_backgrounded", false);

    /* renamed from: r */
    public final C3357w3 f5438r = new C3357w3(this, "deep_link_retrieval_complete", false);

    /* renamed from: s */
    public final C3379y3 f5439s = new C3379y3(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: t */
    public final C3123b4 f5440t = new C3123b4(this, "firebase_feature_rollouts");

    /* renamed from: u */
    public final C3123b4 f5441u = new C3123b4(this, "deferred_attribution_cache");

    /* renamed from: v */
    public final C3379y3 f5442v = new C3379y3(this, "deferred_attribution_cache_timestamp", 0);

    /* renamed from: w */
    public final C3368x3 f5443w = new C3368x3(this);

    public C3135c4(C3281p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: i */
    public final boolean mo14141i() {
        return true;
    }

    @WorkerThread
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    /* renamed from: j */
    public final void mo14142j() {
        SharedPreferences sharedPreferences = this.f5638a.f5842a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f5423c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f5436p = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f5423c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        C3166f fVar = this.f5638a.f5848g;
        this.f5424d = new C3390z3(this, Math.max(0, C3134c3.f5374c.mo14064a(null).longValue()));
    }

    @WorkerThread
    /* renamed from: o */
    public final SharedPreferences mo14143o() {
        mo14126h();
        mo14377l();
        Objects.requireNonNull(this.f5423c, "null reference");
        return this.f5423c;
    }

    @WorkerThread
    /* renamed from: p */
    public final void mo14144p(Boolean bool) {
        mo14126h();
        SharedPreferences.Editor edit = mo14143o().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    @WorkerThread
    /* renamed from: q */
    public final Boolean mo14145q() {
        mo14126h();
        if (mo14143o().contains("measurement_enabled")) {
            return Boolean.valueOf(mo14143o().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @WorkerThread
    /* renamed from: r */
    public final boolean mo14146r(int i) {
        return C3177g.m5993i(i, mo14143o().getInt("consent_source", 100));
    }

    @WorkerThread
    /* renamed from: s */
    public final C3177g mo14147s() {
        mo14126h();
        return C3177g.m5991b(mo14143o().getString("consent_settings", "G1"));
    }

    @WorkerThread
    /* renamed from: t */
    public final void mo14148t(boolean z) {
        mo14126h();
        this.f5638a.mo14329d().f5807n.mo14415b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = mo14143o().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* renamed from: u */
    public final boolean mo14149u(long j) {
        return j - this.f5431k.mo14633a() > this.f5435o.mo14633a();
    }
}
