package p005b.p096l.p097a.p113c.p130d;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: b.l.a.c.d.b */
public final class C1991b implements DynamiteModule.C5475b {
    /* renamed from: a */
    public final DynamiteModule.C5475b.C5476a mo12310a(Context context, String str, DynamiteModule.C5475b.C5477b bVar) {
        DynamiteModule.C5475b.C5476a aVar = new DynamiteModule.C5475b.C5476a();
        int b = bVar.mo12309b(context, str, true);
        aVar.f11314b = b;
        if (b != 0) {
            aVar.f11315c = 1;
        } else {
            int a = bVar.mo12308a(context, str);
            aVar.f11313a = a;
            if (a != 0) {
                aVar.f11315c = -1;
            }
        }
        return aVar;
    }
}
