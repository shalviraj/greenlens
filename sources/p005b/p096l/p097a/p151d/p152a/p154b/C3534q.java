package p005b.p096l.p097a.p151d.p152a.p154b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import p005b.p096l.p097a.p151d.p152a.p159e.C3579c0;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;
import p005b.p096l.p097a.p151d.p152a.p160f.C3624c;

/* renamed from: b.l.a.d.a.b.q */
public final class C3534q extends C3624c<AssetPackState> {

    /* renamed from: g */
    public final C3551v0 f6524g;

    /* renamed from: h */
    public final C3499h0 f6525h;

    /* renamed from: i */
    public final C3579c0<C3525n2> f6526i;

    /* renamed from: j */
    public final C3475b0 f6527j;

    /* renamed from: k */
    public final C3511k0 f6528k;

    /* renamed from: l */
    public final C3579c0<Executor> f6529l;

    /* renamed from: m */
    public final C3579c0<Executor> f6530m;

    /* renamed from: n */
    public final Handler f6531n = new Handler(Looper.getMainLooper());

    public C3534q(Context context, C3551v0 v0Var, C3499h0 h0Var, C3579c0<C3525n2> c0Var, C3511k0 k0Var, C3475b0 b0Var, C3579c0<Executor> c0Var2, C3579c0<Executor> c0Var3) {
        super(new C3584f("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f6524g = v0Var;
        this.f6525h = h0Var;
        this.f6526i = c0Var;
        this.f6528k = k0Var;
        this.f6527j = b0Var;
        this.f6529l = c0Var2;
        this.f6530m = c0Var3;
    }

    /* renamed from: a */
    public final void mo14734a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f6683a.mo14884b(6, "Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            AssetPackState e = AssetPackState.m10422e(bundleExtra, stringArrayList.get(0), this.f6528k, C3541s.f6550c);
            this.f6683a.mo14884b(3, "ListenerRegistryBroadcastReceiver.onReceive: %s", new Object[]{e});
            if (((PendingIntent) bundleExtra.getParcelable("confirmation_intent")) != null) {
                Objects.requireNonNull(this.f6527j);
            }
            this.f6530m.mo14881a().execute(new C3526o(this, bundleExtra, e));
            this.f6529l.mo14881a().execute(new C3530p(this, bundleExtra));
            return;
        }
        this.f6683a.mo14884b(6, "Empty bundle received from broadcast.", new Object[0]);
    }
}
