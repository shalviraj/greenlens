package p005b.p096l.p097a.p098a.p101f.p106q.p108i;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.amplitude.api.DatabaseHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p098a.C1583a;
import p005b.p096l.p097a.p098a.p101f.C1634e;
import p005b.p096l.p097a.p098a.p101f.C1640h;
import p005b.p096l.p097a.p098a.p101f.p109r.C1733b;
import p005b.p096l.p097a.p098a.p101f.p110s.C1735a;
import p005b.p096l.p097a.p098a.p101f.p111t.C1742a;

@WorkerThread
/* renamed from: b.l.a.a.f.q.i.t */
public class C1720t implements C1700c, C1733b {

    /* renamed from: k */
    public static final C1583a f3038k = new C1583a("proto");

    /* renamed from: g */
    public final C1730z f3039g;

    /* renamed from: h */
    public final C1735a f3040h;

    /* renamed from: i */
    public final C1735a f3041i;

    /* renamed from: j */
    public final C1701d f3042j;

    /* renamed from: b.l.a.a.f.q.i.t$b */
    public interface C1722b<T, U> {
        U apply(T t);
    }

    /* renamed from: b.l.a.a.f.q.i.t$c */
    public static class C1723c {

        /* renamed from: a */
        public final String f3043a;

        /* renamed from: b */
        public final String f3044b;

        public C1723c(String str, String str2, C1721a aVar) {
            this.f3043a = str;
            this.f3044b = str2;
        }
    }

    /* renamed from: b.l.a.a.f.q.i.t$d */
    public interface C1724d<T> {
        /* renamed from: a */
        T mo11911a();
    }

    public C1720t(C1735a aVar, C1735a aVar2, C1701d dVar, C1730z zVar) {
        this.f3039g = zVar;
        this.f3040h = aVar;
        this.f3041i = aVar2;
        this.f3042j = dVar;
    }

    /* renamed from: N */
    public static String m2249N(Iterable<C1708h> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<C1708h> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo11893b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @VisibleForTesting
    /* renamed from: O */
    public static <T> T m2250O(Cursor cursor, C1722b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: B */
    public void mo11898B(C1640h hVar, long j) {
        mo11917z(new C1709i(j, hVar));
    }

    /* renamed from: H */
    public final <T> T mo11912H(C1724d<T> dVar, C1722b<Throwable, T> bVar) {
        long a = this.f3041i.mo11926a();
        while (true) {
            try {
                return dVar.mo11911a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f3041i.mo11926a() >= ((long) this.f3042j.mo11883a()) + a) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    @Nullable
    /* renamed from: I */
    public C1708h mo11899I(C1640h hVar, C1634e eVar) {
        C0823f.m404x("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", hVar.mo11810d(), eVar.mo11798g(), hVar.mo11808b());
        long longValue = ((Long) mo11917z(new C1719s(this, hVar, eVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new C1699b(longValue, hVar, eVar);
    }

    /* renamed from: J */
    public Iterable<C1640h> mo11900J() {
        SQLiteDatabase e = mo11915e();
        e.beginTransaction();
        try {
            List list = (List) m2250O(e.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), C1716p.f3032a);
            e.setTransactionSuccessful();
            return list;
        } finally {
            e.endTransaction();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: R */
    public long mo11901R(C1640h hVar) {
        Cursor rawQuery = mo11915e().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{hVar.mo11808b(), String.valueOf(C1742a.m2277a(hVar.mo11810d()))});
        try {
            Long valueOf = Long.valueOf(rawQuery.moveToNext() ? rawQuery.getLong(0) : 0);
            rawQuery.close();
            return valueOf.longValue();
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: W */
    public boolean mo11902W(C1640h hVar) {
        Boolean bool;
        SQLiteDatabase e = mo11915e();
        e.beginTransaction();
        try {
            Long q = mo11916q(e, hVar);
            if (q == null) {
                bool = Boolean.FALSE;
            } else {
                bool = (Boolean) m2250O(mo11915e().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{q.toString()}), C1717q.f3033a);
            }
            e.setTransactionSuccessful();
            e.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th) {
            e.endTransaction();
            throw th;
        }
    }

    /* renamed from: Y */
    public void mo11903Y(Iterable<C1708h> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder u = C0843a.m460u("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            u.append(m2249N(iterable));
            String sb = u.toString();
            SQLiteDatabase e = mo11915e();
            e.beginTransaction();
            try {
                e.compileStatement(sb).execute();
                e.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                e.setTransactionSuccessful();
            } finally {
                e.endTransaction();
            }
        }
    }

    public void close() {
        this.f3039g.close();
    }

    /* renamed from: d */
    public <T> T mo11914d(C1733b.C1734a<T> aVar) {
        SQLiteDatabase e = mo11915e();
        mo11912H(new C1713m(e), C1714n.f3030a);
        try {
            T a = aVar.mo11854a();
            e.setTransactionSuccessful();
            return a;
        } finally {
            e.endTransaction();
        }
    }

    @VisibleForTesting
    /* renamed from: e */
    public SQLiteDatabase mo11915e() {
        C1730z zVar = this.f3039g;
        zVar.getClass();
        return (SQLiteDatabase) mo11912H(new C1715o(zVar), C1718r.f3034a);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    public int mo11904i() {
        long a = this.f3040h.mo11926a() - this.f3042j.mo11884b();
        SQLiteDatabase e = mo11915e();
        e.beginTransaction();
        try {
            Integer valueOf = Integer.valueOf(e.delete(DatabaseHelper.EVENT_TABLE_NAME, "timestamp_ms < ?", new String[]{String.valueOf(a)}));
            e.setTransactionSuccessful();
            e.endTransaction();
            return valueOf.intValue();
        } catch (Throwable th) {
            e.endTransaction();
            throw th;
        }
    }

    /* renamed from: l */
    public void mo11905l(Iterable<C1708h> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder u = C0843a.m460u("DELETE FROM events WHERE _id in ");
            u.append(m2249N(iterable));
            mo11915e().compileStatement(u.toString()).execute();
        }
    }

    @Nullable
    /* renamed from: q */
    public final Long mo11916q(SQLiteDatabase sQLiteDatabase, C1640h hVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{hVar.mo11808b(), String.valueOf(C1742a.m2277a(hVar.mo11810d()))}));
        if (hVar.mo11809c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(hVar.mo11809c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    /* renamed from: x */
    public Iterable<C1708h> mo11906x(C1640h hVar) {
        return (Iterable) mo11917z(new C1710j(this, hVar));
    }

    @VisibleForTesting
    /* renamed from: z */
    public <T> T mo11917z(C1722b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase e = mo11915e();
        e.beginTransaction();
        try {
            T apply = bVar.apply(e);
            e.setTransactionSuccessful();
            return apply;
        } finally {
            e.endTransaction();
        }
    }
}
