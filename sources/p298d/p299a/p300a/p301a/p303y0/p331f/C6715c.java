package p298d.p299a.p300a.p301a.p303y0.p331f;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.f.c */
public final class C6715c {

    /* renamed from: e */
    public static final C6717d f13616e = C6717d.m12272p("<root>");

    /* renamed from: f */
    public static final Pattern f13617f = Pattern.compile("\\.");

    /* renamed from: g */
    public static final C6862l<String, C6717d> f13618g = new C6716a();

    /* renamed from: a */
    public final String f13619a;

    /* renamed from: b */
    public transient C6714b f13620b;

    /* renamed from: c */
    public transient C6715c f13621c;

    /* renamed from: d */
    public transient C6717d f13622d;

    /* renamed from: d.a.a.a.y0.f.c$a */
    public static class C6716a implements C6862l<String, C6717d> {
        public Object invoke(Object obj) {
            return C6717d.m12269k((String) obj);
        }
    }

    public C6715c(String str) {
        if (str != null) {
            this.f13619a = str;
        } else {
            m12259a(2);
            throw null;
        }
    }

    public C6715c(String str, C6714b bVar) {
        if (str != null) {
            this.f13619a = str;
            this.f13620b = bVar;
            return;
        }
        m12259a(0);
        throw null;
    }

    public C6715c(String str, C6715c cVar, C6717d dVar) {
        if (str != null) {
            this.f13619a = str;
            this.f13621c = cVar;
            this.f13622d = dVar;
            return;
        }
        m12259a(3);
        throw null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m12259a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
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
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: b */
    public String mo23874b() {
        String str = this.f13619a;
        if (str != null) {
            return str;
        }
        m12259a(4);
        throw null;
    }

    /* renamed from: c */
    public C6715c mo23875c(C6717d dVar) {
        String str;
        if (dVar != null) {
            if (mo23877e()) {
                str = dVar.mo23886e();
            } else {
                str = this.f13619a + "." + dVar.mo23886e();
            }
            return new C6715c(str, this, dVar);
        }
        m12259a(9);
        throw null;
    }

    /* renamed from: d */
    public final void mo23876d() {
        int lastIndexOf = this.f13619a.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f13622d = C6717d.m12269k(this.f13619a.substring(lastIndexOf + 1));
            this.f13621c = new C6715c(this.f13619a.substring(0, lastIndexOf));
            return;
        }
        this.f13622d = C6717d.m12269k(this.f13619a);
        this.f13621c = C6714b.f13613c.mo23872j();
    }

    /* renamed from: e */
    public boolean mo23877e() {
        return this.f13619a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6715c) && this.f13619a.equals(((C6715c) obj).f13619a);
    }

    /* renamed from: f */
    public boolean mo23879f() {
        return this.f13620b != null || mo23874b().indexOf(60) < 0;
    }

    /* renamed from: g */
    public List<C6717d> mo23880g() {
        List<C6717d> list;
        if (mo23877e()) {
            list = Collections.emptyList();
        } else {
            String[] split = f13617f.split(this.f13619a);
            C6862l<String, C6717d> lVar = f13618g;
            C6888i.m12438e(split, "$this$map");
            C6888i.m12438e(lVar, "transform");
            ArrayList arrayList = new ArrayList(split.length);
            for (String invoke : split) {
                arrayList.add(lVar.invoke(invoke));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        m12259a(14);
        throw null;
    }

    /* renamed from: h */
    public C6717d mo23881h() {
        C6717d dVar = this.f13622d;
        if (dVar != null) {
            if (dVar != null) {
                return dVar;
            }
            m12259a(10);
            throw null;
        } else if (!mo23877e()) {
            mo23876d();
            C6717d dVar2 = this.f13622d;
            if (dVar2 != null) {
                return dVar2;
            }
            m12259a(11);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public int hashCode() {
        return this.f13619a.hashCode();
    }

    /* renamed from: i */
    public C6714b mo23883i() {
        C6714b bVar = this.f13620b;
        if (bVar == null) {
            C6714b bVar2 = new C6714b(this);
            this.f13620b = bVar2;
            if (bVar2 != null) {
                return bVar2;
            }
            m12259a(6);
            throw null;
        } else if (bVar != null) {
            return bVar;
        } else {
            m12259a(5);
            throw null;
        }
    }

    public String toString() {
        String e = mo23877e() ? f13616e.mo23886e() : this.f13619a;
        if (e != null) {
            return e;
        }
        m12259a(17);
        throw null;
    }
}
