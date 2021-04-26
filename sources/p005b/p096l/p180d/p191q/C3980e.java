package p005b.p096l.p180d.p191q;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Objects;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p191q.p192f.C3982b;
import p005b.p096l.p180d.p191q.p192f.p195g.C4032q;
import p005b.p096l.p180d.p191q.p192f.p195g.C4038s;
import p005b.p096l.p180d.p191q.p192f.p195g.C4043w;

/* renamed from: b.l.d.q.e */
public class C3980e {

    /* renamed from: a */
    public final C4043w f7288a;

    public C3980e(@NonNull C4043w wVar) {
        this.f7288a = wVar;
    }

    @NonNull
    /* renamed from: a */
    public static C3980e m7350a() {
        C3825d c = C3825d.m7208c();
        c.mo15344a();
        C3980e eVar = (C3980e) c.f7045d.mo15457a(C3980e.class);
        Objects.requireNonNull(eVar, "FirebaseCrashlytics component is not present.");
        return eVar;
    }

    /* renamed from: b */
    public void mo15486b(@NonNull String str, @NonNull String str2) {
        C4032q qVar = this.f7288a.f7427f;
        Objects.requireNonNull(qVar);
        try {
            qVar.f7391d.mo15534b(str, str2);
            qVar.f7392e.mo15518b(new C4038s(qVar, Collections.unmodifiableMap(qVar.f7391d.f7381a)));
        } catch (IllegalArgumentException e) {
            Context context = qVar.f7388a;
            if (context != null) {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    throw e;
                }
            }
            C3982b.f7289a.mo15497c("Attempting to set custom attribute with null key, ignoring.");
        }
    }
}
