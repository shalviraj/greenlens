package p005b.p096l.p097a.p113c.p131e.p140i;

import android.util.Log;

/* renamed from: b.l.a.c.e.i.l3 */
public final class C2858l3 extends C2910p3<Double> {
    public C2858l3(C2884n3 n3Var, Double d) {
        super(n3Var, "measurement.test.double_flag", d);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo13418a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String b = mo13562b();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 27 + str.length());
            sb.append("Invalid double value for ");
            sb.append(b);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
