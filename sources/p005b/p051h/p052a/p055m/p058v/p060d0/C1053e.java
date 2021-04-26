package p005b.p051h.p052a.p055m.p058v.p060d0;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p005b.p051h.p052a.p053k.C0947a;
import p005b.p051h.p052a.p055m.C0974m;

/* renamed from: b.h.a.m.v.d0.e */
public class C1053e implements C1044a {

    /* renamed from: a */
    public final C1063k f1142a;

    /* renamed from: b */
    public final File f1143b;

    /* renamed from: c */
    public final long f1144c;

    /* renamed from: d */
    public final C1048c f1145d = new C1048c();

    /* renamed from: e */
    public C0947a f1146e;

    @Deprecated
    public C1053e(File file, long j) {
        this.f1143b = file;
        this.f1144c = j;
        this.f1142a = new C1063k();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00a4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10926a(p005b.p051h.p052a.p055m.C0974m r6, p005b.p051h.p052a.p055m.p058v.p060d0.C1044a.C1046b r7) {
        /*
            r5 = this;
            b.h.a.m.v.d0.k r0 = r5.f1142a
            java.lang.String r0 = r0.mo10933a(r6)
            b.h.a.m.v.d0.c r1 = r5.f1145d
            monitor-enter(r1)
            java.util.Map<java.lang.String, b.h.a.m.v.d0.c$a> r2 = r1.f1135a     // Catch:{ all -> 0x00d5 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x00d5 }
            b.h.a.m.v.d0.c$a r2 = (p005b.p051h.p052a.p055m.p058v.p060d0.C1048c.C1049a) r2     // Catch:{ all -> 0x00d5 }
            if (r2 != 0) goto L_0x0031
            b.h.a.m.v.d0.c$b r2 = r1.f1136b     // Catch:{ all -> 0x00d5 }
            java.util.Queue<b.h.a.m.v.d0.c$a> r3 = r2.f1139a     // Catch:{ all -> 0x00d5 }
            monitor-enter(r3)     // Catch:{ all -> 0x00d5 }
            java.util.Queue<b.h.a.m.v.d0.c$a> r2 = r2.f1139a     // Catch:{ all -> 0x002e }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x002e }
            b.h.a.m.v.d0.c$a r2 = (p005b.p051h.p052a.p055m.p058v.p060d0.C1048c.C1049a) r2     // Catch:{ all -> 0x002e }
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x0028
            b.h.a.m.v.d0.c$a r2 = new b.h.a.m.v.d0.c$a     // Catch:{ all -> 0x00d5 }
            r2.<init>()     // Catch:{ all -> 0x00d5 }
        L_0x0028:
            java.util.Map<java.lang.String, b.h.a.m.v.d0.c$a> r3 = r1.f1135a     // Catch:{ all -> 0x00d5 }
            r3.put(r0, r2)     // Catch:{ all -> 0x00d5 }
            goto L_0x0031
        L_0x002e:
            r6 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            throw r6     // Catch:{ all -> 0x00d5 }
        L_0x0031:
            int r3 = r2.f1138b     // Catch:{ all -> 0x00d5 }
            r4 = 1
            int r3 = r3 + r4
            r2.f1138b = r3     // Catch:{ all -> 0x00d5 }
            monitor-exit(r1)     // Catch:{ all -> 0x00d5 }
            java.util.concurrent.locks.Lock r1 = r2.f1137a
            r1.lock()
            java.lang.String r1 = "DiskLruCacheWrapper"
            r2 = 2
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x0064
            java.lang.String r1 = "DiskLruCacheWrapper"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r2.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = "Put: Obtained: "
            r2.append(r3)     // Catch:{ all -> 0x00ce }
            r2.append(r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = " for for Key: "
            r2.append(r3)     // Catch:{ all -> 0x00ce }
            r2.append(r6)     // Catch:{ all -> 0x00ce }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x00ce }
            android.util.Log.v(r1, r6)     // Catch:{ all -> 0x00ce }
        L_0x0064:
            b.h.a.k.a r6 = r5.mo10929c()     // Catch:{ IOException -> 0x00bc }
            b.h.a.k.a$e r1 = r6.mo10788O(r0)     // Catch:{ IOException -> 0x00bc }
            if (r1 == 0) goto L_0x0074
        L_0x006e:
            b.h.a.m.v.d0.c r6 = r5.f1145d
            r6.mo10928a(r0)
            return
        L_0x0074:
            b.h.a.k.a$c r6 = r6.mo10787H(r0)     // Catch:{ IOException -> 0x00bc }
            if (r6 == 0) goto L_0x00a5
            r1 = 0
            java.io.File r1 = r6.mo10800b(r1)     // Catch:{ all -> 0x009c }
            b.h.a.m.v.f r7 = (p005b.p051h.p052a.p055m.p058v.C1072f) r7     // Catch:{ all -> 0x009c }
            b.h.a.m.d<DataType> r2 = r7.f1175a     // Catch:{ all -> 0x009c }
            DataType r3 = r7.f1176b     // Catch:{ all -> 0x009c }
            b.h.a.m.p r7 = r7.f1177c     // Catch:{ all -> 0x009c }
            boolean r7 = r2.mo10825a(r3, r1, r7)     // Catch:{ all -> 0x009c }
            if (r7 == 0) goto L_0x0094
            b.h.a.k.a r7 = p005b.p051h.p052a.p053k.C0947a.this     // Catch:{ all -> 0x009c }
            p005b.p051h.p052a.p053k.C0947a.m691d(r7, r6, r4)     // Catch:{ all -> 0x009c }
            r6.f932c = r4     // Catch:{ all -> 0x009c }
        L_0x0094:
            boolean r7 = r6.f932c     // Catch:{ IOException -> 0x00bc }
            if (r7 != 0) goto L_0x006e
            r6.mo10799a()     // Catch:{ IOException -> 0x006e }
            goto L_0x006e
        L_0x009c:
            r7 = move-exception
            boolean r1 = r6.f932c     // Catch:{ IOException -> 0x00bc }
            if (r1 != 0) goto L_0x00a4
            r6.mo10799a()     // Catch:{ IOException -> 0x00a4 }
        L_0x00a4:
            throw r7     // Catch:{ IOException -> 0x00bc }
        L_0x00a5:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00bc }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bc }
            r7.<init>()     // Catch:{ IOException -> 0x00bc }
            java.lang.String r1 = "Had two simultaneous puts for: "
            r7.append(r1)     // Catch:{ IOException -> 0x00bc }
            r7.append(r0)     // Catch:{ IOException -> 0x00bc }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00bc }
            r6.<init>(r7)     // Catch:{ IOException -> 0x00bc }
            throw r6     // Catch:{ IOException -> 0x00bc }
        L_0x00bc:
            r6 = move-exception
            java.lang.String r7 = "DiskLruCacheWrapper"
            r1 = 5
            boolean r7 = android.util.Log.isLoggable(r7, r1)     // Catch:{ all -> 0x00ce }
            if (r7 == 0) goto L_0x006e
            java.lang.String r7 = "DiskLruCacheWrapper"
            java.lang.String r1 = "Unable to put to disk cache"
            android.util.Log.w(r7, r1, r6)     // Catch:{ all -> 0x00ce }
            goto L_0x006e
        L_0x00ce:
            r6 = move-exception
            b.h.a.m.v.d0.c r7 = r5.f1145d
            r7.mo10928a(r0)
            throw r6
        L_0x00d5:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00d5 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p055m.p058v.p060d0.C1053e.mo10926a(b.h.a.m.m, b.h.a.m.v.d0.a$b):void");
    }

    /* renamed from: b */
    public File mo10927b(C0974m mVar) {
        String a = this.f1142a.mo10933a(mVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + a + " for for Key: " + mVar);
        }
        try {
            C0947a.C0952e O = mo10929c().mo10788O(a);
            if (O != null) {
                return O.f942a[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* renamed from: c */
    public final synchronized C0947a mo10929c() {
        if (this.f1146e == null) {
            this.f1146e = C0947a.m690Z(this.f1143b, 1, 1, this.f1144c);
        }
        return this.f1146e;
    }
}
