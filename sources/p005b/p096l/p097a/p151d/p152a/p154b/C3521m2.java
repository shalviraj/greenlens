package p005b.p096l.p097a.p151d.p152a.p154b;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p005b.p096l.p097a.p151d.p152a.p159e.C3585f0;

/* renamed from: b.l.a.d.a.b.m2 */
public final class C3521m2 implements C3585f0<Executor> {

    /* renamed from: a */
    public final /* synthetic */ int f6483a = 0;

    public C3521m2() {
    }

    public C3521m2(byte[] bArr) {
    }

    public C3521m2(char[] cArr) {
    }

    public C3521m2(short[] sArr) {
    }

    /* renamed from: a */
    public final Object mo14735a() {
        int i = this.f6483a;
        if (i == 0) {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C3485d2.f6365b);
            Objects.requireNonNull(newSingleThreadExecutor, "Cannot return null from a non-@Nullable @Provides method");
            return newSingleThreadExecutor;
        } else if (i == 1) {
            ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor(C3485d2.f6366c);
            Objects.requireNonNull(newSingleThreadExecutor2, "Cannot return null from a non-@Nullable @Provides method");
            return newSingleThreadExecutor2;
        } else if (i != 2) {
            return new C3511k0();
        } else {
            return new C3475b0();
        }
    }
}
