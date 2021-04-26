package p421m.p422m0.p427h;

import java.net.ProtocolException;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;
import p421m.C7835d0;

/* renamed from: m.m0.h.j */
public final class C7912j {

    /* renamed from: a */
    public final C7835d0 f15772a;

    /* renamed from: b */
    public final int f15773b;

    /* renamed from: c */
    public final String f15774c;

    public C7912j(C7835d0 d0Var, int i, String str) {
        C6888i.m12438e(d0Var, "protocol");
        C6888i.m12438e(str, "message");
        this.f15772a = d0Var;
        this.f15773b = i;
        this.f15774c = str;
    }

    /* renamed from: a */
    public static final C7912j m14407a(String str) {
        String str2;
        C7835d0 d0Var = C7835d0.HTTP_1_0;
        C6888i.m12438e(str, "statusLine");
        int i = 9;
        if (C7694h.m13910A(str, "HTTP/1.", false, 2)) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(C0843a.m451l("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt == 1) {
                    d0Var = C7835d0.HTTP_1_1;
                } else {
                    throw new ProtocolException(C0843a.m451l("Unexpected status line: ", str));
                }
            }
        } else if (C7694h.m13910A(str, "ICY ", false, 2)) {
            i = 4;
        } else {
            throw new ProtocolException(C0843a.m451l("Unexpected status line: ", str));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                String substring = str.substring(i, i2);
                C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                    C6888i.m12437d(str2, "(this as java.lang.String).substring(startIndex)");
                } else {
                    throw new ProtocolException(C0843a.m451l("Unexpected status line: ", str));
                }
                return new C7912j(d0Var, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(C0843a.m451l("Unexpected status line: ", str));
            }
        } else {
            throw new ProtocolException(C0843a.m451l("Unexpected status line: ", str));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15772a == C7835d0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f15773b);
        sb.append(' ');
        sb.append(this.f15774c);
        String sb2 = sb.toString();
        C6888i.m12437d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
