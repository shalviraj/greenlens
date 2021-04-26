package p005b.p051h.p052a.p055m.p058v;

import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.C0933e;
import p005b.p051h.p052a.C0934f;
import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0983t;
import p005b.p051h.p052a.p055m.p058v.C1014a;
import p005b.p051h.p052a.p055m.p058v.C1076i;
import p005b.p051h.p052a.p055m.p058v.C1106q;
import p005b.p051h.p052a.p055m.p058v.p060d0.C1044a;
import p005b.p051h.p052a.p055m.p058v.p060d0.C1047b;
import p005b.p051h.p052a.p055m.p058v.p060d0.C1051d;
import p005b.p051h.p052a.p055m.p058v.p060d0.C1053e;
import p005b.p051h.p052a.p055m.p058v.p060d0.C1054f;
import p005b.p051h.p052a.p055m.p058v.p060d0.C1056h;
import p005b.p051h.p052a.p055m.p058v.p060d0.C1057i;
import p005b.p051h.p052a.p055m.p058v.p061e0.C1067a;
import p005b.p051h.p052a.p074q.C1344f;
import p005b.p051h.p052a.p074q.C1345g;
import p005b.p051h.p052a.p078s.C1376f;
import p005b.p051h.p052a.p078s.p079k.C1382a;

/* renamed from: b.h.a.m.v.l */
public class C1090l implements C1103n, C1057i.C1058a, C1106q.C1107a {

    /* renamed from: i */
    public static final boolean f1254i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    public final C1111t f1255a;

    /* renamed from: b */
    public final C1105p f1256b;

    /* renamed from: c */
    public final C1057i f1257c;

    /* renamed from: d */
    public final C1093b f1258d;

    /* renamed from: e */
    public final C1118z f1259e;

    /* renamed from: f */
    public final C1095c f1260f;

    /* renamed from: g */
    public final C1091a f1261g;

    /* renamed from: h */
    public final C1014a f1262h;

    @VisibleForTesting
    /* renamed from: b.h.a.m.v.l$a */
    public static class C1091a {

        /* renamed from: a */
        public final C1076i.C1080d f1263a;

        /* renamed from: b */
        public final Pools.Pool<C1076i<?>> f1264b = C1382a.m1478a(150, new C1092a());

        /* renamed from: c */
        public int f1265c;

        /* renamed from: b.h.a.m.v.l$a$a */
        public class C1092a implements C1382a.C1384b<C1076i<?>> {
            public C1092a() {
            }

            /* renamed from: a */
            public Object mo10934a() {
                C1091a aVar = C1091a.this;
                return new C1076i(aVar.f1263a, aVar.f1264b);
            }
        }

        public C1091a(C1076i.C1080d dVar) {
            this.f1263a = dVar;
        }
    }

    @VisibleForTesting
    /* renamed from: b.h.a.m.v.l$b */
    public static class C1093b {

        /* renamed from: a */
        public final C1067a f1267a;

        /* renamed from: b */
        public final C1067a f1268b;

        /* renamed from: c */
        public final C1067a f1269c;

        /* renamed from: d */
        public final C1067a f1270d;

        /* renamed from: e */
        public final C1103n f1271e;

        /* renamed from: f */
        public final C1106q.C1107a f1272f;

        /* renamed from: g */
        public final Pools.Pool<C1097m<?>> f1273g = C1382a.m1478a(150, new C1094a());

        /* renamed from: b.h.a.m.v.l$b$a */
        public class C1094a implements C1382a.C1384b<C1097m<?>> {
            public C1094a() {
            }

            /* renamed from: a */
            public Object mo10934a() {
                C1093b bVar = C1093b.this;
                return new C1097m(bVar.f1267a, bVar.f1268b, bVar.f1269c, bVar.f1270d, bVar.f1271e, bVar.f1272f, bVar.f1273g);
            }
        }

        public C1093b(C1067a aVar, C1067a aVar2, C1067a aVar3, C1067a aVar4, C1103n nVar, C1106q.C1107a aVar5) {
            this.f1267a = aVar;
            this.f1268b = aVar2;
            this.f1269c = aVar3;
            this.f1270d = aVar4;
            this.f1271e = nVar;
            this.f1272f = aVar5;
        }
    }

    /* renamed from: b.h.a.m.v.l$c */
    public static class C1095c implements C1076i.C1080d {

        /* renamed from: a */
        public final C1044a.C1045a f1275a;

        /* renamed from: b */
        public volatile C1044a f1276b;

        public C1095c(C1044a.C1045a aVar) {
            this.f1275a = aVar;
        }

