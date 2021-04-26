package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.h.b.j3 */
public final class C3214j3 extends C3227k5 {

    /* renamed from: c */
    public static final AtomicReference<String[]> f5633c = new AtomicReference<>();

    /* renamed from: d */
    public static final AtomicReference<String[]> f5634d = new AtomicReference<>();

    /* renamed from: e */
    public static final AtomicReference<String[]> f5635e = new AtomicReference<>();

    public C3214j3(C3281p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: u */
    public static final String m6096u(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Objects.requireNonNull(atomicReference, "null reference");
        C0823f.m360b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (C3297q9.m6339G(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: i */
    public final boolean mo14141i() {
        return false;
    }

    /* renamed from: o */
    public final boolean mo14320o() {
        C3281p4 p4Var = this.f5638a;
        C3165ea eaVar = p4Var.f5847f;
        return p4Var.mo14471x() && Log.isLoggable(this.f5638a.mo14329d().mo14446v(), 3);
    }

    /* renamed from: p */
    public final String mo14321p(String str) {
        if (str == null) {
            return null;
        }
        return !mo14320o() ? str : m6096u(str, C3249m5.f5739c, C3249m5.f5737a, f5633c);
    }

    /* renamed from: q */
    public final String mo14322q(String str) {
        if (str == null) {
            return null;
        }
        return !mo14320o() ? str : m6096u(str, C3260n5.f5769b, C3260n5.f5768a, f5634d);
    }

    /* renamed from: r */
    public final String mo14323r(String str) {
        if (str == null) {
            return null;
        }
        return !mo14320o() ? str : str.startsWith("_exp_") ? C0843a.m452m("experiment_id(", str, ")") : m6096u(str, C3271o5.f5811b, C3271o5.f5810a, f5635e);
    }

    /* renamed from: s */
    public final String mo14324s(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!mo14320o()) {
            return bundle.toString();
        }
        StringBuilder u = C0843a.m460u("Bundle[{");
        for (String str : bundle.keySet()) {
            if (u.length() != 8) {
                u.append(", ");
            }
            u.append(mo14322q(str));
            u.append("=");
            Object obj = bundle.get(str);
            u.append(obj instanceof Bundle ? mo14325t(new Object[]{obj}) : obj instanceof Object[] ? mo14325t((Object[]) obj) : obj instanceof ArrayList ? mo14325t(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        u.append("}]");
        return u.toString();
    }

    /* renamed from: t */
    public final String mo14325t(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder u = C0843a.m460u("[");
        for (Bundle bundle : objArr) {
            String s = bundle instanceof Bundle ? mo14324s(bundle) : String.valueOf(bundle);
            if (s != null) {
                if (u.length() != 1) {
                    u.append(", ");
                }
                u.append(s);
            }
        }
        u.append("]");
        return u.toString();
    }
}
