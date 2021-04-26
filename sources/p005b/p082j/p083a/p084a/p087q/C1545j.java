package p005b.p082j.p083a.p084a.p087q;

import java.io.Writer;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.j.a.a.q.j */
public final class C1545j extends Writer {
    /* renamed from: d */
    public static String m1870d(int i) {
        StringBuilder u;
        String str;
        if (i > 1114111) {
            u = C0843a.m460u("Illegal character point (0x");
            u.append(Integer.toHexString(i));
            str = ") to output; max is 0x10FFFF as per RFC 4627";
        } else if (i >= 55296) {
            u = C0843a.m460u(i <= 56319 ? "Unmatched first part of surrogate pair (0x" : "Unmatched second part of surrogate pair (0x");
            u.append(Integer.toHexString(i));
            u.append(")");
            return u.toString();
        } else {
            u = C0843a.m460u("Illegal character point (0x");
            u.append(Integer.toHexString(i));
            str = ") to output";
        }
        u.append(str);
        return u.toString();
    }
}
