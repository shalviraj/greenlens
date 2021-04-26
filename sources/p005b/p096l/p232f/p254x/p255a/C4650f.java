package p005b.p096l.p232f.p254x.p255a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.amplitude.api.Constants;

/* renamed from: b.l.f.x.a.f */
public final class C4650f {

    /* renamed from: a */
    public final Context f8771a;

    /* renamed from: b */
    public final BroadcastReceiver f8772b;

    /* renamed from: c */
    public boolean f8773c = false;

    /* renamed from: d */
    public Handler f8774d;

    /* renamed from: e */
    public Runnable f8775e;

    /* renamed from: f */
    public boolean f8776f;

    /* renamed from: b.l.f.x.a.f$b */
    public final class C4652b extends BroadcastReceiver {

        /* renamed from: b.l.f.x.a.f$b$a */
        public class C4653a implements Runnable {

            /* renamed from: g */
            public final /* synthetic */ boolean f8778g;

            public C4653a(boolean z) {
                this.f8778g = z;
            }

            public void run() {
                C4650f fVar = C4650f.this;
                fVar.f8776f = this.f8778g;
                if (fVar.f8773c) {
                    fVar.f8774d.removeCallbacksAndMessages((Object) null);
                    if (fVar.f8776f) {
                        fVar.f8774d.postDelayed(fVar.f8775e, Constants.MIN_TIME_BETWEEN_SESSIONS_MILLIS);
                    }
                }
            }
        }

        public C4652b(C4651a aVar) {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                C4650f.this.f8774d.post(new C4653a(intent.getIntExtra("plugged", -1) <= 0));
            }
        }
    }

    public C4650f(Context context, Runnable runnable) {
        this.f8771a = context;
        this.f8775e = runnable;
        this.f8772b = new C4652b((C4651a) null);
        this.f8774d = new Handler();
    }

    /* renamed from: a */
    public void mo16314a() {
        this.f8774d.removeCallbacksAndMessages((Object) null);
        if (this.f8773c) {
            this.f8771a.unregisterReceiver(this.f8772b);
            this.f8773c = false;
        }
    }
}
