package p005b.p273o;

import android.content.ComponentName;
import android.content.Context;
import android.util.Base64;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.C3838l;

/* renamed from: b.o.a4 */
public class C4784a4 extends C5054z3 {

    /* renamed from: d */
    public C3825d f9160d;

    /* renamed from: d */
    public static void m8780d(Context context) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, FirebaseInstanceIdService.class), C4835f2.m8856f(context, "gcm_defaultSenderId", (String) null) == null ? 2 : 1, 1);
        } catch (IllegalArgumentException | NoClassDefFoundError unused) {
        }
    }

    /* renamed from: b */
    public String mo16521b() {
        return "FCM";
    }

    /* renamed from: c */
    public String mo16522c(String str) {
        if (this.f9160d == null) {
            String str2 = C4857i2.f9346P.f9272i.f9254b;
            if (str2 == null) {
                str2 = "1:754795614042:android:c682b8144a8dd52bc1ad63";
            }
            String str3 = str2;
            C0823f.m374i(str3, "ApplicationId must be set.");
            String str4 = C4857i2.f9346P.f9272i.f9255c;
            if (str4 == null) {
                str4 = new String(Base64.decode("QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV", 0));
            }
            String str5 = str4;
            C0823f.m374i(str5, "ApiKey must be set.");
            String str6 = C4857i2.f9346P.f9272i.f9253a;
            if (str6 == null) {
                str6 = "onesignal-shared-public";
            }
            this.f9160d = C3825d.m7210g(C4857i2.f9358c, new C3838l(str3, str5, (String) null, (String) null, str, (String) null, str6), "ONESIGNAL_SDK_FCM_APP_NAME");
        }
        return FirebaseInstanceId.getInstance(this.f9160d).mo22168b(str, "FCM");
    }
}
