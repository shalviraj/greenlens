package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.Intent;

/* renamed from: b.l.a.c.h.b.h8 */
public final /* synthetic */ class C3197h8 implements Runnable {

    /* renamed from: g */
    public final C3241l8 f5588g;

    /* renamed from: h */
    public final int f5589h;

    /* renamed from: i */
    public final C3269o3 f5590i;

    /* renamed from: j */
    public final Intent f5591j;

    public C3197h8(C3241l8 l8Var, int i, C3269o3 o3Var, Intent intent) {
        this.f5588g = l8Var;
        this.f5589h = i;
        this.f5590i = o3Var;
        this.f5591j = intent;
    }

    public final void run() {
        C3241l8 l8Var = this.f5588g;
        int i = this.f5589h;
        C3269o3 o3Var = this.f5590i;
        Intent intent = this.f5591j;
        if (((C3230k8) l8Var.f5715a).mo14382a(i)) {
            o3Var.f5807n.mo14415b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            l8Var.mo14397c().f5807n.mo14414a("Completed wakeful intent.");
            ((C3230k8) l8Var.f5715a).mo14383b(intent);
        }
    }
}
