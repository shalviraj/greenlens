package p416l.p417a;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p298d.C6777r;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u000b8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u0010"}, mo24462d2 = {"Ll/a/k;", "Ll/a/z0;", "Ll/a/j;", "", "cause", "Ld/r;", "m", "(Ljava/lang/Throwable;)V", "", "k", "(Ljava/lang/Throwable;)Z", "Ll/a/l;", "Ll/a/l;", "childJob", "<init>", "(Ll/a/l;)V", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: l.a.k */
public final class C7733k extends C7824z0 implements C7730j {

    /* renamed from: k */
    public final C7736l f15278k;

    public C7733k(C7736l lVar) {
        this.f15278k = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo25355m((Throwable) obj);
        return C6777r.f13694a;
    }

    /* renamed from: k */
    public boolean mo25390k(Throwable th) {
        C7707c1 n = mo25321n();
        Objects.requireNonNull(n);
        if (th instanceof CancellationException) {
            return true;
        }
        return n.mo25338h(th) && n.mo25311n();
    }

    /* renamed from: m */
    public void mo25355m(Throwable th) {
        this.f15278k.mo25335Z(mo25321n());
    }
}
