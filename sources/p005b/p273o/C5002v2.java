package p005b.p273o;

import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.o.v2 */
public final class C5002v2 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C4783a3 f9673g;

    public C5002v2(C4783a3 a3Var) {
        this.f9673g = a3Var;
    }

    public void run() {
        Thread.currentThread().setPriority(10);
        this.f9673g.mo16513d("notification", "created_time < ?", new String[]{String.valueOf((System.currentTimeMillis() / 1000) - 604800)});
        C4783a3 a3Var = this.f9673g;
        StringBuilder u = C0843a.m460u("NOT EXISTS(SELECT NULL FROM notification n WHERE n.notification_id = channel_influence_id AND channel_type = \"");
        u.append("notification".toLowerCase());
        u.append("\")");
        a3Var.mo16513d("cached_unique_outcome", u.toString(), (String[]) null);
    }
}
