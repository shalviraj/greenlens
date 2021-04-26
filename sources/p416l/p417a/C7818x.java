package p416l.p417a;

import java.lang.Thread;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p005b.p291q.p292a.C5266a;
import p298d.p337v.C6827f;
import p298d.p414b0.C7679s;

/* renamed from: l.a.x */
public final class C7818x {

    /* renamed from: a */
    public static final List<CoroutineExceptionHandler> f15426a = C7679s.m13901i(C5266a.m9770A(C0000a.m0a()));

    /* renamed from: a */
    public static final void m14213a(C6827f fVar, Throwable th) {
        Throwable th2;
        for (CoroutineExceptionHandler handleException : f15426a) {
            try {
                handleException.handleException(fVar, th);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    C5266a.m10007p(th2, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, th2);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
