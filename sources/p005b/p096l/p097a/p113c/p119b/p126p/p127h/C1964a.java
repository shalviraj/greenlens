package p005b.p096l.p097a.p113c.p119b.p126p.p127h;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.b.p.h.a */
public class C1964a implements ThreadFactory {

    /* renamed from: a */
    public final String f3523a;

    /* renamed from: b */
    public final ThreadFactory f3524b = Executors.defaultThreadFactory();

    public C1964a(String str) {
        C0823f.m380l(str, "Name must not be null");
        this.f3523a = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f3524b.newThread(new C1966c(runnable, 0));
        newThread.setName(this.f3523a);
        return newThread;
    }
}
