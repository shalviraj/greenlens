package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: b.l.a.c.e.e.e5 */
public final class C2127e5 implements C2199h2 {

    /* renamed from: b */
    public static final String f3817b = "e5";

    /* renamed from: a */
    public KeyStore f3818a = new C2102d5().f3707a;

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        java.lang.Thread.sleep(20);
        r0 = java.security.KeyStore.getInstance("AndroidKeyStore");
        r2.f3818a = r0;
        r0.load((java.security.KeyStore.LoadStoreParameter) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        return r2.f3818a.containsAlias(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        throw new java.security.GeneralSecurityException(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        android.util.Log.w(f3817b, "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo12584a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "android-keystore://"
            java.lang.String r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2426qb.m4031c(r0, r3)     // Catch:{ all -> 0x0036 }
            java.security.KeyStore r0 = r2.f3818a     // Catch:{ NullPointerException -> 0x000f }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ NullPointerException -> 0x000f }
            monitor-exit(r2)
            return r3
        L_0x000f:
            java.lang.String r0 = f3817b     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again."
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x0036 }
            r0 = 20
            java.lang.Thread.sleep(r0)     // Catch:{ IOException -> 0x002f, InterruptedException -> 0x0027 }
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ IOException -> 0x002f, InterruptedException -> 0x0027 }
            r2.f3818a = r0     // Catch:{ IOException -> 0x002f, InterruptedException -> 0x0027 }
            r1 = 0
            r0.load(r1)     // Catch:{ IOException -> 0x002f, InterruptedException -> 0x0027 }
        L_0x0027:
            java.security.KeyStore r0 = r2.f3818a     // Catch:{ all -> 0x0036 }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ all -> 0x0036 }
            monitor-exit(r2)
            return r3
        L_0x002f:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0036 }
            r0.<init>(r3)     // Catch:{ all -> 0x0036 }
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2127e5.mo12584a(java.lang.String):boolean");
    }

    /* renamed from: d */
    public final synchronized boolean mo12585d(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    /* renamed from: e */
    public final synchronized C2464s1 mo12586e(String str) {
        C2077c5 c5Var;
        c5Var = new C2077c5(C2426qb.m4031c("android-keystore://", str), this.f3818a);
        byte[] a = C2402pb.m4002a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a, c5Var.mo12386b(c5Var.mo12385a(a, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return c5Var;
    }
}
