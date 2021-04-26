package p005b.p096l.p097a.p098a.p101f.p106q.p108i;

import android.database.Cursor;
import java.util.ArrayList;
import p005b.p096l.p097a.p098a.C1583a;
import p005b.p096l.p097a.p098a.p101f.p106q.p108i.C1720t;

/* renamed from: b.l.a.a.f.q.i.l */
public final /* synthetic */ class C1712l implements C1720t.C1722b {

    /* renamed from: a */
    public static final C1712l f3028a = new C1712l();

    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        C1583a aVar = C1720t.f3038k;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }
}
