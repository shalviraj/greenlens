package p005b.p096l.p097a.p113c.p119b;

import java.util.concurrent.Callable;

/* renamed from: b.l.a.c.b.e0 */
public final class C1762e0 extends C1757c0 {

    /* renamed from: e */
    public final Callable<String> f3111e;

    public C1762e0(Callable callable, C1764f0 f0Var) {
        super(false, (String) null, (Throwable) null);
        this.f3111e = callable;
    }

    /* renamed from: a */
    public final String mo11995a() {
        try {
            return this.f3111e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
