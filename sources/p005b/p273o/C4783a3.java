package p005b.p273o;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4857i2;
import p005b.p273o.p276x4.C5034i;

/* renamed from: b.o.a3 */
public class C4783a3 extends SQLiteOpenHelper implements C5053z2 {

    /* renamed from: g */
    public static final Object f9155g = new Object();

    /* renamed from: h */
    public static final String[] f9156h = {"CREATE INDEX notification_notification_id_idx ON notification(notification_id); ", "CREATE INDEX notification_android_notification_id_idx ON notification(android_notification_id); ", "CREATE INDEX notification_group_id_idx ON notification(group_id); ", "CREATE INDEX notification_collapse_id_idx ON notification(collapse_id); ", "CREATE INDEX notification_created_time_idx ON notification(created_time); ", "CREATE INDEX notification_expire_time_idx ON notification(expire_time); "};

    /* renamed from: i */
    public static C4882j1 f9157i = new C4856i1();

    /* renamed from: j */
    public static C4783a3 f9158j;

    /* renamed from: k */
    public static C5034i f9159k = new C5034i();

    public C4783a3(Context context) {
        super(context, "OneSignal.db", (SQLiteDatabase.CursorFactory) null, 8);
    }

    /* renamed from: e */
    public static C4783a3 m8766e(Context context) {
        if (f9158j == null) {
            synchronized (f9155g) {
                if (f9158j == null) {
                    f9158j = new C4783a3(context.getApplicationContext());
                }
            }
        }
        return f9158j;
    }

