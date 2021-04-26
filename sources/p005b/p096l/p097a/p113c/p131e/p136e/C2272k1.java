package p005b.p096l.p097a.p113c.p131e.p136e;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005b.p035e.p036a.p037a.C0843a;
import sun.misc.Unsafe;

/* renamed from: b.l.a.c.e.e.k1 */
public final class C2272k1 {

    /* renamed from: a */
    public static final Unsafe f3991a;

    /* renamed from: b */
    public static final Class<?> f3992b = C2119dm.m3236a();

    /* renamed from: c */
    public static final boolean f3993c;

    /* renamed from: d */
    public static final boolean f3994d;

    /* renamed from: e */
    public static final C2248j1 f3995e;

    /* renamed from: f */
    public static final boolean f3996f;

    /* renamed from: g */
    public static final boolean f3997g;

    /* renamed from: h */
    public static final long f3998h = ((long) m3638t(byte[].class));

    /* renamed from: i */
    public static final boolean f3999i;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x013b  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = m3633o()
            f3991a = r7
            java.lang.Class r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2119dm.m3236a()
            f3992b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m3634p(r8)
            f3993c = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m3634p(r10)
            f3994d = r10
            r11 = 0
            if (r7 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            if (r9 == 0) goto L_0x0036
            b.l.a.c.e.e.i1 r11 = new b.l.a.c.e.e.i1
            r11.<init>(r7)
            goto L_0x003d
        L_0x0036:
            if (r10 == 0) goto L_0x003d
            b.l.a.c.e.e.h1 r11 = new b.l.a.c.e.e.h1
            r11.<init>(r7)
        L_0x003d:
            f3995e = r11
            java.lang.String r7 = "getLong"
            java.lang.String r9 = "objectFieldOffset"
            r10 = 2
            r12 = 1
            r13 = 0
            if (r11 != 0) goto L_0x004a
        L_0x0048:
            r8 = r13
            goto L_0x0073
        L_0x004a:
            sun.misc.Unsafe r11 = r11.f3954a
            if (r11 != 0) goto L_0x004f
            goto L_0x0048
        L_0x004f:
            java.lang.Class r11 = r11.getClass()     // Catch:{ all -> 0x006e }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x006e }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x006e }
            r11.getMethod(r9, r14)     // Catch:{ all -> 0x006e }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x006e }
            r14[r13] = r6     // Catch:{ all -> 0x006e }
            r14[r12] = r8     // Catch:{ all -> 0x006e }
            r11.getMethod(r7, r14)     // Catch:{ all -> 0x006e }
            java.lang.reflect.Field r8 = m3620b()     // Catch:{ all -> 0x006e }
            if (r8 != 0) goto L_0x006c
            goto L_0x0048
        L_0x006c:
            r8 = r12
            goto L_0x0073
        L_0x006e:
            r8 = move-exception
            m3635q(r8)
            goto L_0x0048
        L_0x0073:
            f3996f = r8
            b.l.a.c.e.e.j1 r8 = f3995e
            if (r8 != 0) goto L_0x007c
        L_0x0079:
            r6 = r13
            goto L_0x00f6
        L_0x007c:
            sun.misc.Unsafe r8 = r8.f3954a
            if (r8 != 0) goto L_0x0081
            goto L_0x0079
        L_0x0081:
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r11 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r11[r13] = r14     // Catch:{ all -> 0x00f1 }
            r8.getMethod(r9, r11)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = "arrayBaseOffset"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = "arrayIndexScale"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r9[r13] = r6     // Catch:{ all -> 0x00f1 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x00f1 }
            r9[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "getInt"
            r8.getMethod(r14, r9)     // Catch:{ all -> 0x00f1 }
            r9 = 3
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r14[r13] = r6     // Catch:{ all -> 0x00f1 }
            r14[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00f1 }
            r14[r10] = r15     // Catch:{ all -> 0x00f1 }
            java.lang.String r15 = "putInt"
            r8.getMethod(r15, r14)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r14[r13] = r6     // Catch:{ all -> 0x00f1 }
            r14[r12] = r11     // Catch:{ all -> 0x00f1 }
            r8.getMethod(r7, r14)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            r7[r10] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "putLong"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "getObject"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            r7[r10] = r6     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = "putObject"
            r8.getMethod(r6, r7)     // Catch:{ all -> 0x00f1 }
            r6 = r12
            goto L_0x00f6
        L_0x00f1:
            r6 = move-exception
            m3635q(r6)
            goto L_0x0079
        L_0x00f6:
            f3997g = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m3638t(r6)
            long r6 = (long) r6
            f3998h = r6
            m3638t(r5)
            m3619a(r5)
            m3638t(r4)
            m3619a(r4)
            m3638t(r3)
            m3619a(r3)
            m3638t(r2)
            m3619a(r2)
            m3638t(r1)
            m3619a(r1)
            m3638t(r0)
            m3619a(r0)
            java.lang.reflect.Field r0 = m3620b()
            if (r0 == 0) goto L_0x0132
            b.l.a.c.e.e.j1 r1 = f3995e
            if (r1 == 0) goto L_0x0132
            r1.mo12724h(r0)
        L_0x0132:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x013b
            goto L_0x013c
        L_0x013b:
            r12 = r13
        L_0x013c:
            f3999i = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.<clinit>():void");
    }

    /* renamed from: a */
    public static int m3619a(Class<?> cls) {
        if (f3997g) {
            return f3995e.mo12726j(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Field m3620b() {
        Field field;
        Field field2;
        int i = C2119dm.f3742a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field != null) {
            return field;
        }
        try {
            field2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field2 = null;
        }
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    /* renamed from: c */
    public static void m3621c(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C2248j1 j1Var = f3995e;
        int k = j1Var.mo12727k(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        j1Var.mo12728l(obj, j2, ((255 & b) << i) | (k & (~(255 << i))));
    }

    /* renamed from: d */
    public static void m3622d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C2248j1 j1Var = f3995e;
        int i = (((int) j) & 3) << 3;
        j1Var.mo12728l(obj, j2, ((255 & b) << i) | (j1Var.mo12727k(obj, j2) & (~(255 << i))));
    }

    /* renamed from: e */
    public static <T> T m3623e(Class<T> cls) {
        try {
            return f3991a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: f */
    public static int m3624f(Object obj, long j) {
        return f3995e.mo12727k(obj, j);
    }

    /* renamed from: g */
    public static long m3625g(Object obj, long j) {
        return f3995e.mo12729m(obj, j);
    }

    /* renamed from: h */
    public static void m3626h(Object obj, long j, long j2) {
        f3995e.mo12730n(obj, j, j2);
    }

    /* renamed from: i */
    public static boolean m3627i(Object obj, long j) {
        return f3995e.mo12695b(obj, j);
    }

    /* renamed from: j */
    public static float m3628j(Object obj, long j) {
        return f3995e.mo12697d(obj, j);
    }

    /* renamed from: k */
    public static double m3629k(Object obj, long j) {
        return f3995e.mo12699f(obj, j);
    }

    /* renamed from: l */
    public static void m3630l(Object obj, long j, double d) {
        f3995e.mo12700g(obj, j, d);
    }

    /* renamed from: m */
    public static Object m3631m(Object obj, long j) {
        return f3995e.mo12731o(obj, j);
    }

    /* renamed from: n */
    public static void m3632n(byte[] bArr, long j, byte b) {
        f3995e.mo12694a(bArr, f3998h + j, b);
    }

    /* renamed from: o */
    public static Unsafe m3633o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C2173g1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: p */
    public static boolean m3634p(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = C2119dm.f3742a;
        try {
            Class<?> cls3 = f3992b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: q */
    public static /* synthetic */ void m3635q(Throwable th) {
        Logger logger = Logger.getLogger(C2272k1.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", C0843a.m455p(new StringBuilder(valueOf.length() + 71), "platform method missing - proto runtime falling back to safer methods: ", valueOf));
    }

    /* renamed from: r */
    public static /* synthetic */ boolean m3636r(Object obj, long j) {
        return ((byte) ((f3995e.mo12727k(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: s */
    public static /* synthetic */ boolean m3637s(Object obj, long j) {
        return ((byte) ((f3995e.mo12727k(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: t */
    public static int m3638t(Class<?> cls) {
        if (f3997g) {
            return f3995e.mo12725i(cls);
        }
        return -1;
    }
}
