package p005b.p096l.p097a.p113c.p131e.p140i;

import android.util.Log;

/* renamed from: b.l.a.c.e.i.j3 */
public final class C2832j3 extends C2910p3<Long> {
    public C2832j3(C2884n3 n3Var, String str, Long l) {
        super(n3Var, str, l);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo13418a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String b = mo13562b();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 25 + str.length());
            sb.append("Invalid long value for ");
            sb.append(b);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
