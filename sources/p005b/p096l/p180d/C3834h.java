package p005b.p096l.p180d;

import android.content.Context;
import com.google.firebase.FirebaseCommonRegistrar;
import p005b.p096l.p180d.p181a0.C3821g;

/* renamed from: b.l.d.h */
public final /* synthetic */ class C3834h implements C3821g {

    /* renamed from: a */
    public static final C3834h f7057a = new C3834h();

    /* renamed from: a */
    public String mo15342a(Object obj) {
        Context context = (Context) obj;
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.m10514a(installerPackageName) : "";
    }
}
