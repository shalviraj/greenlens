package p005b.p096l.p097a.p098a.p101f.p106q.p108i;

import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import p005b.p096l.p097a.p098a.p101f.p106q.p108i.C1730z;

/* renamed from: b.l.a.a.f.q.i.v */
public final /* synthetic */ class C1726v implements C1730z.C1731a {

    /* renamed from: a */
    public static final C1726v f3049a = new C1726v();

    /* renamed from: a */
    public void mo11919a(SQLiteDatabase sQLiteDatabase) {
        List<C1730z.C1731a> list = C1730z.f3053i;
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }
}
