package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p129c.C1980b;
import p005b.p096l.p097a.p113c.p129c.C1984d;
import p005b.p096l.p097a.p113c.p130d.C1990a;
import p005b.p096l.p097a.p113c.p130d.C1991b;
import p005b.p096l.p097a.p113c.p130d.C1992c;
import p005b.p096l.p097a.p113c.p130d.C1993d;
import p005b.p096l.p097a.p113c.p130d.C1995f;
import p005b.p096l.p097a.p113c.p130d.C1996g;
import p005b.p096l.p097a.p113c.p130d.C1997h;
import p005b.p096l.p097a.p113c.p130d.C1998i;

public final class DynamiteModule {

    /* renamed from: b */
    public static Boolean f11302b = null;

    /* renamed from: c */
    public static C1996g f11303c = null;

    /* renamed from: d */
    public static C1998i f11304d = null;

    /* renamed from: e */
    public static String f11305e = null;

    /* renamed from: f */
    public static int f11306f = -1;

    /* renamed from: g */
    public static final ThreadLocal<C5478c> f11307g = new ThreadLocal<>();

    /* renamed from: h */
    public static final C5475b.C5477b f11308h = new C1990a();

    /* renamed from: i */
    public static final C5475b f11309i = new C1991b();

    /* renamed from: j */
    public static final C5475b f11310j = new C1992c();

    /* renamed from: k */
    public static final C5475b f11311k = new C1993d();

