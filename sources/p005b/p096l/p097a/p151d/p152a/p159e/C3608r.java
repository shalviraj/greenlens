package p005b.p096l.p097a.p151d.p152a.p159e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: b.l.a.d.a.e.r */
public final class C3608r {

    /* renamed from: a */
    public static final C3584f f6674a = new C3584f("PhoneskyVerificationUtils");

    /* renamed from: a */
    public static boolean m6844a(Context context) {
        String str;
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
            if (signatureArr == null || (r1 = signatureArr.length) == 0) {
                f6674a.mo14884b(5, "Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                return false;
            }
            for (Signature byteArray : signatureArr) {
                byte[] byteArray2 = byteArray.toByteArray();
                try {
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    instance.update(byteArray2);
                    str = Base64.encodeToString(instance.digest(), 11);
                } catch (NoSuchAlgorithmException unused) {
                    str = "";
                }
                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                    return true;
                }
                if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    /* renamed from: b */
    public static boolean m6845b(Context context) {
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        return packagesForUid != null && Arrays.asList(packagesForUid).contains("com.android.vending");
    }
}
