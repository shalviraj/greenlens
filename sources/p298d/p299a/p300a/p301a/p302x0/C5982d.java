package p298d.p299a.p300a.p301a.p302x0;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
import p005b.p291q.p292a.C5266a;
import p298d.C6764f;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.C5931l0;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.x0.d */
public final class C5982d implements InvocationHandler {

    /* renamed from: a */
    public final /* synthetic */ Class f11824a;

    /* renamed from: b */
    public final /* synthetic */ C6764f f11825b;

    /* renamed from: c */
    public final /* synthetic */ C6764f f11826c;

    /* renamed from: d */
    public final /* synthetic */ C5980b f11827d;

    /* renamed from: e */
    public final /* synthetic */ Map f11828e;

    public C5982d(Class cls, C6764f fVar, C6736l lVar, C6764f fVar2, C6736l lVar2, C5980b bVar, Map map) {
        this.f11824a = cls;
        this.f11825b = fVar;
        this.f11826c = fVar2;
        this.f11827d = bVar;
        this.f11828e = map;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        C6764f fVar;
        C6888i.m12437d(method, "method");
        String name = method.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals("annotationType")) {
                        return this.f11824a;
                    }
                } else if (name.equals("hashCode")) {
                    fVar = this.f11826c;
                }
            } else if (name.equals("toString")) {
                fVar = this.f11825b;
            }
            return fVar.getValue();
        }
        if (C6888i.m12434a(name, "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(this.f11827d.mo23073a(C5266a.m9911Y3(objArr)));
        }
        if (this.f11828e.containsKey(name)) {
            return this.f11828e.get(name);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Method is not supported: ");
        sb.append(method);
        sb.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb.append(C5266a.m10066y4(objArr));
        sb.append(')');
        throw new C5931l0(sb.toString());
    }
}
