package p005b.p273o;

import androidx.annotation.NonNull;
import java.util.concurrent.ConcurrentHashMap;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4812d2;
import p005b.p273o.C4857i2;
import p005b.p273o.C4935p0;

/* renamed from: b.o.e2 */
public class C4822e2 {

    /* renamed from: a */
    public C4935p0 f9248a;

    /* renamed from: b */
    public final ConcurrentHashMap<String, Object> f9249b = new ConcurrentHashMap<>();

    public C4822e2(C4935p0.C4936a aVar) {
        this.f9248a = new C4935p0(aVar);
    }

    /* renamed from: a */
    public final boolean mo16561a(@NonNull Number number, @NonNull Number number2, @NonNull C4812d2.C4814b bVar) {
        double doubleValue = number.doubleValue();
        double doubleValue2 = number2.doubleValue();
        switch (bVar.ordinal()) {
            case 0:
                if (doubleValue2 > doubleValue) {
                    return true;
                }
                return false;
            case 1:
                if (doubleValue2 < doubleValue) {
                    return true;
                }
                return false;
            case 2:
                if (doubleValue2 == doubleValue) {
                    return true;
                }
                return false;
            case 3:
                if (doubleValue2 != doubleValue) {
                    return true;
                }
                return false;
            case 4:
                if (doubleValue2 < doubleValue || doubleValue2 == doubleValue) {
                    return true;
                }
                return false;
            case 5:
                int i = (doubleValue2 > doubleValue ? 1 : (doubleValue2 == doubleValue ? 0 : -1));
                if (i > 0 || i == 0) {
                    return true;
                }
                return false;
            case 6:
            case 7:
            case 8:
                C4857i2.C4868k kVar = C4857i2.C4868k.ERROR;
                StringBuilder u = C0843a.m460u("Attempted to use an invalid operator with a numeric value: ");
                u.append(bVar.f9229g);
                C4857i2.m8933a(kVar, u.toString(), (Throwable) null);
                return false;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public final boolean mo16562b(@NonNull String str, @NonNull String str2, @NonNull C4812d2.C4814b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 2) {
            return str.equals(str2);
        }
        if (ordinal == 3) {
            return !str.equals(str2);
        }
        C4857i2.C4868k kVar = C4857i2.C4868k.ERROR;
        StringBuilder u = C0843a.m460u("Attempted to use an invalid operator for a string trigger comparison: ");
        u.append(bVar.f9229g);
        C4857i2.m8933a(kVar, u.toString(), (Throwable) null);
        return false;
    }
}
