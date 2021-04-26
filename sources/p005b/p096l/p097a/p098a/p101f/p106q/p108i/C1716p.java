package p005b.p096l.p097a.p098a.p101f.p106q.p108i;

import android.database.Cursor;
import android.util.Base64;
import java.util.ArrayList;
import p005b.p096l.p097a.p098a.C1583a;
import p005b.p096l.p097a.p098a.p101f.C1628b;
import p005b.p096l.p097a.p098a.p101f.C1640h;
import p005b.p096l.p097a.p098a.p101f.p106q.p108i.C1720t;
import p005b.p096l.p097a.p098a.p101f.p111t.C1742a;

/* renamed from: b.l.a.a.f.q.i.p */
public final /* synthetic */ class C1716p implements C1720t.C1722b {

    /* renamed from: a */
    public static final C1716p f3032a = new C1716p();

    public Object apply(Object obj) {
        byte[] bArr;
        Cursor cursor = (Cursor) obj;
        C1583a aVar = C1720t.f3038k;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            C1640h.C1641a a = C1640h.m2161a();
            a.mo11814b(cursor.getString(1));
            a.mo11815c(C1742a.m2278b(cursor.getInt(2)));
            String string = cursor.getString(3);
            if (string == null) {
                bArr = null;
            } else {
                bArr = Base64.decode(string, 0);
            }
            C1628b.C1630b bVar = (C1628b.C1630b) a;
            bVar.f2863b = bArr;
            arrayList.add(bVar.mo11813a());
        }
        return arrayList;
    }
}
