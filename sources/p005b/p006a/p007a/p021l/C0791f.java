package p005b.p006a.p007a.p021l;

import androidx.fragment.app.FragmentManager;
import com.wuman.android.auth.DialogFragmentController;

/* renamed from: b.a.a.l.f */
public final class C0791f extends DialogFragmentController {

    /* renamed from: a */
    public final /* synthetic */ C0785b f582a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0791f(C0785b bVar, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f582a = bVar;
    }

    public String getRedirectUri() {
        return this.f582a.f570g;
    }
}
