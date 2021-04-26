package p005b.p006a.p007a.p018i;

import android.widget.Toast;
import com.appfoundry.previewer.activities.BravoActivity;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.i.d */
public final class C0743d implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ BravoActivity f455g;

    /* renamed from: h */
    public final /* synthetic */ String f456h;

    /* renamed from: i */
    public final /* synthetic */ String f457i;

    /* renamed from: j */
    public final /* synthetic */ int f458j;

    public C0743d(BravoActivity bravoActivity, String str, String str2, int i) {
        this.f455g = bravoActivity;
        this.f456h = str;
        this.f457i = str2;
        this.f458j = i;
    }

    public final void run() {
        String str;
        BravoActivity bravoActivity = this.f455g;
        String str2 = this.f456h;
        if (str2 == null || !(!C6888i.m12434a(str2, ""))) {
            str = this.f457i;
        } else {
            str = this.f457i + ": " + this.f456h;
        }
        Toast.makeText(bravoActivity, str, this.f458j).show();
    }
}
