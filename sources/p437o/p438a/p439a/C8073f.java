package p437o.p438a.p439a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: o.a.a.f */
public class C8073f extends Handler implements C8082l {

    /* renamed from: g */
    public final C8081k f16227g = new C8081k();

    /* renamed from: h */
    public final int f16228h;

    /* renamed from: i */
    public final C8068c f16229i;

    /* renamed from: j */
    public boolean f16230j;

    public C8073f(C8068c cVar, Looper looper, int i) {
        super(looper);
        this.f16229i = cVar;
        this.f16228h = i;
    }

    /* renamed from: a */
    public void mo26001a(C8088q qVar, Object obj) {
        C8080j a = C8080j.m14968a(qVar, obj);
        synchronized (this) {
            this.f16227g.mo26021a(a);
            if (!this.f16230j) {
                this.f16230j = true;
                if (!sendMessage(obtainMessage())) {
                    throw new C8072e("Could not send handler message");
                }
            }
        }
    }

    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                C8080j b = this.f16227g.mo26022b();
                if (b == null) {
                    synchronized (this) {
                        b = this.f16227g.mo26022b();
                        if (b == null) {
                            this.f16230j = false;
                            this.f16230j = false;
                            return;
                        }
                    }
                }
                this.f16229i.mo26004c(b);
            } while (SystemClock.uptimeMillis() - uptimeMillis < ((long) this.f16228h));
            if (sendMessage(obtainMessage())) {
                this.f16230j = true;
                return;
            }
            throw new C8072e("Could not send handler message");
        } catch (Throwable th) {
            this.f16230j = false;
            throw th;
        }
    }
}
