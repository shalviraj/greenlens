package p376j.p378b.p383c;

import p005b.p291q.p292a.C5266a;
import p376j.p378b.p383c.C7022d;

/* renamed from: j.b.c.m */
public abstract class C7034m extends C7028g {

    /* renamed from: j.b.c.m$a */
    public static abstract class C7035a {
        /* renamed from: a */
        public abstract C7034m mo24416a();

        /* renamed from: b */
        public abstract C7035a mo24417b(long j);
    }

    /* renamed from: j.b.c.m$b */
    public enum C7036b {
        SENT,
        RECEIVED
    }

    /* renamed from: a */
    public static C7035a m12643a(C7036b bVar, long j) {
        C7022d.C7024b bVar2 = new C7022d.C7024b();
        C5266a.m9842M(bVar, "type");
        bVar2.f14082a = bVar;
        bVar2.f14083b = Long.valueOf(j);
        bVar2.mo24417b(0);
        bVar2.f14085d = 0L;
        return bVar2;
    }

    /* renamed from: b */
    public abstract long mo24409b();

    /* renamed from: c */
    public abstract long mo24410c();

    /* renamed from: d */
    public abstract C7036b mo24411d();

    /* renamed from: e */
    public abstract long mo24412e();
}
