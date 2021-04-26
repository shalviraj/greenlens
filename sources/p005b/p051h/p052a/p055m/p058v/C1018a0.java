package p005b.p051h.p052a.p055m.p058v;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p055m.p056u.C0987d;
import p005b.p051h.p052a.p055m.p058v.C1073g;
import p005b.p051h.p052a.p055m.p062w.C1161n;

/* renamed from: b.h.a.m.v.a0 */
public class C1018a0 implements C0987d.C0988a<Object> {

    /* renamed from: g */
    public final /* synthetic */ C1161n.C1162a f1078g;

    /* renamed from: h */
    public final /* synthetic */ C1020b0 f1079h;

    public C1018a0(C1020b0 b0Var, C1161n.C1162a aVar) {
        this.f1079h = b0Var;
        this.f1078g = aVar;
    }

    /* renamed from: c */
    public void mo10853c(@NonNull Exception exc) {
        C1020b0 b0Var = this.f1079h;
        C1161n.C1162a<?> aVar = this.f1078g;
        C1161n.C1162a<?> aVar2 = b0Var.f1086l;
        if (aVar2 != null && aVar2 == aVar) {
            C1020b0 b0Var2 = this.f1079h;
            C1161n.C1162a aVar3 = this.f1078g;
            C1073g.C1074a aVar4 = b0Var2.f1082h;
            C1066e eVar = b0Var2.f1087m;
            C0987d<Data> dVar = aVar3.f1411c;
            aVar4.mo10878e(eVar, exc, dVar, dVar.mo10846e());
        }
    }

    /* renamed from: d */
    public void mo10854d(@Nullable Object obj) {
        C1020b0 b0Var = this.f1079h;
        C1161n.C1162a<?> aVar = this.f1078g;
        C1161n.C1162a<?> aVar2 = b0Var.f1086l;
        if (aVar2 != null && aVar2 == aVar) {
            C1020b0 b0Var2 = this.f1079h;
            C1161n.C1162a aVar3 = this.f1078g;
            C1086k kVar = b0Var2.f1081g.f1193p;
            if (obj == null || !kVar.mo10980c(aVar3.f1411c.mo10846e())) {
                C1073g.C1074a aVar4 = b0Var2.f1082h;
                C0974m mVar = aVar3.f1409a;
                C0987d<Data> dVar = aVar3.f1411c;
                aVar4.mo10879i(mVar, obj, dVar, dVar.mo10846e(), b0Var2.f1087m);
                return;
            }
            b0Var2.f1085k = obj;
            b0Var2.f1082h.mo10877d();
        }
    }
}
