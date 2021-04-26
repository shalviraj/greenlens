package p005b.p051h.p052a.p055m.p058v;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p055m.p058v.C1106q;

/* renamed from: b.h.a.m.v.a */
public final class C1014a {

    /* renamed from: a */
    public final boolean f1070a;
    @VisibleForTesting

    /* renamed from: b */
    public final Map<C0974m, C1017b> f1071b = new HashMap();

    /* renamed from: c */
    public final ReferenceQueue<C1106q<?>> f1072c = new ReferenceQueue<>();

    /* renamed from: d */
    public C1106q.C1107a f1073d;

    /* renamed from: b.h.a.m.v.a$a */
    public class C1015a implements ThreadFactory {

        /* renamed from: b.h.a.m.v.a$a$a */
        public class C1016a implements Runnable {

            /* renamed from: g */
            public final /* synthetic */ Runnable f1074g;

            public C1016a(C1015a aVar, Runnable runnable) {
                this.f1074g = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f1074g.run();
            }
        }

        public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(new C1016a(this, runnable), "glide-active-resources");
        }
    }

    @VisibleForTesting
    /* renamed from: b.h.a.m.v.a$b */
    public static final class C1017b extends WeakReference<C1106q<?>> {

        /* renamed from: a */
        public final C0974m f1075a;

        /* renamed from: b */
        public final boolean f1076b;
        @Nullable

        /* renamed from: c */
        public C1115w<?> f1077c;

        public C1017b(@NonNull C0974m mVar, @NonNull C1106q<?> qVar, @NonNull ReferenceQueue<? super C1106q<?>> referenceQueue, boolean z) {
            super(qVar, referenceQueue);
            C1115w<Z> wVar;
            Objects.requireNonNull(mVar, "Argument must not be null");
            this.f1075a = mVar;
            if (!qVar.f1321g || !z) {
                wVar = null;
            } else {
                wVar = qVar.f1323i;
                Objects.requireNonNull(wVar, "Argument must not be null");
            }
            this.f1077c = wVar;
            this.f1076b = qVar.f1321g;
        }
    }

    public C1014a(boolean z) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new C1015a());
        this.f1070a = z;
        newSingleThreadExecutor.execute(new C1019b(this));
    }

    /* renamed from: a */
    public synchronized void mo10870a(C0974m mVar, C1106q<?> qVar) {
        C1017b put = this.f1071b.put(mVar, new C1017b(mVar, qVar, this.f1072c, this.f1070a));
        if (put != null) {
            put.f1077c = null;
            put.clear();
        }
    }

    /* renamed from: b */
    public void mo10871b(@NonNull C1017b bVar) {
        synchronized (this) {
            this.f1071b.remove(bVar.f1075a);
            if (bVar.f1076b) {
                C1115w<?> wVar = bVar.f1077c;
                if (wVar != null) {
                    this.f1073d.mo10982a(bVar.f1075a, new C1106q(wVar, true, false, bVar.f1075a, this.f1073d));
                }
            }
        }
    }
}
