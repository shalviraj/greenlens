package p005b.p280p.p281a;

import java.lang.reflect.Method;

/* renamed from: b.p.a.c */
public class C5063c extends C5066f<T> {

    /* renamed from: a */
    public final /* synthetic */ Method f9781a;

    /* renamed from: b */
    public final /* synthetic */ Object f9782b;

    /* renamed from: c */
    public final /* synthetic */ Class f9783c;

    public C5063c(Method method, Object obj, Class cls) {
        this.f9781a = method;
        this.f9782b = obj;
        this.f9783c = cls;
    }

    /* renamed from: a */
    public T mo16818a() {
        return this.f9781a.invoke(this.f9782b, new Object[]{this.f9783c});
    }

    public String toString() {
        return this.f9783c.getName();
    }
}
