package p005b.p096l.p180d.p212u;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p005b.p096l.p180d.p190p.C3973x;
import p005b.p096l.p180d.p212u.C4228f;
import p005b.p096l.p180d.p215w.C4284b;

/* renamed from: b.l.d.u.d */
public class C4226d implements C4228f {

    /* renamed from: b */
    public static final /* synthetic */ int f7816b = 0;

    /* renamed from: a */
    public C4284b<C4230g> f7817a;

    public C4226d(Context context, Set<C4227e> set) {
        C3973x xVar = new C3973x(new C4223a(context));
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), C4225c.f7815a);
        this.f7817a = xVar;
    }

    @NonNull
    /* renamed from: a */
    public C4228f.C4229a mo15810a(@NonNull String str) {
        boolean a;
        long currentTimeMillis = System.currentTimeMillis();
        boolean a2 = this.f7817a.get().mo15811a(str, currentTimeMillis);
        C4230g gVar = this.f7817a.get();
        synchronized (gVar) {
            a = gVar.mo15811a("fire-global", currentTimeMillis);
        }
        if (a2 && a) {
            return C4228f.C4229a.COMBINED;
        }
        if (a) {
            return C4228f.C4229a.GLOBAL;
        }
        return a2 ? C4228f.C4229a.SDK : C4228f.C4229a.NONE;
    }
}
