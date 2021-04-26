package p005b.p096l.p097a.p098a.p101f.p106q.p108i;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.a.f.q.i.z */
public final class C1730z extends SQLiteOpenHelper {

    /* renamed from: i */
    public static final List<C1731a> f3053i = Arrays.asList(new C1731a[]{C1726v.f3049a, C1727w.f3050a, C1728x.f3051a, C1729y.f3052a});

    /* renamed from: g */
    public final int f3054g;

    /* renamed from: h */
    public boolean f3055h = false;

    /* renamed from: b.l.a.a.f.q.i.z$a */
    public interface C1731a {
        /* renamed from: a */
        void mo11919a(SQLiteDatabase sQLiteDatabase);
    }

    public C1730z(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f3054g = i;
    }

    /* renamed from: d */
    public final void mo11920d(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<C1731a> list = f3053i;
        if (i2 <= list.size()) {
            while (i < i2) {
                f3053i.get(i).mo11919a(sQLiteDatabase);
                i++;
            }
            return;
        }
        StringBuilder x = C0843a.m463x("Migration from ", i, " to ", i2, " was requested, but cannot be performed. Only ");
        x.append(list.size());
        x.append(" migrations are provided");
        throw new IllegalArgumentException(x.toString());
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f3055h = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.f3054g;
        if (!this.f3055h) {
            onConfigure(sQLiteDatabase);
        }
        mo11920d(sQLiteDatabase, 0, i);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        if (!this.f3055h) {
            onConfigure(sQLiteDatabase);
        }
        mo11920d(sQLiteDatabase, 0, i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f3055h) {
            onConfigure(sQLiteDatabase);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.f3055h) {
            onConfigure(sQLiteDatabase);
        }
        mo11920d(sQLiteDatabase, i, i2);
    }
}
