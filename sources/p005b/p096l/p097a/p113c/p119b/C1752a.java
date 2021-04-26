package p005b.p096l.p097a.p113c.p119b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.b.a */
public class C1752a implements ServiceConnection {

    /* renamed from: a */
    public boolean f3087a = false;

    /* renamed from: b */
    public final BlockingQueue<IBinder> f3088b = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder mo11981a(long j, TimeUnit timeUnit) {
        C0823f.m378k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f3087a) {
            this.f3087a = true;
            IBinder poll = this.f3088b.poll(j, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f3088b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
