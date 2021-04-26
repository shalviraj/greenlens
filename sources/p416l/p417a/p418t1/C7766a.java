package p416l.p417a.p418t1;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p337v.C6827f;
import p298d.p344x.p346c.C6888i;
import p416l.p417a.C7723g1;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010&\u001a\u00020#\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b'\u0010(J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\u00020\u00008\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u0018\u0010\"\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, mo24462d2 = {"Ll/a/t1/a;", "Ll/a/t1/b;", "", "Ld/v/f;", "context", "", "o0", "(Ld/v/f;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Ld/r;", "n0", "(Ld/v/f;Ljava/lang/Runnable;)V", "", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "h", "Ll/a/t1/a;", "getImmediate", "()Ll/a/t1/a;", "immediate", "k", "Z", "invokeImmediately", "_immediate", "j", "Ljava/lang/String;", "name", "Landroid/os/Handler;", "i", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "kotlinx-coroutines-android"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: l.a.t1.a */
public final class C7766a extends C7767b {
    private volatile C7766a _immediate;

    /* renamed from: h */
    public final C7766a f15315h;

    /* renamed from: i */
    public final Handler f15316i;

    /* renamed from: j */
    public final String f15317j;

    /* renamed from: k */
    public final boolean f15318k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7766a(Handler handler, String str, boolean z) {
        super((DefaultConstructorMarker) null);
        C7766a aVar = null;
        this.f15316i = handler;
        this.f15317j = str;
        this.f15318k = z;
        this._immediate = z ? this : aVar;
        C7766a aVar2 = this._immediate;
        if (aVar2 == null) {
            aVar2 = new C7766a(handler, str, true);
            this._immediate = aVar2;
        }
        this.f15315h = aVar2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7766a) && ((C7766a) obj).f15316i == this.f15316i;
    }

    public int hashCode() {
        return System.identityHashCode(this.f15316i);
    }

    /* renamed from: n0 */
    public void mo25402n0(C6827f fVar, Runnable runnable) {
        this.f15316i.post(runnable);
    }

    /* renamed from: o0 */
    public boolean mo25425o0(C6827f fVar) {
        return !this.f15318k || (C6888i.m12434a(Looper.myLooper(), this.f15316i.getLooper()) ^ true);
    }

    /* renamed from: p0 */
    public C7723g1 mo25387p0() {
        return this.f15315h;
    }

    public String toString() {
        String q0 = mo25388q0();
        if (q0 != null) {
            return q0;
        }
        String str = this.f15317j;
        if (str == null) {
            str = this.f15316i.toString();
        }
        return this.f15318k ? C0843a.m451l(str, ".immediate") : str;
    }
}
