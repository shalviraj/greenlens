package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b.l.a.c.h.b.v7 */
public final class C3350v7 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ AtomicReference f6020g;

    /* renamed from: h */
    public final /* synthetic */ String f6021h;

    /* renamed from: i */
    public final /* synthetic */ String f6022i;

    /* renamed from: j */
    public final /* synthetic */ C3352v9 f6023j;

    /* renamed from: k */
    public final /* synthetic */ C3175f8 f6024k;

    public C3350v7(C3175f8 f8Var, AtomicReference atomicReference, String str, String str2, C3352v9 v9Var) {
        this.f6024k = f8Var;
        this.f6020g = atomicReference;
        this.f6021h = str;
        this.f6022i = str2;
        this.f6023j = v9Var;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List<C3118b> Q0;
        synchronized (this.f6020g) {
            try {
                C3175f8 f8Var = this.f6024k;
                C3170f3 f3Var = f8Var.f5521d;
                if (f3Var == null) {
                    f8Var.f5638a.mo14329d().f5799f.mo14417d("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.f6021h, this.f6022i);
                    this.f6020g.set(Collections.emptyList());
                    this.f6020g.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    Objects.requireNonNull(this.f6023j, "null reference");
                    atomicReference2 = this.f6020g;
                    Q0 = f3Var.mo14171r(this.f6021h, this.f6022i, this.f6023j);
                } else {
                    atomicReference2 = this.f6020g;
                    Q0 = f3Var.mo14164Q0((String) null, this.f6021h, this.f6022i);
                }
                atomicReference2.set(Q0);
                this.f6024k.mo14223s();
                atomicReference = this.f6020g;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f6024k.f5638a.mo14329d().f5799f.mo14417d("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.f6021h, e);
                    this.f6020g.set(Collections.emptyList());
                    atomicReference = this.f6020g;
                } catch (Throwable th) {
                    this.f6020g.notify();
                    throw th;
                }
            }
        }
    }
}
