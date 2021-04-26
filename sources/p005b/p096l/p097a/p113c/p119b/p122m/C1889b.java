package p005b.p096l.p097a.p113c.p119b.p122m;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.C1758d;
import p005b.p096l.p097a.p113c.p119b.C1763f;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1817g;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1874w0;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1877x0;
import p005b.p096l.p097a.p113c.p119b.p122m.C1922k;
import p005b.p096l.p097a.p113c.p119b.p122m.C1933o;
import p005b.p096l.p097a.p113c.p119b.p122m.C1936p;
import p005b.p096l.p097a.p113c.p131e.p135d.C2020d;
import p005b.p096l.p097a.p113c.p131e.p136e.C2385oi;

/* renamed from: b.l.a.c.b.m.b */
public abstract class C1889b<T extends IInterface> {

    /* renamed from: A */
    public static final C1758d[] f3365A = new C1758d[0];

    /* renamed from: a */
    public int f3366a;

    /* renamed from: b */
    public long f3367b;

    /* renamed from: c */
    public long f3368c;

    /* renamed from: d */
    public int f3369d;

    /* renamed from: e */
    public long f3370e;

    /* renamed from: f */
    public C1918i0 f3371f;

    /* renamed from: g */
    public final Context f3372g;

    /* renamed from: h */
    public final C1922k f3373h;

    /* renamed from: i */
    public final C1763f f3374i;

    /* renamed from: j */
    public final Handler f3375j;

    /* renamed from: k */
    public final Object f3376k = new Object();

    /* renamed from: l */
    public final Object f3377l = new Object();

    /* renamed from: m */
    public C1936p f3378m;

    /* renamed from: n */
    public C1892c f3379n;

    /* renamed from: o */
    public T f3380o;

    /* renamed from: p */
    public final ArrayList<C1896g<?>> f3381p = new ArrayList<>();

    /* renamed from: q */
    public C1899j f3382q;

    /* renamed from: r */
    public int f3383r = 1;

    /* renamed from: s */
    public final C1890a f3384s;

    /* renamed from: t */
    public final C1891b f3385t;

    /* renamed from: u */
    public final int f3386u;

    /* renamed from: v */
    public final String f3387v;

    /* renamed from: w */
    public C1754b f3388w = null;

    /* renamed from: x */
    public boolean f3389x = false;

    /* renamed from: y */
    public volatile C1904c0 f3390y = null;

    /* renamed from: z */
    public AtomicInteger f3391z = new AtomicInteger(0);

    /* renamed from: b.l.a.c.b.m.b$a */
    public interface C1890a {
        /* renamed from: g */
        void mo12219g(int i);

        /* renamed from: k */
        void mo12220k(@Nullable Bundle bundle);
    }

    /* renamed from: b.l.a.c.b.m.b$b */
    public interface C1891b {
        /* renamed from: n */
        void mo12221n(@NonNull C1754b bVar);
    }

    /* renamed from: b.l.a.c.b.m.b$c */
    public interface C1892c {
        /* renamed from: a */
        void mo12112a(@NonNull C1754b bVar);
    }

    /* renamed from: b.l.a.c.b.m.b$d */
    public class C1893d implements C1892c {
        public C1893d() {
        }

        /* renamed from: a */
        public void mo12112a(@NonNull C1754b bVar) {
            if (bVar.mo11986W()) {
                C1889b bVar2 = C1889b.this;
                bVar2.mo12203j((C1929n) null, bVar2.mo12189A());
                return;
            }
            C1891b bVar3 = C1889b.this.f3385t;
            if (bVar3 != null) {
                bVar3.mo12221n(bVar);
            }
        }
    }

    /* renamed from: b.l.a.c.b.m.b$e */
    public interface C1894e {
    }

    /* renamed from: b.l.a.c.b.m.b$f */
    public abstract class C1895f extends C1896g<Boolean> {

        /* renamed from: d */
        public final int f3393d;

        /* renamed from: e */
        public final Bundle f3394e;

        @BinderThread
        public C1895f(int i, Bundle bundle) {
            super(Boolean.TRUE);
            this.f3393d = i;
            this.f3394e = bundle;
        }

