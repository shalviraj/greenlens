package p005b.p096l.p097a.p151d.p152a.p154b;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p005b.p096l.p097a.p151d.p152a.p159e.C3579c0;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;

/* renamed from: b.l.a.d.a.b.v0 */
public final class C3551v0 {

    /* renamed from: g */
    public static final C3584f f6581g = new C3584f("ExtractorSessionStoreView");

    /* renamed from: a */
    public final C3544t f6582a;

    /* renamed from: b */
    public final C3579c0<C3525n2> f6583b;

    /* renamed from: c */
    public final C3511k0 f6584c;

    /* renamed from: d */
    public final C3579c0<Executor> f6585d;

    /* renamed from: e */
    public final Map<Integer, C3542s0> f6586e = new HashMap();

    /* renamed from: f */
    public final ReentrantLock f6587f = new ReentrantLock();

    public C3551v0(C3544t tVar, C3579c0<C3525n2> c0Var, C3511k0 k0Var, C3579c0<Executor> c0Var2) {
        this.f6582a = tVar;
        this.f6583b = c0Var;
        this.f6584c = k0Var;
        this.f6585d = c0Var2;
    }

    /* renamed from: d */
    public static String m6765d(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new C3495g0("Session without pack received.");
    }

    /* renamed from: a */
    public final void mo14842a(int i) {
        mo14843b(new C3527o0(this, i));
    }

    /* renamed from: b */
    public final <T> T mo14843b(C3548u0<T> u0Var) {
        try {
            this.f6587f.lock();
            return u0Var.mo14793a();
        } finally {
            this.f6587f.unlock();
        }
    }

    /* renamed from: c */
    public final C3542s0 mo14844c(int i) {
        Map<Integer, C3542s0> map = this.f6586e;
        Integer valueOf = Integer.valueOf(i);
        C3542s0 s0Var = map.get(valueOf);
        if (s0Var != null) {
            return s0Var;
        }
        throw new C3495g0(String.format("Could not find session %d while trying to get it", new Object[]{valueOf}), i);
    }
}
