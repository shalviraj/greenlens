package p005b.p096l.p097a.p113c.p130d;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: b.l.a.c.d.c */
public final class C1992c implements DynamiteModule.C5475b {
    /* renamed from: a */
    public final DynamiteModule.C5475b.C5476a mo12310a(Context context, String str, DynamiteModule.C5475b.C5477b bVar) {
        DynamiteModule.C5475b.C5476a aVar = new DynamiteModule.C5475b.C5476a();
        int a = bVar.mo12308a(context, str);
        aVar.f11313a = a;
        aVar.f11314b = a != 0 ? bVar.mo12309b(context, str, false) : bVar.mo12309b(context, str, true);
        int i = aVar.f11313a;
        if (i == 0 && aVar.f11314b == 0) {
            aVar.f11315c = 0;
        } else if (i >= aVar.f11314b) {
            aVar.f11315c = -1;
        } else {
            aVar.f11315c = 1;
        }
        return aVar;
    }
}
