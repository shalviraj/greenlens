package p376j.p377a;

import java.io.Closeable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: j.a.b */
public class C7001b {

    /* renamed from: k */
    public static final Logger f14051k = Logger.getLogger(C7001b.class.getName());

    /* renamed from: l */
    public static final C7008c<C7004c<?>, Object> f14052l;

    /* renamed from: m */
    public static final C7001b f14053m;

    /* renamed from: g */
    public C7003b f14054g = new C7006e((C7000a) null);

    /* renamed from: h */
    public final C7002a f14055h;

    /* renamed from: i */
    public final C7008c<C7004c<?>, Object> f14056i;

    /* renamed from: j */
    public final int f14057j;

    /* renamed from: j.a.b$a */
    public static final class C7002a extends C7001b implements Closeable {

        /* renamed from: n */
        public boolean f14058n;

        /* renamed from: o */
        public Throwable f14059o;

        /* renamed from: H */
        public boolean mo24387H(Throwable th) {
            boolean z;
            synchronized (this) {
                z = true;
                if (!this.f14058n) {
                    this.f14058n = true;
                    this.f14059o = th;
                } else {
                    z = false;
                }
            }
            if (z) {
                mo24386z();
            }
            return z;
        }

        public void close() {
            mo24387H((Throwable) null);
        }

        /* renamed from: d */
        public boolean mo24384d() {
            return true;
        }

        /* renamed from: q */
        public void mo24385q(C7001b bVar) {
            throw null;
        }
    }

    /* renamed from: j.a.b$b */
    public interface C7003b {
    }

    /* renamed from: j.a.b$c */
    public static final class C7004c<T> {

        /* renamed from: a */
        public final String f14060a;

        public C7004c(String str) {
            Objects.requireNonNull(str, "name");
            this.f14060a = str;
        }

        public String toString() {
            return this.f14060a;
        }
    }

    /* renamed from: j.a.b$d */
    public static final class C7005d {

        /* renamed from: a */
        public static final C7007f f14061a;

        static {
            C7007f fVar;
            AtomicReference atomicReference = new AtomicReference();
            try {
                fVar = (C7007f) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(C7007f.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                atomicReference.set(e);
                fVar = new C7013d();
            } catch (Exception e2) {
                throw new RuntimeException("Storage override failed to initialize", e2);
            }
            f14061a = fVar;
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                C7001b.f14051k.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }
    }

    /* renamed from: j.a.b$e */
    public final class C7006e implements C7003b {
        public C7006e(C7000a aVar) {
        }
    }

    /* renamed from: j.a.b$f */
    public static abstract class C7007f {
        /* renamed from: a */
        public abstract C7001b mo24390a();

        /* renamed from: b */
        public abstract void mo24391b(C7001b bVar, C7001b bVar2);

        /* renamed from: c */
        public C7001b mo24392c(C7001b bVar) {
            mo24390a();
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }
    }

    static {
        C7008c<C7004c<?>, Object> cVar = new C7008c<>();
        f14052l = cVar;
        f14053m = new C7001b((C7001b) null, cVar);
    }

    public C7001b(C7001b bVar, C7008c<C7004c<?>, Object> cVar) {
        C7002a aVar = null;
        this.f14055h = bVar != null ? bVar instanceof C7002a ? (C7002a) bVar : bVar.f14055h : aVar;
        this.f14056i = cVar;
        int i = bVar == null ? 0 : bVar.f14057j + 1;
        this.f14057j = i;
        if (i == 1000) {
            f14051k.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", new Exception());
        }
    }

    /* renamed from: e */
    public static C7001b m12593e() {
        C7001b a = C7005d.f14061a.mo24390a();
        return a == null ? f14053m : a;
    }

    /* renamed from: d */
    public boolean mo24384d() {
        return this.f14055h != null;
    }

    /* renamed from: q */
    public void mo24385q(C7001b bVar) {
        Objects.requireNonNull(bVar, "toAttach");
        C7005d.f14061a.mo24391b(this, bVar);
    }

    /* renamed from: z */
    public void mo24386z() {
        if (mo24384d()) {
            synchronized (this) {
            }
        }
    }
}
