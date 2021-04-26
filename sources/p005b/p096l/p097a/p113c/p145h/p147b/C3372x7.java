package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b.l.a.c.h.b.x7 */
public final class C3372x7 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ AtomicReference f6098g;

    /* renamed from: h */
    public final /* synthetic */ String f6099h;

    /* renamed from: i */
    public final /* synthetic */ String f6100i;

    /* renamed from: j */
    public final /* synthetic */ C3352v9 f6101j;

    /* renamed from: k */
    public final /* synthetic */ boolean f6102k;

    /* renamed from: l */
    public final /* synthetic */ C3175f8 f6103l;

    public C3372x7(C3175f8 f8Var, AtomicReference atomicReference, String str, String str2, C3352v9 v9Var, boolean z) {
        this.f6103l = f8Var;
        this.f6098g = atomicReference;
        this.f6099h = str;
        this.f6100i = str2;
        this.f6101j = v9Var;
        this.f6102k = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List<C3253m9> b1;
        synchronized (this.f6098g) {
            try {
                C3175f8 f8Var = this.f6103l;
                C3170f3 f3Var = f8Var.f5521d;
                if (f3Var == null) {
                    f8Var.f5638a.mo14329d().f5799f.mo14417d("(legacy) Failed to get user properties; not connected to service", (Object) null, this.f6099h, this.f6100i);
                    this.f6098g.set(Collections.emptyList());
                    this.f6098g.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    Objects.requireNonNull(this.f6101j, "null reference");
                    atomicReference2 = this.f6098g;
                    b1 = f3Var.mo14162N0(this.f6099h, this.f6100i, this.f6102k, this.f6101j);
                } else {
                    atomicReference2 = this.f6098g;
                    b1 = f3Var.mo14168b1((String) null, this.f6099h, this.f6100i, this.f6102k);
                }
                atomicReference2.set(b1);
                this.f6103l.mo14223s();
                atomicReference = this.f6098g;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f6103l.f5638a.mo14329d().f5799f.mo14417d("(legacy) Failed to get user properties; remote exception", (Object) null, this.f6099h, e);
                    this.f6098g.set(Collections.emptyList());
                    atomicReference = this.f6098g;
                } catch (Throwable th) {
                    this.f6098g.notify();
                    throw th;
                }
            }
        }
    }
}
