package p005b.p006a.p007a.p009b;

import android.content.Context;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import p005b.p051h.p052a.C0929c;
import p005b.p051h.p052a.C0941h;
import p005b.p051h.p052a.C0943i;
import p005b.p051h.p052a.p071n.C1311h;
import p005b.p051h.p052a.p071n.C1319m;
import p005b.p051h.p052a.p074q.C1343e;

/* renamed from: b.a.a.b.j */
public class C0633j extends C0943i {
    public C0633j(@NonNull C0929c cVar, @NonNull C1311h hVar, @NonNull C1319m mVar, @NonNull Context context) {
        super(cVar, hVar, mVar, context);
    }

    @CheckResult
    @NonNull
    /* renamed from: k */
    public C0941h mo10411k(@NonNull Class cls) {
        return new C0632i(this.f900g, this, cls, this.f901h);
    }

    @CheckResult
    @NonNull
    /* renamed from: l */
    public C0941h mo10412l() {
        return (C0632i) super.mo10412l();
    }

    @CheckResult
    @NonNull
    /* renamed from: m */
    public C0941h mo10413m() {
        return (C0632i) super.mo10413m();
    }

    @CheckResult
    @NonNull
    /* renamed from: o */
    public C0941h mo10414o(@Nullable File file) {
        C0941h m = mo10413m();
        C0632i iVar = (C0632i) m;
        iVar.f893L = file;
        iVar.f896O = true;
        return (C0632i) m;
    }

    @CheckResult
    @NonNull
    /* renamed from: p */
    public C0941h mo10415p(@Nullable String str) {
        C0941h m = mo10413m();
        C0632i iVar = (C0632i) m;
        iVar.f893L = str;
        iVar.f896O = true;
        return (C0632i) m;
    }

    /* renamed from: s */
    public void mo10416s(@NonNull C1343e eVar) {
        if (!(eVar instanceof C0631h)) {
            eVar = new C0631h().mo10400z(eVar);
        }
        super.mo10416s(eVar);
    }
}
