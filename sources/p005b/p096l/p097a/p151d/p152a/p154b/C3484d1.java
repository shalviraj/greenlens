package p005b.p096l.p097a.p151d.p152a.p154b;

import android.content.Context;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.List;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p151d.p152a.p159e.C3577b0;

/* renamed from: b.l.a.d.a.b.d1 */
public final class C3484d1 {

    /* renamed from: a */
    public static C3483d0 f6364a;

    /* renamed from: a */
    public static String m6655a(List<File> list) {
        int read;
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        for (File fileInputStream : list) {
            FileInputStream fileInputStream2 = new FileInputStream(fileInputStream);
            do {
                try {
                    read = fileInputStream2.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    C3577b0.f6643a.mo14880a(th, th);
                }
            } while (read != -1);
            fileInputStream2.close();
        }
        return Base64.encodeToString(instance.digest(), 11);
        throw th;
    }

    /* renamed from: b */
    public static long m6656b(byte[] bArr, int i) {
        return ((long) ((m6657c(bArr, i + 2) << 16) | m6657c(bArr, i))) & 4294967295L;
    }

    /* renamed from: c */
    public static int m6657c(byte[] bArr, int i) {
        return ((bArr[i + 1] & ExifInterface.MARKER) << 8) | (bArr[i] & ExifInterface.MARKER);
    }

    /* renamed from: d */
    public static boolean m6658d(int i) {
        return i == 1 || i == 7 || i == 2 || i == 3;
    }

    /* renamed from: e */
    public static boolean m6659e(int i) {
        return i == 5 || i == 6 || i == 4;
    }

    /* renamed from: f */
    public static boolean m6660f(int i) {
        return i == 2 || i == 7 || i == 3;
    }

    /* renamed from: g */
    public static boolean m6661g(int i, int i2) {
        if (i == 5) {
            if (i2 != 5) {
                return true;
            }
            i = 5;
        }
        if (i == 6 && i2 != 6 && i2 != 5) {
            return true;
        }
        if (i == 4 && i2 != 4) {
            return true;
        }
        if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
            return true;
        }
        if (i == 2) {
            return i2 == 1 || i2 == 8;
        }
        return false;
    }

    /* renamed from: h */
    public static synchronized C3483d0 m6662h(Context context) {
        C3483d0 d0Var;
        synchronized (C3484d1.class) {
            if (f6364a == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                C3489e2 e2Var = new C3489e2(context);
                C1960d.m2790e0(e2Var, C3489e2.class);
                f6364a = new C3483d0(e2Var);
            }
            d0Var = f6364a;
        }
        return d0Var;
    }
}
