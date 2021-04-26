package p005b.p051h.p052a.p055m.p058v;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.C0933e;
import p005b.p051h.p052a.C0934f;
import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p055m.C0976o;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0982s;
import p005b.p051h.p052a.p055m.p056u.C0987d;
import p005b.p051h.p052a.p055m.p056u.C0989e;
import p005b.p051h.p052a.p055m.p056u.C0991f;
import p005b.p051h.p052a.p055m.p058v.C1073g;
import p005b.p051h.p052a.p055m.p058v.C1084j;
import p005b.p051h.p052a.p055m.p058v.C1090l;
import p005b.p051h.p052a.p055m.p058v.C1097m;
import p005b.p051h.p052a.p055m.p058v.C1106q;
import p005b.p051h.p052a.p055m.p064x.p065c.C1245m;
import p005b.p051h.p052a.p078s.C1376f;
import p005b.p051h.p052a.p078s.p079k.C1382a;
import p005b.p051h.p052a.p078s.p079k.C1390d;

/* renamed from: b.h.a.m.v.i */
public class C1076i<R> implements C1073g.C1074a, Runnable, Comparable<C1076i<?>>, C1382a.C1386d {

    /* renamed from: A */
    public boolean f1196A;

    /* renamed from: B */
    public Object f1197B;

    /* renamed from: C */
    public Thread f1198C;

    /* renamed from: D */
    public C0974m f1199D;

    /* renamed from: E */
    public C0974m f1200E;

    /* renamed from: F */
    public Object f1201F;

    /* renamed from: G */
    public C0962a f1202G;

    /* renamed from: H */
    public C0987d<?> f1203H;

    /* renamed from: I */
    public volatile C1073g f1204I;

    /* renamed from: J */
    public volatile boolean f1205J;

    /* renamed from: K */
    public volatile boolean f1206K;

    /* renamed from: g */
    public final C1075h<R> f1207g = new C1075h<>();

    /* renamed from: h */
    public final List<Throwable> f1208h = new ArrayList();

    /* renamed from: i */
    public final C1390d f1209i = new C1390d.C1392b();

    /* renamed from: j */
    public final C1080d f1210j;

    /* renamed from: k */
    public final Pools.Pool<C1076i<?>> f1211k;

    /* renamed from: l */
    public final C1079c<?> f1212l = new C1079c<>();

    /* renamed from: m */
    public final C1081e f1213m = new C1081e();

    /* renamed from: n */
    public C0933e f1214n;

    /* renamed from: o */
    public C0974m f1215o;

    /* renamed from: p */
    public C0934f f1216p;

    /* renamed from: q */
    public C1104o f1217q;

    /* renamed from: r */
    public int f1218r;

    /* renamed from: s */
    public int f1219s;

    /* renamed from: t */
    public C1086k f1220t;

    /* renamed from: u */
    public C0979p f1221u;

    /* renamed from: v */
    public C1077a<R> f1222v;

    /* renamed from: w */
    public int f1223w;

    /* renamed from: x */
    public C1083g f1224x;

    /* renamed from: y */
    public C1082f f1225y;

    /* renamed from: z */
    public long f1226z;

    /* renamed from: b.h.a.m.v.i$a */
    public interface C1077a<R> {
    }

    /* renamed from: b.h.a.m.v.i$b */
    public final class C1078b<Z> implements C1084j.C1085a<Z> {

        /* renamed from: a */
        public final C0962a f1227a;

        public C1078b(C0962a aVar) {
            this.f1227a = aVar;
        }
    }

    /* renamed from: b.h.a.m.v.i$c */
    public static class C1079c<Z> {

        /* renamed from: a */
        public C0974m f1229a;

        /* renamed from: b */
        public C0982s<Z> f1230b;

        /* renamed from: c */
        public C1113v<Z> f1231c;
    }

    /* renamed from: b.h.a.m.v.i$d */
    public interface C1080d {
    }

    /* renamed from: b.h.a.m.v.i$e */
    public static class C1081e {

        /* renamed from: a */
        public boolean f1232a;

        /* renamed from: b */
        public boolean f1233b;

        /* renamed from: c */
        public boolean f1234c;

        /* renamed from: a */
        public final boolean mo10974a(boolean z) {
            return (this.f1234c || z || this.f1233b) && this.f1232a;
        }
    }

    /* renamed from: b.h.a.m.v.i$f */
    public enum C1082f {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: b.h.a.m.v.i$g */
    public enum C1083g {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public C1076i(C1080d dVar, Pools.Pool<C1076i<?>> pool) {
        this.f1210j = dVar;
        this.f1211k = pool;
    }

