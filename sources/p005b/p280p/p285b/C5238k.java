package p005b.p280p.p285b;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p005b.p280p.p285b.C5223d;
import p005b.p280p.p285b.p286a0.C5133h;
import p005b.p280p.p285b.p286a0.C5134i;

/* renamed from: b.p.b.k */
public final class C5238k {

    /* renamed from: a */
    public ExecutorService f10410a;

    /* renamed from: b */
    public final Deque<C5223d.C5226c> f10411b = new ArrayDeque();

    /* renamed from: c */
    public final Deque<C5223d.C5226c> f10412c = new ArrayDeque();

    public C5238k() {
        new ArrayDeque();
    }

    /* renamed from: a */
    public synchronized void mo17147a(C5223d.C5226c cVar) {
        if (this.f10412c.remove(cVar)) {
            mo17149c();
        } else {
            throw new AssertionError("AsyncCall wasn't running!");
        }
    }

    /* renamed from: b */
    public synchronized ExecutorService mo17148b() {
        if (this.f10410a == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            byte[] bArr = C5134i.f9953a;
            this.f10410a = new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, timeUnit, synchronousQueue, new C5133h("OkHttp Dispatcher", false));
        }
        return this.f10410a;
    }

    /* renamed from: c */
    public final void mo17149c() {
        if (this.f10412c.size() < 64 && !this.f10411b.isEmpty()) {
            Iterator<C5223d.C5226c> it = this.f10411b.iterator();
            while (it.hasNext()) {
                C5223d.C5226c next = it.next();
                if (mo17150d(next) < 5) {
                    it.remove();
                    this.f10412c.add(next);
                    mo17148b().execute(next);
                }
                if (this.f10412c.size() >= 64) {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public final int mo17150d(C5223d.C5226c cVar) {
        int i = 0;
        for (C5223d.C5226c cVar2 : this.f10412c) {
            if (C5223d.this.f10278c.f10479a.f10423d.equals(C5223d.this.f10278c.f10479a.f10423d)) {
                i++;
            }
        }
        return i;
    }
}
