package p416l.p417a.p419u1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u000f\u001a\u00020\f8F@\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, mo24462d2 = {"Ll/a/u1/j;", "", "E", "Ld/r;", "b", "()V", "element", "", "a", "(Ljava/lang/Object;)Z", "d", "()Ljava/lang/Object;", "", "c", "()I", "size", "singleConsumer", "<init>", "(Z)V", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: l.a.u1.j */
public class C7781j<E> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15340a = AtomicReferenceFieldUpdater.newUpdater(C7781j.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public C7781j(boolean z) {
        this._cur = new C7782k(8, z);
    }

    /* renamed from: a */
    public final boolean mo25450a(E e) {
        while (true) {
            C7782k kVar = (C7782k) this._cur;
            int a = kVar.mo25454a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                f15340a.compareAndSet(this, kVar, kVar.mo25458e());
            } else if (a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void mo25451b() {
        while (true) {
            C7782k kVar = (C7782k) this._cur;
            if (!kVar.mo25455b()) {
                f15340a.compareAndSet(this, kVar, kVar.mo25458e());
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final int mo25452c() {
        return ((C7782k) this._cur).mo25456c();
    }

    /* renamed from: d */
    public final E mo25453d() {
        while (true) {
            C7782k kVar = (C7782k) this._cur;
            E f = kVar.mo25459f();
            if (f != C7782k.f15343g) {
                return f;
            }
            f15340a.compareAndSet(this, kVar, kVar.mo25458e());
        }
    }
}
