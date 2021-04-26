package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.SystemClock;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;

/* renamed from: b.l.a.c.h.b.s8 */
public final class C3318s8 {

    /* renamed from: a */
    public long f5960a;

    /* renamed from: b */
    public long f5961b;

    /* renamed from: c */
    public final C3232l f5962c;

    /* renamed from: d */
    public final /* synthetic */ C3340u8 f5963d;

    public C3318s8(C3340u8 u8Var) {
        this.f5963d = u8Var;
        this.f5962c = new C3307r8(this, u8Var.f5638a);
        Objects.requireNonNull((C1959c) u8Var.f5638a.f5855n);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f5960a = elapsedRealtime;
        this.f5961b = elapsedRealtime;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007a  */
    @androidx.annotation.WorkerThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14587a(boolean r7, boolean r8, long r9) {
        /*
            r6 = this;
            b.l.a.c.h.b.u8 r0 = r6.f5963d
            r0.mo14126h()
            b.l.a.c.h.b.u8 r0 = r6.f5963d
            r0.mo14065i()
            p005b.p096l.p097a.p113c.p131e.p140i.C2877m9.m4962b()
            b.l.a.c.h.b.u8 r0 = r6.f5963d
            b.l.a.c.h.b.p4 r0 = r0.f5638a
            b.l.a.c.h.b.f r0 = r0.f5848g
            b.l.a.c.h.b.a3<java.lang.Boolean> r1 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5399o0
            r2 = 0
            boolean r0 = r0.mo14197r(r2, r1)
            if (r0 == 0) goto L_0x003c
            b.l.a.c.h.b.u8 r0 = r6.f5963d
            b.l.a.c.h.b.p4 r0 = r0.f5638a
            boolean r0 = r0.mo14460j()
            if (r0 == 0) goto L_0x0058
            b.l.a.c.h.b.u8 r0 = r6.f5963d
            b.l.a.c.h.b.p4 r0 = r0.f5638a
            b.l.a.c.h.b.c4 r0 = r0.mo14464q()
            b.l.a.c.h.b.y3 r0 = r0.f5435o
            b.l.a.c.h.b.u8 r1 = r6.f5963d
            b.l.a.c.h.b.p4 r1 = r1.f5638a
            b.l.a.c.b.p.b r1 = r1.f5855n
            b.l.a.c.b.p.c r1 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r1
            java.util.Objects.requireNonNull(r1)
            goto L_0x0051
        L_0x003c:
            b.l.a.c.h.b.u8 r0 = r6.f5963d
            b.l.a.c.h.b.p4 r0 = r0.f5638a
            b.l.a.c.h.b.c4 r0 = r0.mo14464q()
            b.l.a.c.h.b.y3 r0 = r0.f5435o
            b.l.a.c.h.b.u8 r1 = r6.f5963d
            b.l.a.c.h.b.p4 r1 = r1.f5638a
            b.l.a.c.b.p.b r1 = r1.f5855n
            b.l.a.c.b.p.c r1 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r1
            java.util.Objects.requireNonNull(r1)
        L_0x0051:
            long r3 = java.lang.System.currentTimeMillis()
            r0.mo14634b(r3)
        L_0x0058:
            long r0 = r6.f5960a
            long r0 = r9 - r0
            if (r7 != 0) goto L_0x007a
            r3 = 1000(0x3e8, double:4.94E-321)
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x0065
            goto L_0x007a
        L_0x0065:
            b.l.a.c.h.b.u8 r7 = r6.f5963d
            b.l.a.c.h.b.p4 r7 = r7.f5638a
            b.l.a.c.h.b.o3 r7 = r7.mo14329d()
            b.l.a.c.h.b.m3 r7 = r7.f5807n
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            java.lang.String r9 = "Screen exposed for less than 1000 ms. Event not sent. time"
            r7.mo14415b(r9, r8)
            r7 = 0
            return r7
        L_0x007a:
            if (r8 != 0) goto L_0x0082
            long r0 = r6.f5961b
            long r0 = r9 - r0
            r6.f5961b = r9
        L_0x0082:
            b.l.a.c.h.b.u8 r7 = r6.f5963d
            b.l.a.c.h.b.p4 r7 = r7.f5638a
            b.l.a.c.h.b.o3 r7 = r7.mo14329d()
            b.l.a.c.h.b.m3 r7 = r7.f5807n
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.lang.String r4 = "Recording user engagement, ms"
            r7.mo14415b(r4, r3)
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r3 = "_et"
            r7.putLong(r3, r0)
            b.l.a.c.h.b.u8 r0 = r6.f5963d
            b.l.a.c.h.b.p4 r0 = r0.f5638a
            b.l.a.c.h.b.f r0 = r0.f5848g
            boolean r0 = r0.mo14202w()
            b.l.a.c.h.b.u8 r1 = r6.f5963d
            b.l.a.c.h.b.p4 r1 = r1.f5638a
            b.l.a.c.h.b.f7 r1 = r1.mo14472y()
            r3 = 1
            r0 = r0 ^ r3
            b.l.a.c.h.b.x6 r0 = r1.mo14213p(r0)
            p005b.p096l.p097a.p113c.p145h.p147b.C3174f7.m5964r(r0, r7, r3)
            b.l.a.c.h.b.u8 r0 = r6.f5963d
            b.l.a.c.h.b.p4 r0 = r0.f5638a
            b.l.a.c.h.b.f r0 = r0.f5848g
            b.l.a.c.h.b.a3<java.lang.Boolean> r1 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5364U
            boolean r0 = r0.mo14197r(r2, r1)
            if (r0 != 0) goto L_0x00d1
            if (r8 == 0) goto L_0x00d1
            r4 = 1
            java.lang.String r0 = "_fr"
            r7.putLong(r0, r4)
        L_0x00d1:
            b.l.a.c.h.b.u8 r0 = r6.f5963d
            b.l.a.c.h.b.p4 r0 = r0.f5638a
            b.l.a.c.h.b.f r0 = r0.f5848g
            boolean r0 = r0.mo14197r(r2, r1)
            if (r0 == 0) goto L_0x00df
            if (r8 != 0) goto L_0x00ee
        L_0x00df:
            b.l.a.c.h.b.u8 r8 = r6.f5963d
            b.l.a.c.h.b.p4 r8 = r8.f5638a
            b.l.a.c.h.b.q6 r8 = r8.mo14466s()
            java.lang.String r0 = "auto"
            java.lang.String r1 = "_e"
            r8.mo14493A(r0, r1, r7)
        L_0x00ee:
            r6.f5960a = r9
            b.l.a.c.h.b.l r7 = r6.f5962c
            r7.mo14387c()
            b.l.a.c.h.b.l r7 = r6.f5962c
            r8 = 3600000(0x36ee80, double:1.7786363E-317)
            r7.mo14386b(r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3318s8.mo14587a(boolean, boolean, long):boolean");
    }
}
