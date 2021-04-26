package p005b.p051h.p052a.p055m.p058v;

import android.os.SystemClock;
import android.util.Log;
import java.util.Collections;
import java.util.List;
import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.C0965d;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p055m.p056u.C0987d;
import p005b.p051h.p052a.p055m.p058v.C1073g;
import p005b.p051h.p052a.p055m.p062w.C1161n;
import p005b.p051h.p052a.p078s.C1376f;

/* renamed from: b.h.a.m.v.b0 */
public class C1020b0 implements C1073g, C1073g.C1074a {

    /* renamed from: g */
    public final C1075h<?> f1081g;

    /* renamed from: h */
    public final C1073g.C1074a f1082h;

    /* renamed from: i */
    public int f1083i;

    /* renamed from: j */
    public C1043d f1084j;

    /* renamed from: k */
    public Object f1085k;

    /* renamed from: l */
    public volatile C1161n.C1162a<?> f1086l;

    /* renamed from: m */
    public C1066e f1087m;

    public C1020b0(C1075h<?> hVar, C1073g.C1074a aVar) {
        this.f1081g = hVar;
        this.f1082h = aVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public boolean mo10875a() {
        Object obj = this.f1085k;
        if (obj != null) {
            this.f1085k = null;
            int i = C1376f.f1793b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                C0965d<X> e = this.f1081g.mo10958e(obj);
                C1072f fVar = new C1072f(e, obj, this.f1081g.f1186i);
                C0974m mVar = this.f1086l.f1409a;
                C1075h<?> hVar = this.f1081g;
                this.f1087m = new C1066e(mVar, hVar.f1191n);
                hVar.mo10955b().mo10926a(this.f1087m, fVar);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f1087m + ", data: " + obj + ", encoder: " + e + ", duration: " + C1376f.m1460a(elapsedRealtimeNanos));
                }
                this.f1086l.f1411c.mo10842b();
                this.f1084j = new C1043d(Collections.singletonList(this.f1086l.f1409a), this.f1081g, this);
            } catch (Throwable th) {
                this.f1086l.f1411c.mo10842b();
                throw th;
            }
        }
        C1043d dVar = this.f1084j;
        if (dVar != null && dVar.mo10875a()) {
            return true;
        }
        this.f1084j = null;
        this.f1086l = null;
        boolean z = false;
        while (!z) {
            if (!(this.f1083i < this.f1081g.mo10956c().size())) {
                break;
            }
            List<C1161n.C1162a<?>> c = this.f1081g.mo10956c();
            int i2 = this.f1083i;
            this.f1083i = i2 + 1;
            this.f1086l = c.get(i2);
            if (this.f1086l != null && (this.f1081g.f1193p.mo10980c(this.f1086l.f1411c.mo10846e()) || this.f1081g.mo10960g(this.f1086l.f1411c.mo10839a()))) {
                this.f1086l.f1411c.mo10847f(this.f1081g.f1192o, new C1018a0(this, this.f1086l));
                z = true;
            }
        }
        return z;
    }

    public void cancel() {
        C1161n.C1162a<?> aVar = this.f1086l;
        if (aVar != null) {
            aVar.f1411c.cancel();
        }
    }

    /* renamed from: d */
    public void mo10877d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public void mo10878e(C0974m mVar, Exception exc, C0987d<?> dVar, C0962a aVar) {
        this.f1082h.mo10878e(mVar, exc, dVar, this.f1086l.f1411c.mo10846e());
    }

    /* renamed from: i */
    public void mo10879i(C0974m mVar, Object obj, C0987d<?> dVar, C0962a aVar, C0974m mVar2) {
        this.f1082h.mo10879i(mVar, obj, dVar, this.f1086l.f1411c.mo10846e(), mVar);
    }
}
