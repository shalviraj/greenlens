package p005b.p273o;

import android.app.Activity;

/* renamed from: b.o.u4 */
public class C4998u4 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ Activity f9667g;

    /* renamed from: h */
    public final /* synthetic */ String f9668h;

    /* renamed from: i */
    public final /* synthetic */ C4968s4 f9669i;

    public C4998u4(C4968s4 s4Var, Activity activity, String str) {
        this.f9669i = s4Var;
        this.f9667g = activity;
        this.f9668h = str;
    }

    public void run() {
        C4968s4.m9125e(this.f9669i, this.f9667g);
        this.f9669i.f9599a.loadData(this.f9668h, "text/html; charset=utf-8", "base64");
    }
}