        /* renamed from: a */
        public C1044a mo10988a() {
            if (this.f1276b == null) {
                synchronized (this) {
                    if (this.f1276b == null) {
                        C1051d dVar = (C1051d) this.f1275a;
                        C1054f fVar = (C1054f) dVar.f1141b;
                        File cacheDir = fVar.f1147a.getCacheDir();
                        C1053e eVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else if (fVar.f1148b != null) {
                            cacheDir = new File(cacheDir, fVar.f1148b);
                        }
                        if (cacheDir != null) {
                            if (!cacheDir.mkdirs()) {
                                if (cacheDir.exists()) {
                                    if (!cacheDir.isDirectory()) {
                                    }
                                }
                            }
                            eVar = new C1053e(cacheDir, dVar.f1140a);
                        }
                        this.f1276b = eVar;
                    }
                    if (this.f1276b == null) {
                        this.f1276b = new C1047b();
                    }
                }
            }
            return this.f1276b;
        }
    }

    /* renamed from: b.h.a.m.v.l$d */
    public class C1096d {

        /* renamed from: a */
        public final C1097m<?> f1277a;

        /* renamed from: b */
        public final C1344f f1278b;

        public C1096d(C1344f fVar, C1097m<?> mVar) {
            this.f1278b = fVar;
            this.f1277a = mVar;
        }
    }

    public C1090l(C1057i iVar, C1044a.C1045a aVar, C1067a aVar2, C1067a aVar3, C1067a aVar4, C1067a aVar5, boolean z) {
        this.f1257c = iVar;
        C1095c cVar = new C1095c(aVar);
        this.f1260f = cVar;
        C1014a aVar6 = new C1014a(z);
        this.f1262h = aVar6;
        synchronized (this) {
            synchronized (aVar6) {
                aVar6.f1073d = this;
            }
        }
        this.f1256b = new C1105p();
        this.f1255a = new C1111t();
        this.f1258d = new C1093b(aVar2, aVar3, aVar4, aVar5, this, this);
        this.f1261g = new C1091a(cVar);
        this.f1259e = new C1118z();
        ((C1056h) iVar).f1149d = this;
    }

    /* renamed from: d */
    public static void m955d(String str, long j, C0974m mVar) {
        StringBuilder y = C0843a.m464y(str, " in ");
        y.append(C1376f.m1460a(j));
        y.append("ms, key: ");
        y.append(mVar);
        Log.v("Engine", y.toString());
    }

    /* renamed from: a */
    public void mo10982a(C0974m mVar, C1106q<?> qVar) {
        C1014a aVar = this.f1262h;
        synchronized (aVar) {
            C1014a.C1017b remove = aVar.f1071b.remove(mVar);
            if (remove != null) {
                remove.f1077c = null;
                remove.clear();
            }
        }
        if (qVar.f1321g) {
            C1115w wVar = (C1115w) ((C1056h) this.f1257c).mo11253d(mVar, qVar);
        } else {
            this.f1259e.mo11028a(qVar, false);
        }
    }

    /* renamed from: b */
    public <R> C1096d mo10983b(C0933e eVar, Object obj, C0974m mVar, int i, int i2, Class<?> cls, Class<R> cls2, C0934f fVar, C1086k kVar, Map<Class<?>, C0983t<?>> map, boolean z, boolean z2, C0979p pVar, boolean z3, boolean z4, boolean z5, boolean z6, C1344f fVar2, Executor executor) {
        long j;
        if (f1254i) {
            int i3 = C1376f.f1793b;
            j = SystemClock.elapsedRealtimeNanos();
        } else {
            j = 0;
        }
        long j2 = j;
        Objects.requireNonNull(this.f1256b);
        C1104o oVar = new C1104o(obj, mVar, i, i2, map, cls, cls2, pVar);
        synchronized (this) {
            C1106q<?> c = mo10984c(oVar, z3, j2);
            if (c == null) {
                C1096d g = mo10987g(eVar, obj, mVar, i, i2, cls, cls2, fVar, kVar, map, z, z2, pVar, z3, z4, z5, z6, fVar2, executor, oVar, j2);
                return g;
            }
            ((C1345g) fVar2).mo11206n(c, C0962a.MEMORY_CACHE);
            return null;
        }
    }

