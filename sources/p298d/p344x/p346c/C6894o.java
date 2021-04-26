package p298d.p344x.p346c;

/* renamed from: d.x.c.o */
public final class C6894o implements C6881c {

    /* renamed from: g */
    public final Class<?> f13797g;

    public C6894o(Class<?> cls, String str) {
        C6888i.m12438e(cls, "jClass");
        C6888i.m12438e(str, "moduleName");
        this.f13797g = cls;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6894o) && C6888i.m12434a(this.f13797g, ((C6894o) obj).f13797g);
    }

    public int hashCode() {
        return this.f13797g.hashCode();
    }

    /* renamed from: n */
    public Class<?> mo22949n() {
        return this.f13797g;
    }

    public String toString() {
        return this.f13797g.toString() + " (Kotlin reflection is not available)";
    }
}
