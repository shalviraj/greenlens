package p005b.p096l.p097a.p113c.p145h.p147b;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.appfoundry.previewer.constants.AnimationStrength;

/* renamed from: b.l.a.c.h.b.u5 */
public final class C3337u5 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3294q6 f5996g;

    public C3337u5(C3294q6 q6Var) {
        this.f5996g = q6Var;
    }

    public final void run() {
        C3374x9 x9Var = this.f5996g.f5904n;
        x9Var.f6107a.mo14331f().mo14126h();
        if (x9Var.mo14632c()) {
            if (x9Var.mo14631b()) {
                x9Var.f6107a.mo14464q().f5441u.mo14128b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString(AnimationStrength.MEDIUM, "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                x9Var.f6107a.mo14466s().mo14493A("auto", "_cmpx", bundle);
            } else {
                String a = x9Var.f6107a.mo14464q().f5441u.mo14127a();
                if (TextUtils.isEmpty(a)) {
                    x9Var.f6107a.mo14329d().f5800g.mo14414a("Cache still valid but referrer not found");
                } else {
                    long a2 = ((x9Var.f6107a.mo14464q().f5442v.mo14633a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a2);
                    x9Var.f6107a.mo14466s().mo14493A((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                x9Var.f6107a.mo14464q().f5441u.mo14128b((String) null);
            }
            x9Var.f6107a.mo14464q().f5442v.mo14634b(0);
        }
    }
}
