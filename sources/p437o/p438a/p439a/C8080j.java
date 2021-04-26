package p437o.p438a.p439a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.a.a.j */
public final class C8080j {

    /* renamed from: d */
    public static final List<C8080j> f16234d = new ArrayList();

    /* renamed from: a */
    public Object f16235a;

    /* renamed from: b */
    public C8088q f16236b;

    /* renamed from: c */
    public C8080j f16237c;

    public C8080j(Object obj, C8088q qVar) {
        this.f16235a = obj;
        this.f16236b = qVar;
    }

    /* renamed from: a */
    public static C8080j m14968a(C8088q qVar, Object obj) {
        List<C8080j> list = f16234d;
        synchronized (list) {
            int size = list.size();
            if (size <= 0) {
                return new C8080j(obj, qVar);
            }
            C8080j remove = list.remove(size - 1);
            remove.f16235a = obj;
            remove.f16236b = qVar;
            remove.f16237c = null;
            return remove;
        }
    }
}
