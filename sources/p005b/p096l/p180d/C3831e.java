package p005b.p096l.p180d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import p005b.p096l.p180d.p181a0.C3821g;

/* renamed from: b.l.d.e */
public final /* synthetic */ class C3831e implements C3821g {

    /* renamed from: a */
    public static final C3831e f7054a = new C3831e();

    /* renamed from: a */
    public String mo15342a(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }
}
