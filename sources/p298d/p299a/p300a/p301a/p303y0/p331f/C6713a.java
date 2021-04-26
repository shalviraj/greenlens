package p298d.p299a.p300a.p301a.p303y0.p331f;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;

/* renamed from: d.a.a.a.y0.f.a */
public final class C6713a {

    /* renamed from: a */
    public final C6714b f13610a;

    /* renamed from: b */
    public final C6714b f13611b;

    /* renamed from: c */
    public final boolean f13612c;

    public C6713a(C6714b bVar, C6714b bVar2, boolean z) {
        if (bVar != null) {
            this.f13610a = bVar;
            this.f13611b = bVar2;
            this.f13612c = z;
            return;
        }
        m12236a(1);
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C6713a(C6714b bVar, C6717d dVar) {
        this(bVar, C6714b.m12249k(dVar), false);
        if (bVar == null) {
            m12236a(3);
            throw null;
        } else if (dVar != null) {
        } else {
            m12236a(4);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m12236a(int i) {
        String str = (i == 5 || i == 6 || i == 7 || i == 9 || i == 13 || i == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 5 || i == 6 || i == 7 || i == 9 || i == 13 || i == 14) ? 2 : 3)];
        switch (i) {
            case 1:
            case 3:
                objArr[0] = "packageFqName";
                break;
            case 2:
                objArr[0] = "relativeClassName";
                break;
            case 4:
                objArr[0] = "topLevelName";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 10:
                objArr[0] = "segment";
                break;
            case 11:
            case 12:
                objArr[0] = "string";
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        if (i == 5) {
            objArr[1] = "getPackageFqName";
        } else if (i == 6) {
            objArr[1] = "getRelativeClassName";
        } else if (i == 7) {
            objArr[1] = "getShortClassName";
        } else if (i == 9) {
            objArr[1] = "asSingleFqName";
        } else if (i == 13 || i == 14) {
            objArr[1] = "asString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
                break;
            case 8:
                objArr[2] = "createNestedClassId";
                break;
            case 10:
                objArr[2] = "startsWith";
                break;
            case 11:
            case 12:
                objArr[2] = "fromString";
                break;
            default:
                objArr[2] = "topLevel";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 5 || i == 6 || i == 7 || i == 9 || i == 13 || i == 14) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: e */
    public static C6713a m12237e(String str) {
        return m12238f(str, false);
    }

    /* renamed from: f */
    public static C6713a m12238f(String str, boolean z) {
        if (str != null) {
            String str2 = "";
            C6888i.m12438e(str, "$this$substringBeforeLast");
            C6888i.m12438e(str2, "missingDelimiterValue");
            int o = C7694h.m13937o(str, '/', 0, false, 6);
            if (o != -1) {
                str2 = str.substring(0, o);
                C6888i.m12437d(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            return new C6713a(new C6714b(str2.replace('/', '.')), new C6714b(C7694h.m13914E(str, '/', str)), z);
        }
        m12236a(12);
        throw null;
    }

    /* renamed from: l */
    public static C6713a m12239l(C6714b bVar) {
        if (bVar != null) {
            return new C6713a(bVar.mo23865e(), bVar.mo23868g());
        }
        m12236a(0);
        throw null;
    }

    /* renamed from: b */
    public C6714b mo23851b() {
        if (this.f13610a.mo23864d()) {
            C6714b bVar = this.f13611b;
            if (bVar != null) {
                return bVar;
            }
            m12236a(9);
            throw null;
        }
        return new C6714b(this.f13610a.mo23862b() + "." + this.f13611b.mo23862b());
    }

    /* renamed from: c */
    public String mo23852c() {
        if (this.f13610a.mo23864d()) {
            String b = this.f13611b.mo23862b();
            if (b != null) {
                return b;
            }
            m12236a(13);
            throw null;
        }
        String str = this.f13610a.mo23862b().replace('.', '/') + "/" + this.f13611b.mo23862b();
        if (str != null) {
            return str;
        }
        m12236a(14);
        throw null;
    }

    /* renamed from: d */
    public C6713a mo23853d(C6717d dVar) {
        if (dVar != null) {
            return new C6713a(mo23856h(), this.f13611b.mo23863c(dVar), this.f13612c);
        }
        m12236a(8);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6713a.class != obj.getClass()) {
            return false;
        }
        C6713a aVar = (C6713a) obj;
        return this.f13610a.equals(aVar.f13610a) && this.f13611b.equals(aVar.f13611b) && this.f13612c == aVar.f13612c;
    }

    /* renamed from: g */
    public C6713a mo23855g() {
        C6714b e = this.f13611b.mo23865e();
        if (e.mo23864d()) {
            return null;
        }
        return new C6713a(mo23856h(), e, this.f13612c);
    }

    /* renamed from: h */
    public C6714b mo23856h() {
        C6714b bVar = this.f13610a;
        if (bVar != null) {
            return bVar;
        }
        m12236a(5);
        throw null;
    }

    public int hashCode() {
        int hashCode = this.f13611b.hashCode();
        return Boolean.valueOf(this.f13612c).hashCode() + ((hashCode + (this.f13610a.hashCode() * 31)) * 31);
    }

    /* renamed from: i */
    public C6714b mo23858i() {
        C6714b bVar = this.f13611b;
        if (bVar != null) {
            return bVar;
        }
        m12236a(6);
        throw null;
    }

    /* renamed from: j */
    public C6717d mo23859j() {
        C6717d g = this.f13611b.mo23868g();
        if (g != null) {
            return g;
        }
        m12236a(7);
        throw null;
    }

    /* renamed from: k */
    public boolean mo23860k() {
        return !this.f13611b.mo23865e().mo23864d();
    }

    public String toString() {
        if (!this.f13610a.mo23864d()) {
            return mo23852c();
        }
        StringBuilder u = C0843a.m460u("/");
        u.append(mo23852c());
        return u.toString();
    }
}
