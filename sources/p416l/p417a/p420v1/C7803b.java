package p416l.p417a.p420v1;

import p005b.p291q.p292a.C5266a;
import p416l.p417a.C7815w;
import p416l.p417a.p419u1.C7790q;

/* renamed from: l.a.v1.b */
public final class C7803b extends C7804c {

    /* renamed from: m */
    public static final C7815w f15396m;

    /* renamed from: n */
    public static final C7803b f15397n;

    static {
        C7803b bVar = new C7803b();
        f15397n = bVar;
        int i = C7790q.f15355a;
        f15396m = new C7806e(bVar, C5266a.m10000n4("kotlinx.coroutines.io.parallelism", 64 < i ? i : 64, 0, 0, 12, (Object) null), "Dispatchers.IO", 1);
    }

    public C7803b() {
        super(0, 0, (String) null, 7);
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public String toString() {
        return "Dispatchers.Default";
    }
}
