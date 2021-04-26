package p005b.p096l.p097a.p113c.p131e.p140i;

import android.os.Build;

/* renamed from: b.l.a.c.e.i.e4 */
public final class C2767e4 {

    /* renamed from: a */
    public static final int f4696a;

    static {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            String str = Build.VERSION.CODENAME;
            if (str.length() == 1 && str.charAt(0) >= 'S' && str.charAt(0) <= 'Z') {
                i = 33554432;
            }
        }
        f4696a = i;
    }
}
