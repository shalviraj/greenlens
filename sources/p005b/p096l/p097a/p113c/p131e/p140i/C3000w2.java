package p005b.p096l.p097a.p113c.p131e.p140i;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b.l.a.c.e.i.w2 */
public final /* synthetic */ class C3000w2 implements C2710a3 {

    /* renamed from: a */
    public final C3026y2 f5099a;

    public C3000w2(C3026y2 y2Var) {
        this.f5099a = y2Var;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Object mo13218a() {
        C3026y2 y2Var = this.f5099a;
        Cursor query = y2Var.f5149a.query(y2Var.f5150b, C3026y2.f5148h, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                Map emptyMap = Collections.emptyMap();
                query.close();
                return emptyMap;
            }
            Map arrayMap = count <= 256 ? new ArrayMap(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                arrayMap.put(query.getString(0), query.getString(1));
            }
            query.close();
            return arrayMap;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}
