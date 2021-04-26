package p005b.p291q.p292a.p294j;

/* renamed from: b.q.a.j.c */
public class C5281c {

    /* renamed from: a */
    public int f10544a;

    /* renamed from: b */
    public int f10545b;

    /* renamed from: c */
    public int f10546c;

    public C5281c(int i, int i2, int i3) {
        this.f10544a = i;
        this.f10545b = i2;
        this.f10546c = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5281c.class != obj.getClass()) {
            return false;
        }
        C5281c cVar = (C5281c) obj;
        if (this.f10544a == cVar.f10544a && this.f10545b == cVar.f10545b) {
            return this.f10546c == cVar.f10546c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f10544a * 31) + this.f10545b) * 31) + this.f10546c;
    }
}
