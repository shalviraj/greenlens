package p005b.p096l.p097a.p113c.p131e.p140i;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.i.y2 */
public final class C3026y2 {
    @GuardedBy("ConfigurationContentLoader.class")

    /* renamed from: g */
    public static final Map<Uri, C3026y2> f5147g = new ArrayMap();

    /* renamed from: h */
    public static final String[] f5148h = {"key", "value"};

    /* renamed from: a */
    public final ContentResolver f5149a;

    /* renamed from: b */
    public final Uri f5150b;

    /* renamed from: c */
    public final ContentObserver f5151c;

    /* renamed from: d */
    public final Object f5152d = new Object();

    /* renamed from: e */
    public volatile Map<String, String> f5153e;
    @GuardedBy("this")

    /* renamed from: f */
    public final List<C3039z2> f5154f = new ArrayList();

    public C3026y2(ContentResolver contentResolver, Uri uri) {
        C3013x2 x2Var = new C3013x2(this);
        this.f5151c = x2Var;
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.f5149a = contentResolver;
        this.f5150b = uri;
        contentResolver.registerContentObserver(uri, false, x2Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0016 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p005b.p096l.p097a.p113c.p131e.p140i.C3026y2 m5707a(android.content.ContentResolver r4, android.net.Uri r5) {
        /*
            java.lang.Class<b.l.a.c.e.i.y2> r0 = p005b.p096l.p097a.p113c.p131e.p140i.C3026y2.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, b.l.a.c.e.i.y2> r1 = f5147g     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0018 }
            b.l.a.c.e.i.y2 r2 = (p005b.p096l.p097a.p113c.p131e.p140i.C3026y2) r2     // Catch:{ all -> 0x0018 }
            if (r2 != 0) goto L_0x0016
            b.l.a.c.e.i.y2 r3 = new b.l.a.c.e.i.y2     // Catch:{ SecurityException -> 0x0016 }
            r3.<init>(r4, r5)     // Catch:{ SecurityException -> 0x0016 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0015 }
        L_0x0015:
            r2 = r3
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r2
        L_0x0018:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C3026y2.m5707a(android.content.ContentResolver, android.net.Uri):b.l.a.c.e.i.y2");
    }

    /* renamed from: c */
    public static synchronized void m5708c() {
        synchronized (C3026y2.class) {
            for (C3026y2 next : f5147g.values()) {
                next.f5149a.unregisterContentObserver(next.f5151c);
            }
            f5147g.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final Map<String, String> mo13989b() {
        Map<String, String> map;
        Map<String, String> map2 = this.f5153e;
        if (map2 == null) {
            synchronized (this.f5152d) {
                map2 = this.f5153e;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) C1960d.m2787d1(new C3000w2(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        try {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    this.f5153e = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }
}