    @Nullable
    /* renamed from: c */
    public final C1106q<?> mo10984c(C1104o oVar, boolean z, long j) {
        C1106q<?> qVar;
        Y remove;
        C1106q<?> qVar2;
        if (!z) {
            return null;
        }
        C1014a aVar = this.f1262h;
        synchronized (aVar) {
            C1014a.C1017b bVar = aVar.f1071b.get(oVar);
            if (bVar == null) {
                qVar = null;
            } else {
                qVar = (C1106q) bVar.get();
                if (qVar == null) {
                    aVar.mo10871b(bVar);
                }
            }
        }
        if (qVar != null) {
            qVar.mo11006c();
        }
        if (qVar != null) {
            if (f1254i) {
                m955d("Loaded resource from active resources", j, oVar);
            }
            return qVar;
        }
        C1056h hVar = (C1056h) this.f1257c;
        synchronized (hVar) {
            remove = hVar.f1794a.remove(oVar);
            if (remove != null) {
                hVar.f1796c -= (long) hVar.mo10930b(remove);
            }
        }
        C1115w wVar = (C1115w) remove;
        if (wVar == null) {
            qVar2 = null;
        } else {
            qVar2 = wVar instanceof C1106q ? (C1106q) wVar : new C1106q<>(wVar, true, true, oVar, this);
        }
        if (qVar2 != null) {
            qVar2.mo11006c();
            this.f1262h.mo10870a(oVar, qVar2);
        }
        if (qVar2 == null) {
            return null;
        }
        if (f1254i) {
            m955d("Loaded resource from cache", j, oVar);
        }
        return qVar2;
    }

    /* renamed from: e */
    public synchronized void mo10985e(C1097m<?> mVar, C0974m mVar2, C1106q<?> qVar) {
        if (qVar != null) {
            if (qVar.f1321g) {
                this.f1262h.mo10870a(mVar2, qVar);
            }
        }
        C1111t tVar = this.f1255a;
        Objects.requireNonNull(tVar);
        Map<C0974m, C1097m<?>> a = tVar.mo11023a(mVar.f1300v);
        if (mVar.equals(a.get(mVar2))) {
            a.remove(mVar2);
        }
    }

