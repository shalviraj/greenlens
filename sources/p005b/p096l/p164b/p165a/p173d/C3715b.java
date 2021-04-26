package p005b.p096l.p164b.p165a.p173d;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.b.a.d.b */
public final class C3715b {

    /* renamed from: a */
    public final Map<String, C3716a> f6858a = new C3711a();

    /* renamed from: b */
    public final Map<Field, C3716a> f6859b = new C3711a();

    /* renamed from: c */
    public final Object f6860c;

    /* renamed from: b.l.b.a.d.b$a */
    public static class C3716a {

        /* renamed from: a */
        public final Class<?> f6861a;

        /* renamed from: b */
        public final ArrayList<Object> f6862b = new ArrayList<>();

        public C3716a(Class<?> cls) {
            this.f6861a = cls;
        }
    }

    public C3715b(Object obj) {
        this.f6860c = obj;
    }

    /* renamed from: a */
    public void mo15072a(Field field, Class<?> cls, Object obj) {
        C3716a aVar = this.f6859b.get(field);
        if (aVar == null) {
            aVar = new C3716a(cls);
            this.f6859b.put(field, aVar);
        }
        C1960d.m2849t(cls == aVar.f6861a);
        aVar.f6862b.add(obj);
    }

    /* renamed from: b */
    public void mo15073b() {
        for (Map.Entry next : this.f6858a.entrySet()) {
            Object key = next.getKey();
            C3716a aVar = (C3716a) next.getValue();
            ((Map) this.f6860c).put(key, C3734l.m7051o(aVar.f6862b, aVar.f6861a));
        }
        for (Map.Entry next2 : this.f6859b.entrySet()) {
            Object obj = this.f6860c;
            C3716a aVar2 = (C3716a) next2.getValue();
            C3729j.m7033e((Field) next2.getKey(), obj, C3734l.m7051o(aVar2.f6862b, aVar2.f6861a));
        }
    }
}
