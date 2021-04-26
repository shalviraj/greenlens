package p005b.p096l.p180d.p213v;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;
import p005b.p096l.p097a.p113c.p131e.p137f.C2660g;

/* renamed from: b.l.d.v.y0 */
public final class C4281y0 {
    @Nullable
    /* renamed from: b */
    public static C4279x0 m7835b(SharedPreferences sharedPreferences, String str) {
        long j;
        String string = sharedPreferences.getString(C4278x.m7830d(str, "|P|"), (String) null);
        String string2 = sharedPreferences.getString(C4278x.m7830d(str, "|K|"), (String) null);
        if (string == null || string2 == null) {
            return null;
        }
        KeyPair k = m7840k(string, string2);
        String string3 = sharedPreferences.getString(C4278x.m7830d(str, "cre"), (String) null);
        if (string3 != null) {
            try {
                j = Long.parseLong(string3);
            } catch (NumberFormatException unused) {
            }
            return new C4279x0(k, j);
        }
        j = 0;
        return new C4279x0(k, j);
    }

    /* renamed from: d */
    public static C4279x0 m7836d(FileChannel fileChannel) {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new C4237d("Invalid properties file");
        }
        try {
            return new C4279x0(m7840k(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new C4237d((Exception) e);
        }
    }

    /* renamed from: f */
    public static void m7837f(Throwable th, RandomAccessFile randomAccessFile) {
        if (th != null) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                C2660g.f4547a.mo13157a(th, th2);
            }
        } else {
            randomAccessFile.close();
        }
    }

    /* renamed from: g */
    public static void m7838g(Throwable th, FileChannel fileChannel) {
        if (th != null) {
            try {
                fileChannel.close();
            } catch (Throwable th2) {
                C2660g.f4547a.mo13157a(th, th2);
            }
        } else {
            fileChannel.close();
        }
    }

    /* renamed from: i */
    public static File m7839i(Context context) {
        File noBackupFilesDir = ContextCompat.getNoBackupFilesDir(context);
        if (noBackupFilesDir != null && noBackupFilesDir.isDirectory()) {
            return noBackupFilesDir;
        }
        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    /* renamed from: k */
    public static KeyPair m7840k(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                throw new C4237d((Exception) e);
            }
        } catch (IllegalArgumentException e2) {
            throw new C4237d((Exception) e2);
        }
    }

    /* renamed from: m */
    public static File m7841m(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(m7839i(context), str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b1, code lost:
        if (r9 != null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        m7838g(r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b6, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b9, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        m7837f(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bd, code lost:
        throw r11;
     */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p096l.p180d.p213v.C4279x0 mo15879a(android.content.Context r9, java.lang.String r10, p005b.p096l.p180d.p213v.C4279x0 r11, boolean r12) {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseInstanceId"
            r1 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r1)
            if (r2 == 0) goto L_0x000e
            java.lang.String r2 = "Writing key to properties file"
            android.util.Log.d(r0, r2)
        L_0x000e:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            java.security.KeyPair r3 = r11.f7928a
            java.security.PublicKey r3 = r3.getPublic()
            byte[] r3 = r3.getEncoded()
            r4 = 11
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r4)
            java.lang.String r5 = "pub"
            r2.setProperty(r5, r3)
            java.security.KeyPair r3 = r11.f7928a
            java.security.PrivateKey r3 = r3.getPrivate()
            byte[] r3 = r3.getEncoded()
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r4)
            java.lang.String r4 = "pri"
            r2.setProperty(r4, r3)
            long r3 = r11.f7929b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "cre"
            r2.setProperty(r4, r3)
            java.io.File r9 = m7841m(r9, r10)
            r10 = 0
            r9.createNewFile()     // Catch:{ IOException -> 0x00be }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x00be }
            java.lang.String r4 = "rw"
            r3.<init>(r9, r4)     // Catch:{ IOException -> 0x00be }
            java.nio.channels.FileChannel r9 = r3.getChannel()     // Catch:{ all -> 0x00b7 }
            r9.lock()     // Catch:{ all -> 0x00ae }
            r4 = 0
            if (r12 == 0) goto L_0x009d
            long r6 = r9.size()     // Catch:{ all -> 0x00ae }
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x009d
            r9.position(r4)     // Catch:{ IOException -> 0x0078, d -> 0x0076 }
            b.l.d.v.x0 r11 = m7836d(r9)     // Catch:{ IOException -> 0x0078, d -> 0x0076 }
            m7838g(r10, r9)     // Catch:{ all -> 0x00b7 }
            m7837f(r10, r3)     // Catch:{ IOException -> 0x00be }
            return r11
        L_0x0076:
            r12 = move-exception
            goto L_0x0079
        L_0x0078:
            r12 = move-exception
        L_0x0079:
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ae }
            if (r1 == 0) goto L_0x009d
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x00ae }
            int r1 = r12.length()     // Catch:{ all -> 0x00ae }
            int r1 = r1 + 64
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ae }
            r6.<init>(r1)     // Catch:{ all -> 0x00ae }
            java.lang.String r1 = "Tried reading key pair before writing new one, but failed with: "
            r6.append(r1)     // Catch:{ all -> 0x00ae }
            r6.append(r12)     // Catch:{ all -> 0x00ae }
            java.lang.String r12 = r6.toString()     // Catch:{ all -> 0x00ae }
            android.util.Log.d(r0, r12)     // Catch:{ all -> 0x00ae }
        L_0x009d:
            r9.position(r4)     // Catch:{ all -> 0x00ae }
            java.io.OutputStream r12 = java.nio.channels.Channels.newOutputStream(r9)     // Catch:{ all -> 0x00ae }
            r2.store(r12, r10)     // Catch:{ all -> 0x00ae }
            m7838g(r10, r9)     // Catch:{ all -> 0x00b7 }
            m7837f(r10, r3)     // Catch:{ IOException -> 0x00be }
            return r11
        L_0x00ae:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r12 = move-exception
            if (r9 == 0) goto L_0x00b6
            m7838g(r11, r9)     // Catch:{ all -> 0x00b7 }
        L_0x00b6:
            throw r12     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r11 = move-exception
            m7837f(r9, r3)     // Catch:{ IOException -> 0x00be }
            throw r11     // Catch:{ IOException -> 0x00be }
        L_0x00be:
            r9 = move-exception
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r11 = r9.length()
            int r11 = r11 + 21
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "Failed to write key: "
            r12.append(r11)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            android.util.Log.w(r0, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p213v.C4281y0.mo15879a(android.content.Context, java.lang.String, b.l.d.v.x0, boolean):b.l.d.v.x0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        if (r8 != null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        m7838g(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0032, code lost:
        p005b.p096l.p097a.p113c.p131e.p137f.C2660g.f4547a.mo13157a(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0037, code lost:
        throw r1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p096l.p180d.p213v.C4279x0 mo15880c(java.io.File r8) {
        /*
            r7 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r8)
            java.nio.channels.FileChannel r8 = r0.getChannel()     // Catch:{ all -> 0x002a }
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            r1 = r8
            r1.lock(r2, r4, r6)     // Catch:{ all -> 0x0021 }
            b.l.d.v.x0 r1 = m7836d(r8)     // Catch:{ all -> 0x0021 }
            r2 = 0
            m7838g(r2, r8)     // Catch:{ all -> 0x002a }
            r0.close()
            return r1
        L_0x0021:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r2 = move-exception
            if (r8 == 0) goto L_0x0029
            m7838g(r1, r8)     // Catch:{ all -> 0x002a }
        L_0x0029:
            throw r2     // Catch:{ all -> 0x002a }
        L_0x002a:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x002c }
        L_0x002c:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0031 }
            goto L_0x0037
        L_0x0031:
            r0 = move-exception
            b.l.a.c.e.f.f r2 = p005b.p096l.p097a.p113c.p131e.p137f.C2660g.f4547a
            r2.mo13157a(r8, r0)
        L_0x0037:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p213v.C4281y0.mo15880c(java.io.File):b.l.d.v.x0");
    }

    /* renamed from: e */
    public final void mo15881e(Context context, String str, C4279x0 x0Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (x0Var.equals(m7835b(sharedPreferences, str))) {
                return;
            }
        } catch (C4237d unused) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(C4278x.m7830d(str, "|P|"), Base64.encodeToString(x0Var.f7928a.getPublic().getEncoded(), 11));
        edit.putString(C4278x.m7830d(str, "|K|"), Base64.encodeToString(x0Var.f7928a.getPrivate().getEncoded(), 11));
        edit.putString(C4278x.m7830d(str, "cre"), String.valueOf(x0Var.f7929b));
        edit.commit();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0026 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027  */
    @androidx.annotation.WorkerThread
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p096l.p180d.p213v.C4279x0 mo15882h(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            b.l.d.v.x0 r1 = r4.mo15884l(r5, r6)     // Catch:{ d -> 0x000e }
            if (r1 == 0) goto L_0x000c
            r4.mo15881e(r5, r6, r1)     // Catch:{ d -> 0x000e }
            r0 = r1
            goto L_0x0024
        L_0x000c:
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = move-exception
        L_0x000f:
            java.lang.String r2 = "com.google.android.gms.appid"
            r3 = 0
            android.content.SharedPreferences r2 = r5.getSharedPreferences(r2, r3)     // Catch:{ d -> 0x0021 }
            b.l.d.v.x0 r2 = m7835b(r2, r6)     // Catch:{ d -> 0x0021 }
            if (r2 == 0) goto L_0x0022
            r4.mo15879a(r5, r6, r2, r3)     // Catch:{ d -> 0x0021 }
            r0 = r2
            goto L_0x0024
        L_0x0021:
            r1 = move-exception
        L_0x0022:
            if (r1 != 0) goto L_0x002c
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return r0
        L_0x0027:
            b.l.d.v.x0 r5 = r4.mo15883j(r5, r6)
            return r5
        L_0x002c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p213v.C4281y0.mo15882h(android.content.Context, java.lang.String):b.l.d.v.x0");
    }

    @WorkerThread
    /* renamed from: j */
    public final C4279x0 mo15883j(Context context, String str) {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(2048);
            C4279x0 x0Var = new C4279x0(instance.generateKeyPair(), System.currentTimeMillis());
            C4279x0 a = mo15879a(context, str, x0Var, true);
            if (a == null || a.equals(x0Var)) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Generated new key");
                }
                mo15881e(context, str, x0Var);
                return x0Var;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
            }
            return a;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    @Nullable
    /* renamed from: l */
    public final C4279x0 mo15884l(Context context, String str) {
        File m = m7841m(context, str);
        if (!m.exists()) {
            return null;
        }
        try {
            return mo15880c(m);
        } catch (C4237d | IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 40);
                sb.append("Failed to read key from file, retrying: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            try {
                return mo15880c(m);
            } catch (IOException e2) {
                String valueOf2 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                Log.w("FirebaseInstanceId", sb2.toString());
                throw new C4237d((Exception) e2);
            }
        }
    }
}