        /* JADX WARNING: type inference failed for: r5v12, types: [android.os.Parcelable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo12222b(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                int r5 = r4.f3393d
                r0 = 1
                r1 = 0
                if (r5 == 0) goto L_0x0056
                r2 = 10
                if (r5 == r2) goto L_0x0026
                b.l.a.c.b.m.b r5 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                r5.mo12196H(r0, r1)
                android.os.Bundle r5 = r4.f3394e
                if (r5 == 0) goto L_0x001e
                java.lang.String r0 = "pendingIntent"
                android.os.Parcelable r5 = r5.getParcelable(r0)
                r1 = r5
                android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            L_0x001e:
                b.l.a.c.b.b r5 = new b.l.a.c.b.b
                int r0 = r4.f3393d
                r5.<init>(r0, r1)
                goto L_0x0068
            L_0x0026:
                b.l.a.c.b.m.b r5 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                r5.mo12196H(r0, r1)
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                java.lang.Class r3 = r4.getClass()
                java.lang.String r3 = r3.getSimpleName()
                r1[r2] = r3
                b.l.a.c.b.m.b r2 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                java.lang.String r2 = r2.mo12192D()
                r1[r0] = r2
                r0 = 2
                b.l.a.c.b.m.b r2 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                java.lang.String r2 = r2.mo12191C()
                r1[r0] = r2
                java.lang.String r0 = "A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. "
                java.lang.String r0 = java.lang.String.format(r0, r1)
                r5.<init>(r0)
                throw r5
            L_0x0056:
                boolean r5 = r4.mo12225e()
                if (r5 != 0) goto L_0x006b
                b.l.a.c.b.m.b r5 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                r5.mo12196H(r0, r1)
                b.l.a.c.b.b r5 = new b.l.a.c.b.b
                r0 = 8
                r5.<init>(r0, r1)
            L_0x0068:
                r4.mo12224d(r5)
            L_0x006b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p119b.p122m.C1889b.C1895f.mo12222b(java.lang.Object):void");
        }

        /* renamed from: c */
        public final void mo12223c() {
        }

        /* renamed from: d */
        public abstract void mo12224d(C1754b bVar);

        /* renamed from: e */
        public abstract boolean mo12225e();
    }

    /* renamed from: b.l.a.c.b.m.b$g */
    public abstract class C1896g<TListener> {

        /* renamed from: a */
        public TListener f3396a;

        /* renamed from: b */
        public boolean f3397b = false;

        public C1896g(TListener tlistener) {
            this.f3396a = tlistener;
        }

        /* renamed from: a */
        public final void mo12226a() {
            synchronized (this) {
                this.f3396a = null;
            }
            synchronized (C1889b.this.f3381p) {
                C1889b.this.f3381p.remove(this);
            }
        }

        /* renamed from: b */
        public abstract void mo12222b(TListener tlistener);

        /* renamed from: c */
        public abstract void mo12223c();
    }

