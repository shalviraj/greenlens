package p005b.p096l.p180d.p208s.p210j;

import androidx.annotation.NonNull;
import java.io.Writer;
import p005b.p096l.p180d.p208s.C4202a;

/* renamed from: b.l.d.s.j.d */
public class C4215d implements C4202a {

    /* renamed from: a */
    public final /* synthetic */ C4216e f7800a;

    public C4215d(C4216e eVar) {
        this.f7800a = eVar;
    }

    /* renamed from: a */
    public void mo15804a(@NonNull Object obj, @NonNull Writer writer) {
        C4216e eVar = this.f7800a;
        C4218f fVar = new C4218f(writer, eVar.f7802a, eVar.f7803b, eVar.f7804c, eVar.f7805d);
        fVar.mo15805g(obj, false);
        fVar.mo15807i();
        fVar.f7808b.flush();
    }
}
