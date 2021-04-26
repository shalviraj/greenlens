package p005b.p096l.p097a.p113c.p131e.p136e;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.crypto.KeyGenerator;

/* renamed from: b.l.a.c.e.e.a5 */
public final class C2027a5 {

    /* renamed from: a */
    public C2174g2 f3576a = null;

    /* renamed from: b */
    public String f3577b = null;

    /* renamed from: c */
    public C2464s1 f3578c = null;

    /* renamed from: d */
    public C2024a2 f3579d = null;

    /* renamed from: e */
    public C2149f2 f3580e;

    /* renamed from: f */
    public C2152f5 f3581f = null;

    /* renamed from: a */
    public final C2027a5 mo12371a(Context context, String str, String str2) {
        if (context != null) {
            this.f3581f = new C2152f5(context, str2);
            this.f3576a = new C2177g5(context, str2);
            return this;
        }
        throw new IllegalArgumentException("need an Android context");
    }

    @Deprecated
    /* renamed from: b */
    public final C2027a5 mo12372b(C2181g9 g9Var) {
        String s = g9Var.mo12674s();
        byte[] K = g9Var.mo12675t().mo12797K();
        C2107da u = g9Var.mo12676u();
        String str = C2052b5.f3623c;
        int ordinal = u.ordinal();
        int i = 4;
        if (ordinal == 1) {
            i = 1;
        } else if (ordinal == 2) {
            i = 2;
        } else if (ordinal == 3) {
            i = 3;
        } else if (ordinal != 4) {
            throw new IllegalArgumentException("Unknown output prefix type");
        }
        C2156f9 v = C2181g9.m3429v();
        v.mo12639f(s);
        v.mo12640g(C2317lm.m3705I(K, 0, K.length));
        int i2 = i - 1;
        v.mo12641h(i2 != 0 ? i2 != 1 ? i2 != 2 ? C2107da.CRUNCHY : C2107da.RAW : C2107da.LEGACY : C2107da.TINK);
        this.f3579d = new C2024a2((C2181g9) v.mo12691c());
        return this;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* renamed from: c */
    public final synchronized p005b.p096l.p097a.p113c.p131e.p136e.C2052b5 mo12373c() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.f3577b     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x000b
            b.l.a.c.e.e.s1 r0 = r4.mo12374d()     // Catch:{ all -> 0x0072 }
            r4.f3578c = r0     // Catch:{ all -> 0x0072 }
        L_0x000b:
            b.l.a.c.e.e.f2 r0 = r4.mo12375e()     // Catch:{ FileNotFoundException -> 0x0010 }
            goto L_0x005e
        L_0x0010:
            r0 = move-exception
            java.lang.String r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2052b5.f3623c     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = "keyset not found, will generate a new one"
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0072 }
            b.l.a.c.e.e.a2 r0 = r4.f3579d     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x006a
            b.l.a.c.e.e.f2 r0 = new b.l.a.c.e.e.f2     // Catch:{ all -> 0x0072 }
            b.l.a.c.e.e.k9 r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2352n9.m3810x()     // Catch:{ all -> 0x0072 }
            r0.<init>(r1)     // Catch:{ all -> 0x0072 }
            b.l.a.c.e.e.a2 r1 = r4.f3579d     // Catch:{ all -> 0x0072 }
            monitor-enter(r0)     // Catch:{ all -> 0x0072 }
            b.l.a.c.e.e.g9 r1 = r1.f3574a     // Catch:{ all -> 0x0067 }
            r0.mo12634c(r1)     // Catch:{ all -> 0x0067 }
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            b.l.a.c.e.e.e2 r1 = r0.mo12633b()     // Catch:{ all -> 0x0072 }
            b.l.a.c.e.e.n9 r1 = r1.f3816a     // Catch:{ all -> 0x0072 }
            b.l.a.c.e.e.s9 r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2561w2.m4340a(r1)     // Catch:{ all -> 0x0072 }
            b.l.a.c.e.e.r9 r1 = r1.mo12984s()     // Catch:{ all -> 0x0072 }
            int r1 = r1.mo12971s()     // Catch:{ all -> 0x0072 }
            r0.mo12635d(r1)     // Catch:{ all -> 0x0072 }
            b.l.a.c.e.e.s1 r1 = r4.f3578c     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x0053
            b.l.a.c.e.e.e2 r1 = r0.mo12633b()     // Catch:{ all -> 0x0072 }
            b.l.a.c.e.e.g2 r2 = r4.f3576a     // Catch:{ all -> 0x0072 }
            b.l.a.c.e.e.s1 r3 = r4.f3578c     // Catch:{ all -> 0x0072 }
            r1.mo12578b(r2, r3)     // Catch:{ all -> 0x0072 }
            goto L_0x005e
        L_0x0053:
            b.l.a.c.e.e.e2 r1 = r0.mo12633b()     // Catch:{ all -> 0x0072 }
            b.l.a.c.e.e.g2 r2 = r4.f3576a     // Catch:{ all -> 0x0072 }
            b.l.a.c.e.e.n9 r1 = r1.f3816a     // Catch:{ all -> 0x0072 }
            r2.mo12665b(r1)     // Catch:{ all -> 0x0072 }
        L_0x005e:
            r4.f3580e = r0     // Catch:{ all -> 0x0072 }
            b.l.a.c.e.e.b5 r0 = new b.l.a.c.e.e.b5     // Catch:{ all -> 0x0072 }
            r0.<init>(r4)     // Catch:{ all -> 0x0072 }
            monitor-exit(r4)
            return r0
        L_0x0067:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            throw r1     // Catch:{ all -> 0x0072 }
        L_0x006a:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "cannot read or generate keyset"
            r0.<init>(r1)     // Catch:{ all -> 0x0072 }
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2027a5.mo12373c():b.l.a.c.e.e.b5");
    }

    /* renamed from: d */
    public final C2464s1 mo12374d() {
        C2127e5 e5Var = new C2127e5();
        boolean a = e5Var.mo12584a(this.f3577b);
        if (!a) {
            try {
                String str = this.f3577b;
                if (!new C2127e5().mo12584a(str)) {
                    String c = C2426qb.m4031c("android-keystore://", str);
                    KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    instance.init(new KeyGenParameterSpec.Builder(c, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
                    instance.generateKey();
                } else {
                    throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", new Object[]{str}));
                }
            } catch (GeneralSecurityException | ProviderException e) {
                e = e;
                Log.w(C2052b5.f3623c, "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        }
        try {
            return e5Var.mo12586e(this.f3577b);
        } catch (GeneralSecurityException | ProviderException e2) {
            e = e2;
            if (a) {
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.f3577b}), e);
            }
            Log.w(C2052b5.f3623c, "cannot use Android Keystore, it'll be disabled", e);
            return null;
        }
    }

    /* renamed from: e */
    public final C2149f2 mo12375e() {
        C2464s1 s1Var = this.f3578c;
        if (s1Var != null) {
            try {
                return C2149f2.m3349a(C2124e2.m3283f(this.f3581f, s1Var));
            } catch (C2246j | GeneralSecurityException e) {
                Log.w(C2052b5.f3623c, "cannot decrypt keyset: ", e);
            }
        }
        return C2149f2.m3349a(C2124e2.m3282a(C2352n9.m3809w(this.f3581f.mo12638a(), C2605xm.m4408a())));
    }
}