    public int compareTo(@NonNull Object obj) {
        C1076i iVar = (C1076i) obj;
        int ordinal = this.f1216p.ordinal() - iVar.f1216p.ordinal();
        return ordinal == 0 ? this.f1223w - iVar.f1223w : ordinal;
    }

    /* renamed from: d */
    public void mo10877d() {
        this.f1225y = C1082f.SWITCH_TO_SOURCE_SERVICE;
        ((C1097m) this.f1222v).mo10996h(this);
    }

    /* renamed from: e */
    public void mo10878e(C0974m mVar, Exception exc, C0987d<?> dVar, C0962a aVar) {
        dVar.mo10842b();
        C1108r rVar = new C1108r("Fetching data failed", (Throwable) exc);
        Class<?> a = dVar.mo10839a();
        rVar.f1330h = mVar;
        rVar.f1331i = aVar;
        rVar.f1332j = a;
        this.f1208h.add(rVar);
        if (Thread.currentThread() != this.f1198C) {
            this.f1225y = C1082f.SWITCH_TO_SOURCE_SERVICE;
            ((C1097m) this.f1222v).mo10996h(this);
            return;
        }
        mo10971v();
    }

    /* renamed from: i */
    public void mo10879i(C0974m mVar, Object obj, C0987d<?> dVar, C0962a aVar, C0974m mVar2) {
        this.f1199D = mVar;
        this.f1201F = obj;
        this.f1203H = dVar;
        this.f1202G = aVar;
        this.f1200E = mVar2;
        if (Thread.currentThread() != this.f1198C) {
            this.f1225y = C1082f.DECODE_DATA;
            ((C1097m) this.f1222v).mo10996h(this);
            return;
        }
        mo10964p();
    }

    @NonNull
    /* renamed from: k */
    public C1390d mo10935k() {
        return this.f1209i;
    }

    /* renamed from: l */
    public final <Data> C1115w<R> mo10962l(C0987d<?> dVar, Data data, C0962a aVar) {
        if (data == null) {
            dVar.mo10842b();
            return null;
        }
        try {
            int i = C1376f.f1793b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            C1115w<R> n = mo10963n(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                mo10968s("Decoded result " + n, elapsedRealtimeNanos, (String) null);
            }
            return n;
        } finally {
            dVar.mo10842b();
        }
    }

    /* renamed from: n */
    public final <Data> C1115w<R> mo10963n(Data data, C0962a aVar) {
        C0989e<?> b;
        C1112u<Data, ?, R> d = this.f1207g.mo10957d(data.getClass());
        C0979p pVar = this.f1221u;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = aVar == C0962a.RESOURCE_DISK_CACHE || this.f1207g.f1195r;
            C0976o oVar = C1245m.f1530i;
            Boolean bool = (Boolean) pVar.mo10833c(oVar);
            if (bool == null || (bool.booleanValue() && !z)) {
                pVar = new C0979p();
                pVar.mo10834d(this.f1221u);
                pVar.f1025b.put(oVar, Boolean.valueOf(z));
            }
        }
        C0979p pVar2 = pVar;
        C0991f fVar = this.f1214n.f864b.f882e;
        synchronized (fVar) {
            C0989e.C0990a<?> aVar2 = fVar.f1037a.get(data.getClass());
            if (aVar2 == null) {
                Iterator<C0989e.C0990a<?>> it = fVar.f1037a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0989e.C0990a<?> next = it.next();
                    if (next.mo10857a().isAssignableFrom(data.getClass())) {
                        aVar2 = next;
                        break;
                    }
                }
            }
            if (aVar2 == null) {
                aVar2 = C0991f.f1036b;
            }
            b = aVar2.mo10858b(data);
        }
        try {
            return d.mo11024a(b, pVar2, this.f1218r, this.f1219s, new C1078b(aVar));
        } finally {
            b.mo10856b();
        }
    }

