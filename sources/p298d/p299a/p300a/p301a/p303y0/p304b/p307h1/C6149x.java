package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.List;
import java.util.Set;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.h1.x */
public final class C6149x implements C6148w {

    /* renamed from: a */
    public final List<C6086a0> f12162a;

    /* renamed from: b */
    public final Set<C6086a0> f12163b;

    /* renamed from: c */
    public final List<C6086a0> f12164c;

    public C6149x(List<C6086a0> list, Set<C6086a0> set, List<C6086a0> list2, Set<C6086a0> set2) {
        C6888i.m12438e(list, "allDependencies");
        C6888i.m12438e(set, "modulesWhoseInternalsAreVisible");
        C6888i.m12438e(list2, "directExpectedByDependencies");
        C6888i.m12438e(set2, "allExpectedByDependencies");
        this.f12162a = list;
        this.f12163b = set;
        this.f12164c = list2;
    }

    /* renamed from: a */
    public Set<C6086a0> mo23315a() {
        return this.f12163b;
    }

    /* renamed from: b */
    public List<C6086a0> mo23316b() {
        return this.f12162a;
    }

    /* renamed from: c */
    public List<C6086a0> mo23317c() {
        return this.f12164c;
    }
}
