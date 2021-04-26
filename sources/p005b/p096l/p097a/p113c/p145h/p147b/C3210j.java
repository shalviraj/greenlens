package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.appcompat.widget.ActivityChooserView;
import com.amplitude.api.DatabaseHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;
import p005b.p096l.p097a.p113c.p131e.p140i.C2908p1;
import p005b.p096l.p097a.p113c.p131e.p140i.C3007w9;

/* renamed from: b.l.a.c.h.b.j */
public final class C3210j extends C3395z8 {

    /* renamed from: f */
    public static final String[] f5620f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g */
    public static final String[] f5621g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h */
    public static final String[] f5622h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};

    /* renamed from: i */
    public static final String[] f5623i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j */
    public static final String[] f5624j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k */
    public static final String[] f5625k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l */
    public static final String[] f5626l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m */
    public static final String[] f5627m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    public final C3199i f5628d;

    /* renamed from: e */
    public final C3351v8 f5629e = new C3351v8(this.f5638a.f5855n);

    public C3210j(C3220j9 j9Var) {
        super(j9Var);
        C3166f fVar = this.f5638a.f5848g;
        this.f5628d = new C3199i(this, this.f5638a.f5842a);
    }

    @WorkerThread
    /* renamed from: u */
    public static final void m6057u(ContentValues contentValues, String str, Object obj) {
        C0823f.m376j("value");
        Objects.requireNonNull(obj, "null reference");
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    @WorkerThread
    /* renamed from: A */
    public final SQLiteDatabase mo14286A() {
        mo14126h();
        try {
            return this.f5628d.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f5638a.mo14329d().f5802i.mo14415b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014c  */
    @androidx.annotation.WorkerThread
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p096l.p097a.p113c.p145h.p147b.C3265o mo14287B(java.lang.String r28, java.lang.String r29) {
        /*
            r27 = this;
            r1 = r27
            r15 = r29
            p005b.p006a.p007a.p024o.C0823f.m376j(r28)
            p005b.p006a.p007a.p024o.C0823f.m376j(r29)
            r27.mo14126h()
            r27.mo14646i()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String r10 = "current_session_count"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r2 = r27.mo14286A()     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            r10 = 0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            r6[r10] = r28     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            r11 = 1
            r6[r11] = r15     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            java.lang.String r3 = "events"
            java.lang.String r5 = "app_id=? and name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            boolean r2 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r2 != 0) goto L_0x005c
            r13.close()
            return r19
        L_0x005c:
            long r5 = r13.getLong(r10)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            long r7 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            long r16 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r0 = 3
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r3 = 0
            if (r2 == 0) goto L_0x0074
            r20 = r3
            goto L_0x0078
        L_0x0074:
            long r20 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
        L_0x0078:
            r0 = 4
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r2 == 0) goto L_0x0082
            r0 = r19
            goto L_0x008a
        L_0x0082:
            long r22 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
        L_0x008a:
            r2 = 5
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r9 == 0) goto L_0x0094
            r18 = r19
            goto L_0x009e
        L_0x0094:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r18 = r2
        L_0x009e:
            r2 = 6
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r9 == 0) goto L_0x00a8
            r22 = r19
            goto L_0x00b2
        L_0x00a8:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r22 = r2
        L_0x00b2:
            r2 = 7
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r9 != 0) goto L_0x00cb
            long r23 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r25 = 1
            int r2 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x00c4
            r10 = r11
        L_0x00c4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r23 = r2
            goto L_0x00cd
        L_0x00cb:
            r23 = r19
        L_0x00cd:
            r2 = 8
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r9 == 0) goto L_0x00d7
            r9 = r3
            goto L_0x00dc
        L_0x00d7:
            long r2 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r9 = r2
        L_0x00dc:
            b.l.a.c.h.b.o r24 = new b.l.a.c.h.b.o     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r2 = r24
            r3 = r28
            r4 = r29
            r11 = r16
            r25 = r13
            r13 = r20
            r15 = r0
            r16 = r18
            r17 = r22
            r18 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            boolean r0 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            if (r0 == 0) goto L_0x010b
            b.l.a.c.h.b.p4 r0 = r1.f5638a     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            b.l.a.c.h.b.m3 r0 = r0.f5799f     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r28)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            r0.mo14415b(r2, r3)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
        L_0x010b:
            r25.close()
            return r24
        L_0x010f:
            r0 = move-exception
            goto L_0x0116
        L_0x0111:
            r0 = move-exception
            goto L_0x011c
        L_0x0113:
            r0 = move-exception
            r25 = r13
        L_0x0116:
            r19 = r25
            goto L_0x014a
        L_0x0119:
            r0 = move-exception
            r25 = r13
        L_0x011c:
            r13 = r25
            goto L_0x0124
        L_0x011f:
            r0 = move-exception
            goto L_0x014a
        L_0x0121:
            r0 = move-exception
            r13 = r19
        L_0x0124:
            b.l.a.c.h.b.p4 r2 = r1.f5638a     // Catch:{ all -> 0x0147 }
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()     // Catch:{ all -> 0x0147 }
            b.l.a.c.h.b.m3 r2 = r2.f5799f     // Catch:{ all -> 0x0147 }
            java.lang.String r3 = "Error querying events. appId"
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r28)     // Catch:{ all -> 0x0147 }
            b.l.a.c.h.b.p4 r5 = r1.f5638a     // Catch:{ all -> 0x0147 }
            b.l.a.c.h.b.j3 r5 = r5.mo14468u()     // Catch:{ all -> 0x0147 }
            r6 = r29
            java.lang.String r5 = r5.mo14321p(r6)     // Catch:{ all -> 0x0147 }
            r2.mo14417d(r3, r4, r5, r0)     // Catch:{ all -> 0x0147 }
            if (r13 == 0) goto L_0x0146
            r13.close()
        L_0x0146:
            return r19
        L_0x0147:
            r0 = move-exception
            r19 = r13
        L_0x014a:
            if (r19 == 0) goto L_0x014f
            r19.close()
        L_0x014f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3210j.mo14287B(java.lang.String, java.lang.String):b.l.a.c.h.b.o");
    }

    @WorkerThread
    /* renamed from: C */
    public final void mo14288C(C3265o oVar) {
        Objects.requireNonNull(oVar, "null reference");
        mo14126h();
        mo14646i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", oVar.f5782a);
        contentValues.put("name", oVar.f5783b);
        contentValues.put("lifetime_count", Long.valueOf(oVar.f5784c));
        contentValues.put("current_bundle_count", Long.valueOf(oVar.f5785d));
        contentValues.put("last_fire_timestamp", Long.valueOf(oVar.f5787f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(oVar.f5788g));
        contentValues.put("last_bundled_day", oVar.f5789h);
        contentValues.put("last_sampled_complex_event_id", oVar.f5790i);
        contentValues.put("last_sampling_rate", oVar.f5791j);
        contentValues.put("current_session_count", Long.valueOf(oVar.f5786e));
        Boolean bool = oVar.f5792k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (mo14286A().insertWithOnConflict(DatabaseHelper.EVENT_TABLE_NAME, (String) null, contentValues, 5) == -1) {
                this.f5638a.mo14329d().f5799f.mo14415b("Failed to insert/update event aggregates (got -1). appId", C3269o3.m6253t(oVar.f5782a));
            }
        } catch (SQLiteException e) {
            this.f5638a.mo14329d().f5799f.mo14416c("Error storing event aggregates. appId", C3269o3.m6253t(oVar.f5782a), e);
        }
    }

    @WorkerThread
    /* renamed from: D */
    public final void mo14289D(String str, String str2) {
        C0823f.m376j(str);
        C0823f.m376j(str2);
        mo14126h();
        mo14646i();
        try {
            mo14286A().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f5638a.mo14329d().f5799f.mo14417d("Error deleting user property. appId", C3269o3.m6253t(str), this.f5638a.mo14468u().mo14323r(str2), e);
        }
    }

    @WorkerThread
    /* renamed from: E */
    public final boolean mo14290E(C3275o9 o9Var) {
        mo14126h();
        mo14646i();
        if (mo14291F(o9Var.f5819a, o9Var.f5821c) == null) {
            if (C3297q9.m6345f0(o9Var.f5821c)) {
                if (mo14315v("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{o9Var.f5819a}) >= ((long) this.f5638a.f5848g.mo14196q(o9Var.f5819a, C3134c3.f5350G, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(o9Var.f5821c)) {
                long v = mo14315v("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{o9Var.f5819a, o9Var.f5820b});
                C3166f fVar = this.f5638a.f5848g;
                if (v >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", o9Var.f5819a);
        contentValues.put("origin", o9Var.f5820b);
        contentValues.put("name", o9Var.f5821c);
        contentValues.put("set_timestamp", Long.valueOf(o9Var.f5822d));
        m6057u(contentValues, "value", o9Var.f5823e);
        try {
            if (mo14286A().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                this.f5638a.mo14329d().f5799f.mo14415b("Failed to insert/update user property (got -1). appId", C3269o3.m6253t(o9Var.f5819a));
            }
        } catch (SQLiteException e) {
            this.f5638a.mo14329d().f5799f.mo14416c("Error storing user property. appId", C3269o3.m6253t(o9Var.f5819a), e);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
    @androidx.annotation.WorkerThread
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p096l.p097a.p113c.p145h.p147b.C3275o9 mo14291F(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            p005b.p006a.p007a.p024o.C0823f.m376j(r20)
            p005b.p006a.p007a.p024o.C0823f.m376j(r21)
            r19.mo14126h()
            r19.mo14646i()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.mo14286A()     // Catch:{ SQLiteException -> 0x007c, all -> 0x007a }
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch:{ SQLiteException -> 0x007c, all -> 0x007a }
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x007c, all -> 0x007a }
            r2 = 0
            r15[r2] = r20     // Catch:{ SQLiteException -> 0x007c, all -> 0x007a }
            r3 = 1
            r15[r3] = r9     // Catch:{ SQLiteException -> 0x007c, all -> 0x007a }
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x007c, all -> 0x007a }
            boolean r4 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0074 }
            if (r4 != 0) goto L_0x0040
            r11.close()
            return r10
        L_0x0040:
            long r6 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.Object r8 = r1.mo14308n(r11, r3)     // Catch:{ SQLiteException -> 0x0074 }
            if (r8 != 0) goto L_0x004e
            r11.close()
            return r10
        L_0x004e:
            java.lang.String r4 = r11.getString(r0)     // Catch:{ SQLiteException -> 0x0074 }
            b.l.a.c.h.b.o9 r0 = new b.l.a.c.h.b.o9     // Catch:{ SQLiteException -> 0x0074 }
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x0074 }
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0074 }
            if (r2 == 0) goto L_0x0076
            b.l.a.c.h.b.p4 r2 = r1.f5638a     // Catch:{ SQLiteException -> 0x0074 }
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()     // Catch:{ SQLiteException -> 0x0074 }
            b.l.a.c.h.b.m3 r2 = r2.f5799f     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r20)     // Catch:{ SQLiteException -> 0x0074 }
            r2.mo14415b(r3, r4)     // Catch:{ SQLiteException -> 0x0074 }
            goto L_0x0076
        L_0x0074:
            r0 = move-exception
            goto L_0x007e
        L_0x0076:
            r11.close()
            return r0
        L_0x007a:
            r0 = move-exception
            goto L_0x00a1
        L_0x007c:
            r0 = move-exception
            r11 = r10
        L_0x007e:
            b.l.a.c.h.b.p4 r2 = r1.f5638a     // Catch:{ all -> 0x009f }
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()     // Catch:{ all -> 0x009f }
            b.l.a.c.h.b.m3 r2 = r2.f5799f     // Catch:{ all -> 0x009f }
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r20)     // Catch:{ all -> 0x009f }
            b.l.a.c.h.b.p4 r5 = r1.f5638a     // Catch:{ all -> 0x009f }
            b.l.a.c.h.b.j3 r5 = r5.mo14468u()     // Catch:{ all -> 0x009f }
            java.lang.String r5 = r5.mo14323r(r9)     // Catch:{ all -> 0x009f }
            r2.mo14417d(r3, r4, r5, r0)     // Catch:{ all -> 0x009f }
            if (r11 == 0) goto L_0x009e
            r11.close()
        L_0x009e:
            return r10
        L_0x009f:
            r0 = move-exception
            r10 = r11
        L_0x00a1:
            if (r10 == 0) goto L_0x00a6
            r10.close()
        L_0x00a6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3210j.mo14291F(java.lang.String, java.lang.String):b.l.a.c.h.b.o9");
    }

    @WorkerThread
    /* renamed from: G */
    public final List<C3275o9> mo14292G(String str) {
        C0823f.m376j(str);
        mo14126h();
        mo14646i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            C3166f fVar = this.f5638a.f5848g;
            Cursor query = mo14286A().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = query.getLong(2);
                    Object n = mo14308n(query, 3);
                    if (n == null) {
                        this.f5638a.mo14329d().f5799f.mo14415b("Read invalid user property value, ignoring it. appId", C3269o3.m6253t(str));
                    } else {
                        arrayList.add(new C3275o9(str, str2, string, j, n));
                    }
                } while (query.moveToNext());
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            this.f5638a.mo14329d().f5799f.mo14416c("Error querying user properties. appId", C3269o3.m6253t(str), e);
            List<C3275o9> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0112  */
    @androidx.annotation.WorkerThread
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p005b.p096l.p097a.p113c.p145h.p147b.C3275o9> mo14293H(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            r16 = this;
            r1 = r16
            p005b.p006a.p007a.p024o.C0823f.m376j(r17)
            r16.mo14126h()
            r16.mo14646i()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1001"
            r11 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00f6 }
            r12 = 3
            r2.<init>(r12)     // Catch:{ SQLiteException -> 0x00f6 }
            r13 = r17
            r2.add(r13)     // Catch:{ SQLiteException -> 0x00f4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00f4 }
            java.lang.String r4 = "app_id=?"
            r3.<init>(r4)     // Catch:{ SQLiteException -> 0x00f4 }
            boolean r4 = android.text.TextUtils.isEmpty(r18)     // Catch:{ SQLiteException -> 0x00f4 }
            if (r4 != 0) goto L_0x0036
            r14 = r18
            r2.add(r14)     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r4 = " and origin=?"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x00b0 }
            goto L_0x0038
        L_0x0036:
            r14 = r18
        L_0x0038:
            boolean r4 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SQLiteException -> 0x00b0 }
            if (r4 != 0) goto L_0x0050
            java.lang.String r4 = java.lang.String.valueOf(r19)     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r5 = "*"
            java.lang.String r4 = r4.concat(r5)     // Catch:{ SQLiteException -> 0x00b0 }
            r2.add(r4)     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r4 = " and name glob ?"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x00b0 }
        L_0x0050:
            int r4 = r2.size()     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.Object[] r2 = r2.toArray(r4)     // Catch:{ SQLiteException -> 0x00b0 }
            r6 = r2
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ SQLiteException -> 0x00b0 }
            android.database.sqlite.SQLiteDatabase r2 = r16.mo14286A()     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r4 = "user_attributes"
            java.lang.String r5 = "name"
            java.lang.String r7 = "set_timestamp"
            java.lang.String r8 = "value"
            java.lang.String r9 = "origin"
            java.lang.String[] r5 = new java.lang.String[]{r5, r7, r8, r9}     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r7 = r3.toString()     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r9 = "rowid"
            b.l.a.c.h.b.p4 r3 = r1.f5638a     // Catch:{ SQLiteException -> 0x00b0 }
            b.l.a.c.h.b.f r3 = r3.f5848g     // Catch:{ SQLiteException -> 0x00b0 }
            r8 = 0
            r15 = 0
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r8
            r8 = r15
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00b0 }
            boolean r2 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x00b0 }
            if (r2 != 0) goto L_0x008e
            r11.close()
            return r0
        L_0x008e:
            int r2 = r0.size()     // Catch:{ SQLiteException -> 0x00b0 }
            b.l.a.c.h.b.p4 r3 = r1.f5638a     // Catch:{ SQLiteException -> 0x00b0 }
            b.l.a.c.h.b.f r4 = r3.f5848g     // Catch:{ SQLiteException -> 0x00b0 }
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r2 < r4) goto L_0x00b2
            b.l.a.c.h.b.o3 r2 = r3.mo14329d()     // Catch:{ SQLiteException -> 0x00b0 }
            b.l.a.c.h.b.m3 r2 = r2.f5799f     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r3 = "Read more than the max allowed user properties, ignoring excess"
            b.l.a.c.h.b.p4 r5 = r1.f5638a     // Catch:{ SQLiteException -> 0x00b0 }
            b.l.a.c.h.b.f r5 = r5.f5848g     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x00b0 }
            r2.mo14415b(r3, r4)     // Catch:{ SQLiteException -> 0x00b0 }
            goto L_0x00f0
        L_0x00ae:
            r0 = move-exception
            goto L_0x0116
        L_0x00b0:
            r0 = move-exception
            goto L_0x00fb
        L_0x00b2:
            r2 = 0
            java.lang.String r6 = r11.getString(r2)     // Catch:{ SQLiteException -> 0x00b0 }
            r2 = 1
            long r7 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x00b0 }
            r2 = 2
            java.lang.Object r9 = r1.mo14308n(r11, r2)     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r14 = r11.getString(r12)     // Catch:{ SQLiteException -> 0x00b0 }
            if (r9 != 0) goto L_0x00db
            b.l.a.c.h.b.p4 r2 = r1.f5638a     // Catch:{ SQLiteException -> 0x00b0 }
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()     // Catch:{ SQLiteException -> 0x00b0 }
            b.l.a.c.h.b.m3 r2 = r2.f5799f     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r3 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r17)     // Catch:{ SQLiteException -> 0x00b0 }
            r10 = r19
            r2.mo14417d(r3, r4, r14, r10)     // Catch:{ SQLiteException -> 0x00b0 }
            goto L_0x00e9
        L_0x00db:
            r10 = r19
            b.l.a.c.h.b.o9 r2 = new b.l.a.c.h.b.o9     // Catch:{ SQLiteException -> 0x00b0 }
            r3 = r2
            r4 = r17
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r9)     // Catch:{ SQLiteException -> 0x00b0 }
            r0.add(r2)     // Catch:{ SQLiteException -> 0x00b0 }
        L_0x00e9:
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x00b0 }
            if (r2 == 0) goto L_0x00f0
            goto L_0x008e
        L_0x00f0:
            r11.close()
            return r0
        L_0x00f4:
            r0 = move-exception
            goto L_0x00f9
        L_0x00f6:
            r0 = move-exception
            r13 = r17
        L_0x00f9:
            r14 = r18
        L_0x00fb:
            b.l.a.c.h.b.p4 r2 = r1.f5638a     // Catch:{ all -> 0x00ae }
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()     // Catch:{ all -> 0x00ae }
            b.l.a.c.h.b.m3 r2 = r2.f5799f     // Catch:{ all -> 0x00ae }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r17)     // Catch:{ all -> 0x00ae }
            r2.mo14417d(r3, r4, r14, r0)     // Catch:{ all -> 0x00ae }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00ae }
            if (r11 == 0) goto L_0x0115
            r11.close()
        L_0x0115:
            return r0
        L_0x0116:
            if (r11 == 0) goto L_0x011b
            r11.close()
        L_0x011b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3210j.mo14293H(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    @WorkerThread
    /* renamed from: I */
    public final boolean mo14294I(C3118b bVar) {
        mo14126h();
        mo14646i();
        String str = bVar.f5302g;
        Objects.requireNonNull(str, "null reference");
        if (mo14291F(str, bVar.f5304i.f5751h) == null) {
            long v = mo14315v("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            C3166f fVar = this.f5638a.f5848g;
            if (v >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", bVar.f5303h);
        contentValues.put("name", bVar.f5304i.f5751h);
        Object V = bVar.f5304i.mo14428V();
        Objects.requireNonNull(V, "null reference");
        m6057u(contentValues, "value", V);
        contentValues.put("active", Boolean.valueOf(bVar.f5306k));
        contentValues.put("trigger_event_name", bVar.f5307l);
        contentValues.put("trigger_timeout", Long.valueOf(bVar.f5309n));
        contentValues.put("timed_out_event", this.f5638a.mo14467t().mo14521L(bVar.f5308m));
        contentValues.put("creation_timestamp", Long.valueOf(bVar.f5305j));
        contentValues.put("triggered_event", this.f5638a.mo14467t().mo14521L(bVar.f5310o));
        contentValues.put("triggered_timestamp", Long.valueOf(bVar.f5304i.f5752i));
        contentValues.put("time_to_live", Long.valueOf(bVar.f5311p));
        contentValues.put("expired_event", this.f5638a.mo14467t().mo14521L(bVar.f5312q));
        try {
            if (mo14286A().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                this.f5638a.mo14329d().f5799f.mo14415b("Failed to insert/update conditional user property (got -1)", C3269o3.m6253t(str));
            }
        } catch (SQLiteException e) {
            this.f5638a.mo14329d().f5799f.mo14416c("Error storing conditional user property", C3269o3.m6253t(str), e);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x011f  */
    @androidx.annotation.WorkerThread
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p096l.p097a.p113c.p145h.p147b.C3118b mo14295J(java.lang.String r31, java.lang.String r32) {
        /*
            r30 = this;
            r1 = r30
            r8 = r32
            p005b.p006a.p007a.p024o.C0823f.m376j(r31)
            p005b.p006a.p007a.p024o.C0823f.m376j(r32)
            r30.mo14126h()
            r30.mo14646i()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r30.mo14286A()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f6 }
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r12 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f6 }
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f6 }
            r2 = 0
            r14[r2] = r31     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f6 }
            r3 = 1
            r14[r3] = r8     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f6 }
            java.lang.String r11 = "conditional_properties"
            java.lang.String r13 = "app_id=? and name=?"
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f6 }
            boolean r4 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x00f4 }
            if (r4 != 0) goto L_0x004f
            r10.close()
            return r9
        L_0x004f:
            java.lang.String r17 = r10.getString(r2)     // Catch:{ SQLiteException -> 0x00f4 }
            java.lang.Object r6 = r1.mo14308n(r10, r3)     // Catch:{ SQLiteException -> 0x00f4 }
            int r0 = r10.getInt(r0)     // Catch:{ SQLiteException -> 0x00f4 }
            if (r0 == 0) goto L_0x0060
            r21 = r3
            goto L_0x0062
        L_0x0060:
            r21 = r2
        L_0x0062:
            r0 = 3
            java.lang.String r22 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x00f4 }
            r0 = 4
            long r24 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f4 }
            b.l.a.c.h.b.j9 r0 = r1.f6128b     // Catch:{ SQLiteException -> 0x00f4 }
            b.l.a.c.h.b.l9 r0 = r0.f5654g     // Catch:{ SQLiteException -> 0x00f4 }
            p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.m6111F(r0)     // Catch:{ SQLiteException -> 0x00f4 }
            r2 = 5
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f4 }
            android.os.Parcelable$Creator<b.l.a.c.h.b.s> r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3309s.CREATOR     // Catch:{ SQLiteException -> 0x00f4 }
            android.os.Parcelable r0 = r0.mo14409y(r2, r3)     // Catch:{ SQLiteException -> 0x00f4 }
            r23 = r0
            b.l.a.c.h.b.s r23 = (p005b.p096l.p097a.p113c.p145h.p147b.C3309s) r23     // Catch:{ SQLiteException -> 0x00f4 }
            r0 = 6
            long r19 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f4 }
            b.l.a.c.h.b.j9 r0 = r1.f6128b     // Catch:{ SQLiteException -> 0x00f4 }
            b.l.a.c.h.b.l9 r0 = r0.f5654g     // Catch:{ SQLiteException -> 0x00f4 }
            p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.m6111F(r0)     // Catch:{ SQLiteException -> 0x00f4 }
            r2 = 7
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f4 }
            android.os.Parcelable r0 = r0.mo14409y(r2, r3)     // Catch:{ SQLiteException -> 0x00f4 }
            r26 = r0
            b.l.a.c.h.b.s r26 = (p005b.p096l.p097a.p113c.p145h.p147b.C3309s) r26     // Catch:{ SQLiteException -> 0x00f4 }
            r0 = 8
            long r4 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f4 }
            r0 = 9
            long r27 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f4 }
            b.l.a.c.h.b.j9 r0 = r1.f6128b     // Catch:{ SQLiteException -> 0x00f4 }
            b.l.a.c.h.b.l9 r0 = r0.f5654g     // Catch:{ SQLiteException -> 0x00f4 }
            p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.m6111F(r0)     // Catch:{ SQLiteException -> 0x00f4 }
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f4 }
            android.os.Parcelable r0 = r0.mo14409y(r2, r3)     // Catch:{ SQLiteException -> 0x00f4 }
            r29 = r0
            b.l.a.c.h.b.s r29 = (p005b.p096l.p097a.p113c.p145h.p147b.C3309s) r29     // Catch:{ SQLiteException -> 0x00f4 }
            b.l.a.c.h.b.m9 r18 = new b.l.a.c.h.b.m9     // Catch:{ SQLiteException -> 0x00f4 }
            r2 = r18
            r3 = r32
            r7 = r17
            r2.<init>(r3, r4, r6, r7)     // Catch:{ SQLiteException -> 0x00f4 }
            b.l.a.c.h.b.b r0 = new b.l.a.c.h.b.b     // Catch:{ SQLiteException -> 0x00f4 }
            r15 = r0
            r16 = r31
            r15.<init>(r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r29)     // Catch:{ SQLiteException -> 0x00f4 }
            boolean r2 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x00f4 }
            if (r2 == 0) goto L_0x00f0
            b.l.a.c.h.b.p4 r2 = r1.f5638a     // Catch:{ SQLiteException -> 0x00f4 }
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()     // Catch:{ SQLiteException -> 0x00f4 }
            b.l.a.c.h.b.m3 r2 = r2.f5799f     // Catch:{ SQLiteException -> 0x00f4 }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r31)     // Catch:{ SQLiteException -> 0x00f4 }
            b.l.a.c.h.b.p4 r5 = r1.f5638a     // Catch:{ SQLiteException -> 0x00f4 }
            b.l.a.c.h.b.j3 r5 = r5.mo14468u()     // Catch:{ SQLiteException -> 0x00f4 }
            java.lang.String r5 = r5.mo14323r(r8)     // Catch:{ SQLiteException -> 0x00f4 }
            r2.mo14416c(r3, r4, r5)     // Catch:{ SQLiteException -> 0x00f4 }
        L_0x00f0:
            r10.close()
            return r0
        L_0x00f4:
            r0 = move-exception
            goto L_0x00fa
        L_0x00f6:
            r0 = move-exception
            goto L_0x011d
        L_0x00f8:
            r0 = move-exception
            r10 = r9
        L_0x00fa:
            b.l.a.c.h.b.p4 r2 = r1.f5638a     // Catch:{ all -> 0x011b }
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()     // Catch:{ all -> 0x011b }
            b.l.a.c.h.b.m3 r2 = r2.f5799f     // Catch:{ all -> 0x011b }
            java.lang.String r3 = "Error querying conditional property"
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r31)     // Catch:{ all -> 0x011b }
            b.l.a.c.h.b.p4 r5 = r1.f5638a     // Catch:{ all -> 0x011b }
            b.l.a.c.h.b.j3 r5 = r5.mo14468u()     // Catch:{ all -> 0x011b }
            java.lang.String r5 = r5.mo14323r(r8)     // Catch:{ all -> 0x011b }
            r2.mo14417d(r3, r4, r5, r0)     // Catch:{ all -> 0x011b }
            if (r10 == 0) goto L_0x011a
            r10.close()
        L_0x011a:
            return r9
        L_0x011b:
            r0 = move-exception
            r9 = r10
        L_0x011d:
            if (r9 == 0) goto L_0x0122
            r9.close()
        L_0x0122:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3210j.mo14295J(java.lang.String, java.lang.String):b.l.a.c.h.b.b");
    }

    @WorkerThread
    /* renamed from: K */
    public final int mo14296K(String str, String str2) {
        C0823f.m376j(str);
        C0823f.m376j(str2);
        mo14126h();
        mo14646i();
        try {
            return mo14286A().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f5638a.mo14329d().f5799f.mo14417d("Error deleting conditional property", C3269o3.m6253t(str), this.f5638a.mo14468u().mo14323r(str2), e);
            return 0;
        }
    }

    @WorkerThread
    /* renamed from: L */
    public final List<C3118b> mo14297L(String str, String str2, String str3) {
        C0823f.m376j(str);
        mo14126h();
        mo14646i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return mo14298M(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: M */
    public final List<C3118b> mo14298M(String str, String[] strArr) {
        mo14126h();
        mo14646i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            C3166f fVar = this.f5638a.f5848g;
            Cursor query = mo14286A().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (query.moveToFirst()) {
                while (true) {
                    int size = arrayList.size();
                    C3281p4 p4Var = this.f5638a;
                    C3166f fVar2 = p4Var.f5848g;
                    if (size < 1000) {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        Object n = mo14308n(query, 3);
                        boolean z = query.getInt(4) != 0;
                        String string4 = query.getString(5);
                        long j = query.getLong(6);
                        C3242l9 l9Var = this.f6128b.f5654g;
                        C3220j9.m6111F(l9Var);
                        byte[] blob = query.getBlob(7);
                        Parcelable.Creator creator = C3309s.CREATOR;
                        long j2 = query.getLong(8);
                        C3242l9 l9Var2 = this.f6128b.f5654g;
                        C3220j9.m6111F(l9Var2);
                        long j3 = query.getLong(10);
                        long j4 = query.getLong(11);
                        C3242l9 l9Var3 = this.f6128b.f5654g;
                        C3220j9.m6111F(l9Var3);
                        arrayList.add(new C3118b(string, string2, new C3253m9(string3, j3, n, string2), j2, z, string4, (C3309s) l9Var.mo14409y(blob, creator), j, (C3309s) l9Var2.mo14409y(query.getBlob(9), creator), j4, (C3309s) l9Var3.mo14409y(query.getBlob(12), creator)));
                        if (!query.moveToNext()) {
                            break;
                        }
                    } else {
                        C3247m3 m3Var = p4Var.mo14329d().f5799f;
                        C3166f fVar3 = this.f5638a.f5848g;
                        m3Var.mo14415b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        break;
                    }
                }
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            this.f5638a.mo14329d().f5799f.mo14415b("Error querying conditional user property value", e);
            List<C3118b> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ee A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00f0 A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x010d A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x010f A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x012c A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x012e A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x014b A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x014d A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x016d A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0171 A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0199 A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x019b A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01b8 A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01ba A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01d7 A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01f0 A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x020c A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x020d A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x021c A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x023d A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0257 A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x028e  */
    @androidx.annotation.WorkerThread
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p096l.p097a.p113c.p145h.p147b.C3112a5 mo14299N(java.lang.String r34) {
        /*
            r33 = this;
            r1 = r33
            r2 = r34
            p005b.p006a.p007a.p024o.C0823f.m376j(r34)
            r33.mo14126h()
            r33.mo14646i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r33.mo14286A()     // Catch:{ SQLiteException -> 0x0271, all -> 0x026f }
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "admob_app_id"
            java.lang.String r30 = "dynamite_version"
            java.lang.String r31 = "safelisted_events"
            java.lang.String r32 = "ga_app_id"
            java.lang.String[] r6 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32}     // Catch:{ SQLiteException -> 0x0271, all -> 0x026f }
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0271, all -> 0x026f }
            r12 = 0
            r8[r12] = r2     // Catch:{ SQLiteException -> 0x0271, all -> 0x026f }
            java.lang.String r5 = "apps"
            java.lang.String r7 = "app_id=?"
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0271, all -> 0x026f }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0269 }
            if (r5 != 0) goto L_0x0069
            r4.close()
            return r3
        L_0x0069:
            b.l.a.c.h.b.a5 r5 = new b.l.a.c.h.b.a5     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.j9 r6 = r1.f6128b     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.p4 r6 = r6.f5658k     // Catch:{ SQLiteException -> 0x0269 }
            r5.<init>(r6, r2)     // Catch:{ SQLiteException -> 0x0269 }
            java.lang.String r6 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x0269 }
            r5.mo14068A(r6)     // Catch:{ SQLiteException -> 0x0269 }
            java.lang.String r6 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0269 }
            r5.mo14070C(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 2
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.mo14076I(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.mo14097h(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 4
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.mo14080M(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 5
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.mo14082O(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 6
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.mo14084Q(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 7
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.mo14088U(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 8
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.mo14090a(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 9
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.mo14092c(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 10
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0269 }
            if (r7 != 0) goto L_0x00d3
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x0269 }
            if (r6 == 0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            r6 = r12
            goto L_0x00d4
        L_0x00d3:
            r6 = r0
        L_0x00d4:
            r5.mo14096g(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 11
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.p4 r8 = r5.f5263a     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.m4 r8 = r8.mo14331f()     // Catch:{ SQLiteException -> 0x0269 }
            r8.mo14126h()     // Catch:{ SQLiteException -> 0x0269 }
            boolean r8 = r5.f5260D     // Catch:{ SQLiteException -> 0x0269 }
            long r9 = r5.f5285w     // Catch:{ SQLiteException -> 0x0269 }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x00f0
            r9 = r0
            goto L_0x00f1
        L_0x00f0:
            r9 = r12
        L_0x00f1:
            r8 = r8 | r9
            r5.f5260D = r8     // Catch:{ SQLiteException -> 0x0269 }
            r5.f5285w = r6     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 12
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.p4 r8 = r5.f5263a     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.m4 r8 = r8.mo14331f()     // Catch:{ SQLiteException -> 0x0269 }
            r8.mo14126h()     // Catch:{ SQLiteException -> 0x0269 }
            boolean r8 = r5.f5260D     // Catch:{ SQLiteException -> 0x0269 }
            long r9 = r5.f5286x     // Catch:{ SQLiteException -> 0x0269 }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x010f
            r9 = r0
            goto L_0x0110
        L_0x010f:
            r9 = r12
        L_0x0110:
            r8 = r8 | r9
            r5.f5260D = r8     // Catch:{ SQLiteException -> 0x0269 }
            r5.f5286x = r6     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 13
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.p4 r8 = r5.f5263a     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.m4 r8 = r8.mo14331f()     // Catch:{ SQLiteException -> 0x0269 }
            r8.mo14126h()     // Catch:{ SQLiteException -> 0x0269 }
            boolean r8 = r5.f5260D     // Catch:{ SQLiteException -> 0x0269 }
            long r9 = r5.f5287y     // Catch:{ SQLiteException -> 0x0269 }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x012e
            r9 = r0
            goto L_0x012f
        L_0x012e:
            r9 = r12
        L_0x012f:
            r8 = r8 | r9
            r5.f5260D = r8     // Catch:{ SQLiteException -> 0x0269 }
            r5.f5287y = r6     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 14
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.p4 r8 = r5.f5263a     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.m4 r8 = r8.mo14331f()     // Catch:{ SQLiteException -> 0x0269 }
            r8.mo14126h()     // Catch:{ SQLiteException -> 0x0269 }
            boolean r8 = r5.f5260D     // Catch:{ SQLiteException -> 0x0269 }
            long r9 = r5.f5288z     // Catch:{ SQLiteException -> 0x0269 }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x014d
            r9 = r0
            goto L_0x014e
        L_0x014d:
            r9 = r12
        L_0x014e:
            r8 = r8 | r9
            r5.f5260D = r8     // Catch:{ SQLiteException -> 0x0269 }
            r5.f5288z = r6     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 15
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.mo14100k(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 16
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.mo14102m(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 17
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0269 }
            if (r7 == 0) goto L_0x0171
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0176
        L_0x0171:
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x0269 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x0269 }
        L_0x0176:
            r5.mo14086S(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 18
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.mo14078K(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 19
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.p4 r8 = r5.f5263a     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.m4 r8 = r8.mo14331f()     // Catch:{ SQLiteException -> 0x0269 }
            r8.mo14126h()     // Catch:{ SQLiteException -> 0x0269 }
            boolean r8 = r5.f5260D     // Catch:{ SQLiteException -> 0x0269 }
            long r9 = r5.f5257A     // Catch:{ SQLiteException -> 0x0269 }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x019b
            r9 = r0
            goto L_0x019c
        L_0x019b:
            r9 = r12
        L_0x019c:
            r8 = r8 | r9
            r5.f5260D = r8     // Catch:{ SQLiteException -> 0x0269 }
            r5.f5257A = r6     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 20
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.p4 r8 = r5.f5263a     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.m4 r8 = r8.mo14331f()     // Catch:{ SQLiteException -> 0x0269 }
            r8.mo14126h()     // Catch:{ SQLiteException -> 0x0269 }
            boolean r8 = r5.f5260D     // Catch:{ SQLiteException -> 0x0269 }
            long r9 = r5.f5258B     // Catch:{ SQLiteException -> 0x0269 }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x01ba
            r9 = r0
            goto L_0x01bb
        L_0x01ba:
            r9 = r12
        L_0x01bb:
            r8 = r8 | r9
            r5.f5260D = r8     // Catch:{ SQLiteException -> 0x0269 }
            r5.f5258B = r6     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 21
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.mo14105p(r6)     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.p4 r6 = r1.f5638a     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.f r6 = r6.f5848g     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.a3<java.lang.Boolean> r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5409t0     // Catch:{ SQLiteException -> 0x0269 }
            boolean r6 = r6.mo14197r(r3, r7)     // Catch:{ SQLiteException -> 0x0269 }
            r7 = 0
            if (r6 != 0) goto L_0x01e8
            r6 = 22
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0269 }
            if (r9 == 0) goto L_0x01e1
            r9 = r7
            goto L_0x01e5
        L_0x01e1:
            long r9 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
        L_0x01e5:
            r5.mo14107r(r9)     // Catch:{ SQLiteException -> 0x0269 }
        L_0x01e8:
            r6 = 23
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0269 }
            if (r9 != 0) goto L_0x01f8
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x0269 }
            if (r6 == 0) goto L_0x01f7
            goto L_0x01f8
        L_0x01f7:
            r0 = r12
        L_0x01f8:
            r5.mo14109t(r0)     // Catch:{ SQLiteException -> 0x0269 }
            r0 = 24
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0269 }
            r5.mo14072E(r0)     // Catch:{ SQLiteException -> 0x0269 }
            r0 = 25
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x0269 }
            if (r6 == 0) goto L_0x020d
            goto L_0x0211
        L_0x020d:
            long r7 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x0269 }
        L_0x0211:
            r5.mo14094e(r7)     // Catch:{ SQLiteException -> 0x0269 }
            r0 = 26
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x0269 }
            if (r6 != 0) goto L_0x022e
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0269 }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x0269 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x0269 }
            r5.mo14113x(r0)     // Catch:{ SQLiteException -> 0x0269 }
        L_0x022e:
            p005b.p096l.p097a.p113c.p131e.p140i.C3007w9.m5549b()     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.p4 r0 = r1.f5638a     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.f r0 = r0.f5848g     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.a3<java.lang.Boolean> r6 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5385h0     // Catch:{ SQLiteException -> 0x0269 }
            boolean r0 = r0.mo14197r(r2, r6)     // Catch:{ SQLiteException -> 0x0269 }
            if (r0 == 0) goto L_0x0246
            r0 = 27
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0269 }
            r5.mo14074G(r0)     // Catch:{ SQLiteException -> 0x0269 }
        L_0x0246:
            b.l.a.c.h.b.p4 r0 = r5.f5263a     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.m4 r0 = r0.mo14331f()     // Catch:{ SQLiteException -> 0x0269 }
            r0.mo14126h()     // Catch:{ SQLiteException -> 0x0269 }
            r5.f5260D = r12     // Catch:{ SQLiteException -> 0x0269 }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0269 }
            if (r0 == 0) goto L_0x026b
            b.l.a.c.h.b.p4 r0 = r1.f5638a     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.h.b.m3 r0 = r0.f5799f     // Catch:{ SQLiteException -> 0x0269 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r34)     // Catch:{ SQLiteException -> 0x0269 }
            r0.mo14415b(r6, r7)     // Catch:{ SQLiteException -> 0x0269 }
            goto L_0x026b
        L_0x0269:
            r0 = move-exception
            goto L_0x0273
        L_0x026b:
            r4.close()
            return r5
        L_0x026f:
            r0 = move-exception
            goto L_0x028c
        L_0x0271:
            r0 = move-exception
            r4 = r3
        L_0x0273:
            b.l.a.c.h.b.p4 r5 = r1.f5638a     // Catch:{ all -> 0x028a }
            b.l.a.c.h.b.o3 r5 = r5.mo14329d()     // Catch:{ all -> 0x028a }
            b.l.a.c.h.b.m3 r5 = r5.f5799f     // Catch:{ all -> 0x028a }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r34)     // Catch:{ all -> 0x028a }
            r5.mo14416c(r6, r2, r0)     // Catch:{ all -> 0x028a }
            if (r4 == 0) goto L_0x0289
            r4.close()
        L_0x0289:
            return r3
        L_0x028a:
            r0 = move-exception
            r3 = r4
        L_0x028c:
            if (r3 == 0) goto L_0x0291
            r3.close()
        L_0x0291:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3210j.mo14299N(java.lang.String):b.l.a.c.h.b.a5");
    }

    @WorkerThread
    /* renamed from: O */
    public final void mo14300O(C3112a5 a5Var) {
        mo14126h();
        mo14646i();
        String y = a5Var.mo14114y();
        Objects.requireNonNull(y, "null reference");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", y);
        contentValues.put("app_instance_id", a5Var.mo14115z());
        contentValues.put("gmp_app_id", a5Var.mo14069B());
        contentValues.put("resettable_device_id_hash", a5Var.mo14075H());
        contentValues.put("last_bundle_index", Long.valueOf(a5Var.mo14098i()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(a5Var.mo14079L()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(a5Var.mo14081N()));
        contentValues.put("app_version", a5Var.mo14083P());
        contentValues.put("app_store", a5Var.mo14087T());
        contentValues.put("gmp_version", Long.valueOf(a5Var.mo14089V()));
        contentValues.put("dev_cert_hash", Long.valueOf(a5Var.mo14091b()));
        contentValues.put("measurement_enabled", Boolean.valueOf(a5Var.mo14095f()));
        a5Var.f5263a.mo14331f().mo14126h();
        contentValues.put("day", Long.valueOf(a5Var.f5285w));
        a5Var.f5263a.mo14331f().mo14126h();
        contentValues.put("daily_public_events_count", Long.valueOf(a5Var.f5286x));
        a5Var.f5263a.mo14331f().mo14126h();
        contentValues.put("daily_events_count", Long.valueOf(a5Var.f5287y));
        a5Var.f5263a.mo14331f().mo14126h();
        contentValues.put("daily_conversions_count", Long.valueOf(a5Var.f5288z));
        a5Var.f5263a.mo14331f().mo14126h();
        contentValues.put("config_fetched_time", Long.valueOf(a5Var.f5261E));
        a5Var.f5263a.mo14331f().mo14126h();
        contentValues.put("failed_config_fetch_time", Long.valueOf(a5Var.f5262F));
        contentValues.put("app_version_int", Long.valueOf(a5Var.mo14085R()));
        contentValues.put("firebase_instance_id", a5Var.mo14077J());
        a5Var.f5263a.mo14331f().mo14126h();
        contentValues.put("daily_error_events_count", Long.valueOf(a5Var.f5257A));
        a5Var.f5263a.mo14331f().mo14126h();
        contentValues.put("daily_realtime_events_count", Long.valueOf(a5Var.f5258B));
        a5Var.f5263a.mo14331f().mo14126h();
        contentValues.put("health_monitor_sample", a5Var.f5259C);
        contentValues.put("android_id", Long.valueOf(a5Var.mo14106q()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(a5Var.mo14108s()));
        contentValues.put("admob_app_id", a5Var.mo14071D());
        contentValues.put("dynamite_version", Long.valueOf(a5Var.mo14093d()));
        List<String> w = a5Var.mo14112w();
        if (w != null) {
            if (w.size() == 0) {
                this.f5638a.mo14329d().f5802i.mo14415b("Safelisted events should not be an empty list. appId", y);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", w));
            }
        }
        C3007w9.m5549b();
        if (this.f5638a.f5848g.mo14197r(y, C3134c3.f5385h0)) {
            contentValues.put("ga_app_id", a5Var.mo14073F());
        }
        try {
            SQLiteDatabase A = mo14286A();
            if (((long) A.update("apps", contentValues, "app_id = ?", new String[]{y})) == 0 && A.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                this.f5638a.mo14329d().f5799f.mo14415b("Failed to insert/update app (got -1). appId", C3269o3.m6253t(y));
            }
        } catch (SQLiteException e) {
            this.f5638a.mo14329d().f5799f.mo14416c("Error storing app. appId", C3269o3.m6253t(y), e);
        }
    }

    @WorkerThread
    /* renamed from: P */
    public final C3188h mo14301P(long j, String str, boolean z, boolean z2) {
        return mo14302Q(j, str, 1, false, false, z, false, z2);
    }

    @WorkerThread
    /* renamed from: Q */
    public final C3188h mo14302Q(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C0823f.m376j(str);
        mo14126h();
        mo14646i();
        String[] strArr = {str};
        C3188h hVar = new C3188h();
        Cursor cursor = null;
        try {
            SQLiteDatabase A = mo14286A();
            cursor = A.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                this.f5638a.mo14329d().f5802i.mo14415b("Not updating daily counts, app is not known. appId", C3269o3.m6253t(str));
                cursor.close();
                return hVar;
            }
            if (cursor.getLong(0) == j) {
                hVar.f5568b = cursor.getLong(1);
                hVar.f5567a = cursor.getLong(2);
                hVar.f5569c = cursor.getLong(3);
                hVar.f5570d = cursor.getLong(4);
                hVar.f5571e = cursor.getLong(5);
            }
            if (z) {
                hVar.f5568b += j2;
            }
            if (z2) {
                hVar.f5567a += j2;
            }
            if (z3) {
                hVar.f5569c += j2;
            }
            if (z4) {
                hVar.f5570d += j2;
            }
            if (z5) {
                hVar.f5571e += j2;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(hVar.f5567a));
            contentValues.put("daily_events_count", Long.valueOf(hVar.f5568b));
            contentValues.put("daily_conversions_count", Long.valueOf(hVar.f5569c));
            contentValues.put("daily_error_events_count", Long.valueOf(hVar.f5570d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(hVar.f5571e));
            A.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return hVar;
        } catch (SQLiteException e) {
            this.f5638a.mo14329d().f5799f.mo14416c("Error updating daily counts. appId", C3269o3.m6253t(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return hVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    /* renamed from: R */
    public final void mo14303R(String str, byte[] bArr, String str2) {
        C0823f.m376j(str);
        mo14126h();
        mo14646i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (((long) mo14286A().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                this.f5638a.mo14329d().f5799f.mo14415b("Failed to update remote config (got 0). appId", C3269o3.m6253t(str));
            }
        } catch (SQLiteException e) {
            this.f5638a.mo14329d().f5799f.mo14416c("Error storing remote config. appId", C3269o3.m6253t(str), e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0045, code lost:
        if (r2 > (p005b.p096l.p097a.p113c.p145h.p147b.C3166f.m5926i() + r0)) goto L_0x0047;
     */
    @androidx.annotation.WorkerThread
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14304S(p005b.p096l.p097a.p113c.p131e.p140i.C3012x1 r7, boolean r8) {
        /*
            r6 = this;
            r6.mo14126h()
            r6.mo14646i()
            java.lang.String r0 = r7.mo13939s()
            p005b.p006a.p007a.p024o.C0823f.m376j(r0)
            boolean r0 = r7.mo13940s1()
            p005b.p006a.p007a.p024o.C0823f.m384n(r0)
            r6.mo14306l()
            b.l.a.c.h.b.p4 r0 = r6.f5638a
            b.l.a.c.b.p.b r0 = r0.f5855n
            b.l.a.c.b.p.c r0 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r0
            java.util.Objects.requireNonNull(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.mo13943t1()
            b.l.a.c.h.b.p4 r4 = r6.f5638a
            b.l.a.c.h.b.f r4 = r4.f5848g
            long r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3166f.m5926i()
            long r4 = r0 - r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0047
            long r2 = r7.mo13943t1()
            b.l.a.c.h.b.p4 r4 = r6.f5638a
            b.l.a.c.h.b.f r4 = r4.f5848g
            long r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3166f.m5926i()
            long r4 = r4 + r0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0068
        L_0x0047:
            b.l.a.c.h.b.p4 r2 = r6.f5638a
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()
            b.l.a.c.h.b.m3 r2 = r2.f5802i
            java.lang.String r3 = r7.mo13939s()
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r4 = r7.mo13943t1()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            r2.mo14417d(r4, r3, r0, r1)
        L_0x0068:
            byte[] r0 = r7.mo13371e()
            r1 = 0
            b.l.a.c.h.b.j9 r2 = r6.f6128b     // Catch:{ IOException -> 0x0103 }
            b.l.a.c.h.b.l9 r2 = r2.f5654g     // Catch:{ IOException -> 0x0103 }
            p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.m6111F(r2)     // Catch:{ IOException -> 0x0103 }
            byte[] r0 = r2.mo14401F(r0)     // Catch:{ IOException -> 0x0103 }
            b.l.a.c.h.b.p4 r2 = r6.f5638a
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()
            b.l.a.c.h.b.m3 r2 = r2.f5807n
            int r3 = r0.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "Saving bundle, size"
            r2.mo14415b(r4, r3)
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.String r3 = r7.mo13939s()
            java.lang.String r4 = "app_id"
            r2.put(r4, r3)
            long r3 = r7.mo13943t1()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "bundle_end_timestamp"
            r2.put(r4, r3)
            java.lang.String r3 = "data"
            r2.put(r3, r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r0 = "has_realtime"
            r2.put(r0, r8)
            boolean r8 = r7.mo13945u0()
            if (r8 == 0) goto L_0x00c6
            int r8 = r7.mo13948v0()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r0 = "retry_count"
            r2.put(r0, r8)
        L_0x00c6:
            android.database.sqlite.SQLiteDatabase r8 = r6.mo14286A()     // Catch:{ SQLiteException -> 0x00ef }
            java.lang.String r0 = "queue"
            r3 = 0
            long r2 = r8.insert(r0, r3, r2)     // Catch:{ SQLiteException -> 0x00ef }
            r4 = -1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x00ed
            b.l.a.c.h.b.p4 r8 = r6.f5638a     // Catch:{ SQLiteException -> 0x00ef }
            b.l.a.c.h.b.o3 r8 = r8.mo14329d()     // Catch:{ SQLiteException -> 0x00ef }
            b.l.a.c.h.b.m3 r8 = r8.f5799f     // Catch:{ SQLiteException -> 0x00ef }
            java.lang.String r0 = "Failed to insert bundle (got -1). appId"
            java.lang.String r2 = r7.mo13939s()     // Catch:{ SQLiteException -> 0x00ef }
            java.lang.Object r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r2)     // Catch:{ SQLiteException -> 0x00ef }
            r8.mo14415b(r0, r2)     // Catch:{ SQLiteException -> 0x00ef }
            return r1
        L_0x00ed:
            r7 = 1
            return r7
        L_0x00ef:
            r8 = move-exception
            b.l.a.c.h.b.p4 r0 = r6.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5799f
            java.lang.String r7 = r7.mo13939s()
            java.lang.Object r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r7)
            java.lang.String r2 = "Error storing bundle. appId"
            goto L_0x0116
        L_0x0103:
            r8 = move-exception
            b.l.a.c.h.b.p4 r0 = r6.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5799f
            java.lang.String r7 = r7.mo13939s()
            java.lang.Object r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r7)
            java.lang.String r2 = "Data loss. Failed to serialize bundle. appId"
        L_0x0116:
            r0.mo14416c(r2, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3210j.mo14304S(b.l.a.c.e.i.x1, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e  */
    @androidx.annotation.WorkerThread
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo14305T() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo14286A()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0022, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0025
        L_0x0020:
            r0 = move-exception
            goto L_0x003c
        L_0x0022:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0025:
            b.l.a.c.h.b.p4 r3 = r6.f5638a     // Catch:{ all -> 0x0038 }
            b.l.a.c.h.b.o3 r3 = r3.mo14329d()     // Catch:{ all -> 0x0038 }
            b.l.a.c.h.b.m3 r3 = r3.f5799f     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo14415b(r4, r2)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0037
            r0.close()
        L_0x0037:
            return r1
        L_0x0038:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.close()
        L_0x0041:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3210j.mo14305T():java.lang.String");
    }

    /* renamed from: j */
    public final boolean mo14178j() {
        return false;
    }

    @WorkerThread
    /* renamed from: l */
    public final void mo14306l() {
        mo14126h();
        mo14646i();
        if (mo14313s()) {
            long a = this.f6128b.f5656i.f5559g.mo14633a();
            Objects.requireNonNull((C1959c) this.f5638a.f5855n);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - a);
            C3166f fVar = this.f5638a.f5848g;
            if (abs > C3134c3.f5418y.mo14064a(null).longValue()) {
                this.f6128b.f5656i.f5559g.mo14634b(elapsedRealtime);
                mo14126h();
                mo14646i();
                if (mo14313s()) {
                    SQLiteDatabase A = mo14286A();
                    Objects.requireNonNull((C1959c) this.f5638a.f5855n);
                    C3166f fVar2 = this.f5638a.f5848g;
                    int delete = A.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(C3166f.m5926i())});
                    if (delete > 0) {
                        this.f5638a.mo14329d().f5807n.mo14415b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    @WorkerThread
    /* renamed from: m */
    public final void mo14307m(List<Long> list) {
        mo14126h();
        mo14646i();
        if (list.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        } else if (mo14313s()) {
            String join = TextUtils.join(",", list);
            String q = C0843a.m456q(new StringBuilder(String.valueOf(join).length() + 2), "(", join, ")");
            if (mo14315v(C0843a.m456q(new StringBuilder(String.valueOf(q).length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", q, " AND retry_count =  2147483647 LIMIT 1"), (String[]) null) > 0) {
                this.f5638a.mo14329d().f5802i.mo14414a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase A = mo14286A();
                StringBuilder sb = new StringBuilder(String.valueOf(q).length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(q);
                sb.append(" AND (retry_count IS NULL OR retry_count < ");
                sb.append(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                sb.append(")");
                A.execSQL(sb.toString());
            } catch (SQLiteException e) {
                this.f5638a.mo14329d().f5799f.mo14415b("Error incrementing retry count. error", e);
            }
        }
    }

    @WorkerThread
    /* renamed from: n */
    public final Object mo14308n(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            this.f5638a.mo14329d().f5799f.mo14414a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                this.f5638a.mo14329d().f5799f.mo14415b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            this.f5638a.mo14329d().f5799f.mo14414a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    @WorkerThread
    /* renamed from: o */
    public final long mo14309o(String str, String str2) {
        long j;
        SQLiteException e;
        C0823f.m376j(str);
        C0823f.m376j("first_open_count");
        mo14126h();
        mo14646i();
        SQLiteDatabase A = mo14286A();
        A.beginTransaction();
        try {
            j = mo14316w("select first_open_count from app2 where app_id=?", new String[]{str}, -1);
            if (j == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (A.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    this.f5638a.mo14329d().f5799f.mo14416c("Failed to insert column (got -1). appId", C3269o3.m6253t(str), "first_open_count");
                    A.endTransaction();
                    return -1;
                }
                j = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + j));
                if (((long) A.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    this.f5638a.mo14329d().f5799f.mo14416c("Failed to update column (got 0). appId", C3269o3.m6253t(str), "first_open_count");
                    A.endTransaction();
                    return -1;
                }
                A.setTransactionSuccessful();
                A.endTransaction();
                return j;
            } catch (SQLiteException e2) {
                e = e2;
            }
        } catch (SQLiteException e3) {
            j = 0;
            e = e3;
            try {
                this.f5638a.mo14329d().f5799f.mo14417d("Error inserting column. appId", C3269o3.m6253t(str), "first_open_count", e);
                A.endTransaction();
                return j;
            } catch (Throwable th) {
                A.endTransaction();
                throw th;
            }
        }
    }

    /* renamed from: p */
    public final long mo14310p(String str) {
        C0823f.m376j(str);
        return mo14316w("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* renamed from: q */
    public final boolean mo14311q(String str, Long l, long j, C2908p1 p1Var) {
        mo14126h();
        mo14646i();
        Objects.requireNonNull(p1Var, "null reference");
        C0823f.m376j(str);
        byte[] e = p1Var.mo13371e();
        this.f5638a.mo14329d().f5807n.mo14416c("Saving complex main event, appId, data size", this.f5638a.mo14468u().mo14321p(str), Integer.valueOf(e.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", e);
        try {
            if (mo14286A().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            this.f5638a.mo14329d().f5799f.mo14415b("Failed to insert complex main event (got -1). appId", C3269o3.m6253t(str));
            return false;
        } catch (SQLiteException e2) {
            this.f5638a.mo14329d().f5799f.mo14416c("Error storing complex main event. appId", C3269o3.m6253t(str), e2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d6  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo14312r(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo14126h()
            r7.mo14646i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo14286A()     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
            r3 = 0
            r2[r3] = r8     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x002e }
            if (r2 != 0) goto L_0x0031
            b.l.a.c.h.b.p4 r8 = r7.f5638a     // Catch:{ SQLiteException -> 0x002e }
            b.l.a.c.h.b.o3 r8 = r8.mo14329d()     // Catch:{ SQLiteException -> 0x002e }
            b.l.a.c.h.b.m3 r8 = r8.f5807n     // Catch:{ SQLiteException -> 0x002e }
            java.lang.String r2 = "Default event parameters not found"
            r8.mo14414a(r2)     // Catch:{ SQLiteException -> 0x002e }
            r1.close()
            return r0
        L_0x002e:
            r8 = move-exception
            goto L_0x00bf
        L_0x0031:
            byte[] r2 = r1.getBlob(r3)     // Catch:{ SQLiteException -> 0x002e }
            b.l.a.c.e.i.o1 r3 = p005b.p096l.p097a.p113c.p131e.p140i.C2908p1.m5058C()     // Catch:{ IOException -> 0x00a5 }
            b.l.a.c.e.i.g4 r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6192G(r3, r2)     // Catch:{ IOException -> 0x00a5 }
            b.l.a.c.e.i.o1 r2 = (p005b.p096l.p097a.p113c.p131e.p140i.C2895o1) r2     // Catch:{ IOException -> 0x00a5 }
            b.l.a.c.e.i.o5 r2 = r2.mo13484g()     // Catch:{ IOException -> 0x00a5 }
            b.l.a.c.e.i.p1 r2 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r2     // Catch:{ IOException -> 0x00a5 }
            b.l.a.c.h.b.j9 r8 = r7.f6128b     // Catch:{ SQLiteException -> 0x002e }
            b.l.a.c.h.b.l9 r8 = r8.f5654g     // Catch:{ SQLiteException -> 0x002e }
            p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.m6111F(r8)     // Catch:{ SQLiteException -> 0x002e }
            java.util.List r8 = r2.mo13554s()     // Catch:{ SQLiteException -> 0x002e }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x002e }
            r2.<init>()     // Catch:{ SQLiteException -> 0x002e }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x002e }
        L_0x0059:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x002e }
            if (r3 == 0) goto L_0x00a1
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x002e }
            b.l.a.c.e.i.t1 r3 = (p005b.p096l.p097a.p113c.p131e.p140i.C2960t1) r3     // Catch:{ SQLiteException -> 0x002e }
            java.lang.String r4 = r3.mo13737t()     // Catch:{ SQLiteException -> 0x002e }
            boolean r5 = r3.mo13732A()     // Catch:{ SQLiteException -> 0x002e }
            if (r5 == 0) goto L_0x0077
            double r5 = r3.mo13733B()     // Catch:{ SQLiteException -> 0x002e }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x002e }
            goto L_0x0059
        L_0x0077:
            boolean r5 = r3.mo13742y()     // Catch:{ SQLiteException -> 0x002e }
            if (r5 == 0) goto L_0x0085
            float r3 = r3.mo13743z()     // Catch:{ SQLiteException -> 0x002e }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x002e }
            goto L_0x0059
        L_0x0085:
            boolean r5 = r3.mo13738u()     // Catch:{ SQLiteException -> 0x002e }
            if (r5 == 0) goto L_0x0093
            java.lang.String r3 = r3.mo13739v()     // Catch:{ SQLiteException -> 0x002e }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x002e }
            goto L_0x0059
        L_0x0093:
            boolean r5 = r3.mo13740w()     // Catch:{ SQLiteException -> 0x002e }
            if (r5 == 0) goto L_0x0059
            long r5 = r3.mo13741x()     // Catch:{ SQLiteException -> 0x002e }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x002e }
            goto L_0x0059
        L_0x00a1:
            r1.close()
            return r2
        L_0x00a5:
            r2 = move-exception
            b.l.a.c.h.b.p4 r3 = r7.f5638a     // Catch:{ SQLiteException -> 0x002e }
            b.l.a.c.h.b.o3 r3 = r3.mo14329d()     // Catch:{ SQLiteException -> 0x002e }
            b.l.a.c.h.b.m3 r3 = r3.f5799f     // Catch:{ SQLiteException -> 0x002e }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r8)     // Catch:{ SQLiteException -> 0x002e }
            r3.mo14416c(r4, r8, r2)     // Catch:{ SQLiteException -> 0x002e }
            r1.close()
            return r0
        L_0x00bb:
            r8 = move-exception
            goto L_0x00d4
        L_0x00bd:
            r8 = move-exception
            r1 = r0
        L_0x00bf:
            b.l.a.c.h.b.p4 r2 = r7.f5638a     // Catch:{ all -> 0x00d2 }
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()     // Catch:{ all -> 0x00d2 }
            b.l.a.c.h.b.m3 r2 = r2.f5799f     // Catch:{ all -> 0x00d2 }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.mo14415b(r3, r8)     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x00d1
            r1.close()
        L_0x00d1:
            return r0
        L_0x00d2:
            r8 = move-exception
            r0 = r1
        L_0x00d4:
            if (r0 == 0) goto L_0x00d9
            r0.close()
        L_0x00d9:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3210j.mo14312r(java.lang.String):android.os.Bundle");
    }

    /* renamed from: s */
    public final boolean mo14313s() {
        C3281p4 p4Var = this.f5638a;
        Context context = p4Var.f5842a;
        C3166f fVar = p4Var.f5848g;
        return context.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v0, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f0, code lost:
        r0 = th;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f9, code lost:
        r4 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01f0 A[ExcHandler: all (th java.lang.Throwable), PHI: r3 
      PHI: (r3v5 java.lang.String) = (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v15 java.lang.String), (r3v17 java.lang.String), (r3v19 java.lang.String), (r3v21 java.lang.String), (r3v23 java.lang.String), (r3v25 java.lang.String), (r3v27 java.lang.String), (r3v29 java.lang.String), (r3v31 java.lang.String) binds: [B:1:0x000b, B:28:0x0085, B:23:0x0072, B:12:0x003b, B:7:0x0020, B:39:0x00bd, B:45:0x00f5, B:84:0x01db, B:85:?, B:49:0x0109, B:78:0x01c3, B:79:?, B:72:0x01a8, B:62:0x017a] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x020d  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0085=Splitter:B:28:0x0085, B:12:0x003b=Splitter:B:12:0x003b} */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14314t(java.lang.String r21, long r22, long r24, p005b.p096l.p097a.p113c.p145h.p147b.C3209i9 r26) {
        /*
            r20 = this;
            r1 = r20
            r2 = r26
            r20.mo14126h()
            r20.mo14646i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r20.mo14286A()     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r5 = ""
            r13 = -1
            r15 = 0
            r12 = 1
            r11 = 2
            if (r4 == 0) goto L_0x006e
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x002f
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            r6[r15] = r7     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            goto L_0x0037
        L_0x002f:
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            r6[r15] = r7     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
        L_0x0037:
            if (r4 == 0) goto L_0x003b
            java.lang.String r5 = "rowid <= ? and "
        L_0x003b:
            int r4 = r5.length()     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            int r4 = r4 + 148
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            r7.<init>(r4)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r4 = "select app_id, metadata_fingerprint from raw_events where "
            r7.append(r4)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            r7.append(r5)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r4 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r7.append(r4)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r4 = r7.toString()     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01f6 }
            if (r5 != 0) goto L_0x0065
            r4.close()
            return
        L_0x0065:
            java.lang.String r3 = r4.getString(r15)     // Catch:{ SQLiteException -> 0x01f6 }
            java.lang.String r5 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x01f6 }
            goto L_0x00b3
        L_0x006e:
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x007d
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            r6[r15] = r3     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            goto L_0x0081
        L_0x007d:
            java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
        L_0x0081:
            if (r4 == 0) goto L_0x0085
            java.lang.String r5 = " and rowid <= ?"
        L_0x0085:
            int r4 = r5.length()     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            int r4 = r4 + 84
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            r7.<init>(r4)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r4 = "select metadata_fingerprint from raw_events where app_id = ?"
            r7.append(r4)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            r7.append(r5)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r4 = " order by rowid limit 1;"
            r7.append(r4)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r4 = r7.toString()     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01f6 }
            if (r5 != 0) goto L_0x00af
            r4.close()
            return
        L_0x00af:
            java.lang.String r5 = r4.getString(r15)     // Catch:{ SQLiteException -> 0x01f6 }
        L_0x00b3:
            r4.close()     // Catch:{ SQLiteException -> 0x01f6 }
            r16 = r3
            r3 = r4
            r17 = r5
            java.lang.String r4 = "metadata"
            java.lang.String[] r6 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r8[r15] = r16     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r8[r12] = r17     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            java.lang.String r5 = "raw_events_metadata"
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            r9 = 0
            r10 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "2"
            r4 = r0
            r11 = r18
            r12 = r19
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            if (r4 != 0) goto L_0x00f5
            b.l.a.c.h.b.p4 r0 = r1.f5638a     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.h.b.m3 r0 = r0.f5799f     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r16)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r0.mo14415b(r2, r4)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r3.close()
            return
        L_0x00f5:
            byte[] r4 = r3.getBlob(r15)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.e.i.w1 r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3012x1.m5557C0()     // Catch:{ IOException -> 0x01da }
            b.l.a.c.e.i.g4 r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6192G(r5, r4)     // Catch:{ IOException -> 0x01da }
            b.l.a.c.e.i.w1 r4 = (p005b.p096l.p097a.p113c.p131e.p140i.C2999w1) r4     // Catch:{ IOException -> 0x01da }
            b.l.a.c.e.i.o5 r4 = r4.mo13484g()     // Catch:{ IOException -> 0x01da }
            b.l.a.c.e.i.x1 r4 = (p005b.p096l.p097a.p113c.p131e.p140i.C3012x1) r4     // Catch:{ IOException -> 0x01da }
            boolean r5 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            if (r5 == 0) goto L_0x0120
            b.l.a.c.h.b.p4 r5 = r1.f5638a     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.h.b.o3 r5 = r5.mo14329d()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.h.b.m3 r5 = r5.f5802i     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            java.lang.String r6 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r16)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r5.mo14415b(r6, r7)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
        L_0x0120:
            r3.close()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r2.f5615a = r4     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            r13 = 3
            if (r4 == 0) goto L_0x013b
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r5[r15] = r16     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r14 = 1
            r5[r14] = r17     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r12 = 2
            r5[r12] = r6     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            goto L_0x0145
        L_0x013b:
            r12 = 2
            r14 = 1
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r5[r15] = r16     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r5[r14] = r17     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
        L_0x0145:
            r7 = r4
            r8 = r5
            java.lang.String r4 = "rowid"
            java.lang.String r5 = "name"
            java.lang.String r6 = "timestamp"
            java.lang.String r9 = "data"
            java.lang.String[] r6 = new java.lang.String[]{r4, r5, r6, r9}     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            java.lang.String r5 = "raw_events"
            r9 = 0
            r10 = 0
            java.lang.String r11 = "rowid"
            r17 = 0
            r4 = r0
            r12 = r17
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            if (r0 == 0) goto L_0x01c3
        L_0x0168:
            long r4 = r3.getLong(r15)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            byte[] r0 = r3.getBlob(r13)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.e.i.o1 r6 = p005b.p096l.p097a.p113c.p131e.p140i.C2908p1.m5058C()     // Catch:{ IOException -> 0x01a6 }
            b.l.a.c.e.i.g4 r0 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6192G(r6, r0)     // Catch:{ IOException -> 0x01a6 }
            b.l.a.c.e.i.o1 r0 = (p005b.p096l.p097a.p113c.p131e.p140i.C2895o1) r0     // Catch:{ IOException -> 0x01a6 }
            java.lang.String r6 = r3.getString(r14)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r0.mo13533t(r6)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r6 = 2
            long r7 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            boolean r9 = r0.f4886i     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            if (r9 == 0) goto L_0x018f
            r0.mo13487j()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r0.f4886i = r15     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
        L_0x018f:
            MessageType r9 = r0.f4885h     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.e.i.p1 r9 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r9     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            p005b.p096l.p097a.p113c.p131e.p140i.C2908p1.m5066K(r9, r7)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.e.i.o5 r0 = r0.mo13484g()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.e.i.p1 r0 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r0     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            boolean r0 = r2.mo14285a(r4, r0)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            if (r0 != 0) goto L_0x01b9
            r3.close()
            return
        L_0x01a6:
            r0 = move-exception
            r6 = 2
            b.l.a.c.h.b.p4 r4 = r1.f5638a     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.h.b.o3 r4 = r4.mo14329d()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.h.b.m3 r4 = r4.f5799f     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            java.lang.String r5 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r16)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r4.mo14416c(r5, r7, r0)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
        L_0x01b9:
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            if (r0 != 0) goto L_0x0168
            r3.close()
            return
        L_0x01c3:
            b.l.a.c.h.b.p4 r0 = r1.f5638a     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.h.b.m3 r0 = r0.f5802i     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r16)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r0.mo14415b(r2, r4)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r3.close()
            return
        L_0x01d8:
            r0 = move-exception
            goto L_0x01f2
        L_0x01da:
            r0 = move-exception
            b.l.a.c.h.b.p4 r2 = r1.f5638a     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.h.b.m3 r2 = r2.f5799f     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r16)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r2.mo14416c(r4, r5, r0)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r3.close()
            return
        L_0x01f0:
            r0 = move-exception
            goto L_0x0213
        L_0x01f2:
            r4 = r3
            r3 = r16
            goto L_0x01fa
        L_0x01f6:
            r0 = move-exception
            goto L_0x01fa
        L_0x01f8:
            r0 = move-exception
            r4 = r3
        L_0x01fa:
            b.l.a.c.h.b.p4 r2 = r1.f5638a     // Catch:{ all -> 0x0211 }
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()     // Catch:{ all -> 0x0211 }
            b.l.a.c.h.b.m3 r2 = r2.f5799f     // Catch:{ all -> 0x0211 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r3)     // Catch:{ all -> 0x0211 }
            r2.mo14416c(r5, r3, r0)     // Catch:{ all -> 0x0211 }
            if (r4 == 0) goto L_0x0210
            r4.close()
        L_0x0210:
            return
        L_0x0211:
            r0 = move-exception
            r3 = r4
        L_0x0213:
            if (r3 == 0) goto L_0x0218
            r3.close()
        L_0x0218:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3210j.mo14314t(java.lang.String, long, long, b.l.a.c.h.b.i9):void");
    }

    @WorkerThread
    /* renamed from: v */
    public final long mo14315v(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo14286A().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            this.f5638a.mo14329d().f5799f.mo14416c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    /* renamed from: w */
    public final long mo14316w(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo14286A().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return j;
        } catch (SQLiteException e) {
            this.f5638a.mo14329d().f5799f.mo14416c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    /* renamed from: x */
    public final void mo14317x() {
        mo14646i();
        mo14286A().beginTransaction();
    }

    @WorkerThread
    /* renamed from: y */
    public final void mo14318y() {
        mo14646i();
        mo14286A().setTransactionSuccessful();
    }

    @WorkerThread
    /* renamed from: z */
    public final void mo14319z() {
        mo14646i();
        mo14286A().endTransaction();
    }
}