    /* renamed from: f */
    public void mo10986f(C1115w<?> wVar) {
        if (wVar instanceof C1106q) {
            ((C1106q) wVar).mo11007d();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ec  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> p005b.p051h.p052a.p055m.p058v.C1090l.C1096d mo10987g(p005b.p051h.p052a.C0933e r17, java.lang.Object r18, p005b.p051h.p052a.p055m.C0974m r19, int r20, int r21, java.lang.Class<?> r22, java.lang.Class<R> r23, p005b.p051h.p052a.C0934f r24, p005b.p051h.p052a.p055m.p058v.C1086k r25, java.util.Map<java.lang.Class<?>, p005b.p051h.p052a.p055m.C0983t<?>> r26, boolean r27, boolean r28, p005b.p051h.p052a.p055m.C0979p r29, boolean r30, boolean r31, boolean r32, boolean r33, p005b.p051h.p052a.p074q.C1344f r34, java.util.concurrent.Executor r35, p005b.p051h.p052a.p055m.p058v.C1104o r36, long r37) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r24
            r7 = r25
            r8 = r29
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            r13 = r37
            b.h.a.m.v.t r15 = r1.f1255a
            if (r9 == 0) goto L_0x0023
            java.util.Map<b.h.a.m.m, b.h.a.m.v.m<?>> r15 = r15.f1337b
            goto L_0x0025
        L_0x0023:
            java.util.Map<b.h.a.m.m, b.h.a.m.v.m<?>> r15 = r15.f1336a
        L_0x0025:
            java.lang.Object r15 = r15.get(r12)
            b.h.a.m.v.m r15 = (p005b.p051h.p052a.p055m.p058v.C1097m) r15
            if (r15 == 0) goto L_0x003f
            r15.mo10989a(r10, r11)
            boolean r0 = f1254i
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "Added to existing load"
            m955d(r0, r13, r12)
        L_0x0039:
            b.h.a.m.v.l$d r0 = new b.h.a.m.v.l$d
            r0.<init>(r10, r15)
            return r0
        L_0x003f:
            b.h.a.m.v.l$b r15 = r1.f1258d
            androidx.core.util.Pools$Pool<b.h.a.m.v.m<?>> r15 = r15.f1273g
            java.lang.Object r15 = r15.acquire()
            b.h.a.m.v.m r15 = (p005b.p051h.p052a.p055m.p058v.C1097m) r15
            java.lang.String r13 = "Argument must not be null"
            java.util.Objects.requireNonNull(r15, r13)
            monitor-enter(r15)
            r15.f1296r = r12     // Catch:{ all -> 0x0116 }
            r13 = r30
            r15.f1297s = r13     // Catch:{ all -> 0x0116 }
            r13 = r31
            r15.f1298t = r13     // Catch:{ all -> 0x0116 }
            r13 = r32
            r15.f1299u = r13     // Catch:{ all -> 0x0116 }
            r15.f1300v = r9     // Catch:{ all -> 0x0116 }
            monitor-exit(r15)
            b.h.a.m.v.l$a r13 = r1.f1261g
            androidx.core.util.Pools$Pool<b.h.a.m.v.i<?>> r14 = r13.f1264b
            java.lang.Object r14 = r14.acquire()
            b.h.a.m.v.i r14 = (p005b.p051h.p052a.p055m.p058v.C1076i) r14
            java.lang.String r10 = "Argument must not be null"
            java.util.Objects.requireNonNull(r14, r10)
            int r10 = r13.f1265c
            int r11 = r10 + 1
            r13.f1265c = r11
            b.h.a.m.v.h<R> r11 = r14.f1207g
            b.h.a.m.v.i$d r13 = r14.f1210j
            r11.f1180c = r0
            r11.f1181d = r2
            r11.f1191n = r3
            r11.f1182e = r4
            r11.f1183f = r5
            r11.f1193p = r7
            r1 = r22
            r11.f1184g = r1
            r11.f1185h = r13
            r1 = r23
            r11.f1188k = r1
            r11.f1192o = r6
            r11.f1186i = r8
            r1 = r26
            r11.f1187j = r1
            r1 = r27
            r11.f1194q = r1
            r1 = r28
            r11.f1195r = r1
            r14.f1214n = r0
            r14.f1215o = r3
            r14.f1216p = r6
            r14.f1217q = r12
            r14.f1218r = r4
            r14.f1219s = r5
            r14.f1220t = r7
            r14.f1196A = r9
            r14.f1221u = r8
            r14.f1222v = r15
            r14.f1223w = r10
            b.h.a.m.v.i$f r0 = p005b.p051h.p052a.p055m.p058v.C1076i.C1082f.INITIALIZE
            r14.f1225y = r0
            r14.f1197B = r2
            r1 = r16
            b.h.a.m.v.t r0 = r1.f1255a
            java.util.Objects.requireNonNull(r0)
            boolean r2 = r15.f1300v
            java.util.Map r0 = r0.mo11023a(r2)
            r0.put(r12, r15)
            r0 = r34
            r2 = r35
            r15.mo10989a(r0, r2)
            monitor-enter(r15)
            r15.f1283C = r14     // Catch:{ all -> 0x0113 }
            b.h.a.m.v.i$g r2 = p005b.p051h.p052a.p055m.p058v.C1076i.C1083g.INITIALIZE     // Catch:{ all -> 0x0113 }
            b.h.a.m.v.i$g r2 = r14.mo10966r(r2)     // Catch:{ all -> 0x0113 }
            b.h.a.m.v.i$g r3 = p005b.p051h.p052a.p055m.p058v.C1076i.C1083g.RESOURCE_CACHE     // Catch:{ all -> 0x0113 }
            if (r2 == r3) goto L_0x00e6
            b.h.a.m.v.i$g r3 = p005b.p051h.p052a.p055m.p058v.C1076i.C1083g.DATA_CACHE     // Catch:{ all -> 0x0113 }
            if (r2 != r3) goto L_0x00e4
            goto L_0x00e6
        L_0x00e4:
            r2 = 0
            goto L_0x00e7
        L_0x00e6:
            r2 = 1
        L_0x00e7:
            if (r2 == 0) goto L_0x00ec
            b.h.a.m.v.e0.a r2 = r15.f1291m     // Catch:{ all -> 0x0113 }
            goto L_0x00fc
        L_0x00ec:
            boolean r2 = r15.f1298t     // Catch:{ all -> 0x0113 }
            if (r2 == 0) goto L_0x00f3
            b.h.a.m.v.e0.a r2 = r15.f1293o     // Catch:{ all -> 0x0113 }
            goto L_0x00fc
        L_0x00f3:
            boolean r2 = r15.f1299u     // Catch:{ all -> 0x0113 }
            if (r2 == 0) goto L_0x00fa
            b.h.a.m.v.e0.a r2 = r15.f1294p     // Catch:{ all -> 0x0113 }
            goto L_0x00fc
        L_0x00fa:
            b.h.a.m.v.e0.a r2 = r15.f1292n     // Catch:{ all -> 0x0113 }
        L_0x00fc:
            java.util.concurrent.ExecutorService r2 = r2.f1168g     // Catch:{ all -> 0x0113 }
            r2.execute(r14)     // Catch:{ all -> 0x0113 }
            monitor-exit(r15)
            boolean r2 = f1254i
            if (r2 == 0) goto L_0x010d
            java.lang.String r2 = "Started new load"
            r3 = r37
            m955d(r2, r3, r12)
        L_0x010d:
            b.h.a.m.v.l$d r2 = new b.h.a.m.v.l$d
            r2.<init>(r0, r15)
            return r2
        L_0x0113:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x0116:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p055m.p058v.C1090l.mo10987g(b.h.a.e, java.lang.Object, b.h.a.m.m, int, int, java.lang.Class, java.lang.Class, b.h.a.f, b.h.a.m.v.k, java.util.Map, boolean, boolean, b.h.a.m.p, boolean, boolean, boolean, boolean, b.h.a.q.f, java.util.concurrent.Executor, b.h.a.m.v.o, long):b.h.a.m.v.l$d");
    }
}
