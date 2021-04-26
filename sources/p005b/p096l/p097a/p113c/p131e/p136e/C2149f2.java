package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.exifinterface.media.ExifInterface;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;

/* renamed from: b.l.a.c.e.e.f2 */
public final class C2149f2 {

    /* renamed from: a */
    public final C2280k9 f3849a;

    public C2149f2(C2280k9 k9Var) {
        this.f3849a = k9Var;
    }

    /* renamed from: a */
    public static C2149f2 m3349a(C2124e2 e2Var) {
        C2352n9 n9Var = e2Var.f3816a;
        C2195gn gnVar = (C2195gn) n9Var.mo12376h(5, (Object) null, (Object) null);
        gnVar.mo12693d(n9Var);
        return new C2149f2((C2280k9) gnVar);
    }

    /* renamed from: g */
    public static int m3350g() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b = 0;
        while (b == 0) {
            secureRandom.nextBytes(bArr);
            b = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & ExifInterface.MARKER) << 16) | ((bArr[2] & ExifInterface.MARKER) << 8) | (bArr[3] & ExifInterface.MARKER);
        }
        return b;
    }

    /* renamed from: b */
    public final synchronized C2124e2 mo12633b() {
        return C2124e2.m3282a((C2352n9) this.f3849a.mo12691c());
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    @java.lang.Deprecated
    /* renamed from: c */
    public final synchronized int mo12634c(p005b.p096l.p097a.p113c.p131e.p136e.C2181g9 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x002b }
            b.l.a.c.e.e.c9 r0 = p005b.p096l.p097a.p113c.p131e.p136e.C2537v2.m4281c(r3)     // Catch:{ all -> 0x0028 }
            b.l.a.c.e.e.da r3 = r3.mo12676u()     // Catch:{ all -> 0x0028 }
            b.l.a.c.e.e.m9 r3 = r2.mo12636e(r0, r3)     // Catch:{ all -> 0x0028 }
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            b.l.a.c.e.e.k9 r0 = r2.f3849a     // Catch:{ all -> 0x002b }
            boolean r1 = r0.f3909i     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x001b
            r0.mo12689a()     // Catch:{ all -> 0x002b }
            r1 = 0
            r0.f3909i = r1     // Catch:{ all -> 0x002b }
        L_0x001b:
            MessageType r0 = r0.f3908h     // Catch:{ all -> 0x002b }
            b.l.a.c.e.e.n9 r0 = (p005b.p096l.p097a.p113c.p131e.p136e.C2352n9) r0     // Catch:{ all -> 0x002b }
            p005b.p096l.p097a.p113c.p131e.p136e.C2352n9.m3808A(r0, r3)     // Catch:{ all -> 0x002b }
            int r3 = r3.mo12814v()     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return r3
        L_0x0028:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            throw r3     // Catch:{ all -> 0x002b }
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2149f2.mo12634c(b.l.a.c.e.e.g9):int");
    }

    /* renamed from: d */
    public final synchronized C2149f2 mo12635d(int i) {
        int i2 = 0;
        while (i2 < ((C2352n9) this.f3849a.f3908h).mo12827u()) {
            C2328m9 v = ((C2352n9) this.f3849a.f3908h).mo12828v(i2);
            if (v.mo12814v() != i) {
                i2++;
            } else if (v.mo12813u().equals(C2106d9.ENABLED)) {
                C2280k9 k9Var = this.f3849a;
                if (k9Var.f3909i) {
                    k9Var.mo12689a();
                    k9Var.f3909i = false;
                }
                ((C2352n9) k9Var.f3908h).zzb = i;
            } else {
                StringBuilder sb = new StringBuilder(63);
                sb.append("cannot set key as primary because it's not enabled: ");
                sb.append(i);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("key not found: ");
        sb2.append(i);
        throw new GeneralSecurityException(sb2.toString());
        return this;
    }

    /* renamed from: e */
    public final synchronized C2328m9 mo12636e(C2081c9 c9Var, C2107da daVar) {
        C2304l9 x;
        int f = mo12637f();
        if (daVar != C2107da.UNKNOWN_PREFIX) {
            x = C2328m9.m3758x();
            if (x.f3909i) {
                x.mo12689a();
                x.f3909i = false;
            }
            C2328m9.m3760z((C2328m9) x.f3908h, c9Var);
            if (x.f3909i) {
                x.mo12689a();
                x.f3909i = false;
            }
            ((C2328m9) x.f3908h).zzf = f;
            C2106d9 d9Var = C2106d9.ENABLED;
            if (x.f3909i) {
                x.mo12689a();
                x.f3909i = false;
            }
            ((C2328m9) x.f3908h).zze = d9Var.mo12518a();
            if (x.f3909i) {
                x.mo12689a();
                x.f3909i = false;
            }
            ((C2328m9) x.f3908h).zzg = daVar.mo12520a();
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (C2328m9) x.mo12691c();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:210)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: f */
    public final synchronized int mo12637f() {
        /*
            r3 = this;
            monitor-enter(r3)
        L_0x0001:
            int r0 = m3350g()     // Catch:{ all -> 0x0036 }
            monitor-enter(r3)     // Catch:{ all -> 0x0036 }
            b.l.a.c.e.e.k9 r1 = r3.f3849a     // Catch:{ all -> 0x0033 }
            MessageType r1 = r1.f3908h     // Catch:{ all -> 0x0033 }
            b.l.a.c.e.e.n9 r1 = (p005b.p096l.p097a.p113c.p131e.p136e.C2352n9) r1     // Catch:{ all -> 0x0033 }
            java.util.List r1 = r1.mo12826t()     // Catch:{ all -> 0x0033 }
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch:{ all -> 0x0033 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0033 }
        L_0x0018:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0033 }
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0033 }
            b.l.a.c.e.e.m9 r2 = (p005b.p096l.p097a.p113c.p131e.p136e.C2328m9) r2     // Catch:{ all -> 0x0033 }
            int r2 = r2.mo12814v()     // Catch:{ all -> 0x0033 }
            if (r2 != r0) goto L_0x0018
            r1 = 1
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0031
            goto L_0x0001
        L_0x0031:
            monitor-exit(r3)
            return r0
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2149f2.mo12637f():int");
    }
}
