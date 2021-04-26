package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: b.l.a.c.h.b.h9 */
public final class C3198h9 implements C3286p9 {

    /* renamed from: a */
    public final /* synthetic */ C3220j9 f5592a;

    public C3198h9(C3220j9 j9Var) {
        this.f5592a = j9Var;
    }

    /* renamed from: a */
    public final void mo14208a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            C3281p4 p4Var = this.f5592a.f5658k;
            if (p4Var != null) {
                p4Var.mo14329d().f5799f.mo14415b("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.f5592a.mo14331f().mo14420q(new C3187g9(this, str, bundle));
    }
}
