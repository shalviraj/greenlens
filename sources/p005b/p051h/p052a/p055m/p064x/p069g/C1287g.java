package p005b.p051h.p052a.p055m.p064x.p069g;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p005b.p051h.p052a.C0929c;
import p005b.p051h.p052a.C0941h;
import p005b.p051h.p052a.C0943i;
import p005b.p051h.p052a.p054l.C0956a;
import p005b.p051h.p052a.p055m.C0983t;
import p005b.p051h.p052a.p055m.p058v.C1086k;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1025d;
import p005b.p051h.p052a.p074q.C1342d;
import p005b.p051h.p052a.p074q.C1343e;
import p005b.p051h.p052a.p074q.p075h.C1349c;
import p005b.p051h.p052a.p074q.p076i.C1362d;
import p005b.p051h.p052a.p077r.C1366b;
import p005b.p051h.p052a.p078s.C1373e;

/* renamed from: b.h.a.m.x.g.g */
public class C1287g {

    /* renamed from: a */
    public final C0956a f1606a;

    /* renamed from: b */
    public final Handler f1607b;

    /* renamed from: c */
    public final List<C1289b> f1608c = new ArrayList();

    /* renamed from: d */
    public final C0943i f1609d;

    /* renamed from: e */
    public final C1025d f1610e;

    /* renamed from: f */
    public boolean f1611f;

    /* renamed from: g */
    public boolean f1612g;

    /* renamed from: h */
    public C0941h<Bitmap> f1613h;

    /* renamed from: i */
    public C1288a f1614i;

    /* renamed from: j */
    public boolean f1615j;

    /* renamed from: k */
    public C1288a f1616k;

    /* renamed from: l */
    public Bitmap f1617l;

    /* renamed from: m */
    public C0983t<Bitmap> f1618m;

    /* renamed from: n */
    public C1288a f1619n;

    /* renamed from: o */
    public int f1620o;

    /* renamed from: p */
    public int f1621p;

    /* renamed from: q */
    public int f1622q;

    @VisibleForTesting
    /* renamed from: b.h.a.m.x.g.g$a */
    public static class C1288a extends C1349c<Bitmap> {

        /* renamed from: j */
        public final Handler f1623j;

        /* renamed from: k */
        public final int f1624k;

        /* renamed from: l */
        public final long f1625l;

        /* renamed from: m */
        public Bitmap f1626m;

        public C1288a(Handler handler, int i, long j) {
            this.f1623j = handler;
            this.f1624k = i;
            this.f1625l = j;
        }

        /* renamed from: b */
        public void mo10649b(@NonNull Object obj, @Nullable C1362d dVar) {
            this.f1626m = (Bitmap) obj;
            this.f1623j.sendMessageAtTime(this.f1623j.obtainMessage(1, this), this.f1625l);
        }

        /* renamed from: g */
        public void mo10650g(@Nullable Drawable drawable) {
            this.f1626m = null;
        }
    }

    /* renamed from: b.h.a.m.x.g.g$b */
    public interface C1289b {
        /* renamed from: a */
        void mo11114a();
    }

    /* renamed from: b.h.a.m.x.g.g$c */
    public class C1290c implements Handler.Callback {
        public C1290c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C1287g.this.mo11135b((C1288a) message.obj);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                C1287g.this.f1609d.mo10775n((C1288a) message.obj);
                return false;
            }
        }
    }

    public C1287g(C0929c cVar, C0956a aVar, int i, int i2, C0983t<Bitmap> tVar, Bitmap bitmap) {
        C1025d dVar = cVar.f839g;
        C0943i d = C0929c.m654d(cVar.f841i.getBaseContext());
        C0941h<Bitmap> A = C0929c.m654d(cVar.f841i.getBaseContext()).mo10412l().mo10382a(((C1343e) ((C1343e) ((C1343e) new C1343e().mo10387g(C1086k.f1251a)).mo10399y(true)).mo10397t(true)).mo10393o(i, i2));
        this.f1609d = d;
        Handler handler = new Handler(Looper.getMainLooper(), new C1290c());
        this.f1610e = dVar;
        this.f1607b = handler;
        this.f1613h = A;
        this.f1606a = aVar;
        mo11136c(tVar, bitmap);
    }

    /* renamed from: a */
    public final void mo11134a() {
        if (this.f1611f && !this.f1612g) {
            C1288a aVar = this.f1619n;
            if (aVar != null) {
                this.f1619n = null;
                mo11135b(aVar);
                return;
            }
            this.f1612g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f1606a.mo10812e());
            this.f1606a.mo10809c();
            this.f1616k = new C1288a(this.f1607b, this.f1606a.mo10807a(), uptimeMillis);
            C0941h<Bitmap> G = this.f1613h.mo10382a((C1343e) new C1343e().mo10396s(new C1366b(Double.valueOf(Math.random())))).mo10404G(this.f1606a);
            C1288a aVar2 = this.f1616k;
            Objects.requireNonNull(G);
            G.mo10770D(aVar2, (C1342d<Bitmap>) null, G, C1373e.f1789a);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    public void mo11135b(C1288a aVar) {
        this.f1612g = false;
        if (this.f1615j) {
            this.f1607b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f1611f) {
            this.f1619n = aVar;
        } else {
            if (aVar.f1626m != null) {
                Bitmap bitmap = this.f1617l;
                if (bitmap != null) {
                    this.f1610e.mo10896e(bitmap);
                    this.f1617l = null;
                }
                C1288a aVar2 = this.f1614i;
                this.f1614i = aVar;
                int size = this.f1608c.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f1608c.get(size).mo11114a();
                }
                if (aVar2 != null) {
                    this.f1607b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            mo11134a();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [b.h.a.m.t<android.graphics.Bitmap>, b.h.a.m.t, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11136c(p005b.p051h.p052a.p055m.C0983t<android.graphics.Bitmap> r4, android.graphics.Bitmap r5) {
        /*
            r3 = this;
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r4, r0)
            r3.f1618m = r4
            java.util.Objects.requireNonNull(r5, r0)
            r3.f1617l = r5
            b.h.a.h<android.graphics.Bitmap> r0 = r3.f1613h
            b.h.a.q.e r1 = new b.h.a.q.e
            r1.<init>()
            r2 = 1
            b.h.a.q.a r4 = r1.mo11178v(r4, r2)
            b.h.a.h r4 = r0.mo10382a(r4)
            r3.f1613h = r4
            int r4 = p005b.p051h.p052a.p078s.C1380j.m1471d(r5)
            r3.f1620o = r4
            int r4 = r5.getWidth()
            r3.f1621p = r4
            int r4 = r5.getHeight()
            r3.f1622q = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p055m.p064x.p069g.C1287g.mo11136c(b.h.a.m.t, android.graphics.Bitmap):void");
    }
}
