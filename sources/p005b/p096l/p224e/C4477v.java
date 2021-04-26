package p005b.p096l.p224e;

import java.math.BigInteger;
import java.util.Objects;
import p005b.p096l.p224e.p226e0.C4371r;

/* renamed from: b.l.e.v */
public final class C4477v extends C4472q {

    /* renamed from: a */
    public final Object f8320a;

    public C4477v(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f8320a = bool;
    }

    /* renamed from: w */
    public static boolean m8238w(C4477v vVar) {
        Object obj = vVar.f8320a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4477v.class != obj.getClass()) {
            return false;
        }
        C4477v vVar = (C4477v) obj;
        if (this.f8320a == null) {
            return vVar.f8320a == null;
        }
        if (m8238w(this) && m8238w(vVar)) {
            return mo16149u().longValue() == vVar.mo16149u().longValue();
        }
        Object obj2 = this.f8320a;
        if (!(obj2 instanceof Number) || !(vVar.f8320a instanceof Number)) {
            return obj2.equals(vVar.f8320a);
        }
        double doubleValue = mo16149u().doubleValue();
        double doubleValue2 = vVar.mo16149u().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f8320a == null) {
            return 31;
        }
        if (m8238w(this)) {
            doubleToLongBits = mo16149u().longValue();
        } else {
            Object obj = this.f8320a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo16149u().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: n */
    public long mo16133n() {
        return this.f8320a instanceof Number ? mo16149u().longValue() : Long.parseLong(mo16134q());
    }

    /* renamed from: q */
    public String mo16134q() {
        Object obj = this.f8320a;
        if (obj instanceof Number) {
            return mo16149u().toString();
        }
        return obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj;
    }

    /* renamed from: r */
    public boolean mo16148r() {
        Object obj = this.f8320a;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(mo16134q());
    }

    /* renamed from: u */
    public Number mo16149u() {
        Object obj = this.f8320a;
        return obj instanceof String ? new C4371r((String) this.f8320a) : (Number) obj;
    }

    public C4477v(Number number) {
        Objects.requireNonNull(number);
        this.f8320a = number;
    }

    public C4477v(String str) {
        Objects.requireNonNull(str);
        this.f8320a = str;
    }
}
