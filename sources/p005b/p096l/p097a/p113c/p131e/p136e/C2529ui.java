package p005b.p096l.p097a.p113c.p131e.p136e;

import android.text.TextUtils;
import java.lang.reflect.Type;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.e.ui */
public final class C2529ui {
    /* renamed from: a */
    public static Object m4270a(String str, Type type) {
        if (type == String.class) {
            try {
                C2458rj rjVar = new C2458rj();
                rjVar.mo12980a(str);
                if (!TextUtils.isEmpty(rjVar.f4266g)) {
                    return rjVar.f4266g;
                }
                String valueOf = String.valueOf(str);
                throw new C2431qg(valueOf.length() != 0 ? "No error message: ".concat(valueOf) : new String("No error message: "));
            } catch (Exception e) {
                String valueOf2 = String.valueOf(e.getMessage());
                throw new C2431qg(valueOf2.length() != 0 ? "Json conversion failed! ".concat(valueOf2) : new String("Json conversion failed! "), e);
            }
        } else if (type == Void.class) {
            return null;
        } else {
            try {
                C2577wi wiVar = (C2577wi) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0]);
                try {
                    wiVar.mo12435d(str);
                    return wiVar;
                } catch (Exception e2) {
                    String valueOf3 = String.valueOf(e2.getMessage());
                    throw new C2431qg(valueOf3.length() != 0 ? "Json conversion failed! ".concat(valueOf3) : new String("Json conversion failed! "), e2);
                }
            } catch (Exception e3) {
                String valueOf4 = String.valueOf(type);
                throw new C2431qg(C0843a.m455p(new StringBuilder(valueOf4.length() + 38), "Instantiation of JsonResponse failed! ", valueOf4), e3);
            }
        }
    }
}
