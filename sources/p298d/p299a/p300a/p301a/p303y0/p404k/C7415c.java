package p298d.p299a.p300a.p301a.p303y0.p404k;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.k.c */
public class C7415c implements C7439k {

    /* renamed from: b */
    public final Lock f14827b;

    public C7415c(Lock lock, int i) {
        ReentrantLock reentrantLock = (i & 1) != 0 ? new ReentrantLock() : null;
        C6888i.m12438e(reentrantLock, "lock");
        this.f14827b = reentrantLock;
    }

    public void lock() {
        this.f14827b.lock();
    }

    public void unlock() {
        this.f14827b.unlock();
    }
}
