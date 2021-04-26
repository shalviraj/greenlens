package p005b.p096l.p097a.p151d.p152a.p153a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;
import p005b.p096l.p097a.p151d.p152a.p157d.C3572c;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;
import p005b.p096l.p097a.p151d.p152a.p160f.C3624c;

/* renamed from: b.l.a.d.a.a.d */
public final class C3451d extends C3624c<InstallState> {
    public C3451d(Context context) {
        super(new C3584f("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* renamed from: a */
    public final void mo14734a(Context context, Intent intent) {
        Intent intent2 = intent;
        if (!context.getPackageName().equals(intent2.getStringExtra("package.name"))) {
            this.f6683a.mo14884b(3, "ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", new Object[]{intent2.getStringExtra("package.name")});
            return;
        }
        this.f6683a.mo14884b(3, "List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.f6683a.mo14884b(3, "Key: %s; value: %s", new Object[]{str, intent.getExtras().get(str)});
        }
        C3584f fVar = this.f6683a;
        fVar.mo14884b(3, "List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        fVar.mo14884b(3, "Key: %s; value: %s", new Object[]{"install.status", Integer.valueOf(intent2.getIntExtra("install.status", 0))});
        fVar.mo14884b(3, "Key: %s; value: %s", new Object[]{"error.code", Integer.valueOf(intent2.getIntExtra("error.code", 0))});
        C3572c cVar = new C3572c(intent2.getIntExtra("install.status", 0), intent2.getLongExtra("bytes.downloaded", 0), intent2.getLongExtra("total.bytes.to.download", 0), intent2.getIntExtra("error.code", 0), intent2.getStringExtra("package.name"));
        this.f6683a.mo14884b(3, "ListenerRegistryBroadcastReceiver.onReceive: %s", new Object[]{cVar});
        mo14916c(cVar);
    }
}
