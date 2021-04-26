package p005b.p096l.p180d.p191q.p192f.p195g;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p180d.p191q.p192f.C3982b;
import p005b.p096l.p180d.p216x.C4290e;

/* renamed from: b.l.d.q.f.g.g0 */
public class C4012g0 implements C4014h0 {

    /* renamed from: f */
    public static final Pattern f7351f = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: g */
    public static final String f7352g = Pattern.quote("/");

    /* renamed from: a */
    public final C4016i0 f7353a;

    /* renamed from: b */
    public final Context f7354b;

    /* renamed from: c */
    public final String f7355c;

    /* renamed from: d */
    public final C4290e f7356d;

    /* renamed from: e */
    public String f7357e;

    public C4012g0(Context context, String str, C4290e eVar) {
        if (str != null) {
            this.f7354b = context;
            this.f7355c = str;
            this.f7356d = eVar;
            this.f7353a = new C4016i0();
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    /* renamed from: a */
    public final synchronized String mo15521a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        String uuid = UUID.randomUUID().toString();
        lowerCase = uuid == null ? null : f7351f.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
        C3982b bVar = C3982b.f7289a;
        bVar.mo15499e("Created new Crashlytics installation ID: " + lowerCase);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    @NonNull
    /* renamed from: b */
    public synchronized String mo15522b() {
        String str;
        String a;
        String str2 = this.f7357e;
        if (str2 != null) {
            return str2;
        }
        C3982b.f7289a.mo15499e("Determining Crashlytics installation ID...");
        SharedPreferences h = C4004e.m7400h(this.f7354b);
        C3428h<String> id = this.f7356d.getId();
        String string = h.getString("firebase.installation.id", (String) null);
        try {
            str = (String) C4039s0.m7441a(id);
        } catch (Exception e) {
            if (C3982b.f7289a.mo15495a(5)) {
                Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installations ID.", e);
            }
            str = string != null ? string : null;
        }
        if (string == null) {
            C3982b bVar = C3982b.f7289a;
            bVar.mo15499e("No cached Firebase Installations ID found.");
            SharedPreferences sharedPreferences = this.f7354b.getSharedPreferences("com.crashlytics.prefs", 0);
            String string2 = sharedPreferences.getString("crashlytics.installation.id", (String) null);
            if (string2 == null) {
                bVar.mo15499e("No legacy Crashlytics installation ID found, creating new ID.");
                a = mo15521a(str, h);
            } else {
                bVar.mo15499e("A legacy Crashlytics installation ID was found. Upgrading.");
                this.f7357e = string2;
                mo15524d(string2, str, h, sharedPreferences);
                C3982b bVar2 = C3982b.f7289a;
                bVar2.mo15499e("Crashlytics installation ID is " + this.f7357e);
                return this.f7357e;
            }
        } else if (string.equals(str)) {
            this.f7357e = h.getString("crashlytics.installation.id", (String) null);
            C3982b bVar3 = C3982b.f7289a;
            bVar3.mo15499e("Firebase Installations ID is unchanged from previous startup.");
            if (this.f7357e == null) {
                bVar3.mo15499e("Crashlytics installation ID was null, creating new ID.");
                a = mo15521a(str, h);
            }
            C3982b bVar22 = C3982b.f7289a;
            bVar22.mo15499e("Crashlytics installation ID is " + this.f7357e);
            return this.f7357e;
        } else {
            a = mo15521a(str, h);
        }
        this.f7357e = a;
        C3982b bVar222 = C3982b.f7289a;
        bVar222.mo15499e("Crashlytics installation ID is " + this.f7357e);
        return this.f7357e;
    }

    /* renamed from: c */
    public String mo15523c() {
        String str;
        C4016i0 i0Var = this.f7353a;
        Context context = this.f7354b;
        synchronized (i0Var) {
            if (i0Var.f7359a == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                i0Var.f7359a = installerPackageName;
            }
            str = "".equals(i0Var.f7359a) ? null : i0Var.f7359a;
        }
        return str;
    }

    /* renamed from: d */
    public final synchronized void mo15524d(String str, String str2, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        C3982b bVar = C3982b.f7289a;
        bVar.mo15499e("Migrating legacy Crashlytics installation ID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", str).putString("firebase.installation.id", str2).apply();
        sharedPreferences2.edit().remove("crashlytics.installation.id").remove("crashlytics.advertising.id").apply();
    }

    /* renamed from: e */
    public final String mo15525e(String str) {
        return str.replaceAll(f7352g, "");
    }
}
