package p416l.p417a.p419u1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\u000e"}, mo24462d2 = {"Ll/a/u1/c;", "T", "Ll/a/u1/m;", "affected", "", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "failure", "Ld/r;", "b", "(Ljava/lang/Object;Ljava/lang/Object;)V", "a", "<init>", "()V", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: l.a.u1.c */
public abstract class C7773c<T> extends C7786m {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15325a = AtomicReferenceFieldUpdater.newUpdater(C7773c.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C7772b.f15324a;

    /* renamed from: a */
    public final Object mo25435a(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = C7772b.f15324a;
        if (obj2 == obj3) {
            obj2 = mo25365c(obj);
            Object obj4 = this._consensus;
            if (obj4 != obj3) {
                obj2 = obj4;
            } else if (!f15325a.compareAndSet(this, obj3, obj2)) {
                obj2 = this._consensus;
            }
        }
        mo25436b(obj, obj2);
        return obj2;
    }

    /* renamed from: b */
    public abstract void mo25436b(T t, Object obj);

    /* renamed from: c */
    public abstract Object mo25365c(T t);
}
