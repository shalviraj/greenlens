package p005b.p096l.p180d.p191q;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.Locale;
import p005b.p096l.p180d.p182n.p183a.C3840a;
import p005b.p096l.p180d.p191q.p192f.C3982b;
import p005b.p096l.p180d.p191q.p192f.p193e.C3988b;

/* renamed from: b.l.d.q.a */
public class C3976a implements C3840a.C3842b {

    /* renamed from: a */
    public C3988b f7282a;

    /* renamed from: b */
    public C3988b f7283b;

    /* renamed from: a */
    public void mo15484a(int i, @Nullable Bundle bundle) {
        C3982b.f7289a.mo15499e(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[]{Integer.valueOf(i), bundle}));
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            C3988b bVar = "clx".equals(bundle2.getString("_o")) ? this.f7282a : this.f7283b;
            if (bVar != null) {
                bVar.mo15503b(string, bundle2);
            }
        }
    }
}
