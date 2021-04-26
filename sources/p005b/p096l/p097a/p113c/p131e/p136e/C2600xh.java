package p005b.p096l.p097a.p113c.p131e.p136e;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p185o.p189e0.C3877g0;
import p005b.p096l.p180d.p185o.p189e0.C3883j0;
import p005b.p096l.p180d.p185o.p189e0.C3887l0;

/* renamed from: b.l.a.c.e.e.xh */
public final class C2600xh extends C2407pg<C2481si> {

    /* renamed from: b */
    public final Context f4448b;

    /* renamed from: c */
    public final C2481si f4449c;

    /* renamed from: d */
    public final Future<C2287kg<C2481si>> f4450d = mo12919a();

    public C2600xh(Context context, C2481si siVar) {
        this.f4448b = context;
        this.f4449c = siVar;
    }

    @NonNull
    /* renamed from: d */
    public static C3883j0 m4401d(C3825d dVar, C2192gk gkVar) {
        Objects.requireNonNull(dVar, "null reference");
        Objects.requireNonNull(gkVar, "null reference");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C3877g0(gkVar, "firebase"));
        List<C2507tk> list = gkVar.f3895l.f4373g;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(new C3877g0(list.get(i)));
            }
        }
        C3883j0 j0Var = new C3883j0(dVar, arrayList);
        j0Var.f7153o = new C3887l0(gkVar.f3899p, gkVar.f3898o);
        j0Var.f7154p = gkVar.f3900q;
        j0Var.f7155q = gkVar.f3901r;
        j0Var.mo15408j0(C1960d.m2721I1(gkVar.f3902s));
        return j0Var;
    }

    /* renamed from: a */
    public final Future<C2287kg<C2481si>> mo12919a() {
        Future<C2287kg<C2481si>> future = this.f4450d;
        if (future != null) {
            return future;
        }
        C2624yh yhVar = new C2624yh(this.f4449c, this.f4448b);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor).submit(yhVar);
    }
}
