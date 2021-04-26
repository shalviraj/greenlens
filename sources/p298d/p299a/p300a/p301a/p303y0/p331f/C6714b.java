package p298d.p299a.p300a.p301a.p303y0.p331f;

import java.util.List;
import java.util.Objects;

/* renamed from: d.a.a.a.y0.f.b */
public final class C6714b {

    /* renamed from: c */
    public static final C6714b f13613c = new C6714b("");

    /* renamed from: a */
    public final C6715c f13614a;

    /* renamed from: b */
    public transient C6714b f13615b;

    public C6714b(C6715c cVar) {
        this.f13614a = cVar;
    }

    public C6714b(C6715c cVar, C6714b bVar) {
        this.f13614a = cVar;
        this.f13615b = bVar;
    }

    public C6714b(String str) {
        if (str != null) {
            this.f13614a = new C6715c(str, this);
        } else {
            m12248a(1);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m12248a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: k */
    public static C6714b m12249k(C6717d dVar) {
        if (dVar == null) {
            m12248a(13);
            throw null;
        } else if (dVar != null) {
            return new C6714b(new C6715c(dVar.mo23886e(), f13613c.mo23872j(), dVar));
        } else {
            C6715c.m12259a(16);
            throw null;
        }
    }

    /* renamed from: b */
    public String mo23862b() {
        String b = this.f13614a.mo23874b();
        if (b != null) {
            return b;
        }
        m12248a(4);
        throw null;
    }

    /* renamed from: c */
    public C6714b mo23863c(C6717d dVar) {
        if (dVar != null) {
            return new C6714b(this.f13614a.mo23875c(dVar), this);
        }
        m12248a(8);
        throw null;
    }

    /* renamed from: d */
    public boolean mo23864d() {
        return this.f13614a.mo23877e();
    }

    /* renamed from: e */
    public C6714b mo23865e() {
        C6714b bVar = this.f13615b;
        if (bVar != null) {
            if (bVar != null) {
                return bVar;
            }
            m12248a(6);
            throw null;
        } else if (!mo23864d()) {
            C6715c cVar = this.f13614a;
            C6715c cVar2 = cVar.f13621c;
            if (cVar2 == null) {
                if (!cVar.mo23877e()) {
                    cVar.mo23876d();
                    cVar2 = cVar.f13621c;
                    if (cVar2 == null) {
                        C6715c.m12259a(8);
                        throw null;
                    }
                } else {
                    throw new IllegalStateException("root");
                }
            }
            C6714b bVar2 = new C6714b(cVar2);
            this.f13615b = bVar2;
            if (bVar2 != null) {
                return bVar2;
            }
            m12248a(7);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6714b) && this.f13614a.equals(((C6714b) obj).f13614a);
    }

    /* renamed from: f */
    public List<C6717d> mo23867f() {
        List<C6717d> g = this.f13614a.mo23880g();
        if (g != null) {
            return g;
        }
        m12248a(11);
        throw null;
    }

    /* renamed from: g */
    public C6717d mo23868g() {
        C6717d h = this.f13614a.mo23881h();
        if (h != null) {
            return h;
        }
        m12248a(9);
        throw null;
    }

    /* renamed from: h */
    public C6717d mo23869h() {
        C6717d dVar;
        C6715c cVar = this.f13614a;
        if (cVar.mo23877e()) {
            dVar = C6715c.f13616e;
            if (dVar == null) {
                C6715c.m12259a(12);
                throw null;
            }
        } else {
            dVar = cVar.mo23881h();
            if (dVar == null) {
                C6715c.m12259a(13);
                throw null;
            }
        }
        return dVar;
    }

    public int hashCode() {
        return this.f13614a.hashCode();
    }

    /* renamed from: i */
    public boolean mo23871i(C6717d dVar) {
        if (dVar != null) {
            C6715c cVar = this.f13614a;
            Objects.requireNonNull(cVar);
            if (dVar == null) {
                C6715c.m12259a(15);
                throw null;
            } else if (cVar.mo23877e()) {
                return false;
            } else {
                int indexOf = cVar.f13619a.indexOf(46);
                String str = cVar.f13619a;
                String e = dVar.mo23886e();
                if (indexOf == -1) {
                    indexOf = cVar.f13619a.length();
                }
                return str.regionMatches(0, e, 0, indexOf);
            }
        } else {
            m12248a(12);
            throw null;
        }
    }

    /* renamed from: j */
    public C6715c mo23872j() {
        C6715c cVar = this.f13614a;
        if (cVar != null) {
            return cVar;
        }
        m12248a(5);
        throw null;
    }

    public String toString() {
        return this.f13614a.toString();
    }
}
