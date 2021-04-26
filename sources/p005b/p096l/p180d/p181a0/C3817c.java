package p005b.p096l.p180d.p181a0;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: b.l.d.a0.c */
public class C3817c implements C3822h {

    /* renamed from: a */
    public final String f7031a;

    /* renamed from: b */
    public final C3818d f7032b;

    public C3817c(Set<C3819e> set, C3818d dVar) {
        this.f7031a = m7200b(set);
        this.f7032b = dVar;
    }

    /* renamed from: b */
    public static String m7200b(Set<C3819e> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<C3819e> it = set.iterator();
        while (it.hasNext()) {
            C3819e next = it.next();
            sb.append(next.mo15335a());
            sb.append('/');
            sb.append(next.mo15336b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo15341a() {
        Set<T> unmodifiableSet;
        Set<T> unmodifiableSet2;
        C3818d dVar = this.f7032b;
        synchronized (dVar.f7034a) {
            unmodifiableSet = Collections.unmodifiableSet(dVar.f7034a);
        }
        if (unmodifiableSet.isEmpty()) {
            return this.f7031a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7031a);
        sb.append(' ');
        C3818d dVar2 = this.f7032b;
        synchronized (dVar2.f7034a) {
            unmodifiableSet2 = Collections.unmodifiableSet(dVar2.f7034a);
        }
        sb.append(m7200b(unmodifiableSet2));
        return sb.toString();
    }
}
