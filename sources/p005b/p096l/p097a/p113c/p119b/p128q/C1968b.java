package p005b.p096l.p097a.p113c.p119b.p128q;

import android.content.Context;

/* renamed from: b.l.a.c.b.q.b */
public class C1968b {

    /* renamed from: b */
    public static C1968b f3530b = new C1968b();

    /* renamed from: a */
    public C1967a f3531a = null;

    /* renamed from: a */
    public static C1967a m2885a(Context context) {
        C1967a aVar;
        C1968b bVar = f3530b;
        synchronized (bVar) {
            if (bVar.f3531a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                bVar.f3531a = new C1967a(context);
            }
            aVar = bVar.f3531a;
        }
        return aVar;
    }
}
