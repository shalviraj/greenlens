package p376j.p378b.p383c;

import java.util.Collections;
import java.util.List;
import p005b.p291q.p292a.C5266a;

/* renamed from: j.b.c.w */
public abstract class C7053w {

    /* renamed from: j.b.c.w$b */
    public static final class C7055b {

        /* renamed from: b */
        public static final C7053w f14153b = C7053w.m12667a(Collections.emptyList());

        /* renamed from: a */
        public final C7053w f14154a;

        public C7055b(C7053w wVar, C7054a aVar) {
            C5266a.m9842M(wVar, "parent");
            this.f14154a = wVar;
        }
    }

    /* renamed from: a */
    public static C7053w m12667a(List list) {
        if (list.size() <= 32) {
            return new C7027f(Collections.unmodifiableList(list));
        }
        throw new IllegalStateException("Invalid size");
    }

    /* renamed from: b */
    public abstract List<Object> mo24426b();
}
