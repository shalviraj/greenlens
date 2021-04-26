package p005b.p096l.p180d.p191q.p192f.p195g;

import java.util.Date;
import java.util.concurrent.Callable;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p180d.p191q.p192f.p202m.C4184f;

/* renamed from: b.l.d.q.f.g.m */
public class C4023m implements Callable<C3428h<Void>> {

    /* renamed from: a */
    public final /* synthetic */ Date f7369a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f7370b;

    /* renamed from: c */
    public final /* synthetic */ Thread f7371c;

    /* renamed from: d */
    public final /* synthetic */ C4184f f7372d;

    /* renamed from: e */
    public final /* synthetic */ C4032q f7373e;

    public C4023m(C4032q qVar, Date date, Throwable th, Thread thread, C4184f fVar) {
        this.f7373e = qVar;
        this.f7369a = date;
        this.f7370b = th;
        this.f7371c = thread;
        this.f7372d = fVar;
    }

    /* JADX WARNING: type inference failed for: r1v34, types: [b.l.d.q.f.i.v$d$d$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0201 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call() {
        /*
            r32 = this;
            r1 = r32
            java.util.Date r0 = r1.f7369a
            long r2 = r0.getTime()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            b.l.d.q.f.g.q r0 = r1.f7373e
            java.lang.String r4 = r0.mo15539f()
            r0 = 0
            if (r4 != 0) goto L_0x0022
            b.l.d.q.f.b r2 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            java.lang.String r3 = "Tried to write a fatal exception while no session was open."
            r2.mo15497c(r3)
            b.l.a.c.j.h r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2740P(r0)
            r2 = r1
            goto L_0x041f
        L_0x0022:
            b.l.d.q.f.g.q r5 = r1.f7373e
            b.l.d.q.f.g.y r5 = r5.f7390c
            r5.mo15552a()
            b.l.d.q.f.g.q r5 = r1.f7373e
            b.l.d.q.f.g.m0 r5 = r5.f7401n
            java.lang.Throwable r6 = r1.f7370b
            java.lang.Thread r7 = r1.f7371c
            java.util.Objects.requireNonNull(r5)
            b.l.d.q.f.b r8 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Persisting fatal event for session "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            r8.mo15499e(r9)
            b.l.d.q.f.g.z r8 = r5.f7374a
            android.content.Context r9 = r8.f7443a
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            int r9 = r9.orientation
            b.l.d.q.f.n.e r10 = new b.l.d.q.f.n.e
            b.l.d.q.f.n.d r11 = r8.f7446d
            r10.<init>(r6, r11)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            b.l.d.q.f.g.a r3 = r8.f7445c
            java.lang.String r3 = r3.f7299d
            android.content.Context r6 = r8.f7443a
            java.lang.String r11 = "activity"
            java.lang.Object r6 = r6.getSystemService(r11)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            java.util.List r6 = r6.getRunningAppProcesses()
            if (r6 == 0) goto L_0x0090
            java.util.Iterator r6 = r6.iterator()
        L_0x007b:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x0090
            java.lang.Object r12 = r6.next()
            android.app.ActivityManager$RunningAppProcessInfo r12 = (android.app.ActivityManager.RunningAppProcessInfo) r12
            java.lang.String r13 = r12.processName
            boolean r13 = r13.equals(r3)
            if (r13 == 0) goto L_0x007b
            goto L_0x0091
        L_0x0090:
            r12 = r0
        L_0x0091:
            if (r12 == 0) goto L_0x00a0
            int r0 = r12.importance
            r6 = 100
            if (r0 == r6) goto L_0x009b
            r0 = 1
            goto L_0x009c
        L_0x009b:
            r0 = 0
        L_0x009c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x00a0:
            r15 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.StackTraceElement[] r12 = r10.f7790c
            r13 = 4
            b.l.d.q.f.i.v$d$d$a$b$d r12 = r8.mo15556c(r7, r12, r13)
            r6.add(r12)
            java.util.Map r12 = java.lang.Thread.getAllStackTraces()
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x00c0:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00ed
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r14 = r13.getKey()
            java.lang.Thread r14 = (java.lang.Thread) r14
            boolean r16 = r14.equals(r7)
            if (r16 != 0) goto L_0x00c0
            b.l.d.q.f.n.d r3 = r8.f7446d
            java.lang.Object r13 = r13.getValue()
            java.lang.StackTraceElement[] r13 = (java.lang.StackTraceElement[]) r13
            java.lang.StackTraceElement[] r3 = r3.mo15793a(r13)
            r13 = 0
            b.l.d.q.f.i.v$d$d$a$b$d r3 = r8.mo15556c(r14, r3, r13)
            r6.add(r3)
            goto L_0x00c0
        L_0x00ed:
            r13 = 0
            b.l.d.q.f.i.w r3 = new b.l.d.q.f.i.w
            r3.<init>(r6)
            r6 = 8
            r7 = 4
            b.l.d.q.f.i.v$d$d$a$b$b r18 = r8.mo15554a(r10, r7, r6, r13)
            r6 = 0
            java.lang.Long r10 = java.lang.Long.valueOf(r6)
            java.lang.String r22 = ""
            if (r10 != 0) goto L_0x0107
            java.lang.String r12 = " address"
            goto L_0x0109
        L_0x0107:
            r12 = r22
        L_0x0109:
            boolean r13 = r12.isEmpty()
            java.lang.String r14 = "Missing required properties:"
            if (r13 == 0) goto L_0x0458
            b.l.d.q.f.i.o r19 = new b.l.d.q.f.i.o
            long r26 = r10.longValue()
            r28 = 0
            java.lang.String r24 = "0"
            java.lang.String r25 = "0"
            r23 = r19
            r23.<init>(r24, r25, r26, r28)
            r10 = 1
            b.l.d.q.f.i.v$d$d$a$b$a[] r10 = new p005b.p096l.p180d.p191q.p192f.p197i.C4129v.C4134d.C4140d.C4141a.C4143b.C4144a[r10]
            java.lang.Long r12 = java.lang.Long.valueOf(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            b.l.d.q.f.g.a r7 = r8.f7445c
            java.lang.String r7 = r7.f7299d
            java.lang.String r13 = "Null name"
            java.util.Objects.requireNonNull(r7, r13)
            b.l.d.q.f.g.a r13 = r8.f7445c
            java.lang.String r13 = r13.f7297b
            if (r12 != 0) goto L_0x0143
            java.lang.String r16 = " baseAddress"
            r31 = r14
            r14 = r16
            goto L_0x0147
        L_0x0143:
            r31 = r14
            r14 = r22
        L_0x0147:
            if (r6 != 0) goto L_0x014f
            java.lang.String r1 = " size"
            java.lang.String r14 = p005b.p035e.p036a.p037a.C0843a.m451l(r14, r1)
        L_0x014f:
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto L_0x044a
            b.l.d.q.f.i.m r1 = new b.l.d.q.f.i.m
            long r24 = r12.longValue()
            long r26 = r6.longValue()
            r30 = 0
            r23 = r1
            r28 = r7
            r29 = r13
            r23.<init>(r24, r26, r28, r29, r30)
            r6 = 0
            r10[r6] = r1
            b.l.d.q.f.i.w r1 = new b.l.d.q.f.i.w
            java.util.List r6 = java.util.Arrays.asList(r10)
            r1.<init>(r6)
            b.l.d.q.f.i.l r13 = new b.l.d.q.f.i.l
            r21 = 0
            r16 = r13
            r17 = r3
            r20 = r1
            r16.<init>(r17, r18, r19, r20, r21)
            if (r0 != 0) goto L_0x0188
            java.lang.String r1 = " uiOrientation"
            goto L_0x018a
        L_0x0188:
            r1 = r22
        L_0x018a:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x043c
            b.l.d.q.f.i.k r1 = new b.l.d.q.f.i.k
            int r16 = r0.intValue()
            r17 = 0
            r14 = 0
            r12 = r1
            r3 = r31
            r12.<init>(r13, r14, r15, r16, r17)
            android.content.Context r0 = r8.f7443a
            r6 = 2
            android.content.IntentFilter r7 = new android.content.IntentFilter     // Catch:{ IllegalStateException -> 0x01e0 }
            java.lang.String r10 = "android.intent.action.BATTERY_CHANGED"
            r7.<init>(r10)     // Catch:{ IllegalStateException -> 0x01e0 }
            r10 = 0
            android.content.Intent r0 = r0.registerReceiver(r10, r7)     // Catch:{ IllegalStateException -> 0x01e0 }
            if (r0 == 0) goto L_0x01de
            java.lang.String r7 = "status"
            r10 = -1
            int r7 = r0.getIntExtra(r7, r10)     // Catch:{ IllegalStateException -> 0x01e0 }
            if (r7 != r10) goto L_0x01ba
            goto L_0x01c0
        L_0x01ba:
            if (r7 == r6) goto L_0x01c2
            r12 = 5
            if (r7 != r12) goto L_0x01c0
            goto L_0x01c2
        L_0x01c0:
            r7 = 0
            goto L_0x01c3
        L_0x01c2:
            r7 = 1
        L_0x01c3:
            java.lang.String r12 = "level"
            int r12 = r0.getIntExtra(r12, r10)     // Catch:{ IllegalStateException -> 0x01dc }
            java.lang.String r13 = "scale"
            int r0 = r0.getIntExtra(r13, r10)     // Catch:{ IllegalStateException -> 0x01dc }
            if (r12 == r10) goto L_0x01f2
            if (r0 != r10) goto L_0x01d4
            goto L_0x01f2
        L_0x01d4:
            float r10 = (float) r12     // Catch:{ IllegalStateException -> 0x01dc }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x01dc }
            float r10 = r10 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r10)     // Catch:{ IllegalStateException -> 0x01dc }
            goto L_0x01f3
        L_0x01dc:
            r0 = move-exception
            goto L_0x01e2
        L_0x01de:
            r7 = 0
            goto L_0x01f2
        L_0x01e0:
            r0 = move-exception
            r7 = 0
        L_0x01e2:
            b.l.d.q.f.b r10 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            r12 = 6
            boolean r10 = r10.mo15495a(r12)
            if (r10 == 0) goto L_0x01f2
            java.lang.String r10 = "FirebaseCrashlytics"
            java.lang.String r12 = "An error occurred getting battery state."
            android.util.Log.e(r10, r12, r0)
        L_0x01f2:
            r0 = 0
        L_0x01f3:
            if (r0 == 0) goto L_0x01fe
            double r12 = r0.doubleValue()
            java.lang.Double r10 = java.lang.Double.valueOf(r12)
            goto L_0x01ff
        L_0x01fe:
            r10 = 0
        L_0x01ff:
            if (r7 == 0) goto L_0x0215
            if (r0 != 0) goto L_0x0204
            goto L_0x0215
        L_0x0204:
            float r0 = r0.floatValue()
            double r12 = (double) r0
            r14 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0213
            goto L_0x0216
        L_0x0213:
            r6 = 3
            goto L_0x0216
        L_0x0215:
            r6 = 1
        L_0x0216:
            android.content.Context r0 = r8.f7443a
            boolean r7 = p005b.p096l.p180d.p191q.p192f.p195g.C4004e.m7403k(r0)
            if (r7 == 0) goto L_0x021f
            goto L_0x0231
        L_0x021f:
            java.lang.String r7 = "sensor"
            java.lang.Object r0 = r0.getSystemService(r7)
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0
            r7 = 8
            android.hardware.Sensor r0 = r0.getDefaultSensor(r7)
            if (r0 == 0) goto L_0x0231
            r0 = 1
            goto L_0x0232
        L_0x0231:
            r0 = 0
        L_0x0232:
            long r12 = p005b.p096l.p180d.p191q.p192f.p195g.C4004e.m7401i()
            android.content.Context r7 = r8.f7443a
            android.app.ActivityManager$MemoryInfo r8 = new android.app.ActivityManager$MemoryInfo
            r8.<init>()
            java.lang.Object r7 = r7.getSystemService(r11)
            android.app.ActivityManager r7 = (android.app.ActivityManager) r7
            r7.getMemoryInfo(r8)
            long r7 = r8.availMem
            long r12 = r12 - r7
            java.io.File r7 = android.os.Environment.getDataDirectory()
            java.lang.String r7 = r7.getPath()
            android.os.StatFs r8 = new android.os.StatFs
            r8.<init>(r7)
            int r7 = r8.getBlockSize()
            long r14 = (long) r7
            int r7 = r8.getBlockCount()
            r31 = r3
            r11 = r4
            long r3 = (long) r7
            long r3 = r3 * r14
            int r7 = r8.getAvailableBlocks()
            long r7 = (long) r7
            long r14 = r14 * r7
            long r3 = r3 - r14
            b.l.d.q.f.i.r$b r7 = new b.l.d.q.f.i.r$b
            r7.<init>()
            r7.f7699a = r10
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.f7700b = r6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.f7701c = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r7.f7702d = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r7.f7703e = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r7.f7704f = r0
            b.l.d.q.f.i.v$d$d$b r17 = r7.mo15723a()
            java.lang.String r0 = " timestamp"
            if (r2 != 0) goto L_0x029a
            r3 = r0
            goto L_0x029c
        L_0x029a:
            r3 = r22
        L_0x029c:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x042e
            long r2 = r2.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            b.l.d.q.f.h.b r3 = r5.f7377d
            b.l.d.q.f.h.a r3 = r3.f7450c
            java.lang.String r3 = r3.mo15558b()
            if (r3 == 0) goto L_0x02bd
            b.l.d.q.f.i.s r4 = new b.l.d.q.f.i.s
            r6 = 0
            r4.<init>(r3, r6)
            r18 = r4
            goto L_0x02c7
        L_0x02bd:
            b.l.d.q.f.b r3 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            java.lang.String r4 = "No log data to include with this event."
            r3.mo15499e(r4)
            r3 = 0
            r18 = r3
        L_0x02c7:
            b.l.d.q.f.g.o0 r3 = r5.f7378e
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f7381a
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r6 = r3.size()
            r4.ensureCapacity(r6)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x02e3:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x030f
            java.lang.Object r6 = r3.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "Null key"
            java.util.Objects.requireNonNull(r7, r8)
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r8 = "Null value"
            java.util.Objects.requireNonNull(r6, r8)
            b.l.d.q.f.i.c r8 = new b.l.d.q.f.i.c
            r9 = 0
            r8.<init>(r7, r6, r9)
            r4.add(r8)
            goto L_0x02e3
        L_0x030f:
            b.l.d.q.f.g.l0 r3 = p005b.p096l.p180d.p191q.p192f.p195g.C4022l0.f7368g
            java.util.Collections.sort(r4, r3)
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x032b
            b.l.d.q.f.i.v$d$d$a$a r1 = r1.mo15666e()
            b.l.d.q.f.i.w r3 = new b.l.d.q.f.i.w
            r3.<init>(r4)
            b.l.d.q.f.i.k$b r1 = (p005b.p096l.p180d.p191q.p192f.p197i.C4104k.C4106b) r1
            r1.f7661b = r3
            b.l.d.q.f.i.v$d$d$a r1 = r1.mo15670a()
        L_0x032b:
            r16 = r1
            b.l.d.q.f.k.g r1 = r5.f7375b
            if (r2 != 0) goto L_0x0332
            goto L_0x0334
        L_0x0332:
            r0 = r22
        L_0x0334:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0420
            b.l.d.q.f.i.j r0 = new b.l.d.q.f.i.j
            long r13 = r2.longValue()
            r19 = 0
            java.lang.String r15 = "crash"
            r12 = r0
            r12.<init>(r13, r15, r16, r17, r18, r19)
            b.l.d.q.f.m.f r2 = r1.f7742f
            b.l.d.q.f.m.e r2 = (p005b.p096l.p180d.p191q.p192f.p202m.C4183e) r2
            b.l.d.q.f.m.j.d r2 = r2.mo15784b()
            b.l.d.q.f.m.j.c r2 = r2.mo15787a()
            int r2 = r2.f7769a
            java.io.File r3 = r1.mo15777f(r11)
            b.l.d.q.f.i.x.h r4 = p005b.p096l.p180d.p191q.p192f.p200k.C4174g.f7734i
            java.util.Objects.requireNonNull(r4)
            b.l.d.s.a r4 = p005b.p096l.p180d.p191q.p192f.p197i.p198x.C4163h.f7720a
            b.l.d.s.j.d r4 = (p005b.p096l.p180d.p208s.p210j.C4215d) r4
            java.util.Objects.requireNonNull(r4)
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            r4.mo15804a(r0, r5)     // Catch:{ IOException -> 0x036e }
        L_0x036e:
            java.lang.String r0 = r5.toString()
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f7737a
            int r1 = r1.getAndIncrement()
            java.util.Locale r4 = java.util.Locale.US
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6 = 0
            r5[r6] = r1
            java.lang.String r1 = "%010d"
            java.lang.String r1 = java.lang.String.format(r4, r1, r5)
            java.lang.String r4 = "event"
            java.lang.String r5 = "_"
            java.lang.String r1 = p005b.p035e.p036a.p037a.C0843a.m452m(r4, r1, r5)
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x039b }
            r4.<init>(r3, r1)     // Catch:{ IOException -> 0x039b }
            p005b.p096l.p180d.p191q.p192f.p200k.C4174g.m7711j(r4, r0)     // Catch:{ IOException -> 0x039b }
            goto L_0x03b2
        L_0x039b:
            r0 = move-exception
            b.l.d.q.f.b r1 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Could not persist event for session "
            r4.append(r5)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            r1.mo15501g(r4, r0)
        L_0x03b2:
            b.l.d.q.f.k.c r0 = p005b.p096l.p180d.p191q.p192f.p200k.C4170c.f7728a
            java.util.List r0 = p005b.p096l.p180d.p191q.p192f.p200k.C4174g.m7707e(r3, r0)
            b.l.d.q.f.k.d r1 = p005b.p096l.p180d.p191q.p192f.p200k.C4171d.f7729g
            java.util.Collections.sort(r0, r1)
            int r1 = r0.size()
            java.util.Iterator r0 = r0.iterator()
        L_0x03c5:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x03da
            java.lang.Object r3 = r0.next()
            java.io.File r3 = (java.io.File) r3
            if (r1 > r2) goto L_0x03d4
            goto L_0x03da
        L_0x03d4:
            p005b.p096l.p180d.p191q.p192f.p200k.C4174g.m7710i(r3)
            int r1 = r1 + -1
            goto L_0x03c5
        L_0x03da:
            r2 = r32
            b.l.d.q.f.g.q r0 = r2.f7373e
            java.util.Date r1 = r2.f7369a
            long r3 = r1.getTime()
            r0.mo15537d(r3)
            b.l.d.q.f.g.q r0 = r2.f7373e
            r1 = 0
            r0.mo15536c(r1)
            b.l.d.q.f.g.q r0 = r2.f7373e
            p005b.p096l.p180d.p191q.p192f.p195g.C4032q.m7430a(r0)
            b.l.d.q.f.g.q r0 = r2.f7373e
            b.l.d.q.f.g.c0 r0 = r0.f7389b
            boolean r0 = r0.mo15513a()
            if (r0 != 0) goto L_0x0402
            r0 = 0
            b.l.a.c.j.h r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2740P(r0)
            goto L_0x041f
        L_0x0402:
            b.l.d.q.f.g.q r0 = r2.f7373e
            b.l.d.q.f.g.f r0 = r0.f7392e
            java.util.concurrent.Executor r0 = r0.f7341a
            b.l.d.q.f.m.f r1 = r2.f7372d
            b.l.d.q.f.m.e r1 = (p005b.p096l.p180d.p191q.p192f.p202m.C4183e) r1
            java.util.concurrent.atomic.AtomicReference<b.l.a.c.j.i<b.l.d.q.f.m.j.a>> r1 = r1.f7766i
            java.lang.Object r1 = r1.get()
            b.l.a.c.j.i r1 = (p005b.p096l.p097a.p113c.p150j.C3429i) r1
            b.l.a.c.j.e0<TResult> r1 = r1.f6197a
            b.l.d.q.f.g.l r3 = new b.l.d.q.f.g.l
            r3.<init>(r2, r0)
            b.l.a.c.j.h r0 = r1.mo14693o(r0, r3)
        L_0x041f:
            return r0
        L_0x0420:
            r2 = r32
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r4 = r31
            java.lang.String r0 = p005b.p035e.p036a.p037a.C0843a.m451l(r4, r0)
            r1.<init>(r0)
            throw r1
        L_0x042e:
            r2 = r32
            r4 = r31
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p005b.p035e.p036a.p037a.C0843a.m451l(r4, r3)
            r0.<init>(r1)
            throw r0
        L_0x043c:
            r2 = r32
            r4 = r31
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p005b.p035e.p036a.p037a.C0843a.m451l(r4, r1)
            r0.<init>(r1)
            throw r0
        L_0x044a:
            r2 = r32
            r4 = r31
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p005b.p035e.p036a.p037a.C0843a.m451l(r4, r14)
            r0.<init>(r1)
            throw r0
        L_0x0458:
            r2 = r1
            r4 = r14
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p005b.p035e.p036a.p037a.C0843a.m451l(r4, r12)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p191q.p192f.p195g.C4023m.call():java.lang.Object");
    }
}
