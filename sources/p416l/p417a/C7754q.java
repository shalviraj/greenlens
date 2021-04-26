package p416l.p417a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0013\u0010\b\u001a\u00020\u00058F@\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\t8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\u000e"}, mo24462d2 = {"Ll/a/q;", "", "", "toString", "()Ljava/lang/String;", "", "a", "()Z", "handled", "", "Ljava/lang/Throwable;", "cause", "<init>", "(Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: l.a.q */
public class C7754q {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15305b = AtomicIntegerFieldUpdater.newUpdater(C7754q.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a */
    public final Throwable f15306a;

    public C7754q(Throwable th, boolean z) {
        this.f15306a = th;
        this._handled = z ? 1 : 0;
    }

    public C7754q(Throwable th, boolean z, int i) {
        z = (i & 2) != 0 ? false : z;
        this.f15306a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: a */
    public final boolean mo25426a() {
        return this._handled;
    }

    public String toString() {
        return getClass().getSimpleName() + '[' + this.f15306a + ']';
    }
}
