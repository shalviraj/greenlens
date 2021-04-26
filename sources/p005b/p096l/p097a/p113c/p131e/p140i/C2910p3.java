package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b.l.a.c.e.i.p3 */
public abstract class C2910p3<T> {

    /* renamed from: f */
    public static final Object f4929f = new Object();

    /* renamed from: g */
    public static volatile C2897o3 f4930g;

    /* renamed from: h */
    public static final AtomicInteger f4931h = new AtomicInteger();

    /* renamed from: a */
    public final C2884n3 f4932a;

    /* renamed from: b */
    public final String f4933b;

    /* renamed from: c */
    public final T f4934c;

    /* renamed from: d */
    public volatile int f4935d = -1;

    /* renamed from: e */
    public volatile T f4936e;

    static {
        new AtomicReference();
    }

    public /* synthetic */ C2910p3(C2884n3 n3Var, String str, Object obj) {
        if (n3Var.f4901a != null) {
            this.f4932a = n3Var;
            this.f4933b = str;
            this.f4934c = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: a */
    public abstract T mo13418a(Object obj);

    /* renamed from: b */
    public final String mo13562b() {
        Objects.requireNonNull(this.f4932a);
        return this.f4933b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a8 A[Catch:{ all -> 0x008c }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9 A[Catch:{ all -> 0x008c }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd A[Catch:{ all -> 0x008c }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo13563c() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = f4931h
            int r0 = r0.get()
            int r1 = r7.f4935d
            if (r1 >= r0) goto L_0x013d
            monitor-enter(r7)
            int r1 = r7.f4935d     // Catch:{ all -> 0x008c }
            if (r1 >= r0) goto L_0x0139
            b.l.a.c.e.i.o3 r1 = f4930g     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x0133
            b.l.a.c.e.i.n3 r2 = r7.f4932a     // Catch:{ all -> 0x008c }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x008c }
            android.content.Context r2 = r1.mo13536a()     // Catch:{ all -> 0x008c }
            b.l.a.c.e.i.d3 r2 = p005b.p096l.p097a.p113c.p131e.p140i.C2752d3.m4707a(r2)     // Catch:{ all -> 0x008c }
            java.lang.String r3 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.String r2 = r2.mo13290b(r3)     // Catch:{ all -> 0x008c }
            r3 = 0
            if (r2 == 0) goto L_0x0062
            java.util.regex.Pattern r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2974u2.f5056c     // Catch:{ all -> 0x008c }
            java.util.regex.Matcher r2 = r4.matcher(r2)     // Catch:{ all -> 0x008c }
            boolean r2 = r2.matches()     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x0062
            java.lang.String r2 = "PhenotypeFlag"
            r4 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x0060
            java.lang.String r2 = "PhenotypeFlag"
            java.lang.String r4 = "Bypass reading Phenotype values for flag: "
            java.lang.String r5 = r7.mo13562b()     // Catch:{ all -> 0x008c }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x008c }
            int r6 = r5.length()     // Catch:{ all -> 0x008c }
            if (r6 == 0) goto L_0x0057
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x008c }
            goto L_0x005d
        L_0x0057:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x008c }
            r5.<init>(r4)     // Catch:{ all -> 0x008c }
            r4 = r5
        L_0x005d:
            android.util.Log.d(r2, r4)     // Catch:{ all -> 0x008c }
        L_0x0060:
            r2 = r3
            goto L_0x00a6
        L_0x0062:
            b.l.a.c.e.i.n3 r2 = r7.f4932a     // Catch:{ all -> 0x008c }
            android.net.Uri r2 = r2.f4901a     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x0128
            android.content.Context r2 = r1.mo13536a()     // Catch:{ all -> 0x008c }
            b.l.a.c.e.i.n3 r4 = r7.f4932a     // Catch:{ all -> 0x008c }
            android.net.Uri r4 = r4.f4901a     // Catch:{ all -> 0x008c }
            boolean r2 = p005b.p096l.p097a.p113c.p131e.p140i.C2780f3.m4747a(r2, r4)     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x008f
            b.l.a.c.e.i.n3 r2 = r7.f4932a     // Catch:{ all -> 0x008c }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x008c }
            android.content.Context r2 = r1.mo13536a()     // Catch:{ all -> 0x008c }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x008c }
            b.l.a.c.e.i.n3 r4 = r7.f4932a     // Catch:{ all -> 0x008c }
            android.net.Uri r4 = r4.f4901a     // Catch:{ all -> 0x008c }
            b.l.a.c.e.i.y2 r2 = p005b.p096l.p097a.p113c.p131e.p140i.C3026y2.m5707a(r2, r4)     // Catch:{ all -> 0x008c }
            goto L_0x0090
        L_0x008c:
            r0 = move-exception
            goto L_0x013b
        L_0x008f:
            r2 = r3
        L_0x0090:
            if (r2 == 0) goto L_0x0060
            java.lang.String r4 = r7.mo13562b()     // Catch:{ all -> 0x008c }
            java.util.Map r2 = r2.mo13989b()     // Catch:{ all -> 0x008c }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x008c }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x0060
            java.lang.Object r2 = r7.mo13418a(r2)     // Catch:{ all -> 0x008c }
        L_0x00a6:
            if (r2 == 0) goto L_0x00a9
            goto L_0x00cd
        L_0x00a9:
            b.l.a.c.e.i.n3 r2 = r7.f4932a     // Catch:{ all -> 0x008c }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x008c }
            android.content.Context r2 = r1.mo13536a()     // Catch:{ all -> 0x008c }
            b.l.a.c.e.i.d3 r2 = p005b.p096l.p097a.p113c.p131e.p140i.C2752d3.m4707a(r2)     // Catch:{ all -> 0x008c }
            b.l.a.c.e.i.n3 r4 = r7.f4932a     // Catch:{ all -> 0x008c }
            java.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x008c }
            java.lang.String r4 = r7.f4933b     // Catch:{ all -> 0x008c }
            java.lang.String r2 = r2.mo13290b(r4)     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x00c8
            java.lang.Object r2 = r7.mo13418a(r2)     // Catch:{ all -> 0x008c }
            goto L_0x00c9
        L_0x00c8:
            r2 = r3
        L_0x00c9:
            if (r2 != 0) goto L_0x00cd
            T r2 = r7.f4934c     // Catch:{ all -> 0x008c }
        L_0x00cd:
            b.l.a.c.e.i.u3 r1 = r1.mo13537b()     // Catch:{ all -> 0x008c }
            java.lang.Object r1 = r1.mo13235a()     // Catch:{ all -> 0x008c }
            b.l.a.c.e.i.s3 r1 = (p005b.p096l.p097a.p113c.p131e.p140i.C2949s3) r1     // Catch:{ all -> 0x008c }
            boolean r4 = r1.mo13607a()     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x0123
            java.lang.Object r1 = r1.mo13608b()     // Catch:{ all -> 0x008c }
            b.l.a.c.e.i.e3 r1 = (p005b.p096l.p097a.p113c.p131e.p140i.C2766e3) r1     // Catch:{ all -> 0x008c }
            b.l.a.c.e.i.n3 r2 = r7.f4932a     // Catch:{ all -> 0x008c }
            android.net.Uri r2 = r2.f4901a     // Catch:{ all -> 0x008c }
            java.lang.String r4 = r7.f4933b     // Catch:{ all -> 0x008c }
            java.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x011a
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008c }
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r1 = r1.f4695a     // Catch:{ all -> 0x008c }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x008c }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x008c }
            if (r1 != 0) goto L_0x00fd
            goto L_0x011a
        L_0x00fd:
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x008c }
            java.lang.String r3 = ""
            int r4 = r2.length()     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x010e
            java.lang.String r2 = r3.concat(r2)     // Catch:{ all -> 0x008c }
            goto L_0x0113
        L_0x010e:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x008c }
            r2.<init>(r3)     // Catch:{ all -> 0x008c }
        L_0x0113:
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x008c }
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x008c }
        L_0x011a:
            if (r3 != 0) goto L_0x011f
            T r2 = r7.f4934c     // Catch:{ all -> 0x008c }
            goto L_0x0123
        L_0x011f:
            java.lang.Object r2 = r7.mo13418a(r3)     // Catch:{ all -> 0x008c }
        L_0x0123:
            r7.f4936e = r2     // Catch:{ all -> 0x008c }
            r7.f4935d = r0     // Catch:{ all -> 0x008c }
            goto L_0x0139
        L_0x0128:
            r1.mo13536a()     // Catch:{ all -> 0x008c }
            b.l.a.c.e.i.n3 r0 = r7.f4932a     // Catch:{ all -> 0x008c }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x008c }
            java.util.Map<java.lang.String, b.l.a.c.e.i.q3> r0 = p005b.p096l.p097a.p113c.p131e.p140i.C2923q3.f4948a     // Catch:{ all -> 0x008c }
            throw r3     // Catch:{ all -> 0x008c }
        L_0x0133:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008c }
            r0.<init>(r2)     // Catch:{ all -> 0x008c }
            throw r0     // Catch:{ all -> 0x008c }
        L_0x0139:
            monitor-exit(r7)     // Catch:{ all -> 0x008c }
            goto L_0x013d
        L_0x013b:
            monitor-exit(r7)     // Catch:{ all -> 0x008c }
            throw r0
        L_0x013d:
            T r0 = r7.f4936e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C2910p3.mo13563c():java.lang.Object");
    }
}