    /* renamed from: a */
    public final Context f11312a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public static class C5474a extends Exception {
        public C5474a(String str, C1990a aVar) {
            super(str);
        }

        public C5474a(String str, Throwable th, C1990a aVar) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    public interface C5475b {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        public static class C5476a {

            /* renamed from: a */
            public int f11313a = 0;

            /* renamed from: b */
            public int f11314b = 0;

            /* renamed from: c */
            public int f11315c = 0;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        public interface C5477b {
            /* renamed from: a */
            int mo12308a(Context context, String str);

            /* renamed from: b */
            int mo12309b(Context context, String str, boolean z);
        }

        /* renamed from: a */
        C5476a mo12310a(Context context, String str, C5477b bVar);
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$c */
    public static class C5478c {

        /* renamed from: a */
        public Cursor f11316a;

        public C5478c() {
        }

        public C5478c(C1990a aVar) {
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$d */
    public static class C5479d implements C5475b.C5477b {

        /* renamed from: a */
        public final int f11317a;

        public C5479d(int i) {
            this.f11317a = i;
        }

        /* renamed from: a */
        public final int mo12308a(Context context, String str) {
            return this.f11317a;
        }

        /* renamed from: b */
        public final int mo12309b(Context context, String str, boolean z) {
            return 0;
        }
    }

    public DynamiteModule(Context context) {
        Objects.requireNonNull(context, "null reference");
        this.f11312a = context;
    }

    /* renamed from: a */
    public static int m10394a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get((Object) null).equals(str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /* renamed from: c */
    public static DynamiteModule m10395c(Context context, C5475b bVar, String str) {
        C5475b.C5476a a;
        ThreadLocal<C5478c> threadLocal = f11307g;
        C5478c cVar = threadLocal.get();
        C5478c cVar2 = new C5478c((C1990a) null);
        threadLocal.set(cVar2);
        try {
            a = bVar.mo12310a(context, str, f11308h);
            int i = a.f11313a;
            int i2 = a.f11314b;
            StringBuilder sb = new StringBuilder(str.length() + 68 + str.length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            Log.i("DynamiteModule", sb.toString());
            int i3 = a.f11315c;
            if (i3 == 0 || ((i3 == -1 && a.f11313a == 0) || (i3 == 1 && a.f11314b == 0))) {
                int i4 = a.f11313a;
                int i5 = a.f11314b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i4);
                sb2.append(" and remote version is ");
                sb2.append(i5);
                sb2.append(".");
                throw new C5474a(sb2.toString(), (C1990a) null);
            } else if (i3 == -1) {
                DynamiteModule j = m10402j(context, str);
                Cursor cursor = cVar2.f11316a;
                if (cursor != null) {
                    cursor.close();
                }
                threadLocal.set(cVar);
                return j;
            } else if (i3 == 1) {
                DynamiteModule e = m10397e(context, str, a.f11314b);
                Cursor cursor2 = cVar2.f11316a;
                if (cursor2 != null) {
                    cursor2.close();
                }
                threadLocal.set(cVar);
                return e;
            } else {
                int i6 = a.f11315c;
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(i6);
                throw new C5474a(sb3.toString(), (C1990a) null);
            }
        } catch (C5474a e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to load remote module: ".concat(valueOf) : new String("Failed to load remote module: "));
            int i7 = a.f11313a;
            if (i7 == 0 || bVar.mo12310a(context, str, new C5479d(i7)).f11315c != -1) {
                throw new C5474a("Remote load failed. No local fallback found.", e2, (C1990a) null);
            }
            DynamiteModule j2 = m10402j(context, str);
            Cursor cursor3 = cVar2.f11316a;
            if (cursor3 != null) {
                cursor3.close();
            }
            f11307g.set(cVar);
            return j2;
        } catch (Throwable th) {
            Cursor cursor4 = cVar2.f11316a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f11307g.set(cVar);
            throw th;
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0033=Splitter:B:17:0x0033, B:39:0x0087=Splitter:B:39:0x0087, B:23:0x004e=Splitter:B:23:0x004e} */
    /* renamed from: d */
    public static int m10396d(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.Boolean r1 = f11302b     // Catch:{ all -> 0x00f3 }
            if (r1 != 0) goto L_0x00c0
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x009b, IllegalAccessException -> 0x0099, NoSuchFieldException -> 0x0097 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x009b, IllegalAccessException -> 0x0099, NoSuchFieldException -> 0x0097 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x009b, IllegalAccessException -> 0x0099, NoSuchFieldException -> 0x0097 }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x009b, IllegalAccessException -> 0x0099, NoSuchFieldException -> 0x0097 }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x009b, IllegalAccessException -> 0x0099, NoSuchFieldException -> 0x0097 }
            monitor-enter(r1)     // Catch:{ ClassNotFoundException -> 0x009b, IllegalAccessException -> 0x0099, NoSuchFieldException -> 0x0097 }
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x0094 }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x0094 }
            if (r4 == 0) goto L_0x0036
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0094 }
            if (r4 != r2) goto L_0x0030
            goto L_0x008f
        L_0x0030:
            m10398f(r4)     // Catch:{ a -> 0x0033 }
        L_0x0033:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0094 }
            goto L_0x0091
        L_0x0036:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x0094 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x0094 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0094 }
            if (r4 == 0) goto L_0x004e
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0094 }
        L_0x004a:
            r2.set(r3, r4)     // Catch:{ all -> 0x0094 }
            goto L_0x008f
        L_0x004e:
            int r4 = m10401i(r8, r9, r10)     // Catch:{ a -> 0x008a }
            java.lang.String r5 = f11305e     // Catch:{ a -> 0x008a }
            if (r5 == 0) goto L_0x0087
            boolean r5 = r5.isEmpty()     // Catch:{ a -> 0x008a }
            if (r5 == 0) goto L_0x005d
            goto L_0x0087
        L_0x005d:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x008a }
            r6 = 29
            if (r5 < r6) goto L_0x006f
            dalvik.system.DelegateLastClassLoader r5 = new dalvik.system.DelegateLastClassLoader     // Catch:{ a -> 0x008a }
            java.lang.String r6 = f11305e     // Catch:{ a -> 0x008a }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x008a }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x008a }
            goto L_0x007a
        L_0x006f:
            b.l.a.c.d.e r5 = new b.l.a.c.d.e     // Catch:{ a -> 0x008a }
            java.lang.String r6 = f11305e     // Catch:{ a -> 0x008a }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x008a }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x008a }
        L_0x007a:
            m10398f(r5)     // Catch:{ a -> 0x008a }
            r2.set(r3, r5)     // Catch:{ a -> 0x008a }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ a -> 0x008a }
            f11302b = r5     // Catch:{ a -> 0x008a }
            monitor-exit(r1)     // Catch:{ all -> 0x0094 }
            monitor-exit(r0)     // Catch:{ all -> 0x00f3 }
            return r4
        L_0x0087:
            monitor-exit(r1)     // Catch:{ all -> 0x0094 }
            monitor-exit(r0)     // Catch:{ all -> 0x00f3 }
            return r4
        L_0x008a:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0094 }
            goto L_0x004a
        L_0x008f:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0094 }
        L_0x0091:
            monitor-exit(r1)     // Catch:{ all -> 0x0094 }
            r1 = r2
            goto L_0x00be
        L_0x0094:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0094 }
            throw r2     // Catch:{ ClassNotFoundException -> 0x009b, IllegalAccessException -> 0x0099, NoSuchFieldException -> 0x0097 }
        L_0x0097:
            r1 = move-exception
            goto L_0x009c
        L_0x0099:
            r1 = move-exception
            goto L_0x009c
        L_0x009b:
            r1 = move-exception
        L_0x009c:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00f3 }
            int r3 = r1.length()     // Catch:{ all -> 0x00f3 }
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f3 }
            r4.<init>(r3)     // Catch:{ all -> 0x00f3 }
            java.lang.String r3 = "Failed to load module via V2: "
            r4.append(r3)     // Catch:{ all -> 0x00f3 }
            r4.append(r1)     // Catch:{ all -> 0x00f3 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00f3 }
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x00f3 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00f3 }
        L_0x00be:
            f11302b = r1     // Catch:{ all -> 0x00f3 }
        L_0x00c0:
            monitor-exit(r0)     // Catch:{ all -> 0x00f3 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00ee
            int r8 = m10401i(r8, r9, r10)     // Catch:{ a -> 0x00cc }
            return r8
        L_0x00cc:
            r9 = move-exception
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00f6 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00f6 }
            int r1 = r9.length()     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x00e4
            java.lang.String r9 = r0.concat(r9)     // Catch:{ all -> 0x00f6 }
            goto L_0x00e9
        L_0x00e4:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x00f6 }
            r9.<init>(r0)     // Catch:{ all -> 0x00f6 }
        L_0x00e9:
            android.util.Log.w(r10, r9)     // Catch:{ all -> 0x00f6 }
            r8 = 0
            return r8
        L_0x00ee:
            int r8 = m10399g(r8, r9, r10)     // Catch:{ all -> 0x00f6 }
            return r8
        L_0x00f3:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f3 }
            throw r9     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            r9 = move-exception
            java.lang.String r10 = "null reference"
            java.util.Objects.requireNonNull(r8, r10)     // Catch:{ Exception -> 0x00fd }
            goto L_0x0105
        L_0x00fd:
            r8 = move-exception
            java.lang.String r10 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r10, r0, r8)
        L_0x0105:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m10396d(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: e */
    public static DynamiteModule m10397e(Context context, String str, int i) {
        Boolean bool;
        C1980b bVar;
        try {
            synchronized (DynamiteModule.class) {
                bool = f11302b;
            }
            if (bool == null) {
                throw new C5474a("Failed to determine which loading route to use.", (C1990a) null);
            } else if (bool.booleanValue()) {
                return m10400h(context, str, i);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i);
                Log.i("DynamiteModule", sb.toString());
                C1996g k = m10403k(context);
                if (k != null) {
                    if (k.mo12312P0() >= 2) {
                        bVar = k.mo12314e0(new C1984d(context), str, i);
                    } else {
                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                        bVar = k.mo12316x0(new C1984d(context), str, i);
                    }
                    if (C1984d.m2900n(bVar) != null) {
                        return new DynamiteModule((Context) C1984d.m2900n(bVar));
                    }
                    throw new C5474a("Failed to load remote module.", (C1990a) null);
                }
                throw new C5474a("Failed to create IDynamiteLoader.", (C1990a) null);
            }
        } catch (RemoteException e) {
            throw new C5474a("Failed to load remote module.", e, (C1990a) null);
        } catch (C5474a e2) {
            throw e2;
        } catch (Throwable th) {
            try {
                Objects.requireNonNull(context, "null reference");
            } catch (Exception e3) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e3);
            }
            throw new C5474a("Failed to load remote module.", th, (C1990a) null);
        }
    }

    /* renamed from: f */
    public static void m10398f(ClassLoader classLoader) {
        C1998i iVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                iVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                iVar = queryLocalInterface instanceof C1998i ? (C1998i) queryLocalInterface : new C1997h(iBinder);
            }
            f11304d = iVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C5474a("Failed to instantiate dynamite loader", e, (C1990a) null);
        }
    }

    /* renamed from: g */
    public static int m10399g(Context context, String str, boolean z) {
        C1996g k = m10403k(context);
        if (k == null) {
            return 0;
        }
        try {
            if (k.mo12312P0() >= 2) {
                return k.mo12315q(new C1984d(context), str, z);
            }
            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
            return k.mo12313W(new C1984d(context), str, z);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    /* renamed from: h */
    public static DynamiteModule m10400h(Context context, String str, int i) {
        C1998i iVar;
        Boolean valueOf;
        C1980b bVar;
        Class<DynamiteModule> cls = DynamiteModule.class;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        Log.i("DynamiteModule", sb.toString());
        synchronized (cls) {
            iVar = f11304d;
        }
        if (iVar != null) {
            C5478c cVar = f11307g.get();
            if (cVar == null || cVar.f11316a == null) {
                throw new C5474a("No result cursor", (C1990a) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = cVar.f11316a;
            new C1984d(null);
            synchronized (cls) {
                valueOf = Boolean.valueOf(f11306f >= 2);
            }
            if (valueOf.booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                bVar = iVar.mo12318U(new C1984d(applicationContext), str, i, new C1984d(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                bVar = iVar.mo12317R(new C1984d(applicationContext), str, i, new C1984d(cursor));
            }
            Context context2 = (Context) C1984d.m2900n(bVar);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new C5474a("Failed to get module context", (C1990a) null);
        }
        throw new C5474a("DynamiteLoaderV2 was not cached.", (C1990a) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b0  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m10401i(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r10 == 0) goto L_0x000a
            java.lang.String r8 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r8 = "api"
        L_0x000c:
            int r10 = r8.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r2 = r2.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.<init>(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r8 == 0) goto L_0x0083
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 == 0) goto L_0x0083
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 <= 0) goto L_0x007c
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x0079 }
            f11305e = r1     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x0079 }
            if (r1 < 0) goto L_0x0067
            int r1 = r8.getInt(r1)     // Catch:{ all -> 0x0079 }
            f11306f = r1     // Catch:{ all -> 0x0079 }
        L_0x0067:
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r10 = f11307g     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$c r10 = (com.google.android.gms.dynamite.DynamiteModule.C5478c) r10     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r10 == 0) goto L_0x007c
            android.database.Cursor r1 = r10.f11316a     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r1 != 0) goto L_0x007c
            r10.f11316a = r8     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            goto L_0x007d
        L_0x0079:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x007c:
            r0 = r8
        L_0x007d:
            if (r0 == 0) goto L_0x0082
            r0.close()
        L_0x0082:
            return r9
        L_0x0083:
            java.lang.String r9 = "DynamiteModule"
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r9, r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r10, r0)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x0092:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00ae
        L_0x0096:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x009f
        L_0x009b:
            r8 = move-exception
            goto L_0x00ae
        L_0x009d:
            r8 = move-exception
            r9 = r0
        L_0x009f:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.C5474a     // Catch:{ all -> 0x00ac }
            if (r10 == 0) goto L_0x00a4
            throw r8     // Catch:{ all -> 0x00ac }
        L_0x00a4:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch:{ all -> 0x00ac }
            throw r10     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r8 = move-exception
            r0 = r9
        L_0x00ae:
            if (r0 == 0) goto L_0x00b3
            r0.close()
        L_0x00b3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m10401i(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: j */
    public static DynamiteModule m10402j(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: k */
    public static C1996g m10403k(Context context) {
        C1996g gVar;
        synchronized (DynamiteModule.class) {
            C1996g gVar2 = f11303c;
            if (gVar2 != null) {
                return gVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    gVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    gVar = queryLocalInterface instanceof C1996g ? (C1996g) queryLocalInterface : new C1995f(iBinder);
                }
                if (gVar != null) {
                    f11303c = gVar;
                    return gVar;
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
        }
        return null;
    }

    /* renamed from: b */
    public final IBinder mo18876b(String str) {
        try {
            return (IBinder) this.f11312a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new C5474a(str.length() != 0 ? "Failed to instantiate module class: ".concat(str) : new String("Failed to instantiate module class: "), e, (C1990a) null);
        }
    }
}
