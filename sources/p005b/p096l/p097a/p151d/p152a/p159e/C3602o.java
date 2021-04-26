package p005b.p096l.p097a.p151d.p152a.p159e;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: b.l.a.d.a.e.o */
public final class C3602o implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ C3604p f6661a;

    public /* synthetic */ C3602o(C3604p pVar) {
        this.f6661a = pVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f6661a.f6664b.mo14884b(4, "ServiceConnectionImpl.onServiceConnected(%s)", new Object[]{componentName});
        this.f6661a.mo14906c(new C3598m(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f6661a.f6664b.mo14884b(4, "ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[]{componentName});
        this.f6661a.mo14906c(new C3600n(this));
    }
}
