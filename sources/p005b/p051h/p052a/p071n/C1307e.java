package p005b.p051h.p052a.p071n;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.C0943i;
import p005b.p051h.p052a.p071n.C1304c;
import p005b.p051h.p052a.p074q.C1340b;
import p005b.p051h.p052a.p078s.C1380j;

/* renamed from: b.h.a.n.e */
public final class C1307e implements C1304c {

    /* renamed from: g */
    public final Context f1648g;

    /* renamed from: h */
    public final C1304c.C1305a f1649h;

    /* renamed from: i */
    public boolean f1650i;

    /* renamed from: j */
    public boolean f1651j;

    /* renamed from: k */
    public final BroadcastReceiver f1652k = new C1308a();

    /* renamed from: b.h.a.n.e$a */
    public class C1308a extends BroadcastReceiver {
        public C1308a() {
        }

        public void onReceive(@NonNull Context context, Intent intent) {
            C1307e eVar = C1307e.this;
            boolean z = eVar.f1650i;
            eVar.f1650i = eVar.mo11146k(context);
            if (z != C1307e.this.f1650i) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    StringBuilder u = C0843a.m460u("connectivity changed, isConnected: ");
                    u.append(C1307e.this.f1650i);
                    Log.d("ConnectivityMonitor", u.toString());
                }
                C1307e eVar2 = C1307e.this;
                C1304c.C1305a aVar = eVar2.f1649h;
                boolean z2 = eVar2.f1650i;
                C0943i.C0945b bVar = (C0943i.C0945b) aVar;
                Objects.requireNonNull(bVar);
                if (z2) {
                    synchronized (C0943i.this) {
                        C1320n nVar = bVar.f912a;
                        Iterator it = ((ArrayList) C1380j.m1472e(nVar.f1667a)).iterator();
                        while (it.hasNext()) {
                            C1340b bVar2 = (C1340b) it.next();
                            if (!bVar2.mo11183c() && !bVar2.mo11182b()) {
                                bVar2.clear();
                                if (!nVar.f1669c) {
                                    bVar2.mo11181a();
                                } else {
                                    nVar.f1668b.add(bVar2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public C1307e(@NonNull Context context, @NonNull C1304c.C1305a aVar) {
        this.f1648g = context.getApplicationContext();
        this.f1649h = aVar;
    }

    /* renamed from: d */
    public void mo10773d() {
        if (this.f1651j) {
            this.f1648g.unregisterReceiver(this.f1652k);
            this.f1651j = false;
        }
    }

    /* renamed from: j */
    public void mo10774j() {
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: k */
    public boolean mo11146k(@NonNull Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Objects.requireNonNull(connectivityManager, "Argument must not be null");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    public void onStart() {
        if (!this.f1651j) {
            this.f1650i = mo11146k(this.f1648g);
            try {
                this.f1648g.registerReceiver(this.f1652k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f1651j = true;
            } catch (SecurityException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e);
                }
            }
        }
    }
}
