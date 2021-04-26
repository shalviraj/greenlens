package p005b.p096l.p180d.p182n.p183a;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.WorkerThread;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p005b.p096l.p097a.p113c.p145h.p146a.C3104a;
import p005b.p096l.p180d.p182n.p183a.C3840a;
import p005b.p096l.p180d.p182n.p183a.p184c.C3846b;
import p005b.p096l.p180d.p182n.p183a.p184c.C3848d;
import p005b.p096l.p180d.p182n.p183a.p184c.C3850f;

/* renamed from: b.l.d.n.a.b */
public class C3843b implements C3840a {

    /* renamed from: c */
    public static volatile C3840a f7065c;

    /* renamed from: a */
    public final C3104a f7066a;

    /* renamed from: b */
    public final Map<String, Object> f7067b = new ConcurrentHashMap();

    /* renamed from: b.l.d.n.a.b$a */
    public class C3844a implements C3840a.C3841a {
        public C3844a(C3843b bVar, String str) {
        }
    }

    public C3843b(C3104a aVar) {
        Objects.requireNonNull(aVar, "null reference");
        this.f7066a = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r9.equals("fiam") == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        if (r9.equals("frc") == false) goto L_0x0064;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15358a(@androidx.annotation.RecentlyNonNull java.lang.String r9, @androidx.annotation.RecentlyNonNull java.lang.String r10, @androidx.annotation.RecentlyNonNull java.lang.Object r11) {
        /*
            r8 = this;
            boolean r0 = p005b.p096l.p180d.p182n.p183a.p184c.C3846b.m7231a(r9)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = "_ce1"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "fcm"
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0055
            java.lang.String r0 = "_ce2"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x001c
            goto L_0x0055
        L_0x001c:
            java.lang.String r0 = "_ln"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r9.equals(r1)
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "fiam"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0033:
            java.util.List<java.lang.String> r0 = p005b.p096l.p180d.p182n.p183a.p184c.C3846b.f7073e
            boolean r0 = r0.contains(r10)
            if (r0 == 0) goto L_0x003c
            goto L_0x0064
        L_0x003c:
            java.util.List<java.lang.String> r0 = p005b.p096l.p180d.p182n.p183a.p184c.C3846b.f7074f
            java.util.Iterator r0 = r0.iterator()
        L_0x0042:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0065
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r10.matches(r1)
            if (r1 == 0) goto L_0x0042
            goto L_0x0064
        L_0x0055:
            boolean r0 = r9.equals(r1)
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "frc"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r2 = r3
        L_0x0065:
            if (r2 != 0) goto L_0x0068
            return
        L_0x0068:
            b.l.a.c.h.a.a r0 = r8.f7066a
            b.l.a.c.e.i.g0 r0 = r0.f5240a
            java.util.Objects.requireNonNull(r0)
            b.l.a.c.e.i.v r7 = new b.l.a.c.e.i.v
            r6 = 1
            r1 = r7
            r2 = r0
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.ExecutorService r9 = r0.f4740c
            r9.execute(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p182n.p183a.C3843b.mo15358a(java.lang.String, java.lang.String, java.lang.Object):void");
    }

    @RecentlyNonNull
    @WorkerThread
    /* renamed from: b */
    public C3840a.C3841a mo15359b(@RecentlyNonNull String str, @RecentlyNonNull C3840a.C3842b bVar) {
        Objects.requireNonNull(bVar, "null reference");
        if (!C3846b.m7231a(str)) {
            return null;
        }
        if (!str.isEmpty() && this.f7067b.containsKey(str) && this.f7067b.get(str) != null) {
            return null;
        }
        C3104a aVar = this.f7066a;
        Object dVar = "fiam".equals(str) ? new C3848d(aVar, bVar) : ("crash".equals(str) || "clx".equals(str)) ? new C3850f(aVar, bVar) : null;
        if (dVar == null) {
            return null;
        }
        this.f7067b.put(str, dVar);
        return new C3844a(this, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a3  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15360c(@androidx.annotation.RecentlyNonNull java.lang.String r6, @androidx.annotation.RecentlyNonNull java.lang.String r7, @androidx.annotation.RecentlyNonNull android.os.Bundle r8) {
        /*
            r5 = this;
            if (r8 != 0) goto L_0x0007
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
        L_0x0007:
            boolean r0 = p005b.p096l.p180d.p182n.p183a.p184c.C3846b.m7231a(r6)
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            java.util.List<java.lang.String> r0 = p005b.p096l.p180d.p182n.p183a.p184c.C3846b.f7070b
            boolean r0 = r0.contains(r7)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0019
            goto L_0x0031
        L_0x0019:
            java.util.List<java.lang.String> r0 = p005b.p096l.p180d.p182n.p183a.p184c.C3846b.f7072d
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0033
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r8.containsKey(r3)
            if (r3 == 0) goto L_0x001f
        L_0x0031:
            r0 = r2
            goto L_0x0034
        L_0x0033:
            r0 = r1
        L_0x0034:
            if (r0 != 0) goto L_0x0037
            return
        L_0x0037:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0041
            goto L_0x00aa
        L_0x0041:
            boolean r0 = p005b.p096l.p180d.p182n.p183a.p184c.C3846b.m7231a(r6)
            if (r0 != 0) goto L_0x0048
            goto L_0x009b
        L_0x0048:
            java.util.List<java.lang.String> r0 = p005b.p096l.p180d.p182n.p183a.p184c.C3846b.f7072d
            java.util.Iterator r0 = r0.iterator()
        L_0x004e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0061
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r8.containsKey(r3)
            if (r3 == 0) goto L_0x004e
            goto L_0x009b
        L_0x0061:
            int r0 = r6.hashCode()
            r3 = 101200(0x18b50, float:1.41811E-40)
            r4 = 2
            if (r0 == r3) goto L_0x008a
            r3 = 101230(0x18b6e, float:1.41853E-40)
            if (r0 == r3) goto L_0x0080
            r3 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r0 == r3) goto L_0x0076
            goto L_0x0094
        L_0x0076:
            java.lang.String r0 = "fiam"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0094
            r0 = r4
            goto L_0x0095
        L_0x0080:
            java.lang.String r0 = "fdl"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0094
            r0 = r1
            goto L_0x0095
        L_0x008a:
            java.lang.String r0 = "fcm"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0094
            r0 = r2
            goto L_0x0095
        L_0x0094:
            r0 = -1
        L_0x0095:
            if (r0 == 0) goto L_0x00a3
            if (r0 == r1) goto L_0x00a0
            if (r0 == r4) goto L_0x009d
        L_0x009b:
            r1 = r2
            goto L_0x00aa
        L_0x009d:
            java.lang.String r0 = "fiam_integration"
            goto L_0x00a5
        L_0x00a0:
            java.lang.String r0 = "fdl_integration"
            goto L_0x00a5
        L_0x00a3:
            java.lang.String r0 = "fcm_integration"
        L_0x00a5:
            java.lang.String r2 = "_cis"
            r8.putString(r2, r0)
        L_0x00aa:
            if (r1 != 0) goto L_0x00ad
            return
        L_0x00ad:
            java.lang.String r0 = "clx"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00c4
            java.lang.String r0 = "_ae"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00c4
            r0 = 1
            java.lang.String r2 = "_r"
            r8.putLong(r2, r0)
        L_0x00c4:
            b.l.a.c.h.a.a r0 = r5.f7066a
            b.l.a.c.e.i.g0 r0 = r0.f5240a
            r0.mo13338d(r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p182n.p183a.C3843b.mo15360c(java.lang.String, java.lang.String, android.os.Bundle):void");
    }
}
