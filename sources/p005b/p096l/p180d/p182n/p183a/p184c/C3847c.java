package p005b.p096l.p180d.p182n.p183a.p184c;

import android.os.Bundle;
import com.amplitude.api.DatabaseHelper;
import java.util.Set;
import p005b.p096l.p097a.p113c.p145h.p146a.C3104a;
import p005b.p096l.p097a.p113c.p145h.p147b.C3249m5;
import p005b.p096l.p097a.p113c.p145h.p147b.C3360w6;
import p005b.p096l.p180d.p191q.C3976a;

/* renamed from: b.l.d.n.a.c.c */
public final class C3847c implements C3104a.C3105a {

    /* renamed from: a */
    public final /* synthetic */ C3848d f7075a;

    public C3847c(C3848d dVar) {
        this.f7075a = dVar;
    }

    /* renamed from: a */
    public final void mo14474a(String str, String str2, Bundle bundle, long j) {
        if (this.f7075a.f7076a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            Set<String> set = C3846b.f7069a;
            String b = C3360w6.m6447b(str2, C3249m5.f5739c, C3249m5.f5737a);
            if (b != null) {
                str2 = b;
            }
            bundle2.putString(DatabaseHelper.EVENT_TABLE_NAME, str2);
            ((C3976a) this.f7075a.f7077b).mo15484a(2, bundle2);
        }
    }
}
