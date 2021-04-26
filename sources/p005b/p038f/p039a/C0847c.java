package p005b.p038f.p039a;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: b.f.a.c */
public final class C0847c implements DialogInterface.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ boolean f705g;

    /* renamed from: h */
    public final /* synthetic */ Activity f706h;

    public C0847c(boolean z, Activity activity) {
        this.f705g = z;
        this.f706h = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (this.f705g) {
            this.f706h.finish();
        }
    }
}
