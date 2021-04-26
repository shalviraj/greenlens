package p005b.p273o;

import android.content.ContentValues;

/* renamed from: b.o.a1 */
public class C4781a1 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C4964s0 f9151g;

    /* renamed from: h */
    public final /* synthetic */ C4990u0 f9152h;

    public C4781a1(C4990u0 u0Var, C4964s0 s0Var) {
        this.f9152h = u0Var;
        this.f9151g = s0Var;
    }

    public void run() {
        Thread.currentThread().setPriority(10);
        C4842g1 g1Var = this.f9152h.f9645c;
        C4964s0 s0Var = this.f9151g;
        synchronized (g1Var) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_id", s0Var.f9577a);
            contentValues.put("display_quantity", Integer.valueOf(s0Var.f9581e.f9286b));
            contentValues.put("last_display", Long.valueOf(s0Var.f9581e.f9285a));
            contentValues.put("click_ids", s0Var.f9580d.toString());
            contentValues.put("displayed_in_session", Boolean.valueOf(s0Var.f9583g));
            if (g1Var.f9300a.mo16514l0("in_app_message", contentValues, "message_id = ?", new String[]{s0Var.f9577a}) == 0) {
                g1Var.f9300a.mo16508H("in_app_message", (String) null, contentValues);
            }
        }
    }
}