    /* renamed from: f0 */
    public static StringBuilder m8767f0() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        StringBuilder sb = new StringBuilder();
        sb.append("created_time > ");
        sb.append(currentTimeMillis - 604800);
        sb.append(" AND ");
        sb.append("dismissed");
        C0843a.m431G(sb, " = 0 AND ", "opened", " = 0 AND ", "is_summary");
        sb.append(" = 0");
        StringBuilder sb2 = new StringBuilder(sb.toString());
        if (C4815d3.m8827b(C4815d3.f9230a, "OS_RESTORE_TTL_FILTER", true)) {
            sb2.append(" AND expire_time > " + currentTimeMillis);
        }
        return sb2;
    }

    /* renamed from: h0 */
    public static void m8768h0(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: n0 */
    public static void m8769n0(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase.execSQL("CREATE TEMPORARY TABLE outcome_backup(" + "_id,session,notification_ids,name,timestamp" + ");");
            sQLiteDatabase.execSQL("INSERT INTO outcome_backup SELECT " + "_id,session,notification_ids,name,timestamp" + " FROM outcome;");
            sQLiteDatabase.execSQL("DROP TABLE outcome;");
            sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,session TEXT,notification_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            sQLiteDatabase.execSQL("INSERT INTO outcome (" + "_id,session,notification_ids,name,timestamp" + ", weight) SELECT " + "_id,session,notification_ids,name,timestamp" + ", 0 FROM outcome_backup;");
            sQLiteDatabase.execSQL("DROP TABLE outcome_backup;");
        } catch (SQLiteException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            sQLiteDatabase.execSQL("COMMIT;");
            throw th;
        }
        sQLiteDatabase.execSQL("COMMIT;");
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x0082=Splitter:B:29:0x0082, B:40:0x0094=Splitter:B:40:0x0094} */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16508H(@androidx.annotation.NonNull java.lang.String r7, @androidx.annotation.Nullable java.lang.String r8, @androidx.annotation.Nullable android.content.ContentValues r9) {
        /*
            r6 = this;
            b.o.i2$k r8 = p005b.p273o.C4857i2.C4868k.ERROR
            java.lang.Object r0 = f9155g
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = r6.mo16520z()     // Catch:{ all -> 0x0098 }
            r2 = 0
            r1.beginTransaction()     // Catch:{ SQLiteException -> 0x0053, IllegalStateException -> 0x0022 }
            r1.insert(r7, r2, r9)     // Catch:{ SQLiteException -> 0x0053, IllegalStateException -> 0x0022 }
            r1.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0053, IllegalStateException -> 0x0022 }
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x001c, SQLiteException -> 0x0018 }
            goto L_0x0085
        L_0x0018:
            r7 = move-exception
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0082
        L_0x001c:
            r7 = move-exception
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0082
        L_0x0020:
            r7 = move-exception
            goto L_0x0087
        L_0x0022:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0020 }
            r4.<init>()     // Catch:{ all -> 0x0020 }
            java.lang.String r5 = "Error under inserting transaction under table: "
            r4.append(r5)     // Catch:{ all -> 0x0020 }
            r4.append(r7)     // Catch:{ all -> 0x0020 }
            java.lang.String r7 = " with nullColumnHack: "
            r4.append(r7)     // Catch:{ all -> 0x0020 }
            r4.append(r2)     // Catch:{ all -> 0x0020 }
            java.lang.String r7 = " and values: "
            r4.append(r7)     // Catch:{ all -> 0x0020 }
            r4.append(r9)     // Catch:{ all -> 0x0020 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0020 }
            p005b.p273o.C4857i2.m8933a(r8, r7, r3)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0085
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x0051, SQLiteException -> 0x004d }
            goto L_0x0085
        L_0x004d:
            r7 = move-exception
        L_0x004e:
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0082
        L_0x0051:
            r7 = move-exception
            goto L_0x004e
        L_0x0053:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0020 }
            r4.<init>()     // Catch:{ all -> 0x0020 }
            java.lang.String r5 = "Error inserting on table: "
            r4.append(r5)     // Catch:{ all -> 0x0020 }
            r4.append(r7)     // Catch:{ all -> 0x0020 }
            java.lang.String r7 = " with nullColumnHack: "
            r4.append(r7)     // Catch:{ all -> 0x0020 }
            r4.append(r2)     // Catch:{ all -> 0x0020 }
            java.lang.String r7 = " and values: "
            r4.append(r7)     // Catch:{ all -> 0x0020 }
            r4.append(r9)     // Catch:{ all -> 0x0020 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0020 }
            p005b.p273o.C4857i2.m8933a(r8, r7, r3)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0085
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
            goto L_0x0085
        L_0x007e:
            r7 = move-exception
            goto L_0x004e
        L_0x0080:
            r7 = move-exception
            goto L_0x004e
        L_0x0082:
            p005b.p273o.C4857i2.m8933a(r8, r9, r7)     // Catch:{ all -> 0x0098 }
        L_0x0085:
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            return
        L_0x0087:
            if (r1 == 0) goto L_0x0097
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x0091, SQLiteException -> 0x008d }
            goto L_0x0097
        L_0x008d:
            r9 = move-exception
            java.lang.String r1 = "Error closing transaction! "
            goto L_0x0094
        L_0x0091:
            r9 = move-exception
            java.lang.String r1 = "Error closing transaction! "
        L_0x0094:
            p005b.p273o.C4857i2.m8933a(r8, r1, r9)     // Catch:{ all -> 0x0098 }
        L_0x0097:
            throw r7     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4783a3.mo16508H(java.lang.String, java.lang.String, android.content.ContentValues):void");
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x0082=Splitter:B:29:0x0082, B:40:0x0094=Splitter:B:40:0x0094} */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16509N(@androidx.annotation.NonNull java.lang.String r7, @androidx.annotation.Nullable java.lang.String r8, @androidx.annotation.Nullable android.content.ContentValues r9) {
        /*
            r6 = this;
            b.o.i2$k r8 = p005b.p273o.C4857i2.C4868k.ERROR
            java.lang.Object r0 = f9155g
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = r6.mo16520z()     // Catch:{ all -> 0x0098 }
            r2 = 0
            r1.beginTransaction()     // Catch:{ SQLiteException -> 0x0053, IllegalStateException -> 0x0022 }
            r1.insertOrThrow(r7, r2, r9)     // Catch:{ SQLiteException -> 0x0053, IllegalStateException -> 0x0022 }
            r1.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0053, IllegalStateException -> 0x0022 }
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x001c, SQLiteException -> 0x0018 }
            goto L_0x0085
        L_0x0018:
            r7 = move-exception
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0082
        L_0x001c:
            r7 = move-exception
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0082
        L_0x0020:
            r7 = move-exception
            goto L_0x0087
        L_0x0022:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0020 }
            r4.<init>()     // Catch:{ all -> 0x0020 }
            java.lang.String r5 = "Error under inserting or throw transaction under table: "
            r4.append(r5)     // Catch:{ all -> 0x0020 }
            r4.append(r7)     // Catch:{ all -> 0x0020 }
            java.lang.String r7 = " with nullColumnHack: "
            r4.append(r7)     // Catch:{ all -> 0x0020 }
            r4.append(r2)     // Catch:{ all -> 0x0020 }
            java.lang.String r7 = " and values: "
            r4.append(r7)     // Catch:{ all -> 0x0020 }
            r4.append(r9)     // Catch:{ all -> 0x0020 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0020 }
            p005b.p273o.C4857i2.m8933a(r8, r7, r3)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0085
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x0051, SQLiteException -> 0x004d }
            goto L_0x0085
        L_0x004d:
            r7 = move-exception
        L_0x004e:
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0082
        L_0x0051:
            r7 = move-exception
            goto L_0x004e
        L_0x0053:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0020 }
            r4.<init>()     // Catch:{ all -> 0x0020 }
            java.lang.String r5 = "Error inserting or throw on table: "
            r4.append(r5)     // Catch:{ all -> 0x0020 }
            r4.append(r7)     // Catch:{ all -> 0x0020 }
            java.lang.String r7 = " with nullColumnHack: "
            r4.append(r7)     // Catch:{ all -> 0x0020 }
            r4.append(r2)     // Catch:{ all -> 0x0020 }
            java.lang.String r7 = " and values: "
            r4.append(r7)     // Catch:{ all -> 0x0020 }
            r4.append(r9)     // Catch:{ all -> 0x0020 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0020 }
            p005b.p273o.C4857i2.m8933a(r8, r7, r3)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0085
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
            goto L_0x0085
        L_0x007e:
            r7 = move-exception
            goto L_0x004e
        L_0x0080:
            r7 = move-exception
            goto L_0x004e
        L_0x0082:
            p005b.p273o.C4857i2.m8933a(r8, r9, r7)     // Catch:{ all -> 0x0098 }
        L_0x0085:
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            return
        L_0x0087:
            if (r1 == 0) goto L_0x0097
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x0091, SQLiteException -> 0x008d }
            goto L_0x0097
        L_0x008d:
            r9 = move-exception
            java.lang.String r1 = "Error closing transaction! "
            goto L_0x0094
        L_0x0091:
            r9 = move-exception
            java.lang.String r1 = "Error closing transaction! "
        L_0x0094:
            p005b.p273o.C4857i2.m8933a(r8, r1, r9)     // Catch:{ all -> 0x0098 }
        L_0x0097:
            throw r7     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4783a3.mo16509N(java.lang.String, java.lang.String, android.content.ContentValues):void");
    }

    /* renamed from: O */
    public final synchronized void mo16510O(SQLiteDatabase sQLiteDatabase, int i) {
        if (i < 2) {
            try {
                m8768h0(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN collapse_id TEXT;");
                m8768h0(sQLiteDatabase, "CREATE INDEX notification_group_id_idx ON notification(group_id); ");
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i < 3) {
            m8768h0(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN expire_time TIMESTAMP;");
            m8768h0(sQLiteDatabase, "UPDATE notification SET expire_time = created_time + 259200;");
            m8768h0(sQLiteDatabase, "CREATE INDEX notification_expire_time_idx ON notification(expire_time); ");
        }
        if (i < 4) {
            m8768h0(sQLiteDatabase, "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_ids TEXT,name TEXT,session TEXT,params TEXT,timestamp TIMESTAMP);");
        }
        if (i < 5) {
            m8768h0(sQLiteDatabase, "CREATE TABLE cached_unique_outcome_notification (_id INTEGER PRIMARY KEY,notification_id TEXT,name TEXT);");
            m8769n0(sQLiteDatabase);
        }
        if (i == 5) {
            m8769n0(sQLiteDatabase);
        }
        if (i < 7) {
            m8768h0(sQLiteDatabase, "CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);");
        }
        if (i < 8) {
            mo16515o0(sQLiteDatabase);
        }
    }

    /* renamed from: S */
    public Cursor mo16511S(@NonNull String str, @Nullable String[] strArr, @Nullable String str2, String[] strArr2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        Cursor query;
        synchronized (f9155g) {
            query = mo16520z().query(str, strArr, str2, strArr2, (String) null, (String) null, str5);
        }
        return query;
    }

    /* renamed from: Z */
    public Cursor mo16512Z(@NonNull String str, @Nullable String[] strArr, @Nullable String str2, @Nullable String[] strArr2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Cursor query;
        synchronized (f9155g) {
            query = mo16520z().query(str, strArr, str2, strArr2, (String) null, (String) null, str5, str6);
        }
        return query;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0081=Splitter:B:28:0x0081, B:39:0x0093=Splitter:B:39:0x0093} */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16513d(@androidx.annotation.NonNull java.lang.String r7, @androidx.annotation.Nullable java.lang.String r8, @androidx.annotation.Nullable java.lang.String[] r9) {
        /*
            r6 = this;
            b.o.i2$k r0 = p005b.p273o.C4857i2.C4868k.ERROR
            java.lang.Object r1 = f9155g
            monitor-enter(r1)
            android.database.sqlite.SQLiteDatabase r2 = r6.mo16520z()     // Catch:{ all -> 0x0097 }
            r2.beginTransaction()     // Catch:{ SQLiteException -> 0x0052, IllegalStateException -> 0x0021 }
            r2.delete(r7, r8, r9)     // Catch:{ SQLiteException -> 0x0052, IllegalStateException -> 0x0021 }
            r2.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0052, IllegalStateException -> 0x0021 }
            r2.endTransaction()     // Catch:{ IllegalStateException -> 0x001b, SQLiteException -> 0x0017 }
            goto L_0x0084
        L_0x0017:
            r7 = move-exception
            java.lang.String r8 = "Error closing transaction! "
            goto L_0x0081
        L_0x001b:
            r7 = move-exception
            java.lang.String r8 = "Error closing transaction! "
            goto L_0x0081
        L_0x001f:
            r7 = move-exception
            goto L_0x0086
        L_0x0021:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x001f }
            r4.<init>()     // Catch:{ all -> 0x001f }
            java.lang.String r5 = "Error under delete transaction under table: "
            r4.append(r5)     // Catch:{ all -> 0x001f }
            r4.append(r7)     // Catch:{ all -> 0x001f }
            java.lang.String r7 = " with whereClause: "
            r4.append(r7)     // Catch:{ all -> 0x001f }
            r4.append(r8)     // Catch:{ all -> 0x001f }
            java.lang.String r7 = " and whereArgs: "
            r4.append(r7)     // Catch:{ all -> 0x001f }
            r4.append(r9)     // Catch:{ all -> 0x001f }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x001f }
            p005b.p273o.C4857i2.m8933a(r0, r7, r3)     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x0084
            r2.endTransaction()     // Catch:{ IllegalStateException -> 0x0050, SQLiteException -> 0x004c }
            goto L_0x0084
        L_0x004c:
            r7 = move-exception
        L_0x004d:
            java.lang.String r8 = "Error closing transaction! "
            goto L_0x0081
        L_0x0050:
            r7 = move-exception
            goto L_0x004d
        L_0x0052:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x001f }
            r4.<init>()     // Catch:{ all -> 0x001f }
            java.lang.String r5 = "Error deleting on table: "
            r4.append(r5)     // Catch:{ all -> 0x001f }
            r4.append(r7)     // Catch:{ all -> 0x001f }
            java.lang.String r7 = " with whereClause: "
            r4.append(r7)     // Catch:{ all -> 0x001f }
            r4.append(r8)     // Catch:{ all -> 0x001f }
            java.lang.String r7 = " and whereArgs: "
            r4.append(r7)     // Catch:{ all -> 0x001f }
            r4.append(r9)     // Catch:{ all -> 0x001f }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x001f }
            p005b.p273o.C4857i2.m8933a(r0, r7, r3)     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x0084
            r2.endTransaction()     // Catch:{ IllegalStateException -> 0x007f, SQLiteException -> 0x007d }
            goto L_0x0084
        L_0x007d:
            r7 = move-exception
            goto L_0x004d
        L_0x007f:
            r7 = move-exception
            goto L_0x004d
        L_0x0081:
            p005b.p273o.C4857i2.m8933a(r0, r8, r7)     // Catch:{ all -> 0x0097 }
        L_0x0084:
            monitor-exit(r1)     // Catch:{ all -> 0x0097 }
            return
        L_0x0086:
            if (r2 == 0) goto L_0x0096
            r2.endTransaction()     // Catch:{ IllegalStateException -> 0x0090, SQLiteException -> 0x008c }
            goto L_0x0096
        L_0x008c:
            r8 = move-exception
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0093
        L_0x0090:
            r8 = move-exception
            java.lang.String r9 = "Error closing transaction! "
        L_0x0093:
            p005b.p273o.C4857i2.m8933a(r0, r9, r8)     // Catch:{ all -> 0x0097 }
        L_0x0096:
            throw r7     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0097 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4783a3.mo16513d(java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x00a0=Splitter:B:42:0x00a0, B:31:0x008e=Splitter:B:31:0x008e} */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo16514l0(@androidx.annotation.NonNull java.lang.String r7, @androidx.annotation.NonNull android.content.ContentValues r8, @androidx.annotation.Nullable java.lang.String r9, @androidx.annotation.Nullable java.lang.String[] r10) {
        /*
            r6 = this;
            b.o.i2$k r0 = p005b.p273o.C4857i2.C4868k.ERROR
            java.lang.String r1 = r8.toString()
            boolean r1 = r1.isEmpty()
            r2 = 0
            if (r1 == 0) goto L_0x000e
            return r2
        L_0x000e:
            java.lang.Object r1 = f9155g
            monitor-enter(r1)
            android.database.sqlite.SQLiteDatabase r3 = r6.mo16520z()     // Catch:{ all -> 0x00a4 }
            r3.beginTransaction()     // Catch:{ SQLiteException -> 0x005f, IllegalStateException -> 0x002e }
            int r2 = r3.update(r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x005f, IllegalStateException -> 0x002e }
            r3.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x005f, IllegalStateException -> 0x002e }
            r3.endTransaction()     // Catch:{ IllegalStateException -> 0x0028, SQLiteException -> 0x0024 }
            goto L_0x0091
        L_0x0024:
            r7 = move-exception
            java.lang.String r8 = "Error closing transaction! "
            goto L_0x008e
        L_0x0028:
            r7 = move-exception
            java.lang.String r8 = "Error closing transaction! "
            goto L_0x008e
        L_0x002c:
            r7 = move-exception
            goto L_0x0093
        L_0x002e:
            r8 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x002c }
            r4.<init>()     // Catch:{ all -> 0x002c }
            java.lang.String r5 = "Error under update transaction under table: "
            r4.append(r5)     // Catch:{ all -> 0x002c }
            r4.append(r7)     // Catch:{ all -> 0x002c }
            java.lang.String r7 = " with whereClause: "
            r4.append(r7)     // Catch:{ all -> 0x002c }
            r4.append(r9)     // Catch:{ all -> 0x002c }
            java.lang.String r7 = " and whereArgs: "
            r4.append(r7)     // Catch:{ all -> 0x002c }
            r4.append(r10)     // Catch:{ all -> 0x002c }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x002c }
            p005b.p273o.C4857i2.m8933a(r0, r7, r8)     // Catch:{ all -> 0x002c }
            if (r3 == 0) goto L_0x0091
            r3.endTransaction()     // Catch:{ IllegalStateException -> 0x005d, SQLiteException -> 0x0059 }
            goto L_0x0091
        L_0x0059:
            r7 = move-exception
        L_0x005a:
            java.lang.String r8 = "Error closing transaction! "
            goto L_0x008e
        L_0x005d:
            r7 = move-exception
            goto L_0x005a
        L_0x005f:
            r8 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x002c }
            r4.<init>()     // Catch:{ all -> 0x002c }
            java.lang.String r5 = "Error updating on table: "
            r4.append(r5)     // Catch:{ all -> 0x002c }
            r4.append(r7)     // Catch:{ all -> 0x002c }
            java.lang.String r7 = " with whereClause: "
            r4.append(r7)     // Catch:{ all -> 0x002c }
            r4.append(r9)     // Catch:{ all -> 0x002c }
            java.lang.String r7 = " and whereArgs: "
            r4.append(r7)     // Catch:{ all -> 0x002c }
            r4.append(r10)     // Catch:{ all -> 0x002c }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x002c }
            p005b.p273o.C4857i2.m8933a(r0, r7, r8)     // Catch:{ all -> 0x002c }
            if (r3 == 0) goto L_0x0091
            r3.endTransaction()     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
            goto L_0x0091
        L_0x008a:
            r7 = move-exception
            goto L_0x005a
        L_0x008c:
            r7 = move-exception
            goto L_0x005a
        L_0x008e:
            p005b.p273o.C4857i2.m8933a(r0, r8, r7)     // Catch:{ all -> 0x00a4 }
        L_0x0091:
            monitor-exit(r1)     // Catch:{ all -> 0x00a4 }
            return r2
        L_0x0093:
            if (r3 == 0) goto L_0x00a3
            r3.endTransaction()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x0099 }
            goto L_0x00a3
        L_0x0099:
            r8 = move-exception
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x00a0
        L_0x009d:
            r8 = move-exception
            java.lang.String r9 = "Error closing transaction! "
        L_0x00a0:
            p005b.p273o.C4857i2.m8933a(r0, r9, r8)     // Catch:{ all -> 0x00a4 }
        L_0x00a3:
            throw r7     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a4 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4783a3.mo16514l0(java.lang.String, android.content.ContentValues, java.lang.String, java.lang.String[]):int");
    }

    /* renamed from: o0 */
    public final synchronized void mo16515o0(SQLiteDatabase sQLiteDatabase) {
        String str = "_id,name,timestamp,notification_ids,weight" + "," + "notification_influence_type";
        try {
            sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase.execSQL("ALTER TABLE outcome RENAME TO outcome_aux;");
            sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            sQLiteDatabase.execSQL("INSERT INTO outcome(" + str + ") SELECT " + "_id,name,timestamp,notification_ids,weight,session" + " FROM " + "outcome_aux" + ";");
            sQLiteDatabase.execSQL("DROP TABLE outcome_aux;");
        } catch (SQLiteException e) {
            try {
                e.printStackTrace();
            } catch (Throwable th) {
                sQLiteDatabase.execSQL("COMMIT;");
                throw th;
            }
        }
        sQLiteDatabase.execSQL("COMMIT;");
        try {
            sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
            sQLiteDatabase.execSQL("INSERT INTO cached_unique_outcome(" + "_id,name,channel_influence_id" + ") SELECT " + "_id,name,notification_id" + " FROM " + "cached_unique_outcome_notification" + ";");
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE cached_unique_outcome SET channel_type = '");
            sb.append("notification");
            sb.append("';");
            sQLiteDatabase.execSQL(sb.toString());
            sQLiteDatabase.execSQL("DROP TABLE cached_unique_outcome_notification;");
        } catch (SQLiteException e2) {
            e2.printStackTrace();
        }
        sQLiteDatabase.execSQL("COMMIT;");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE notification (_id INTEGER PRIMARY KEY,notification_id TEXT,android_notification_id INTEGER,group_id TEXT,collapse_id TEXT,is_summary INTEGER DEFAULT 0,opened INTEGER DEFAULT 0,dismissed INTEGER DEFAULT 0,title TEXT,message TEXT,full_data TEXT,created_time TIMESTAMP DEFAULT (strftime('%s', 'now')),expire_time TIMESTAMP);");
        sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
        sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);");
        for (String execSQL : f9156h) {
            sQLiteDatabase.execSQL(execSQL);
        }
    }

    /* JADX INFO: finally extract failed */
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C4857i2.m8933a(C4857i2.C4868k.WARN, "SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.", (Throwable) null);
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", (String[]) null);
        try {
            ArrayList arrayList = new ArrayList(rawQuery.getCount());
            while (rawQuery.moveToNext()) {
                arrayList.add(rawQuery.getString(0));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!str.startsWith("sqlite_")) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                }
            }
            rawQuery.close();
            onCreate(sQLiteDatabase);
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C4857i2.m8933a(C4857i2.C4868k.DEBUG, C0843a.m446g("OneSignal Database onUpgrade from: ", i, " to: ", i2), (Throwable) null);
        try {
            mo16510O(sQLiteDatabase, i);
        } catch (SQLiteException e) {
            C4857i2.m8933a(C4857i2.C4868k.ERROR, "Error in upgrade, migration may have already run! Skipping!", e);
        }
    }

    /* renamed from: q */
    public final SQLiteDatabase mo16519q() {
        SQLiteDatabase writableDatabase;
        synchronized (f9155g) {
            try {
                writableDatabase = getWritableDatabase();
            } catch (SQLiteCantOpenDatabaseException e) {
                e = e;
                throw e;
            } catch (SQLiteDatabaseLockedException e2) {
                e = e2;
                throw e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return writableDatabase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0014 A[Catch:{ SQLiteCantOpenDatabaseException -> 0x000e, SQLiteDatabaseLockedException -> 0x000c, all -> 0x000a }, LOOP:0: B:3:0x0004->B:15:0x0014, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x001b A[SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.sqlite.SQLiteDatabase mo16520z() {
        /*
            r4 = this;
            java.lang.Object r0 = f9155g
            monitor-enter(r0)
            r1 = 0
        L_0x0004:
            android.database.sqlite.SQLiteDatabase r1 = r4.mo16519q()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x000e, SQLiteDatabaseLockedException -> 0x000c }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return r1
        L_0x000a:
            r1 = move-exception
            goto L_0x001c
        L_0x000c:
            r2 = move-exception
            goto L_0x000f
        L_0x000e:
            r2 = move-exception
        L_0x000f:
            int r1 = r1 + 1
            r3 = 5
            if (r1 >= r3) goto L_0x001b
            int r2 = r1 * 400
            long r2 = (long) r2     // Catch:{ all -> 0x000a }
            android.os.SystemClock.sleep(r2)     // Catch:{ all -> 0x000a }
            goto L_0x0004
        L_0x001b:
            throw r2     // Catch:{ all -> 0x000a }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4783a3.mo16520z():android.database.sqlite.SQLiteDatabase");
    }
}
