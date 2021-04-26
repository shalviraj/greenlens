package p005b.p096l.p180d.p185o.p186d0.p187a.p188a;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.auth.api.fallback.service.FirebaseAuthFallbackService;
import p005b.p096l.p097a.p113c.p119b.p122m.C1913g;
import p005b.p096l.p097a.p113c.p119b.p122m.C1915h;
import p005b.p096l.p097a.p113c.p119b.p122m.C1933o;
import p005b.p096l.p097a.p113c.p131e.p136e.C2115di;

/* renamed from: b.l.d.o.d0.a.a.a */
public final class C3862a extends C1913g {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAuthFallbackService f7112a;

    public C3862a(FirebaseAuthFallbackService firebaseAuthFallbackService) {
        this.f7112a = firebaseAuthFallbackService;
    }

    /* renamed from: f0 */
    public final void mo12266f0(C1933o oVar, C1915h hVar) {
        Bundle bundle = hVar.f3439m;
        if (bundle != null) {
            String string = bundle.getString("com.google.firebase.auth.API_KEY");
            if (!TextUtils.isEmpty(string)) {
                oVar.mo12228k1(0, new C2115di(this.f7112a, string), (Bundle) null);
                return;
            }
            throw new IllegalArgumentException("ApiKey must not be empty.");
        }
        throw new IllegalArgumentException("ExtraArgs is null.");
    }
}
