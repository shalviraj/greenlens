package p005b.p280p.p281a;

import java.lang.reflect.Method;

/* renamed from: b.p.a.d */
public class C5064d extends C5066f<T> {

    /* renamed from: a */
    public final /* synthetic */ Method f9784a;

    /* renamed from: b */
    public final /* synthetic */ Class f9785b;

    /* renamed from: c */
    public final /* synthetic */ int f9786c;

    public C5064d(Method method, Class cls, int i) {
        this.f9784a = method;
        this.f9785b = cls;
        this.f9786c = i;
    }

    /* renamed from: a */
    public T mo16818a() {
        return this.f9784a.invoke((Object) null, new Object[]{this.f9785b, Integer.valueOf(this.f9786c)});
    }

    public String toString() {
        return this.f9785b.getName();
    }
}
