package p005b.p280p.p285b.p286a0;

/* renamed from: b.p.b.a0.d */
public abstract class C5125d implements Runnable {

    /* renamed from: g */
    public final String f9931g;

    public C5125d(String str, Object... objArr) {
        this.f9931g = String.format(str, objArr);
    }

    /* renamed from: a */
    public abstract void mo16974a();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f9931g);
        try {
            mo16974a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
