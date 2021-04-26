package p298d.p299a.p300a.p301a.p303y0.p312c.p313a;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: d.a.a.a.y0.c.a.e */
public final class C6261e implements Serializable {

    /* renamed from: i */
    public static final C6262a f12297i = new C6262a((DefaultConstructorMarker) null);

    /* renamed from: j */
    public static final C6261e f12298j = new C6261e(-1, -1);

    /* renamed from: g */
    public final int f12299g;

    /* renamed from: h */
    public final int f12300h;

    /* renamed from: d.a.a.a.y0.c.a.e$a */
    public static final class C6262a {
        public C6262a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public C6261e(int i, int i2) {
        this.f12299g = i;
        this.f12300h = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6261e)) {
            return false;
        }
        C6261e eVar = (C6261e) obj;
        return this.f12299g == eVar.f12299g && this.f12300h == eVar.f12300h;
    }

    public int hashCode() {
        return (this.f12299g * 31) + this.f12300h;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Position(line=");
        u.append(this.f12299g);
        u.append(", column=");
        u.append(this.f12300h);
        u.append(')');
        return u.toString();
    }
}
