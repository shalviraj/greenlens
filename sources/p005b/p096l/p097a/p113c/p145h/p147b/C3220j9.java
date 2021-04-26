package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.amplitude.api.DatabaseHelper;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1958b;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;
import p005b.p096l.p097a.p113c.p119b.p128q.C1968b;
import p005b.p096l.p097a.p113c.p131e.p140i.C2775ec;
import p005b.p096l.p097a.p113c.p131e.p140i.C2792g2;
import p005b.p096l.p097a.p113c.p131e.p140i.C2805h2;
import p005b.p096l.p097a.p113c.p131e.p140i.C2895o1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2908p1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2947s1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2960t1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2980u8;
import p005b.p096l.p097a.p113c.p131e.p140i.C2999w1;
import p005b.p096l.p097a.p113c.p131e.p140i.C3007w9;
import p005b.p096l.p097a.p113c.p131e.p140i.C3012x1;

/* renamed from: b.l.a.c.h.b.j9 */
public final class C3220j9 implements C3238l5 {

    /* renamed from: B */
    public static volatile C3220j9 f5646B;

    /* renamed from: A */
    public final C3286p9 f5647A = new C3198h9(this);

    /* renamed from: a */
    public final C3204i4 f5648a;

    /* renamed from: b */
    public final C3324t3 f5649b;

    /* renamed from: c */
    public C3210j f5650c;

    /* renamed from: d */
    public C3346v3 f5651d;

    /* renamed from: e */
    public C3373x8 f5652e;

    /* renamed from: f */
    public C3153da f5653f;

    /* renamed from: g */
    public final C3242l9 f5654g;

    /* renamed from: h */
    public C3349v6 f5655h;

    /* renamed from: i */
    public C3186g8 f5656i;

    /* renamed from: j */
    public final C3128b9 f5657j;

    /* renamed from: k */
    public final C3281p4 f5658k;

    /* renamed from: l */
    public boolean f5659l = false;

    /* renamed from: m */
    public boolean f5660m;

    /* renamed from: n */
    public long f5661n;

    /* renamed from: o */
    public List<Runnable> f5662o;

    /* renamed from: p */
    public int f5663p;

    /* renamed from: q */
    public int f5664q;

    /* renamed from: r */
    public boolean f5665r;

    /* renamed from: s */
    public boolean f5666s;

    /* renamed from: t */
    public boolean f5667t;

    /* renamed from: u */
    public FileLock f5668u;

    /* renamed from: v */
    public FileChannel f5669v;

    /* renamed from: w */
    public List<Long> f5670w;

    /* renamed from: x */
    public List<Long> f5671x;

    /* renamed from: y */
    public long f5672y;

    /* renamed from: z */
    public final Map<String, C3177g> f5673z;

    public C3220j9(C3231k9 k9Var, C3281p4 p4Var) {
        this.f5658k = C3281p4.m6272h(k9Var.f5689a, (C2775ec) null, (Long) null);
        this.f5672y = -1;
        this.f5657j = new C3128b9(this);
        C3242l9 l9Var = new C3242l9(this);
        l9Var.mo14647k();
        this.f5654g = l9Var;
        C3324t3 t3Var = new C3324t3(this);
        t3Var.mo14647k();
        this.f5649b = t3Var;
        C3204i4 i4Var = new C3204i4(this);
        i4Var.mo14647k();
        this.f5648a = i4Var;
        this.f5673z = new HashMap();
        mo14331f().mo14420q(new C3140c9(this, k9Var));
    }

