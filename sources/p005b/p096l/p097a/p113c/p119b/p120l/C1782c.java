package p005b.p096l.p097a.p113c.p119b.p120l;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1796b;

/* renamed from: b.l.a.c.b.l.c */
public class C1782c extends Exception {

    /* renamed from: g */
    public final ArrayMap<C1796b<?>, C1754b> f3127g;

    public C1782c(ArrayMap<C1796b<?>, C1754b> arrayMap) {
        this.f3127g = arrayMap;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C1796b next : this.f3127g.keySet()) {
            C1754b bVar = this.f3127g.get(next);
            if (bVar.mo11986W()) {
                z = false;
            }
            String str = next.f3143c.f3126c;
            String valueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + String.valueOf(str).length() + 2);
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
