package p298d.p299a.p300a.p301a.p303y0.p331f;

import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: d.a.a.a.y0.f.d */
public final class C6717d implements Comparable<C6717d> {

    /* renamed from: g */
    public final String f13623g;

    /* renamed from: h */
    public final boolean f13624h;

    public C6717d(String str, boolean z) {
        if (str != null) {
            this.f13623g = str;
            this.f13624h = z;
            return;
        }
        m12268d(0);
        throw null;
    }

    /* renamed from: d */
    public static /* synthetic */ void m12268d(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[1] = "getIdentifier";
        }
        switch (i) {
            case 1:
            case 2:
                break;
            case 3:
                objArr[2] = "identifier";
                break;
            case 4:
                objArr[2] = "isValidIdentifier";
                break;
            case 5:
                objArr[2] = "special";
                break;
            case 6:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: k */
    public static C6717d m12269k(String str) {
        if (str != null) {
            return str.startsWith("<") ? m12272p(str) : m12270l(str);
        }
        m12268d(6);
        throw null;
    }

    /* renamed from: l */
    public static C6717d m12270l(String str) {
        if (str != null) {
            return new C6717d(str, false);
        }
        m12268d(3);
        throw null;
    }

    /* renamed from: n */
    public static boolean m12271n(String str) {
        if (str == null) {
            m12268d(4);
            throw null;
        } else if (str.isEmpty() || str.startsWith("<")) {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt == '.' || charAt == '/' || charAt == '\\') {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: p */
    public static C6717d m12272p(String str) {
        if (str == null) {
            m12268d(5);
            throw null;
        } else if (str.startsWith("<")) {
            return new C6717d(str, true);
        } else {
            throw new IllegalArgumentException(C0843a.m451l("special name must start with '<': ", str));
        }
    }

    public int compareTo(Object obj) {
        return this.f13623g.compareTo(((C6717d) obj).f13623g);
    }

    /* renamed from: e */
    public String mo23886e() {
        String str = this.f13623g;
        if (str != null) {
            return str;
        }
        m12268d(1);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6717d)) {
            return false;
        }
        C6717d dVar = (C6717d) obj;
        return this.f13624h == dVar.f13624h && this.f13623g.equals(dVar.f13623g);
    }

    public int hashCode() {
        return (this.f13623g.hashCode() * 31) + (this.f13624h ? 1 : 0);
    }

    /* renamed from: i */
    public String mo23889i() {
        if (!this.f13624h) {
            String e = mo23886e();
            if (e != null) {
                return e;
            }
            m12268d(2);
            throw null;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    public String toString() {
        return this.f13623g;
    }
}
