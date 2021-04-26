package p005b.p096l.p097a.p151d.p152a.p154b;

import android.content.Context;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;

/* renamed from: b.l.a.d.a.b.o1 */
public final class C3528o1 {

    /* renamed from: c */
    public static final C3584f f6503c = new C3584f("PackageStateCache");

    /* renamed from: a */
    public final Context f6504a;

    /* renamed from: b */
    public int f6505b = -1;

    public C3528o1(Context context) {
        this.f6504a = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo14797a() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f6505b     // Catch:{ all -> 0x002a }
            r1 = -1
            if (r0 != r1) goto L_0x0026
            r0 = 0
            android.content.Context r1 = r4.f6504a     // Catch:{ NameNotFoundException -> 0x001c }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.Context r2 = r4.f6504a     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x001c }
            int r1 = r1.versionCode     // Catch:{ NameNotFoundException -> 0x001c }
            r4.f6505b = r1     // Catch:{ NameNotFoundException -> 0x001c }
            goto L_0x0026
        L_0x001c:
            b.l.a.d.a.e.f r1 = f6503c     // Catch:{ all -> 0x002a }
            java.lang.String r2 = "The current version of the app could not be retrieved"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x002a }
            r3 = 6
            r1.mo14884b(r3, r2, r0)     // Catch:{ all -> 0x002a }
        L_0x0026:
            int r0 = r4.f6505b     // Catch:{ all -> 0x002a }
            monitor-exit(r4)
            return r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p151d.p152a.p154b.C3528o1.mo14797a():int");
    }
}
