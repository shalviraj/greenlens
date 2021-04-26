package p005b.p096l.p097a.p113c.p131e.p140i;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005b.p035e.p036a.p037a.C0843a;
import sun.misc.Unsafe;

/* renamed from: b.l.a.c.e.i.w7 */
public final class C3005w7 {

    /* renamed from: a */
    public static final Unsafe f5109a;

    /* renamed from: b */
    public static final Class<?> f5110b = C2833j4.m4860a();

    /* renamed from: c */
    public static final boolean f5111c;

    /* renamed from: d */
    public static final boolean f5112d;

    /* renamed from: e */
    public static final C2992v7 f5113e;

    /* renamed from: f */
    public static final boolean f5114f;

    /* renamed from: g */
    public static final boolean f5115g;

    /* renamed from: h */
    public static final long f5116h = ((long) m5543s(byte[].class));

    /* renamed from: i */
    public static final boolean f5117i;

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
            sun.misc.Unsafe r7 = m5538n()
            f5109a = r7
            java.lang.Class r8 = p005b.p096l.p097a.p113c.p131e.p140i.C2833j4.m4860a()
            f5110b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m5539o(r8)
            f5111c = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m5539o(r10)
            f5112d = r10
            r11 = 0
            if (r7 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            if (r9 == 0) goto L_0x0036
            b.l.a.c.e.i.u7 r11 = new b.l.a.c.e.i.u7
            r11.<init>(r7)
            goto L_0x003d
        L_0x0036:
            if (r10 == 0) goto L_0x003d
            b.l.a.c.e.i.t7 r11 = new b.l.a.c.e.i.t7
            r11.<init>(r7)
        L_0x003d:
            f5113e = r11
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
            sun.misc.Unsafe r11 = r11.f5090a
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
            java.lang.reflect.Field r8 = m5526b()     // Catch:{ all -> 0x006e }
            if (r8 != 0) goto L_0x006c
            goto L_0x0048
        L_0x006c:
            r8 = r12
            goto L_0x0073
        L_0x006e:
            r8 = move-exception
            m5540p(r8)
            goto L_0x0048
        L_0x0073:
            f5114f = r8
            b.l.a.c.e.i.v7 r8 = f5113e
            if (r8 != 0) goto L_0x007c
        L_0x0079:
            r6 = r13
            goto L_0x00f6
        L_0x007c:
            sun.misc.Unsafe r8 = r8.f5090a
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
            m5540p(r6)
            goto L_0x0079
        L_0x00f6:
            f5115g = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m5543s(r6)
            long r6 = (long) r6
            f5116h = r6
            m5543s(r5)
            m5525a(r5)
            m5543s(r4)
            m5525a(r4)
            m5543s(r3)
            m5525a(r3)
            m5543s(r2)
            m5525a(r2)
            m5543s(r1)
            m5525a(r1)
            m5543s(r0)
            m5525a(r0)
            java.lang.reflect.Field r0 = m5526b()
            if (r0 == 0) goto L_0x0132
            b.l.a.c.e.i.v7 r1 = f5113e
            if (r1 == 0) goto L_0x0132
            r1.mo13796h(r0)
        L_0x0132:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x013b
            goto L_0x013c
        L_0x013b:
            r12 = r13
        L_0x013c:
            f5117i = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.<clinit>():void");
    }

    /* renamed from: a */
    public static int m5525a(Class<?> cls) {
        if (f5115g) {
            return f5113e.mo13798j(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Field m5526b() {
        Field field;
        Field field2;
        int i = C2833j4.f4851a;
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
    public static void m5527c(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C2992v7 v7Var = f5113e;
        int k = v7Var.mo13799k(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        v7Var.mo13800l(obj, j2, ((255 & b) << i) | (k & (~(255 << i))));
    }

    /* renamed from: d */
    public static void m5528d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C2992v7 v7Var = f5113e;
        int i = (((int) j) & 3) << 3;
        v7Var.mo13800l(obj, j2, ((255 & b) << i) | (v7Var.mo13799k(obj, j2) & (~(255 << i))));
    }

    /* renamed from: e */
    public static <T> T m5529e(Class<T> cls) {
        try {
            return f5109a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: f */
    public static int m5530f(Object obj, long j) {
        return f5113e.mo13799k(obj, j);
    }

    /* renamed from: g */
    public static long m5531g(Object obj, long j) {
        return f5113e.mo13801m(obj, j);
    }

    /* renamed from: h */
    public static void m5532h(Object obj, long j, long j2) {
        f5113e.mo13802n(obj, j, j2);
    }

    /* renamed from: i */
    public static boolean m5533i(Object obj, long j) {
        return f5113e.mo13749b(obj, j);
    }

    /* renamed from: j */
    public static float m5534j(Object obj, long j) {
        return f5113e.mo13751d(obj, j);
    }

    /* renamed from: k */
    public static double m5535k(Object obj, long j) {
        return f5113e.mo13753f(obj, j);
    }

    /* renamed from: l */
    public static void m5536l(Object obj, long j, double d) {
        f5113e.mo13754g(obj, j, d);
    }

    /* renamed from: m */
    public static Object m5537m(Object obj, long j) {
        return f5113e.mo13803o(obj, j);
    }

    /* renamed from: n */
    public static Unsafe m5538n() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C2953s7());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: o */
    public static boolean m5539o(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = C2833j4.f4851a;
        try {
            Class<?> cls3 = f5110b;
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

    /* renamed from: p */
    public static /* synthetic */ void m5540p(Throwable th) {
        Logger logger = Logger.getLogger(C3005w7.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", C0843a.m455p(new StringBuilder(valueOf.length() + 71), "platform method missing - proto runtime falling back to safer methods: ", valueOf));
    }

    /* renamed from: q */
    public static /* synthetic */ boolean m5541q(Object obj, long j) {
        return ((byte) ((f5113e.mo13799k(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: r */
    public static /* synthetic */ boolean m5542r(Object obj, long j) {
        return ((byte) ((f5113e.mo13799k(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: s */
    public static int m5543s(Class<?> cls) {
        if (f5115g) {
            return f5113e.mo13797i(cls);
        }
        return -1;
    }
}
