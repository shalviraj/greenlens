package p298d;

import p298d.p344x.p346c.C6888i;

/* renamed from: d.e */
public final class C6763e implements Comparable<C6763e> {

    /* renamed from: k */
    public static final C6763e f13672k = new C6763e(1, 4, 32);

    /* renamed from: g */
    public final int f13673g;

    /* renamed from: h */
    public final int f13674h;

    /* renamed from: i */
    public final int f13675i;

    /* renamed from: j */
    public final int f13676j;

    public C6763e(int i, int i2, int i3) {
        this.f13674h = i;
        this.f13675i = i2;
        this.f13676j = i3;
        if (i >= 0 && 255 >= i && i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3) {
            this.f13673g = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    public int compareTo(Object obj) {
        C6763e eVar = (C6763e) obj;
        C6888i.m12438e(eVar, "other");
        return this.f13673g - eVar.f13673g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6763e)) {
            obj = null;
        }
        C6763e eVar = (C6763e) obj;
        if (eVar != null) {
            return this.f13673g == eVar.f13673g;
        }
        return false;
    }

    public int hashCode() {
        return this.f13673g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13674h);
        sb.append('.');
        sb.append(this.f13675i);
        sb.append('.');
        sb.append(this.f13676j);
        return sb.toString();
    }
}
