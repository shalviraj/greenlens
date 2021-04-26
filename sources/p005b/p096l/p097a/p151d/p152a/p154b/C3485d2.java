package p005b.p096l.p097a.p151d.p152a.p154b;

import java.util.concurrent.ThreadFactory;

/* renamed from: b.l.a.d.a.b.d2 */
public final /* synthetic */ class C3485d2 implements ThreadFactory {

    /* renamed from: b */
    public static final ThreadFactory f6365b = new C3485d2();

    /* renamed from: c */
    public static final ThreadFactory f6366c = new C3485d2((byte[]) null);

    /* renamed from: a */
    public final /* synthetic */ int f6367a = 0;

    public C3485d2() {
    }

    public C3485d2(byte[] bArr) {
    }

    public final Thread newThread(Runnable runnable) {
        return this.f6367a != 0 ? new Thread(runnable, "AssetPackBackgroundExecutor") : new Thread(runnable, "UpdateListenerExecutor");
    }
}
