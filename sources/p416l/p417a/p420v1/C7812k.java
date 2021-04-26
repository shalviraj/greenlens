package p416l.p417a.p420v1;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;

/* renamed from: l.a.v1.k */
public final class C7812k extends C7810i {

    /* renamed from: i */
    public final Runnable f15413i;

    public C7812k(Runnable runnable, long j, C7811j jVar) {
        super(j, jVar);
        this.f15413i = runnable;
    }

    public void run() {
        try {
            this.f15413i.run();
        } finally {
            this.f15412h.mo25496H();
        }
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Task[");
        u.append(C5266a.m9979k1(this.f15413i));
        u.append('@');
        u.append(C5266a.m10027s1(this.f15413i));
        u.append(", ");
        u.append(this.f15411g);
        u.append(", ");
        u.append(this.f15412h);
        u.append(']');
        return u.toString();
    }
}
