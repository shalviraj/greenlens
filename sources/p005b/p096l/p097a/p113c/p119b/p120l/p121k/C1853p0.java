package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.C1763f;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p120l.C1789h;
import p005b.p096l.p097a.p113c.p119b.p122m.C1905d;
import p005b.p096l.p097a.p113c.p148i.C3397a;
import p005b.p096l.p097a.p113c.p148i.C3412e;

/* renamed from: b.l.a.c.b.l.k.p0 */
public final class C1853p0 implements C1803c1, C1881y1 {

    /* renamed from: a */
    public final Lock f3276a;

    /* renamed from: b */
    public final Condition f3277b;

    /* renamed from: c */
    public final Context f3278c;

    /* renamed from: d */
    public final C1763f f3279d;

    /* renamed from: e */
    public final C1859r0 f3280e;

    /* renamed from: f */
    public final Map<C1770a.C1773c<?>, C1770a.C1779f> f3281f;

    /* renamed from: g */
    public final Map<C1770a.C1773c<?>, C1754b> f3282g = new HashMap();

    /* renamed from: h */
    public final C1905d f3283h;

    /* renamed from: i */
    public final Map<C1770a<?>, Boolean> f3284i;

    /* renamed from: j */
    public final C1770a.C1771a<? extends C3412e, C3397a> f3285j;

    /* renamed from: k */
    public volatile C1843m0 f3286k;

    /* renamed from: l */
    public int f3287l;

    /* renamed from: m */
    public final C1834j0 f3288m;

    /* renamed from: n */
    public final C1807d1 f3289n;

    public C1853p0(Context context, C1834j0 j0Var, Lock lock, Looper looper, C1763f fVar, Map<C1770a.C1773c<?>, C1770a.C1779f> map, C1905d dVar, Map<C1770a<?>, Boolean> map2, C1770a.C1771a<? extends C3412e, C3397a> aVar, ArrayList<C1875w1> arrayList, C1807d1 d1Var) {
        this.f3278c = context;
        this.f3276a = lock;
        this.f3279d = fVar;
        this.f3281f = map;
        this.f3283h = dVar;
        this.f3284i = map2;
        this.f3285j = aVar;
        this.f3288m = j0Var;
        this.f3289n = d1Var;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C1875w1 w1Var = arrayList.get(i);
            i++;
            w1Var.f3319c = this;
        }
        this.f3280e = new C1859r0(this, looper);
        this.f3277b = lock.newCondition();
        this.f3286k = new C1821g0(this);
    }

    /* renamed from: a */
    public final boolean mo12066a() {
        return this.f3286k instanceof C1864t;
    }

    /* renamed from: b */
    public final void mo12067b() {
        if (this.f3286k.mo12118b()) {
            this.f3282g.clear();
        }
    }

    /* renamed from: c */
    public final void mo12068c() {
        this.f3286k.mo12119c();
    }

    /* renamed from: d */
    public final <A extends C1770a.C1772b, T extends C1805d<? extends C1789h, A>> T mo12069d(@NonNull T t) {
        t.mo18868i();
        return this.f3286k.mo12120d(t);
    }

    /* renamed from: e */
    public final void mo12070e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f3286k);
        for (C1770a next : this.f3284i.keySet()) {
            printWriter.append(str).append(next.f3126c).println(":");
            this.f3281f.get(next.mo12012a()).mo12018e(concat, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: f */
    public final void mo12159f(C1754b bVar) {
        this.f3276a.lock();
        try {
            this.f3286k = new C1821g0(this);
            this.f3286k.mo12117a();
            this.f3277b.signalAll();
        } finally {
            this.f3276a.unlock();
        }
    }

    /* renamed from: g */
    public final void mo12086g(int i) {
        this.f3276a.lock();
        try {
            this.f3286k.mo12121g(i);
        } finally {
            this.f3276a.unlock();
        }
    }

    /* renamed from: k */
    public final void mo12087k(@Nullable Bundle bundle) {
        this.f3276a.lock();
        try {
            this.f3286k.mo12122k(bundle);
        } finally {
            this.f3276a.unlock();
        }
    }

    /* renamed from: o */
    public final void mo12105o(@NonNull C1754b bVar, @NonNull C1770a<?> aVar, boolean z) {
        this.f3276a.lock();
        try {
            this.f3286k.mo12123o(bVar, aVar, z);
        } finally {
            this.f3276a.unlock();
        }
    }
}
