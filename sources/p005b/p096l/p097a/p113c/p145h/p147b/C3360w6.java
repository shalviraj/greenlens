package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.h.b.w6 */
public final class C3360w6 {
    /* renamed from: a */
    public static String m6446a(Context context, String str, String str2) {
        Objects.requireNonNull(context, "null reference");
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = C1960d.m2795f1(context);
        }
        return C1960d.m2715G1("google_app_id", resources, str2);
    }

    /* renamed from: b */
    public static String m6447b(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }
}
