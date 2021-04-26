package p005b.p096l.p097a.p098a.p101f.p106q.p108i;

import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import p005b.p096l.p097a.p098a.p101f.p106q.p108i.C1730z;

/* renamed from: b.l.a.a.f.q.i.y */
public final /* synthetic */ class C1729y implements C1730z.C1731a {

    /* renamed from: a */
    public static final C1729y f3052a = new C1729y();

    /* renamed from: a */
    public void mo11919a(SQLiteDatabase sQLiteDatabase) {
        List<C1730z.C1731a> list = C1730z.f3053i;
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }
}
