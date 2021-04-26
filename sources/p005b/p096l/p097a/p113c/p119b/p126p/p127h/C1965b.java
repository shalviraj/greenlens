package p005b.p096l.p097a.p113c.p119b.p126p.p127h;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.b.p.h.b */
public class C1965b implements ThreadFactory {

    /* renamed from: a */
    public final String f3525a;

    /* renamed from: b */
    public final AtomicInteger f3526b = new AtomicInteger();

    /* renamed from: c */
    public final ThreadFactory f3527c = Executors.defaultThreadFactory();

    public C1965b(String str) {
        C0823f.m380l(str, "Name must not be null");
        this.f3525a = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f3527c.newThread(new C1966c(runnable, 0));
        String str = this.f3525a;
        int andIncrement = this.f3526b.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
