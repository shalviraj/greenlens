package p005b.p096l.p097a.p098a.p101f.p106q.p108i;

import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import p005b.p096l.p097a.p098a.p101f.p106q.p108i.C1730z;

/* renamed from: b.l.a.a.f.q.i.w */
public final /* synthetic */ class C1727w implements C1730z.C1731a {

    /* renamed from: a */
    public static final C1727w f3050a = new C1727w();

    /* renamed from: a */
    public void mo11919a(SQLiteDatabase sQLiteDatabase) {
        List<C1730z.C1731a> list = C1730z.f3053i;
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }
}
