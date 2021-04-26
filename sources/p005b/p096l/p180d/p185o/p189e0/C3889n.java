package p005b.p096l.p180d.p185o.p189e0;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import p005b.p096l.p097a.p113c.p119b.p124n.C1955a;
import p005b.p096l.p097a.p113c.p131e.p136e.C2034ac;
import p005b.p096l.p180d.p185o.C3924q;

/* renamed from: b.l.d.o.e0.n */
public final class C3889n {

    /* renamed from: a */
    public static final C1955a f7168a = new C1955a("GetTokenResultFactory", new String[0]);

    /* renamed from: a */
    public static C3924q m7278a(String str) {
        Map map;
        try {
            map = C3890o.m7279a(str);
        } catch (C2034ac e) {
            C1955a aVar = f7168a;
            Log.e(aVar.f3501a, aVar.mo12284c("Error parsing token claims", new Object[0]), e);
            map = new HashMap();
        }
        return new C3924q(str, map);
    }
}
