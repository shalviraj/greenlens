package p005b.p096l.p180d.p191q.p192f.p195g;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.exifinterface.media.ExifInterface;
import com.amplitude.api.DeviceInfo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p005b.p096l.p180d.p191q.p192f.C3982b;

/* renamed from: b.l.d.q.f.g.e */
public class C4004e {

    /* renamed from: a */
    public static final char[] f7324a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static long f7325b = -1;

    /* renamed from: b.l.d.q.f.g.e$a */
    public enum C4005a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        

        /* renamed from: q */
        public static final Map<String, C4005a> f7336q = null;

        /* access modifiers changed from: public */
        static {
            C4005a aVar;
            C4005a aVar2;
            C4005a aVar3;
            C4005a aVar4;
            HashMap hashMap = new HashMap(4);
            f7336q = hashMap;
            hashMap.put("armeabi-v7a", aVar3);
            hashMap.put("armeabi", aVar2);
            hashMap.put("arm64-v8a", aVar4);
            hashMap.put("x86", aVar);
        }
    }

    /* renamed from: a */
    public static void m7393a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (C3982b.f7289a.mo15495a(6)) {
                    Log.e("FirebaseCrashlytics", str, e);
                }
            }
        }
    }

    /* renamed from: b */
    public static long m7394b(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m7395c(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L_0x005d
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
        L_0x0015:
            java.lang.String r3 = r1.readLine()     // Catch:{ Exception -> 0x0037 }
            if (r3 == 0) goto L_0x0053
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch:{ Exception -> 0x0037 }
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch:{ Exception -> 0x0037 }
            int r4 = r3.length     // Catch:{ Exception -> 0x0037 }
            r5 = 1
            if (r4 <= r5) goto L_0x0015
            r4 = 0
            r4 = r3[r4]     // Catch:{ Exception -> 0x0037 }
            boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x0037 }
            if (r4 == 0) goto L_0x0015
            r6 = r3[r5]     // Catch:{ Exception -> 0x0037 }
            r2 = r6
            goto L_0x0053
        L_0x0037:
            r7 = move-exception
            goto L_0x003d
        L_0x0039:
            r6 = move-exception
            goto L_0x0059
        L_0x003b:
            r7 = move-exception
            r1 = r2
        L_0x003d:
            b.l.d.q.f.b r3 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a     // Catch:{ all -> 0x0057 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0057 }
            r4.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch:{ all -> 0x0057 }
            r4.append(r6)     // Catch:{ all -> 0x0057 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0057 }
            r3.mo15498d(r6, r7)     // Catch:{ all -> 0x0057 }
        L_0x0053:
            m7393a(r1, r0)
            goto L_0x005d
        L_0x0057:
            r6 = move-exception
            r2 = r1
        L_0x0059:
            m7393a(r2, r0)
            throw r6
        L_0x005d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p191q.p192f.p195g.C4004e.m7395c(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    public static boolean m7396d(Context context, String str, boolean z) {
        Resources resources;
        if (!(context == null || (resources = context.getResources()) == null)) {
            int g = m7399g(context, str, "bool");
            if (g > 0) {
                return resources.getBoolean(g);
            }
            int g2 = m7399g(context, str, "string");
            if (g2 > 0) {
                return Boolean.parseBoolean(context.getString(g2));
            }
        }
        return z;
    }

    /* renamed from: e */
    public static int m7397e(Context context) {
        boolean z = true;
        int i = m7403k(context) ? 1 : 0;
        if (m7404l(context)) {
            i |= 2;
        }
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            z = false;
        }
        return z ? i | 4 : i;
    }

    /* renamed from: f */
    public static String m7398f(Context context) {
        int g = m7399g(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (g == 0) {
            g = m7399g(context, "com.crashlytics.android.build_id", "string");
        }
        if (g != 0) {
            return context.getResources().getString(g);
        }
        return null;
    }

    /* renamed from: g */
    public static int m7399g(Context context, String str, String str2) {
        String str3;
        Resources resources = context.getResources();
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                str3 = context.getResources().getResourcePackageName(i);
                if (DeviceInfo.OS_NAME.equals(str3)) {
                    str3 = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
            }
            return resources.getIdentifier(str, str2, str3);
        }
        str3 = context.getPackageName();
        return resources.getIdentifier(str, str2, str3);
    }

    /* renamed from: h */
    public static SharedPreferences m7400h(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    /* renamed from: i */
    public static synchronized long m7401i() {
        long j;
        synchronized (C4004e.class) {
            if (f7325b == -1) {
                long j2 = 0;
                String c = m7395c(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(c)) {
                    String upperCase = c.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j2 = m7394b(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j2 = m7394b(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j2 = m7394b(upperCase, "GB", BasicMeasure.EXACTLY);
                        } else {
                            C3982b bVar = C3982b.f7289a;
                            bVar.mo15500f("Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                    } catch (NumberFormatException e) {
                        C3982b bVar2 = C3982b.f7289a;
                        bVar2.mo15498d("Unexpected meminfo format while computing RAM: " + upperCase, e);
                    }
                }
                f7325b = j2;
            }
            j = f7325b;
        }
        return j;
    }

    /* renamed from: j */
    public static String m7402j(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & ExifInterface.MARKER;
            int i2 = i * 2;
            char[] cArr2 = f7324a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: k */
    public static boolean m7403k(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            return str.contains("goldfish") || str.contains("ranchu") || string == null;
        }
    }

    /* renamed from: l */
    public static boolean m7404l(Context context) {
        boolean k = m7403k(context);
        String str = Build.TAGS;
        if ((!k && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        return !k && new File("/system/xbin/su").exists();
    }

    /* renamed from: m */
    public static String m7405m(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bytes);
            return m7402j(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            C3982b bVar = C3982b.f7289a;
            bVar.mo15498d("Could not create hashing algorithm: " + "SHA-1" + ", returning empty string.", e);
            return "";
        }
    }
}