    /* renamed from: F */
    public static final C3395z8 m6111F(C3395z8 z8Var) {
        if (z8Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (z8Var.f6158c) {
            return z8Var;
        } else {
            String valueOf = String.valueOf(z8Var.getClass());
            throw new IllegalStateException(C0843a.m455p(new StringBuilder(valueOf.length() + 27), "Component not initialized: ", valueOf));
        }
    }

    /* renamed from: s */
    public static final void m6112s(C2895o1 o1Var, int i, String str) {
        List<C2960t1> m = o1Var.mo13526m();
        int i2 = 0;
        while (i2 < m.size()) {
            if (!"_err".equals(m.get(i2).mo13737t())) {
                i2++;
            } else {
                return;
            }
        }
        C2947s1 E = C2960t1.m5263E();
        E.mo13690m("_err");
        E.mo13692o(Long.valueOf((long) i).longValue());
        C2960t1 t1Var = (C2960t1) E.mo13484g();
        C2947s1 E2 = C2960t1.m5263E();
        E2.mo13690m("_ev");
        E2.mo13691n(str);
        C2960t1 t1Var2 = (C2960t1) E2.mo13484g();
        if (o1Var.f4886i) {
            o1Var.mo13487j();
            o1Var.f4886i = false;
        }
        C2908p1.m5061F((C2908p1) o1Var.f4885h, t1Var);
        if (o1Var.f4886i) {
            o1Var.mo13487j();
            o1Var.f4886i = false;
        }
        C2908p1.m5061F((C2908p1) o1Var.f4885h, t1Var2);
    }

    /* renamed from: t */
    public static C3220j9 m6113t(Context context) {
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(context.getApplicationContext(), "null reference");
        if (f5646B == null) {
            synchronized (C3220j9.class) {
                if (f5646B == null) {
                    f5646B = new C3220j9(new C3231k9(context), (C3281p4) null);
                }
            }
        }
        return f5646B;
    }

    /* renamed from: u */
    public static final void m6114u(C2895o1 o1Var, @NonNull String str) {
        List<C2960t1> m = o1Var.mo13526m();
        for (int i = 0; i < m.size(); i++) {
            if (str.equals(m.get(i).mo13737t())) {
                o1Var.mo13531r(i);
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0321  */
    @androidx.annotation.WorkerThread
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14336A() {
        /*
            r19 = this;
            r1 = r19
            b.l.a.c.h.b.m4 r0 = r19.mo14331f()
            r0.mo14126h()
            r19.mo14347M()
            long r2 = r1.f5661n
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0043
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            b.l.a.c.b.p.b r0 = r19.mo14330e()
            b.l.a.c.b.p.c r0 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r0
            java.util.Objects.requireNonNull(r0)
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r8 = r1.f5661n
            long r6 = r6 - r8
            long r6 = java.lang.Math.abs(r6)
            long r2 = r2 - r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0041
            b.l.a.c.h.b.o3 r0 = r19.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5807n
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r0.mo14415b(r3, r2)
            goto L_0x03b6
        L_0x0041:
            r1.f5661n = r4
        L_0x0043:
            b.l.a.c.h.b.p4 r0 = r1.f5658k
            boolean r0 = r0.mo14462l()
            if (r0 == 0) goto L_0x03ab
            boolean r0 = r19.mo14372z()
            if (r0 != 0) goto L_0x0053
            goto L_0x03ab
        L_0x0053:
            b.l.a.c.b.p.b r0 = r19.mo14330e()
            b.l.a.c.b.p.c r0 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r0
            java.util.Objects.requireNonNull(r0)
            long r2 = java.lang.System.currentTimeMillis()
            r19.mo14341G()
            b.l.a.c.h.b.a3<java.lang.Long> r0 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5340A
            r6 = 0
            java.lang.Object r0 = r0.mo14064a(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r7 = r0.longValue()
            long r7 = java.lang.Math.max(r4, r7)
            b.l.a.c.h.b.j r0 = r1.f5650c
            m6111F(r0)
            java.lang.String r9 = "select count(1) > 0 from raw_events where realtime = 1"
            long r9 = r0.mo14315v(r9, r6)
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0085
            r0 = 1
            goto L_0x0086
        L_0x0085:
            r0 = 0
        L_0x0086:
            if (r0 != 0) goto L_0x009f
            b.l.a.c.h.b.j r0 = r1.f5650c
            m6111F(r0)
            java.lang.String r11 = "select count(1) > 0 from queue where has_realtime = 1"
            long r11 = r0.mo14315v(r11, r6)
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0099
            r0 = 1
            goto L_0x009a
        L_0x0099:
            r0 = 0
        L_0x009a:
            if (r0 == 0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            r0 = 0
            goto L_0x00a0
        L_0x009f:
            r0 = 1
        L_0x00a0:
            if (r0 == 0) goto L_0x00c8
            b.l.a.c.h.b.f r11 = r19.mo14341G()
            java.lang.String r12 = "debug.firebase.analytics.app"
            java.lang.String r13 = ""
            java.lang.String r11 = r11.mo14189j(r12, r13)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L_0x00c2
            java.lang.String r12 = ".none."
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L_0x00c2
            r19.mo14341G()
            b.l.a.c.h.b.a3<java.lang.Long> r11 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5412v
            goto L_0x00cd
        L_0x00c2:
            r19.mo14341G()
            b.l.a.c.h.b.a3<java.lang.Long> r11 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5410u
            goto L_0x00cd
        L_0x00c8:
            r19.mo14341G()
            b.l.a.c.h.b.a3<java.lang.Long> r11 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5408t
        L_0x00cd:
            java.lang.Object r11 = r11.mo14064a(r6)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = java.lang.Math.max(r4, r11)
            b.l.a.c.h.b.g8 r13 = r1.f5656i
            b.l.a.c.h.b.y3 r13 = r13.f5561i
            long r13 = r13.mo14633a()
            b.l.a.c.h.b.g8 r15 = r1.f5656i
            b.l.a.c.h.b.y3 r15 = r15.f5562j
            long r15 = r15.mo14633a()
            b.l.a.c.h.b.j r9 = r1.f5650c
            m6111F(r9)
            java.lang.String r10 = "select max(bundle_end_timestamp) from queue"
            long r9 = r9.mo14316w(r10, r6, r4)
            b.l.a.c.h.b.j r4 = r1.f5650c
            m6111F(r4)
            java.lang.String r5 = "select max(timestamp) from raw_events"
            r17 = r11
            r11 = 0
            long r4 = r4.mo14316w(r5, r6, r11)
            long r4 = java.lang.Math.max(r9, r4)
            int r9 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x010f
            goto L_0x018e
        L_0x010f:
            long r4 = r4 - r2
            long r4 = java.lang.Math.abs(r4)
            long r4 = r2 - r4
            long r13 = r13 - r2
            long r9 = java.lang.Math.abs(r13)
            long r15 = r15 - r2
            long r11 = java.lang.Math.abs(r15)
            long r11 = r2 - r11
            long r2 = r2 - r9
            long r2 = java.lang.Math.max(r2, r11)
            long r7 = r7 + r4
            if (r0 == 0) goto L_0x0136
            r9 = 0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0136
            long r7 = java.lang.Math.min(r4, r2)
            long r7 = r7 + r17
        L_0x0136:
            b.l.a.c.h.b.l9 r0 = r1.f5654g
            m6111F(r0)
            r9 = r17
            boolean r0 = r0.mo14399D(r2, r9)
            if (r0 != 0) goto L_0x0145
            long r2 = r2 + r9
            goto L_0x0146
        L_0x0145:
            r2 = r7
        L_0x0146:
            r7 = 0
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0190
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0190
            r0 = 0
        L_0x0151:
            r19.mo14341G()
            r4 = 20
            b.l.a.c.h.b.a3<java.lang.Integer> r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5344C
            java.lang.Object r5 = r5.mo14064a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            int r4 = java.lang.Math.min(r4, r5)
            if (r0 >= r4) goto L_0x018e
            r19.mo14341G()
            b.l.a.c.h.b.a3<java.lang.Long> r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5342B
            java.lang.Object r4 = r4.mo14064a(r6)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r7 = 0
            long r4 = java.lang.Math.max(r7, r4)
            r7 = 1
            long r7 = r7 << r0
            long r4 = r4 * r7
            long r2 = r2 + r4
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x0190
            int r0 = r0 + 1
            goto L_0x0151
        L_0x018e:
            r2 = 0
        L_0x0190:
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x03a2
            b.l.a.c.h.b.t3 r0 = r1.f5649b
            m6111F(r0)
            boolean r0 = r0.mo14591l()
            if (r0 == 0) goto L_0x034c
            b.l.a.c.h.b.g8 r0 = r1.f5656i
            b.l.a.c.h.b.y3 r0 = r0.f5560h
            long r4 = r0.mo14633a()
            r19.mo14341G()
            b.l.a.c.h.b.a3<java.lang.Long> r0 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5404r
            java.lang.Object r0 = r0.mo14064a(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r7 = r0.longValue()
            r9 = 0
            long r7 = java.lang.Math.max(r9, r7)
            b.l.a.c.h.b.l9 r0 = r1.f5654g
            m6111F(r0)
            boolean r0 = r0.mo14399D(r4, r7)
            if (r0 != 0) goto L_0x01ce
            long r4 = r4 + r7
            long r2 = java.lang.Math.max(r2, r4)
        L_0x01ce:
            b.l.a.c.h.b.v3 r0 = r19.mo14343I()
            r0.mo14607a()
            b.l.a.c.b.p.b r0 = r19.mo14330e()
            b.l.a.c.b.p.c r0 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r0
            java.util.Objects.requireNonNull(r0)
            long r4 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0210
            r19.mo14341G()
            b.l.a.c.h.b.a3<java.lang.Long> r0 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5414w
            java.lang.Object r0 = r0.mo14064a(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            long r2 = java.lang.Math.max(r4, r2)
            b.l.a.c.h.b.g8 r0 = r1.f5656i
            b.l.a.c.h.b.y3 r0 = r0.f5561i
            b.l.a.c.b.p.b r4 = r19.mo14330e()
            b.l.a.c.b.p.c r4 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r4
            java.util.Objects.requireNonNull(r4)
            long r4 = java.lang.System.currentTimeMillis()
            r0.mo14634b(r4)
        L_0x0210:
            b.l.a.c.h.b.o3 r0 = r19.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5807n
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.lang.String r5 = "Upload scheduled in approximately ms"
            r0.mo14415b(r5, r4)
            b.l.a.c.h.b.x8 r0 = r1.f5652e
            m6111F(r0)
            r0.mo14646i()
            b.l.a.c.h.b.p4 r4 = r0.f5638a
            b.l.a.c.h.b.ea r5 = r4.f5847f
            android.content.Context r4 = r4.f5842a
            boolean r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.m6341X(r4)
            if (r5 != 0) goto L_0x0240
            b.l.a.c.h.b.p4 r5 = r0.f5638a
            b.l.a.c.h.b.o3 r5 = r5.mo14329d()
            b.l.a.c.h.b.m3 r5 = r5.f5806m
            java.lang.String r7 = "Receiver not registered/enabled"
            r5.mo14414a(r7)
        L_0x0240:
            java.lang.String r5 = "com.google.android.gms.measurement.AppMeasurementJobService"
            boolean r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.m6343b0(r4, r5)
            if (r4 != 0) goto L_0x0255
            b.l.a.c.h.b.p4 r4 = r0.f5638a
            b.l.a.c.h.b.o3 r4 = r4.mo14329d()
            b.l.a.c.h.b.m3 r4 = r4.f5806m
            java.lang.String r7 = "Service not registered/enabled"
            r4.mo14414a(r7)
        L_0x0255:
            r0.mo14625l()
            b.l.a.c.h.b.p4 r4 = r0.f5638a
            b.l.a.c.h.b.o3 r4 = r4.mo14329d()
            b.l.a.c.h.b.m3 r4 = r4.f5807n
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            java.lang.String r8 = "Scheduling upload, millis"
            r4.mo14415b(r8, r7)
            b.l.a.c.h.b.p4 r4 = r0.f5638a
            b.l.a.c.b.p.b r4 = r4.f5855n
            b.l.a.c.b.p.c r4 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r4
            java.util.Objects.requireNonNull(r4)
            android.os.SystemClock.elapsedRealtime()
            b.l.a.c.h.b.p4 r4 = r0.f5638a
            b.l.a.c.h.b.f r4 = r4.f5848g
            b.l.a.c.h.b.a3<java.lang.Long> r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5416x
            java.lang.Object r4 = r4.mo14064a(r6)
            java.lang.Long r4 = (java.lang.Long) r4
            long r6 = r4.longValue()
            r8 = 0
            long r6 = java.lang.Math.max(r8, r6)
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x02a5
            b.l.a.c.h.b.l r4 = r0.mo14626m()
            long r6 = r4.f5693c
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x029b
            r4 = 1
            goto L_0x029c
        L_0x029b:
            r4 = 0
        L_0x029c:
            if (r4 != 0) goto L_0x02a5
            b.l.a.c.h.b.l r4 = r0.mo14626m()
            r4.mo14386b(r2)
        L_0x02a5:
            b.l.a.c.h.b.p4 r4 = r0.f5638a
            b.l.a.c.h.b.ea r6 = r4.f5847f
            android.content.Context r4 = r4.f5842a
            android.content.ComponentName r6 = new android.content.ComponentName
            r6.<init>(r4, r5)
            int r0 = r0.mo14628o()
            android.os.PersistableBundle r5 = new android.os.PersistableBundle
            r5.<init>()
            java.lang.String r7 = "action"
            java.lang.String r8 = "com.google.android.gms.measurement.UPLOAD"
            r5.putString(r7, r8)
            android.app.job.JobInfo$Builder r7 = new android.app.job.JobInfo$Builder
            r7.<init>(r0, r6)
            android.app.job.JobInfo$Builder r0 = r7.setMinimumLatency(r2)
            long r2 = r2 + r2
            android.app.job.JobInfo$Builder r0 = r0.setOverrideDeadline(r2)
            android.app.job.JobInfo$Builder r0 = r0.setExtras(r5)
            android.app.job.JobInfo r2 = r0.build()
            java.lang.reflect.Method r0 = p005b.p096l.p097a.p113c.p131e.p140i.C3028y4.f5155a
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r0 = r4.getSystemService(r0)
            r3 = r0
            android.app.job.JobScheduler r3 = (android.app.job.JobScheduler) r3
            java.util.Objects.requireNonNull(r3)
            java.lang.reflect.Method r0 = p005b.p096l.p097a.p113c.p131e.p140i.C3028y4.f5155a
            if (r0 == 0) goto L_0x0348
            java.lang.String r0 = "android.permission.UPDATE_DEVICE_STATS"
            int r0 = r4.checkSelfPermission(r0)
            if (r0 == 0) goto L_0x02f1
            goto L_0x0348
        L_0x02f1:
            java.lang.reflect.Method r0 = p005b.p096l.p097a.p113c.p131e.p140i.C3028y4.f5156b
            if (r0 == 0) goto L_0x0318
            java.lang.Class<android.os.UserHandle> r4 = android.os.UserHandle.class
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException -> 0x0309, InvocationTargetException -> 0x0307 }
            java.lang.Object r0 = r0.invoke(r4, r6)     // Catch:{ IllegalAccessException -> 0x0309, InvocationTargetException -> 0x0307 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalAccessException -> 0x0309, InvocationTargetException -> 0x0307 }
            if (r0 == 0) goto L_0x0318
            int r7 = r0.intValue()     // Catch:{ IllegalAccessException -> 0x0309, InvocationTargetException -> 0x0307 }
            goto L_0x0319
        L_0x0307:
            r0 = move-exception
            goto L_0x030a
        L_0x0309:
            r0 = move-exception
        L_0x030a:
            r4 = 6
            java.lang.String r5 = "JobSchedulerCompat"
            boolean r4 = android.util.Log.isLoggable(r5, r4)
            if (r4 == 0) goto L_0x0318
            java.lang.String r4 = "myUserId invocation illegal"
            android.util.Log.e(r5, r4, r0)
        L_0x0318:
            r7 = 0
        L_0x0319:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r4 = "UploadAlarm"
            java.lang.reflect.Method r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3028y4.f5155a
            if (r5 == 0) goto L_0x0348
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException -> 0x0342, InvocationTargetException -> 0x0340 }
            r8 = 0
            r6[r8] = r2     // Catch:{ IllegalAccessException -> 0x0342, InvocationTargetException -> 0x0340 }
            r8 = 1
            r6[r8] = r0     // Catch:{ IllegalAccessException -> 0x0342, InvocationTargetException -> 0x0340 }
            r0 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IllegalAccessException -> 0x0342, InvocationTargetException -> 0x0340 }
            r6[r0] = r7     // Catch:{ IllegalAccessException -> 0x0342, InvocationTargetException -> 0x0340 }
            r0 = 3
            r6[r0] = r4     // Catch:{ IllegalAccessException -> 0x0342, InvocationTargetException -> 0x0340 }
            java.lang.Object r0 = r5.invoke(r3, r6)     // Catch:{ IllegalAccessException -> 0x0342, InvocationTargetException -> 0x0340 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalAccessException -> 0x0342, InvocationTargetException -> 0x0340 }
            if (r0 == 0) goto L_0x034b
            r0.intValue()     // Catch:{ IllegalAccessException -> 0x0342, InvocationTargetException -> 0x0340 }
            goto L_0x034b
        L_0x0340:
            r0 = move-exception
            goto L_0x0343
        L_0x0342:
            r0 = move-exception
        L_0x0343:
            java.lang.String r5 = "error calling scheduleAsPackage"
            android.util.Log.e(r4, r5, r0)
        L_0x0348:
            r3.schedule(r2)
        L_0x034b:
            return
        L_0x034c:
            b.l.a.c.h.b.o3 r0 = r19.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5807n
            java.lang.String r2 = "No network"
            r0.mo14414a(r2)
            b.l.a.c.h.b.v3 r0 = r19.mo14343I()
            b.l.a.c.h.b.j9 r2 = r0.f6011a
            r2.mo14347M()
            b.l.a.c.h.b.j9 r2 = r0.f6011a
            b.l.a.c.h.b.m4 r2 = r2.mo14331f()
            r2.mo14126h()
            boolean r2 = r0.f6012b
            if (r2 == 0) goto L_0x036e
            goto L_0x03bd
        L_0x036e:
            b.l.a.c.h.b.j9 r2 = r0.f6011a
            b.l.a.c.h.b.p4 r2 = r2.f5658k
            android.content.Context r2 = r2.f5842a
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r4 = "android.net.conn.CONNECTIVITY_CHANGE"
            r3.<init>(r4)
            r2.registerReceiver(r0, r3)
            b.l.a.c.h.b.j9 r2 = r0.f6011a
            b.l.a.c.h.b.t3 r2 = r2.f5649b
            m6111F(r2)
            boolean r2 = r2.mo14591l()
            r0.f6013c = r2
            b.l.a.c.h.b.j9 r2 = r0.f6011a
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()
            b.l.a.c.h.b.m3 r2 = r2.f5807n
            boolean r3 = r0.f6013c
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "Registering connectivity change receiver. Network connected"
            r2.mo14415b(r4, r3)
            r2 = 1
            r0.f6012b = r2
            goto L_0x03bd
        L_0x03a2:
            b.l.a.c.h.b.o3 r0 = r19.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5807n
            java.lang.String r2 = "Next upload time is 0"
            goto L_0x03b3
        L_0x03ab:
            b.l.a.c.h.b.o3 r0 = r19.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5807n
            java.lang.String r2 = "Nothing to upload or uploading impossible"
        L_0x03b3:
            r0.mo14414a(r2)
        L_0x03b6:
            b.l.a.c.h.b.v3 r0 = r19.mo14343I()
            r0.mo14607a()
        L_0x03bd:
            b.l.a.c.h.b.x8 r0 = r1.f5652e
            m6111F(r0)
            r0.mo14625l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.mo14336A():void");
    }

    @WorkerThread
    /* renamed from: B */
    public final void mo14337B() {
        mo14331f().mo14126h();
        if (this.f5665r || this.f5666s || this.f5667t) {
            mo14329d().f5807n.mo14417d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f5665r), Boolean.valueOf(this.f5666s), Boolean.valueOf(this.f5667t));
            return;
        }
        mo14329d().f5807n.mo14414a("Stopping uploading service(s)");
        List<Runnable> list = this.f5662o;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            List<Runnable> list2 = this.f5662o;
            Objects.requireNonNull(list2, "null reference");
            list2.clear();
        }
    }

    @WorkerThread
    /* renamed from: C */
    public final Boolean mo14338C(C3112a5 a5Var) {
        try {
            if (a5Var.mo14085R() != -2147483648L) {
                if (a5Var.mo14085R() == ((long) C1968b.m2885a(this.f5658k.f5842a).mo12294b(a5Var.mo14114y(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C1968b.m2885a(this.f5658k.f5842a).mo12294b(a5Var.mo14114y(), 0).versionName;
                String P = a5Var.mo14083P();
                if (P != null && P.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @WorkerThread
    /* renamed from: D */
    public final C3352v9 mo14339D(String str) {
        String str2;
        Object obj;
        C3247m3 m3Var;
        String str3 = str;
        C3210j jVar = this.f5650c;
        m6111F(jVar);
        C3112a5 N = jVar.mo14299N(str3);
        if (N == null || TextUtils.isEmpty(N.mo14083P())) {
            m3Var = mo14329d().f5806m;
            str2 = "No app data available; dropping";
            obj = str3;
        } else {
            Boolean C = mo14338C(N);
            if (C == null || C.booleanValue()) {
                String B = N.mo14069B();
                String P = N.mo14083P();
                long R = N.mo14085R();
                String T = N.mo14087T();
                long V = N.mo14089V();
                long b = N.mo14091b();
                boolean f = N.mo14095f();
                String J = N.mo14077J();
                long q = N.mo14106q();
                boolean s = N.mo14108s();
                String D = N.mo14071D();
                Boolean u = N.mo14110u();
                long d = N.mo14093d();
                List<String> w = N.mo14112w();
                C3007w9.m5549b();
                String F = mo14341G().mo14197r(str3, C3134c3.f5385h0) ? N.mo14073F() : null;
                C2980u8.m5384b();
                return new C3352v9(str, B, P, R, T, V, b, (String) null, f, false, J, q, 0, 0, s, false, D, u, d, w, F, mo14341G().mo14197r((String) null, C3134c3.f5415w0) ? mo14349O(str).mo14232c() : "");
            }
            m3Var = mo14329d().f5799f;
            str2 = "App version does not match; dropping. appId";
            obj = C3269o3.m6253t(str);
        }
        m3Var.mo14415b(str2, obj);
        return null;
    }

    /* renamed from: E */
    public final boolean mo14340E(C3352v9 v9Var) {
        C3007w9.m5549b();
        return mo14341G().mo14197r(v9Var.f6029g, C3134c3.f5385h0) ? !TextUtils.isEmpty(v9Var.f6030h) || !TextUtils.isEmpty(v9Var.f6027A) || !TextUtils.isEmpty(v9Var.f6045w) : !TextUtils.isEmpty(v9Var.f6030h) || !TextUtils.isEmpty(v9Var.f6045w);
    }

    /* renamed from: G */
    public final C3166f mo14341G() {
        C3281p4 p4Var = this.f5658k;
        Objects.requireNonNull(p4Var, "null reference");
        return p4Var.f5848g;
    }

    /* renamed from: H */
    public final C3210j mo14342H() {
        C3210j jVar = this.f5650c;
        m6111F(jVar);
        return jVar;
    }

    /* renamed from: I */
    public final C3346v3 mo14343I() {
        C3346v3 v3Var = this.f5651d;
        if (v3Var != null) {
            return v3Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: J */
    public final C3242l9 mo14344J() {
        C3242l9 l9Var = this.f5654g;
        m6111F(l9Var);
        return l9Var;
    }

    /* renamed from: K */
    public final C3214j3 mo14345K() {
        return this.f5658k.mo14468u();
    }

    /* renamed from: L */
    public final C3297q9 mo14346L() {
        C3281p4 p4Var = this.f5658k;
        Objects.requireNonNull(p4Var, "null reference");
        return p4Var.mo14467t();
    }

    /* renamed from: M */
    public final void mo14347M() {
        if (!this.f5659l) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    @WorkerThread
    /* renamed from: N */
    public final void mo14348N(String str, C3177g gVar) {
        C2980u8.m5384b();
        C3166f G = mo14341G();
        C3110a3<Boolean> a3Var = C3134c3.f5415w0;
        if (G.mo14197r((String) null, a3Var)) {
            mo14331f().mo14126h();
            mo14347M();
            this.f5673z.put(str, gVar);
            C3210j jVar = this.f5650c;
            m6111F(jVar);
            C2980u8.m5384b();
            if (jVar.f5638a.f5848g.mo14197r((String) null, a3Var)) {
                Objects.requireNonNull(str, "null reference");
                jVar.mo14126h();
                jVar.mo14646i();
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("consent_state", gVar.mo14232c());
                try {
                    if (jVar.mo14286A().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                        jVar.f5638a.mo14329d().f5799f.mo14415b("Failed to insert/update consent setting (got -1). appId", C3269o3.m6253t(str));
                    }
                } catch (SQLiteException e) {
                    jVar.f5638a.mo14329d().f5799f.mo14416c("Error storing consent setting. appId, error", C3269o3.m6253t(str), e);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.String, android.database.Cursor] */
    @WorkerThread
    /* renamed from: O */
    public final C3177g mo14349O(String str) {
        String str2;
        C3177g gVar = C3177g.f5529c;
        C2980u8.m5384b();
        ? r3 = 0;
        if (mo14341G().mo14197r(r3, C3134c3.f5415w0)) {
            mo14331f().mo14126h();
            mo14347M();
            gVar = this.f5673z.get(str);
            if (gVar == null) {
                C3210j jVar = this.f5650c;
                m6111F(jVar);
                Objects.requireNonNull(str, "null reference");
                jVar.mo14126h();
                jVar.mo14646i();
                try {
                    Cursor rawQuery = jVar.mo14286A().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                    if (rawQuery.moveToFirst()) {
                        str2 = rawQuery.getString(0);
                        rawQuery.close();
                    } else {
                        rawQuery.close();
                        str2 = "G1";
                    }
                    C3177g b = C3177g.m5991b(str2);
                    mo14348N(str, b);
                    return b;
                } catch (SQLiteException e) {
                    jVar.f5638a.mo14329d().f5799f.mo14416c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
                    throw e;
                } catch (Throwable th) {
                    if (r3 != 0) {
                        r3.close();
                    }
                    throw th;
                }
            }
        }
        return gVar;
    }

    /* renamed from: P */
    public final long mo14350P() {
        Objects.requireNonNull((C1959c) mo14330e());
        long currentTimeMillis = System.currentTimeMillis();
        C3186g8 g8Var = this.f5656i;
        g8Var.mo14646i();
        g8Var.mo14126h();
        long a = g8Var.f5563k.mo14633a();
        if (a == 0) {
            a = ((long) g8Var.f5638a.mo14467t().mo14535e0().nextInt(86400000)) + 1;
            g8Var.f5563k.mo14634b(a);
        }
        return ((((currentTimeMillis + a) / 1000) / 60) / 60) / 24;
    }

    @WorkerThread
    /* renamed from: Q */
    public final void mo14351Q(C3309s sVar, String str) {
        C3309s sVar2 = sVar;
        String str2 = str;
        C3210j jVar = this.f5650c;
        m6111F(jVar);
        C3112a5 N = jVar.mo14299N(str2);
        if (N == null || TextUtils.isEmpty(N.mo14083P())) {
            mo14329d().f5806m.mo14415b("No app data available; dropping event", str2);
            return;
        }
        Boolean C = mo14338C(N);
        if (C == null) {
            if (!"_ui".equals(sVar2.f5937g)) {
                mo14329d().f5802i.mo14415b("Could not find package. appId", C3269o3.m6253t(str));
            }
        } else if (!C.booleanValue()) {
            mo14329d().f5799f.mo14415b("App version does not match; dropping event. appId", C3269o3.m6253t(str));
            return;
        }
        String B = N.mo14069B();
        String P = N.mo14083P();
        long R = N.mo14085R();
        String T = N.mo14087T();
        long V = N.mo14089V();
        long b = N.mo14091b();
        boolean f = N.mo14095f();
        String J = N.mo14077J();
        long q = N.mo14106q();
        boolean s = N.mo14108s();
        String D = N.mo14071D();
        Boolean u = N.mo14110u();
        long d = N.mo14093d();
        List<String> w = N.mo14112w();
        C3007w9.m5549b();
        String F = mo14341G().mo14197r(N.mo14114y(), C3134c3.f5385h0) ? N.mo14073F() : null;
        C2980u8.m5384b();
        C3352v9 v9Var = r2;
        C3352v9 v9Var2 = new C3352v9(str, B, P, R, T, V, b, (String) null, f, false, J, q, 0, 0, s, false, D, u, d, w, F, mo14341G().mo14197r((String) null, C3134c3.f5415w0) ? mo14349O(str2).mo14232c() : "");
        mo14352R(sVar, v9Var);
    }

    @WorkerThread
    /* renamed from: R */
    public final void mo14352R(C3309s sVar, C3352v9 v9Var) {
        C0823f.m376j(v9Var.f6029g);
        C3280p3 a = C3280p3.m6270a(sVar);
        C3297q9 L = mo14346L();
        Bundle bundle = a.f5832d;
        C3210j jVar = this.f5650c;
        m6111F(jVar);
        L.mo14555v(bundle, jVar.mo14312r(v9Var.f6029g));
        mo14346L().mo14554u(a, mo14341G().mo14191l(v9Var.f6029g));
        C3309s b = a.mo14454b();
        if (mo14341G().mo14197r((String) null, C3134c3.f5375c0) && "_cmp".equals(b.f5937g) && "referrer API v2".equals(b.f5938h.f5876g.getString("_cis"))) {
            String string = b.f5938h.f5876g.getString("gclid");
            if (!TextUtils.isEmpty(string)) {
                mo14362m(new C3253m9("_lgclid", b.f5940j, string, "auto"), v9Var);
            }
        }
        mo14353S(b, v9Var);
    }

    @WorkerThread
    /* renamed from: S */
    public final void mo14353S(C3309s sVar, C3352v9 v9Var) {
        List<C3118b> list;
        List<C3118b> list2;
        List<C3118b> list3;
        C3247m3 m3Var;
        String str;
        Object t;
        String r;
        C3309s sVar2 = sVar;
        C3352v9 v9Var2 = v9Var;
        String str2 = "null reference";
        Objects.requireNonNull(v9Var2, str2);
        C0823f.m376j(v9Var2.f6029g);
        mo14331f().mo14126h();
        mo14347M();
        String str3 = v9Var2.f6029g;
        long j = sVar2.f5940j;
        m6111F(this.f5654g);
        if (C3242l9.m6196K(sVar, v9Var)) {
            if (!v9Var2.f6036n) {
                mo14367r(v9Var2);
                return;
            }
            List<String> list4 = v9Var2.f6048z;
            if (list4 != null) {
                if (list4.contains(sVar2.f5937g)) {
                    Bundle Z = sVar2.f5938h.mo14488Z();
                    Z.putLong("ga_safelisted", 1);
                    sVar2 = new C3309s(sVar2.f5937g, new C3287q(Z), sVar2.f5939i, sVar2.f5940j);
                } else {
                    mo14329d().f5806m.mo14417d("Dropping non-safelisted event. appId, event name, origin", str3, sVar2.f5937g, sVar2.f5939i);
                    return;
                }
            }
            C3210j jVar = this.f5650c;
            m6111F(jVar);
            jVar.mo14317x();
            try {
                C3210j jVar2 = this.f5650c;
                m6111F(jVar2);
                C0823f.m376j(str3);
                jVar2.mo14126h();
                jVar2.mo14646i();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    jVar2.f5638a.mo14329d().f5802i.mo14416c("Invalid time querying timed out conditional properties", C3269o3.m6253t(str3), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = jVar2.mo14298M("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str3, String.valueOf(j)});
                }
                for (C3118b next : list) {
                    if (next != null) {
                        mo14329d().f5807n.mo14417d("User property timed out", next.f5302g, this.f5658k.mo14468u().mo14323r(next.f5304i.f5751h), next.f5304i.mo14428V());
                        C3309s sVar3 = next.f5308m;
                        if (sVar3 != null) {
                            mo14354T(new C3309s(sVar3, j), v9Var2);
                        }
                        C3210j jVar3 = this.f5650c;
                        m6111F(jVar3);
                        jVar3.mo14296K(str3, next.f5304i.f5751h);
                    }
                }
                C3210j jVar4 = this.f5650c;
                m6111F(jVar4);
                C0823f.m376j(str3);
                jVar4.mo14126h();
                jVar4.mo14646i();
                if (i < 0) {
                    jVar4.f5638a.mo14329d().f5802i.mo14416c("Invalid time querying expired conditional properties", C3269o3.m6253t(str3), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = jVar4.mo14298M("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str3, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (C3118b next2 : list2) {
                    if (next2 != null) {
                        mo14329d().f5807n.mo14417d("User property expired", next2.f5302g, this.f5658k.mo14468u().mo14323r(next2.f5304i.f5751h), next2.f5304i.mo14428V());
                        C3210j jVar5 = this.f5650c;
                        m6111F(jVar5);
                        jVar5.mo14289D(str3, next2.f5304i.f5751h);
                        C3309s sVar4 = next2.f5312q;
                        if (sVar4 != null) {
                            arrayList.add(sVar4);
                        }
                        C3210j jVar6 = this.f5650c;
                        m6111F(jVar6);
                        jVar6.mo14296K(str3, next2.f5304i.f5751h);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    mo14354T(new C3309s((C3309s) it.next(), j), v9Var2);
                }
                C3210j jVar7 = this.f5650c;
                m6111F(jVar7);
                String str4 = sVar2.f5937g;
                C0823f.m376j(str3);
                C0823f.m376j(str4);
                jVar7.mo14126h();
                jVar7.mo14646i();
                if (i < 0) {
                    jVar7.f5638a.mo14329d().f5802i.mo14417d("Invalid time querying triggered conditional properties", C3269o3.m6253t(str3), jVar7.f5638a.mo14468u().mo14321p(str4), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = jVar7.mo14298M("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str3, str4, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (C3118b next3 : list3) {
                    if (next3 != null) {
                        C3253m9 m9Var = next3.f5304i;
                        String str5 = next3.f5302g;
                        Objects.requireNonNull(str5, str2);
                        String str6 = next3.f5303h;
                        String str7 = m9Var.f5751h;
                        Object V = m9Var.mo14428V();
                        Objects.requireNonNull(V, str2);
                        String str8 = str2;
                        C3275o9 o9Var = r5;
                        C3275o9 o9Var2 = new C3275o9(str5, str6, str7, j, V);
                        C3210j jVar8 = this.f5650c;
                        m6111F(jVar8);
                        if (jVar8.mo14290E(o9Var)) {
                            m3Var = mo14329d().f5807n;
                            str = "User property triggered";
                            t = next3.f5302g;
                            r = this.f5658k.mo14468u().mo14323r(o9Var.f5821c);
                        } else {
                            m3Var = mo14329d().f5799f;
                            str = "Too many active user properties, ignoring";
                            t = C3269o3.m6253t(next3.f5302g);
                            r = this.f5658k.mo14468u().mo14323r(o9Var.f5821c);
                        }
                        m3Var.mo14417d(str, t, r, o9Var.f5823e);
                        C3309s sVar5 = next3.f5310o;
                        if (sVar5 != null) {
                            arrayList2.add(sVar5);
                        }
                        next3.f5304i = new C3253m9(o9Var);
                        next3.f5306k = true;
                        C3210j jVar9 = this.f5650c;
                        m6111F(jVar9);
                        jVar9.mo14294I(next3);
                        str2 = str8;
                    }
                }
                mo14354T(sVar2, v9Var2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    mo14354T(new C3309s((C3309s) it2.next(), j), v9Var2);
                }
                C3210j jVar10 = this.f5650c;
                m6111F(jVar10);
                jVar10.mo14318y();
            } finally {
                C3210j jVar11 = this.f5650c;
                m6111F(jVar11);
                jVar11.mo14319z();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0739, code lost:
        if (android.text.TextUtils.isEmpty(r3.f6045w) == false) goto L_0x073b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x07e6, code lost:
        if (r10.size() == 0) goto L_0x07e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0362 A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0365 A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03cc A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x056b A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0583 A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x05b0 A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0634 A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x067c A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0689 A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0696 A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x06a4 A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x06b5 A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x06ca A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x06f5 A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0729 A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0748 A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0763 A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x07eb A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0838 A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0885 A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0892 A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x08b8 A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x097a A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0997 A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0a2f A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0ad5 A[Catch:{ SQLiteException -> 0x0af0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0aeb  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0a3c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01a8 A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01bc A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0237 A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x030f A[Catch:{ SQLiteException -> 0x02d2, all -> 0x0b6c }] */
    @androidx.annotation.WorkerThread
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14354T(p005b.p096l.p097a.p113c.p145h.p147b.C3309s r35, p005b.p096l.p097a.p113c.p145h.p147b.C3352v9 r36) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            r3 = r36
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            p005b.p006a.p007a.p024o.C0823f.m382m(r36)
            java.lang.String r8 = r3.f6029g
            p005b.p006a.p007a.p024o.C0823f.m376j(r8)
            long r8 = java.lang.System.nanoTime()
            b.l.a.c.h.b.m4 r10 = r34.mo14331f()
            r10.mo14126h()
            r34.mo14347M()
            java.lang.String r10 = r3.f6029g
            b.l.a.c.h.b.l9 r11 = r1.f5654g
            m6111F(r11)
            boolean r11 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6196K(r35, r36)
            if (r11 != 0) goto L_0x0032
            return
        L_0x0032:
            boolean r11 = r3.f6036n
            if (r11 == 0) goto L_0x0b77
            b.l.a.c.h.b.i4 r11 = r1.f5648a
            m6111F(r11)
            java.lang.String r12 = r2.f5937g
            boolean r11 = r11.mo14271o(r10, r12)
            java.lang.String r15 = "_err"
            r12 = 0
            if (r11 == 0) goto L_0x00ec
            b.l.a.c.h.b.o3 r3 = r34.mo14329d()
            b.l.a.c.h.b.m3 r3 = r3.mo14441p()
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r10)
            b.l.a.c.h.b.p4 r5 = r1.f5658k
            b.l.a.c.h.b.j3 r5 = r5.mo14468u()
            java.lang.String r6 = r2.f5937g
            java.lang.String r5 = r5.mo14321p(r6)
            java.lang.String r6 = "Dropping blacklisted event. appId"
            r3.mo14416c(r6, r4, r5)
            b.l.a.c.h.b.i4 r3 = r1.f5648a
            m6111F(r3)
            boolean r3 = r3.mo14274r(r10)
            if (r3 != 0) goto L_0x00a2
            b.l.a.c.h.b.i4 r3 = r1.f5648a
            m6111F(r3)
            boolean r3 = r3.mo14275s(r10)
            if (r3 == 0) goto L_0x007a
            goto L_0x00a2
        L_0x007a:
            java.lang.String r3 = r2.f5937g
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00eb
            b.l.a.c.h.b.q9 r11 = r34.mo14346L()
            b.l.a.c.h.b.p9 r3 = r1.f5647A
            r14 = 11
            java.lang.String r2 = r2.f5937g
            r17 = 0
            b.l.a.c.h.b.f r4 = r34.mo14341G()
            b.l.a.c.h.b.a3<java.lang.Boolean> r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5419y0
            boolean r18 = r4.mo14197r(r12, r5)
            java.lang.String r15 = "_ev"
            r12 = r3
            r13 = r10
            r16 = r2
            r11.mo14515A(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x00a2:
            b.l.a.c.h.b.j r2 = r1.f5650c
            m6111F(r2)
            b.l.a.c.h.b.a5 r2 = r2.mo14299N(r10)
            if (r2 == 0) goto L_0x00eb
            long r3 = r2.mo14101l()
            long r5 = r2.mo14099j()
            long r3 = java.lang.Math.max(r3, r5)
            b.l.a.c.b.p.b r5 = r34.mo14330e()
            b.l.a.c.b.p.c r5 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r5
            long r5 = r5.mo12289a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r34.mo14341G()
            b.l.a.c.h.b.a3<java.lang.Long> r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5420z
            java.lang.Object r5 = r5.mo14064a(r12)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00eb
            b.l.a.c.h.b.o3 r3 = r34.mo14329d()
            b.l.a.c.h.b.m3 r3 = r3.mo14443r()
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.mo14414a(r4)
            r1.mo14358i(r2)
        L_0x00eb:
            return
        L_0x00ec:
            b.l.a.c.h.b.p3 r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3280p3.m6270a(r35)
            b.l.a.c.h.b.q9 r11 = r34.mo14346L()
            b.l.a.c.h.b.f r12 = r34.mo14341G()
            int r12 = r12.mo14191l(r10)
            r11.mo14554u(r2, r12)
            b.l.a.c.h.b.s r2 = r2.mo14454b()
            b.l.a.c.h.b.o3 r11 = r34.mo14329d()
            java.lang.String r11 = r11.mo14446v()
            r12 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r12)
            if (r11 == 0) goto L_0x016e
            b.l.a.c.h.b.o3 r11 = r34.mo14329d()
            b.l.a.c.h.b.m3 r11 = r11.mo14444s()
            b.l.a.c.h.b.p4 r12 = r1.f5658k
            b.l.a.c.h.b.j3 r12 = r12.mo14468u()
            boolean r13 = r12.mo14320o()
            if (r13 != 0) goto L_0x012b
            java.lang.String r12 = r2.toString()
            goto L_0x0169
        L_0x012b:
            java.lang.String r13 = "origin="
            java.lang.StringBuilder r13 = p005b.p035e.p036a.p037a.C0843a.m460u(r13)
            java.lang.String r14 = r2.f5939i
            r13.append(r14)
            java.lang.String r14 = ",name="
            r13.append(r14)
            java.lang.String r14 = r2.f5937g
            java.lang.String r14 = r12.mo14321p(r14)
            r13.append(r14)
            java.lang.String r14 = ",params="
            r13.append(r14)
            b.l.a.c.h.b.q r14 = r2.f5938h
            if (r14 != 0) goto L_0x014f
            r12 = 0
            goto L_0x0162
        L_0x014f:
            boolean r16 = r12.mo14320o()
            if (r16 != 0) goto L_0x015a
            java.lang.String r12 = r14.toString()
            goto L_0x0162
        L_0x015a:
            android.os.Bundle r14 = r14.mo14488Z()
            java.lang.String r12 = r12.mo14324s(r14)
        L_0x0162:
            r13.append(r12)
            java.lang.String r12 = r13.toString()
        L_0x0169:
            java.lang.String r13 = "Logging event"
            r11.mo14415b(r13, r12)
        L_0x016e:
            b.l.a.c.h.b.j r11 = r1.f5650c
            m6111F(r11)
            r11.mo14317x()
            r1.mo14367r(r3)     // Catch:{ all -> 0x0b6c }
            java.lang.String r11 = "ecommerce_purchase"
            java.lang.String r12 = r2.f5937g     // Catch:{ all -> 0x0b6c }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0b6c }
            java.lang.String r12 = "refund"
            r28 = 1
            if (r11 != 0) goto L_0x019c
            java.lang.String r11 = "purchase"
            java.lang.String r13 = r2.f5937g     // Catch:{ all -> 0x0b6c }
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x0b6c }
            if (r11 != 0) goto L_0x019c
            java.lang.String r11 = r2.f5937g     // Catch:{ all -> 0x0b6c }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0b6c }
            if (r11 == 0) goto L_0x019a
            goto L_0x019c
        L_0x019a:
            r11 = 0
            goto L_0x019e
        L_0x019c:
            r11 = r28
        L_0x019e:
            java.lang.String r13 = "_iap"
            java.lang.String r14 = r2.f5937g     // Catch:{ all -> 0x0b6c }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0b6c }
            if (r13 != 0) goto L_0x01b2
            if (r11 == 0) goto L_0x01ad
            r11 = r28
            goto L_0x01b2
        L_0x01ad:
            r29 = r8
            r8 = r15
            goto L_0x034f
        L_0x01b2:
            b.l.a.c.h.b.q r13 = r2.f5938h     // Catch:{ all -> 0x0b6c }
            java.lang.String r14 = "currency"
            java.lang.String r13 = r13.mo14487Y(r14)     // Catch:{ all -> 0x0b6c }
            if (r11 == 0) goto L_0x0225
            b.l.a.c.h.b.q r11 = r2.f5938h     // Catch:{ all -> 0x0b6c }
            java.lang.Double r11 = r11.mo14486X()     // Catch:{ all -> 0x0b6c }
            double r16 = r11.doubleValue()     // Catch:{ all -> 0x0b6c }
            r18 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r16 = r16 * r18
            r20 = 0
            int r11 = (r16 > r20 ? 1 : (r16 == r20 ? 0 : -1))
            if (r11 != 0) goto L_0x01e3
            b.l.a.c.h.b.q r11 = r2.f5938h     // Catch:{ all -> 0x0b6c }
            java.lang.Long r11 = r11.mo14485W()     // Catch:{ all -> 0x0b6c }
            r20 = r15
            long r14 = r11.longValue()     // Catch:{ all -> 0x0b6c }
            double r14 = (double) r14     // Catch:{ all -> 0x0b6c }
            double r16 = r14 * r18
            goto L_0x01e5
        L_0x01e3:
            r20 = r15
        L_0x01e5:
            r14 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r11 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r11 > 0) goto L_0x01ff
            r14 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r11 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r11 < 0) goto L_0x01ff
            long r14 = java.lang.Math.round(r16)     // Catch:{ all -> 0x0b6c }
            java.lang.String r11 = r2.f5937g     // Catch:{ all -> 0x0b6c }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0b6c }
            if (r11 == 0) goto L_0x0231
            long r14 = -r14
            goto L_0x0231
        L_0x01ff:
            b.l.a.c.h.b.o3 r2 = r34.mo14329d()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.m3 r2 = r2.mo14441p()     // Catch:{ all -> 0x0b6c }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r10)     // Catch:{ all -> 0x0b6c }
            java.lang.Double r5 = java.lang.Double.valueOf(r16)     // Catch:{ all -> 0x0b6c }
            r2.mo14416c(r3, r4, r5)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.j r2 = r1.f5650c     // Catch:{ all -> 0x0b6c }
            m6111F(r2)     // Catch:{ all -> 0x0b6c }
            r2.mo14318y()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.j r2 = r1.f5650c
            m6111F(r2)
            r2.mo14319z()
            return
        L_0x0225:
            r20 = r15
            b.l.a.c.h.b.q r11 = r2.f5938h     // Catch:{ all -> 0x0b6c }
            java.lang.Long r11 = r11.mo14485W()     // Catch:{ all -> 0x0b6c }
            long r14 = r11.longValue()     // Catch:{ all -> 0x0b6c }
        L_0x0231:
            boolean r11 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0b6c }
            if (r11 != 0) goto L_0x034b
            java.util.Locale r11 = java.util.Locale.US     // Catch:{ all -> 0x0b6c }
            java.lang.String r11 = r13.toUpperCase(r11)     // Catch:{ all -> 0x0b6c }
            java.lang.String r12 = "[A-Z]{3}"
            boolean r12 = r11.matches(r12)     // Catch:{ all -> 0x0b6c }
            if (r12 == 0) goto L_0x034b
            java.lang.String r12 = "_ltv_"
            int r13 = r11.length()     // Catch:{ all -> 0x0b6c }
            if (r13 == 0) goto L_0x0253
            java.lang.String r11 = r12.concat(r11)     // Catch:{ all -> 0x0b6c }
        L_0x0251:
            r13 = r11
            goto L_0x0259
        L_0x0253:
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0b6c }
            r11.<init>(r12)     // Catch:{ all -> 0x0b6c }
            goto L_0x0251
        L_0x0259:
            b.l.a.c.h.b.j r11 = r1.f5650c     // Catch:{ all -> 0x0b6c }
            m6111F(r11)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.o9 r11 = r11.mo14291F(r10, r13)     // Catch:{ all -> 0x0b6c }
            if (r11 == 0) goto L_0x0297
            java.lang.Object r11 = r11.f5823e     // Catch:{ all -> 0x0b6c }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0b6c }
            if (r12 != 0) goto L_0x026b
            goto L_0x0297
        L_0x026b:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0b6c }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.o9 r18 = new b.l.a.c.h.b.o9     // Catch:{ all -> 0x0b6c }
            r16 = r13
            java.lang.String r13 = r2.f5939i     // Catch:{ all -> 0x0b6c }
            b.l.a.c.b.p.b r17 = r34.mo14330e()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.b.p.c r17 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r17     // Catch:{ all -> 0x0b6c }
            long r21 = r17.mo12289a()     // Catch:{ all -> 0x0b6c }
            long r11 = r11 + r14
            java.lang.Long r17 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0b6c }
            r11 = r18
            r12 = r10
            r14 = r16
            r29 = r8
            r8 = r20
            r15 = r21
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0b6c }
        L_0x0294:
            r9 = r18
            goto L_0x0304
        L_0x0297:
            r29 = r8
            r16 = r13
            r8 = r20
            b.l.a.c.h.b.j r11 = r1.f5650c     // Catch:{ all -> 0x0b6c }
            m6111F(r11)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.f r12 = r34.mo14341G()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.a3<java.lang.Integer> r13 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5348E     // Catch:{ all -> 0x0b6c }
            int r12 = r12.mo14195p(r10, r13)     // Catch:{ all -> 0x0b6c }
            int r12 = r12 + -1
            p005b.p006a.p007a.p024o.C0823f.m376j(r10)     // Catch:{ all -> 0x0b6c }
            r11.mo14126h()     // Catch:{ all -> 0x0b6c }
            r11.mo14646i()     // Catch:{ all -> 0x0b6c }
            android.database.sqlite.SQLiteDatabase r13 = r11.mo14286A()     // Catch:{ SQLiteException -> 0x02d2 }
            r9 = 3
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x02d2 }
            r17 = 0
            r9[r17] = r10     // Catch:{ SQLiteException -> 0x02d2 }
            r9[r28] = r10     // Catch:{ SQLiteException -> 0x02d2 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteException -> 0x02d2 }
            r17 = 2
            r9[r17] = r12     // Catch:{ SQLiteException -> 0x02d2 }
            java.lang.String r12 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r13.execSQL(r12, r9)     // Catch:{ SQLiteException -> 0x02d2 }
            goto L_0x02e7
        L_0x02d2:
            r0 = move-exception
            r9 = r0
            b.l.a.c.h.b.p4 r11 = r11.f5638a     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.o3 r11 = r11.mo14329d()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.m3 r11 = r11.mo14440o()     // Catch:{ all -> 0x0b6c }
            java.lang.String r12 = "Error pruning currencies. appId"
            java.lang.Object r13 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r10)     // Catch:{ all -> 0x0b6c }
            r11.mo14416c(r12, r13, r9)     // Catch:{ all -> 0x0b6c }
        L_0x02e7:
            b.l.a.c.h.b.o9 r18 = new b.l.a.c.h.b.o9     // Catch:{ all -> 0x0b6c }
            java.lang.String r13 = r2.f5939i     // Catch:{ all -> 0x0b6c }
            b.l.a.c.b.p.b r9 = r34.mo14330e()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.b.p.c r9 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r9     // Catch:{ all -> 0x0b6c }
            long r19 = r9.mo12289a()     // Catch:{ all -> 0x0b6c }
            java.lang.Long r17 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0b6c }
            r11 = r18
            r12 = r10
            r14 = r16
            r15 = r19
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0b6c }
            goto L_0x0294
        L_0x0304:
            b.l.a.c.h.b.j r11 = r1.f5650c     // Catch:{ all -> 0x0b6c }
            m6111F(r11)     // Catch:{ all -> 0x0b6c }
            boolean r11 = r11.mo14290E(r9)     // Catch:{ all -> 0x0b6c }
            if (r11 != 0) goto L_0x034f
            b.l.a.c.h.b.o3 r11 = r34.mo14329d()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.m3 r11 = r11.mo14440o()     // Catch:{ all -> 0x0b6c }
            java.lang.String r12 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r13 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r10)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.p4 r14 = r1.f5658k     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.j3 r14 = r14.mo14468u()     // Catch:{ all -> 0x0b6c }
            java.lang.String r15 = r9.f5821c     // Catch:{ all -> 0x0b6c }
            java.lang.String r14 = r14.mo14323r(r15)     // Catch:{ all -> 0x0b6c }
            java.lang.Object r9 = r9.f5823e     // Catch:{ all -> 0x0b6c }
            r11.mo14417d(r12, r13, r14, r9)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.q9 r11 = r34.mo14346L()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.p9 r12 = r1.f5647A     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.f r9 = r34.mo14341G()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.a3<java.lang.Boolean> r13 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5419y0     // Catch:{ all -> 0x0b6c }
            r14 = 0
            boolean r18 = r9.mo14197r(r14, r13)     // Catch:{ all -> 0x0b6c }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo14515A(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0b6c }
            goto L_0x034f
        L_0x034b:
            r29 = r8
            r8 = r20
        L_0x034f:
            java.lang.String r9 = r2.f5937g     // Catch:{ all -> 0x0b6c }
            boolean r9 = p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.m6345f0(r9)     // Catch:{ all -> 0x0b6c }
            java.lang.String r11 = r2.f5937g     // Catch:{ all -> 0x0b6c }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0b6c }
            r34.mo14346L()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.q r11 = r2.f5938h     // Catch:{ all -> 0x0b6c }
            if (r11 != 0) goto L_0x0365
            r11 = 0
            goto L_0x0394
        L_0x0365:
            android.os.Bundle r12 = r11.f5876g     // Catch:{ all -> 0x0b6c }
            java.util.Set r12 = r12.keySet()     // Catch:{ all -> 0x0b6c }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0b6c }
            r13 = 0
        L_0x0371:
            boolean r15 = r12.hasNext()     // Catch:{ all -> 0x0b6c }
            if (r15 == 0) goto L_0x0393
            java.lang.Object r15 = r12.next()     // Catch:{ all -> 0x0b6c }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0b6c }
            java.lang.Object r15 = r11.mo14484V(r15)     // Catch:{ all -> 0x0b6c }
            r16 = r11
            boolean r11 = r15 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0b6c }
            if (r11 == 0) goto L_0x0390
            android.os.Parcelable[] r15 = (android.os.Parcelable[]) r15     // Catch:{ all -> 0x0b6c }
            int r11 = r15.length     // Catch:{ all -> 0x0b6c }
            r35 = r12
            long r11 = (long) r11     // Catch:{ all -> 0x0b6c }
            long r13 = r13 + r11
            r12 = r35
        L_0x0390:
            r11 = r16
            goto L_0x0371
        L_0x0393:
            r11 = r13
        L_0x0394:
            r22 = 1
            long r15 = r11 + r22
            b.l.a.c.h.b.j r11 = r1.f5650c     // Catch:{ all -> 0x0b6c }
            m6111F(r11)     // Catch:{ all -> 0x0b6c }
            long r12 = r34.mo14350P()     // Catch:{ all -> 0x0b6c }
            r17 = 1
            r19 = 0
            r21 = 0
            r14 = r10
            r18 = r9
            r20 = r8
            b.l.a.c.h.b.h r11 = r11.mo14302Q(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0b6c }
            long r12 = r11.f5568b     // Catch:{ all -> 0x0b6c }
            r34.mo14341G()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.a3<java.lang.Integer> r14 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5390k     // Catch:{ all -> 0x0b6c }
            r15 = 0
            java.lang.Object r14 = r14.mo14064a(r15)     // Catch:{ all -> 0x0b6c }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0b6c }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0b6c }
            long r14 = (long) r14     // Catch:{ all -> 0x0b6c }
            long r12 = r12 - r14
            r14 = 0
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            r15 = 1000(0x3e8, double:4.94E-321)
            if (r14 <= 0) goto L_0x03f9
            long r12 = r12 % r15
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x03e8
            b.l.a.c.h.b.o3 r2 = r34.mo14329d()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.m3 r2 = r2.mo14440o()     // Catch:{ all -> 0x0b6c }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r10)     // Catch:{ all -> 0x0b6c }
            long r5 = r11.f5568b     // Catch:{ all -> 0x0b6c }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0b6c }
            r2.mo14416c(r3, r4, r5)     // Catch:{ all -> 0x0b6c }
        L_0x03e8:
            b.l.a.c.h.b.j r2 = r1.f5650c     // Catch:{ all -> 0x0b6c }
            m6111F(r2)     // Catch:{ all -> 0x0b6c }
            r2.mo14318y()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.j r2 = r1.f5650c
            m6111F(r2)
            r2.mo14319z()
            return
        L_0x03f9:
            if (r9 == 0) goto L_0x0463
            long r12 = r11.f5567a     // Catch:{ all -> 0x0b6c }
            r34.mo14341G()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.a3<java.lang.Integer> r14 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5394m     // Catch:{ all -> 0x0b6c }
            r15 = 0
            java.lang.Object r14 = r14.mo14064a(r15)     // Catch:{ all -> 0x0b6c }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0b6c }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0b6c }
            long r14 = (long) r14     // Catch:{ all -> 0x0b6c }
            long r12 = r12 - r14
            r14 = 0
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 <= 0) goto L_0x0463
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 % r14
            int r3 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x0433
            b.l.a.c.h.b.o3 r3 = r34.mo14329d()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.m3 r3 = r3.mo14440o()     // Catch:{ all -> 0x0b6c }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r10)     // Catch:{ all -> 0x0b6c }
            long r6 = r11.f5567a     // Catch:{ all -> 0x0b6c }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0b6c }
            r3.mo14416c(r4, r5, r6)     // Catch:{ all -> 0x0b6c }
        L_0x0433:
            b.l.a.c.h.b.q9 r11 = r34.mo14346L()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.p9 r12 = r1.f5647A     // Catch:{ all -> 0x0b6c }
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f5937g     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.f r3 = r34.mo14341G()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.a3<java.lang.Boolean> r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5419y0     // Catch:{ all -> 0x0b6c }
            r5 = 0
            boolean r18 = r3.mo14197r(r5, r4)     // Catch:{ all -> 0x0b6c }
            r14 = 16
            r17 = 0
            r13 = r10
            r16 = r2
            r11.mo14515A(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.j r2 = r1.f5650c     // Catch:{ all -> 0x0b6c }
            m6111F(r2)     // Catch:{ all -> 0x0b6c }
            r2.mo14318y()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.j r2 = r1.f5650c
            m6111F(r2)
            r2.mo14319z()
            return
        L_0x0463:
            if (r8 == 0) goto L_0x04b3
            long r12 = r11.f5570d     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.f r8 = r34.mo14341G()     // Catch:{ all -> 0x0b6c }
            java.lang.String r14 = r3.f6029g     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.a3<java.lang.Integer> r15 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5392l     // Catch:{ all -> 0x0b6c }
            int r8 = r8.mo14195p(r14, r15)     // Catch:{ all -> 0x0b6c }
            r14 = 1000000(0xf4240, float:1.401298E-39)
            int r8 = java.lang.Math.min(r14, r8)     // Catch:{ all -> 0x0b6c }
            r14 = 0
            int r8 = java.lang.Math.max(r14, r8)     // Catch:{ all -> 0x0b6c }
            long r14 = (long) r8     // Catch:{ all -> 0x0b6c }
            long r12 = r12 - r14
            r14 = 0
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 <= 0) goto L_0x04b3
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x04a2
            b.l.a.c.h.b.o3 r2 = r34.mo14329d()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.m3 r2 = r2.mo14440o()     // Catch:{ all -> 0x0b6c }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r10)     // Catch:{ all -> 0x0b6c }
            long r5 = r11.f5570d     // Catch:{ all -> 0x0b6c }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0b6c }
            r2.mo14416c(r3, r4, r5)     // Catch:{ all -> 0x0b6c }
        L_0x04a2:
            b.l.a.c.h.b.j r2 = r1.f5650c     // Catch:{ all -> 0x0b6c }
            m6111F(r2)     // Catch:{ all -> 0x0b6c }
            r2.mo14318y()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.j r2 = r1.f5650c
            m6111F(r2)
            r2.mo14319z()
            return
        L_0x04b3:
            b.l.a.c.h.b.q r8 = r2.f5938h     // Catch:{ all -> 0x0b6c }
            android.os.Bundle r8 = r8.mo14488Z()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.q9 r11 = r34.mo14346L()     // Catch:{ all -> 0x0b6c }
            java.lang.String r12 = "_o"
            java.lang.String r13 = r2.f5939i     // Catch:{ all -> 0x0b6c }
            r11.mo14559z(r8, r12, r13)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.q9 r11 = r34.mo14346L()     // Catch:{ all -> 0x0b6c }
            boolean r11 = r11.mo14517H(r10)     // Catch:{ all -> 0x0b6c }
            java.lang.String r15 = "_r"
            if (r11 == 0) goto L_0x04e4
            b.l.a.c.h.b.q9 r11 = r34.mo14346L()     // Catch:{ all -> 0x0b6c }
            java.lang.Long r12 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0b6c }
            java.lang.String r13 = "_dbg"
            r11.mo14559z(r8, r13, r12)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.q9 r11 = r34.mo14346L()     // Catch:{ all -> 0x0b6c }
            r11.mo14559z(r8, r15, r12)     // Catch:{ all -> 0x0b6c }
        L_0x04e4:
            java.lang.String r11 = "_s"
            java.lang.String r12 = r2.f5937g     // Catch:{ all -> 0x0b6c }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0b6c }
            if (r11 == 0) goto L_0x050a
            b.l.a.c.h.b.j r11 = r1.f5650c     // Catch:{ all -> 0x0b6c }
            m6111F(r11)     // Catch:{ all -> 0x0b6c }
            java.lang.String r12 = r3.f6029g     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.o9 r11 = r11.mo14291F(r12, r7)     // Catch:{ all -> 0x0b6c }
            if (r11 == 0) goto L_0x050a
            java.lang.Object r12 = r11.f5823e     // Catch:{ all -> 0x0b6c }
            boolean r12 = r12 instanceof java.lang.Long     // Catch:{ all -> 0x0b6c }
            if (r12 == 0) goto L_0x050a
            b.l.a.c.h.b.q9 r12 = r34.mo14346L()     // Catch:{ all -> 0x0b6c }
            java.lang.Object r11 = r11.f5823e     // Catch:{ all -> 0x0b6c }
            r12.mo14559z(r8, r7, r11)     // Catch:{ all -> 0x0b6c }
        L_0x050a:
            b.l.a.c.h.b.j r7 = r1.f5650c     // Catch:{ all -> 0x0b6c }
            m6111F(r7)     // Catch:{ all -> 0x0b6c }
            p005b.p006a.p007a.p024o.C0823f.m376j(r10)     // Catch:{ all -> 0x0b6c }
            r7.mo14126h()     // Catch:{ all -> 0x0b6c }
            r7.mo14646i()     // Catch:{ all -> 0x0b6c }
            android.database.sqlite.SQLiteDatabase r11 = r7.mo14286A()     // Catch:{ SQLiteException -> 0x054c }
            b.l.a.c.h.b.p4 r12 = r7.f5638a     // Catch:{ SQLiteException -> 0x054c }
            b.l.a.c.h.b.f r12 = r12.mo14463p()     // Catch:{ SQLiteException -> 0x054c }
            b.l.a.c.h.b.a3<java.lang.Integer> r13 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5400p     // Catch:{ SQLiteException -> 0x054c }
            int r12 = r12.mo14195p(r10, r13)     // Catch:{ SQLiteException -> 0x054c }
            r13 = 1000000(0xf4240, float:1.401298E-39)
            int r12 = java.lang.Math.min(r13, r12)     // Catch:{ SQLiteException -> 0x054c }
            r13 = 0
            int r12 = java.lang.Math.max(r13, r12)     // Catch:{ SQLiteException -> 0x0549 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteException -> 0x0549 }
            r14 = 2
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x0549 }
            r14[r13] = r10     // Catch:{ SQLiteException -> 0x0549 }
            r14[r28] = r12     // Catch:{ SQLiteException -> 0x0549 }
            java.lang.String r12 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            int r7 = r11.delete(r6, r12, r14)     // Catch:{ SQLiteException -> 0x0549 }
            long r11 = (long) r7
            r16 = 0
            goto L_0x0566
        L_0x0549:
            r0 = move-exception
            r11 = r0
            goto L_0x054f
        L_0x054c:
            r0 = move-exception
            r11 = r0
            r13 = 0
        L_0x054f:
            b.l.a.c.h.b.p4 r7 = r7.f5638a     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.o3 r7 = r7.mo14329d()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.m3 r7 = r7.mo14440o()     // Catch:{ all -> 0x0b6c }
            java.lang.String r12 = "Error deleting over the limit events. appId"
            java.lang.Object r14 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r10)     // Catch:{ all -> 0x0b6c }
            r7.mo14416c(r12, r14, r11)     // Catch:{ all -> 0x0b6c }
            r16 = 0
            r11 = 0
        L_0x0566:
            r7 = r13
            int r13 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r13 <= 0) goto L_0x0583
            b.l.a.c.h.b.o3 r13 = r34.mo14329d()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.m3 r13 = r13.mo14441p()     // Catch:{ all -> 0x0b6c }
            java.lang.String r14 = "Data lost. Too many events stored on disk, deleted. appId"
            r35 = r7
            java.lang.Object r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r10)     // Catch:{ all -> 0x0b6c }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0b6c }
            r13.mo14416c(r14, r7, r11)     // Catch:{ all -> 0x0b6c }
            goto L_0x0585
        L_0x0583:
            r35 = r7
        L_0x0585:
            b.l.a.c.h.b.n r7 = new b.l.a.c.h.b.n     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.p4 r12 = r1.f5658k     // Catch:{ all -> 0x0b6c }
            java.lang.String r13 = r2.f5939i     // Catch:{ all -> 0x0b6c }
            java.lang.String r14 = r2.f5937g     // Catch:{ all -> 0x0b6c }
            r31 = r4
            r32 = r5
            long r4 = r2.f5940j     // Catch:{ all -> 0x0b6c }
            r18 = 0
            r11 = r7
            r2 = r14
            r14 = r10
            r33 = r6
            r6 = r15
            r15 = r2
            r16 = r4
            r20 = r8
            r11.<init>((p005b.p096l.p097a.p113c.p145h.p147b.C3281p4) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (long) r16, (long) r18, (android.os.Bundle) r20)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.j r2 = r1.f5650c     // Catch:{ all -> 0x0b6c }
            m6111F(r2)     // Catch:{ all -> 0x0b6c }
            java.lang.String r4 = r7.f5758b     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.o r2 = r2.mo14287B(r10, r4)     // Catch:{ all -> 0x0b6c }
            if (r2 != 0) goto L_0x0634
            b.l.a.c.h.b.j r2 = r1.f5650c     // Catch:{ all -> 0x0b6c }
            m6111F(r2)     // Catch:{ all -> 0x0b6c }
            long r4 = r2.mo14310p(r10)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.f r2 = r34.mo14341G()     // Catch:{ all -> 0x0b6c }
            int r2 = r2.mo14192m(r10)     // Catch:{ all -> 0x0b6c }
            long r11 = (long) r2     // Catch:{ all -> 0x0b6c }
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 < 0) goto L_0x0616
            if (r9 == 0) goto L_0x0616
            b.l.a.c.h.b.o3 r2 = r34.mo14329d()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.m3 r2 = r2.mo14440o()     // Catch:{ all -> 0x0b6c }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r10)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.p4 r5 = r1.f5658k     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.j3 r5 = r5.mo14468u()     // Catch:{ all -> 0x0b6c }
            java.lang.String r6 = r7.f5758b     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = r5.mo14321p(r6)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.f r6 = r34.mo14341G()     // Catch:{ all -> 0x0b6c }
            int r6 = r6.mo14192m(r10)     // Catch:{ all -> 0x0b6c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0b6c }
            r2.mo14417d(r3, r4, r5, r6)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.q9 r11 = r34.mo14346L()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.p9 r12 = r1.f5647A     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.f r2 = r34.mo14341G()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.a3<java.lang.Boolean> r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5419y0     // Catch:{ all -> 0x0b6c }
            r4 = 0
            boolean r18 = r2.mo14197r(r4, r3)     // Catch:{ all -> 0x0b6c }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo14515A(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.j r2 = r1.f5650c
            m6111F(r2)
            r2.mo14319z()
            return
        L_0x0616:
            b.l.a.c.h.b.o r2 = new b.l.a.c.h.b.o     // Catch:{ all -> 0x0b6c }
            java.lang.String r13 = r7.f5758b     // Catch:{ all -> 0x0b6c }
            long r4 = r7.f5760d     // Catch:{ all -> 0x0b6c }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r2
            r12 = r10
            r20 = r4
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0b6c }
            goto L_0x0642
        L_0x0634:
            b.l.a.c.h.b.p4 r4 = r1.f5658k     // Catch:{ all -> 0x0b6c }
            long r8 = r2.f5787f     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.n r7 = r7.mo14430a(r4, r8)     // Catch:{ all -> 0x0b6c }
            long r4 = r7.f5760d     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.o r2 = r2.mo14437a(r4)     // Catch:{ all -> 0x0b6c }
        L_0x0642:
            b.l.a.c.h.b.j r4 = r1.f5650c     // Catch:{ all -> 0x0b6c }
            m6111F(r4)     // Catch:{ all -> 0x0b6c }
            r4.mo14288C(r2)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.m4 r2 = r34.mo14331f()     // Catch:{ all -> 0x0b6c }
            r2.mo14126h()     // Catch:{ all -> 0x0b6c }
            r34.mo14347M()     // Catch:{ all -> 0x0b6c }
            p005b.p006a.p007a.p024o.C0823f.m382m(r7)     // Catch:{ all -> 0x0b6c }
            p005b.p006a.p007a.p024o.C0823f.m382m(r36)     // Catch:{ all -> 0x0b6c }
            java.lang.String r2 = r7.f5757a     // Catch:{ all -> 0x0b6c }
            p005b.p006a.p007a.p024o.C0823f.m376j(r2)     // Catch:{ all -> 0x0b6c }
            java.lang.String r2 = r7.f5757a     // Catch:{ all -> 0x0b6c }
            java.lang.String r4 = r3.f6029g     // Catch:{ all -> 0x0b6c }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0b6c }
            p005b.p006a.p007a.p024o.C0823f.m360b(r2)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.e.i.w1 r2 = p005b.p096l.p097a.p113c.p131e.p140i.C3012x1.m5557C0()     // Catch:{ all -> 0x0b6c }
            r2.mo13842N()     // Catch:{ all -> 0x0b6c }
            r2.mo13867m()     // Catch:{ all -> 0x0b6c }
            java.lang.String r4 = r3.f6029g     // Catch:{ all -> 0x0b6c }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0b6c }
            if (r4 != 0) goto L_0x0681
            java.lang.String r4 = r3.f6029g     // Catch:{ all -> 0x0b6c }
            r2.mo13881t(r4)     // Catch:{ all -> 0x0b6c }
        L_0x0681:
            java.lang.String r4 = r3.f6032j     // Catch:{ all -> 0x0b6c }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0b6c }
            if (r4 != 0) goto L_0x068e
            java.lang.String r4 = r3.f6032j     // Catch:{ all -> 0x0b6c }
            r2.mo13877r(r4)     // Catch:{ all -> 0x0b6c }
        L_0x068e:
            java.lang.String r4 = r3.f6031i     // Catch:{ all -> 0x0b6c }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0b6c }
            if (r4 != 0) goto L_0x069b
            java.lang.String r4 = r3.f6031i     // Catch:{ all -> 0x0b6c }
            r2.mo13883u(r4)     // Catch:{ all -> 0x0b6c }
        L_0x069b:
            long r4 = r3.f6038p     // Catch:{ all -> 0x0b6c }
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x06a8
            int r4 = (int) r4     // Catch:{ all -> 0x0b6c }
            r2.mo13844P(r4)     // Catch:{ all -> 0x0b6c }
        L_0x06a8:
            long r4 = r3.f6033k     // Catch:{ all -> 0x0b6c }
            r2.mo13885v(r4)     // Catch:{ all -> 0x0b6c }
            java.lang.String r4 = r3.f6030h     // Catch:{ all -> 0x0b6c }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0b6c }
            if (r4 != 0) goto L_0x06ba
            java.lang.String r4 = r3.f6030h     // Catch:{ all -> 0x0b6c }
            r2.mo13838J(r4)     // Catch:{ all -> 0x0b6c }
        L_0x06ba:
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.f r4 = r34.mo14341G()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.a3<java.lang.Boolean> r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5415w0     // Catch:{ all -> 0x0b6c }
            r8 = 0
            boolean r4 = r4.mo14197r(r8, r5)     // Catch:{ all -> 0x0b6c }
            if (r4 == 0) goto L_0x06e4
            java.lang.String r4 = r3.f6029g     // Catch:{ all -> 0x0b6c }
            p005b.p006a.p007a.p024o.C0823f.m382m(r4)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.g r4 = r1.mo14349O(r4)     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = r3.f6028B     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.g r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3177g.m5991b(r5)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.g r4 = r4.mo14237h(r5)     // Catch:{ all -> 0x0b6c }
            java.lang.String r4 = r4.mo14232c()     // Catch:{ all -> 0x0b6c }
            r2.mo13857c0(r4)     // Catch:{ all -> 0x0b6c }
        L_0x06e4:
            p005b.p096l.p097a.p113c.p131e.p140i.C3007w9.m5549b()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.f r4 = r34.mo14341G()     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = r3.f6029g     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.a3<java.lang.Boolean> r8 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5385h0     // Catch:{ all -> 0x0b6c }
            boolean r4 = r4.mo14197r(r5, r8)     // Catch:{ all -> 0x0b6c }
            if (r4 == 0) goto L_0x0729
            java.lang.String r4 = r2.mo13837I()     // Catch:{ all -> 0x0b6c }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0b6c }
            if (r4 == 0) goto L_0x070c
            java.lang.String r4 = r3.f6027A     // Catch:{ all -> 0x0b6c }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0b6c }
            if (r4 != 0) goto L_0x070c
            java.lang.String r4 = r3.f6027A     // Catch:{ all -> 0x0b6c }
            r2.mo13856b0(r4)     // Catch:{ all -> 0x0b6c }
        L_0x070c:
            java.lang.String r4 = r2.mo13837I()     // Catch:{ all -> 0x0b6c }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0b6c }
            if (r4 == 0) goto L_0x0740
            java.lang.String r4 = r2.mo13855a0()     // Catch:{ all -> 0x0b6c }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0b6c }
            if (r4 == 0) goto L_0x0740
            java.lang.String r4 = r3.f6045w     // Catch:{ all -> 0x0b6c }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0b6c }
            if (r4 != 0) goto L_0x0740
            goto L_0x073b
        L_0x0729:
            java.lang.String r4 = r2.mo13837I()     // Catch:{ all -> 0x0b6c }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0b6c }
            if (r4 == 0) goto L_0x0740
            java.lang.String r4 = r3.f6045w     // Catch:{ all -> 0x0b6c }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0b6c }
            if (r4 != 0) goto L_0x0740
        L_0x073b:
            java.lang.String r4 = r3.f6045w     // Catch:{ all -> 0x0b6c }
            r2.mo13851W(r4)     // Catch:{ all -> 0x0b6c }
        L_0x0740:
            long r4 = r3.f6034l     // Catch:{ all -> 0x0b6c }
            r8 = 0
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x074b
            r2.mo13833D(r4)     // Catch:{ all -> 0x0b6c }
        L_0x074b:
            long r4 = r3.f6047y     // Catch:{ all -> 0x0b6c }
            r2.mo13853Y(r4)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.l9 r4 = r1.f5654g     // Catch:{ all -> 0x0b6c }
            m6111F(r4)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.j9 r5 = r4.f6128b     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.p4 r5 = r5.f5658k     // Catch:{ all -> 0x0b6c }
            android.content.Context r5 = r5.mo14328c()     // Catch:{ all -> 0x0b6c }
            java.util.Map r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.m5876a(r5)     // Catch:{ all -> 0x0b6c }
            if (r5 == 0) goto L_0x07e8
            int r10 = r5.size()     // Catch:{ all -> 0x0b6c }
            if (r10 != 0) goto L_0x076b
            goto L_0x07e8
        L_0x076b:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0b6c }
            r10.<init>()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.a3<java.lang.Integer> r11 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5359P     // Catch:{ all -> 0x0b6c }
            r12 = 0
            java.lang.Object r11 = r11.mo14064a(r12)     // Catch:{ all -> 0x0b6c }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ all -> 0x0b6c }
            int r11 = r11.intValue()     // Catch:{ all -> 0x0b6c }
            java.util.Set r5 = r5.entrySet()     // Catch:{ all -> 0x0b6c }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0b6c }
        L_0x0785:
            boolean r12 = r5.hasNext()     // Catch:{ all -> 0x0b6c }
            if (r12 == 0) goto L_0x07e2
            java.lang.Object r12 = r5.next()     // Catch:{ all -> 0x0b6c }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ all -> 0x0b6c }
            java.lang.Object r13 = r12.getKey()     // Catch:{ all -> 0x0b6c }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0b6c }
            java.lang.String r14 = "measurement.id."
            boolean r13 = r13.startsWith(r14)     // Catch:{ all -> 0x0b6c }
            if (r13 == 0) goto L_0x0785
            java.lang.Object r12 = r12.getValue()     // Catch:{ NumberFormatException -> 0x07d0 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ NumberFormatException -> 0x07d0 }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x07d0 }
            if (r12 == 0) goto L_0x0785
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x07d0 }
            r10.add(r12)     // Catch:{ NumberFormatException -> 0x07d0 }
            int r12 = r10.size()     // Catch:{ NumberFormatException -> 0x07d0 }
            if (r12 < r11) goto L_0x0785
            b.l.a.c.h.b.p4 r12 = r4.f5638a     // Catch:{ NumberFormatException -> 0x07d0 }
            b.l.a.c.h.b.o3 r12 = r12.mo14329d()     // Catch:{ NumberFormatException -> 0x07d0 }
            b.l.a.c.h.b.m3 r12 = r12.mo14441p()     // Catch:{ NumberFormatException -> 0x07d0 }
            java.lang.String r13 = "Too many experiment IDs. Number of IDs"
            int r14 = r10.size()     // Catch:{ NumberFormatException -> 0x07d0 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ NumberFormatException -> 0x07d0 }
            r12.mo14415b(r13, r14)     // Catch:{ NumberFormatException -> 0x07d0 }
            goto L_0x07e2
        L_0x07d0:
            r0 = move-exception
            r12 = r0
            b.l.a.c.h.b.p4 r13 = r4.f5638a     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.o3 r13 = r13.mo14329d()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.m3 r13 = r13.mo14441p()     // Catch:{ all -> 0x0b6c }
            java.lang.String r14 = "Experiment ID NumberFormatException"
            r13.mo14415b(r14, r12)     // Catch:{ all -> 0x0b6c }
            goto L_0x0785
        L_0x07e2:
            int r4 = r10.size()     // Catch:{ all -> 0x0b6c }
            if (r4 != 0) goto L_0x07e9
        L_0x07e8:
            r10 = 0
        L_0x07e9:
            if (r10 == 0) goto L_0x07ee
            r2.mo13852X(r10)     // Catch:{ all -> 0x0b6c }
        L_0x07ee:
            java.lang.String r4 = r3.f6029g     // Catch:{ all -> 0x0b6c }
            p005b.p006a.p007a.p024o.C0823f.m382m(r4)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.g r4 = r1.mo14349O(r4)     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = r3.f6028B     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.g r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3177g.m5991b(r5)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.g r4 = r4.mo14237h(r5)     // Catch:{ all -> 0x0b6c }
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.f r5 = r34.mo14341G()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.a3<java.lang.Boolean> r10 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5415w0     // Catch:{ all -> 0x0b6c }
            r11 = 0
            boolean r5 = r5.mo14197r(r11, r10)     // Catch:{ all -> 0x0b6c }
            if (r5 == 0) goto L_0x0817
            boolean r5 = r4.mo14233d()     // Catch:{ all -> 0x0b6c }
            if (r5 == 0) goto L_0x0841
        L_0x0817:
            b.l.a.c.h.b.g8 r5 = r1.f5656i     // Catch:{ all -> 0x0b6c }
            java.lang.String r11 = r3.f6029g     // Catch:{ all -> 0x0b6c }
            android.util.Pair r5 = r5.mo14246l(r11, r4)     // Catch:{ all -> 0x0b6c }
            java.lang.Object r11 = r5.first     // Catch:{ all -> 0x0b6c }
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch:{ all -> 0x0b6c }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0b6c }
            if (r11 != 0) goto L_0x0841
            boolean r11 = r3.f6043u     // Catch:{ all -> 0x0b6c }
            if (r11 == 0) goto L_0x0841
            java.lang.Object r11 = r5.first     // Catch:{ all -> 0x0b6c }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0b6c }
            r2.mo13889x(r11)     // Catch:{ all -> 0x0b6c }
            java.lang.Object r5 = r5.second     // Catch:{ all -> 0x0b6c }
            if (r5 == 0) goto L_0x0841
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0b6c }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0b6c }
            r2.mo13893z(r5)     // Catch:{ all -> 0x0b6c }
        L_0x0841:
            b.l.a.c.h.b.p4 r5 = r1.f5658k     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.m r5 = r5.mo14456A()     // Catch:{ all -> 0x0b6c }
            r5.mo14377l()     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ all -> 0x0b6c }
            r2.mo13871o(r5)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.p4 r5 = r1.f5658k     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.m r5 = r5.mo14456A()     // Catch:{ all -> 0x0b6c }
            r5.mo14377l()     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0b6c }
            r2.mo13869n(r5)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.p4 r5 = r1.f5658k     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.m r5 = r5.mo14456A()     // Catch:{ all -> 0x0b6c }
            long r11 = r5.mo14410o()     // Catch:{ all -> 0x0b6c }
            int r5 = (int) r11     // Catch:{ all -> 0x0b6c }
            r2.mo13875q(r5)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.p4 r5 = r1.f5658k     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.m r5 = r5.mo14456A()     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = r5.mo14411p()     // Catch:{ all -> 0x0b6c }
            r2.mo13873p(r5)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.f r5 = r34.mo14341G()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.a3<java.lang.Boolean> r11 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5409t0     // Catch:{ all -> 0x0b6c }
            r12 = 0
            boolean r5 = r5.mo14197r(r12, r11)     // Catch:{ all -> 0x0b6c }
            if (r5 != 0) goto L_0x088a
            long r12 = r3.f6040r     // Catch:{ all -> 0x0b6c }
            r2.mo13847S(r12)     // Catch:{ all -> 0x0b6c }
        L_0x088a:
            b.l.a.c.h.b.p4 r5 = r1.f5658k     // Catch:{ all -> 0x0b6c }
            boolean r5 = r5.mo14460j()     // Catch:{ all -> 0x0b6c }
            if (r5 == 0) goto L_0x08ab
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.f r5 = r34.mo14341G()     // Catch:{ all -> 0x0b6c }
            r12 = 0
            r5.mo14197r(r12, r10)     // Catch:{ all -> 0x0b6c }
            r2.mo13879s()     // Catch:{ all -> 0x0b6c }
            boolean r5 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0b6c }
            if (r5 == 0) goto L_0x08a7
            goto L_0x08ab
        L_0x08a7:
            r2.mo13848T()     // Catch:{ all -> 0x0b6c }
            throw r12
        L_0x08ab:
            b.l.a.c.h.b.j r5 = r1.f5650c     // Catch:{ all -> 0x0b6c }
            m6111F(r5)     // Catch:{ all -> 0x0b6c }
            java.lang.String r12 = r3.f6029g     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.a5 r5 = r5.mo14299N(r12)     // Catch:{ all -> 0x0b6c }
            if (r5 != 0) goto L_0x0948
            b.l.a.c.h.b.a5 r5 = new b.l.a.c.h.b.a5     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.p4 r12 = r1.f5658k     // Catch:{ all -> 0x0b6c }
            java.lang.String r13 = r3.f6029g     // Catch:{ all -> 0x0b6c }
            r5.<init>(r12, r13)     // Catch:{ all -> 0x0b6c }
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.f r12 = r34.mo14341G()     // Catch:{ all -> 0x0b6c }
            r13 = 0
            boolean r12 = r12.mo14197r(r13, r10)     // Catch:{ all -> 0x0b6c }
            if (r12 == 0) goto L_0x08d4
            java.lang.String r12 = r1.mo14355b(r4)     // Catch:{ all -> 0x0b6c }
            goto L_0x08d8
        L_0x08d4:
            java.lang.String r12 = r34.mo14356g()     // Catch:{ all -> 0x0b6c }
        L_0x08d8:
            r5.mo14068A(r12)     // Catch:{ all -> 0x0b6c }
            java.lang.String r12 = r3.f6039q     // Catch:{ all -> 0x0b6c }
            r5.mo14078K(r12)     // Catch:{ all -> 0x0b6c }
            java.lang.String r12 = r3.f6030h     // Catch:{ all -> 0x0b6c }
            r5.mo14070C(r12)     // Catch:{ all -> 0x0b6c }
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.f r12 = r34.mo14341G()     // Catch:{ all -> 0x0b6c }
            r13 = 0
            boolean r12 = r12.mo14197r(r13, r10)     // Catch:{ all -> 0x0b6c }
            if (r12 == 0) goto L_0x08f9
            boolean r12 = r4.mo14233d()     // Catch:{ all -> 0x0b6c }
            if (r12 == 0) goto L_0x0904
        L_0x08f9:
            b.l.a.c.h.b.g8 r12 = r1.f5656i     // Catch:{ all -> 0x0b6c }
            java.lang.String r13 = r3.f6029g     // Catch:{ all -> 0x0b6c }
            java.lang.String r12 = r12.mo14248n(r13)     // Catch:{ all -> 0x0b6c }
            r5.mo14076I(r12)     // Catch:{ all -> 0x0b6c }
        L_0x0904:
            r5.mo14097h(r8)     // Catch:{ all -> 0x0b6c }
            r5.mo14080M(r8)     // Catch:{ all -> 0x0b6c }
            r5.mo14082O(r8)     // Catch:{ all -> 0x0b6c }
            java.lang.String r8 = r3.f6031i     // Catch:{ all -> 0x0b6c }
            r5.mo14084Q(r8)     // Catch:{ all -> 0x0b6c }
            long r8 = r3.f6038p     // Catch:{ all -> 0x0b6c }
            r5.mo14086S(r8)     // Catch:{ all -> 0x0b6c }
            java.lang.String r8 = r3.f6032j     // Catch:{ all -> 0x0b6c }
            r5.mo14088U(r8)     // Catch:{ all -> 0x0b6c }
            long r8 = r3.f6033k     // Catch:{ all -> 0x0b6c }
            r5.mo14090a(r8)     // Catch:{ all -> 0x0b6c }
            long r8 = r3.f6034l     // Catch:{ all -> 0x0b6c }
            r5.mo14092c(r8)     // Catch:{ all -> 0x0b6c }
            boolean r8 = r3.f6036n     // Catch:{ all -> 0x0b6c }
            r5.mo14096g(r8)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.f r8 = r34.mo14341G()     // Catch:{ all -> 0x0b6c }
            r9 = 0
            boolean r8 = r8.mo14197r(r9, r11)     // Catch:{ all -> 0x0b6c }
            if (r8 != 0) goto L_0x093b
            long r8 = r3.f6040r     // Catch:{ all -> 0x0b6c }
            r5.mo14107r(r8)     // Catch:{ all -> 0x0b6c }
        L_0x093b:
            long r8 = r3.f6047y     // Catch:{ all -> 0x0b6c }
            r5.mo14094e(r8)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.j r8 = r1.f5650c     // Catch:{ all -> 0x0b6c }
            m6111F(r8)     // Catch:{ all -> 0x0b6c }
            r8.mo14300O(r5)     // Catch:{ all -> 0x0b6c }
        L_0x0948:
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.f r8 = r34.mo14341G()     // Catch:{ all -> 0x0b6c }
            r9 = 0
            boolean r8 = r8.mo14197r(r9, r10)     // Catch:{ all -> 0x0b6c }
            if (r8 == 0) goto L_0x095c
            boolean r4 = r4.mo14234e()     // Catch:{ all -> 0x0b6c }
            if (r4 == 0) goto L_0x0970
        L_0x095c:
            java.lang.String r4 = r5.mo14115z()     // Catch:{ all -> 0x0b6c }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0b6c }
            if (r4 != 0) goto L_0x0970
            java.lang.String r4 = r5.mo14115z()     // Catch:{ all -> 0x0b6c }
            p005b.p006a.p007a.p024o.C0823f.m382m(r4)     // Catch:{ all -> 0x0b6c }
            r2.mo13831B(r4)     // Catch:{ all -> 0x0b6c }
        L_0x0970:
            java.lang.String r4 = r5.mo14077J()     // Catch:{ all -> 0x0b6c }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0b6c }
            if (r4 != 0) goto L_0x0984
            java.lang.String r4 = r5.mo14077J()     // Catch:{ all -> 0x0b6c }
            p005b.p006a.p007a.p024o.C0823f.m382m(r4)     // Catch:{ all -> 0x0b6c }
            r2.mo13843O(r4)     // Catch:{ all -> 0x0b6c }
        L_0x0984:
            b.l.a.c.h.b.j r4 = r1.f5650c     // Catch:{ all -> 0x0b6c }
            m6111F(r4)     // Catch:{ all -> 0x0b6c }
            java.lang.String r3 = r3.f6029g     // Catch:{ all -> 0x0b6c }
            java.util.List r3 = r4.mo14292G(r3)     // Catch:{ all -> 0x0b6c }
            r4 = r35
        L_0x0991:
            int r5 = r3.size()     // Catch:{ all -> 0x0b6c }
            if (r4 >= r5) goto L_0x09c7
            b.l.a.c.e.i.g2 r5 = p005b.p096l.p097a.p113c.p131e.p140i.C2805h2.m4786B()     // Catch:{ all -> 0x0b6c }
            java.lang.Object r8 = r3.get(r4)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.o9 r8 = (p005b.p096l.p097a.p113c.p145h.p147b.C3275o9) r8     // Catch:{ all -> 0x0b6c }
            java.lang.String r8 = r8.f5821c     // Catch:{ all -> 0x0b6c }
            r5.mo13340n(r8)     // Catch:{ all -> 0x0b6c }
            java.lang.Object r8 = r3.get(r4)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.o9 r8 = (p005b.p096l.p097a.p113c.p145h.p147b.C3275o9) r8     // Catch:{ all -> 0x0b6c }
            long r8 = r8.f5822d     // Catch:{ all -> 0x0b6c }
            r5.mo13339m(r8)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.l9 r8 = r1.f5654g     // Catch:{ all -> 0x0b6c }
            m6111F(r8)     // Catch:{ all -> 0x0b6c }
            java.lang.Object r9 = r3.get(r4)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.o9 r9 = (p005b.p096l.p097a.p113c.p145h.p147b.C3275o9) r9     // Catch:{ all -> 0x0b6c }
            java.lang.Object r9 = r9.f5823e     // Catch:{ all -> 0x0b6c }
            r8.mo14404t(r5, r9)     // Catch:{ all -> 0x0b6c }
            r2.mo13876q0(r5)     // Catch:{ all -> 0x0b6c }
            int r4 = r4 + 1
            goto L_0x0991
        L_0x09c7:
            b.l.a.c.h.b.j r3 = r1.f5650c     // Catch:{ IOException -> 0x0b22 }
            m6111F(r3)     // Catch:{ IOException -> 0x0b22 }
            b.l.a.c.e.i.o5 r4 = r2.mo13484g()     // Catch:{ IOException -> 0x0b22 }
            b.l.a.c.e.i.x1 r4 = (p005b.p096l.p097a.p113c.p131e.p140i.C3012x1) r4     // Catch:{ IOException -> 0x0b22 }
            r3.mo14126h()     // Catch:{ IOException -> 0x0b22 }
            r3.mo14646i()     // Catch:{ IOException -> 0x0b22 }
            p005b.p006a.p007a.p024o.C0823f.m382m(r4)     // Catch:{ IOException -> 0x0b22 }
            java.lang.String r5 = r4.mo13939s()     // Catch:{ IOException -> 0x0b22 }
            p005b.p006a.p007a.p024o.C0823f.m376j(r5)     // Catch:{ IOException -> 0x0b22 }
            byte[] r5 = r4.mo13371e()     // Catch:{ IOException -> 0x0b22 }
            b.l.a.c.h.b.j9 r8 = r3.f6128b     // Catch:{ IOException -> 0x0b22 }
            b.l.a.c.h.b.l9 r8 = r8.f5654g     // Catch:{ IOException -> 0x0b22 }
            m6111F(r8)     // Catch:{ IOException -> 0x0b22 }
            long r8 = r8.mo14400E(r5)     // Catch:{ IOException -> 0x0b22 }
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ IOException -> 0x0b22 }
            r10.<init>()     // Catch:{ IOException -> 0x0b22 }
            java.lang.String r11 = r4.mo13939s()     // Catch:{ IOException -> 0x0b22 }
            r12 = r32
            r10.put(r12, r11)     // Catch:{ IOException -> 0x0b22 }
            java.lang.Long r11 = java.lang.Long.valueOf(r8)     // Catch:{ IOException -> 0x0b22 }
            r13 = r31
            r10.put(r13, r11)     // Catch:{ IOException -> 0x0b22 }
            java.lang.String r11 = "metadata"
            r10.put(r11, r5)     // Catch:{ IOException -> 0x0b22 }
            android.database.sqlite.SQLiteDatabase r5 = r3.mo14286A()     // Catch:{ SQLiteException -> 0x0b08 }
            java.lang.String r11 = "raw_events_metadata"
            r14 = 4
            r15 = 0
            r5.insertWithOnConflict(r11, r15, r10, r14)     // Catch:{ SQLiteException -> 0x0b08 }
            b.l.a.c.h.b.j r2 = r1.f5650c     // Catch:{ all -> 0x0b6c }
            m6111F(r2)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.q r3 = r7.f5762f     // Catch:{ all -> 0x0b6c }
            android.os.Bundle r3 = r3.f5876g     // Catch:{ all -> 0x0b6c }
            java.util.Set r3 = r3.keySet()     // Catch:{ all -> 0x0b6c }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0b6c }
        L_0x0a29:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0b6c }
            if (r4 == 0) goto L_0x0a3c
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0b6c }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0b6c }
            boolean r4 = r6.equals(r4)     // Catch:{ all -> 0x0b6c }
            if (r4 == 0) goto L_0x0a29
            goto L_0x0a76
        L_0x0a3c:
            b.l.a.c.h.b.i4 r3 = r1.f5648a     // Catch:{ all -> 0x0b6c }
            m6111F(r3)     // Catch:{ all -> 0x0b6c }
            java.lang.String r4 = r7.f5757a     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = r7.f5758b     // Catch:{ all -> 0x0b6c }
            boolean r3 = r3.mo14272p(r4, r5)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.j r14 = r1.f5650c     // Catch:{ all -> 0x0b6c }
            m6111F(r14)     // Catch:{ all -> 0x0b6c }
            long r15 = r34.mo14350P()     // Catch:{ all -> 0x0b6c }
            java.lang.String r4 = r7.f5757a     // Catch:{ all -> 0x0b6c }
            r18 = 0
            r19 = 0
            r17 = r4
            b.l.a.c.h.b.h r4 = r14.mo14301P(r15, r17, r18, r19)     // Catch:{ all -> 0x0b6c }
            if (r3 == 0) goto L_0x0a74
            long r3 = r4.f5571e     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.f r5 = r34.mo14341G()     // Catch:{ all -> 0x0b6c }
            java.lang.String r6 = r7.f5757a     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.a3<java.lang.Integer> r10 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5398o     // Catch:{ all -> 0x0b6c }
            int r5 = r5.mo14195p(r6, r10)     // Catch:{ all -> 0x0b6c }
            long r5 = (long) r5     // Catch:{ all -> 0x0b6c }
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0a74
            goto L_0x0a76
        L_0x0a74:
            r28 = r35
        L_0x0a76:
            r2.mo14126h()     // Catch:{ all -> 0x0b6c }
            r2.mo14646i()     // Catch:{ all -> 0x0b6c }
            p005b.p006a.p007a.p024o.C0823f.m382m(r7)     // Catch:{ all -> 0x0b6c }
            java.lang.String r3 = r7.f5757a     // Catch:{ all -> 0x0b6c }
            p005b.p006a.p007a.p024o.C0823f.m376j(r3)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.j9 r3 = r2.f6128b     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.l9 r3 = r3.f5654g     // Catch:{ all -> 0x0b6c }
            m6111F(r3)     // Catch:{ all -> 0x0b6c }
            b.l.a.c.e.i.p1 r3 = r3.mo14406v(r7)     // Catch:{ all -> 0x0b6c }
            byte[] r3 = r3.mo13371e()     // Catch:{ all -> 0x0b6c }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0b6c }
            r4.<init>()     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = r7.f5757a     // Catch:{ all -> 0x0b6c }
            r4.put(r12, r5)     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = "name"
            java.lang.String r6 = r7.f5758b     // Catch:{ all -> 0x0b6c }
            r4.put(r5, r6)     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = "timestamp"
            long r10 = r7.f5760d     // Catch:{ all -> 0x0b6c }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0b6c }
            r4.put(r5, r6)     // Catch:{ all -> 0x0b6c }
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0b6c }
            r4.put(r13, r5)     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = "data"
            r4.put(r5, r3)     // Catch:{ all -> 0x0b6c }
            java.lang.String r3 = "realtime"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0b6c }
            r4.put(r3, r5)     // Catch:{ all -> 0x0b6c }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo14286A()     // Catch:{ SQLiteException -> 0x0af0 }
            r5 = 0
            r6 = r33
            long r3 = r3.insert(r6, r5, r4)     // Catch:{ SQLiteException -> 0x0af0 }
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0aeb
            b.l.a.c.h.b.p4 r3 = r2.f5638a     // Catch:{ SQLiteException -> 0x0af0 }
            b.l.a.c.h.b.o3 r3 = r3.mo14329d()     // Catch:{ SQLiteException -> 0x0af0 }
            b.l.a.c.h.b.m3 r3 = r3.mo14440o()     // Catch:{ SQLiteException -> 0x0af0 }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r5 = r7.f5757a     // Catch:{ SQLiteException -> 0x0af0 }
            java.lang.Object r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r5)     // Catch:{ SQLiteException -> 0x0af0 }
            r3.mo14415b(r4, r5)     // Catch:{ SQLiteException -> 0x0af0 }
            goto L_0x0b39
        L_0x0aeb:
            r2 = 0
            r1.f5661n = r2     // Catch:{ all -> 0x0b6c }
            goto L_0x0b39
        L_0x0af0:
            r0 = move-exception
            r3 = r0
            b.l.a.c.h.b.p4 r2 = r2.f5638a     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.m3 r2 = r2.mo14440o()     // Catch:{ all -> 0x0b6c }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r7.f5757a     // Catch:{ all -> 0x0b6c }
            java.lang.Object r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r5)     // Catch:{ all -> 0x0b6c }
            r2.mo14416c(r4, r5, r3)     // Catch:{ all -> 0x0b6c }
            goto L_0x0b39
        L_0x0b08:
            r0 = move-exception
            r5 = r0
            b.l.a.c.h.b.p4 r3 = r3.f5638a     // Catch:{ IOException -> 0x0b22 }
            b.l.a.c.h.b.o3 r3 = r3.mo14329d()     // Catch:{ IOException -> 0x0b22 }
            b.l.a.c.h.b.m3 r3 = r3.mo14440o()     // Catch:{ IOException -> 0x0b22 }
            java.lang.String r6 = "Error storing raw event metadata. appId"
            java.lang.String r4 = r4.mo13939s()     // Catch:{ IOException -> 0x0b22 }
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r4)     // Catch:{ IOException -> 0x0b22 }
            r3.mo14416c(r6, r4, r5)     // Catch:{ IOException -> 0x0b22 }
            throw r5     // Catch:{ IOException -> 0x0b22 }
        L_0x0b22:
            r0 = move-exception
            r3 = r0
            b.l.a.c.h.b.o3 r4 = r34.mo14329d()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.m3 r4 = r4.mo14440o()     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.mo13879s()     // Catch:{ all -> 0x0b6c }
            java.lang.Object r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r2)     // Catch:{ all -> 0x0b6c }
            r4.mo14416c(r5, r2, r3)     // Catch:{ all -> 0x0b6c }
        L_0x0b39:
            b.l.a.c.h.b.j r2 = r1.f5650c     // Catch:{ all -> 0x0b6c }
            m6111F(r2)     // Catch:{ all -> 0x0b6c }
            r2.mo14318y()     // Catch:{ all -> 0x0b6c }
            b.l.a.c.h.b.j r2 = r1.f5650c
            m6111F(r2)
            r2.mo14319z()
            r34.mo14336A()
            b.l.a.c.h.b.o3 r2 = r34.mo14329d()
            b.l.a.c.h.b.m3 r2 = r2.mo14444s()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r29
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.mo14415b(r4, r3)
            return
        L_0x0b6c:
            r0 = move-exception
            r2 = r0
            b.l.a.c.h.b.j r3 = r1.f5650c
            m6111F(r3)
            r3.mo14319z()
            throw r2
        L_0x0b77:
            r1.mo14367r(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.mo14354T(b.l.a.c.h.b.s, b.l.a.c.h.b.v9):void");
    }

    /* renamed from: a */
    public final C3165ea mo14327a() {
        throw null;
    }

    @WorkerThread
    /* renamed from: b */
    public final String mo14355b(C3177g gVar) {
        C2980u8.m5384b();
        if (!mo14341G().mo14197r((String) null, C3134c3.f5415w0) || gVar.mo14234e()) {
            return mo14356g();
        }
        return null;
    }

    /* renamed from: c */
    public final Context mo14328c() {
        return this.f5658k.f5842a;
    }

    /* renamed from: d */
    public final C3269o3 mo14329d() {
        C3281p4 p4Var = this.f5658k;
        Objects.requireNonNull(p4Var, "null reference");
        return p4Var.mo14329d();
    }

    /* renamed from: e */
    public final C1958b mo14330e() {
        C3281p4 p4Var = this.f5658k;
        Objects.requireNonNull(p4Var, "null reference");
        return p4Var.f5855n;
    }

    /* renamed from: f */
    public final C3248m4 mo14331f() {
        C3281p4 p4Var = this.f5658k;
        Objects.requireNonNull(p4Var, "null reference");
        return p4Var.mo14331f();
    }

    @WorkerThread
    @Deprecated
    /* renamed from: g */
    public final String mo14356g() {
        byte[] bArr = new byte[16];
        mo14346L().mo14535e0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v17, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* JADX WARNING: type inference failed for: r9v19 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:212|213) */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0253, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:?, code lost:
        mo14329d().mo14440o().mo14416c("Failed to parse upload URL. Not uploading. appId", p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r6), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x051d, code lost:
        if (r4 != null) goto L_0x051f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0112, code lost:
        if (r11 != null) goto L_0x0114;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:212:0x04a5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x027c A[SYNTHETIC, Splitter:B:135:0x027c] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0285 A[Catch:{ all -> 0x011a, all -> 0x0545 }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x033c A[Catch:{ all -> 0x011a, all -> 0x0545 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0358 A[Catch:{ all -> 0x011a, all -> 0x0545 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0369 A[Catch:{ all -> 0x011a, all -> 0x0545 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03fc A[Catch:{ all -> 0x011a, all -> 0x0545 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x040c A[Catch:{ all -> 0x011a, all -> 0x0545 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x043a A[Catch:{ MalformedURLException -> 0x04a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0448 A[Catch:{ MalformedURLException -> 0x04a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x045a A[Catch:{ MalformedURLException -> 0x04a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04bc A[Catch:{ all -> 0x011a, all -> 0x0545 }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0541 A[SYNTHETIC, Splitter:B:248:0x0541] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011e A[Catch:{ all -> 0x011a, all -> 0x0545 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:122:0x0250=Splitter:B:122:0x0250, B:45:0x0103=Splitter:B:45:0x0103, B:132:0x0263=Splitter:B:132:0x0263, B:48:0x0114=Splitter:B:48:0x0114, B:203:0x0428=Splitter:B:203:0x0428, B:235:0x051f=Splitter:B:235:0x051f} */
    @androidx.annotation.WorkerThread
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14357h() {
        /*
            r22 = this;
            r1 = r22
            b.l.a.c.h.b.m4 r0 = r22.mo14331f()
            r0.mo14126h()
            r22.mo14347M()
            r2 = 1
            r1.f5667t = r2
            r3 = 0
            b.l.a.c.h.b.p4 r0 = r1.f5658k     // Catch:{ all -> 0x0545 }
            r0.mo14327a()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.p4 r0 = r1.f5658k     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.f8 r0 = r0.mo14473z()     // Catch:{ all -> 0x0545 }
            java.lang.Boolean r0 = r0.mo14218m()     // Catch:{ all -> 0x0545 }
            if (r0 != 0) goto L_0x002c
            b.l.a.c.h.b.o3 r0 = r22.mo14329d()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.m3 r0 = r0.mo14441p()     // Catch:{ all -> 0x0545 }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            goto L_0x005b
        L_0x002c:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0545 }
            if (r0 == 0) goto L_0x003d
            b.l.a.c.h.b.o3 r0 = r22.mo14329d()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.m3 r0 = r0.mo14440o()     // Catch:{ all -> 0x0545 }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            goto L_0x005b
        L_0x003d:
            long r4 = r1.f5661n     // Catch:{ all -> 0x0545 }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0046
            goto L_0x0077
        L_0x0046:
            b.l.a.c.h.b.m4 r0 = r22.mo14331f()     // Catch:{ all -> 0x0545 }
            r0.mo14126h()     // Catch:{ all -> 0x0545 }
            java.util.List<java.lang.Long> r0 = r1.f5670w     // Catch:{ all -> 0x0545 }
            if (r0 == 0) goto L_0x005f
            b.l.a.c.h.b.o3 r0 = r22.mo14329d()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.m3 r0 = r0.mo14444s()     // Catch:{ all -> 0x0545 }
            java.lang.String r2 = "Uploading requested multiple times"
        L_0x005b:
            r0.mo14414a(r2)     // Catch:{ all -> 0x0545 }
            goto L_0x007a
        L_0x005f:
            b.l.a.c.h.b.t3 r0 = r1.f5649b     // Catch:{ all -> 0x0545 }
            m6111F(r0)     // Catch:{ all -> 0x0545 }
            boolean r0 = r0.mo14591l()     // Catch:{ all -> 0x0545 }
            if (r0 != 0) goto L_0x007e
            b.l.a.c.h.b.o3 r0 = r22.mo14329d()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.m3 r0 = r0.mo14444s()     // Catch:{ all -> 0x0545 }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.mo14414a(r2)     // Catch:{ all -> 0x0545 }
        L_0x0077:
            r22.mo14336A()     // Catch:{ all -> 0x0545 }
        L_0x007a:
            r1.f5667t = r3
            goto L_0x0539
        L_0x007e:
            b.l.a.c.b.p.b r0 = r22.mo14330e()     // Catch:{ all -> 0x0545 }
            b.l.a.c.b.p.c r0 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r0     // Catch:{ all -> 0x0545 }
            long r4 = r0.mo12289a()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.f r0 = r22.mo14341G()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.a3<java.lang.Integer> r8 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5360Q     // Catch:{ all -> 0x0545 }
            r9 = 0
            int r0 = r0.mo14195p(r9, r8)     // Catch:{ all -> 0x0545 }
            r22.mo14341G()     // Catch:{ all -> 0x0545 }
            long r10 = p005b.p096l.p097a.p113c.p145h.p147b.C3166f.m5925A()     // Catch:{ all -> 0x0545 }
            long r10 = r4 - r10
            r8 = r3
        L_0x009d:
            if (r8 >= r0) goto L_0x00a8
            boolean r12 = r1.mo14368v(r9, r10)     // Catch:{ all -> 0x0545 }
            if (r12 == 0) goto L_0x00a8
            int r8 = r8 + 1
            goto L_0x009d
        L_0x00a8:
            b.l.a.c.h.b.g8 r0 = r1.f5656i     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.y3 r0 = r0.f5561i     // Catch:{ all -> 0x0545 }
            long r10 = r0.mo14633a()     // Catch:{ all -> 0x0545 }
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00cb
            b.l.a.c.h.b.o3 r0 = r22.mo14329d()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.m3 r0 = r0.mo14443r()     // Catch:{ all -> 0x0545 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r4 - r10
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0545 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0545 }
            r0.mo14415b(r6, r7)     // Catch:{ all -> 0x0545 }
        L_0x00cb:
            b.l.a.c.h.b.j r0 = r1.f5650c     // Catch:{ all -> 0x0545 }
            m6111F(r0)     // Catch:{ all -> 0x0545 }
            java.lang.String r6 = r0.mo14305T()     // Catch:{ all -> 0x0545 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0545 }
            r7 = -1
            if (r0 != 0) goto L_0x04c0
            long r10 = r1.f5672y     // Catch:{ all -> 0x0545 }
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0122
            b.l.a.c.h.b.j r10 = r1.f5650c     // Catch:{ all -> 0x0545 }
            m6111F(r10)     // Catch:{ all -> 0x0545 }
            android.database.sqlite.SQLiteDatabase r0 = r10.mo14286A()     // Catch:{ SQLiteException -> 0x0101, all -> 0x00ff }
            java.lang.String r11 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r11, r9)     // Catch:{ SQLiteException -> 0x0101, all -> 0x00ff }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x00fd }
            if (r0 != 0) goto L_0x00f8
            goto L_0x0114
        L_0x00f8:
            long r7 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x00fd }
            goto L_0x0114
        L_0x00fd:
            r0 = move-exception
            goto L_0x0103
        L_0x00ff:
            r0 = move-exception
            goto L_0x011c
        L_0x0101:
            r0 = move-exception
            r11 = r9
        L_0x0103:
            b.l.a.c.h.b.p4 r10 = r10.f5638a     // Catch:{ all -> 0x011a }
            b.l.a.c.h.b.o3 r10 = r10.mo14329d()     // Catch:{ all -> 0x011a }
            b.l.a.c.h.b.m3 r10 = r10.mo14440o()     // Catch:{ all -> 0x011a }
            java.lang.String r12 = "Error querying raw events"
            r10.mo14415b(r12, r0)     // Catch:{ all -> 0x011a }
            if (r11 == 0) goto L_0x0117
        L_0x0114:
            r11.close()     // Catch:{ all -> 0x0545 }
        L_0x0117:
            r1.f5672y = r7     // Catch:{ all -> 0x0545 }
            goto L_0x0122
        L_0x011a:
            r0 = move-exception
            r9 = r11
        L_0x011c:
            if (r9 == 0) goto L_0x0121
            r9.close()     // Catch:{ all -> 0x0545 }
        L_0x0121:
            throw r0     // Catch:{ all -> 0x0545 }
        L_0x0122:
            b.l.a.c.h.b.f r0 = r22.mo14341G()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.a3<java.lang.Integer> r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5382g     // Catch:{ all -> 0x0545 }
            int r0 = r0.mo14195p(r6, r7)     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.f r7 = r22.mo14341G()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.a3<java.lang.Integer> r8 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5384h     // Catch:{ all -> 0x0545 }
            int r7 = r7.mo14195p(r6, r8)     // Catch:{ all -> 0x0545 }
            int r7 = java.lang.Math.max(r3, r7)     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.j r8 = r1.f5650c     // Catch:{ all -> 0x0545 }
            m6111F(r8)     // Catch:{ all -> 0x0545 }
            r8.mo14126h()     // Catch:{ all -> 0x0545 }
            r8.mo14646i()     // Catch:{ all -> 0x0545 }
            if (r0 <= 0) goto L_0x0149
            r10 = r2
            goto L_0x014a
        L_0x0149:
            r10 = r3
        L_0x014a:
            p005b.p006a.p007a.p024o.C0823f.m360b(r10)     // Catch:{ all -> 0x0545 }
            if (r7 <= 0) goto L_0x0151
            r10 = r2
            goto L_0x0152
        L_0x0151:
            r10 = r3
        L_0x0152:
            p005b.p006a.p007a.p024o.C0823f.m360b(r10)     // Catch:{ all -> 0x0545 }
            p005b.p006a.p007a.p024o.C0823f.m376j(r6)     // Catch:{ all -> 0x0545 }
            android.database.sqlite.SQLiteDatabase r11 = r8.mo14286A()     // Catch:{ SQLiteException -> 0x025f, all -> 0x025b }
            java.lang.String r12 = "rowid"
            java.lang.String r13 = "data"
            java.lang.String r14 = "retry_count"
            java.lang.String[] r13 = new java.lang.String[]{r12, r13, r14}     // Catch:{ SQLiteException -> 0x025f, all -> 0x025b }
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x025f, all -> 0x025b }
            r15[r3] = r6     // Catch:{ SQLiteException -> 0x025f, all -> 0x025b }
            java.lang.String r12 = "queue"
            java.lang.String r14 = "app_id=?"
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x025f, all -> 0x025b }
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x025f, all -> 0x025b }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0257 }
            if (r0 != 0) goto L_0x018d
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x0257 }
            r11.close()     // Catch:{ all -> 0x0545 }
            r20 = r4
            goto L_0x027f
        L_0x018d:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0257 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0257 }
            r13 = r3
        L_0x0193:
            long r14 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0257 }
            byte[] r0 = r11.getBlob(r2)     // Catch:{ IOException -> 0x022d }
            b.l.a.c.h.b.j9 r2 = r8.f6128b     // Catch:{ IOException -> 0x022d }
            b.l.a.c.h.b.l9 r2 = r2.f5654g     // Catch:{ IOException -> 0x022d }
            m6111F(r2)     // Catch:{ IOException -> 0x022d }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0218 }
            r9.<init>(r0)     // Catch:{ IOException -> 0x0218 }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0218 }
            r0.<init>(r9)     // Catch:{ IOException -> 0x0218 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0218 }
            r3.<init>()     // Catch:{ IOException -> 0x0218 }
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x0218 }
            r20 = r4
        L_0x01b7:
            int r4 = r0.read(r10)     // Catch:{ IOException -> 0x0216 }
            if (r4 > 0) goto L_0x0211
            r0.close()     // Catch:{ IOException -> 0x0216 }
            r9.close()     // Catch:{ IOException -> 0x0216 }
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x0216 }
            boolean r2 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x0255 }
            if (r2 != 0) goto L_0x01d3
            int r2 = r0.length     // Catch:{ SQLiteException -> 0x0255 }
            int r2 = r2 + r13
            if (r2 <= r7) goto L_0x01d3
            goto L_0x0250
        L_0x01d3:
            b.l.a.c.e.i.w1 r2 = p005b.p096l.p097a.p113c.p131e.p140i.C3012x1.m5557C0()     // Catch:{ IOException -> 0x01ff }
            b.l.a.c.e.i.g4 r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6192G(r2, r0)     // Catch:{ IOException -> 0x01ff }
            b.l.a.c.e.i.w1 r2 = (p005b.p096l.p097a.p113c.p131e.p140i.C2999w1) r2     // Catch:{ IOException -> 0x01ff }
            r3 = 2
            boolean r4 = r11.isNull(r3)     // Catch:{ SQLiteException -> 0x0255 }
            if (r4 != 0) goto L_0x01eb
            int r4 = r11.getInt(r3)     // Catch:{ SQLiteException -> 0x0255 }
            r2.mo13850V(r4)     // Catch:{ SQLiteException -> 0x0255 }
        L_0x01eb:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x0255 }
            int r13 = r13 + r0
            b.l.a.c.e.i.o5 r0 = r2.mo13484g()     // Catch:{ SQLiteException -> 0x0255 }
            b.l.a.c.e.i.x1 r0 = (p005b.p096l.p097a.p113c.p131e.p140i.C3012x1) r0     // Catch:{ SQLiteException -> 0x0255 }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x0255 }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ SQLiteException -> 0x0255 }
            r12.add(r0)     // Catch:{ SQLiteException -> 0x0255 }
            goto L_0x0240
        L_0x01ff:
            r0 = move-exception
            b.l.a.c.h.b.p4 r2 = r8.f5638a     // Catch:{ SQLiteException -> 0x0255 }
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()     // Catch:{ SQLiteException -> 0x0255 }
            b.l.a.c.h.b.m3 r2 = r2.mo14440o()     // Catch:{ SQLiteException -> 0x0255 }
            java.lang.String r3 = "Failed to merge queued bundle. appId"
        L_0x020c:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r6)     // Catch:{ SQLiteException -> 0x0255 }
            goto L_0x023d
        L_0x0211:
            r5 = 0
            r3.write(r10, r5, r4)     // Catch:{ IOException -> 0x0216 }
            goto L_0x01b7
        L_0x0216:
            r0 = move-exception
            goto L_0x021b
        L_0x0218:
            r0 = move-exception
            r20 = r4
        L_0x021b:
            b.l.a.c.h.b.p4 r2 = r2.f5638a     // Catch:{ IOException -> 0x022b }
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()     // Catch:{ IOException -> 0x022b }
            b.l.a.c.h.b.m3 r2 = r2.mo14440o()     // Catch:{ IOException -> 0x022b }
            java.lang.String r3 = "Failed to ungzip content"
            r2.mo14415b(r3, r0)     // Catch:{ IOException -> 0x022b }
            throw r0     // Catch:{ IOException -> 0x022b }
        L_0x022b:
            r0 = move-exception
            goto L_0x0230
        L_0x022d:
            r0 = move-exception
            r20 = r4
        L_0x0230:
            b.l.a.c.h.b.p4 r2 = r8.f5638a     // Catch:{ SQLiteException -> 0x0255 }
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()     // Catch:{ SQLiteException -> 0x0255 }
            b.l.a.c.h.b.m3 r2 = r2.mo14440o()     // Catch:{ SQLiteException -> 0x0255 }
            java.lang.String r3 = "Failed to unzip queued bundle. appId"
            goto L_0x020c
        L_0x023d:
            r2.mo14416c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x0255 }
        L_0x0240:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0255 }
            if (r0 == 0) goto L_0x0250
            if (r13 <= r7) goto L_0x0249
            goto L_0x0250
        L_0x0249:
            r4 = r20
            r2 = 1
            r3 = 0
            r9 = 0
            goto L_0x0193
        L_0x0250:
            r11.close()     // Catch:{ all -> 0x0545 }
            r0 = r12
            goto L_0x027f
        L_0x0255:
            r0 = move-exception
            goto L_0x0263
        L_0x0257:
            r0 = move-exception
            r20 = r4
            goto L_0x0263
        L_0x025b:
            r0 = move-exception
            r9 = 0
            goto L_0x04ba
        L_0x025f:
            r0 = move-exception
            r20 = r4
            r11 = 0
        L_0x0263:
            b.l.a.c.h.b.p4 r2 = r8.f5638a     // Catch:{ all -> 0x04b8 }
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()     // Catch:{ all -> 0x04b8 }
            b.l.a.c.h.b.m3 r2 = r2.mo14440o()     // Catch:{ all -> 0x04b8 }
            java.lang.String r3 = "Error querying bundles. appId"
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r6)     // Catch:{ all -> 0x04b8 }
            r2.mo14416c(r3, r4, r0)     // Catch:{ all -> 0x04b8 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x04b8 }
            if (r11 == 0) goto L_0x027f
            r11.close()     // Catch:{ all -> 0x0545 }
        L_0x027f:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x0545 }
            if (r2 != 0) goto L_0x0536
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.f r2 = r22.mo14341G()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.a3<java.lang.Boolean> r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5415w0     // Catch:{ all -> 0x0545 }
            r4 = 0
            boolean r2 = r2.mo14197r(r4, r3)     // Catch:{ all -> 0x0545 }
            if (r2 == 0) goto L_0x029f
            b.l.a.c.h.b.g r2 = r1.mo14349O(r6)     // Catch:{ all -> 0x0545 }
            boolean r2 = r2.mo14233d()     // Catch:{ all -> 0x0545 }
            if (r2 == 0) goto L_0x02f4
        L_0x029f:
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0545 }
        L_0x02a3:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0545 }
            if (r3 == 0) goto L_0x02c2
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0545 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0545 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x0545 }
            b.l.a.c.e.i.x1 r3 = (p005b.p096l.p097a.p113c.p131e.p140i.C3012x1) r3     // Catch:{ all -> 0x0545 }
            java.lang.String r4 = r3.mo13956y()     // Catch:{ all -> 0x0545 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0545 }
            if (r4 != 0) goto L_0x02a3
            java.lang.String r2 = r3.mo13956y()     // Catch:{ all -> 0x0545 }
            goto L_0x02c3
        L_0x02c2:
            r2 = 0
        L_0x02c3:
            if (r2 == 0) goto L_0x02f4
            r3 = 0
        L_0x02c6:
            int r4 = r0.size()     // Catch:{ all -> 0x0545 }
            if (r3 >= r4) goto L_0x02f4
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0545 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x0545 }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x0545 }
            b.l.a.c.e.i.x1 r4 = (p005b.p096l.p097a.p113c.p131e.p140i.C3012x1) r4     // Catch:{ all -> 0x0545 }
            java.lang.String r5 = r4.mo13956y()     // Catch:{ all -> 0x0545 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0545 }
            if (r5 == 0) goto L_0x02e1
            goto L_0x02f1
        L_0x02e1:
            java.lang.String r4 = r4.mo13956y()     // Catch:{ all -> 0x0545 }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0545 }
            if (r4 != 0) goto L_0x02f1
            r2 = 0
            java.util.List r0 = r0.subList(r2, r3)     // Catch:{ all -> 0x0545 }
            goto L_0x02f4
        L_0x02f1:
            int r3 = r3 + 1
            goto L_0x02c6
        L_0x02f4:
            b.l.a.c.e.i.u1 r2 = p005b.p096l.p097a.p113c.p131e.p140i.C2986v1.m5395u()     // Catch:{ all -> 0x0545 }
            int r3 = r0.size()     // Catch:{ all -> 0x0545 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0545 }
            int r5 = r0.size()     // Catch:{ all -> 0x0545 }
            r4.<init>(r5)     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.f r5 = r22.mo14341G()     // Catch:{ all -> 0x0545 }
            boolean r5 = r5.mo14203x(r6)     // Catch:{ all -> 0x0545 }
            if (r5 == 0) goto L_0x032b
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.f r5 = r22.mo14341G()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.a3<java.lang.Boolean> r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5415w0     // Catch:{ all -> 0x0545 }
            r8 = 0
            boolean r5 = r5.mo14197r(r8, r7)     // Catch:{ all -> 0x0545 }
            if (r5 == 0) goto L_0x0329
            b.l.a.c.h.b.g r5 = r1.mo14349O(r6)     // Catch:{ all -> 0x0545 }
            boolean r5 = r5.mo14233d()     // Catch:{ all -> 0x0545 }
            if (r5 == 0) goto L_0x032b
        L_0x0329:
            r5 = 1
            goto L_0x032c
        L_0x032b:
            r5 = 0
        L_0x032c:
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.f r7 = r22.mo14341G()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.a3<java.lang.Boolean> r8 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5415w0     // Catch:{ all -> 0x0545 }
            r9 = 0
            boolean r7 = r7.mo14197r(r9, r8)     // Catch:{ all -> 0x0545 }
            if (r7 == 0) goto L_0x0349
            b.l.a.c.h.b.g r7 = r1.mo14349O(r6)     // Catch:{ all -> 0x0545 }
            boolean r7 = r7.mo14233d()     // Catch:{ all -> 0x0545 }
            if (r7 == 0) goto L_0x0347
            goto L_0x0349
        L_0x0347:
            r7 = 0
            goto L_0x034a
        L_0x0349:
            r7 = 1
        L_0x034a:
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.f r9 = r22.mo14341G()     // Catch:{ all -> 0x0545 }
            r10 = 0
            boolean r8 = r9.mo14197r(r10, r8)     // Catch:{ all -> 0x0545 }
            if (r8 == 0) goto L_0x0365
            b.l.a.c.h.b.g r8 = r1.mo14349O(r6)     // Catch:{ all -> 0x0545 }
            boolean r8 = r8.mo14234e()     // Catch:{ all -> 0x0545 }
            if (r8 == 0) goto L_0x0363
            goto L_0x0365
        L_0x0363:
            r8 = 0
            goto L_0x0366
        L_0x0365:
            r8 = 1
        L_0x0366:
            r9 = 0
        L_0x0367:
            if (r9 >= r3) goto L_0x03eb
            java.lang.Object r10 = r0.get(r9)     // Catch:{ all -> 0x0545 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x0545 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x0545 }
            b.l.a.c.e.i.x1 r10 = (p005b.p096l.p097a.p113c.p131e.p140i.C3012x1) r10     // Catch:{ all -> 0x0545 }
            b.l.a.c.e.i.l5 r10 = r10.mo13546n()     // Catch:{ all -> 0x0545 }
            b.l.a.c.e.i.w1 r10 = (p005b.p096l.p097a.p113c.p131e.p140i.C2999w1) r10     // Catch:{ all -> 0x0545 }
            java.lang.Object r11 = r0.get(r9)     // Catch:{ all -> 0x0545 }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ all -> 0x0545 }
            java.lang.Object r11 = r11.second     // Catch:{ all -> 0x0545 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0545 }
            r4.add(r11)     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.f r11 = r22.mo14341G()     // Catch:{ all -> 0x0545 }
            r11.mo14193n()     // Catch:{ all -> 0x0545 }
            r10.mo13887w()     // Catch:{ all -> 0x0545 }
            r11 = r20
            r10.mo13880s0(r11)     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.p4 r13 = r1.f5658k     // Catch:{ all -> 0x0545 }
            r13.mo14327a()     // Catch:{ all -> 0x0545 }
            r13 = 0
            r10.mo13839K(r13)     // Catch:{ all -> 0x0545 }
            if (r5 != 0) goto L_0x03a3
            r10.mo13849U()     // Catch:{ all -> 0x0545 }
        L_0x03a3:
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.f r13 = r22.mo14341G()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.a3<java.lang.Boolean> r14 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5415w0     // Catch:{ all -> 0x0545 }
            r15 = 0
            boolean r13 = r13.mo14197r(r15, r14)     // Catch:{ all -> 0x0545 }
            if (r13 == 0) goto L_0x03c0
            if (r7 != 0) goto L_0x03bb
            r10.mo13891y()     // Catch:{ all -> 0x0545 }
            r10.mo13829A()     // Catch:{ all -> 0x0545 }
        L_0x03bb:
            if (r8 != 0) goto L_0x03c0
            r10.mo13832C()     // Catch:{ all -> 0x0545 }
        L_0x03c0:
            b.l.a.c.h.b.f r13 = r22.mo14341G()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.a3<java.lang.Boolean> r14 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5366W     // Catch:{ all -> 0x0545 }
            boolean r13 = r13.mo14197r(r6, r14)     // Catch:{ all -> 0x0545 }
            if (r13 == 0) goto L_0x03e2
            b.l.a.c.e.i.o5 r13 = r10.mo13484g()     // Catch:{ all -> 0x0545 }
            b.l.a.c.e.i.x1 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C3012x1) r13     // Catch:{ all -> 0x0545 }
            byte[] r13 = r13.mo13371e()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.l9 r14 = r1.f5654g     // Catch:{ all -> 0x0545 }
            m6111F(r14)     // Catch:{ all -> 0x0545 }
            long r13 = r14.mo14400E(r13)     // Catch:{ all -> 0x0545 }
            r10.mo13854Z(r13)     // Catch:{ all -> 0x0545 }
        L_0x03e2:
            r2.mo13769n(r10)     // Catch:{ all -> 0x0545 }
            int r9 = r9 + 1
            r20 = r11
            goto L_0x0367
        L_0x03eb:
            r11 = r20
            b.l.a.c.h.b.o3 r0 = r22.mo14329d()     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = r0.mo14446v()     // Catch:{ all -> 0x0545 }
            r5 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x0545 }
            if (r0 == 0) goto L_0x040c
            b.l.a.c.h.b.l9 r0 = r1.f5654g     // Catch:{ all -> 0x0545 }
            m6111F(r0)     // Catch:{ all -> 0x0545 }
            b.l.a.c.e.i.o5 r5 = r2.mo13484g()     // Catch:{ all -> 0x0545 }
            b.l.a.c.e.i.v1 r5 = (p005b.p096l.p097a.p113c.p131e.p140i.C2986v1) r5     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = r0.mo14407w(r5)     // Catch:{ all -> 0x0545 }
            goto L_0x040d
        L_0x040c:
            r0 = 0
        L_0x040d:
            b.l.a.c.h.b.l9 r5 = r1.f5654g     // Catch:{ all -> 0x0545 }
            m6111F(r5)     // Catch:{ all -> 0x0545 }
            b.l.a.c.e.i.o5 r5 = r2.mo13484g()     // Catch:{ all -> 0x0545 }
            b.l.a.c.e.i.v1 r5 = (p005b.p096l.p097a.p113c.p131e.p140i.C2986v1) r5     // Catch:{ all -> 0x0545 }
            byte[] r14 = r5.mo13371e()     // Catch:{ all -> 0x0545 }
            r22.mo14341G()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.a3<java.lang.String> r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5402q     // Catch:{ all -> 0x0545 }
            r9 = 0
            java.lang.Object r5 = r5.mo14064a(r9)     // Catch:{ all -> 0x0545 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0545 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x04a5 }
            r13.<init>(r5)     // Catch:{ MalformedURLException -> 0x04a5 }
            boolean r7 = r4.isEmpty()     // Catch:{ MalformedURLException -> 0x04a5 }
            r8 = 1
            r7 = r7 ^ r8
            p005b.p006a.p007a.p024o.C0823f.m360b(r7)     // Catch:{ MalformedURLException -> 0x04a5 }
            java.util.List<java.lang.Long> r7 = r1.f5670w     // Catch:{ MalformedURLException -> 0x04a5 }
            if (r7 == 0) goto L_0x0448
            b.l.a.c.h.b.o3 r4 = r22.mo14329d()     // Catch:{ MalformedURLException -> 0x04a5 }
            b.l.a.c.h.b.m3 r4 = r4.mo14440o()     // Catch:{ MalformedURLException -> 0x04a5 }
            java.lang.String r7 = "Set uploading progress before finishing the previous upload"
            r4.mo14414a(r7)     // Catch:{ MalformedURLException -> 0x04a5 }
            goto L_0x044f
        L_0x0448:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x04a5 }
            r7.<init>(r4)     // Catch:{ MalformedURLException -> 0x04a5 }
            r1.f5670w = r7     // Catch:{ MalformedURLException -> 0x04a5 }
        L_0x044f:
            b.l.a.c.h.b.g8 r4 = r1.f5656i     // Catch:{ MalformedURLException -> 0x04a5 }
            b.l.a.c.h.b.y3 r4 = r4.f5562j     // Catch:{ MalformedURLException -> 0x04a5 }
            r4.mo14634b(r11)     // Catch:{ MalformedURLException -> 0x04a5 }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x0462
            b.l.a.c.e.i.x1 r2 = r2.mo13768m()     // Catch:{ MalformedURLException -> 0x04a5 }
            java.lang.String r4 = r2.mo13939s()     // Catch:{ MalformedURLException -> 0x04a5 }
        L_0x0462:
            b.l.a.c.h.b.o3 r2 = r22.mo14329d()     // Catch:{ MalformedURLException -> 0x04a5 }
            b.l.a.c.h.b.m3 r2 = r2.mo14444s()     // Catch:{ MalformedURLException -> 0x04a5 }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r7 = r14.length     // Catch:{ MalformedURLException -> 0x04a5 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ MalformedURLException -> 0x04a5 }
            r2.mo14417d(r3, r4, r7, r0)     // Catch:{ MalformedURLException -> 0x04a5 }
            r2 = 1
            r1.f5666s = r2     // Catch:{ MalformedURLException -> 0x04a5 }
            b.l.a.c.h.b.t3 r11 = r1.f5649b     // Catch:{ MalformedURLException -> 0x04a5 }
            m6111F(r11)     // Catch:{ MalformedURLException -> 0x04a5 }
            b.l.a.c.h.b.d9 r0 = new b.l.a.c.h.b.d9     // Catch:{ MalformedURLException -> 0x04a5 }
            r0.<init>(r1, r6)     // Catch:{ MalformedURLException -> 0x04a5 }
            r11.mo14126h()     // Catch:{ MalformedURLException -> 0x04a5 }
            r11.mo14646i()     // Catch:{ MalformedURLException -> 0x04a5 }
            p005b.p006a.p007a.p024o.C0823f.m382m(r13)     // Catch:{ MalformedURLException -> 0x04a5 }
            p005b.p006a.p007a.p024o.C0823f.m382m(r14)     // Catch:{ MalformedURLException -> 0x04a5 }
            p005b.p006a.p007a.p024o.C0823f.m382m(r0)     // Catch:{ MalformedURLException -> 0x04a5 }
            b.l.a.c.h.b.p4 r2 = r11.f5638a     // Catch:{ MalformedURLException -> 0x04a5 }
            b.l.a.c.h.b.m4 r2 = r2.mo14331f()     // Catch:{ MalformedURLException -> 0x04a5 }
            b.l.a.c.h.b.s3 r3 = new b.l.a.c.h.b.s3     // Catch:{ MalformedURLException -> 0x04a5 }
            r15 = 0
            r10 = r3
            r12 = r6
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x04a5 }
            r2.mo14423t(r3)     // Catch:{ MalformedURLException -> 0x04a5 }
            goto L_0x0536
        L_0x04a5:
            b.l.a.c.h.b.o3 r0 = r22.mo14329d()     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.m3 r0 = r0.mo14440o()     // Catch:{ all -> 0x0545 }
            java.lang.String r2 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r6)     // Catch:{ all -> 0x0545 }
            r0.mo14416c(r2, r3, r5)     // Catch:{ all -> 0x0545 }
            goto L_0x0536
        L_0x04b8:
            r0 = move-exception
            r9 = r11
        L_0x04ba:
            if (r9 == 0) goto L_0x04bf
            r9.close()     // Catch:{ all -> 0x0545 }
        L_0x04bf:
            throw r0     // Catch:{ all -> 0x0545 }
        L_0x04c0:
            r11 = r4
            r1.f5672y = r7     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.j r2 = r1.f5650c     // Catch:{ all -> 0x0545 }
            m6111F(r2)     // Catch:{ all -> 0x0545 }
            r22.mo14341G()     // Catch:{ all -> 0x0545 }
            long r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3166f.m5925A()     // Catch:{ all -> 0x0545 }
            long r4 = r11 - r3
            r2.mo14126h()     // Catch:{ all -> 0x0545 }
            r2.mo14646i()     // Catch:{ all -> 0x0545 }
            android.database.sqlite.SQLiteDatabase r0 = r2.mo14286A()     // Catch:{ SQLiteException -> 0x050c, all -> 0x050a }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x050c, all -> 0x050a }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x050c, all -> 0x050a }
            r5 = 0
            r3[r5] = r4     // Catch:{ SQLiteException -> 0x050c, all -> 0x050a }
            java.lang.String r4 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r4 = r0.rawQuery(r4, r3)     // Catch:{ SQLiteException -> 0x050c, all -> 0x050a }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0508 }
            if (r0 != 0) goto L_0x0501
            b.l.a.c.h.b.p4 r0 = r2.f5638a     // Catch:{ SQLiteException -> 0x0508 }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ SQLiteException -> 0x0508 }
            b.l.a.c.h.b.m3 r0 = r0.mo14444s()     // Catch:{ SQLiteException -> 0x0508 }
            java.lang.String r3 = "No expired configs for apps with pending events"
            r0.mo14414a(r3)     // Catch:{ SQLiteException -> 0x0508 }
            goto L_0x051f
        L_0x0501:
            r3 = 0
            java.lang.String r0 = r4.getString(r3)     // Catch:{ SQLiteException -> 0x0508 }
            r9 = r0
            goto L_0x051f
        L_0x0508:
            r0 = move-exception
            goto L_0x050e
        L_0x050a:
            r0 = move-exception
            goto L_0x053f
        L_0x050c:
            r0 = move-exception
            r4 = r9
        L_0x050e:
            b.l.a.c.h.b.p4 r2 = r2.f5638a     // Catch:{ all -> 0x053d }
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()     // Catch:{ all -> 0x053d }
            b.l.a.c.h.b.m3 r2 = r2.mo14440o()     // Catch:{ all -> 0x053d }
            java.lang.String r3 = "Error selecting expired configs"
            r2.mo14415b(r3, r0)     // Catch:{ all -> 0x053d }
            if (r4 == 0) goto L_0x0522
        L_0x051f:
            r4.close()     // Catch:{ all -> 0x0545 }
        L_0x0522:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0545 }
            if (r0 != 0) goto L_0x0536
            b.l.a.c.h.b.j r0 = r1.f5650c     // Catch:{ all -> 0x0545 }
            m6111F(r0)     // Catch:{ all -> 0x0545 }
            b.l.a.c.h.b.a5 r0 = r0.mo14299N(r9)     // Catch:{ all -> 0x0545 }
            if (r0 == 0) goto L_0x0536
            r1.mo14358i(r0)     // Catch:{ all -> 0x0545 }
        L_0x0536:
            r2 = 0
            r1.f5667t = r2
        L_0x0539:
            r22.mo14337B()
            return
        L_0x053d:
            r0 = move-exception
            r9 = r4
        L_0x053f:
            if (r9 == 0) goto L_0x0544
            r9.close()     // Catch:{ all -> 0x0545 }
        L_0x0544:
            throw r0     // Catch:{ all -> 0x0545 }
        L_0x0545:
            r0 = move-exception
            r2 = 0
            r1.f5667t = r2
            r22.mo14337B()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.mo14357h():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009b, code lost:
        if (android.text.TextUtils.isEmpty(r4) != false) goto L_0x009d;
     */
    @androidx.annotation.WorkerThread
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14358i(p005b.p096l.p097a.p113c.p145h.p147b.C3112a5 r14) {
        /*
            r13 = this;
            b.l.a.c.h.b.m4 r0 = r13.mo14331f()
            r0.mo14126h()
            p005b.p096l.p097a.p113c.p131e.p140i.C3007w9.m5549b()
            b.l.a.c.h.b.f r0 = r13.mo14341G()
            java.lang.String r1 = r14.mo14114y()
            b.l.a.c.h.b.a3<java.lang.Boolean> r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5385h0
            boolean r0 = r0.mo14197r(r1, r2)
            java.lang.String r1 = "null reference"
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = r14.mo14069B()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = r14.mo14073F()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = r14.mo14071D()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x003b
            goto L_0x0071
        L_0x003b:
            java.lang.String r4 = r14.mo14114y()
            java.util.Objects.requireNonNull(r4, r1)
            r5 = 204(0xcc, float:2.86E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r13
            r3.mo14359j(r4, r5, r6, r7, r8)
            return
        L_0x004c:
            java.lang.String r0 = r14.mo14069B()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = r14.mo14071D()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0071
            java.lang.String r4 = r14.mo14114y()
            java.util.Objects.requireNonNull(r4, r1)
            r5 = 204(0xcc, float:2.86E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r13
            r3.mo14359j(r4, r5, r6, r7, r8)
            return
        L_0x0071:
            b.l.a.c.h.b.b9 r0 = r13.f5657j
            android.net.Uri$Builder r3 = new android.net.Uri$Builder
            r3.<init>()
            java.lang.String r4 = r14.mo14069B()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x00a1
            p005b.p096l.p097a.p113c.p131e.p140i.C3007w9.m5549b()
            b.l.a.c.h.b.p4 r4 = r0.f5638a
            b.l.a.c.h.b.f r4 = r4.f5848g
            java.lang.String r5 = r14.mo14114y()
            boolean r2 = r4.mo14197r(r5, r2)
            if (r2 == 0) goto L_0x009d
            java.lang.String r4 = r14.mo14073F()
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto L_0x00a1
        L_0x009d:
            java.lang.String r4 = r14.mo14071D()
        L_0x00a1:
            b.l.a.c.h.b.a3<java.lang.String> r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5378e
            r5 = 0
            java.lang.Object r2 = r2.mo14064a(r5)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r2 = r3.scheme(r2)
            b.l.a.c.h.b.a3<java.lang.String> r6 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5380f
            java.lang.Object r6 = r6.mo14064a(r5)
            java.lang.String r6 = (java.lang.String) r6
            android.net.Uri$Builder r2 = r2.encodedAuthority(r6)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "config/app/"
            int r7 = r4.length()
            if (r7 == 0) goto L_0x00cb
            java.lang.String r4 = r6.concat(r4)
            goto L_0x00d0
        L_0x00cb:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
        L_0x00d0:
            android.net.Uri$Builder r2 = r2.path(r4)
            java.lang.String r4 = r14.mo14115z()
            java.lang.String r6 = "app_instance_id"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r6, r4)
            java.lang.String r4 = "platform"
            java.lang.String r6 = "android"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r4, r6)
            b.l.a.c.h.b.p4 r0 = r0.f5638a
            b.l.a.c.h.b.f r0 = r0.f5848g
            r0.mo14193n()
            r6 = 39065(0x9899, double:1.93007E-319)
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r4 = "gmp_version"
            r2.appendQueryParameter(r4, r0)
            android.net.Uri r0 = r3.build()
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = r14.mo14114y()     // Catch:{ MalformedURLException -> 0x0168 }
            java.util.Objects.requireNonNull(r8, r1)     // Catch:{ MalformedURLException -> 0x0168 }
            java.net.URL r9 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0168 }
            r9.<init>(r0)     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.h.b.o3 r1 = r13.mo14329d()     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.h.b.m3 r1 = r1.f5807n     // Catch:{ MalformedURLException -> 0x0168 }
            java.lang.String r2 = "Fetching remote configuration"
            r1.mo14415b(r2, r8)     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.h.b.i4 r1 = r13.f5648a     // Catch:{ MalformedURLException -> 0x0168 }
            m6111F(r1)     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.e.i.d1 r1 = r1.mo14268l(r8)     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.h.b.i4 r2 = r13.f5648a     // Catch:{ MalformedURLException -> 0x0168 }
            m6111F(r2)     // Catch:{ MalformedURLException -> 0x0168 }
            r2.mo14126h()     // Catch:{ MalformedURLException -> 0x0168 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f5604i     // Catch:{ MalformedURLException -> 0x0168 }
            java.lang.Object r2 = r2.get(r8)     // Catch:{ MalformedURLException -> 0x0168 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ MalformedURLException -> 0x0168 }
            if (r1 == 0) goto L_0x0143
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ MalformedURLException -> 0x0168 }
            if (r1 != 0) goto L_0x0143
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap     // Catch:{ MalformedURLException -> 0x0168 }
            r5.<init>()     // Catch:{ MalformedURLException -> 0x0168 }
            java.lang.String r1 = "If-Modified-Since"
            r5.put(r1, r2)     // Catch:{ MalformedURLException -> 0x0168 }
        L_0x0143:
            r11 = r5
            r1 = 1
            r13.f5665r = r1     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.h.b.t3 r7 = r13.f5649b     // Catch:{ MalformedURLException -> 0x0168 }
            m6111F(r7)     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.h.b.e9 r12 = new b.l.a.c.h.b.e9     // Catch:{ MalformedURLException -> 0x0168 }
            r12.<init>(r13)     // Catch:{ MalformedURLException -> 0x0168 }
            r7.mo14126h()     // Catch:{ MalformedURLException -> 0x0168 }
            r7.mo14646i()     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.h.b.p4 r1 = r7.f5638a     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.h.b.m4 r1 = r1.mo14331f()     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.h.b.s3 r2 = new b.l.a.c.h.b.s3     // Catch:{ MalformedURLException -> 0x0168 }
            r10 = 0
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ MalformedURLException -> 0x0168 }
            r1.mo14423t(r2)     // Catch:{ MalformedURLException -> 0x0168 }
            return
        L_0x0168:
            b.l.a.c.h.b.o3 r1 = r13.mo14329d()
            b.l.a.c.h.b.m3 r1 = r1.f5799f
            java.lang.String r14 = r14.mo14114y()
            java.lang.Object r14 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r14)
            java.lang.String r2 = "Failed to parse config URL. Not fetching. appId"
            r1.mo14416c(r2, r14, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.mo14358i(b.l.a.c.h.b.a5):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047 A[Catch:{ all -> 0x0058, all -> 0x0171 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b A[Catch:{ all -> 0x0058, all -> 0x0171 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0123 A[Catch:{ all -> 0x0058, all -> 0x0171 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012f A[Catch:{ all -> 0x0058, all -> 0x0171 }] */
    @androidx.annotation.WorkerThread
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14359j(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12) {
        /*
            r7 = this;
            b.l.a.c.h.b.m4 r0 = r7.mo14331f()
            r0.mo14126h()
            r7.mo14347M()
            p005b.p006a.p007a.p024o.C0823f.m376j(r8)
            r0 = 0
            if (r11 != 0) goto L_0x0012
            byte[] r11 = new byte[r0]     // Catch:{ all -> 0x0171 }
        L_0x0012:
            b.l.a.c.h.b.o3 r1 = r7.mo14329d()     // Catch:{ all -> 0x0171 }
            b.l.a.c.h.b.m3 r1 = r1.f5807n     // Catch:{ all -> 0x0171 }
            int r2 = r11.length     // Catch:{ all -> 0x0171 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0171 }
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.mo14415b(r3, r2)     // Catch:{ all -> 0x0171 }
            b.l.a.c.h.b.j r1 = r7.f5650c     // Catch:{ all -> 0x0171 }
            m6111F(r1)     // Catch:{ all -> 0x0171 }
            r1.mo14317x()     // Catch:{ all -> 0x0171 }
            b.l.a.c.h.b.j r1 = r7.f5650c     // Catch:{ all -> 0x0058 }
            m6111F(r1)     // Catch:{ all -> 0x0058 }
            b.l.a.c.h.b.a5 r1 = r1.mo14299N(r8)     // Catch:{ all -> 0x0058 }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r9 == r3) goto L_0x0040
            r3 = 204(0xcc, float:2.86E-43)
            if (r9 == r3) goto L_0x0040
            if (r9 != r4) goto L_0x0044
            r9 = r4
        L_0x0040:
            if (r10 != 0) goto L_0x0044
            r3 = 1
            goto L_0x0045
        L_0x0044:
            r3 = r0
        L_0x0045:
            if (r1 != 0) goto L_0x005b
            b.l.a.c.h.b.o3 r9 = r7.mo14329d()     // Catch:{ all -> 0x0058 }
            b.l.a.c.h.b.m3 r9 = r9.f5802i     // Catch:{ all -> 0x0058 }
            java.lang.String r10 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r8 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r8)     // Catch:{ all -> 0x0058 }
            r9.mo14415b(r10, r8)     // Catch:{ all -> 0x0058 }
            goto L_0x0152
        L_0x0058:
            r8 = move-exception
            goto L_0x0168
        L_0x005b:
            r5 = 404(0x194, float:5.66E-43)
            r6 = 0
            if (r3 != 0) goto L_0x00cc
            if (r9 != r5) goto L_0x0063
            goto L_0x00cc
        L_0x0063:
            b.l.a.c.b.p.b r11 = r7.mo14330e()     // Catch:{ all -> 0x0058 }
            b.l.a.c.b.p.c r11 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r11     // Catch:{ all -> 0x0058 }
            java.util.Objects.requireNonNull(r11)     // Catch:{ all -> 0x0058 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0058 }
            r1.mo14102m(r11)     // Catch:{ all -> 0x0058 }
            b.l.a.c.h.b.j r11 = r7.f5650c     // Catch:{ all -> 0x0058 }
            m6111F(r11)     // Catch:{ all -> 0x0058 }
            r11.mo14300O(r1)     // Catch:{ all -> 0x0058 }
            b.l.a.c.h.b.o3 r11 = r7.mo14329d()     // Catch:{ all -> 0x0058 }
            b.l.a.c.h.b.m3 r11 = r11.f5807n     // Catch:{ all -> 0x0058 }
            java.lang.String r12 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0058 }
            r11.mo14416c(r12, r1, r10)     // Catch:{ all -> 0x0058 }
            b.l.a.c.h.b.i4 r10 = r7.f5648a     // Catch:{ all -> 0x0058 }
            m6111F(r10)     // Catch:{ all -> 0x0058 }
            r10.mo14126h()     // Catch:{ all -> 0x0058 }
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.f5604i     // Catch:{ all -> 0x0058 }
            r10.put(r8, r6)     // Catch:{ all -> 0x0058 }
            b.l.a.c.h.b.g8 r8 = r7.f5656i     // Catch:{ all -> 0x0058 }
            b.l.a.c.h.b.y3 r8 = r8.f5562j     // Catch:{ all -> 0x0058 }
            b.l.a.c.b.p.b r10 = r7.mo14330e()     // Catch:{ all -> 0x0058 }
            b.l.a.c.b.p.c r10 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r10     // Catch:{ all -> 0x0058 }
            java.util.Objects.requireNonNull(r10)     // Catch:{ all -> 0x0058 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0058 }
            r8.mo14634b(r10)     // Catch:{ all -> 0x0058 }
            r8 = 503(0x1f7, float:7.05E-43)
            if (r9 == r8) goto L_0x00b3
            r8 = 429(0x1ad, float:6.01E-43)
            if (r9 != r8) goto L_0x00c7
        L_0x00b3:
            b.l.a.c.h.b.g8 r8 = r7.f5656i     // Catch:{ all -> 0x0058 }
            b.l.a.c.h.b.y3 r8 = r8.f5560h     // Catch:{ all -> 0x0058 }
            b.l.a.c.b.p.b r9 = r7.mo14330e()     // Catch:{ all -> 0x0058 }
            b.l.a.c.b.p.c r9 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r9     // Catch:{ all -> 0x0058 }
            java.util.Objects.requireNonNull(r9)     // Catch:{ all -> 0x0058 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0058 }
            r8.mo14634b(r9)     // Catch:{ all -> 0x0058 }
        L_0x00c7:
            r7.mo14336A()     // Catch:{ all -> 0x0058 }
            goto L_0x0152
        L_0x00cc:
            if (r12 == 0) goto L_0x00d7
            java.lang.String r10 = "Last-Modified"
            java.lang.Object r10 = r12.get(r10)     // Catch:{ all -> 0x0058 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x0058 }
            goto L_0x00d8
        L_0x00d7:
            r10 = r6
        L_0x00d8:
            if (r10 == 0) goto L_0x00e7
            int r12 = r10.size()     // Catch:{ all -> 0x0058 }
            if (r12 <= 0) goto L_0x00e7
            java.lang.Object r10 = r10.get(r0)     // Catch:{ all -> 0x0058 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0058 }
            goto L_0x00e8
        L_0x00e7:
            r10 = r6
        L_0x00e8:
            if (r9 == r5) goto L_0x00f6
            if (r9 != r4) goto L_0x00ed
            goto L_0x00f6
        L_0x00ed:
            b.l.a.c.h.b.i4 r12 = r7.f5648a     // Catch:{ all -> 0x0058 }
            m6111F(r12)     // Catch:{ all -> 0x0058 }
            r12.mo14270n(r8, r11, r10)     // Catch:{ all -> 0x0058 }
            goto L_0x0109
        L_0x00f6:
            b.l.a.c.h.b.i4 r10 = r7.f5648a     // Catch:{ all -> 0x0058 }
            m6111F(r10)     // Catch:{ all -> 0x0058 }
            b.l.a.c.e.i.d1 r10 = r10.mo14268l(r8)     // Catch:{ all -> 0x0058 }
            if (r10 != 0) goto L_0x0109
            b.l.a.c.h.b.i4 r10 = r7.f5648a     // Catch:{ all -> 0x0058 }
            m6111F(r10)     // Catch:{ all -> 0x0058 }
            r10.mo14270n(r8, r6, r6)     // Catch:{ all -> 0x0058 }
        L_0x0109:
            b.l.a.c.b.p.b r10 = r7.mo14330e()     // Catch:{ all -> 0x0058 }
            b.l.a.c.b.p.c r10 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r10     // Catch:{ all -> 0x0058 }
            java.util.Objects.requireNonNull(r10)     // Catch:{ all -> 0x0058 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0058 }
            r1.mo14100k(r10)     // Catch:{ all -> 0x0058 }
            b.l.a.c.h.b.j r10 = r7.f5650c     // Catch:{ all -> 0x0058 }
            m6111F(r10)     // Catch:{ all -> 0x0058 }
            r10.mo14300O(r1)     // Catch:{ all -> 0x0058 }
            if (r9 != r5) goto L_0x012f
            b.l.a.c.h.b.o3 r9 = r7.mo14329d()     // Catch:{ all -> 0x0058 }
            b.l.a.c.h.b.m3 r9 = r9.f5804k     // Catch:{ all -> 0x0058 }
            java.lang.String r10 = "Config not found. Using empty config. appId"
            r9.mo14415b(r10, r8)     // Catch:{ all -> 0x0058 }
            goto L_0x013e
        L_0x012f:
            b.l.a.c.h.b.o3 r8 = r7.mo14329d()     // Catch:{ all -> 0x0058 }
            b.l.a.c.h.b.m3 r8 = r8.f5807n     // Catch:{ all -> 0x0058 }
            java.lang.String r10 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0058 }
            r8.mo14416c(r10, r9, r2)     // Catch:{ all -> 0x0058 }
        L_0x013e:
            b.l.a.c.h.b.t3 r8 = r7.f5649b     // Catch:{ all -> 0x0058 }
            m6111F(r8)     // Catch:{ all -> 0x0058 }
            boolean r8 = r8.mo14591l()     // Catch:{ all -> 0x0058 }
            if (r8 == 0) goto L_0x00c7
            boolean r8 = r7.mo14372z()     // Catch:{ all -> 0x0058 }
            if (r8 == 0) goto L_0x00c7
            r7.mo14357h()     // Catch:{ all -> 0x0058 }
        L_0x0152:
            b.l.a.c.h.b.j r8 = r7.f5650c     // Catch:{ all -> 0x0058 }
            m6111F(r8)     // Catch:{ all -> 0x0058 }
            r8.mo14318y()     // Catch:{ all -> 0x0058 }
            b.l.a.c.h.b.j r8 = r7.f5650c     // Catch:{ all -> 0x0171 }
            m6111F(r8)     // Catch:{ all -> 0x0171 }
            r8.mo14319z()     // Catch:{ all -> 0x0171 }
            r7.f5665r = r0
            r7.mo14337B()
            return
        L_0x0168:
            b.l.a.c.h.b.j r9 = r7.f5650c     // Catch:{ all -> 0x0171 }
            m6111F(r9)     // Catch:{ all -> 0x0171 }
            r9.mo14319z()     // Catch:{ all -> 0x0171 }
            throw r8     // Catch:{ all -> 0x0171 }
        L_0x0171:
            r8 = move-exception
            r7.f5665r = r0
            r7.mo14337B()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.mo14359j(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.WorkerThread
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14360k() {
        /*
            r10 = this;
            b.l.a.c.h.b.m4 r0 = r10.mo14331f()
            r0.mo14126h()
            r10.mo14347M()
            boolean r0 = r10.f5660m
            if (r0 != 0) goto L_0x01a5
            r0 = 1
            r10.f5660m = r0
            b.l.a.c.h.b.m4 r1 = r10.mo14331f()
            r1.mo14126h()
            b.l.a.c.h.b.f r1 = r10.mo14341G()
            b.l.a.c.h.b.a3<java.lang.Boolean> r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5383g0
            r3 = 0
            boolean r1 = r1.mo14197r(r3, r2)
            java.lang.String r2 = "Storage concurrent access okay"
            r4 = 0
            if (r1 == 0) goto L_0x003e
            java.nio.channels.FileLock r1 = r10.f5668u
            if (r1 == 0) goto L_0x003e
            boolean r1 = r1.isValid()
            if (r1 != 0) goto L_0x0033
            goto L_0x003e
        L_0x0033:
            b.l.a.c.h.b.o3 r1 = r10.mo14329d()
            b.l.a.c.h.b.m3 r1 = r1.f5807n
            r1.mo14414a(r2)
        L_0x003c:
            r1 = r0
            goto L_0x009f
        L_0x003e:
            b.l.a.c.h.b.j r1 = r10.f5650c
            b.l.a.c.h.b.p4 r1 = r1.f5638a
            b.l.a.c.h.b.f r1 = r1.f5848g
            b.l.a.c.h.b.p4 r1 = r10.f5658k
            android.content.Context r1 = r1.f5842a
            java.io.File r1 = r1.getFilesDir()
            java.io.File r5 = new java.io.File
            java.lang.String r6 = "google_app_measurement.db"
            r5.<init>(r1, r6)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0088, OverlappingFileLockException -> 0x007e }
            java.lang.String r6 = "rw"
            r1.<init>(r5, r6)     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0088, OverlappingFileLockException -> 0x007e }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0088, OverlappingFileLockException -> 0x007e }
            r10.f5669v = r1     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0088, OverlappingFileLockException -> 0x007e }
            java.nio.channels.FileLock r1 = r1.tryLock()     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0088, OverlappingFileLockException -> 0x007e }
            r10.f5668u = r1     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0088, OverlappingFileLockException -> 0x007e }
            if (r1 == 0) goto L_0x0072
            b.l.a.c.h.b.o3 r1 = r10.mo14329d()     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0088, OverlappingFileLockException -> 0x007e }
            b.l.a.c.h.b.m3 r1 = r1.f5807n     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0088, OverlappingFileLockException -> 0x007e }
            r1.mo14414a(r2)     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0088, OverlappingFileLockException -> 0x007e }
            goto L_0x003c
        L_0x0072:
            b.l.a.c.h.b.o3 r1 = r10.mo14329d()     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0088, OverlappingFileLockException -> 0x007e }
            b.l.a.c.h.b.m3 r1 = r1.f5799f     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0088, OverlappingFileLockException -> 0x007e }
            java.lang.String r2 = "Storage concurrent data access panic"
            r1.mo14414a(r2)     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0088, OverlappingFileLockException -> 0x007e }
            goto L_0x009e
        L_0x007e:
            r1 = move-exception
            b.l.a.c.h.b.o3 r2 = r10.mo14329d()
            b.l.a.c.h.b.m3 r2 = r2.f5802i
            java.lang.String r5 = "Storage lock already acquired"
            goto L_0x009b
        L_0x0088:
            r1 = move-exception
            b.l.a.c.h.b.o3 r2 = r10.mo14329d()
            b.l.a.c.h.b.m3 r2 = r2.f5799f
            java.lang.String r5 = "Failed to access storage lock file"
            goto L_0x009b
        L_0x0092:
            r1 = move-exception
            b.l.a.c.h.b.o3 r2 = r10.mo14329d()
            b.l.a.c.h.b.m3 r2 = r2.f5799f
            java.lang.String r5 = "Failed to acquire storage lock"
        L_0x009b:
            r2.mo14415b(r5, r1)
        L_0x009e:
            r1 = r4
        L_0x009f:
            if (r1 == 0) goto L_0x01a5
            java.nio.channels.FileChannel r1 = r10.f5669v
            b.l.a.c.h.b.m4 r2 = r10.mo14331f()
            r2.mo14126h()
            r5 = 0
            java.lang.String r2 = "Bad channel to read from"
            r7 = 4
            if (r1 == 0) goto L_0x00ed
            boolean r8 = r1.isOpen()
            if (r8 != 0) goto L_0x00b8
            goto L_0x00ed
        L_0x00b8:
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r7)
            r1.position(r5)     // Catch:{ IOException -> 0x00e0 }
            int r1 = r1.read(r8)     // Catch:{ IOException -> 0x00e0 }
            if (r1 == r7) goto L_0x00d8
            r8 = -1
            if (r1 == r8) goto L_0x00f6
            b.l.a.c.h.b.o3 r8 = r10.mo14329d()     // Catch:{ IOException -> 0x00e0 }
            b.l.a.c.h.b.m3 r8 = r8.f5802i     // Catch:{ IOException -> 0x00e0 }
            java.lang.String r9 = "Unexpected data length. Bytes read"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00e0 }
            r8.mo14415b(r9, r1)     // Catch:{ IOException -> 0x00e0 }
            goto L_0x00f6
        L_0x00d8:
            r8.flip()     // Catch:{ IOException -> 0x00e0 }
            int r4 = r8.getInt()     // Catch:{ IOException -> 0x00e0 }
            goto L_0x00f6
        L_0x00e0:
            r1 = move-exception
            b.l.a.c.h.b.o3 r8 = r10.mo14329d()
            b.l.a.c.h.b.m3 r8 = r8.f5799f
            java.lang.String r9 = "Failed to read from channel"
            r8.mo14415b(r9, r1)
            goto L_0x00f6
        L_0x00ed:
            b.l.a.c.h.b.o3 r1 = r10.mo14329d()
            b.l.a.c.h.b.m3 r1 = r1.f5799f
            r1.mo14414a(r2)
        L_0x00f6:
            b.l.a.c.h.b.p4 r1 = r10.f5658k
            b.l.a.c.h.b.g3 r1 = r1.mo14457b()
            r1.mo14065i()
            int r1 = r1.f5537e
            b.l.a.c.h.b.m4 r8 = r10.mo14331f()
            r8.mo14126h()
            if (r4 <= r1) goto L_0x011e
            b.l.a.c.h.b.o3 r0 = r10.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5799f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Panic: can't downgrade version. Previous, current version"
        L_0x011a:
            r0.mo14416c(r3, r2, r1)
            return
        L_0x011e:
            if (r4 >= r1) goto L_0x01a5
            java.nio.channels.FileChannel r8 = r10.f5669v
            b.l.a.c.h.b.m4 r9 = r10.mo14331f()
            r9.mo14126h()
            if (r8 == 0) goto L_0x018a
            boolean r9 = r8.isOpen()
            if (r9 != 0) goto L_0x0132
            goto L_0x018a
        L_0x0132:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r7)
            r2.putInt(r1)
            r2.flip()
            r8.truncate(r5)     // Catch:{ IOException -> 0x017d }
            b.l.a.c.h.b.f r5 = r10.mo14341G()     // Catch:{ IOException -> 0x017d }
            b.l.a.c.h.b.a3<java.lang.Boolean> r6 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5403q0     // Catch:{ IOException -> 0x017d }
            boolean r3 = r5.mo14197r(r3, r6)     // Catch:{ IOException -> 0x017d }
            r8.write(r2)     // Catch:{ IOException -> 0x017d }
            r8.force(r0)     // Catch:{ IOException -> 0x017d }
            long r2 = r8.size()     // Catch:{ IOException -> 0x017d }
            r5 = 4
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x016c
            b.l.a.c.h.b.o3 r0 = r10.mo14329d()     // Catch:{ IOException -> 0x017d }
            b.l.a.c.h.b.m3 r0 = r0.f5799f     // Catch:{ IOException -> 0x017d }
            java.lang.String r2 = "Error writing to channel. Bytes written"
            long r5 = r8.size()     // Catch:{ IOException -> 0x017d }
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ IOException -> 0x017d }
            r0.mo14415b(r2, r3)     // Catch:{ IOException -> 0x017d }
        L_0x016c:
            b.l.a.c.h.b.o3 r0 = r10.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5807n
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Storage version upgraded. Previous, current version"
            goto L_0x011a
        L_0x017d:
            r0 = move-exception
            b.l.a.c.h.b.o3 r2 = r10.mo14329d()
            b.l.a.c.h.b.m3 r2 = r2.f5799f
            java.lang.String r3 = "Failed to write to channel"
            r2.mo14415b(r3, r0)
            goto L_0x0193
        L_0x018a:
            b.l.a.c.h.b.o3 r0 = r10.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5799f
            r0.mo14414a(r2)
        L_0x0193:
            b.l.a.c.h.b.o3 r0 = r10.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5799f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Storage version upgrade failed. Previous, current version"
            goto L_0x011a
        L_0x01a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.mo14360k():void");
    }

    @WorkerThread
    /* renamed from: l */
    public final void mo14361l(C3352v9 v9Var) {
        if (this.f5670w != null) {
            ArrayList arrayList = new ArrayList();
            this.f5671x = arrayList;
            arrayList.addAll(this.f5670w);
        }
        C3210j jVar = this.f5650c;
        m6111F(jVar);
        String str = v9Var.f6029g;
        Objects.requireNonNull(str, "null reference");
        C0823f.m376j(str);
        jVar.mo14126h();
        jVar.mo14646i();
        try {
            SQLiteDatabase A = jVar.mo14286A();
            String[] strArr = {str};
            int delete = A.delete("apps", "app_id=?", strArr) + A.delete(DatabaseHelper.EVENT_TABLE_NAME, "app_id=?", strArr) + A.delete("user_attributes", "app_id=?", strArr) + A.delete("conditional_properties", "app_id=?", strArr) + A.delete("raw_events", "app_id=?", strArr) + A.delete("raw_events_metadata", "app_id=?", strArr) + A.delete("queue", "app_id=?", strArr) + A.delete("audience_filter_values", "app_id=?", strArr) + A.delete("main_event_params", "app_id=?", strArr) + A.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                jVar.f5638a.mo14329d().f5807n.mo14416c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            jVar.f5638a.mo14329d().f5799f.mo14416c("Error resetting analytics data. appId, error", C3269o3.m6253t(str), e);
        }
        if (v9Var.f6036n) {
            mo14364o(v9Var);
        }
    }

    @WorkerThread
    /* renamed from: m */
    public final void mo14362m(C3253m9 m9Var, C3352v9 v9Var) {
        long j;
        C3253m9 m9Var2 = m9Var;
        C3352v9 v9Var2 = v9Var;
        mo14331f().mo14126h();
        mo14347M();
        if (mo14340E(v9Var2)) {
            if (!v9Var2.f6036n) {
                mo14367r(v9Var2);
                return;
            }
            int m0 = mo14346L().mo14542m0(m9Var2.f5751h);
            int i = 0;
            C3297q9 L = mo14346L();
            if (m0 != 0) {
                String str = m9Var2.f5751h;
                mo14341G();
                String q = L.mo14548q(str, 24, true);
                String str2 = m9Var2.f5751h;
                mo14346L().mo14515A(this.f5647A, v9Var2.f6029g, m0, "_ev", q, str2 != null ? str2.length() : 0, mo14341G().mo14197r((String) null, C3134c3.f5419y0));
                return;
            }
            int x = L.mo14557x(m9Var2.f5751h, m9Var.mo14428V());
            if (x != 0) {
                C3297q9 L2 = mo14346L();
                String str3 = m9Var2.f5751h;
                mo14341G();
                String q2 = L2.mo14548q(str3, 24, true);
                Object V = m9Var.mo14428V();
                if (V != null && ((V instanceof String) || (V instanceof CharSequence))) {
                    i = String.valueOf(V).length();
                }
                mo14346L().mo14515A(this.f5647A, v9Var2.f6029g, x, "_ev", q2, i, mo14341G().mo14197r((String) null, C3134c3.f5419y0));
                return;
            }
            Object y = mo14346L().mo14558y(m9Var2.f5751h, m9Var.mo14428V());
            if (y != null) {
                if ("_sid".equals(m9Var2.f5751h)) {
                    long j2 = m9Var2.f5752i;
                    String str4 = m9Var2.f5755l;
                    String str5 = v9Var2.f6029g;
                    Objects.requireNonNull(str5, "null reference");
                    C3210j jVar = this.f5650c;
                    m6111F(jVar);
                    C3275o9 F = jVar.mo14291F(str5, "_sno");
                    if (F != null) {
                        Object obj = F.f5823e;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            mo14362m(new C3253m9("_sno", j2, Long.valueOf(j + 1), str4), v9Var2);
                        }
                    }
                    if (F != null) {
                        mo14329d().f5802i.mo14415b("Retrieved last session number from database does not contain a valid (long) value", F.f5823e);
                    }
                    C3210j jVar2 = this.f5650c;
                    m6111F(jVar2);
                    C3265o B = jVar2.mo14287B(str5, "_s");
                    if (B != null) {
                        j = B.f5784c;
                        mo14329d().f5807n.mo14415b("Backfill the session number. Last used session number", Long.valueOf(j));
                    } else {
                        j = 0;
                    }
                    mo14362m(new C3253m9("_sno", j2, Long.valueOf(j + 1), str4), v9Var2);
                }
                String str6 = v9Var2.f6029g;
                Objects.requireNonNull(str6, "null reference");
                String str7 = m9Var2.f5755l;
                Objects.requireNonNull(str7, "null reference");
                C3275o9 o9Var = new C3275o9(str6, str7, m9Var2.f5751h, m9Var2.f5752i, y);
                mo14329d().f5807n.mo14416c("Setting user property", this.f5658k.mo14468u().mo14323r(o9Var.f5821c), y);
                C3210j jVar3 = this.f5650c;
                m6111F(jVar3);
                jVar3.mo14317x();
                try {
                    mo14367r(v9Var2);
                    C3210j jVar4 = this.f5650c;
                    m6111F(jVar4);
                    boolean E = jVar4.mo14290E(o9Var);
                    C3210j jVar5 = this.f5650c;
                    m6111F(jVar5);
                    jVar5.mo14318y();
                    if (!E) {
                        mo14329d().f5799f.mo14416c("Too many unique user properties are set. Ignoring user property", this.f5658k.mo14468u().mo14323r(o9Var.f5821c), o9Var.f5823e);
                        mo14346L().mo14515A(this.f5647A, v9Var2.f6029g, 9, (String) null, (String) null, 0, mo14341G().mo14197r((String) null, C3134c3.f5419y0));
                    }
                } finally {
                    C3210j jVar6 = this.f5650c;
                    m6111F(jVar6);
                    jVar6.mo14319z();
                }
            }
        }
    }

    @WorkerThread
    /* renamed from: n */
    public final void mo14363n(C3253m9 m9Var, C3352v9 v9Var) {
        mo14331f().mo14126h();
        mo14347M();
        if (mo14340E(v9Var)) {
            if (!v9Var.f6036n) {
                mo14367r(v9Var);
            } else if (!"_npa".equals(m9Var.f5751h) || v9Var.f6046x == null) {
                mo14329d().f5806m.mo14415b("Removing user property", this.f5658k.mo14468u().mo14323r(m9Var.f5751h));
                C3210j jVar = this.f5650c;
                m6111F(jVar);
                jVar.mo14317x();
                try {
                    mo14367r(v9Var);
                    C3210j jVar2 = this.f5650c;
                    m6111F(jVar2);
                    String str = v9Var.f6029g;
                    Objects.requireNonNull(str, "null reference");
                    jVar2.mo14289D(str, m9Var.f5751h);
                    C3210j jVar3 = this.f5650c;
                    m6111F(jVar3);
                    jVar3.mo14318y();
                    mo14329d().f5806m.mo14415b("User property removed", this.f5658k.mo14468u().mo14323r(m9Var.f5751h));
                } finally {
                    C3210j jVar4 = this.f5650c;
                    m6111F(jVar4);
                    jVar4.mo14319z();
                }
            } else {
                mo14329d().f5806m.mo14414a("Falling back to manifest metadata value for ad personalization");
                Objects.requireNonNull((C1959c) mo14330e());
                mo14362m(new C3253m9("_npa", System.currentTimeMillis(), Long.valueOf(true != v9Var.f6046x.booleanValue() ? 0 : 1), "auto"), v9Var);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x03c0 A[Catch:{ SQLiteException -> 0x01cf, all -> 0x057d }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03e6 A[Catch:{ SQLiteException -> 0x01cf, all -> 0x057d }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03fb A[SYNTHETIC, Splitter:B:129:0x03fb] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0498 A[Catch:{ SQLiteException -> 0x01cf, all -> 0x057d }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04b4 A[Catch:{ SQLiteException -> 0x01cf, all -> 0x057d }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x054f A[Catch:{ SQLiteException -> 0x01cf, all -> 0x057d }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012f A[Catch:{ SQLiteException -> 0x01cf, all -> 0x057d }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01e3 A[Catch:{ SQLiteException -> 0x01cf, all -> 0x057d }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01e7 A[Catch:{ SQLiteException -> 0x01cf, all -> 0x057d }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0243 A[Catch:{ SQLiteException -> 0x01cf, all -> 0x057d }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0252 A[Catch:{ SQLiteException -> 0x01cf, all -> 0x057d }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0262 A[Catch:{ SQLiteException -> 0x01cf, all -> 0x057d }] */
    @androidx.annotation.WorkerThread
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14364o(p005b.p096l.p097a.p113c.p145h.p147b.C3352v9 r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r7 = "_uwa"
            java.lang.String r0 = "app_id=?"
            b.l.a.c.h.b.m4 r8 = r23.mo14331f()
            r8.mo14126h()
            r23.mo14347M()
            java.lang.String r8 = "null reference"
            java.util.Objects.requireNonNull(r2, r8)
            java.lang.String r9 = r2.f6029g
            p005b.p006a.p007a.p024o.C0823f.m376j(r9)
            boolean r9 = r23.mo14340E(r24)
            if (r9 == 0) goto L_0x0587
            b.l.a.c.h.b.j r9 = r1.f5650c
            m6111F(r9)
            java.lang.String r10 = r2.f6029g
            b.l.a.c.h.b.a5 r9 = r9.mo14299N(r10)
            r10 = 0
            if (r9 == 0) goto L_0x0065
            java.lang.String r12 = r9.mo14069B()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x0065
            java.lang.String r12 = r2.f6030h
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0065
            r9.mo14100k(r10)
            b.l.a.c.h.b.j r12 = r1.f5650c
            m6111F(r12)
            r12.mo14300O(r9)
            b.l.a.c.h.b.i4 r9 = r1.f5648a
            m6111F(r9)
            java.lang.String r12 = r2.f6029g
            r9.mo14126h()
            java.util.Map<java.lang.String, b.l.a.c.e.i.d1> r9 = r9.f5602g
            r9.remove(r12)
        L_0x0065:
            boolean r9 = r2.f6036n
            if (r9 != 0) goto L_0x006d
            r23.mo14367r(r24)
            return
        L_0x006d:
            long r12 = r2.f6041s
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0080
            b.l.a.c.b.p.b r9 = r23.mo14330e()
            b.l.a.c.b.p.c r9 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r9
            java.util.Objects.requireNonNull(r9)
            long r12 = java.lang.System.currentTimeMillis()
        L_0x0080:
            b.l.a.c.h.b.p4 r9 = r1.f5658k
            b.l.a.c.h.b.m r9 = r9.mo14456A()
            r9.mo14126h()
            r15 = 0
            r9.f5719f = r15
            r9.f5720g = r10
            int r9 = r2.f6042t
            r14 = 1
            if (r9 == 0) goto L_0x00ab
            if (r9 == r14) goto L_0x00ab
            b.l.a.c.h.b.o3 r11 = r23.mo14329d()
            b.l.a.c.h.b.m3 r11 = r11.f5802i
            java.lang.String r15 = r2.f6029g
            java.lang.Object r15 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r15)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r10 = "Incorrect app type, assuming installed app. appId, appType"
            r11.mo14416c(r10, r15, r9)
            r9 = 0
        L_0x00ab:
            b.l.a.c.h.b.j r10 = r1.f5650c
            m6111F(r10)
            r10.mo14317x()
            b.l.a.c.h.b.j r10 = r1.f5650c     // Catch:{ all -> 0x057d }
            m6111F(r10)     // Catch:{ all -> 0x057d }
            java.lang.String r11 = r2.f6029g     // Catch:{ all -> 0x057d }
            java.lang.String r15 = "_npa"
            b.l.a.c.h.b.o9 r10 = r10.mo14291F(r11, r15)     // Catch:{ all -> 0x057d }
            if (r10 == 0) goto L_0x00d0
            java.lang.String r11 = "auto"
            java.lang.String r14 = r10.f5820b     // Catch:{ all -> 0x057d }
            boolean r11 = r11.equals(r14)     // Catch:{ all -> 0x057d }
            if (r11 == 0) goto L_0x00cd
            goto L_0x00d0
        L_0x00cd:
            r22 = r3
            goto L_0x011f
        L_0x00d0:
            java.lang.Boolean r11 = r2.f6046x     // Catch:{ all -> 0x057d }
            if (r11 == 0) goto L_0x010a
            b.l.a.c.h.b.m9 r15 = new b.l.a.c.h.b.m9     // Catch:{ all -> 0x057d }
            java.lang.String r20 = "_npa"
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x057d }
            r14 = 1
            if (r14 == r11) goto L_0x00e2
            r21 = 0
            goto L_0x00e4
        L_0x00e2:
            r21 = 1
        L_0x00e4:
            java.lang.Long r11 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x057d }
            java.lang.String r21 = "auto"
            r22 = r3
            r3 = r14
            r14 = r15
            r3 = r15
            r15 = r20
            r16 = r12
            r18 = r11
            r19 = r21
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x057d }
            if (r10 == 0) goto L_0x0106
            java.lang.Object r10 = r10.f5823e     // Catch:{ all -> 0x057d }
            java.lang.Long r11 = r3.f5753j     // Catch:{ all -> 0x057d }
            boolean r10 = r10.equals(r11)     // Catch:{ all -> 0x057d }
            if (r10 != 0) goto L_0x011f
        L_0x0106:
            r1.mo14362m(r3, r2)     // Catch:{ all -> 0x057d }
            goto L_0x011f
        L_0x010a:
            r22 = r3
            if (r10 == 0) goto L_0x011f
            b.l.a.c.h.b.m9 r3 = new b.l.a.c.h.b.m9     // Catch:{ all -> 0x057d }
            java.lang.String r15 = "_npa"
            r18 = 0
            java.lang.String r19 = "auto"
            r14 = r3
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x057d }
            r1.mo14363n(r3, r2)     // Catch:{ all -> 0x057d }
        L_0x011f:
            b.l.a.c.h.b.j r3 = r1.f5650c     // Catch:{ all -> 0x057d }
            m6111F(r3)     // Catch:{ all -> 0x057d }
            java.lang.String r10 = r2.f6029g     // Catch:{ all -> 0x057d }
            java.util.Objects.requireNonNull(r10, r8)     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.a5 r15 = r3.mo14299N(r10)     // Catch:{ all -> 0x057d }
            if (r15 == 0) goto L_0x01e3
            b.l.a.c.h.b.q9 r3 = r23.mo14346L()     // Catch:{ all -> 0x057d }
            java.lang.String r10 = r2.f6030h     // Catch:{ all -> 0x057d }
            java.lang.String r11 = r15.mo14069B()     // Catch:{ all -> 0x057d }
            java.lang.String r14 = r2.f6045w     // Catch:{ all -> 0x057d }
            r20 = r4
            java.lang.String r4 = r15.mo14071D()     // Catch:{ all -> 0x057d }
            boolean r3 = r3.mo14546p(r10, r11, r14, r4)     // Catch:{ all -> 0x057d }
            if (r3 == 0) goto L_0x01e5
            b.l.a.c.h.b.o3 r3 = r23.mo14329d()     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.m3 r3 = r3.f5802i     // Catch:{ all -> 0x057d }
            java.lang.String r4 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r10 = r15.mo14114y()     // Catch:{ all -> 0x057d }
            java.lang.Object r10 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r10)     // Catch:{ all -> 0x057d }
            r3.mo14415b(r4, r10)     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.j r3 = r1.f5650c     // Catch:{ all -> 0x057d }
            m6111F(r3)     // Catch:{ all -> 0x057d }
            java.lang.String r4 = r15.mo14114y()     // Catch:{ all -> 0x057d }
            r3.mo14646i()     // Catch:{ all -> 0x057d }
            r3.mo14126h()     // Catch:{ all -> 0x057d }
            p005b.p006a.p007a.p024o.C0823f.m376j(r4)     // Catch:{ all -> 0x057d }
            android.database.sqlite.SQLiteDatabase r10 = r3.mo14286A()     // Catch:{ SQLiteException -> 0x01cf }
            r11 = 1
            java.lang.String[] r14 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01cf }
            r11 = 0
            r14[r11] = r4     // Catch:{ SQLiteException -> 0x01cf }
            java.lang.String r11 = "events"
            int r11 = r10.delete(r11, r0, r14)     // Catch:{ SQLiteException -> 0x01cf }
            java.lang.String r15 = "user_attributes"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r11 = r11 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r11 = r11 + r15
            java.lang.String r15 = "apps"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r11 = r11 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r11 = r11 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r11 = r11 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r11 = r11 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r11 = r11 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r11 = r11 + r15
            java.lang.String r15 = "consent_settings"
            int r0 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r11 = r11 + r0
            if (r11 <= 0) goto L_0x01e1
            b.l.a.c.h.b.p4 r0 = r3.f5638a     // Catch:{ SQLiteException -> 0x01cf }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ SQLiteException -> 0x01cf }
            b.l.a.c.h.b.m3 r0 = r0.f5807n     // Catch:{ SQLiteException -> 0x01cf }
            java.lang.String r10 = "Deleted application data. app, records"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ SQLiteException -> 0x01cf }
            r0.mo14416c(r10, r4, r11)     // Catch:{ SQLiteException -> 0x01cf }
            goto L_0x01e1
        L_0x01cf:
            r0 = move-exception
            b.l.a.c.h.b.p4 r3 = r3.f5638a     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.o3 r3 = r3.mo14329d()     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.m3 r3 = r3.f5799f     // Catch:{ all -> 0x057d }
            java.lang.String r10 = "Error deleting application data. appId, error"
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r4)     // Catch:{ all -> 0x057d }
            r3.mo14416c(r10, r4, r0)     // Catch:{ all -> 0x057d }
        L_0x01e1:
            r15 = 0
            goto L_0x01e5
        L_0x01e3:
            r20 = r4
        L_0x01e5:
            if (r15 == 0) goto L_0x023e
            long r3 = r15.mo14085R()     // Catch:{ all -> 0x057d }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x01fe
            long r3 = r15.mo14085R()     // Catch:{ all -> 0x057d }
            long r10 = r2.f6038p     // Catch:{ all -> 0x057d }
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x01fe
            r14 = 1
            goto L_0x01ff
        L_0x01fe:
            r14 = 0
        L_0x01ff:
            java.lang.String r0 = r15.mo14083P()     // Catch:{ all -> 0x057d }
            long r3 = r15.mo14085R()     // Catch:{ all -> 0x057d }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x021a
            if (r0 == 0) goto L_0x021a
            java.lang.String r3 = r2.f6031i     // Catch:{ all -> 0x057d }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x057d }
            if (r3 != 0) goto L_0x021a
            r3 = 1
            goto L_0x021b
        L_0x021a:
            r3 = 0
        L_0x021b:
            r3 = r3 | r14
            if (r3 == 0) goto L_0x023e
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x057d }
            r3.<init>()     // Catch:{ all -> 0x057d }
            java.lang.String r4 = "_pv"
            r3.putString(r4, r0)     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.s r0 = new b.l.a.c.h.b.s     // Catch:{ all -> 0x057d }
            java.lang.String r15 = "_au"
            b.l.a.c.h.b.q r4 = new b.l.a.c.h.b.q     // Catch:{ all -> 0x057d }
            r4.<init>(r3)     // Catch:{ all -> 0x057d }
            java.lang.String r17 = "auto"
            r14 = r0
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x057d }
            r1.mo14353S(r0, r2)     // Catch:{ all -> 0x057d }
        L_0x023e:
            r23.mo14367r(r24)     // Catch:{ all -> 0x057d }
            if (r9 != 0) goto L_0x0252
            b.l.a.c.h.b.j r0 = r1.f5650c     // Catch:{ all -> 0x057d }
            m6111F(r0)     // Catch:{ all -> 0x057d }
            java.lang.String r3 = r2.f6029g     // Catch:{ all -> 0x057d }
            java.lang.String r4 = "_f"
            b.l.a.c.h.b.o r0 = r0.mo14287B(r3, r4)     // Catch:{ all -> 0x057d }
            r14 = 0
            goto L_0x0260
        L_0x0252:
            b.l.a.c.h.b.j r0 = r1.f5650c     // Catch:{ all -> 0x057d }
            m6111F(r0)     // Catch:{ all -> 0x057d }
            java.lang.String r3 = r2.f6029g     // Catch:{ all -> 0x057d }
            java.lang.String r4 = "_v"
            b.l.a.c.h.b.o r0 = r0.mo14287B(r3, r4)     // Catch:{ all -> 0x057d }
            r14 = 1
        L_0x0260:
            if (r0 != 0) goto L_0x054f
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r9 = r12 / r3
            r11 = r6
            r21 = r7
            r6 = 1
            long r9 = r9 + r6
            long r9 = r9 * r3
            java.lang.String r3 = "_dac"
            java.lang.String r4 = "_r"
            java.lang.String r15 = "_c"
            java.lang.String r6 = "_et"
            if (r14 != 0) goto L_0x04d0
            b.l.a.c.h.b.m9 r0 = new b.l.a.c.h.b.m9     // Catch:{ all -> 0x057d }
            java.lang.String r7 = "_fot"
            java.lang.Long r18 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x057d }
            java.lang.String r19 = "auto"
            r14 = r0
            r9 = r15
            r15 = r7
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x057d }
            r1.mo14362m(r0, r2)     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.m4 r0 = r23.mo14331f()     // Catch:{ all -> 0x057d }
            r0.mo14126h()     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.p4 r0 = r1.f5658k     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.f4 r7 = r0.f5865x     // Catch:{ all -> 0x057d }
            java.util.Objects.requireNonNull(r7, r8)     // Catch:{ all -> 0x057d }
            java.lang.String r0 = r2.f6029g     // Catch:{ all -> 0x057d }
            if (r0 == 0) goto L_0x0380
            boolean r10 = r0.isEmpty()     // Catch:{ all -> 0x057d }
            if (r10 == 0) goto L_0x02a7
            goto L_0x0380
        L_0x02a7:
            b.l.a.c.h.b.p4 r10 = r7.f5505a     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.m4 r10 = r10.mo14331f()     // Catch:{ all -> 0x057d }
            r10.mo14126h()     // Catch:{ all -> 0x057d }
            boolean r10 = r7.mo14206a()     // Catch:{ all -> 0x057d }
            if (r10 != 0) goto L_0x02c5
            b.l.a.c.h.b.p4 r0 = r7.f5505a     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.m3 r0 = r0.f5805l     // Catch:{ all -> 0x057d }
            java.lang.String r5 = "Install Referrer Reporter is not available"
        L_0x02c0:
            r0.mo14414a(r5)     // Catch:{ all -> 0x057d }
            goto L_0x038c
        L_0x02c5:
            b.l.a.c.h.b.e4 r10 = new b.l.a.c.h.b.e4     // Catch:{ all -> 0x057d }
            r10.<init>(r7, r0)     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.p4 r0 = r7.f5505a     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.m4 r0 = r0.mo14331f()     // Catch:{ all -> 0x057d }
            r0.mo14126h()     // Catch:{ all -> 0x057d }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x057d }
            java.lang.String r14 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r14)     // Catch:{ all -> 0x057d }
            android.content.ComponentName r14 = new android.content.ComponentName     // Catch:{ all -> 0x057d }
            java.lang.String r15 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r14.<init>(r5, r15)     // Catch:{ all -> 0x057d }
            r0.setComponent(r14)     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.p4 r14 = r7.f5505a     // Catch:{ all -> 0x057d }
            android.content.Context r14 = r14.f5842a     // Catch:{ all -> 0x057d }
            android.content.pm.PackageManager r14 = r14.getPackageManager()     // Catch:{ all -> 0x057d }
            if (r14 != 0) goto L_0x02f9
            b.l.a.c.h.b.p4 r0 = r7.f5505a     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.m3 r0 = r0.f5803j     // Catch:{ all -> 0x057d }
            java.lang.String r5 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            goto L_0x02c0
        L_0x02f9:
            r15 = 0
            java.util.List r14 = r14.queryIntentServices(r0, r15)     // Catch:{ all -> 0x057d }
            if (r14 == 0) goto L_0x0374
            boolean r16 = r14.isEmpty()     // Catch:{ all -> 0x057d }
            if (r16 != 0) goto L_0x0374
            java.lang.Object r14 = r14.get(r15)     // Catch:{ all -> 0x057d }
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14     // Catch:{ all -> 0x057d }
            android.content.pm.ServiceInfo r14 = r14.serviceInfo     // Catch:{ all -> 0x057d }
            if (r14 == 0) goto L_0x038c
            java.lang.String r15 = r14.packageName     // Catch:{ all -> 0x057d }
            java.lang.String r14 = r14.name     // Catch:{ all -> 0x057d }
            if (r14 == 0) goto L_0x0368
            boolean r5 = r5.equals(r15)     // Catch:{ all -> 0x057d }
            if (r5 == 0) goto L_0x0368
            boolean r5 = r7.mo14206a()     // Catch:{ all -> 0x057d }
            if (r5 == 0) goto L_0x0368
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x057d }
            r5.<init>(r0)     // Catch:{ all -> 0x057d }
            b.l.a.c.b.o.a r0 = p005b.p096l.p097a.p113c.p119b.p125o.C1956a.m2685b()     // Catch:{ Exception -> 0x0353 }
            b.l.a.c.h.b.p4 r14 = r7.f5505a     // Catch:{ Exception -> 0x0353 }
            android.content.Context r14 = r14.mo14328c()     // Catch:{ Exception -> 0x0353 }
            r15 = 1
            boolean r0 = r0.mo12287a(r14, r5, r10, r15)     // Catch:{ Exception -> 0x0353 }
            b.l.a.c.h.b.p4 r5 = r7.f5505a     // Catch:{ Exception -> 0x0353 }
            b.l.a.c.h.b.o3 r5 = r5.mo14329d()     // Catch:{ Exception -> 0x0353 }
            b.l.a.c.h.b.m3 r5 = r5.mo14444s()     // Catch:{ Exception -> 0x0353 }
            java.lang.String r10 = "Install Referrer Service is"
            java.lang.String r14 = "available"
            java.lang.String r15 = "not available"
            r16 = r14
            r14 = 1
            if (r14 == r0) goto L_0x034d
            r14 = r15
            goto L_0x034f
        L_0x034d:
            r14 = r16
        L_0x034f:
            r5.mo14415b(r10, r14)     // Catch:{ Exception -> 0x0353 }
            goto L_0x038c
        L_0x0353:
            r0 = move-exception
            b.l.a.c.h.b.p4 r5 = r7.f5505a     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.o3 r5 = r5.mo14329d()     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.m3 r5 = r5.mo14440o()     // Catch:{ all -> 0x057d }
            java.lang.String r7 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x057d }
            r5.mo14415b(r7, r0)     // Catch:{ all -> 0x057d }
            goto L_0x038c
        L_0x0368:
            b.l.a.c.h.b.p4 r0 = r7.f5505a     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.m3 r0 = r0.f5802i     // Catch:{ all -> 0x057d }
            java.lang.String r5 = "Play Store version 8.3.73 or higher required for Install Referrer"
            goto L_0x02c0
        L_0x0374:
            b.l.a.c.h.b.p4 r0 = r7.f5505a     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.m3 r0 = r0.f5805l     // Catch:{ all -> 0x057d }
            java.lang.String r5 = "Play Service for fetching Install Referrer is unavailable on device"
            goto L_0x02c0
        L_0x0380:
            b.l.a.c.h.b.p4 r0 = r7.f5505a     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.m3 r0 = r0.f5803j     // Catch:{ all -> 0x057d }
            java.lang.String r5 = "Install Referrer Reporter was called with invalid app package name"
            goto L_0x02c0
        L_0x038c:
            b.l.a.c.h.b.m4 r0 = r23.mo14331f()     // Catch:{ all -> 0x057d }
            r0.mo14126h()     // Catch:{ all -> 0x057d }
            r23.mo14347M()     // Catch:{ all -> 0x057d }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x057d }
            r5.<init>()     // Catch:{ all -> 0x057d }
            r14 = 1
            r5.putLong(r9, r14)     // Catch:{ all -> 0x057d }
            r5.putLong(r4, r14)     // Catch:{ all -> 0x057d }
            r4 = r21
            r9 = 0
            r5.putLong(r4, r9)     // Catch:{ all -> 0x057d }
            r5.putLong(r11, r9)     // Catch:{ all -> 0x057d }
            r7 = r20
            r5.putLong(r7, r9)     // Catch:{ all -> 0x057d }
            r15 = r22
            r5.putLong(r15, r9)     // Catch:{ all -> 0x057d }
            r9 = 1
            r5.putLong(r6, r9)     // Catch:{ all -> 0x057d }
            boolean r0 = r2.f6044v     // Catch:{ all -> 0x057d }
            if (r0 == 0) goto L_0x03c3
            r5.putLong(r3, r9)     // Catch:{ all -> 0x057d }
        L_0x03c3:
            java.lang.String r3 = r2.f6029g     // Catch:{ all -> 0x057d }
            java.util.Objects.requireNonNull(r3, r8)     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.j r0 = r1.f5650c     // Catch:{ all -> 0x057d }
            m6111F(r0)     // Catch:{ all -> 0x057d }
            p005b.p006a.p007a.p024o.C0823f.m376j(r3)     // Catch:{ all -> 0x057d }
            r0.mo14126h()     // Catch:{ all -> 0x057d }
            r0.mo14646i()     // Catch:{ all -> 0x057d }
            java.lang.String r8 = "first_open_count"
            long r8 = r0.mo14309o(r3, r8)     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.p4 r0 = r1.f5658k     // Catch:{ all -> 0x057d }
            android.content.Context r0 = r0.f5842a     // Catch:{ all -> 0x057d }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x057d }
            if (r0 != 0) goto L_0x03fb
            b.l.a.c.h.b.o3 r0 = r23.mo14329d()     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.m3 r0 = r0.f5799f     // Catch:{ all -> 0x057d }
            java.lang.String r4 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r3)     // Catch:{ all -> 0x057d }
            r0.mo14415b(r4, r3)     // Catch:{ all -> 0x057d }
            r20 = r11
        L_0x03f7:
            r3 = 0
            goto L_0x04b0
        L_0x03fb:
            b.l.a.c.h.b.p4 r0 = r1.f5658k     // Catch:{ NameNotFoundException -> 0x040c }
            android.content.Context r0 = r0.f5842a     // Catch:{ NameNotFoundException -> 0x040c }
            b.l.a.c.b.q.a r0 = p005b.p096l.p097a.p113c.p119b.p128q.C1968b.m2885a(r0)     // Catch:{ NameNotFoundException -> 0x040c }
            r10 = 0
            android.content.pm.PackageInfo r0 = r0.mo12294b(r3, r10)     // Catch:{ NameNotFoundException -> 0x040c }
            r22 = r15
            r15 = r0
            goto L_0x041f
        L_0x040c:
            r0 = move-exception
            b.l.a.c.h.b.o3 r10 = r23.mo14329d()     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.m3 r10 = r10.f5799f     // Catch:{ all -> 0x057d }
            java.lang.String r14 = "Package info is null, first open report might be inaccurate. appId"
            r22 = r15
            java.lang.Object r15 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r3)     // Catch:{ all -> 0x057d }
            r10.mo14416c(r14, r15, r0)     // Catch:{ all -> 0x057d }
            r15 = 0
        L_0x041f:
            if (r15 == 0) goto L_0x046e
            r20 = r11
            long r10 = r15.firstInstallTime     // Catch:{ all -> 0x057d }
            r16 = 0
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0470
            long r14 = r15.lastUpdateTime     // Catch:{ all -> 0x057d }
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x044e
            b.l.a.c.h.b.f r0 = r23.mo14341G()     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.a3<java.lang.Boolean> r10 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5393l0     // Catch:{ all -> 0x057d }
            r11 = 0
            boolean r0 = r0.mo14197r(r11, r10)     // Catch:{ all -> 0x057d }
            if (r0 == 0) goto L_0x044b
            r14 = 0
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0449
            r14 = 1
        L_0x0446:
            r5.putLong(r4, r14)     // Catch:{ all -> 0x057d }
        L_0x0449:
            r14 = 0
            goto L_0x0450
        L_0x044b:
            r14 = 1
            goto L_0x0446
        L_0x044e:
            r11 = 0
            r14 = 1
        L_0x0450:
            b.l.a.c.h.b.m9 r0 = new b.l.a.c.h.b.m9     // Catch:{ all -> 0x057d }
            java.lang.String r15 = "_fi"
            r4 = 1
            if (r4 == r14) goto L_0x045a
            r16 = 0
            goto L_0x045c
        L_0x045a:
            r16 = 1
        L_0x045c:
            java.lang.Long r18 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x057d }
            java.lang.String r19 = "auto"
            r14 = r0
            r4 = r22
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x057d }
            r1.mo14362m(r0, r2)     // Catch:{ all -> 0x057d }
            goto L_0x0473
        L_0x046e:
            r20 = r11
        L_0x0470:
            r4 = r22
            r11 = 0
        L_0x0473:
            b.l.a.c.h.b.p4 r0 = r1.f5658k     // Catch:{ NameNotFoundException -> 0x0483 }
            android.content.Context r0 = r0.mo14328c()     // Catch:{ NameNotFoundException -> 0x0483 }
            b.l.a.c.b.q.a r0 = p005b.p096l.p097a.p113c.p119b.p128q.C1968b.m2885a(r0)     // Catch:{ NameNotFoundException -> 0x0483 }
            r10 = 0
            android.content.pm.ApplicationInfo r15 = r0.mo12293a(r3, r10)     // Catch:{ NameNotFoundException -> 0x0483 }
            goto L_0x0496
        L_0x0483:
            r0 = move-exception
            b.l.a.c.h.b.o3 r10 = r23.mo14329d()     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.m3 r10 = r10.mo14440o()     // Catch:{ all -> 0x057d }
            java.lang.String r14 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r3)     // Catch:{ all -> 0x057d }
            r10.mo14416c(r14, r3, r0)     // Catch:{ all -> 0x057d }
            r15 = r11
        L_0x0496:
            if (r15 == 0) goto L_0x03f7
            int r0 = r15.flags     // Catch:{ all -> 0x057d }
            r3 = 1
            r0 = r0 & r3
            if (r0 == 0) goto L_0x04a3
            r10 = 1
            r5.putLong(r7, r10)     // Catch:{ all -> 0x057d }
        L_0x04a3:
            int r0 = r15.flags     // Catch:{ all -> 0x057d }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x03f7
            r10 = 1
            r5.putLong(r4, r10)     // Catch:{ all -> 0x057d }
            goto L_0x03f7
        L_0x04b0:
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x04b9
            r3 = r20
            r5.putLong(r3, r8)     // Catch:{ all -> 0x057d }
        L_0x04b9:
            b.l.a.c.h.b.s r0 = new b.l.a.c.h.b.s     // Catch:{ all -> 0x057d }
            java.lang.String r15 = "_f"
            b.l.a.c.h.b.q r3 = new b.l.a.c.h.b.q     // Catch:{ all -> 0x057d }
            r3.<init>(r5)     // Catch:{ all -> 0x057d }
            java.lang.String r17 = "auto"
            r14 = r0
            r16 = r3
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x057d }
            r1.mo14352R(r0, r2)     // Catch:{ all -> 0x057d }
            goto L_0x051b
        L_0x04d0:
            r5 = r15
            b.l.a.c.h.b.m9 r0 = new b.l.a.c.h.b.m9     // Catch:{ all -> 0x057d }
            java.lang.String r15 = "_fvt"
            java.lang.Long r18 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x057d }
            java.lang.String r19 = "auto"
            r14 = r0
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x057d }
            r1.mo14362m(r0, r2)     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.m4 r0 = r23.mo14331f()     // Catch:{ all -> 0x057d }
            r0.mo14126h()     // Catch:{ all -> 0x057d }
            r23.mo14347M()     // Catch:{ all -> 0x057d }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x057d }
            r0.<init>()     // Catch:{ all -> 0x057d }
            r7 = 1
            r0.putLong(r5, r7)     // Catch:{ all -> 0x057d }
            r0.putLong(r4, r7)     // Catch:{ all -> 0x057d }
            r0.putLong(r6, r7)     // Catch:{ all -> 0x057d }
            boolean r4 = r2.f6044v     // Catch:{ all -> 0x057d }
            if (r4 == 0) goto L_0x0505
            r0.putLong(r3, r7)     // Catch:{ all -> 0x057d }
        L_0x0505:
            b.l.a.c.h.b.s r3 = new b.l.a.c.h.b.s     // Catch:{ all -> 0x057d }
            java.lang.String r15 = "_v"
            b.l.a.c.h.b.q r4 = new b.l.a.c.h.b.q     // Catch:{ all -> 0x057d }
            r4.<init>(r0)     // Catch:{ all -> 0x057d }
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x057d }
            r1.mo14352R(r3, r2)     // Catch:{ all -> 0x057d }
        L_0x051b:
            b.l.a.c.h.b.f r0 = r23.mo14341G()     // Catch:{ all -> 0x057d }
            java.lang.String r3 = r2.f6029g     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.a3<java.lang.Boolean> r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5364U     // Catch:{ all -> 0x057d }
            boolean r0 = r0.mo14197r(r3, r4)     // Catch:{ all -> 0x057d }
            if (r0 != 0) goto L_0x056c
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x057d }
            r0.<init>()     // Catch:{ all -> 0x057d }
            r3 = 1
            r0.putLong(r6, r3)     // Catch:{ all -> 0x057d }
            java.lang.String r5 = "_fr"
            r0.putLong(r5, r3)     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.s r3 = new b.l.a.c.h.b.s     // Catch:{ all -> 0x057d }
            java.lang.String r15 = "_e"
            b.l.a.c.h.b.q r4 = new b.l.a.c.h.b.q     // Catch:{ all -> 0x057d }
            r4.<init>(r0)     // Catch:{ all -> 0x057d }
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x057d }
        L_0x054b:
            r1.mo14352R(r3, r2)     // Catch:{ all -> 0x057d }
            goto L_0x056c
        L_0x054f:
            boolean r0 = r2.f6037o     // Catch:{ all -> 0x057d }
            if (r0 == 0) goto L_0x056c
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x057d }
            r0.<init>()     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.s r3 = new b.l.a.c.h.b.s     // Catch:{ all -> 0x057d }
            java.lang.String r15 = "_cd"
            b.l.a.c.h.b.q r4 = new b.l.a.c.h.b.q     // Catch:{ all -> 0x057d }
            r4.<init>(r0)     // Catch:{ all -> 0x057d }
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x057d }
            goto L_0x054b
        L_0x056c:
            b.l.a.c.h.b.j r0 = r1.f5650c     // Catch:{ all -> 0x057d }
            m6111F(r0)     // Catch:{ all -> 0x057d }
            r0.mo14318y()     // Catch:{ all -> 0x057d }
            b.l.a.c.h.b.j r0 = r1.f5650c
            m6111F(r0)
            r0.mo14319z()
            return
        L_0x057d:
            r0 = move-exception
            b.l.a.c.h.b.j r2 = r1.f5650c
            m6111F(r2)
            r2.mo14319z()
            throw r0
        L_0x0587:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.mo14364o(b.l.a.c.h.b.v9):void");
    }

    @WorkerThread
    /* renamed from: p */
    public final void mo14365p(C3118b bVar, C3352v9 v9Var) {
        C3247m3 m3Var;
        String str;
        Object t;
        String r;
        Object V;
        C3247m3 m3Var2;
        String str2;
        Object t2;
        String r2;
        Object obj;
        C3309s sVar;
        Objects.requireNonNull(bVar, "null reference");
        C0823f.m376j(bVar.f5302g);
        Objects.requireNonNull(bVar.f5303h, "null reference");
        Objects.requireNonNull(bVar.f5304i, "null reference");
        C0823f.m376j(bVar.f5304i.f5751h);
        mo14331f().mo14126h();
        mo14347M();
        if (mo14340E(v9Var)) {
            if (!v9Var.f6036n) {
                mo14367r(v9Var);
                return;
            }
            C3118b bVar2 = new C3118b(bVar);
            boolean z = false;
            bVar2.f5306k = false;
            C3210j jVar = this.f5650c;
            m6111F(jVar);
            jVar.mo14317x();
            try {
                C3210j jVar2 = this.f5650c;
                m6111F(jVar2);
                String str3 = bVar2.f5302g;
                Objects.requireNonNull(str3, "null reference");
                C3118b J = jVar2.mo14295J(str3, bVar2.f5304i.f5751h);
                if (J != null && !J.f5303h.equals(bVar2.f5303h)) {
                    mo14329d().f5802i.mo14417d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f5658k.mo14468u().mo14323r(bVar2.f5304i.f5751h), bVar2.f5303h, J.f5303h);
                }
                if (J != null && J.f5306k) {
                    bVar2.f5303h = J.f5303h;
                    bVar2.f5305j = J.f5305j;
                    bVar2.f5309n = J.f5309n;
                    bVar2.f5307l = J.f5307l;
                    bVar2.f5310o = J.f5310o;
                    bVar2.f5306k = true;
                    C3253m9 m9Var = bVar2.f5304i;
                    bVar2.f5304i = new C3253m9(m9Var.f5751h, J.f5304i.f5752i, m9Var.mo14428V(), J.f5304i.f5755l);
                } else if (TextUtils.isEmpty(bVar2.f5307l)) {
                    C3253m9 m9Var2 = bVar2.f5304i;
                    bVar2.f5304i = new C3253m9(m9Var2.f5751h, bVar2.f5305j, m9Var2.mo14428V(), bVar2.f5304i.f5755l);
                    bVar2.f5306k = true;
                    z = true;
                }
                if (bVar2.f5306k) {
                    C3253m9 m9Var3 = bVar2.f5304i;
                    String str4 = bVar2.f5302g;
                    Objects.requireNonNull(str4, "null reference");
                    String str5 = bVar2.f5303h;
                    String str6 = m9Var3.f5751h;
                    long j = m9Var3.f5752i;
                    Object V2 = m9Var3.mo14428V();
                    Objects.requireNonNull(V2, "null reference");
                    C3275o9 o9Var = new C3275o9(str4, str5, str6, j, V2);
                    C3210j jVar3 = this.f5650c;
                    m6111F(jVar3);
                    if (jVar3.mo14290E(o9Var)) {
                        m3Var2 = mo14329d().f5806m;
                        str2 = "User property updated immediately";
                        t2 = bVar2.f5302g;
                        r2 = this.f5658k.mo14468u().mo14323r(o9Var.f5821c);
                        obj = o9Var.f5823e;
                    } else {
                        m3Var2 = mo14329d().f5799f;
                        str2 = "(2)Too many active user properties, ignoring";
                        t2 = C3269o3.m6253t(bVar2.f5302g);
                        r2 = this.f5658k.mo14468u().mo14323r(o9Var.f5821c);
                        obj = o9Var.f5823e;
                    }
                    m3Var2.mo14417d(str2, t2, r2, obj);
                    if (z && (sVar = bVar2.f5310o) != null) {
                        mo14354T(new C3309s(sVar, bVar2.f5305j), v9Var);
                    }
                }
                C3210j jVar4 = this.f5650c;
                m6111F(jVar4);
                if (jVar4.mo14294I(bVar2)) {
                    m3Var = mo14329d().f5806m;
                    str = "Conditional property added";
                    t = bVar2.f5302g;
                    r = this.f5658k.mo14468u().mo14323r(bVar2.f5304i.f5751h);
                    V = bVar2.f5304i.mo14428V();
                } else {
                    m3Var = mo14329d().f5799f;
                    str = "Too many conditional properties, ignoring";
                    t = C3269o3.m6253t(bVar2.f5302g);
                    r = this.f5658k.mo14468u().mo14323r(bVar2.f5304i.f5751h);
                    V = bVar2.f5304i.mo14428V();
                }
                m3Var.mo14417d(str, t, r, V);
                C3210j jVar5 = this.f5650c;
                m6111F(jVar5);
                jVar5.mo14318y();
            } finally {
                C3210j jVar6 = this.f5650c;
                m6111F(jVar6);
                jVar6.mo14319z();
            }
        }
    }

    @WorkerThread
    /* renamed from: q */
    public final void mo14366q(C3118b bVar, C3352v9 v9Var) {
        Objects.requireNonNull(bVar, "null reference");
        C0823f.m376j(bVar.f5302g);
        Objects.requireNonNull(bVar.f5304i, "null reference");
        C0823f.m376j(bVar.f5304i.f5751h);
        mo14331f().mo14126h();
        mo14347M();
        if (mo14340E(v9Var)) {
            if (v9Var.f6036n) {
                C3210j jVar = this.f5650c;
                m6111F(jVar);
                jVar.mo14317x();
                try {
                    mo14367r(v9Var);
                    String str = bVar.f5302g;
                    Objects.requireNonNull(str, "null reference");
                    C3210j jVar2 = this.f5650c;
                    m6111F(jVar2);
                    C3118b J = jVar2.mo14295J(str, bVar.f5304i.f5751h);
                    if (J != null) {
                        mo14329d().f5806m.mo14416c("Removing conditional user property", bVar.f5302g, this.f5658k.mo14468u().mo14323r(bVar.f5304i.f5751h));
                        C3210j jVar3 = this.f5650c;
                        m6111F(jVar3);
                        jVar3.mo14296K(str, bVar.f5304i.f5751h);
                        if (J.f5306k) {
                            C3210j jVar4 = this.f5650c;
                            m6111F(jVar4);
                            jVar4.mo14289D(str, bVar.f5304i.f5751h);
                        }
                        C3309s sVar = bVar.f5312q;
                        if (sVar != null) {
                            C3287q qVar = sVar.f5938h;
                            Bundle Z = qVar != null ? qVar.mo14488Z() : null;
                            C3297q9 L = mo14346L();
                            C3309s sVar2 = bVar.f5312q;
                            Objects.requireNonNull(sVar2, "null reference");
                            C3309s J2 = L.mo14519J(str, sVar2.f5937g, Z, J.f5303h, bVar.f5312q.f5940j, true, false);
                            Objects.requireNonNull(J2, "null reference");
                            mo14354T(J2, v9Var);
                        }
                    } else {
                        mo14329d().f5802i.mo14416c("Conditional user property doesn't exist", C3269o3.m6253t(bVar.f5302g), this.f5658k.mo14468u().mo14323r(bVar.f5304i.f5751h));
                    }
                    C3210j jVar5 = this.f5650c;
                    m6111F(jVar5);
                    jVar5.mo14318y();
                } finally {
                    C3210j jVar6 = this.f5650c;
                    m6111F(jVar6);
                    jVar6.mo14319z();
                }
            } else {
                mo14367r(v9Var);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03a0, code lost:
        if (r7 != false) goto L_0x03a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a2, code lost:
        if (r3.mo14233d() != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0100, code lost:
        if (r3.mo14234e() != false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f0, code lost:
        if (r2.mo14233d() != false) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0232, code lost:
        if (r2.mo14234e() != false) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0255, code lost:
        if (r2.mo14234e() != false) goto L_0x0257;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03a0  */
    @androidx.annotation.WorkerThread
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p096l.p097a.p113c.p145h.p147b.C3112a5 mo14367r(p005b.p096l.p097a.p113c.p145h.p147b.C3352v9 r13) {
        /*
            r12 = this;
            b.l.a.c.h.b.m4 r0 = r12.mo14331f()
            r0.mo14126h()
            r12.mo14347M()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r13, r0)
            java.lang.String r1 = r13.f6029g
            p005b.p006a.p007a.p024o.C0823f.m376j(r1)
            b.l.a.c.h.b.j r1 = r12.f5650c
            m6111F(r1)
            java.lang.String r2 = r13.f6029g
            b.l.a.c.h.b.a5 r1 = r1.mo14299N(r2)
            b.l.a.c.h.b.g r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3177g.f5529c
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()
            b.l.a.c.h.b.f r3 = r12.mo14341G()
            b.l.a.c.h.b.a3<java.lang.Boolean> r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5415w0
            r5 = 0
            boolean r3 = r3.mo14197r(r5, r4)
            if (r3 == 0) goto L_0x0042
            java.lang.String r3 = r13.f6029g
            b.l.a.c.h.b.g r3 = r12.mo14349O(r3)
            java.lang.String r6 = r13.f6028B
            b.l.a.c.h.b.g r6 = p005b.p096l.p097a.p113c.p145h.p147b.C3177g.m5991b(r6)
            b.l.a.c.h.b.g r3 = r3.mo14237h(r6)
            goto L_0x0043
        L_0x0042:
            r3 = r2
        L_0x0043:
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()
            b.l.a.c.h.b.f r6 = r12.mo14341G()
            boolean r6 = r6.mo14197r(r5, r4)
            if (r6 == 0) goto L_0x005a
            boolean r6 = r3.mo14233d()
            if (r6 == 0) goto L_0x0057
            goto L_0x005a
        L_0x0057:
            java.lang.String r6 = ""
            goto L_0x0062
        L_0x005a:
            b.l.a.c.h.b.g8 r6 = r12.f5656i
            java.lang.String r7 = r13.f6029g
            java.lang.String r6 = r6.mo14248n(r7)
        L_0x0062:
            b.l.a.c.e.i.j9 r7 = p005b.p096l.p097a.p113c.p131e.p140i.C2838j9.f4861h
            b.l.a.c.e.i.k9 r7 = r7.mo13235a()
            r7.mo13458a()
            b.l.a.c.h.b.f r7 = r12.mo14341G()
            b.l.a.c.h.b.a3<java.lang.Boolean> r8 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5395m0
            boolean r7 = r7.mo14197r(r5, r8)
            r8 = 0
            if (r7 == 0) goto L_0x01a7
            if (r1 != 0) goto L_0x00b0
            b.l.a.c.h.b.a5 r1 = new b.l.a.c.h.b.a5
            b.l.a.c.h.b.p4 r0 = r12.f5658k
            java.lang.String r2 = r13.f6029g
            r1.<init>(r0, r2)
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()
            b.l.a.c.h.b.f r0 = r12.mo14341G()
            boolean r0 = r0.mo14197r(r5, r4)
            if (r0 == 0) goto L_0x00a5
            boolean r0 = r3.mo14234e()
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = r12.mo14355b(r3)
            r1.mo14068A(r0)
        L_0x009e:
            boolean r0 = r3.mo14233d()
            if (r0 == 0) goto L_0x0109
            goto L_0x00ac
        L_0x00a5:
            java.lang.String r0 = r12.mo14356g()
            r1.mo14068A(r0)
        L_0x00ac:
            r1.mo14076I(r6)
            goto L_0x0109
        L_0x00b0:
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()
            b.l.a.c.h.b.f r0 = r12.mo14341G()
            boolean r0 = r0.mo14197r(r5, r4)
            if (r0 == 0) goto L_0x00c3
            boolean r0 = r3.mo14233d()
            if (r0 == 0) goto L_0x00e5
        L_0x00c3:
            if (r6 == 0) goto L_0x00e5
            java.lang.String r0 = r1.mo14075H()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x00e5
            r1.mo14076I(r6)
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()
            b.l.a.c.h.b.f r0 = r12.mo14341G()
            boolean r0 = r0.mo14197r(r5, r4)
            if (r0 == 0) goto L_0x00e0
            goto L_0x0102
        L_0x00e0:
            java.lang.String r0 = r12.mo14356g()
            goto L_0x0106
        L_0x00e5:
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()
            b.l.a.c.h.b.f r0 = r12.mo14341G()
            boolean r0 = r0.mo14197r(r5, r4)
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = r1.mo14115z()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0109
            boolean r0 = r3.mo14234e()
            if (r0 == 0) goto L_0x0109
        L_0x0102:
            java.lang.String r0 = r12.mo14355b(r3)
        L_0x0106:
            r1.mo14068A(r0)
        L_0x0109:
            java.lang.String r0 = r13.f6030h
            r1.mo14070C(r0)
            java.lang.String r0 = r13.f6045w
            r1.mo14072E(r0)
            p005b.p096l.p097a.p113c.p131e.p140i.C3007w9.m5549b()
            b.l.a.c.h.b.f r0 = r12.mo14341G()
            java.lang.String r2 = r1.mo14114y()
            b.l.a.c.h.b.a3<java.lang.Boolean> r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5385h0
            boolean r0 = r0.mo14197r(r2, r3)
            if (r0 == 0) goto L_0x012b
            java.lang.String r0 = r13.f6027A
            r1.mo14074G(r0)
        L_0x012b:
            java.lang.String r0 = r13.f6039q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0138
            java.lang.String r0 = r13.f6039q
            r1.mo14078K(r0)
        L_0x0138:
            long r2 = r13.f6033k
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0141
            r1.mo14090a(r2)
        L_0x0141:
            java.lang.String r0 = r13.f6031i
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x014e
            java.lang.String r0 = r13.f6031i
            r1.mo14084Q(r0)
        L_0x014e:
            long r2 = r13.f6038p
            r1.mo14086S(r2)
            java.lang.String r0 = r13.f6032j
            if (r0 == 0) goto L_0x015a
            r1.mo14088U(r0)
        L_0x015a:
            long r2 = r13.f6034l
            r1.mo14092c(r2)
            boolean r0 = r13.f6036n
            r1.mo14096g(r0)
            java.lang.String r0 = r13.f6035m
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0171
            java.lang.String r0 = r13.f6035m
            r1.mo14105p(r0)
        L_0x0171:
            b.l.a.c.h.b.f r0 = r12.mo14341G()
            b.l.a.c.h.b.a3<java.lang.Boolean> r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5409t0
            boolean r0 = r0.mo14197r(r5, r2)
            if (r0 != 0) goto L_0x0182
            long r2 = r13.f6040r
            r1.mo14107r(r2)
        L_0x0182:
            boolean r0 = r13.f6043u
            r1.mo14109t(r0)
            java.lang.Boolean r0 = r13.f6046x
            r1.mo14111v(r0)
            long r2 = r13.f6047y
            r1.mo14094e(r2)
            b.l.a.c.h.b.p4 r13 = r1.f5263a
            b.l.a.c.h.b.m4 r13 = r13.mo14331f()
            r13.mo14126h()
            boolean r13 = r1.f5260D
            if (r13 == 0) goto L_0x01a6
            b.l.a.c.h.b.j r13 = r12.f5650c
            m6111F(r13)
            r13.mo14300O(r1)
        L_0x01a6:
            return r1
        L_0x01a7:
            java.lang.String r3 = r13.f6029g
            java.util.Objects.requireNonNull(r3, r0)
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()
            b.l.a.c.h.b.f r0 = r12.mo14341G()
            boolean r0 = r0.mo14197r(r5, r4)
            if (r0 == 0) goto L_0x01c7
            b.l.a.c.h.b.g r0 = r12.mo14349O(r3)
            java.lang.String r2 = r13.f6028B
            b.l.a.c.h.b.g r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3177g.m5991b(r2)
            b.l.a.c.h.b.g r2 = r0.mo14237h(r2)
        L_0x01c7:
            r0 = 0
            r7 = 1
            if (r1 != 0) goto L_0x01ff
            b.l.a.c.h.b.a5 r0 = new b.l.a.c.h.b.a5
            b.l.a.c.h.b.p4 r1 = r12.f5658k
            r0.<init>(r1, r3)
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()
            b.l.a.c.h.b.f r1 = r12.mo14341G()
            boolean r1 = r1.mo14197r(r5, r4)
            if (r1 == 0) goto L_0x01f3
            boolean r1 = r2.mo14234e()
            if (r1 == 0) goto L_0x01ec
            java.lang.String r1 = r12.mo14355b(r2)
            r0.mo14068A(r1)
        L_0x01ec:
            boolean r1 = r2.mo14233d()
            if (r1 == 0) goto L_0x01fd
            goto L_0x01fa
        L_0x01f3:
            java.lang.String r1 = r12.mo14356g()
            r0.mo14068A(r1)
        L_0x01fa:
            r0.mo14076I(r6)
        L_0x01fd:
            r1 = r0
            goto L_0x025e
        L_0x01ff:
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()
            b.l.a.c.h.b.f r3 = r12.mo14341G()
            boolean r3 = r3.mo14197r(r5, r4)
            if (r3 == 0) goto L_0x0212
            boolean r3 = r2.mo14233d()
            if (r3 == 0) goto L_0x023a
        L_0x0212:
            if (r6 == 0) goto L_0x023a
            java.lang.String r3 = r1.mo14075H()
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x023a
            r1.mo14076I(r6)
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()
            b.l.a.c.h.b.f r0 = r12.mo14341G()
            boolean r0 = r0.mo14197r(r5, r4)
            if (r0 == 0) goto L_0x0235
            boolean r0 = r2.mo14234e()
            if (r0 == 0) goto L_0x025e
            goto L_0x0257
        L_0x0235:
            java.lang.String r0 = r12.mo14356g()
            goto L_0x025b
        L_0x023a:
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()
            b.l.a.c.h.b.f r3 = r12.mo14341G()
            boolean r3 = r3.mo14197r(r5, r4)
            if (r3 == 0) goto L_0x025f
            java.lang.String r3 = r1.mo14115z()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x025f
            boolean r3 = r2.mo14234e()
            if (r3 == 0) goto L_0x025f
        L_0x0257:
            java.lang.String r0 = r12.mo14355b(r2)
        L_0x025b:
            r1.mo14068A(r0)
        L_0x025e:
            r0 = r7
        L_0x025f:
            java.lang.String r2 = r13.f6030h
            java.lang.String r3 = r1.mo14069B()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 != 0) goto L_0x0271
            java.lang.String r0 = r13.f6030h
            r1.mo14070C(r0)
            r0 = r7
        L_0x0271:
            java.lang.String r2 = r13.f6045w
            java.lang.String r3 = r1.mo14071D()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 != 0) goto L_0x0283
            java.lang.String r0 = r13.f6045w
            r1.mo14072E(r0)
            r0 = r7
        L_0x0283:
            p005b.p096l.p097a.p113c.p131e.p140i.C3007w9.m5549b()
            b.l.a.c.h.b.f r2 = r12.mo14341G()
            java.lang.String r3 = r1.mo14114y()
            b.l.a.c.h.b.a3<java.lang.Boolean> r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5385h0
            boolean r2 = r2.mo14197r(r3, r4)
            if (r2 == 0) goto L_0x02a8
            java.lang.String r2 = r13.f6027A
            java.lang.String r3 = r1.mo14073F()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 != 0) goto L_0x02a8
            java.lang.String r0 = r13.f6027A
            r1.mo14074G(r0)
            r0 = r7
        L_0x02a8:
            java.lang.String r2 = r13.f6039q
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x02c2
            java.lang.String r2 = r13.f6039q
            java.lang.String r3 = r1.mo14077J()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x02c2
            java.lang.String r0 = r13.f6039q
            r1.mo14078K(r0)
            r0 = r7
        L_0x02c2:
            long r2 = r13.f6033k
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x02d6
            long r10 = r1.mo14089V()
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x02d6
            long r2 = r13.f6033k
            r1.mo14090a(r2)
            r0 = r7
        L_0x02d6:
            java.lang.String r2 = r13.f6031i
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x02f0
            java.lang.String r2 = r13.f6031i
            java.lang.String r3 = r1.mo14083P()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x02f0
            java.lang.String r0 = r13.f6031i
            r1.mo14084Q(r0)
            r0 = r7
        L_0x02f0:
            long r2 = r13.f6038p
            long r10 = r1.mo14085R()
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x0300
            long r2 = r13.f6038p
            r1.mo14086S(r2)
            r0 = r7
        L_0x0300:
            java.lang.String r2 = r13.f6032j
            if (r2 == 0) goto L_0x0314
            java.lang.String r3 = r1.mo14087T()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0314
            java.lang.String r0 = r13.f6032j
            r1.mo14088U(r0)
            r0 = r7
        L_0x0314:
            long r2 = r13.f6034l
            long r10 = r1.mo14091b()
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x0324
            long r2 = r13.f6034l
            r1.mo14092c(r2)
            r0 = r7
        L_0x0324:
            boolean r2 = r13.f6036n
            boolean r3 = r1.mo14095f()
            if (r2 == r3) goto L_0x0332
            boolean r0 = r13.f6036n
            r1.mo14096g(r0)
            r0 = r7
        L_0x0332:
            java.lang.String r2 = r13.f6035m
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0353
            java.lang.String r2 = r13.f6035m
            b.l.a.c.h.b.p4 r3 = r1.f5263a
            b.l.a.c.h.b.m4 r3 = r3.mo14331f()
            r3.mo14126h()
            java.lang.String r3 = r1.f5259C
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0353
            java.lang.String r0 = r13.f6035m
            r1.mo14105p(r0)
            r0 = r7
        L_0x0353:
            b.l.a.c.h.b.f r2 = r12.mo14341G()
            b.l.a.c.h.b.a3<java.lang.Boolean> r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5409t0
            boolean r2 = r2.mo14197r(r5, r3)
            if (r2 != 0) goto L_0x036f
            long r2 = r13.f6040r
            long r4 = r1.mo14106q()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x036f
            long r2 = r13.f6040r
            r1.mo14107r(r2)
            r0 = r7
        L_0x036f:
            boolean r2 = r13.f6043u
            boolean r3 = r1.mo14108s()
            if (r2 == r3) goto L_0x037d
            boolean r0 = r13.f6043u
            r1.mo14109t(r0)
            r0 = r7
        L_0x037d:
            java.lang.Boolean r2 = r13.f6046x
            java.lang.Boolean r3 = r1.mo14110u()
            if (r2 == r3) goto L_0x038b
            java.lang.Boolean r0 = r13.f6046x
            r1.mo14111v(r0)
            goto L_0x038c
        L_0x038b:
            r7 = r0
        L_0x038c:
            long r2 = r13.f6047y
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x03a0
            long r4 = r1.mo14093d()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x03a0
            long r2 = r13.f6047y
            r1.mo14094e(r2)
            goto L_0x03a2
        L_0x03a0:
            if (r7 == 0) goto L_0x03aa
        L_0x03a2:
            b.l.a.c.h.b.j r13 = r12.f5650c
            m6111F(r13)
            r13.mo14300O(r1)
        L_0x03aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.mo14367r(b.l.a.c.h.b.v9):b.l.a.c.h.b.a5");
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x03c9 A[Catch:{ NumberFormatException -> 0x093b, all -> 0x0d4d }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x048d A[Catch:{ NumberFormatException -> 0x093b, all -> 0x0d4d }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04ed A[Catch:{ NumberFormatException -> 0x093b, all -> 0x0d4d }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0644 A[Catch:{ NumberFormatException -> 0x093b, all -> 0x0d4d }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0659 A[Catch:{ NumberFormatException -> 0x093b, all -> 0x0d4d }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0976 A[Catch:{ NumberFormatException -> 0x093b, all -> 0x0d4d }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x09bf A[Catch:{ NumberFormatException -> 0x093b, all -> 0x0d4d }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x09dc A[Catch:{ NumberFormatException -> 0x093b, all -> 0x0d4d }] */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0a53 A[Catch:{ NumberFormatException -> 0x093b, all -> 0x0d4d }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0a55 A[Catch:{ NumberFormatException -> 0x093b, all -> 0x0d4d }] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0a5d A[Catch:{ NumberFormatException -> 0x093b, all -> 0x0d4d }] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0a90 A[Catch:{ NumberFormatException -> 0x093b, all -> 0x0d4d }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:69:0x020a=Splitter:B:69:0x020a, B:439:0x0d3b=Splitter:B:439:0x0d3b} */
    @androidx.annotation.WorkerThread
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14368v(java.lang.String r45, long r46) {
        /*
            r44 = this;
            r1 = r44
            java.lang.String r2 = "_si"
            java.lang.String r3 = "_sc"
            java.lang.String r4 = "_sn"
            java.lang.String r5 = "_npa"
            java.lang.String r6 = "_ai"
            b.l.a.c.h.b.j r7 = r1.f5650c
            m6111F(r7)
            r7.mo14317x()
            b.l.a.c.h.b.i9 r7 = new b.l.a.c.h.b.i9     // Catch:{ all -> 0x0d4d }
            r7.<init>(r1)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.j r8 = r1.f5650c     // Catch:{ all -> 0x0d4d }
            m6111F(r8)     // Catch:{ all -> 0x0d4d }
            r9 = 0
            long r12 = r1.f5672y     // Catch:{ all -> 0x0d4d }
            r10 = r46
            r14 = r7
            r8.mo14314t(r9, r10, r12, r14)     // Catch:{ all -> 0x0d4d }
            java.util.List<b.l.a.c.e.i.p1> r8 = r7.f5617c     // Catch:{ all -> 0x0d4d }
            if (r8 == 0) goto L_0x0d3b
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0d4d }
            if (r8 == 0) goto L_0x0033
            goto L_0x0d3b
        L_0x0033:
            b.l.a.c.e.i.x1 r8 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.l5 r8 = r8.mo13546n()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.w1 r8 = (p005b.p096l.p097a.p113c.p131e.p140i.C2999w1) r8     // Catch:{ all -> 0x0d4d }
            r8.mo13864j0()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.f r10 = r44.mo14341G()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.x1 r11 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r11 = r11.mo13939s()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.a3<java.lang.Boolean> r12 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5364U     // Catch:{ all -> 0x0d4d }
            boolean r10 = r10.mo14197r(r11, r12)     // Catch:{ all -> 0x0d4d }
            r9 = -1
            r11 = -1
            r12 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x005a:
            java.util.List<b.l.a.c.e.i.p1> r13 = r7.f5617c     // Catch:{ all -> 0x0d4d }
            int r13 = r13.size()     // Catch:{ all -> 0x0d4d }
            java.lang.String r14 = "_fr"
            r22 = r5
            java.lang.String r5 = "_et"
            r23 = r10
            java.lang.String r10 = "_e"
            r24 = r2
            r25 = r3
            if (r15 >= r13) goto L_0x06a9
            java.util.List<b.l.a.c.e.i.p1> r3 = r7.f5617c     // Catch:{ all -> 0x0d4d }
            java.lang.Object r3 = r3.get(r15)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.p1 r3 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r3     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.l5 r3 = r3.mo13546n()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o1 r3 = (p005b.p096l.p097a.p113c.p131e.p140i.C2895o1) r3     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.i4 r13 = r1.f5648a     // Catch:{ all -> 0x0d4d }
            m6111F(r13)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.x1 r2 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r2 = r2.mo13939s()     // Catch:{ all -> 0x0d4d }
            r27 = r15
            java.lang.String r15 = r3.mo13532s()     // Catch:{ all -> 0x0d4d }
            boolean r2 = r13.mo14271o(r2, r15)     // Catch:{ all -> 0x0d4d }
            java.lang.String r13 = "_err"
            if (r2 == 0) goto L_0x011d
            b.l.a.c.h.b.o3 r2 = r44.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r2 = r2.mo14441p()     // Catch:{ all -> 0x0d4d }
            java.lang.String r5 = "Dropping blacklisted raw event. appId"
            b.l.a.c.e.i.x1 r10 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r10 = r10.mo13939s()     // Catch:{ all -> 0x0d4d }
            java.lang.Object r10 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r10)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.p4 r14 = r1.f5658k     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.j3 r14 = r14.mo14468u()     // Catch:{ all -> 0x0d4d }
            java.lang.String r15 = r3.mo13532s()     // Catch:{ all -> 0x0d4d }
            java.lang.String r14 = r14.mo14321p(r15)     // Catch:{ all -> 0x0d4d }
            r2.mo14416c(r5, r10, r14)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.i4 r2 = r1.f5648a     // Catch:{ all -> 0x0d4d }
            m6111F(r2)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.x1 r5 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r5 = r5.mo13939s()     // Catch:{ all -> 0x0d4d }
            boolean r2 = r2.mo14274r(r5)     // Catch:{ all -> 0x0d4d }
            if (r2 != 0) goto L_0x010f
            b.l.a.c.h.b.i4 r2 = r1.f5648a     // Catch:{ all -> 0x0d4d }
            m6111F(r2)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.x1 r5 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r5 = r5.mo13939s()     // Catch:{ all -> 0x0d4d }
            boolean r2 = r2.mo14275s(r5)     // Catch:{ all -> 0x0d4d }
            if (r2 == 0) goto L_0x00df
            goto L_0x010f
        L_0x00df:
            java.lang.String r2 = r3.mo13532s()     // Catch:{ all -> 0x0d4d }
            boolean r2 = r13.equals(r2)     // Catch:{ all -> 0x0d4d }
            if (r2 != 0) goto L_0x010f
            b.l.a.c.h.b.q9 r28 = r44.mo14346L()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.p9 r2 = r1.f5647A     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.x1 r5 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r30 = r5.mo13939s()     // Catch:{ all -> 0x0d4d }
            java.lang.String r32 = "_ev"
            java.lang.String r33 = r3.mo13532s()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.f r3 = r44.mo14341G()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.a3<java.lang.Boolean> r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5419y0     // Catch:{ all -> 0x0d4d }
            r10 = 0
            boolean r35 = r3.mo14197r(r10, r5)     // Catch:{ all -> 0x0d4d }
            r31 = 11
            r34 = 0
            r29 = r2
            r28.mo14515A(r29, r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0d4d }
        L_0x010f:
            r29 = r6
            r5 = r9
            r14 = r25
            r9 = r27
            r25 = r11
            r11 = r4
            r4 = r24
            goto L_0x0699
        L_0x011d:
            java.lang.String r2 = r3.mo13532s()     // Catch:{ all -> 0x0d4d }
            java.lang.String r15 = p005b.p096l.p097a.p113c.p145h.p147b.C3249m5.m6240a(r6)     // Catch:{ all -> 0x0d4d }
            boolean r2 = r2.equals(r15)     // Catch:{ all -> 0x0d4d }
            if (r2 == 0) goto L_0x0193
            r3.mo13533t(r6)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.o3 r2 = r44.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r2 = r2.mo14444s()     // Catch:{ all -> 0x0d4d }
            java.lang.String r15 = "Renaming ad_impression to _ai"
            r2.mo14414a(r15)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.o3 r2 = r44.mo14329d()     // Catch:{ all -> 0x0d4d }
            java.lang.String r2 = r2.mo14446v()     // Catch:{ all -> 0x0d4d }
            r15 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r15)     // Catch:{ all -> 0x0d4d }
            if (r2 == 0) goto L_0x0193
            r2 = 0
        L_0x014b:
            int r15 = r3.mo13527n()     // Catch:{ all -> 0x0d4d }
            if (r2 >= r15) goto L_0x0193
            java.lang.String r15 = "ad_platform"
            b.l.a.c.e.i.t1 r28 = r3.mo13528o(r2)     // Catch:{ all -> 0x0d4d }
            r29 = r6
            java.lang.String r6 = r28.mo13737t()     // Catch:{ all -> 0x0d4d }
            boolean r6 = r15.equals(r6)     // Catch:{ all -> 0x0d4d }
            if (r6 == 0) goto L_0x018e
            b.l.a.c.e.i.t1 r6 = r3.mo13528o(r2)     // Catch:{ all -> 0x0d4d }
            java.lang.String r6 = r6.mo13739v()     // Catch:{ all -> 0x0d4d }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0d4d }
            if (r6 != 0) goto L_0x018e
            java.lang.String r6 = "admob"
            b.l.a.c.e.i.t1 r15 = r3.mo13528o(r2)     // Catch:{ all -> 0x0d4d }
            java.lang.String r15 = r15.mo13739v()     // Catch:{ all -> 0x0d4d }
            boolean r6 = r6.equalsIgnoreCase(r15)     // Catch:{ all -> 0x0d4d }
            if (r6 == 0) goto L_0x018e
            b.l.a.c.h.b.o3 r6 = r44.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r6 = r6.mo14442q()     // Catch:{ all -> 0x0d4d }
            java.lang.String r15 = "AdMob ad impression logged from app. Potentially duplicative."
            r6.mo14414a(r15)     // Catch:{ all -> 0x0d4d }
        L_0x018e:
            int r2 = r2 + 1
            r6 = r29
            goto L_0x014b
        L_0x0193:
            r29 = r6
            b.l.a.c.h.b.i4 r2 = r1.f5648a     // Catch:{ all -> 0x0d4d }
            m6111F(r2)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.x1 r6 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r6 = r6.mo13939s()     // Catch:{ all -> 0x0d4d }
            java.lang.String r15 = r3.mo13532s()     // Catch:{ all -> 0x0d4d }
            boolean r2 = r2.mo14272p(r6, r15)     // Catch:{ all -> 0x0d4d }
            java.lang.String r6 = "_c"
            if (r2 != 0) goto L_0x0201
            b.l.a.c.h.b.l9 r15 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r15)     // Catch:{ all -> 0x0d4d }
            java.lang.String r15 = r3.mo13532s()     // Catch:{ all -> 0x0d4d }
            p005b.p006a.p007a.p024o.C0823f.m376j(r15)     // Catch:{ all -> 0x0d4d }
            r28 = r4
            int r4 = r15.hashCode()     // Catch:{ all -> 0x0d4d }
            r30 = r9
            r9 = 94660(0x171c4, float:1.32647E-40)
            if (r4 == r9) goto L_0x01e4
            r9 = 95025(0x17331, float:1.33158E-40)
            if (r4 == r9) goto L_0x01da
            r9 = 95027(0x17333, float:1.33161E-40)
            if (r4 == r9) goto L_0x01d0
            goto L_0x01ee
        L_0x01d0:
            java.lang.String r4 = "_ui"
            boolean r4 = r15.equals(r4)
            if (r4 == 0) goto L_0x01ee
            r4 = 1
            goto L_0x01ef
        L_0x01da:
            java.lang.String r4 = "_ug"
            boolean r4 = r15.equals(r4)
            if (r4 == 0) goto L_0x01ee
            r4 = 2
            goto L_0x01ef
        L_0x01e4:
            java.lang.String r4 = "_in"
            boolean r4 = r15.equals(r4)
            if (r4 == 0) goto L_0x01ee
            r4 = 0
            goto L_0x01ef
        L_0x01ee:
            r4 = -1
        L_0x01ef:
            if (r4 == 0) goto L_0x0205
            r9 = 1
            if (r4 == r9) goto L_0x0205
            r9 = 2
            if (r4 == r9) goto L_0x0205
            r31 = r5
            r32 = r8
            r15 = r11
            r26 = r12
            r2 = 0
            goto L_0x03c7
        L_0x0201:
            r28 = r4
            r30 = r9
        L_0x0205:
            r26 = r12
            r4 = 0
            r9 = 0
            r15 = 0
        L_0x020a:
            int r12 = r3.mo13527n()     // Catch:{ all -> 0x0d4d }
            r31 = r5
            java.lang.String r5 = "_r"
            if (r4 >= r12) goto L_0x0277
            b.l.a.c.e.i.t1 r12 = r3.mo13528o(r4)     // Catch:{ all -> 0x0d4d }
            java.lang.String r12 = r12.mo13737t()     // Catch:{ all -> 0x0d4d }
            boolean r12 = r6.equals(r12)     // Catch:{ all -> 0x0d4d }
            if (r12 == 0) goto L_0x0240
            b.l.a.c.e.i.t1 r5 = r3.mo13528o(r4)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.l5 r5 = r5.mo13546n()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.s1 r5 = (p005b.p096l.p097a.p113c.p131e.p140i.C2947s1) r5     // Catch:{ all -> 0x0d4d }
            r12 = r8
            r8 = 1
            r5.mo13692o(r8)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o5 r5 = r5.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.t1 r5 = (p005b.p096l.p097a.p113c.p131e.p140i.C2960t1) r5     // Catch:{ all -> 0x0d4d }
            r3.mo13529p(r4, r5)     // Catch:{ all -> 0x0d4d }
            r8 = r11
            r32 = r12
            r9 = 1
            goto L_0x026f
        L_0x0240:
            r12 = r8
            b.l.a.c.e.i.t1 r8 = r3.mo13528o(r4)     // Catch:{ all -> 0x0d4d }
            java.lang.String r8 = r8.mo13737t()     // Catch:{ all -> 0x0d4d }
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x0d4d }
            if (r5 == 0) goto L_0x026c
            b.l.a.c.e.i.t1 r5 = r3.mo13528o(r4)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.l5 r5 = r5.mo13546n()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.s1 r5 = (p005b.p096l.p097a.p113c.p131e.p140i.C2947s1) r5     // Catch:{ all -> 0x0d4d }
            r8 = r11
            r32 = r12
            r11 = 1
            r5.mo13692o(r11)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o5 r5 = r5.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.t1 r5 = (p005b.p096l.p097a.p113c.p131e.p140i.C2960t1) r5     // Catch:{ all -> 0x0d4d }
            r3.mo13529p(r4, r5)     // Catch:{ all -> 0x0d4d }
            r15 = 1
            goto L_0x026f
        L_0x026c:
            r8 = r11
            r32 = r12
        L_0x026f:
            int r4 = r4 + 1
            r11 = r8
            r5 = r31
            r8 = r32
            goto L_0x020a
        L_0x0277:
            r32 = r8
            r8 = r11
            if (r9 != 0) goto L_0x02a8
            if (r2 == 0) goto L_0x02a8
            b.l.a.c.h.b.o3 r4 = r44.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r4 = r4.mo14444s()     // Catch:{ all -> 0x0d4d }
            java.lang.String r9 = "Marking event as conversion"
            b.l.a.c.h.b.p4 r11 = r1.f5658k     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.j3 r11 = r11.mo14468u()     // Catch:{ all -> 0x0d4d }
            java.lang.String r12 = r3.mo13532s()     // Catch:{ all -> 0x0d4d }
            java.lang.String r11 = r11.mo14321p(r12)     // Catch:{ all -> 0x0d4d }
            r4.mo14415b(r9, r11)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.s1 r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2960t1.m5263E()     // Catch:{ all -> 0x0d4d }
            r4.mo13690m(r6)     // Catch:{ all -> 0x0d4d }
            r11 = 1
            r4.mo13692o(r11)     // Catch:{ all -> 0x0d4d }
            r3.mo13530q(r4)     // Catch:{ all -> 0x0d4d }
        L_0x02a8:
            if (r15 != 0) goto L_0x02d4
            b.l.a.c.h.b.o3 r4 = r44.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r4 = r4.mo14444s()     // Catch:{ all -> 0x0d4d }
            java.lang.String r9 = "Marking event as real-time"
            b.l.a.c.h.b.p4 r11 = r1.f5658k     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.j3 r11 = r11.mo14468u()     // Catch:{ all -> 0x0d4d }
            java.lang.String r12 = r3.mo13532s()     // Catch:{ all -> 0x0d4d }
            java.lang.String r11 = r11.mo14321p(r12)     // Catch:{ all -> 0x0d4d }
            r4.mo14415b(r9, r11)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.s1 r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2960t1.m5263E()     // Catch:{ all -> 0x0d4d }
            r4.mo13690m(r5)     // Catch:{ all -> 0x0d4d }
            r11 = 1
            r4.mo13692o(r11)     // Catch:{ all -> 0x0d4d }
            r3.mo13530q(r4)     // Catch:{ all -> 0x0d4d }
        L_0x02d4:
            b.l.a.c.h.b.j r4 = r1.f5650c     // Catch:{ all -> 0x0d4d }
            m6111F(r4)     // Catch:{ all -> 0x0d4d }
            long r34 = r44.mo14350P()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.x1 r9 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r36 = r9.mo13939s()     // Catch:{ all -> 0x0d4d }
            r37 = 0
            r38 = 1
            r33 = r4
            b.l.a.c.h.b.h r4 = r33.mo14301P(r34, r36, r37, r38)     // Catch:{ all -> 0x0d4d }
            long r11 = r4.f5571e     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.f r4 = r44.mo14341G()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.x1 r9 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r9 = r9.mo13939s()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.a3<java.lang.Integer> r15 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5398o     // Catch:{ all -> 0x0d4d }
            int r4 = r4.mo14195p(r9, r15)     // Catch:{ all -> 0x0d4d }
            r15 = r8
            long r8 = (long) r4     // Catch:{ all -> 0x0d4d }
            int r4 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x0309
            m6114u(r3, r5)     // Catch:{ all -> 0x0d4d }
            goto L_0x030b
        L_0x0309:
            r19 = 1
        L_0x030b:
            java.lang.String r4 = r3.mo13532s()     // Catch:{ all -> 0x0d4d }
            boolean r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.m6345f0(r4)     // Catch:{ all -> 0x0d4d }
            if (r4 == 0) goto L_0x03c7
            if (r2 == 0) goto L_0x03c7
            b.l.a.c.h.b.j r4 = r1.f5650c     // Catch:{ all -> 0x0d4d }
            m6111F(r4)     // Catch:{ all -> 0x0d4d }
            long r34 = r44.mo14350P()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.x1 r5 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r36 = r5.mo13939s()     // Catch:{ all -> 0x0d4d }
            r37 = 1
            r38 = 0
            r33 = r4
            b.l.a.c.h.b.h r4 = r33.mo14301P(r34, r36, r37, r38)     // Catch:{ all -> 0x0d4d }
            long r4 = r4.f5569c     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.f r8 = r44.mo14341G()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.x1 r9 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r9 = r9.mo13939s()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.a3<java.lang.Integer> r11 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5396n     // Catch:{ all -> 0x0d4d }
            int r8 = r8.mo14195p(r9, r11)     // Catch:{ all -> 0x0d4d }
            long r8 = (long) r8     // Catch:{ all -> 0x0d4d }
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x03c7
            b.l.a.c.h.b.o3 r4 = r44.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r4 = r4.mo14441p()     // Catch:{ all -> 0x0d4d }
            java.lang.String r5 = "Too many conversions. Not logging as conversion. appId"
            b.l.a.c.e.i.x1 r8 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r8 = r8.mo13939s()     // Catch:{ all -> 0x0d4d }
            java.lang.Object r8 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r8)     // Catch:{ all -> 0x0d4d }
            r4.mo14415b(r5, r8)     // Catch:{ all -> 0x0d4d }
            r4 = 0
            r5 = 0
            r8 = -1
            r9 = 0
        L_0x0362:
            int r11 = r3.mo13527n()     // Catch:{ all -> 0x0d4d }
            if (r4 >= r11) goto L_0x038d
            b.l.a.c.e.i.t1 r11 = r3.mo13528o(r4)     // Catch:{ all -> 0x0d4d }
            java.lang.String r12 = r11.mo13737t()     // Catch:{ all -> 0x0d4d }
            boolean r12 = r6.equals(r12)     // Catch:{ all -> 0x0d4d }
            if (r12 == 0) goto L_0x037f
            b.l.a.c.e.i.l5 r8 = r11.mo13546n()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.s1 r8 = (p005b.p096l.p097a.p113c.p131e.p140i.C2947s1) r8     // Catch:{ all -> 0x0d4d }
            r9 = r8
            r8 = r4
            goto L_0x038a
        L_0x037f:
            java.lang.String r11 = r11.mo13737t()     // Catch:{ all -> 0x0d4d }
            boolean r11 = r13.equals(r11)     // Catch:{ all -> 0x0d4d }
            if (r11 == 0) goto L_0x038a
            r5 = 1
        L_0x038a:
            int r4 = r4 + 1
            goto L_0x0362
        L_0x038d:
            if (r5 == 0) goto L_0x0396
            if (r9 == 0) goto L_0x0395
            r3.mo13531r(r8)     // Catch:{ all -> 0x0d4d }
            goto L_0x03c7
        L_0x0395:
            r9 = 0
        L_0x0396:
            if (r9 == 0) goto L_0x03b0
            b.l.a.c.e.i.l5 r4 = r9.clone()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.s1 r4 = (p005b.p096l.p097a.p113c.p131e.p140i.C2947s1) r4     // Catch:{ all -> 0x0d4d }
            r4.mo13690m(r13)     // Catch:{ all -> 0x0d4d }
            r11 = 10
            r4.mo13692o(r11)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o5 r4 = r4.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.t1 r4 = (p005b.p096l.p097a.p113c.p131e.p140i.C2960t1) r4     // Catch:{ all -> 0x0d4d }
            r3.mo13529p(r8, r4)     // Catch:{ all -> 0x0d4d }
            goto L_0x03c7
        L_0x03b0:
            b.l.a.c.h.b.o3 r4 = r44.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r4 = r4.mo14440o()     // Catch:{ all -> 0x0d4d }
            java.lang.String r5 = "Did not find conversion parameter. appId"
            b.l.a.c.e.i.x1 r8 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r8 = r8.mo13939s()     // Catch:{ all -> 0x0d4d }
            java.lang.Object r8 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r8)     // Catch:{ all -> 0x0d4d }
            r4.mo14415b(r5, r8)     // Catch:{ all -> 0x0d4d }
        L_0x03c7:
            if (r2 == 0) goto L_0x0480
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0d4d }
            java.util.List r4 = r3.mo13526m()     // Catch:{ all -> 0x0d4d }
            r2.<init>(r4)     // Catch:{ all -> 0x0d4d }
            r4 = 0
            r5 = -1
            r8 = -1
        L_0x03d5:
            int r9 = r2.size()     // Catch:{ all -> 0x0d4d }
            java.lang.String r11 = "currency"
            java.lang.String r12 = "value"
            if (r4 >= r9) goto L_0x0405
            java.lang.Object r9 = r2.get(r4)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.t1 r9 = (p005b.p096l.p097a.p113c.p131e.p140i.C2960t1) r9     // Catch:{ all -> 0x0d4d }
            java.lang.String r9 = r9.mo13737t()     // Catch:{ all -> 0x0d4d }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0d4d }
            if (r9 == 0) goto L_0x03f1
            r5 = r4
            goto L_0x0402
        L_0x03f1:
            java.lang.Object r9 = r2.get(r4)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.t1 r9 = (p005b.p096l.p097a.p113c.p131e.p140i.C2960t1) r9     // Catch:{ all -> 0x0d4d }
            java.lang.String r9 = r9.mo13737t()     // Catch:{ all -> 0x0d4d }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0d4d }
            if (r9 == 0) goto L_0x0402
            r8 = r4
        L_0x0402:
            int r4 = r4 + 1
            goto L_0x03d5
        L_0x0405:
            r4 = -1
            if (r5 != r4) goto L_0x040a
            goto L_0x0481
        L_0x040a:
            java.lang.Object r4 = r2.get(r5)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.t1 r4 = (p005b.p096l.p097a.p113c.p131e.p140i.C2960t1) r4     // Catch:{ all -> 0x0d4d }
            boolean r4 = r4.mo13740w()     // Catch:{ all -> 0x0d4d }
            if (r4 != 0) goto L_0x043b
            java.lang.Object r4 = r2.get(r5)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.t1 r4 = (p005b.p096l.p097a.p113c.p131e.p140i.C2960t1) r4     // Catch:{ all -> 0x0d4d }
            boolean r4 = r4.mo13732A()     // Catch:{ all -> 0x0d4d }
            if (r4 != 0) goto L_0x043b
            b.l.a.c.h.b.o3 r2 = r44.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r2 = r2.mo14442q()     // Catch:{ all -> 0x0d4d }
            java.lang.String r4 = "Value must be specified with a numeric type."
            r2.mo14414a(r4)     // Catch:{ all -> 0x0d4d }
            r3.mo13531r(r5)     // Catch:{ all -> 0x0d4d }
            m6114u(r3, r6)     // Catch:{ all -> 0x0d4d }
            r2 = 18
            m6112s(r3, r2, r12)     // Catch:{ all -> 0x0d4d }
            goto L_0x0480
        L_0x043b:
            r4 = -1
            if (r8 != r4) goto L_0x043f
            goto L_0x0467
        L_0x043f:
            java.lang.Object r2 = r2.get(r8)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.t1 r2 = (p005b.p096l.p097a.p113c.p131e.p140i.C2960t1) r2     // Catch:{ all -> 0x0d4d }
            java.lang.String r2 = r2.mo13739v()     // Catch:{ all -> 0x0d4d }
            int r8 = r2.length()     // Catch:{ all -> 0x0d4d }
            r9 = 3
            if (r8 != r9) goto L_0x0467
            r8 = 0
        L_0x0451:
            int r9 = r2.length()     // Catch:{ all -> 0x0d4d }
            if (r8 >= r9) goto L_0x0481
            int r9 = r2.codePointAt(r8)     // Catch:{ all -> 0x0d4d }
            boolean r12 = java.lang.Character.isLetter(r9)     // Catch:{ all -> 0x0d4d }
            if (r12 == 0) goto L_0x0467
            int r9 = java.lang.Character.charCount(r9)     // Catch:{ all -> 0x0d4d }
            int r8 = r8 + r9
            goto L_0x0451
        L_0x0467:
            b.l.a.c.h.b.o3 r2 = r44.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r2 = r2.mo14442q()     // Catch:{ all -> 0x0d4d }
            java.lang.String r8 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.mo14414a(r8)     // Catch:{ all -> 0x0d4d }
            r3.mo13531r(r5)     // Catch:{ all -> 0x0d4d }
            m6114u(r3, r6)     // Catch:{ all -> 0x0d4d }
            r2 = 19
            m6112s(r3, r2, r11)     // Catch:{ all -> 0x0d4d }
            goto L_0x0481
        L_0x0480:
            r4 = -1
        L_0x0481:
            java.lang.String r2 = r3.mo13532s()     // Catch:{ all -> 0x0d4d }
            boolean r2 = r10.equals(r2)     // Catch:{ all -> 0x0d4d }
            r5 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x04ed
            b.l.a.c.h.b.l9 r2 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r2)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o5 r2 = r3.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.p1 r2 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r2     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.t1 r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6197L(r2, r14)     // Catch:{ all -> 0x0d4d }
            if (r2 != 0) goto L_0x04dd
            if (r20 == 0) goto L_0x04c9
            long r8 = r20.mo13534u()     // Catch:{ all -> 0x0d4d }
            long r11 = r3.mo13534u()     // Catch:{ all -> 0x0d4d }
            long r8 = r8 - r11
            long r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0d4d }
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x04c9
            b.l.a.c.e.i.l5 r2 = r20.clone()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o1 r2 = (p005b.p096l.p097a.p113c.p131e.p140i.C2895o1) r2     // Catch:{ all -> 0x0d4d }
            boolean r5 = r1.mo14370x(r3, r2)     // Catch:{ all -> 0x0d4d }
            if (r5 == 0) goto L_0x04c9
            r13 = r15
            r8 = r32
            r8.mo13861g0(r13, r2)     // Catch:{ all -> 0x0d4d }
            r9 = r30
            r2 = 0
            r20 = 0
            goto L_0x04cf
        L_0x04c9:
            r13 = r15
            r8 = r32
            r2 = r3
            r9 = r18
        L_0x04cf:
            r12 = r2
            r5 = r9
            r4 = r24
            r14 = r25
            r11 = r28
            r9 = r31
            r25 = r13
            goto L_0x0632
        L_0x04dd:
            r8 = r32
            r4 = r24
            r14 = r25
            r11 = r28
            r5 = r30
            r9 = r31
            r25 = r15
            goto L_0x0630
        L_0x04ed:
            r13 = r15
            r8 = r32
            java.lang.String r2 = "_vs"
            java.lang.String r9 = r3.mo13532s()     // Catch:{ all -> 0x0d4d }
            boolean r2 = r2.equals(r9)     // Catch:{ all -> 0x0d4d }
            if (r2 == 0) goto L_0x054e
            b.l.a.c.h.b.l9 r2 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r2)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o5 r2 = r3.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.p1 r2 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r2     // Catch:{ all -> 0x0d4d }
            r9 = r31
            b.l.a.c.e.i.t1 r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6197L(r2, r9)     // Catch:{ all -> 0x0d4d }
            if (r2 != 0) goto L_0x054a
            if (r26 == 0) goto L_0x0537
            long r11 = r26.mo13534u()     // Catch:{ all -> 0x0d4d }
            long r14 = r3.mo13534u()     // Catch:{ all -> 0x0d4d }
            long r11 = r11 - r14
            long r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0d4d }
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0537
            b.l.a.c.e.i.l5 r2 = r26.clone()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o1 r2 = (p005b.p096l.p097a.p113c.p131e.p140i.C2895o1) r2     // Catch:{ all -> 0x0d4d }
            boolean r5 = r1.mo14370x(r2, r3)     // Catch:{ all -> 0x0d4d }
            if (r5 == 0) goto L_0x0537
            r5 = r30
            r8.mo13861g0(r5, r2)     // Catch:{ all -> 0x0d4d }
            r11 = r13
            r2 = 0
            r12 = 0
            goto L_0x053e
        L_0x0537:
            r5 = r30
            r2 = r3
            r11 = r18
            r12 = r26
        L_0x053e:
            r20 = r2
            r4 = r24
            r14 = r25
            r25 = r11
            r11 = r28
            goto L_0x0632
        L_0x054a:
            r5 = r30
            goto L_0x0628
        L_0x054e:
            r5 = r30
            r9 = r31
            b.l.a.c.h.b.f r2 = r44.mo14341G()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.x1 r6 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r6 = r6.mo13939s()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.a3<java.lang.Boolean> r11 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5391k0     // Catch:{ all -> 0x0d4d }
            boolean r2 = r2.mo14197r(r6, r11)     // Catch:{ all -> 0x0d4d }
            if (r2 == 0) goto L_0x0628
            java.lang.String r2 = "_ab"
            java.lang.String r6 = r3.mo13532s()     // Catch:{ all -> 0x0d4d }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0d4d }
            if (r2 == 0) goto L_0x0628
            b.l.a.c.h.b.l9 r2 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r2)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o5 r2 = r3.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.p1 r2 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r2     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.t1 r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6197L(r2, r9)     // Catch:{ all -> 0x0d4d }
            if (r2 != 0) goto L_0x0628
            if (r26 == 0) goto L_0x0628
            long r11 = r26.mo13534u()     // Catch:{ all -> 0x0d4d }
            long r14 = r3.mo13534u()     // Catch:{ all -> 0x0d4d }
            long r11 = r11 - r14
            long r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0d4d }
            r14 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r2 > 0) goto L_0x0628
            b.l.a.c.e.i.l5 r2 = r26.clone()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o1 r2 = (p005b.p096l.p097a.p113c.p131e.p140i.C2895o1) r2     // Catch:{ all -> 0x0d4d }
            r1.mo14371y(r2, r3)     // Catch:{ all -> 0x0d4d }
            java.lang.String r6 = r2.mo13532s()     // Catch:{ all -> 0x0d4d }
            boolean r6 = r10.equals(r6)     // Catch:{ all -> 0x0d4d }
            p005b.p006a.p007a.p024o.C0823f.m360b(r6)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.l9 r6 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r6)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o5 r6 = r2.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.p1 r6 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r6     // Catch:{ all -> 0x0d4d }
            r11 = r28
            b.l.a.c.e.i.t1 r6 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6197L(r6, r11)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.l9 r12 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r12)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o5 r12 = r2.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.p1 r12 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r12     // Catch:{ all -> 0x0d4d }
            r14 = r25
            b.l.a.c.e.i.t1 r12 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6197L(r12, r14)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.l9 r15 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r15)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o5 r15 = r2.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.p1 r15 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r15     // Catch:{ all -> 0x0d4d }
            r4 = r24
            b.l.a.c.e.i.t1 r15 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6197L(r15, r4)     // Catch:{ all -> 0x0d4d }
            java.lang.String r24 = ""
            if (r6 == 0) goto L_0x05e6
            java.lang.String r6 = r6.mo13739v()     // Catch:{ all -> 0x0d4d }
            goto L_0x05e8
        L_0x05e6:
            r6 = r24
        L_0x05e8:
            boolean r25 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0d4d }
            if (r25 != 0) goto L_0x05f9
            r25 = r13
            b.l.a.c.h.b.l9 r13 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r13)     // Catch:{ all -> 0x0d4d }
            p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6195J(r3, r11, r6)     // Catch:{ all -> 0x0d4d }
            goto L_0x05fb
        L_0x05f9:
            r25 = r13
        L_0x05fb:
            if (r12 == 0) goto L_0x0601
            java.lang.String r24 = r12.mo13739v()     // Catch:{ all -> 0x0d4d }
        L_0x0601:
            r6 = r24
            boolean r12 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0d4d }
            if (r12 != 0) goto L_0x0611
            b.l.a.c.h.b.l9 r12 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r12)     // Catch:{ all -> 0x0d4d }
            p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6195J(r3, r14, r6)     // Catch:{ all -> 0x0d4d }
        L_0x0611:
            if (r15 == 0) goto L_0x0623
            b.l.a.c.h.b.l9 r6 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r6)     // Catch:{ all -> 0x0d4d }
            long r12 = r15.mo13741x()     // Catch:{ all -> 0x0d4d }
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0d4d }
            p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6195J(r3, r4, r6)     // Catch:{ all -> 0x0d4d }
        L_0x0623:
            r8.mo13861g0(r5, r2)     // Catch:{ all -> 0x0d4d }
            r12 = 0
            goto L_0x0632
        L_0x0628:
            r4 = r24
            r14 = r25
            r11 = r28
            r25 = r13
        L_0x0630:
            r12 = r26
        L_0x0632:
            if (r23 != 0) goto L_0x0687
            java.lang.String r2 = r3.mo13532s()     // Catch:{ all -> 0x0d4d }
            boolean r2 = r10.equals(r2)     // Catch:{ all -> 0x0d4d }
            if (r2 == 0) goto L_0x0687
            int r2 = r3.mo13527n()     // Catch:{ all -> 0x0d4d }
            if (r2 != 0) goto L_0x0659
            b.l.a.c.h.b.o3 r2 = r44.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r2 = r2.mo14441p()     // Catch:{ all -> 0x0d4d }
            java.lang.String r6 = "Engagement event does not contain any parameters. appId"
            b.l.a.c.e.i.x1 r9 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r9 = r9.mo13939s()     // Catch:{ all -> 0x0d4d }
        L_0x0654:
            java.lang.Object r9 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r9)     // Catch:{ all -> 0x0d4d }
            goto L_0x067d
        L_0x0659:
            b.l.a.c.h.b.l9 r2 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r2)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o5 r2 = r3.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.p1 r2 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r2     // Catch:{ all -> 0x0d4d }
            java.lang.Object r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6198l(r2, r9)     // Catch:{ all -> 0x0d4d }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0d4d }
            if (r2 != 0) goto L_0x0681
            b.l.a.c.h.b.o3 r2 = r44.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r2 = r2.mo14441p()     // Catch:{ all -> 0x0d4d }
            java.lang.String r6 = "Engagement event does not include duration. appId"
            b.l.a.c.e.i.x1 r9 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r9 = r9.mo13939s()     // Catch:{ all -> 0x0d4d }
            goto L_0x0654
        L_0x067d:
            r2.mo14415b(r6, r9)     // Catch:{ all -> 0x0d4d }
            goto L_0x0687
        L_0x0681:
            long r9 = r2.longValue()     // Catch:{ all -> 0x0d4d }
            long r16 = r16 + r9
        L_0x0687:
            java.util.List<b.l.a.c.e.i.p1> r2 = r7.f5617c     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o5 r6 = r3.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.p1 r6 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r6     // Catch:{ all -> 0x0d4d }
            r9 = r27
            r2.set(r9, r6)     // Catch:{ all -> 0x0d4d }
            int r18 = r18 + 1
            r8.mo13862h0(r3)     // Catch:{ all -> 0x0d4d }
        L_0x0699:
            int r15 = r9 + 1
            r2 = r4
            r9 = r5
            r4 = r11
            r3 = r14
            r5 = r22
            r10 = r23
            r11 = r25
            r6 = r29
            goto L_0x005a
        L_0x06a9:
            r9 = r5
            if (r23 == 0) goto L_0x0702
            r3 = r18
            r2 = 0
        L_0x06af:
            if (r2 >= r3) goto L_0x0702
            b.l.a.c.e.i.p1 r4 = r8.mo13860f0(r2)     // Catch:{ all -> 0x0d4d }
            java.lang.String r5 = r4.mo13557v()     // Catch:{ all -> 0x0d4d }
            boolean r5 = r10.equals(r5)     // Catch:{ all -> 0x0d4d }
            if (r5 == 0) goto L_0x06d2
            b.l.a.c.h.b.l9 r5 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r5)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.t1 r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6197L(r4, r14)     // Catch:{ all -> 0x0d4d }
            if (r5 == 0) goto L_0x06d2
            r8.mo13865k0(r2)     // Catch:{ all -> 0x0d4d }
            int r3 = r3 + -1
            int r2 = r2 + -1
            goto L_0x06ff
        L_0x06d2:
            b.l.a.c.h.b.l9 r5 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r5)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.t1 r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6197L(r4, r9)     // Catch:{ all -> 0x0d4d }
            if (r4 == 0) goto L_0x06ff
            boolean r5 = r4.mo13740w()     // Catch:{ all -> 0x0d4d }
            if (r5 == 0) goto L_0x06ec
            long r4 = r4.mo13741x()     // Catch:{ all -> 0x0d4d }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0d4d }
            goto L_0x06ed
        L_0x06ec:
            r4 = 0
        L_0x06ed:
            if (r4 == 0) goto L_0x06ff
            long r5 = r4.longValue()     // Catch:{ all -> 0x0d4d }
            r11 = 0
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x06ff
            long r4 = r4.longValue()     // Catch:{ all -> 0x0d4d }
            long r16 = r16 + r4
        L_0x06ff:
            r4 = 1
            int r2 = r2 + r4
            goto L_0x06af
        L_0x0702:
            r2 = r16
            r4 = 0
            r1.mo14369w(r8, r2, r4)     // Catch:{ all -> 0x0d4d }
            java.util.List r4 = r8.mo13858d0()     // Catch:{ all -> 0x0d4d }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0d4d }
        L_0x0710:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0d4d }
            java.lang.String r6 = "_se"
            if (r5 == 0) goto L_0x0736
            java.lang.String r5 = "_s"
            java.lang.Object r9 = r4.next()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.p1 r9 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r9     // Catch:{ all -> 0x0d4d }
            java.lang.String r9 = r9.mo13557v()     // Catch:{ all -> 0x0d4d }
            boolean r5 = r5.equals(r9)     // Catch:{ all -> 0x0d4d }
            if (r5 == 0) goto L_0x0710
            b.l.a.c.h.b.j r4 = r1.f5650c     // Catch:{ all -> 0x0d4d }
            m6111F(r4)     // Catch:{ all -> 0x0d4d }
            java.lang.String r5 = r8.mo13879s()     // Catch:{ all -> 0x0d4d }
            r4.mo14289D(r5, r6)     // Catch:{ all -> 0x0d4d }
        L_0x0736:
            java.lang.String r4 = "_sid"
            int r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6193H(r8, r4)     // Catch:{ all -> 0x0d4d }
            if (r4 < 0) goto L_0x0743
            r4 = 1
            r1.mo14369w(r8, r2, r4)     // Catch:{ all -> 0x0d4d }
            goto L_0x0763
        L_0x0743:
            int r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6193H(r8, r6)     // Catch:{ all -> 0x0d4d }
            if (r2 < 0) goto L_0x0763
            r8.mo13878r0(r2)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.o3 r2 = r44.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r2 = r2.mo14440o()     // Catch:{ all -> 0x0d4d }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            b.l.a.c.e.i.x1 r4 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r4 = r4.mo13939s()     // Catch:{ all -> 0x0d4d }
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r4)     // Catch:{ all -> 0x0d4d }
            r2.mo14415b(r3, r4)     // Catch:{ all -> 0x0d4d }
        L_0x0763:
            b.l.a.c.h.b.l9 r2 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r2)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.p4 r3 = r2.f5638a     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.o3 r3 = r3.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r3 = r3.mo14444s()     // Catch:{ all -> 0x0d4d }
            java.lang.String r4 = "Checking account type status for ad personalization signals"
            r3.mo14414a(r4)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.j9 r3 = r2.f6128b     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.i4 r3 = r3.f5648a     // Catch:{ all -> 0x0d4d }
            m6111F(r3)     // Catch:{ all -> 0x0d4d }
            java.lang.String r4 = r8.mo13879s()     // Catch:{ all -> 0x0d4d }
            boolean r3 = r3.mo14269m(r4)     // Catch:{ all -> 0x0d4d }
            if (r3 == 0) goto L_0x07fa
            b.l.a.c.h.b.j9 r3 = r2.f6128b     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.j r3 = r3.f5650c     // Catch:{ all -> 0x0d4d }
            m6111F(r3)     // Catch:{ all -> 0x0d4d }
            java.lang.String r4 = r8.mo13879s()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.a5 r3 = r3.mo14299N(r4)     // Catch:{ all -> 0x0d4d }
            if (r3 == 0) goto L_0x07fa
            boolean r3 = r3.mo14108s()     // Catch:{ all -> 0x0d4d }
            if (r3 == 0) goto L_0x07fa
            b.l.a.c.h.b.p4 r3 = r2.f5638a     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m r3 = r3.mo14456A()     // Catch:{ all -> 0x0d4d }
            boolean r3 = r3.mo14413r()     // Catch:{ all -> 0x0d4d }
            if (r3 == 0) goto L_0x07fa
            b.l.a.c.h.b.p4 r3 = r2.f5638a     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.o3 r3 = r3.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r3 = r3.mo14443r()     // Catch:{ all -> 0x0d4d }
            java.lang.String r4 = "Turning off ad personalization due to account type"
            r3.mo14414a(r4)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.g2 r3 = p005b.p096l.p097a.p113c.p131e.p140i.C2805h2.m4786B()     // Catch:{ all -> 0x0d4d }
            r4 = r22
            r3.mo13340n(r4)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.p4 r2 = r2.f5638a     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m r2 = r2.mo14456A()     // Catch:{ all -> 0x0d4d }
            long r5 = r2.mo14412q()     // Catch:{ all -> 0x0d4d }
            r3.mo13339m(r5)     // Catch:{ all -> 0x0d4d }
            r5 = 1
            r3.mo13341o(r5)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o5 r2 = r3.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.h2 r2 = (p005b.p096l.p097a.p113c.p131e.p140i.C2805h2) r2     // Catch:{ all -> 0x0d4d }
            r3 = 0
        L_0x07dc:
            int r5 = r8.mo13868m0()     // Catch:{ all -> 0x0d4d }
            if (r3 >= r5) goto L_0x07f7
            b.l.a.c.e.i.h2 r5 = r8.mo13870n0(r3)     // Catch:{ all -> 0x0d4d }
            java.lang.String r5 = r5.mo13364u()     // Catch:{ all -> 0x0d4d }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x0d4d }
            if (r5 == 0) goto L_0x07f4
            r8.mo13872o0(r3, r2)     // Catch:{ all -> 0x0d4d }
            goto L_0x07fa
        L_0x07f4:
            int r3 = r3 + 1
            goto L_0x07dc
        L_0x07f7:
            r8.mo13874p0(r2)     // Catch:{ all -> 0x0d4d }
        L_0x07fa:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8.mo13884u0(r2)     // Catch:{ all -> 0x0d4d }
            r2 = -9223372036854775808
            r8.mo13888w0(r2)     // Catch:{ all -> 0x0d4d }
            r2 = 0
        L_0x0808:
            int r3 = r8.mo13859e0()     // Catch:{ all -> 0x0d4d }
            if (r2 >= r3) goto L_0x083b
            b.l.a.c.e.i.p1 r3 = r8.mo13860f0(r2)     // Catch:{ all -> 0x0d4d }
            long r4 = r3.mo13559x()     // Catch:{ all -> 0x0d4d }
            long r9 = r8.mo13882t0()     // Catch:{ all -> 0x0d4d }
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x0825
            long r4 = r3.mo13559x()     // Catch:{ all -> 0x0d4d }
            r8.mo13884u0(r4)     // Catch:{ all -> 0x0d4d }
        L_0x0825:
            long r4 = r3.mo13559x()     // Catch:{ all -> 0x0d4d }
            long r9 = r8.mo13886v0()     // Catch:{ all -> 0x0d4d }
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x0838
            long r3 = r3.mo13559x()     // Catch:{ all -> 0x0d4d }
            r8.mo13888w0(r3)     // Catch:{ all -> 0x0d4d }
        L_0x0838:
            int r2 = r2 + 1
            goto L_0x0808
        L_0x083b:
            r8.mo13845Q()     // Catch:{ all -> 0x0d4d }
            r8.mo13841M()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.da r9 = r1.f5653f     // Catch:{ all -> 0x0d4d }
            m6111F(r9)     // Catch:{ all -> 0x0d4d }
            java.lang.String r10 = r8.mo13879s()     // Catch:{ all -> 0x0d4d }
            java.util.List r11 = r8.mo13858d0()     // Catch:{ all -> 0x0d4d }
            java.util.List r12 = r8.mo13866l0()     // Catch:{ all -> 0x0d4d }
            long r2 = r8.mo13882t0()     // Catch:{ all -> 0x0d4d }
            java.lang.Long r13 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d4d }
            long r2 = r8.mo13886v0()     // Catch:{ all -> 0x0d4d }
            java.lang.Long r14 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d4d }
            java.util.List r2 = r9.mo14179l(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0d4d }
            r8.mo13840L(r2)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.f r2 = r44.mo14341G()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.x1 r3 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r3 = r3.mo13939s()     // Catch:{ all -> 0x0d4d }
            boolean r2 = r2.mo14204y(r3)     // Catch:{ all -> 0x0d4d }
            if (r2 == 0) goto L_0x0ba4
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0d4d }
            r2.<init>()     // Catch:{ all -> 0x0d4d }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0d4d }
            r3.<init>()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.q9 r4 = r44.mo14346L()     // Catch:{ all -> 0x0d4d }
            java.security.SecureRandom r4 = r4.mo14535e0()     // Catch:{ all -> 0x0d4d }
            r5 = 0
        L_0x088c:
            int r6 = r8.mo13859e0()     // Catch:{ all -> 0x0d4d }
            if (r5 >= r6) goto L_0x0b6e
            b.l.a.c.e.i.p1 r6 = r8.mo13860f0(r5)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.l5 r6 = r6.mo13546n()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o1 r6 = (p005b.p096l.p097a.p113c.p131e.p140i.C2895o1) r6     // Catch:{ all -> 0x0d4d }
            java.lang.String r9 = r6.mo13532s()     // Catch:{ all -> 0x0d4d }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0d4d }
            java.lang.String r10 = "_sr"
            java.lang.String r11 = "_efs"
            if (r9 == 0) goto L_0x091f
            b.l.a.c.h.b.l9 r9 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r9)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o5 r9 = r6.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.p1 r9 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r9     // Catch:{ all -> 0x0d4d }
            java.lang.String r12 = "_en"
            java.lang.Object r9 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6198l(r9, r12)     // Catch:{ all -> 0x0d4d }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0d4d }
            java.lang.Object r12 = r2.get(r9)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.o r12 = (p005b.p096l.p097a.p113c.p145h.p147b.C3265o) r12     // Catch:{ all -> 0x0d4d }
            if (r12 != 0) goto L_0x08de
            b.l.a.c.h.b.j r12 = r1.f5650c     // Catch:{ all -> 0x0d4d }
            m6111F(r12)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.x1 r13 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r13 = r13.mo13939s()     // Catch:{ all -> 0x0d4d }
            p005b.p006a.p007a.p024o.C0823f.m382m(r9)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.o r12 = r12.mo14287B(r13, r9)     // Catch:{ all -> 0x0d4d }
            if (r12 == 0) goto L_0x08de
            r2.put(r9, r12)     // Catch:{ all -> 0x0d4d }
        L_0x08de:
            if (r12 == 0) goto L_0x0a84
            java.lang.Long r9 = r12.f5790i     // Catch:{ all -> 0x0d4d }
            if (r9 != 0) goto L_0x0a84
            java.lang.Long r9 = r12.f5791j     // Catch:{ all -> 0x0d4d }
            if (r9 == 0) goto L_0x08fc
            long r13 = r9.longValue()     // Catch:{ all -> 0x0d4d }
            r15 = 1
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 <= 0) goto L_0x08fc
            b.l.a.c.h.b.l9 r9 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r9)     // Catch:{ all -> 0x0d4d }
            java.lang.Long r9 = r12.f5791j     // Catch:{ all -> 0x0d4d }
            p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6195J(r6, r10, r9)     // Catch:{ all -> 0x0d4d }
        L_0x08fc:
            java.lang.Boolean r9 = r12.f5792k     // Catch:{ all -> 0x0d4d }
            if (r9 == 0) goto L_0x0914
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0d4d }
            if (r9 == 0) goto L_0x0914
            b.l.a.c.h.b.l9 r9 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r9)     // Catch:{ all -> 0x0d4d }
            r9 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0d4d }
            p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6195J(r6, r11, r12)     // Catch:{ all -> 0x0d4d }
        L_0x0914:
            b.l.a.c.e.i.o5 r9 = r6.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.p1 r9 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r9     // Catch:{ all -> 0x0d4d }
        L_0x091a:
            r3.add(r9)     // Catch:{ all -> 0x0d4d }
            goto L_0x0a84
        L_0x091f:
            b.l.a.c.h.b.i4 r9 = r1.f5648a     // Catch:{ all -> 0x0d4d }
            m6111F(r9)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.x1 r12 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r12 = r12.mo13939s()     // Catch:{ all -> 0x0d4d }
            java.lang.String r13 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r13 = r9.mo14156b(r12, r13)     // Catch:{ all -> 0x0d4d }
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0d4d }
            if (r14 != 0) goto L_0x0950
            long r12 = java.lang.Long.parseLong(r13)     // Catch:{ NumberFormatException -> 0x093b }
            goto L_0x0952
        L_0x093b:
            r0 = move-exception
            r13 = r0
            b.l.a.c.h.b.p4 r9 = r9.f5638a     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.o3 r9 = r9.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r9 = r9.mo14441p()     // Catch:{ all -> 0x0d4d }
            java.lang.String r14 = "Unable to parse timezone offset. appId"
            java.lang.Object r12 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r12)     // Catch:{ all -> 0x0d4d }
            r9.mo14416c(r14, r12, r13)     // Catch:{ all -> 0x0d4d }
        L_0x0950:
            r12 = 0
        L_0x0952:
            b.l.a.c.h.b.q9 r9 = r44.mo14346L()     // Catch:{ all -> 0x0d4d }
            long r14 = r6.mo13534u()     // Catch:{ all -> 0x0d4d }
            long r14 = r9.mo14523N(r14, r12)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o5 r9 = r6.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.p1 r9 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r9     // Catch:{ all -> 0x0d4d }
            r18 = r11
            r16 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0d4d }
            r16 = r12
            java.lang.String r12 = "_dbg"
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0d4d }
            if (r13 != 0) goto L_0x09aa
            java.util.List r9 = r9.mo13554s()     // Catch:{ all -> 0x0d4d }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0d4d }
        L_0x097e:
            boolean r13 = r9.hasNext()     // Catch:{ all -> 0x0d4d }
            if (r13 == 0) goto L_0x09aa
            java.lang.Object r13 = r9.next()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.t1 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2960t1) r13     // Catch:{ all -> 0x0d4d }
            r20 = r9
            java.lang.String r9 = r13.mo13737t()     // Catch:{ all -> 0x0d4d }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0d4d }
            if (r9 == 0) goto L_0x09a7
            long r12 = r13.mo13741x()     // Catch:{ all -> 0x0d4d }
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0d4d }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0d4d }
            if (r9 != 0) goto L_0x09a5
            goto L_0x09aa
        L_0x09a5:
            r9 = 1
            goto L_0x09bd
        L_0x09a7:
            r9 = r20
            goto L_0x097e
        L_0x09aa:
            b.l.a.c.h.b.i4 r9 = r1.f5648a     // Catch:{ all -> 0x0d4d }
            m6111F(r9)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.x1 r11 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r11 = r11.mo13939s()     // Catch:{ all -> 0x0d4d }
            java.lang.String r12 = r6.mo13532s()     // Catch:{ all -> 0x0d4d }
            int r9 = r9.mo14273q(r11, r12)     // Catch:{ all -> 0x0d4d }
        L_0x09bd:
            if (r9 > 0) goto L_0x09dc
            b.l.a.c.h.b.o3 r10 = r44.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r10 = r10.mo14441p()     // Catch:{ all -> 0x0d4d }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r6.mo13532s()     // Catch:{ all -> 0x0d4d }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0d4d }
            r10.mo14416c(r11, r12, r9)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o5 r9 = r6.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.p1 r9 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r9     // Catch:{ all -> 0x0d4d }
            goto L_0x091a
        L_0x09dc:
            java.lang.String r11 = r6.mo13532s()     // Catch:{ all -> 0x0d4d }
            java.lang.Object r11 = r2.get(r11)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.o r11 = (p005b.p096l.p097a.p113c.p145h.p147b.C3265o) r11     // Catch:{ all -> 0x0d4d }
            if (r11 != 0) goto L_0x0a3c
            b.l.a.c.h.b.j r11 = r1.f5650c     // Catch:{ all -> 0x0d4d }
            m6111F(r11)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.x1 r12 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r12 = r12.mo13939s()     // Catch:{ all -> 0x0d4d }
            java.lang.String r13 = r6.mo13532s()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.o r11 = r11.mo14287B(r12, r13)     // Catch:{ all -> 0x0d4d }
            if (r11 != 0) goto L_0x0a3c
            b.l.a.c.h.b.o3 r11 = r44.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r11 = r11.mo14441p()     // Catch:{ all -> 0x0d4d }
            java.lang.String r12 = "Event being bundled has no eventAggregate. appId, eventName"
            b.l.a.c.e.i.x1 r13 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r13 = r13.mo13939s()     // Catch:{ all -> 0x0d4d }
            r20 = r14
            java.lang.String r14 = r6.mo13532s()     // Catch:{ all -> 0x0d4d }
            r11.mo14416c(r12, r13, r14)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.o r11 = new b.l.a.c.h.b.o     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.x1 r12 = r7.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r28 = r12.mo13939s()     // Catch:{ all -> 0x0d4d }
            java.lang.String r29 = r6.mo13532s()     // Catch:{ all -> 0x0d4d }
            r30 = 1
            r32 = 1
            r34 = 1
            long r36 = r6.mo13534u()     // Catch:{ all -> 0x0d4d }
            r38 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r27 = r11
            r27.<init>(r28, r29, r30, r32, r34, r36, r38, r40, r41, r42, r43)     // Catch:{ all -> 0x0d4d }
            goto L_0x0a3e
        L_0x0a3c:
            r20 = r14
        L_0x0a3e:
            b.l.a.c.h.b.l9 r12 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r12)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o5 r12 = r6.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.p1 r12 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r12     // Catch:{ all -> 0x0d4d }
            java.lang.String r13 = "_eid"
            java.lang.Object r12 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6198l(r12, r13)     // Catch:{ all -> 0x0d4d }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0d4d }
            if (r12 == 0) goto L_0x0a55
            r13 = 1
            goto L_0x0a56
        L_0x0a55:
            r13 = 0
        L_0x0a56:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x0d4d }
            r14 = 1
            if (r9 != r14) goto L_0x0a90
            b.l.a.c.e.i.o5 r9 = r6.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.p1 r9 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r9     // Catch:{ all -> 0x0d4d }
            r3.add(r9)     // Catch:{ all -> 0x0d4d }
            boolean r9 = r13.booleanValue()     // Catch:{ all -> 0x0d4d }
            if (r9 == 0) goto L_0x0a84
            java.lang.Long r9 = r11.f5790i     // Catch:{ all -> 0x0d4d }
            if (r9 != 0) goto L_0x0a78
            java.lang.Long r9 = r11.f5791j     // Catch:{ all -> 0x0d4d }
            if (r9 != 0) goto L_0x0a78
            java.lang.Boolean r9 = r11.f5792k     // Catch:{ all -> 0x0d4d }
            if (r9 == 0) goto L_0x0a84
        L_0x0a78:
            r9 = 0
            b.l.a.c.h.b.o r10 = r11.mo14439c(r9, r9, r9)     // Catch:{ all -> 0x0d4d }
            java.lang.String r9 = r6.mo13532s()     // Catch:{ all -> 0x0d4d }
            r2.put(r9, r10)     // Catch:{ all -> 0x0d4d }
        L_0x0a84:
            r8.mo13861g0(r5, r6)     // Catch:{ all -> 0x0d4d }
            r20 = r4
            r21 = r7
            r4 = r8
            r7 = 1
            goto L_0x0b65
        L_0x0a90:
            int r14 = r4.nextInt(r9)     // Catch:{ all -> 0x0d4d }
            if (r14 != 0) goto L_0x0ad1
            b.l.a.c.h.b.l9 r12 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r12)     // Catch:{ all -> 0x0d4d }
            long r14 = (long) r9     // Catch:{ all -> 0x0d4d }
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0d4d }
            p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6195J(r6, r10, r9)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o5 r10 = r6.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.p1 r10 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r10     // Catch:{ all -> 0x0d4d }
            r3.add(r10)     // Catch:{ all -> 0x0d4d }
            boolean r10 = r13.booleanValue()     // Catch:{ all -> 0x0d4d }
            if (r10 == 0) goto L_0x0ab7
            r10 = 0
            b.l.a.c.h.b.o r11 = r11.mo14439c(r10, r9, r10)     // Catch:{ all -> 0x0d4d }
        L_0x0ab7:
            java.lang.String r9 = r6.mo13532s()     // Catch:{ all -> 0x0d4d }
            long r12 = r6.mo13534u()     // Catch:{ all -> 0x0d4d }
            r14 = r20
            b.l.a.c.h.b.o r10 = r11.mo14438b(r12, r14)     // Catch:{ all -> 0x0d4d }
            r2.put(r9, r10)     // Catch:{ all -> 0x0d4d }
            r20 = r4
            r21 = r7
            r4 = r8
            r7 = 1
            goto L_0x0b62
        L_0x0ad1:
            r14 = r20
            r20 = r4
            java.lang.Long r4 = r11.f5789h     // Catch:{ all -> 0x0d4d }
            if (r4 == 0) goto L_0x0ae6
            long r16 = r4.longValue()     // Catch:{ all -> 0x0d4d }
            r21 = r7
            r32 = r8
            r23 = r11
            r22 = r12
            goto L_0x0afc
        L_0x0ae6:
            b.l.a.c.h.b.q9 r4 = r44.mo14346L()     // Catch:{ all -> 0x0d4d }
            r21 = r7
            r32 = r8
            long r7 = r6.mo13535v()     // Catch:{ all -> 0x0d4d }
            r23 = r11
            r22 = r12
            r11 = r16
            long r16 = r4.mo14523N(r7, r11)     // Catch:{ all -> 0x0d4d }
        L_0x0afc:
            int r4 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x0b48
            b.l.a.c.h.b.l9 r4 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r4)     // Catch:{ all -> 0x0d4d }
            r7 = 1
            java.lang.Long r4 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0d4d }
            r11 = r18
            p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6195J(r6, r11, r4)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.l9 r4 = r1.f5654g     // Catch:{ all -> 0x0d4d }
            m6111F(r4)     // Catch:{ all -> 0x0d4d }
            long r11 = (long) r9     // Catch:{ all -> 0x0d4d }
            java.lang.Long r4 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0d4d }
            p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6195J(r6, r10, r4)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o5 r9 = r6.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.p1 r9 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r9     // Catch:{ all -> 0x0d4d }
            r3.add(r9)     // Catch:{ all -> 0x0d4d }
            boolean r9 = r13.booleanValue()     // Catch:{ all -> 0x0d4d }
            if (r9 == 0) goto L_0x0b36
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0d4d }
            r11 = r23
            r10 = 0
            b.l.a.c.h.b.o r11 = r11.mo14439c(r10, r4, r9)     // Catch:{ all -> 0x0d4d }
            goto L_0x0b38
        L_0x0b36:
            r11 = r23
        L_0x0b38:
            java.lang.String r4 = r6.mo13532s()     // Catch:{ all -> 0x0d4d }
            long r9 = r6.mo13534u()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.o r9 = r11.mo14438b(r9, r14)     // Catch:{ all -> 0x0d4d }
            r2.put(r4, r9)     // Catch:{ all -> 0x0d4d }
            goto L_0x0b60
        L_0x0b48:
            r11 = r23
            r7 = 1
            boolean r4 = r13.booleanValue()     // Catch:{ all -> 0x0d4d }
            if (r4 == 0) goto L_0x0b60
            java.lang.String r4 = r6.mo13532s()     // Catch:{ all -> 0x0d4d }
            r12 = r22
            r9 = 0
            b.l.a.c.h.b.o r10 = r11.mo14439c(r12, r9, r9)     // Catch:{ all -> 0x0d4d }
            r2.put(r4, r10)     // Catch:{ all -> 0x0d4d }
        L_0x0b60:
            r4 = r32
        L_0x0b62:
            r4.mo13861g0(r5, r6)     // Catch:{ all -> 0x0d4d }
        L_0x0b65:
            int r5 = r5 + 1
            r8 = r4
            r4 = r20
            r7 = r21
            goto L_0x088c
        L_0x0b6e:
            r21 = r7
            r4 = r8
            int r5 = r3.size()     // Catch:{ all -> 0x0d4d }
            int r6 = r4.mo13859e0()     // Catch:{ all -> 0x0d4d }
            if (r5 >= r6) goto L_0x0b81
            r4.mo13864j0()     // Catch:{ all -> 0x0d4d }
            r4.mo13863i0(r3)     // Catch:{ all -> 0x0d4d }
        L_0x0b81:
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0d4d }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0d4d }
        L_0x0b89:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0d4d }
            if (r3 == 0) goto L_0x0ba7
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0d4d }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.j r5 = r1.f5650c     // Catch:{ all -> 0x0d4d }
            m6111F(r5)     // Catch:{ all -> 0x0d4d }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.o r3 = (p005b.p096l.p097a.p113c.p145h.p147b.C3265o) r3     // Catch:{ all -> 0x0d4d }
            r5.mo14288C(r3)     // Catch:{ all -> 0x0d4d }
            goto L_0x0b89
        L_0x0ba4:
            r21 = r7
            r4 = r8
        L_0x0ba7:
            r2 = r21
            b.l.a.c.e.i.x1 r3 = r2.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r3 = r3.mo13939s()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.j r5 = r1.f5650c     // Catch:{ all -> 0x0d4d }
            m6111F(r5)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.a5 r5 = r5.mo14299N(r3)     // Catch:{ all -> 0x0d4d }
            if (r5 != 0) goto L_0x0bd2
            b.l.a.c.h.b.o3 r5 = r44.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r5 = r5.mo14440o()     // Catch:{ all -> 0x0d4d }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            b.l.a.c.e.i.x1 r7 = r2.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r7 = r7.mo13939s()     // Catch:{ all -> 0x0d4d }
            java.lang.Object r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r7)     // Catch:{ all -> 0x0d4d }
            r5.mo14415b(r6, r7)     // Catch:{ all -> 0x0d4d }
            goto L_0x0c2e
        L_0x0bd2:
            int r6 = r4.mo13859e0()     // Catch:{ all -> 0x0d4d }
            if (r6 <= 0) goto L_0x0c2e
            long r6 = r5.mo14081N()     // Catch:{ all -> 0x0d4d }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0be6
            r4.mo13894z0(r6)     // Catch:{ all -> 0x0d4d }
            goto L_0x0be9
        L_0x0be6:
            r4.mo13830A0()     // Catch:{ all -> 0x0d4d }
        L_0x0be9:
            long r8 = r5.mo14079L()     // Catch:{ all -> 0x0d4d }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0bf4
            goto L_0x0bf5
        L_0x0bf4:
            r6 = r8
        L_0x0bf5:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0bfd
            r4.mo13890x0(r6)     // Catch:{ all -> 0x0d4d }
            goto L_0x0c00
        L_0x0bfd:
            r4.mo13892y0()     // Catch:{ all -> 0x0d4d }
        L_0x0c00:
            r5.mo14103n()     // Catch:{ all -> 0x0d4d }
            long r6 = r5.mo14098i()     // Catch:{ all -> 0x0d4d }
            int r6 = (int) r6     // Catch:{ all -> 0x0d4d }
            r4.mo13834E(r6)     // Catch:{ all -> 0x0d4d }
            long r6 = r4.mo13882t0()     // Catch:{ all -> 0x0d4d }
            r5.mo14080M(r6)     // Catch:{ all -> 0x0d4d }
            long r6 = r4.mo13886v0()     // Catch:{ all -> 0x0d4d }
            r5.mo14082O(r6)     // Catch:{ all -> 0x0d4d }
            java.lang.String r6 = r5.mo14104o()     // Catch:{ all -> 0x0d4d }
            if (r6 == 0) goto L_0x0c23
            r4.mo13835F(r6)     // Catch:{ all -> 0x0d4d }
            goto L_0x0c26
        L_0x0c23:
            r4.mo13836G()     // Catch:{ all -> 0x0d4d }
        L_0x0c26:
            b.l.a.c.h.b.j r6 = r1.f5650c     // Catch:{ all -> 0x0d4d }
            m6111F(r6)     // Catch:{ all -> 0x0d4d }
            r6.mo14300O(r5)     // Catch:{ all -> 0x0d4d }
        L_0x0c2e:
            int r5 = r4.mo13859e0()     // Catch:{ all -> 0x0d4d }
            if (r5 <= 0) goto L_0x0c92
            b.l.a.c.h.b.p4 r5 = r1.f5658k     // Catch:{ all -> 0x0d4d }
            r5.mo14327a()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.i4 r5 = r1.f5648a     // Catch:{ all -> 0x0d4d }
            m6111F(r5)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.x1 r6 = r2.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r6 = r6.mo13939s()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.d1 r5 = r5.mo14268l(r6)     // Catch:{ all -> 0x0d4d }
            if (r5 == 0) goto L_0x0c59
            boolean r6 = r5.mo13272s()     // Catch:{ all -> 0x0d4d }
            if (r6 != 0) goto L_0x0c51
            goto L_0x0c59
        L_0x0c51:
            long r5 = r5.mo13273t()     // Catch:{ all -> 0x0d4d }
            r4.mo13846R(r5)     // Catch:{ all -> 0x0d4d }
            goto L_0x0c82
        L_0x0c59:
            b.l.a.c.e.i.x1 r5 = r2.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r5 = r5.mo13914H()     // Catch:{ all -> 0x0d4d }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0d4d }
            if (r5 == 0) goto L_0x0c6b
            r5 = -1
            r4.mo13846R(r5)     // Catch:{ all -> 0x0d4d }
            goto L_0x0c82
        L_0x0c6b:
            b.l.a.c.h.b.o3 r5 = r44.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r5 = r5.mo14441p()     // Catch:{ all -> 0x0d4d }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            b.l.a.c.e.i.x1 r7 = r2.f5615a     // Catch:{ all -> 0x0d4d }
            java.lang.String r7 = r7.mo13939s()     // Catch:{ all -> 0x0d4d }
            java.lang.Object r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r7)     // Catch:{ all -> 0x0d4d }
            r5.mo14415b(r6, r7)     // Catch:{ all -> 0x0d4d }
        L_0x0c82:
            b.l.a.c.h.b.j r5 = r1.f5650c     // Catch:{ all -> 0x0d4d }
            m6111F(r5)     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.o5 r4 = r4.mo13484g()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.e.i.x1 r4 = (p005b.p096l.p097a.p113c.p131e.p140i.C3012x1) r4     // Catch:{ all -> 0x0d4d }
            r9 = r19
            r5.mo14304S(r4, r9)     // Catch:{ all -> 0x0d4d }
        L_0x0c92:
            b.l.a.c.h.b.j r4 = r1.f5650c     // Catch:{ all -> 0x0d4d }
            m6111F(r4)     // Catch:{ all -> 0x0d4d }
            java.util.List<java.lang.Long> r2 = r2.f5616b     // Catch:{ all -> 0x0d4d }
            p005b.p006a.p007a.p024o.C0823f.m382m(r2)     // Catch:{ all -> 0x0d4d }
            r4.mo14126h()     // Catch:{ all -> 0x0d4d }
            r4.mo14646i()     // Catch:{ all -> 0x0d4d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d4d }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0d4d }
            r6 = 0
        L_0x0caa:
            int r7 = r2.size()     // Catch:{ all -> 0x0d4d }
            if (r6 >= r7) goto L_0x0cc7
            if (r6 == 0) goto L_0x0cb7
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0d4d }
        L_0x0cb7:
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x0d4d }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0d4d }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d4d }
            r5.append(r7)     // Catch:{ all -> 0x0d4d }
            int r6 = r6 + 1
            goto L_0x0caa
        L_0x0cc7:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0d4d }
            android.database.sqlite.SQLiteDatabase r6 = r4.mo14286A()     // Catch:{ all -> 0x0d4d }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0d4d }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0d4d }
            int r6 = r2.size()     // Catch:{ all -> 0x0d4d }
            if (r5 == r6) goto L_0x0cfc
            b.l.a.c.h.b.p4 r4 = r4.f5638a     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.o3 r4 = r4.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r4 = r4.mo14440o()     // Catch:{ all -> 0x0d4d }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0d4d }
            int r2 = r2.size()     // Catch:{ all -> 0x0d4d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0d4d }
            r4.mo14416c(r6, r5, r2)     // Catch:{ all -> 0x0d4d }
        L_0x0cfc:
            b.l.a.c.h.b.j r2 = r1.f5650c     // Catch:{ all -> 0x0d4d }
            m6111F(r2)     // Catch:{ all -> 0x0d4d }
            android.database.sqlite.SQLiteDatabase r4 = r2.mo14286A()     // Catch:{ all -> 0x0d4d }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0d14 }
            r6 = 0
            r5[r6] = r3     // Catch:{ SQLiteException -> 0x0d14 }
            r6 = 1
            r5[r6] = r3     // Catch:{ SQLiteException -> 0x0d14 }
            java.lang.String r6 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r4.execSQL(r6, r5)     // Catch:{ SQLiteException -> 0x0d14 }
            goto L_0x0d29
        L_0x0d14:
            r0 = move-exception
            r4 = r0
            b.l.a.c.h.b.p4 r2 = r2.f5638a     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.m3 r2 = r2.mo14440o()     // Catch:{ all -> 0x0d4d }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r3)     // Catch:{ all -> 0x0d4d }
            r2.mo14416c(r5, r3, r4)     // Catch:{ all -> 0x0d4d }
        L_0x0d29:
            b.l.a.c.h.b.j r2 = r1.f5650c     // Catch:{ all -> 0x0d4d }
            m6111F(r2)     // Catch:{ all -> 0x0d4d }
            r2.mo14318y()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.j r2 = r1.f5650c
            m6111F(r2)
            r2.mo14319z()
            r2 = 1
            return r2
        L_0x0d3b:
            b.l.a.c.h.b.j r2 = r1.f5650c     // Catch:{ all -> 0x0d4d }
            m6111F(r2)     // Catch:{ all -> 0x0d4d }
            r2.mo14318y()     // Catch:{ all -> 0x0d4d }
            b.l.a.c.h.b.j r2 = r1.f5650c
            m6111F(r2)
            r2.mo14319z()
            r2 = 0
            return r2
        L_0x0d4d:
            r0 = move-exception
            r2 = r0
            b.l.a.c.h.b.j r3 = r1.f5650c
            m6111F(r3)
            r3.mo14319z()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.mo14368v(java.lang.String, long):boolean");
    }

    /* renamed from: w */
    public final void mo14369w(C2999w1 w1Var, long j, boolean z) {
        C3275o9 o9Var;
        String str = true != z ? "_lte" : "_se";
        C3210j jVar = this.f5650c;
        m6111F(jVar);
        C3275o9 F = jVar.mo14291F(w1Var.mo13879s(), str);
        if (F == null || F.f5823e == null) {
            String s = w1Var.mo13879s();
            Objects.requireNonNull((C1959c) mo14330e());
            o9Var = new C3275o9(s, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        } else {
            String s2 = w1Var.mo13879s();
            Objects.requireNonNull((C1959c) mo14330e());
            o9Var = new C3275o9(s2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) F.f5823e).longValue() + j));
        }
        C2792g2 B = C2805h2.m4786B();
        B.mo13340n(str);
        Objects.requireNonNull((C1959c) mo14330e());
        B.mo13339m(System.currentTimeMillis());
        B.mo13341o(((Long) o9Var.f5823e).longValue());
        C2805h2 h2Var = (C2805h2) B.mo13484g();
        int H = C3242l9.m6193H(w1Var, str);
        if (H >= 0) {
            if (w1Var.f4886i) {
                w1Var.mo13487j();
                w1Var.f4886i = false;
            }
            C3012x1.m5565K0((C3012x1) w1Var.f4885h, H, h2Var);
        } else {
            if (w1Var.f4886i) {
                w1Var.mo13487j();
                w1Var.f4886i = false;
            }
            C3012x1.m5566L0((C3012x1) w1Var.f4885h, h2Var);
        }
        if (j > 0) {
            C3210j jVar2 = this.f5650c;
            m6111F(jVar2);
            jVar2.mo14290E(o9Var);
            mo14329d().f5807n.mo14416c("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", o9Var.f5823e);
        }
    }

    /* renamed from: x */
    public final boolean mo14370x(C2895o1 o1Var, C2895o1 o1Var2) {
        C0823f.m360b("_e".equals(o1Var.mo13532s()));
        m6111F(this.f5654g);
        C2960t1 L = C3242l9.m6197L((C2908p1) o1Var.mo13484g(), "_sc");
        String str = null;
        String v = L == null ? null : L.mo13739v();
        m6111F(this.f5654g);
        C2960t1 L2 = C3242l9.m6197L((C2908p1) o1Var2.mo13484g(), "_pc");
        if (L2 != null) {
            str = L2.mo13739v();
        }
        if (str == null || !str.equals(v)) {
            return false;
        }
        mo14371y(o1Var, o1Var2);
        return true;
    }

    /* renamed from: y */
    public final void mo14371y(C2895o1 o1Var, C2895o1 o1Var2) {
        C0823f.m360b("_e".equals(o1Var.mo13532s()));
        m6111F(this.f5654g);
        C2960t1 L = C3242l9.m6197L((C2908p1) o1Var.mo13484g(), "_et");
        if (L != null && L.mo13740w() && L.mo13741x() > 0) {
            long x = L.mo13741x();
            m6111F(this.f5654g);
            C2960t1 L2 = C3242l9.m6197L((C2908p1) o1Var2.mo13484g(), "_et");
            if (L2 != null && L2.mo13741x() > 0) {
                x += L2.mo13741x();
            }
            m6111F(this.f5654g);
            C3242l9.m6195J(o1Var2, "_et", Long.valueOf(x));
            m6111F(this.f5654g);
            C3242l9.m6195J(o1Var, "_fr", 1L);
        }
    }

    /* renamed from: z */
    public final boolean mo14372z() {
        mo14331f().mo14126h();
        mo14347M();
        C3210j jVar = this.f5650c;
        m6111F(jVar);
        if (!(jVar.mo14315v("select count(1) > 0 from raw_events", (String[]) null) != 0)) {
            C3210j jVar2 = this.f5650c;
            m6111F(jVar2);
            return !TextUtils.isEmpty(jVar2.mo14305T());
        }
    }
}
