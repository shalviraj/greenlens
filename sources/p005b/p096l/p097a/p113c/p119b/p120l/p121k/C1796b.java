package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import java.util.Arrays;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a.C1774d;

/* renamed from: b.l.a.c.b.l.k.b */
public final class C1796b<O extends C1770a.C1774d> {

    /* renamed from: a */
    public final boolean f3141a = false;

    /* renamed from: b */
    public final int f3142b;

    /* renamed from: c */
    public final C1770a<O> f3143c;

    /* renamed from: d */
    public final O f3144d;

    public C1796b(C1770a<O> aVar, O o) {
        this.f3143c = aVar;
        this.f3144d = o;
        this.f3142b = Arrays.hashCode(new Object[]{aVar, o});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1796b)) {
            return false;
        }
        C1796b bVar = (C1796b) obj;
        return !this.f3141a && !bVar.f3141a && C0823f.m330A(this.f3143c, bVar.f3143c) && C0823f.m330A(this.f3144d, bVar.f3144d);
    }

    public final int hashCode() {
        return this.f3142b;
    }
}