    /* renamed from: b.l.a.c.b.m.b$h */
    public final class C1897h extends C2020d {
        public C1897h(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public static boolean m2625a(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
            if (r0 == 5) goto L_0x0031;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r8) {
            /*
                r7 = this;
                b.l.a.c.b.m.b r0 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.f3391z
                int r0 = r0.get()
                int r1 = r8.arg1
                if (r0 == r1) goto L_0x001d
                boolean r0 = m2625a(r8)
                if (r0 == 0) goto L_0x001c
                java.lang.Object r8 = r8.obj
                b.l.a.c.b.m.b$g r8 = (p005b.p096l.p097a.p113c.p119b.p122m.C1889b.C1896g) r8
                r8.mo12223c()
                r8.mo12226a()
            L_0x001c:
                return
            L_0x001d:
                int r0 = r8.what
                r1 = 4
                r2 = 1
                r3 = 5
                if (r0 == r2) goto L_0x0031
                r4 = 7
                if (r0 == r4) goto L_0x0031
                if (r0 != r1) goto L_0x002f
                b.l.a.c.b.m.b r0 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                java.util.Objects.requireNonNull(r0)
                goto L_0x0031
            L_0x002f:
                if (r0 != r3) goto L_0x0044
            L_0x0031:
                b.l.a.c.b.m.b r0 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                boolean r0 = r0.mo12207o()
                if (r0 != 0) goto L_0x0044
                java.lang.Object r8 = r8.obj
                b.l.a.c.b.m.b$g r8 = (p005b.p096l.p097a.p113c.p119b.p122m.C1889b.C1896g) r8
                r8.mo12223c()
                r8.mo12226a()
                return
            L_0x0044:
                int r0 = r8.what
                r4 = 8
                r5 = 3
                r6 = 0
                if (r0 != r1) goto L_0x007e
                b.l.a.c.b.m.b r0 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                b.l.a.c.b.b r1 = new b.l.a.c.b.b
                int r8 = r8.arg2
                r1.<init>(r8)
                r0.f3388w = r1
                boolean r8 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.m2582K(r0)
                if (r8 == 0) goto L_0x0067
                b.l.a.c.b.m.b r8 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                boolean r0 = r8.f3389x
                if (r0 != 0) goto L_0x0067
                r8.mo12196H(r5, r6)
                return
            L_0x0067:
                b.l.a.c.b.m.b r8 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                b.l.a.c.b.b r0 = r8.f3388w
                if (r0 == 0) goto L_0x006e
                goto L_0x0073
            L_0x006e:
                b.l.a.c.b.b r0 = new b.l.a.c.b.b
                r0.<init>(r4)
            L_0x0073:
                b.l.a.c.b.m.b$c r8 = r8.f3379n
                r8.mo12112a(r0)
                b.l.a.c.b.m.b r8 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                r8.mo12194F(r0)
                return
            L_0x007e:
                if (r0 != r3) goto L_0x0097
                b.l.a.c.b.m.b r8 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                b.l.a.c.b.b r0 = r8.f3388w
                if (r0 == 0) goto L_0x0087
                goto L_0x008c
            L_0x0087:
                b.l.a.c.b.b r0 = new b.l.a.c.b.b
                r0.<init>(r4)
            L_0x008c:
                b.l.a.c.b.m.b$c r8 = r8.f3379n
                r8.mo12112a(r0)
                b.l.a.c.b.m.b r8 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                r8.mo12194F(r0)
                return
            L_0x0097:
                if (r0 != r5) goto L_0x00b6
                java.lang.Object r0 = r8.obj
                boolean r1 = r0 instanceof android.app.PendingIntent
                if (r1 == 0) goto L_0x00a2
                r6 = r0
                android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            L_0x00a2:
                b.l.a.c.b.b r0 = new b.l.a.c.b.b
                int r8 = r8.arg2
                r0.<init>(r8, r6)
                b.l.a.c.b.m.b r8 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                b.l.a.c.b.m.b$c r8 = r8.f3379n
                r8.mo12112a(r0)
                b.l.a.c.b.m.b r8 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                r8.mo12194F(r0)
                return
            L_0x00b6:
                r1 = 6
                if (r0 != r1) goto L_0x00db
                b.l.a.c.b.m.b r0 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                r0.mo12196H(r3, r6)
                b.l.a.c.b.m.b r0 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                b.l.a.c.b.m.b$a r0 = r0.f3384s
                if (r0 == 0) goto L_0x00c9
                int r1 = r8.arg2
                r0.mo12219g(r1)
            L_0x00c9:
                b.l.a.c.b.m.b r0 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                int r8 = r8.arg2
                r0.f3366a = r8
                long r4 = java.lang.System.currentTimeMillis()
                r0.f3367b = r4
                b.l.a.c.b.m.b r8 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                p005b.p096l.p097a.p113c.p119b.p122m.C1889b.m2581J(r8, r3, r2, r6)
                return
            L_0x00db:
                r1 = 2
                if (r0 != r1) goto L_0x00f1
                b.l.a.c.b.m.b r0 = p005b.p096l.p097a.p113c.p119b.p122m.C1889b.this
                boolean r0 = r0.mo12198a()
                if (r0 != 0) goto L_0x00f1
                java.lang.Object r8 = r8.obj
                b.l.a.c.b.m.b$g r8 = (p005b.p096l.p097a.p113c.p119b.p122m.C1889b.C1896g) r8
                r8.mo12223c()
                r8.mo12226a()
                return
            L_0x00f1:
                boolean r0 = m2625a(r8)
                if (r0 == 0) goto L_0x0145
                java.lang.Object r8 = r8.obj
                r0 = r8
                b.l.a.c.b.m.b$g r0 = (p005b.p096l.p097a.p113c.p119b.p122m.C1889b.C1896g) r0
                monitor-enter(r0)
                TListener r8 = r0.f3396a     // Catch:{ all -> 0x0142 }
                boolean r1 = r0.f3397b     // Catch:{ all -> 0x0142 }
                if (r1 == 0) goto L_0x0128
                java.lang.String r1 = "GmsClient"
                java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0142 }
                int r4 = r3.length()     // Catch:{ all -> 0x0142 }
                int r4 = r4 + 47
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
                r5.<init>(r4)     // Catch:{ all -> 0x0142 }
                java.lang.String r4 = "Callback proxy "
                r5.append(r4)     // Catch:{ all -> 0x0142 }
                r5.append(r3)     // Catch:{ all -> 0x0142 }
                java.lang.String r3 = " being reused. This is not safe."
                r5.append(r3)     // Catch:{ all -> 0x0142 }
                java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0142 }
                android.util.Log.w(r1, r3)     // Catch:{ all -> 0x0142 }
            L_0x0128:
                monitor-exit(r0)     // Catch:{ all -> 0x0142 }
                if (r8 == 0) goto L_0x0134
                r0.mo12222b(r8)     // Catch:{ RuntimeException -> 0x012f }
                goto L_0x0137
            L_0x012f:
                r8 = move-exception
                r0.mo12223c()
                throw r8
            L_0x0134:
                r0.mo12223c()
            L_0x0137:
                monitor-enter(r0)
                r0.f3397b = r2     // Catch:{ all -> 0x013f }
                monitor-exit(r0)     // Catch:{ all -> 0x013f }
                r0.mo12226a()
                return
            L_0x013f:
                r8 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x013f }
                throw r8
            L_0x0142:
                r8 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0142 }
                throw r8
            L_0x0145:
                java.lang.String r0 = "GmsClient"
                int r8 = r8.what
                r1 = 45
                java.lang.String r2 = "Don't know how to handle message: "
                java.lang.String r8 = p005b.p035e.p036a.p037a.C0843a.m438N(r1, r2, r8)
                java.lang.Exception r1 = new java.lang.Exception
                r1.<init>()
                android.util.Log.wtf(r0, r8, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p119b.p122m.C1889b.C1897h.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: b.l.a.c.b.m.b$i */
    public static final class C1898i extends C1933o.C1934a {

        /* renamed from: a */
        public C1889b f3400a;

        /* renamed from: b */
        public final int f3401b;

        public C1898i(@NonNull C1889b bVar, int i) {
            this.f3400a = bVar;
            this.f3401b = i;
        }

        @BinderThread
        /* renamed from: k1 */
        public final void mo12228k1(int i, @NonNull IBinder iBinder, @Nullable Bundle bundle) {
            C0823f.m380l(this.f3400a, "onPostInitComplete can be called only once per call to getRemoteService");
            C1889b bVar = this.f3400a;
            int i2 = this.f3401b;
            Handler handler = bVar.f3375j;
            handler.sendMessage(handler.obtainMessage(1, i2, -1, new C1901l(i, iBinder, bundle)));
            this.f3400a = null;
        }
    }

    /* renamed from: b.l.a.c.b.m.b$j */
    public final class C1899j implements ServiceConnection {

        /* renamed from: a */
        public final int f3402a;

        public C1899j(int i) {
            this.f3402a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1889b bVar = C1889b.this;
            if (iBinder == null) {
                C1889b.m2580I(bVar);
                return;
            }
            synchronized (bVar.f3377l) {
                C1889b bVar2 = C1889b.this;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                bVar2.f3378m = (queryLocalInterface == null || !(queryLocalInterface instanceof C1936p)) ? new C1936p.C1937a.C1938a(iBinder) : (C1936p) queryLocalInterface;
            }
            C1889b bVar3 = C1889b.this;
            int i = this.f3402a;
            Handler handler = bVar3.f3375j;
            handler.sendMessage(handler.obtainMessage(7, i, -1, new C1900k(0)));
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            C1889b bVar;
            synchronized (C1889b.this.f3377l) {
                bVar = C1889b.this;
                bVar.f3378m = null;
            }
            Handler handler = bVar.f3375j;
            handler.sendMessage(handler.obtainMessage(6, this.f3402a, 1));
        }
    }

    /* renamed from: b.l.a.c.b.m.b$k */
    public final class C1900k extends C1895f {
        @BinderThread
        public C1900k(int i) {
            super(i, (Bundle) null);
        }

        /* renamed from: d */
        public final void mo12224d(C1754b bVar) {
            Objects.requireNonNull(C1889b.this);
            C1889b.this.f3379n.mo12112a(bVar);
            C1889b.this.mo12194F(bVar);
        }

        /* renamed from: e */
        public final boolean mo12225e() {
            C1889b.this.f3379n.mo12112a(C1754b.f3093k);
            return true;
        }
    }

    /* renamed from: b.l.a.c.b.m.b$l */
    public final class C1901l extends C1895f {

        /* renamed from: g */
        public final IBinder f3405g;

        @BinderThread
        public C1901l(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f3405g = iBinder;
        }

        /* renamed from: d */
        public final void mo12224d(C1754b bVar) {
            C1891b bVar2 = C1889b.this.f3385t;
            if (bVar2 != null) {
                bVar2.mo12221n(bVar);
            }
            C1889b.this.mo12194F(bVar);
        }

        /* renamed from: e */
        public final boolean mo12225e() {
            try {
                String interfaceDescriptor = this.f3405g.getInterfaceDescriptor();
                if (!C1889b.this.mo12191C().equals(interfaceDescriptor)) {
                    String C = C1889b.this.mo12191C();
                    StringBuilder sb = new StringBuilder(String.valueOf(interfaceDescriptor).length() + String.valueOf(C).length() + 34);
                    sb.append("service descriptor mismatch: ");
                    sb.append(C);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface w = C1889b.this.mo12215w(this.f3405g);
                if (w == null || (!C1889b.m2581J(C1889b.this, 2, 4, w) && !C1889b.m2581J(C1889b.this, 3, 4, w))) {
                    return false;
                }
                C1889b bVar = C1889b.this;
                bVar.f3388w = null;
                C1890a aVar = bVar.f3384s;
                if (aVar == null) {
                    return true;
                }
                aVar.mo12220k((Bundle) null);
                return true;
            } catch (RemoteException unused) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    public C1889b(Context context, Looper looper, C1922k kVar, C1763f fVar, int i, C1890a aVar, C1891b bVar, String str) {
        C0823f.m380l(context, "Context must not be null");
        this.f3372g = context;
        C0823f.m380l(looper, "Looper must not be null");
        Looper looper2 = looper;
        C0823f.m380l(kVar, "Supervisor must not be null");
        this.f3373h = kVar;
        C0823f.m380l(fVar, "API availability must not be null");
        this.f3374i = fVar;
        this.f3375j = new C1897h(looper);
        this.f3386u = i;
        this.f3384s = aVar;
        this.f3385t = bVar;
        this.f3387v = str;
    }

    /* renamed from: I */
    public static void m2580I(C1889b bVar) {
        boolean z;
        int i;
        synchronized (bVar.f3376k) {
            z = bVar.f3383r == 3;
        }
        if (z) {
            i = 5;
            bVar.f3389x = true;
        } else {
            i = 4;
        }
        Handler handler = bVar.f3375j;
        handler.sendMessage(handler.obtainMessage(i, bVar.f3391z.get(), 16));
    }

    /* renamed from: J */
    public static boolean m2581J(C1889b bVar, int i, int i2, IInterface iInterface) {
        boolean z;
        synchronized (bVar.f3376k) {
            if (bVar.f3383r != i) {
                z = false;
            } else {
                bVar.mo12196H(i2, iInterface);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: K */
    public static boolean m2582K(C1889b bVar) {
        if (bVar.f3389x || TextUtils.isEmpty(bVar.mo12191C()) || TextUtils.isEmpty((CharSequence) null)) {
            return false;
        }
        try {
            Class.forName(bVar.mo12191C());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: A */
    public Set<Scope> mo12189A() {
        return Collections.EMPTY_SET;
    }

    /* renamed from: B */
    public final T mo12190B() {
        T t;
        synchronized (this.f3376k) {
            if (this.f3383r == 5) {
                throw new DeadObjectException();
            } else if (mo12198a()) {
                C0823f.m386o(this.f3380o != null, "Client is connected but service is null");
                t = this.f3380o;
            } else {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        }
        return t;
    }

    @NonNull
    /* renamed from: C */
    public abstract String mo12191C();

    @NonNull
    /* renamed from: D */
    public abstract String mo12192D();

    /* renamed from: E */
    public String mo12193E() {
        return "com.google.android.gms";
    }

    @CallSuper
    /* renamed from: F */
    public void mo12194F(C1754b bVar) {
        this.f3369d = bVar.f3095h;
        this.f3370e = System.currentTimeMillis();
    }

    /* renamed from: G */
    public void mo12195G(int i, T t) {
    }

    /* renamed from: H */
    public final void mo12196H(int i, T t) {
        C1918i0 i0Var;
        C0823f.m360b((i == 4) == (t != null));
        synchronized (this.f3376k) {
            this.f3383r = i;
            this.f3380o = t;
            mo12195G(i, t);
            if (i == 1) {
                C1899j jVar = this.f3382q;
                if (jVar != null) {
                    C1922k kVar = this.f3373h;
                    C1918i0 i0Var2 = this.f3371f;
                    String str = i0Var2.f3454a;
                    String str2 = i0Var2.f3455b;
                    String L = mo12197L();
                    Objects.requireNonNull(kVar);
                    kVar.mo12246c(new C1922k.C1923a(str, str2, 129), jVar, L);
                    this.f3382q = null;
                }
            } else if (i == 2 || i == 3) {
                if (!(this.f3382q == null || (i0Var = this.f3371f) == null)) {
                    String str3 = i0Var.f3454a;
                    String str4 = i0Var.f3455b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(str3);
                    sb.append(" on ");
                    sb.append(str4);
                    Log.e("GmsClient", sb.toString());
                    C1922k kVar2 = this.f3373h;
                    C1918i0 i0Var3 = this.f3371f;
                    String str5 = i0Var3.f3454a;
                    String str6 = i0Var3.f3455b;
                    C1899j jVar2 = this.f3382q;
                    String L2 = mo12197L();
                    Objects.requireNonNull(kVar2);
                    kVar2.mo12246c(new C1922k.C1923a(str5, str6, 129), jVar2, L2);
                    this.f3391z.incrementAndGet();
                }
                this.f3382q = new C1899j(this.f3391z.get());
                String E = mo12193E();
                String D = mo12192D();
                this.f3371f = new C1918i0(E, D, false, false);
                C1922k kVar3 = this.f3373h;
                C1899j jVar3 = this.f3382q;
                String L3 = mo12197L();
                Objects.requireNonNull(this.f3371f);
                if (!kVar3.mo12245b(new C1922k.C1923a(D, E, 129, false), jVar3, L3)) {
                    C1918i0 i0Var4 = this.f3371f;
                    String str7 = i0Var4.f3454a;
                    String str8 = i0Var4.f3455b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str7).length() + 34 + String.valueOf(str8).length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(str7);
                    sb2.append(" on ");
                    sb2.append(str8);
                    Log.e("GmsClient", sb2.toString());
                    int i2 = this.f3391z.get();
                    Handler handler = this.f3375j;
                    handler.sendMessage(handler.obtainMessage(7, i2, -1, new C1900k(16)));
                }
            } else if (i == 4) {
                this.f3368c = System.currentTimeMillis();
            }
        }
    }

    @Nullable
    /* renamed from: L */
    public final String mo12197L() {
        String str = this.f3387v;
        return str == null ? this.f3372g.getClass().getName() : str;
    }

    /* renamed from: a */
    public boolean mo12198a() {
        boolean z;
        synchronized (this.f3376k) {
            z = this.f3383r == 4;
        }
        return z;
    }

    /* renamed from: b */
    public void mo12199b() {
        this.f3391z.incrementAndGet();
        synchronized (this.f3381p) {
            int size = this.f3381p.size();
            for (int i = 0; i < size; i++) {
                C1896g gVar = this.f3381p.get(i);
                synchronized (gVar) {
                    gVar.f3396a = null;
                }
            }
            this.f3381p.clear();
        }
        synchronized (this.f3377l) {
            this.f3378m = null;
        }
        mo12196H(1, (IInterface) null);
    }

    /* renamed from: e */
    public void mo12200e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        T t;
        C1936p pVar;
        synchronized (this.f3376k) {
            i = this.f3383r;
            t = this.f3380o;
        }
        synchronized (this.f3377l) {
            pVar = this.f3378m;
        }
        printWriter.append(str).append("mConnectState=");
        printWriter.print(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append(mo12191C()).append("@").append(Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (pVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(pVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f3368c > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f3368c;
            String format = simpleDateFormat.format(new Date(this.f3368c));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.f3367b > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.f3366a;
            printWriter.append(i2 != 1 ? i2 != 2 ? String.valueOf(i2) : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED");
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f3367b;
            String format2 = simpleDateFormat.format(new Date(this.f3367b));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.f3370e > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C0823f.m344M(this.f3369d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f3370e;
            String format3 = simpleDateFormat.format(new Date(this.f3370e));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    /* renamed from: f */
    public void mo12201f(@NonNull C1894e eVar) {
        C1877x0 x0Var = (C1877x0) eVar;
        C1817g.this.f3191j.post(new C1874w0(x0Var));
    }

    /* renamed from: h */
    public boolean mo12202h() {
        return false;
    }

    @WorkerThread
    /* renamed from: j */
    public void mo12203j(C1929n nVar, Set<Scope> set) {
        Bundle z = mo12218z();
        C1915h hVar = new C1915h(this.f3386u);
        hVar.f3436j = this.f3372g.getPackageName();
        hVar.f3439m = z;
        if (set != null) {
            hVar.f3438l = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo12212t()) {
            hVar.f3440n = mo12216x() != null ? mo12216x() : new Account("<<default account>>", "com.google");
            if (nVar != null) {
                hVar.f3437k = nVar.asBinder();
            }
        }
        hVar.f3441o = f3365A;
        hVar.f3442p = mo12217y();
        try {
            synchronized (this.f3377l) {
                C1936p pVar = this.f3378m;
                if (pVar != null) {
                    pVar.mo12266f0(new C1898i(this, this.f3391z.get()), hVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            Handler handler = this.f3375j;
            handler.sendMessage(handler.obtainMessage(6, this.f3391z.get(), 1));
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            int i = this.f3391z.get();
            Handler handler2 = this.f3375j;
            handler2.sendMessage(handler2.obtainMessage(1, i, -1, new C1901l(8, (IBinder) null, (Bundle) null)));
        }
    }

    /* renamed from: k */
    public /* bridge */ /* synthetic */ C2385oi mo12204k() {
        return (C2385oi) mo12190B();
    }

    /* renamed from: m */
    public boolean mo12205m() {
        return true;
    }

    /* renamed from: n */
    public abstract int mo12206n();

    /* renamed from: o */
    public boolean mo12207o() {
        boolean z;
        synchronized (this.f3376k) {
            int i = this.f3383r;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Nullable
    /* renamed from: p */
    public final C1758d[] mo12208p() {
        C1904c0 c0Var = this.f3390y;
        if (c0Var == null) {
            return null;
        }
        return c0Var.f3410h;
    }

    /* renamed from: q */
    public String mo12209q() {
        C1918i0 i0Var;
        if (mo12198a() && (i0Var = this.f3371f) != null) {
            return i0Var.f3455b;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: r */
    public void mo12210r(@NonNull C1892c cVar) {
        C0823f.m380l(cVar, "Connection progress callbacks cannot be null.");
        this.f3379n = cVar;
        mo12196H(2, (IInterface) null);
    }

    /* renamed from: s */
    public Intent mo12211s() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* renamed from: t */
    public boolean mo12212t() {
        return false;
    }

    /* renamed from: u */
    public Bundle mo12213u() {
        return null;
    }

    /* renamed from: v */
    public void mo12214v() {
        int b = this.f3374i.mo12004b(this.f3372g, mo12206n());
        if (b != 0) {
            mo12196H(1, (IInterface) null);
            C1893d dVar = new C1893d();
            C0823f.m380l(dVar, "Connection progress callbacks cannot be null.");
            this.f3379n = dVar;
            Handler handler = this.f3375j;
            handler.sendMessage(handler.obtainMessage(3, this.f3391z.get(), b, (Object) null));
            return;
        }
        mo12210r(new C1893d());
    }

    @Nullable
    /* renamed from: w */
    public abstract T mo12215w(IBinder iBinder);

    /* renamed from: x */
    public Account mo12216x() {
        return null;
    }

    /* renamed from: y */
    public C1758d[] mo12217y() {
        return f3365A;
    }

    /* renamed from: z */
    public Bundle mo12218z() {
        return new Bundle();
    }
}
