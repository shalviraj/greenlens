package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.WorkerThread;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.h.b.h3 */
public final class C3192h3 extends SQLiteOpenHelper {

    /* renamed from: g */
    public final /* synthetic */ C3203i3 f5575g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3192h3(C3203i3 i3Var, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f5575g = i3Var;
    }

    @WorkerThread
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f5575g.f5638a.mo14329d().f5799f.mo14414a("Opening the local database failed, dropping and recreating it");
            C3166f fVar = this.f5575g.f5638a.f5848g;
            if (!this.f5575g.f5638a.f5842a.getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f5575g.f5638a.mo14329d().f5799f.mo14415b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f5575g.f5638a.mo14329d().f5799f.mo14415b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @WorkerThread
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C1960d.m2724J1(this.f5575g.f5638a.mo14329d(), sQLiteDatabase);
    }

    @WorkerThread
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @WorkerThread
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C1960d.m2823m1(this.f5575g.f5638a.mo14329d(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    @WorkerThread
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
