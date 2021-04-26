package p005b.p096l.p097a.p098a.p101f.p106q.p108i;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.amplitude.api.DatabaseHelper;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import p005b.p096l.p097a.p098a.C1583a;
import p005b.p096l.p097a.p098a.p101f.C1634e;
import p005b.p096l.p097a.p098a.p101f.C1640h;
import p005b.p096l.p097a.p098a.p101f.p106q.p108i.C1720t;
import p005b.p096l.p097a.p098a.p101f.p111t.C1742a;

/* renamed from: b.l.a.a.f.q.i.s */
public final /* synthetic */ class C1719s implements C1720t.C1722b {

    /* renamed from: a */
    public final C1720t f3035a;

    /* renamed from: b */
    public final C1640h f3036b;

    /* renamed from: c */
    public final C1634e f3037c;

    public C1719s(C1720t tVar, C1640h hVar, C1634e eVar) {
        this.f3035a = tVar;
        this.f3036b = hVar;
        this.f3037c = eVar;
    }

    public Object apply(Object obj) {
        long j;
        C1720t tVar = this.f3035a;
        C1640h hVar = this.f3036b;
        C1634e eVar = this.f3037c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C1583a aVar = C1720t.f3038k;
        if (tVar.mo11915e().compileStatement("PRAGMA page_size").simpleQueryForLong() * tVar.mo11915e().compileStatement("PRAGMA page_count").simpleQueryForLong() >= tVar.f3042j.mo11887e()) {
            return -1L;
        }
        Long q = tVar.mo11916q(sQLiteDatabase, hVar);
        if (q != null) {
            j = q.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", hVar.mo11808b());
            contentValues.put("priority", Integer.valueOf(C1742a.m2277a(hVar.mo11810d())));
            contentValues.put("next_request_ms", 0);
            if (hVar.mo11809c() != null) {
                contentValues.put(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE, Base64.encodeToString(hVar.mo11809c(), 0));
            }
            j = sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        int d = tVar.f3042j.mo11886d();
        byte[] bArr = eVar.mo11795d().f2878b;
        boolean z = bArr.length <= d;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(j));
        contentValues2.put("transport_name", eVar.mo11798g());
        contentValues2.put("timestamp_ms", Long.valueOf(eVar.mo11796e()));
        contentValues2.put("uptime_ms", Long.valueOf(eVar.mo11799h()));
        contentValues2.put("payload_encoding", eVar.mo11795d().f2877a.f2687a);
        contentValues2.put("code", eVar.mo11794c());
        contentValues2.put("num_attempts", 0);
        contentValues2.put("inline", Boolean.valueOf(z));
        contentValues2.put("payload", z ? bArr : new byte[0]);
        long insert = sQLiteDatabase.insert(DatabaseHelper.EVENT_TABLE_NAME, (String) null, contentValues2);
        if (!z) {
            int ceil = (int) Math.ceil(((double) bArr.length) / ((double) d));
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, (i - 1) * d, Math.min(i * d, bArr.length));
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("event_id", Long.valueOf(insert));
                contentValues3.put("sequence_num", Integer.valueOf(i));
                contentValues3.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues3);
            }
        }
        for (Map.Entry next : Collections.unmodifiableMap(eVar.mo11793b()).entrySet()) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("event_id", Long.valueOf(insert));
            contentValues4.put("name", (String) next.getKey());
            contentValues4.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues4);
        }
        return Long.valueOf(insert);
    }
}
