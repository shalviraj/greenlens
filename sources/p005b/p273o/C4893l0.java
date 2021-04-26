package p005b.p273o;

import androidx.appcompat.widget.ActivityChooserView;
import java.security.SecureRandom;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p273o.C4823e3;

/* renamed from: b.o.l0 */
public class C4893l0 {

    /* renamed from: a */
    public static boolean f9441a;

    /* renamed from: a */
    public static void m8990a(String str, String str2, String str3) {
        C4823e3.C4829e eVar;
        if (!f9441a && (eVar = C4857i2.f9346P) != null && !eVar.f9265b && str != null && str2 != null) {
            String str4 = "?app_id=" + str + "&user_id=" + str2;
            if (str3 != null) {
                str4 = C0843a.m452m(str4, "&ad_id=", str3);
            }
            StringBuilder y = C0843a.m464y(str4, "&cbs_id=");
            y.append(new SecureRandom().nextInt(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
            f9441a = C1960d.m2874z0("https://onesignal.com/android_frame.html" + y.toString(), false);
        }
    }
}
