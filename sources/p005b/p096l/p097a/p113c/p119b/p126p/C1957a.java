package p005b.p096l.p097a.p113c.p119b.p126p;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p005b.p096l.p097a.p113c.p119b.p128q.C1968b;

/* renamed from: b.l.a.c.b.p.a */
public class C1957a {
    /* renamed from: a */
    public static byte[] m2688a(Context context, String str) {
        MessageDigest b;
        PackageInfo packageInfo = C1968b.m2885a(context).f3529a.getPackageManager().getPackageInfo(str, 64);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b = m2689b("SHA1")) == null) {
            return null;
        }
        return b.digest(packageInfo.signatures[0].toByteArray());
    }

    /* renamed from: b */
    public static MessageDigest m2689b(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
