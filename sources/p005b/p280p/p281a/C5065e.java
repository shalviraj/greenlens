package p005b.p280p.p281a;

import java.lang.reflect.Method;

/* renamed from: b.p.a.e */
public class C5065e extends C5066f<T> {

    /* renamed from: a */
    public final /* synthetic */ Method f9787a;

    /* renamed from: b */
    public final /* synthetic */ Class f9788b;

    public C5065e(Method method, Class cls) {
        this.f9787a = method;
        this.f9788b = cls;
    }

    /* renamed from: a */
    public T mo16818a() {
        return this.f9787a.invoke((Object) null, new Object[]{this.f9788b, Object.class});
    }

    public String toString() {
        return this.f9788b.getName();
    }
}
