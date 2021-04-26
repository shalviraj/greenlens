package p005b.p096l.p180d;

import android.content.Context;
import android.os.Build;
import p005b.p096l.p180d.p181a0.C3821g;

/* renamed from: b.l.d.g */
public final /* synthetic */ class C3833g implements C3821g {

    /* renamed from: a */
    public static final C3833g f7056a = new C3833g();

    /* renamed from: a */
    public String mo15342a(Object obj) {
        Context context = (Context) obj;
        int i = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        return (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }
}
