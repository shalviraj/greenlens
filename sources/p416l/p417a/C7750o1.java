package p416l.p417a;

/* renamed from: l.a.o1 */
public final class C7750o1 {

    /* renamed from: a */
    public static final ThreadLocal<C7737l0> f15296a = new ThreadLocal<>();

    /* renamed from: b */
    public static final C7750o1 f15297b = null;

    /* renamed from: a */
    public static final C7737l0 m14097a() {
        ThreadLocal<C7737l0> threadLocal = f15296a;
        C7737l0 l0Var = threadLocal.get();
        if (l0Var != null) {
            return l0Var;
        }
        C7705c cVar = new C7705c(Thread.currentThread());
        threadLocal.set(cVar);
        return cVar;
    }
}
