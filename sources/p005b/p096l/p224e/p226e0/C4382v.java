package p005b.p096l.p224e.p226e0;

import java.lang.reflect.Method;

/* renamed from: b.l.e.e0.v */
public class C4382v extends C4385y {

    /* renamed from: a */
    public final /* synthetic */ Method f8112a;

    /* renamed from: b */
    public final /* synthetic */ int f8113b;

    public C4382v(Method method, int i) {
        this.f8112a = method;
        this.f8113b = i;
    }

    /* renamed from: b */
    public <T> T mo16038b(Class<T> cls) {
        C4385y.m8007a(cls);
        return this.f8112a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f8113b)});
    }
}
