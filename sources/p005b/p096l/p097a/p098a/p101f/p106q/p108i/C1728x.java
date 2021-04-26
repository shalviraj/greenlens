package p005b.p096l.p097a.p098a.p101f.p106q.p108i;

import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import p005b.p096l.p097a.p098a.p101f.p106q.p108i.C1730z;

/* renamed from: b.l.a.a.f.q.i.x */
public final /* synthetic */ class C1728x implements C1730z.C1731a {

    /* renamed from: a */
    public static final C1728x f3051a = new C1728x();

    /* renamed from: a */
    public void mo11919a(SQLiteDatabase sQLiteDatabase) {
        List<C1730z.C1731a> list = C1730z.f3053i;
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
