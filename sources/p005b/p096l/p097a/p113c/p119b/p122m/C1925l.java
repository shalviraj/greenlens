package p005b.p096l.p097a.p113c.p119b.p122m;

import android.util.Log;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.b.m.l */
public final class C1925l {

    /* renamed from: a */
    public final String f3472a;

    /* renamed from: b */
    public final String f3473b;

    public C1925l(String str, String str2) {
        C0823f.m380l(str, "log tag cannot be null");
        C0823f.m364d(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f3472a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f3473b = null;
        } else {
            this.f3473b = str2;
        }
    }

    /* renamed from: a */
    public final boolean mo12261a(int i) {
        return Log.isLoggable(this.f3472a, i);
    }
}
