package p005b.p096l.p180d.p213v;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.segment.analytics.AnalyticsContext;
import java.io.IOException;
import p005b.p096l.p180d.C3825d;

/* renamed from: b.l.d.v.z */
public final class C4282z implements Runnable {

    /* renamed from: g */
    public final long f7935g;

    /* renamed from: h */
    public final PowerManager.WakeLock f7936h;

    /* renamed from: i */
    public final FirebaseInstanceId f7937i;

    /* renamed from: j */
    public final C4234b0 f7938j;

    public C4282z(FirebaseInstanceId firebaseInstanceId, C4234b0 b0Var, long j) {
        this.f7937i = firebaseInstanceId;
        this.f7938j = b0Var;
        this.f7935g = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo15885a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f7936h = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: a */
    public final Context mo15885a() {
        C3825d dVar = this.f7937i.f11441b;
        dVar.mo15344a();
        return dVar.f7042a;
    }

    /* renamed from: b */
    public final boolean mo15886b() {
        C4232a0 m = this.f7937i.mo22176m();
        if (!this.f7937i.f11443d.mo15815c() && !this.f7937i.mo22173h(m)) {
            return true;
        }
        try {
            FirebaseInstanceId firebaseInstanceId = this.f7937i;
            String b = firebaseInstanceId.mo22168b(C4264q.m7804a(firebaseInstanceId.f11441b), "*");
            if (b == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if (m == null || !b.equals(m.f7829a)) {
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra(AnalyticsContext.Device.DEVICE_TOKEN_KEY, b);
                Context a = mo15885a();
                Intent intent2 = new Intent(a, FirebaseInstanceIdReceiver.class);
                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                intent2.putExtra("wrapped_intent", intent);
                a.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException | SecurityException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("FirebaseInstanceId", valueOf.length() != 0 ? "Token retrieval failed: ".concat(valueOf) : new String("Token retrieval failed: "));
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo15887c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo15885a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @SuppressLint({"Wakelock"})
    public final void run() {
        boolean b;
        try {
            if (C4280y.m7833a().mo15878b(mo15885a())) {
                this.f7936h.acquire();
            }
            boolean z = true;
            this.f7937i.mo22172g(true);
            if (!this.f7937i.f11443d.mo15817e()) {
                this.f7937i.mo22172g(false);
                if (!b) {
                    return;
                }
                return;
            }
            C4280y a = C4280y.m7833a();
            Context a2 = mo15885a();
            if (a.f7933c == null) {
                if (a2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                    z = false;
                }
                a.f7933c = Boolean.valueOf(z);
            }
            if (!a.f7932b.booleanValue()) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
                }
            }
            if (!a.f7933c.booleanValue() || mo15887c()) {
                if (!mo15886b() || !this.f7938j.mo15819b(this.f7937i)) {
                    this.f7937i.mo22171e(this.f7935g);
                } else {
                    this.f7937i.mo22172g(false);
                }
                if (C4280y.m7833a().mo15878b(mo15885a())) {
                    this.f7936h.release();
                    return;
                }
                return;
            }
            C4238d0 d0Var = new C4238d0(this);
            if (FirebaseInstanceId.m10545n()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            d0Var.f7838a.mo15885a().registerReceiver(d0Var, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            if (C4280y.m7833a().mo15878b(mo15885a())) {
                this.f7936h.release();
            }
        } finally {
            if (C4280y.m7833a().mo15878b(mo15885a())) {
                this.f7936h.release();
            }
        }
    }
}
