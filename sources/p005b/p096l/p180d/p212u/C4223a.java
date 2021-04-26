package p005b.p096l.p180d.p212u;

import android.content.Context;
import p005b.p096l.p180d.p215w.C4284b;

/* renamed from: b.l.d.u.a */
public final /* synthetic */ class C4223a implements C4284b {

    /* renamed from: a */
    public final Context f7813a;

    public C4223a(Context context) {
        this.f7813a = context;
    }

    public Object get() {
        C4230g gVar;
        Context context = this.f7813a;
        int i = C4226d.f7816b;
        C4230g gVar2 = C4230g.f7824b;
        synchronized (C4230g.class) {
            if (C4230g.f7824b == null) {
                C4230g.f7824b = new C4230g(context);
            }
            gVar = C4230g.f7824b;
        }
        return gVar;
    }
}
