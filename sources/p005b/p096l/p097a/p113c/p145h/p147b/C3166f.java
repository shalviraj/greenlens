package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p128q.C1968b;

/* renamed from: b.l.a.c.h.b.f */
public final class C3166f extends C3216j5 {

    /* renamed from: b */
    public Boolean f5499b;

    /* renamed from: c */
    public C3154e f5500c = C3142d.f5456a;

    /* renamed from: d */
    public Boolean f5501d;

    public C3166f(C3281p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: A */
    public static final long m5925A() {
        return C3134c3.f5376d.mo14064a(null).longValue();
    }

    /* renamed from: i */
    public static final long m5926i() {
        return C3134c3.f5346D.mo14064a(null).longValue();
    }

    /* renamed from: j */
    public final String mo14189j(String str, String str2) {
        C3247m3 m3Var;
        String str3;
        Class<String> cls = String.class;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            Objects.requireNonNull(str4, "null reference");
            return str4;
        } catch (ClassNotFoundException e) {
            e = e;
            m3Var = this.f5638a.mo14329d().f5799f;
            str3 = "Could not find SystemProperties class";
            m3Var.mo14415b(str3, e);
            return "";
        } catch (NoSuchMethodException e2) {
            e = e2;
            m3Var = this.f5638a.mo14329d().f5799f;
            str3 = "Could not find SystemProperties.get() method";
            m3Var.mo14415b(str3, e);
            return "";
        } catch (IllegalAccessException e3) {
            e = e3;
            m3Var = this.f5638a.mo14329d().f5799f;
            str3 = "Could not access SystemProperties.get()";
            m3Var.mo14415b(str3, e);
            return "";
        } catch (InvocationTargetException e4) {
            e = e4;
            m3Var = this.f5638a.mo14329d().f5799f;
            str3 = "SystemProperties.get() threw an exception";
            m3Var.mo14415b(str3, e);
            return "";
        }
    }

    /* renamed from: k */
    public final int mo14190k() {
        C3297q9 t = this.f5638a.mo14467t();
        Boolean bool = t.f5638a.mo14473z().f5522e;
        if (t.mo14522M() < 201500) {
            return (bool == null || bool.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    /* renamed from: l */
    public final int mo14191l(@Size(min = 1) String str) {
        return Math.max(Math.min(mo14195p(str, C3134c3.f5352I), 100), 25);
    }

    /* renamed from: m */
    public final int mo14192m(@Size(min = 1) String str) {
        return Math.max(Math.min(mo14195p(str, C3134c3.f5351H), RecyclerView.MAX_SCROLL_DURATION), 500);
    }

    /* renamed from: n */
    public final long mo14193n() {
        C3165ea eaVar = this.f5638a.f5847f;
        return 39065;
    }

    @WorkerThread
    /* renamed from: o */
    public final long mo14194o(String str, C3110a3<Long> a3Var) {
        if (str != null) {
            String b = this.f5500c.mo14156b(str, a3Var.f5250a);
            if (!TextUtils.isEmpty(b)) {
                try {
                    return a3Var.mo14064a(Long.valueOf(Long.parseLong(b))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return a3Var.mo14064a(null).longValue();
    }

    @WorkerThread
    /* renamed from: p */
    public final int mo14195p(String str, C3110a3<Integer> a3Var) {
        if (str != null) {
            String b = this.f5500c.mo14156b(str, a3Var.f5250a);
            if (!TextUtils.isEmpty(b)) {
                try {
                    return a3Var.mo14064a(Integer.valueOf(Integer.parseInt(b))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return a3Var.mo14064a(null).intValue();
    }

    @WorkerThread
    /* renamed from: q */
    public final int mo14196q(String str, C3110a3<Integer> a3Var, int i, int i2) {
        return Math.max(Math.min(mo14195p(str, a3Var), i2), i);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [b.l.a.c.h.b.a3, b.l.a.c.h.b.a3<java.lang.Boolean>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.WorkerThread
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14197r(java.lang.String r4, p005b.p096l.p097a.p113c.p145h.p147b.C3110a3<java.lang.Boolean> r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x000e
        L_0x0003:
            java.lang.Object r4 = r5.mo14064a(r0)
        L_0x0007:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x000e:
            b.l.a.c.h.b.e r1 = r3.f5500c
            java.lang.String r2 = r5.f5250a
            java.lang.String r4 = r1.mo14156b(r4, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L_0x001d
            goto L_0x0003
        L_0x001d:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r4 = r5.mo14064a(r4)
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3166f.mo14197r(java.lang.String, b.l.a.c.h.b.a3):boolean");
    }

    /* renamed from: s */
    public final Bundle mo14198s() {
        try {
            if (this.f5638a.f5842a.getPackageManager() == null) {
                this.f5638a.mo14329d().f5799f.mo14414a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = C1968b.m2885a(this.f5638a.f5842a).mo12293a(this.f5638a.f5842a.getPackageName(), 128);
            if (a != null) {
                return a.metaData;
            }
            this.f5638a.mo14329d().f5799f.mo14414a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.f5638a.mo14329d().f5799f.mo14415b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* renamed from: t */
    public final Boolean mo14199t(@Size(min = 1) String str) {
        C0823f.m376j(str);
        Bundle s = mo14198s();
        if (s == null) {
            this.f5638a.mo14329d().f5799f.mo14414a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!s.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(s.getBoolean(str));
        }
    }

    /* renamed from: u */
    public final boolean mo14200u() {
        C3165ea eaVar = this.f5638a.f5847f;
        Boolean t = mo14199t("firebase_analytics_collection_deactivated");
        return t != null && t.booleanValue();
    }

    /* renamed from: v */
    public final boolean mo14201v() {
        Boolean t = mo14199t("google_analytics_adid_collection_enabled");
        return t == null || t.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        r0 = mo14199t("google_analytics_automatic_screen_reporting_enabled");
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14202w() {
        /*
            r2 = this;
            b.l.a.c.e.i.fa r0 = p005b.p096l.p097a.p113c.p131e.p140i.C2787fa.f4730h
            b.l.a.c.e.i.ga r0 = r0.mo13235a()
            r0.mo13357a()
            r0 = 0
            b.l.a.c.h.b.a3<java.lang.Boolean> r1 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5405r0
            boolean r0 = r2.mo14197r(r0, r1)
            r1 = 1
            if (r0 != 0) goto L_0x0014
            return r1
        L_0x0014:
            java.lang.String r0 = "google_analytics_automatic_screen_reporting_enabled"
            java.lang.Boolean r0 = r2.mo14199t(r0)
            if (r0 == 0) goto L_0x0025
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r0 = 0
            return r0
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3166f.mo14202w():boolean");
    }

    /* renamed from: x */
    public final boolean mo14203x(String str) {
        return "1".equals(this.f5500c.mo14156b(str, "gaia_collection_enabled"));
    }

    /* renamed from: y */
    public final boolean mo14204y(String str) {
        return "1".equals(this.f5500c.mo14156b(str, "measurement.event_sampling_enabled"));
    }

    @WorkerThread
    /* renamed from: z */
    public final boolean mo14205z() {
        if (this.f5499b == null) {
            Boolean t = mo14199t("app_measurement_lite");
            this.f5499b = t;
            if (t == null) {
                this.f5499b = Boolean.FALSE;
            }
        }
        return this.f5499b.booleanValue() || !this.f5638a.f5846e;
    }
}
