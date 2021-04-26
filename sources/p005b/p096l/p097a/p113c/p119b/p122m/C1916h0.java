package p005b.p096l.p097a.p113c.p119b.p122m;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p122m.C1922k;
import p005b.p096l.p097a.p113c.p119b.p125o.C1956a;

/* renamed from: b.l.a.c.b.m.h0 */
public final class C1916h0 implements ServiceConnection {

    /* renamed from: a */
    public final Map<ServiceConnection, ServiceConnection> f3445a = new HashMap();

    /* renamed from: b */
    public int f3446b = 2;

    /* renamed from: c */
    public boolean f3447c;

    /* renamed from: d */
    public IBinder f3448d;

    /* renamed from: e */
    public final C1922k.C1923a f3449e;

    /* renamed from: f */
    public ComponentName f3450f;

    /* renamed from: g */
    public final /* synthetic */ C1912f0 f3451g;

    public C1916h0(C1912f0 f0Var, C1922k.C1923a aVar) {
        this.f3451g = f0Var;
        this.f3449e = aVar;
    }

    /* renamed from: a */
    public final void mo12249a(String str) {
        this.f3446b = 3;
        C1912f0 f0Var = this.f3451g;
        C1956a aVar = f0Var.f3429f;
        Context context = f0Var.f3427d;
        boolean c = aVar.mo12288c(context, this.f3449e.mo12257a(context), this, this.f3449e.f3470c);
        this.f3447c = c;
        if (c) {
            Message obtainMessage = this.f3451g.f3428e.obtainMessage(1, this.f3449e);
            C1912f0 f0Var2 = this.f3451g;
            f0Var2.f3428e.sendMessageDelayed(obtainMessage, f0Var2.f3431h);
            return;
        }
        this.f3446b = 2;
        try {
            C1912f0 f0Var3 = this.f3451g;
            C1956a aVar2 = f0Var3.f3429f;
            Context context2 = f0Var3.f3427d;
            Objects.requireNonNull(aVar2);
            context2.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f3451g.f3426c) {
            this.f3451g.f3428e.removeMessages(1, this.f3449e);
            this.f3448d = iBinder;
            this.f3450f = componentName;
            for (ServiceConnection onServiceConnected : this.f3445a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f3446b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f3451g.f3426c) {
            this.f3451g.f3428e.removeMessages(1, this.f3449e);
            this.f3448d = null;
            this.f3450f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f3445a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f3446b = 2;
        }
    }
}
