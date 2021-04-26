package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Objects;
import java.util.Set;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1817g;
import p005b.p096l.p097a.p113c.p119b.p122m.C1929n;
import p005b.p096l.p097a.p113c.p119b.p122m.C1946t;
import p005b.p096l.p097a.p113c.p148i.p149b.C3409l;

/* renamed from: b.l.a.c.b.l.k.k1 */
public final class C1838k1 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3409l f3261g;

    /* renamed from: h */
    public final /* synthetic */ C1829i1 f3262h;

    public C1838k1(C1829i1 i1Var, C3409l lVar) {
        this.f3262h = i1Var;
        this.f3261g = lVar;
    }

    public final void run() {
        C1829i1 i1Var = this.f3262h;
        C3409l lVar = this.f3261g;
        Objects.requireNonNull(i1Var);
        C1754b bVar = lVar.f6176h;
        if (bVar.mo11986W()) {
            C1946t tVar = lVar.f6177i;
            bVar = tVar.f3493i;
            if (!bVar.mo11986W()) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
            } else {
                C1835j1 j1Var = i1Var.f3229g;
                C1929n V = tVar.mo12276V();
                Set<Scope> set = i1Var.f3226d;
                C1817g.C1819b bVar2 = (C1817g.C1819b) j1Var;
                Objects.requireNonNull(bVar2);
                if (V == null || set == null) {
                    Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                    bVar2.mo12113b(new C1754b(4));
                    i1Var.f3228f.mo12017b();
                }
                bVar2.f3207c = V;
                bVar2.f3208d = set;
                if (bVar2.f3209e) {
                    bVar2.f3205a.mo12022j(V, set);
                }
                i1Var.f3228f.mo12017b();
            }
        }
        ((C1817g.C1819b) i1Var.f3229g).mo12113b(bVar);
        i1Var.f3228f.mo12017b();
    }
}
