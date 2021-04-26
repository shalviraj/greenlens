package p005b.p051h.p052a.p053k;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.h.a.k.a */
public final class C0947a implements Closeable {

    /* renamed from: g */
    public final File f915g;

    /* renamed from: h */
    public final File f916h;

    /* renamed from: i */
    public final File f917i;

    /* renamed from: j */
    public final File f918j;

    /* renamed from: k */
    public final int f919k;

    /* renamed from: l */
    public long f920l;

    /* renamed from: m */
    public final int f921m;

    /* renamed from: n */
    public long f922n = 0;

    /* renamed from: o */
    public Writer f923o;

    /* renamed from: p */
    public final LinkedHashMap<String, C0951d> f924p = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: q */
    public int f925q;

    /* renamed from: r */
    public long f926r = 0;

    /* renamed from: s */
    public final ThreadPoolExecutor f927s = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C0949b((C0948a) null));

    /* renamed from: t */
    public final Callable<Void> f928t = new C0948a();

    /* renamed from: b.h.a.k.a$a */
    public class C0948a implements Callable<Void> {
        public C0948a() {
        }

        public Object call() {
            synchronized (C0947a.this) {
                C0947a aVar = C0947a.this;
                if (aVar.f923o != null) {
                    aVar.mo10796p0();
                    if (C0947a.this.mo10789S()) {
                        C0947a.this.mo10795n0();
                        C0947a.this.f925q = 0;
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: b.h.a.k.a$b */
    public static final class C0949b implements ThreadFactory {
        public C0949b(C0948a aVar) {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: b.h.a.k.a$c */
    public final class C0950c {

        /* renamed from: a */
        public final C0951d f930a;

        /* renamed from: b */
        public final boolean[] f931b;

        /* renamed from: c */
        public boolean f932c;

        public C0950c(C0951d dVar, C0948a aVar) {
            boolean[] zArr;
            this.f930a = dVar;
            if (dVar.f938e) {
                zArr = null;
            } else {
                zArr = new boolean[C0947a.this.f921m];
            }
            this.f931b = zArr;
        }

        /* renamed from: a */
        public void mo10799a() {
            C0947a.m691d(C0947a.this, this, false);
        }

        /* renamed from: b */
        public File mo10800b(int i) {
            File file;
            synchronized (C0947a.this) {
                C0951d dVar = this.f930a;
                if (dVar.f939f == this) {
                    if (!dVar.f938e) {
                        this.f931b[i] = true;
                    }
                    file = dVar.f937d[i];
                    if (!C0947a.this.f915g.exists()) {
                        C0947a.this.f915g.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    /* renamed from: b.h.a.k.a$d */
    public final class C0951d {

        /* renamed from: a */
        public final String f934a;

        /* renamed from: b */
        public final long[] f935b;

        /* renamed from: c */
        public File[] f936c;

        /* renamed from: d */
        public File[] f937d;

        /* renamed from: e */
        public boolean f938e;

        /* renamed from: f */
        public C0950c f939f;

        /* renamed from: g */
        public long f940g;

        public C0951d(String str, C0948a aVar) {
            this.f934a = str;
            int i = C0947a.this.f921m;
            this.f935b = new long[i];
            this.f936c = new File[i];
            this.f937d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < C0947a.this.f921m; i2++) {
                sb.append(i2);
                this.f936c[i2] = new File(C0947a.this.f915g, sb.toString());
                sb.append(".tmp");
                this.f937d[i2] = new File(C0947a.this.f915g, sb.toString());
                sb.setLength(length);
            }
        }

        /* renamed from: a */
        public String mo10801a() {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f935b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public final IOException mo10802b(String[] strArr) {
            StringBuilder u = C0843a.m460u("unexpected journal line: ");
            u.append(Arrays.toString(strArr));
            throw new IOException(u.toString());
        }
    }

    /* renamed from: b.h.a.k.a$e */
    public final class C0952e {

        /* renamed from: a */
        public final File[] f942a;

        public C0952e(C0947a aVar, String str, long j, File[] fileArr, long[] jArr, C0948a aVar2) {
            this.f942a = fileArr;
        }
    }

    public C0947a(File file, int i, int i2, long j) {
        File file2 = file;
        this.f915g = file2;
        this.f919k = i;
        this.f916h = new File(file2, "journal");
        this.f917i = new File(file2, "journal.tmp");
        this.f918j = new File(file2, "journal.bkp");
        this.f921m = i2;
        this.f920l = j;
    }

    @TargetApi(26)
    /* renamed from: N */
    public static void m689N(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: Z */
    public static C0947a m690Z(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m692o0(file2, file3, false);
                }
            }
            C0947a aVar = new C0947a(file, i, i2, j);
            if (aVar.f916h.exists()) {
                try {
                    aVar.mo10793h0();
                    aVar.mo10792f0();
                    return aVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    aVar.close();
                    C0955c.m710a(aVar.f915g);
                }
            }
            file.mkdirs();
            C0947a aVar2 = new C0947a(file, i, i2, j);
            aVar2.mo10795n0();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: d */
    public static void m691d(C0947a aVar, C0950c cVar, boolean z) {
        synchronized (aVar) {
            C0951d dVar = cVar.f930a;
            if (dVar.f939f == cVar) {
                if (z && !dVar.f938e) {
                    int i = 0;
                    while (true) {
                        if (i >= aVar.f921m) {
                            break;
                        } else if (!cVar.f931b[i]) {
                            cVar.mo10799a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                        } else if (!dVar.f937d[i].exists()) {
                            cVar.mo10799a();
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                for (int i2 = 0; i2 < aVar.f921m; i2++) {
                    File file = dVar.f937d[i2];
                    if (!z) {
                        m694z(file);
                    } else if (file.exists()) {
                        File file2 = dVar.f936c[i2];
                        file.renameTo(file2);
                        long j = dVar.f935b[i2];
                        long length = file2.length();
                        dVar.f935b[i2] = length;
                        aVar.f922n = (aVar.f922n - j) + length;
                    }
                }
                aVar.f925q++;
                dVar.f939f = null;
                if (dVar.f938e || z) {
                    dVar.f938e = true;
                    aVar.f923o.append("CLEAN");
                    aVar.f923o.append(' ');
                    aVar.f923o.append(dVar.f934a);
                    aVar.f923o.append(dVar.mo10801a());
                    aVar.f923o.append(10);
                    if (z) {
                        long j2 = aVar.f926r;
                        aVar.f926r = 1 + j2;
                        dVar.f940g = j2;
                    }
                } else {
                    aVar.f924p.remove(dVar.f934a);
                    aVar.f923o.append("REMOVE");
                    aVar.f923o.append(' ');
                    aVar.f923o.append(dVar.f934a);
                    aVar.f923o.append(10);
                }
                m689N(aVar.f923o);
                if (aVar.f922n > aVar.f920l || aVar.mo10789S()) {
                    aVar.f927s.submit(aVar.f928t);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: o0 */
    public static void m692o0(File file, File file2, boolean z) {
        if (z) {
            m694z(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    /* renamed from: q */
    public static void m693q(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: z */
    public static void m694z(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: H */
    public C0950c mo10787H(String str) {
        synchronized (this) {
            mo10791e();
            C0951d dVar = this.f924p.get(str);
            if (dVar == null) {
                dVar = new C0951d(str, (C0948a) null);
                this.f924p.put(str, dVar);
            } else if (dVar.f939f != null) {
                return null;
            }
            C0950c cVar = new C0950c(dVar, (C0948a) null);
            dVar.f939f = cVar;
            this.f923o.append("DIRTY");
            this.f923o.append(' ');
            this.f923o.append(str);
            this.f923o.append(10);
            m689N(this.f923o);
            return cVar;
        }
    }

    /* renamed from: O */
    public synchronized C0952e mo10788O(String str) {
        mo10791e();
        C0951d dVar = this.f924p.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f938e) {
            return null;
        }
        for (File exists : dVar.f936c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f925q++;
        this.f923o.append("READ");
        this.f923o.append(' ');
        this.f923o.append(str);
        this.f923o.append(10);
        if (mo10789S()) {
            this.f927s.submit(this.f928t);
        }
        return new C0952e(this, str, dVar.f940g, dVar.f936c, dVar.f935b, (C0948a) null);
    }

    /* renamed from: S */
    public final boolean mo10789S() {
        int i = this.f925q;
        return i >= 2000 && i >= this.f924p.size();
    }

    public synchronized void close() {
        if (this.f923o != null) {
            Iterator it = new ArrayList(this.f924p.values()).iterator();
            while (it.hasNext()) {
                C0950c cVar = ((C0951d) it.next()).f939f;
                if (cVar != null) {
                    cVar.mo10799a();
                }
            }
            mo10796p0();
            m693q(this.f923o);
            this.f923o = null;
        }
    }

    /* renamed from: e */
    public final void mo10791e() {
        if (this.f923o == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: f0 */
    public final void mo10792f0() {
        m694z(this.f917i);
        Iterator<C0951d> it = this.f924p.values().iterator();
        while (it.hasNext()) {
            C0951d next = it.next();
            int i = 0;
            if (next.f939f == null) {
                while (i < this.f921m) {
                    this.f922n += next.f935b[i];
                    i++;
                }
            } else {
                next.f939f = null;
                while (i < this.f921m) {
                    m694z(next.f936c[i]);
                    m694z(next.f937d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|17|(1:19)|(1:21)(1:22)|23|24|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f925q = r2 - r9.f924p.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r1.f947k == -1) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r0 != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        mo10795n0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r9.f923o = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f916h, true), p005b.p051h.p052a.p053k.C0955c.f949a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0060 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0060=Splitter:B:16:0x0060, B:28:0x0091=Splitter:B:28:0x0091} */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10793h0() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            b.h.a.k.b r1 = new b.h.a.k.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f916h
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p005b.p051h.p052a.p053k.C0955c.f949a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo10805e()     // Catch:{ all -> 0x00bf }
            java.lang.String r3 = r1.mo10805e()     // Catch:{ all -> 0x00bf }
            java.lang.String r4 = r1.mo10805e()     // Catch:{ all -> 0x00bf }
            java.lang.String r5 = r1.mo10805e()     // Catch:{ all -> 0x00bf }
            java.lang.String r6 = r1.mo10805e()     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00bf }
            if (r7 == 0) goto L_0x0091
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00bf }
            if (r7 == 0) goto L_0x0091
            int r7 = r9.f919k     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00bf }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0091
            int r4 = r9.f921m     // Catch:{ all -> 0x00bf }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00bf }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0091
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0091
            r0 = 0
            r2 = r0
        L_0x0056:
            java.lang.String r3 = r1.mo10805e()     // Catch:{ EOFException -> 0x0060 }
            r9.mo10794l0(r3)     // Catch:{ EOFException -> 0x0060 }
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0060:
            java.util.LinkedHashMap<java.lang.String, b.h.a.k.a$d> r3 = r9.f924p     // Catch:{ all -> 0x00bf }
            int r3 = r3.size()     // Catch:{ all -> 0x00bf }
            int r2 = r2 - r3
            r9.f925q = r2     // Catch:{ all -> 0x00bf }
            int r2 = r1.f947k     // Catch:{ all -> 0x00bf }
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0070
            r0 = r4
        L_0x0070:
            if (r0 == 0) goto L_0x0076
            r9.mo10795n0()     // Catch:{ all -> 0x00bf }
            goto L_0x008b
        L_0x0076:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00bf }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00bf }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00bf }
            java.io.File r5 = r9.f916h     // Catch:{ all -> 0x00bf }
            r3.<init>(r5, r4)     // Catch:{ all -> 0x00bf }
            java.nio.charset.Charset r4 = p005b.p051h.p052a.p053k.C0955c.f949a     // Catch:{ all -> 0x00bf }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00bf }
            r0.<init>(r2)     // Catch:{ all -> 0x00bf }
            r9.f923o = r0     // Catch:{ all -> 0x00bf }
        L_0x008b:
            r1.close()     // Catch:{ RuntimeException -> 0x008f, Exception -> 0x008e }
        L_0x008e:
            return
        L_0x008f:
            r0 = move-exception
            throw r0
        L_0x0091:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00bf }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            r7.<init>()     // Catch:{ all -> 0x00bf }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00bf }
            r7.append(r2)     // Catch:{ all -> 0x00bf }
            r7.append(r0)     // Catch:{ all -> 0x00bf }
            r7.append(r3)     // Catch:{ all -> 0x00bf }
            r7.append(r0)     // Catch:{ all -> 0x00bf }
            r7.append(r5)     // Catch:{ all -> 0x00bf }
            r7.append(r0)     // Catch:{ all -> 0x00bf }
            r7.append(r6)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00bf }
            r4.<init>(r0)     // Catch:{ all -> 0x00bf }
            throw r4     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r0 = move-exception
            r1.close()     // Catch:{ RuntimeException -> 0x00c4, Exception -> 0x00c3 }
        L_0x00c3:
            throw r0
        L_0x00c4:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p053k.C0947a.mo10793h0():void");
    }

    /* renamed from: l0 */
    public final void mo10794l0(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f924p.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C0951d dVar = this.f924p.get(str2);
            if (dVar == null) {
                dVar = new C0951d(str2, (C0948a) null);
                this.f924p.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f938e = true;
                dVar.f939f = null;
                if (split.length == C0947a.this.f921m) {
                    int i2 = 0;
                    while (i2 < split.length) {
                        try {
                            dVar.f935b[i2] = Long.parseLong(split[i2]);
                            i2++;
                        } catch (NumberFormatException unused) {
                            dVar.mo10802b(split);
                            throw null;
                        }
                    }
                    return;
                }
                dVar.mo10802b(split);
                throw null;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f939f = new C0950c(dVar, (C0948a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(C0843a.m451l("unexpected journal line: ", str));
            }
        } else {
            throw new IOException(C0843a.m451l("unexpected journal line: ", str));
        }
    }

    /* renamed from: n0 */
    public final synchronized void mo10795n0() {
        String str;
        Writer writer = this.f923o;
        if (writer != null) {
            m693q(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f917i), C0955c.f949a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f919k));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f921m));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C0951d next : this.f924p.values()) {
                if (next.f939f != null) {
                    str = "DIRTY " + next.f934a + 10;
                } else {
                    str = "CLEAN " + next.f934a + next.mo10801a() + 10;
                }
                bufferedWriter.write(str);
            }
            m693q(bufferedWriter);
            if (this.f916h.exists()) {
                m692o0(this.f916h, this.f918j, true);
            }
            m692o0(this.f917i, this.f916h, false);
            this.f918j.delete();
            this.f923o = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f916h, true), C0955c.f949a));
        } catch (Throwable th) {
            m693q(bufferedWriter);
            throw th;
        }
    }

    /* renamed from: p0 */
    public final void mo10796p0() {
        while (this.f922n > this.f920l) {
            String str = (String) this.f924p.entrySet().iterator().next().getKey();
            synchronized (this) {
                mo10791e();
                C0951d dVar = this.f924p.get(str);
                if (dVar != null) {
                    if (dVar.f939f == null) {
                        for (int i = 0; i < this.f921m; i++) {
                            File file = dVar.f936c[i];
                            if (file.exists()) {
                                if (!file.delete()) {
                                    throw new IOException("failed to delete " + file);
                                }
                            }
                            long j = this.f922n;
                            long[] jArr = dVar.f935b;
                            this.f922n = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f925q++;
                        this.f923o.append("REMOVE");
                        this.f923o.append(' ');
                        this.f923o.append(str);
                        this.f923o.append(10);
                        this.f924p.remove(str);
                        if (mo10789S()) {
                            this.f927s.submit(this.f928t);
                        }
                    }
                }
            }
        }
    }
}
