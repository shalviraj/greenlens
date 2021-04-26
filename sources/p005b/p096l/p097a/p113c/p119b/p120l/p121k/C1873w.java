package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.app.NotificationManager;
import android.content.Context;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.C1763f;
import p005b.p096l.p097a.p113c.p119b.C1767i;

/* renamed from: b.l.a.c.b.l.k.w */
public final class C1873w implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C1876x f3315g;

    public C1873w(C1876x xVar) {
        this.f3315g = xVar;
    }

    public final void run() {
        C1876x xVar = this.f3315g;
        C1763f fVar = xVar.f3323d;
        Context context = xVar.f3322c;
        Objects.requireNonNull(fVar);
        if (!C1767i.f3118c.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }
}
