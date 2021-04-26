package p005b.p096l.p180d.p182n.p183a.p184c;

import android.os.Bundle;
import p005b.p096l.p097a.p113c.p145h.p146a.C3104a;
import p005b.p096l.p180d.p191q.C3976a;

/* renamed from: b.l.d.n.a.c.e */
public final class C3849e implements C3104a.C3105a {

    /* renamed from: a */
    public final /* synthetic */ C3850f f7080a;

    public C3849e(C3850f fVar) {
        this.f7080a = fVar;
    }

    /* renamed from: a */
    public final void mo14474a(String str, String str2, Bundle bundle, long j) {
        if (str != null && !str.equals("crash") && (!C3846b.f7069a.contains(str2))) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            ((C3976a) this.f7080a.f7081a).mo15484a(3, bundle2);
        }
    }
}
