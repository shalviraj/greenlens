package p005b.p096l.p097a.p098a.p101f.p106q.p108i;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import p005b.p096l.p097a.p098a.C1583a;
import p005b.p096l.p097a.p098a.p101f.C1640h;
import p005b.p096l.p097a.p098a.p101f.p106q.p108i.C1720t;
import p005b.p096l.p097a.p098a.p101f.p111t.C1742a;

/* renamed from: b.l.a.a.f.q.i.i */
public final /* synthetic */ class C1709i implements C1720t.C1722b {

    /* renamed from: a */
    public final long f3021a;

    /* renamed from: b */
    public final C1640h f3022b;

    public C1709i(long j, C1640h hVar) {
        this.f3021a = j;
        this.f3022b = hVar;
    }

    public Object apply(Object obj) {
        long j = this.f3021a;
        C1640h hVar = this.f3022b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C1583a aVar = C1720t.f3038k;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{hVar.mo11808b(), String.valueOf(C1742a.m2277a(hVar.mo11810d()))}) < 1) {
            contentValues.put("backend_name", hVar.mo11808b());
            contentValues.put("priority", Integer.valueOf(C1742a.m2277a(hVar.mo11810d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }
}
