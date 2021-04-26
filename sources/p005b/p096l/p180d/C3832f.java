package p005b.p096l.p180d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import p005b.p096l.p180d.p181a0.C3821g;

/* renamed from: b.l.d.f */
public final /* synthetic */ class C3832f implements C3821g {

    /* renamed from: a */
    public static final C3832f f7055a = new C3832f();

    /* renamed from: a */
    public String mo15342a(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }
}
