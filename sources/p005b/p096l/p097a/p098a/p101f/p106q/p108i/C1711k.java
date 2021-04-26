package p005b.p096l.p097a.p098a.p101f.p106q.p108i;

import android.database.Cursor;
import java.util.HashMap;
import java.util.List;
import p005b.p096l.p097a.p098a.C1583a;
import p005b.p096l.p097a.p098a.p101f.C1625a;
import p005b.p096l.p097a.p098a.p101f.C1633d;
import p005b.p096l.p097a.p098a.p101f.C1640h;
import p005b.p096l.p097a.p098a.p101f.p106q.p108i.C1720t;

/* renamed from: b.l.a.a.f.q.i.k */
public final /* synthetic */ class C1711k implements C1720t.C1722b {

    /* renamed from: a */
    public final C1720t f3025a;

    /* renamed from: b */
    public final List f3026b;

    /* renamed from: c */
    public final C1640h f3027c;

    public C1711k(C1720t tVar, List list, C1640h hVar) {
        this.f3025a = tVar;
        this.f3026b = list;
        this.f3027c = hVar;
    }

    public Object apply(Object obj) {
        C1583a aVar;
        C1583a aVar2;
        C1720t tVar = this.f3025a;
        List list = this.f3026b;
        C1640h hVar = this.f3027c;
        Cursor cursor = (Cursor) obj;
        C1583a aVar3 = C1720t.f3038k;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            C1625a.C1627b bVar = new C1625a.C1627b();
            bVar.f2858f = new HashMap();
            bVar.mo11806f(cursor.getString(1));
            bVar.mo11805e(cursor.getLong(2));
            bVar.mo11807g(cursor.getLong(3));
            if (z) {
                String string = cursor.getString(4);
                if (string == null) {
                    aVar2 = C1720t.f3038k;
                } else {
                    aVar2 = new C1583a(string);
                }
                bVar.mo11804d(new C1633d(aVar2, cursor.getBlob(5)));
            } else {
                String string2 = cursor.getString(4);
                if (string2 == null) {
                    aVar = C1720t.f3038k;
                } else {
                    aVar = new C1583a(string2);
                }
                bVar.mo11804d(new C1633d(aVar, (byte[]) C1720t.m2250O(tVar.mo11915e().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, "sequence_num"), C1712l.f3028a)));
            }
            if (!cursor.isNull(6)) {
                bVar.f2854b = Integer.valueOf(cursor.getInt(6));
            }
            list.add(new C1699b(j, hVar, bVar.mo11802b()));
        }
        return null;
    }
}
