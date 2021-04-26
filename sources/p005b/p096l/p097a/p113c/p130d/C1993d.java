package p005b.p096l.p097a.p113c.p130d;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: b.l.a.c.d.d */
public final class C1993d implements DynamiteModule.C5475b {
    /* renamed from: a */
    public final DynamiteModule.C5475b.C5476a mo12310a(Context context, String str, DynamiteModule.C5475b.C5477b bVar) {
        int i;
        DynamiteModule.C5475b.C5476a aVar = new DynamiteModule.C5475b.C5476a();
        aVar.f11313a = bVar.mo12308a(context, str);
        int b = bVar.mo12309b(context, str, true);
        aVar.f11314b = b;
        int i2 = aVar.f11313a;
        if (i2 == 0 && b == 0) {
            i = 0;
        } else if (b >= i2) {
            aVar.f11315c = 1;
            return aVar;
        } else {
            i = -1;
        }
        aVar.f11315c = i;
        return aVar;
    }
}