    /* renamed from: p */
    public final void mo10964p() {
        C1115w<R> wVar;
        C1079c<?> cVar;
        boolean a;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f1226z;
            StringBuilder u = C0843a.m460u("data: ");
            u.append(this.f1201F);
            u.append(", cache key: ");
            u.append(this.f1199D);
            u.append(", fetcher: ");
            u.append(this.f1203H);
            mo10968s("Retrieved data", j, u.toString());
        }
        C1113v<R> vVar = null;
        try {
            wVar = mo10962l(this.f1203H, this.f1201F, this.f1202G);
        } catch (C1108r e) {
            C0974m mVar = this.f1200E;
            C0962a aVar = this.f1202G;
            e.f1330h = mVar;
            e.f1331i = aVar;
            e.f1332j = null;
            this.f1208h.add(e);
            wVar = null;
        }
        if (wVar != null) {
            C0962a aVar2 = this.f1202G;
            if (wVar instanceof C1110s) {
                ((C1110s) wVar).initialize();
            }
            if (this.f1212l.f1231c != null) {
                vVar = C1113v.m988c(wVar);
                wVar = vVar;
            }
            mo10973x();
            C1097m mVar2 = (C1097m) this.f1222v;
            synchronized (mVar2) {
                mVar2.f1301w = wVar;
                mVar2.f1302x = aVar2;
            }
            synchronized (mVar2) {
                mVar2.f1286h.mo11267a();
                if (mVar2.f1284D) {
                    mVar2.f1301w.recycle();
                    mVar2.mo10994f();
                } else if (mVar2.f1285g.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                } else if (!mVar2.f1303y) {
                    C1097m.C1100c cVar2 = mVar2.f1289k;
                    C1115w<?> wVar2 = mVar2.f1301w;
                    boolean z = mVar2.f1297s;
                    C0974m mVar3 = mVar2.f1296r;
                    C1106q.C1107a aVar3 = mVar2.f1287i;
                    Objects.requireNonNull(cVar2);
                    mVar2.f1282B = new C1106q(wVar2, z, true, mVar3, aVar3);
                    mVar2.f1303y = true;
                    C1097m.C1102e eVar = mVar2.f1285g;
                    Objects.requireNonNull(eVar);
                    ArrayList arrayList = new ArrayList(eVar.f1311g);
                    mVar2.mo10992d(arrayList.size() + 1);
                    C0974m mVar4 = mVar2.f1296r;
                    C1106q<?> qVar = mVar2.f1282B;
                    ((C1090l) mVar2.f1290l).mo10985e(mVar2, mVar4, qVar);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C1097m.C1101d dVar = (C1097m.C1101d) it.next();
                        dVar.f1310b.execute(new C1097m.C1099b(dVar.f1309a));
                    }
                    mVar2.mo10991c();
                } else {
                    throw new IllegalStateException("Already have resource");
                }
            }
            this.f1224x = C1083g.ENCODE;
            try {
                cVar = this.f1212l;
                if (cVar.f1231c != null) {
                    ((C1090l.C1095c) this.f1210j).mo10988a().mo10926a(cVar.f1229a, new C1072f(cVar.f1230b, cVar.f1231c, this.f1221u));
                    cVar.f1231c.mo11026d();
                }
                if (vVar != null) {
                    vVar.mo11026d();
                }
                C1081e eVar2 = this.f1213m;
                synchronized (eVar2) {
                    eVar2.f1233b = true;
                    a = eVar2.mo10974a(false);
                }
                if (a) {
                    mo10970u();
                }
            } catch (Throwable th) {
                if (vVar != null) {
                    vVar.mo11026d();
                }
                throw th;
            }
        } else {
            mo10971v();
        }
    }

    /* renamed from: q */
    public final C1073g mo10965q() {
        int ordinal = this.f1224x.ordinal();
        if (ordinal == 1) {
            return new C1116x(this.f1207g, this);
        }
        if (ordinal == 2) {
            return new C1043d(this.f1207g, this);
        }
        if (ordinal == 3) {
            return new C1020b0(this.f1207g, this);
        }
        if (ordinal == 5) {
            return null;
        }
        StringBuilder u = C0843a.m460u("Unrecognized stage: ");
        u.append(this.f1224x);
        throw new IllegalStateException(u.toString());
    }

    /* renamed from: r */
    public final C1083g mo10966r(C1083g gVar) {
        C1083g gVar2 = C1083g.RESOURCE_CACHE;
        C1083g gVar3 = C1083g.DATA_CACHE;
        C1083g gVar4 = C1083g.FINISHED;
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            return this.f1220t.mo10979b() ? gVar2 : mo10966r(gVar2);
        }
        if (ordinal == 1) {
            return this.f1220t.mo10978a() ? gVar3 : mo10966r(gVar3);
        }
        if (ordinal == 2) {
            return this.f1196A ? gVar4 : C1083g.SOURCE;
        }
        if (ordinal == 3 || ordinal == 5) {
            return gVar4;
        }
        throw new IllegalArgumentException("Unrecognized stage: " + gVar);
    }

    public void run() {
        C0987d<?> dVar = this.f1203H;
        try {
            if (this.f1206K) {
                mo10969t();
                if (dVar != null) {
                    dVar.mo10842b();
                    return;
                }
                return;
            }
            mo10972w();
            if (dVar != null) {
                dVar.mo10842b();
            }
        } catch (C1021c e) {
            throw e;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.mo10842b();
            }
            throw th;
        }
    }

    /* renamed from: s */
    public final void mo10968s(String str, long j, String str2) {
        StringBuilder y = C0843a.m464y(str, " in ");
        y.append(C1376f.m1460a(j));
        y.append(", load key: ");
        y.append(this.f1217q);
        y.append(str2 != null ? C0843a.m451l(", ", str2) : "");
        y.append(", thread: ");
        y.append(Thread.currentThread().getName());
        Log.v("DecodeJob", y.toString());
    }

    /* renamed from: t */
    public final void mo10969t() {
        boolean a;
        mo10973x();
        C1108r rVar = new C1108r("Failed to load resource", (List<Throwable>) new ArrayList(this.f1208h));
        C1097m mVar = (C1097m) this.f1222v;
        synchronized (mVar) {
            mVar.f1304z = rVar;
        }
        synchronized (mVar) {
            mVar.f1286h.mo11267a();
            if (mVar.f1284D) {
                mVar.mo10994f();
            } else if (mVar.f1285g.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else if (!mVar.f1281A) {
                mVar.f1281A = true;
                C0974m mVar2 = mVar.f1296r;
                C1097m.C1102e eVar = mVar.f1285g;
                Objects.requireNonNull(eVar);
                ArrayList arrayList = new ArrayList(eVar.f1311g);
                mVar.mo10992d(arrayList.size() + 1);
                ((C1090l) mVar.f1290l).mo10985e(mVar, mVar2, (C1106q<?>) null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C1097m.C1101d dVar = (C1097m.C1101d) it.next();
                    dVar.f1310b.execute(new C1097m.C1098a(dVar.f1309a));
                }
                mVar.mo10991c();
            } else {
                throw new IllegalStateException("Already failed once");
            }
        }
        C1081e eVar2 = this.f1213m;
        synchronized (eVar2) {
            eVar2.f1234c = true;
            a = eVar2.mo10974a(false);
        }
        if (a) {
            mo10970u();
        }
    }

    /* renamed from: u */
    public final void mo10970u() {
        C1081e eVar = this.f1213m;
        synchronized (eVar) {
            eVar.f1233b = false;
            eVar.f1232a = false;
            eVar.f1234c = false;
        }
        C1079c<?> cVar = this.f1212l;
        cVar.f1229a = null;
        cVar.f1230b = null;
        cVar.f1231c = null;
        C1075h<R> hVar = this.f1207g;
        hVar.f1180c = null;
        hVar.f1181d = null;
        hVar.f1191n = null;
        hVar.f1184g = null;
        hVar.f1188k = null;
        hVar.f1186i = null;
        hVar.f1192o = null;
        hVar.f1187j = null;
        hVar.f1193p = null;
        hVar.f1178a.clear();
        hVar.f1189l = false;
        hVar.f1179b.clear();
        hVar.f1190m = false;
        this.f1205J = false;
        this.f1214n = null;
        this.f1215o = null;
        this.f1221u = null;
        this.f1216p = null;
        this.f1217q = null;
        this.f1222v = null;
        this.f1224x = null;
        this.f1204I = null;
        this.f1198C = null;
        this.f1199D = null;
        this.f1201F = null;
        this.f1202G = null;
        this.f1203H = null;
        this.f1226z = 0;
        this.f1206K = false;
        this.f1197B = null;
        this.f1208h.clear();
        this.f1211k.release(this);
    }

    /* renamed from: v */
    public final void mo10971v() {
        this.f1198C = Thread.currentThread();
        int i = C1376f.f1793b;
        this.f1226z = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.f1206K && this.f1204I != null && !(z = this.f1204I.mo10875a())) {
            this.f1224x = mo10966r(this.f1224x);
            this.f1204I = mo10965q();
            if (this.f1224x == C1083g.SOURCE) {
                this.f1225y = C1082f.SWITCH_TO_SOURCE_SERVICE;
                ((C1097m) this.f1222v).mo10996h(this);
                return;
            }
        }
        if ((this.f1224x == C1083g.FINISHED || this.f1206K) && !z) {
            mo10969t();
        }
    }

    /* renamed from: w */
    public final void mo10972w() {
        int ordinal = this.f1225y.ordinal();
        if (ordinal == 0) {
            this.f1224x = mo10966r(C1083g.INITIALIZE);
            this.f1204I = mo10965q();
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                mo10964p();
                return;
            }
            StringBuilder u = C0843a.m460u("Unrecognized run reason: ");
            u.append(this.f1225y);
            throw new IllegalStateException(u.toString());
        }
        mo10971v();
    }

    /* renamed from: x */
    public final void mo10973x() {
        this.f1209i.mo11267a();
        if (this.f1205J) {
            throw new IllegalStateException("Already notified", this.f1208h.isEmpty() ? null : (Throwable) C0843a.m437M(this.f1208h, 1));
        }
        this.f1205J = true;
    }
}
