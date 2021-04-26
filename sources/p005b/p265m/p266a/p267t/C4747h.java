package p005b.p265m.p266a.p267t;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: b.m.a.t.h */
public class C4747h {

    /* renamed from: e */
    public static C4747h f9091e;

    /* renamed from: a */
    public Handler f9092a;

    /* renamed from: b */
    public HandlerThread f9093b;

    /* renamed from: c */
    public int f9094c = 0;

    /* renamed from: d */
    public final Object f9095d = new Object();

    /* renamed from: a */
    public final void mo16479a() {
        synchronized (this.f9095d) {
            if (this.f9092a == null) {
                if (this.f9094c > 0) {
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f9093b = handlerThread;
                    handlerThread.start();
                    this.f9092a = new Handler(this.f9093b.getLooper());
                } else {
                    throw new IllegalStateException("CameraThread is not open");
                }
            }
        }
    }

    /* renamed from: b */
    public void mo16480b(Runnable runnable) {
        synchronized (this.f9095d) {
            mo16479a();
            this.f9092a.post(runnable);
        }
    }
}
