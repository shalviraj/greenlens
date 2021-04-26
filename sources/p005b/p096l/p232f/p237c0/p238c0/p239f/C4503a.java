package p005b.p096l.p232f.p237c0.p238c0.p239f;

import java.util.Objects;
import p005b.p096l.p232f.p237c0.p238c0.C4499b;
import p005b.p096l.p232f.p237c0.p238c0.C4500c;

/* renamed from: b.l.f.c0.c0.f.a */
public final class C4503a {

    /* renamed from: a */
    public final C4499b f8398a;

    /* renamed from: b */
    public final C4499b f8399b;

    /* renamed from: c */
    public final C4500c f8400c;

    public C4503a(C4499b bVar, C4499b bVar2, C4500c cVar) {
        this.f8398a = bVar;
        this.f8399b = bVar2;
        this.f8400c = cVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4503a)) {
            return false;
        }
        C4503a aVar = (C4503a) obj;
        return Objects.equals(this.f8398a, aVar.f8398a) && Objects.equals(this.f8399b, aVar.f8399b) && Objects.equals(this.f8400c, aVar.f8400c);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f8398a) ^ Objects.hashCode(this.f8399b)) ^ Objects.hashCode(this.f8400c);
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f8398a);
        sb.append(" , ");
        sb.append(this.f8399b);
        sb.append(" : ");
        C4500c cVar = this.f8400c;
        if (cVar == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(cVar.f8384a);
        }
        sb.append(obj);
        sb.append(" ]");
        return sb.toString();
    }
}
