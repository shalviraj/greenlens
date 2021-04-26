package p005b.p096l.p097a.p113c.p119b.p122m;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.core.p003os.EnvironmentCompat;
import com.amplitude.api.Constants;
import java.util.HashMap;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.C1889b;
import p005b.p096l.p097a.p113c.p119b.p122m.C1922k;
import p005b.p096l.p097a.p113c.p119b.p125o.C1956a;
import p005b.p096l.p097a.p113c.p131e.p135d.C2020d;

/* renamed from: b.l.a.c.b.m.f0 */
public final class C1912f0 extends C1922k implements Handler.Callback {

    /* renamed from: c */
    public final HashMap<C1922k.C1923a, C1916h0> f3426c = new HashMap<>();

    /* renamed from: d */
    public final Context f3427d;

    /* renamed from: e */
    public final Handler f3428e;

    /* renamed from: f */
    public final C1956a f3429f;

    /* renamed from: g */
    public final long f3430g;

    /* renamed from: h */
    public final long f3431h;

    public C1912f0(Context context) {
        this.f3427d = context.getApplicationContext();
        this.f3428e = new C2020d(context.getMainLooper(), this);
        this.f3429f = C1956a.m2685b();
        this.f3430g = 5000;
        this.f3431h = Constants.MIN_TIME_BETWEEN_SESSIONS_MILLIS;
    }

    /* renamed from: b */
    public final boolean mo12245b(C1922k.C1923a aVar, ServiceConnection serviceConnection, String str) {
        boolean z;
        C0823f.m380l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f3426c) {
            C1916h0 h0Var = this.f3426c.get(aVar);
            if (h0Var == null) {
                h0Var = new C1916h0(this, aVar);
                aVar.mo12257a(this.f3427d);
                h0Var.f3445a.put(serviceConnection, serviceConnection);
                h0Var.mo12249a(str);
                this.f3426c.put(aVar, h0Var);
            } else {
                this.f3428e.removeMessages(0, aVar);
                if (!h0Var.f3445a.containsKey(serviceConnection)) {
                    C1912f0 f0Var = h0Var.f3451g;
                    C1956a aVar2 = f0Var.f3429f;
                    h0Var.f3449e.mo12257a(f0Var.f3427d);
                    h0Var.f3445a.put(serviceConnection, serviceConnection);
                    int i = h0Var.f3446b;
                    if (i == 1) {
                        ((C1889b.C1899j) serviceConnection).onServiceConnected(h0Var.f3450f, h0Var.f3448d);
                    } else if (i == 2) {
                        h0Var.mo12249a(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            z = h0Var.f3447c;
        }
        return z;
    }

    /* renamed from: c */
    public final void mo12246c(C1922k.C1923a aVar, ServiceConnection serviceConnection, String str) {
        C0823f.m380l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f3426c) {
            C1916h0 h0Var = this.f3426c.get(aVar);
            if (h0Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (h0Var.f3445a.containsKey(serviceConnection)) {
                C1956a aVar2 = h0Var.f3451g.f3429f;
                h0Var.f3445a.remove(serviceConnection);
                if (h0Var.f3445a.isEmpty()) {
                    this.f3428e.sendMessageDelayed(this.f3428e.obtainMessage(0, aVar), this.f3430g);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f3426c) {
                C1922k.C1923a aVar = (C1922k.C1923a) message.obj;
                C1916h0 h0Var = this.f3426c.get(aVar);
                if (h0Var != null && h0Var.f3445a.isEmpty()) {
                    if (h0Var.f3447c) {
                        h0Var.f3451g.f3428e.removeMessages(1, h0Var.f3449e);
                        C1912f0 f0Var = h0Var.f3451g;
                        C1956a aVar2 = f0Var.f3429f;
                        Context context = f0Var.f3427d;
                        Objects.requireNonNull(aVar2);
                        context.unbindService(h0Var);
                        h0Var.f3447c = false;
                        h0Var.f3446b = 2;
                    }
                    this.f3426c.remove(aVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f3426c) {
                C1922k.C1923a aVar3 = (C1922k.C1923a) message.obj;
                C1916h0 h0Var2 = this.f3426c.get(aVar3);
                if (h0Var2 != null && h0Var2.f3446b == 3) {
                    String valueOf = String.valueOf(aVar3);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = h0Var2.f3450f;
                    if (componentName == null) {
                        Objects.requireNonNull(aVar3);
                        componentName = null;
                    }
                    if (componentName == null) {
                        componentName = new ComponentName(aVar3.f3469b, EnvironmentCompat.MEDIA_UNKNOWN);
                    }
                    h0Var2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
