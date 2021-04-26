package p005b.p096l.p097a.p098a.p101f.p106q.p108i;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.amplitude.api.DatabaseHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import p005b.p096l.p097a.p098a.C1583a;
import p005b.p096l.p097a.p098a.p101f.C1634e;
import p005b.p096l.p097a.p098a.p101f.C1640h;
import p005b.p096l.p097a.p098a.p101f.p106q.p108i.C1720t;

/* renamed from: b.l.a.a.f.q.i.j */
public final /* synthetic */ class C1710j implements C1720t.C1722b {

    /* renamed from: a */
    public final C1720t f3023a;

    /* renamed from: b */
    public final C1640h f3024b;

    public C1710j(C1720t tVar, C1640h hVar) {
        this.f3023a = tVar;
        this.f3024b = hVar;
    }

    /* JADX INFO: finally extract failed */
    public Object apply(Object obj) {
        C1720t tVar = this.f3023a;
        C1640h hVar = this.f3024b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C1583a aVar = C1720t.f3038k;
        Objects.requireNonNull(tVar);
        ArrayList arrayList = new ArrayList();
        Long q = tVar.mo11916q(sQLiteDatabase, hVar);
        if (q != null) {
            C1720t.m2250O(sQLiteDatabase.query(DatabaseHelper.EVENT_TABLE_NAME, new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{q.toString()}, (String) null, (String) null, (String) null, String.valueOf(tVar.f3042j.mo11885c())), new C1711k(tVar, arrayList, hVar));
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(((C1708h) arrayList.get(i)).mo11893b());
            if (i < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new C1720t.C1723c(query.getString(1), query.getString(2), (C1720t.C1721a) null));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            C1708h hVar2 = (C1708h) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(hVar2.mo11893b()))) {
                C1634e.C1635a i2 = hVar2.mo11892a().mo11821i();
                for (C1720t.C1723c cVar : (Set) hashMap.get(Long.valueOf(hVar2.mo11893b()))) {
                    i2.mo11822a(cVar.f3043a, cVar.f3044b);
                }
                listIterator.set(new C1699b(hVar2.mo11893b(), hVar2.mo11894c(), i2.mo11802b()));
            }
        }
        return arrayList;
    }
}
