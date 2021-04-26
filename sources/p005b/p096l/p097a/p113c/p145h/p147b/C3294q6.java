package p005b.p096l.p097a.p113c.p145h.p147b;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p119b.p126p.C1963g;
import p005b.p096l.p097a.p113c.p131e.p140i.C2716a9;
import p005b.p096l.p097a.p113c.p131e.p140i.C2877m9;
import p005b.p096l.p097a.p113c.p131e.p140i.C2980u8;

/* renamed from: b.l.a.c.h.b.q6 */
public final class C3294q6 extends C3111a4 {

    /* renamed from: c */
    public C3283p6 f5893c;

    /* renamed from: d */
    public C3330t9 f5894d;

    /* renamed from: e */
    public final Set<C3282p5> f5895e = new CopyOnWriteArraySet();

    /* renamed from: f */
    public boolean f5896f;

    /* renamed from: g */
    public final AtomicReference<String> f5897g = new AtomicReference<>();

    /* renamed from: h */
    public final Object f5898h = new Object();
    @GuardedBy("consentLock")

    /* renamed from: i */
    public C3177g f5899i = new C3177g((Boolean) null, (Boolean) null);
    @GuardedBy("consentLock")

    /* renamed from: j */
    public int f5900j = 100;

    /* renamed from: k */
    public final AtomicLong f5901k = new AtomicLong(0);

    /* renamed from: l */
    public long f5902l = -1;

    /* renamed from: m */
    public int f5903m = 100;

    /* renamed from: n */
    public final C3374x9 f5904n;

    /* renamed from: o */
    public boolean f5905o = true;

    /* renamed from: p */
    public final C3286p9 f5906p = new C3173f6(this);

    public C3294q6(C3281p4 p4Var) {
        super(p4Var);
        this.f5904n = new C3374x9(p4Var);
    }

