package p005b.p096l.p180d.p213v;

import java.util.concurrent.ThreadFactory;

/* renamed from: b.l.d.v.m0 */
public final /* synthetic */ class C4256m0 implements ThreadFactory {

    /* renamed from: a */
    public static final ThreadFactory f7883a = new C4256m0();

    public final Thread newThread(Runnable runnable) {
        int i = C4250j0.f7867a;
        return new Thread(runnable, "firebase-iid-executor");
    }
}
