package p005b.p096l.p097a.p151d.p152a.p154b;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import p005b.p096l.p097a.p151d.p152a.p159e.C3577b0;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;

/* renamed from: b.l.a.d.a.b.t */
public final class C3544t {

    /* renamed from: c */
    public static final C3584f f6563c = new C3584f("AssetPackStorage");

    /* renamed from: d */
    public static final long f6564d;

    /* renamed from: e */
    public static final long f6565e;

    /* renamed from: a */
    public final Context f6566a;

    /* renamed from: b */
    public final C3528o1 f6567b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f6564d = timeUnit.toMillis(14);
        f6565e = timeUnit.toMillis(28);
    }

    public C3544t(Context context, C3528o1 o1Var) {
        this.f6566a = context;
        this.f6567b = o1Var;
    }

    /* renamed from: b */
    public static void m6739b(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long c = m6740c(file, false);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(c)) && !file2.getName().equals("stale.tmp")) {
                    m6741h(file2);
                }
            }
        }
    }

    /* renamed from: c */
    public static long m6740c(File file, boolean z) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            f6563c.mo14884b(5, "Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e) {
            f6563c.mo14883a(e, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    /* renamed from: h */
    public static boolean m6741h(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File h : listFiles) {
                z &= m6741h(h);
            }
        } else {
            z = true;
        }
        return file.delete() && true == z;
    }

    /* renamed from: a */
    public final File mo14816a(String str) {
        return new File(mo14820g(), str);
    }

    /* renamed from: d */
    public final List<File> mo14817d() {
        ArrayList arrayList = new ArrayList();
        try {
            if (mo14820g().exists()) {
                if (mo14820g().listFiles() != null) {
                    for (File file : mo14820g().listFiles()) {
                        if (!file.getCanonicalPath().equals(mo14819f().getCanonicalPath())) {
                            arrayList.add(file);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e) {
            f6563c.mo14884b(6, "Could not process directory while scanning installed packs. %s", new Object[]{e});
        }
    }

    /* renamed from: e */
    public final File mo14818e(String str, int i, long j) {
        return new File(new File(new File(mo14819f(), str), String.valueOf(i)), String.valueOf(j));
    }

    /* renamed from: f */
    public final File mo14819f() {
        return new File(mo14820g(), "_tmp");
    }

    /* renamed from: g */
    public final File mo14820g() {
        return new File(this.f6566a.getFilesDir(), "assetpacks");
    }

    /* renamed from: i */
    public final Map<String, Long> mo14821i() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            Iterator it = ((ArrayList) mo14817d()).iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                C3474b j = mo14822j(file.getName());
                if (j != null) {
                    hashMap2.put(file.getName(), j);
                }
            }
        } catch (IOException e) {
            f6563c.mo14884b(6, "Could not process directory while scanning installed packs: %s", new Object[]{e});
        }
        for (String str : hashMap2.keySet()) {
            hashMap.put(str, Long.valueOf(mo14833u(str)));
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0095 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0096  */
    @androidx.annotation.Nullable
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p096l.p097a.p151d.p152a.p154b.C3474b mo14822j(java.lang.String r9) {
        /*
            r8 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r8.mo14820g()
            r0.<init>(r1, r9)
            boolean r1 = r0.exists()
            r2 = 3
            r3 = 6
            r4 = 1
            r5 = 0
            r6 = 0
            if (r1 != 0) goto L_0x0022
            b.l.a.d.a.e.f r0 = f6563c
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r9
            java.lang.String r9 = "Pack not found with pack name: %s"
            r0.mo14884b(r2, r9, r1)
        L_0x001f:
            r9 = r6
            goto L_0x0093
        L_0x0022:
            java.io.File r1 = new java.io.File
            b.l.a.d.a.b.o1 r7 = r8.f6567b
            int r7 = r7.mo14797a()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r1.<init>(r0, r7)
            boolean r0 = r1.exists()
            r7 = 2
            if (r0 != 0) goto L_0x0050
            b.l.a.d.a.e.f r0 = f6563c
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r5] = r9
            b.l.a.d.a.b.o1 r9 = r8.f6567b
            int r9 = r9.mo14797a()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1[r4] = r9
            java.lang.String r9 = "Pack not found with pack name: %s app version: %s"
            r0.mo14884b(r2, r9, r1)
            goto L_0x001f
        L_0x0050:
            java.io.File[] r0 = r1.listFiles()
            if (r0 == 0) goto L_0x007b
            int r1 = r0.length
            if (r1 != 0) goto L_0x005a
            goto L_0x007b
        L_0x005a:
            if (r1 <= r4) goto L_0x0074
            b.l.a.d.a.e.f r0 = f6563c
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r5] = r9
            b.l.a.d.a.b.o1 r9 = r8.f6567b
            int r9 = r9.mo14797a()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1[r4] = r9
            java.lang.String r9 = "Multiple pack versions found for pack name: %s app version: %s"
            r0.mo14884b(r3, r9, r1)
            goto L_0x001f
        L_0x0074:
            r9 = r0[r5]
            java.lang.String r9 = r9.getCanonicalPath()
            goto L_0x0093
        L_0x007b:
            b.l.a.d.a.e.f r0 = f6563c
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r5] = r9
            b.l.a.d.a.b.o1 r9 = r8.f6567b
            int r9 = r9.mo14797a()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1[r4] = r9
            java.lang.String r9 = "No pack version found for pack name: %s app version: %s"
            r0.mo14884b(r2, r9, r1)
            goto L_0x001f
        L_0x0093:
            if (r9 != 0) goto L_0x0096
            return r6
        L_0x0096:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "assets"
            r0.<init>(r9, r1)
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L_0x00af
            b.l.a.d.a.e.f r9 = f6563c
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r0
            java.lang.String r0 = "Failed to find assets directory: %s"
            r9.mo14884b(r3, r0, r1)
            return r6
        L_0x00af:
            java.lang.String r0 = r0.getCanonicalPath()
            b.l.a.d.a.b.w r1 = new b.l.a.d.a.b.w
            r1.<init>(r5, r9, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p151d.p152a.p154b.C3544t.mo14822j(java.lang.String):b.l.a.d.a.b.b");
    }

    /* renamed from: k */
    public final File mo14823k(String str, int i, long j) {
        return new File(new File(mo14816a(str), String.valueOf(i)), String.valueOf(j));
    }

    /* renamed from: l */
    public final File mo14824l(String str, int i, long j, String str2) {
        return new File(new File(new File(mo14818e(str, i, j), "_slices"), "_unverified"), str2);
    }

    /* renamed from: m */
    public final File mo14825m(String str, int i, long j, String str2) {
        return new File(new File(new File(mo14818e(str, i, j), "_slices"), "_verified"), str2);
    }

    /* renamed from: n */
    public final File mo14826n(String str, int i, long j) {
        return new File(mo14818e(str, i, j), "_packs");
    }

    /* renamed from: o */
    public final int mo14827o(String str, int i, long j) {
        File file = new File(mo14826n(str, i, j), "merge.tmp");
        if (!file.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e) {
                    throw new C3495g0("Merge checkpoint file corrupt.", (Exception) e);
                }
            } else {
                throw new C3495g0("Merge checkpoint file corrupt.");
            }
        } catch (Throwable th) {
            C3577b0.f6643a.mo14880a(th, th);
        }
        throw th;
    }

    /* renamed from: p */
    public final void mo14828p(String str, int i, long j, int i2) {
        File file = new File(mo14826n(str, i, j), "merge.tmp");
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* renamed from: q */
    public final File mo14829q(String str, int i, long j, String str2) {
        return new File(mo14830r(str, i, j, str2), "checkpoint.dat");
    }

    /* renamed from: r */
    public final File mo14830r(String str, int i, long j, String str2) {
        return new File(new File(new File(mo14818e(str, i, j), "_slices"), "_metadata"), str2);
    }

    /* renamed from: s */
    public final void mo14831s() {
        Iterator it = ((ArrayList) mo14817d()).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file.listFiles() != null) {
                m6739b(file);
                long c = m6740c(file, false);
                if (((long) this.f6567b.mo14797a()) != c) {
                    try {
                        new File(new File(file, String.valueOf(c)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f6563c.mo14884b(6, "Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File b : file.listFiles()) {
                    m6739b(b);
                }
            }
        }
    }

    /* renamed from: t */
    public final int mo14832t(String str) {
        return (int) m6740c(mo14816a(str), true);
    }

    /* renamed from: u */
    public final long mo14833u(String str) {
        return m6740c(new File(mo14816a(str), String.valueOf((int) m6740c(mo14816a(str), true))), true);
    }
}