    /* renamed from: t */
    public static void m6310t(C3294q6 q6Var, C3177g gVar, int i, long j, boolean z, boolean z2) {
        q6Var.mo14126h();
        q6Var.mo14065i();
        if (j > q6Var.f5902l || !C3177g.m5993i(q6Var.f5903m, i)) {
            C3135c4 q = q6Var.f5638a.mo14464q();
            C2980u8.m5384b();
            C3166f fVar = q.f5638a.f5848g;
            C3110a3<Boolean> a3Var = C3134c3.f5411u0;
            if (fVar.mo14197r((String) null, a3Var)) {
                q.mo14126h();
                if (q.mo14146r(i)) {
                    SharedPreferences.Editor edit = q.mo14143o().edit();
                    edit.putString("consent_settings", gVar.mo14232c());
                    edit.putInt("consent_source", i);
                    edit.apply();
                    q6Var.f5902l = j;
                    q6Var.f5903m = i;
                    C3175f8 z3 = q6Var.f5638a.mo14473z();
                    Objects.requireNonNull(z3);
                    C2980u8.m5384b();
                    if (z3.f5638a.f5848g.mo14197r((String) null, a3Var)) {
                        z3.mo14126h();
                        z3.mo14065i();
                        if (z) {
                            z3.mo14222r();
                            z3.f5638a.mo14469v().mo14264l();
                        }
                        if (z3.mo14221p()) {
                            z3.mo14224t(new C3317s7(z3, z3.mo14226v(false)));
                        }
                    }
                    if (z2) {
                        q6Var.f5638a.mo14473z().mo14230z(new AtomicReference());
                        return;
                    }
                    return;
                }
            }
            q6Var.f5638a.mo14329d().f5805l.mo14415b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        q6Var.f5638a.mo14329d().f5805l.mo14415b("Dropped out-of-date consent setting, proposed settings", gVar);
    }

    /* renamed from: A */
    public final void mo14493A(String str, String str2, Bundle bundle) {
        Objects.requireNonNull((C1959c) this.f5638a.f5855n);
        mo14496D(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @WorkerThread
    /* renamed from: B */
    public final void mo14494B(String str, String str2, long j, Bundle bundle) {
        mo14126h();
        mo14495C(str, str2, j, bundle, true, this.f5894d == null || C3297q9.m6338F(str2), false, (String) null);
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r14v16 */
    /* JADX WARNING: type inference failed for: r14v17 */
    @WorkerThread
    /* renamed from: C */
    public final void mo14495C(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        ? r14;
        boolean z4;
        Bundle bundle2;
        boolean z5;
        boolean z6;
        ArrayList arrayList;
        Bundle[] bundleArr;
        Object[] objArr;
        String str4 = str;
        String str5 = str2;
        long j2 = j;
        Bundle bundle3 = bundle;
        C0823f.m376j(str);
        Objects.requireNonNull(bundle3, "null reference");
        mo14126h();
        mo14065i();
        if (this.f5638a.mo14460j()) {
            List<String> list = this.f5638a.mo14457b().f5541i;
            if (list == null || list.contains(str5)) {
                if (!this.f5896f) {
                    this.f5896f = true;
                    try {
                        C3281p4 p4Var = this.f5638a;
                        try {
                            (!p4Var.f5846e ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, p4Var.f5842a.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{this.f5638a.f5842a});
                        } catch (Exception e) {
                            this.f5638a.mo14329d().f5802i.mo14415b("Failed to invoke Tag Manager's initialize() method", e);
                        }
                    } catch (ClassNotFoundException unused) {
                        this.f5638a.mo14329d().f5805l.mo14414a("Tag Manager is not found and thus will not be used");
                    }
                }
                if (!this.f5638a.f5848g.mo14197r((String) null, C3134c3.f5375c0) || !"_cmp".equals(str5) || !bundle3.containsKey("gclid")) {
                    r14 = 0;
                } else {
                    C3165ea eaVar = this.f5638a.f5847f;
                    String string = bundle3.getString("gclid");
                    Objects.requireNonNull((C1959c) this.f5638a.f5855n);
                    r14 = 0;
                    mo14501m("auto", "_lgclid", string, System.currentTimeMillis());
                }
                C3165ea eaVar2 = this.f5638a.f5847f;
                if (z && (!C3297q9.f5911h[r14].equals(str5))) {
                    this.f5638a.mo14467t().mo14555v(bundle3, this.f5638a.mo14464q().f5443w.mo14620a());
                }
                if (z3) {
                    C3165ea eaVar3 = this.f5638a.f5847f;
                    if (!"_iap".equals(str5)) {
                        C3297q9 t = this.f5638a.mo14467t();
                        int i = 2;
                        if (t.mo14537h0("event", str5)) {
                            if (!t.mo14539j0("event", C3249m5.f5737a, C3249m5.f5738b, str5)) {
                                i = 13;
                            } else {
                                C3166f fVar = t.f5638a.f5848g;
                                if (t.mo14540k0("event", 40, str5)) {
                                    i = r14;
                                }
                            }
                        }
                        if (i != 0) {
                            this.f5638a.mo14329d().f5801h.mo14415b("Invalid public event name. Event will not be logged (FE)", this.f5638a.mo14468u().mo14321p(str5));
                            C3297q9 t2 = this.f5638a.mo14467t();
                            C3166f fVar2 = this.f5638a.f5848g;
                            String q = t2.mo14548q(str5, 40, true);
                            int i2 = r14;
                            if (str5 != null) {
                                i2 = str2.length();
                            }
                            this.f5638a.mo14467t().mo14515A(this.f5906p, (String) null, i, "_ev", q, i2, this.f5638a.f5848g.mo14197r((String) null, C3134c3.f5421z0));
                            return;
                        }
                    }
                }
                C3281p4 p4Var2 = this.f5638a;
                C3165ea eaVar4 = p4Var2.f5847f;
                C3371x6 p = p4Var2.mo14472y().mo14213p(r14);
                if (p != null && !bundle3.containsKey("_sc")) {
                    p.f6095d = true;
                }
                C3174f7.m5964r(p, bundle3, (!z || !z3) ? r14 : true);
                boolean equals = "am".equals(str4);
                boolean F = C3297q9.m6338F(str2);
                if (!z || this.f5894d == null || F) {
                    z4 = equals;
                } else if (equals) {
                    z4 = true;
                } else {
                    this.f5638a.mo14329d().f5806m.mo14416c("Passing event to registered event handler (FE)", this.f5638a.mo14468u().mo14321p(str5), this.f5638a.mo14468u().mo14324s(bundle3));
                    Objects.requireNonNull(this.f5894d, "null reference");
                    C3330t9 t9Var = this.f5894d;
                    Objects.requireNonNull(t9Var);
                    try {
                        t9Var.f5984a.mo13254a0(str, str2, bundle, j);
                        return;
                    } catch (RemoteException e2) {
                        C3281p4 p4Var3 = t9Var.f5985b.f11364a;
                        if (p4Var3 != null) {
                            p4Var3.mo14329d().f5802i.mo14415b("Event interceptor threw exception", e2);
                            return;
                        }
                        return;
                    }
                }
                if (this.f5638a.mo14462l()) {
                    int l0 = this.f5638a.mo14467t().mo14541l0(str5);
                    if (l0 != 0) {
                        this.f5638a.mo14329d().f5801h.mo14415b("Invalid event name. Event will not be logged (FE)", this.f5638a.mo14468u().mo14321p(str5));
                        C3297q9 t3 = this.f5638a.mo14467t();
                        C3166f fVar3 = this.f5638a.f5848g;
                        String q2 = t3.mo14548q(str5, 40, true);
                        int i3 = r14;
                        if (str5 != null) {
                            i3 = str2.length();
                        }
                        this.f5638a.mo14467t().mo14515A(this.f5906p, str3, l0, "_ev", q2, i3, this.f5638a.f5848g.mo14197r((String) null, C3134c3.f5421z0));
                        return;
                    }
                    String str6 = "_o";
                    String str7 = "_si";
                    String str8 = "_sn";
                    String str9 = "_sc";
                    Bundle t4 = this.f5638a.mo14467t().mo14553t(str3, str2, bundle, Collections.unmodifiableList(Arrays.asList(new String[]{str6, "_sn", "_sc", "_si"})), z3);
                    if (t4.containsKey(str9) && t4.containsKey(str7)) {
                        t4.getString(str8);
                        t4.getString(str9);
                        t4.getLong(str7);
                    }
                    C3281p4 p4Var4 = this.f5638a;
                    C3165ea eaVar5 = p4Var4.f5847f;
                    if (p4Var4.mo14472y().mo14213p(false) != null && "_ae".equals(str5)) {
                        C3318s8 s8Var = this.f5638a.mo14465r().f6003e;
                        Objects.requireNonNull((C1959c) s8Var.f5963d.f5638a.f5855n);
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j3 = elapsedRealtime - s8Var.f5961b;
                        s8Var.f5961b = elapsedRealtime;
                        if (j3 > 0) {
                            this.f5638a.mo14467t().mo14524O(t4, j3);
                        }
                    }
                    C2716a9.m4567b();
                    if (this.f5638a.f5848g.mo14197r((String) null, C3134c3.f5397n0)) {
                        if (!"auto".equals(str4) && "_ssr".equals(str5)) {
                            C3297q9 t5 = this.f5638a.mo14467t();
                            String string2 = t4.getString("_ffr");
                            if (C1963g.m2881b(string2)) {
                                string2 = null;
                            } else if (string2 != null) {
                                string2 = string2.trim();
                            }
                            if (!C3297q9.m6339G(string2, t5.f5638a.mo14464q().f5440t.mo14127a())) {
                                t5.f5638a.mo14464q().f5440t.mo14128b(string2);
                            } else {
                                t5.f5638a.mo14329d().f5806m.mo14414a("Not logging duplicate session_start_with_rollout event");
                                return;
                            }
                        } else if ("_ae".equals(str5)) {
                            String a = this.f5638a.mo14467t().f5638a.mo14464q().f5440t.mo14127a();
                            if (!TextUtils.isEmpty(a)) {
                                t4.putString("_ffr", a);
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(t4);
                    if (this.f5638a.mo14464q().f5435o.mo14633a() <= 0 || !this.f5638a.mo14464q().mo14149u(j2) || !this.f5638a.mo14464q().f5437q.mo14613a()) {
                        bundle2 = t4;
                    } else {
                        this.f5638a.mo14329d().f5807n.mo14414a("Current session is expired, remove the session number, ID, and engagement time");
                        Objects.requireNonNull((C1959c) this.f5638a.f5855n);
                        bundle2 = t4;
                        mo14501m("auto", "_sid", (Object) null, System.currentTimeMillis());
                        Objects.requireNonNull((C1959c) this.f5638a.f5855n);
                        mo14501m("auto", "_sno", (Object) null, System.currentTimeMillis());
                        Objects.requireNonNull((C1959c) this.f5638a.f5855n);
                        mo14501m("auto", "_se", (Object) null, System.currentTimeMillis());
                    }
                    if (bundle2.getLong("extend_session", 0) == 1) {
                        this.f5638a.mo14329d().f5807n.mo14414a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                        this.f5638a.mo14465r().f6002d.mo14599b(j2, true);
                    }
                    ArrayList arrayList3 = new ArrayList(bundle2.keySet());
                    Collections.sort(arrayList3);
                    int size = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size) {
                        String str10 = (String) arrayList3.get(i4);
                        if (str10 != null) {
                            this.f5638a.mo14467t();
                            Object obj = bundle2.get(str10);
                            arrayList = arrayList3;
                            if (obj instanceof Bundle) {
                                bundleArr = new Bundle[]{(Bundle) obj};
                            } else {
                                if (obj instanceof Parcelable[]) {
                                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                                    objArr = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                                } else if (obj instanceof ArrayList) {
                                    ArrayList arrayList4 = (ArrayList) obj;
                                    objArr = arrayList4.toArray(new Bundle[arrayList4.size()]);
                                } else {
                                    bundleArr = null;
                                }
                                bundleArr = (Bundle[]) objArr;
                            }
                            if (bundleArr != null) {
                                bundle2.putParcelableArray(str10, bundleArr);
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                        i4++;
                        arrayList3 = arrayList;
                    }
                    int i5 = 0;
                    while (i5 < arrayList2.size()) {
                        Bundle bundle4 = (Bundle) arrayList2.get(i5);
                        String str11 = i5 != 0 ? "_ep" : str5;
                        bundle4.putString(str6, str4);
                        if (z2) {
                            bundle4 = this.f5638a.mo14467t().mo14518I(bundle4);
                        }
                        Bundle bundle5 = bundle4;
                        String str12 = str6;
                        Bundle bundle6 = bundle5;
                        C3309s sVar = r1;
                        C3309s sVar2 = new C3309s(str11, new C3287q(bundle5), str, j);
                        C3175f8 z7 = this.f5638a.mo14473z();
                        Objects.requireNonNull(z7);
                        z7.mo14126h();
                        z7.mo14065i();
                        z7.mo14222r();
                        C3203i3 v = z7.f5638a.mo14469v();
                        Objects.requireNonNull(v);
                        Parcel obtain = Parcel.obtain();
                        C3320t.m6414a(sVar, obtain, 0);
                        byte[] marshall = obtain.marshall();
                        obtain.recycle();
                        if (marshall.length > 131072) {
                            v.f5638a.mo14329d().f5800g.mo14414a("Event is too long for local database. Sending event directly to service");
                            z6 = true;
                            z5 = false;
                        } else {
                            z5 = v.mo14267o(0, marshall);
                            z6 = true;
                        }
                        z7.mo14224t(new C3328t7(z7, z7.mo14226v(z6), z5, sVar, str3));
                        if (!z4) {
                            for (C3282p5 a2 : this.f5895e) {
                                a2.mo14474a(str, str2, new Bundle(bundle6), j);
                            }
                        }
                        i5++;
                        str4 = str;
                        str6 = str12;
                    }
                    C3281p4 p4Var5 = this.f5638a;
                    C3165ea eaVar6 = p4Var5.f5847f;
                    if (p4Var5.mo14472y().mo14213p(false) != null && "_ae".equals(str5)) {
                        C3340u8 r = this.f5638a.mo14465r();
                        Objects.requireNonNull((C1959c) this.f5638a.f5855n);
                        r.f6003e.mo14587a(true, true, SystemClock.elapsedRealtime());
                        return;
                    }
                    return;
                }
                return;
            }
            this.f5638a.mo14329d().f5806m.mo14416c("Dropping non-safelisted event. event name, origin", str5, str4);
            return;
        }
        this.f5638a.mo14329d().f5806m.mo14414a("Event not sent since app measurement is disabled");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        if (r4 > 100) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00aa, code lost:
        if (r6 > 100) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0102, code lost:
        r2 = r1.f5638a.mo14329d().f5807n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010a, code lost:
        if (r13 != null) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010c, code lost:
        r3 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010f, code lost:
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0110, code lost:
        if (r14 != null) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0112, code lost:
        r4 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0115, code lost:
        r4 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0116, code lost:
        r2.mo14416c("Logging screen view with name, class", r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011d, code lost:
        if (r1.f5509c != null) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011f, code lost:
        r2 = r1.f5510d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0122, code lost:
        r2 = r1.f5509c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0124, code lost:
        r12 = new p005b.p096l.p097a.p113c.p145h.p147b.C3371x6(r13, r14, r1.f5638a.mo14467t().mo14534d0(), true, r26);
        r1.f5509c = r12;
        r1.f5510d = r2;
        r1.f5515i = r12;
        java.util.Objects.requireNonNull((p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r1.f5638a.f5855n);
        r1.f5638a.mo14331f().mo14420q(new p005b.p096l.p097a.p113c.p145h.p147b.C3382y6(r1, r0, r12, r2, android.os.SystemClock.elapsedRealtime()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14496D(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, boolean r24, boolean r25, long r26) {
        /*
            r20 = this;
            r11 = r20
            if (r21 != 0) goto L_0x0008
            java.lang.String r0 = "app"
            r2 = r0
            goto L_0x000a
        L_0x0008:
            r2 = r21
        L_0x000a:
            if (r23 != 0) goto L_0x0012
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            goto L_0x0014
        L_0x0012:
            r0 = r23
        L_0x0014:
            b.l.a.c.h.b.p4 r1 = r11.f5638a
            b.l.a.c.h.b.f r1 = r1.f5848g
            b.l.a.c.h.b.a3<java.lang.Boolean> r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5407s0
            r4 = 0
            boolean r1 = r1.mo14197r(r4, r3)
            r5 = 0
            if (r1 == 0) goto L_0x0169
            java.lang.String r1 = "screen_view"
            r6 = r22
            boolean r1 = p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.m6339G(r6, r1)
            if (r1 != 0) goto L_0x002e
            goto L_0x016b
        L_0x002e:
            b.l.a.c.h.b.p4 r1 = r11.f5638a
            b.l.a.c.h.b.f7 r1 = r1.mo14472y()
            b.l.a.c.h.b.p4 r2 = r1.f5638a
            b.l.a.c.h.b.f r2 = r2.f5848g
            boolean r2 = r2.mo14197r(r4, r3)
            if (r2 != 0) goto L_0x004d
            b.l.a.c.h.b.p4 r0 = r1.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5804k
            java.lang.String r1 = "Manual screen reporting is disabled."
            r0.mo14414a(r1)
            goto L_0x0165
        L_0x004d:
            java.lang.Object r3 = r1.f5518l
            monitor-enter(r3)
            boolean r2 = r1.f5517k     // Catch:{ all -> 0x0166 }
            if (r2 != 0) goto L_0x0064
            b.l.a.c.h.b.p4 r0 = r1.f5638a     // Catch:{ all -> 0x0166 }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ all -> 0x0166 }
            b.l.a.c.h.b.m3 r0 = r0.f5804k     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = "Cannot log screen view event when the app is in the background."
            r0.mo14414a(r1)     // Catch:{ all -> 0x0166 }
        L_0x0061:
            monitor-exit(r3)     // Catch:{ all -> 0x0166 }
            goto L_0x0165
        L_0x0064:
            java.lang.String r2 = "screen_name"
            java.lang.String r13 = r0.getString(r2)     // Catch:{ all -> 0x0166 }
            r2 = 100
            if (r13 == 0) goto L_0x0094
            int r4 = r13.length()     // Catch:{ all -> 0x0166 }
            if (r4 <= 0) goto L_0x007e
            int r4 = r13.length()     // Catch:{ all -> 0x0166 }
            b.l.a.c.h.b.p4 r6 = r1.f5638a     // Catch:{ all -> 0x0166 }
            b.l.a.c.h.b.f r6 = r6.f5848g     // Catch:{ all -> 0x0166 }
            if (r4 <= r2) goto L_0x0094
        L_0x007e:
            b.l.a.c.h.b.p4 r0 = r1.f5638a     // Catch:{ all -> 0x0166 }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ all -> 0x0166 }
            b.l.a.c.h.b.m3 r0 = r0.f5804k     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = "Invalid screen name length for screen view. Length"
            int r2 = r13.length()     // Catch:{ all -> 0x0166 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0166 }
            r0.mo14415b(r1, r2)     // Catch:{ all -> 0x0166 }
            goto L_0x0061
        L_0x0094:
            java.lang.String r4 = "screen_class"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x0166 }
            if (r4 == 0) goto L_0x00c2
            int r6 = r4.length()     // Catch:{ all -> 0x0166 }
            if (r6 <= 0) goto L_0x00ac
            int r6 = r4.length()     // Catch:{ all -> 0x0166 }
            b.l.a.c.h.b.p4 r7 = r1.f5638a     // Catch:{ all -> 0x0166 }
            b.l.a.c.h.b.f r7 = r7.f5848g     // Catch:{ all -> 0x0166 }
            if (r6 <= r2) goto L_0x00c2
        L_0x00ac:
            b.l.a.c.h.b.p4 r0 = r1.f5638a     // Catch:{ all -> 0x0166 }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ all -> 0x0166 }
            b.l.a.c.h.b.m3 r0 = r0.f5804k     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = "Invalid screen class length for screen view. Length"
            int r2 = r4.length()     // Catch:{ all -> 0x0166 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0166 }
            r0.mo14415b(r1, r2)     // Catch:{ all -> 0x0166 }
            goto L_0x0061
        L_0x00c2:
            if (r4 != 0) goto L_0x00d7
            android.app.Activity r2 = r1.f5513g     // Catch:{ all -> 0x0166 }
            if (r2 == 0) goto L_0x00d3
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x0166 }
            java.lang.String r4 = "Activity"
            java.lang.String r2 = r1.mo14214q(r2, r4)     // Catch:{ all -> 0x0166 }
            goto L_0x00d5
        L_0x00d3:
            java.lang.String r2 = "Activity"
        L_0x00d5:
            r14 = r2
            goto L_0x00d8
        L_0x00d7:
            r14 = r4
        L_0x00d8:
            b.l.a.c.h.b.x6 r2 = r1.f5509c     // Catch:{ all -> 0x0166 }
            boolean r4 = r1.f5514h     // Catch:{ all -> 0x0166 }
            if (r4 == 0) goto L_0x0101
            if (r2 == 0) goto L_0x0101
            r1.f5514h = r5     // Catch:{ all -> 0x0166 }
            java.lang.String r4 = r2.f6093b     // Catch:{ all -> 0x0166 }
            boolean r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.m6339G(r4, r14)     // Catch:{ all -> 0x0166 }
            java.lang.String r2 = r2.f6092a     // Catch:{ all -> 0x0166 }
            boolean r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.m6339G(r2, r13)     // Catch:{ all -> 0x0166 }
            if (r4 == 0) goto L_0x0101
            if (r2 == 0) goto L_0x0101
            b.l.a.c.h.b.p4 r0 = r1.f5638a     // Catch:{ all -> 0x0166 }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ all -> 0x0166 }
            b.l.a.c.h.b.m3 r0 = r0.f5804k     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = "Ignoring call to log screen view event with duplicate parameters."
            r0.mo14414a(r1)     // Catch:{ all -> 0x0166 }
            goto L_0x0061
        L_0x0101:
            monitor-exit(r3)     // Catch:{ all -> 0x0166 }
            b.l.a.c.h.b.p4 r2 = r1.f5638a
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()
            b.l.a.c.h.b.m3 r2 = r2.f5807n
            if (r13 != 0) goto L_0x010f
            java.lang.String r3 = "null"
            goto L_0x0110
        L_0x010f:
            r3 = r13
        L_0x0110:
            if (r14 != 0) goto L_0x0115
            java.lang.String r4 = "null"
            goto L_0x0116
        L_0x0115:
            r4 = r14
        L_0x0116:
            java.lang.String r5 = "Logging screen view with name, class"
            r2.mo14416c(r5, r3, r4)
            b.l.a.c.h.b.x6 r2 = r1.f5509c
            if (r2 != 0) goto L_0x0122
            b.l.a.c.h.b.x6 r2 = r1.f5510d
            goto L_0x0124
        L_0x0122:
            b.l.a.c.h.b.x6 r2 = r1.f5509c
        L_0x0124:
            b.l.a.c.h.b.x6 r3 = new b.l.a.c.h.b.x6
            b.l.a.c.h.b.p4 r4 = r1.f5638a
            b.l.a.c.h.b.q9 r4 = r4.mo14467t()
            long r15 = r4.mo14534d0()
            r17 = 1
            r12 = r3
            r18 = r26
            r12.<init>(r13, r14, r15, r17, r18)
            r1.f5509c = r3
            r1.f5510d = r2
            r1.f5515i = r3
            b.l.a.c.h.b.p4 r4 = r1.f5638a
            b.l.a.c.b.p.b r4 = r4.f5855n
            b.l.a.c.b.p.c r4 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r4
            java.util.Objects.requireNonNull(r4)
            long r4 = android.os.SystemClock.elapsedRealtime()
            b.l.a.c.h.b.p4 r6 = r1.f5638a
            b.l.a.c.h.b.m4 r6 = r6.mo14331f()
            b.l.a.c.h.b.y6 r7 = new b.l.a.c.h.b.y6
            r21 = r7
            r22 = r1
            r23 = r0
            r24 = r3
            r25 = r2
            r26 = r4
            r21.<init>(r22, r23, r24, r25, r26)
            r6.mo14420q(r7)
        L_0x0165:
            return
        L_0x0166:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0166 }
            throw r0
        L_0x0169:
            r6 = r22
        L_0x016b:
            r1 = 1
            if (r25 == 0) goto L_0x017b
            b.l.a.c.h.b.t9 r3 = r11.f5894d
            if (r3 == 0) goto L_0x017b
            boolean r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.m6338F(r22)
            if (r3 == 0) goto L_0x0179
            goto L_0x017b
        L_0x0179:
            r8 = r5
            goto L_0x017c
        L_0x017b:
            r8 = r1
        L_0x017c:
            r9 = r24 ^ 1
            r10 = 0
            r1 = r20
            r3 = r22
            r4 = r26
            r6 = r0
            r7 = r25
            r1.mo14497E(r2, r3, r4, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3294q6.mo14496D(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    /* renamed from: E */
    public final void mo14497E(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.f5638a.mo14331f().mo14420q(new C3359w5(this, str, str2, j, bundle2, z, z2, z3, (String) null));
    }

    /* renamed from: F */
    public final void mo14498F(String str, Object obj) {
        Objects.requireNonNull((C1959c) this.f5638a.f5855n);
        mo14499G("auto", str, obj, true, System.currentTimeMillis());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14499G(java.lang.String r18, java.lang.String r19, java.lang.Object r20, boolean r21, long r22) {
        /*
            r17 = this;
            r6 = r17
            r2 = r19
            r0 = r20
            if (r18 != 0) goto L_0x000b
            java.lang.String r1 = "app"
            goto L_0x000d
        L_0x000b:
            r1 = r18
        L_0x000d:
            r3 = 6
            r4 = 0
            r5 = 24
            r7 = 0
            if (r21 == 0) goto L_0x0020
            b.l.a.c.h.b.p4 r3 = r6.f5638a
            b.l.a.c.h.b.q9 r3 = r3.mo14467t()
            int r3 = r3.mo14542m0(r2)
        L_0x001e:
            r12 = r3
            goto L_0x0046
        L_0x0020:
            b.l.a.c.h.b.p4 r8 = r6.f5638a
            b.l.a.c.h.b.q9 r8 = r8.mo14467t()
            java.lang.String r9 = "user property"
            boolean r10 = r8.mo14537h0(r9, r2)
            if (r10 != 0) goto L_0x002f
        L_0x002e:
            goto L_0x001e
        L_0x002f:
            java.lang.String[] r10 = p005b.p096l.p097a.p113c.p145h.p147b.C3271o5.f5810a
            boolean r10 = r8.mo14539j0(r9, r10, r7, r2)
            if (r10 != 0) goto L_0x003a
            r3 = 15
            goto L_0x001e
        L_0x003a:
            b.l.a.c.h.b.p4 r10 = r8.f5638a
            b.l.a.c.h.b.f r10 = r10.f5848g
            boolean r8 = r8.mo14540k0(r9, r5, r2)
            if (r8 != 0) goto L_0x0045
            goto L_0x002e
        L_0x0045:
            r12 = r4
        L_0x0046:
            r3 = 1
            if (r12 == 0) goto L_0x0077
            b.l.a.c.h.b.p4 r0 = r6.f5638a
            b.l.a.c.h.b.q9 r0 = r0.mo14467t()
            b.l.a.c.h.b.p4 r1 = r6.f5638a
            b.l.a.c.h.b.f r1 = r1.f5848g
            java.lang.String r14 = r0.mo14548q(r2, r5, r3)
            if (r2 == 0) goto L_0x005d
            int r4 = r19.length()
        L_0x005d:
            r15 = r4
            b.l.a.c.h.b.p4 r0 = r6.f5638a
            b.l.a.c.h.b.q9 r9 = r0.mo14467t()
            b.l.a.c.h.b.p9 r10 = r6.f5906p
            r11 = 0
            b.l.a.c.h.b.p4 r0 = r6.f5638a
            b.l.a.c.h.b.f r0 = r0.f5848g
            b.l.a.c.h.b.a3<java.lang.Boolean> r1 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5421z0
            boolean r16 = r0.mo14197r(r7, r1)
            java.lang.String r13 = "_ev"
            r9.mo14515A(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0077:
            if (r0 == 0) goto L_0x00d3
            b.l.a.c.h.b.p4 r8 = r6.f5638a
            b.l.a.c.h.b.q9 r8 = r8.mo14467t()
            int r12 = r8.mo14557x(r2, r0)
            if (r12 == 0) goto L_0x00bd
            b.l.a.c.h.b.p4 r1 = r6.f5638a
            b.l.a.c.h.b.q9 r1 = r1.mo14467t()
            b.l.a.c.h.b.p4 r8 = r6.f5638a
            b.l.a.c.h.b.f r8 = r8.f5848g
            java.lang.String r14 = r1.mo14548q(r2, r5, r3)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L_0x009b
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L_0x00a3
        L_0x009b:
            java.lang.String r0 = java.lang.String.valueOf(r20)
            int r4 = r0.length()
        L_0x00a3:
            r15 = r4
            b.l.a.c.h.b.p4 r0 = r6.f5638a
            b.l.a.c.h.b.q9 r9 = r0.mo14467t()
            b.l.a.c.h.b.p9 r10 = r6.f5906p
            r11 = 0
            b.l.a.c.h.b.p4 r0 = r6.f5638a
            b.l.a.c.h.b.f r0 = r0.f5848g
            b.l.a.c.h.b.a3<java.lang.Boolean> r1 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5421z0
            boolean r16 = r0.mo14197r(r7, r1)
            java.lang.String r13 = "_ev"
            r9.mo14515A(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x00bd:
            b.l.a.c.h.b.p4 r3 = r6.f5638a
            b.l.a.c.h.b.q9 r3 = r3.mo14467t()
            java.lang.Object r5 = r3.mo14558y(r2, r0)
            if (r5 == 0) goto L_0x00d2
            r0 = r17
            r2 = r19
            r3 = r22
            r0.mo14500l(r1, r2, r3, r5)
        L_0x00d2:
            return
        L_0x00d3:
            r5 = 0
            r0 = r17
            r2 = r19
            r3 = r22
            r0.mo14500l(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3294q6.mo14499G(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* renamed from: k */
    public final boolean mo14067k() {
        return false;
    }

    /* renamed from: l */
    public final void mo14500l(String str, String str2, long j, Object obj) {
        this.f5638a.mo14331f().mo14420q(new C3370x5(this, str, str2, obj, j));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    @androidx.annotation.WorkerThread
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14501m(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
        /*
            r9 = this;
            p005b.p006a.p007a.p024o.C0823f.m376j(r10)
            p005b.p006a.p007a.p024o.C0823f.m376j(r11)
            r9.mo14126h()
            r9.mo14065i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r11)
            r1 = 1
            java.lang.String r2 = "_npa"
            if (r0 == 0) goto L_0x0065
            boolean r0 = r12 instanceof java.lang.String
            if (r0 == 0) goto L_0x0053
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0053
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r12 = "false"
            boolean r11 = r12.equals(r11)
            r3 = 1
            if (r1 == r11) goto L_0x0037
            r5 = 0
            goto L_0x0038
        L_0x0037:
            r5 = r3
        L_0x0038:
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            b.l.a.c.h.b.p4 r0 = r9.f5638a
            b.l.a.c.h.b.c4 r0 = r0.mo14464q()
            b.l.a.c.h.b.b4 r0 = r0.f5433m
            long r5 = r11.longValue()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x004e
            java.lang.String r12 = "true"
        L_0x004e:
            r0.mo14128b(r12)
            r7 = r11
            goto L_0x0063
        L_0x0053:
            if (r12 != 0) goto L_0x0065
            b.l.a.c.h.b.p4 r11 = r9.f5638a
            b.l.a.c.h.b.c4 r11 = r11.mo14464q()
            b.l.a.c.h.b.b4 r11 = r11.f5433m
            java.lang.String r0 = "unset"
            r11.mo14128b(r0)
            r7 = r12
        L_0x0063:
            r4 = r2
            goto L_0x0067
        L_0x0065:
            r4 = r11
            r7 = r12
        L_0x0067:
            b.l.a.c.h.b.p4 r11 = r9.f5638a
            boolean r11 = r11.mo14460j()
            if (r11 != 0) goto L_0x007d
            b.l.a.c.h.b.p4 r10 = r9.f5638a
            b.l.a.c.h.b.o3 r10 = r10.mo14329d()
            b.l.a.c.h.b.m3 r10 = r10.f5807n
            java.lang.String r11 = "User property not set since app measurement is disabled"
            r10.mo14414a(r11)
            return
        L_0x007d:
            b.l.a.c.h.b.p4 r11 = r9.f5638a
            boolean r11 = r11.mo14462l()
            if (r11 != 0) goto L_0x0086
            return
        L_0x0086:
            b.l.a.c.h.b.m9 r11 = new b.l.a.c.h.b.m9
            r3 = r11
            r5 = r13
            r8 = r10
            r3.<init>(r4, r5, r7, r8)
            b.l.a.c.h.b.p4 r10 = r9.f5638a
            b.l.a.c.h.b.f8 r10 = r10.mo14473z()
            r10.mo14126h()
            r10.mo14065i()
            r10.mo14222r()
            b.l.a.c.h.b.p4 r12 = r10.f5638a
            b.l.a.c.h.b.i3 r12 = r12.mo14469v()
            java.util.Objects.requireNonNull(r12)
            android.os.Parcel r13 = android.os.Parcel.obtain()
            r14 = 0
            p005b.p096l.p097a.p113c.p145h.p147b.C3264n9.m6246a(r11, r13, r14)
            byte[] r0 = r13.marshall()
            r13.recycle()
            int r13 = r0.length
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r13 <= r2) goto L_0x00c8
            b.l.a.c.h.b.p4 r12 = r12.f5638a
            b.l.a.c.h.b.o3 r12 = r12.mo14329d()
            b.l.a.c.h.b.m3 r12 = r12.f5800g
            java.lang.String r13 = "User property too long for local database. Sending directly to service"
            r12.mo14414a(r13)
            goto L_0x00cc
        L_0x00c8:
            boolean r14 = r12.mo14267o(r1, r0)
        L_0x00cc:
            b.l.a.c.h.b.v9 r12 = r10.mo14226v(r1)
            b.l.a.c.h.b.h7 r13 = new b.l.a.c.h.b.h7
            r13.<init>(r10, r12, r14, r11)
            r10.mo14224t(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3294q6.mo14501m(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: n */
    public final void mo14502n(long j, boolean z) {
        mo14126h();
        mo14065i();
        this.f5638a.mo14329d().f5806m.mo14414a("Resetting analytics data (FE)");
        C3340u8 r = this.f5638a.mo14465r();
        r.mo14126h();
        C3318s8 s8Var = r.f6003e;
        s8Var.f5962c.mo14387c();
        s8Var.f5960a = 0;
        s8Var.f5961b = 0;
        boolean j2 = this.f5638a.mo14460j();
        C3135c4 q = this.f5638a.mo14464q();
        q.f5425e.mo14634b(j);
        if (!TextUtils.isEmpty(q.f5638a.mo14464q().f5440t.mo14127a())) {
            q.f5440t.mo14128b((String) null);
        }
        C2877m9.m4962b();
        C3166f fVar = q.f5638a.f5848g;
        C3110a3<Boolean> a3Var = C3134c3.f5399o0;
        if (fVar.mo14197r((String) null, a3Var)) {
            q.f5435o.mo14634b(0);
        }
        if (!q.f5638a.f5848g.mo14200u()) {
            q.mo14148t(!j2);
        }
        q.f5441u.mo14128b((String) null);
        q.f5442v.mo14634b(0);
        q.f5443w.mo14621b((Bundle) null);
        if (z) {
            C3175f8 z2 = this.f5638a.mo14473z();
            z2.mo14126h();
            z2.mo14065i();
            C3352v9 v = z2.mo14226v(false);
            z2.mo14222r();
            z2.f5638a.mo14469v().mo14264l();
            z2.mo14224t(new C3207i7(z2, v));
        }
        C2877m9.m4962b();
        if (this.f5638a.f5848g.mo14197r((String) null, a3Var)) {
            this.f5638a.mo14465r().f6002d.mo14598a();
        }
        this.f5905o = !j2;
    }

    @WorkerThread
    /* renamed from: o */
    public final void mo14503o() {
        mo14126h();
        mo14065i();
        if (this.f5638a.mo14462l()) {
            if (this.f5638a.f5848g.mo14197r((String) null, C3134c3.f5373b0)) {
                C3166f fVar = this.f5638a.f5848g;
                C3165ea eaVar = fVar.f5638a.f5847f;
                Boolean t = fVar.mo14199t("google_analytics_deferred_deep_link_enabled");
                if (t != null && t.booleanValue()) {
                    this.f5638a.mo14329d().f5806m.mo14414a("Deferred Deep Link feature enabled.");
                    this.f5638a.mo14331f().mo14420q(new C3315s5(this));
                }
            }
            C3175f8 z = this.f5638a.mo14473z();
            z.mo14126h();
            z.mo14065i();
            C3352v9 v = z.mo14226v(true);
            z.f5638a.mo14469v().mo14267o(3, new byte[0]);
            z.mo14224t(new C3240l7(z, v));
            this.f5905o = false;
            C3135c4 q = this.f5638a.mo14464q();
            q.mo14126h();
            String string = q.mo14143o().getString("previous_os_version", (String) null);
            q.f5638a.mo14456A().mo14377l();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = q.mo14143o().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f5638a.mo14456A().mo14377l();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    mo14493A("auto", "_ou", bundle);
                }
            }
        }
    }

    @WorkerThread
    /* renamed from: p */
    public final void mo14504p(C3330t9 t9Var) {
        C3330t9 t9Var2;
        mo14126h();
        mo14065i();
        if (!(t9Var == null || t9Var == (t9Var2 = this.f5894d))) {
            C0823f.m386o(t9Var2 == null, "EventInterceptor already set.");
        }
        this.f5894d = t9Var;
    }

    /* renamed from: q */
    public final void mo14505q(Bundle bundle, long j) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        Objects.requireNonNull(bundle, "null reference");
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f5638a.mo14329d().f5802i.mo14414a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C1960d.m2705D1(bundle2, "app_id", cls2, null);
        C1960d.m2705D1(bundle2, "origin", cls2, null);
        C1960d.m2705D1(bundle2, "name", cls2, null);
        C1960d.m2705D1(bundle2, "value", Object.class, null);
        C1960d.m2705D1(bundle2, "trigger_event_name", cls2, null);
        C1960d.m2705D1(bundle2, "trigger_timeout", cls, 0L);
        C1960d.m2705D1(bundle2, "timed_out_event_name", cls2, null);
        C1960d.m2705D1(bundle2, "timed_out_event_params", Bundle.class, null);
        C1960d.m2705D1(bundle2, "triggered_event_name", cls2, null);
        C1960d.m2705D1(bundle2, "triggered_event_params", Bundle.class, null);
        C1960d.m2705D1(bundle2, "time_to_live", cls, 0L);
        C1960d.m2705D1(bundle2, "expired_event_name", cls2, null);
        C1960d.m2705D1(bundle2, "expired_event_params", Bundle.class, null);
        C0823f.m376j(bundle2.getString("name"));
        C0823f.m376j(bundle2.getString("origin"));
        Objects.requireNonNull(bundle2.get("value"), "null reference");
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f5638a.mo14467t().mo14542m0(string) != 0) {
            this.f5638a.mo14329d().f5799f.mo14415b("Invalid conditional user property name", this.f5638a.mo14468u().mo14323r(string));
        } else if (this.f5638a.mo14467t().mo14557x(string, obj) == 0) {
            Object y = this.f5638a.mo14467t().mo14558y(string, obj);
            if (y == null) {
                this.f5638a.mo14329d().f5799f.mo14416c("Unable to normalize conditional user property value", this.f5638a.mo14468u().mo14323r(string), obj);
                return;
            }
            C1960d.m2815k1(bundle2, y);
            long j2 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                C3281p4 p4Var = this.f5638a;
                C3166f fVar = p4Var.f5848g;
                if (j2 > 15552000000L || j2 < 1) {
                    p4Var.mo14329d().f5799f.mo14416c("Invalid conditional user property timeout", this.f5638a.mo14468u().mo14323r(string), Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle2.getLong("time_to_live");
            C3281p4 p4Var2 = this.f5638a;
            C3166f fVar2 = p4Var2.f5848g;
            if (j3 > 15552000000L || j3 < 1) {
                p4Var2.mo14329d().f5799f.mo14416c("Invalid conditional user property time to live", this.f5638a.mo14468u().mo14323r(string), Long.valueOf(j3));
            } else {
                p4Var2.mo14331f().mo14420q(new C3113a6(this, bundle2));
            }
        } else {
            this.f5638a.mo14329d().f5799f.mo14416c("Invalid conditional user property value", this.f5638a.mo14468u().mo14323r(string), obj);
        }
    }

    /* renamed from: r */
    public final void mo14506r(String str, String str2, Bundle bundle) {
        Objects.requireNonNull((C1959c) this.f5638a.f5855n);
        long currentTimeMillis = System.currentTimeMillis();
        C0823f.m376j(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f5638a.mo14331f().mo14420q(new C3125b6(this, bundle2));
    }

    /* renamed from: s */
    public final String mo14507s() {
        C3281p4 p4Var = this.f5638a;
        String str = p4Var.f5843b;
        if (str != null) {
            return str;
        }
        try {
            return C3360w6.m6446a(p4Var.f5842a, "google_app_id", p4Var.f5860s);
        } catch (IllegalStateException e) {
            this.f5638a.mo14329d().f5799f.mo14415b("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    @WorkerThread
    /* renamed from: u */
    public final void mo14508u(Boolean bool, boolean z) {
        mo14126h();
        mo14065i();
        this.f5638a.mo14329d().f5806m.mo14415b("Setting app measurement enabled (FE)", bool);
        this.f5638a.mo14464q().mo14144p(bool);
        C2980u8.m5384b();
        C3166f fVar = this.f5638a.f5848g;
        C3110a3<Boolean> a3Var = C3134c3.f5411u0;
        if (fVar.mo14197r((String) null, a3Var) && z) {
            C3135c4 q = this.f5638a.mo14464q();
            C2980u8.m5384b();
            if (q.f5638a.f5848g.mo14197r((String) null, a3Var)) {
                q.mo14126h();
                SharedPreferences.Editor edit = q.mo14143o().edit();
                if (bool != null) {
                    edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
                } else {
                    edit.remove("measurement_enabled_from_api");
                }
                edit.apply();
            }
        }
        C2980u8.m5384b();
        if (this.f5638a.f5848g.mo14197r((String) null, a3Var)) {
            C3281p4 p4Var = this.f5638a;
            p4Var.mo14331f().mo14126h();
            if (!p4Var.f5838E && (bool == null || bool.booleanValue())) {
                return;
            }
        }
        mo14509v();
    }

    @WorkerThread
    /* renamed from: v */
    public final void mo14509v() {
        mo14126h();
        String a = this.f5638a.mo14464q().f5433m.mo14127a();
        if (a != null) {
            if ("unset".equals(a)) {
                Objects.requireNonNull((C1959c) this.f5638a.f5855n);
                mo14501m("app", "_npa", (Object) null, System.currentTimeMillis());
            } else {
                Long valueOf = Long.valueOf(true != "true".equals(a) ? 0 : 1);
                Objects.requireNonNull((C1959c) this.f5638a.f5855n);
                mo14501m("app", "_npa", valueOf, System.currentTimeMillis());
            }
        }
        if (!this.f5638a.mo14460j() || !this.f5905o) {
            this.f5638a.mo14329d().f5806m.mo14414a("Updating Scion state (FE)");
            C3175f8 z = this.f5638a.mo14473z();
            z.mo14126h();
            z.mo14065i();
            z.mo14224t(new C3306r7(z, z.mo14226v(true)));
            return;
        }
        this.f5638a.mo14329d().f5806m.mo14414a("Recording app launch after enabling measurement for the first time (FE)");
        mo14503o();
        C2877m9.m4962b();
        if (this.f5638a.f5848g.mo14197r((String) null, C3134c3.f5399o0)) {
            this.f5638a.mo14465r().f6002d.mo14598a();
        }
        this.f5638a.mo14331f().mo14420q(new C3337u5(this));
    }

    /* renamed from: w */
    public final void mo14510w() {
        if ((this.f5638a.f5842a.getApplicationContext() instanceof Application) && this.f5893c != null) {
            ((Application) this.f5638a.f5842a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f5893c);
        }
    }

    /* renamed from: x */
    public final void mo14511x(Bundle bundle, int i, long j) {
        C2980u8.m5384b();
        String str = null;
        if (this.f5638a.f5848g.mo14197r((String) null, C3134c3.f5411u0)) {
            mo14065i();
            String string = bundle.getString("ad_storage");
            if ((string != null && C3177g.m5995k(string) == null) || ((string = bundle.getString("analytics_storage")) != null && C3177g.m5995k(string) == null)) {
                str = string;
            }
            if (str != null) {
                this.f5638a.mo14329d().f5804k.mo14415b("Ignoring invalid consent setting", str);
                this.f5638a.mo14329d().f5804k.mo14414a("Valid consent values are 'granted', 'denied'");
            }
            mo14512y(C3177g.m5990a(bundle), i, j);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: y */
    public final void mo14512y(p005b.p096l.p097a.p113c.p145h.p147b.C3177g r16, int r17, long r18) {
        /*
            r15 = this;
            r10 = r15
            r0 = r16
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()
            b.l.a.c.h.b.p4 r1 = r10.f5638a
            b.l.a.c.h.b.f r1 = r1.f5848g
            b.l.a.c.h.b.a3<java.lang.Boolean> r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5411u0
            r3 = 0
            boolean r1 = r1.mo14197r(r3, r2)
            if (r1 == 0) goto L_0x00f8
            r15.mo14065i()
            b.l.a.c.h.b.p4 r1 = r10.f5638a
            b.l.a.c.h.b.f r1 = r1.f5848g
            b.l.a.c.h.b.a3<java.lang.Boolean> r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5413v0
            boolean r1 = r1.mo14197r(r3, r2)
            r4 = -10
            if (r1 == 0) goto L_0x002b
            r1 = r17
            if (r1 == r4) goto L_0x0029
            goto L_0x002d
        L_0x0029:
            r6 = r4
            goto L_0x0045
        L_0x002b:
            r1 = r17
        L_0x002d:
            java.lang.Boolean r5 = r0.f5530a
            if (r5 != 0) goto L_0x0044
            java.lang.Boolean r5 = r0.f5531b
            if (r5 == 0) goto L_0x0036
            goto L_0x0044
        L_0x0036:
            b.l.a.c.h.b.p4 r0 = r10.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5804k
            java.lang.String r1 = "Discarding empty consent settings"
            r0.mo14414a(r1)
            return
        L_0x0044:
            r6 = r1
        L_0x0045:
            java.lang.Object r1 = r10.f5898h
            monitor-enter(r1)
            int r5 = r10.f5900j     // Catch:{ all -> 0x0078 }
            boolean r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3177g.m5993i(r6, r5)     // Catch:{ all -> 0x0078 }
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0085
            b.l.a.c.h.b.g r5 = r10.f5899i     // Catch:{ all -> 0x0078 }
            boolean r5 = r0.mo14236f(r5)     // Catch:{ all -> 0x0078 }
            boolean r9 = r16.mo14234e()     // Catch:{ all -> 0x0078 }
            if (r9 == 0) goto L_0x0067
            b.l.a.c.h.b.g r9 = r10.f5899i     // Catch:{ all -> 0x0078 }
            boolean r9 = r9.mo14234e()     // Catch:{ all -> 0x0078 }
            if (r9 != 0) goto L_0x0067
            r8 = r7
        L_0x0067:
            b.l.a.c.h.b.g r9 = r10.f5899i     // Catch:{ all -> 0x0078 }
            b.l.a.c.h.b.g r11 = new b.l.a.c.h.b.g     // Catch:{ all -> 0x0078 }
            java.lang.Boolean r12 = r0.f5530a     // Catch:{ all -> 0x0078 }
            if (r12 != 0) goto L_0x0071
            java.lang.Boolean r12 = r9.f5530a     // Catch:{ all -> 0x0078 }
        L_0x0071:
            java.lang.Boolean r0 = r0.f5531b     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x007b
            java.lang.Boolean r0 = r9.f5531b     // Catch:{ all -> 0x0078 }
            goto L_0x007b
        L_0x0078:
            r0 = move-exception
            goto L_0x00f6
        L_0x007b:
            r11.<init>(r12, r0)     // Catch:{ all -> 0x0078 }
            r10.f5899i = r11     // Catch:{ all -> 0x0078 }
            r10.f5900j = r6     // Catch:{ all -> 0x0078 }
            r9 = r8
            r8 = r5
            goto L_0x0088
        L_0x0085:
            r11 = r0
            r7 = r8
            r9 = r7
        L_0x0088:
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            if (r7 != 0) goto L_0x0099
            b.l.a.c.h.b.p4 r0 = r10.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5805l
            java.lang.String r1 = "Ignoring lower-priority consent settings, proposed settings"
            r0.mo14415b(r1, r11)
            return
        L_0x0099:
            java.util.concurrent.atomic.AtomicLong r0 = r10.f5901k
            long r12 = r0.getAndIncrement()
            if (r8 != 0) goto L_0x00dc
            b.l.a.c.h.b.p4 r0 = r10.f5638a
            b.l.a.c.h.b.f r0 = r0.f5848g
            boolean r0 = r0.mo14197r(r3, r2)
            if (r0 == 0) goto L_0x00c7
            r0 = 30
            if (r6 == r0) goto L_0x00b2
            if (r6 != r4) goto L_0x00c7
            goto L_0x00b3
        L_0x00b2:
            r4 = r6
        L_0x00b3:
            b.l.a.c.h.b.p4 r0 = r10.f5638a
            b.l.a.c.h.b.m4 r0 = r0.mo14331f()
            b.l.a.c.h.b.m6 r8 = new b.l.a.c.h.b.m6
            r1 = r8
            r2 = r15
            r3 = r11
            r5 = r12
            r7 = r9
            r1.<init>(r2, r3, r4, r5, r7)
            r0.mo14422s(r8)
            return
        L_0x00c7:
            b.l.a.c.h.b.p4 r0 = r10.f5638a
            b.l.a.c.h.b.m4 r0 = r0.mo14331f()
            b.l.a.c.h.b.n6 r8 = new b.l.a.c.h.b.n6
            r1 = r8
            r2 = r15
            r3 = r11
            r4 = r6
            r5 = r12
            r7 = r9
            r1.<init>(r2, r3, r4, r5, r7)
            r0.mo14420q(r8)
            return
        L_0x00dc:
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r0 = r10.f5897g
            r0.set(r3)
            b.l.a.c.h.b.p4 r0 = r10.f5638a
            b.l.a.c.h.b.m4 r0 = r0.mo14331f()
            b.l.a.c.h.b.l6 r14 = new b.l.a.c.h.b.l6
            r1 = r14
            r2 = r15
            r3 = r11
            r4 = r18
            r7 = r12
            r1.<init>(r2, r3, r4, r6, r7, r9)
            r0.mo14422s(r14)
            return
        L_0x00f6:
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            throw r0
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3294q6.mo14512y(b.l.a.c.h.b.g, int, long):void");
    }

    @WorkerThread
    /* renamed from: z */
    public final void mo14513z(C3177g gVar) {
        mo14126h();
        boolean z = (gVar.mo14234e() && gVar.mo14233d()) || this.f5638a.mo14473z().mo14221p();
        C3281p4 p4Var = this.f5638a;
        p4Var.mo14331f().mo14126h();
        if (z != p4Var.f5838E) {
            C3281p4 p4Var2 = this.f5638a;
            p4Var2.mo14331f().mo14126h();
            p4Var2.f5838E = z;
            C3135c4 q = this.f5638a.mo14464q();
            C2980u8.m5384b();
            Boolean bool = null;
            if (q.f5638a.f5848g.mo14197r((String) null, C3134c3.f5411u0)) {
                q.mo14126h();
                if (q.mo14143o().contains("measurement_enabled_from_api")) {
                    bool = Boolean.valueOf(q.mo14143o().getBoolean("measurement_enabled_from_api", true));
                }
            }
            if (!z || bool == null || bool.booleanValue()) {
                mo14508u(Boolean.valueOf(z), false);
            }
        }
    }
}
