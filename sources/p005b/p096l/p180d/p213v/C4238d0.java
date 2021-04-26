package p005b.p096l.p180d.p213v;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: b.l.d.v.d0 */
public final class C4238d0 extends BroadcastReceiver {

    /* renamed from: a */
    public C4282z f7838a;

    public C4238d0(C4282z zVar) {
        this.f7838a = zVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C4282z zVar = this.f7838a;
        if (zVar != null && zVar.mo15887c()) {
            if (FirebaseInstanceId.m10545n()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.m10542f(this.f7838a, 0);
            this.f7838a.mo15885a().unregisterReceiver(this);
            this.f7838a = null;
        }
    }
}
